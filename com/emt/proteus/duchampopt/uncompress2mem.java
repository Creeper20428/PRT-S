/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.ferror;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class uncompress2mem extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3673;
/*  17 */   public static final Function _instance = new uncompress2mem();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public uncompress2mem() { super("uncompress2mem", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, k, m, n);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*     */     
/*     */ 
/*  67 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  71 */       i = MainMemory.alloc(56);
/*  72 */       if (MainMemory.getI32(paramInt5) <= 0) {
/*     */         break label82;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label895;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label82:
/*     */       
/*     */ 
/*     */ 
/*  88 */       j = malloc.call(115200);
/*  89 */       if (j != 0) {
/*     */         break label124;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */       MainMemory.setI32(paramInt5, 113);
/*     */       
/*     */ 
/*     */       break label895;
/*     */       
/*     */       label124:
/*     */       
/* 106 */       MainMemory.setI32(i + 32, 0);
/* 107 */       k = i + 36;
/* 108 */       MainMemory.setI32(k, 0);
/* 109 */       m = i + 40;
/* 110 */       MainMemory.setI32(m, 0);
/* 111 */       n = i + 12;
/* 112 */       MainMemory.setI32(n, MainMemory.getI32(paramInt2));
/* 113 */       i1 = i + 16;
/* 114 */       MainMemory.setI32(i1, MainMemory.getI32(paramInt3));
/* 115 */       if (inflateInit2_.call(i) != 0) {
/*     */         break label882;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       i2 = i + 4;
/* 126 */       i3 = i + 20;
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 132 */         i5 = SystemLibrary.fread(j, 1, 115200, paramInt1);
/* 133 */         if (ferror.call(paramInt1) != 0) {
/*     */           break label814;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         if (i5 == 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         MainMemory.setI32(i, j);
/* 154 */         MainMemory.setI32(i2, i5);
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 160 */           switch (inflate.call(i))
/*     */           {
/*     */           case 1: 
/*     */             break label519;
/*     */             
/*     */             break;
/*     */           case 0: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 171 */           if (MainMemory.getI32(i2) == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */           i4 = realloc.call(MainMemory.getI32(paramInt2), MainMemory.getI32(paramInt3) + 28800);
/* 182 */           MainMemory.setI32(paramInt2, i4);
/* 183 */           if (i4 != 0) {
/*     */             break label475;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */           i6 = i + 28;
/* 194 */           i7 = MainMemory.getI32(i6);
/* 195 */           if (i7 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */             uncompress2mem_1702.call(m, i7, k, i6);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 211 */           free.call(j);
/* 212 */           MainMemory.setI32(paramInt5, 414);
/*     */           
/*     */ 
/*     */           break label895;
/*     */           
/*     */           label475:
/*     */           
/* 219 */           MainMemory.setI32(i1, 28800);
/* 220 */           i5 = MainMemory.getI32(paramInt3);
/* 221 */           MainMemory.setI32(n, i4 + i5);
/* 222 */           MainMemory.setI32(paramInt3, i5 + 28800);
/*     */         }
/*     */         
/*     */         label519:
/*     */         
/* 227 */         if (SystemLibrary.feof(paramInt1) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */         i5 = MainMemory.getI32(i3);
/* 238 */         MainMemory.setI32(n, MainMemory.getI32(paramInt2) + i5);
/* 239 */         MainMemory.setI32(i1, MainMemory.getI32(paramInt3) - i5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 244 */       MainMemory.setI32(paramInt4, MainMemory.getI32(i3));
/* 245 */       free.call(j);
/* 246 */       i6 = i + 28;
/* 247 */       i7 = MainMemory.getI32(i6);
/* 248 */       if (i7 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */         i8 = MainMemory.getI32(k);
/* 259 */         if (i8 != 0) {
/*     */           break label666;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */       MainMemory.setI32(paramInt5, 414);
/*     */       
/*     */ 
/*     */       break label895;
/*     */       
/*     */       label666:
/*     */       
/* 276 */       j = MainMemory.getI32(i7 + 52);
/* 277 */       if (j != 0)
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
/*     */ 
/* 289 */         SystemLibrary.do_indirect(i8, MainMemory.getI32(m), j);
/* 290 */         i8 = MainMemory.getI32(k);
/* 291 */         i7 = MainMemory.getI32(i6);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */       SystemLibrary.do_indirect(i8, MainMemory.getI32(m), i7);
/*     */       
/*     */ 
/*     */ 
/*     */       break label895;
/*     */       
/*     */ 
/* 308 */       i6 = i + 28;
/* 309 */       i7 = MainMemory.getI32(i6);
/* 310 */       if (i7 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */         uncompress2mem_1701.call(m, k, i7, i6);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 326 */       free.call(j);
/* 327 */       MainMemory.setI32(paramInt5, 414);
/*     */       
/*     */ 
/*     */       break label895;
/*     */       
/*     */       label814:
/*     */       
/* 334 */       i6 = i + 28;
/* 335 */       i7 = MainMemory.getI32(i6);
/* 336 */       if (i7 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 346 */         uncompress2mem_1700.call(i6, m, k, i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 352 */       free.call(j);
/* 353 */       MainMemory.setI32(paramInt5, 414);
/*     */       
/*     */ 
/*     */       break label895;
/*     */       
/*     */       label882:
/*     */       
/* 360 */       MainMemory.setI32(paramInt5, 414);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label895:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/uncompress2mem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */