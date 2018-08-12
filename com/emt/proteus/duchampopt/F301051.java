/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class F301051 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3182;
/*  14 */   public static final Function _instance = new F301051();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F301051() { super("F301051", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     call(paramInt);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       i = paramInt + 52;
/*  51 */       i3 = MainMemory.getI32(i);
/*  52 */       if (!com.emt.proteus.lib.api.MathUtils.ult(i3 + 65275, 2)) {
/*     */         break label402;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  62 */       i2 = malloc.call(MainMemory.getI32Aligned(470812) << 2);
/*  63 */       j = i2;
/*  64 */       k = paramInt + 88;
/*  65 */       MainMemory.setI32(k, j);
/*  66 */       if (i2 != 0) {
/*     */         break label118;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       MainMemory.setI32Aligned(470852, 113);
/*     */       
/*     */ 
/*     */       break label589;
/*     */       
/*     */       label118:
/*     */       
/*  83 */       i1 = MainMemory.getI32Aligned(470812);
/*  84 */       m = paramInt + 56;
/*  85 */       n = MainMemory.getI32(m);
/*  86 */       i2 = malloc.call((n + 2) * i1);
/*  87 */       MainMemory.setI32(j, i2);
/*  88 */       if (i2 != 0) {
/*     */         break label198;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */       MainMemory.setI32Aligned(470852, 113);
/*  99 */       free.call(MainMemory.getI32(k));
/*     */       
/*     */ 
/*     */       break label589;
/*     */       
/*     */       label198:
/*     */       
/* 106 */       if (i1 > 1) {
/* 107 */         i1 = n;
/*     */         
/*     */ 
/* 110 */         n = 0;
/*     */       }
/*     */       else
/*     */       {
/* 114 */         i1 = i3;
/* 115 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         break label326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 126 */         i3 = n + 1;
/* 127 */         MainMemory.setI32(j + (i3 << 2), i2 + (i1 + 1));
/* 128 */         if (n + 2 >= MainMemory.getI32Aligned(470812)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         j = MainMemory.getI32(k);
/* 139 */         i2 = MainMemory.getI32(j + (i3 << 2));
/* 140 */         i1 = MainMemory.getI32(m);
/*     */         
/*     */ 
/*     */ 
/* 144 */         n = i3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 149 */       i1 = MainMemory.getI32(i);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label326:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 159 */       if (i1 != 261) {
/*     */         break label384;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */       MainMemory.setI32(paramInt + 84, MainMemory.getI32(MainMemory.getI32(k) + (i3 << 2)) + (MainMemory.getI32(m) + 1));
/*     */       
/*     */ 
/*     */       break label589;
/*     */       
/*     */       label384:
/*     */       
/* 176 */       MainMemory.setI32(paramInt + 84, 0);
/*     */       
/*     */ 
/*     */       break label589;
/*     */       
/*     */       label402:
/*     */       
/* 183 */       i1 = MainMemory.getI32Aligned(470812) * MainMemory.getI32(paramInt + 56);
/* 184 */       switch (i3) {
/*     */       case 258: 
/*     */         break label493;
/*     */         break;
/*     */       case 259:  break; case 260:  i3 = 8;
/*     */         
/*     */ 
/*     */         break label514;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 197 */       i3 = 4;
/*     */       
/*     */       break label514;
/*     */       
/*     */       label493:
/* 202 */       i3 = 1;
/*     */       
/*     */ 
/*     */       break label514;
/*     */       
/* 207 */       i3 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label514:
/*     */       
/*     */ 
/* 214 */       i2 = com.emt.proteus.runtime.library.c.calloc.call(i3 + 1, i1);
/* 215 */       MainMemory.setI32(paramInt + 88, i2);
/* 216 */       if (i2 != 0) {
/*     */         break label569;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */       MainMemory.setI32Aligned(470852, 113);
/*     */       
/*     */ 
/*     */       break label589;
/*     */       
/*     */       label569:
/*     */       
/* 233 */       MainMemory.setI32(paramInt + 84, i2 + i3 * i1);
/*     */       
/*     */ 
/*     */       label589:
/*     */       
/*     */ 
/* 239 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F301051.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */