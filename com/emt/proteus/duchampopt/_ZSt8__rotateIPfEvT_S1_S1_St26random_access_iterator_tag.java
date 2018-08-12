/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1273;
/*  11 */   public static final Function _instance = new _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag() { super("_ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
/*  19 */     return 0;
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
/*  47 */     float f = 0.0F;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
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
/*  68 */         k = paramInt3 - i >> 2;
/*  69 */         i = paramInt2 - i >> 2;
/*  70 */         j = k - i;
/*  71 */         if (i != j) {
/*     */           break label121;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag_471.call(paramInt2, bool, paramInt1);
/*     */         
/*     */         break label581;
/*     */         
/*     */         label121:
/*  86 */         if (i == 0)
/*     */         {
/*     */           break label178;
/*     */         }
/*     */         else {
/*  91 */           m = i;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 101 */           n = k % m;
/* 102 */           if (n == 0) {
/* 103 */             k = m; break;
/*     */           }
/*     */           
/*     */ 
/* 107 */           k = m;
/* 108 */           m = n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label178:
/*     */         
/*     */ 
/* 116 */         if (k <= 0) {
/*     */           break label581;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         bool = i < j;
/* 127 */         paramInt2 = paramInt3 + (0 - i << 2);
/* 128 */         m = 0 - j;
/* 129 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 136 */           i1 = paramInt1 + (n << 2);
/* 137 */           paramInt3 = paramInt1 + (j + n << 2);
/* 138 */           f = MainMemory.getF32(i1);
/* 139 */           if (!bool) {
/*     */             break label407;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */           i2 = j / k;
/* 150 */           if (i2 > 0) {
/* 151 */             i3 = 0;
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/* 156 */             paramInt3 = i1;
/*     */             
/*     */ 
/*     */             break label549;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/* 165 */             if (!com.emt.proteus.lib.api.MathUtils.ult(paramInt3, i1))
/*     */             {
/*     */ 
/*     */ 
/* 169 */               i4 = i1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 176 */               i4 = i1 + (m << 2);
/* 177 */               MainMemory.setF32(i1, MainMemory.getF32(i4));
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */             i1 = i4 + (i << 2);
/* 186 */             MainMemory.setF32(i4, MainMemory.getF32(i1));
/* 187 */             i3 += 1;
/* 188 */             if (i3 == i2) {
/* 189 */               paramInt3 = i1;
/*     */               
/*     */ 
/*     */               break label549;
/*     */               
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */           label407:
/*     */           
/* 200 */           i2 = i / k + -1;
/* 201 */           if (i2 <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 205 */             paramInt3 = i1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 212 */             i2 = i2 > 1 ? i2 : 1;
/* 213 */             i3 = 0;
/* 214 */             paramInt3 = i1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 222 */               if (!com.emt.proteus.lib.api.MathUtils.ugt(paramInt2, paramInt3))
/*     */               {
/*     */ 
/*     */ 
/* 226 */                 i1 = paramInt3;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 233 */                 i1 = paramInt3 + (i << 2);
/* 234 */                 MainMemory.setF32(paramInt3, MainMemory.getF32(i1));
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */               paramInt3 = i1 + (m << 2);
/* 243 */               MainMemory.setF32(i1, MainMemory.getF32(paramInt3));
/* 244 */               i3 += 1;
/* 245 */               if (i3 == i2) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label549:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 259 */           MainMemory.setF32(paramInt3, f);
/* 260 */           n += 1;
/* 261 */           if (n == k) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label581:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */