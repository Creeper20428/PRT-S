/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class mem_truncate extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3059;
/*  12 */   public static final Function _instance = new mem_truncate();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public mem_truncate() { super("mem_truncate", 2, false); }
/*     */   
/*     */   public int execute(int paramInt, long paramLong)
/*     */   {
/*  19 */     return call(paramInt, paramLong);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = call(i, l);
/*  31 */     paramFrame.setI32(paramInt1, j);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt, long paramLong)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       j = MainMemory.getI32(512000 + paramInt * 44 + 20);
/*  51 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */         k = (int)paramLong;
/*  62 */         m = 512000 + paramInt * 44;
/*  63 */         n = com.emt.proteus.runtime.api.SystemLibrary.do_indirect(j, MainMemory.getI32(MainMemory.getI32(m)), k);
/*  64 */         if (n != 0) {
/*     */           break label117;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         ffxmsg.call(5, 98080);
/*  75 */         i = 113;
/*     */         
/*     */ 
/*     */         break label244;
/*     */         
/*     */         label117:
/*     */         
/*  82 */         i1 = 512000 + paramInt * 44 + 8;
/*  83 */         i2 = MainMemory.getI32(MainMemory.getI32(i1));
/*  84 */         if ((i2 & 0xFFFFFFFF) >= paramLong) {
/*     */           break label184;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         com.emt.proteus.runtime.api.SystemLibrary.memset(n + i2, (byte)0, k - i2, 1);
/*     */         
/*     */ 
/*     */         label184:
/*     */         
/*     */ 
/* 100 */         MainMemory.setI32(MainMemory.getI32(m), n);
/* 101 */         MainMemory.setI32(MainMemory.getI32(i1), k);
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 107 */         MainMemory.setI64(512000 + paramInt * 44 + 24, paramLong);
/* 108 */         MainMemory.setI64(512000 + paramInt * 44 + 32, paramLong);
/* 109 */         i = 0;
/*     */       }
/*     */       
/*     */ 
/*     */       label244:
/*     */       
/* 115 */       int i3 = i; return i3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_truncate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */