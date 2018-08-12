/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class tabcpy extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2915;
/*  12 */   public static final Function _instance = new tabcpy();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public tabcpy() { super("tabcpy", 2, false); }
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
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*  53 */     int i11 = 0;
/*  54 */     int i12 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (paramInt1 == 0) {
/*  61 */         j = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  71 */         j = MainMemory.getI32(paramInt1 + 4);
/*  72 */         if (j < 1) {
/*  73 */           j = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  83 */           k = paramInt1 + 8;
/*  84 */           i5 = tabini.call(j, MainMemory.getI32(k), paramInt2);
/*  85 */           if (i5 != 0)
/*     */           {
/*     */ 
/*     */ 
/*  89 */             j = i5;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  96 */             m = j > 0 ? 1 : 0;
/*  97 */             if (m == 0) {
/*     */               break label501;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */             n = paramInt2 + 12;
/* 109 */             i1 = paramInt1 + 12;
/* 110 */             i2 = paramInt2 + 16;
/* 111 */             i3 = paramInt1 + 16;
/* 112 */             i5 = j;
/* 113 */             i8 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 121 */               MainMemory.setI32(MainMemory.getI32(n) + (i8 << 2), MainMemory.getI32(MainMemory.getI32(i1) + (i8 << 2)));
/* 122 */               MainMemory.setF64(MainMemory.getI32(i2) + (i8 << 3), MainMemory.getF64(MainMemory.getI32(i3) + (i8 << 3)));
/* 123 */               i4 = MainMemory.getI32(k);
/* 124 */               i5 = MainMemory.getI32(i4 + (i8 << 2)) * i5;
/* 125 */               i8 += 1;
/* 126 */               if (i8 == j) {
/*     */                 break;
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
/* 138 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/* 142 */               j = i5;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 149 */               i6 = paramInt1 + 20;
/* 150 */               i7 = paramInt2 + 20;
/*     */               
/* 152 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 160 */                 i9 = i8 << 2;
/* 161 */                 i10 = MainMemory.getI32(MainMemory.getI32(i6) + (i8 << 2));
/* 162 */                 if (i10 != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */                   if (MainMemory.getI32(i4 + (i8 << 2)) <= 0) {
/*     */                     break label473;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */                   i11 = MainMemory.getI32(MainMemory.getI32(i7) + (i8 << 2));
/* 185 */                   i12 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   do
/*     */                   {
/* 192 */                     MainMemory.setF64(i11 + (i12 << 3), MainMemory.getF64(i10 + (i12 << 3)));
/* 193 */                     i12 += 1;
/* 194 */                     i4 = MainMemory.getI32(k);
/* 195 */                   } while (MainMemory.getI32(i4 + i9) > i12);
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label473:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */                 i8 += 1;
/* 209 */                 if (i8 == j) {
/* 210 */                   j = i5; break;
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label501:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 223 */             if (j <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 227 */               j = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 234 */               i10 = MainMemory.getI32(paramInt2 + 24);
/* 235 */               i11 = MainMemory.getI32(paramInt1 + 24);
/* 236 */               i5 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 243 */                 MainMemory.setF64(i10 + (i5 << 3), MainMemory.getF64(i11 + (i5 << 3)));
/* 244 */                 i5 += 1;
/* 245 */                 if (i5 == j) {
/* 246 */                   j = 0; break;
/*     */                 }
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
/* 258 */       i = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */       int i13 = i;return i13;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tabcpy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */