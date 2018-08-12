/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi1i2_623 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi1i2_623();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1i2_623() { super("fffi1i2_623", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, byte paramByte, int paramInt2, int paramInt3, boolean paramBoolean, short paramShort, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramByte, paramInt2, paramInt3, paramBoolean, paramShort, paramInt4, paramInt5, paramInt6);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, b, j, k, bool, s, m, n, i1);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, byte paramByte, int paramInt2, int paramInt3, boolean paramBoolean, short paramShort, int paramInt4, int paramInt5, int paramInt6)
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
/*  68 */         paramBoolean = paramInt3 == 1;
/*  69 */         paramInt3 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  73 */           i = paramInt1 + (paramInt3 << 1);
/*  74 */           j = paramInt6 + paramInt3;
/*  75 */           b = MainMemory.getI8(paramInt5 + paramInt3);
/*  76 */           if (b == paramByte)
/*     */           {
/*  78 */             MainMemory.setI32(paramInt2, 1);
/*  79 */             if (paramBoolean)
/*     */             {
/*  81 */               MainMemory.setI16(i, paramShort);
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
/*  99 */             MainMemory.setI16(i, (short)(b & 0xFF));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           paramInt3 += 1;
/* 108 */           if (paramInt3 == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1i2_623.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */