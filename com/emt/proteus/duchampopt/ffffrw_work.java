/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffffrw_work extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3200;
/*  12 */   public static final Function _instance = new ffffrw_work();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffffrw_work() { super("ffffrw_work", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = call(i, j, k, m, n, i1, i2);
/*  46 */     paramFrame.setI32(paramInt1, i3);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  63 */       Evaluate_Parser.call(paramInt3, paramInt4);
/*  64 */       paramInt1 = MainMemory.getI32Aligned(470852);
/*  65 */       if (paramInt1 != 0) {
/*     */         break label268;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       j = MainMemory.getI32Aligned(470792);
/*  76 */       paramInt2 = MainMemory.getI32Aligned(470804);
/*  77 */       k = j + paramInt2 * 344 + 56 + 32;
/*  78 */       if (MainMemory.getI32(j + paramInt2 * 344) != 64536) {
/*     */         break label139;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       if (MainMemory.getI8(k) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         MainMemory.setI32(paramInt7, paramInt3);
/*  99 */         i = -1;
/*     */         
/*     */ 
/*     */         break label276;
/*     */         
/*     */         label139:
/*     */         
/* 106 */         m = k;
/* 107 */         n = j + paramInt2 * 344 + 56 + 28;
/* 108 */         paramInt2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 115 */           if (paramInt2 >= paramInt4) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */           if (MainMemory.getI8(MainMemory.getI32(m) + paramInt2) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */             if (MainMemory.getI8(MainMemory.getI32(n) + paramInt2) != 0) {
/*     */               break label254;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */             MainMemory.setI32(paramInt7, paramInt2 + paramInt3);
/* 146 */             i = -1;
/*     */             
/*     */             break label276;
/*     */           }
/*     */           
/*     */           label254:
/*     */           
/* 153 */           paramInt2 += 1;
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/*     */         label268:
/* 159 */         i = paramInt1;
/*     */       }
/*     */       
/*     */ 
/*     */       label276:
/*     */       
/* 165 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffffrw_work.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */