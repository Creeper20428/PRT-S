/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4r8_903 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4r8_903();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4r8_903() { super("fffr4r8_903", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramDouble, paramInt4, paramInt5, paramInt6);
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
/*  33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(i, j, k, bool, d, m, n, i1);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if (paramBoolean)
/*     */       {
/*  67 */         paramBoolean = paramInt3 == 1;
/*  68 */         paramInt3 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  72 */           i = paramInt5 + (paramInt3 << 2);
/*  73 */           j = paramInt2 + (paramInt3 << 3);
/*  74 */           k = paramInt4 + paramInt3;
/*  75 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  76 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  81 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  84 */               d = MainMemory.getF32(i);
/*  85 */               MainMemory.setF64(j, d);
/*     */               
/*     */               break label206;
/*  88 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/*  93 */               MainMemory.setF64(j, 0.0D);
/*  94 */               break;
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
/* 105 */           MainMemory.setI32(paramInt6, 1);
/* 106 */           if (paramBoolean)
/*     */           {
/* 108 */             MainMemory.setF64(j, paramDouble);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 115 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label206:
/*     */           
/*     */ 
/*     */ 
/* 125 */           paramInt3 += 1;
/* 126 */           if (paramInt3 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4r8_903.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */