/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp5Image8removeMWEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1335;
/*  13 */   public static final Function _instance = new _ZN7duchamp5Image8removeMWEv();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZN7duchamp5Image8removeMWEv() { super("_ZN7duchamp5Image8removeMWEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (MainMemory.getI8(paramInt + 264) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  58 */         i = paramInt + 8;
/*  59 */         j = MainMemory.getI32(i);
/*  60 */         if (MainMemory.getI32(j + 4) != 1) {
/*     */           break label208;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         if (MainMemory.getI32(j) <= 0) {
/*     */           break label208;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         k = paramInt + 20;
/*  81 */         m = paramInt + 32;
/*  82 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  89 */           i1 = n + 1;
/*  90 */           i2 = MainMemory.getI32(k) + (n << 2);
/*  91 */           if (_ZN7duchamp5Param7isBlankERf.call(m, i2) != 0) {
/*     */             break label182;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           if (_ZN7duchamp5Param6isInMWEi.call(m, n) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */             MainMemory.setF32(i2, 0.0F);
/*     */           }
/*     */           
/*     */ 
/*     */           label182:
/*     */           
/* 117 */           if (MainMemory.getI32(MainMemory.getI32(i)) <= i1) break;
/* 118 */           n = i1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label208:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Image8removeMWEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */