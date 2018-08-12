/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class linfree_1557 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new linfree_1557();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public linfree_1557() { super("linfree_1557", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  44 */       Jump.label(209632);
/*  45 */       if (MainMemory.getI32(paramInt + 36) == 137)
/*     */       {
/*  47 */         j = paramInt + 8;
/*  48 */         i = MainMemory.getI32(paramInt + 44);
/*  49 */         if (MainMemory.getI32(j) == i)
/*     */         {
/*  51 */           MainMemory.setI32(j, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */         Jump.label(209650);
/*  62 */         n = paramInt + 12;
/*  63 */         j = paramInt + 48;
/*  64 */         k = MainMemory.getI32(j);
/*  65 */         if (MainMemory.getI32(n) == k)
/*     */         {
/*  67 */           MainMemory.setI32(n, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         Jump.label(209662);
/*  78 */         m = paramInt + 16;
/*  79 */         n = paramInt + 52;
/*  80 */         if (MainMemory.getI32(m) == MainMemory.getI32(n))
/*     */         {
/*  82 */           MainMemory.setI32(m, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         Jump.label(209674);
/*  93 */         if (i == 0) {
/*  94 */           i = k;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*  99 */           free.call(i);
/* 100 */           i = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         Jump.label(209684);
/*     */         
/* 110 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 115 */           free.call(i);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         Jump.label(209693);
/* 123 */         i = MainMemory.getI32(n);
/* 124 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 129 */           free.call(i);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/linfree_1557.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */