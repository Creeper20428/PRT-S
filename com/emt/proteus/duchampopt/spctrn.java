/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class spctrn extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2880;
/*  13 */   public static final Function _instance = new spctrn();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public spctrn() { super("spctrn", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     return call(paramInt1, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     double d4 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int n = call(i, d1, d2, d3, d4, j, k, m);
/*  50 */     paramFrame.setI32(paramInt1, n);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  56 */     int i = 0;
/*     */     
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*  65 */     int i4 = 0;
/*  66 */     int i5 = 0;
/*  67 */     int i6 = 0;
/*  68 */     byte b1 = 0;
/*  69 */     byte b2 = 0;
/*     */     
/*     */ 
/*  72 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  76 */       i4 = MainMemory.alloc(1);
/*  77 */       j = MainMemory.alloc(1);
/*  78 */       k = MainMemory.alloc(1);
/*  79 */       m = MainMemory.alloc(1);
/*  80 */       n = MainMemory.alloc(4);
/*  81 */       i1 = MainMemory.alloc(8);
/*  82 */       i2 = MainMemory.alloc(8);
/*  83 */       i3 = MainMemory.alloc(8);
/*  84 */       i5 = spcspx.call(paramInt1, paramDouble1, paramDouble3, paramDouble4, i4, k, n, i1, i3);
/*  85 */       if (i5 != 0) {
/*     */         break label621;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       paramInt1 = paramInt2 + 8;
/*  97 */       MainMemory.setI8(paramInt1, (byte)0);
/*  98 */       if (MainMemory.getI8(paramInt2) == 0) {
/*  99 */         i4 = paramInt2;
/*     */         break label207;
/*     */       } else {
/* 102 */         i5 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 111 */         i5 += 1;
/* 112 */         i4 = paramInt2 + i5;
/* 113 */         if (MainMemory.getI8(i4) == 0) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label207:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 126 */       if (!com.emt.proteus.lib.api.MathUtils.ugt(paramInt1, i4)) {
/*     */         break label283;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       i5 = paramInt2 + (8 - i4);
/* 137 */       i6 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 144 */         MainMemory.setI8(i4 + i6, (byte)32);
/* 145 */         i6 += 1;
/* 146 */         if (i6 == i5) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label283:
/*     */       
/*     */ 
/*     */ 
/* 157 */       paramInt1 = paramInt2 + 5;
/* 158 */       if (SystemLibrary.strncmp(paramInt1, 18016, 3) != 0) {
/*     */         break label421;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */       b1 = MainMemory.getI8(k);
/* 169 */       switch (b1)
/*     */       {
/*     */       case 119: 
/*     */         break label384;
/*     */         
/*     */         break;
/*     */       case 97: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 180 */       MainMemory.setI32(paramInt1, 4280903);
/*     */       
/*     */       break label421;
/*     */       
/*     */       label384:
/* 185 */       MainMemory.setI32(paramInt1, 4805191);
/*     */       
/*     */ 
/*     */       break label421;
/*     */       
/* 190 */       MainMemory.setI8(paramInt1, b1);
/* 191 */       MainMemory.setI8(paramInt2 + 6, (byte)50);
/*     */       
/*     */ 
/*     */       label421:
/*     */       
/*     */ 
/* 197 */       i5 = spcxps.call(paramInt2, MainMemory.getF64(i1), paramDouble3, paramDouble4, j, m, n, paramInt3, i2);
/* 198 */       if (i5 != 0) {
/*     */         break label621;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */       b1 = MainMemory.getI8(m);
/* 210 */       if (b1 != MainMemory.getI8(k))
/*     */       {
/*     */ 
/*     */ 
/* 214 */         i5 = 2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 221 */         paramInt1 = paramInt2 + 7;
/* 222 */         if (MainMemory.getI8(paramInt1) != 63) {
/*     */           break label586;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */         b2 = MainMemory.getI8(j);
/* 233 */         if (b2 != b1) {
/*     */           break label575;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */         SystemLibrary.memcpy(paramInt2 + 4, 20928, 5, 1);
/*     */         
/*     */         break label586;
/*     */         
/*     */         label575:
/* 248 */         MainMemory.setI8(paramInt1, b2);
/*     */         
/*     */ 
/*     */         label586:
/*     */         
/*     */ 
/* 254 */         paramDouble1 = MainMemory.getF64(i2) * MainMemory.getF64(i3);
/* 255 */         paramDouble1 *= paramDouble2;
/* 256 */         MainMemory.setF64(paramInt4, paramDouble1);
/* 257 */         i = 0;
/*     */         
/*     */ 
/*     */         break label630;
/*     */       }
/*     */       
/*     */       label621:
/*     */       
/* 265 */       i = i5;
/*     */       
/*     */ 
/*     */       label630:
/*     */       
/*     */ 
/* 271 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 276 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spctrn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */