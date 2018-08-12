/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffbinr extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3466;
/*  13 */   public static final Function _instance = new ffbinr();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffbinr() { super("ffbinr", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
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
/*  44 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     call(i, j, k, m, n, i1, i2, i3, i4);
/*  54 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  60 */     int i = 0;
/*  61 */     int j = 0;
/*  62 */     int k = 0;
/*  63 */     int m = 0;
/*     */     
/*     */ 
/*  66 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(4);
/*  71 */       j = MainMemory.alloc(71);
/*  72 */       if (paramInt9 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         paramInt9 = fits_get_token.call(paramInt1, 26048, j, i);
/*  83 */         if (paramInt9 != 0) {
/*     */           break label148;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         switch (MainMemory.getI8(MainMemory.getI32(paramInt1))) {
/*     */         case 0: 
/*     */           break label715;
/*     */           break;
/*     */         case 44: 
/*     */           break label715;
/*     */           break;
/*     */         case 59: 
/*     */           break label715;
/*     */           break;
/*     */         }
/*     */         label148:
/* 105 */         if (MainMemory.getI32(i) != 0) {
/*     */           break label415;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         if (MainMemory.getI8(MainMemory.getI32(paramInt1)) != 58)
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
/* 127 */           if (MainMemory.getI8(j) != 35) {
/*     */             break label274;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */           k = j + 1;
/* 138 */           if ((MainMemory.getI16(MainMemory.getI32(com.emt.proteus.runtime.library.ctype.__ctype_b_loc.call()) + (MainMemory.getI8(k) << 1)) & 0xFFFF & 0x800) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */             SystemLibrary.strcpy(paramInt2, k);
/*     */           } else {
/*     */             label274:
/*     */             
/*     */ 
/* 153 */             SystemLibrary.strcpy(paramInt2, j);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 159 */           paramInt2 = MainMemory.getI32(paramInt1);
/* 160 */           m = MainMemory.getI8(paramInt2);
/* 161 */           if (m != 32) {
/*     */             break label349;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 175 */             paramInt2 += 1;
/* 176 */             MainMemory.setI32(paramInt1, paramInt2);
/* 177 */             m = MainMemory.getI8(paramInt2);
/* 178 */           } while (m == 32);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label349:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */           if (m != 61) {
/*     */             break label715;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 205 */             paramInt2 += 1;
/* 206 */             MainMemory.setI32(paramInt1, paramInt2);
/* 207 */           } while (MainMemory.getI8(paramInt2) == 32);
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
/* 218 */           paramInt9 = fits_get_token.call(paramInt1, 20544, j, i);
/*     */         }
/*     */         else
/*     */         {
/*     */           label415:
/*     */           
/*     */ 
/*     */ 
/* 226 */           if (MainMemory.getI8(MainMemory.getI32(paramInt1)) != 58) {
/*     */             break label725;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */           if (paramInt9 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */             if (MainMemory.getI32(i) != 0) {
/*     */               break label494;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */             SystemLibrary.strcpy(paramInt6, j);
/*     */             
/*     */             break label509;
/*     */             
/*     */             label494:
/* 261 */             MainMemory.setF64(paramInt3, SystemLibrary.strtod(j, 0));
/*     */           }
/*     */           
/*     */ 
/*     */           label509:
/*     */           
/* 267 */           MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt1) + 1);
/* 268 */           if (fits_get_token.call(paramInt1, 20544, j, i) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */             if (MainMemory.getI32(i) != 0) {
/*     */               break label582;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */             SystemLibrary.strcpy(paramInt7, j);
/*     */             
/*     */             break label597;
/*     */             
/*     */             label582:
/* 293 */             MainMemory.setF64(paramInt4, SystemLibrary.strtod(j, 0));
/*     */           }
/*     */           
/*     */ 
/*     */           label597:
/*     */           
/* 299 */           paramInt2 = MainMemory.getI32(paramInt1);
/* 300 */           if (MainMemory.getI8(paramInt2) != 58) {
/*     */             break label715;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */           MainMemory.setI32(paramInt1, paramInt2 + 1);
/* 311 */           if (fits_get_token.call(paramInt1, 20544, j, i) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */             if (MainMemory.getI32(i) != 0) {
/*     */               break label694;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */             SystemLibrary.strcpy(paramInt8, j);
/*     */             
/*     */ 
/*     */             break label780;
/*     */             
/*     */             label694:
/*     */             
/* 338 */             MainMemory.setF64(paramInt5, SystemLibrary.strtod(j, 0));
/*     */             
/*     */             break label780;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label715:
/*     */       
/*     */       break label780;
/*     */       
/*     */       label725:
/*     */       
/* 351 */       if (MainMemory.getI32(i) != 0) {
/*     */         break label764;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */       SystemLibrary.strcpy(paramInt8, j);
/*     */       
/*     */ 
/*     */       break label780;
/*     */       
/*     */       label764:
/*     */       
/* 368 */       MainMemory.setF64(paramInt5, SystemLibrary.strtod(j, 0));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label780:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffbinr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */