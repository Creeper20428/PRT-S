/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorISsSaISsEED1Ev extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 209;
/*  12 */   public static final Function _instance = new _ZNSt6vectorISsSaISsEED1Ev();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6vectorISsSaISsEED1Ev() { super("_ZNSt6vectorISsSaISsEED1Ev", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  43 */       i = MainMemory.getI32(paramInt + 4);
/*  44 */       j = MainMemory.getI32(paramInt);
/*  45 */       if (j == i) {
/*  46 */         i = j;
/*     */         break label89;
/*     */       } else {
/*  49 */         k = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  58 */         com.emt.proteus.runtime.library.strings._ZNSsD1Ev.call(j + (k << 2));
/*  59 */         k += 1;
/*  60 */         if (j + (k << 2) == i) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */       i = MainMemory.getI32(paramInt);
/*     */       
/*     */ 
/*     */ 
/*     */       label89:
/*     */       
/*     */ 
/*     */ 
/*  79 */       if (i != 0) {
/*     */         break label119;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label129;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label119:
/*     */       
/*     */ 
/*     */ 
/*  95 */       com.emt.proteus.runtime.api.SystemLibrary.delete(i);
/*     */       
/*     */ 
/*     */       label129:
/*     */       
/*     */ 
/* 101 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorISsSaISsEED1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */