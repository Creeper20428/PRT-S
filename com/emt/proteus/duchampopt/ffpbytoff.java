/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffpbytoff extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2976;
/*  13 */   public static final Function _instance = new ffpbytoff();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffpbytoff() { super("ffpbytoff", 6, false); }
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
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     int i6 = 0;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       if (MainMemory.getI32(paramInt6) <= 0) {
/*     */         break label76;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label974;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label76:
/*     */       
/*     */ 
/*     */ 
/*  87 */       m = MainMemory.getI32(paramInt1);
/*  88 */       i = paramInt1 + 4;
/*  89 */       i7 = MainMemory.getI32(i);
/*  90 */       if (m != MainMemory.getI32(i7 + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         ffmahd.call(paramInt1, m + 1, 0, paramInt6);
/* 102 */         i7 = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       m = MainMemory.getI32(i7 + 60);
/* 111 */       if (m >= 0)
/*     */       {
/*     */ 
/*     */ 
/* 115 */         i8 = m;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 123 */         ffldrc.call(paramInt1, (int)(MainMemory.getI64(i7 + 44) / 2880L), 0, paramInt6);
/* 124 */         i7 = MainMemory.getI32(i);
/* 125 */         m = MainMemory.getI32(i7 + 60);
/* 126 */         i8 = m;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */       j = MainMemory.getI32(i7 + 1216 + (i8 << 2));
/* 136 */       m = (int)MainMemory.getI64(i7 + 44) - j * 2880;
/* 137 */       i9 = 2880 - m;
/* 138 */       i5 = MainMemory.getI32(i7 + 1212) + (m + i8 * 2880);
/* 139 */       k = paramInt3 > 1 ? 1 : 0;
/* 140 */       i4 = i9 <= paramInt2 ? i9 : paramInt2;
/* 141 */       SystemLibrary.memcpy(i5, paramInt5, i4, 1);
/* 142 */       i3 = paramInt5 + i4;
/* 143 */       i2 = i4 < paramInt2 ? 1 : 0;
/* 144 */       if (k == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 149 */         paramInt5 = i3;
/* 150 */         m = i4;
/* 151 */         n = j;
/* 152 */         i1 = i8;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 159 */         m = 2880 - paramInt4;
/* 160 */         n = paramInt3 + -1;
/* 161 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */         i6 = j;
/* 168 */         j = i9;
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
/*     */         for (;;)
/*     */         {
/* 184 */           if (i2 == 0) {
/*     */             break label545;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */           MainMemory.setI32(MainMemory.getI32(i) + 1376 + (i8 << 2), 1);
/* 195 */           i8 = i6 + 1;
/* 196 */           ffldrc.call(paramInt1, i8, 1, paramInt6);
/* 197 */           i7 = MainMemory.getI32(i);
/* 198 */           j = MainMemory.getI32(i7 + 60);
/* 199 */           i5 = MainMemory.getI32(i7 + 1212);
/* 200 */           i9 = j * 2880;
/* 201 */           i4 = paramInt2 - i4;
/* 202 */           SystemLibrary.memcpy(i5 + i9, i3, i4, 1);
/* 203 */           paramInt5 += paramInt2;
/* 204 */           i3 = i5 + (i4 + paramInt4 + i9);
/* 205 */           i4 = m - i4;
/*     */           
/*     */ 
/* 208 */           i9 = i8;
/*     */           
/*     */ 
/*     */           break label584;
/*     */           
/*     */           label545:
/*     */           
/* 215 */           i5 += i4 + paramInt4;
/* 216 */           i4 = j - paramInt4 - i4;
/* 217 */           j = i8;
/*     */           
/* 219 */           i9 = i6;
/* 220 */           paramInt5 = i3;
/* 221 */           i3 = i5;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label584:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 232 */           if (i4 >= 1)
/*     */           {
/*     */ 
/*     */ 
/* 236 */             i8 = j;
/* 237 */             j = i4;
/*     */             
/* 239 */             i5 = i3;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 246 */             MainMemory.setI32(MainMemory.getI32(i) + 1376 + (j << 2), 1);
/* 247 */             i9 = (2880 - i4) / 2880 + i9;
/* 248 */             ffldrc.call(paramInt1, i9, 1, paramInt6);
/* 249 */             i7 = MainMemory.getI32(i);
/* 250 */             i8 = MainMemory.getI32(i7 + 60);
/* 251 */             j = (0 - i4) % 2880;
/* 252 */             i4 = 2880 - j;
/* 253 */             i3 = MainMemory.getI32(i7 + 1212) + (i8 * 2880 + j);
/*     */             
/* 255 */             j = i4;
/*     */             
/* 257 */             i5 = i3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */           i4 = j <= paramInt2 ? j : paramInt2;
/* 268 */           SystemLibrary.memcpy(i5, paramInt5, i4, 1);
/* 269 */           i3 = paramInt5 + i4;
/* 270 */           i2 = i4 < paramInt2 ? 1 : 0;
/* 271 */           i1 += 1;
/* 272 */           if (i1 == n)
/*     */           {
/* 274 */             paramInt5 = i3;
/* 275 */             m = i4;
/* 276 */             n = i9;
/* 277 */             i1 = i8; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */           i6 = i9;
/*     */         }
/*     */       }
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
/* 301 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/* 305 */         m = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 312 */         MainMemory.setI32(MainMemory.getI32(i) + 1376 + (i1 << 2), 1);
/* 313 */         ffldrc.call(paramInt1, n + 1, 1, paramInt6);
/* 314 */         i7 = MainMemory.getI32(i);
/* 315 */         n = MainMemory.getI32(i7 + 60);
/* 316 */         SystemLibrary.memcpy(MainMemory.getI32(i7 + 1212) + n * 2880, paramInt5, paramInt2 - m, 1);
/* 317 */         m = n;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */       MainMemory.setI32(MainMemory.getI32(i) + 1376 + (m << 2), 1);
/* 325 */       i10 = MainMemory.getI32(i) + 44;
/* 326 */       MainMemory.setI64(i10, (paramInt3 + -1) * paramInt4 + paramInt3 * paramInt2 + MainMemory.getI64(i10));
/*     */       
/*     */ 
/*     */       label974:
/*     */       
/*     */ 
/* 332 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpbytoff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */