/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4i4_887 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4i4_887();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4i4_887() { super("fffr4i4_887", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double paramDouble1, int paramInt6, double paramDouble2, int paramInt7, int paramInt8, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramDouble1, paramInt6, paramDouble2, paramInt7, paramInt8, paramBoolean);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  39 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, k, m, n, d1, i1, d2, i2, i3, bool);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double paramDouble1, int paramInt6, double paramDouble2, int paramInt7, int paramInt8, boolean paramBoolean)
/*     */   {
/*  64 */     boolean bool1 = false;
/*  65 */     boolean bool2 = false;
/*  66 */     int i = 0;
/*  67 */     int j = 0;
/*  68 */     int k = 0;
/*  69 */     int m = 0;
/*  70 */     int n = 0;
/*  71 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if (paramBoolean)
/*     */       {
/*  79 */         paramBoolean = paramInt7 == 1;
/*  80 */         bool1 = MathUtils.f_olt(paramDouble1, -2.14748364849E9D);
/*  81 */         bool2 = MathUtils.f_ogt(paramDouble1, 2.14748364749E9D);
/*  82 */         paramInt7 = (int)paramDouble1;
/*  83 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           j = paramInt4 + (i << 2);
/*  88 */           k = paramInt8 + (i << 2);
/*  89 */           m = paramInt5 + i;
/*  90 */           n = MainMemory.getI16(j + 2) & 0xFFFF & 0x7F80;
/*  91 */           if (n != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  96 */             switch (n == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  99 */               d = MainMemory.getF32(j);
/* 100 */               d *= paramDouble2;
/* 101 */               d += paramDouble1;
/* 102 */               if (MathUtils.f_olt(d, -2.14748364849E9D))
/*     */               {
/* 104 */                 MainMemory.setI32(paramInt3, -11);
/* 105 */                 MainMemory.setI32(k, Integer.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label378;
/*     */               }
/* 111 */               else if (MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */               {
/* 113 */                 MainMemory.setI32(paramInt3, -11);
/* 114 */                 MainMemory.setI32(k, Integer.MAX_VALUE);
/*     */                 
/*     */                 break label378;
/*     */               }
/*     */               else
/*     */               {
/* 120 */                 MainMemory.setI32(k, (int)d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label378;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 131 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 136 */               if (bool1)
/*     */               {
/* 138 */                 MainMemory.setI32(paramInt3, -11);
/* 139 */                 MainMemory.setI32(k, Integer.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label378;
/*     */               }
/* 145 */               else if (bool2)
/*     */               {
/* 147 */                 MainMemory.setI32(paramInt3, -11);
/* 148 */                 MainMemory.setI32(k, Integer.MAX_VALUE);
/*     */                 
/*     */                 break label378;
/*     */               }
/*     */               else
/*     */               {
/* 154 */                 MainMemory.setI32(k, paramInt7); }
/* 155 */               break;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           MainMemory.setI32(paramInt2, 1);
/* 175 */           if (paramBoolean)
/*     */           {
/* 177 */             MainMemory.setI32(k, paramInt6);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 184 */             MainMemory.setI8(m, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label378:
/*     */           
/*     */ 
/*     */ 
/* 194 */           i += 1;
/* 195 */           if (i == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4i4_887.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */