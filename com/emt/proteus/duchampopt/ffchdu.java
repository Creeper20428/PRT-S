/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffchdu extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3248;
/*  13 */   public static final Function _instance = new ffchdu();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffchdu() { super("ffchdu", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
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
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*     */     
/*     */ 
/*  46 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  50 */       j = MainMemory.alloc(81);
/*  51 */       k = MainMemory.getI32(paramInt1);
/*  52 */       m = paramInt1 + 4;
/*  53 */       n = MainMemory.getI32(m);
/*  54 */       if (k != MainMemory.getI32(n + 64)) {
/*     */         break label87;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */       ffchdu_549.call(paramInt2, paramInt1, n, m);
/*     */       
/*     */       break label103;
/*     */       
/*     */       label87:
/*  69 */       ffmahd.call(paramInt1, k + 1, 0, paramInt2);
/*     */       
/*     */ 
/*     */       label103:
/*     */       
/*     */ 
/*  75 */       n = MainMemory.getI32(m);
/*  76 */       if (MainMemory.getI32(n + 8) != 1) {
/*     */         break label147;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       ffchdu_550.call(n, m);
/*     */       
/*     */ 
/*     */       label147:
/*     */       
/*     */ 
/*  92 */       k = MainMemory.getI32(paramInt2);
/*  93 */       if ((k <= 0) || (k == 999)) {
/*     */         break label227;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       SystemLibrary.sprintf(j, 99104, new Object[] { Integer.valueOf(MainMemory.getI32(MainMemory.getI32(m) + 64)) });
/* 104 */       ffxmsg.call(5, j);
/* 105 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */       break label235;
/*     */       
/*     */       label227:
/*     */       
/* 112 */       i = k;
/*     */       
/*     */ 
/*     */       label235:
/*     */       
/*     */ 
/* 118 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 123 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffchdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */