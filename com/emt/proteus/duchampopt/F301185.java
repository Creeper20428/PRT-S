/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F301185 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3183;
/*  13 */   public static final Function _instance = new F301185();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F301185() { super("F301185", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       i = MainMemory.getI32Aligned(470792);
/*  49 */       i1 = MainMemory.getI32(paramInt + 12);
/*  50 */       j = MainMemory.getI32(paramInt + 16);
/*  51 */       k = MainMemory.getI32(i + i1 * 344 + 56);
/*  52 */       m = MainMemory.getI32(i + i1 * 344 + 56 + 32);
/*  53 */       n = m + (k << 3);
/*  54 */       i1 = MainMemory.getI32(i + i1 * 344 + 52);
/*  55 */       i2 = i + j * 344;
/*  56 */       if (MainMemory.getI32(i2) != 64536) {
/*     */         break label190;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       MainMemory.setI8(paramInt + 88, com.emt.proteus.lib.api.MathUtils.xor((byte)(F290671.call(MainMemory.getF64(i + j * 344 + 56 + 32), k, m, n, i1) >>> 31), (byte)1));
/*  67 */       MainMemory.setI32(paramInt, 64536);
/*     */       
/*     */       break label208;
/*     */       
/*     */       label190:
/*  72 */       F301185_123.call(i1, n, i, k, paramInt, m, j);
/*     */       
/*     */ 
/*     */       label208:
/*     */       
/*     */ 
/*  78 */       if (MainMemory.getI32(i2) <= 0) {
/*     */         break label258;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       free.call(MainMemory.getI32(i + j * 344 + 56 + 32));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label258:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F301185.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */