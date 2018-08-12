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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffsrow_1423
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  20 */   public static final Function _instance = new ffsrow_1423();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffsrow_1423() { super("ffsrow_1423", 12, false); }
/*     */   
/*     */   public int execute(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong3, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  27 */     call(paramLong1, paramLong2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramLong3, paramInt7, paramInt8, paramInt9);
/*  28 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     call(l1, l2, i, j, k, m, n, i1, l3, i2, i3, i4);
/*  70 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong3, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  76 */     long l1 = 0L;
/*  77 */     long l2 = 0L;
/*  78 */     long l3 = 0L;
/*  79 */     long l4 = 0L;
/*  80 */     int i = 0;
/*  81 */     int j = 0;
/*  82 */     int k = 0;
/*  83 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  89 */       if ((paramLong1 != 0L) && (paramInt3 != 0))
/*     */       {
/*  91 */         m = MainMemory.getI32(paramInt9);
/*  92 */         i = MainMemory.getI32(paramInt4);
/*  93 */         if (m != MainMemory.getI32(i + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */           ffmahd.call(paramInt9, m + 1, 0, paramInt1);
/* 100 */           i = MainMemory.getI32(paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         l1 = MainMemory.getI64(i + 112);
/* 111 */         l2 = MainMemory.getI64(i + 948);
/* 112 */         l3 = l2 + paramLong3;
/* 113 */         l4 = l3 + 2879L;
/* 114 */         l3 = (int)(l4 - l4 % 2880L) - (int)l3;
/* 115 */         if (l3 - paramLong1 < 0L)
/*     */         {
/* 117 */           ffiblk.call(paramInt9, (int)((paramLong1 + 2879L - l3) / 2880L), 1, paramInt1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         l3 = paramLong3 + paramLong1;
/* 129 */         m = MainMemory.getI32(paramInt1);
/* 130 */         if (m <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 135 */           if (ffmkyj.call(paramInt9, 34560, l3, 0, paramInt1) == 202)
/*     */           {
/* 137 */             MainMemory.setI32(paramInt1, m);
/* 138 */             ffpkyj.call(paramInt9, 34560, l3, 0, paramInt1);
/*     */           }
/*     */         }
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
/* 153 */         m = MainMemory.getI32(paramInt6);
/* 154 */         i = MainMemory.getI32(paramInt5);
/* 155 */         if (m != MainMemory.getI32(i + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           ffmahd.call(paramInt6, m + 1, 0, paramInt1);
/* 162 */           i = MainMemory.getI32(paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */         l3 = MainMemory.getI64(i + 948) + MainMemory.getI64(i + 112);
/* 173 */         l2 = l1 + paramLong3 + l2;
/*     */         
/* 175 */         l1 = l3;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         while (paramLong1 != 0L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 187 */           if (MainMemory.getI32(paramInt1) != 0)
/*     */             break;
/* 189 */           j = paramLong1 > 500000L ? 1 : 0;
/* 190 */           ffmbyt.call(paramInt6, l1, 0, paramInt1);
/* 191 */           l3 = j != 0 ? 500000L : paramLong1 << 32 >> 32;
/* 192 */           ffgbyt.call(paramInt6, l3, paramInt7, paramInt1);
/* 193 */           ffmbyt.call(paramInt9, l2, 1, paramInt1);
/* 194 */           ffpbyt.call(paramInt9, l3, paramInt7, paramInt1);
/* 195 */           l1 = l3 + l1;
/* 196 */           l2 = l3 + l2;
/* 197 */           paramLong1 -= l3;
/*     */         }
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
/*     */ 
/*     */ 
/*     */ 
/* 214 */         if (paramLong3 != 0L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 219 */           i = MainMemory.getI32(paramInt4);
/* 220 */           if (MainMemory.getI32(i + 916) >= 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 225 */             paramLong1 = paramLong2 + 1L;
/* 226 */             l1 = paramInt3 + paramLong2;
/* 227 */             j = l1 < paramLong1 ? 1 : 0;
/* 228 */             paramLong2 += 2L;
/*     */             
/* 230 */             k = 0;
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 235 */               paramInt3 = k + 2;
/* 236 */               m = k + 1;
/* 237 */               if ((MainMemory.getI32(MainMemory.getI32(i + 944) + k * 152 + 80) <= -1) && (j == 0))
/*     */               {
/*     */ 
/*     */ 
/* 241 */                 l2 = 0L;
/*     */                 
/*     */                 for (;;)
/*     */                 {
/* 245 */                   l3 = paramLong1 + l2;
/* 246 */                   ffgdesll.call(paramInt9, m, l3, paramInt2, paramInt8, paramInt1);
/* 247 */                   l4 = MainMemory.getI64(paramInt8) + paramLong3;
/* 248 */                   MainMemory.setI64(paramInt8, l4);
/* 249 */                   ffpdes.call(paramInt9, m, l3, MainMemory.getI64(paramInt2), l4, paramInt1);
/* 250 */                   l3 = l2 + 1L;
/* 251 */                   if (l1 < paramLong2 + l2) {
/*     */                     break;
/*     */                   }
/*     */                   
/* 255 */                   l2 = l3;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */               i = MainMemory.getI32(paramInt4);
/* 265 */               if (MainMemory.getI32(i + 916) < paramInt3) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 270 */               k = m;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffsrow_1423.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */