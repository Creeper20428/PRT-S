/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffgisz
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3260;
/*  13 */   public static final Function _instance = new ffgisz();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffgisz() { super("ffgisz", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = call(i, j, k, m);
/*  38 */     paramFrame.setI32(paramInt1, n);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */         j = MainMemory.getI32(paramInt1);
/*  65 */         k = paramInt1 + 4;
/*  66 */         m = MainMemory.getI32(k);
/*  67 */         if (j != MainMemory.getI32(m + 64)) {
/*     */           break label127;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label143;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         if (ffrdef.call(paramInt1, paramInt4) > 0) {
/*     */           break label249;
/*     */         } else {
/*     */           break label143;
/*     */         }
/*     */         
/*     */ 
/*     */         label127:
/*     */         
/*  96 */         ffmahd.call(paramInt1, j + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label143:
/*     */         
/*     */ 
/* 102 */         m = MainMemory.getI32(k);
/* 103 */         if (MainMemory.getI32(m + 68) != 0) {
/*     */           break label193;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         ffgisz_1013.call(k, m, paramInt2, paramInt3);
/*     */         
/*     */         break label249;
/*     */         
/*     */         label193:
/* 118 */         if (MainMemory.getI32(m + 1012) != 0) {
/*     */           break label235;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         MainMemory.setI32(paramInt4, 233);
/*     */         
/*     */         break label249;
/*     */         
/*     */         label235:
/* 133 */         ffgisz_1014.call(k, m, paramInt2, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */       label249:
/*     */       
/* 139 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       int n = i;return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgisz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */