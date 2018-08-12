/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fits_is_url_absolute extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3422;
/*  11 */   public static final Function _instance = new fits_is_url_absolute();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_is_url_absolute() { super("fits_is_url_absolute", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  42 */       j = SystemLibrary.strchr(paramInt, 58);
/*  43 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  53 */         k = SystemLibrary.strchr(paramInt, 59);
/*  54 */         if ((k != 0) && (!MathUtils.ugt(k, j))) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */         k = SystemLibrary.strchr(paramInt, 47);
/*  65 */         if ((k != 0) && (!MathUtils.ugt(k, j))) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         k = SystemLibrary.strchr(paramInt, 63);
/*  76 */         if ((k != 0) && (!MathUtils.ugt(k, j))) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         k = SystemLibrary.strchr(paramInt, 64);
/*  87 */         if ((k != 0) && (!MathUtils.ugt(k, j))) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         k = SystemLibrary.strchr(paramInt, 38);
/*  98 */         if ((k != 0) && (!MathUtils.ugt(k, j))) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         k = SystemLibrary.strchr(paramInt, 61);
/* 109 */         if ((k != 0) && (!MathUtils.ugt(k, j))) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */         k = SystemLibrary.strchr(paramInt, 43);
/* 120 */         if ((k != 0) && (!MathUtils.ugt(k, j))) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */         k = SystemLibrary.strchr(paramInt, 36);
/* 131 */         if ((k != 0) && (!MathUtils.ugt(k, j))) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         paramInt = SystemLibrary.strchr(paramInt, 44);
/* 142 */         i = (paramInt == 0) || (MathUtils.ugt(paramInt, j)) ? 1 : 0;
/*     */         
/*     */         break label325;
/*     */       }
/*     */       
/*     */       label318:
/*     */       
/* 149 */       i = 0;
/*     */       
/*     */ 
/*     */       label325:
/*     */       
/*     */ 
/* 155 */       int m = i; return m;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_is_url_absolute.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */