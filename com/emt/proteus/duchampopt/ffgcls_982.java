/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgcls_982 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffgcls_982();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffgcls_982() { super("ffgcls_982", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramLong, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
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
/*  51 */     call(i, j, k, l, m, n, i1, i2, i3);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
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
/*  68 */     double d = 0.0D;
/*  69 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  75 */       if (paramLong > 0L)
/*     */       {
/*  77 */         i = paramInt6 == 2 ? 1 : 0;
/*  78 */         l1 = paramInt4 & 0xFFFFFFFF;
/*  79 */         l2 = paramInt7 + 8 & 0xFFFFFFFF;
/*  80 */         l3 = paramInt3 & 0xFFFFFFFF;
/*  81 */         l4 = paramInt5 & 0xFFFFFFFF;
/*  82 */         l5 = 0L;
/*     */         
/*     */         for (;;)
/*     */         {
/*  86 */           l6 = l5 << 4;
/*  87 */           j = (int)(l1 + l6);
/*  88 */           k = (int)(l2 + l6);
/*  89 */           m = (int)(l3 + (l5 << 2));
/*  90 */           paramInt7 = (int)(l4 + l5);
/*  91 */           MainMemory.setI16(MainMemory.getI32(m), (short)40);
/*  92 */           d = MainMemory.getF64(j);
/*  93 */           if (com.emt.proteus.lib.api.MathUtils.f_oeq(d, -9.1191291391491E-36D))
/*     */           {
/*  95 */             SystemLibrary.memcpy(paramInt1, 19264, 5, 1);
/*  96 */             if (i != 0)
/*     */             {
/*  98 */               MainMemory.setI8(paramInt7, (byte)1);
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
/* 112 */             SystemLibrary.sprintf(paramInt1, paramInt8, new Object[] { Double.valueOf(d) });
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */           SystemLibrary.strncat(MainMemory.getI32(m), paramInt1, paramInt2);
/* 121 */           n = MainMemory.getI32(m);
/* 122 */           MainMemory.setI16(n + SystemLibrary.strlen(n), (short)44);
/* 123 */           d = MainMemory.getF64(k);
/* 124 */           if (com.emt.proteus.lib.api.MathUtils.f_oeq(d, -9.1191291391491E-36D))
/*     */           {
/* 126 */             SystemLibrary.memcpy(paramInt1, 19264, 5, 1);
/* 127 */             if (i != 0)
/*     */             {
/* 129 */               MainMemory.setI8(paramInt7, (byte)1);
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
/* 143 */             SystemLibrary.sprintf(paramInt1, paramInt8, new Object[] { Double.valueOf(d) });
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */           SystemLibrary.strncat(MainMemory.getI32(m), paramInt1, paramInt2);
/* 152 */           paramInt7 = MainMemory.getI32(m);
/* 153 */           MainMemory.setI16(paramInt7 + SystemLibrary.strlen(paramInt7), (short)41);
/* 154 */           l5 += 1L;
/* 155 */           if (l5 == paramLong) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcls_982.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */