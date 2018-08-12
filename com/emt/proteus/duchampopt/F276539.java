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
/*     */ public final class F276539
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3113;
/*  15 */   public static final Function _instance = new F276539();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public F276539() { super("F276539", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  22 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = call(i);
/*  31 */     paramFrame.setI32(paramInt1, j);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (paramInt >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  58 */         if (MainMemory.getI32Aligned(459504) <= paramInt) {
/*     */           break label346;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */         j = MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt * 28 + 8);
/*  69 */         if (j != -1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */           j = shmget.call(j, 1, 438);
/*  80 */           if (j != -1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */             k = shmat.call(j, 0, 0);
/*  91 */             m = k;
/*  92 */             if (k != -1)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */               if (MainMemory.getI8(k) != 74) {
/*     */                 break label327;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */               if (MainMemory.getI8(k + 1) != 66) {
/*     */                 break label327;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */               if (MainMemory.getI8(k + 2) != 1) {
/*     */                 break label327;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */               n = MainMemory.getI32Aligned(458772);
/* 133 */               if (MainMemory.getI32(n + paramInt * 28 + 12) != j) {
/*     */                 break label327;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */               j = MainMemory.getI32(n + paramInt * 28);
/* 144 */               if (j != semget.call(MainMemory.getI32(n + paramInt * 28 + 4), 1, 438)) {
/*     */                 break label308;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */               MainMemory.setI32(MainMemory.getI32Aligned(458776) + (paramInt << 4), m);
/* 155 */               i = 0;
/*     */               
/*     */ 
/*     */               break label355;
/*     */               
/*     */               label308:
/*     */               
/* 162 */               shmdt.call(k);
/* 163 */               i = 151;
/*     */               
/*     */ 
/*     */               break label355;
/*     */               
/*     */               label327:
/*     */               
/* 170 */               shmdt.call(k);
/* 171 */               i = 151;
/*     */               break label355;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       label346:
/* 178 */       i = 151;
/*     */       
/*     */ 
/*     */       label355:
/*     */       
/*     */ 
/* 184 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F276539.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */