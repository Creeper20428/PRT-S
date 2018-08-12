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
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEb;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEl;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamplsERSoRNS_9DataArrayE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1360;
/*  24 */   public static final Function _instance = new _ZN7duchamplsERSoRNS_9DataArrayE();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamplsERSoRNS_9DataArrayE() { super("_ZN7duchamplsERSoRNS_9DataArrayE", 2, false); }
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
/*  66 */     float f = 0.0F;
/*  67 */     int i12 = 0;
/*  68 */     int i13 = 0;
/*  69 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  75 */       i = paramInt2 + 4;
/*  76 */       if (MainMemory.getI16(i) <= 0) {
/*     */         break label172;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       j = paramInt2 + 8;
/*  87 */       i13 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  94 */         i10 = i13 + 1;
/*  95 */         if (i13 <= 0) {
/*     */           break label132;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 13120);
/*     */         
/*     */ 
/*     */         label132:
/*     */         
/*     */ 
/* 111 */         _ZNSolsEl.call(paramInt1, MainMemory.getI32(MainMemory.getI32(j) + (i13 << 2)));
/* 112 */         if (MainMemory.getI16(i) <= i10) break;
/* 113 */         i13 = i10;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label172:
/*     */       
/*     */ 
/*     */ 
/* 123 */       _ZNSolsEPFRSoS_E.call(paramInt1, 79);
/* 124 */       i11 = paramInt2 + 616;
/* 125 */       f = MainMemory.getF32(i11);
/* 126 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 77888), f), 13312);
/* 127 */       if (MainMemory.getI8(paramInt2 + 452) != 0) {
/*     */         break label286;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       k = paramInt2 + 592;
/* 138 */       f = _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(k);
/* 139 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(paramInt1, _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(k)), 13760), f), 13312);
/*     */       
/*     */       break label316;
/*     */       
/*     */       label286:
/* 144 */       f = MainMemory.getF32(i11);
/* 145 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 36896), f), 13312);
/*     */       
/*     */ 
/*     */       label316:
/*     */       
/*     */ 
/* 151 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEb.call(paramInt1, MainMemory.getI8(paramInt2 + 624)), 13408);
/* 152 */       m = paramInt2 + 28;
/* 153 */       i12 = MainMemory.getI32(m);
/* 154 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(paramInt1, (MainMemory.getI32(i12 + 4) - MainMemory.getI32(i12)) / 276), 73344);
/* 155 */       i12 = MainMemory.getI32(m);
/* 156 */       n = MainMemory.getI32(i12);
/*     */       
/* 158 */       i13 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 166 */         i14 = n + i13 * 276;
/* 167 */         if (!MathUtils.ult(i14, MainMemory.getI32(i12 + 4))) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */         i10 = MainMemory.getI32(n + i13 * 276 + 140);
/* 178 */         _ZNSolsEPFRSoS_E.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 50368), i10), 79);
/* 179 */         i1 = SystemLibrary.newobject(276);
/* 180 */         i2 = i1;
/* 181 */         _ZN7duchamp9DetectionC1Ev.call(i2);
/* 182 */         _ZN7duchamp9DetectionaSERKS0_.call(i2, i14);
/* 183 */         i3 = i1 + 76;
/* 184 */         i4 = i1 + 72;
/* 185 */         i5 = i1 + 68;
/* 186 */         i6 = i1;
/* 187 */         _ZN9PixelInfo8Object3D10addOffsetsElll.call(i6, MainMemory.getI32(i5), MainMemory.getI32(i4), MainMemory.getI32(i3));
/* 188 */         i7 = i1 + 100;
/* 189 */         i8 = MainMemory.getI32(i5);
/* 190 */         MainMemory.setI32(i7, i8 + MainMemory.getI32(i7));
/* 191 */         i7 = i1 + 104;
/* 192 */         i9 = MainMemory.getI32(i4);
/* 193 */         MainMemory.setI32(i7, i9 + MainMemory.getI32(i7));
/* 194 */         i4 = i1 + 108;
/* 195 */         i10 = MainMemory.getI32(i3);
/* 196 */         MainMemory.setI32(i4, i10 + MainMemory.getI32(i4));
/* 197 */         i11 = i1 + 116;
/* 198 */         f = i8;
/* 199 */         f = MainMemory.getF32(i11) + f;
/* 200 */         MainMemory.setF32(i11, f);
/* 201 */         i11 = i1 + 120;
/* 202 */         f = i9;
/* 203 */         f = MainMemory.getF32(i11) + f;
/* 204 */         MainMemory.setF32(i11, f);
/* 205 */         i11 = i1 + 124;
/* 206 */         f = i10;
/* 207 */         f = MainMemory.getF32(i11) + f;
/* 208 */         MainMemory.setF32(i11, f);
/* 209 */         _ZN9PixelInfolsERSoRNS_8Object3DE.call(paramInt1, i6);
/* 210 */         if (i1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */           SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i1) + 4), i2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 226 */         i13 += 1;
/* 227 */         i12 = MainMemory.getI32(m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 55776); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamplsERSoRNS_9DataArrayE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */