/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class linini extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2793;
/*  14 */   public static final Function _instance = new linini();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public linini() { super("linini", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2);
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
/*  32 */     int k = call(i, j);
/*  33 */     paramFrame.setI32(paramInt1, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       if (paramInt2 == 0) {
/*  57 */         paramInt1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  67 */       else if (paramInt1 < 1) {
/*  68 */         paramInt1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  78 */         if (MainMemory.getI32(paramInt2) != -1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */           i6 = MainMemory.getI32(paramInt2 + 36);
/*  89 */           if (i6 == 137) {}
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
/* 100 */           MainMemory.setI32(paramInt2 + 36, 0);
/* 101 */           MainMemory.setI32(paramInt2 + 40, 0);
/* 102 */           MainMemory.setI32(paramInt2 + 44, 0);
/* 103 */           MainMemory.setI32(paramInt2 + 48, 0);
/* 104 */           MainMemory.setI32(paramInt2 + 52, 0);
/* 105 */           i6 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         j = paramInt2 + 8;
/* 113 */         i3 = MainMemory.getI32(j);
/* 114 */         if (i3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */           if (MainMemory.getI32(paramInt2 + 12) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */             if (MainMemory.getI32(paramInt2 + 16) != 0) {
/*     */               break label737;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */         k = paramInt2 + 36;
/* 145 */         if (i6 != 137) {
/*     */           break label293;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */         if (MainMemory.getI32(paramInt2 + 40) >= paramInt1) {
/*     */           break label293;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */         linfree.call(paramInt2);
/* 168 */         i3 = MainMemory.getI32(j);
/*     */         
/*     */ 
/*     */ 
/*     */         label293:
/*     */         
/*     */ 
/*     */ 
/* 176 */         if (i3 != 0) {
/*     */           break label421;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */         m = paramInt2 + 44;
/* 187 */         i3 = MainMemory.getI32(m);
/* 188 */         if (i3 != 0) {
/*     */           break label410;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */         i4 = calloc.call(paramInt1, 8);
/* 199 */         i3 = i4;
/* 200 */         MainMemory.setI32(j, i3);
/* 201 */         if (i4 == 0) {
/* 202 */           paramInt1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 212 */           MainMemory.setI32(k, 137);
/* 213 */           MainMemory.setI32(paramInt2 + 40, paramInt1);
/* 214 */           MainMemory.setI32(m, i3);
/*     */           
/*     */           break label421;
/*     */           
/*     */           label410:
/* 219 */           MainMemory.setI32(j, i3);
/*     */           
/*     */ 
/*     */           label421:
/*     */           
/*     */ 
/* 225 */           m = paramInt2 + 12;
/* 226 */           if (MainMemory.getI32(m) != 0) {
/*     */             break label580;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */           n = paramInt2 + 48;
/* 237 */           i3 = MainMemory.getI32(n);
/* 238 */           if (i3 != 0) {
/*     */             break label568;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */           i4 = calloc.call(paramInt1 * paramInt1, 8);
/* 249 */           i3 = i4;
/* 250 */           MainMemory.setI32(m, i3);
/* 251 */           if (i4 != 0) {
/*     */             break label535;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */           linfree.call(paramInt2);
/* 262 */           i = 2;
/*     */           
/*     */ 
/*     */           break label1124;
/*     */           
/*     */           label535:
/*     */           
/* 269 */           MainMemory.setI32(k, 137);
/* 270 */           MainMemory.setI32(paramInt2 + 40, paramInt1);
/* 271 */           MainMemory.setI32(n, i3);
/*     */           
/*     */           break label580;
/*     */           
/*     */           label568:
/* 276 */           MainMemory.setI32(m, i3);
/*     */           
/*     */ 
/*     */           label580:
/*     */           
/*     */ 
/* 282 */           m = paramInt2 + 16;
/* 283 */           if (MainMemory.getI32(m) != 0) {
/*     */             break label737;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */           n = paramInt2 + 52;
/* 294 */           i3 = MainMemory.getI32(n);
/* 295 */           if (i3 != 0) {
/*     */             break label725;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */           i4 = calloc.call(paramInt1, 8);
/* 306 */           i3 = i4;
/* 307 */           MainMemory.setI32(m, i3);
/* 308 */           if (i4 != 0) {
/*     */             break label692;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 318 */           linfree.call(paramInt2);
/* 319 */           i = 2;
/*     */           
/*     */ 
/*     */           break label1124;
/*     */           
/*     */           label692:
/*     */           
/* 326 */           MainMemory.setI32(k, 137);
/* 327 */           MainMemory.setI32(paramInt2 + 40, paramInt1);
/* 328 */           MainMemory.setI32(n, i3);
/*     */           
/*     */           break label737;
/*     */           
/*     */           label725:
/* 333 */           MainMemory.setI32(m, i3);
/*     */           
/*     */ 
/*     */           label737:
/*     */           
/*     */ 
/* 339 */           if (MainMemory.getI32(paramInt2) != 137) {
/*     */             break label803;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */           i3 = MainMemory.getI32(paramInt2 + 20);
/* 350 */           if (i3 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */             free.call(i3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 366 */           linini_1559.call(paramInt2);
/*     */           
/*     */ 
/*     */           label803:
/*     */           
/*     */ 
/* 372 */           MainMemory.setI32(paramInt2 + 20, 0);
/* 373 */           MainMemory.setI32(paramInt2 + 24, 0);
/* 374 */           MainMemory.setI32(paramInt2 + 32, 0);
/* 375 */           MainMemory.setI32(paramInt2, 0);
/* 376 */           MainMemory.setI32(paramInt2 + 4, paramInt1);
/* 377 */           i1 = paramInt1 > 0 ? 1 : 0;
/* 378 */           if (i1 != 0) {
/* 379 */             i6 = 0;
/*     */           }
/*     */           else
/*     */           {
/* 383 */             paramInt1 = 0;
/*     */             
/*     */ 
/*     */             break label1117;
/*     */           }
/*     */           
/*     */           for (;;)
/*     */           {
/* 391 */             MainMemory.setF64(MainMemory.getI32(j) + (i6 << 3), 0.0D);
/* 392 */             i6 += 1;
/* 393 */             if (i6 == paramInt1) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */           if (i1 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 408 */             paramInt1 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 415 */             i3 = MainMemory.getI32(paramInt2 + 12);
/* 416 */             i6 = paramInt1 << 3;
/* 417 */             i2 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 426 */               i4 = i3 + i6;
/* 427 */               i5 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 434 */                 MainMemory.setF64(i3 + (i5 << 3), i5 == i2 ? 1.0D : 0.0D);
/* 435 */                 i5 += 1;
/* 436 */                 if (i5 == paramInt1) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */               i3 = i4;
/* 448 */               i2 += 1;
/* 449 */               if (i2 == paramInt1) {
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
/*     */ 
/* 461 */             if (i1 == 0)
/*     */             {
/*     */ 
/*     */ 
/* 465 */               paramInt1 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 472 */               j = paramInt2 + 16;
/* 473 */               i6 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 480 */                 MainMemory.setF64(MainMemory.getI32(j) + (i6 << 3), 1.0D);
/* 481 */                 i6 += 1;
/* 482 */                 if (i6 == paramInt1) {
/* 483 */                   paramInt1 = 0; break;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1117:
/*     */       
/*     */ 
/* 495 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label1124:
/*     */       
/*     */ 
/* 501 */       int i7 = i; return i7;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/linini.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */