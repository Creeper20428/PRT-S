/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class smem_write extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3131;
/*  13 */   public static final Function _instance = new smem_write();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public smem_write() { super("smem_write", 3, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       if (paramInt2 == 0) {
/*  53 */         paramInt1 = 152;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  63 */         if (!MainMemory.getI1(459056))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */           m = shared_init.call();
/*  74 */           if (m != 0) {
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
/*  85 */         if (paramInt1 < 0) {
/*  86 */           paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*  96 */         else if (MainMemory.getI32Aligned(459504) <= paramInt1)
/*     */         {
/*     */ 
/*     */ 
/* 100 */           paramInt1 = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 107 */           k = MainMemory.getI32Aligned(458776);
/* 108 */           j = MainMemory.getI32(k + (paramInt1 << 4));
/* 109 */           if (j == 0) {
/* 110 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 120 */           else if (MainMemory.getI32(k + (paramInt1 << 4) + 8) == 0) {
/* 121 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 131 */           else if (MainMemory.getI8(j) != 74)
/*     */           {
/*     */ 
/*     */ 
/* 135 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 142 */           else if (MainMemory.getI8(j + 1) != 66)
/*     */           {
/*     */ 
/*     */ 
/* 146 */             paramInt1 = -1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 153 */             m = MainMemory.getI8(j + 2) == 1 ? 0 : 151;
/*     */             
/*     */ 
/*     */ 
/*     */             label252:
/*     */             
/*     */ 
/*     */ 
/* 161 */             if (m != 0)
/*     */             {
/*     */ 
/*     */ 
/* 165 */               paramInt1 = -1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 172 */               k = MainMemory.getI32Aligned(458776);
/* 173 */               if (MainMemory.getI32(k + (paramInt1 << 4) + 8) != -1)
/*     */               {
/*     */ 
/*     */ 
/* 177 */                 paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 184 */               else if (paramInt3 < 0) {
/* 185 */                 paramInt1 = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 195 */                 m = MainMemory.getI32(k + (paramInt1 << 4) + 12);
/* 196 */                 if (!MathUtils.ugt(m + paramInt3, MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt1 * 28 + 16) + -16)) {
/*     */                   break label438;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */                 if (shared_realloc.call(paramInt1, paramInt3 + 16 + m) == 0) {
/* 209 */                   paramInt1 = 156;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 219 */                   k = MainMemory.getI32Aligned(458776);
/* 220 */                   m = MainMemory.getI32(k + (paramInt1 << 4) + 12);
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   label438:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 230 */                   com.emt.proteus.runtime.api.SystemLibrary.memcpy(MainMemory.getI32(k + (paramInt1 << 4)) + 24 + m, paramInt2, paramInt3, 1);
/* 231 */                   n = k + (paramInt1 << 4) + 12;
/* 232 */                   MainMemory.setI32(n, MainMemory.getI32(n) + paramInt3);
/* 233 */                   i = 0;
/*     */                   break label501;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 241 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label501:
/*     */       
/*     */ 
/* 247 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_write.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */