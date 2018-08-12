/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffcrtb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3592;
/*  16 */   public static final Function _instance = new ffcrtb();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffcrtb() { super("ffcrtb", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/*  35 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     call(i, j, l, k, m, n, i1, i2, i3);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  63 */     int i = 0;
/*  64 */     int j = 0;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  72 */       if (MainMemory.getI32(paramInt8) <= 0) {
/*     */         break label43;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label343;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label43:
/*     */       
/*     */ 
/*     */ 
/*  88 */       m = MainMemory.getI32(paramInt1);
/*  89 */       i = paramInt1 + 4;
/*  90 */       j = MainMemory.getI32(i);
/*  91 */       k = MainMemory.getI32(j + 64);
/*  92 */       if (m == k) {
/*  93 */         m = k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 104 */         ffmahd.call(paramInt1, m + 1, 0, paramInt8);
/* 105 */         j = MainMemory.getI32(i);
/* 106 */         m = MainMemory.getI32(j + 64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       if (MainMemory.getI64(j + 88) != MainMemory.getI64(MainMemory.getI32(j + 84) + (m << 3)))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         ffcrhd.call(paramInt1, paramInt8);
/* 128 */         m = MainMemory.getI32(MainMemory.getI32(i) + 64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       if (m != 0) {
/*     */         break label228;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       ffcrim.call(paramInt1, 16, 0, 0, paramInt8);
/* 147 */       ffcrhd.call(paramInt1, paramInt8);
/*     */       
/*     */ 
/*     */       label228:
/*     */       
/*     */ 
/* 153 */       switch (paramInt2)
/*     */       {
/*     */       case 2: 
/*     */         break label303;
/*     */         
/*     */         break;
/*     */       case 1: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 164 */       ffphtb.call(paramInt1, paramLong, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */       
/*     */ 
/*     */       break label343;
/*     */       
/*     */       label303:
/*     */       
/* 171 */       ffphbn.call(paramInt1, paramLong, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */       
/*     */ 
/*     */ 
/*     */       break label343;
/*     */       
/*     */ 
/* 178 */       MainMemory.setI32(paramInt8, 235);
/*     */       
/*     */ 
/*     */       label343:
/*     */       
/*     */ 
/* 184 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcrtb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */