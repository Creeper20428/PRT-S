/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class imcomp_compress_tile_1524 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new imcomp_compress_tile_1524();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public imcomp_compress_tile_1524() { super("imcomp_compress_tile_1524", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  20 */     return 0;
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
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, j, k, m, n, i1, i2);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (paramInt3 < 0)
/*     */       {
/*  62 */         i = paramInt6 + 1176;
/*  63 */         if (MainMemory.getI32(i) < 0)
/*     */         {
/*  65 */           paramInt3 = paramInt5 << 3;
/*  66 */           if (paramInt3 > 0) {
/*  67 */             paramInt5 = 0;
/*  68 */             j = 0;
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/*  73 */               paramInt5 = (MainMemory.getI8(paramInt2 + j) & 0xFF) + paramInt5;
/*  74 */               j += 1;
/*  75 */               if (j == paramInt3)
/*     */               {
/*  77 */                 paramInt3 = com.emt.proteus.lib.api.MathUtils.urem(paramInt5, 10000) + 1; break;
/*     */ 
/*     */ 
/*     */               }
/*     */               
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*  92 */             paramInt3 = 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */           MainMemory.setI32(i, paramInt3);
/* 100 */           ffuky.call(paramInt4, 31, 44512, MainMemory.getI32(paramInt1) + 1176, 0, paramInt7);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_compress_tile_1524.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */