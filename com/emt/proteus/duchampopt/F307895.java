/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F307895 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3199;
/*  13 */   public static final com.emt.proteus.runtime.api.Function _instance = new F307895();
/*  14 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  16 */   public F307895() { super("F307895", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = call(i, j, k, m, n);
/*  41 */     paramFrame.setI32(paramInt1, i1);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     double d1 = 0.0D;
/*  54 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*  57 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       j = MainMemory.alloc(4);
/*  62 */       k = MainMemory.alloc(8);
/*  63 */       m = MainMemory.alloc(8);
/*  64 */       n = MainMemory.alloc(80);
/*  65 */       switch (paramInt3) {
/*     */       case -64: 
/*     */         break label458;
/*     */         break;
/*     */       case -32: 
/*     */         break label458;
/*     */         break;
/*     */       case 8: 
/*     */         break;
/*     */       case 16: 
/*     */         break;
/*     */       case 32: 
/*     */         break;
/*     */       case 64: 
/*     */         break label458;
/*     */         break;
/*     */       }
/*  82 */       MainMemory.setI32(j, 0);
/*  83 */       if (ffgky.call(paramInt1, 82, 24096, m, 0, j) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         MainMemory.setF64(m, 0.0D);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  99 */       MainMemory.setI32(j, 0);
/* 100 */       if (ffgky.call(paramInt1, 82, 28256, k, 0, j) != 0) {
/*     */         break label268;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       d1 = MainMemory.getF64(k);
/* 111 */       if (MathUtils.f_une(d1, 1.0D)) {
/*     */         break label355;
/*     */       } else {
/*     */         break label282;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label268:
/*     */       
/*     */ 
/* 122 */       MainMemory.setF64(k, 1.0D);
/* 123 */       d1 = 1.0D;
/*     */       
/*     */ 
/*     */ 
/*     */       label282:
/*     */       
/*     */ 
/* 130 */       d2 = MainMemory.getF64(m);
/* 131 */       if ((!MathUtils.f_oeq(d2, 0.0D)) && (!MathUtils.f_oeq(d2, 32768.0D))) {
/*     */         break label355;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */       MainMemory.setI32(paramInt4 + 84, 259);
/* 143 */       MainMemory.setI32(paramInt5 + 80, 41);
/* 144 */       i = 0;
/*     */       
/*     */ 
/*     */       break label534;
/*     */       
/*     */ 
/*     */       label355:
/*     */       
/* 152 */       MainMemory.setI32(paramInt4 + 84, 260);
/* 153 */       MainMemory.setI32(paramInt5 + 80, 82);
/* 154 */       if (MainMemory.getI32Aligned(459328) != 0) {
/*     */         break label409;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */       i = 0;
/*     */       
/*     */ 
/*     */       break label534;
/*     */       
/*     */       label409:
/*     */       
/* 171 */       SystemLibrary.printf(96992, new Object[] { Integer.valueOf(paramInt2), Double.valueOf(d1), Double.valueOf(MainMemory.getF64(m)) });
/* 172 */       i = 0;
/*     */       
/*     */ 
/*     */       break label534;
/*     */       
/*     */       label458:
/*     */       
/* 179 */       MainMemory.setI32(paramInt4 + 84, 260);
/* 180 */       MainMemory.setI32(paramInt5 + 80, 82);
/* 181 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */       break label534;
/*     */       
/*     */ 
/* 188 */       SystemLibrary.sprintf(n, 118368, new Object[] { Integer.valueOf(paramInt3) });
/* 189 */       ffxmsg.call(5, n);
/* 190 */       MainMemory.setI32Aligned(470852, 432);
/* 191 */       i = 432;
/*     */       
/*     */ 
/*     */       label534:
/*     */       
/*     */ 
/* 197 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 202 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F307895.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */