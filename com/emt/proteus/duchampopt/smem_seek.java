/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class smem_seek extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3125;
/*  12 */   public static final Function _instance = new smem_seek();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public smem_seek() { super("smem_seek", 2, false); }
/*     */   
/*     */   public int execute(int paramInt, long paramLong)
/*     */   {
/*  19 */     return call(paramInt, paramLong);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = call(i, l);
/*  31 */     paramFrame.setI32(paramInt1, j);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt, long paramLong)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       if (paramLong < 0L) {
/*  48 */         paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  58 */         if (!MainMemory.getI1(459056))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */           j = shared_init.call();
/*  69 */           if (j != 0) {
/*     */             break label251;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         if (paramInt < 0) {
/*  81 */           paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*  91 */         else if (MainMemory.getI32Aligned(459504) <= paramInt)
/*     */         {
/*     */ 
/*     */ 
/*  95 */           paramInt = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 102 */           k = MainMemory.getI32Aligned(458776);
/* 103 */           m = MainMemory.getI32(k + (paramInt << 4));
/* 104 */           if (m == 0) {
/* 105 */             paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 115 */           else if (MainMemory.getI32(k + (paramInt << 4) + 8) == 0) {
/* 116 */             paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 126 */           else if (MainMemory.getI8(m) != 74)
/*     */           {
/*     */ 
/*     */ 
/* 130 */             paramInt = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 137 */           else if (MainMemory.getI8(m + 1) != 66)
/*     */           {
/*     */ 
/*     */ 
/* 141 */             paramInt = -1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 148 */             j = MainMemory.getI8(m + 2) == 1 ? 0 : 151;
/*     */             
/*     */ 
/*     */ 
/*     */             label251:
/*     */             
/*     */ 
/*     */ 
/* 156 */             if (j != 0)
/*     */             {
/*     */ 
/*     */ 
/* 160 */               paramInt = -1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 167 */               MainMemory.setI32(MainMemory.getI32Aligned(458776) + (paramInt << 4) + 12, (int)paramLong);
/* 168 */               i = 0;
/*     */               
/*     */               break label307;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 176 */       i = paramInt;
/*     */       
/*     */ 
/*     */       label307:
/*     */       
/*     */ 
/* 182 */       int n = i; return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_seek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */