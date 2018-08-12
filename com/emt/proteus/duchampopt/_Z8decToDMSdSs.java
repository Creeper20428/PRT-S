/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEd;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ public final class _Z8decToDMSdSs extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2708;
/*  27 */   public static final Function _instance = new _Z8decToDMSdSs();
/*  28 */   public final Function resolve() { return _instance; }
/*     */   
/*  30 */   public _Z8decToDMSdSs() { super("_Z8decToDMSdSs", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble, int paramInt2)
/*     */   {
/*  34 */     call(paramInt1, paramDouble, paramInt2);
/*  35 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  40 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, d, j);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, double paramDouble, int paramInt2)
/*     */   {
/*  56 */     int i = 0;
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*  61 */     int i1 = 0;
/*  62 */     int i2 = 0;
/*  63 */     int i3 = 0;
/*  64 */     double d = 0.0D;
/*  65 */     boolean bool = false;
/*  66 */     int i4 = 0;
/*  67 */     int i5 = 0;
/*     */     
/*     */ 
/*  70 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  74 */       i = MainMemory.alloc(1);
/*  75 */       j = MainMemory.alloc(1);
/*  76 */       k = MainMemory.alloc(1);
/*  77 */       m = MainMemory.alloc(4);
/*  78 */       n = MainMemory.alloc(188);
/*  79 */       com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(k);
/*  80 */       com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE.call(m, 12960, k);
/*  81 */       _ZNSaIcED1Ev.call(k);
/*  82 */       if (_ZNKSs7compareEPKc.call(paramInt2, 14784) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         if (_ZNKSs7compareEPKc.call(paramInt2, 18848) != 0) {
/*     */           break label286;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */       i1 = _ZNKSs7compareEPKc.call(paramInt2, 18848) == 0 ? 3 : 2;
/* 103 */       if (!MathUtils.f_olt(paramDouble, 0.0D)) {
/*     */         break label198;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 116 */         paramDouble += 360.0D;
/* 117 */       } while (MathUtils.f_olt(paramDouble, 0.0D));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label198:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       if (!MathUtils.f_ult(paramDouble, 360.0D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */           paramDouble += -360.0D;
/* 144 */           if (MathUtils.f_ult(paramDouble, 360.0D)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */       if (_ZNKSs7compareEPKc.call(paramInt2, 14784) != 0) {
/*     */         break label520;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */       paramDouble /= 15.0D;
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label286:
/*     */       
/* 176 */       if (_ZNKSs7compareEPKc.call(paramInt2, 16384) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */         if (_ZNKSs7compareEPKc.call(paramInt2, 19008) != 0) {
/*     */           break label394;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */       if (!MathUtils.f_olt(paramDouble, 0.0D)) {
/*     */         break label372;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */       _ZNSsaSEPKc.call(m, 13472);
/*     */       
/* 208 */       i1 = 2;
/*     */       
/*     */       break label520;
/*     */       
/*     */       label372:
/* 213 */       _ZNSsaSEPKc.call(m, 13696);
/*     */       
/* 215 */       i1 = 2;
/*     */       
/*     */       break label520;
/*     */       
/*     */       label394:
/* 220 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(2048, 92896), paramInt2), 71968);
/* 221 */       if (!MathUtils.f_olt(paramDouble, 0.0D)) {
/*     */         break label457;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 234 */         paramDouble += 360.0D;
/* 235 */       } while (MathUtils.f_olt(paramDouble, 0.0D));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label457:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */       if (!MathUtils.f_ult(paramDouble, 360.0D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */           paramDouble += -360.0D;
/* 262 */           if (MathUtils.f_ult(paramDouble, 360.0D)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */       paramDouble /= 15.0D;
/*     */       
/* 277 */       i1 = 2;
/*     */       
/*     */ 
/*     */ 
/*     */       label520:
/*     */       
/*     */ 
/*     */ 
/* 285 */       paramDouble = SystemLibrary.fabs(paramDouble);
/* 286 */       i2 = (int)paramDouble;
/* 287 */       d = SystemLibrary.fmod(paramDouble, 1.0D) * 60.0D;
/* 288 */       i3 = (int)d;
/* 289 */       paramDouble = SystemLibrary.fmod(paramDouble, 0.016666666666666666D) * 3600.0D;
/* 290 */       d = paramDouble + -60.0D;
/* 291 */       bool = MathUtils.f_olt(SystemLibrary.fabs(d), 1.0E-10D);
/* 292 */       paramDouble = bool ? 0.0D : paramDouble;
/* 293 */       i3 = (bool ? 1 : 0) + i3;
/* 294 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(n, 16);
/* 295 */       i4 = n + 64;
/* 296 */       MainMemory.setI32(i4, MainMemory.getI32(i4) | 0x404);
/* 297 */       i5 = n + 8;
/* 298 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(i5, m);
/* 299 */       MainMemory.setI8(j, (byte)48);
/* 300 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i5, i1), j), i2), 13632);
/* 301 */       MainMemory.setI8(i, (byte)48);
/* 302 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i5, 2), i), i3), 13632);
/* 303 */       _ZNSolsEd.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i5, 5), 2), paramDouble);
/* 304 */       com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt1, n);
/* 305 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(n);
/* 306 */       _ZNSsD1Ev.call(m);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 317 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z8decToDMSdSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */