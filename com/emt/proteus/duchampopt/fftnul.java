/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fftnul
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3599;
/*  13 */   public static final Function _instance = new fftnul();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fftnul() { super("fftnul", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramLong, paramInt3);
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
/*  32 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, l, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */         i = MainMemory.getI32(paramInt1);
/*  64 */         j = paramInt1 + 4;
/*  65 */         k = MainMemory.getI32(j);
/*  66 */         if (i != 0) {
/*     */           break label89;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         if (MainMemory.getI64(k + 88) == 0L) {
/*  77 */           i = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           label89:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */           if (i != MainMemory.getI32(k + 64)) {
/*     */             break label173;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */           if (MainMemory.getI64(k + 112) != -1L) {
/*     */             break label190;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           if (ffrdef.call(paramInt1, paramInt3) > 0) {
/* 108 */             i = 0;
/*     */             
/*     */             break label240;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label190;
/*     */           }
/*     */           label173:
/* 117 */           ffmahd.call(paramInt1, i + 1, 0, paramInt3);
/*     */           
/*     */ 
/*     */           label190:
/*     */           
/*     */ 
/* 123 */           k = MainMemory.getI32(j);
/* 124 */           if (MainMemory.getI32(k + 1012) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 128 */             i = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 135 */             i = MainMemory.getI32(k + 68);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label240:
/*     */         
/*     */ 
/* 143 */         if (MainMemory.getI32(paramInt3) <= 0) {
/*     */           break label271;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label340;
/*     */       
/*     */ 
/*     */ 
/*     */       label271:
/*     */       
/*     */ 
/*     */ 
/* 159 */       if (i != 2) {
/*     */         break label327;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */       MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(j) + 944) + (paramInt2 + -1) * 152 + 108, paramLong);
/*     */       
/*     */ 
/*     */       break label340;
/*     */       
/*     */       label327:
/*     */       
/* 176 */       MainMemory.setI32(paramInt3, 227);
/*     */       
/*     */ 
/*     */       label340:
/*     */       
/*     */ 
/* 182 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fftnul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */