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
/*     */ public final class ffirow_1109
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  15 */   public static final Function _instance = new ffirow_1109();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffirow_1109() { super("ffirow_1109", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramLong1, paramLong2);
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
/*  43 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, j, k, m, n, l1, l2);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2)
/*     */   {
/*  56 */     long l1 = 0L;
/*  57 */     long l2 = 0L;
/*  58 */     long l3 = 0L;
/*  59 */     long l4 = 0L;
/*  60 */     long l5 = 0L;
/*  61 */     int i = 0;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  66 */       Jump.label(279708);
/*  67 */       if (paramLong2 != 0L)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  72 */         l1 = MainMemory.getI64(paramInt2 + 936);
/*  73 */         l2 = MainMemory.getI64(paramInt2 + 928);
/*  74 */         if (l2 < paramLong1)
/*     */         {
/*  76 */           ffxmsg.call(5, 138912);
/*  77 */           MainMemory.setI32(paramInt5, 307);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*  84 */         else if (paramLong1 < 0L)
/*     */         {
/*  86 */           ffxmsg.call(5, 92512);
/*  87 */           MainMemory.setI32(paramInt5, 307);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  94 */           l3 = MainMemory.getI64(paramInt2 + 956) + MainMemory.getI64(paramInt2 + 948);
/*  95 */           l5 = l3 + 2879L;
/*  96 */           l4 = l5 - l5 % 2880L - l3;
/*  97 */           l5 = l1 * paramLong2;
/*  98 */           if (l4 - l5 < 0L)
/*     */           {
/* 100 */             ffiblk.call(paramInt1, (int)((l5 + 2879L - l4) / 2880L), 1, paramInt5);
/* 101 */             paramInt2 = MainMemory.getI32(paramInt4);
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
/*     */ 
/* 113 */           Jump.label(279758);
/*     */           
/* 115 */           paramLong1 = l1 * paramLong1;
/* 116 */           ffshft.call(paramInt1, MainMemory.getI64(paramInt2 + 112) + paramLong1, l3 - paramLong1, l5, paramInt5);
/* 117 */           i = MainMemory.getI32(paramInt4) + 948;
/* 118 */           MainMemory.setI64(i, MainMemory.getI64(i) + l5);
/* 119 */           MainMemory.setI32(paramInt3, 0);
/* 120 */           ffmkyj.call(paramInt1, 27296, MainMemory.getI64(MainMemory.getI32(paramInt4) + 948), 14112, paramInt3);
/* 121 */           ffmkyj.call(paramInt1, 35712, l2 + paramLong2, 14112, paramInt5);
/* 122 */           i = MainMemory.getI32(paramInt4) + 928;
/* 123 */           MainMemory.setI64(i, MainMemory.getI64(i) + paramLong2);
/* 124 */           i = MainMemory.getI32(paramInt4) + 920;
/* 125 */           MainMemory.setI64(i, MainMemory.getI64(i) + paramLong2);
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
/* 142 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffirow_1109.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */