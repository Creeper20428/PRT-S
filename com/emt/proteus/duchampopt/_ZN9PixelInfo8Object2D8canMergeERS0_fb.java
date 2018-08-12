/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object2D8canMergeERS0_fb extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 343;
/*  12 */   public static final Function _instance = new _ZN9PixelInfo8Object2D8canMergeERS0_fb();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN9PixelInfo8Object2D8canMergeERS0_fb() { super("_ZN9PixelInfo8Object2D8canMergeERS0_fb", 4, false); }
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
/*  46 */     byte b2 = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       if (paramByte != 0)
/*     */       {
/*     */ 
/*     */ 
/*  59 */         i = 1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  66 */         i = (int)com.emt.proteus.runtime.api.SystemLibrary.ceilf(paramFloat);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       j = MainMemory.getI32(paramInt1 + 28) - i;
/*  75 */       k = MainMemory.getI32(paramInt2 + 28);
/*  76 */       if (j >= k) {
/*     */         break label124;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       b2 = (byte)(MainMemory.getI32(paramInt1 + 32) + i >= k ? 1 : 0);
/*     */       
/*     */       break label149;
/*     */       
/*     */       label124:
/*     */       
/*  92 */       b2 = (byte)(MainMemory.getI32(paramInt2 + 32) >= j ? 1 : 0);
/*     */       
/*     */ 
/*     */ 
/*     */       label149:
/*     */       
/*     */ 
/*     */ 
/* 100 */       if (b2 != 0)
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
/* 111 */         j = MainMemory.getI32(paramInt1 + 36) - i;
/* 112 */         k = MainMemory.getI32(paramInt2 + 36);
/* 113 */         m = b2 != 1 ? 1 : 0;
/* 114 */         if (j >= k) {
/*     */           break label268;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */         if (m != 0) {
/* 125 */           paramByte = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label331;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 135 */         b2 = (byte)(MainMemory.getI32(paramInt1 + 40) + i >= k ? 1 : 0);
/*     */         
/*     */         break label310;
/*     */         
/*     */         label268:
/*     */         
/* 141 */         if (m != 0) {
/* 142 */           paramByte = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label331;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 152 */         b2 = (byte)(MainMemory.getI32(paramInt2 + 40) >= j ? 1 : 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label310:
/*     */       
/*     */ 
/* 160 */       if (b2 == 0) {
/* 161 */         paramByte = b2;
/*     */       } else {
/*     */         break label344;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label331:
/*     */       
/*     */ 
/*     */ 
/* 172 */       b1 = paramByte;
/*     */       
/*     */ 
/*     */       break label358;
/*     */       
/*     */       label344:
/*     */       
/* 179 */       b1 = _ZN9PixelInfo8Object2D7isCloseERS0_fb.call(paramInt1, paramInt2, paramFloat, paramByte);
/*     */       
/*     */ 
/*     */       label358:
/*     */       
/*     */ 
/* 185 */       byte b3 = b1; return b3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2D8canMergeERS0_fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */