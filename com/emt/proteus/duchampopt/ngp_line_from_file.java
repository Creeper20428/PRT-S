/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class ngp_line_from_file extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3450;
/*  15 */   public static final Function _instance = new ngp_line_from_file();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ngp_line_from_file() { super("ngp_line_from_file", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  22 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = call(i);
/*  31 */     paramFrame.setI32(paramInt1, j);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       if (paramInt == 0) {
/*  51 */         k = 362;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  61 */         i2 = malloc.call(1);
/*  62 */         MainMemory.setI32Aligned(468000, i2);
/*  63 */         if (i2 == 0) {
/*  64 */           k = 360;
/*     */           break label456;
/*     */         } else {
/*  67 */           j = 0;
/*  68 */           k = 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  78 */         m = j + 1;
/*  79 */         i1 = j + 1001;
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  85 */           n = com.emt.proteus.runtime.api.SystemLibrary.fgetc(paramInt);
/*  86 */           switch (n) {}
/*     */         }
/*     */         break label167;
/*     */         break label167;
/*  90 */         n = 0;
/*     */         
/*     */         break label285;
/*     */         
/*     */         break label167;
/*     */         
/*     */         break label213;
/*     */         
/*     */         label167:
/*     */         
/* 100 */         m = com.emt.proteus.runtime.library.c.ferror.call(paramInt) == 0 ? 0 : 361;
/* 101 */         if (j == 0) {
/* 102 */           k = 367;
/*     */           break label456;
/*     */         } else {
/* 105 */           n = m;
/*     */           
/*     */ 
/*     */           break label285;
/*     */         }
/*     */         
/*     */         label213:
/*     */         
/* 113 */         i1 -= i1 % 1000;
/* 114 */         i2 = MainMemory.getI32Aligned(468000);
/* 115 */         if (i1 <= k) {
/*     */           break label506;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         i2 = realloc.call(i2, i1);
/* 128 */         if (i2 == 0) {
/* 129 */           n = 360;
/* 130 */           j = m;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label491;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label285:
/*     */         
/*     */ 
/* 142 */         m = j + 1;
/* 143 */         i2 = MainMemory.getI32Aligned(468000);
/* 144 */         if (m != k) {
/*     */           break label334;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */         MainMemory.setI8(i2 + j, (byte)0);
/*     */         
/*     */         break label402;
/*     */         
/*     */         label334:
/*     */         
/* 160 */         i2 = realloc.call(i2, m);
/* 161 */         if (i2 != 0) {
/*     */           break label382;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         i2 = MainMemory.getI32Aligned(468000);
/*     */         
/* 173 */         k = 360;
/*     */         
/*     */         break label468;
/*     */         
/*     */         label382:
/* 178 */         MainMemory.setI32Aligned(468000, i2);
/* 179 */         MainMemory.setI8(i2 + j, (byte)0);
/*     */         
/*     */ 
/*     */ 
/*     */         label402:
/*     */         
/*     */ 
/*     */ 
/* 187 */         switch (n) {
/* 188 */         case 0:  k = n;
/*     */           
/* 190 */           break;
/* 191 */         case 367:  k = n;
/*     */           
/* 193 */           break;
/*     */         default: 
/* 195 */           k = n;
/* 196 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */         label456:
/*     */         
/*     */ 
/* 204 */         i = k;
/* 205 */         break;
/*     */         
/*     */ 
/*     */ 
/*     */         label468:
/*     */         
/*     */ 
/*     */ 
/* 213 */         free.call(i2);
/* 214 */         MainMemory.setI32Aligned(468000, 0);
/* 215 */         i = k;
/* 216 */         break;
/*     */         
/*     */ 
/*     */         label491:
/*     */         
/*     */ 
/* 222 */         MainMemory.setI32Aligned(468000, i2);
/*     */         
/* 224 */         k = i1;
/*     */         
/*     */ 
/*     */ 
/*     */         label506:
/*     */         
/*     */ 
/*     */ 
/* 232 */         MainMemory.setI8(i2 + j, (byte)n);
/* 233 */         j = m;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 238 */       int i3 = i;return i3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_line_from_file.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */