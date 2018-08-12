/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2079;
/*  11 */   public static final Function _instance = new _ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES() { super("_ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  32 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int i1 = call(i, j, k, m, n);
/*  39 */     paramFrame.setI32(paramInt1, i1);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*  60 */     int i10 = 0;
/*  61 */     int i11 = 0;
/*  62 */     boolean bool = false;
/*  63 */     int i12 = 0;
/*  64 */     int i13 = 0;
/*  65 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       if (MainMemory.getI8(paramInt1 + 28) != 0)
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
/*  82 */         j = paramInt3 << 2;
/*  83 */         k = com.emt.proteus.runtime.api.SystemLibrary.newarray(j * paramInt4);
/*  84 */         m = k;
/*  85 */         n = paramInt1 + 16;
/*  86 */         i13 = MainMemory.getI32(n);
/*  87 */         i1 = i13 / 2;
/*  88 */         if (i13 <= 0) {
/*     */           break label217;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         i13 = i13 > 1 ? i13 : 1;
/*  99 */         i14 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 106 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 113 */             i2 += 1;
/* 114 */             if (i2 == i13) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */           i14 += 1;
/* 126 */           if (i14 == i13) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label217:
/*     */         
/*     */ 
/*     */ 
/* 137 */         if (paramInt4 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 141 */           paramInt2 = m;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 148 */           bool = i1 < 0 - i1;
/* 149 */           i12 = paramInt1 + 24;
/* 150 */           if (paramInt3 <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 154 */             paramInt2 = m;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 161 */             i13 = 1 - i1;
/* 162 */             i14 = i1 * (paramInt3 + 1);
/* 163 */             i2 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 170 */               i3 = j * i2;
/* 171 */               i4 = i2 * paramInt3;
/* 172 */               i5 = i4 - i14;
/* 173 */               i6 = i2 - i1;
/* 174 */               i7 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 181 */                 i8 = k + (i3 + (i7 << 2));
/* 182 */                 i9 = i4 + i7;
/* 183 */                 i10 = i5 + i7;
/* 184 */                 i11 = i7 - i1;
/* 185 */                 if (MainMemory.getI8(paramInt5 + i9) != 0) {
/*     */                   break label417;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */                 MainMemory.setF32(i8, MainMemory.getF32(paramInt2 + (i9 << 2)));
/*     */                 
/*     */                 break label448;
/*     */                 
/*     */                 label417:
/* 200 */                 _ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES_179.call(paramInt5, i10, i1, i12, i6, paramInt3, i13, bool, i11, n, i8, paramInt4, paramInt2);
/*     */                 
/*     */ 
/*     */                 label448:
/*     */                 
/*     */ 
/* 206 */                 i7 += 1;
/* 207 */                 if (i7 == paramInt3) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */               i2 += 1;
/* 219 */               if (i2 == paramInt4) {
/* 220 */                 paramInt2 = m; break;
/*     */               }
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
/* 232 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */       int i15 = i;return i15;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */