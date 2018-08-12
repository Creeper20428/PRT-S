/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4r8_902 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4r8_902();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4r8_902() { super("fffr4r8_902", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, boolean paramBoolean, double paramDouble3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramBoolean, paramDouble3, paramInt4, paramInt5, paramInt6);
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
/*  33 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, j, d1, d2, k, bool, d3, m, n, i1);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, boolean paramBoolean, double paramDouble3, int paramInt4, int paramInt5, int paramInt6)
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
/*  73 */         paramBoolean = paramInt3 == 1;
/*  74 */         paramInt3 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  78 */           i = paramInt5 + (paramInt3 << 2);
/*  79 */           j = paramInt2 + (paramInt3 << 3);
/*  80 */           k = paramInt4 + paramInt3;
/*  81 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  82 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  87 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  90 */               d = MainMemory.getF32(i);
/*  91 */               d *= paramDouble1;
/*  92 */               d += paramDouble2;
/*  93 */               MainMemory.setF64(j, d);
/*     */               
/*     */               break label225;
/*  96 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 101 */               MainMemory.setF64(j, paramDouble2);
/* 102 */               break;
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
/* 113 */           MainMemory.setI32(paramInt6, 1);
/* 114 */           if (paramBoolean)
/*     */           {
/* 116 */             MainMemory.setF64(j, paramDouble3);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 123 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label225:
/*     */           
/*     */ 
/*     */ 
/* 133 */           paramInt3 += 1;
/* 134 */           if (paramInt3 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4r8_902.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */