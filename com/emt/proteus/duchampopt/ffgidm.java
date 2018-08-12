/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffgidm
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3261;
/*  13 */   public static final Function _instance = new ffgidm();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffgidm() { super("ffgidm", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = call(i, j, k);
/*  35 */     paramFrame.setI32(paramInt1, m);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */         j = MainMemory.getI32(paramInt1);
/*  62 */         k = paramInt1 + 4;
/*  63 */         m = MainMemory.getI32(k);
/*  64 */         if (j != MainMemory.getI32(m + 64)) {
/*     */           break label126;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label142;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         if (ffrdef.call(paramInt1, paramInt3) > 0) {
/*     */           break label255;
/*     */         } else {
/*     */           break label142;
/*     */         }
/*     */         
/*     */ 
/*     */         label126:
/*     */         
/*  93 */         ffmahd.call(paramInt1, j + 1, 0, paramInt3);
/*     */         
/*     */ 
/*     */         label142:
/*     */         
/*     */ 
/*  99 */         m = MainMemory.getI32(k);
/* 100 */         if (MainMemory.getI32(m + 68) != 0) {
/*     */           break label195;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         MainMemory.setI32(paramInt2, MainMemory.getI32(m + 120));
/*     */         
/*     */         break label255;
/*     */         
/*     */         label195:
/* 115 */         if (MainMemory.getI32(m + 1012) != 0) {
/*     */           break label237;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         MainMemory.setI32(paramInt3, 233);
/*     */         
/*     */         break label255;
/*     */         
/*     */         label237:
/* 130 */         MainMemory.setI32(paramInt2, MainMemory.getI32(m + 1040));
/*     */       }
/*     */       
/*     */ 
/*     */       label255:
/*     */       
/* 136 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */       int n = i;return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgidm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */