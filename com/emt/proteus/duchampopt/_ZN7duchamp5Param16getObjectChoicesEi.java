/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ 
/*     */ public final class _ZN7duchamp5Param16getObjectChoicesEi extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 236;
/*  14 */   public static final Function _instance = new _ZN7duchamp5Param16getObjectChoicesEi();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp5Param16getObjectChoicesEi() { super("_ZN7duchamp5Param16getObjectChoicesEi", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j, k);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     int i6 = 0;
/*  54 */     int i7 = 0;
/*  55 */     int i8 = 0;
/*  56 */     int i9 = 0;
/*  57 */     int i10 = 0;
/*     */     
/*     */ 
/*  60 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.alloc(20);
/*  65 */       j = MainMemory.alloc(12);
/*  66 */       k = MainMemory.alloc(20);
/*  67 */       if (_ZNKSs7compareEPKc.call(paramInt2 + 80, 12960) != 0) {
/*     */         break label377;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       MainMemory.setI32(i, 0);
/*  78 */       m = i + 4;
/*  79 */       MainMemory.setI32(m, 0);
/*  80 */       n = i + 8;
/*  81 */       MainMemory.setI32(n, 0);
/*  82 */       i4 = i + 12;
/*  83 */       MainMemory.setI32(i4, 0);
/*  84 */       i2 = i + 16;
/*  85 */       MainMemory.setI32(i2, 0);
/*  86 */       i5 = paramInt3 + 31;
/*  87 */       i3 = SystemLibrary.newobject(i5 >>> 3 & 0x1FFFFFFC);
/*  88 */       i1 = i3;
/*  89 */       i5 >>>= 5;
/*  90 */       i6 = i1 + (i5 << 2);
/*  91 */       MainMemory.setI32(i2, i6);
/*  92 */       MainMemory.setI32(i, i1);
/*  93 */       MainMemory.setI32(m, 0);
/*  94 */       i7 = paramInt3 / 32;
/*  95 */       paramInt3 %= 32;
/*  96 */       i9 = paramInt3 < 0 ? 1 : 0;
/*  97 */       MainMemory.setI32(n, i1 + ((i9 != 0 ? i7 + -1 : i7) << 2));
/*  98 */       MainMemory.setI32(i4, i9 != 0 ? paramInt3 + 32 : paramInt3);
/*  99 */       if (i1 == i6) {
/*     */         break label333;
/*     */       } else {
/* 102 */         paramInt3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 111 */         i7 = paramInt3 + 1;
/* 112 */         MainMemory.setI32(i3 + (paramInt3 << 2), -1);
/* 113 */         if (i7 == i5) {
/*     */           break;
/*     */         }
/*     */         
/* 117 */         paramInt3 = i7;
/*     */       }
/*     */       
/*     */ 
/*     */       label333:
/*     */       
/*     */ 
/* 124 */       _ZNSt6vectorIbSaIbEEC2ERKS1_.call(paramInt1, i);
/* 125 */       i4 = MainMemory.getI32(i);
/* 126 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         SystemLibrary.delete(i4);
/*     */         
/*     */ 
/*     */         break label869;
/*     */         
/*     */         label377:
/*     */         
/* 143 */         _ZN7duchamp5Param16getObjectRequestEv.call(j, paramInt2);
/* 144 */         MainMemory.setI32(k, 0);
/* 145 */         m = k + 4;
/* 146 */         MainMemory.setI32(m, 0);
/* 147 */         n = k + 8;
/* 148 */         MainMemory.setI32(n, 0);
/* 149 */         i1 = k + 12;
/* 150 */         MainMemory.setI32(i1, 0);
/* 151 */         i2 = k + 16;
/* 152 */         MainMemory.setI32(i2, 0);
/* 153 */         i5 = paramInt3 + 31;
/* 154 */         i3 = SystemLibrary.newobject(i5 >>> 3 & 0x1FFFFFFC);
/* 155 */         i4 = i3;
/* 156 */         i5 >>>= 5;
/* 157 */         i6 = i4 + (i5 << 2);
/* 158 */         MainMemory.setI32(i2, i6);
/* 159 */         MainMemory.setI32(k, i4);
/* 160 */         MainMemory.setI32(m, 0);
/* 161 */         i7 = paramInt3 / 32;
/* 162 */         i8 = paramInt3 % 32;
/* 163 */         i9 = i8 < 0 ? 1 : 0;
/* 164 */         MainMemory.setI32(n, i4 + ((i9 != 0 ? i7 + -1 : i7) << 2));
/* 165 */         MainMemory.setI32(i1, i9 != 0 ? i8 + 32 : i8);
/* 166 */         if (i4 == i6) {
/*     */           break label633;
/*     */         } else {
/* 169 */           i7 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 178 */           i8 = i7 + 1;
/* 179 */           MainMemory.setI32(i3 + (i7 << 2), 0);
/* 180 */           if (i8 == i5) {
/*     */             break;
/*     */           }
/*     */           
/* 184 */           i7 = i8;
/*     */         }
/*     */         
/*     */ 
/*     */         label633:
/*     */         
/*     */ 
/* 191 */         i1 = MainMemory.getI32(j);
/* 192 */         i6 = MainMemory.getI32(j + 4);
/* 193 */         if (i1 == i6) {
/*     */           break label786;
/*     */         } else {
/* 196 */           i7 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 205 */           i5 = i7 + 1;
/* 206 */           m = i1 + (i5 << 2);
/* 207 */           i7 = MainMemory.getI32(i1 + (i7 << 2));
/* 208 */           if (i7 <= paramInt3)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */             i7 += -1;
/* 219 */             i10 = i4 + (i7 >>> 5 << 2);
/* 220 */             MainMemory.setI32(i10, 1 << (i7 & 0x1F) | MainMemory.getI32(i10));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 226 */           if (m == i6) {
/*     */             break;
/*     */           }
/*     */           
/* 230 */           i7 = i5;
/*     */         }
/*     */         
/*     */ 
/*     */         label786:
/*     */         
/*     */ 
/* 237 */         _ZNSt6vectorIbSaIbEEC2ERKS1_.call(paramInt1, k);
/* 238 */         i4 = MainMemory.getI32(k);
/* 239 */         if (i4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */           SystemLibrary.delete(i4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 255 */         if (i1 != 0) {
/*     */           break label858;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label869;
/*     */       
/*     */ 
/*     */ 
/*     */       label858:
/*     */       
/*     */ 
/*     */ 
/* 271 */       SystemLibrary.delete(i1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label869:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param16getObjectChoicesEi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */