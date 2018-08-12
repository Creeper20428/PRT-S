/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4u2_912 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4u2_912();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4u2_912() { super("fffr4u2_912", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, int paramInt5, double paramDouble2, boolean paramBoolean, int paramInt6, int paramInt7, short paramShort)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramInt3, paramInt4, paramInt5, paramDouble2, paramBoolean, paramInt6, paramInt7, paramShort);
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
/*  30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, d1, k, m, n, d2, bool, i1, i2, s);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, int paramInt5, double paramDouble2, boolean paramBoolean, int paramInt6, int paramInt7, short paramShort)
/*     */   {
/*  64 */     boolean bool1 = false;
/*  65 */     boolean bool2 = false;
/*  66 */     short s1 = 0;
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     int m = 0;
/*  71 */     double d = 0.0D;
/*  72 */     short s2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  78 */       if (paramBoolean)
/*     */       {
/*  80 */         paramBoolean = paramInt4 == 1;
/*  81 */         bool1 = MathUtils.f_olt(paramDouble2, -0.49D);
/*  82 */         bool2 = MathUtils.f_ogt(paramDouble2, 65535.49D);
/*  83 */         s1 = (short)(int)Math.abs(paramDouble2);
/*  84 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  88 */           i = paramInt7 + (paramInt4 << 2);
/*  89 */           j = paramInt2 + (paramInt4 << 1);
/*  90 */           k = paramInt1 + paramInt4;
/*  91 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  92 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  97 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/* 100 */               d = MainMemory.getF32(i);
/* 101 */               d *= paramDouble1;
/* 102 */               d += paramDouble2;
/* 103 */               if (MathUtils.f_olt(d, -0.49D))
/*     */               {
/* 105 */                 MainMemory.setI32(paramInt5, -11);
/* 106 */                 MainMemory.setI16(j, (short)0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label390;
/*     */               }
/* 112 */               else if (MathUtils.f_ogt(d, 65535.49D))
/*     */               {
/* 114 */                 MainMemory.setI32(paramInt5, -11);
/* 115 */                 MainMemory.setI16(j, (short)-1);
/*     */                 
/*     */                 break label390;
/*     */               }
/*     */               else
/*     */               {
/* 121 */                 s2 = (short)(int)Math.abs(d);
/* 122 */                 MainMemory.setI16(j, s2);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label390;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 133 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 138 */               if (bool1)
/*     */               {
/* 140 */                 MainMemory.setI32(paramInt5, -11);
/* 141 */                 MainMemory.setI16(j, (short)0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label390;
/*     */               }
/* 147 */               else if (bool2)
/*     */               {
/* 149 */                 MainMemory.setI32(paramInt5, -11);
/* 150 */                 MainMemory.setI16(j, (short)-1);
/*     */                 
/*     */                 break label390;
/*     */               }
/*     */               else
/*     */               {
/* 156 */                 MainMemory.setI16(j, s1); }
/* 157 */               break;
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
/* 176 */           MainMemory.setI32(paramInt6, 1);
/* 177 */           if (paramBoolean)
/*     */           {
/* 179 */             MainMemory.setI16(j, paramShort);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 186 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label390:
/*     */           
/*     */ 
/*     */ 
/* 196 */           paramInt4 += 1;
/* 197 */           if (paramInt4 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4u2_912.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */