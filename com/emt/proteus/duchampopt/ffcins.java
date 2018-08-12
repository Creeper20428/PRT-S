/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffcins extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3145;
/*  13 */   public static final Function _instance = new ffcins();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffcins() { super("ffcins", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt2)
/*     */   {
/*  20 */     call(paramInt1, paramLong1, paramLong2, paramLong3, paramLong4, paramInt2);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i, l1, l2, l3, l4, j);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt2)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     byte b = 0;
/*  55 */     long l1 = 0L;
/*  56 */     long l2 = 0L;
/*  57 */     long l3 = 0L;
/*  58 */     long l4 = 0L;
/*  59 */     long l5 = 0L;
/*  60 */     long l6 = 0L;
/*  61 */     long l7 = 0L;
/*  62 */     long l8 = 0L;
/*  63 */     long l9 = 0L;
/*     */     
/*     */ 
/*  66 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(10000);
/*  71 */       j = i;
/*  72 */       if ((MainMemory.getI32(paramInt2) > 0) || (paramLong2 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         k = paramInt1 + 4;
/*  83 */         b = MainMemory.getI32(MainMemory.getI32(k) + 68) == 1 ? 32 : 0;
/*  84 */         l1 = paramLong3 + paramLong1;
/*  85 */         if (l1 >= 10001L) {
/*     */           break label244;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         if (paramLong3 <= 0L) {
/*     */           break label211;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         l2 = j & 0xFFFFFFFF;
/* 106 */         l4 = 0L;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 113 */           MainMemory.setI8((int)(l2 + l4), b);
/* 114 */           l4 += 1L;
/* 115 */           if (l4 == paramLong3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label211:
/*     */         
/*     */ 
/*     */ 
/* 126 */         ffcins_554.call(paramLong1, paramInt2, k, paramLong2, l1, paramInt1, paramLong3, paramLong4, i);
/*     */       }
/*     */       else
/*     */       {
/*     */         break label637;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label244:
/*     */       
/*     */ 
/* 138 */       l2 = paramLong1 + 9999L;
/* 139 */       l5 = l2 - paramLong4;
/* 140 */       l4 = l5 / 10000L;
/* 141 */       if (l5 <= 9999L) {
/*     */         break label462;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       l6 = l4 * 10000L;
/* 152 */       l3 = paramLong1 + 1L - (paramLong4 + -9999L + l6);
/* 153 */       l4 = l4 > 1L ? l4 : 1L;
/* 154 */       l5 = l6 + paramLong4 + -9999L;
/* 155 */       l6 = paramLong4 + paramLong3 + l6 + -9999L;
/* 156 */       l7 = 0L;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 165 */         l8 = l7 * -10000L;
/* 166 */         l9 = l6 + l8;
/* 167 */         ffgtbb.call(paramInt1, paramLong2, l5 + l8, l3, i, paramInt2);
/* 168 */         MainMemory.setI64(MainMemory.getI32(k) + 936, l1);
/* 169 */         ffptbb.call(paramInt1, paramLong2, l9, l3, i, paramInt2);
/* 170 */         MainMemory.setI64(MainMemory.getI32(k) + 936, paramLong1);
/* 171 */         l7 += 1L;
/* 172 */         if (l7 == l4) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/* 177 */         l3 = 10000L;
/*     */       }
/*     */       
/*     */ 
/*     */       label462:
/*     */       
/*     */ 
/* 184 */       l4 = l2 / 10000L;
/* 185 */       l5 = paramLong2 + -1L;
/* 186 */       if (l5 <= 0L) {
/*     */         break label525;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */       ffcins_552.call(paramLong1, l4, paramInt2, k, l2, l1, paramInt1, paramLong3, paramLong4, l5, i);
/*     */       
/*     */ 
/*     */       label525:
/*     */       
/*     */ 
/* 202 */       SystemLibrary.memset(i, b, paramLong3 > 10000L ? 10000 : (int)paramLong3, 1);
/* 203 */       l2 = paramLong3 + 9999L;
/* 204 */       l4 = l2 / 10000L;
/* 205 */       MainMemory.setI64(MainMemory.getI32(k) + 936, l1);
/* 206 */       if (paramLong2 >= 1L)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */         ffcins_551.call(l2, paramInt2, l4, paramLong2, paramInt1, paramLong3, paramLong4, i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 222 */       MainMemory.setI64(MainMemory.getI32(k) + 936, paramLong1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label637:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcins.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */