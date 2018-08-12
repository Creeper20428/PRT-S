/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class shared_init
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3122;
/*  15 */   public static final Function _instance = new shared_init();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public shared_init() { super("shared_init", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  22 */     return call();
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = call();
/*  28 */     paramFrame.setI32(paramInt1, i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call()
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*     */     
/*     */ 
/*  45 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  49 */       j = MainMemory.alloc(1000);
/*  50 */       MainMemory.setI1(459056, true);
/*  51 */       MainMemory.setI1(459004, true);
/*  52 */       MainMemory.setI32Aligned(459520, 0);
/*  53 */       i2 = SystemLibrary.getenv(59936);
/*  54 */       if (i2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */         i1 = SystemLibrary.atoi(i2);
/*  65 */         if (i1 != 0) {
/*     */           break label106;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       i1 = 14011963;
/*     */       
/*     */ 
/*     */ 
/*     */       label106:
/*     */       
/*     */ 
/*  83 */       MainMemory.setI32Aligned(459520, i1);
/*  84 */       MainMemory.setI32Aligned(459504, 0);
/*  85 */       i2 = SystemLibrary.getenv(58720);
/*  86 */       if (i2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */         i1 = SystemLibrary.atoi(i2);
/*  97 */         if (i1 != 0) {
/*     */           break label175;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       i1 = 16;
/*     */       
/*     */ 
/*     */ 
/*     */       label175:
/*     */       
/*     */ 
/* 115 */       MainMemory.setI32Aligned(459504, i1);
/* 116 */       if (!MainMemory.getI1(459004))
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
/* 127 */         SystemLibrary.printf(49920, new Object[] { Integer.valueOf(i1) });
/* 128 */         i1 = MainMemory.getI32Aligned(459504);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       MainMemory.setI32Aligned(459512, i1 * 3);
/* 137 */       if (MainMemory.getI32Aligned(459516) != -1) {
/*     */         break label461;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */       if (!MainMemory.getI1(459004))
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
/* 158 */         SystemLibrary.printf(55296, new Object[0]);
/* 159 */         i1 = MainMemory.getI32Aligned(459504);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */       SystemLibrary.sprintf(j, 45600, new Object[] { Integer.valueOf(64096), Integer.valueOf(MainMemory.getI32Aligned(459520)), Integer.valueOf(i1) });
/* 168 */       i1 = umask.call(0);
/* 169 */       MainMemory.setI32Aligned(459516, SystemLibrary.open(j, 706, new int[] { 438 }));
/* 170 */       umask.call(i1);
/* 171 */       if (MainMemory.getI32Aligned(459516) != -1) {
/*     */         break label453;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */       i1 = SystemLibrary.open(j, 514, new int[] { 438 });
/* 182 */       MainMemory.setI32Aligned(459516, i1);
/* 183 */       if (i1 == -1) {
/* 184 */         i1 = 158;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 194 */         shared_init_1638.call();
/*     */         
/*     */         break label461;
/*     */         
/*     */         label453:
/* 199 */         shared_init_1639.call();
/*     */         
/*     */ 
/*     */         label461:
/*     */         
/*     */ 
/* 205 */         if (MainMemory.getI32Aligned(459524) != -1) {
/*     */           break label877;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */         if (!MainMemory.getI1(459004))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */           SystemLibrary.printf(67840, new Object[0]);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 231 */         i1 = shmget.call(MainMemory.getI32Aligned(459520), MainMemory.getI32Aligned(459504) * 28, 1974);
/* 232 */         MainMemory.setI32Aligned(459524, i1);
/* 233 */         if (i1 != -1) {
/*     */           break label662;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */         i1 = shmget.call(MainMemory.getI32Aligned(459520), MainMemory.getI32Aligned(459504) * 28, 438);
/* 244 */         MainMemory.setI32Aligned(459524, i1);
/* 245 */         if (i1 == -1) {
/* 246 */           i1 = 155;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 256 */           i2 = shmat.call(i1, 0, 0);
/* 257 */           MainMemory.setI32Aligned(458772, i2);
/* 258 */           if (i2 == -1) {
/* 259 */             i1 = 155;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 269 */             shared_init_1642.call();
/*     */             
/*     */             break label877;
/*     */             
/*     */             label662:
/* 274 */             i2 = shmat.call(i1, 0, 0);
/* 275 */             k = i2;
/* 276 */             MainMemory.setI32Aligned(458772, k);
/* 277 */             if (i2 == -1) {
/* 278 */               i1 = 155;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 288 */               i1 = MainMemory.getI32Aligned(459504);
/* 289 */               if (i1 > 0) {
/* 290 */                 m = 0;
/*     */               } else {
/*     */                 break label869;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 301 */                 n = m + 1;
/* 302 */                 if ((m <= -1) || (i1 <= m)) {
/*     */                   break label849;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */                 MainMemory.setI32(k + m * 28 + 8, -1);
/* 313 */                 MainMemory.setI32(k + m * 28 + 12, -1);
/* 314 */                 MainMemory.setI32(k + m * 28, -1);
/* 315 */                 MainMemory.setI32(k + m * 28 + 4, -1);
/* 316 */                 MainMemory.setI32(k + m * 28 + 20, 0);
/* 317 */                 MainMemory.setI32(k + m * 28 + 16, 0);
/* 318 */                 MainMemory.setI8(k + m * 28 + 24, (byte)0);
/*     */                 
/*     */ 
/*     */                 label849:
/*     */                 
/*     */ 
/* 324 */                 if (n >= i1) break;
/* 325 */                 m = n;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label869:
/*     */               
/*     */ 
/*     */ 
/* 335 */               shared_init_1641.call();
/*     */               
/*     */ 
/*     */               label877:
/*     */               
/*     */ 
/* 341 */               if (MainMemory.getI32Aligned(458776) != 0) {
/*     */                 break label1074;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */               if (!MainMemory.getI1(459004))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */                 SystemLibrary.printf(58752, new Object[0]);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 367 */               i1 = MainMemory.getI32Aligned(459504);
/* 368 */               i2 = malloc.call(i1 << 4);
/* 369 */               i3 = i2;
/* 370 */               MainMemory.setI32Aligned(458776, i3);
/* 371 */               if (i2 == 0) {
/* 372 */                 i1 = 156;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 382 */                 if (i1 > 0) {
/* 383 */                   m = 0;
/*     */                 } else {
/*     */                   break label1066;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 do
/*     */                 {
/* 394 */                   MainMemory.setI32(i3 + (m << 4), 0);
/* 395 */                   MainMemory.setI32(i3 + (m << 4) + 4, 0);
/* 396 */                   MainMemory.setI32(i3 + (m << 4) + 8, 0);
/* 397 */                   MainMemory.setI32(i3 + (m << 4) + 12, 0);
/* 398 */                   m += 1;
/* 399 */                 } while (m < i1);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1066:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 410 */                 shared_init_1640.call();
/*     */                 
/*     */ 
/*     */                 label1074:
/*     */                 
/*     */ 
/* 416 */                 SystemLibrary.__cxa_atexit(3107);
/* 417 */                 if (MainMemory.getI1(459004)) {
/* 418 */                   i1 = 0;
/*     */                 } else {
/*     */                   break label1118;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 429 */       i = i1;
/*     */       
/*     */ 
/*     */       break label1131;
/*     */       
/*     */       label1118:
/*     */       
/* 436 */       SystemLibrary.puts(48096);
/* 437 */       i = 0;
/*     */       
/*     */ 
/*     */       label1131:
/*     */       
/*     */ 
/* 443 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 448 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_init.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */