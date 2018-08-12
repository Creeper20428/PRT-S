/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F368458 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3471;
/*  12 */   public static final Function _instance = new F368458();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F368458() { super("F368458", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2);
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
/*  30 */     int k = call(i, j);
/*  31 */     paramFrame.setI32(paramInt1, k);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  62 */         if (k <= 57599)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */           if (MainMemory.getI8(paramInt1 + k) != 0) {
/*     */             break label443;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         j = paramInt1 + k;
/*  83 */         k = j;
/*  84 */         m = paramInt1;
/*  85 */         i7 = paramInt1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  92 */           if (!MathUtils.ult(i7, j))
/*     */           {
/*     */ 
/*     */ 
/*  96 */             paramInt1 = 0;
/*  97 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 103 */           paramInt1 = F368386.call(i7, paramInt2, k - i7);
/* 104 */           i5 = paramInt1;
/* 105 */           if (paramInt1 == 0) {
/* 106 */             paramInt1 = 0;
/* 107 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           n = (i5 - m) % 80;
/* 117 */           i1 = MainMemory.getI8(paramInt1 + com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt2));
/* 118 */           if (n <= 7) {
/*     */             break label214;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */           paramInt1 += 1;
/* 129 */           i7 = paramInt1;
/* 130 */           continue;
/*     */           
/*     */           label214:
/*     */           
/* 134 */           if ((i1 >= 33) && (i1 != 61) && (i1 != 127)) {
/*     */             break label414;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */           i6 = 0 - n;
/* 145 */           i2 = paramInt1 + i6;
/* 146 */           if (i6 >= 0)
/*     */           {
/*     */ 
/*     */ 
/* 150 */             i3 = i7;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 157 */             i3 = paramInt1 + 1;
/* 158 */             i4 = paramInt1 + (1 - n);
/* 159 */             i5 = (MathUtils.ugt(paramInt1, i4) ? paramInt1 : i4) + (n - i5);
/* 160 */             i6 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 169 */               i7 = MainMemory.getI8(paramInt1 + (i6 - n)) == 32 ? i7 : i3;
/* 170 */               i6 += 1;
/* 171 */               if (i6 == i5) {
/* 172 */                 i3 = i7; break;
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
/* 185 */           if (MathUtils.ult(paramInt1, i3)) {
/* 186 */             i7 = i3;
/* 187 */             continue;
/*     */           } else {
/* 189 */             paramInt1 = i2;
/* 190 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */           label414:
/*     */           
/* 196 */           paramInt1 += 1;
/* 197 */           i7 = paramInt1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 203 */         i = paramInt1;
/* 204 */         break;
/*     */         
/*     */ 
/*     */         label443:
/*     */         
/*     */ 
/* 210 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 215 */       int i8 = i;return i8;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F368458.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */