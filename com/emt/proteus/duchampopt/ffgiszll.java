/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffgiszll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3259;
/*  13 */   public static final Function _instance = new ffgiszll();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffgiszll() { super("ffgiszll", 4, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (MainMemory.getI32(paramInt4) <= 0)
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
/*  66 */         if (i != MainMemory.getI32(k + 64)) {
/*     */           break label124;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         if (MainMemory.getI64(k + 112) != -1L) {
/*     */           break label140;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         if (ffrdef.call(paramInt1, paramInt4) > 0) {
/*     */           break label246;
/*     */         } else {
/*     */           break label140;
/*     */         }
/*     */         
/*     */ 
/*     */         label124:
/*     */         
/*  95 */         ffmahd.call(paramInt1, i + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label140:
/*     */         
/*     */ 
/* 101 */         k = MainMemory.getI32(j);
/* 102 */         if (MainMemory.getI32(k + 68) != 0) {
/*     */           break label190;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         ffgiszll_1015.call(j, paramInt2, k, paramInt3);
/*     */         
/*     */         break label246;
/*     */         
/*     */         label190:
/* 117 */         if (MainMemory.getI32(k + 1012) != 0) {
/*     */           break label232;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         MainMemory.setI32(paramInt4, 233);
/*     */         
/*     */ 
/*     */         break label251;
/*     */         
/*     */         label232:
/*     */         
/* 134 */         ffgiszll_1016.call(j, paramInt2, k, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label246:
/*     */       
/*     */ 
/*     */       label251:
/*     */       
/*     */ 
/* 145 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgiszll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */