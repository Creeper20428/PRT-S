/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgbytoff extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2967;
/*  13 */   public static final Function _instance = new ffgbytoff();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffgbytoff() { super("ffgbytoff", 6, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       if (MainMemory.getI32(paramInt6) <= 0) {
/*     */         break label73;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label927;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label73:
/*     */       
/*     */ 
/*     */ 
/*  86 */       m = MainMemory.getI32(paramInt1);
/*  87 */       i = paramInt1 + 4;
/*  88 */       i7 = MainMemory.getI32(i);
/*  89 */       if (m != MainMemory.getI32(i7 + 64))
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
/* 100 */         ffmahd.call(paramInt1, m + 1, 0, paramInt6);
/* 101 */         i7 = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */       m = MainMemory.getI32(i7 + 60);
/* 110 */       if (m >= 0) {
/*     */         break label208;
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
/* 122 */       ffldrc.call(paramInt1, (int)(MainMemory.getI64(i7 + 44) / 2880L), 0, paramInt6);
/* 123 */       i7 = MainMemory.getI32(i);
/* 124 */       m = MainMemory.getI32(i7 + 60);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label208:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 134 */       j = MainMemory.getI32(i7 + 1216 + (m << 2));
/* 135 */       n = (int)MainMemory.getI64(i7 + 44) - j * 2880;
/* 136 */       i8 = 2880 - n;
/* 137 */       i5 = MainMemory.getI32(i7 + 1212) + (n + m * 2880);
/* 138 */       k = paramInt3 > 1 ? 1 : 0;
/* 139 */       i4 = i8 <= paramInt2 ? i8 : paramInt2;
/* 140 */       SystemLibrary.memcpy(paramInt5, i5, i4, 1);
/* 141 */       i3 = paramInt5 + i4;
/* 142 */       i2 = i4 < paramInt2 ? 1 : 0;
/* 143 */       if (k == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 148 */         paramInt5 = i3;
/* 149 */         m = i4;
/* 150 */         n = j;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 157 */         m = 2880 - paramInt4;
/* 158 */         n = paramInt3 + -1;
/* 159 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         i6 = j;
/* 166 */         j = i8;
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
/* 180 */           if (i2 == 0) {
/*     */             break label508;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */           j = i6 + 1;
/* 191 */           ffldrc.call(paramInt1, j, 0, paramInt6);
/* 192 */           i7 = MainMemory.getI32(i);
/* 193 */           i5 = MainMemory.getI32(i7 + 1212);
/* 194 */           i8 = MainMemory.getI32(i7 + 60) * 2880;
/* 195 */           i4 = paramInt2 - i4;
/* 196 */           SystemLibrary.memcpy(i3, i5 + i8, i4, 1);
/* 197 */           paramInt5 += paramInt2;
/* 198 */           i3 = i5 + (i4 + paramInt4 + i8);
/* 199 */           i4 = m - i4;
/*     */           
/* 201 */           i8 = j;
/*     */           
/*     */ 
/*     */           break label543;
/*     */           
/*     */           label508:
/*     */           
/* 208 */           i5 += i4 + paramInt4;
/* 209 */           i4 = j - paramInt4 - i4;
/*     */           
/* 211 */           i8 = i6;
/* 212 */           paramInt5 = i3;
/* 213 */           i3 = i5;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label543:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 223 */           j = i4 + -1;
/* 224 */           if (!com.emt.proteus.lib.api.MathUtils.ugt(j, 2879))
/*     */           {
/*     */ 
/*     */ 
/* 228 */             j = i4;
/*     */             
/* 230 */             i5 = i3;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 237 */             if (i4 >= 1) {
/*     */               break label639;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */             j = (2880 - i4) / 2880 + i8;
/* 248 */             i4 = (0 - i4) % 2880;
/*     */             
/* 250 */             i8 = j;
/*     */             
/*     */             break label671;
/*     */             
/*     */             label639:
/* 255 */             j = i8 - j / 2880;
/* 256 */             i4 = 2880 - i4 % 2880;
/*     */             
/* 258 */             i8 = j;
/*     */             
/*     */ 
/*     */ 
/*     */             label671:
/*     */             
/*     */ 
/*     */ 
/* 266 */             ffldrc.call(paramInt1, i8, 0, paramInt6);
/* 267 */             i7 = MainMemory.getI32(i);
/* 268 */             j = 2880 - i4;
/* 269 */             i3 = MainMemory.getI32(i7 + 1212) + (MainMemory.getI32(i7 + 60) * 2880 + i4);
/*     */             
/*     */ 
/* 272 */             i5 = i3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */           i4 = j <= paramInt2 ? j : paramInt2;
/* 282 */           SystemLibrary.memcpy(paramInt5, i5, i4, 1);
/* 283 */           i3 = paramInt5 + i4;
/* 284 */           i2 = i4 < paramInt2 ? 1 : 0;
/* 285 */           i1 += 1;
/* 286 */           if (i1 == n)
/*     */           {
/* 288 */             paramInt5 = i3;
/* 289 */             m = i4;
/* 290 */             n = i8; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */           i6 = i8;
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
/* 312 */       if (i2 == 0) {
/*     */         break label890;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */       ffldrc.call(paramInt1, n + 1, 0, paramInt6);
/* 323 */       i7 = MainMemory.getI32(i);
/* 324 */       SystemLibrary.memcpy(paramInt5, MainMemory.getI32(i7 + 1212) + MainMemory.getI32(i7 + 60) * 2880, paramInt2 - m, 1);
/*     */       
/*     */ 
/*     */       label890:
/*     */       
/*     */ 
/* 330 */       i9 = MainMemory.getI32(i) + 44;
/* 331 */       MainMemory.setI64(i9, (paramInt3 + -1) * paramInt4 + paramInt3 * paramInt2 + MainMemory.getI64(i9));
/*     */       
/*     */ 
/*     */       label927:
/*     */       
/*     */ 
/* 337 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgbytoff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */