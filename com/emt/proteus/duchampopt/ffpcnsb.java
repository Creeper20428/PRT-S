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
/*     */ public final class ffpcnsb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3557;
/*  15 */   public static final Function _instance = new ffpcnsb();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpcnsb() { super("ffpcnsb", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, byte paramByte, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramByte, paramInt4);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     call(i, j, l1, l2, l3, k, b, m);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, byte paramByte, int paramInt4)
/*     */   {
/*  59 */     int i = 0;
/*  60 */     int j = 0;
/*  61 */     int k = 0;
/*  62 */     boolean bool = false;
/*  63 */     long l1 = 0L;
/*  64 */     long l2 = 0L;
/*  65 */     long l3 = 0L;
/*  66 */     long l4 = 0L;
/*  67 */     int m = 0;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       i1 = paramInt3;
/*  78 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         m = MainMemory.getI32(paramInt1);
/*  89 */         i = paramInt1 + 4;
/*  90 */         j = MainMemory.getI32(i);
/*  91 */         if (m != MainMemory.getI32(j + 64)) {
/*     */           break label160;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         if (MainMemory.getI64(j + 112) != -1L) {
/*     */           break label177;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         if (ffrdef.call(paramInt1, paramInt4) > 0) {
/*     */           break label819;
/*     */         } else {
/*     */           break label177;
/*     */         }
/*     */         
/*     */ 
/*     */         label160:
/*     */         
/* 120 */         ffmahd.call(paramInt1, m + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label177:
/*     */         
/*     */ 
/* 126 */         k = MainMemory.getI32(MainMemory.getI32(i) + 944);
/* 127 */         n = paramInt2 + -1;
/* 128 */         m = MainMemory.getI32(k + n * 152 + 80);
/* 129 */         bool = m > 0;
/* 130 */         if (!bool) {
/*     */           break label270;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         l1 = MainMemory.getI64(k + n * 152 + 84);
/*     */         
/*     */         break label286;
/*     */         
/*     */         label270:
/*     */         
/* 146 */         l1 = paramLong2 + -1L + paramLong3;
/*     */         
/*     */ 
/*     */ 
/*     */         label286:
/*     */         
/*     */ 
/*     */ 
/* 154 */         if (m >= 0) {
/*     */           break label369;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         if (ffpclsb.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4) <= 0) {
/*     */           break label369;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */         if (MainMemory.getI32(paramInt4) != 412) {
/*     */           break label819;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         MainMemory.setI32(paramInt4, 0);
/*     */         
/*     */ 
/*     */         label369:
/*     */         
/*     */ 
/* 190 */         paramLong1 = l1 * (paramLong1 + -1L) + paramLong2;
/* 191 */         paramLong2 = i1 & 0xFFFFFFFF;
/* 192 */         l4 = 0L;
/* 193 */         m = 0;
/* 194 */         n = 0;
/* 195 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 205 */           i2 = (int)l4;
/* 206 */           i3 = (int)(paramLong2 + l4);
/* 207 */           if (l4 >= paramLong3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */           if (MainMemory.getI8(i3) != paramByte) {
/*     */             break label624;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */           if (m != 0)
/*     */           {
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
/* 239 */             l2 = i2 - m + paramLong1;
/* 240 */             l3 = (l2 + -1L) / l1;
/* 241 */             if (!bool)
/*     */             {
/*     */ 
/*     */ 
/* 245 */               m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 253 */             else if (ffpclsb.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, m, i3 - m, paramInt4) <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 257 */               m = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 265 */               if (MainMemory.getI32(paramInt4) != 412) {
/*     */                 break label819;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */               MainMemory.setI32(paramInt4, 0);
/* 276 */               m = 0;
/* 277 */               i1 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */           n += 1;
/*     */           
/*     */ 
/*     */           break label712;
/*     */           
/*     */ 
/*     */           label624:
/*     */           
/* 293 */           if (n != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */             l2 = i2 - n + paramLong1;
/* 305 */             l3 = (l2 + -1L) / l1;
/* 306 */             if (ffpclu.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, n, paramInt4) > 0) {
/*     */               break label819;
/*     */             } else {
/* 309 */               n = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 318 */           m += 1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label712:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */           l4 += 1L;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */         if (m != 0) {
/*     */           break label770;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */         ffpcnsb_1359.call(i2, paramInt1, paramInt2, paramLong1, l1, paramInt4, n);
/*     */         
/*     */         break label793;
/*     */         
/*     */         label770:
/* 354 */         ffpcnsb_1360.call(i2, bool, paramInt1, paramInt2, paramLong1, m, paramInt4, l1, paramInt3);
/*     */         
/*     */ 
/*     */         label793:
/*     */         
/*     */ 
/* 360 */         if ((MainMemory.getI32(paramInt4) <= 0) && (i1 != 0)) {
/*     */           break label829;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label819:
/*     */       
/*     */ 
/*     */       break label842;
/*     */       
/*     */ 
/*     */       label829:
/*     */       
/*     */ 
/* 376 */       MainMemory.setI32(paramInt4, 412);
/*     */       
/*     */ 
/*     */       label842:
/*     */       
/*     */ 
/* 382 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcnsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */