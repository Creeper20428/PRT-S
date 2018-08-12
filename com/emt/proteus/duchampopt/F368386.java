/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F368386 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3470;
/*  11 */   public static final Function _instance = new F368386();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F368386() { super("F368386", 3, false); }
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
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       if ((paramInt1 == 0) || (paramInt2 == 0)) {
/*  58 */         paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  68 */         j = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt2);
/*  69 */         if (j != 0)
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
/*  80 */           if (paramInt3 == 0) {
/*  81 */             paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  91 */             k = MainMemory.getI8(paramInt2);
/*  92 */             m = j + -1;
/*  93 */             n = MainMemory.getI8(paramInt2 + m);
/*  94 */             paramInt3 = paramInt3 + 1 - j;
/*  95 */             i1 = j == 1 ? 1 : 0;
/*  96 */             i2 = j == 2 ? 1 : 0;
/*  97 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 104 */               i5 = i4 + 1;
/* 105 */               i6 = paramInt1 + i4;
/* 106 */               i7 = paramInt1 + (m + i4);
/* 107 */               if (i4 >= paramInt3)
/*     */               {
/*     */ 
/*     */ 
/* 111 */                 paramInt1 = 0;
/* 112 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 118 */               if (MainMemory.getI8(i6) != k)
/*     */               {
/*     */ 
/*     */ 
/* 122 */                 i4 = i5;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 129 */                 if (i1 != 0) {
/* 130 */                   paramInt1 = i6;
/* 131 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */                 if (MainMemory.getI8(i7) != n)
/*     */                 {
/*     */ 
/*     */ 
/* 144 */                   i4 = i5;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 151 */                   if (i2 != 0) {
/* 152 */                     paramInt1 = i6;
/* 153 */                     break;
/*     */                   } else {
/* 155 */                     i4 = 0;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 164 */                     i3 = i4 + 1;
/* 165 */                     if (i3 >= j)
/*     */                     {
/*     */ 
/*     */ 
/* 169 */                       paramInt1 = i6;
/*     */                       
/*     */ 
/*     */                       break label367;
/*     */                     }
/*     */                     
/*     */ 
/* 176 */                     if (MainMemory.getI8(paramInt1 + (i5 + i4)) != MainMemory.getI8(paramInt2 + i3)) break;
/* 177 */                     i4 = i3; }
/* 178 */                   break;
/*     */                   
/* 180 */                   i4 = i5;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       label367:
/* 188 */       i = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */       int i8 = i;return i8;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F368386.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */