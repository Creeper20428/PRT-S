/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN9PixelInfoplENS_8Object2DES0_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 362;
/*  13 */   public static final Function _instance = new _ZN9PixelInfoplENS_8Object2DES0_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZN9PixelInfoplENS_8Object2DES0_() { super("_ZN9PixelInfoplENS_8Object2DES0_", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*     */     
/*     */ 
/*  53 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       i = MainMemory.alloc(4);
/*  58 */       j = MainMemory.alloc(4);
/*  59 */       _ZN9PixelInfo8Object2DC1ERKS0_.call(paramInt1, paramInt2);
/*  60 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  67 */         n = paramInt3 + (m << 4) + 12;
/*  68 */         i1 = paramInt3 + (m << 4) + 8;
/*  69 */         if (paramInt3 + (m << 4) != paramInt4) {
/*     */           break label103;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         break;
/*     */         
/*     */ 
/*     */         label103:
/*     */         
/*     */ 
/*  85 */         MainMemory.setI32(i, MainMemory.getI32(paramInt3 + (m << 4) + 4));
/*  86 */         k = MainMemory.getI32(i1);
/*  87 */         MainMemory.setI32(j, k);
/*  88 */         if (k + -1 + MainMemory.getI32(n) >= k)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  98 */             _ZN9PixelInfo8Object2D8addPixelERlS1_.call(paramInt1, j, i);
/*  99 */             k = MainMemory.getI32(j) + 1;
/* 100 */             MainMemory.setI32(j, k);
/* 101 */             if (MainMemory.getI32(i1) + -1 + MainMemory.getI32(n) < k) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         m += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 121 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfoplENS_8Object2DES0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */