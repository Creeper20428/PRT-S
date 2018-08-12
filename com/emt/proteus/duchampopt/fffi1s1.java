/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class fffi1s1 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3363;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new fffi1s1();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1s1() { super("fffi1s1", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, byte paramByte1, byte paramByte2, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramByte1, paramByte2, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  39 */     byte b1 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     byte b2 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
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
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, d1, d2, k, b1, b2, m, n, i1, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, byte paramByte1, byte paramByte2, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  64 */     boolean bool1 = false;
/*  65 */     boolean bool2 = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       bool1 = MathUtils.f_une(paramDouble1, 1.0D);
/*  72 */       bool2 = (bool1) || (MathUtils.f_une(paramDouble2, -128.0D));
/*  73 */       if (paramInt3 != 0) {
/*     */         break label172;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       if (!bool2) {
/*     */         break label155;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       bool2 = paramInt2 > 0;
/*  94 */       if ((!bool1) && (!MathUtils.f_une(paramDouble2, 0.0D))) {
/*     */         break label134;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       fffi1s1_663.call(paramDouble2, paramDouble1, paramInt7, paramInt6, paramInt1, bool2, paramInt2);
/*     */       
/*     */       break label313;
/*     */       
/*     */       label134:
/* 109 */       fffi1s1_664.call(paramInt6, paramInt1, bool2, paramInt7, paramInt2);
/*     */       
/*     */       break label313;
/*     */       
/*     */       label155:
/* 114 */       fffi1s1_665.call(paramInt6, paramInt1, paramInt2);
/*     */       
/*     */       break label313;
/*     */       
/*     */       label172:
/* 119 */       if (!bool2) {
/*     */         break label291;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       bool2 = paramInt2 > 0;
/* 130 */       if ((!bool1) && (!MathUtils.f_une(paramDouble2, 0.0D))) {
/*     */         break label262;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       fffi1s1_660.call(paramByte2, paramDouble2, paramDouble1, paramInt3, paramInt7, bool2, paramByte1, paramInt6, paramInt4, paramInt1, paramInt5, paramInt2);
/*     */       
/*     */       break label313;
/*     */       
/*     */       label262:
/* 145 */       fffi1s1_661.call(paramByte2, paramInt3, bool2, paramByte1, paramInt6, paramInt4, paramInt1, paramInt5, paramInt2);
/*     */       
/*     */       break label313;
/*     */       
/*     */       label291:
/* 150 */       fffi1s1_662.call(paramByte2, paramInt3, paramByte1, paramInt6, paramInt4, paramInt1, paramInt5, paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label313:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 161 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1s1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */