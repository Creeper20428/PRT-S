/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F291418 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3173;
/*  13 */   public static final Function _instance = new F291418();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F291418() { super("F291418", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*  43 */     int i3 = 0;
/*  44 */     int i4 = 0;
/*  45 */     int i5 = 0;
/*  46 */     int i6 = 0;
/*  47 */     int i7 = 0;
/*  48 */     int i8 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       F301051.call(paramInt);
/*  55 */       i = paramInt + 8;
/*  56 */       i6 = MainMemory.getI32(i);
/*  57 */       if ((MainMemory.getI32Aligned(470852) != 0) || (i6 <= 0)) {
/*     */         break label298;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       j = paramInt + 56;
/*  69 */       k = paramInt + 84;
/*  70 */       m = paramInt + 52;
/*  71 */       n = paramInt + 88;
/*  72 */       i1 = n;
/*  73 */       i2 = n;
/*  74 */       i3 = n;
/*  75 */       i4 = 0;
/*  76 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  84 */         i6 = i4 + 1;
/*  85 */         i7 = MainMemory.getI32Aligned(470792);
/*  86 */         i4 = MainMemory.getI32(paramInt + 12 + (i4 << 2));
/*  87 */         i8 = MainMemory.getI32Aligned(470812);
/*  88 */         if (MainMemory.getI32(i7 + i4 * 344) != 64536) {
/*     */           break label218;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         F291418_004.call(i7, m, i2, k, j, i8, i4, i5, i3, i1);
/*     */         
/*     */         break label244;
/*     */         
/*     */         label218:
/* 103 */         F291418_003.call(i7, m, k, i8, i5, i1, i2, j, i4, i3);
/*     */         
/*     */ 
/*     */         label244:
/*     */         
/*     */ 
/* 109 */         i5 = MainMemory.getI32(i7 + i4 * 344 + 56) + i5;
/* 110 */         i4 = MainMemory.getI32(i);
/* 111 */         if (i4 <= i6) break;
/* 112 */         i4 = i6;
/*     */       }
/*     */       
/*     */       break label298;
/* 116 */       i6 = i4;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label298:
/*     */       
/*     */ 
/*     */ 
/* 125 */       if (i6 > 0) {
/* 126 */         i5 = 0;
/*     */       } else {
/*     */         break label423;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 137 */         i6 = i5 + 1;
/* 138 */         i7 = MainMemory.getI32Aligned(470792);
/* 139 */         i5 = MainMemory.getI32(paramInt + 12 + (i5 << 2));
/* 140 */         if (MainMemory.getI32(i7 + i5 * 344) <= 0) {
/*     */           break label400;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */         free.call(MainMemory.getI32(i7 + i5 * 344 + 56 + 32));
/*     */         
/*     */ 
/*     */         label400:
/*     */         
/*     */ 
/* 156 */         if (MainMemory.getI32(i) <= i6) break;
/* 157 */         i5 = i6;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label423:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F291418.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */