/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffghdt
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3253;
/*  13 */   public static final Function _instance = new ffghdt();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffghdt() { super("ffghdt", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3);
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
/*  35 */     call(i, j, k);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */         i = MainMemory.getI32(paramInt1);
/*  61 */         j = paramInt1 + 4;
/*  62 */         k = MainMemory.getI32(j);
/*  63 */         if (i != 0) {
/*     */           break label100;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         if (MainMemory.getI64(k + 88) != 0L) {
/*     */           break label100;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         MainMemory.setI32(paramInt2, 0);
/*     */         
/*     */ 
/*     */         break label257;
/*     */         
/*     */         label100:
/*     */         
/*  90 */         if (i != MainMemory.getI32(k + 64)) {
/*     */           break label179;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (MainMemory.getI64(k + 112) != -1L) {
/*     */           break label194;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         if (ffrdef.call(paramInt1, paramInt3) > 0) {
/*     */           break label237;
/*     */         } else {
/*     */           break label194;
/*     */         }
/*     */         
/*     */ 
/*     */         label179:
/*     */         
/* 119 */         ffmahd.call(paramInt1, i + 1, 0, paramInt3);
/*     */         
/*     */ 
/*     */         label194:
/*     */         
/*     */ 
/* 125 */         MainMemory.setI32(paramInt2, MainMemory.getI32(MainMemory.getI32(j) + 68));
/* 126 */         if (MainMemory.getI32(MainMemory.getI32(j) + 1012) != 0) {
/*     */           break label247;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label237:
/*     */       
/*     */ 
/*     */       break label257;
/*     */       
/*     */ 
/*     */       label247:
/*     */       
/*     */ 
/* 142 */       MainMemory.setI32(paramInt2, 0);
/*     */       
/*     */ 
/*     */       label257:
/*     */       
/*     */ 
/* 148 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffghdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */