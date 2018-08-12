/*     */ package com.emt.proteus.lib.app;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.RemoteIoSystem;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import com.emt.proteus.lib.utils.Utils;
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
/*     */ public class Main
/*     */ {
/*     */   private static final String BOOTLOAD = "bootload";
/*     */   private static final String LOAD = "load";
/*     */   
/*     */   public static void main(String[] args)
/*     */   {
/*  43 */     if (args.length == 0) {
/*  44 */       System.err.println("Usage : <application> [options] [arguments]");
/*  45 */       System.exit(-1);
/*     */     }
/*  47 */     execute(args[0], args, 1, "com.emt.proteus.lib.app");
/*     */   }
/*     */   
/*     */   public static void execute(String application, String[] args, int argStart, String applicationPackage) {
/*  51 */     String resource = application + ".properties".toLowerCase();
/*     */     try {
/*  53 */       Utils.boot();
/*  54 */       Settings settings = MainCtx.getSettings();
/*  55 */       if ((!settings.loadResource(resource)) && (applicationPackage != null)) {
/*  56 */         settings.set("main.class", applicationPackage + "." + application);
/*     */       }
/*  58 */       String main_class = settings.stringValue("main.class");
/*  59 */       if ((main_class == null) && (applicationPackage != null)) {
/*  60 */         settings.set("main.class", applicationPackage + "." + application);
/*     */       }
/*     */       
/*  63 */       loadExtras(settings, "bootload");
/*     */       
/*  65 */       args = processCmdLine(settings, args, argStart);
/*  66 */       Main main = (Main)settings.getInstance("main.class");
/*  67 */       String remote = settings.stringValue("remote.io");
/*  68 */       if (remote != null) {
/*  69 */         MainCtx.setIoSystem(new RemoteIoSystem(remote));
/*     */       }
/*  71 */       loadExtras(settings, "load");
/*  72 */       main.exec(args);
/*     */     } catch (Exception e) {
/*  74 */       e.printStackTrace();
/*  75 */       System.exit(-1);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void loadExtras(Settings settings, String property) throws IOException {
/*  80 */     String[] includes = settings.stringArray(property);
/*  81 */     for (int i = 0; i < includes.length; i++) {
/*  82 */       String include = includes[i];
/*  83 */       settings.load(MainCtx.getUrl(include));
/*     */     }
/*     */   }
/*     */   
/*     */   public static String[] processCmdLine(Settings settings, String[] args, int index)
/*     */     throws IOException
/*     */   {
/*  90 */     ArrayList<String> real_args = new ArrayList();
/*  91 */     while (index < args.length) {
/*  92 */       String arg = args[(index++)];
/*  93 */       if (arg.equals("--help")) {
/*  94 */         doHelp(settings);
/*  95 */       } else if (arg.equals("--version")) {
/*  96 */         doVersion(settings);
/*  97 */       } else if (arg.equals("--load")) {
/*  98 */         String file = args[(index++)];
/*  99 */         InputStream input = MainCtx.getInputStream(file);
/* 100 */         settings.load(input);
/* 101 */       } else { if (arg.equals("--")) {
/* 102 */           while (index < args.length)
/* 103 */             real_args.add(args[(index++)]);
/*     */         }
/* 105 */         if (arg.startsWith("-")) {
/* 106 */           String property = arg.substring(1);
/* 107 */           String value = args[(index++)];
/* 108 */           settings.set(property, value);
/* 109 */         } else if (arg.startsWith("+")) {
/* 110 */           String property = arg.substring(1);
/* 111 */           String value = args[(index++)];
/* 112 */           settings.append(property, value);
/*     */         } else {
/* 114 */           real_args.add(arg);
/*     */         }
/*     */       } }
/* 117 */     return (String[])real_args.toArray(new String[real_args.size()]);
/*     */   }
/*     */   
/*     */   public static void doHelp(Settings settings) {
/* 121 */     String help_text = settings.stringValue("help.text");
/* 122 */     System.out.println(help_text);
/* 123 */     System.exit(0);
/*     */   }
/*     */   
/*     */   public static void doVersion(Settings settings) {
/* 127 */     String help_text = settings.stringValue("version.text");
/* 128 */     System.out.println(help_text);
/* 129 */     System.exit(0);
/*     */   }
/*     */   
/*     */   public void exec(String[] args)
/*     */     throws Exception
/*     */   {}
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/app/Main.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */