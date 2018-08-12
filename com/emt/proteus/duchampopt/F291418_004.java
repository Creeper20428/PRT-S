/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F291418_004 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new F291418_004();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F291418_004() { super("F291418_004", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.getI32(paramInt5);
/*  71 */       paramInt6 = i * paramInt6 + paramInt8 - i;
/*  72 */       if (paramInt6 > -1)
/*     */       {
/*  74 */         j = paramInt1 + paramInt7 * 344 + 56 + 32;
/*  75 */         k = j;
/*  76 */         m = j;
/*     */         
/*     */ 
/*     */         do
/*     */         {
/*  81 */           MainMemory.setI8(MainMemory.getI32(paramInt4) + paramInt6, (byte)0);
/*  82 */           switch (MainMemory.getI32(paramInt2))
/*     */           {
/*     */           case 258: 
/*  85 */             MainMemory.setI8(MainMemory.getI32(paramInt10) + paramInt6, MainMemory.getI8(k));
/*     */             
/*     */ 
/*     */ 
/*  89 */             break;
/*     */           
/*     */           case 259: 
/*  92 */             MainMemory.setI32(MainMemory.getI32(paramInt3) + (paramInt6 << 2), MainMemory.getI32(m));
/*     */             
/*     */ 
/*     */ 
/*  96 */             break;
/*     */           
/*     */           case 260: 
/*  99 */             MainMemory.setF64(MainMemory.getI32(paramInt9) + (paramInt6 << 3), MainMemory.getF64(j));
/*     */             
/*     */ 
/*     */ 
/* 103 */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 110 */           paramInt6 -= MainMemory.getI32(paramInt5);
/* 111 */         } while (paramInt6 > -1);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F291418_004.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */