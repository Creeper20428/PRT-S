/*     */ package com.emt.proteus.lib.utils;
/*     */ 
/*     */ import java.io.PrintStream;
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
/*     */ public class Log
/*     */ {
/*     */   public static final int WARN = 0;
/*     */   public static final int INFO = 16;
/*     */   public static final int DEBUG = 256;
/*  39 */   private int level = 16;
/*     */   
/*  41 */   private static final Object NOTHING = new Object();
/*     */   
/*     */   private PrintWriter writer;
/*  44 */   private Object traced = NOTHING;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTraced(Object traced)
/*     */   {
/*  51 */     this.traced = traced;
/*     */   }
/*     */   
/*     */   public void setTracedIfUnset(Object traced) {
/*  55 */     if ((this.traced == null) || (this.traced == NOTHING)) {
/*  56 */       this.traced = traced;
/*     */     }
/*     */   }
/*     */   
/*     */   public void setLevel(int level) {
/*  61 */     this.level = level;
/*     */   }
/*     */   
/*     */   public void debug(String fmt, Object... args) {
/*  65 */     if (this.level >= 256) {
/*  66 */       output("dbug:", fmt, args);
/*     */     }
/*     */   }
/*     */   
/*     */   public void info(String fmt, Object... args) {
/*  71 */     if (this.level >= 16) {
/*  72 */       output("info:", fmt, args);
/*     */     }
/*     */   }
/*     */   
/*     */   public void warn(String fmt, Object... args) {
/*  77 */     if (this.level >= 0) {
/*  78 */       output("warn:", fmt, args);
/*     */     }
/*     */   }
/*     */   
/*     */   public void brpt(String fmt, Object... args) {
/*  83 */     if (this.level >= 0) {
/*  84 */       output("bkpt:", fmt, args);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean trace(Object traced, String fmt, Object... args) {
/*  89 */     boolean result = isTracing(traced);
/*  90 */     if (result) {
/*  91 */       output("trace:", fmt, args);
/*     */     }
/*  93 */     return result;
/*     */   }
/*     */   
/*     */   public boolean brptIf(boolean condition, String fmt, Object... args) {
/*  97 */     if (condition) {
/*  98 */       brpt(fmt, args);
/*     */     }
/* 100 */     return condition;
/*     */   }
/*     */   
/*     */   public void output(String pref, String fmt, Object... args) {
/* 104 */     System.out.print(pref);
/* 105 */     System.out.printf(fmt, args);
/* 106 */     System.out.println();
/*     */   }
/*     */   
/*     */   public void clearTraced()
/*     */   {
/* 111 */     this.traced = NOTHING;
/*     */   }
/*     */   
/*     */   public boolean isTracing(Object test) {
/* 115 */     return Utils.areEqual(test, this.traced);
/*     */   }
/*     */   
/*     */   public void setDebug(boolean on_off) {
/* 119 */     this.level = 256;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */