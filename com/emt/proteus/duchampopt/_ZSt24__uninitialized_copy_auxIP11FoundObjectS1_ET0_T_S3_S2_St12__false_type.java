/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1088;
/*  12 */   public static final Function _instance = new _ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type() { super("_ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  62 */         k = paramInt3 + j * 52;
/*  63 */         m = paramInt3 + j * 52;
/*  64 */         n = paramInt3 + j * 52 + 8;
/*  65 */         i1 = paramInt3 + j * 52 + 4;
/*  66 */         i2 = paramInt1 + j * 52 + 8;
/*  67 */         i3 = paramInt1 + j * 52 + 4;
/*  68 */         i4 = paramInt1 + j * 52;
/*  69 */         if (paramInt1 + j * 52 != paramInt2) {
/*     */           break label144;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         i = k;
/*  80 */         break;
/*     */         
/*     */ 
/*     */         label144:
/*     */         
/*     */ 
/*  86 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */           MainMemory.setI32(m, MainMemory.getI32(i4));
/*  97 */           MainMemory.setI32(i1, MainMemory.getI32(i3));
/*  98 */           _ZN9PixelInfo8Object2DC1ERKS0_.call(n, i2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 104 */         j += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 109 */       int i5 = i;return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */