/*     */ package com.emt.proteus.runtime.utils;
/*     */ 
/*     */ import java.io.PrintStream;
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
/*     */ public class Clock
/*     */ {
/*     */   public static void main(String[] args)
/*     */   {
/*  35 */     Updater updater = new Updater(System.currentTimeMillis(), null);
/*  36 */     int count = 10000000;
/*  37 */     long s = System.currentTimeMillis();
/*  38 */     long hash = 0L;
/*  39 */     long total = 0L;
/*  40 */     for (int i = 0; i < count; i++) {
/*  41 */       long start = updater.getUSeconds();
/*  42 */       for (int j = 0; j < 1000; j++) {
/*  43 */         hash += System.currentTimeMillis();
/*     */       }
/*  45 */       long end = updater.getUSeconds();
/*  46 */       total += end - start;
/*     */     }
/*  48 */     long e = System.currentTimeMillis();
/*  49 */     long duration = e - s;
/*  50 */     double usec = duration * 1000.0D / count;
/*  51 */     double usecI = total / count;
/*  52 */     System.out.println(hash);
/*  53 */     System.out.printf("%d iterations in %d ms %.2f %.2f %d %f\n", new Object[] { Integer.valueOf(count), Long.valueOf(duration), Double.valueOf(usec), Double.valueOf(usecI), Long.valueOf(updater.getMaxDelta()), Double.valueOf(updater.getMeanDelta()) });
/*  54 */     updater.stop();
/*     */   }
/*     */   
/*     */   private static final class Updater implements Runnable {
/*     */     private volatile boolean running;
/*     */     private final long startTimeMs;
/*     */     private volatile long maxDelta;
/*     */     private volatile long updates;
/*     */     private volatile long time_sec;
/*     */     private volatile long time_usec;
/*     */     private volatile long useconds;
/*     */     
/*     */     private Updater(long startTimeMs) {
/*  67 */       this.startTimeMs = startTimeMs;
/*  68 */       this.maxDelta = 1L;
/*  69 */       this.updates = 0L;
/*  70 */       Thread t = new Thread(this);
/*  71 */       t.setPriority(4);
/*  72 */       t.start();
/*     */     }
/*     */     
/*     */ 
/*     */     public void run()
/*     */     {
/*  78 */       this.running = true;
/*  79 */       long msTime = this.startTimeMs;
/*  80 */       long secTime = msTime / 1000L;
/*  81 */       long usec = 0L;
/*  82 */       long max = 0L;
/*  83 */       long lastNano = System.nanoTime();
/*  84 */       while (this.running) {
/*  85 */         long nano = System.nanoTime();
/*  86 */         long delta = (nano - lastNano) / 1000L;
/*  87 */         if (delta > 0L) {
/*  88 */           this.updates += 1L;
/*  89 */           usec += delta;
/*  90 */           if (max < delta) {
/*  91 */             max = delta;
/*  92 */             this.maxDelta = max;
/*     */           }
/*  94 */           this.time_sec = (secTime + usec / 1000000L);
/*  95 */           this.time_usec = (usec % 1000000L);
/*  96 */           this.useconds = usec;
/*  97 */           lastNano = nano;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */     public long getUSeconds()
/*     */     {
/* 104 */       return this.useconds;
/*     */     }
/*     */     
/* 107 */     public double getMeanDelta() { return this.useconds / this.updates; }
/*     */     
/*     */     public long timeSeconds()
/*     */     {
/* 111 */       return this.time_sec;
/*     */     }
/*     */     
/* 114 */     public long timeUSeconds() { return this.time_usec; }
/*     */     
/*     */     public void stop()
/*     */     {
/* 118 */       this.running = false;
/*     */     }
/*     */     
/*     */     public long getMaxDelta() {
/* 122 */       return this.maxDelta;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/utils/Clock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */