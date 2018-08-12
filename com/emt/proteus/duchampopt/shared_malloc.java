/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class shared_malloc
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3139;
/*  21 */   public static final Function _instance = new shared_malloc();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public shared_malloc() { super("shared_malloc", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  28 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = call(i);
/*  37 */     paramFrame.setI32(paramInt1, j);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  43 */     int i = 0;
/*     */     
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*  53 */     int i5 = 0;
/*  54 */     int i6 = 0;
/*  55 */     boolean bool = false;
/*  56 */     int i7 = 0;
/*  57 */     int i8 = 0;
/*     */     
/*     */ 
/*  60 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       j = MainMemory.alloc(6);
/*  65 */       if (!MainMemory.getI1(459056))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         k = shared_init.call();
/*  76 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*  80 */           paramInt = k;
/*     */           
/*     */ 
/*     */           break label1248;
/*     */         }
/*     */       }
/*     */       
/*  87 */       if (!MainMemory.getI1(459004))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         SystemLibrary.printf(78720, new Object[] { Integer.valueOf(2896), Integer.valueOf(12) });
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 103 */       if (MainMemory.getI32Aligned(458772) == 0) {
/* 104 */         paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 114 */         i8 = MainMemory.getI32Aligned(458776);
/* 115 */         if ((i8 == 0) || (paramInt < 0)) {
/* 116 */           paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 126 */         else if (MainMemory.getI32Aligned(459504) <= paramInt)
/*     */         {
/*     */ 
/*     */ 
/* 130 */           paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 137 */         else if (MainMemory.getI32(i8 + (paramInt << 4) + 4) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 141 */           paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 148 */         else if (F277734.call(paramInt, 3) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 152 */           paramInt = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 159 */           if (MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt * 28 + 8) != -1) {
/*     */             break label1200;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */           if (paramInt == -1) {
/* 170 */             paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 180 */             if (!MainMemory.getI1(459004))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */               SystemLibrary.printf(41120, new Object[] { Integer.valueOf(paramInt) });
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 196 */             k = paramInt * 2896;
/* 197 */             m = j + 2;
/* 198 */             n = j + 4;
/* 199 */             i1 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 206 */               i2 = MainMemory.getI32Aligned(459512);
/* 207 */               if (i1 >= i2) {
/*     */                 break label1182;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */               i3 = MainMemory.getI32Aligned(459508);
/* 218 */               i6 = (i3 + k) % i2;
/* 219 */               MainMemory.setI32Aligned(459508, (i3 + 1) % i2);
/* 220 */               i2 = MainMemory.getI32Aligned(459520) + (i6 + i1) % i2;
/* 221 */               if (!MainMemory.getI1(459004))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */                 SystemLibrary.printf(41152, new Object[] { Integer.valueOf(i2) });
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 237 */               i3 = shmget.call(i2, 16384, 1974);
/* 238 */               if (!MainMemory.getI1(459004))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */                 SystemLibrary.printf(49952, new Object[] { Integer.valueOf(i3) });
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 254 */               if (i3 != -1)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */                 i4 = shmat.call(i3, 0, 0);
/* 265 */                 if (!MainMemory.getI1(459004))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */                   SystemLibrary.printf(27232, new Object[] { Integer.valueOf(i4) });
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 281 */                 if (i4 != -1) {
/*     */                   break label649;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */                 shmctl.call(i3, 0, 0);
/*     */                 
/*     */                 break label959;
/*     */                 
/*     */                 label649:
/* 296 */                 i5 = MainMemory.getI32Aligned(458772);
/* 297 */                 i6 = semget.call(i2, 1, 1974);
/* 298 */                 MainMemory.setI32(i5 + paramInt * 28, i6);
/* 299 */                 if (i6 != -1) {
/*     */                   break label722;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */                 shmdt.call(i4);
/* 310 */                 shmctl.call(i3, 0, 0);
/*     */                 
/*     */                 break label959;
/*     */                 
/*     */                 label722:
/* 315 */                 bool = MainMemory.getI1(459004);
/* 316 */                 i6 = bool ? 1 : 0;
/* 317 */                 if (!bool)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */                   SystemLibrary.printf(41184, new Object[] { Integer.valueOf(MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt * 28)) });
/* 329 */                   i6 = MainMemory.getI1(459004) ? 1 : 0;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */                 i7 = MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt * 28);
/* 338 */                 if (i6 != 1)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */                   SystemLibrary.printf(59904, new Object[0]);
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 354 */                 if (i7 != -1)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 364 */                   MainMemory.setI16(j, (short)0);
/* 365 */                   MainMemory.setI16(m, (short)1);
/* 366 */                   MainMemory.setI16(n, (short)4096);
/* 367 */                   if (semop.call(i7, j, 1) != -1) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 377 */                 semctl.call(MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt * 28), 0, 0, new Object[] { Integer.valueOf(-1) });
/* 378 */                 shmdt.call(i4);
/* 379 */                 shmctl.call(i3, 0, 0);
/*     */               }
/*     */               
/*     */ 
/*     */               label959:
/*     */               
/* 385 */               i1 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 391 */             MainMemory.setI8(i4 + 2, (byte)1);
/* 392 */             MainMemory.setI8(i4, (byte)74);
/* 393 */             MainMemory.setI8(i4 + 1, (byte)66);
/* 394 */             MainMemory.setI32(i4 + 4, paramInt);
/* 395 */             shmdt.call(i4);
/* 396 */             i8 = MainMemory.getI32Aligned(458776);
/* 397 */             MainMemory.setI32(i8 + (paramInt << 4), 0);
/* 398 */             MainMemory.setI32(i8 + (paramInt << 4) + 4, 1);
/* 399 */             MainMemory.setI32(i8 + (paramInt << 4) + 8, 0);
/* 400 */             MainMemory.setI32(i8 + (paramInt << 4) + 12, 0);
/* 401 */             i5 = MainMemory.getI32Aligned(458772);
/* 402 */             MainMemory.setI32(i5 + paramInt * 28 + 12, i3);
/* 403 */             MainMemory.setI32(i5 + paramInt * 28 + 16, 2896);
/* 404 */             MainMemory.setI8(i5 + paramInt * 28 + 24, (byte)12);
/* 405 */             MainMemory.setI32(i5 + paramInt * 28 + 4, i2);
/* 406 */             MainMemory.setI32(i5 + paramInt * 28 + 8, i2);
/* 407 */             MainMemory.setI32(i5 + paramInt * 28 + 20, 0);
/* 408 */             F276460.call(paramInt, 1);
/* 409 */             i = paramInt;
/*     */             
/*     */ 
/*     */             break label1255;
/*     */             
/*     */             label1182:
/*     */             
/* 416 */             F276460.call(paramInt, 1);
/* 417 */             i = -1;
/*     */             
/*     */ 
/*     */             break label1255;
/*     */             
/*     */             label1200:
/*     */             
/* 424 */             F276460.call(paramInt, 1);
/* 425 */             if (MainMemory.getI1(459004)) {
/* 426 */               paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 436 */               SystemLibrary.printf(89056, new Object[0]);
/* 437 */               i = -1;
/*     */               
/*     */               break label1255;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       label1248:
/* 445 */       i = paramInt;
/*     */       
/*     */ 
/*     */       label1255:
/*     */       
/*     */ 
/* 451 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 456 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_malloc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */