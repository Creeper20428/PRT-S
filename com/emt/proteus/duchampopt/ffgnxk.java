/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgnxk
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3415;
/*  14 */   public static final Function _instance = new ffgnxk();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgnxk() { super("ffgnxk", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = call(i, j, k, m);
/*  39 */     paramFrame.setI32(paramInt1, n);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*     */     
/*     */ 
/*  55 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(4);
/*  60 */       k = MainMemory.alloc(4);
/*  61 */       m = MainMemory.alloc(4);
/*  62 */       n = MainMemory.alloc(81);
/*  63 */       i1 = MainMemory.alloc(72);
/*  64 */       MainMemory.setI8(paramInt3, (byte)0);
/*  65 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         if (ffgcrd.call(paramInt1, 13664, n, paramInt4) >= 1) {
/*     */           break label216;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         ffgknm.call(n, i1, m);
/*  91 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  98 */           if (i2 >= 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */           ffcmps.call(MainMemory.getI32(paramInt2 + (i2 << 2)), i1, 0, j, k);
/* 109 */           if (MainMemory.getI32(j) != 0) {
/*     */             break label204;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */           i2 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label204:
/*     */         
/* 125 */         SystemLibrary.strcat(paramInt3, n);
/*     */       }
/*     */       
/*     */ 
/*     */       label216:
/*     */       
/* 131 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 142 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgnxk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */