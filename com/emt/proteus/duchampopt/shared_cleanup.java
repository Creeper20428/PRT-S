/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class shared_cleanup extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3107;
/*  14 */   public static final Function _instance = new shared_cleanup();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public shared_cleanup() { super("shared_cleanup", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  21 */     call();
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     call();
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call()
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*  39 */     int i1 = 0;
/*  40 */     int i2 = 0;
/*  41 */     int i3 = 0;
/*  42 */     int i4 = 0;
/*  43 */     boolean bool = false;
/*     */     
/*     */ 
/*  46 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  50 */       i = MainMemory.alloc(24);
/*  51 */       j = MainMemory.alloc(84);
/*  52 */       if (!MainMemory.getI1(459004))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  62 */         SystemLibrary.printf(57280, new Object[0]);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  68 */       k = MainMemory.getI32Aligned(458776);
/*  69 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         if (!MainMemory.getI1(459004))
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
/*  90 */           SystemLibrary.printf(62816, new Object[0]);
/*  91 */           k = MainMemory.getI32Aligned(458776);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         if (MainMemory.getI32Aligned(459504) > 0)
/*     */         {
/* 101 */           i4 = 0;
/*     */         } else {
/*     */           break label230;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 114 */           i2 = i4 + 1;
/* 115 */           if (MainMemory.getI32(k + (i4 << 4) + 4) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */             shared_cleanup_1636.call(k, i4);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 131 */           k = MainMemory.getI32Aligned(458776);
/* 132 */           if (i2 >= MainMemory.getI32Aligned(459504))
/*     */             break;
/* 134 */           i4 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label230:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 146 */         free.call(k);
/* 147 */         MainMemory.setI32Aligned(458776, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 153 */       if (MainMemory.getI32Aligned(458772) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         if (!MainMemory.getI1(459004))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */           SystemLibrary.printf(74624, new Object[0]);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 179 */         i2 = MainMemory.getI32Aligned(459516);
/* 180 */         if (i2 != -1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */           MainMemory.setI16(i, (short)1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 196 */         m = i + 2;
/* 197 */         MainMemory.setI16(m, (short)0);
/* 198 */         n = i + 4;
/* 199 */         MainMemory.setI64(n, 0L);
/* 200 */         i1 = i + 12;
/* 201 */         MainMemory.setI64(i1, MainMemory.getI32Aligned(459504));
/* 202 */         if (SystemLibrary.fcntl(i2, 13, new int[] { i }) != -1) {
/*     */           break label422;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */         shmdt.call(MainMemory.getI32Aligned(458772));
/* 213 */         MainMemory.setI32Aligned(458772, 0);
/*     */         
/*     */         break label718;
/*     */         
/*     */         label422:
/* 218 */         i2 = MainMemory.getI32Aligned(459504);
/* 219 */         i3 = MainMemory.getI32Aligned(458772);
/* 220 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 227 */           if (i4 >= i2) {
/*     */             break label533;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */           if (MainMemory.getI32(i3 + i4 * 28 + 8) != -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */           i4 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 253 */         shmdt.call(i3);
/* 254 */         MainMemory.setI32Aligned(458772, 0);
/*     */         
/*     */         break label668;
/*     */         
/*     */         label533:
/* 259 */         if (shmctl.call(MainMemory.getI32Aligned(459524), 2, j) != 0) {
/*     */           break label648;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */         bool = com.emt.proteus.lib.api.MathUtils.ult(MainMemory.getI32(j + 72), 2);
/* 270 */         shmdt.call(MainMemory.getI32Aligned(458772));
/* 271 */         if (!bool) {
/*     */           break label632;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */         shmctl.call(MainMemory.getI32Aligned(459524), 0, 0);
/* 282 */         MainMemory.setI32Aligned(459524, -1);
/* 283 */         MainMemory.setI32Aligned(458772, 0);
/*     */         
/*     */         break label668;
/*     */         
/*     */         label632:
/* 288 */         MainMemory.setI32Aligned(458772, 0);
/*     */         
/*     */         break label668;
/*     */         
/*     */         label648:
/* 293 */         shmdt.call(MainMemory.getI32Aligned(458772));
/* 294 */         MainMemory.setI32Aligned(458772, 0);
/*     */         
/*     */ 
/*     */         label668:
/*     */         
/*     */ 
/* 300 */         MainMemory.setI16(i, (short)2);
/* 301 */         MainMemory.setI16(m, (short)0);
/* 302 */         MainMemory.setI64(n, 0L);
/* 303 */         MainMemory.setI64(i1, MainMemory.getI32Aligned(459504));
/* 304 */         SystemLibrary.fcntl(MainMemory.getI32Aligned(459516), 13, new int[] { i });
/*     */       }
/*     */       
/*     */ 
/*     */       label718:
/*     */       
/* 310 */       MainMemory.setI32Aligned(459524, -1);
/* 311 */       i2 = MainMemory.getI32Aligned(459516);
/* 312 */       if (i2 != -1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */         if (!MainMemory.getI1(459004))
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
/* 333 */           SystemLibrary.printf(59968, new Object[0]);
/* 334 */           i2 = MainMemory.getI32Aligned(459516);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */         SystemLibrary.close(i2);
/* 343 */         MainMemory.setI32Aligned(459516, -1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 349 */       MainMemory.setI32Aligned(459520, 0);
/* 350 */       MainMemory.setI32Aligned(459504, 0);
/* 351 */       MainMemory.setI32Aligned(459512, 0);
/* 352 */       MainMemory.setI1(459056, false);
/* 353 */       if (!MainMemory.getI1(459004)) {
/*     */         break label859;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label870;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label859:
/*     */       
/*     */ 
/*     */ 
/* 369 */       SystemLibrary.puts(48096);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label870:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 380 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_cleanup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */