/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class F293109 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3180;
/*  13 */   public static final Function _instance = new F293109();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F293109() { super("F293109", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i7 = call(i, j, k, m, n, i1, i2, i3, i4, i5, i6);
/*  59 */     paramFrame.setI32(paramInt1, i7);
/*  60 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*     */   {
/*  65 */     int i = 0;
/*     */     
/*  67 */     int j = 0;
/*  68 */     int k = 0;
/*  69 */     int m = 0;
/*  70 */     int n = 0;
/*  71 */     int i1 = 0;
/*  72 */     int i2 = 0;
/*  73 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  79 */       if ((paramInt5 | paramInt4) < 0) {
/*  80 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  90 */       else if ((paramInt7 | paramInt6) < 0) {
/*  91 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 101 */       else if (((paramInt9 | paramInt8) < 0) || (paramInt10 < 0)) {
/* 102 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 112 */         j = MainMemory.getI32Aligned(470796);
/* 113 */         m = MainMemory.getI32Aligned(470800);
/* 114 */         if (j != m)
/*     */         {
/*     */ 
/*     */ 
/* 118 */           m = j;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 125 */           n = MainMemory.getI32Aligned(470792);
/* 126 */           if (n != 0) {
/*     */             break label175;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */           MainMemory.setI32Aligned(470800, 100);
/* 137 */           k = malloc.call(34400);
/*     */           
/*     */           break label202;
/*     */           
/*     */           label175:
/*     */           
/* 143 */           MainMemory.setI32Aligned(470800, m << 1);
/* 144 */           k = com.emt.proteus.runtime.library.c.realloc.call(n, m * 688);
/*     */           
/*     */ 
/*     */ 
/*     */           label202:
/*     */           
/*     */ 
/*     */ 
/* 152 */           if (k != 0) {
/*     */             break label240;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */           MainMemory.setI32Aligned(470852, 113);
/* 163 */           i = -1;
/*     */           
/*     */ 
/*     */           break label823;
/*     */           
/*     */           label240:
/*     */           
/* 170 */           MainMemory.setI32Aligned(470792, k);
/* 171 */           m = MainMemory.getI32Aligned(470796);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */         MainMemory.setI32Aligned(470796, m + 1);
/* 180 */         if (m <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 184 */           paramInt1 = m;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 191 */           n = MainMemory.getI32Aligned(470792);
/* 192 */           i1 = n + m * 344;
/* 193 */           MainMemory.setI32(n + m * 344, paramInt2);
/* 194 */           i2 = n + m * 344 + 4;
/* 195 */           MainMemory.setI32(i2, 3181);
/* 196 */           i3 = n + m * 344 + 8;
/* 197 */           MainMemory.setI32(i3, paramInt3);
/* 198 */           MainMemory.setI32(n + m * 344 + 12, paramInt4);
/* 199 */           MainMemory.setI32(n + m * 344 + 12 + 4, paramInt5);
/* 200 */           MainMemory.setI32(n + m * 344 + 12 + 8, paramInt6);
/* 201 */           MainMemory.setI32(n + m * 344 + 12 + 12, paramInt7);
/* 202 */           MainMemory.setI32(n + m * 344 + 12 + 16, paramInt8);
/* 203 */           MainMemory.setI32(n + m * 344 + 12 + 20, paramInt9);
/* 204 */           MainMemory.setI32(n + m * 344 + 12 + 24, paramInt10);
/* 205 */           paramInt5 = paramInt2 == 1043 ? 0 : paramInt3;
/* 206 */           if (paramInt3 == 0) {
/* 207 */             paramInt2 = paramInt5;
/*     */             break label624;
/*     */           } else {
/* 210 */             paramInt2 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 221 */             if (paramInt5 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */               if (MainMemory.getI32(MainMemory.getI32Aligned(470792) + MainMemory.getI32(i3 + (paramInt3 - paramInt2 << 2)) * 344) == 64536) {
/* 232 */                 paramInt5 = 1;
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label599;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 242 */             paramInt5 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */             label599:
/*     */             
/*     */ 
/* 249 */             paramInt2 += 1;
/* 250 */             if (paramInt2 == paramInt3) {
/* 251 */               paramInt2 = paramInt5; break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label624:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 264 */           if (paramInt1 != 0) {
/*     */             break label659;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */           F293109_018.call(n, m, paramInt4);
/*     */           
/*     */           break label733;
/*     */           
/*     */           label659:
/* 279 */           MainMemory.setI32(n + m * 344 + 52, paramInt1);
/* 280 */           MainMemory.setI32(n + m * 344 + 56, 1);
/* 281 */           MainMemory.setI32(n + m * 344 + 56 + 4, 1);
/* 282 */           MainMemory.setI32(n + m * 344 + 56 + 8, 1);
/*     */           
/*     */ 
/*     */           label733:
/*     */           
/*     */ 
/* 288 */           if (paramInt11 <= 0) {
/*     */             break label773;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */           MainMemory.setI32(n + m * 344 + 56, paramInt11);
/*     */           
/*     */ 
/*     */           label773:
/*     */           
/*     */ 
/* 304 */           if (paramInt2 == 0) {
/* 305 */             paramInt1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 315 */             com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(i2), i1);
/* 316 */             i = m;
/*     */             
/*     */ 
/*     */             break label823;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 324 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label823:
/*     */       
/*     */ 
/* 330 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F293109.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */