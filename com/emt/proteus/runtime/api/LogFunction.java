/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import java.io.PrintWriter;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LogFunction
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int _DEBUG = 0;
/*     */   public static final int _INFO = 1;
/*     */   public static final int _WARN = 2;
/*     */   public static final int _SEVERE = 3;
/*     */   public static final int _FATAL = 4;
/*     */   private static PrintWriter OUT;
/*     */   private static int last;
/*  46 */   private static final char[] PREF_C = { 'd', 'i', 'e', 'p', 's' };
/*     */   private static final int output_level = 10;
/*  48 */   private static int msg_counter = 1;
/*     */   private int level;
/*     */   
/*  51 */   static { try { OUT = new PrintWriter("vm.log");
/*     */     } catch (Exception e) {
/*  53 */       OUT = new PrintWriter(System.err);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public LogFunction(String name, int level)
/*     */   {
/*  61 */     super(name, 2, true);
/*  62 */     this.level = level;
/*     */   }
/*     */   
/*     */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*     */   {
/*  67 */     int _this_ptr = caller.getPointerAddress(code[pc]);
/*  68 */     pc += 2;
/*  69 */     int fmtAddr = code[pc];
/*  70 */     pc += 2;
/*  71 */     int len = arg_length - 2;
/*  72 */     if (isOutput(this.level)) {
/*  73 */       String fmt = MainMemory.getString(fmtAddr);
/*  74 */       Object[] args = toVarArgs(caller, code, pc, len);
/*  75 */       String s = SystemLibrary.format(fmt, args);
/*  76 */       int pref_ptr = MainMemory.getI32Aligned(_this_ptr);
/*  77 */       String pref = MainMemory.getString(pref_ptr);
/*  78 */       output(this.level, pref, s);
/*     */     }
/*  80 */     pc += len * 2;
/*  81 */     if (return_addr >= 0) caller.setI32(return_addr, 0);
/*  82 */     return pc;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int log(int level, int logfunction, int fmt_ptr, Object... args)
/*     */   {
/*  91 */     if (isOutput(level)) {
/*  92 */       String s = MainMemory.getString(fmt_ptr);
/*  93 */       return log(level, logfunction, s, args);
/*     */     }
/*  95 */     return 0;
/*     */   }
/*     */   
/*     */   public static int log(int level, int logfunction, String fmt, Object... args) {
/*  99 */     if (isOutput(level)) {
/* 100 */       int pref_ptr = MainMemory.getI32Aligned(logfunction);
/* 101 */       String pref = MainMemory.getString(pref_ptr);
/* 102 */       String msg = SystemLibrary.format(fmt, args);
/* 103 */       output(level, pref, msg);
/*     */     }
/* 105 */     return 0;
/*     */   }
/*     */   
/* 108 */   public static int debug(int logger, String fmt, Object... args) { return log(1, logger, fmt, args); }
/*     */   
/*     */   public static int info(int logger, String fmt, Object... args) {
/* 111 */     return log(1, logger, fmt, args);
/*     */   }
/*     */   
/* 114 */   public static int warn(int logger, String fmt, Object... args) { return log(2, logger, fmt, args); }
/*     */   
/*     */   public static int severe(int logger, String fmt, Object... args) {
/* 117 */     return log(3, logger, fmt, args);
/*     */   }
/*     */   
/* 120 */   public static int fatal(int logger, String fmt, Object... args) { return log(4, logger, fmt, args); }
/*     */   
/*     */   public static int debug(int logger, int fmt_ptr, Object... args) {
/* 123 */     return log(1, logger, fmt_ptr, args);
/*     */   }
/*     */   
/* 126 */   public static int info(int logger, int fmt_ptr, Object... args) { return log(1, logger, fmt_ptr, args); }
/*     */   
/*     */   public static int warn(int logger, int fmt_ptr, Object... args) {
/* 129 */     return log(2, logger, fmt_ptr, args);
/*     */   }
/*     */   
/* 132 */   public static int severe(int logger, int fmt_ptr, Object... args) { return log(3, logger, fmt_ptr, args); }
/*     */   
/*     */   public static int fatal(int logger, int fmt_ptr, Object... args) {
/* 135 */     return log(4, logger, fmt_ptr, args);
/*     */   }
/*     */   
/*     */   public static boolean isOutput(int level) {
/* 139 */     return level >= 10;
/*     */   }
/*     */   
/*     */   private static void output(int level, String pref, String msg) {
/* 143 */     PrintWriter log = OUT;
/* 144 */     char c = PREF_C[level];
/* 145 */     long time_ticks = msg_counter++;
/* 146 */     String s = Long.toString(time_ticks);
/* 147 */     int pad = 11 - s.length();
/* 148 */     for (int i = 0; i < pad; i++) log.print('0');
/* 149 */     log.print(s);
/* 150 */     log.print(c);
/* 151 */     log.print(pref);
/* 152 */     log.print(' ');
/* 153 */     log.print(msg);
/* 154 */     log.println();
/* 155 */     log.flush();
/*     */   }
/*     */   
/*     */   public static void flush() {
/* 159 */     OUT.flush();
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/LogFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */