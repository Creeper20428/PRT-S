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
/*     */ public final class ffmkyd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3485;
/*  16 */   public static final Function _instance = new ffmkyd();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffmkyd() { super("ffmkyd", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramDouble, paramInt3, paramInt4, paramInt5);
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
/*  34 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i1 = call(i, j, d, k, m, n);
/*  47 */     paramFrame.setI32(paramInt1, i1);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, double paramDouble, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  53 */     int i = 0;
/*     */     
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*     */     
/*     */ 
/*  62 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       j = MainMemory.alloc(81);
/*  67 */       k = MainMemory.alloc(71);
/*  68 */       m = MainMemory.alloc(73);
/*  69 */       n = MainMemory.alloc(81);
/*  70 */       i1 = MainMemory.getI32(paramInt5);
/*  71 */       if (i1 > 0) {
/*  72 */         paramInt3 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  82 */         MainMemory.setI8(k, (byte)0);
/*  83 */         MainMemory.setI8(m, (byte)0);
/*  84 */         if (ffgcrd.call(paramInt1, paramInt2, j, paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */           ffpsvc.call(j, k, m, paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 100 */         i1 = MainMemory.getI32(paramInt5);
/* 101 */         if (i1 > 0) {
/* 102 */           paramInt3 = i1;
/*     */         } else {
/*     */           break label171;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       i = paramInt3;
/*     */       
/*     */ 
/*     */       break label278;
/*     */       
/*     */       label171:
/*     */       
/* 120 */       ffd2e.call(paramDouble, paramInt3, k, paramInt5);
/* 121 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         if (MainMemory.getI8(paramInt4) != 38) {
/*     */           break label241;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       ffmkky.call(paramInt2, k, m, n, paramInt5);
/*     */       
/*     */       break label258;
/*     */       
/*     */       label241:
/* 146 */       ffmkky.call(paramInt2, k, paramInt4, n, paramInt5);
/*     */       
/*     */ 
/*     */       label258:
/*     */       
/*     */ 
/* 152 */       ffmkey.call(paramInt1, n, paramInt5);
/* 153 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       label278:
/*     */       
/*     */ 
/* 159 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 164 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmkyd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */