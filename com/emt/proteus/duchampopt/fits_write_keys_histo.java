/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class fits_write_keys_histo
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3463;
/*  14 */   public static final Function _instance = new fits_write_keys_histo();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public fits_write_keys_histo() { super("fits_write_keys_histo", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*     */     
/*     */ 
/*  57 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       i = MainMemory.alloc(4);
/*  62 */       j = MainMemory.alloc(72);
/*  63 */       k = MainMemory.alloc(71);
/*  64 */       m = MainMemory.alloc(8);
/*  65 */       if ((paramInt5 >= 1) || (paramInt3 <= 0)) {
/*     */         break label461;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       n = m;
/*  76 */       paramInt5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  83 */         i1 = paramInt4 + (paramInt5 << 2);
/*  84 */         paramInt5 += 1;
/*  85 */         MainMemory.setI32(i, 0);
/*  86 */         ffkeyn.call(24448, paramInt5, j, i);
/*  87 */         ffgky.call(paramInt2, 16, j, k, 0, i);
/*  88 */         if (MainMemory.getI32(i) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */           MainMemory.setI32(i, 0);
/*  99 */           ffkeyn.call(26976, MainMemory.getI32(i1), j, i);
/* 100 */           ffgky.call(paramInt1, 16, j, k, 0, i);
/* 101 */           if (MainMemory.getI32(i) != 0) {
/*     */             break label236;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */           ffkeyn.call(24448, paramInt5, j, i);
/* 112 */           ffpky.call(paramInt2, 16, j, k, 56896, i);
/*     */           
/*     */ 
/*     */           label236:
/*     */           
/*     */ 
/* 118 */           MainMemory.setI32(i, 0);
/* 119 */           ffkeyn.call(27456, MainMemory.getI32(i1), j, i);
/* 120 */           ffgky.call(paramInt1, 16, j, k, 0, i);
/* 121 */           if (MainMemory.getI32(i) != 0) {
/*     */             break label323;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */           ffkeyn.call(24544, paramInt5, j, i);
/* 132 */           ffpky.call(paramInt2, 16, j, k, 58400, i);
/*     */           
/*     */ 
/*     */           label323:
/*     */           
/*     */ 
/* 138 */           MainMemory.setF64(m, 1.0D);
/* 139 */           MainMemory.setI32(i, 0);
/* 140 */           ffkeyn.call(24736, paramInt5, j, i);
/* 141 */           ffpky.call(paramInt2, 82, j, n, 56928, i);
/* 142 */           MainMemory.setF64(m, 1.0D);
/* 143 */           MainMemory.setI32(i, 0);
/* 144 */           ffkeyn.call(24608, paramInt5, j, i);
/* 145 */           ffpky.call(paramInt2, 82, j, n, 56960, i);
/* 146 */           MainMemory.setI32(i, 0);
/* 147 */           MainMemory.setF64(m, 1.0D);
/* 148 */           ffkeyn.call(24672, paramInt5, j, i);
/* 149 */           ffpky.call(paramInt2, 82, j, n, 49312, i);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 155 */         if (paramInt5 == paramInt3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label461:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 176 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_write_keys_histo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */