/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8r8_949 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8r8_949();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8r8_949() { super("fffr8r8_949", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, double paramDouble, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramDouble, paramInt4, paramInt5, paramInt6, paramBoolean);
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
/*  33 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(i, j, k, d, m, n, i1, bool);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, double paramDouble, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       if (paramBoolean)
/*     */       {
/*  66 */         paramBoolean = paramInt5 == 1;
/*  67 */         paramInt5 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  71 */           i = paramInt3 + (paramInt5 << 3);
/*  72 */           j = paramInt4 + (paramInt5 << 3);
/*  73 */           k = paramInt2 + paramInt5;
/*  74 */           m = MainMemory.getI16(i + 6) & 0xFFFF & 0x7FF0;
/*  75 */           if (m != 32752)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  80 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  83 */               MainMemory.setF64(j, MainMemory.getF64(i));
/*     */               
/*     */               break label212;
/*  86 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/*  91 */               MainMemory.setF64(j, 0.0D);
/*  92 */               break;
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
/* 103 */           MainMemory.setI32(paramInt1, 1);
/* 104 */           if (paramBoolean)
/*     */           {
/* 106 */             MainMemory.setF64(j, paramDouble);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 113 */             MainMemory.setI8(k, (byte)1);
/* 114 */             MainMemory.setF64(j, -9.1191291391491E-36D);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label212:
/*     */           
/*     */ 
/*     */ 
/* 124 */           paramInt5 += 1;
/* 125 */           if (paramInt5 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8r8_949.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */