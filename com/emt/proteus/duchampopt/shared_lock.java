/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class shared_lock
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3133;
/*  14 */   public static final Function _instance = new shared_lock();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public shared_lock() { super("shared_lock", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2);
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
/*  32 */     int k = call(i, j);
/*  33 */     paramFrame.setI32(paramInt1, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       if (F277734.call(paramInt1, paramInt2) != 0) {
/*     */         break label420;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */       k = MainMemory.getI32Aligned(458776);
/*  60 */       if (MainMemory.getI32(k + (paramInt1 << 4) + 8) != 0)
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
/*  71 */         if (F276539.call(paramInt1) != 0) {
/*     */           break label402;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         k = MainMemory.getI32Aligned(458776);
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*  89 */         j = MainMemory.getI32(k + (paramInt1 << 4));
/*  90 */         if (j != 0) {
/*     */           break label187;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         if (F276539.call(paramInt1) != 0) {
/*     */           break label169;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         k = MainMemory.getI32Aligned(458776);
/* 113 */         j = MainMemory.getI32(k + (paramInt1 << 4));
/*     */         
/*     */ 
/*     */         break label187;
/*     */         
/*     */         label169:
/*     */         
/* 120 */         F276460.call(paramInt1, paramInt2);
/* 121 */         i = 0;
/*     */         
/*     */ 
/*     */         break label427;
/*     */         
/*     */ 
/*     */         label187:
/*     */         
/*     */ 
/* 130 */         if (MainMemory.getI8(j) != 74) {
/*     */           break label384;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         if (MainMemory.getI8(j + 1) != 66) {
/*     */           break label384;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */         if (MainMemory.getI8(j + 2) != 1) {
/*     */           break label384;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */         m = k + (paramInt1 << 4) + 8;
/* 161 */         if ((paramInt2 & 0x1) != 0) {
/*     */           break label308;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         MainMemory.setI32(m, MainMemory.getI32(m) + 1);
/*     */         
/*     */         break label356;
/*     */         
/*     */         label308:
/*     */         
/* 177 */         MainMemory.setI32(m, -1);
/* 178 */         m = MainMemory.getI32Aligned(458772) + paramInt1 * 28 + 20;
/* 179 */         MainMemory.setI32(m, MainMemory.getI32(m) + 1);
/* 180 */         j = MainMemory.getI32(k + (paramInt1 << 4));
/*     */         
/*     */ 
/*     */ 
/*     */         label356:
/*     */         
/*     */ 
/*     */ 
/* 188 */         MainMemory.setI32(k + (paramInt1 << 4) + 12, 0);
/* 189 */         i = j + 8;
/*     */         
/*     */ 
/*     */         break label427;
/*     */         
/*     */         label384:
/*     */         
/* 196 */         F276460.call(paramInt1, paramInt2);
/* 197 */         i = 0;
/*     */         
/*     */         break label427;
/*     */       }
/*     */       
/*     */       label402:
/*     */       
/* 204 */       F276460.call(paramInt1, paramInt2);
/* 205 */       i = 0;
/*     */       
/*     */ 
/*     */       break label427;
/*     */       
/*     */       label420:
/*     */       
/* 212 */       i = 0;
/*     */       
/*     */ 
/*     */       label427:
/*     */       
/*     */ 
/* 218 */       int n = i; return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_lock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */