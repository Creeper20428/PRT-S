/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4i1_877 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4i1_877();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4i1_877() { super("fffr4i1_877", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, int paramInt4, int paramInt5, byte paramByte, double paramDouble2, int paramInt6, boolean paramBoolean, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramDouble1, paramInt4, paramInt5, paramByte, paramDouble2, paramInt6, paramBoolean, paramInt7);
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
/*  33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, k, d1, m, n, b, d2, i1, bool, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, int paramInt4, int paramInt5, byte paramByte, double paramDouble2, int paramInt6, boolean paramBoolean, int paramInt7)
/*     */   {
/*  64 */     boolean bool1 = false;
/*  65 */     boolean bool2 = false;
/*  66 */     byte b1 = 0;
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     int m = 0;
/*  71 */     double d = 0.0D;
/*  72 */     byte b2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  78 */       if (paramBoolean)
/*     */       {
/*  80 */         paramBoolean = paramInt4 == 1;
/*  81 */         bool1 = MathUtils.f_olt(paramDouble2, -0.49D);
/*  82 */         bool2 = MathUtils.f_ogt(paramDouble2, 255.49D);
/*  83 */         b1 = (byte)(int)Math.abs(paramDouble2);
/*  84 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  88 */           i = paramInt3 + (paramInt4 << 2);
/*  89 */           j = paramInt5 + paramInt4;
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
/* 105 */                 MainMemory.setI32(paramInt6, -11);
/* 106 */                 MainMemory.setI8(j, (byte)0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label389;
/*     */               }
/* 112 */               else if (MathUtils.f_ogt(d, 255.49D))
/*     */               {
/* 114 */                 MainMemory.setI32(paramInt6, -11);
/* 115 */                 MainMemory.setI8(j, (byte)-1);
/*     */                 
/*     */                 break label389;
/*     */               }
/*     */               else
/*     */               {
/* 121 */                 b2 = (byte)(int)Math.abs(d);
/* 122 */                 MainMemory.setI8(j, b2);
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
/* 133 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 138 */               if (bool1)
/*     */               {
/* 140 */                 MainMemory.setI32(paramInt6, -11);
/* 141 */                 MainMemory.setI8(j, (byte)0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label389;
/*     */               }
/* 147 */               else if (bool2)
/*     */               {
/* 149 */                 MainMemory.setI32(paramInt6, -11);
/* 150 */                 MainMemory.setI8(j, (byte)-1);
/*     */                 
/*     */                 break label389;
/*     */               }
/*     */               else
/*     */               {
/* 156 */                 MainMemory.setI8(j, b1); }
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
/* 176 */           MainMemory.setI32(paramInt2, 1);
/* 177 */           if (paramBoolean)
/*     */           {
/* 179 */             MainMemory.setI8(j, paramByte);
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
/*     */           label389:
/*     */           
/*     */ 
/*     */ 
/* 196 */           paramInt4 += 1;
/* 197 */           if (paramInt4 == paramInt7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4i1_877.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */