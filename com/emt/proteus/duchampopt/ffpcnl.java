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
/*     */ public final class ffpcnl
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3550;
/*  15 */   public static final Function _instance = new ffpcnl();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpcnl() { super("ffpcnl", 8, false); }
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
/*  62 */     int m = 0;
/*  63 */     long l1 = 0L;
/*  64 */     long l2 = 0L;
/*  65 */     long l3 = 0L;
/*  66 */     long l4 = 0L;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  74 */       i = paramInt3;
/*  75 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         n = MainMemory.getI32(paramInt1);
/*  86 */         j = paramInt1 + 4;
/*  87 */         k = MainMemory.getI32(j);
/*  88 */         if (n != MainMemory.getI32(k + 64)) {
/*     */           break label151;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (MainMemory.getI64(k + 112) != -1L) {
/*     */           break label168;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         if (ffrdef.call(paramInt1, paramInt4) > 0) {
/*     */           break label522;
/*     */         } else {
/*     */           break label168;
/*     */         }
/*     */         
/*     */ 
/*     */         label151:
/*     */         
/* 117 */         ffmahd.call(paramInt1, n + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label168:
/*     */         
/*     */ 
/* 123 */         m = MainMemory.getI32(MainMemory.getI32(j) + 944);
/* 124 */         n = paramInt2 + -1;
/* 125 */         if (MainMemory.getI32(m + n * 152 + 80) <= 0) {
/*     */           break label245;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         l1 = MainMemory.getI64(m + n * 152 + 84);
/*     */         
/*     */         break label261;
/*     */         
/*     */         label245:
/*     */         
/* 141 */         l1 = paramLong2 + -1L + paramLong3;
/*     */         
/*     */ 
/*     */ 
/*     */         label261:
/*     */         
/*     */ 
/*     */ 
/* 149 */         if (ffpcll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           paramLong1 = l1 * (paramLong1 + -1L) + paramLong2;
/* 160 */           paramLong2 = i & 0xFFFFFFFF;
/* 161 */           l4 = 0L;
/* 162 */           i = 0;
/* 163 */           n = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 172 */             i1 = (int)l4;
/* 173 */             if (l4 >= paramLong3) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */             if (MainMemory.getI8((int)(paramLong2 + l4)) != paramByte) {
/*     */               break label395;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */             n += 1;
/* 194 */             i = 0;
/*     */             
/*     */             break label483;
/*     */             
/*     */             label395:
/*     */             
/* 200 */             if (n != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */               l2 = i1 - n + paramLong1;
/* 212 */               l3 = (l2 + -1L) / l1;
/* 213 */               if (ffpclu.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, n, paramInt4) > 0) {
/*     */                 break label522;
/*     */               } else {
/* 216 */                 n = 0;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */             i += 1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label483:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 235 */             l4 += 1L;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */           if ((i == 0) && (n != 0)) {
/*     */             break label532;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label522:
/*     */       
/*     */ 
/*     */       break label578;
/*     */       
/*     */ 
/*     */       label532:
/*     */       
/*     */ 
/* 259 */       paramLong1 = i1 - n + paramLong1;
/* 260 */       paramLong2 = (paramLong1 + -1L) / l1;
/* 261 */       ffpclu.call(paramInt1, paramInt2, paramLong2 + 1L, paramLong1 - paramLong2 * l1, n, paramInt4);
/*     */       
/*     */ 
/*     */       label578:
/*     */       
/*     */ 
/* 267 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcnl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */