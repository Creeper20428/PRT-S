/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class inflateReset2 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3696;
/*  11 */   public static final Function _instance = new inflateReset2();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public inflateReset2() { super("inflateReset2", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = call(i);
/*  27 */     paramFrame.setI32(paramInt1, j);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  33 */     int i = 0;
/*     */     
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  44 */       if (paramInt != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  54 */         j = paramInt + 28;
/*  55 */         k = MainMemory.getI32(j);
/*  56 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */           m = MainMemory.getI32(k + 52);
/*  67 */           if (m != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */             if (MainMemory.getI32(k + 36) != 15)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */               com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(paramInt + 36), MainMemory.getI32(paramInt + 40), m);
/*  88 */               MainMemory.setI32(k + 52, 0);
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*  94 */           MainMemory.setI32(k + 8, 2);
/*  95 */           MainMemory.setI32(k + 36, 15);
/*  96 */           k = MainMemory.getI32(j);
/*  97 */           if (k != 0) {
/*     */             break label181;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */       i = -2;
/*     */       
/*     */ 
/*     */       break label357;
/*     */       
/*     */       label181:
/*     */       
/* 114 */       MainMemory.setI32(k + 28, 0);
/* 115 */       MainMemory.setI32(paramInt + 20, 0);
/* 116 */       MainMemory.setI32(paramInt + 8, 0);
/* 117 */       MainMemory.setI32(paramInt + 24, 0);
/* 118 */       MainMemory.setI32(paramInt + 48, 1);
/* 119 */       MainMemory.setI32(k, 0);
/* 120 */       MainMemory.setI32(k + 4, 0);
/* 121 */       MainMemory.setI32(k + 12, 0);
/* 122 */       MainMemory.setI32(k + 20, 32768);
/* 123 */       MainMemory.setI32(k + 32, 0);
/* 124 */       MainMemory.setI32(k + 40, 0);
/* 125 */       MainMemory.setI32(k + 44, 0);
/* 126 */       MainMemory.setI32(k + 48, 0);
/* 127 */       MainMemory.setI32(k + 56, 0);
/* 128 */       MainMemory.setI32(k + 60, 0);
/* 129 */       n = k + 1328;
/* 130 */       MainMemory.setI32(k + 108, n);
/* 131 */       MainMemory.setI32(k + 80, n);
/* 132 */       MainMemory.setI32(k + 76, n);
/* 133 */       MainMemory.setI32(k + 7104, 1);
/* 134 */       MainMemory.setI32(k + 7108, -1);
/* 135 */       i = 0;
/*     */       
/*     */ 
/*     */       label357:
/*     */       
/*     */ 
/* 141 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/inflateReset2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */