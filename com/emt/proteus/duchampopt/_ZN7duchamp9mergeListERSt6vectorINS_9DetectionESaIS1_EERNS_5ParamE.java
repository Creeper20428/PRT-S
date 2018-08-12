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
/*     */ public final class _ZN7duchamp9mergeListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1812;
/*  24 */   public static final Function _instance = new _ZN7duchamp9mergeListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp9mergeListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE() { super("_ZN7duchamp9mergeListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE", 2, false); }
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
/*  66 */     int i12 = 0;
/*  67 */     int i13 = 0;
/*     */     
/*     */ 
/*  70 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  74 */       i = MainMemory.alloc(276);
/*  75 */       j = MainMemory.alloc(12);
/*  76 */       k = paramInt1 + 4;
/*  77 */       i12 = MainMemory.getI32(k);
/*  78 */       i10 = MainMemory.getI32(paramInt1);
/*  79 */       if (!MathUtils.ult(i12 + 275 - i10, 551))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         m = MainMemory.getI8(paramInt2 + 558);
/*  90 */         i12 = (i12 - i10) / 276 + 31;
/*  91 */         n = SystemLibrary.newobject(i12 >>> 3 & 0x1FFFFFFC);
/*  92 */         i1 = n;
/*  93 */         i12 >>>= 5;
/*  94 */         if (i1 == i1 + (i12 << 2)) {
/*     */           break label231;
/*     */         } else {
/*  97 */           i10 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 106 */           i11 = i10 + 1;
/* 107 */           MainMemory.setI32(n + (i10 << 2), -1);
/* 108 */           if (i11 == i12) {
/*     */             break;
/*     */           }
/*     */           
/* 112 */           i10 = i11;
/*     */         }
/*     */         
/*     */ 
/*     */         label231:
/*     */         
/*     */ 
/* 119 */         i9 = m == 0 ? 1 : 0;
/* 120 */         i3 = 0;
/* 121 */         i10 = 0;
/* 122 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 131 */           i12 = i10 + 1;
/* 132 */           i13 = i10 * 276;
/* 133 */           if (!MathUtils.ugt((MainMemory.getI32(k) - MainMemory.getI32(paramInt1)) / 276 + -1, i10)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */           if (i9 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */             MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) | 0x80);
/* 154 */             i2 = i11 + 1;
/* 155 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 46176), 6), i2), 12992);
/* 156 */             MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) & 0xFF5F | 0x20);
/* 157 */             i7 = MainMemory.getI32(k);
/* 158 */             i8 = MainMemory.getI32(paramInt1);
/* 159 */             _ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(1808, 6), (i7 - i8) / 276 - i3);
/* 160 */             _Z14printBackSpacei.call(22);
/* 161 */             _ZNSolsEPFRSoS_E.call(1808, 80);
/* 162 */             MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) & 0xFFFFFFDF);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 168 */           if ((MainMemory.getI32(i1 + (i10 >>> 5 << 2)) & 1 << (i10 & 0x1F)) == 0) {
/* 169 */             i10 = i3;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 179 */             i2 = i11 + 1;
/*     */             
/* 181 */             i4 = i12;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 189 */               i5 = i1 + (i4 >>> 5 << 2);
/* 190 */               i6 = 1 << (i4 & 0x1F);
/* 191 */               if ((i6 & MainMemory.getI32(i5)) != 0)
/*     */               {
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
/* 203 */                 i7 = MainMemory.getI32(paramInt1);
/* 204 */                 if (_ZN7duchamp9Detection8canMergeERS0_RNS_5ParamE.call(i7 + i13, i7 + i4 * 276, paramInt2) != 0)
/*     */                 {
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
/* 216 */                   i7 = MainMemory.getI32(paramInt1);
/* 217 */                   _ZN7duchamp9Detection12addDetectionERS0_.call(i7 + i13, i7 + i4 * 276);
/* 218 */                   MainMemory.setI32(i5, MainMemory.getI32(i5) & (i6 ^ 0xFFFFFFFF));
/* 219 */                   i3 += 1;
/* 220 */                   if (i9 != 0)
/*     */                   {
/* 222 */                     i4 = i10;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 232 */                     MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) | 0x80);
/* 233 */                     _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 46176), 6), i2), 12992);
/* 234 */                     MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) & 0xFF5F | 0x20);
/* 235 */                     i7 = MainMemory.getI32(k);
/* 236 */                     i8 = MainMemory.getI32(paramInt1);
/* 237 */                     _ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(1808, 6), (i7 - i8) / 276 - i3);
/* 238 */                     _Z14printBackSpacei.call(22);
/* 239 */                     _ZNSolsEPFRSoS_E.call(1808, 80);
/* 240 */                     MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) & 0xFFFFFFDF);
/*     */                     
/* 242 */                     i4 = i10;
/*     */                   }
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 250 */               i4 += 1;
/* 251 */               if (!MathUtils.ugt((MainMemory.getI32(k) - MainMemory.getI32(paramInt1)) / 276, i4)) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             break label833;
/* 256 */             i10 = i3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label833:
/*     */           
/*     */ 
/*     */ 
/* 265 */           i11 = ((MainMemory.getI32(i1 + (i12 >>> 5 << 2)) & 1 << (i12 & 0x1F)) != 0 ? 1 : 0) + i11;
/* 266 */           i3 = i10;
/* 267 */           i10 = i12;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 273 */         _ZN7duchamp9DetectionC1Ev.call(i);
/* 274 */         _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEC2EjRKS1_RKS2_.call(j, (MainMemory.getI32(k) - MainMemory.getI32(paramInt1)) / 276 - i3, i);
/* 275 */         _ZN7duchamp9DetectionD2Ev.call(i);
/* 276 */         i12 = 0;
/* 277 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 285 */           i7 = MainMemory.getI32(k);
/* 286 */           i = MainMemory.getI32(paramInt1);
/* 287 */           if (!MathUtils.ugt((i7 - i) / 276, i10)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */           if ((MainMemory.getI32(i1 + (i10 >>> 5 << 2)) & 1 << (i10 & 0x1F)) != 0)
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
/* 308 */             i11 = i12 + 1;
/* 309 */             _ZN7duchamp9DetectionaSERKS0_.call(MainMemory.getI32(j) + i12 * 276, i + i10 * 276);
/* 310 */             i12 = i11;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */           i10 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */         if (i7 == i) {
/*     */           break label1132;
/*     */         } else {
/* 327 */           i12 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 336 */           SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i + i12 * 276)), i + i12 * 276);
/* 337 */           i12 += 1;
/* 338 */           if (i + i12 * 276 == i7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1132:
/*     */         
/*     */ 
/*     */ 
/* 349 */         MainMemory.setI32(k, i);
/* 350 */         _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_.call(paramInt1, j);
/* 351 */         _ZNSt6vectorIN7duchamp9DetectionESaIS1_EED1Ev.call(j);
/* 352 */         if (n != 0) {
/*     */           break label1175;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1185;
/*     */       
/*     */ 
/*     */ 
/*     */       label1175:
/*     */       
/*     */ 
/*     */ 
/* 368 */       SystemLibrary.delete(n);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1185:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9mergeListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */