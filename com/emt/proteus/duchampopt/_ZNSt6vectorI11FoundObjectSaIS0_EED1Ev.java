/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorI11FoundObjectSaIS0_EED1Ev extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1086;
/*  12 */   public static final Function _instance = new _ZNSt6vectorI11FoundObjectSaIS0_EED1Ev();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6vectorI11FoundObjectSaIS0_EED1Ev() { super("_ZNSt6vectorI11FoundObjectSaIS0_EED1Ev", 1, false); }
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
/*     */         break label106;
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
/*  58 */         MainMemory.setI32(j + k * 52 + 8, 12936);
/*  59 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(j + k * 52 + 8 + 4);
/*  60 */         k += 1;
/*  61 */         if (j + k * 52 == i) {
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
/*  72 */       i = MainMemory.getI32(paramInt);
/*     */       
/*     */ 
/*     */ 
/*     */       label106:
/*     */       
/*     */ 
/*     */ 
/*  80 */       if (i != 0) {
/*     */         break label133;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label142;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label133:
/*     */       
/*     */ 
/*     */ 
/*  96 */       com.emt.proteus.runtime.api.SystemLibrary.delete(i);
/*     */       
/*     */ 
/*     */       label142:
/*     */       
/*     */ 
/* 102 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorI11FoundObjectSaIS0_EED1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */