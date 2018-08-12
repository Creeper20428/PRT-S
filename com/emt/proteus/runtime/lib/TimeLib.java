/*     */ package com.emt.proteus.runtime.lib;
/*     */ 
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.TimeZone;
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
/*     */ 
/*     */ public class TimeLib
/*     */ {
/*  46 */   private static final boolean VERBOSE = MainCtx.getSettings().booleanValue("verbose");
/*     */   
/*  48 */   private static final long RAW_START = System.currentTimeMillis();
/*  49 */   private static final long EMT_START = MainCtx.getSettings().longValue("com.emt.time.millis", RAW_START);
/*     */   
/*  51 */   public static final long[] TIMES = { 1296637029672L, 1296637029675L };
/*     */   
/*     */ 
/*     */ 
/*  55 */   private static int counter = 0;
/*     */   
/*  57 */   private static long get_emt_time() { long current = System.currentTimeMillis();
/*  58 */     long adjusted = current - RAW_START + EMT_START;
/*  59 */     if (VERBOSE) System.out.printf("TIME_FUNCTION : %8d secs=%s : date=%s\n", new Object[] { Long.valueOf(adjusted), Long.toHexString(adjusted / 1000L), new Date(adjusted) });
/*  60 */     return adjusted;
/*     */   }
/*     */   
/*     */   private static final String DATE_FORMAT = "%1$ta %1$tb %1$te %1$tT %1$tY%n";
/*  64 */   private static TimeZone LOCAL = TimeZone.getDefault();
/*  65 */   private static TimeZone GMT = TimeZone.getTimeZone("gmt");
/*     */   
/*     */   private static final int TM_SEC = 0;
/*     */   
/*     */   private static final int TM_MIN = 4;
/*     */   
/*     */   private static final int TM_HOUR = 8;
/*     */   private static final int TM_MDAY = 12;
/*     */   private static final int TM_MON = 16;
/*     */   private static final int TM_YEAR = 20;
/*     */   private static final int TM_WDAY = 24;
/*     */   private static final int TM_YDAY = 28;
/*     */   private static final int TM_ISDST = 32;
/*     */   private static final int TM_SIZE = 44;
/*  79 */   private static Calendar CALENDAR = new GregorianCalendar();
/*     */   private static final int YEAR_OFF = 1900;
/*     */   private static final int WEEK_DAY_OFF = 1;
/*     */   
/*     */   public static void set(int struct$, int intTime, TimeZone tz)
/*     */   {
/*  85 */     long time = intTime;
/*  86 */     time *= 1000L;
/*  87 */     CALENDAR.setTimeInMillis(time);
/*  88 */     CALENDAR.setTimeZone(tz);
/*  89 */     set(struct$, CALENDAR);
/*     */   }
/*     */   
/*     */   public static void set(int struct_addr, Calendar val) {
/*  93 */     MainMemory.setI32Aligned(struct_addr + 0, val.get(13));
/*  94 */     MainMemory.setI32Aligned(struct_addr + 4, val.get(12));
/*  95 */     MainMemory.setI32Aligned(struct_addr + 8, val.get(11));
/*  96 */     MainMemory.setI32Aligned(struct_addr + 12, val.get(5));
/*  97 */     MainMemory.setI32Aligned(struct_addr + 16, val.get(2));
/*  98 */     MainMemory.setI32Aligned(struct_addr + 20, val.get(1) - 1900);
/*  99 */     MainMemory.setI32Aligned(struct_addr + 24, val.get(7) - 1);
/* 100 */     MainMemory.setI32Aligned(struct_addr + 28, val.get(6));
/* 101 */     MainMemory.setI32Aligned(struct_addr + 32, val.get(16));
/*     */   }
/*     */   
/*     */   public static void set(Calendar target, int address) {
/* 105 */     target.set(field(address, 20) + 1900, field(address, 16), field(address, 12), field(address, 8), field(address, 4), field(address, 0));
/*     */   }
/*     */   
/*     */   private static int field(int address, int field_off)
/*     */   {
/* 110 */     return MainMemory.getI32Aligned(address + field_off);
/*     */   }
/*     */   
/*     */   public static int ctime(int pint_0) {
/* 114 */     long millis = time_millis(pint_0);
/* 115 */     CALENDAR.setTimeInMillis(millis);
/* 116 */     String format = String.format("%1$ta %1$tb %1$te %1$tT %1$tY%n", new Object[] { CALENDAR });
/* 117 */     MainMemory.setString(256, format);
/* 118 */     return 256;
/*     */   }
/*     */   
/*     */   public static int asctime(int struct$) {
/* 122 */     CALENDAR.setTimeZone(LOCAL);
/* 123 */     set(CALENDAR, struct$);
/* 124 */     String format = String.format("%1$ta %1$tb %1$te %1$tT %1$tY%n", new Object[] { CALENDAR });
/* 125 */     MainMemory.setString(256, format);
/* 126 */     return 256;
/*     */   }
/*     */   
/*     */ 
/* 130 */   public static int localtime(int time$) { return localtime_r(time$, 64); }
/*     */   
/*     */   public static int localtime_r(int time$, int struct$) {
/* 133 */     int intTime = _internal_time(time$);
/* 134 */     set(struct$, intTime, LOCAL);
/* 135 */     return struct$;
/*     */   }
/*     */   
/*     */   public static int mktime(int pstruct$tm_0) {
/* 139 */     CALENDAR.setTimeZone(LOCAL);
/* 140 */     int address = pstruct$tm_0;
/* 141 */     set(CALENDAR, address);
/* 142 */     long millis = CALENDAR.getTimeInMillis();
/* 143 */     CALENDAR.setTimeZone(GMT);
/* 144 */     CALENDAR.setTimeInMillis(millis);
/* 145 */     set(address, CALENDAR);
/* 146 */     return 0;
/*     */   }
/*     */   
/*     */   private static int _internal_time(int pint_0)
/*     */   {
/* 151 */     if (pint_0 == 0) {
/* 152 */       return (int)(get_emt_time() / 1000L);
/*     */     }
/* 154 */     return MainMemory.getI32Aligned(pint_0);
/*     */   }
/*     */   
/*     */   private static long time_millis(int pint_0) {
/* 158 */     if (pint_0 == 0) {
/* 159 */       return get_emt_time();
/*     */     }
/* 161 */     return MainMemory.getI32Aligned(pint_0) * 1000L;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/* 167 */   public static int time(int p_timeint) { return _internal_time(p_timeint); }
/*     */   
/*     */   public static int gettimeofday(int p_timeval, int p_obsolete_tz) {
/* 170 */     long i = get_emt_time();
/* 171 */     int secs = (int)(i / 1000L);
/* 172 */     int mus = (int)(i % 1000L) * 1000;
/* 173 */     MainMemory.setI32(p_timeval, secs);
/* 174 */     MainMemory.setI32(p_timeval + 4, mus);
/* 175 */     return 0;
/*     */   }
/*     */   
/*     */   public static int gmtime(int pint_0)
/*     */   {
/* 180 */     int intTime = _internal_time(pint_0);
/* 181 */     set(64, intTime, GMT);
/* 182 */     return 64;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/TimeLib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */