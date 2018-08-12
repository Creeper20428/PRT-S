/*     */ package com.emt.proteus.lib.utils.log;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import java.util.logging.Formatter;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.LogRecord;
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
/*     */ public class DefaultLogFormat
/*     */   extends Formatter
/*     */ {
/*  37 */   private static final char[] PADDING = "                                                              ".toCharArray();
/*  38 */   private static final char[] ZERO_PAD = "00000000000000000000000000000".toCharArray();
/*     */   private StringBuilder b;
/*     */   
/*     */   public DefaultLogFormat() {
/*  42 */     this.b = new StringBuilder();
/*     */   }
/*     */   
/*     */   public String format(LogRecord record)
/*     */   {
/*  47 */     long seqn = record.getSequenceNumber();
/*  48 */     long time = record.getMillis() - Utils.START;
/*  49 */     String level = getLevel(record);
/*  50 */     String logger = record.getLoggerName();
/*  51 */     String msg = record.getMessage();
/*     */     
/*  53 */     Object[] objects = record.getParameters();
/*  54 */     this.b.setLength(0);
/*  55 */     this.b.append("[");
/*  56 */     zeroPad(this.b, seqn, 6);
/*  57 */     this.b.append("] ");
/*  58 */     appendTime(this.b, time);
/*  59 */     appendBrackets(this.b, level, 6);
/*  60 */     appendBrackets(this.b, logger, 8);
/*  61 */     this.b.append("  : ").append(msg);
/*  62 */     if (objects != null) {
/*  63 */       for (int i = 0; i < objects.length; i++) {
/*  64 */         Object object = objects[i];
/*  65 */         if (i != 0) this.b.append(", ");
/*  66 */         this.b.append(object);
/*     */       }
/*     */     }
/*  69 */     this.b.append("\n");
/*  70 */     return this.b.toString();
/*     */   }
/*     */   
/*     */   private String getLevel(LogRecord record) {
/*  74 */     Level level = record.getLevel();
/*  75 */     return level.getName();
/*     */   }
/*     */   
/*     */   private void appendBrackets(StringBuilder b, String text, int len)
/*     */   {
/*  80 */     b.append('[');
/*  81 */     int tlen = text.length();
/*  82 */     int padd = len - tlen;
/*  83 */     if (padd > 0) {
/*  84 */       b.append(text);
/*  85 */       b.append(PADDING, 0, padd);
/*  86 */     } else if (padd < 0) {
/*  87 */       b.append(text.substring(0, len));
/*     */     } else {
/*  89 */       b.append(text);
/*     */     }
/*  91 */     b.append("] ");
/*     */   }
/*     */   
/*     */   private void appendTime(StringBuilder b, long time) {
/*  95 */     long millis = time % 1000L;
/*  96 */     long seconds = time / 1000L % 60L;
/*  97 */     long minutes = time / 60000L % 60L;
/*  98 */     long hours = time / 3600000L;
/*  99 */     b.append('[');
/* 100 */     zeroPad(b, hours, 2);
/* 101 */     b.append(':');
/* 102 */     zeroPad(b, minutes, 2);
/* 103 */     b.append(':');
/* 104 */     zeroPad(b, seconds, 2);
/* 105 */     b.append(':');
/* 106 */     zeroPad(b, millis, 3);
/* 107 */     b.append("] ");
/*     */   }
/*     */   
/*     */   private void zeroPad(StringBuilder b, long num, int wide) {
/* 111 */     String txt = Long.toString(num);
/* 112 */     int len = txt.length();
/* 113 */     int pad = wide - len;
/*     */     try {
/* 115 */       b.append(ZERO_PAD, 0, pad);
/*     */     }
/*     */     catch (ArrayIndexOutOfBoundsException e) {}
/* 118 */     b.append(txt);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/log/DefaultLogFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */