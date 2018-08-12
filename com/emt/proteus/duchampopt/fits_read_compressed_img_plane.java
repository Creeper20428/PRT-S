/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_read_compressed_img_plane extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3620;
/*  12 */   public static final Function _instance = new fits_read_compressed_img_plane();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_read_compressed_img_plane() { super("fits_read_compressed_img_plane", 15, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  65 */     paramInt4 += 2;
/*  66 */     paramInt3--;
/*  67 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  68 */     paramInt4 += 2;
/*  69 */     paramInt3--;
/*  70 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10);
/*  71 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  77 */     int i = 0;
/*  78 */     int j = 0;
/*  79 */     int k = 0;
/*  80 */     int m = 0;
/*  81 */     long l1 = 0L;
/*  82 */     int n = 0;
/*  83 */     long l2 = 0L;
/*  84 */     long l3 = 0L;
/*  85 */     long l4 = 0L;
/*     */     
/*     */ 
/*  88 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  92 */       i = MainMemory.alloc(48);
/*  93 */       j = MainMemory.alloc(48);
/*  94 */       k = MainMemory.alloc(4);
/*  95 */       if (paramInt13 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         MainMemory.setI32(paramInt13, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 111 */       MainMemory.setI32(paramInt14, 0);
/* 112 */       l2 = paramInt4 + 1;
/* 113 */       MainMemory.setI64(i + 16, l2);
/* 114 */       MainMemory.setI64(j + 16, l2);
/* 115 */       l2 = MainMemory.getI64(paramInt5);
/* 116 */       if (l2 != 0L) {
/*     */         break label157;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       l2 = MainMemory.getI64(paramInt5 + 8);
/*     */       
/*     */ 
/*     */       break label481;
/*     */       
/*     */ 
/*     */       label157:
/*     */       
/* 134 */       MainMemory.setI64(i, l2 + 1L);
/* 135 */       n = paramInt5 + 8;
/* 136 */       l2 = MainMemory.getI64(n);
/* 137 */       l1 = l2 + 1L;
/* 138 */       MainMemory.setI64(i + 8, l1);
/* 139 */       MainMemory.setI64(j + 8, l1);
/* 140 */       m = paramInt6 + 8;
/* 141 */       if (MainMemory.getI64(m) != l2) {
/*     */         break label259;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       MainMemory.setI64(j, MainMemory.getI64(paramInt6) + 1L);
/*     */       
/*     */       break label275;
/*     */       
/*     */       label259:
/* 156 */       MainMemory.setI64(j, MainMemory.getI32(paramInt8));
/*     */       
/*     */ 
/*     */       label275:
/*     */       
/*     */ 
/* 162 */       fits_read_compressed_img.call(paramInt1, paramInt2, i, j, paramInt7, paramInt9, paramInt10, paramInt11, paramInt12, k, paramInt15);
/* 163 */       l2 = MainMemory.getI64(j);
/* 164 */       l1 = MainMemory.getI64(i);
/* 165 */       MainMemory.setI32(paramInt14, MainMemory.getI32(paramInt14) + 1 + (int)l2 - (int)l1);
/* 166 */       if ((MainMemory.getI32(k) == 0) || (paramInt13 == 0)) {
/*     */         break label369;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */       MainMemory.setI32(paramInt13, 1);
/*     */       
/*     */ 
/*     */       label369:
/*     */       
/*     */ 
/* 182 */       l3 = MainMemory.getI64(n);
/* 183 */       if (MainMemory.getI64(m) != l3)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */         MainMemory.setI64(paramInt5, 0L);
/* 194 */         l3 += 1L;
/* 195 */         MainMemory.setI64(n, l3);
/* 196 */         l2 = l2 + 1L - l1;
/* 197 */         paramInt11 += (int)(l2 * paramInt3);
/* 198 */         if ((paramInt12 == 0) || (paramInt9 != 2))
/*     */         {
/*     */ 
/*     */ 
/* 202 */           l2 = l3;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 211 */           paramInt12 += (int)l2;
/* 212 */           l2 = l3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label481:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 223 */         MainMemory.setI64(i, 1L);
/* 224 */         l2 += 1L;
/* 225 */         paramInt5 = i + 8;
/* 226 */         MainMemory.setI64(paramInt5, l2);
/* 227 */         l3 = MainMemory.getI32(paramInt8);
/* 228 */         MainMemory.setI64(j, l3);
/* 229 */         m = paramInt6 + 8;
/* 230 */         l1 = MainMemory.getI64(m);
/* 231 */         if (MainMemory.getI64(paramInt6) + 1L != l3) {
/*     */           break label588;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */         l3 = l1 + 1L;
/* 242 */         MainMemory.setI64(j + 8, l3);
/*     */         
/*     */         break label607;
/*     */         
/*     */         label588:
/*     */         
/* 248 */         MainMemory.setI64(j + 8, l1);
/* 249 */         l3 = l1;
/*     */         
/*     */ 
/*     */ 
/*     */         label607:
/*     */         
/*     */ 
/* 256 */         n = j + 8;
/* 257 */         if (l3 < l2)
/*     */         {
/* 259 */           l2 = l3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */           fits_read_compressed_img.call(paramInt1, paramInt2, i, j, paramInt7, paramInt9, paramInt10, paramInt11, paramInt12, k, paramInt15);
/* 272 */           l2 = MainMemory.getI64(n);
/* 273 */           l1 = l2 + 1L - MainMemory.getI64(paramInt5);
/* 274 */           MainMemory.setI32(paramInt14, (int)(MainMemory.getI32(paramInt8) * l1) + MainMemory.getI32(paramInt14));
/* 275 */           if ((MainMemory.getI32(k) == 0) || (paramInt13 == 0)) {
/*     */             break label736;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */           MainMemory.setI32(paramInt13, 1);
/*     */           
/*     */ 
/*     */           label736:
/*     */           
/*     */ 
/* 291 */           l3 = MainMemory.getI64(m);
/* 292 */           if (l3 + 1L == l2) {
/*     */             break label860;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */           l4 = MainMemory.getI32(paramInt8);
/* 303 */           paramInt11 += (int)(l1 * paramInt3 * l4);
/* 304 */           if ((paramInt12 == 0) || (paramInt9 != 2))
/*     */           {
/*     */ 
/*     */ 
/* 308 */             l1 = l3;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 318 */             paramInt12 += (int)(l4 * l1);
/* 319 */             l1 = l3;
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
/* 332 */         l1 += 1L;
/* 333 */         if (l2 != l1) {
/*     */           break label870;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label860:
/*     */       
/*     */ 
/*     */       break label987;
/*     */       
/*     */ 
/*     */       label870:
/*     */       
/*     */ 
/* 349 */       MainMemory.setI64(j, MainMemory.getI64(paramInt6) + 1L);
/* 350 */       MainMemory.setI64(n, l1);
/* 351 */       MainMemory.setI64(paramInt5, l1);
/* 352 */       fits_read_compressed_img.call(paramInt1, paramInt2, i, j, paramInt7, paramInt9, paramInt10, paramInt11, paramInt12, k, paramInt15);
/* 353 */       if ((MainMemory.getI32(k) == 0) || (paramInt13 == 0)) {
/*     */         break label956;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */       MainMemory.setI32(paramInt13, 1);
/*     */       
/*     */ 
/*     */       label956:
/*     */       
/*     */ 
/* 369 */       MainMemory.setI32(paramInt14, MainMemory.getI32(paramInt14) + 1 + (int)MainMemory.getI64(j) - (int)MainMemory.getI64(i));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label987:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 380 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_read_compressed_img_plane.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */