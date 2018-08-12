/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class root_size extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3082;
/*  13 */   public static final Function _instance = new root_size();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public root_size() { super("root_size", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     int i2 = 0;
/*     */     
/*     */ 
/*  48 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.alloc(8);
/*  53 */       k = MainMemory.alloc(4);
/*  54 */       m = MainMemory.alloc(4);
/*  55 */       paramInt1 = MainMemory.getI32(499456 + paramInt1 * 12);
/*  56 */       MainMemory.setI32(j, 67108864);
/*  57 */       MainMemory.setI32(j + 4, -653852672);
/*  58 */       n = j;
/*  59 */       if (paramInt1 < 0) {
/*     */         break label160;
/*     */       } else {
/*  62 */         i2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  71 */         if (i2 >= 8) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         i1 = send.call(paramInt1, n + i2, 8 - i2, 0);
/*  82 */         if (i1 < 1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         i2 = i1 + i2;
/*     */       }
/*     */       
/*     */ 
/*     */       label160:
/*     */       
/*  98 */       F272093.call(paramInt1, m, k);
/*  99 */       MainMemory.setI64(paramInt2, SystemLibrary.bswapInt(MainMemory.getI32(k)) & 0xFFFFFFFF);
/* 100 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 111 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/root_size.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */