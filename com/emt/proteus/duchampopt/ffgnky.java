/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgnky extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3398;
/*  13 */   public static final Function _instance = new ffgnky();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffgnky() { super("ffgnky", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = call(i, j, k);
/*  35 */     paramFrame.setI32(paramInt1, m);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     long l1 = 0L;
/*  48 */     long l2 = 0L;
/*  49 */     long l3 = 0L;
/*  50 */     long l4 = 0L;
/*     */     
/*     */ 
/*  53 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       j = MainMemory.alloc(81);
/*  58 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */         k = MainMemory.getI32(paramInt1);
/*  69 */         m = paramInt1 + 4;
/*  70 */         if (k != MainMemory.getI32(MainMemory.getI32(m) + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */           ffmahd.call(paramInt1, k + 1, 0, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  86 */         MainMemory.setI8(paramInt2, (byte)0);
/*  87 */         n = MainMemory.getI32(m);
/*  88 */         l1 = MainMemory.getI64(n + 104);
/*  89 */         l2 = MainMemory.getI64(n + 112) + -2880L;
/*  90 */         l3 = MainMemory.getI64(n + 88);
/*  91 */         l4 = MainMemory.getI64(MainMemory.getI32(n + 84) + (MainMemory.getI32(n + 64) << 3));
/*  92 */         if ((l1 <= (l2 >= l3 ? l2 : l3)) && (l4 <= l1)) {
/*     */           break label273;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         SystemLibrary.sprintf(j, 113568, new Object[] { Integer.valueOf((int)((l1 - l4) / 80L) + 1) });
/* 103 */         ffxmsg.call(5, j);
/* 104 */         MainMemory.setI32(paramInt3, 203);
/*     */         
/*     */         break label288;
/*     */         
/*     */         label273:
/* 109 */         ffgnky_1055.call(paramInt3, m, l1, paramInt1, paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */       label288:
/*     */       
/* 115 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 126 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgnky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */