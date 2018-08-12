/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
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
/*     */ public final class ffdcol
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3146;
/*  23 */   public static final Function _instance = new ffdcol();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffdcol() { super("ffdcol", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int m = call(i, j, k);
/*  45 */     paramFrame.setI32(paramInt1, m);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  51 */     int i = 0;
/*     */     
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
/*  64 */     long l1 = 0L;
/*  65 */     long l2 = 0L;
/*  66 */     long l3 = 0L;
/*  67 */     long l4 = 0L;
/*  68 */     long l5 = 0L;
/*  69 */     long l6 = 0L;
/*  70 */     long l7 = 0L;
/*  71 */     int i8 = 0;
/*  72 */     int i9 = 0;
/*     */     
/*     */ 
/*  75 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  79 */       j = MainMemory.alloc(81);
/*  80 */       k = MainMemory.alloc(71);
/*  81 */       m = MainMemory.alloc(4);
/*  82 */       n = MainMemory.alloc(8);
/*  83 */       i1 = MainMemory.alloc(72);
/*  84 */       i2 = MainMemory.alloc(73);
/*  85 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         i5 = MainMemory.getI32(paramInt1);
/*  96 */         i3 = paramInt1 + 4;
/*  97 */         i4 = MainMemory.getI32(i3);
/*  98 */         if (i5 != MainMemory.getI32(i4 + 64)) {
/*     */           break label223;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         if (MainMemory.getI64(i4 + 112) != -1L) {
/*     */           break label239;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         if (ffrdef.call(paramInt1, paramInt3) > 0) {
/*     */           break label1253;
/*     */         } else {
/*     */           break label239;
/*     */         }
/*     */         
/*     */ 
/*     */         label223:
/*     */         
/* 127 */         ffmahd.call(paramInt1, i5 + 1, 0, paramInt3);
/*     */         
/*     */ 
/*     */         label239:
/*     */         
/*     */ 
/* 133 */         i4 = MainMemory.getI32(i3);
/* 134 */         i9 = MainMemory.getI32(i4 + 68);
/* 135 */         if (i9 != 0) {
/*     */           break label297;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         ffxmsg.call(5, 135552);
/* 146 */         MainMemory.setI32(paramInt3, 235);
/*     */         
/*     */         break label1253;
/*     */         
/*     */         label297:
/* 151 */         if (paramInt2 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           i5 = MainMemory.getI32(i4 + 916);
/* 162 */           if (i5 >= paramInt2) {
/*     */             break label359;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */         MainMemory.setI32(paramInt3, 302);
/*     */         
/*     */         break label1253;
/*     */         
/*     */         label359:
/* 177 */         i6 = MainMemory.getI32(i4 + 944);
/* 178 */         i7 = paramInt2 + -1;
/* 179 */         l1 = MainMemory.getI64(i6 + i7 * 152 + 72);
/* 180 */         if (i9 != 1) {
/*     */           break label600;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         i9 = MainMemory.getI32(i6 + i7 * 152 + 148);
/* 191 */         l2 = i9;
/* 192 */         if (i5 <= paramInt2) {
/*     */           break label499;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 202 */         l2 = ((int)MainMemory.getI64(i6 + paramInt2 * 152 + 72) - i9 - (int)l1 > 0 ? 1 : 0) + l2;
/*     */         
/*     */ 
/*     */         break label667;
/*     */         
/*     */         label499:
/*     */         
/* 209 */         if (paramInt2 <= 1) {
/*     */           break label667;
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
/* 221 */         i5 = paramInt2 + -2;
/* 222 */         if ((int)l1 - MainMemory.getI32(i6 + i5 * 152 + 148) - (int)MainMemory.getI64(i6 + i5 * 152 + 72) <= 0) {
/*     */           break label667;
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
/* 234 */         l2 += 1L;
/* 235 */         l1 += -1L;
/*     */         
/*     */ 
/*     */         break label667;
/*     */         
/*     */         label600:
/*     */         
/* 242 */         if (i5 <= paramInt2) {
/*     */           break label648;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */         l2 = MainMemory.getI64(i6 + paramInt2 * 152 + 72) - l1;
/*     */         
/*     */ 
/*     */         break label667;
/*     */         
/*     */         label648:
/*     */         
/* 259 */         l2 = MainMemory.getI64(i4 + 936) - l1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label667:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 269 */         l3 = MainMemory.getI64(i4 + 936);
/* 270 */         l4 = MainMemory.getI64(i4 + 928);
/* 271 */         l5 = MainMemory.getI64(i4 + 956) + MainMemory.getI64(i4 + 948);
/* 272 */         l6 = l4 * l2;
/* 273 */         l7 = l5 + 2879L;
/* 274 */         i5 = (int)((l6 - l5 - l7 % 2880L + l7) / 2880L);
/* 275 */         ffcdel.call(paramInt1, l3, l4, l2, l1, paramInt3);
/* 276 */         i4 = MainMemory.getI32(i3);
/* 277 */         l4 = MainMemory.getI64(i4 + 956);
/* 278 */         if (l4 <= 0L) {
/*     */           break label840;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */         if (ffshft.call(paramInt1, MainMemory.getI64(i4 + 112) + MainMemory.getI64(i4 + 948), l4, 0L - l6, paramInt3) <= 0)
/*     */         {
/*     */           label840:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */           if (i5 <= 0) {
/*     */             break label871;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */           ffdblk.call(paramInt1, i5, paramInt3);
/*     */           
/*     */ 
/*     */           label871:
/*     */           
/*     */ 
/* 314 */           i8 = MainMemory.getI32(i3) + 948;
/* 315 */           MainMemory.setI64(i8, MainMemory.getI64(i8) - l6);
/* 316 */           MainMemory.setI32(m, 0);
/* 317 */           ffmkyj.call(paramInt1, 27296, MainMemory.getI64(MainMemory.getI32(i3) + 948) << 32 >> 32, 14112, m);
/* 318 */           i4 = MainMemory.getI32(i3);
/* 319 */           i5 = MainMemory.getI32(i4 + 916);
/* 320 */           if ((MainMemory.getI32(i4 + 68) != 1) || (i5 >= 1))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */             i9 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 338 */               i5 = i9 + 1;
/* 339 */               i9 += 2;
/* 340 */               ffkeyn.call(27328, i5, i1, paramInt3);
/* 341 */               if (MainMemory.getI32(paramInt3) <= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */                 MainMemory.setI8(k, (byte)0);
/* 352 */                 MainMemory.setI8(i2, (byte)0);
/* 353 */                 if (ffgcrd.call(paramInt1, i1, j, paramInt3) <= 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */                   ffpsvc.call(j, k, i2, paramInt3);
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 369 */                 ffc2j.call(k, n, paramInt3);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 375 */               l6 = MainMemory.getI64(n);
/* 376 */               if (l6 <= l1) {
/*     */                 break label1149;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */               l6 -= l2;
/* 387 */               MainMemory.setI64(n, l6);
/* 388 */               ffmkyj.call(paramInt1, i1, l6, 14112, paramInt3);
/*     */               
/*     */ 
/*     */               label1149:
/*     */               
/*     */ 
/* 394 */               i7 = MainMemory.getI32(MainMemory.getI32(i3) + 916);
/* 395 */               if (i7 < i9) {
/* 396 */                 i5 = i7; break;
/*     */               }
/*     */               
/*     */ 
/* 400 */               i9 = i5;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */           ffmkyj.call(paramInt1, 41248, i5 + -1, 14112, paramInt3);
/* 409 */           ffmkyj.call(paramInt1, 36000, l3 - l2, 14112, paramInt3);
/* 410 */           ffkshf.call(paramInt1, paramInt2, MainMemory.getI32(MainMemory.getI32(i3) + 916), -1, paramInt3);
/* 411 */           ffrdef.call(paramInt1, paramInt3);
/*     */         }
/*     */       }
/*     */       
/*     */       label1253:
/*     */       
/* 417 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 423 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 428 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdcol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */