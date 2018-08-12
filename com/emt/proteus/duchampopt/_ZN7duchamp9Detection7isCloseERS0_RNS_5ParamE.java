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
/*     */ public final class _ZN7duchamp9Detection7isCloseERS0_RNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 827;
/*  16 */   public static final Function _instance = new _ZN7duchamp9Detection7isCloseERS0_RNS_5ParamE();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp9Detection7isCloseERS0_RNS_5ParamE() { super("_ZN7duchamp9Detection7isCloseERS0_RNS_5ParamE", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, byte paramByte, float paramFloat1, float paramFloat2)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramByte, paramFloat1, paramFloat2);
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
/*  34 */     byte b1 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     float f2 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     byte b2 = call(i, j, b1, f1, f2);
/*  44 */     paramFrame.setI8(paramInt1, b2);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2, byte paramByte, float paramFloat1, float paramFloat2)
/*     */   {
/*  50 */     byte b1 = 0;
/*     */     
/*  52 */     int i = 0;
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
/*  64 */     int i8 = 0;
/*  65 */     float f = 0.0F;
/*  66 */     byte b2 = 0;
/*  67 */     int i9 = 0;
/*  68 */     int i10 = 0;
/*  69 */     int i11 = 0;
/*  70 */     int i12 = 0;
/*     */     
/*     */ 
/*  73 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  77 */       i = MainMemory.alloc(12);
/*  78 */       j = MainMemory.alloc(12);
/*  79 */       k = MainMemory.alloc(16);
/*  80 */       m = MainMemory.alloc(16);
/*  81 */       n = MainMemory.alloc(44);
/*  82 */       i1 = MainMemory.alloc(44);
/*  83 */       _ZN9PixelInfo8Object3D14getChannelListEv.call(i, paramInt1);
/*  84 */       _ZN9PixelInfo8Object3D14getChannelListEv.call(j, paramInt2);
/*  85 */       _ZN9PixelInfo4ScanC1Ev.call(k);
/*  86 */       _ZN9PixelInfo4ScanC1Ev.call(m);
/*  87 */       i2 = i + 4;
/*  88 */       i3 = j + 4;
/*  89 */       i4 = i1 + 4;
/*  90 */       i5 = n + 4;
/*  91 */       b2 = 0;
/*  92 */       i10 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 100 */         i11 = i10 << 2;
/* 101 */         if (b2 != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         i12 = MainMemory.getI32(i);
/* 112 */         if (MathUtils.ugt(MainMemory.getI32(i2) - i12 >> 2, i10))
/*     */         {
/* 114 */           i9 = 0;
/*     */         } else {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 126 */           if (b2 != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */           i7 = MainMemory.getI32(j);
/* 137 */           if (!MathUtils.ugt(MainMemory.getI32(i3) - i7 >> 2, i9)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */           i6 = MainMemory.getI32(i12 + i11);
/* 148 */           i7 += (i9 << 2);
/* 149 */           i8 = i6 - MainMemory.getI32(i7);
/* 150 */           f = i8 > -1 ? i8 : 0 - i8;
/* 151 */           if (!MathUtils.f_ugt(f, paramFloat2))
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
/* 162 */             _ZN9PixelInfo8Object3D10getChanMapEl.call(n, paramInt1, i6);
/* 163 */             _ZN9PixelInfo8Object3D10getChanMapEl.call(i1, paramInt2, MainMemory.getI32(i7));
/* 164 */             b2 = _ZN9PixelInfo8Object2D8canMergeERS0_fb.call(n, i1, paramFloat1, paramByte);
/* 165 */             MainMemory.setI32(i1, 12936);
/* 166 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i4);
/* 167 */             MainMemory.setI32(n, 12936);
/* 168 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           i9 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */         i10 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */       i12 = MainMemory.getI32(j);
/* 191 */       if (i12 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */         SystemLibrary.delete(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 207 */       i12 = MainMemory.getI32(i);
/* 208 */       if (i12 != 0) {
/*     */         break label518;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */       b1 = b2;
/*     */       
/*     */ 
/*     */       break label532;
/*     */       
/*     */       label518:
/*     */       
/* 225 */       SystemLibrary.delete(i12);
/* 226 */       b1 = b2;
/*     */       
/*     */ 
/*     */       label532:
/*     */       
/*     */ 
/* 232 */       return b1;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 237 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection7isCloseERS0_RNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */