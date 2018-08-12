/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_set_region_components extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3595;
/*  12 */   public static final Function _instance = new fits_set_region_components();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_set_region_components() { super("fits_set_region_components", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*  44 */     int i5 = 0;
/*  45 */     int i6 = 0;
/*  46 */     int i7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.getI32(paramInt);
/*  53 */       if (j <= 0) {
/*     */         break label506;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */       i = paramInt + 4;
/*  65 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  72 */         m = MainMemory.getI32(i);
/*  73 */         if (MainMemory.getI8(m + j * 164) != 0) {
/*     */           break label474;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         i4 = j + -1;
/*  85 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/*  92 */           i7 = i4 - i5;
/*  93 */           if (i7 < 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */           i5 += 1;
/* 104 */         } while (MainMemory.getI8(m + i7 * 164) == 0);
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
/* 115 */         i4 = j + 1;
/* 116 */         i5 = 0;
/* 117 */         i1 = i7;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 125 */           i6 = i4 + i5;
/* 126 */           k = i1 + -1;
/* 127 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 134 */             i7 = k - i2;
/* 135 */             if (i7 <= -1) {
/*     */               break label464;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */             m = MainMemory.getI32(i);
/* 146 */             n = i2 + 1;
/* 147 */             if (MainMemory.getI8(m + i7 * 164) != 0) break;
/* 148 */             i2 = n;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */           k = i1 - i2;
/* 159 */           m = com.emt.proteus.runtime.library.c.realloc.call(m, MainMemory.getI32(paramInt) * 164 + 164);
/* 160 */           MainMemory.setI32(i, m);
/* 161 */           n = MainMemory.getI32(paramInt);
/* 162 */           MainMemory.setI32(paramInt, n + 1);
/* 163 */           if (k >= n) {
/*     */             break label420;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           i1 = n - i1 + i2;
/* 175 */           i2 = n + -1;
/*     */           
/* 177 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 185 */             com.emt.proteus.runtime.api.SystemLibrary.memcpy(m + (n - i3) * 164, m + (i2 - i3) * 164, 164, 4);
/* 186 */             i3 += 1;
/* 187 */             m = MainMemory.getI32(i);
/* 188 */             if (i3 == i1) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label420:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 202 */           com.emt.proteus.runtime.api.SystemLibrary.memcpy(m + k * 164, m + i6 * 164, 164, 4);
/* 203 */           i5 += 1;
/*     */           
/* 205 */           i1 = i7;
/*     */         }
/*     */         
/*     */         label464:
/*     */         
/* 210 */         j += i5;
/*     */         
/*     */ 
/*     */ 
/*     */         label474:
/*     */         
/*     */ 
/*     */ 
/* 218 */         j += 1;
/* 219 */         i4 = MainMemory.getI32(paramInt);
/* 220 */         if (i4 <= j)
/*     */           break;
/*     */       }
/*     */       break label506;
/* 224 */       j = i4;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label506:
/*     */       
/*     */ 
/*     */ 
/* 233 */       if (j <= 0) {
/*     */         break label607;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */       i = paramInt + 4;
/* 244 */       j = 0;
/* 245 */       i4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 253 */         m = MainMemory.getI32(i);
/* 254 */         j = (MainMemory.getI8(m + i4 * 164) != 0 ? 1 : 0) + j;
/* 255 */         MainMemory.setI32(m + i4 * 164 + 8, j);
/* 256 */         i4 += 1;
/* 257 */       } while (MainMemory.getI32(paramInt) > i4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label607:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_set_region_components.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */