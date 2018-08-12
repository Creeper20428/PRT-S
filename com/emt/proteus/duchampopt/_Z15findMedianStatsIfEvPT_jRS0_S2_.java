/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ 
/*     */ public final class _Z15findMedianStatsIfEvPT_jRS0_S2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2695;
/*  14 */   public static final Function _instance = new _Z15findMedianStatsIfEvPT_jRS0_S2_();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _Z15findMedianStatsIfEvPT_jRS0_S2_() { super("_Z15findMedianStatsIfEvPT_jRS0_S2_", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       if (paramInt2 != 0) {
/*     */         break label48;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(2048, 100704);
/*     */       
/*     */ 
/*     */       break label176;
/*     */       
/*     */       label48:
/*     */       
/*  72 */       i = SystemLibrary.newarray(paramInt2 << 2);
/*  73 */       j = i;
/*  74 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  81 */         MainMemory.setF32(i + (k << 2), MainMemory.getF32(paramInt1 + (k << 2)));
/*  82 */         k += 1;
/*  83 */         if (k == paramInt2) {
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
/*  94 */       f = _Z10findMedianIfET_PS0_jb.call(j, paramInt2);
/*  95 */       MainMemory.setF32(paramInt3, f);
/*  96 */       MainMemory.setF32(paramInt4, _Z9findMADFMIfET_PS0_jS0_b.call(j, paramInt2, f));
/*  97 */       if (i != 0) {
/*     */         break label166;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label176;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label166:
/*     */       
/*     */ 
/*     */ 
/* 113 */       SystemLibrary.deletearray(i);
/*     */       
/*     */ 
/*     */       label176:
/*     */       
/*     */ 
/* 119 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z15findMedianStatsIfEvPT_jRS0_S2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */