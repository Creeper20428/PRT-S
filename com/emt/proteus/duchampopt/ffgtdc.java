/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgtdc extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3424;
/*  11 */   public static final Function _instance = new ffgtdc();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffgtdc() { super("ffgtdc", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int n = call(i, j, k, m);
/*  36 */     paramFrame.setI32(paramInt1, n);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  42 */     int i = 0;
/*     */     
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
/*     */     
/*     */ 
/*  59 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       j = MainMemory.alloc(16);
/*  64 */       k = MainMemory.alloc(3);
/*  65 */       m = MainMemory.alloc(12);
/*  66 */       n = MainMemory.alloc(4);
/*  67 */       i1 = MainMemory.alloc(15);
/*  68 */       i2 = MainMemory.alloc(3);
/*  69 */       i3 = MainMemory.alloc(16);
/*  70 */       i4 = MainMemory.alloc(3);
/*  71 */       i5 = MainMemory.alloc(16);
/*  72 */       i6 = MainMemory.alloc(3);
/*  73 */       i7 = MainMemory.alloc(16);
/*  74 */       i8 = MainMemory.alloc(5);
/*  75 */       SystemLibrary.memcpy(j, 56736, 16, 1);
/*  76 */       MainMemory.setI8(k, (byte)56);
/*  77 */       MainMemory.setI8(k + 1, (byte)65);
/*  78 */       MainMemory.setI8(k + 2, (byte)0);
/*  79 */       SystemLibrary.memcpy(m, 51200, 12, 1);
/*  80 */       MainMemory.setI8(n, (byte)51);
/*  81 */       MainMemory.setI8(n + 1, (byte)50);
/*  82 */       MainMemory.setI8(n + 2, (byte)65);
/*  83 */       MainMemory.setI8(n + 3, (byte)0);
/*  84 */       SystemLibrary.memcpy(i1, 55072, 15, 1);
/*  85 */       MainMemory.setI8(i2, (byte)49);
/*  86 */       MainMemory.setI8(i2 + 1, (byte)74);
/*  87 */       MainMemory.setI8(i2 + 2, (byte)0);
/*  88 */       SystemLibrary.memcpy(i3, 56768, 16, 1);
/*  89 */       MainMemory.setI8(i4, (byte)49);
/*  90 */       MainMemory.setI8(i4 + 1, (byte)74);
/*  91 */       MainMemory.setI8(i4 + 2, (byte)0);
/*  92 */       SystemLibrary.memcpy(i5, 56800, 16, 1);
/*  93 */       MainMemory.setI8(i6, (byte)51);
/*  94 */       MainMemory.setI8(i6 + 1, (byte)65);
/*  95 */       MainMemory.setI8(i6 + 2, (byte)0);
/*  96 */       SystemLibrary.memcpy(i7, 56832, 16, 1);
/*  97 */       MainMemory.setI8(i8, (byte)50);
/*  98 */       MainMemory.setI8(i8 + 1, (byte)53);
/*  99 */       MainMemory.setI8(i8 + 2, (byte)54);
/* 100 */       MainMemory.setI8(i8 + 3, (byte)65);
/* 101 */       MainMemory.setI8(i8 + 4, (byte)0);
/* 102 */       i9 = MainMemory.getI32(paramInt4);
/* 103 */       if (i9 != 0) {
/*     */         break label550;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt1), j);
/* 114 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt2), k);
/* 115 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt1 + 4), m);
/* 116 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt2 + 4), n);
/* 117 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt1 + 8), i1);
/* 118 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt2 + 8), i2);
/* 119 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt1 + 12), i3);
/* 120 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt2 + 12), i4);
/* 121 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt1 + 16), i7);
/* 122 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt2 + 16), i8);
/* 123 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt1 + 20), i5);
/* 124 */       SystemLibrary.strcpy(MainMemory.getI32(paramInt2 + 20), i6);
/* 125 */       MainMemory.setI32(paramInt3, 6);
/* 126 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       break label559;
/*     */       
/*     */       label550:
/*     */       
/* 133 */       i = i9;
/*     */       
/*     */ 
/*     */       label559:
/*     */       
/*     */ 
/* 139 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 144 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtdc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */