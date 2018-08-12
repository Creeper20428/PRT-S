/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8i2_927 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8i2_927();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8i2_927() { super("fffr8i2_927", 11, false); }
/*     */   
/*     */   public int execute(boolean paramBoolean, int paramInt1, short paramShort, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, double paramDouble2, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramBoolean, paramInt1, paramShort, paramInt2, paramDouble1, paramInt3, paramInt4, paramDouble2, paramInt5, paramInt6, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/*  57 */     call(bool, i, s, j, d1, k, m, d2, n, i1, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(boolean paramBoolean, int paramInt1, short paramShort, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, double paramDouble2, int paramInt5, int paramInt6, int paramInt7)
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
/*  79 */         paramBoolean = paramInt1 == 1;
/*  80 */         bool1 = MathUtils.f_olt(paramDouble1, -32768.49D);
/*  81 */         bool2 = MathUtils.f_ogt(paramDouble1, 32767.49D);
/*  82 */         s = (short)(int)paramDouble1;
/*  83 */         paramInt1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           i = paramInt3 + (paramInt1 << 3);
/*  88 */           j = paramInt5 + (paramInt1 << 1);
/*  89 */           k = paramInt2 + paramInt1;
/*  90 */           m = MainMemory.getI16(i + 6) & 0xFFFF & 0x7FF0;
/*  91 */           if (m != 32752)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  96 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  99 */               d = MainMemory.getF64(i) * paramDouble2;
/* 100 */               d += paramDouble1;
/* 101 */               if (MathUtils.f_olt(d, -32768.49D))
/*     */               {
/* 103 */                 MainMemory.setI32(paramInt7, -11);
/* 104 */                 MainMemory.setI16(j, (short)Short.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label377;
/*     */               }
/* 110 */               else if (MathUtils.f_ogt(d, 32767.49D))
/*     */               {
/* 112 */                 MainMemory.setI32(paramInt7, -11);
/* 113 */                 MainMemory.setI16(j, (short)Short.MAX_VALUE);
/*     */                 
/*     */                 break label377;
/*     */               }
/*     */               else
/*     */               {
/* 119 */                 MainMemory.setI16(j, (short)(int)d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label377;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 130 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 135 */               if (bool1)
/*     */               {
/* 137 */                 MainMemory.setI32(paramInt7, -11);
/* 138 */                 MainMemory.setI16(j, (short)Short.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label377;
/*     */               }
/* 144 */               else if (bool2)
/*     */               {
/* 146 */                 MainMemory.setI32(paramInt7, -11);
/* 147 */                 MainMemory.setI16(j, (short)Short.MAX_VALUE);
/*     */                 
/*     */                 break label377;
/*     */               }
/*     */               else
/*     */               {
/* 153 */                 MainMemory.setI16(j, s); }
/* 154 */               break;
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
/* 173 */           MainMemory.setI32(paramInt4, 1);
/* 174 */           if (paramBoolean)
/*     */           {
/* 176 */             MainMemory.setI16(j, paramShort);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 183 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label377:
/*     */           
/*     */ 
/*     */ 
/* 193 */           paramInt1 += 1;
/* 194 */           if (paramInt1 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8i2_927.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */