/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi1u2_669 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi1u2_669();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1u2_669() { super("fffi1u2_669", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, short paramShort, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte paramByte)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramBoolean, paramShort, paramInt3, paramInt4, paramInt5, paramInt6, paramByte);
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
/*  30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
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
/*  48 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, bool, s, k, m, n, i1, b);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, short paramShort, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte paramByte)
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
/*  68 */         paramBoolean = paramInt2 == 1;
/*  69 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  73 */           i = paramInt1 + (paramInt2 << 1);
/*  74 */           j = paramInt5 + paramInt2;
/*  75 */           b = MainMemory.getI8(paramInt3 + paramInt2);
/*  76 */           if (b == paramByte)
/*     */           {
/*  78 */             MainMemory.setI32(paramInt6, 1);
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
/* 107 */           paramInt2 += 1;
/* 108 */           if (paramInt2 == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1u2_669.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */