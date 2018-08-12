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
/*     */ public final class ffmnam
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3492;
/*  15 */   public static final Function _instance = new ffmnam();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffmnam() { super("ffmnam", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  39 */     int n = call(i, j, k, m);
/*  40 */     paramFrame.setI32(paramInt1, n);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*     */     
/*     */ 
/*  55 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(81);
/*  60 */       k = MainMemory.alloc(73);
/*  61 */       m = MainMemory.alloc(71);
/*  62 */       n = MainMemory.alloc(81);
/*  63 */       i1 = MainMemory.getI32(paramInt4);
/*  64 */       if (i1 <= 0)
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
/*  75 */         MainMemory.setI8(m, (byte)0);
/*  76 */         MainMemory.setI8(k, (byte)0);
/*  77 */         if (ffgcrd.call(paramInt1, paramInt2, j, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */           ffpsvc.call(j, m, k, paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  93 */         i1 = MainMemory.getI32(paramInt4);
/*  94 */         if (i1 <= 0) {
/*     */           break label159;
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
/* 106 */       i = i1;
/*     */       
/*     */ 
/*     */       break label188;
/*     */       
/*     */       label159:
/*     */       
/* 113 */       ffmkky.call(paramInt3, m, k, n, paramInt4);
/* 114 */       ffmkey.call(paramInt1, n, paramInt4);
/* 115 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       label188:
/*     */       
/*     */ 
/* 121 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 126 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmnam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */