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
/*     */ public final class ngp_get_extver extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3445;
/*  14 */   public static final Function _instance = new ngp_get_extver();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ngp_get_extver() { super("ngp_get_extver", 2, false); }
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
/*  53 */       if ((paramInt1 == 0) || (paramInt2 == 0)) {
/*  54 */         m = 368;
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
/*     */           break label144;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         if (m > 0) {
/*  78 */           m = 368;
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
/*  89 */             m = 368;
/*     */             break label367;
/*     */           } else {
/*  92 */             i1 = 0;
/*     */             
/*     */             break label171;
/*     */           }
/*     */           
/*     */           label144:
/*     */           
/*  99 */           if (m < 1) {
/* 100 */             m = 368;
/*     */             break label367;
/*     */           } else {
/* 103 */             i1 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/*     */             label171:
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
/* 133 */             m = MainMemory.getI32(n) + 1;
/* 134 */             MainMemory.setI32(n, m);
/* 135 */             MainMemory.setI32(paramInt2, m);
/* 136 */             i = 0;
/*     */             
/*     */ 
/*     */             break label492;
/*     */             
/*     */             label264:
/*     */             
/* 143 */             i1 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 149 */           if (k == 0) {
/*     */             break label319;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           i3 = malloc.call(8);
/* 160 */           i2 = i3;
/*     */           
/*     */           break label341;
/*     */           
/*     */           label319:
/* 165 */           i3 = com.emt.proteus.runtime.library.c.realloc.call(j, (m << 3) + 8);
/* 166 */           i2 = i3;
/*     */           
/*     */ 
/*     */ 
/*     */           label341:
/*     */           
/*     */ 
/* 173 */           j = i2;
/* 174 */           if (i2 == 0) {
/* 175 */             m = 360;
/*     */           } else {
/*     */             break label380;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label367:
/*     */       
/*     */ 
/* 186 */       i = m;
/*     */       
/*     */ 
/*     */       break label492;
/*     */       
/*     */       label380:
/*     */       
/* 193 */       i3 = malloc.call(SystemLibrary.strlen(paramInt1) + 1);
/* 194 */       if (i3 != 0) {
/*     */         break label428;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */       com.emt.proteus.runtime.library.c.free.call(i2);
/* 205 */       i = 360;
/*     */       
/*     */ 
/*     */       break label492;
/*     */       
/*     */       label428:
/*     */       
/* 212 */       SystemLibrary.strcpy(i3, paramInt1);
/* 213 */       MainMemory.setI32Aligned(458792, j);
/* 214 */       m = MainMemory.getI32Aligned(467184);
/* 215 */       MainMemory.setI32(j + (m << 3), i3);
/* 216 */       MainMemory.setI32(j + (m << 3) + 4, 1);
/* 217 */       MainMemory.setI32(paramInt2, 1);
/* 218 */       MainMemory.setI32Aligned(467184, m + 1);
/* 219 */       i = 0;
/*     */       
/*     */ 
/*     */       label492:
/*     */       
/*     */ 
/* 225 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_get_extver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */