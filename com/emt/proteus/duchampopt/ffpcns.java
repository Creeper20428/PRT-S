/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffpcns
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3552;
/*  16 */   public static final Function _instance = new ffpcns();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffpcns() { super("ffpcns", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramInt5);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     call(i, j, l1, l2, l3, k, m, n);
/*  54 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  60 */     int i = 0;
/*  61 */     int j = 0;
/*  62 */     int k = 0;
/*  63 */     int m = 0;
/*  64 */     long l1 = 0L;
/*  65 */     int n = 0;
/*  66 */     long l2 = 0L;
/*  67 */     long l3 = 0L;
/*  68 */     long l4 = 0L;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*     */     
/*     */ 
/*  73 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  77 */       i = MainMemory.alloc(8);
/*  78 */       j = MainMemory.alloc(8);
/*  79 */       i1 = paramInt3;
/*  80 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         i2 = MainMemory.getI32(paramInt1);
/*  91 */         k = paramInt1 + 4;
/*  92 */         m = MainMemory.getI32(k);
/*  93 */         if (i2 != MainMemory.getI32(m + 64)) {
/*     */           break label173;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label190;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label629;
/*     */         } else {
/*     */           break label190;
/*     */         }
/*     */         
/*     */ 
/*     */         label173:
/*     */         
/* 122 */         ffmahd.call(paramInt1, i2 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label190:
/*     */         
/*     */ 
/* 128 */         ffgtclll.call(paramInt1, paramInt2, 0, i, j, paramInt5);
/* 129 */         if (MainMemory.getI32(paramInt5) > 0) {
/* 130 */           n = 0;
/* 131 */           i2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 141 */           i2 = (int)MainMemory.getI64(i);
/* 142 */           n = (int)MainMemory.getI64(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         if (MainMemory.getI32(MainMemory.getI32(k) + 68) != 2) {
/*     */           break label287;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         i2 /= n;
/*     */         
/*     */ 
/*     */ 
/*     */         label287:
/*     */         
/*     */ 
/*     */ 
/* 171 */         l1 = i2;
/* 172 */         paramLong1 = l1 * (paramLong1 + -1L) + paramLong2;
/* 173 */         paramLong2 = i1 & 0xFFFFFFFF;
/* 174 */         l4 = 0L;
/* 175 */         i1 = 0;
/* 176 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 185 */           n = (int)l4;
/* 186 */           if (l4 >= paramLong3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */           if (SystemLibrary.strcmp(paramInt4, MainMemory.getI32((int)(paramLong2 + (l4 << 2)))) != 0) {
/*     */             break label489;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */           if (i1 != 0)
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
/* 217 */             n -= i1;
/* 218 */             l2 = n + paramLong1;
/* 219 */             l3 = (l2 + -1L) / l1;
/* 220 */             if (ffpcls.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, i1, paramInt3 + (n << 2), paramInt5) > 0) {
/*     */               break label629;
/*     */             } else {
/* 223 */               i1 = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */           i2 += 1;
/*     */           
/*     */ 
/*     */           break label577;
/*     */           
/*     */           label489:
/*     */           
/* 239 */           if (i2 != 0)
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
/* 250 */             l2 = n - i2 + paramLong1;
/* 251 */             l3 = (l2 + -1L) / l1;
/* 252 */             if (ffpclu.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, i2, paramInt5) > 0) {
/*     */               break label629;
/*     */             } else {
/* 255 */               i2 = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */           i1 += 1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label577:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 274 */           l4 += 1L;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */         if (i1 != 0) {
/*     */           break label690;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */         if (i2 != 0) {
/*     */           break label639;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label629:
/*     */       
/*     */ 
/*     */       break label747;
/*     */       
/*     */ 
/*     */       label639:
/*     */       
/*     */ 
/* 308 */       paramLong1 = n - i2 + paramLong1;
/* 309 */       paramLong2 = (paramLong1 + -1L) / l1;
/* 310 */       ffpclu.call(paramInt1, paramInt2, paramLong2 + 1L, paramLong1 - paramLong2 * l1, i2, paramInt5);
/*     */       
/*     */ 
/*     */       break label747;
/*     */       
/*     */       label690:
/*     */       
/* 317 */       i2 = n - i1;
/* 318 */       paramLong1 = i2 + paramLong1;
/* 319 */       paramLong2 = (paramLong1 + -1L) / l1;
/* 320 */       ffpcls.call(paramInt1, paramInt2, paramLong2 + 1L, paramLong1 - paramLong2 * l1, i1, paramInt3 + (i2 << 2), paramInt5);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label747:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */