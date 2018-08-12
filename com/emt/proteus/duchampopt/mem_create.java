/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class mem_create extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3068;
/*  13 */   public static final Function _instance = new mem_create();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public mem_create() { super("mem_create", 2, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       MainMemory.setI32(paramInt2, -1);
/*  49 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  56 */         if (k >= 300)
/*     */         {
/*     */ 
/*     */ 
/*  60 */           k = 103;
/*  61 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  67 */         j = 512000 + k * 44;
/*  68 */         if (MainMemory.getI32(j) != 0) {
/*     */           break label281;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */         MainMemory.setI32(paramInt2, k);
/*  79 */         if (k == -1) {
/*  80 */           k = 103;
/*  81 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         m = 512000 + k * 44 + 4;
/*  91 */         MainMemory.setI32(j, m);
/*  92 */         paramInt2 = 512000 + k * 44 + 12;
/*  93 */         MainMemory.setI32(512000 + k * 44 + 8, paramInt2);
/*  94 */         paramInt1 = malloc.call(2880);
/*  95 */         MainMemory.setI32(m, paramInt1);
/*  96 */         if (paramInt1 != 0) {
/*     */           break label198;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         ffxmsg.call(5, 109856);
/* 107 */         k = 104;
/* 108 */         break;
/*     */         
/*     */         label198:
/*     */         
/* 112 */         MainMemory.setI32(paramInt2, 2880);
/* 113 */         MainMemory.setI32(512000 + k * 44 + 16, 2880);
/* 114 */         MainMemory.setI64(512000 + k * 44 + 32, 0L);
/* 115 */         MainMemory.setI64(512000 + k * 44 + 24, 0L);
/* 116 */         MainMemory.setI32(512000 + k * 44 + 20, 2786);
/* 117 */         i = 0;
/*     */         
/*     */ 
/*     */         break label311;
/*     */         
/*     */         label281:
/*     */         
/* 124 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       ffxmsg.call(5, 110048);
/* 132 */       i = k;
/*     */       
/*     */ 
/*     */       label311:
/*     */       
/*     */ 
/* 138 */       int n = i; return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_create.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */