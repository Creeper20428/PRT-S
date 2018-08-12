/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class mem_write extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3050;
/*  12 */   public static final Function _instance = new mem_write();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public mem_write() { super("mem_write", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     long l1 = 0L;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     long l2 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       j = 512000 + paramInt1 * 44 + 24;
/*  57 */       l1 = MainMemory.getI64(j);
/*  58 */       k = (int)l1;
/*  59 */       m = 512000 + paramInt1 * 44 + 8;
/*  60 */       n = MainMemory.getI32(MainMemory.getI32(m));
/*  61 */       if (!com.emt.proteus.lib.api.MathUtils.ugt(k + paramInt3, n))
/*     */       {
/*     */ 
/*     */ 
/*  65 */         n = k;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  72 */         i1 = MainMemory.getI32(512000 + paramInt1 * 44 + 20);
/*  73 */         if (i1 != 0) {
/*     */           break label156;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         ffxmsg.call(5, 94176);
/*  84 */         i = 106;
/*     */         
/*     */ 
/*     */         break label398;
/*     */         
/*     */         label156:
/*     */         
/*  91 */         n = MainMemory.getI32(512000 + paramInt1 * 44 + 16) + n;
/*  92 */         k = (int)((paramInt3 + -1L + l1) / 2880L) * 2880 + 2880;
/*  93 */         n = com.emt.proteus.lib.api.MathUtils.uge(n, k) ? n : k;
/*  94 */         i2 = 512000 + paramInt1 * 44;
/*  95 */         i3 = com.emt.proteus.runtime.api.SystemLibrary.do_indirect(i1, MainMemory.getI32(MainMemory.getI32(i2)), n);
/*  96 */         if (i3 != 0) {
/*     */           break label280;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         ffxmsg.call(5, 92384);
/* 107 */         i = 113;
/*     */         
/*     */ 
/*     */         break label398;
/*     */         
/*     */         label280:
/*     */         
/* 114 */         MainMemory.setI32(MainMemory.getI32(i2), i3);
/* 115 */         MainMemory.setI32(MainMemory.getI32(m), n);
/* 116 */         n = (int)MainMemory.getI64(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(MainMemory.getI32(MainMemory.getI32(512000 + paramInt1 * 44)) + n, paramInt2, paramInt3, 1);
/* 125 */       l1 = MainMemory.getI64(j) + paramInt3;
/* 126 */       MainMemory.setI64(j, l1);
/* 127 */       j = 512000 + paramInt1 * 44 + 32;
/* 128 */       l2 = MainMemory.getI64(j);
/* 129 */       MainMemory.setI64(j, l1 >= l2 ? l1 : l2);
/* 130 */       i = 0;
/*     */       
/*     */ 
/*     */       label398:
/*     */       
/*     */ 
/* 136 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_write.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */