/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fits_is_this_a_copy extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2982;
/*  11 */   public static final Function _instance = new fits_is_this_a_copy();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_is_this_a_copy() { super("fits_is_this_a_copy", 1, false); }
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
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  40 */       if (SystemLibrary.strncmp(paramInt, 17600, 3) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  50 */         if (SystemLibrary.strncmp(paramInt, 44640, 8) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */           if (SystemLibrary.strncmp(paramInt, 20512, 4) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */             if (SystemLibrary.strncmp(paramInt, 17632, 3) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */               if (SystemLibrary.strncmp(paramInt, 33120, 6) != 0) {
/*     */                 break label122;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*  90 */       i = 1;
/*     */       
/*     */ 
/*     */       break label146;
/*     */       
/*     */       label122:
/*     */       
/*  97 */       SystemLibrary.memcpy(paramInt, 26464, 5, 1);
/*  98 */       i = paramInt == 0 ? 1 : 0;
/*     */       
/*     */ 
/*     */       label146:
/*     */       
/*     */ 
/* 104 */       int j = i; return j;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_is_this_a_copy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */