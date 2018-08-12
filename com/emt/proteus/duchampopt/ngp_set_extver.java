/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class ngp_set_extver extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3444;
/*  14 */   public static final Function _instance = new ngp_set_extver();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ngp_set_extver() { super("ngp_set_extver", 2, false); }
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
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (paramInt1 == 0) {
/*  54 */         paramInt2 = 368;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  64 */         j = MainMemory.getI32Aligned(458792);
/*  65 */         k = j == 0 ? 1 : 0;
/*  66 */         m = MainMemory.getI32Aligned(467184);
/*  67 */         if (k == 0) {
/*     */           break label137;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         if (m > 0) {
/*  78 */           paramInt2 = 368;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  88 */           if ((m < 1) && (k == 0)) {
/*  89 */             paramInt2 = 368;
/*     */             break label366;
/*     */           } else {
/*  92 */             i1 = 0;
/*     */             
/*     */             break label163;
/*     */           }
/*     */           
/*     */           label137:
/*     */           
/*  99 */           if (m < 1) {
/* 100 */             paramInt2 = 368;
/*     */             break label366;
/*     */           } else {
/* 103 */             i1 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/*     */             label163:
/*     */             
/*     */ 
/* 112 */             if (i1 >= m) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */             if (SystemLibrary.strcmp(paramInt1, MainMemory.getI32(j + (i1 << 3))) != 0) {
/*     */               break label264;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */             n = j + (i1 << 3) + 4;
/* 133 */             if (MainMemory.getI32(n) >= paramInt2)
/*     */             {
/*     */ 
/*     */ 
/* 137 */               paramInt2 = 0;
/*     */               
/*     */ 
/*     */               break label366;
/*     */             }
/*     */             
/*     */ 
/* 144 */             MainMemory.setI32(n, paramInt2);
/* 145 */             i = 0;
/*     */             
/*     */ 
/*     */             break label485;
/*     */             
/*     */             label264:
/*     */             
/* 152 */             i1 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 158 */           if (k == 0) {
/*     */             break label319;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */           i3 = malloc.call(8);
/* 169 */           i2 = i3;
/*     */           
/*     */           break label341;
/*     */           
/*     */           label319:
/* 174 */           i3 = com.emt.proteus.runtime.library.c.realloc.call(j, (m << 3) + 8);
/* 175 */           i2 = i3;
/*     */           
/*     */ 
/*     */ 
/*     */           label341:
/*     */           
/*     */ 
/* 182 */           j = i2;
/* 183 */           if (i2 == 0) {
/* 184 */             paramInt2 = 360;
/*     */           } else {
/*     */             break label378;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label366:
/*     */       
/*     */ 
/* 195 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label485;
/*     */       
/*     */       label378:
/*     */       
/* 202 */       i3 = malloc.call(SystemLibrary.strlen(paramInt1) + 1);
/* 203 */       if (i3 != 0) {
/*     */         break label426;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */       com.emt.proteus.runtime.library.c.free.call(i2);
/* 214 */       i = 360;
/*     */       
/*     */ 
/*     */       break label485;
/*     */       
/*     */       label426:
/*     */       
/* 221 */       SystemLibrary.strcpy(i3, paramInt1);
/* 222 */       MainMemory.setI32Aligned(458792, j);
/* 223 */       m = MainMemory.getI32Aligned(467184);
/* 224 */       MainMemory.setI32(j + (m << 3), i3);
/* 225 */       MainMemory.setI32(j + (m << 3) + 4, paramInt2);
/* 226 */       MainMemory.setI32Aligned(467184, m + 1);
/* 227 */       i = 0;
/*     */       
/*     */ 
/*     */       label485:
/*     */       
/*     */ 
/* 233 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_set_extver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */