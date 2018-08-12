/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffghsp extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3397;
/*  12 */   public static final Function _instance = new ffghsp();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffghsp() { super("ffghsp", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  36 */     int n = call(i, j, k, m);
/*  37 */     paramFrame.setI32(paramInt1, n);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     int i = 0;
/*     */     
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     long l = 0L;
/*  49 */     boolean bool = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */         j = MainMemory.getI32(paramInt1);
/*  66 */         k = paramInt1 + 4;
/*  67 */         if (j != MainMemory.getI32(MainMemory.getI32(k) + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */           ffmahd.call(paramInt1, j + 1, 0, paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  83 */         if (paramInt2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */           m = MainMemory.getI32(k);
/*  94 */           MainMemory.setI32(paramInt2, (int)((MainMemory.getI64(m + 88) - MainMemory.getI64(MainMemory.getI32(m + 84) + (MainMemory.getI32(m + 64) << 3))) / 80L));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 100 */         m = MainMemory.getI32(k);
/* 101 */         l = MainMemory.getI64(m + 112);
/* 102 */         bool = paramInt3 != 0;
/* 103 */         if (l != -1L) {
/*     */           break label220;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         ffghsp_1006.call(paramInt3, bool);
/*     */         
/*     */         break label235;
/*     */         
/*     */         label220:
/* 118 */         ffghsp_1007.call(paramInt3, l, bool, m);
/*     */       }
/*     */       
/*     */ 
/*     */       label235:
/*     */       
/* 124 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       int n = i;return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffghsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */