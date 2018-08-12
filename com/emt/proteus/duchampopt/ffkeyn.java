/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffkeyn extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3231;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new ffkeyn();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffkeyn() { super("ffkeyn", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j, k, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*     */     
/*     */ 
/*  47 */     int k = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  51 */       i = MainMemory.alloc(16);
/*  52 */       MainMemory.setI8(paramInt3, (byte)0);
/*  53 */       j = SystemLibrary.strlen(paramInt1);
/*  54 */       if (MathUtils.or((byte)(MathUtils.ugt(j + -1, 6) ? 1 : 0), (byte)(paramInt2 >>> 31)) != 0) {
/*     */         break label160;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */       SystemLibrary.sprintf(i, 15680, new Object[] { Integer.valueOf(paramInt2) });
/*  65 */       if (!MathUtils.ugt(SystemLibrary.strlen(i) + j, 8)) {
/*     */         break label137;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       MainMemory.setI32(paramInt4, 206);
/*     */       
/*     */ 
/*     */       break label172;
/*     */       
/*     */       label137:
/*     */       
/*  82 */       SystemLibrary.strcpy(paramInt3, paramInt1);
/*  83 */       SystemLibrary.strcat(paramInt3, i);
/*     */       
/*     */ 
/*     */       break label172;
/*     */       
/*     */       label160:
/*     */       
/*  90 */       MainMemory.setI32(paramInt4, 206);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label172:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       MainMemory.dealloc_generated(k);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffkeyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */