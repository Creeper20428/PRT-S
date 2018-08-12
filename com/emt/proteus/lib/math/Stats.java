/*     */ package com.emt.proteus.lib.math;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Stats
/*     */ {
/*     */   protected long count;
/*     */   
/*     */ 
/*     */ 
/*     */   private double mean;
/*     */   
/*     */ 
/*     */ 
/*     */   private double accumulator;
/*     */   
/*     */ 
/*     */ 
/*     */   private double value;
/*     */   
/*     */ 
/*     */ 
/*     */   private double delta;
/*     */   
/*     */ 
/*     */ 
/*     */   private double min;
/*     */   
/*     */ 
/*     */ 
/*     */   private double max;
/*     */   
/*     */ 
/*     */   private double m2;
/*     */   
/*     */ 
/*     */ 
/*     */   protected void addImpl(double value)
/*     */   {
/*  41 */     this.accumulator += value;
/*  42 */     this.delta = (value - this.value);
/*  43 */     this.max = Math.max(value, this.max);
/*  44 */     this.min = Math.min(value, this.min);
/*  45 */     this.count += 1L;
/*     */     
/*  47 */     double delta = value - this.mean;
/*  48 */     this.mean += delta / this.count;
/*  49 */     this.m2 += delta * (value - this.mean);
/*  50 */     this.value = value;
/*     */   }
/*     */   
/*  53 */   public final double sampleVariance() { return this.m2 / (this.count - 1L); }
/*     */   
/*     */   public final double sampleStdDev() {
/*  56 */     return Math.sqrt(sampleVariance());
/*     */   }
/*     */   
/*     */   public final double getSampleMean() {
/*  60 */     return this.mean;
/*     */   }
/*     */   
/*  63 */   public final double getAccumulatorMean() { return this.accumulator / this.count; }
/*     */   
/*     */   public final double getAccumulator()
/*     */   {
/*  67 */     return this.accumulator;
/*     */   }
/*     */   
/*     */   public final double getValue() {
/*  71 */     return this.value;
/*     */   }
/*     */   
/*     */   public final double getDelta() {
/*  75 */     return this.delta;
/*     */   }
/*     */   
/*     */   public final long getCount() {
/*  79 */     return this.count;
/*     */   }
/*     */   
/*     */   public double getMin() {
/*  83 */     return this.min;
/*     */   }
/*     */   
/*     */   public double getMax() {
/*  87 */     return this.max;
/*     */   }
/*     */   
/*     */   public static final class Long extends Stats {
/*     */     private long delta;
/*     */     private long last;
/*     */     private long total;
/*     */     private long max;
/*     */     private long min;
/*     */     
/*     */     public void add(long value) {
/*  98 */       this.total += value;
/*  99 */       this.delta = (value - this.last);
/* 100 */       this.last = value;
/* 101 */       this.max = Math.max(this.max, value);
/* 102 */       this.min = Math.min(this.min, value);
/* 103 */       addImpl(value);
/*     */     }
/*     */     
/* 106 */     public void addTotal(long total) { long value = total - this.total;
/* 107 */       this.total = total;
/* 108 */       this.delta = (value - this.last);
/* 109 */       this.last = value;
/* 110 */       this.max = Math.max(this.max, value);
/* 111 */       this.min = Math.min(this.min, value);
/* 112 */       addImpl(value);
/*     */     }
/*     */     
/*     */     public long getLongTotal() {
/* 116 */       return this.total;
/*     */     }
/*     */     
/* 119 */     public long getLongDelta() { return this.delta; }
/*     */     
/*     */     public long getLongMax() {
/* 122 */       return this.max;
/*     */     }
/*     */     
/* 125 */     public long getLongMin() { return this.min; }
/*     */   }
/*     */   
/*     */   public static final class Double extends Stats
/*     */   {
/*     */     public void add(double value) {
/* 131 */       addImpl(value);
/*     */     }
/*     */     
/* 134 */     public void addTotal(double value) { addImpl(value - getAccumulator()); }
/*     */     
/*     */     public double getDoubleTotal() {
/* 137 */       return getAccumulator();
/*     */     }
/*     */     
/* 140 */     public double getDoubleDelta() { return getDelta(); }
/*     */     
/*     */     public double getDoubleMax() {
/* 143 */       return getMax();
/*     */     }
/*     */     
/* 146 */     public double getDoubleMin() { return getMin(); }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/math/Stats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */