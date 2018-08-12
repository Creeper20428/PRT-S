/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class smem_read extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3124;
/*  12 */   public static final Function _instance = new smem_read();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public smem_read() { super("smem_read", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (paramInt2 == 0) {
/*  52 */         paramInt1 = 152;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  62 */         if (!MainMemory.getI1(459056))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */           n = shared_init.call();
/*  73 */           if (n != 0) {
/*     */             break label252;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         if (paramInt1 < 0) {
/*  85 */           paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*  95 */         else if (MainMemory.getI32Aligned(459504) <= paramInt1)
/*     */         {
/*     */ 
/*     */ 
/*  99 */           paramInt1 = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 106 */           k = MainMemory.getI32Aligned(458776);
/* 107 */           j = MainMemory.getI32(k + (paramInt1 << 4));
/* 108 */           if (j == 0) {
/* 109 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 119 */           else if (MainMemory.getI32(k + (paramInt1 << 4) + 8) == 0) {
/* 120 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 130 */           else if (MainMemory.getI8(j) != 74)
/*     */           {
/*     */ 
/*     */ 
/* 134 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 141 */           else if (MainMemory.getI8(j + 1) != 66)
/*     */           {
/*     */ 
/*     */ 
/* 145 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 152 */             n = MainMemory.getI8(j + 2) == 1 ? 0 : 151;
/*     */             
/*     */ 
/*     */ 
/*     */             label252:
/*     */             
/*     */ 
/*     */ 
/* 160 */             if (n != 0)
/*     */             {
/*     */ 
/*     */ 
/* 164 */               paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 171 */             else if (paramInt3 < 0) {
/* 172 */               paramInt1 = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 182 */               k = MainMemory.getI32Aligned(458776);
/* 183 */               m = k + (paramInt1 << 4) + 12;
/* 184 */               n = MainMemory.getI32(m);
/* 185 */               if (n + paramInt3 > MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt1 * 28 + 16)) {
/* 186 */                 paramInt1 = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 196 */                 com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt2, MainMemory.getI32(k + (paramInt1 << 4)) + 24 + n, paramInt3, 1);
/* 197 */                 MainMemory.setI32(m, MainMemory.getI32(m) + paramInt3);
/* 198 */                 i = 0;
/*     */                 
/*     */                 break label404;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 206 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label404:
/*     */       
/*     */ 
/* 212 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_read.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */