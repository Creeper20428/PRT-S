/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp12finaliseListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1809;
/*  24 */   public static final Function _instance = new _ZN7duchamp12finaliseListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp12finaliseListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE() { super("_ZN7duchamp12finaliseListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  31 */     call(paramInt1, paramInt2);
/*  32 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*  64 */     int i10 = 0;
/*  65 */     int i11 = 0;
/*     */     
/*     */ 
/*  68 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       i = MainMemory.alloc(12);
/*  73 */       j = paramInt2 + 558;
/*  74 */       if (MainMemory.getI8(j) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         i6 = (MainMemory.getI32(paramInt1 + 4) - MainMemory.getI32(paramInt1)) / 276;
/*  85 */         _ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 49248), 6), i6);
/*  86 */         _Z10printSpacei.call(6);
/*  87 */         _Z14printBackSpacei.call(22);
/*  88 */         _ZNSolsEPFRSoS_E.call(1808, 80);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  94 */       MainMemory.setI32(i, 0);
/*  95 */       k = i + 4;
/*  96 */       MainMemory.setI32(k, 0);
/*  97 */       m = i + 8;
/*  98 */       MainMemory.setI32(m, 0);
/*  99 */       n = MainMemory.getI32(paramInt1);
/* 100 */       i1 = paramInt1 + 4;
/* 101 */       i2 = paramInt2 + 528;
/* 102 */       i3 = paramInt2 + 288;
/* 103 */       i4 = paramInt2 + 532;
/* 104 */       i6 = 0;
/* 105 */       i7 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 113 */         i8 = n + i6 * 276 + 28;
/* 114 */         i9 = n + i6 * 276;
/* 115 */         i10 = n + i6 * 276;
/* 116 */         i11 = MainMemory.getI32(i1);
/* 117 */         if (!MathUtils.ult(i9, i11)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         _ZN7duchamp9Detection10setOffsetsERNS_5ParamE.call(i9, paramInt2);
/* 128 */         if (_ZN7duchamp9Detection17hasEnoughChannelsEi.call(i9, MainMemory.getI32(i2)) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */           if (!MathUtils.ult(_ZN9PixelInfo8Object3D14getSpatialSizeEv.call(i10), MainMemory.getI32(i3)))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */             if (!MathUtils.ult(MainMemory.getI32(i8), MainMemory.getI32(i4))) {
/*     */               break label451;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         i7 += 1;
/* 159 */         if (MainMemory.getI8(j) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */           i5 = (MainMemory.getI32(i1) - MainMemory.getI32(paramInt1)) / 276 - i7;
/* 171 */           _ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 49248), 6), i5);
/* 172 */           _Z10printSpacei.call(6);
/* 173 */           _Z14printBackSpacei.call(22);
/* 174 */           _ZNSolsEPFRSoS_E.call(1808, 80);
/*     */           
/*     */           break label549;
/*     */           
/*     */           label451:
/*     */           
/* 180 */           i11 = MainMemory.getI32(k);
/* 181 */           if (i11 != MainMemory.getI32(m)) {
/*     */             break label499;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 191 */           _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(i, i11, i9);
/*     */           
/*     */           break label549;
/*     */           
/*     */           label499:
/*     */           
/* 197 */           if (i11 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */             _ZN7duchamp9DetectionC1ERKS0_.call(i11, i9);
/* 209 */             i11 = MainMemory.getI32(k);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */           MainMemory.setI32(k, i11 + 276);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label549:
/*     */         
/*     */ 
/* 225 */         i6 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */       n = MainMemory.getI32(paramInt1);
/* 233 */       if (i11 == n) {
/*     */         break label655;
/*     */       } else {
/* 236 */         i6 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 245 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(n + i6 * 276)), n + i6 * 276);
/* 246 */         i6 += 1;
/* 247 */         if (n + i6 * 276 == i11) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label655:
/*     */       
/*     */ 
/*     */ 
/* 258 */       MainMemory.setI32(i1, n);
/* 259 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_.call(paramInt1, i);
/* 260 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EED1Ev.call(i);
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
/* 271 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp12finaliseListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */