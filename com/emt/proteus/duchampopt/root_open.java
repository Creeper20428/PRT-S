/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class root_open extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3094;
/*  12 */   public static final Function _instance = new root_open();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public root_open() { super("root_open", 3, false); }
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
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*     */     
/*     */ 
/*  47 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  51 */       j = MainMemory.alloc(4);
/*  52 */       MainMemory.setI32(paramInt3, -1);
/*  53 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  60 */         if (m >= 300)
/*     */         {
/*     */ 
/*     */ 
/*  64 */           paramInt2 = 103;
/*  65 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  71 */         k = 499456 + m * 12;
/*  72 */         if (MainMemory.getI32(k) != 0) {
/*     */           break label219;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         MainMemory.setI32(paramInt3, m);
/*  83 */         if (m == -1) {
/*  84 */           paramInt2 = 103;
/*  85 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         if (paramInt2 != 0) {
/*     */           break label152;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         paramInt2 = F272877.call(paramInt1, 21408, j);
/*     */         
/*     */         break label166;
/*     */         
/*     */         label152:
/*     */         
/* 110 */         paramInt2 = F272877.call(paramInt1, 35776, j);
/*     */         
/*     */ 
/*     */ 
/*     */         label166:
/*     */         
/*     */ 
/*     */ 
/* 118 */         if (paramInt2 != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         MainMemory.setI32(k, MainMemory.getI32(j));
/* 130 */         MainMemory.setI64(499456 + m * 12 + 4, 0L);
/* 131 */         i = 0;
/*     */         
/*     */ 
/*     */         break label242;
/*     */         
/*     */         label219:
/*     */         
/* 138 */         m += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label242:
/*     */       
/*     */ 
/* 151 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 156 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/root_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */