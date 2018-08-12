/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object2D7isCloseERS0_fb extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 342;
/*  12 */   public static final Function _instance = new _ZN9PixelInfo8Object2D7isCloseERS0_fb();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN9PixelInfo8Object2D7isCloseERS0_fb() { super("_ZN9PixelInfo8Object2D7isCloseERS0_fb", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, float paramFloat, byte paramByte)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramFloat, paramByte);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     byte b1 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     byte b2 = call(i, j, f, b1);
/*  37 */     paramFrame.setI8(paramInt1, b2);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2, float paramFloat, byte paramByte)
/*     */   {
/*  43 */     byte b1 = 0;
/*     */     
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*  53 */     int i4 = 0;
/*  54 */     int i5 = 0;
/*  55 */     int i6 = 0;
/*  56 */     int i7 = 0;
/*  57 */     int i8 = 0;
/*  58 */     int i9 = 0;
/*  59 */     int i10 = 0;
/*  60 */     int i11 = 0;
/*  61 */     int i12 = 0;
/*  62 */     int i13 = 0;
/*  63 */     int i14 = 0;
/*  64 */     int i15 = 0;
/*  65 */     int i16 = 0;
/*  66 */     int i17 = 0;
/*  67 */     int i18 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       i = paramByte == 0 ? 1 : 0;
/*  74 */       j = i != 0 ? (int)com.emt.proteus.runtime.api.SystemLibrary.ceilf(paramFloat) : 1;
/*  75 */       k = MainMemory.getI32(paramInt1 + 36) - j;
/*  76 */       m = MainMemory.getI32(paramInt2 + 36);
/*  77 */       k = (k < m ? m : k) - j;
/*  78 */       m = MainMemory.getI32(paramInt1 + 40) + j;
/*  79 */       i4 = MainMemory.getI32(paramInt2 + 40);
/*  80 */       m = (i4 < m ? i4 : m) + j;
/*  81 */       n = MainMemory.getI32(paramInt1 + 4);
/*  82 */       i1 = paramInt1 + 8;
/*  83 */       i2 = paramInt2 + 4;
/*  84 */       i3 = paramInt2 + 8;
/*  85 */       i4 = j + -1;
/*  86 */       i15 = 0;
/*  87 */       paramByte = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  95 */         i16 = n + (i15 << 4) + 12;
/*  96 */         i17 = n + (i15 << 4) + 8;
/*  97 */         i18 = n + (i15 << 4);
/*  98 */         i12 = n + (i15 << 4) + 4;
/*  99 */         if (paramByte != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         if (i18 == MainMemory.getI32(i1)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */         i5 = MainMemory.getI32(i12);
/* 120 */         if ((i5 < k) || (i5 <= m))
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
/* 131 */           i6 = MainMemory.getI32(i2);
/* 132 */           i10 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 141 */             i11 = i6 + (i10 << 4) + 8;
/* 142 */             i12 = i6 + (i10 << 4) + 12;
/* 143 */             i13 = i6 + (i10 << 4);
/* 144 */             i14 = i6 + (i10 << 4) + 4;
/* 145 */             if (paramByte != 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */             if (i13 == MainMemory.getI32(i3)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */             i7 = MainMemory.getI32(i14);
/* 168 */             if ((i7 < k) || (i7 <= m))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */               i7 = i5 - i7;
/* 180 */               if ((i7 > -1 ? i7 : 0 - i7) <= j)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 191 */                 if (i == 0) {
/*     */                   break label547;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */                 paramByte = (byte)(com.emt.proteus.lib.api.MathUtils.f_olt(_ZN9PixelInfo6minSepERNS_4ScanES1_.call(i18, i13), paramFloat) ? 1 : 0);
/*     */                 
/*     */                 break label648;
/*     */                 
/*     */                 label547:
/*     */                 
/* 207 */                 i7 = MainMemory.getI32(i17);
/* 208 */                 i8 = i7 - j;
/* 209 */                 i9 = MainMemory.getI32(i11);
/* 210 */                 if (i8 <= i9) {
/*     */                   break label620;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */                 paramByte = (byte)(i9 + -1 + MainMemory.getI32(i12) >= i8 ? 1 : 0);
/*     */                 
/*     */                 break label648;
/*     */                 
/*     */                 label620:
/*     */                 
/* 226 */                 paramByte = (byte)(i4 + i7 + MainMemory.getI32(i16) >= i9 ? 1 : 0);
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */             label648:
/*     */             
/*     */ 
/* 234 */             i10 += 1;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */         i15 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */       b1 = paramByte;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */       byte b2 = b1;return b2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2D7isCloseERS0_fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */