/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp5ParamaSERKS0_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 237;
/*  15 */   public static final Function _instance = new _ZN7duchamp5ParamaSERKS0_();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp5ParamaSERKS0_() { super("_ZN7duchamp5ParamaSERKS0_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (paramInt1 != paramInt2) {
/*     */         break label35;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1701;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label35:
/*     */       
/*     */ 
/*     */ 
/*  64 */       _ZNSsaSERKSs.call(paramInt1 + 4, paramInt2 + 4);
/*  65 */       MainMemory.setI8(paramInt1 + 8, MainMemory.getI8(paramInt2 + 8));
/*  66 */       _ZN7duchamp7SectionaSERKS0_.call(paramInt1 + 12, paramInt2 + 12);
/*  67 */       MainMemory.setI8(paramInt1 + 60, MainMemory.getI8(paramInt2 + 60));
/*  68 */       _ZNSsaSERKSs.call(paramInt1 + 64, paramInt2 + 64);
/*  69 */       MainMemory.setI8(paramInt1 + 68, MainMemory.getI8(paramInt2 + 68));
/*  70 */       _ZNSsaSERKSs.call(paramInt1 + 72, paramInt2 + 72);
/*  71 */       MainMemory.setI8(paramInt1 + 76, MainMemory.getI8(paramInt2 + 76));
/*  72 */       _ZNSsaSERKSs.call(paramInt1 + 80, paramInt2 + 80);
/*  73 */       MainMemory.setI8(paramInt1 + 84, MainMemory.getI8(paramInt2 + 84));
/*  74 */       _ZNSsaSERKSs.call(paramInt1 + 88, paramInt2 + 88);
/*  75 */       _ZNSsaSERKSs.call(paramInt1 + 92, paramInt2 + 92);
/*  76 */       MainMemory.setI8(paramInt1 + 96, MainMemory.getI8(paramInt2 + 96));
/*  77 */       _ZNSsaSERKSs.call(paramInt1 + 100, paramInt2 + 100);
/*  78 */       _ZNSsaSERKSs.call(paramInt1 + 108, paramInt2 + 108);
/*  79 */       MainMemory.setI8(paramInt1 + 112, MainMemory.getI8(paramInt2 + 112));
/*  80 */       _ZNSsaSERKSs.call(paramInt1 + 116, paramInt2 + 116);
/*  81 */       MainMemory.setI8(paramInt1 + 120, MainMemory.getI8(paramInt2 + 120));
/*  82 */       _ZNSsaSERKSs.call(paramInt1 + 124, paramInt2 + 124);
/*  83 */       MainMemory.setI8(paramInt1 + 128, MainMemory.getI8(paramInt2 + 128));
/*  84 */       _ZNSsaSERKSs.call(paramInt1 + 132, paramInt2 + 132);
/*  85 */       MainMemory.setI8(paramInt1 + 136, MainMemory.getI8(paramInt2 + 136));
/*  86 */       MainMemory.setI8(paramInt1 + 137, MainMemory.getI8(paramInt2 + 137));
/*  87 */       _ZNSsaSERKSs.call(paramInt1 + 140, paramInt2 + 140);
/*  88 */       MainMemory.setI8(paramInt1 + 144, MainMemory.getI8(paramInt2 + 144));
/*  89 */       _ZNSsaSERKSs.call(paramInt1 + 148, paramInt2 + 148);
/*  90 */       MainMemory.setI8(paramInt1 + 152, MainMemory.getI8(paramInt2 + 152));
/*  91 */       _ZNSsaSERKSs.call(paramInt1 + 156, paramInt2 + 156);
/*  92 */       MainMemory.setI8(paramInt1 + 160, MainMemory.getI8(paramInt2 + 160));
/*  93 */       _ZNSsaSERKSs.call(paramInt1 + 164, paramInt2 + 164);
/*  94 */       MainMemory.setI8(paramInt1 + 168, MainMemory.getI8(paramInt2 + 168));
/*  95 */       _ZNSsaSERKSs.call(paramInt1 + 172, paramInt2 + 172);
/*  96 */       _ZNSsaSERKSs.call(paramInt1 + 176, paramInt2 + 176);
/*  97 */       MainMemory.setI8(paramInt1 + 180, MainMemory.getI8(paramInt2 + 180));
/*  98 */       _ZNSsaSERKSs.call(paramInt1 + 184, paramInt2 + 184);
/*  99 */       _ZNSsaSERKSs.call(paramInt1 + 188, paramInt2 + 188);
/* 100 */       MainMemory.setI8(paramInt1 + 192, MainMemory.getI8(paramInt2 + 192));
/* 101 */       MainMemory.setI32(paramInt1 + 196, MainMemory.getI32(paramInt2 + 196));
/* 102 */       MainMemory.setI32(paramInt1 + 200, MainMemory.getI32(paramInt2 + 200));
/* 103 */       MainMemory.setI32(paramInt1 + 204, MainMemory.getI32(paramInt2 + 204));
/* 104 */       MainMemory.setI8(paramInt1 + 209, MainMemory.getI8(paramInt2 + 209));
/* 105 */       MainMemory.setF32(paramInt1 + 212, MainMemory.getF32(paramInt2 + 212));
/* 106 */       MainMemory.setI32(paramInt1 + 216, MainMemory.getI32(paramInt2 + 216));
/* 107 */       MainMemory.setF32(paramInt1 + 220, MainMemory.getF32(paramInt2 + 220));
/* 108 */       MainMemory.setF32(paramInt1 + 224, MainMemory.getF32(paramInt2 + 224));
/* 109 */       _ZNSsaSERKSs.call(paramInt1 + 228, paramInt2 + 228);
/* 110 */       MainMemory.setI8(paramInt1 + 232, MainMemory.getI8(paramInt2 + 232));
/* 111 */       MainMemory.setI32(paramInt1 + 236, MainMemory.getI32(paramInt2 + 236));
/* 112 */       MainMemory.setI32(paramInt1 + 240, MainMemory.getI32(paramInt2 + 240));
/* 113 */       MainMemory.setF32(paramInt1 + 292, MainMemory.getF32(paramInt2 + 292));
/* 114 */       MainMemory.setF32(paramInt1 + 296, MainMemory.getF32(paramInt2 + 296));
/* 115 */       _ZN7duchamp11DuchampBeamaSERKS0_.call(paramInt1 + 300, paramInt2 + 300);
/* 116 */       _ZNSsaSERKSs.call(paramInt1 + 324, paramInt2 + 324);
/* 117 */       MainMemory.setI8(paramInt1 + 244, MainMemory.getI8(paramInt2 + 244));
/* 118 */       MainMemory.setI8(paramInt1 + 245, MainMemory.getI8(paramInt2 + 245));
/* 119 */       MainMemory.setI32(paramInt1 + 248, MainMemory.getI32(paramInt2 + 248));
/* 120 */       MainMemory.setI32(paramInt1 + 252, MainMemory.getI32(paramInt2 + 252));
/* 121 */       MainMemory.setI32(paramInt1 + 256, MainMemory.getI32(paramInt2 + 256));
/* 122 */       MainMemory.setI32(paramInt1 + 260, MainMemory.getI32(paramInt2 + 260));
/* 123 */       i = paramInt1 + 268;
/* 124 */       if (MainMemory.getI32(i) <= 0) {
/*     */         break label929;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       _ZN7duchamp5ParamaSERKS0__319.call(paramInt1);
/*     */       
/*     */ 
/*     */       label929:
/*     */       
/*     */ 
/* 140 */       j = MainMemory.getI32(paramInt2 + 268);
/* 141 */       MainMemory.setI32(i, j);
/* 142 */       if (j <= 0) {
/*     */         break label975;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */       _ZN7duchamp5ParamaSERKS0__318.call(paramInt2, i, paramInt1, j);
/*     */       
/*     */ 
/*     */       label975:
/*     */       
/*     */ 
/* 158 */       MainMemory.setI32(paramInt1 + 272, MainMemory.getI32(paramInt2 + 272));
/* 159 */       MainMemory.setI32(paramInt1 + 276, MainMemory.getI32(paramInt2 + 276));
/* 160 */       MainMemory.setI32(paramInt1 + 280, MainMemory.getI32(paramInt2 + 280));
/* 161 */       MainMemory.setI8(paramInt1 + 284, MainMemory.getI8(paramInt2 + 284));
/* 162 */       MainMemory.setI8(paramInt1 + 208, MainMemory.getI8(paramInt2 + 208));
/* 163 */       MainMemory.setI8(paramInt1 + 328, MainMemory.getI8(paramInt2 + 328));
/* 164 */       MainMemory.setF32(paramInt1 + 332, MainMemory.getF32(paramInt2 + 332));
/* 165 */       MainMemory.setF32(paramInt1 + 340, MainMemory.getF32(paramInt2 + 340));
/* 166 */       MainMemory.setI8(paramInt1 + 336, MainMemory.getI8(paramInt2 + 336));
/* 167 */       MainMemory.setI8(paramInt1 + 344, MainMemory.getI8(paramInt2 + 344));
/* 168 */       MainMemory.setF32(paramInt1 + 348, MainMemory.getF32(paramInt2 + 348));
/* 169 */       MainMemory.setI32(paramInt1 + 352, MainMemory.getI32(paramInt2 + 352));
/* 170 */       MainMemory.setI8(paramInt1 + 356, MainMemory.getI8(paramInt2 + 356));
/* 171 */       _ZN7duchamp7SectionaSERKS0_.call(paramInt1 + 360, paramInt2 + 360);
/* 172 */       MainMemory.setI8(paramInt1 + 408, MainMemory.getI8(paramInt2 + 408));
/* 173 */       MainMemory.setF32(paramInt1 + 412, MainMemory.getF32(paramInt2 + 412));
/* 174 */       MainMemory.setF32(paramInt1 + 416, MainMemory.getF32(paramInt2 + 416));
/* 175 */       MainMemory.setI8(paramInt1 + 420, MainMemory.getI8(paramInt2 + 420));
/* 176 */       MainMemory.setI8(paramInt1 + 421, MainMemory.getI8(paramInt2 + 421));
/* 177 */       _ZNSsaSERKSs.call(paramInt1 + 424, paramInt2 + 424);
/* 178 */       MainMemory.setI32(paramInt1 + 428, MainMemory.getI32(paramInt2 + 428));
/* 179 */       MainMemory.setF32(paramInt1 + 432, MainMemory.getF32(paramInt2 + 432));
/* 180 */       MainMemory.setF32(paramInt1 + 436, MainMemory.getF32(paramInt2 + 436));
/* 181 */       MainMemory.setF32(paramInt1 + 440, MainMemory.getF32(paramInt2 + 440));
/* 182 */       MainMemory.setI8(paramInt1 + 444, MainMemory.getI8(paramInt2 + 444));
/* 183 */       MainMemory.setI32(paramInt1 + 448, MainMemory.getI32(paramInt2 + 448));
/* 184 */       MainMemory.setI32(paramInt1 + 452, MainMemory.getI32(paramInt2 + 452));
/* 185 */       MainMemory.setI32(paramInt1 + 456, MainMemory.getI32(paramInt2 + 456));
/* 186 */       MainMemory.setF32(paramInt1 + 460, MainMemory.getF32(paramInt2 + 460));
/* 187 */       MainMemory.setI32(paramInt1 + 508, MainMemory.getI32(paramInt2 + 508));
/* 188 */       _ZN7duchamp6FilteraSERKS0_.call(paramInt1 + 464, paramInt2 + 464);
/* 189 */       MainMemory.setI8(paramInt1 + 516, MainMemory.getI8(paramInt2 + 516));
/* 190 */       MainMemory.setF32(paramInt1 + 520, MainMemory.getF32(paramInt2 + 520));
/* 191 */       MainMemory.setF32(paramInt1 + 524, MainMemory.getF32(paramInt2 + 524));
/* 192 */       MainMemory.setI32(paramInt1 + 528, MainMemory.getI32(paramInt2 + 528));
/* 193 */       MainMemory.setI32(paramInt1 + 288, MainMemory.getI32(paramInt2 + 288));
/* 194 */       MainMemory.setI32(paramInt1 + 532, MainMemory.getI32(paramInt2 + 532));
/* 195 */       MainMemory.setI8(paramInt1 + 536, MainMemory.getI8(paramInt2 + 536));
/* 196 */       MainMemory.setI8(paramInt1 + 537, MainMemory.getI8(paramInt2 + 537));
/* 197 */       _ZNSsaSERKSs.call(paramInt1 + 540, paramInt2 + 540);
/* 198 */       _ZNSsaSERKSs.call(paramInt1 + 544, paramInt2 + 544);
/* 199 */       _ZNSsaSERKSs.call(paramInt1 + 548, paramInt2 + 548);
/* 200 */       _ZNSsaSERKSs.call(paramInt1 + 552, paramInt2 + 552);
/* 201 */       MainMemory.setI8(paramInt1 + 556, MainMemory.getI8(paramInt2 + 556));
/* 202 */       MainMemory.setI8(paramInt1 + 557, MainMemory.getI8(paramInt2 + 557));
/* 203 */       MainMemory.setI8(paramInt1 + 558, MainMemory.getI8(paramInt2 + 558));
/*     */       
/*     */ 
/*     */       label1701:
/*     */       
/*     */ 
/* 209 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5ParamaSERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */