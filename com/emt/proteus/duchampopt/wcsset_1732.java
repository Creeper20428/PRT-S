/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class wcsset_1732 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new wcsset_1732();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public wcsset_1732() { super("wcsset_1732", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (paramInt1 > 0)
/*     */       {
/*  55 */         m = MainMemory.getI32(paramInt2 + 88);
/*  56 */         i = paramInt2 + 16;
/*  57 */         j = paramInt1 << 3;
/*  58 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */         n = m + j;
/*  67 */         i1 = paramInt3 + j;
/*  68 */         i2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  72 */           MainMemory.setF64(paramInt3 + (i2 << 3), MainMemory.getF64(m + (i2 << 3)));
/*  73 */           i2 += 1;
/*  74 */           if (i2 == paramInt1)
/*     */           {
/*  76 */             paramInt3 = n;
/*  77 */             i3 = i1;
/*  78 */             MainMemory.setF64(MainMemory.getI32(i) + (k << 3), 1.0D);
/*  79 */             k += 1;
/*  80 */             if (k == paramInt1) {
/*     */               break label165;
/*     */             }
/*     */             
/*     */ 
/*  85 */             m = paramInt3;
/*  86 */             paramInt3 = i3;
/*  87 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             break label165;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label165:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsset_1732.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */