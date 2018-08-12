/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4u4_917 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4u4_917();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4u4_917() { super("fffr4u4_917", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt8)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean, paramDouble1, paramDouble2, paramInt8);
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
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, k, m, n, i1, i2, bool, d1, d2, i3);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt8)
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
/*  80 */         bool1 = MathUtils.f_olt(paramDouble2, -0.49D);
/*  81 */         bool2 = MathUtils.f_ogt(paramDouble2, 4.29496729549E9D);
/*  82 */         paramInt7 = (int)Math.abs(paramDouble2);
/*  83 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           j = paramInt6 + (i << 2);
/*  88 */           k = paramInt5 + (i << 2);
/*  89 */           m = paramInt2 + i;
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
/* 100 */               d *= paramDouble1;
/* 101 */               d += paramDouble2;
/* 102 */               if (MathUtils.f_olt(d, -0.49D))
/*     */               {
/* 104 */                 MainMemory.setI32(paramInt4, -11);
/* 105 */                 MainMemory.setI32(k, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label385;
/*     */               }
/* 111 */               else if (MathUtils.f_ogt(d, 4.29496729549E9D))
/*     */               {
/* 113 */                 MainMemory.setI32(paramInt4, -11);
/* 114 */                 MainMemory.setI32(k, -1);
/*     */                 
/*     */                 break label385;
/*     */               }
/*     */               else
/*     */               {
/* 120 */                 n = (int)Math.abs(d);
/* 121 */                 MainMemory.setI32(k, n);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label385;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 132 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 137 */               if (bool1)
/*     */               {
/* 139 */                 MainMemory.setI32(paramInt4, -11);
/* 140 */                 MainMemory.setI32(k, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label385;
/*     */               }
/* 146 */               else if (bool2)
/*     */               {
/* 148 */                 MainMemory.setI32(paramInt4, -11);
/* 149 */                 MainMemory.setI32(k, -1);
/*     */                 
/*     */                 break label385;
/*     */               }
/*     */               else
/*     */               {
/* 155 */                 MainMemory.setI32(k, paramInt7); }
/* 156 */               break;
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
/* 175 */           MainMemory.setI32(paramInt3, 1);
/* 176 */           if (paramBoolean)
/*     */           {
/* 178 */             MainMemory.setI32(k, paramInt8);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 185 */             MainMemory.setI8(m, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label385:
/*     */           
/*     */ 
/*     */ 
/* 195 */           i += 1;
/* 196 */           if (i == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4u4_917.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */