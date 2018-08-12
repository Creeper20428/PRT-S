/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class file_size extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3032;
/*  12 */   public static final Function _instance = new file_size();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public file_size() { super("file_size", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2);
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
/*  30 */     int k = call(i, j);
/*  31 */     paramFrame.setI32(paramInt1, k);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     long l1 = 0L;
/*  41 */     long l2 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       j = com.emt.proteus.runtime.api.MainMemory.getI32(503808 + (paramInt1 << 4));
/*  48 */       l1 = com.emt.proteus.runtime.library.stdio.ftello64.call(j);
/*  49 */       if (l1 >= 0L)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */         if (SystemLibrary.fseek(j, 0L, 2) != 0) {
/*     */           break label129;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */         l2 = com.emt.proteus.runtime.library.stdio.ftello64.call(j);
/*  70 */         if (l2 >= 0L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */           if (SystemLibrary.fseek(j, l1, 0) != 0) {
/*     */             break label129;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */           com.emt.proteus.runtime.api.MainMemory.setI64(paramInt2, l2);
/*  91 */           i = 0;
/*     */           
/*     */           break label137;
/*     */         }
/*     */       }
/*     */       
/*     */       label129:
/*  98 */       i = 116;
/*     */       
/*     */ 
/*     */       label137:
/*     */       
/*     */ 
/* 104 */       int k = i; return k;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_size.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */