/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ngp_append_columns extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3441;
/*  12 */   public static final Function _instance = new ngp_append_columns();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ngp_append_columns() { super("ngp_append_columns", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*  53 */     int i8 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*     */     
/*     */ 
/*  58 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       j = MainMemory.alloc(4);
/*  63 */       k = MainMemory.alloc(4);
/*  64 */       m = MainMemory.alloc(4);
/*  65 */       n = MainMemory.alloc(4);
/*  66 */       i1 = MainMemory.alloc(1);
/*  67 */       if ((paramInt1 == 0) || (paramInt2 == 0)) {
/*  68 */         paramInt3 = 362;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  78 */       else if (MainMemory.getI32(paramInt2) == 0) {
/*  79 */         paramInt3 = 0;
/*     */       } else {
/*     */         break label135;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       i = paramInt3;
/*     */       
/*     */ 
/*     */       break label673;
/*     */       
/*     */       label135:
/*     */       
/*  97 */       MainMemory.setI32(m, 0);
/*  98 */       i2 = paramInt2 + 4;
/*  99 */       i3 = paramInt3 + 1;
/* 100 */       i4 = 0;
/* 101 */       i8 = 0;
/* 102 */       i9 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 111 */         i10 = i3 + i8;
/* 112 */         if (i8 + paramInt3 < 999) {
/* 113 */           i4 = 0;
/* 114 */           i7 = 0;
/* 115 */           i5 = 12960;
/*     */         }
/*     */         else
/*     */         {
/* 119 */           paramInt3 = i4;
/* 120 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 129 */           i6 = MainMemory.getI32(i2);
/* 130 */           if (com.emt.proteus.runtime.api.SystemLibrary.sscanf(MainMemory.getI32(i2) + i4 * 172 + 4, 47456, new int[] { n, i1 }) != 1) {
/*     */             break label344;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */           if (MainMemory.getI32(i6 + i4 * 172) != 2) {
/*     */             break label471;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */           if (i10 != MainMemory.getI32(n)) {
/*     */             break label471;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */           i7 = MainMemory.getI32(i6 + i4 * 172 + 76);
/*     */           
/*     */ 
/*     */           break label471;
/*     */           
/*     */           label344:
/*     */           
/* 171 */           if (com.emt.proteus.runtime.api.SystemLibrary.sscanf(i6 + i4 * 172 + 4, 47488, new int[] { n, i1 }) != 1) {
/*     */             break label471;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           i6 = MainMemory.getI32(i2);
/* 184 */           if (MainMemory.getI32(i6 + i4 * 172) != 2) {
/*     */             break label471;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */           if (i10 != MainMemory.getI32(n)) {
/*     */             break label471;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */           i5 = MainMemory.getI32(i6 + i4 * 172 + 76);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label471:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 218 */           if (i7 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */             if (MainMemory.getI8(i5) != 0) {
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
/* 239 */           if (MainMemory.getI32(paramInt2) + -1 <= i4)
/*     */           {
/*     */ 
/*     */ 
/* 243 */             i9 = 1;
/* 244 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 250 */           i4 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */         i4 = MainMemory.getI32(m);
/* 260 */         if ((i4 != 0) || (i7 == 0))
/*     */         {
/*     */ 
/*     */ 
/* 264 */           i10 = i4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 271 */           MainMemory.setI32(j, i5);
/* 272 */           MainMemory.setI32(k, i7);
/* 273 */           fficls.call(paramInt1, i10, j, k, m);
/* 274 */           i10 = MainMemory.getI32(m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */         if ((i10 | i9) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 286 */           paramInt3 = i10;
/* 287 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 293 */         i8 += 1;
/* 294 */         i4 = i10;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */       i = paramInt3;
/*     */       
/*     */ 
/*     */       label673:
/*     */       
/*     */ 
/* 308 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 313 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_append_columns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */