/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class tabfree extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2913;
/*  12 */   public static final Function _instance = new tabfree();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public tabfree() { super("tabfree", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*  44 */     int i5 = 0;
/*  45 */     int i6 = 0;
/*  46 */     int i7 = 0;
/*  47 */     int i8 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (paramInt != 0) {
/*     */         break label63;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label973;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label63:
/*     */       
/*     */ 
/*     */ 
/*  69 */       if (MainMemory.getI32(paramInt) != -1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         i = paramInt + 56;
/*  80 */         if (MainMemory.getI32(i) <= 0) {
/*     */           break label191;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         i5 = paramInt + 84;
/*  91 */         i7 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  98 */           i8 = i7 + 1;
/*  99 */           j = MainMemory.getI32(i5) + (i7 << 2);
/* 100 */           if (MainMemory.getI32(j) != 1) {
/*     */             break label168;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */           MainMemory.setI32(j, 0);
/*     */           
/*     */ 
/*     */           label168:
/*     */           
/*     */ 
/* 116 */           if (MainMemory.getI32(i) <= i8) break;
/* 117 */           i7 = i8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label191:
/*     */         
/*     */ 
/*     */ 
/* 127 */         j = paramInt + 88;
/* 128 */         k = MainMemory.getI32(j);
/* 129 */         if (k != 1) {
/*     */           break label231;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         MainMemory.setI32(j, 0);
/* 141 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label231:
/*     */         
/*     */ 
/* 148 */         if (MainMemory.getI32(paramInt + 52) != 137) {
/*     */           break label749;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         i1 = paramInt + 8;
/* 159 */         m = MainMemory.getI32(paramInt + 68);
/* 160 */         if (MainMemory.getI32(i1) != m) {
/*     */           break label306;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */         MainMemory.setI32(i1, 0);
/*     */         
/*     */ 
/*     */         label306:
/*     */         
/*     */ 
/* 176 */         n = paramInt + 12;
/* 177 */         i1 = paramInt + 72;
/* 178 */         i2 = MainMemory.getI32(i1);
/* 179 */         if (MainMemory.getI32(n) != i2) {
/*     */           break label359;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */         MainMemory.setI32(n, 0);
/*     */         
/*     */ 
/*     */         label359:
/*     */         
/*     */ 
/* 195 */         i6 = paramInt + 16;
/* 196 */         i3 = paramInt + 76;
/* 197 */         if (MainMemory.getI32(i6) != MainMemory.getI32(i3)) {
/*     */           break label408;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */         MainMemory.setI32(i6, 0);
/*     */         
/*     */ 
/*     */         label408:
/*     */         
/*     */ 
/* 213 */         i4 = paramInt + 20;
/* 214 */         i5 = paramInt + 80;
/* 215 */         if (MainMemory.getI32(i4) != MainMemory.getI32(i5)) {
/*     */           break label457;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */         MainMemory.setI32(i4, 0);
/*     */         
/*     */ 
/*     */         label457:
/*     */         
/*     */ 
/* 231 */         i6 = paramInt + 24;
/* 232 */         if (MainMemory.getI32(i6) != k) {
/*     */           break label496;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */         MainMemory.setI32(i6, 0);
/*     */         
/*     */ 
/*     */         label496:
/*     */         
/*     */ 
/* 248 */         if (m == 0) {
/* 249 */           m = i2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 259 */           free.call(m);
/* 260 */           m = MainMemory.getI32(i1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */         if (m != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */           free.call(m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 284 */         k = MainMemory.getI32(i3);
/* 285 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */           free.call(k);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 301 */         i3 = MainMemory.getI32(i5);
/* 302 */         if (i3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */           if (MainMemory.getI32(i) <= 0) {
/*     */             break label720;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */           i4 = paramInt + 84;
/* 324 */           i7 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 331 */             i8 = i7 + 1;
/* 332 */             k = MainMemory.getI32(MainMemory.getI32(i4) + (i7 << 2));
/* 333 */             if (k != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */               free.call(k);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 349 */             if (MainMemory.getI32(i) <= i8) break;
/* 350 */             i7 = i8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */           i3 = MainMemory.getI32(i5);
/*     */           
/*     */ 
/*     */ 
/*     */           label720:
/*     */           
/*     */ 
/*     */ 
/* 368 */           free.call(i3);
/* 369 */           free.call(MainMemory.getI32(paramInt + 84));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 375 */         tabfree_1681.call(j);
/*     */         
/*     */ 
/*     */         label749:
/*     */         
/*     */ 
/* 381 */         i = MainMemory.getI32(paramInt + 36);
/* 382 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */           free.call(i);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 398 */         i = MainMemory.getI32(paramInt + 40);
/* 399 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */           free.call(i);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 415 */         k = MainMemory.getI32(paramInt + 44);
/* 416 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */           free.call(k);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 432 */         tabfree_1680.call(paramInt);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 438 */       MainMemory.setI32(paramInt + 52, 0);
/* 439 */       MainMemory.setI32(paramInt + 56, 0);
/* 440 */       MainMemory.setI32(paramInt + 60, 0);
/* 441 */       MainMemory.setI32(paramInt + 68, 0);
/* 442 */       MainMemory.setI32(paramInt + 72, 0);
/* 443 */       MainMemory.setI32(paramInt + 76, 0);
/* 444 */       MainMemory.setI32(paramInt + 80, 0);
/* 445 */       MainMemory.setI32(paramInt + 84, 0);
/* 446 */       MainMemory.setI32(paramInt + 88, 0);
/* 447 */       MainMemory.setI32(paramInt + 36, 0);
/* 448 */       MainMemory.setI32(paramInt + 40, 0);
/* 449 */       MainMemory.setI32(paramInt + 44, 0);
/* 450 */       MainMemory.setI32(paramInt + 48, 0);
/* 451 */       MainMemory.setI32(paramInt + 64, 0);
/* 452 */       MainMemory.setI32(paramInt, 0);
/*     */       
/*     */ 
/*     */       label973:
/*     */       
/*     */ 
/* 458 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tabfree.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */