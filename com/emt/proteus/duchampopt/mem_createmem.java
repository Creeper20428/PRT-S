/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class mem_createmem extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3060;
/*  13 */   public static final Function _instance = new mem_createmem();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public mem_createmem() { super("mem_createmem", 2, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       MainMemory.setI32(paramInt2, -1);
/*  50 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  57 */         if (k >= 300) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */         j = 512000 + k * 44;
/*  68 */         if (MainMemory.getI32(j) != 0) {
/*     */           break label288;
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
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         m = 512000 + k * 44 + 4;
/*  90 */         MainMemory.setI32(j, m);
/*  91 */         paramInt2 = 512000 + k * 44 + 12;
/*  92 */         MainMemory.setI32(512000 + k * 44 + 8, paramInt2);
/*  93 */         if (paramInt1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */           n = malloc.call(paramInt1);
/* 104 */           MainMemory.setI32(m, n);
/* 105 */           if (n != 0) {
/*     */             break label207;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */           ffxmsg.call(5, 109856);
/* 116 */           i = 104;
/*     */           
/*     */           break label312;
/*     */         }
/*     */         
/*     */         label207:
/*     */         
/* 123 */         MainMemory.setI32(paramInt2, paramInt1);
/* 124 */         MainMemory.setI32(512000 + k * 44 + 16, 2880);
/* 125 */         MainMemory.setI64(512000 + k * 44 + 32, 0L);
/* 126 */         MainMemory.setI64(512000 + k * 44 + 24, 0L);
/* 127 */         MainMemory.setI32(512000 + k * 44 + 20, 2786);
/* 128 */         i = 0;
/*     */         
/*     */ 
/*     */         break label312;
/*     */         
/*     */         label288:
/*     */         
/* 135 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 141 */       i = 103;
/*     */       
/*     */ 
/*     */       label312:
/*     */       
/*     */ 
/* 147 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_createmem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */