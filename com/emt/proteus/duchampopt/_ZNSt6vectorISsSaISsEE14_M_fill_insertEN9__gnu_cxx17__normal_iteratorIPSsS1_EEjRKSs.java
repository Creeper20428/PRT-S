/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt20__throw_length_errorPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ public final class _ZNSt6vectorISsSaISsEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPSsS1_EEjRKSs extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2629;
/*  18 */   public static final Function _instance = new _ZNSt6vectorISsSaISsEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPSsS1_EEjRKSs();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZNSt6vectorISsSaISsEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPSsS1_EEjRKSs() { super("_ZNSt6vectorISsSaISsEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPSsS1_EEjRKSs", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  26 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, m);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*     */     
/*     */ 
/*  59 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(4);
/*  64 */       if (paramInt3 != 0) {
/*     */         break label59;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label653;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label59:
/*     */       
/*     */ 
/*     */ 
/*  80 */       j = paramInt1 + 8;
/*  81 */       k = paramInt1 + 4;
/*  82 */       i1 = MainMemory.getI32(k);
/*  83 */       if (!MathUtils.ult(MainMemory.getI32(j) - i1 >> 2, paramInt3)) {
/*     */         break label415;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       i1 = i1 - MainMemory.getI32(paramInt1) >> 2;
/*  94 */       if (!MathUtils.ult(1073741823 - i1, paramInt3)) {
/*     */         break label153;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       _ZSt20__throw_length_errorPKc.call(65952);
/*     */       
/*     */ 
/*     */       label153:
/*     */       
/*     */ 
/* 110 */       m = (MathUtils.ult(i1, paramInt3) ? paramInt3 : i1) + i1;
/* 111 */       if (MathUtils.ult(m, i1)) {
/* 112 */         i1 = 1073741823;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 122 */       else if (!MathUtils.ugt(m, 1073741823))
/*     */       {
/*     */ 
/*     */ 
/* 126 */         i1 = m;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 133 */         _ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       i = SystemLibrary.newobject(i1 << 2);
/* 141 */       i2 = _ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type.call(MainMemory.getI32(paramInt1), paramInt2, i);
/* 142 */       _ZSt26__uninitialized_fill_n_auxIPSsjSsEvT_T0_RKT1_St12__false_type.call(i2, paramInt3, paramInt4);
/* 143 */       paramInt2 = _ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type.call(paramInt2, MainMemory.getI32(k), i2 + (paramInt3 << 2));
/* 144 */       paramInt4 = MainMemory.getI32(k);
/* 145 */       i2 = MainMemory.getI32(paramInt1);
/* 146 */       if (i2 == paramInt4) {
/* 147 */         paramInt4 = i2;
/*     */         break label358;
/*     */       } else {
/* 150 */         paramInt3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 159 */         _ZNSsD1Ev.call(i2 + (paramInt3 << 2));
/* 160 */         paramInt3 += 1;
/* 161 */         if (i2 + (paramInt3 << 2) == paramInt4) {
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
/* 172 */       paramInt4 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label358:
/*     */       
/*     */ 
/*     */ 
/* 180 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         SystemLibrary.delete(paramInt4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 196 */       MainMemory.setI32(paramInt1, i);
/* 197 */       MainMemory.setI32(k, paramInt2);
/* 198 */       MainMemory.setI32(j, i + (i1 << 2));
/*     */       
/*     */ 
/*     */       break label653;
/*     */       
/*     */       label415:
/*     */       
/* 205 */       com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs.call(i, paramInt4);
/* 206 */       paramInt4 = MainMemory.getI32(k);
/* 207 */       i1 = paramInt2;
/* 208 */       m = paramInt4 - i1 >> 2;
/* 209 */       if (!MathUtils.ugt(m, paramInt3)) {
/*     */         break label626;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */       i2 = paramInt4 + (0 - paramInt3 << 2);
/* 220 */       _ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type.call(i2, paramInt4, paramInt4);
/* 221 */       MainMemory.setI32(k, MainMemory.getI32(k) + (paramInt3 << 2));
/* 222 */       i1 = i2 - i1 >> 2;
/* 223 */       if (i1 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 227 */         i1 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 234 */         m = paramInt3 ^ 0xFFFFFFFF;
/* 235 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 242 */           _ZNSsaSERKSs.call(paramInt4 + ((n ^ 0xFFFFFFFF) << 2), paramInt4 + (m - n << 2));
/* 243 */           n += 1;
/* 244 */           if (n == i1) {
/* 245 */             i1 = 0; break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 257 */         _ZNSsaSERKSs.call(paramInt2 + (i1 << 2), i);
/* 258 */         i1 += 1;
/* 259 */         if (i1 == paramInt3) { break label643;
/* 260 */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label626:
/*     */       
/*     */ 
/* 269 */       _ZNSt6vectorISsSaISsEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPSsS1_EEjRKSs_432.call(k, paramInt2, paramInt4, i, m, paramInt3);
/*     */       
/*     */ 
/*     */       label643:
/*     */       
/*     */ 
/* 275 */       _ZNSsD1Ev.call(i);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label653:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorISsSaISsEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPSsS1_EEjRKSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */