/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c;
/*     */ 
/*     */ public final class _ZN11ProgressBar6removeEv extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2663;
/*  13 */   public static final Function _instance = new _ZN11ProgressBar6removeEv();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZN11ProgressBar6removeEv() { super("_ZN11ProgressBar6removeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       i = paramInt + 4;
/*  46 */       if (MainMemory.getI32(i) != 1) {
/*     */         break label97;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  56 */       m = MainMemory.getI32(paramInt + 12) + 2;
/*  57 */       if (m > 0) {
/*  58 */         k = 0;
/*     */       } else {
/*     */         break label97;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  69 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(1808, (byte)8);
/*  70 */         k += 1;
/*  71 */         if (k == m) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label97:
/*     */       
/*     */ 
/*     */ 
/*  82 */       MainMemory.setI32(i, 0);
/*  83 */       _ZNSolsEPFRSoS_E.call(1808, 80);
/*  84 */       j = paramInt + 12;
/*  85 */       k = MainMemory.getI32(j);
/*  86 */       m = k + 2;
/*  87 */       if (m > 0) {
/*  88 */         k = 0;
/*     */       }
/*     */       else
/*     */       {
/*  92 */         m = k;
/*     */         
/*     */ 
/*     */         break label192;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 100 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(1808, (byte)32);
/* 101 */         k += 1;
/* 102 */         if (k == m) {
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
/* 113 */       m = MainMemory.getI32(j);
/*     */       
/*     */ 
/*     */ 
/*     */       label192:
/*     */       
/*     */ 
/*     */ 
/* 121 */       MainMemory.setI32(i, 1);
/* 122 */       m += 2;
/* 123 */       if (m > 0) {
/* 124 */         k = 0;
/*     */       } else {
/*     */         break label255;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 135 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(1808, (byte)8);
/* 136 */         k += 1;
/* 137 */         if (k == m) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label255:
/*     */       
/*     */ 
/*     */ 
/* 148 */       MainMemory.setI32(i, 0);
/* 149 */       _ZNSolsEPFRSoS_E.call(1808, 80);
/* 150 */       _ZNSolsEPFRSoS_E.call(1808, 80); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN11ProgressBar6removeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */