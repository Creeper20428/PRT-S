/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1201;
/*  11 */   public static final Function _instance = new _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag() { super("_ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     boolean bool = false;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     float f1 = 0.0F;
/*  48 */     float f2 = 0.0F;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       bool = paramInt1 == paramInt2;
/*  57 */       if ((bool) || (paramInt3 != paramInt2))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */         i = paramInt1;
/*  68 */         k = (paramInt3 - i) / 12;
/*  69 */         m = paramInt2 - i;
/*  70 */         i = m / 12;
/*  71 */         j = k - i;
/*  72 */         if (i != j) {
/*     */           break label127;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag_468.call(paramInt1, paramInt2, bool);
/*     */         
/*     */         break label745;
/*     */         
/*     */         label127:
/*  87 */         if (MathUtils.ult(m + 11, 23))
/*     */         {
/*     */           break label193;
/*     */         }
/*     */         else {
/*  92 */           m = i;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 102 */           n = k % m;
/* 103 */           if (n == 0) {
/* 104 */             k = m; break;
/*     */           }
/*     */           
/*     */ 
/* 108 */           k = m;
/* 109 */           m = n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label193:
/*     */         
/*     */ 
/* 117 */         if (k <= 0) {
/*     */           break label745;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         bool = i < j;
/* 128 */         paramInt2 = paramInt3 + (0 - i) * 12;
/* 129 */         m = 0 - j;
/* 130 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 137 */           paramInt3 = paramInt1 + (j + n) * 12;
/* 138 */           i1 = paramInt1 + n * 12;
/* 139 */           f1 = MainMemory.getF32(paramInt1 + n * 12 + 4);
/* 140 */           f2 = MainMemory.getF32(paramInt1 + n * 12 + 8);
/* 141 */           if (!bool) {
/*     */             break label507;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */           i2 = j / k;
/* 152 */           if (i2 > 0) {
/* 153 */             i3 = 0;
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/* 158 */             paramInt3 = i1;
/*     */             
/*     */ 
/*     */             break label702;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/* 167 */             if (!MathUtils.ult(paramInt3, i1)) {
/*     */               break label424;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */             MainMemory.setF32(i1 + 4, MainMemory.getF32(i1 + m * 12 + 4));
/* 179 */             MainMemory.setF32(i1 + 8, MainMemory.getF32(i1 + m * 12 + 8));
/* 180 */             i1 += m * 12;
/*     */             
/*     */ 
/*     */ 
/*     */             label424:
/*     */             
/*     */ 
/*     */ 
/* 188 */             MainMemory.setF32(i1 + 4, MainMemory.getF32(i1 + i * 12 + 4));
/* 189 */             MainMemory.setF32(i1 + 8, MainMemory.getF32(i1 + i * 12 + 8));
/* 190 */             i1 += i * 12;
/* 191 */             i3 += 1;
/* 192 */             if (i3 == i2) {
/* 193 */               paramInt3 = i1;
/*     */               
/*     */ 
/*     */               break label702;
/*     */               
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */           label507:
/*     */           
/* 204 */           i2 = i / k + -1;
/* 205 */           if (i2 <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 209 */             paramInt3 = i1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 216 */             i2 = i2 > 1 ? i2 : 1;
/* 217 */             i3 = 0;
/* 218 */             paramInt3 = i1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 226 */               if (!MathUtils.ugt(paramInt2, paramInt3)) {
/*     */                 break label630;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */               MainMemory.setF32(paramInt3 + 4, MainMemory.getF32(paramInt3 + i * 12 + 4));
/* 238 */               MainMemory.setF32(paramInt3 + 8, MainMemory.getF32(paramInt3 + i * 12 + 8));
/* 239 */               paramInt3 += i * 12;
/*     */               
/*     */ 
/*     */ 
/*     */               label630:
/*     */               
/*     */ 
/*     */ 
/* 247 */               MainMemory.setF32(paramInt3 + 4, MainMemory.getF32(paramInt3 + m * 12 + 4));
/* 248 */               MainMemory.setF32(paramInt3 + 8, MainMemory.getF32(paramInt3 + m * 12 + 8));
/* 249 */               paramInt3 += m * 12;
/* 250 */               i3 += 1;
/* 251 */               if (i3 == i2) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label702:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 265 */           MainMemory.setF32(paramInt3 + 4, f1);
/* 266 */           MainMemory.setF32(paramInt3 + 8, f2);
/* 267 */           n += 1;
/* 268 */           if (n == k) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label745:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */