/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4r4_899 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4r4_899();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4r4_899() { super("fffr4r4_899", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, float paramFloat, boolean paramBoolean, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, double paramDouble2, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramFloat, paramBoolean, paramInt2, paramDouble1, paramInt3, paramInt4, paramDouble2, paramInt5, paramInt6);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
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
/*  54 */     call(i, f, bool, j, d1, k, m, d2, n, i1);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, float paramFloat, boolean paramBoolean, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, double paramDouble2, int paramInt5, int paramInt6)
/*     */   {
/*  61 */     float f1 = 0.0F;
/*  62 */     int i = 0;
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     double d = 0.0D;
/*  67 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (paramBoolean)
/*     */       {
/*  75 */         paramBoolean = paramInt2 == 1;
/*  76 */         f1 = (float)paramDouble2;
/*  77 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  81 */           i = paramInt1 + (paramInt2 << 2);
/*  82 */           j = paramInt6 + (paramInt2 << 2);
/*  83 */           k = paramInt5 + paramInt2;
/*  84 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  85 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  90 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  93 */               d = MainMemory.getF32(i);
/*  94 */               d *= paramDouble1;
/*  95 */               d += paramDouble2;
/*  96 */               f2 = (float)d;
/*  97 */               MainMemory.setF32(j, f2);
/*     */               
/*     */               break label240;
/* 100 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 105 */               MainMemory.setF32(j, f1);
/* 106 */               break;
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
/* 117 */           MainMemory.setI32(paramInt3, 1);
/* 118 */           if (paramBoolean)
/*     */           {
/* 120 */             MainMemory.setF32(j, paramFloat);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 127 */             MainMemory.setI8(k, (byte)1);
/* 128 */             MainMemory.setF32(j, -9.11912E-36F);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label240:
/*     */           
/*     */ 
/*     */ 
/* 138 */           paramInt2 += 1;
/* 139 */           if (paramInt2 == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4r4_899.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */