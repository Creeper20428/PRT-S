/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSs6appendEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSs6appendERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _GLOBAL__I__ZN7duchamp4BeamC2Ev extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2262;
/*  20 */   public static final Function _instance = new _GLOBAL__I__ZN7duchamp4BeamC2Ev();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public _GLOBAL__I__ZN7duchamp4BeamC2Ev() { super("_GLOBAL__I__ZN7duchamp4BeamC2Ev", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  27 */     call();
/*  28 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     call();
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call()
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*  53 */     int i9 = 0;
/*  54 */     int i10 = 0;
/*  55 */     int i11 = 0;
/*  56 */     int i12 = 0;
/*  57 */     int i13 = 0;
/*  58 */     int i14 = 0;
/*  59 */     int i15 = 0;
/*  60 */     int i16 = 0;
/*  61 */     int i17 = 0;
/*  62 */     int i18 = 0;
/*  63 */     int i19 = 0;
/*  64 */     int i20 = 0;
/*  65 */     int i21 = 0;
/*  66 */     int i22 = 0;
/*  67 */     int i23 = 0;
/*  68 */     int i24 = 0;
/*  69 */     int i25 = 0;
/*  70 */     int i26 = 0;
/*  71 */     int i27 = 0;
/*  72 */     int i28 = 0;
/*  73 */     int i29 = 0;
/*  74 */     int i30 = 0;
/*  75 */     int i31 = 0;
/*  76 */     int i32 = 0;
/*  77 */     int i33 = 0;
/*  78 */     int i34 = 0;
/*  79 */     int i35 = 0;
/*  80 */     int i36 = 0;
/*  81 */     int i37 = 0;
/*  82 */     int i38 = 0;
/*  83 */     int i39 = 0;
/*  84 */     int i40 = 0;
/*  85 */     int i41 = 0;
/*     */     
/*     */ 
/*  88 */     int i42 = MainMemory.alloc_base_line();
/*     */     try
/*     */     {
/*  91 */       i = MainMemory.alloc(4);
/*  92 */       j = MainMemory.alloc(4);
/*  93 */       k = MainMemory.alloc(4);
/*  94 */       m = MainMemory.alloc(4);
/*  95 */       n = MainMemory.alloc(4);
/*  96 */       i1 = MainMemory.alloc(4);
/*  97 */       i2 = MainMemory.alloc(1);
/*  98 */       i3 = MainMemory.alloc(1);
/*  99 */       i4 = MainMemory.alloc(4);
/* 100 */       i5 = MainMemory.alloc(4);
/* 101 */       i6 = MainMemory.alloc(4);
/* 102 */       i7 = MainMemory.alloc(1);
/* 103 */       i8 = MainMemory.alloc(4);
/* 104 */       i9 = MainMemory.alloc(4);
/* 105 */       i10 = MainMemory.alloc(4);
/* 106 */       i11 = MainMemory.alloc(1);
/* 107 */       i12 = MainMemory.alloc(1);
/* 108 */       i13 = MainMemory.alloc(1);
/* 109 */       i14 = MainMemory.alloc(1);
/* 110 */       i15 = MainMemory.alloc(1);
/* 111 */       i16 = MainMemory.alloc(1);
/* 112 */       i17 = MainMemory.alloc(1);
/* 113 */       i18 = MainMemory.alloc(1);
/* 114 */       i19 = MainMemory.alloc(1);
/* 115 */       i20 = MainMemory.alloc(1);
/* 116 */       i21 = MainMemory.alloc(1);
/* 117 */       i22 = MainMemory.alloc(1);
/* 118 */       i23 = MainMemory.alloc(1);
/* 119 */       i24 = MainMemory.alloc(1);
/* 120 */       i25 = MainMemory.alloc(1);
/* 121 */       i26 = MainMemory.alloc(1);
/* 122 */       i27 = MainMemory.alloc(1);
/* 123 */       i28 = MainMemory.alloc(1);
/* 124 */       i29 = MainMemory.alloc(1);
/* 125 */       i30 = MainMemory.alloc(1);
/* 126 */       i31 = MainMemory.alloc(1);
/* 127 */       i32 = MainMemory.alloc(1);
/* 128 */       i33 = MainMemory.alloc(1);
/* 129 */       i34 = MainMemory.alloc(1);
/* 130 */       i35 = MainMemory.alloc(1);
/* 131 */       i36 = MainMemory.alloc(1);
/* 132 */       i37 = MainMemory.alloc(1);
/* 133 */       i38 = MainMemory.alloc(1);
/* 134 */       i39 = MainMemory.alloc(1);
/* 135 */       i40 = MainMemory.alloc(1);
/* 136 */       i41 = MainMemory.alloc(1);
/* 137 */       com.emt.proteus.runtime.library.streams._ZNSt8ios_base4InitC1Ev.call(459232);
/* 138 */       SystemLibrary.__cxa_atexit(2312, 0, -1);
/* 139 */       _ZNSaIcEC1Ev.call(i41);
/* 140 */       _ZNSsC1EPKcRKSaIcE.call(459688, 150912, i41);
/* 141 */       _ZNSaIcED1Ev.call(i41);
/* 142 */       SystemLibrary.__cxa_atexit(2268, 0, -1);
/* 143 */       _ZNSaIcEC1Ev.call(i40);
/* 144 */       _ZNSsC1EPKcRKSaIcE.call(463736, 150432, i40);
/* 145 */       _ZNSaIcED1Ev.call(i40);
/* 146 */       SystemLibrary.__cxa_atexit(2269, 0, -1);
/* 147 */       _ZNSaIcEC1Ev.call(i39);
/* 148 */       _ZNSsC1EPKcRKSaIcE.call(463560, 83808, i39);
/* 149 */       _ZNSaIcED1Ev.call(i39);
/* 150 */       SystemLibrary.__cxa_atexit(2270, 0, -1);
/* 151 */       _ZNSaIcEC1Ev.call(i38);
/* 152 */       _ZNSsC1EPKcRKSaIcE.call(467080, 37216, i38);
/* 153 */       _ZNSaIcED1Ev.call(i38);
/* 154 */       SystemLibrary.__cxa_atexit(2271, 0, -1);
/* 155 */       _ZNSaIcEC1Ev.call(i37);
/* 156 */       _ZNSsC1EPKcRKSaIcE.call(466904, 28672, i37);
/* 157 */       _ZNSaIcED1Ev.call(i37);
/* 158 */       SystemLibrary.__cxa_atexit(2272, 0, -1);
/* 159 */       _ZNSaIcEC1Ev.call(i36);
/* 160 */       _ZNSsC1EPKcRKSaIcE.call(467728, 47168, i36);
/* 161 */       _ZNSaIcED1Ev.call(i36);
/* 162 */       _ZNSaIcEC1Ev.call(i35);
/* 163 */       _ZNSsC1EPKcRKSaIcE.call(467732, 43232, i35);
/* 164 */       _ZNSaIcED1Ev.call(i35);
/* 165 */       _ZNSaIcEC1Ev.call(i34);
/* 166 */       _ZNSsC1EPKcRKSaIcE.call(467736, 49216, i34);
/* 167 */       _ZNSaIcED1Ev.call(i34);
/* 168 */       SystemLibrary.__cxa_atexit(2273, 0, -1);
/* 169 */       _ZNSaIcEC1Ev.call(i33);
/* 170 */       _ZNSsC1EPKcRKSaIcE.call(461624, 43392, i33);
/* 171 */       _ZNSaIcED1Ev.call(i33);
/* 172 */       SystemLibrary.__cxa_atexit(2274, 0, -1);
/* 173 */       _ZNSaIcEC1Ev.call(i32);
/* 174 */       _ZNSsC1EPKcRKSaIcE.call(461796, 43424, i32);
/* 175 */       _ZNSaIcED1Ev.call(i32);
/* 176 */       SystemLibrary.__cxa_atexit(2275, 0, -1);
/* 177 */       _ZNSaIcEC1Ev.call(i31);
/* 178 */       _ZNSsC1EPKcRKSaIcE.call(461444, 42240, i31);
/* 179 */       _ZNSaIcED1Ev.call(i31);
/* 180 */       SystemLibrary.__cxa_atexit(2276, 0, -1);
/* 181 */       _ZNSaIcEC1Ev.call(i30);
/* 182 */       _ZNSsC1EPKcRKSaIcE.call(463032, 42272, i30);
/* 183 */       _ZNSaIcED1Ev.call(i30);
/* 184 */       SystemLibrary.__cxa_atexit(2277, 0, -1);
/* 185 */       _ZNSaIcEC1Ev.call(i29);
/* 186 */       _ZNSsC1EPKcRKSaIcE.call(462856, 42336, i29);
/* 187 */       _ZNSaIcED1Ev.call(i29);
/* 188 */       SystemLibrary.__cxa_atexit(2278, 0, -1);
/* 189 */       _ZNSaIcEC1Ev.call(i28);
/* 190 */       _ZNSsC1EPKcRKSaIcE.call(463208, 42400, i28);
/* 191 */       _ZNSaIcED1Ev.call(i28);
/* 192 */       SystemLibrary.__cxa_atexit(2279, 0, -1);
/* 193 */       _ZNSaIcEC1Ev.call(i27);
/* 194 */       _ZNSsC1EPKcRKSaIcE.call(460568, 36768, i27);
/* 195 */       _ZNSaIcED1Ev.call(i27);
/* 196 */       SystemLibrary.__cxa_atexit(2280, 0, -1);
/* 197 */       _ZNSaIcEC1Ev.call(i26);
/* 198 */       _ZNSsC1EPKcRKSaIcE.call(460744, 36832, i26);
/* 199 */       _ZNSaIcED1Ev.call(i26);
/* 200 */       SystemLibrary.__cxa_atexit(2281, 0, -1);
/* 201 */       _ZNSaIcEC1Ev.call(i25);
/* 202 */       _ZNSsC1EPKcRKSaIcE.call(460040, 28416, i25);
/* 203 */       _ZNSaIcED1Ev.call(i25);
/* 204 */       SystemLibrary.__cxa_atexit(2282, 0, -1);
/* 205 */       _ZNSaIcEC1Ev.call(i24);
/* 206 */       _ZNSsC1EPKcRKSaIcE.call(464792, 42624, i24);
/* 207 */       _ZNSaIcED1Ev.call(i24);
/* 208 */       SystemLibrary.__cxa_atexit(2283, 0, -1);
/* 209 */       _ZNSaIcEC1Ev.call(i23);
/* 210 */       _ZNSsC1EPKcRKSaIcE.call(463384, 42656, i23);
/* 211 */       _ZNSaIcED1Ev.call(i23);
/* 212 */       SystemLibrary.__cxa_atexit(2284, 0, -1);
/* 213 */       _ZNSaIcEC1Ev.call(i22);
/* 214 */       _ZNSsC1EPKcRKSaIcE.call(461096, 70912, i22);
/* 215 */       _ZNSaIcED1Ev.call(i22);
/* 216 */       SystemLibrary.__cxa_atexit(2285, 0, -1);
/* 217 */       _ZNSaIcEC1Ev.call(i21);
/* 218 */       _ZNSsC1EPKcRKSaIcE.call(461272, 71008, i21);
/* 219 */       _ZNSaIcED1Ev.call(i21);
/* 220 */       SystemLibrary.__cxa_atexit(2286, 0, -1);
/* 221 */       _ZNSaIcEC1Ev.call(i20);
/* 222 */       _ZNSsC1EPKcRKSaIcE.call(460920, 71040, i20);
/* 223 */       _ZNSaIcED1Ev.call(i20);
/* 224 */       SystemLibrary.__cxa_atexit(2287, 0, -1);
/* 225 */       _ZNSaIcEC1Ev.call(i19);
/* 226 */       _ZNSsC1EPKcRKSaIcE.call(462152, 73408, i19);
/* 227 */       _ZNSaIcED1Ev.call(i19);
/* 228 */       SystemLibrary.__cxa_atexit(2288, 0, -1);
/* 229 */       _ZNSaIcEC1Ev.call(i18);
/* 230 */       _ZNSsC1EPKcRKSaIcE.call(461976, 91296, i18);
/* 231 */       _ZNSaIcED1Ev.call(i18);
/* 232 */       SystemLibrary.__cxa_atexit(2289, 0, -1);
/* 233 */       _ZNSaIcEC1Ev.call(i17);
/* 234 */       _ZNSsC1EPKcRKSaIcE.call(462328, 65920, i17);
/* 235 */       _ZNSaIcED1Ev.call(i17);
/* 236 */       SystemLibrary.__cxa_atexit(2290, 0, -1);
/* 237 */       _ZNSaIcEC1Ev.call(i16);
/* 238 */       _ZNSsC1EPKcRKSaIcE.call(460216, 69696, i16);
/* 239 */       _ZNSaIcED1Ev.call(i16);
/* 240 */       SystemLibrary.__cxa_atexit(2291, 0, -1);
/* 241 */       _ZNSaIcEC1Ev.call(i15);
/* 242 */       _ZNSsC1EPKcRKSaIcE.call(460392, 69728, i15);
/* 243 */       _ZNSaIcED1Ev.call(i15);
/* 244 */       SystemLibrary.__cxa_atexit(2292, 0, -1);
/* 245 */       _ZNSaIcEC1Ev.call(i14);
/* 246 */       _ZNSsC1EPKcRKSaIcE.call(459864, 68384, i14);
/* 247 */       _ZNSaIcED1Ev.call(i14);
/* 248 */       SystemLibrary.__cxa_atexit(2293, 0, -1);
/* 249 */       _ZNSaIcEC1Ev.call(i13);
/* 250 */       _ZNSsC1EPKcRKSaIcE.call(463912, 76352, i13);
/* 251 */       _ZNSaIcED1Ev.call(i13);
/* 252 */       SystemLibrary.__cxa_atexit(2294, 0, -1);
/* 253 */       _ZNSaIcEC1Ev.call(i12);
/* 254 */       _ZNSsC1EPKcRKSaIcE.call(462504, 79072, i12);
/* 255 */       _ZNSaIcED1Ev.call(i12);
/* 256 */       SystemLibrary.__cxa_atexit(2295, 0, -1);
/* 257 */       _ZNSaIcEC1Ev.call(i11);
/* 258 */       _ZNSsC1EPKcRKSaIcE.call(464088, 100768, i11);
/* 259 */       _ZNSaIcED1Ev.call(i11);
/* 260 */       SystemLibrary.__cxa_atexit(2296, 0, -1);
/* 261 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i9, 60608, 467080);
/* 262 */       _ZNSsC1ERKSs.call(i10, i9);
/* 263 */       _ZNSs6appendEPKc.call(i10, 16160);
/* 264 */       _ZNSsC1ERKSs.call(464264, i10);
/* 265 */       _ZNSs6appendERKSs.call(464264, 466904);
/* 266 */       _ZNSsD1Ev.call(i10);
/* 267 */       _ZNSsD1Ev.call(i9);
/* 268 */       SystemLibrary.__cxa_atexit(2297, 0, -1);
/* 269 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i8, 78112, 467080);
/* 270 */       _ZNSsC1ERKSs.call(465672, i8);
/* 271 */       _ZNSs6appendEPKc.call(465672, 43136);
/* 272 */       _ZNSsD1Ev.call(i8);
/* 273 */       SystemLibrary.__cxa_atexit(2298, 0, -1);
/* 274 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(466376, 114848, 467080);
/* 275 */       SystemLibrary.__cxa_atexit(2299, 0, -1);
/* 276 */       _ZNSaIcEC1Ev.call(i7);
/* 277 */       _ZNSsC1EPKcRKSaIcE.call(464968, 133152, i7);
/* 278 */       _ZNSaIcED1Ev.call(i7);
/* 279 */       SystemLibrary.__cxa_atexit(2300, 0, -1);
/* 280 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i5, 52384, 467080);
/* 281 */       _ZNSsC1ERKSs.call(i6, i5);
/* 282 */       _ZNSs6appendEPKc.call(i6, 16160);
/* 283 */       _ZNSsC1ERKSs.call(464440, i6);
/* 284 */       _ZNSs6appendERKSs.call(464440, 466904);
/* 285 */       _ZNSsD1Ev.call(i6);
/* 286 */       _ZNSsD1Ev.call(i5);
/* 287 */       SystemLibrary.__cxa_atexit(2301, 0, -1);
/* 288 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i4, 78112, 467080);
/* 289 */       _ZNSsC1ERKSs.call(465848, i4);
/* 290 */       _ZNSs6appendEPKc.call(465848, 43136);
/* 291 */       _ZNSsD1Ev.call(i4);
/* 292 */       SystemLibrary.__cxa_atexit(2302, 0, -1);
/* 293 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(466552, 103456, 467080);
/* 294 */       SystemLibrary.__cxa_atexit(2303, 0, -1);
/* 295 */       _ZNSaIcEC1Ev.call(i3);
/* 296 */       _ZNSsC1EPKcRKSaIcE.call(464616, 68416, i3);
/* 297 */       _ZNSaIcED1Ev.call(i3);
/* 298 */       SystemLibrary.__cxa_atexit(2304, 0, -1);
/* 299 */       _ZNSaIcEC1Ev.call(i2);
/* 300 */       _ZNSsC1EPKcRKSaIcE.call(465320, 68448, i2);
/* 301 */       _ZNSaIcED1Ev.call(i2);
/* 302 */       SystemLibrary.__cxa_atexit(2305, 0, -1);
/* 303 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(n, 68480, 467080);
/* 304 */       _ZNSsC1ERKSs.call(i1, n);
/* 305 */       _ZNSs6appendEPKc.call(i1, 16160);
/* 306 */       _ZNSsC1ERKSs.call(462680, i1);
/* 307 */       _ZNSs6appendERKSs.call(462680, 466904);
/* 308 */       _ZNSsD1Ev.call(i1);
/* 309 */       _ZNSsD1Ev.call(n);
/* 310 */       SystemLibrary.__cxa_atexit(2306, 0, -1);
/* 311 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(m, 63584, 467080);
/* 312 */       _ZNSsC1ERKSs.call(465496, m);
/* 313 */       _ZNSs6appendEPKc.call(465496, 43136);
/* 314 */       _ZNSsD1Ev.call(m);
/* 315 */       SystemLibrary.__cxa_atexit(2307, 0, -1);
/* 316 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(466200, 103520, 467080);
/* 317 */       SystemLibrary.__cxa_atexit(2308, 0, -1);
/* 318 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(j, 78144, 467080);
/* 319 */       _ZNSsC1ERKSs.call(k, j);
/* 320 */       _ZNSs6appendEPKc.call(k, 16160);
/* 321 */       _ZNSsC1ERKSs.call(465140, k);
/* 322 */       _ZNSs6appendERKSs.call(465140, 466904);
/* 323 */       _ZNSsD1Ev.call(k);
/* 324 */       _ZNSsD1Ev.call(j);
/* 325 */       SystemLibrary.__cxa_atexit(2309, 0, -1);
/* 326 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i, 63584, 467080);
/* 327 */       _ZNSsC1ERKSs.call(466020, i);
/* 328 */       _ZNSs6appendEPKc.call(466020, 43136);
/* 329 */       _ZNSsD1Ev.call(i);
/* 330 */       SystemLibrary.__cxa_atexit(2310, 0, -1);
/* 331 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(466724, 103520, 467080);
/* 332 */       SystemLibrary.__cxa_atexit(2311, 0, -1);
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/* 340 */       MainMemory.dealloc_generated(i42);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_GLOBAL__I__ZN7duchamp4BeamC2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */