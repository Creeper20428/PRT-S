/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffpkyj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3583;
/*  14 */   public static final Function _instance = new ffpkyj();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffpkyj() { super("ffpkyj", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = call(i, j, l, k, m);
/*  42 */     paramFrame.setI32(paramInt1, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*     */     
/*     */ 
/*  55 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(71);
/*  60 */       k = MainMemory.alloc(81);
/*  61 */       m = MainMemory.getI32(paramInt4);
/*  62 */       if (m <= 0) {
/*     */         break label70;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       i = m;
/*     */       
/*     */ 
/*     */       break label163;
/*     */       
/*     */       label70:
/*     */       
/*  79 */       MainMemory.setI8(j, (byte)0);
/*  80 */       if (SystemLibrary.sprintf(j, 20096, new Object[] { Long.valueOf(paramLong) }) >= 0) {
/*     */         break label130;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       ffxmsg.call(5, 99808);
/*  91 */       MainMemory.setI32(paramInt4, 401);
/*     */       
/*     */ 
/*     */       label130:
/*     */       
/*     */ 
/*  97 */       ffmkky.call(paramInt2, j, paramInt3, k, paramInt4);
/*  98 */       ffprec.call(paramInt1, k, paramInt4);
/*  99 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       label163:
/*     */       
/*     */ 
/* 105 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 110 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpkyj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */