/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class smem_size extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3127;
/*  12 */   public static final Function _instance = new smem_size();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public smem_size() { super("smem_size", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = call(i, j);
/*  31 */     paramFrame.setI32(paramInt1, k);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
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
/*  47 */       if (paramInt2 == 0) {
/*  48 */         paramInt1 = 152;
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
/*     */             break label245;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         if (paramInt1 < 0) {
/*  81 */           paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*  91 */         else if (MainMemory.getI32Aligned(459504) <= paramInt1)
/*     */         {
/*     */ 
/*     */ 
/*  95 */           paramInt1 = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 102 */           k = MainMemory.getI32Aligned(458776);
/* 103 */           m = MainMemory.getI32(k + (paramInt1 << 4));
/* 104 */           if (m == 0) {
/* 105 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 115 */           else if (MainMemory.getI32(k + (paramInt1 << 4) + 8) == 0) {
/* 116 */             paramInt1 = -1;
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
/* 130 */             paramInt1 = -1;
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
/* 141 */             paramInt1 = -1;
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
/*     */             label245:
/*     */             
/*     */ 
/*     */ 
/* 156 */             if (j != 0)
/*     */             {
/*     */ 
/*     */ 
/* 160 */               paramInt1 = -1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 167 */               MainMemory.setI64(paramInt2, MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt1 * 28 + 16) + -16 & 0xFFFFFFFF);
/* 168 */               i = 0;
/*     */               
/*     */               break label311;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 176 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label311:
/*     */       
/*     */ 
/* 182 */       int n = i; return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_size.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */