/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8u2_957 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8u2_957();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8u2_957() { super("fffr8u2_957", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, int paramInt5, double paramDouble2, boolean paramBoolean, int paramInt6, short paramShort, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramInt3, paramInt4, paramInt5, paramDouble2, paramBoolean, paramInt6, paramShort, paramInt7);
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
/*  51 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, d1, k, m, n, d2, bool, i1, s, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, int paramInt5, double paramDouble2, boolean paramBoolean, int paramInt6, short paramShort, int paramInt7)
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
/*  80 */         paramBoolean = paramInt6 == 1;
/*  81 */         bool1 = MathUtils.f_olt(paramDouble2, -0.49D);
/*  82 */         bool2 = MathUtils.f_ogt(paramDouble2, 65535.49D);
/*  83 */         s1 = (short)(int)Math.abs(paramDouble2);
/*  84 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  88 */           i = paramInt3 + (paramInt6 << 3);
/*  89 */           j = paramInt1 + (paramInt6 << 1);
/*  90 */           k = paramInt2 + paramInt6;
/*  91 */           m = MainMemory.getI16(i + 6) & 0xFFFF & 0x7FF0;
/*  92 */           if (m != 32752)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  97 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/* 100 */               d = MainMemory.getF64(i) * paramDouble1;
/* 101 */               d += paramDouble2;
/* 102 */               if (MathUtils.f_olt(d, -0.49D))
/*     */               {
/* 104 */                 MainMemory.setI32(paramInt7, -11);
/* 105 */                 MainMemory.setI16(j, (short)0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label389;
/*     */               }
/* 111 */               else if (MathUtils.f_ogt(d, 65535.49D))
/*     */               {
/* 113 */                 MainMemory.setI32(paramInt7, -11);
/* 114 */                 MainMemory.setI16(j, (short)-1);
/*     */                 
/*     */                 break label389;
/*     */               }
/*     */               else
/*     */               {
/* 120 */                 s2 = (short)(int)Math.abs(d);
/* 121 */                 MainMemory.setI16(j, s2);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label389;
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
/* 139 */                 MainMemory.setI32(paramInt7, -11);
/* 140 */                 MainMemory.setI16(j, (short)0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label389;
/*     */               }
/* 146 */               else if (bool2)
/*     */               {
/* 148 */                 MainMemory.setI32(paramInt7, -11);
/* 149 */                 MainMemory.setI16(j, (short)-1);
/*     */                 
/*     */                 break label389;
/*     */               }
/*     */               else
/*     */               {
/* 155 */                 MainMemory.setI16(j, s1); }
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
/* 175 */           MainMemory.setI32(paramInt5, 1);
/* 176 */           if (paramBoolean)
/*     */           {
/* 178 */             MainMemory.setI16(j, paramShort);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 185 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label389:
/*     */           
/*     */ 
/*     */ 
/* 195 */           paramInt6 += 1;
/* 196 */           if (paramInt6 == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8u2_957.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */