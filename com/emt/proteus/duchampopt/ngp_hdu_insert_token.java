/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ngp_hdu_insert_token extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3442;
/*  13 */   public static final Function _instance = new ngp_hdu_insert_token();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ngp_hdu_insert_token() { super("ngp_hdu_insert_token", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       if (paramInt == 0) {
/*  48 */         m = 362;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  58 */         m = MainMemory.getI32(paramInt);
/*  59 */         j = m * 172 + 172;
/*  60 */         if (m != 0) {
/*     */           break label85;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         n = com.emt.proteus.runtime.library.c.malloc.call(j);
/*     */         
/*     */         break label102;
/*     */         
/*     */         label85:
/*     */         
/*  76 */         n = com.emt.proteus.runtime.library.c.realloc.call(MainMemory.getI32(paramInt + 4), j);
/*     */         
/*     */ 
/*     */ 
/*     */         label102:
/*     */         
/*     */ 
/*     */ 
/*  84 */         if (n == 0) {
/*  85 */           m = 360;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  95 */           k = n;
/*  96 */           MainMemory.setI32(paramInt + 4, k);
/*  97 */           m = MainMemory.getI32(paramInt);
/*  98 */           SystemLibrary.memcpy(k + m * 172, 481696, 172, 4);
/*  99 */           if (MainMemory.getI32Aligned(481696) != 2) {
/*     */             break label282;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */           n = MainMemory.getI32Aligned(481772);
/* 111 */           if (n == 0) {
/*     */             break label282;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */           i1 = com.emt.proteus.runtime.library.c.malloc.call(SystemLibrary.strlen(n) + 1);
/* 123 */           MainMemory.setI32(k + m * 172 + 76, i1);
/* 124 */           if (i1 == 0) {
/* 125 */             m = 360;
/*     */           } else {
/*     */             break label263;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       i = m;
/*     */       
/*     */ 
/*     */       break label297;
/*     */       
/*     */       label263:
/*     */       
/* 143 */       SystemLibrary.strcpy(i1, n);
/* 144 */       m = MainMemory.getI32(paramInt);
/*     */       
/*     */ 
/*     */ 
/*     */       label282:
/*     */       
/*     */ 
/*     */ 
/* 152 */       MainMemory.setI32(paramInt, m + 1);
/* 153 */       i = 0;
/*     */       
/*     */ 
/*     */       label297:
/*     */       
/*     */ 
/* 159 */       int i2 = i; return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_hdu_insert_token.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */