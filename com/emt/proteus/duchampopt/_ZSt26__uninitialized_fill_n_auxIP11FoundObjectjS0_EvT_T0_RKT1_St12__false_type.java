/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt26__uninitialized_fill_n_auxIP11FoundObjectjS0_EvT_T0_RKT1_St12__false_type extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1087;
/*  12 */   public static final Function _instance = new _ZSt26__uninitialized_fill_n_auxIP11FoundObjectjS0_EvT_T0_RKT1_St12__false_type();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZSt26__uninitialized_fill_n_auxIP11FoundObjectjS0_EvT_T0_RKT1_St12__false_type() { super("_ZSt26__uninitialized_fill_n_auxIP11FoundObjectjS0_EvT_T0_RKT1_St12__false_type", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j, k);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       i = paramInt3 + 4;
/*  54 */       j = paramInt3 + 8;
/*  55 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  62 */         m = paramInt1 + k * 52;
/*  63 */         n = paramInt1 + k * 52;
/*  64 */         i1 = paramInt1 + k * 52 + 8;
/*  65 */         i2 = paramInt1 + k * 52 + 4;
/*  66 */         if (k != paramInt2) {
/*     */           break label108;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         break;
/*     */         
/*     */ 
/*     */         label108:
/*     */         
/*     */ 
/*  82 */         if (m != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */           MainMemory.setI32(n, MainMemory.getI32(paramInt3));
/*  93 */           MainMemory.setI32(i2, MainMemory.getI32(i));
/*  94 */           _ZN9PixelInfo8Object2DC1ERKS0_.call(i1, j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 100 */         k += 1;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt26__uninitialized_fill_n_auxIP11FoundObjectjS0_EvT_T0_RKT1_St12__false_type.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */