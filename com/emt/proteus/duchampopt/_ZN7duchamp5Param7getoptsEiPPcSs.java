/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.getopt;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp5Param7getoptsEiPPcSs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 241;
/*  30 */   public static final Function _instance = new _ZN7duchamp5Param7getoptsEiPPcSs();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public _ZN7duchamp5Param7getoptsEiPPcSs() { super("_ZN7duchamp5Param7getoptsEiPPcSs", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  37 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  42 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int n = call(i, j, k, m);
/*  55 */     paramFrame.setI32(paramInt1, n);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     int i5 = 0;
/*  72 */     int i6 = 0;
/*  73 */     int i7 = 0;
/*  74 */     int i8 = 0;
/*  75 */     int i9 = 0;
/*     */     
/*     */ 
/*  78 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  82 */       j = MainMemory.alloc(4);
/*  83 */       k = MainMemory.alloc(1);
/*  84 */       m = MainMemory.alloc(4);
/*  85 */       n = MainMemory.alloc(4);
/*  86 */       i1 = MainMemory.alloc(4);
/*  87 */       i2 = MainMemory.alloc(4);
/*  88 */       i3 = MainMemory.alloc(4);
/*  89 */       i4 = MainMemory.alloc(188);
/*  90 */       if (paramInt2 != 1) {
/*     */         break label195;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       if (_ZNKSs7compareEPKc.call(paramInt4, 28640) != 0) {
/*     */         break label165;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(1808, 463636);
/* 111 */       i = 1;
/*     */       
/*     */ 
/*     */       break label765;
/*     */       
/*     */       label165:
/*     */       
/* 118 */       _ZNKSs7compareEPKc.call(paramInt4, 37216);
/* 119 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(1808, 459588);
/* 120 */       i = 1;
/*     */       
/*     */ 
/*     */       break label765;
/*     */       
/*     */       label195:
/*     */       
/* 127 */       _ZNSsC1Ev.call(i3);
/* 128 */       _ZN7duchamp5Param13defaultValuesEv.call(paramInt1);
/* 129 */       i5 = i4 + 8;
/* 130 */       i6 = paramInt1 + 4;
/* 131 */       i8 = 1;
/* 132 */       i9 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 152 */         switch ((byte)getopt.call(paramInt2, paramInt3, 37536)) {
/*     */         case -1: 
/*     */           break;
/*     */         case 102: 
/*     */           break;
/*     */         case 112: 
/*     */           break; case 118:  break; case 120:  i9 = 1; break;
/*     */         default: 
/*     */           break label691;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */           _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(1808, 466976), 47040), 466800), 79);
/* 168 */           continue;
/*     */           
/*     */ 
/*     */ 
/* 172 */           _ZNSsaSEPKc.call(i3, MainMemory.getI32Aligned(24));
/* 173 */           _ZNSsC1ERKSs.call(i2, i3);
/* 174 */           i7 = _ZN7duchamp5Param10readParamsESs.call(paramInt1, i2);
/* 175 */           _ZNSsD1Ev.call(i2);
/* 176 */           if (i7 != 1)
/*     */           {
/*     */ 
/*     */ 
/* 180 */             i8 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 188 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i4, 24);
/* 189 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i5, 76384), i3), 14656);
/* 190 */             _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i1, i4);
/* 191 */             _ZNSsC1ERKSs.call(n, paramInt4);
/* 192 */             _ZN7duchamp12duchampErrorESsSs.call(n, i1);
/* 193 */             _ZNSsD1Ev.call(n);
/* 194 */             _ZNSsD1Ev.call(i1);
/* 195 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i4);
/* 196 */             continue;
/*     */             
/*     */ 
/*     */ 
/* 200 */             _ZNSsaSEPKc.call(i3, MainMemory.getI32Aligned(24));
/* 201 */             _ZNSsaSERKSs.call(i6, i3);
/* 202 */             i8 = 0;
/*     */             
/* 204 */             continue;
/*     */             
/*     */ 
/*     */ 
/* 208 */             if (i9 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */               if (i8 != 0) {
/*     */                 break label608;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */               MainMemory.setI8(paramInt1 + 192, (byte)0);
/*     */               
/*     */               break label671;
/*     */               
/*     */               label608:
/* 233 */               _ZNSaIcEC1Ev.call(k);
/* 234 */               _ZNSsC1EPKcRKSaIcE.call(m, 129632, k);
/* 235 */               _ZNSsC1ERKSs.call(j, paramInt4);
/* 236 */               _ZN7duchamp12duchampErrorESsSs.call(j, m);
/* 237 */               _ZNSsD1Ev.call(j);
/* 238 */               _ZNSsD1Ev.call(m);
/* 239 */               _ZNSaIcED1Ev.call(k);
/* 240 */               _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13408), 459588);
/*     */             }
/*     */             
/*     */ 
/*     */             label671:
/*     */             
/* 246 */             _ZNSsD1Ev.call(i3);
/* 247 */             i = i8;
/*     */             
/*     */ 
/*     */             break label765;
/*     */             
/*     */             label691:
/*     */             
/* 254 */             if (_ZNKSs7compareEPKc.call(paramInt4, 28640) != 0) {
/*     */               break label737;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */             _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(1808, 463636);
/* 265 */             continue;
/*     */             
/*     */             label737:
/*     */             
/* 269 */             _ZNKSs7compareEPKc.call(paramInt4, 37216);
/* 270 */             _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(1808, 459588);
/*     */           }
/*     */           break; } }
/*     */       label765:
/* 274 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 279 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param7getoptsEiPPcSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */