/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp5Image12extractImageEPfPll extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1336;
/*  16 */   public static final Function _instance = new _ZN7duchamp5Image12extractImageEPfPll();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp5Image12extractImageEPfPll() { super("_ZN7duchamp5Image12extractImageEPfPll", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*  59 */     int i7 = 0;
/*  60 */     int i8 = 0;
/*  61 */     int i9 = 0;
/*     */     
/*     */ 
/*  64 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       i = MainMemory.alloc(1);
/*  69 */       j = MainMemory.alloc(4);
/*  70 */       k = MainMemory.alloc(1);
/*  71 */       m = MainMemory.alloc(4);
/*  72 */       n = MainMemory.alloc(1);
/*  73 */       i1 = MainMemory.alloc(4);
/*  74 */       i2 = MainMemory.alloc(1);
/*  75 */       i3 = MainMemory.alloc(4);
/*  76 */       i4 = MainMemory.getI32(paramInt3);
/*  77 */       i5 = MainMemory.getI32(paramInt3 + 4);
/*  78 */       i6 = i5 * i4;
/*  79 */       if (paramInt4 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         if (MainMemory.getI32(paramInt3 + 8) <= paramInt4) {
/*     */           break label422;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         paramInt3 = paramInt1 + 16;
/* 100 */         i7 = MainMemory.getI32(paramInt3);
/* 101 */         if (i7 != i6) {
/*     */           break label357;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         if (i7 <= 0) {
/*     */           break label212;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         _ZN7duchamp5Image12extractImageEPfPll_304.call(paramInt1);
/*     */         
/*     */ 
/*     */         label212:
/*     */         
/*     */ 
/* 127 */         MainMemory.setI32(paramInt3, i6);
/* 128 */         if (i6 <= 0) {
/*     */           break label347;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         i8 = com.emt.proteus.runtime.api.SystemLibrary.newarray(i6 << 2);
/* 139 */         i9 = paramInt1 + 20;
/* 140 */         MainMemory.setI32(i9, i8);
/* 141 */         MainMemory.setI8(paramInt1 + 24, (byte)1);
/* 142 */         i4 *= i5;
/* 143 */         paramInt4 = i4 * paramInt4;
/*     */         
/* 145 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 153 */           MainMemory.setF32(i8 + (i5 << 2), MainMemory.getF32(paramInt2 + (paramInt4 + i5 << 2)));
/* 154 */           i5 += 1;
/* 155 */           if (i5 == i4) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */           i8 = MainMemory.getI32(i9);
/*     */         }
/*     */         
/*     */ 
/*     */         label347:
/*     */         
/*     */ 
/*     */         break label482;
/*     */         
/*     */ 
/*     */         label357:
/*     */         
/*     */ 
/* 178 */         _ZNSaIcEC1Ev.call(k);
/* 179 */         _ZNSsC1EPKcRKSaIcE.call(m, 128480, k);
/* 180 */         _ZNSaIcEC1Ev.call(i);
/* 181 */         _ZNSsC1EPKcRKSaIcE.call(j, 61440, i);
/* 182 */         _ZN7duchamp12duchampErrorESsSs.call(j, m);
/* 183 */         _ZNSsD1Ev.call(j);
/* 184 */         _ZNSaIcED1Ev.call(i);
/* 185 */         _ZNSsD1Ev.call(m);
/* 186 */         _ZNSaIcED1Ev.call(k);
/*     */         
/*     */         break label482;
/*     */       }
/*     */       
/*     */       label422:
/*     */       
/* 193 */       _ZNSaIcEC1Ev.call(i2);
/* 194 */       _ZNSsC1EPKcRKSaIcE.call(i3, 120480, i2);
/* 195 */       _ZNSaIcEC1Ev.call(n);
/* 196 */       _ZNSsC1EPKcRKSaIcE.call(i1, 61440, n);
/* 197 */       _ZN7duchamp12duchampErrorESsSs.call(i1, i3);
/* 198 */       _ZNSsD1Ev.call(i1);
/* 199 */       _ZNSaIcED1Ev.call(n);
/* 200 */       _ZNSsD1Ev.call(i3);
/* 201 */       _ZNSaIcED1Ev.call(i2);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label482:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Image12extractImageEPfPll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */