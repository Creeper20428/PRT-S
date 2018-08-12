/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8s1_952 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8s1_952();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8s1_952() { super("fffr8s1_952", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, boolean paramBoolean, byte paramByte, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramDouble1, paramDouble2, paramInt4, paramBoolean, paramByte, paramInt5, paramInt6, paramInt7);
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
/*  36 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
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
/*  57 */     call(i, j, k, d1, d2, m, bool, b, n, i1, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, boolean paramBoolean, byte paramByte, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  64 */     boolean bool1 = false;
/*  65 */     boolean bool2 = false;
/*  66 */     byte b = 0;
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
/*  79 */         paramBoolean = paramInt7 == 1;
/*  80 */         bool1 = MathUtils.f_olt(paramDouble1, -128.49D);
/*  81 */         bool2 = MathUtils.f_ogt(paramDouble1, 127.49D);
/*  82 */         b = (byte)(int)paramDouble1;
/*  83 */         paramInt7 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           i = paramInt2 + (paramInt7 << 3);
/*  88 */           j = paramInt3 + paramInt7;
/*  89 */           k = paramInt5 + paramInt7;
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
/* 101 */               if (MathUtils.f_olt(d, -128.49D))
/*     */               {
/* 103 */                 MainMemory.setI32(paramInt4, -11);
/* 104 */                 MainMemory.setI8(j, (byte)Byte.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label374;
/*     */               }
/* 110 */               else if (MathUtils.f_ogt(d, 127.49D))
/*     */               {
/* 112 */                 MainMemory.setI32(paramInt4, -11);
/* 113 */                 MainMemory.setI8(j, (byte)Byte.MAX_VALUE);
/*     */                 
/*     */                 break label374;
/*     */               }
/*     */               else
/*     */               {
/* 119 */                 MainMemory.setI8(j, (byte)(int)d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label374;
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
/* 137 */                 MainMemory.setI32(paramInt4, -11);
/* 138 */                 MainMemory.setI8(j, (byte)Byte.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label374;
/*     */               }
/* 144 */               else if (bool2)
/*     */               {
/* 146 */                 MainMemory.setI32(paramInt4, -11);
/* 147 */                 MainMemory.setI8(j, (byte)Byte.MAX_VALUE);
/*     */                 
/*     */                 break label374;
/*     */               }
/*     */               else
/*     */               {
/* 153 */                 MainMemory.setI8(j, b); }
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
/* 173 */           MainMemory.setI32(paramInt6, 1);
/* 174 */           if (paramBoolean)
/*     */           {
/* 176 */             MainMemory.setI8(j, paramByte);
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
/*     */           label374:
/*     */           
/*     */ 
/*     */ 
/* 193 */           paramInt7 += 1;
/* 194 */           if (paramInt7 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8s1_952.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */