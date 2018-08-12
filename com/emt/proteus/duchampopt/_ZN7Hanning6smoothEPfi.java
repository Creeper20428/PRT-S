/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7Hanning6smoothEPfi extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2674;
/*  11 */   public static final Function _instance = new _ZN7Hanning6smoothEPfi();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7Hanning6smoothEPfi() { super("_ZN7Hanning6smoothEPfi", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = call(i, j, k);
/*  33 */     paramFrame.setI32(paramInt1, m);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     double d = 0.0D;
/*  45 */     float f1 = 0.0F;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     float f2 = 0.0F;
/*  50 */     float f3 = 0.0F;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*  53 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       if (MainMemory.getI8(paramInt1 + 12) != 0)
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
/*  70 */         j = com.emt.proteus.runtime.api.SystemLibrary.newarray(paramInt3 << 2);
/*  71 */         k = j;
/*  72 */         m = paramInt1 + 4;
/*  73 */         d = MainMemory.getI32(m);
/*  74 */         d += 1.0D;
/*  75 */         d *= 0.5D;
/*  76 */         f1 = (float)d;
/*  77 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*  81 */           paramInt2 = k;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  88 */           n = paramInt1 + 8;
/*  89 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/*  96 */             i2 = j + (i1 << 2);
/*  97 */             MainMemory.setF32(i2, 0.0F);
/*  98 */             i5 = MainMemory.getI32(m);
/*  99 */             if (i5 > 0) {
/* 100 */               f2 = 0.0F;
/* 101 */               f3 = 0.0F;
/* 102 */               i3 = i5;
/* 103 */               i4 = 0;
/*     */             }
/*     */             else
/*     */             {
/* 107 */               f3 = 0.0F;
/*     */               
/*     */ 
/*     */ 
/*     */               break label326;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 118 */               i5 = i4 + 1;
/* 119 */               i3 = i1 + i4 - (i3 + -1) / 2;
/* 120 */               if ((i3 <= 0) || (i3 >= paramInt3)) {
/*     */                 break label287;
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
/* 132 */               f2 = MainMemory.getF32(MainMemory.getI32(n) + (i4 << 2)) * MainMemory.getF32(paramInt2 + (i3 << 2));
/* 133 */               f3 += f2;
/* 134 */               MainMemory.setF32(i2, f3);
/* 135 */               f2 = f3;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label287:
/*     */               
/*     */ 
/*     */ 
/* 144 */               i4 = MainMemory.getI32(m);
/* 145 */               if (i4 <= i5) {
/*     */                 break;
/*     */               }
/* 148 */               i3 = i4;
/* 149 */               i4 = i5;
/*     */             }
/*     */             break label326;
/* 152 */             f3 = f2;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label326:
/*     */             
/*     */ 
/*     */ 
/* 161 */             f3 /= f1;
/* 162 */             MainMemory.setF32(i2, f3);
/* 163 */             i1 += 1;
/* 164 */             if (i1 == paramInt3) {
/* 165 */               paramInt2 = k; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */       int i6 = i;return i6;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7Hanning6smoothEPfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */