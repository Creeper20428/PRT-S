/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp.__strcspn_c1;
/*     */ 
/*     */ public final class ffgkym extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3417;
/*  14 */   public static final Function _instance = new ffgkym();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgkym() { super("ffgkym", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*     */     
/*     */ 
/*  55 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       i = MainMemory.alloc(81);
/*  60 */       j = MainMemory.alloc(71);
/*  61 */       k = MainMemory.alloc(81);
/*  62 */       m = MainMemory.getI32(paramInt5);
/*  63 */       if (m <= 0) {
/*     */         break label73;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label282;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label73:
/*     */       
/*     */ 
/*     */ 
/*  79 */       MainMemory.setI8(j, (byte)0);
/*  80 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         MainMemory.setI8(paramInt4, (byte)0);
/*  92 */         m = MainMemory.getI32(paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         ffgkym_1042.call(i, paramInt5, j, paramInt4, paramInt1, paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 116 */       if (MainMemory.getI8(j) != 40) {
/*     */         break label238;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       MainMemory.setI8(j, (byte)32);
/* 127 */       MainMemory.setI8(j + __strcspn_c1.call(j, 41), (byte)0);
/* 128 */       m = __strcspn_c1.call(j, 44);
/* 129 */       MainMemory.setI8(j + m, (byte)0);
/* 130 */       ffc2d.call(j, paramInt3, paramInt5);
/* 131 */       ffc2d.call(j + (m + 1), paramInt3 + 8, paramInt5);
/*     */       
/*     */ 
/*     */       break label282;
/*     */       
/*     */       label238:
/*     */       
/* 138 */       SystemLibrary.sprintf(k, 115296, new Object[] { Integer.valueOf(paramInt2) });
/* 139 */       ffxmsg.call(5, k);
/* 140 */       ffxmsg.call(5, j);
/* 141 */       MainMemory.setI32(paramInt5, 409);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label282:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgkym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */