/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class uncompress2file extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3672;
/*  16 */   public static final Function _instance = new uncompress2file();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public uncompress2file() { super("uncompress2file", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = call(i, j, k);
/*  38 */     paramFrame.setI32(paramInt1, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*  53 */     int i4 = 0;
/*  54 */     int i5 = 0;
/*  55 */     int i6 = 0;
/*  56 */     int i7 = 0;
/*  57 */     int i8 = 0;
/*  58 */     int i9 = 0;
/*     */     
/*     */ 
/*  61 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       j = MainMemory.alloc(56);
/*  66 */       i5 = MainMemory.getI32(paramInt3);
/*  67 */       if (i5 <= 0) {
/*     */         break label90;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       i = i5;
/*     */       
/*     */ 
/*     */       break label1045;
/*     */       
/*     */       label90:
/*     */       
/*  84 */       k = malloc.call(115200);
/*  85 */       if (k != 0) {
/*     */         break label134;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       MainMemory.setI32(paramInt3, 113);
/*  96 */       i = 113;
/*     */       
/*     */ 
/*     */       break label1045;
/*     */       
/*     */       label134:
/*     */       
/* 103 */       m = malloc.call(115200);
/* 104 */       if (m != 0) {
/*     */         break label178;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */       MainMemory.setI32(paramInt3, 113);
/* 115 */       i = 113;
/*     */       
/*     */ 
/*     */       break label1045;
/*     */       
/*     */       label178:
/*     */       
/* 122 */       MainMemory.setI32(j + 32, 0);
/* 123 */       n = j + 36;
/* 124 */       MainMemory.setI32(n, 0);
/* 125 */       i1 = j + 40;
/* 126 */       MainMemory.setI32(i1, 0);
/* 127 */       i2 = j + 12;
/* 128 */       MainMemory.setI32(i2, m);
/* 129 */       i3 = j + 16;
/* 130 */       MainMemory.setI32(i3, 115200);
/* 131 */       if (inflateInit2_.call(j) != 0) {
/*     */         break label1029;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       i4 = j + 4;
/* 142 */       i5 = 0;
/*     */       
/*     */ 
/*     */       label544:
/*     */       
/*     */       do
/*     */       {
/* 149 */         i6 = SystemLibrary.fread(k, 1, 115200, paramInt1);
/* 150 */         if (com.emt.proteus.runtime.library.c.ferror.call(paramInt1) != 0) {
/*     */           break label953;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */         if (i6 == 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         MainMemory.setI32(j, k);
/* 172 */         MainMemory.setI32(i4, i6);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 180 */           switch (inflate.call(j))
/*     */           {
/*     */           case 1: 
/*     */             break label544;
/*     */             
/*     */             break;
/*     */           case 0: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 191 */           if (MainMemory.getI32(i4) == 0) {
/*     */             break label544;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */           if (SystemLibrary.fwrite(m, 1, 115200, paramInt2) != 115200) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */           i5 += 115200;
/* 212 */           MainMemory.setI32(i2, m);
/* 213 */           MainMemory.setI32(i3, 115200);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 219 */         i8 = j + 28;
/* 220 */         i7 = MainMemory.getI32(i8);
/* 221 */         if (i7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */           uncompress2file_1696.call(n, i8, i1, i7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 237 */         free.call(k);
/* 238 */         free.call(m);
/* 239 */         MainMemory.setI32(paramInt3, 414);
/* 240 */         i = 414;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         break label1045;
/* 247 */       } while (SystemLibrary.feof(paramInt1) == 0);
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
/* 260 */       i3 = j + 20;
/* 261 */       i6 = MainMemory.getI32(i3);
/* 262 */       if (!MathUtils.ugt(i6, i5)) {
/*     */         break label707;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */       if (SystemLibrary.fwrite(m, 1, i6 - i5, paramInt2) != MainMemory.getI32(i3) - i5)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */         i8 = j + 28;
/* 283 */         i7 = MainMemory.getI32(i8);
/* 284 */         if (i7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 294 */           uncompress2file_1699.call(n, i7, i8, i1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 300 */         free.call(k);
/* 301 */         free.call(m);
/* 302 */         MainMemory.setI32(paramInt3, 414);
/* 303 */         i = 414;
/*     */       }
/*     */       else
/*     */       {
/*     */         label707:
/*     */         
/*     */ 
/* 310 */         free.call(k);
/* 311 */         free.call(m);
/* 312 */         i8 = j + 28;
/* 313 */         i7 = MainMemory.getI32(i8);
/* 314 */         if (i7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */           i9 = MainMemory.getI32(n);
/* 325 */           if (i9 != 0) {
/*     */             break label792;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */         MainMemory.setI32(paramInt3, 414);
/* 336 */         i = 414;
/*     */         
/*     */ 
/*     */         break label1045;
/*     */         
/*     */         label792:
/*     */         
/* 343 */         k = MainMemory.getI32(i7 + 52);
/* 344 */         if (k != 0)
/*     */         {
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
/* 356 */           SystemLibrary.do_indirect(i9, MainMemory.getI32(i1), k);
/* 357 */           i9 = MainMemory.getI32(n);
/* 358 */           i7 = MainMemory.getI32(i8);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 368 */         SystemLibrary.do_indirect(i9, MainMemory.getI32(i1), i7);
/* 369 */         i = MainMemory.getI32(paramInt3);
/*     */         
/*     */ 
/*     */ 
/*     */         break label1045;
/*     */         
/*     */ 
/* 376 */         i8 = j + 28;
/* 377 */         i7 = MainMemory.getI32(i8);
/* 378 */         if (i7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */           uncompress2file_1697.call(n, i7, i1, i8);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 394 */         free.call(k);
/* 395 */         free.call(m);
/* 396 */         MainMemory.setI32(paramInt3, 414);
/* 397 */         i = 414;
/*     */         
/*     */ 
/*     */         break label1045;
/*     */         
/*     */         label953:
/*     */         
/* 404 */         i8 = j + 28;
/* 405 */         i7 = MainMemory.getI32(i8);
/* 406 */         if (i7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */           uncompress2file_1698.call(n, i8, i7, i1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 422 */         free.call(k);
/* 423 */         free.call(m);
/* 424 */         MainMemory.setI32(paramInt3, 414);
/* 425 */         i = 414;
/*     */         
/*     */ 
/*     */         break label1045;
/*     */         
/*     */         label1029:
/*     */         
/* 432 */         MainMemory.setI32(paramInt3, 414);
/* 433 */         i = 414;
/*     */       }
/*     */       
/*     */ 
/*     */       label1045:
/*     */       
/* 439 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 444 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/uncompress2file.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */