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
/*     */ public final class ffmkyg
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3486;
/*  16 */   public static final Function _instance = new ffmkyg();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffmkyg() { super("ffmkyg", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble, int paramInt3, int paramInt4)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramDouble, paramInt3, paramInt4);
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
/*  43 */     int n = call(i, j, d, k, m);
/*  44 */     paramFrame.setI32(paramInt1, n);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, double paramDouble, int paramInt3, int paramInt4)
/*     */   {
/*  50 */     int i = 0;
/*     */     
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*     */     
/*     */ 
/*  59 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       j = MainMemory.alloc(81);
/*  64 */       k = MainMemory.alloc(71);
/*  65 */       m = MainMemory.alloc(73);
/*  66 */       n = MainMemory.alloc(81);
/*  67 */       i1 = MainMemory.getI32(paramInt4);
/*  68 */       if (i1 <= 0)
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
/*  79 */         MainMemory.setI8(k, (byte)0);
/*  80 */         MainMemory.setI8(m, (byte)0);
/*  81 */         if (ffgcrd.call(paramInt1, paramInt2, j, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */           ffpsvc.call(j, k, m, paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  97 */         i1 = MainMemory.getI32(paramInt4);
/*  98 */         if (i1 <= 0) {
/*     */           break label163;
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
/* 110 */       i = i1;
/*     */       
/*     */ 
/*     */       break label268;
/*     */       
/*     */       label163:
/*     */       
/* 117 */       ffd2f.call(paramDouble, k, paramInt4);
/* 118 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         if (MainMemory.getI8(paramInt3) != 38) {
/*     */           break label231;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */       ffmkky.call(paramInt2, k, m, n, paramInt4);
/*     */       
/*     */       break label248;
/*     */       
/*     */       label231:
/* 143 */       ffmkky.call(paramInt2, k, paramInt3, n, paramInt4);
/*     */       
/*     */ 
/*     */       label248:
/*     */       
/*     */ 
/* 149 */       ffmkey.call(paramInt1, n, paramInt4);
/* 150 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       label268:
/*     */       
/*     */ 
/* 156 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 161 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmkyg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */