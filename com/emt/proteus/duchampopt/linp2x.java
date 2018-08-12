/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class linp2x extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2791;
/*  12 */   public static final Function _instance = new linp2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public linp2x() { super("linp2x", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = call(i, j, k, m, n);
/*  40 */     paramFrame.setI32(paramInt1, i1);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     double d1 = 0.0D;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     double d2 = 0.0D;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     int i10 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       if (paramInt1 == 0) {
/*  70 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  80 */         if (MainMemory.getI32(paramInt1) != 137)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */           j = linset.call(paramInt1);
/*  91 */           if (j != 0)
/*     */           {
/*     */ 
/*     */ 
/*  95 */             paramInt2 = j;
/*     */             
/*     */ 
/*     */             break label745;
/*     */           }
/*     */         }
/*     */         
/* 102 */         j = MainMemory.getI32(paramInt1 + 4);
/* 103 */         i4 = paramInt2 > 0 ? 1 : 0;
/* 104 */         if (MainMemory.getI32(paramInt1 + 28) != 0) {
/*     */           break label530;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         if (i4 == 0)
/*     */         {
/*     */ 
/*     */ 
/* 118 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 125 */           i4 = j > 0 ? 1 : 0;
/* 126 */           i5 = paramInt1 + 8;
/* 127 */           i6 = paramInt1 + 20;
/* 128 */           i7 = paramInt3 - j;
/* 129 */           i8 = j << 3;
/*     */           
/* 131 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 139 */             i10 = i9 * paramInt3;
/* 140 */             m = paramInt4;
/* 141 */             if (i4 != 0) {
/* 142 */               n = 0;
/*     */             } else {
/*     */               break label491;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 154 */               MainMemory.setF64(paramInt5 + (i10 + n << 3), 0.0D);
/* 155 */               n += 1;
/* 156 */               if (n == j) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */             if (i4 == 0) {
/*     */               break label491;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */             m += i8;
/* 179 */             n = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 186 */               d1 = MainMemory.getF64(paramInt4 + (n << 3)) - MainMemory.getF64(MainMemory.getI32(i5) + (n << 3));
/* 187 */               if (i4 == 0) {
/*     */                 break label457;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 197 */               i1 = MainMemory.getI32(i6);
/* 198 */               i2 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 205 */                 i3 = paramInt5 + (i10 + i2 << 3);
/* 206 */                 d2 = MainMemory.getF64(i1 + (n + j * i2 << 3)) * d1;
/* 207 */                 d2 = MainMemory.getF64(i3) + d2;
/* 208 */                 MainMemory.setF64(i3, d2);
/* 209 */                 i2 += 1;
/* 210 */                 if (i2 == j) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label457:
/*     */               
/*     */ 
/*     */ 
/* 221 */               n += 1;
/* 222 */               if (n == j) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */             paramInt4 = m;
/*     */             
/*     */ 
/*     */ 
/*     */             label491:
/*     */             
/*     */ 
/*     */ 
/* 241 */             i9 += 1;
/* 242 */             paramInt4 += (i7 << 3);
/* 243 */             if (i9 == paramInt2) {
/* 244 */               paramInt2 = 0;
/*     */               
/*     */ 
/*     */               break label745;
/*     */               
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */           label530:
/*     */           
/* 255 */           if (i4 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 259 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 266 */             i5 = paramInt1 + 16;
/* 267 */             i6 = paramInt1 + 8;
/* 268 */             paramInt3 -= j;
/* 269 */             if (j <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 273 */               paramInt2 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 280 */               i7 = j << 3;
/* 281 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 292 */                 m = paramInt4 + i7;
/* 293 */                 k = paramInt5 + i7;
/* 294 */                 i9 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 301 */                   d1 = MainMemory.getF64(paramInt4 + (i9 << 3)) - MainMemory.getF64(MainMemory.getI32(i6) + (i9 << 3));
/* 302 */                   d1 = MainMemory.getF64(MainMemory.getI32(i5) + (i9 << 3)) * d1;
/* 303 */                   MainMemory.setF64(paramInt5 + (i9 << 3), d1);
/* 304 */                   i9 += 1;
/* 305 */                   if (i9 == j) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */                 i8 += 1;
/* 317 */                 paramInt5 = k + (paramInt3 << 3);
/* 318 */                 paramInt4 = m + (paramInt3 << 3);
/* 319 */                 if (i8 == paramInt2) {
/* 320 */                   paramInt2 = 0; break;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label745:
/*     */       
/*     */ 
/*     */ 
/* 334 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */       int i11 = i;return i11;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/linp2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */