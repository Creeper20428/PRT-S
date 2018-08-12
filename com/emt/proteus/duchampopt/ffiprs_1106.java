/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class ffiprs_1106 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new ffiprs_1106();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffiprs_1106() { super("ffiprs_1106", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i, j, k, m, n, i1);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       j = MainMemory.getI32Aligned(470852);
/*  62 */       MainMemory.setI32(paramInt4, j);
/*  63 */       if (j == 0)
/*     */       {
/*  65 */         if (MainMemory.getI32Aligned(470796) == 0)
/*     */         {
/*  67 */           ffxmsg.call(5, 58080);
/*  68 */           MainMemory.setI32(paramInt4, 431);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  75 */           if (MainMemory.getI32Aligned(470816) == 0)
/*     */           {
/*  77 */             MainMemory.setI32Aligned(481888, paramInt6);
/*  78 */             MainMemory.setI32Aligned(470820, 481888);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */           i = MainMemory.getI32Aligned(470792);
/*  90 */           j = MainMemory.getI32Aligned(470804);
/*  91 */           MainMemory.setI32(paramInt2, MainMemory.getI32(i + j * 344 + 56 + 4));
/*  92 */           MainMemory.setI32(paramInt1, MainMemory.getI32(i + j * 344 + 56));
/*  93 */           if (MainMemory.getI32(paramInt2) > 0) {
/*  94 */             k = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/*  98 */               m = k + 1;
/*  99 */               MainMemory.setI32(paramInt3 + (k << 2), MainMemory.getI32(i + j * 344 + 56 + 8 + (k << 2)));
/* 100 */               if ((MainMemory.getI32(paramInt2) <= m) || (m >= 5)) break;
/* 101 */               k = m;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           switch (MainMemory.getI32(i + j * 344 + 52))
/*     */           {
/*     */           case 258: 
/* 119 */             MainMemory.setI32(paramInt5, 14);
/* 120 */             k = 14;
/*     */             
/*     */ 
/*     */ 
/* 124 */             break;
/*     */           
/*     */           case 259: 
/* 127 */             MainMemory.setI32(paramInt5, 41);
/* 128 */             k = 41;
/*     */             
/*     */ 
/*     */ 
/* 132 */             break;
/*     */           
/*     */           case 260: 
/* 135 */             MainMemory.setI32(paramInt5, 82);
/* 136 */             k = 82;
/*     */             
/*     */ 
/*     */ 
/* 140 */             break;
/*     */           
/*     */           case 261: 
/* 143 */             MainMemory.setI32(paramInt5, 16);
/* 144 */             k = 16;
/*     */             
/*     */ 
/*     */ 
/* 148 */             break;
/*     */           
/*     */           case 262: 
/* 151 */             MainMemory.setI32(paramInt5, 1);
/* 152 */             k = 1;
/*     */             
/*     */ 
/*     */ 
/* 156 */             break;
/*     */           
/*     */           default: 
/* 159 */             MainMemory.setI32(paramInt5, 0);
/* 160 */             ffxmsg.call(5, 63680);
/* 161 */             MainMemory.setI32Aligned(470852, 432);
/* 162 */             MainMemory.setI32(paramInt4, 432);
/* 163 */             k = MainMemory.getI32(paramInt5);
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           MainMemory.setI32Aligned(470844, k);
/* 175 */           n = MainMemory.getI32Aligned(470780);
/* 176 */           if (n == 0)
/*     */           {
/* 178 */             com.emt.proteus.runtime.api.SystemLibrary.printf(84064, new Object[] { Integer.valueOf(43520), Integer.valueOf(923) });
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 185 */             free.call(n);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */           if (MainMemory.getI32(i + j * 344) == 64536)
/*     */           {
/* 195 */             MainMemory.setI32(paramInt1, 0 - MainMemory.getI32(paramInt1));
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffiprs_1106.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */