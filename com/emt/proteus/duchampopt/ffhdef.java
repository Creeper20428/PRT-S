/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffhdef
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3265;
/*  13 */   public static final Function _instance = new ffhdef();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffhdef() { super("ffhdef", 3, false); }
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
/*  45 */     long l1 = 0L;
/*  46 */     int m = 0;
/*  47 */     long l2 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if ((MainMemory.getI32(paramInt3) > 0) || (paramInt2 >= 1))
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
/*     */           break label240;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         if (MainMemory.getI64(k + 112) != -1L) {
/*     */           break label230;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         ffrdef.call(paramInt1, paramInt3);
/*  87 */         k = MainMemory.getI32(j);
/*  88 */         l1 = MainMemory.getI64(k + 88) + paramInt2 * 80;
/*  89 */         l1 = l1 - l1 % 2880L + 2880L;
/*  90 */         m = k + 112;
/*  91 */         l2 = MainMemory.getI64(m);
/*  92 */         MainMemory.setI64(m, l1);
/*  93 */         k = MainMemory.getI32(j);
/*  94 */         m = MainMemory.getI32(k + 84) + (MainMemory.getI32(k + 64) + 1 << 3);
/*  95 */         MainMemory.setI64(m, l1 - l2 + MainMemory.getI64(m));
/*     */         
/*     */ 
/*     */         break label255;
/*     */       }
/*     */       
/*     */ 
/*     */       label230:
/*     */       
/*     */       break label255;
/*     */       
/*     */       label240:
/*     */       
/* 108 */       ffmahd.call(paramInt1, i + 1, 0, paramInt3);
/*     */       
/*     */ 
/*     */       label255:
/*     */       
/*     */ 
/* 114 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffhdef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */