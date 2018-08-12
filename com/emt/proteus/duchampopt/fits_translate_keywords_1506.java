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
/*     */ public final class fits_translate_keywords_1506
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  15 */   public static final Function _instance = new fits_translate_keywords_1506();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public fits_translate_keywords_1506() { super("fits_translate_keywords_1506", 14, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14);
/*  23 */     return 0;
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
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  65 */     paramInt4 += 2;
/*  66 */     paramInt3--;
/*  67 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  68 */     paramInt4 += 2;
/*  69 */     paramInt3--;
/*  70 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9);
/*  71 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
/*     */   {
/*  77 */     int i = 0;
/*  78 */     int j = 0;
/*  79 */     int k = 0;
/*  80 */     int m = 0;
/*  81 */     int n = 0;
/*  82 */     int i1 = 0;
/*  83 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  89 */       ffghsp.call(paramInt10, paramInt11, paramInt2, paramInt9);
/*  90 */       if (MainMemory.getI32(paramInt11) >= 9)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  95 */         i = paramInt8 + 8;
/*  96 */         j = paramInt4 + 8;
/*  97 */         k = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/* 101 */           m = k + 10;
/* 102 */           n = k + 9;
/* 103 */           MainMemory.setI8(paramInt4, (byte)0);
/* 104 */           ffgrec.call(paramInt10, n, paramInt8, paramInt9);
/* 105 */           n = SystemLibrary.strlen(paramInt8);
/* 106 */           if (n > 8)
/*     */           {
/* 108 */             n += -8;
/* 109 */             i1 = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 113 */               i2 = paramInt8 + (i1 + 8);
/* 114 */               if (MathUtils.ugt((byte)(MainMemory.getI8(i2) + -32), (byte)94))
/*     */               {
/* 116 */                 MainMemory.setI8(i2, (byte)32);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */               i1 += 1;
/* 128 */               if (i1 == n) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */           }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */           fits_translate_keyword.call(paramInt8, paramInt4, paramInt7, paramInt5, paramInt14, paramInt12, paramInt1, paramInt13, paramInt3, paramInt9);
/* 149 */           if (MainMemory.getI8(paramInt4) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 154 */             ffprec.call(paramInt6, paramInt4, paramInt9);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */           MainMemory.setI8(i, (byte)0);
/* 163 */           MainMemory.setI8(j, (byte)0);
/* 164 */           k += 1;
/* 165 */           if (m > MainMemory.getI32(paramInt11)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_translate_keywords_1506.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */