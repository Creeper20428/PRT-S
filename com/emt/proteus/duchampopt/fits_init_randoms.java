/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ 
/*     */ public final class fits_init_randoms extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3616;
/*  13 */   public static final Function _instance = new fits_init_randoms();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fits_init_randoms() { super("fits_init_randoms", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  20 */     return call();
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = call();
/*  26 */     paramFrame.setI32(paramInt1, i);
/*  27 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call()
/*     */   {
/*  32 */     int i = 0;
/*     */     
/*  34 */     int j = 0;
/*  35 */     int k = 0;
/*  36 */     double d1 = 0.0D;
/*  37 */     int m = 0;
/*  38 */     double d2 = 0.0D;
/*  39 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       if (MainMemory.getI32Aligned(458908) != 0)
/*     */       {
/*     */ 
/*     */ 
/*  49 */         m = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  56 */         j = calloc.call(10000, 4);
/*  57 */         k = j;
/*  58 */         MainMemory.setI32Aligned(458908, k);
/*  59 */         if (j == 0) {
/*  60 */           m = 113;
/*     */           break label215;
/*     */         } else {
/*  63 */           d1 = 16807.0D;
/*  64 */           m = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  74 */           d2 = d1 / 2.147483647E9D;
/*  75 */           d2 = (int)d2;
/*  76 */           d2 *= 2.147483647E9D;
/*  77 */           d1 -= d2;
/*  78 */           d2 = d1 / 2.147483647E9D;
/*  79 */           f = (float)d2;
/*  80 */           MainMemory.setF32(k + (m << 2), f);
/*  81 */           m += 1;
/*  82 */           if (m != 10000) {
/*     */             break label199;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */           if ((int)d1 == 1043618065) {
/*  93 */             m = 0;
/*  94 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */           ffxmsg.call(5, 130976);
/* 104 */           i = 1;
/*     */           
/*     */ 
/*     */           break label223;
/*     */           
/*     */           label199:
/*     */           
/* 111 */           d1 *= 16807.0D;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label215:
/*     */       
/*     */ 
/* 119 */       i = m;
/*     */       
/*     */ 
/*     */       label223:
/*     */       
/*     */ 
/* 125 */       int n = i; return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_init_randoms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */