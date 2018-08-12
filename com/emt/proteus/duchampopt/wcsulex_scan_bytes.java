/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class wcsulex_scan_bytes extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2948;
/*  13 */   public static final Function _instance = new wcsulex_scan_bytes();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public wcsulex_scan_bytes() { super("wcsulex_scan_bytes", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     call(paramInt1, paramInt2);
/*  21 */     return 0;
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
/*  32 */     call(i, j);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       i = paramInt2 + 2;
/*  49 */       j = com.emt.proteus.runtime.library.c.malloc.call(i);
/*  50 */       if (j != 0) {
/*     */         break label72;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */       SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(104224) });
/*  61 */       SystemLibrary.longjmp(481376, 2);
/*     */       
/*     */ 
/*     */       label72:
/*     */       
/*     */ 
/*  67 */       if (paramInt2 > 0) {
/*  68 */         k = 0;
/*     */       } else {
/*     */         break label131;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  79 */         MainMemory.setI8(j + k, MainMemory.getI8(paramInt1 + k));
/*  80 */         k += 1;
/*  81 */         if (k == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label131:
/*     */       
/*     */ 
/*     */ 
/*  92 */       MainMemory.setI8(j + (paramInt2 + 1), (byte)0);
/*  93 */       MainMemory.setI8(j + paramInt2, (byte)0);
/*  94 */       m = wcsulex_scan_buffer.call(j, i);
/*  95 */       if (m != 0) {
/*     */         break label208;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */       SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(82400) });
/* 106 */       SystemLibrary.longjmp(481376, 2);
/*     */       
/*     */ 
/*     */       label208:
/*     */       
/*     */ 
/* 112 */       MainMemory.setI32(m + 20, 1);
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsulex_scan_bytes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */