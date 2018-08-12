/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi1int_641 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi1int_641();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1int_641() { super("fffi1int_641", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, byte paramByte, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramByte, paramInt4, paramInt5, paramInt6, paramBoolean, paramInt7);
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
/*  33 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, b, m, n, i1, bool, i2);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, byte paramByte, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if (paramBoolean)
/*     */       {
/*  68 */         paramBoolean = paramInt6 == 1;
/*  69 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  73 */           i = paramInt3 + (paramInt6 << 2);
/*  74 */           j = paramInt1 + paramInt6;
/*  75 */           b = MainMemory.getI8(paramInt4 + paramInt6);
/*  76 */           if (b == paramByte)
/*     */           {
/*  78 */             MainMemory.setI32(paramInt2, 1);
/*  79 */             if (paramBoolean)
/*     */             {
/*  81 */               MainMemory.setI32(i, paramInt7);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  88 */               MainMemory.setI8(j, (byte)1);
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
/*  99 */             MainMemory.setI32(i, b & 0xFF);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           paramInt6 += 1;
/* 108 */           if (paramInt6 == paramInt5) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1int_641.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */