/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class wcsulex_scan_buffer extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2947;
/*  13 */   public static final Function _instance = new wcsulex_scan_buffer();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public wcsulex_scan_buffer() { super("wcsulex_scan_buffer", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (!com.emt.proteus.lib.api.MathUtils.ult(paramInt2, 2))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  58 */         j = paramInt2 + -2;
/*  59 */         if (MainMemory.getI8(paramInt1 + j) != 0) {
/*     */           break label248;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */         if (MainMemory.getI8(paramInt1 + (paramInt2 + -1)) != 0) {
/*     */           break label248;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         k = com.emt.proteus.runtime.library.c.malloc.call(48);
/*  80 */         m = k;
/*  81 */         if (k != 0) {
/*     */           break label144;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(106464) });
/*  92 */         SystemLibrary.longjmp(481376, 2);
/*     */         
/*     */ 
/*     */         label144:
/*     */         
/*     */ 
/*  98 */         MainMemory.setI32(k + 12, j);
/*  99 */         MainMemory.setI32(k + 4, paramInt1);
/* 100 */         MainMemory.setI32(k + 8, paramInt1);
/* 101 */         MainMemory.setI32(k + 20, 0);
/* 102 */         MainMemory.setI32(k, 0);
/* 103 */         MainMemory.setI32(k + 16, j);
/* 104 */         MainMemory.setI32(k + 24, 0);
/* 105 */         MainMemory.setI32(k + 28, 1);
/* 106 */         MainMemory.setI32(k + 40, 0);
/* 107 */         MainMemory.setI32(k + 44, 0);
/* 108 */         wcsulex_switch_to_buffer.call(m);
/* 109 */         i = m;
/*     */         
/*     */         break label255;
/*     */       }
/*     */       
/*     */       label248:
/*     */       
/* 116 */       i = 0;
/*     */       
/*     */ 
/*     */       label255:
/*     */       
/*     */ 
/* 122 */       int n = i; return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsulex_scan_buffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */