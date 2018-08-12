/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi1s1_662 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi1s1_662();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1s1_662() { super("fffi1s1_662", 8, false); }
/*     */   
/*     */   public int execute(byte paramByte1, int paramInt1, byte paramByte2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramByte1, paramInt1, paramByte2, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     byte b1 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     byte b2 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(b1, i, b2, j, k, m, n, i1);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(byte paramByte1, int paramInt1, byte paramByte2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       if (paramInt6 > 0)
/*     */       {
/*  66 */         i = paramInt1 == 1 ? 1 : 0;
/*  67 */         paramInt1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  71 */           j = paramInt2 + paramInt1;
/*  72 */           k = paramInt3 + paramInt1;
/*  73 */           b = MainMemory.getI8(paramInt4 + paramInt1);
/*  74 */           if (b == paramByte2)
/*     */           {
/*  76 */             MainMemory.setI32(paramInt5, 1);
/*  77 */             if (i != 0)
/*     */             {
/*  79 */               MainMemory.setI8(j, paramByte1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  86 */               MainMemory.setI8(k, (byte)1);
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
/*  97 */             MainMemory.setI8(j, com.emt.proteus.lib.api.MathUtils.xor(b, (byte)Byte.MIN_VALUE));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           paramInt1 += 1;
/* 106 */           if (paramInt1 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1s1_662.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */