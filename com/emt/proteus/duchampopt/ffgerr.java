/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class ffgerr extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3212;
/*   11 */   public static final Function _instance = new ffgerr();
/*   12 */   public final Function resolve() { return _instance; }
/*      */   
/*   14 */   public ffgerr() { super("ffgerr", 2, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2)
/*      */   {
/*   18 */     call(paramInt1, paramInt2);
/*   19 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   25 */     paramInt4 += 2;
/*   26 */     paramInt3--;
/*   27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     call(i, j);
/*   31 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2)
/*      */   {
/*      */     try
/*      */     {
/*   42 */       com.emt.proteus.runtime.api.MainMemory.setI8(paramInt2, (byte)0);
/*   43 */       if (!com.emt.proteus.lib.api.MathUtils.ult(paramInt1, 300)) {
/*      */         break label3233;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   53 */       switch (paramInt1) {
/*      */       case 0: 
/*      */         break label3195;
/*      */         break;
/*      */       case 1: 
/*      */         break label3176;
/*      */         break;
/*      */       case 101: 
/*      */         break label3157;
/*      */         break;
/*      */       case 103: 
/*      */         break label3138;
/*      */         break;
/*      */       case 104:  break label3119;
/*      */         break; case 105:  break label3100;
/*      */         break; case 106:  break label3081;
/*      */         break; case 107:  break label3062;
/*      */         break; case 108:  break label3043;
/*      */         break; case 110:  break label3024;
/*      */         break; case 111:  break label3005;
/*      */         break; case 112:  break label2986;
/*      */         break; case 113:  break label2967;
/*      */         break; case 114:  break label2948;
/*      */         break; case 115:  break label2929;
/*      */         break; case 116:  break label2910;
/*      */         break; case 121:  break label2891;
/*      */         break; case 122:  break label2872;
/*      */         break; case 123:  break label2853;
/*      */         break; case 124:  break label2834;
/*      */         break; case 125:  break label2815;
/*      */         break; case 126:  break label2796;
/*      */         break; case 151:  break label2777;
/*      */         break; case 152:  break label2758;
/*      */         break; case 153:  break label2739;
/*      */         break; case 154:  break label2720;
/*      */         break; case 155:  break label2701;
/*      */         break; case 156:  break label2682;
/*      */         break; case 157:  break label2663;
/*      */         break; case 158:  break label2644;
/*      */         break; case 159:  break label2625;
/*      */         break; case 201:  break label2606;
/*      */         break; case 202:  break label2587;
/*      */         break; case 203:  break label2568;
/*      */         break; case 204:  break label2549;
/*      */         break; case 205:  break label2530;
/*      */         break; case 206:  break label2511;
/*      */         break; case 207:  break label2492;
/*      */         break; case 208:  break label2473;
/*      */         break; case 209:  break label2454;
/*      */         break; case 210:  break label2435;
/*      */         break; case 211:  break label2416;
/*      */         break; case 212:  break label2397;
/*      */         break; case 213:  break label2378;
/*      */         break; case 214:  break label2359;
/*      */         break; case 215:  break label2340;
/*      */         break; case 216:  break label2321;
/*      */         break; case 217:  break label2302;
/*      */         break; case 218:  break label2283;
/*      */         break; case 219:  break label2264;
/*      */         break; case 220:  break label2245;
/*      */         break; case 221:  break label2226;
/*      */         break; case 222:  break label2207;
/*      */         break; case 223:  break label2188;
/*      */         break; case 224:  break label2169;
/*      */         break; case 225:  break label2150;
/*      */         break; case 226:  break label2131;
/*      */         break; case 227:  break label2112;
/*      */         break; case 228:  break label2093;
/*      */         break; case 229:  break label2074;
/*      */         break; case 230:  break label2055;
/*      */         break; case 231:  break label2036;
/*      */         break; case 232:  break label2017;
/*      */         break; case 233:  break label1998;
/*      */         break; case 234:  break label1979;
/*      */         break; case 235:  break label1960;
/*      */         break; case 236:  break label1941;
/*      */         break; case 237:  break label1922;
/*      */         break; case 241:  break label1903;
/*      */         break; case 251:  break label1884;
/*      */         break; case 252:  break label1865;
/*      */         break; case 253:  break label1846;
/*      */         break; case 254:  break label1827;
/*      */         break; case 255:  break label1808;
/*      */         break; case 261:  break label1789;
/*      */         break; case 262:  break label1770;
/*      */         break; case 263:  break label1751;
/*      */         break; case 264:  break; }
/*  140 */       SystemLibrary.memcpy(paramInt2, 75552, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1751:
/*      */       
/*  147 */       SystemLibrary.memcpy(paramInt2, 72320, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1770:
/*      */       
/*  154 */       SystemLibrary.memcpy(paramInt2, 72288, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1789:
/*      */       
/*  161 */       SystemLibrary.memcpy(paramInt2, 69952, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1808:
/*      */       
/*  168 */       SystemLibrary.memcpy(paramInt2, 66144, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1827:
/*      */       
/*  175 */       SystemLibrary.memcpy(paramInt2, 71200, 27, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1846:
/*      */       
/*  182 */       SystemLibrary.memcpy(paramInt2, 68832, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1865:
/*      */       
/*  189 */       SystemLibrary.memcpy(paramInt2, 76928, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1884:
/*      */       
/*  196 */       SystemLibrary.memcpy(paramInt2, 72256, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1903:
/*      */       
/*  203 */       SystemLibrary.memcpy(paramInt2, 73952, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1922:
/*      */       
/*  210 */       SystemLibrary.memcpy(paramInt2, 76896, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1941:
/*      */       
/*  217 */       SystemLibrary.memcpy(paramInt2, 75520, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1960:
/*      */       
/*  224 */       SystemLibrary.memcpy(paramInt2, 71168, 27, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1979:
/*      */       
/*  231 */       SystemLibrary.memcpy(paramInt2, 73920, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label1998:
/*      */       
/*  238 */       SystemLibrary.memcpy(paramInt2, 72224, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2017:
/*      */       
/*  245 */       SystemLibrary.memcpy(paramInt2, 66112, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2036:
/*      */       
/*  252 */       SystemLibrary.memcpy(paramInt2, 66080, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2055:
/*      */       
/*  259 */       SystemLibrary.memcpy(paramInt2, 69920, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2074:
/*      */       
/*  266 */       SystemLibrary.memcpy(paramInt2, 68800, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2093:
/*      */       
/*  273 */       SystemLibrary.memcpy(paramInt2, 68768, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2112:
/*      */       
/*  280 */       SystemLibrary.memcpy(paramInt2, 67392, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2131:
/*      */       
/*  287 */       SystemLibrary.memcpy(paramInt2, 67360, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2150:
/*      */       
/*  294 */       SystemLibrary.memcpy(paramInt2, 71136, 27, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2169:
/*      */       
/*  301 */       SystemLibrary.memcpy(paramInt2, 67328, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2188:
/*      */       
/*  308 */       SystemLibrary.memcpy(paramInt2, 67296, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2207:
/*      */       
/*  315 */       SystemLibrary.memcpy(paramInt2, 69888, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2226:
/*      */       
/*  322 */       SystemLibrary.memcpy(paramInt2, 68736, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2245:
/*      */       
/*  329 */       SystemLibrary.memcpy(paramInt2, 73888, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2264:
/*      */       
/*  336 */       SystemLibrary.memcpy(paramInt2, 66048, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2283:
/*      */       
/*  343 */       SystemLibrary.memcpy(paramInt2, 67264, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2302:
/*      */       
/*  350 */       SystemLibrary.memcpy(paramInt2, 67232, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2321:
/*      */       
/*  357 */       SystemLibrary.memcpy(paramInt2, 75456, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2340:
/*      */       
/*  364 */       SystemLibrary.memcpy(paramInt2, 73856, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2359:
/*      */       
/*  371 */       SystemLibrary.memcpy(paramInt2, 73824, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2378:
/*      */       
/*  378 */       SystemLibrary.memcpy(paramInt2, 73792, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2397:
/*      */       
/*  385 */       SystemLibrary.memcpy(paramInt2, 72192, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2416:
/*      */       
/*  392 */       SystemLibrary.memcpy(paramInt2, 73760, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2435:
/*      */       
/*  399 */       SystemLibrary.memcpy(paramInt2, 64864, 22, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2454:
/*      */       
/*  406 */       SystemLibrary.memcpy(paramInt2, 76832, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2473:
/*      */       
/*  413 */       SystemLibrary.memcpy(paramInt2, 76800, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2492:
/*      */       
/*  420 */       SystemLibrary.memcpy(paramInt2, 73728, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2511:
/*      */       
/*  427 */       SystemLibrary.memcpy(paramInt2, 75424, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2530:
/*      */       
/*  434 */       SystemLibrary.memcpy(paramInt2, 73696, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2549:
/*      */       
/*  441 */       SystemLibrary.memcpy(paramInt2, 71104, 27, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2568:
/*      */       
/*  448 */       SystemLibrary.memcpy(paramInt2, 73664, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2587:
/*      */       
/*  455 */       SystemLibrary.memcpy(paramInt2, 72160, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2606:
/*      */       
/*  462 */       SystemLibrary.memcpy(paramInt2, 72128, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2625:
/*      */       
/*  469 */       SystemLibrary.memcpy(paramInt2, 73632, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2644:
/*      */       
/*  476 */       SystemLibrary.memcpy(paramInt2, 73600, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2663:
/*      */       
/*  483 */       SystemLibrary.memcpy(paramInt2, 72096, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2682:
/*      */       
/*  490 */       SystemLibrary.memcpy(paramInt2, 72064, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2701:
/*      */       
/*  497 */       SystemLibrary.memcpy(paramInt2, 75392, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2720:
/*      */       
/*  504 */       SystemLibrary.memcpy(paramInt2, 76768, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2739:
/*      */       
/*  511 */       SystemLibrary.memcpy(paramInt2, 75360, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2758:
/*      */       
/*  518 */       SystemLibrary.memcpy(paramInt2, 76736, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2777:
/*      */       
/*  525 */       SystemLibrary.memcpy(paramInt2, 76704, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2796:
/*      */       
/*  532 */       SystemLibrary.memcpy(paramInt2, 69856, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2815:
/*      */       
/*  539 */       SystemLibrary.memcpy(paramInt2, 75328, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2834:
/*      */       
/*  546 */       SystemLibrary.memcpy(paramInt2, 76672, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2853:
/*      */       
/*  553 */       SystemLibrary.memcpy(paramInt2, 66016, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2872:
/*      */       
/*  560 */       SystemLibrary.memcpy(paramInt2, 63712, 21, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2891:
/*      */       
/*  567 */       SystemLibrary.memcpy(paramInt2, 60800, 19, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2910:
/*      */       
/*  574 */       SystemLibrary.memcpy(paramInt2, 72032, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2929:
/*      */       
/*  581 */       SystemLibrary.memcpy(paramInt2, 60768, 19, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2948:
/*      */       
/*  588 */       SystemLibrary.memcpy(paramInt2, 68704, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2967:
/*      */       
/*  595 */       SystemLibrary.memcpy(paramInt2, 69824, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label2986:
/*      */       
/*  602 */       SystemLibrary.memcpy(paramInt2, 75296, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3005:
/*      */       
/*  609 */       SystemLibrary.memcpy(paramInt2, 68672, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3024:
/*      */       
/*  616 */       SystemLibrary.memcpy(paramInt2, 68640, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3043:
/*      */       
/*  623 */       SystemLibrary.memcpy(paramInt2, 73568, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3062:
/*      */       
/*  630 */       SystemLibrary.memcpy(paramInt2, 76640, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3081:
/*      */       
/*  637 */       SystemLibrary.memcpy(paramInt2, 71072, 27, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3100:
/*      */       
/*  644 */       SystemLibrary.memcpy(paramInt2, 76608, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3119:
/*      */       
/*  651 */       SystemLibrary.memcpy(paramInt2, 75264, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3138:
/*      */       
/*  658 */       SystemLibrary.memcpy(paramInt2, 76576, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3157:
/*      */       
/*  665 */       SystemLibrary.memcpy(paramInt2, 72000, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3176:
/*      */       
/*  672 */       SystemLibrary.memcpy(paramInt2, 69792, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3195:
/*      */       
/*  679 */       SystemLibrary.memcpy(paramInt2, 53600, 14, 1);
/*      */       
/*      */ 
/*      */ 
/*      */       break label5814;
/*      */       
/*      */ 
/*  686 */       SystemLibrary.memcpy(paramInt2, 63744, 21, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label3233:
/*      */       
/*  693 */       if (paramInt1 >= 600) {
/*      */         break label5800;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  703 */       switch (paramInt1) {
/*      */       case 301: 
/*      */         break label5761;
/*      */         break;
/*      */       case 302: 
/*      */         break label5741;
/*      */         break;
/*      */       case 304: 
/*      */         break label5721;
/*      */         break;
/*      */       case 306: 
/*      */         break label5701;
/*      */         break;
/*      */       case 307:  break label5681;
/*      */         break; case 308:  break label5661;
/*      */         break; case 309:  break label5641;
/*      */         break; case 310:  break label5621;
/*      */         break; case 311:  break label5601;
/*      */         break; case 312:  break label5581;
/*      */         break; case 314:  break label5561;
/*      */         break; case 317:  break label5541;
/*      */         break; case 320:  break label5521;
/*      */         break; case 321:  break label5501;
/*      */         break; case 322:  break label5481;
/*      */         break; case 323:  break label5461;
/*      */         break; case 340:  break label5441;
/*      */         break; case 341:  break label5421;
/*      */         break; case 342:  break label5401;
/*      */         break; case 343:  break label5381;
/*      */         break; case 344:  break label5361;
/*      */         break; case 345:  break label5341;
/*      */         break; case 346:  break label5321;
/*      */         break; case 347:  break label5301;
/*      */         break; case 348:  break label5281;
/*      */         break; case 360:  break label5261;
/*      */         break; case 361:  break label5241;
/*      */         break; case 362:  break label5221;
/*      */         break; case 363:  break label5201;
/*      */         break; case 364:  break label5181;
/*      */         break; case 365:  break label5161;
/*      */         break; case 366:  break label5141;
/*      */         break; case 367:  break label5121;
/*      */         break; case 368:  break label5101;
/*      */         break; case 369:  break label5081;
/*      */         break; case 401:  break label5061;
/*      */         break; case 402:  break label5041;
/*      */         break; case 403:  break label5021;
/*      */         break; case 404:  break label5001;
/*      */         break; case 405:  break label4981;
/*      */         break; case 406:  break label4961;
/*      */         break; case 407:  break label4941;
/*      */         break; case 408:  break label4922;
/*      */         break; case 409:  break label4903;
/*      */         break; case 410:  break label4884;
/*      */         break; case 411:  break label4865;
/*      */         break; case 412:  break label4846;
/*      */         break; case 413:  break label4827;
/*      */         break; case 414:  break label4808;
/*      */         break; case 420:  break label4789;
/*      */         break; case 431:  break label4770;
/*      */         break; case 432:  break label4751;
/*      */         break; case 433:  break label4732;
/*      */         break; case 434:  break label4713;
/*      */         break; case 435:  break label4694;
/*      */         break; case 436:  break label4675;
/*      */         break; case 501:  break label4656;
/*      */         break; case 502:  break label4637;
/*      */         break; case 503:  break label4618;
/*      */         break; case 504:  break label4599;
/*      */         break; case 505:  break; }
/*  773 */       SystemLibrary.memcpy(paramInt2, 66272, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4599:
/*      */       
/*  780 */       SystemLibrary.memcpy(paramInt2, 67616, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4618:
/*      */       
/*  787 */       SystemLibrary.memcpy(paramInt2, 69024, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4637:
/*      */       
/*  794 */       SystemLibrary.memcpy(paramInt2, 60896, 19, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4656:
/*      */       
/*  801 */       SystemLibrary.memcpy(paramInt2, 62432, 20, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4675:
/*      */       
/*  808 */       SystemLibrary.memcpy(paramInt2, 77088, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4694:
/*      */       
/*  815 */       SystemLibrary.memcpy(paramInt2, 70272, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4713:
/*      */       
/*  822 */       SystemLibrary.memcpy(paramInt2, 65024, 22, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4732:
/*      */       
/*  829 */       SystemLibrary.memcpy(paramInt2, 67584, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4751:
/*      */       
/*  836 */       SystemLibrary.memcpy(paramInt2, 74176, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4770:
/*      */       
/*  843 */       SystemLibrary.memcpy(paramInt2, 71232, 27, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4789:
/*      */       
/*  850 */       SystemLibrary.memcpy(paramInt2, 72512, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4808:
/*      */       
/*  857 */       SystemLibrary.memcpy(paramInt2, 70240, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4827:
/*      */       
/*  864 */       SystemLibrary.memcpy(paramInt2, 67552, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4846:
/*      */       
/*  871 */       SystemLibrary.memcpy(paramInt2, 74144, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4865:
/*      */       
/*  878 */       SystemLibrary.memcpy(paramInt2, 67520, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4884:
/*      */       
/*  885 */       SystemLibrary.memcpy(paramInt2, 72480, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4903:
/*      */       
/*  892 */       SystemLibrary.memcpy(paramInt2, 74112, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4922:
/*      */       
/*  899 */       SystemLibrary.memcpy(paramInt2, 77056, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4941:
/*      */       
/*  906 */       SystemLibrary.memcpy(paramInt2, 74080, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4961:
/*      */       
/*  913 */       SystemLibrary.memcpy(paramInt2, 68992, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label4981:
/*      */       
/*  920 */       SystemLibrary.memcpy(paramInt2, 75584, 30, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5001:
/*      */       
/*  927 */       SystemLibrary.memcpy(paramInt2, 70208, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5021:
/*      */       
/*  934 */       SystemLibrary.memcpy(paramInt2, 70176, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5041:
/*      */       
/*  941 */       SystemLibrary.memcpy(paramInt2, 77024, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5061:
/*      */       
/*  948 */       SystemLibrary.memcpy(paramInt2, 74048, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5081:
/*      */       
/*  955 */       SystemLibrary.memcpy(paramInt2, 70144, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5101:
/*      */       
/*  962 */       SystemLibrary.memcpy(paramInt2, 64992, 22, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5121:
/*      */       
/*  969 */       SystemLibrary.memcpy(paramInt2, 58272, 17, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5141:
/*      */       
/*  976 */       SystemLibrary.memcpy(paramInt2, 70112, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5161:
/*      */       
/*  983 */       SystemLibrary.memcpy(paramInt2, 68960, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5181:
/*      */       
/*  990 */       SystemLibrary.memcpy(paramInt2, 66240, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5201:
/*      */       
/*  997 */       SystemLibrary.memcpy(paramInt2, 62400, 20, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5221:
/*      */       
/* 1004 */       SystemLibrary.memcpy(paramInt2, 70080, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5241:
/*      */       
/* 1011 */       SystemLibrary.memcpy(paramInt2, 70048, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5261:
/*      */       
/* 1018 */       SystemLibrary.memcpy(paramInt2, 67488, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5281:
/*      */       
/* 1025 */       SystemLibrary.memcpy(paramInt2, 72448, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5301:
/*      */       
/* 1032 */       SystemLibrary.memcpy(paramInt2, 62368, 20, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5321:
/*      */       
/* 1039 */       SystemLibrary.memcpy(paramInt2, 60864, 19, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5341:
/*      */       
/* 1046 */       SystemLibrary.memcpy(paramInt2, 64960, 22, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5361:
/*      */       
/* 1053 */       SystemLibrary.memcpy(paramInt2, 52512, 13, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5381:
/*      */       
/* 1060 */       SystemLibrary.memcpy(paramInt2, 56544, 16, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5401:
/*      */       
/* 1067 */       SystemLibrary.memcpy(paramInt2, 66208, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5421:
/*      */       
/* 1074 */       SystemLibrary.memcpy(paramInt2, 72416, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5441:
/*      */       
/* 1081 */       SystemLibrary.memcpy(paramInt2, 56512, 16, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5461:
/*      */       
/* 1088 */       SystemLibrary.memcpy(paramInt2, 67456, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5481:
/*      */       
/* 1095 */       SystemLibrary.memcpy(paramInt2, 64928, 22, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5501:
/*      */       
/* 1102 */       SystemLibrary.memcpy(paramInt2, 76992, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5521:
/*      */       
/* 1109 */       SystemLibrary.memcpy(paramInt2, 74016, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5541:
/*      */       
/* 1116 */       SystemLibrary.memcpy(paramInt2, 73984, 29, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5561:
/*      */       
/* 1123 */       SystemLibrary.memcpy(paramInt2, 66176, 23, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5581:
/*      */       
/* 1130 */       SystemLibrary.memcpy(paramInt2, 69984, 26, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5601:
/*      */       
/* 1137 */       SystemLibrary.memcpy(paramInt2, 68928, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5621:
/*      */       
/* 1144 */       SystemLibrary.memcpy(paramInt2, 68896, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5641:
/*      */       
/* 1151 */       SystemLibrary.memcpy(paramInt2, 67424, 24, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5661:
/*      */       
/* 1158 */       SystemLibrary.memcpy(paramInt2, 68864, 25, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5681:
/*      */       
/* 1165 */       SystemLibrary.memcpy(paramInt2, 63776, 21, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5701:
/*      */       
/* 1172 */       SystemLibrary.memcpy(paramInt2, 72352, 28, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5721:
/*      */       
/* 1179 */       SystemLibrary.memcpy(paramInt2, 64896, 22, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5741:
/*      */       
/* 1186 */       SystemLibrary.memcpy(paramInt2, 76960, 31, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5761:
/*      */       
/* 1193 */       SystemLibrary.memcpy(paramInt2, 60832, 19, 1);
/*      */       
/*      */ 
/*      */ 
/*      */       break label5814;
/*      */       
/*      */ 
/* 1200 */       SystemLibrary.memcpy(paramInt2, 63744, 21, 1);
/*      */       
/*      */ 
/*      */       break label5814;
/*      */       
/*      */       label5800:
/*      */       
/* 1207 */       SystemLibrary.memcpy(paramInt2, 63744, 21, 1);
/*      */       
/*      */ 
/*      */       label5814:
/*      */       
/*      */ 
/* 1213 */       return;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgerr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */