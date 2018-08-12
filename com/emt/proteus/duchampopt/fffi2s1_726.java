/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi2s1_726 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi2s1_726();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi2s1_726() { super("fffi2s1_726", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, short paramShort, int paramInt5, int paramInt6, int paramInt7, byte paramByte)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, paramShort, paramInt5, paramInt6, paramInt7, paramByte);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, bool, j, k, m, s, n, i1, i2, b);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, short paramShort, int paramInt5, int paramInt6, int paramInt7, byte paramByte)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     short s = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       if (paramBoolean)
/*     */       {
/*  71 */         paramBoolean = paramInt6 == 1;
/*  72 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  76 */           i = paramInt7 + paramInt6;
/*  77 */           j = paramInt3 + paramInt6;
/*  78 */           s = MainMemory.getI16(paramInt2 + (paramInt6 << 1));
/*  79 */           if (s == paramShort)
/*     */           {
/*  81 */             MainMemory.setI32(paramInt1, 1);
/*  82 */             if (paramBoolean)
/*     */             {
/*  84 */               MainMemory.setI8(i, paramByte);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  91 */               MainMemory.setI8(j, (byte)1);
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 102 */           else if (s < -128)
/*     */           {
/* 104 */             MainMemory.setI32(paramInt5, -11);
/* 105 */             MainMemory.setI8(i, (byte)Byte.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 112 */           else if (s > 127)
/*     */           {
/* 114 */             MainMemory.setI32(paramInt5, -11);
/* 115 */             MainMemory.setI8(i, (byte)Byte.MAX_VALUE);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 122 */             MainMemory.setI8(i, (byte)s);
/*     */           }
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
/* 138 */           paramInt6 += 1;
/* 139 */           if (paramInt6 == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2s1_726.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */