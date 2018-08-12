/*     */ package com.emt.proteus.runtime.apps;
/*     */ 
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.utils.HelpException;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.ExecException;
/*     */ import com.emt.proteus.runtime.lib.Program;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ProteusMain
/*     */ {
/*     */   private static ProteusMain _instance;
/*     */   private final Class clazz;
/*     */   
/*     */   protected ProteusMain()
/*     */   {
/*  48 */     this.clazz = getClass();
/*  49 */     _instance = this;
/*     */   }
/*     */   
/*     */   public void mainMethod(String[] args)
/*     */   {
/*  54 */     int exitStatus = 0;
/*     */     try {
/*  56 */       Settings settings = getSettings();
/*  57 */       args = processOptions(args, settings);
/*     */       
/*  59 */       Env env = buildEnvironment(settings);
/*  60 */       doExecute(env, settings, args);
/*     */     } catch (HelpException help) {
/*  62 */       System.err.println(help.getMessage());
/*  63 */       System.err.println(help.getHelp());
/*  64 */       exitStatus = -3;
/*     */     } catch (ExecException ex) {
/*  66 */       ex.dump();
/*  67 */       Throwable throwable = ex.getCause();
/*  68 */       if (throwable != null) {
/*  69 */         throwable.printStackTrace();
/*     */       }
/*  71 */       exitStatus = -2;
/*     */     } catch (Throwable t) {
/*  73 */       System.out.flush();
/*  74 */       System.err.println("Unexpected Exit..");
/*  75 */       t.printStackTrace();
/*  76 */       exitStatus = -1;
/*     */     }
/*  78 */     System.exit(exitStatus);
/*     */   }
/*     */   
/*     */ 
/*     */   protected Settings getSettings()
/*     */   {
/*  84 */     Settings settings = MainCtx.getSettings();
/*  85 */     settings.loadResource(this.clazz, "META-INF/proteus.properties");
/*  86 */     settings.loadResource(this.clazz, "META-INF/proteus-extra.properties");
/*  87 */     return settings;
/*     */   }
/*     */   
/*     */   protected String[] processOptions(String[] args, Settings settings) throws HelpException, IOException
/*     */   {
/*  92 */     int index = 0;
/*     */     
/*  94 */     ArrayList<String> real_args = new ArrayList();
/*  95 */     while (index < args.length) {
/*  96 */       String arg = args[(index++)];
/*  97 */       if (arg.equals("--help")) {
/*  98 */         doHelp(settings);
/*  99 */       } else if (arg.equals("--version")) {
/* 100 */         doVersion(settings);
/* 101 */       } else if (arg.equals("--load")) {
/* 102 */         String file = args[(index++)];
/* 103 */         InputStream input = MainCtx.getInputStream(file);
/* 104 */         settings.load(input);
/* 105 */       } else { if (arg.equals("--")) {
/* 106 */           while (index < args.length)
/* 107 */             real_args.add(args[(index++)]);
/*     */         }
/* 109 */         if (arg.startsWith("--")) {
/* 110 */           String property = arg.substring(2);
/* 111 */           String value = args[(index++)];
/* 112 */           settings.set(property, value);
/* 113 */         } else if (arg.startsWith("-+")) {
/* 114 */           String property = arg.substring(2);
/* 115 */           String value = args[(index++)];
/* 116 */           settings.append(property, value);
/* 117 */         } else if (arg.startsWith("-")) {
/* 118 */           String property = arg.substring(1);
/* 119 */           String value = args[(index++)];
/* 120 */           settings.set(property, value);
/* 121 */         } else if (arg.startsWith("+")) {
/* 122 */           String property = arg.substring(1);
/* 123 */           String value = args[(index++)];
/* 124 */           settings.append(property, value);
/*     */         } else {
/* 126 */           real_args.add(arg);
/*     */         }
/*     */       } }
/* 129 */     return (String[])real_args.toArray(new String[real_args.size()]);
/*     */   }
/*     */   
/*     */   public void doHelp(Settings settings) {
/* 133 */     String help_text = settings.stringValue("help.text");
/* 134 */     System.out.println(help_text);
/* 135 */     System.exit(0);
/*     */   }
/*     */   
/*     */   public static void doVersion(Settings settings) {
/* 139 */     String help_text = settings.stringValue("version.text");
/* 140 */     System.out.println(help_text);
/* 141 */     System.exit(0);
/*     */   }
/*     */   
/*     */ 
/*     */   public void exec(String[] args)
/*     */     throws Exception
/*     */   {}
/*     */   
/*     */   public Env buildEnvironment(Settings settings)
/*     */     throws IOException
/*     */   {
/* 152 */     doBootstrap(settings);
/* 153 */     log("Initializing Environment", new Object[0]);
/* 154 */     Env env = new Env();
/* 155 */     Program program = Program.load(this.clazz.getResourceAsStream("/program.icp"));
/* 156 */     log("Installing Program", new Object[0]);
/* 157 */     env.install(program);
/* 158 */     return env;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void doExecute(Env env, Settings settings, String[] args)
/*     */   {
/* 164 */     int warmloopCount = 0;
/* 165 */     int timeLoopCount = 1;
/* 166 */     long start = System.currentTimeMillis();
/* 167 */     int loop = 0;
/*     */     try {
/* 169 */       int counter = 0;
/* 170 */       while (warmloopCount > counter) {
/* 171 */         execute(env, settings, args);
/* 172 */         counter++;
/*     */       }
/* 174 */       start = System.currentTimeMillis();
/* 175 */       while (timeLoopCount > loop)
/*     */       {
/* 177 */         execute(env, settings, args);
/* 178 */         loop++;
/*     */       } } finally { long end;
/*     */       double secs;
/*     */       double mean_secs;
/* 182 */       long end = System.currentTimeMillis();
/* 183 */       double secs = (end - start) / 1000.0D;
/* 184 */       double mean_secs = loop > 0 ? secs / loop : NaN.0D;
/* 185 */       timing(secs, loop, mean_secs);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void timing(double totalSecounds, int loopCount, double mean_secs) {
/* 190 */     System.err.printf("Exit after %4.3f %d completed executions (Mean: %4.3f) \n", new Object[] { Double.valueOf(totalSecounds), Integer.valueOf(loopCount), Double.valueOf(mean_secs) });
/*     */   }
/*     */   
/*     */ 
/*     */   protected void doBootstrap(Settings settings) {}
/*     */   
/*     */ 
/*     */   public void execute(Env env, Settings settings, String[] args)
/*     */   {
/* 199 */     String[] realArgs = Env.toRealArguments(getName(), args);
/* 200 */     env.exec(realArgs);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void log(String fmt, Object... args) {}
/*     */   
/*     */ 
/*     */   protected String getName()
/*     */   {
/* 210 */     return "Proteus";
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/apps/ProteusMain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */