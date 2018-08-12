/*     */ package com.emt.proteus.lib.utils;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.io.PrintWriter;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
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
/*     */ public abstract interface ILog
/*     */ {
/*     */   public static final String D_FMT = "[%10s] [%6s] %s%n";
/*     */   
/*     */   public abstract void debug(String paramString1, String paramString2, Object... paramVarArgs);
/*     */   
/*     */   public abstract void info(String paramString1, String paramString2, Object... paramVarArgs);
/*     */   
/*     */   public abstract void warn(String paramString1, String paramString2, Object... paramVarArgs);
/*     */   
/*     */   public abstract void error(String paramString1, String paramString2, Object... paramVarArgs);
/*     */   
/*     */   public abstract void fatal(String paramString1, String paramString2, Object... paramVarArgs);
/*     */   
/*     */   public static abstract class Base
/*     */     implements ILog
/*     */   {
/*     */     private int level;
/*     */     
/*     */     protected Base()
/*     */     {
/*  51 */       this.level = Level.INFO.intValue();
/*     */     }
/*     */     
/*  54 */     public void setLevel(Level level) { this.level = level.intValue(); }
/*     */     
/*     */ 
/*  57 */     public void setLevel(int level) { this.level = level; }
/*     */     
/*     */     public void debug(String source, String fmt, Object... args) {
/*  60 */       if (this.level >= Level.FINE.intValue()) out(source, "DEBUG", fmt, args);
/*     */     }
/*     */     
/*  63 */     public void info(String source, String fmt, Object... args) { if (this.level <= Level.INFO.intValue()) out(source, "INFO", fmt, args);
/*     */     }
/*     */     
/*  66 */     public void warn(String source, String fmt, Object... args) { if (this.level <= Level.WARNING.intValue()) out(source, "WARN", fmt, args);
/*     */     }
/*     */     
/*  69 */     public void error(String source, String fmt, Object... args) { out(source, "ERROR", fmt, args); }
/*     */     
/*     */     public void fatal(String source, String fmt, Object... args) {
/*  72 */       out(source, "FATAL", fmt, args);
/*  73 */       System.exit(-1);
/*     */     }
/*     */     
/*     */     protected abstract void out(String paramString1, String paramString2, String paramString3, Object... paramVarArgs);
/*     */   }
/*     */   
/*     */   public static class Writer extends ILog.Base {
/*     */     private final PrintWriter writer;
/*     */     
/*     */     public Writer(PrintWriter writer) {
/*  83 */       this.writer = writer;
/*     */     }
/*     */     
/*     */     protected void out(String source, String prefix, String fmt, Object... args) {
/*  87 */       this.writer.printf("[%10s] [%6s] %s%n", new Object[] { source, prefix, String.format(fmt, args) });
/*     */     }
/*     */   }
/*     */   
/*     */   public static class Err extends ILog.Base
/*     */   {
/*     */     protected void out(String source, String prefix, String fmt, Object... args)
/*     */     {
/*  95 */       System.err.printf("[%10s] [%6s] %s%n", new Object[] { source, prefix, String.format(fmt, args) });
/*     */     }
/*     */   }
/*     */   
/*     */   public static class Log implements ILog {
/* 100 */     public void debug(String source, String fmt, Object... args) { Logger.getLogger(source).fine(String.format(fmt, args)); }
/*     */     
/*     */     public void info(String source, String fmt, Object... args) {
/* 103 */       Logger.getLogger(source).info(String.format(fmt, args));
/*     */     }
/*     */     
/* 106 */     public void warn(String source, String fmt, Object... args) { Logger.getLogger(source).warning(String.format(fmt, args)); }
/*     */     
/*     */ 
/*     */ 
/* 110 */     public void error(String source, String fmt, Object... args) { Logger.getLogger(source).severe(String.format(fmt, args)); }
/*     */     
/*     */     public void fatal(String source, String fmt, Object... args) {
/* 113 */       Logger.getLogger(source).severe(String.format(fmt, args));
/* 114 */       System.exit(-1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/ILog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */