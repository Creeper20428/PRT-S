/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class file_create extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3027;
/*  11 */   public static final Function _instance = new file_create();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public file_create() { super("file_create", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = call(i, j);
/*  30 */     paramFrame.setI32(paramInt1, k);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*     */     
/*     */ 
/*  44 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  48 */       j = MainMemory.alloc(4);
/*  49 */       MainMemory.setI32(paramInt2, -1);
/*  50 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  57 */         if (m >= 300)
/*     */         {
/*     */ 
/*     */ 
/*  61 */           m = 103;
/*  62 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  68 */         k = 503808 + (m << 4);
/*  69 */         if (MainMemory.getI32(k) != 0) {
/*     */           break label241;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         MainMemory.setI32(paramInt2, m);
/*  80 */         if (m == -1) {
/*  81 */           m = 103;
/*  82 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         MainMemory.setI32(j, 6433655);
/*  92 */         n = SystemLibrary.fopen(paramInt1, 14016);
/*  93 */         if (n != 0) {
/*     */           break label222;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         n = SystemLibrary.fopen(paramInt1, j);
/* 104 */         if (n == 0) {
/* 105 */           m = 105;
/* 106 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         MainMemory.setI32(k, n);
/* 116 */         MainMemory.setI64(503808 + (m << 4) + 4, 0L);
/* 117 */         MainMemory.setI32(503808 + (m << 4) + 12, 0);
/* 118 */         i = 0;
/*     */         
/*     */ 
/*     */         break label265;
/*     */         
/*     */         label222:
/*     */         
/* 125 */         SystemLibrary.fclose(n);
/* 126 */         i = 105;
/*     */         
/*     */ 
/*     */         break label265;
/*     */         
/*     */         label241:
/*     */         
/* 133 */         m += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       i = m;
/*     */       
/*     */ 
/*     */       label265:
/*     */       
/*     */ 
/* 146 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 151 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_create.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */