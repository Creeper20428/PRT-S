/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class root_flush extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3078;
/*  12 */   public static final Function _instance = new root_flush();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public root_flush() { super("root_flush", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*     */     
/*     */ 
/*  42 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  46 */       j = MainMemory.alloc(8);
/*  47 */       paramInt = MainMemory.getI32(499456 + paramInt * 12);
/*  48 */       MainMemory.setI32(j, 67108864);
/*  49 */       MainMemory.setI32(j + 4, -687407104);
/*  50 */       k = j;
/*  51 */       if (paramInt < 0) {
/*     */         break label139;
/*     */       } else {
/*  54 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  63 */         if (n >= 8) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         m = send.call(paramInt, k + n, 8 - n, 0);
/*  74 */         if (m < 1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         n = m + n;
/*     */       }
/*     */       
/*     */ 
/*     */       label139:
/*     */       
/*  90 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 101 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/root_flush.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */