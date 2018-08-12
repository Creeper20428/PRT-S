/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt16__insertion_sortIP4PairEvT_S2__451 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new _ZSt16__insertion_sortIP4PairEvT_S2__451();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt16__insertion_sortIP4PairEvT_S2__451() { super("_ZSt16__insertion_sortIP4PairEvT_S2__451", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     float f1 = 0.0F;
/*  44 */     float f2 = 0.0F;
/*  45 */     int i2 = 0;
/*  46 */     int i3 = 0;
/*  47 */     int i4 = 0;
/*  48 */     int i5 = 0;
/*  49 */     int i6 = 0;
/*  50 */     int i7 = 0;
/*  51 */     int i8 = 0;
/*  52 */     int i9 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       m = paramInt1 + 12;
/*  59 */       if (m != paramInt2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  64 */         i = paramInt1 + 4;
/*  65 */         j = paramInt1 + 8;
/*  66 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  72 */           n = k + 1;
/*  73 */           i1 = paramInt1 + (k + 2) * 12;
/*  74 */           f1 = MainMemory.getF32(paramInt1 + n * 12 + 4);
/*  75 */           f2 = MainMemory.getF32(paramInt1 + n * 12 + 8);
/*  76 */           if (MathUtils.f_olt(f1, MainMemory.getF32(i)))
/*     */           {
/*  78 */             i5 = n * 12;
/*  79 */             if (i5 > 11)
/*     */             {
/*  81 */               i5 /= 12;
/*  82 */               i2 = 0 - i5;
/*  83 */               i5 = i5 + 1 + (i2 > -1 ? i2 : -1);
/*  84 */               i2 = 0;
/*     */               
/*     */               for (;;)
/*     */               {
/*  88 */                 i3 = n - i2;
/*  89 */                 i7 = paramInt1 + i3 * 12 + 8;
/*  90 */                 i9 = k - i2;
/*  91 */                 i4 = paramInt1 + i9 * 12 + 8;
/*  92 */                 MainMemory.setF32(paramInt1 + i3 * 12 + 4, MainMemory.getF32(paramInt1 + i9 * 12 + 4));
/*  93 */                 MainMemory.setF32(i7, MainMemory.getF32(i4));
/*  94 */                 i2 += 1;
/*  95 */                 if (i2 == i5) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */             }
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
/* 113 */             MainMemory.setF32(i, f1);
/* 114 */             MainMemory.setF32(j, f2);
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 123 */             if (MathUtils.f_olt(f1, MainMemory.getF32(paramInt1 + k * 12 + 4))) {
/* 124 */               i2 = 0;
/*     */               
/*     */               for (;;)
/*     */               {
/* 128 */                 i3 = n - i2;
/* 129 */                 i4 = paramInt1 + i3 * 12 + 8;
/* 130 */                 i5 = k - i2;
/* 131 */                 i6 = paramInt1 + i5 * 12 + 8;
/* 132 */                 i7 = paramInt1 + i5 * 12 + -8;
/* 133 */                 MainMemory.setF32(paramInt1 + i3 * 12 + 4, MainMemory.getF32(paramInt1 + i5 * 12 + 4));
/* 134 */                 MainMemory.setF32(i4, MainMemory.getF32(i6));
/* 135 */                 i2 += 1;
/* 136 */                 if (!MathUtils.f_olt(f1, MainMemory.getF32(i7))) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               break label469;
/* 141 */               i8 = paramInt1 + i5 * 12;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 152 */               i8 = m;
/*     */             }
/*     */             
/*     */ 
/*     */             label469:
/*     */             
/*     */ 
/* 159 */             MainMemory.setF32(i8 + 4, f1);
/* 160 */             MainMemory.setF32(i8 + 8, f2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */           if (i1 == paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 175 */           m += 12;
/* 176 */           k = n;
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__insertion_sortIP4PairEvT_S2__451.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */