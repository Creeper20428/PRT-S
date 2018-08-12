/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object2D10calcParamsEv extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 333;
/*  11 */   public static final Function _instance = new _ZN9PixelInfo8Object2D10calcParamsEv();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN9PixelInfo8Object2D10calcParamsEv() { super("_ZN9PixelInfo8Object2D10calcParamsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     call(paramInt);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     call(i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*  39 */     int i1 = 0;
/*  40 */     int i2 = 0;
/*  41 */     int i3 = 0;
/*  42 */     float f1 = 0.0F;
/*  43 */     int i4 = 0;
/*  44 */     int i5 = 0;
/*  45 */     int i6 = 0;
/*  46 */     int i7 = 0;
/*  47 */     int i8 = 0;
/*  48 */     float f2 = 0.0F;
/*  49 */     int i9 = 0;
/*  50 */     int i10 = 0;
/*  51 */     int i11 = 0;
/*  52 */     float f3 = 0.0F;
/*  53 */     int i12 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       i = paramInt + 20;
/*  60 */       MainMemory.setF32(i, 0.0F);
/*  61 */       j = paramInt + 24;
/*  62 */       MainMemory.setF32(j, 0.0F);
/*  63 */       k = MainMemory.getI32(paramInt + 4);
/*  64 */       m = MainMemory.getI32(paramInt + 8);
/*  65 */       if (k != m)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         n = paramInt + 40;
/*  76 */         i1 = paramInt + 36;
/*  77 */         i2 = paramInt + 28;
/*  78 */         i3 = paramInt + 32;
/*  79 */         f1 = 0.0F;
/*  80 */         f2 = 0.0F;
/*  81 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  90 */           i4 = i9 + 1;
/*  91 */           i5 = k + (i4 << 4);
/*  92 */           i6 = k + (i9 << 4) + 4;
/*  93 */           i7 = k + (i9 << 4) + 8;
/*  94 */           i8 = k + (i9 << 4) + 12;
/*  95 */           if (k + (i9 << 4) != k) {
/*     */             break label275;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           i9 = MainMemory.getI32(i6);
/* 106 */           MainMemory.setI32(n, i9);
/* 107 */           MainMemory.setI32(i1, i9);
/* 108 */           MainMemory.setI32(i2, MainMemory.getI32(i7));
/* 109 */           MainMemory.setI32(i3, MainMemory.getI32(i7) + -1 + MainMemory.getI32(i8));
/*     */           
/*     */           break label415;
/*     */           
/*     */           label275:
/* 114 */           i9 = MainMemory.getI32(i6);
/* 115 */           if (MainMemory.getI32(i1) <= i9) {
/*     */             break label317;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */           MainMemory.setI32(i1, i9);
/*     */           
/*     */ 
/*     */           label317:
/*     */           
/*     */ 
/* 131 */           i9 = MainMemory.getI32(i7);
/* 132 */           if (MainMemory.getI32(i2) <= i9) {
/*     */             break label359;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */           MainMemory.setI32(i2, i9);
/*     */           
/*     */ 
/*     */           label359:
/*     */           
/*     */ 
/* 148 */           i9 = MainMemory.getI32(i6);
/* 149 */           if (MainMemory.getI32(n) >= i9) {
/*     */             break label401;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           MainMemory.setI32(n, i9);
/*     */           
/*     */ 
/*     */           label401:
/*     */           
/*     */ 
/* 165 */           _ZN9PixelInfo8Object2D10calcParamsEv_406.call(i7, i3, i8);
/*     */           
/*     */ 
/*     */           label415:
/*     */           
/*     */ 
/* 171 */           f3 = MainMemory.getI32(i8) * MainMemory.getI32(i6);
/* 172 */           f2 += f3;
/* 173 */           MainMemory.setF32(j, f2);
/* 174 */           i9 = MainMemory.getI32(i7);
/* 175 */           if (i9 + -1 + MainMemory.getI32(i8) >= i9)
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
/* 186 */             i10 = i9 + 1;
/*     */             
/* 188 */             i11 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 196 */               f3 = i9 + i11;
/* 197 */               f1 += f3;
/* 198 */               MainMemory.setF32(i, f1);
/* 199 */               i12 = i11 + 1;
/* 200 */               if (MainMemory.getI32(i7) + -1 + MainMemory.getI32(i8) < i10 + i11) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/* 206 */               i11 = i12;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */           if (i5 == m) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 220 */           i9 = i4;
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2D10calcParamsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */