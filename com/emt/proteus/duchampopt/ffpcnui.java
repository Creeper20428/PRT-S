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
/*     */ public final class ffpcnui
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3565;
/*  15 */   public static final Function _instance = new ffpcnui();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpcnui() { super("ffpcnui", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, short paramShort, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramShort, paramInt4);
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
/*  46 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     call(i, j, l1, l2, l3, k, s, m);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, short paramShort, int paramInt4)
/*     */   {
/*  59 */     int i = 0;
/*  60 */     int j = 0;
/*  61 */     int k = 0;
/*  62 */     boolean bool = false;
/*  63 */     long l1 = 0L;
/*  64 */     int m = 0;
/*  65 */     long l2 = 0L;
/*  66 */     long l3 = 0L;
/*  67 */     long l4 = 0L;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       i2 = paramInt3;
/*  77 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         n = MainMemory.getI32(paramInt1);
/*  88 */         i = paramInt1 + 4;
/*  89 */         j = MainMemory.getI32(i);
/*  90 */         if (n != MainMemory.getI32(j + 64)) {
/*     */           break label157;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (MainMemory.getI64(j + 112) != -1L) {
/*     */           break label174;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         if (ffrdef.call(paramInt1, paramInt4) > 0) {
/*     */           break label820;
/*     */         } else {
/*     */           break label174;
/*     */         }
/*     */         
/*     */ 
/*     */         label157:
/*     */         
/* 119 */         ffmahd.call(paramInt1, n + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label174:
/*     */         
/*     */ 
/* 125 */         k = MainMemory.getI32(MainMemory.getI32(i) + 944);
/* 126 */         i1 = paramInt2 + -1;
/* 127 */         n = MainMemory.getI32(k + i1 * 152 + 80);
/* 128 */         bool = n > 0;
/* 129 */         if (!bool) {
/*     */           break label267;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         l1 = MainMemory.getI64(k + i1 * 152 + 84);
/*     */         
/*     */         break label283;
/*     */         
/*     */         label267:
/*     */         
/* 145 */         l1 = paramLong2 + -1L + paramLong3;
/*     */         
/*     */ 
/*     */ 
/*     */         label283:
/*     */         
/*     */ 
/*     */ 
/* 153 */         if (n >= 0) {
/*     */           break label366;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         if (ffpclui.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4) <= 0) {
/*     */           break label366;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */         if (MainMemory.getI32(paramInt4) != 412) {
/*     */           break label820;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */         MainMemory.setI32(paramInt4, 0);
/*     */         
/*     */ 
/*     */         label366:
/*     */         
/*     */ 
/* 189 */         paramLong1 = l1 * (paramLong1 + -1L) + paramLong2;
/* 190 */         paramLong2 = i2 & 0xFFFFFFFF;
/* 191 */         l4 = 0L;
/* 192 */         n = 0;
/* 193 */         i1 = 0;
/* 194 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 204 */           m = (int)l4;
/* 205 */           if (l4 >= paramLong3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */           if (MainMemory.getI16((int)(paramLong2 + (l4 << 1))) != paramShort) {
/*     */             break label625;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */           if (n != 0)
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
/* 237 */             m -= n;
/* 238 */             l2 = m + paramLong1;
/* 239 */             l3 = (l2 + -1L) / l1;
/* 240 */             if (!bool)
/*     */             {
/*     */ 
/*     */ 
/* 244 */               n = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 252 */             else if (ffpclui.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, n, paramInt3 + (m << 1), paramInt4) <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 256 */               n = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 264 */               if (MainMemory.getI32(paramInt4) != 412) {
/*     */                 break label820;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */               MainMemory.setI32(paramInt4, 0);
/* 275 */               n = 0;
/* 276 */               i2 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */           i1 += 1;
/*     */           
/*     */ 
/*     */           break label713;
/*     */           
/*     */ 
/*     */           label625:
/*     */           
/* 292 */           if (i1 != 0)
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
/* 303 */             l2 = m - i1 + paramLong1;
/* 304 */             l3 = (l2 + -1L) / l1;
/* 305 */             if (ffpclu.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, i1, paramInt4) > 0) {
/*     */               break label820;
/*     */             } else {
/* 308 */               i1 = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */           n += 1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label713:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */           l4 += 1L;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */         if (n != 0) {
/*     */           break label771;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */         ffpcnui_1362.call(paramInt1, paramLong1, l1, i1, paramInt4, m, paramInt2);
/*     */         
/*     */         break label794;
/*     */         
/*     */         label771:
/* 353 */         ffpcnui_1361.call(paramInt1, bool, l1, paramLong1, paramInt3, paramInt4, n, m, paramInt2);
/*     */         
/*     */ 
/*     */         label794:
/*     */         
/*     */ 
/* 359 */         if ((MainMemory.getI32(paramInt4) <= 0) && (i2 != 0)) {
/*     */           break label830;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label820:
/*     */       
/*     */ 
/*     */       break label843;
/*     */       
/*     */ 
/*     */       label830:
/*     */       
/*     */ 
/* 375 */       MainMemory.setI32(paramInt4, 412);
/*     */       
/*     */ 
/*     */       label843:
/*     */       
/*     */ 
/* 381 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcnui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */