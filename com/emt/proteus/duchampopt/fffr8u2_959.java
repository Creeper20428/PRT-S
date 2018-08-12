/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8u2_959 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8u2_959();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8u2_959() { super("fffr8u2_959", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, short paramShort, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean, paramInt6, paramShort, paramInt7);
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
/*  39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, m, n, bool, i1, s, i2);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, short paramShort, int paramInt7)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     double d = 0.0D;
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
/*  76 */           i = paramInt3 + (paramInt6 << 3);
/*  77 */           j = paramInt1 + (paramInt6 << 1);
/*  78 */           k = paramInt2 + paramInt6;
/*  79 */           m = MainMemory.getI16(i + 6) & 0xFFFF & 0x7FF0;
/*  80 */           if (m != 32752)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  85 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  88 */               d = MainMemory.getF64(i);
/*  89 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */               {
/*  91 */                 MainMemory.setI32(paramInt7, -11);
/*  92 */                 MainMemory.setI16(j, (short)0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label287;
/*     */               }
/*  98 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 65535.49D))
/*     */               {
/* 100 */                 MainMemory.setI32(paramInt7, -11);
/* 101 */                 MainMemory.setI16(j, (short)-1);
/*     */                 
/*     */                 break label287;
/*     */               }
/*     */               else
/*     */               {
/* 107 */                 s = (short)(int)Math.abs(d);
/* 108 */                 MainMemory.setI16(j, s);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label287;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 119 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 124 */               MainMemory.setI16(j, (short)0);
/* 125 */               break;
/*     */             }
/*     */             
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */           MainMemory.setI32(paramInt5, 1);
/* 137 */           if (paramBoolean)
/*     */           {
/* 139 */             MainMemory.setI16(j, paramShort);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 146 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label287:
/*     */           
/*     */ 
/*     */ 
/* 156 */           paramInt6 += 1;
/* 157 */           if (paramInt6 == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8u2_959.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */