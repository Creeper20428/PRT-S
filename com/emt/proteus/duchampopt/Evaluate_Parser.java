/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class Evaluate_Parser extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3164;
/*  12 */   public static final Function _instance = new Evaluate_Parser();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public Evaluate_Parser() { super("Evaluate_Parser", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     call(paramInt1, paramInt2);
/*  20 */     return 0;
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
/*  31 */     call(i, j);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       MainMemory.setI32Aligned(470808, paramInt1);
/*  58 */       MainMemory.setI32Aligned(470812, paramInt2);
/*  59 */       paramInt1 -= MainMemory.getI32Aligned(470832);
/*  60 */       if (MainMemory.getI32Aligned(470796) > 0) {
/*  61 */         paramInt2 = 0;
/*     */       } else {
/*     */         break label602;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  72 */         n = paramInt2 + 1;
/*  73 */         j = MainMemory.getI32Aligned(470792);
/*  74 */         i9 = MainMemory.getI32(j + paramInt2 * 344);
/*  75 */         if ((i9 > 0) || (i9 != 64536))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */           i9 = 0 - i9;
/*  86 */           i = MainMemory.getI32Aligned(470824);
/*  87 */           i1 = MainMemory.getI32(i + i9 * 124 + 88) * paramInt1;
/*  88 */           MainMemory.setI32(j + paramInt2 * 344 + 56 + 28, MainMemory.getI32(i + i9 * 124 + 116) + i1);
/*  89 */           j = MainMemory.getI32Aligned(470792);
/*  90 */           switch (MainMemory.getI32(j + paramInt2 * 344 + 52)) {
/*     */           case 258: 
/*     */             break label538;
/*     */             break;
/*     */           case 259: 
/*     */             break label490;
/*     */             break;
/*     */           case 260: 
/*     */             break label442;
/*     */             break;
/*     */           case 261: 
/*     */             break label356;
/*     */             break;
/*     */           case 262:  break; }
/* 104 */           MainMemory.setI32(j + paramInt2 * 344 + 56 + 32, MainMemory.getI32(MainMemory.getI32Aligned(470824) + i9 * 124 + 120) + (paramInt1 << 2));
/* 105 */           MainMemory.setI32(MainMemory.getI32Aligned(470792) + paramInt2 * 344 + 56 + 28, 0);
/*     */           
/*     */           break label579;
/*     */           
/*     */           label356:
/* 110 */           MainMemory.setI32(j + paramInt2 * 344 + 56 + 32, MainMemory.getI32(MainMemory.getI32Aligned(470824) + i9 * 124 + 120) + (paramInt1 << 2));
/* 111 */           MainMemory.setI32(MainMemory.getI32Aligned(470792) + paramInt2 * 344 + 56 + 28, MainMemory.getI32(MainMemory.getI32Aligned(470824) + i9 * 124 + 116) + paramInt1);
/*     */           
/*     */           break label579;
/*     */           
/*     */           label442:
/* 116 */           MainMemory.setI32(j + paramInt2 * 344 + 56 + 32, MainMemory.getI32(MainMemory.getI32Aligned(470824) + i9 * 124 + 120) + (i1 << 3));
/*     */           
/*     */           break label579;
/*     */           
/*     */           label490:
/* 121 */           MainMemory.setI32(j + paramInt2 * 344 + 56 + 32, MainMemory.getI32(MainMemory.getI32Aligned(470824) + i9 * 124 + 120) + (i1 << 2));
/*     */           
/*     */           break label579;
/*     */           
/*     */           label538:
/* 126 */           MainMemory.setI32(j + paramInt2 * 344 + 56 + 32, MainMemory.getI32(MainMemory.getI32Aligned(470824) + i9 * 124 + 120) + i1);
/*     */         }
/*     */         
/*     */ 
/*     */         label579:
/*     */         
/* 132 */         if (MainMemory.getI32Aligned(470796) <= n) break;
/* 133 */         paramInt2 = n;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label602:
/*     */       
/*     */ 
/*     */ 
/* 143 */       paramInt1 = MainMemory.getI32Aligned(470804);
/* 144 */       i9 = MainMemory.getI32Aligned(470852);
/* 145 */       if (i9 != 0) {
/*     */         break label1021;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */       j = MainMemory.getI32Aligned(470792);
/* 156 */       k = j + paramInt1 * 344;
/* 157 */       if (MainMemory.getI32(j + paramInt1 * 344) <= 0) {
/*     */         break label1021;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */       m = j + paramInt1 * 344 + 8;
/* 168 */       paramInt2 = MainMemory.getI32(m);
/* 169 */       n = paramInt2 + -1;
/* 170 */       i5 = i9;
/* 171 */       i9 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 179 */         if (n - i9 != -1) {
/*     */           break label759;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */         com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(j + paramInt1 * 344 + 4), k);
/*     */         
/*     */ 
/*     */         break label1026;
/*     */         
/*     */         label759:
/*     */         
/* 196 */         i1 = MainMemory.getI32(m + (paramInt2 - i9 << 2));
/* 197 */         if (i5 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 201 */           i1 = i5;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 208 */           i2 = MainMemory.getI32Aligned(470792);
/* 209 */           i3 = i2 + i1 * 344;
/* 210 */           if (MainMemory.getI32(i2 + i1 * 344) <= 0) {
/*     */             break label984;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */           i4 = i2 + i1 * 344 + 8;
/* 221 */           i5 = MainMemory.getI32(i4);
/* 222 */           i6 = i5 + -1;
/* 223 */           i8 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 230 */             if (i6 - i8 != -1) {
/*     */               break label928;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */             com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(i2 + i1 * 344 + 4), i3);
/*     */             
/*     */             break label984;
/*     */             
/*     */             label928:
/* 245 */             F290158.call(MainMemory.getI32(i4 + (i5 - i8 << 2)));
/* 246 */             i7 = MainMemory.getI32Aligned(470852);
/* 247 */             i8 += 1;
/* 248 */             if (i7 != 0)
/*     */               break;
/*     */           }
/*     */           break label984;
/* 252 */           i1 = i7;
/*     */           
/*     */ 
/*     */           break label996;
/*     */           
/*     */           label984:
/*     */           
/* 259 */           i1 = MainMemory.getI32Aligned(470852);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label996:
/*     */         
/*     */ 
/* 267 */         i9 += 1;
/* 268 */         if (i1 != 0) break;
/* 269 */         i5 = i1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1021:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1026:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 285 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/Evaluate_Parser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */