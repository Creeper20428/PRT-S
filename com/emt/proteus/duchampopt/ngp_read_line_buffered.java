/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class ngp_read_line_buffered extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3452;
/*  13 */   public static final Function _instance = new ngp_read_line_buffered();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ngp_read_line_buffered() { super("ngp_read_line_buffered", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  43 */       j = MainMemory.getI32Aligned(468000);
/*  44 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  54 */         free.call(j);
/*  55 */         MainMemory.setI32Aligned(468000, 0);
/*  56 */         MainMemory.setI32Aligned(468004, 0);
/*  57 */         MainMemory.setI32Aligned(468008, 0);
/*  58 */         MainMemory.setI32Aligned(468016, 0);
/*  59 */         MainMemory.setI32Aligned(468012, 0);
/*  60 */         MainMemory.setI32Aligned(468020, 0);
/*  61 */         MainMemory.setI32Aligned(468024, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  67 */       j = MainMemory.getI32Aligned(458912);
/*  68 */       if (j != 0) {
/*     */         break label119;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       MainMemory.setI32Aligned(468024, 0);
/*  79 */       i = ngp_line_from_file.call(paramInt);
/*     */       
/*     */ 
/*     */       break label224;
/*     */       
/*     */       label119:
/*     */       
/*  86 */       MainMemory.setI32Aligned(468000, j);
/*  87 */       MainMemory.setI32Aligned(468004, MainMemory.getI32Aligned(458916));
/*  88 */       MainMemory.setI32Aligned(468008, MainMemory.getI32Aligned(458920));
/*  89 */       MainMemory.setI32Aligned(468012, MainMemory.getI32Aligned(467200));
/*  90 */       MainMemory.setI32Aligned(468016, MainMemory.getI32Aligned(458924));
/*  91 */       MainMemory.setI32Aligned(468020, MainMemory.getI32Aligned(467204));
/*  92 */       MainMemory.setI32Aligned(458912, 0);
/*  93 */       MainMemory.setI32Aligned(458916, 0);
/*  94 */       MainMemory.setI32Aligned(458920, 0);
/*  95 */       MainMemory.setI32Aligned(458924, 0);
/*  96 */       MainMemory.setI32Aligned(467200, 0);
/*  97 */       MainMemory.setI32Aligned(467204, 0);
/*  98 */       MainMemory.setI32Aligned(468024, 1);
/*  99 */       i = 0;
/*     */       
/*     */ 
/*     */       label224:
/*     */       
/*     */ 
/* 105 */       int k = i; return k;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_read_line_buffered.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */