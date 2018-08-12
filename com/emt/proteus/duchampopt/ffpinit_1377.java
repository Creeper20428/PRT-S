/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffpinit_1377
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  15 */   public static final Function _instance = new ffpinit_1377();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpinit_1377() { super("ffpinit_1377", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     call(i, j, k, m, n, i1, i2, i3, i4);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  62 */     int i = 0;
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  69 */       Jump.label(323795);
/*  70 */       if (MainMemory.getI64(paramInt9) == 0L)
/*     */       {
/*  72 */         MainMemory.setI32(paramInt2, 0);
/*  73 */         k = MainMemory.getI32(paramInt3);
/*  74 */         i = MainMemory.getI32(paramInt4);
/*  75 */         j = MainMemory.getI32(i + 64);
/*  76 */         if (k == j) {
/*  77 */           k = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  84 */           ffmahd.call(paramInt3, k + 1, 0, paramInt1);
/*  85 */           i = MainMemory.getI32(paramInt4);
/*  86 */           j = MainMemory.getI32(i + 64);
/*  87 */           k = MainMemory.getI32(paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         Jump.label(323818);
/*     */         
/*     */ 
/*     */ 
/* 101 */         MainMemory.setI64(i + 104, MainMemory.getI64(MainMemory.getI32(i + 84) + (j << 3)) + 80L);
/* 102 */         if (k <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */           MainMemory.setI8(paramInt7, (byte)0);
/* 109 */           MainMemory.setI8(paramInt8, (byte)0);
/* 110 */           if (ffgcrd.call(paramInt3, 31744, paramInt5, paramInt2) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 115 */             ffpsvc.call(paramInt5, paramInt7, paramInt8, paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */           Jump.label(323845);
/* 123 */           ffc2l.call(paramInt7, paramInt6, paramInt2);
/* 124 */           k = MainMemory.getI32(paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         Jump.label(323850);
/*     */         
/* 136 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 141 */           MainMemory.setI32(paramInt6, 0);
/*     */         }
/*     */       }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpinit_1377.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */