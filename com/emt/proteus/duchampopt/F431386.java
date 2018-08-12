/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F431386 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3690;
/*  13 */   public static final Function _instance = new F431386();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F431386() { super("F431386", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
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
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     int i2 = 0;
/*  46 */     int i3 = 0;
/*  47 */     int i4 = 0;
/*  48 */     int i5 = 0;
/*  49 */     int i6 = 0;
/*  50 */     int i7 = 0;
/*  51 */     int i8 = 0;
/*  52 */     int i9 = 0;
/*  53 */     int i10 = 0;
/*  54 */     int i11 = 0;
/*  55 */     int i12 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       j = MainMemory.getI32(paramInt1 + 12) + -5;
/*  62 */       j = MathUtils.ult(j, 65535) ? j : 65535;
/*  63 */       k = paramInt1 + 116;
/*  64 */       m = paramInt1 + 108;
/*  65 */       n = paramInt1 + 92;
/*  66 */       i1 = paramInt1 + 56;
/*  67 */       i2 = paramInt1 + 44;
/*  68 */       i3 = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  74 */         i8 = MainMemory.getI32(k);
/*  75 */         if (!MathUtils.ult(i8, 2)) {
/*     */           break label439;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         F431145.call(paramInt1);
/*  87 */         i8 = MainMemory.getI32(k);
/*  88 */         if ((i8 | paramInt2) == 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (i8 != 0) {
/*     */           break label439;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         i12 = paramInt2 == 4 ? 1 : 0;
/* 110 */         paramInt2 = i12 != 0 ? 1 : 0;
/* 111 */         i8 = MainMemory.getI32(n);
/* 112 */         j = MainMemory.getI32(m) - i8;
/* 113 */         if (i8 <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 117 */           i11 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 124 */           i11 = MainMemory.getI32(i1) + i8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         _tr_flush_block.call(i3, i11, j, paramInt2);
/* 133 */         MainMemory.setI32(n, MainMemory.getI32(m));
/* 134 */         i5 = MainMemory.getI32(paramInt1);
/* 135 */         i6 = i5 + 28;
/* 136 */         i7 = MainMemory.getI32(i6);
/* 137 */         paramInt2 = MainMemory.getI32(i7 + 20);
/* 138 */         m = i5 + 16;
/* 139 */         j = MainMemory.getI32(m);
/* 140 */         paramInt2 = MathUtils.ult(j, paramInt2) ? j : paramInt2;
/* 141 */         if (paramInt2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */           F431386_168.call(m, i6, paramInt2, i7, i5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 157 */         if (MainMemory.getI32(MainMemory.getI32(paramInt1) + 16) != 0) {
/*     */           break label418;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */         i = i12 != 0 ? 2 : 0;
/*     */         
/*     */ 
/*     */         break label931;
/*     */         
/*     */         label418:
/*     */         
/* 174 */         i = i12 != 0 ? 3 : 1;
/*     */         
/*     */ 
/*     */         break label931;
/*     */         
/*     */ 
/*     */         label439:
/*     */         
/* 182 */         i10 = i8 + MainMemory.getI32(m);
/* 183 */         MainMemory.setI32(m, i10);
/* 184 */         MainMemory.setI32(k, 0);
/* 185 */         i8 = MainMemory.getI32(n);
/* 186 */         i4 = i8 + j;
/* 187 */         if ((i10 == 0) || (!MathUtils.ult(i10, i4)))
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
/*     */ 
/* 199 */           MainMemory.setI32(k, i10 - i4);
/* 200 */           MainMemory.setI32(m, i4);
/* 201 */           if (i8 <= -1)
/*     */           {
/*     */ 
/*     */ 
/* 205 */             i11 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 212 */             i11 = MainMemory.getI32(i1) + i8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */           _tr_flush_block.call(i3, i11, j, 0);
/* 221 */           MainMemory.setI32(n, MainMemory.getI32(m));
/* 222 */           i5 = MainMemory.getI32(paramInt1);
/* 223 */           i6 = i5 + 28;
/* 224 */           i7 = MainMemory.getI32(i6);
/* 225 */           i8 = MainMemory.getI32(i7 + 20);
/* 226 */           i9 = i5 + 16;
/* 227 */           i10 = MainMemory.getI32(i9);
/* 228 */           i8 = MathUtils.ult(i10, i8) ? i10 : i8;
/* 229 */           if (i8 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */             F431386_167.call(i9, i5, i7, i8, i6);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 245 */           if (MainMemory.getI32(MainMemory.getI32(paramInt1) + 16) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */             i10 = MainMemory.getI32(m);
/* 256 */             i8 = MainMemory.getI32(n);
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 266 */           i10 -= i8;
/* 267 */           if (MathUtils.ult(i10, MainMemory.getI32(i2) + 65274)) {
/*     */             continue;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */           if (i8 <= -1)
/*     */           {
/*     */ 
/*     */ 
/* 281 */             i11 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 288 */             i11 = MainMemory.getI32(i1) + i8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */           _tr_flush_block.call(i3, i11, i10, 0);
/* 297 */           MainMemory.setI32(n, MainMemory.getI32(m));
/* 298 */           i5 = MainMemory.getI32(paramInt1);
/* 299 */           i6 = i5 + 28;
/* 300 */           i7 = MainMemory.getI32(i6);
/* 301 */           i8 = MainMemory.getI32(i7 + 20);
/* 302 */           i9 = i5 + 16;
/* 303 */           i10 = MainMemory.getI32(i9);
/* 304 */           i8 = MathUtils.ult(i10, i8) ? i10 : i8;
/* 305 */           if (i8 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */             F431386_166.call(i6, i5, i9, i8, i7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 321 */           if (MainMemory.getI32(MainMemory.getI32(paramInt1) + 16) == 0) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */       i = 0;
/*     */       
/*     */ 
/*     */       label931:
/*     */       
/*     */ 
/* 337 */       int i13 = i; return i13;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F431386.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */