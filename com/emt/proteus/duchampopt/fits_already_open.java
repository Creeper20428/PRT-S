/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ 
/*     */ public final class fits_already_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3003;
/*  16 */   public static final Function _instance = new fits_already_open();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public fits_already_open() { super("fits_already_open", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11);
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
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int i7 = call(i, j, k, m, n, i1, i2, i3, i4, i5, i6);
/*  62 */     paramFrame.setI32(paramInt1, i7);
/*  63 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*     */   {
/*  68 */     int i = 0;
/*     */     
/*  70 */     int j = 0;
/*  71 */     int k = 0;
/*  72 */     int m = 0;
/*  73 */     int n = 0;
/*  74 */     int i1 = 0;
/*  75 */     int i2 = 0;
/*  76 */     int i3 = 0;
/*  77 */     int i4 = 0;
/*  78 */     int i5 = 0;
/*  79 */     int i6 = 0;
/*  80 */     int i7 = 0;
/*  81 */     int i8 = 0;
/*  82 */     int i9 = 0;
/*  83 */     int i10 = 0;
/*  84 */     int i11 = 0;
/*  85 */     int i12 = 0;
/*     */     
/*     */ 
/*  88 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  92 */       j = MainMemory.alloc(1025);
/*  93 */       k = MainMemory.alloc(20);
/*  94 */       m = MainMemory.alloc(1025);
/*  95 */       n = MainMemory.alloc(1025);
/*  96 */       i1 = MainMemory.alloc(1025);
/*  97 */       i2 = MainMemory.alloc(1025);
/*  98 */       i3 = MainMemory.alloc(1025);
/*  99 */       i4 = MainMemory.alloc(1025);
/* 100 */       i5 = MainMemory.alloc(1025);
/* 101 */       i6 = MainMemory.alloc(1025);
/* 102 */       i7 = MainMemory.alloc(1025);
/* 103 */       MainMemory.setI32(paramInt10, 0);
/* 104 */       if (paramInt9 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         if (SystemLibrary.strcasecmp(paramInt3, 41056) != 0) {
/*     */           break label361;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */         fits_path2url.call(paramInt4, i7, paramInt11);
/* 125 */         if (MainMemory.getI8(i7) != 47)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */           if (MainMemory.getI32(paramInt11) != 0) {
/*     */             break label260;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */           SystemLibrary.getcwd(j, 1025);
/* 146 */           fits_path2url.call(j, i5, paramInt11);
/*     */           
/*     */ 
/*     */           label260:
/*     */           
/*     */ 
/* 152 */           MainMemory.setI16(i5 + SystemLibrary.strlen(i5), (short)47);
/* 153 */           i8 = SystemLibrary.strlen(i5);
/* 154 */           if (!MathUtils.ugt(SystemLibrary.strlen(i7) + i8, 1024)) {
/*     */             break label333;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */           ffxmsg.call(5, 97888);
/* 165 */           MainMemory.setI32(paramInt11, 104);
/*     */           
/*     */           break label1161;
/*     */           
/*     */           label333:
/* 170 */           SystemLibrary.strcat(i5, i7);
/* 171 */           fits_clean_url.call(i5, i7, paramInt11);
/*     */           
/*     */           break label373;
/*     */           
/*     */           label361:
/* 176 */           SystemLibrary.strcpy(i7, paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */         label373:
/*     */         
/* 182 */         i9 = paramInt9 == 1 ? 1 : 0;
/* 183 */         paramInt9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 190 */           if (paramInt9 >= 300) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */           i10 = MainMemory.getI32(491008 + (paramInt9 << 2));
/* 201 */           if (i10 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */             i11 = i10 + 12;
/* 212 */             ffifile.call(MainMemory.getI32(i11), k, m, i1, n, i2, i3, i4, 0, paramInt11);
/* 213 */             if (MainMemory.getI32(paramInt11) <= 0) {
/*     */               break label521;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */             ffxmsg.call(5, 126176);
/* 224 */             ffxmsg.call(5, MainMemory.getI32(i11));
/* 225 */             break;
/*     */             
/*     */             label521:
/*     */             
/* 229 */             if (SystemLibrary.strcasecmp(k, 41056) != 0) {
/*     */               break label668;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */             fits_path2url.call(m, i6, paramInt11);
/* 240 */             if (MainMemory.getI8(i6) != 47)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */               if (MainMemory.getI32(paramInt11) != 0) {
/*     */                 break label619;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */               SystemLibrary.getcwd(j, 1025);
/* 261 */               fits_path2url.call(j, i5, paramInt11);
/*     */               
/*     */ 
/*     */               label619:
/*     */               
/*     */ 
/* 267 */               MainMemory.setI16(i5 + SystemLibrary.strlen(i5), (short)47);
/* 268 */               SystemLibrary.strcat(i5, i6);
/* 269 */               fits_clean_url.call(i5, i6, paramInt11);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 275 */             SystemLibrary.strcpy(m, i6);
/*     */             
/*     */ 
/*     */             label668:
/*     */             
/*     */ 
/* 281 */             if (SystemLibrary.strcmp(paramInt3, k) != 0) {
/*     */               break label1145;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */             if (SystemLibrary.strcmp(i7, m) != 0) {
/*     */               break label1145;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */             if (MainMemory.getI8(paramInt6) != 0) {
/*     */               break label836;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */             if (MainMemory.getI8(i2) != 0) {
/*     */               break label836;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */             if (MainMemory.getI8(paramInt7) != 0) {
/*     */               break label836;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */             if (MainMemory.getI8(i3) != 0) {
/*     */               break label836;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 341 */             if (MainMemory.getI8(paramInt8) != 0) {
/*     */               break label836;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */             if (MainMemory.getI8(i4) != 0)
/*     */             {
/*     */               label836:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */               if (SystemLibrary.strcmp(paramInt6, i2) != 0) {
/*     */                 break label1145;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */               if (SystemLibrary.strcmp(paramInt7, i3) != 0) {
/*     */                 break label1145;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */               if (SystemLibrary.strcmp(paramInt8, i4) != 0) {
/*     */                 break label1145;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */               if (SystemLibrary.strcmp(paramInt5, n) != 0) {
/*     */                 break label1145;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 401 */             if (i9 == 0) {
/*     */               break label998;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */             if (MainMemory.getI32(i10 + 72) != 0) {
/*     */               break label998;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 421 */             ffxmsg.call(5, 131360);
/* 422 */             ffxmsg.call(5, paramInt2);
/* 423 */             MainMemory.setI32(paramInt11, 104);
/* 424 */             break;
/*     */             
/*     */             label998:
/*     */             
/* 428 */             paramInt4 = calloc.call(1, 8);
/* 429 */             MainMemory.setI32(paramInt1, paramInt4);
/* 430 */             if (paramInt4 != 0) {
/*     */               break label1055;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */             ffxmsg.call(5, 127776);
/* 441 */             ffxmsg.call(5, paramInt2);
/* 442 */             MainMemory.setI32(paramInt11, 113);
/* 443 */             break;
/*     */             
/*     */             label1055:
/*     */             
/* 447 */             MainMemory.setI32(paramInt4 + 4, i10);
/* 448 */             MainMemory.setI32(paramInt4, 0);
/* 449 */             i12 = i10 + 8;
/* 450 */             MainMemory.setI32(i12, MainMemory.getI32(i12) + 1);
/* 451 */             if (MainMemory.getI8(paramInt7) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 461 */               MainMemory.setI8(paramInt5, (byte)0);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 467 */             MainMemory.setI8(paramInt6, (byte)0);
/* 468 */             MainMemory.setI8(paramInt7, (byte)0);
/* 469 */             MainMemory.setI8(paramInt8, (byte)0);
/* 470 */             MainMemory.setI32(paramInt10, 1);
/*     */           }
/*     */           
/*     */ 
/*     */           label1145:
/*     */           
/* 476 */           paramInt9 += 1;
/*     */         }
/*     */       }
/*     */       
/*     */       label1161:
/*     */       
/* 482 */       i = MainMemory.getI32(paramInt11);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 488 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 493 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_already_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */