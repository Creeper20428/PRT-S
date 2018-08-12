/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgttb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3409;
/*  15 */   public static final Function _instance = new ffgttb();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgttb() { super("ffgttb", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = call(i, j, k, m, n, i1);
/*  46 */     paramFrame.setI32(paramInt1, i2);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       j = MainMemory.getI32(paramInt6);
/*  61 */       if (j <= 0) {
/*     */         break label45;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */       i = j;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label45:
/*     */       
/*  78 */       if (fftkyn.call(paramInt1, 2, 28224, 13824, paramInt6) != 208) {
/*     */         break label100;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       MainMemory.setI32(paramInt6, 222);
/*  89 */       i = 222;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label100:
/*     */       
/*  96 */       if (MainMemory.getI32(paramInt6) != 209) {
/*     */         break label147;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       MainMemory.setI32(paramInt6, 211);
/* 107 */       i = 211;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label147:
/*     */       
/* 114 */       if (fftkyn.call(paramInt1, 3, 24224, 13856, paramInt6) != 208) {
/*     */         break label202;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       MainMemory.setI32(paramInt6, 223);
/* 125 */       i = 223;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label202:
/*     */       
/* 132 */       if (MainMemory.getI32(paramInt6) != 209) {
/*     */         break label249;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */       MainMemory.setI32(paramInt6, 212);
/* 143 */       i = 212;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label249:
/*     */       
/* 150 */       if (ffgtknjj.call(paramInt1, 4, 36000, paramInt2, paramInt6) != 208) {
/*     */         break label301;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */       MainMemory.setI32(paramInt6, 224);
/* 161 */       i = 224;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label301:
/*     */       
/* 168 */       j = MainMemory.getI32(paramInt6);
/* 169 */       if (j != 209) {
/*     */         break label354;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */       i = j == 213 ? 1 : 0;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label354:
/*     */       
/* 186 */       if (ffgtknjj.call(paramInt1, 5, 35712, paramInt3, paramInt6) != 208) {
/*     */         break label406;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */       MainMemory.setI32(paramInt6, 224);
/* 197 */       i = 224;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label406:
/*     */       
/* 204 */       j = MainMemory.getI32(paramInt6);
/* 205 */       if (j != 209) {
/*     */         break label459;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */       i = j == 213 ? 1 : 0;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label459:
/*     */       
/* 222 */       if (ffgtknjj.call(paramInt1, 6, 34560, paramInt4, paramInt6) != 208) {
/*     */         break label512;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */       MainMemory.setI32(paramInt6, 228);
/* 233 */       i = 228;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label512:
/*     */       
/* 240 */       if (MainMemory.getI32(paramInt6) != 209) {
/*     */         break label559;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */       MainMemory.setI32(paramInt6, 214);
/* 251 */       i = 214;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label559:
/*     */       
/* 258 */       if (fftkyn.call(paramInt1, 7, 34592, 13440, paramInt6) != 208) {
/*     */         break label614;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */       MainMemory.setI32(paramInt6, 229);
/* 269 */       i = 229;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label614:
/*     */       
/* 276 */       if (MainMemory.getI32(paramInt6) != 209) {
/*     */         break label661;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */       MainMemory.setI32(paramInt6, 215);
/* 287 */       i = 215;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label661:
/*     */       
/* 294 */       if (ffgtkn.call(paramInt1, 8, 41248, paramInt5, paramInt6) != 208) {
/*     */         break label715;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */       MainMemory.setI32(paramInt6, 230);
/* 305 */       i = 230;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label715:
/*     */       
/* 312 */       j = MainMemory.getI32(paramInt6);
/* 313 */       if (j != 209)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */         if (MainMemory.getI32(paramInt5) <= 999) {
/*     */           break label789;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */       i = j == 216 ? 1 : 0;
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label789:
/*     */       
/* 340 */       if (j <= 0) {
/*     */         break label830;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 350 */       ffxmsg.call(5, 132000);
/* 351 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */       break label839;
/*     */       
/*     */       label830:
/*     */       
/* 358 */       i = j;
/*     */       
/*     */ 
/*     */       label839:
/*     */       
/*     */ 
/* 364 */       int k = i; return k;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgttb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */