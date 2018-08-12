/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8r8_950 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8r8_950();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8r8_950() { super("fffr8r8_950", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, int paramInt5, double paramDouble2, int paramInt6, double paramDouble3, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramInt3, paramInt4, paramInt5, paramDouble2, paramInt6, paramDouble3, paramBoolean);
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
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, j, d1, k, m, n, d2, i1, d3, bool);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, int paramInt5, double paramDouble2, int paramInt6, double paramDouble3, boolean paramBoolean)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*  65 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       if (paramBoolean)
/*     */       {
/*  73 */         paramBoolean = paramInt5 == 1;
/*  74 */         paramInt5 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  78 */           i = paramInt3 + (paramInt5 << 3);
/*  79 */           j = paramInt4 + (paramInt5 << 3);
/*  80 */           k = paramInt2 + paramInt5;
/*  81 */           m = MainMemory.getI16(i + 6) & 0xFFFF & 0x7FF0;
/*  82 */           if (m != 32752)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  87 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  90 */               d = MainMemory.getF64(i) * paramDouble3;
/*  91 */               d += paramDouble2;
/*  92 */               MainMemory.setF64(j, d);
/*     */               
/*     */               break label231;
/*  95 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 100 */               MainMemory.setF64(j, paramDouble2);
/* 101 */               break;
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
/* 112 */           MainMemory.setI32(paramInt1, 1);
/* 113 */           if (paramBoolean)
/*     */           {
/* 115 */             MainMemory.setF64(j, paramDouble1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 122 */             MainMemory.setI8(k, (byte)1);
/* 123 */             MainMemory.setF64(j, -9.1191291391491E-36D);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label231:
/*     */           
/*     */ 
/*     */ 
/* 133 */           paramInt5 += 1;
/* 134 */           if (paramInt5 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8r8_950.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */