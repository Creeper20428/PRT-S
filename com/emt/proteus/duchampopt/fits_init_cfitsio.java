/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class fits_init_cfitsio extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2998;
/*   12 */   public static final Function _instance = new fits_init_cfitsio();
/*   13 */   public final Function resolve() { return _instance; }
/*      */   
/*   15 */   public fits_init_cfitsio() { super("fits_init_cfitsio", 0, false); }
/*      */   
/*      */   public int execute()
/*      */   {
/*   19 */     return call();
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   24 */     int i = call();
/*   25 */     paramFrame.setI32(paramInt1, i);
/*   26 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call()
/*      */   {
/*   31 */     int i = 0;
/*      */     
/*   33 */     int j = 0;
/*   34 */     int k = 0;
/*   35 */     int m = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   41 */       if (!MainMemory.getI1(459320)) {
/*      */         break label41;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   51 */       i = 0;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label41:
/*      */       
/*   58 */       j = MainMemory.getI32Aligned(467208);
/*   59 */       if (j >= 0) {
/*      */         break label86;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   69 */       ffxmsg.call(5, 132256);
/*   70 */       ffxmsg.call(5, 113952);
/*      */       
/*      */ 
/*      */       label86:
/*      */       
/*   75 */       if (j <= 23)
/*      */       {
/*      */ 
/*      */ 
/*   79 */         k = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*   86 */         ffxmsg.call(5, 119520);
/*   87 */         i = 122;
/*      */         
/*      */ 
/*      */         break label8708;
/*      */       }
/*      */       
/*      */       for (;;)
/*      */       {
/*   95 */         MainMemory.setI32(503808 + (k << 4), 0);
/*   96 */         k += 1;
/*   97 */         if (k == 300) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  108 */       SystemLibrary.strncpy(492288 + j * 84, 40448, 20);
/*  109 */       j = MainMemory.getI32Aligned(467208);
/*  110 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  111 */       MainMemory.setI32(492288 + j * 84 + 20, 3011);
/*  112 */       MainMemory.setI32(492288 + j * 84 + 24, 3015);
/*  113 */       MainMemory.setI32(492288 + j * 84 + 28, 3012);
/*  114 */       MainMemory.setI32(492288 + j * 84 + 32, 3013);
/*  115 */       MainMemory.setI32(492288 + j * 84 + 36, 3014);
/*  116 */       MainMemory.setI32(492288 + j * 84 + 40, 3039);
/*  117 */       MainMemory.setI32(492288 + j * 84 + 44, 3040);
/*  118 */       MainMemory.setI32(492288 + j * 84 + 48, 3027);
/*  119 */       MainMemory.setI32(492288 + j * 84 + 52, 3034);
/*  120 */       MainMemory.setI32(492288 + j * 84 + 56, 3024);
/*  121 */       MainMemory.setI32(492288 + j * 84 + 60, 3025);
/*  122 */       MainMemory.setI32(492288 + j * 84 + 64, 3032);
/*  123 */       MainMemory.setI32(492288 + j * 84 + 68, 3031);
/*  124 */       MainMemory.setI32(492288 + j * 84 + 72, 3028);
/*  125 */       MainMemory.setI32(492288 + j * 84 + 76, 3030);
/*  126 */       MainMemory.setI32(492288 + j * 84 + 80, 3029);
/*  127 */       j += 1;
/*  128 */       MainMemory.setI32Aligned(467208, j);
/*  129 */       if (j >= 0) {
/*      */         break label500;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  139 */       ffxmsg.call(5, 132256);
/*  140 */       ffxmsg.call(5, 113952);
/*      */       
/*      */ 
/*      */       label500:
/*      */       
/*  145 */       if (j <= 23)
/*      */       {
/*      */ 
/*      */ 
/*  149 */         k = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  156 */         ffxmsg.call(5, 117408);
/*  157 */         i = 122;
/*      */         
/*      */ 
/*      */         break label8708;
/*      */       }
/*      */       
/*      */       for (;;)
/*      */       {
/*  165 */         MainMemory.setI32(512000 + k * 44, 0);
/*  166 */         MainMemory.setI32(512000 + k * 44 + 4, 0);
/*  167 */         k += 1;
/*  168 */         if (k == 300) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  179 */       SystemLibrary.strncpy(492288 + j * 84, 33248, 20);
/*  180 */       j = MainMemory.getI32Aligned(467208);
/*  181 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  182 */       MainMemory.setI32(492288 + j * 84 + 20, 3042);
/*  183 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  184 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  185 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  186 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  187 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  188 */       MainMemory.setI32(492288 + j * 84 + 44, 0);
/*  189 */       MainMemory.setI32(492288 + j * 84 + 48, 3068);
/*  190 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  191 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/*  192 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  193 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  194 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  195 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  196 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  197 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  198 */       j += 1;
/*  199 */       MainMemory.setI32Aligned(467208, j);
/*  200 */       if (j >= 0) {
/*      */         break label920;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  210 */       ffxmsg.call(5, 132256);
/*  211 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label939;
/*      */       
/*      */       label920:
/*  216 */       if (j <= 23) {
/*      */         break label958;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label939:
/*      */       
/*      */ 
/*      */ 
/*  226 */       ffxmsg.call(5, 124512);
/*  227 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label958:
/*      */       
/*  234 */       SystemLibrary.strncpy(492288 + j * 84, 49600, 20);
/*  235 */       j = MainMemory.getI32Aligned(467208);
/*  236 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  237 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  238 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  239 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  240 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  241 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  242 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  243 */       MainMemory.setI32(492288 + j * 84 + 44, 0);
/*  244 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  245 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  246 */       MainMemory.setI32(492288 + j * 84 + 56, 3048);
/*  247 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  248 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  249 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  250 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  251 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  252 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  253 */       j += 1;
/*  254 */       MainMemory.setI32Aligned(467208, j);
/*  255 */       if (j >= 0) {
/*      */         break label1286;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  265 */       ffxmsg.call(5, 132256);
/*  266 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label1305;
/*      */       
/*      */       label1286:
/*  271 */       if (j <= 23) {
/*      */         break label1324;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1305:
/*      */       
/*      */ 
/*      */ 
/*  281 */       ffxmsg.call(5, 121440);
/*  282 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label1324:
/*      */       
/*  289 */       SystemLibrary.strncpy(492288 + j * 84, 44704, 20);
/*  290 */       j = MainMemory.getI32Aligned(467208);
/*  291 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  292 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  293 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  294 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  295 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  296 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  297 */       MainMemory.setI32(492288 + j * 84 + 40, 3058);
/*  298 */       MainMemory.setI32(492288 + j * 84 + 44, 3067);
/*  299 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  300 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  301 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/*  302 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  303 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  304 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  305 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  306 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  307 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  308 */       j += 1;
/*  309 */       MainMemory.setI32Aligned(467208, j);
/*  310 */       if (j >= 0) {
/*      */         break label1656;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  320 */       ffxmsg.call(5, 132256);
/*  321 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label1675;
/*      */       
/*      */       label1656:
/*  326 */       if (j <= 23) {
/*      */         break label1694;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1675:
/*      */       
/*      */ 
/*      */ 
/*  336 */       ffxmsg.call(5, 127712);
/*  337 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label1694:
/*      */       
/*  344 */       SystemLibrary.strncpy(492288 + j * 84, 52704, 20);
/*  345 */       j = MainMemory.getI32Aligned(467208);
/*  346 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  347 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  348 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  349 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  350 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  351 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  352 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  353 */       MainMemory.setI32(492288 + j * 84 + 44, 3067);
/*  354 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  355 */       MainMemory.setI32(492288 + j * 84 + 52, 3034);
/*  356 */       MainMemory.setI32(492288 + j * 84 + 56, 3024);
/*  357 */       MainMemory.setI32(492288 + j * 84 + 60, 3025);
/*  358 */       MainMemory.setI32(492288 + j * 84 + 64, 3032);
/*  359 */       MainMemory.setI32(492288 + j * 84 + 68, 3031);
/*  360 */       MainMemory.setI32(492288 + j * 84 + 72, 3028);
/*  361 */       MainMemory.setI32(492288 + j * 84 + 76, 3030);
/*  362 */       MainMemory.setI32(492288 + j * 84 + 80, 3029);
/*  363 */       j += 1;
/*  364 */       MainMemory.setI32Aligned(467208, j);
/*  365 */       if (j >= 0) {
/*      */         break label2028;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  375 */       ffxmsg.call(5, 132256);
/*  376 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label2047;
/*      */       
/*      */       label2028:
/*  381 */       if (j <= 23) {
/*      */         break label2066;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2047:
/*      */       
/*      */ 
/*      */ 
/*  391 */       ffxmsg.call(5, 122976);
/*  392 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label2066:
/*      */       
/*  399 */       SystemLibrary.strncpy(492288 + j * 84, 47776, 20);
/*  400 */       j = MainMemory.getI32Aligned(467208);
/*  401 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  402 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  403 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  404 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  405 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  406 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  407 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  408 */       MainMemory.setI32(492288 + j * 84 + 44, 0);
/*  409 */       MainMemory.setI32(492288 + j * 84 + 48, 3068);
/*  410 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  411 */       MainMemory.setI32(492288 + j * 84 + 56, 3055);
/*  412 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  413 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  414 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  415 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  416 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  417 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  418 */       j += 1;
/*  419 */       MainMemory.setI32Aligned(467208, j);
/*  420 */       if (j >= 0) {
/*      */         break label2396;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  430 */       ffxmsg.call(5, 132256);
/*  431 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label2415;
/*      */       
/*      */       label2396:
/*  436 */       if (j <= 23) {
/*      */         break label2434;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2415:
/*      */       
/*      */ 
/*      */ 
/*  446 */       ffxmsg.call(5, 124576);
/*  447 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label2434:
/*      */       
/*  454 */       SystemLibrary.strncpy(492288 + j * 84, 49472, 20);
/*  455 */       j = MainMemory.getI32Aligned(467208);
/*  456 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  457 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  458 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  459 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  460 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  461 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  462 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  463 */       MainMemory.setI32(492288 + j * 84 + 44, 3062);
/*  464 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  465 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  466 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/*  467 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  468 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  469 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  470 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  471 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  472 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  473 */       j += 1;
/*  474 */       MainMemory.setI32Aligned(467208, j);
/*  475 */       if (j >= 0) {
/*      */         break label2764;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  485 */       ffxmsg.call(5, 132256);
/*  486 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label2783;
/*      */       
/*      */       label2764:
/*  491 */       if (j <= 23) {
/*      */         break label2802;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2783:
/*      */       
/*      */ 
/*      */ 
/*  501 */       ffxmsg.call(5, 124640);
/*  502 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label2802:
/*      */       
/*  509 */       SystemLibrary.strncpy(492288 + j * 84, 49504, 20);
/*  510 */       j = MainMemory.getI32Aligned(467208);
/*  511 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  512 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  513 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  514 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  515 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  516 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  517 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  518 */       MainMemory.setI32(492288 + j * 84 + 44, 3061);
/*  519 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  520 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  521 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/*  522 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  523 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  524 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  525 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  526 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  527 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  528 */       j += 1;
/*  529 */       MainMemory.setI32Aligned(467208, j);
/*  530 */       if (j >= 0) {
/*      */         break label3132;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  540 */       ffxmsg.call(5, 132256);
/*  541 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label3151;
/*      */       
/*      */       label3132:
/*  546 */       if (j <= 23) {
/*      */         break label3170;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3151:
/*      */       
/*      */ 
/*      */ 
/*  556 */       ffxmsg.call(5, 126048);
/*  557 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label3170:
/*      */       
/*  564 */       SystemLibrary.strncpy(492288 + j * 84, 51392, 20);
/*  565 */       j = MainMemory.getI32Aligned(467208);
/*  566 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  567 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  568 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  569 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  570 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  571 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  572 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  573 */       MainMemory.setI32(492288 + j * 84 + 44, 3064);
/*  574 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  575 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  576 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/*  577 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  578 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  579 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  580 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  581 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  582 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  583 */       j += 1;
/*  584 */       MainMemory.setI32Aligned(467208, j);
/*  585 */       if (j >= 0) {
/*      */         break label3500;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  595 */       ffxmsg.call(5, 132256);
/*  596 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label3519;
/*      */       
/*      */       label3500:
/*  601 */       if (j <= 23) {
/*      */         break label3538;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3519:
/*      */       
/*      */ 
/*      */ 
/*  611 */       ffxmsg.call(5, 130080);
/*  612 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label3538:
/*      */       
/*  619 */       SystemLibrary.strncpy(492288 + j * 84, 55136, 20);
/*  620 */       j = MainMemory.getI32Aligned(467208);
/*  621 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  622 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  623 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  624 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  625 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  626 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  627 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  628 */       MainMemory.setI32(492288 + j * 84 + 44, 3066);
/*  629 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  630 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  631 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/*  632 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  633 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  634 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  635 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  636 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  637 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  638 */       j += 1;
/*  639 */       MainMemory.setI32Aligned(467208, j);
/*  640 */       if (j >= 0) {
/*      */         break label3868;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  650 */       ffxmsg.call(5, 132256);
/*  651 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label3887;
/*      */       
/*      */       label3868:
/*  656 */       if (j <= 23) {
/*      */         break label3906;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3887:
/*      */       
/*      */ 
/*      */ 
/*  666 */       ffxmsg.call(5, 131168);
/*  667 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label3906:
/*      */       
/*  674 */       SystemLibrary.strncpy(492288 + j * 84, 57152, 20);
/*  675 */       j = MainMemory.getI32Aligned(467208);
/*  676 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  677 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  678 */       MainMemory.setI32(492288 + j * 84 + 24, 3015);
/*  679 */       MainMemory.setI32(492288 + j * 84 + 28, 3012);
/*  680 */       MainMemory.setI32(492288 + j * 84 + 32, 3013);
/*  681 */       MainMemory.setI32(492288 + j * 84 + 36, 3014);
/*  682 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  683 */       MainMemory.setI32(492288 + j * 84 + 44, 3041);
/*  684 */       MainMemory.setI32(492288 + j * 84 + 48, 3027);
/*  685 */       MainMemory.setI32(492288 + j * 84 + 52, 3034);
/*  686 */       MainMemory.setI32(492288 + j * 84 + 56, 3024);
/*  687 */       MainMemory.setI32(492288 + j * 84 + 60, 3025);
/*  688 */       MainMemory.setI32(492288 + j * 84 + 64, 3032);
/*  689 */       MainMemory.setI32(492288 + j * 84 + 68, 3031);
/*  690 */       MainMemory.setI32(492288 + j * 84 + 72, 3028);
/*  691 */       MainMemory.setI32(492288 + j * 84 + 76, 3030);
/*  692 */       MainMemory.setI32(492288 + j * 84 + 80, 3029);
/*  693 */       j += 1;
/*  694 */       MainMemory.setI32Aligned(467208, j);
/*  695 */       if (j >= 0) {
/*      */         break label4242;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  705 */       ffxmsg.call(5, 132256);
/*  706 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label4261;
/*      */       
/*      */       label4242:
/*  711 */       if (j <= 23) {
/*      */         break label4280;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label4261:
/*      */       
/*      */ 
/*      */ 
/*  721 */       ffxmsg.call(5, 133984);
/*  722 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label4280:
/*      */       
/*  729 */       SystemLibrary.strncpy(492288 + j * 84, 61184, 20);
/*  730 */       j = MainMemory.getI32Aligned(467208);
/*  731 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  732 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  733 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  734 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  735 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  736 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  737 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  738 */       MainMemory.setI32(492288 + j * 84 + 44, 0);
/*  739 */       MainMemory.setI32(492288 + j * 84 + 48, 3069);
/*  740 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  741 */       MainMemory.setI32(492288 + j * 84 + 56, 3053);
/*  742 */       MainMemory.setI32(492288 + j * 84 + 60, 3025);
/*  743 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  744 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  745 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  746 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  747 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  748 */       j += 1;
/*  749 */       MainMemory.setI32Aligned(467208, j);
/*  750 */       if (j >= 0) {
/*      */         break label4612;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  760 */       ffxmsg.call(5, 132256);
/*  761 */       ffxmsg.call(5, 113952);
/*      */       
/*      */ 
/*      */       label4612:
/*      */       
/*  766 */       if (j <= 23)
/*      */       {
/*      */ 
/*      */ 
/*  770 */         k = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  777 */         ffxmsg.call(5, 119584);
/*  778 */         i = 122;
/*      */         
/*      */ 
/*      */         break label8708;
/*      */       }
/*      */       
/*      */       for (;;)
/*      */       {
/*  786 */         m = 499456 + k * 12 + 4;
/*  787 */         MainMemory.setI32(499456 + k * 12, 0);
/*  788 */         MainMemory.setI64(m, 0L);
/*  789 */         k += 1;
/*  790 */         if (k == 300) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  801 */       SystemLibrary.strncpy(492288 + j * 84, 40544, 20);
/*  802 */       j = MainMemory.getI32Aligned(467208);
/*  803 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  804 */       MainMemory.setI32(492288 + j * 84 + 20, 3071);
/*  805 */       MainMemory.setI32(492288 + j * 84 + 24, 3075);
/*  806 */       MainMemory.setI32(492288 + j * 84 + 28, 3072);
/*  807 */       MainMemory.setI32(492288 + j * 84 + 32, 3073);
/*  808 */       MainMemory.setI32(492288 + j * 84 + 36, 3074);
/*  809 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  810 */       MainMemory.setI32(492288 + j * 84 + 44, 3094);
/*  811 */       MainMemory.setI32(492288 + j * 84 + 48, 3093);
/*  812 */       MainMemory.setI32(492288 + j * 84 + 52, 0);
/*  813 */       MainMemory.setI32(492288 + j * 84 + 56, 3084);
/*  814 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  815 */       MainMemory.setI32(492288 + j * 84 + 64, 3082);
/*  816 */       MainMemory.setI32(492288 + j * 84 + 68, 3078);
/*  817 */       MainMemory.setI32(492288 + j * 84 + 72, 3076);
/*  818 */       MainMemory.setI32(492288 + j * 84 + 76, 3083);
/*  819 */       MainMemory.setI32(492288 + j * 84 + 80, 3081);
/*  820 */       j += 1;
/*  821 */       MainMemory.setI32Aligned(467208, j);
/*  822 */       if (j >= 0) {
/*      */         break label5036;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  832 */       ffxmsg.call(5, 132256);
/*  833 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label5055;
/*      */       
/*      */       label5036:
/*  838 */       if (j <= 23) {
/*      */         break label5074;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label5055:
/*      */       
/*      */ 
/*      */ 
/*  848 */       ffxmsg.call(5, 119648);
/*  849 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label5074:
/*      */       
/*  856 */       SystemLibrary.strncpy(492288 + j * 84, 40512, 20);
/*  857 */       j = MainMemory.getI32Aligned(467208);
/*  858 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  859 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  860 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  861 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  862 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  863 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  864 */       MainMemory.setI32(492288 + j * 84 + 40, 3099);
/*  865 */       MainMemory.setI32(492288 + j * 84 + 44, 3070);
/*  866 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  867 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  868 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/*  869 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  870 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  871 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  872 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  873 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  874 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  875 */       j += 1;
/*  876 */       MainMemory.setI32Aligned(467208, j);
/*  877 */       if (j >= 0) {
/*      */         break label5406;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  887 */       ffxmsg.call(5, 132256);
/*  888 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label5425;
/*      */       
/*      */       label5406:
/*  893 */       if (j <= 23) {
/*      */         break label5444;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label5425:
/*      */       
/*      */ 
/*      */ 
/*  903 */       ffxmsg.call(5, 126112);
/*  904 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label5444:
/*      */       
/*  911 */       SystemLibrary.strncpy(492288 + j * 84, 51424, 20);
/*  912 */       j = MainMemory.getI32Aligned(467208);
/*  913 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  914 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  915 */       MainMemory.setI32(492288 + j * 84 + 24, 3015);
/*  916 */       MainMemory.setI32(492288 + j * 84 + 28, 3012);
/*  917 */       MainMemory.setI32(492288 + j * 84 + 32, 3013);
/*  918 */       MainMemory.setI32(492288 + j * 84 + 36, 3014);
/*  919 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/*  920 */       MainMemory.setI32(492288 + j * 84 + 44, 3106);
/*  921 */       MainMemory.setI32(492288 + j * 84 + 48, 3027);
/*  922 */       MainMemory.setI32(492288 + j * 84 + 52, 3034);
/*  923 */       MainMemory.setI32(492288 + j * 84 + 56, 3024);
/*  924 */       MainMemory.setI32(492288 + j * 84 + 60, 3025);
/*  925 */       MainMemory.setI32(492288 + j * 84 + 64, 3032);
/*  926 */       MainMemory.setI32(492288 + j * 84 + 68, 3031);
/*  927 */       MainMemory.setI32(492288 + j * 84 + 72, 3028);
/*  928 */       MainMemory.setI32(492288 + j * 84 + 76, 3030);
/*  929 */       MainMemory.setI32(492288 + j * 84 + 80, 3029);
/*  930 */       j += 1;
/*  931 */       MainMemory.setI32Aligned(467208, j);
/*  932 */       if (j >= 0) {
/*      */         break label5780;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  942 */       ffxmsg.call(5, 132256);
/*  943 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label5799;
/*      */       
/*      */       label5780:
/*  948 */       if (j <= 23) {
/*      */         break label5818;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label5799:
/*      */       
/*      */ 
/*      */ 
/*  958 */       ffxmsg.call(5, 124704);
/*  959 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label5818:
/*      */       
/*  966 */       SystemLibrary.strncpy(492288 + j * 84, 49632, 20);
/*  967 */       j = MainMemory.getI32Aligned(467208);
/*  968 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/*  969 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/*  970 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/*  971 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/*  972 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/*  973 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/*  974 */       MainMemory.setI32(492288 + j * 84 + 40, 3099);
/*  975 */       MainMemory.setI32(492288 + j * 84 + 44, 3106);
/*  976 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/*  977 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/*  978 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/*  979 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/*  980 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/*  981 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/*  982 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/*  983 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/*  984 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/*  985 */       j += 1;
/*  986 */       MainMemory.setI32Aligned(467208, j);
/*  987 */       if (j >= 0) {
/*      */         break label6150;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  997 */       ffxmsg.call(5, 132256);
/*  998 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label6169;
/*      */       
/*      */       label6150:
/* 1003 */       if (j <= 23) {
/*      */         break label6188;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label6169:
/*      */       
/*      */ 
/*      */ 
/* 1013 */       ffxmsg.call(5, 131232);
/* 1014 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label6188:
/*      */       
/* 1021 */       SystemLibrary.strncpy(492288 + j * 84, 57184, 20);
/* 1022 */       j = MainMemory.getI32Aligned(467208);
/* 1023 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/* 1024 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/* 1025 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/* 1026 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/* 1027 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/* 1028 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/* 1029 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/* 1030 */       MainMemory.setI32(492288 + j * 84 + 44, 3103);
/* 1031 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/* 1032 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/* 1033 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/* 1034 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/* 1035 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/* 1036 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/* 1037 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/* 1038 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/* 1039 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/* 1040 */       j += 1;
/* 1041 */       MainMemory.setI32Aligned(467208, j);
/* 1042 */       if (j >= 0) {
/*      */         break label6518;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1052 */       ffxmsg.call(5, 132256);
/* 1053 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label6537;
/*      */       
/*      */       label6518:
/* 1058 */       if (j <= 23) {
/*      */         break label6556;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label6537:
/*      */       
/*      */ 
/*      */ 
/* 1068 */       ffxmsg.call(5, 117472);
/* 1069 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label6556:
/*      */       
/* 1076 */       SystemLibrary.strncpy(492288 + j * 84, 33216, 20);
/* 1077 */       j = MainMemory.getI32Aligned(467208);
/* 1078 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/* 1079 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/* 1080 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/* 1081 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/* 1082 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/* 1083 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/* 1084 */       MainMemory.setI32(492288 + j * 84 + 40, 3097);
/* 1085 */       MainMemory.setI32(492288 + j * 84 + 44, 3104);
/* 1086 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/* 1087 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/* 1088 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/* 1089 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/* 1090 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/* 1091 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/* 1092 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/* 1093 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/* 1094 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/* 1095 */       j += 1;
/* 1096 */       MainMemory.setI32Aligned(467208, j);
/* 1097 */       if (j >= 0) {
/*      */         break label6888;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1107 */       ffxmsg.call(5, 132256);
/* 1108 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label6907;
/*      */       
/*      */       label6888:
/* 1113 */       if (j <= 23) {
/*      */         break label6926;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label6907:
/*      */       
/*      */ 
/*      */ 
/* 1123 */       ffxmsg.call(5, 124768);
/* 1124 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label6926:
/*      */       
/* 1131 */       SystemLibrary.strncpy(492288 + j * 84, 49664, 20);
/* 1132 */       j = MainMemory.getI32Aligned(467208);
/* 1133 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/* 1134 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/* 1135 */       MainMemory.setI32(492288 + j * 84 + 24, 3015);
/* 1136 */       MainMemory.setI32(492288 + j * 84 + 28, 3012);
/* 1137 */       MainMemory.setI32(492288 + j * 84 + 32, 3013);
/* 1138 */       MainMemory.setI32(492288 + j * 84 + 36, 3014);
/* 1139 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/* 1140 */       MainMemory.setI32(492288 + j * 84 + 44, 3105);
/* 1141 */       MainMemory.setI32(492288 + j * 84 + 48, 3027);
/* 1142 */       MainMemory.setI32(492288 + j * 84 + 52, 3034);
/* 1143 */       MainMemory.setI32(492288 + j * 84 + 56, 3024);
/* 1144 */       MainMemory.setI32(492288 + j * 84 + 60, 3025);
/* 1145 */       MainMemory.setI32(492288 + j * 84 + 64, 3032);
/* 1146 */       MainMemory.setI32(492288 + j * 84 + 68, 3031);
/* 1147 */       MainMemory.setI32(492288 + j * 84 + 72, 3028);
/* 1148 */       MainMemory.setI32(492288 + j * 84 + 76, 3030);
/* 1149 */       MainMemory.setI32(492288 + j * 84 + 80, 3029);
/* 1150 */       j += 1;
/* 1151 */       MainMemory.setI32Aligned(467208, j);
/* 1152 */       if (j >= 0) {
/*      */         break label7262;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1162 */       ffxmsg.call(5, 132256);
/* 1163 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label7281;
/*      */       
/*      */       label7262:
/* 1168 */       if (j <= 23) {
/*      */         break label7300;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label7281:
/*      */       
/*      */ 
/*      */ 
/* 1178 */       ffxmsg.call(5, 123040);
/* 1179 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label7300:
/*      */       
/* 1186 */       SystemLibrary.strncpy(492288 + j * 84, 47872, 20);
/* 1187 */       j = MainMemory.getI32Aligned(467208);
/* 1188 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/* 1189 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/* 1190 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/* 1191 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/* 1192 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/* 1193 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/* 1194 */       MainMemory.setI32(492288 + j * 84 + 40, 3097);
/* 1195 */       MainMemory.setI32(492288 + j * 84 + 44, 3105);
/* 1196 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/* 1197 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/* 1198 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/* 1199 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/* 1200 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/* 1201 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/* 1202 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/* 1203 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/* 1204 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/* 1205 */       j += 1;
/* 1206 */       MainMemory.setI32Aligned(467208, j);
/* 1207 */       if (j >= 0) {
/*      */         break label7632;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1217 */       ffxmsg.call(5, 132256);
/* 1218 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label7651;
/*      */       
/*      */       label7632:
/* 1223 */       if (j <= 23) {
/*      */         break label7670;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label7651:
/*      */       
/*      */ 
/*      */ 
/* 1233 */       ffxmsg.call(5, 130144);
/* 1234 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label7670:
/*      */       
/* 1241 */       SystemLibrary.strncpy(492288 + j * 84, 55168, 20);
/* 1242 */       j = MainMemory.getI32Aligned(467208);
/* 1243 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/* 1244 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/* 1245 */       MainMemory.setI32(492288 + j * 84 + 24, 3046);
/* 1246 */       MainMemory.setI32(492288 + j * 84 + 28, 3043);
/* 1247 */       MainMemory.setI32(492288 + j * 84 + 32, 3044);
/* 1248 */       MainMemory.setI32(492288 + j * 84 + 36, 3045);
/* 1249 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/* 1250 */       MainMemory.setI32(492288 + j * 84 + 44, 3100);
/* 1251 */       MainMemory.setI32(492288 + j * 84 + 48, 0);
/* 1252 */       MainMemory.setI32(492288 + j * 84 + 52, 3059);
/* 1253 */       MainMemory.setI32(492288 + j * 84 + 56, 3052);
/* 1254 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/* 1255 */       MainMemory.setI32(492288 + j * 84 + 64, 3047);
/* 1256 */       MainMemory.setI32(492288 + j * 84 + 68, 0);
/* 1257 */       MainMemory.setI32(492288 + j * 84 + 72, 3049);
/* 1258 */       MainMemory.setI32(492288 + j * 84 + 76, 3051);
/* 1259 */       MainMemory.setI32(492288 + j * 84 + 80, 3050);
/* 1260 */       j += 1;
/* 1261 */       MainMemory.setI32Aligned(467208, j);
/* 1262 */       if (j >= 0) {
/*      */         break label8000;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1272 */       ffxmsg.call(5, 132256);
/* 1273 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label8019;
/*      */       
/*      */       label8000:
/* 1278 */       if (j <= 23) {
/*      */         break label8038;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label8019:
/*      */       
/*      */ 
/*      */ 
/* 1288 */       ffxmsg.call(5, 121504);
/* 1289 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label8038:
/*      */       
/* 1296 */       SystemLibrary.strncpy(492288 + j * 84, 44672, 20);
/* 1297 */       j = MainMemory.getI32Aligned(467208);
/* 1298 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/* 1299 */       MainMemory.setI32(492288 + j * 84 + 20, 3108);
/* 1300 */       MainMemory.setI32(492288 + j * 84 + 24, 3141);
/* 1301 */       MainMemory.setI32(492288 + j * 84 + 28, 3109);
/* 1302 */       MainMemory.setI32(492288 + j * 84 + 32, 3110);
/* 1303 */       MainMemory.setI32(492288 + j * 84 + 36, 3111);
/* 1304 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/* 1305 */       MainMemory.setI32(492288 + j * 84 + 44, 3137);
/* 1306 */       MainMemory.setI32(492288 + j * 84 + 48, 3140);
/* 1307 */       MainMemory.setI32(492288 + j * 84 + 52, 0);
/* 1308 */       MainMemory.setI32(492288 + j * 84 + 56, 3135);
/* 1309 */       MainMemory.setI32(492288 + j * 84 + 60, 3138);
/* 1310 */       MainMemory.setI32(492288 + j * 84 + 64, 3127);
/* 1311 */       MainMemory.setI32(492288 + j * 84 + 68, 3126);
/* 1312 */       MainMemory.setI32(492288 + j * 84 + 72, 3125);
/* 1313 */       MainMemory.setI32(492288 + j * 84 + 76, 3124);
/* 1314 */       MainMemory.setI32(492288 + j * 84 + 80, 3131);
/* 1315 */       j += 1;
/* 1316 */       MainMemory.setI32Aligned(467208, j);
/* 1317 */       if (j >= 0) {
/*      */         break label8374;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1327 */       ffxmsg.call(5, 132256);
/* 1328 */       ffxmsg.call(5, 113952);
/*      */       
/*      */       break label8393;
/*      */       
/*      */       label8374:
/* 1333 */       if (j <= 23) {
/*      */         break label8412;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label8393:
/*      */       
/*      */ 
/*      */ 
/* 1343 */       ffxmsg.call(5, 123104);
/* 1344 */       i = 122;
/*      */       
/*      */ 
/*      */       break label8708;
/*      */       
/*      */       label8412:
/*      */       
/* 1351 */       SystemLibrary.strncpy(492288 + j * 84, 47904, 20);
/* 1352 */       j = MainMemory.getI32Aligned(467208);
/* 1353 */       MainMemory.setI8(492288 + j * 84 + 19, (byte)0);
/* 1354 */       MainMemory.setI32(492288 + j * 84 + 20, 0);
/* 1355 */       MainMemory.setI32(492288 + j * 84 + 24, 0);
/* 1356 */       MainMemory.setI32(492288 + j * 84 + 28, 0);
/* 1357 */       MainMemory.setI32(492288 + j * 84 + 32, 0);
/* 1358 */       MainMemory.setI32(492288 + j * 84 + 36, 0);
/* 1359 */       MainMemory.setI32(492288 + j * 84 + 40, 0);
/* 1360 */       MainMemory.setI32(492288 + j * 84 + 44, 3016);
/* 1361 */       MainMemory.setI32(492288 + j * 84 + 48, 3017);
/* 1362 */       MainMemory.setI32(492288 + j * 84 + 52, 0);
/* 1363 */       MainMemory.setI32(492288 + j * 84 + 56, 3019);
/* 1364 */       MainMemory.setI32(492288 + j * 84 + 60, 0);
/* 1365 */       MainMemory.setI32(492288 + j * 84 + 64, 3018);
/* 1366 */       MainMemory.setI32(492288 + j * 84 + 68, 3023);
/* 1367 */       MainMemory.setI32(492288 + j * 84 + 72, 3020);
/* 1368 */       MainMemory.setI32(492288 + j * 84 + 76, 3022);
/* 1369 */       MainMemory.setI32(492288 + j * 84 + 80, 3021);
/* 1370 */       MainMemory.setI32Aligned(467208, j + 1);
/* 1371 */       MainMemory.setI1(459320, true);
/* 1372 */       i = 0;
/*      */       
/*      */ 
/*      */       label8708:
/*      */       
/*      */ 
/* 1378 */       int n = i; return n;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_init_cfitsio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */