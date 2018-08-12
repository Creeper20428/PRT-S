/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp5Param10setOffsetsEP6wcsprm extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2472;
/*  11 */   public static final Function _instance = new _ZN7duchamp5Param10setOffsetsEP6wcsprm();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp5Param10setOffsetsEP6wcsprm() { super("_ZN7duchamp5Param10setOffsetsEP6wcsprm", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
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
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       if (MainMemory.getI8(paramInt1 + 8) != 0) {
/*     */         break label67;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  55 */       MainMemory.setI32(paramInt1 + 280, 0);
/*  56 */       MainMemory.setI32(paramInt1 + 276, 0);
/*  57 */       MainMemory.setI32(paramInt1 + 272, 0);
/*     */       
/*     */ 
/*     */       break label300;
/*     */       
/*     */       label67:
/*     */       
/*  64 */       i = MainMemory.getI32(paramInt2 + 752);
/*  65 */       i = i < 0 ? 2 : i;
/*  66 */       k = MainMemory.getI32(paramInt2 + 4);
/*  67 */       i = k > i ? i : k + -1;
/*  68 */       j = MainMemory.getI32(paramInt2 + 744);
/*  69 */       k = MainMemory.getI32(paramInt1 + 32);
/*  70 */       if (!MathUtils.ugt(k, j))
/*     */       {
/*     */ 
/*     */ 
/*  74 */         j = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  81 */         j = MainMemory.getI32(MainMemory.getI32(paramInt1 + 36) + (j << 2));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       MainMemory.setI32(paramInt1 + 272, j);
/*  90 */       j = MainMemory.getI32(paramInt2 + 748);
/*  91 */       if (!MathUtils.ugt(k, j))
/*     */       {
/*     */ 
/*     */ 
/*  95 */         j = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 102 */         j = MainMemory.getI32(MainMemory.getI32(paramInt1 + 36) + (j << 2));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       MainMemory.setI32(paramInt1 + 276, j);
/* 111 */       if (!MathUtils.ugt(k, i))
/*     */       {
/*     */ 
/*     */ 
/* 115 */         i = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 122 */         i = MainMemory.getI32(MainMemory.getI32(paramInt1 + 36) + (i << 2));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       MainMemory.setI32(paramInt1 + 280, i);
/*     */       
/*     */ 
/*     */       label300:
/*     */       
/*     */ 
/* 136 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param10setOffsetsEP6wcsprm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */