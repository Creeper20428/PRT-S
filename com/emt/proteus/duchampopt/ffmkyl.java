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
/*     */ public final class ffmkyl
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3489;
/*  15 */   public static final Function _instance = new ffmkyl();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffmkyl() { super("ffmkyl", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/*  42 */     int i1 = call(i, j, k, m, n);
/*  43 */     paramFrame.setI32(paramInt1, i1);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  49 */     int i = 0;
/*     */     
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*     */     
/*     */ 
/*  58 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       j = MainMemory.alloc(81);
/*  63 */       k = MainMemory.alloc(71);
/*  64 */       m = MainMemory.alloc(73);
/*  65 */       n = MainMemory.alloc(81);
/*  66 */       i1 = MainMemory.getI32(paramInt5);
/*  67 */       if (i1 > 0) {
/*  68 */         paramInt3 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  78 */         MainMemory.setI8(k, (byte)0);
/*  79 */         MainMemory.setI8(m, (byte)0);
/*  80 */         if (ffgcrd.call(paramInt1, paramInt2, j, paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */           ffpsvc.call(j, k, m, paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  96 */         i1 = MainMemory.getI32(paramInt5);
/*  97 */         if (i1 > 0) {
/*  98 */           paramInt3 = i1;
/*     */         } else {
/*     */           break label168;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */       i = paramInt3;
/*     */       
/*     */ 
/*     */       break label278;
/*     */       
/*     */       label168:
/*     */       
/* 116 */       MainMemory.setI16(k, (short)(paramInt3 == 0 ? 70 : 84));
/* 117 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         if (MainMemory.getI8(paramInt4) != 38) {
/*     */           break label242;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       ffmkky.call(paramInt2, k, m, n, paramInt5);
/*     */       
/*     */       break label258;
/*     */       
/*     */       label242:
/* 142 */       ffmkky.call(paramInt2, k, paramInt4, n, paramInt5);
/*     */       
/*     */ 
/*     */       label258:
/*     */       
/*     */ 
/* 148 */       ffmkey.call(paramInt1, n, paramInt5);
/* 149 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       label278:
/*     */       
/*     */ 
/* 155 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 160 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmkyl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */