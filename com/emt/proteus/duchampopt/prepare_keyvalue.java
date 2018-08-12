/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class prepare_keyvalue extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3425;
/*  11 */   public static final Function _instance = new prepare_keyvalue();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public prepare_keyvalue() { super("prepare_keyvalue", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     call(paramInt);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     call(i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  43 */       i = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt);
/*  44 */       if (MainMemory.getI8(paramInt) != 39) {
/*     */         break label46;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  54 */       prepare_keyvalue_1625.call(i, paramInt);
/*     */       
/*     */ 
/*     */       label46:
/*     */       
/*     */ 
/*  60 */       i = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt) + -1;
/*  61 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  68 */         if (j >= i) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */         if (MainMemory.getI8(paramInt + j) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         j += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  94 */       if (j == i) {
/*     */         break label202;
/*     */       } else {
/*  97 */         j = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 106 */         k = i - j;
/* 107 */         m = paramInt + k;
/* 108 */         if (k < 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         if (MainMemory.getI8(m) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         MainMemory.setI8(m, (byte)0);
/* 129 */         j += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label202:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 140 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/prepare_keyvalue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */