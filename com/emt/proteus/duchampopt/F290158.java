/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F290158 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3163;
/*  12 */   public static final Function _instance = new F290158();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F290158() { super("F290158", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  40 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  46 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label195;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  56 */       i = MainMemory.getI32Aligned(470792);
/*  57 */       j = i + paramInt * 344;
/*  58 */       if (MainMemory.getI32(i + paramInt * 344) <= 0) {
/*     */         break label195;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       k = i + paramInt * 344 + 8;
/*  69 */       m = MainMemory.getI32(k);
/*  70 */       n = m + -1;
/*  71 */       i1 = 0;
/*     */       
/*     */ 
/*     */       label156:
/*     */       
/*     */       do
/*     */       {
/*  78 */         if (n - i1 != -1) {
/*     */           break label156;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(i + paramInt * 344 + 4), j);
/*  89 */         break;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         call(MainMemory.getI32(k + (m - i1 << 2)));
/*  96 */         i1 += 1;
/*  97 */       } while (MainMemory.getI32Aligned(470852) == 0);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label195:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F290158.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */