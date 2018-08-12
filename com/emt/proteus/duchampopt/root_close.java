/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class root_close extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3084;
/*  12 */   public static final Function _instance = new root_close();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public root_close() { super("root_close", 1, false); }
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
/*  40 */     int i1 = 0;
/*     */     
/*     */ 
/*  43 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  47 */       j = MainMemory.alloc(8);
/*  48 */       k = 499456 + paramInt * 12;
/*  49 */       paramInt = MainMemory.getI32(k);
/*  50 */       MainMemory.setI32(j, 67108864);
/*  51 */       MainMemory.setI32(j + 4, -670629888);
/*  52 */       m = j;
/*  53 */       if (paramInt < 0) {
/*     */         break label146;
/*     */       } else {
/*  56 */         i1 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  65 */         if (i1 >= 8) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         n = send.call(paramInt, m + i1, 8 - i1, 0);
/*  76 */         if (n < 1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         i1 = n + i1;
/*     */       }
/*     */       
/*     */ 
/*     */       label146:
/*     */       
/*  92 */       com.emt.proteus.runtime.api.SystemLibrary.close(paramInt);
/*  93 */       MainMemory.setI32(k, 0);
/*  94 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 105 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/root_close.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */