/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4i2_882 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4i2_882();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4i2_882() { super("fffr4i2_882", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, short paramShort, int paramInt3, double paramDouble2, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramShort, paramInt3, paramDouble2, paramInt4, paramBoolean, paramInt5, paramInt6, paramInt7);
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
/*  33 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, d1, s, k, d2, m, bool, n, i1, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, short paramShort, int paramInt3, double paramDouble2, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  64 */     boolean bool1 = false;
/*  65 */     boolean bool2 = false;
/*  66 */     short s = 0;
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     int m = 0;
/*  71 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if (paramBoolean)
/*     */       {
/*  79 */         paramBoolean = paramInt6 == 1;
/*  80 */         bool1 = MathUtils.f_olt(paramDouble2, -32768.49D);
/*  81 */         bool2 = MathUtils.f_ogt(paramDouble2, 32767.49D);
/*  82 */         s = (short)(int)paramDouble2;
/*  83 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           i = paramInt4 + (paramInt6 << 2);
/*  88 */           j = paramInt1 + (paramInt6 << 1);
/*  89 */           k = paramInt7 + paramInt6;
/*  90 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  91 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  96 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  99 */               d = MainMemory.getF32(i);
/* 100 */               d *= paramDouble1;
/* 101 */               d += paramDouble2;
/* 102 */               if (MathUtils.f_olt(d, -32768.49D))
/*     */               {
/* 104 */                 MainMemory.setI32(paramInt5, -11);
/* 105 */                 MainMemory.setI16(j, (short)Short.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label386;
/*     */               }
/* 111 */               else if (MathUtils.f_ogt(d, 32767.49D))
/*     */               {
/* 113 */                 MainMemory.setI32(paramInt5, -11);
/* 114 */                 MainMemory.setI16(j, (short)Short.MAX_VALUE);
/*     */                 
/*     */                 break label386;
/*     */               }
/*     */               else
/*     */               {
/* 120 */                 MainMemory.setI16(j, (short)(int)d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label386;
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
/* 138 */                 MainMemory.setI32(paramInt5, -11);
/* 139 */                 MainMemory.setI16(j, (short)Short.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label386;
/*     */               }
/* 145 */               else if (bool2)
/*     */               {
/* 147 */                 MainMemory.setI32(paramInt5, -11);
/* 148 */                 MainMemory.setI16(j, (short)Short.MAX_VALUE);
/*     */                 
/*     */                 break label386;
/*     */               }
/*     */               else
/*     */               {
/* 154 */                 MainMemory.setI16(j, s); }
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
/* 177 */             MainMemory.setI16(j, paramShort);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 184 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label386:
/*     */           
/*     */ 
/*     */ 
/* 194 */           paramInt6 += 1;
/* 195 */           if (paramInt6 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4i2_882.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */