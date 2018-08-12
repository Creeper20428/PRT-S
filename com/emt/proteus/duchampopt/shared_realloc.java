/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class shared_realloc
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3130;
/*  16 */   public static final Function _instance = new shared_realloc();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public shared_realloc() { super("shared_realloc", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2);
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
/*  34 */     int k = call(i, j);
/*  35 */     paramFrame.setI32(paramInt1, k);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*  54 */     int i8 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (paramInt2 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         if (!MainMemory.getI1(459056))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */           m = shared_init.call();
/*  81 */           if (m != 0) {
/*     */             break label256;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         if (paramInt1 >= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */           if (MainMemory.getI32Aligned(459504) <= paramInt1) {
/*     */             break label824;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */           j = MainMemory.getI32Aligned(458776);
/* 113 */           i6 = MainMemory.getI32(j + (paramInt1 << 4));
/* 114 */           if (i6 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */             if (MainMemory.getI32(j + (paramInt1 << 4) + 8) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */               if (MainMemory.getI8(i6) != 74) {
/*     */                 break label824;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */               if (MainMemory.getI8(i6 + 1) != 66) {
/*     */                 break label824;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */               m = MainMemory.getI8(i6 + 2) == 1 ? 0 : 151;
/*     */               
/*     */ 
/*     */ 
/*     */               label256:
/*     */               
/*     */ 
/*     */ 
/* 162 */               if (m != 0) {
/*     */                 break label824;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */               i8 = MainMemory.getI32Aligned(458772);
/* 173 */               if ((MainMemory.getI8(i8 + paramInt1 * 28 + 24) & 0xFF & 0x4) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */                 j = MainMemory.getI32Aligned(458776);
/* 184 */                 if (MainMemory.getI32(j + (paramInt1 << 4) + 8) != -1) {
/*     */                   break label824;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */                 k = i8 + paramInt1 * 28 + 16;
/* 195 */                 i3 = paramInt2 + 16391;
/* 196 */                 if (!MathUtils.ult(MainMemory.getI32(k) + 16391 ^ i3, 16384)) {
/*     */                   break label428;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */                 MainMemory.setI32(k, paramInt2);
/* 207 */                 i = MainMemory.getI32(j + (paramInt1 << 4)) + 8;
/*     */                 
/*     */ 
/*     */                 break label831;
/*     */                 
/*     */                 label428:
/*     */                 
/* 214 */                 m = paramInt2 * paramInt1;
/* 215 */                 n = i3 & 0xC000;
/* 216 */                 i1 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 223 */                   i3 = MainMemory.getI32Aligned(459512);
/* 224 */                   if (i1 >= i3) {
/*     */                     break label824;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */                   i4 = MainMemory.getI32Aligned(459508);
/* 235 */                   i2 = (i4 + m) % i3;
/* 236 */                   MainMemory.setI32Aligned(459508, (i4 + 1) % i3);
/* 237 */                   i3 = MainMemory.getI32Aligned(459520) + (i2 + i1) % i3;
/* 238 */                   i4 = shmget.call(i3, n, 1974);
/* 239 */                   if (i4 != -1)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */                     i5 = shmat.call(i4, 0, 0);
/* 250 */                     if (i5 != -1) {
/*     */                       break;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */                     shmctl.call(i4, 0, 0);
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 266 */                   i3 = i1 + 1;
/* 267 */                   i1 = i3;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/* 272 */                 i6 = i5;
/* 273 */                 i7 = MainMemory.getI32Aligned(458776) + (paramInt1 << 4);
/* 274 */                 MainMemory.setI64(i5, MainMemory.getI64(MainMemory.getI32(i7)));
/* 275 */                 m = MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt1 * 28 + 16);
/* 276 */                 m = m <= paramInt2 ? m : paramInt2;
/* 277 */                 if (m <= 0) {
/*     */                   break label712;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */                 SystemLibrary.memcpy(i5 + 8, MainMemory.getI32(i7) + 8, m, 4);
/*     */                 
/*     */ 
/*     */                 label712:
/*     */                 
/*     */ 
/* 293 */                 shmdt.call(MainMemory.getI32(i7));
/* 294 */                 shmctl.call(MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt1 * 28 + 12), 0, 0);
/* 295 */                 i8 = MainMemory.getI32Aligned(458772);
/* 296 */                 MainMemory.setI32(i8 + paramInt1 * 28 + 16, paramInt2);
/* 297 */                 MainMemory.setI32(i8 + paramInt1 * 28 + 12, i4);
/* 298 */                 MainMemory.setI32(i8 + paramInt1 * 28 + 8, i3);
/* 299 */                 MainMemory.setI32(MainMemory.getI32Aligned(458776) + (paramInt1 << 4), i6);
/* 300 */                 i = i5 + 8;
/*     */                 break label831;
/*     */               }
/*     */             } }
/*     */         }
/*     */       }
/*     */       label824:
/* 307 */       i = 0;
/*     */       
/*     */ 
/*     */       label831:
/*     */       
/*     */ 
/* 313 */       int i9 = i; return i9;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_realloc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */