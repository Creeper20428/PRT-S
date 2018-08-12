/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class cscx2s_510 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new cscx2s_510();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public cscx2s_510() { super("cscx2s_510", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  19 */     return 0;
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
/*  45 */     call(i, j, k, m, n, i1, i2);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     float f = 0.0F;
/*  58 */     double d = 0.0D;
/*  59 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       i = paramInt4 + 344;
/*  66 */       j = paramInt4 + 368;
/*  67 */       if (paramInt3 > 0)
/*     */       {
/*  69 */         k = paramInt6 * paramInt5;
/*  70 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*  74 */         n = m * paramInt6;
/*  75 */         d = MainMemory.getF64(paramInt7 + (m * paramInt2 << 3)) + MainMemory.getF64(i);
/*  76 */         d *= MainMemory.getF64(j);
/*  77 */         f = (float)d;
/*  78 */         d = f;
/*  79 */         i1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           MainMemory.setF64(paramInt1 + (n + k * i1 << 3), d);
/*  84 */           i1 += 1;
/*  85 */           if (i1 == paramInt3)
/*     */           {
/*  87 */             m += 1;
/*  88 */             if (m == paramInt5) {
/*     */               break label175;
/*     */             }
/*     */             
/*     */ 
/*  93 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             break label175;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label175:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cscx2s_510.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */