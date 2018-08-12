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
/*     */ public final class ffmcom
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3491;
/*  15 */   public static final Function _instance = new ffmcom();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffmcom() { super("ffmcom", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  23 */     return 0;
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
/*  40 */     call(i, j, k, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*     */     
/*     */ 
/*  53 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       i = MainMemory.alloc(81);
/*  58 */       j = MainMemory.alloc(73);
/*  59 */       k = MainMemory.alloc(71);
/*  60 */       m = MainMemory.alloc(81);
/*  61 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */         MainMemory.setI8(k, (byte)0);
/*  72 */         MainMemory.setI8(j, (byte)0);
/*  73 */         if (ffgcrd.call(paramInt1, paramInt2, i, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */           ffpsvc.call(i, k, j, paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  89 */         if (MainMemory.getI32(paramInt4) <= 0) {
/*     */           break label141;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label163;
/*     */       
/*     */ 
/*     */ 
/*     */       label141:
/*     */       
/*     */ 
/*     */ 
/* 105 */       ffmkky.call(paramInt2, k, paramInt3, m, paramInt4);
/* 106 */       ffmkey.call(paramInt1, m, paramInt4);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label163:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmcom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */