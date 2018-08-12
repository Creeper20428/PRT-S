/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgtdm
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3414;
/*  16 */   public static final Function _instance = new ffgtdm();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgtdm() { super("ffgtdm", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i2 = call(i, j, k, m, n, i1);
/*  47 */     paramFrame.setI32(paramInt1, i2);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  53 */     int i = 0;
/*     */     
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*     */     
/*     */ 
/*  63 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  67 */       j = MainMemory.alloc(81);
/*  68 */       k = MainMemory.alloc(71);
/*  69 */       m = MainMemory.alloc(4);
/*  70 */       n = MainMemory.alloc(72);
/*  71 */       i1 = MainMemory.alloc(71);
/*  72 */       MainMemory.setI32(m, 0);
/*  73 */       i2 = MainMemory.getI32(paramInt6);
/*  74 */       if (i2 <= 0) {
/*     */         break label105;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       i = i2;
/*     */       
/*     */ 
/*     */       break label225;
/*     */       
/*     */       label105:
/*     */       
/*  91 */       ffkeyn.call(22336, paramInt2, n, paramInt6);
/*  92 */       if (MainMemory.getI32(m) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         MainMemory.setI8(k, (byte)0);
/* 103 */         if (ffgcrd.call(paramInt1, n, j, m) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */           ffpsvc.call(j, k, 0, m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 119 */         MainMemory.setI8(i1, (byte)0);
/* 120 */         ffc2s.call(k, i1, m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 126 */       ffdtdm.call(paramInt1, i1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 127 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */       label225:
/*     */       
/*     */ 
/* 133 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 138 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */