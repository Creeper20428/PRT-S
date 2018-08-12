/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class F311597
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3206;
/*  19 */   public static final Function _instance = new F311597();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public F311597() { super("F311597", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  26 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i1 = call(i, j, k, m, n);
/*  47 */     paramFrame.setI32(paramInt1, i1);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  53 */     int i = 0;
/*     */     
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*  63 */     int i5 = 0;
/*  64 */     int i6 = 0;
/*  65 */     int i7 = 0;
/*  66 */     int i8 = 0;
/*  67 */     int i9 = 0;
/*     */     
/*     */ 
/*  70 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  74 */       j = MainMemory.alloc(2);
/*  75 */       k = MainMemory.alloc(1);
/*  76 */       m = MainMemory.alloc(80);
/*  77 */       n = MainMemory.alloc(4);
/*  78 */       i1 = MainMemory.alloc(4);
/*  79 */       i2 = MainMemory.getI32Aligned(470820);
/*  80 */       MainMemory.setI32(n, 0);
/*  81 */       if (MainMemory.getI32Aligned(470848) != 0) {
/*     */         break label137;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       F311597_146.call(paramInt3, n, paramInt5, paramInt4, paramInt1, paramInt2, i2, i1);
/*     */       
/*     */       break label877;
/*     */       
/*     */       label137:
/*  96 */       i3 = i2 + paramInt1 * 244 + 92;
/*  97 */       i7 = MainMemory.getI32(i3);
/*  98 */       i4 = i7 * paramInt3;
/*  99 */       i5 = MainMemory.getI32(i2 + paramInt1 * 244 + 80);
/* 100 */       switch (i5) {
/*     */       case 11: 
/*     */         break label487;
/*     */         break;
/*     */       case 14: 
/*     */         break label435;
/*     */         break;
/*     */       case 16: 
/*     */         break label383;
/*     */         break;
/*     */       case 41: 
/*     */         break label330;
/*     */         break;
/*     */       case 82:  break; }
/* 114 */       ffgcld.call(MainMemory.getI32(i2 + paramInt1 * 244), MainMemory.getI32(i2 + paramInt1 * 244 + 4), paramInt2, 1L, i4, 1, 2, 0.0D, paramInt4, paramInt5, i1, n);
/*     */       
/*     */       break label877;
/*     */       
/*     */       label330:
/* 119 */       ffgclj.call(MainMemory.getI32(i2 + paramInt1 * 244), MainMemory.getI32(i2 + paramInt1 * 244 + 4), paramInt2, 1L, i4, 1, 2, 0, paramInt4, paramInt5, i1, n);
/*     */       
/*     */       break label877;
/*     */       
/*     */       label383:
/* 124 */       ffgcls.call(MainMemory.getI32(i2 + paramInt1 * 244), MainMemory.getI32(i2 + paramInt1 * 244 + 4), paramInt2, 1L, paramInt3, 2, j, paramInt4, paramInt5, i1, n);
/*     */       
/*     */       break label877;
/*     */       
/*     */       label435:
/* 129 */       ffgcll.call(MainMemory.getI32(i2 + paramInt1 * 244), MainMemory.getI32(i2 + paramInt1 * 244 + 4), paramInt2, 1L, i4, 2, (byte)0, paramInt4, paramInt5, i1, n);
/*     */       
/*     */       break label877;
/*     */       
/*     */       label487:
/* 134 */       i7 = (i7 + 7) / 8 * paramInt3;
/* 135 */       paramInt5 = malloc.call(i7);
/* 136 */       ffgclb.call(MainMemory.getI32(i2 + paramInt1 * 244), MainMemory.getI32(i2 + paramInt1 * 244 + 4), paramInt2, 1L, i7, 1, 1, (byte)0, paramInt5, k, i1, n);
/* 137 */       paramInt1 = MainMemory.getI32(i3);
/* 138 */       if (paramInt3 <= 0) {
/*     */         break label776;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       paramInt2 = (paramInt1 + 7) / 8;
/* 149 */       i6 = paramInt1 > 0 ? 1 : 0;
/* 150 */       i7 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 157 */         i8 = paramInt4 + (i7 << 2);
/* 158 */         if (i6 == 0)
/*     */         {
/*     */ 
/*     */ 
/* 162 */           i4 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 169 */           i4 = paramInt2 * i7 + 1;
/*     */           
/* 171 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 179 */             i5 = i9 % 8;
/* 180 */             MainMemory.setI8(MainMemory.getI32(i8) + i9, (byte)((1 << 7 - i5 & MainMemory.getI8(paramInt5 + i4) & 0xFF) == 0 ? 48 : 49));
/* 181 */             i9 += 1;
/* 182 */             i4 = (i5 == 7 ? 1 : 0) + i4;
/* 183 */             if (i9 == paramInt1) {
/* 184 */               i4 = paramInt1; break;
/*     */             }
/*     */           }
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
/* 197 */         MainMemory.setI8(MainMemory.getI32(i8) + i4, (byte)0);
/* 198 */         i7 += 1;
/* 199 */         if (i7 == paramInt3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label776:
/*     */       
/*     */ 
/*     */ 
/* 210 */       if (paramInt5 != 0) {
/*     */         break label831;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */       SystemLibrary.printf(87904, new Object[] { Integer.valueOf(43520), Integer.valueOf(2543) });
/*     */       
/*     */       break label877;
/*     */       
/*     */       label831:
/* 225 */       free.call(paramInt5);
/*     */       
/*     */ 
/*     */       break label877;
/*     */       
/* 230 */       SystemLibrary.sprintf(m, 84128, new Object[] { Integer.valueOf(i5) });
/* 231 */       ffxmsg.call(5, m);
/*     */       
/*     */ 
/*     */       label877:
/*     */       
/*     */ 
/* 237 */       paramInt1 = MainMemory.getI32(n);
/* 238 */       if (paramInt1 != 0) {
/*     */         break label913;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */       i = 0;
/*     */       
/*     */ 
/*     */       break label927;
/*     */       
/*     */       label913:
/*     */       
/* 255 */       MainMemory.setI32Aligned(470852, paramInt1);
/* 256 */       i = -1;
/*     */       
/*     */ 
/*     */       label927:
/*     */       
/*     */ 
/* 262 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 267 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F311597.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */