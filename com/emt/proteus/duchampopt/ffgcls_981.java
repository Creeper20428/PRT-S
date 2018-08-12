/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgcls_981 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffgcls_981();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffgcls_981() { super("ffgcls_981", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, l, k, m, n, i1, i2, i3);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     long l1 = 0L;
/*  60 */     long l2 = 0L;
/*  61 */     long l3 = 0L;
/*  62 */     long l4 = 0L;
/*  63 */     long l5 = 0L;
/*  64 */     long l6 = 0L;
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     int m = 0;
/*  68 */     float f = 0.0F;
/*  69 */     double d = 0.0D;
/*  70 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       if (paramLong > 0L)
/*     */       {
/*  78 */         i = paramInt7 == 2 ? 1 : 0;
/*  79 */         l1 = paramInt4 & 0xFFFFFFFF;
/*  80 */         l2 = paramInt5 + 4 & 0xFFFFFFFF;
/*  81 */         l3 = paramInt2 & 0xFFFFFFFF;
/*  82 */         l4 = paramInt6 & 0xFFFFFFFF;
/*  83 */         l5 = 0L;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           l6 = l5 << 3;
/*  88 */           j = (int)(l1 + l6);
/*  89 */           k = (int)(l2 + l6);
/*  90 */           m = (int)(l3 + (l5 << 2));
/*  91 */           paramInt5 = (int)(l4 + l5);
/*  92 */           MainMemory.setI16(MainMemory.getI32(m), (short)40);
/*  93 */           f = MainMemory.getF32(j);
/*  94 */           if (com.emt.proteus.lib.api.MathUtils.f_oeq(f, -9.119119840596153E-36D))
/*     */           {
/*  96 */             SystemLibrary.memcpy(paramInt1, 19264, 5, 1);
/*  97 */             if (i != 0)
/*     */             {
/*  99 */               MainMemory.setI8(paramInt5, (byte)1);
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 113 */             d = f;
/* 114 */             SystemLibrary.sprintf(paramInt1, paramInt8, new Object[] { Double.valueOf(d) });
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */           SystemLibrary.strncat(MainMemory.getI32(m), paramInt1, paramInt3);
/* 123 */           n = MainMemory.getI32(m);
/* 124 */           MainMemory.setI16(n + SystemLibrary.strlen(n), (short)44);
/* 125 */           f = MainMemory.getF32(k);
/* 126 */           if (com.emt.proteus.lib.api.MathUtils.f_oeq(f, -9.119119840596153E-36D))
/*     */           {
/* 128 */             SystemLibrary.memcpy(paramInt1, 19264, 5, 1);
/* 129 */             if (i != 0)
/*     */             {
/* 131 */               MainMemory.setI8(paramInt5, (byte)1);
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 145 */             d = f;
/* 146 */             SystemLibrary.sprintf(paramInt1, paramInt8, new Object[] { Double.valueOf(d) });
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */           SystemLibrary.strncat(MainMemory.getI32(m), paramInt1, paramInt3);
/* 155 */           paramInt5 = MainMemory.getI32(m);
/* 156 */           MainMemory.setI16(paramInt5 + SystemLibrary.strlen(paramInt5), (short)41);
/* 157 */           l5 += 1L;
/* 158 */           if (l5 == paramLong) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcls_981.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */