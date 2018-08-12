/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ import com.emt.proteus.runtime.library.c.malloc;
/*      */ import com.emt.proteus.runtime.library.ctype.__ctype_b_loc;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class ffopen
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3005;
/*   41 */   public static final Function _instance = new ffopen();
/*   42 */   public final Function resolve() { return _instance; }
/*      */   
/*   44 */   public ffopen() { super("ffopen", 4, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   48 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   53 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   54 */     paramInt4 += 2;
/*   55 */     paramInt3--;
/*   56 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   57 */     paramInt4 += 2;
/*   58 */     paramInt3--;
/*   59 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   60 */     paramInt4 += 2;
/*   61 */     paramInt3--;
/*   62 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   63 */     paramInt4 += 2;
/*   64 */     paramInt3--;
/*   65 */     int n = call(i, j, k, m);
/*   66 */     paramFrame.setI32(paramInt1, n);
/*   67 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   72 */     int i = 0;
/*      */     
/*   74 */     int j = 0;
/*   75 */     int k = 0;
/*   76 */     int m = 0;
/*   77 */     int n = 0;
/*   78 */     int i1 = 0;
/*   79 */     int i2 = 0;
/*   80 */     int i3 = 0;
/*   81 */     int i4 = 0;
/*   82 */     int i5 = 0;
/*   83 */     int i6 = 0;
/*   84 */     int i7 = 0;
/*   85 */     int i8 = 0;
/*   86 */     int i9 = 0;
/*   87 */     int i10 = 0;
/*   88 */     int i11 = 0;
/*   89 */     int i12 = 0;
/*   90 */     int i13 = 0;
/*   91 */     int i14 = 0;
/*   92 */     int i15 = 0;
/*   93 */     int i16 = 0;
/*   94 */     int i17 = 0;
/*   95 */     int i18 = 0;
/*   96 */     int i19 = 0;
/*   97 */     int i20 = 0;
/*   98 */     int i21 = 0;
/*   99 */     int i22 = 0;
/*  100 */     int i23 = 0;
/*  101 */     int i24 = 0;
/*  102 */     int i25 = 0;
/*  103 */     int i26 = 0;
/*  104 */     int i27 = 0;
/*  105 */     int i28 = 0;
/*  106 */     int i29 = 0;
/*  107 */     int i30 = 0;
/*  108 */     int i31 = 0;
/*  109 */     int i32 = 0;
/*  110 */     int i33 = 0;
/*  111 */     int i34 = 0;
/*  112 */     int i35 = 0;
/*  113 */     int i36 = 0;
/*  114 */     int i37 = 0;
/*  115 */     int i38 = 0;
/*  116 */     int i39 = 0;
/*  117 */     int i40 = 0;
/*  118 */     int i41 = 0;
/*  119 */     int i42 = 0;
/*  120 */     int i43 = 0;
/*  121 */     int i44 = 0;
/*  122 */     int i45 = 0;
/*  123 */     int i46 = 0;
/*  124 */     int i47 = 0;
/*  125 */     boolean bool = false;
/*  126 */     int i48 = 0;
/*  127 */     int i49 = 0;
/*  128 */     int i50 = 0;
/*  129 */     int i51 = 0;
/*  130 */     int i52 = 0;
/*  131 */     int i53 = 0;
/*  132 */     int i54 = 0;
/*  133 */     int i55 = 0;
/*  134 */     int i56 = 0;
/*  135 */     int i57 = 0;
/*      */     
/*      */ 
/*  138 */     int i58 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  142 */       j = MainMemory.alloc(81);
/*  143 */       k = MainMemory.alloc(180);
/*  144 */       m = MainMemory.alloc(4);
/*  145 */       n = MainMemory.alloc(4);
/*  146 */       i1 = MainMemory.alloc(4);
/*  147 */       i2 = MainMemory.alloc(4);
/*  148 */       i3 = MainMemory.alloc(8);
/*  149 */       i4 = MainMemory.alloc(4);
/*  150 */       i5 = MainMemory.alloc(4);
/*  151 */       i6 = MainMemory.alloc(4);
/*  152 */       i7 = MainMemory.alloc(4);
/*  153 */       i8 = MainMemory.alloc(4);
/*  154 */       i9 = MainMemory.alloc(4);
/*  155 */       i10 = MainMemory.alloc(4);
/*  156 */       i11 = MainMemory.alloc(20);
/*  157 */       i12 = MainMemory.alloc(1025);
/*  158 */       i13 = MainMemory.alloc(1025);
/*  159 */       i14 = MainMemory.alloc(20);
/*  160 */       i15 = MainMemory.alloc(1025);
/*  161 */       i16 = MainMemory.alloc(71);
/*  162 */       i17 = MainMemory.alloc(1025);
/*  163 */       i18 = MainMemory.alloc(71);
/*  164 */       i19 = MainMemory.alloc(71);
/*  165 */       i20 = MainMemory.alloc(1025);
/*  166 */       i21 = MainMemory.alloc(1025);
/*  167 */       i22 = MainMemory.alloc(1025);
/*  168 */       i23 = MainMemory.alloc(1025);
/*  169 */       i24 = MainMemory.alloc(1025);
/*  170 */       i25 = MainMemory.alloc(1025);
/*  171 */       i26 = MainMemory.alloc(71);
/*  172 */       i27 = MainMemory.alloc(284);
/*  173 */       i28 = MainMemory.alloc(284);
/*  174 */       i29 = MainMemory.alloc(284);
/*  175 */       i30 = MainMemory.alloc(32);
/*  176 */       i31 = MainMemory.alloc(32);
/*  177 */       i32 = MainMemory.alloc(32);
/*  178 */       i33 = MainMemory.alloc(8);
/*  179 */       i34 = MainMemory.alloc(4);
/*  180 */       i35 = MainMemory.alloc(4);
/*  181 */       i36 = MainMemory.alloc(4);
/*  182 */       i37 = MainMemory.alloc(4);
/*  183 */       i38 = MainMemory.alloc(284);
/*  184 */       i39 = MainMemory.alloc(81);
/*  185 */       i40 = MainMemory.alloc(12);
/*  186 */       MainMemory.setI32(i10, 0);
/*  187 */       MainMemory.setI32(i35, 1);
/*  188 */       MainMemory.setI32(i40, 26848);
/*  189 */       MainMemory.setI32(i40 + 4, 26880);
/*  190 */       MainMemory.setI32(i40 + 8, 45216);
/*  191 */       i43 = MainMemory.getI32(paramInt4);
/*  192 */       if (i43 <= 0) {
/*      */         break label580;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  202 */       i = i43;
/*      */       
/*      */ 
/*      */       break label8335;
/*      */       
/*      */       label580:
/*      */       
/*  209 */       switch (i43) {
/*      */       case -102: 
/*      */         break label741;
/*      */         break;
/*      */       case -103:  break label714;
/*      */         break; case -104:  break label687;
/*      */         break; case -105:  break; default:  i41 = 0;
/*  216 */         i42 = 0;
/*  217 */         i43 = 0;
/*  218 */         i47 = 0;
/*  219 */         break;
/*      */       }
/*      */       
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  226 */       MainMemory.setI32(paramInt4, 0);
/*  227 */       i41 = 0;
/*  228 */       i42 = 0;
/*  229 */       i43 = 0;
/*  230 */       i47 = 1;
/*      */       
/*      */       break label763;
/*      */       
/*      */       label687:
/*  235 */       MainMemory.setI32(paramInt4, 0);
/*  236 */       i41 = 0;
/*  237 */       i42 = 0;
/*  238 */       i43 = 1;
/*  239 */       i47 = 0;
/*      */       
/*      */       break label763;
/*      */       
/*      */       label714:
/*  244 */       MainMemory.setI32(paramInt4, 0);
/*  245 */       i41 = 0;
/*  246 */       i42 = 1;
/*  247 */       i43 = 0;
/*  248 */       i47 = 0;
/*      */       
/*      */       break label763;
/*      */       
/*      */       label741:
/*  253 */       MainMemory.setI32(paramInt4, 0);
/*  254 */       i41 = 1;
/*  255 */       i42 = 0;
/*  256 */       i43 = 0;
/*  257 */       i47 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label763:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  267 */       MainMemory.setI32(paramInt1, 0);
/*  268 */       if (!MainMemory.getI1(459320)) {
/*      */         break label805;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  278 */       i51 = MainMemory.getI32(paramInt4);
/*      */       
/*      */       break label821;
/*      */       
/*      */       label805:
/*      */       
/*  284 */       i51 = fits_init_cfitsio.call();
/*  285 */       MainMemory.setI32(paramInt4, i51);
/*      */       
/*      */ 
/*      */ 
/*      */       label821:
/*      */       
/*      */ 
/*      */ 
/*  293 */       if (i51 <= 0) {
/*      */         break label853;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  303 */       i = i51;
/*      */       
/*      */ 
/*      */       break label8335;
/*      */       
/*      */       label853:
/*      */       
/*  310 */       i44 = MainMemory.getI8(paramInt2);
/*  311 */       if (i44 == 32) {
/*  312 */         i51 = 0;
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*  317 */         i45 = paramInt2;
/*      */         
/*      */ 
/*      */         break label921;
/*      */       }
/*      */       
/*      */       do
/*      */       {
/*  325 */         i51 += 1;
/*  326 */         i45 = paramInt2 + i51;
/*  327 */         i44 = MainMemory.getI8(i45);
/*  328 */       } while (i44 == 32);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label921:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  343 */       if (i44 != 0) {
/*      */         break label965;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  353 */       ffxmsg.call(5, 92192);
/*  354 */       MainMemory.setI32(paramInt4, 104);
/*  355 */       i = 104;
/*      */       
/*      */ 
/*      */       break label8335;
/*      */       
/*      */       label965:
/*      */       
/*  362 */       if (i47 != 0) {
/*      */         break label1016;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  372 */       ffifile.call(i45, i11, i12, i13, i15, i17, i21, i22, i23, paramInt4);
/*      */       
/*      */       break label1126;
/*      */       
/*      */       label1016:
/*  377 */       if (!MathUtils.ugt(SystemLibrary.strlen(i45), 1024)) {
/*      */         break label1069;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  387 */       ffxmsg.call(5, 97952);
/*  388 */       MainMemory.setI32(paramInt4, 104);
/*  389 */       i = 104;
/*      */       
/*      */ 
/*      */       break label8335;
/*      */       
/*      */       label1069:
/*      */       
/*  396 */       SystemLibrary.strcpy(i12, i45);
/*  397 */       MainMemory.setI64(i11, 13281251761613158L);
/*  398 */       MainMemory.setI8(i13, (byte)0);
/*  399 */       MainMemory.setI8(i15, (byte)0);
/*  400 */       MainMemory.setI8(i21, (byte)0);
/*  401 */       MainMemory.setI8(i22, (byte)0);
/*  402 */       MainMemory.setI8(i17, (byte)0);
/*  403 */       MainMemory.setI8(i23, (byte)0);
/*      */       
/*      */ 
/*      */       label1126:
/*      */       
/*      */ 
/*  409 */       if (MainMemory.getI32(paramInt4) <= 0) {
/*      */         break label1174;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  419 */       ffxmsg.call(5, 102688);
/*  420 */       ffxmsg.call(5, i45);
/*  421 */       i = MainMemory.getI32(paramInt4);
/*      */       
/*      */ 
/*      */       break label8335;
/*      */       
/*      */       label1174:
/*      */       
/*  428 */       MainMemory.setI8(i19, (byte)0);
/*  429 */       MainMemory.setI8(i20, (byte)0);
/*  430 */       if (MainMemory.getI8(i15) == 0) {
/*  431 */         i47 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  441 */         i46 = i15 + (SystemLibrary.strlen(i15) + -1);
/*  442 */         if (MainMemory.getI8(i46) != 35)
/*      */         {
/*      */ 
/*      */ 
/*  446 */           i47 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  453 */           MainMemory.setI8(i46, (byte)0);
/*  454 */           i47 = 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  461 */         ffexts.call(i15, i6, i16, i7, i9, i19, i20, paramInt4);
/*  462 */         i51 = MainMemory.getI32(paramInt4);
/*  463 */         if (i51 <= 0) {
/*      */           break label1315;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  474 */         i = i51;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */       }
/*      */       
/*      */       label1315:
/*      */       
/*  482 */       MainMemory.setI8(i24, (byte)0);
/*  483 */       MainMemory.setI8(i25, (byte)0);
/*  484 */       bool = MainMemory.getI8(i13) == 0;
/*  485 */       if (!bool)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  495 */         if (MainMemory.getI8(i21) != 0) {
/*      */           break label1498;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  505 */         if (MainMemory.getI8(i19) != 0) {
/*      */           break label1498;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  515 */         if (MainMemory.getI8(i23) != 0) {
/*      */           break label1498;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  525 */         if (!bool)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  535 */           if (MainMemory.getI8(i17) != 0) {
/*      */             break label1474;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  545 */           if (MainMemory.getI8(i22) != 0)
/*      */           {
/*      */             label1474:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  555 */             SystemLibrary.strcpy(i25, i13);
/*  556 */             MainMemory.setI8(i13, (byte)0);
/*      */             
/*      */             break label1517;
/*      */             
/*      */             label1498:
/*  561 */             SystemLibrary.strcpy(i24, i13);
/*  562 */             MainMemory.setI8(i13, (byte)0);
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */       label1517:
/*  568 */       if (fits_already_open.call(paramInt1, i45, i11, i12, i15, i17, i21, i22, paramInt3, i2, paramInt4) <= 0) {
/*      */         break label1571;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  578 */       i = MainMemory.getI32(paramInt4);
/*      */       
/*      */ 
/*      */       break label8335;
/*      */       
/*      */       label1571:
/*      */       
/*  585 */       if (MainMemory.getI32(i2) != 0)
/*      */       {
/*      */ 
/*      */ 
/*  589 */         paramInt3 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  596 */         i48 = MainMemory.getI32Aligned(467208) + -1;
/*  597 */         i49 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  604 */           i51 = i48 - i49;
/*  605 */           if (i51 <= -1) {
/*      */             break label3371;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  615 */           i49 += 1;
/*  616 */           if (SystemLibrary.strcmp(492288 + i51 * 84, i11) == 0) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  627 */         MainMemory.setI32(paramInt4, 0);
/*  628 */         i50 = 492288 + i51 * 84 + 40;
/*  629 */         if (MainMemory.getI32(i50) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  640 */           SystemLibrary.strcpy(i14, i11);
/*  641 */           i48 = SystemLibrary.do_indirect(MainMemory.getI32(i50), i11, i12, i13);
/*  642 */           MainMemory.setI32(paramInt4, i48);
/*  643 */           if (i48 != 0) {
/*      */             break label3343;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  653 */           if (SystemLibrary.strcmp(i14, i11) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  664 */             i51 = MainMemory.getI32Aligned(467208) + -1;
/*  665 */             i49 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  672 */               i48 = i51 - i49;
/*  673 */               if (i48 <= -1) {
/*      */                 break label3303;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  683 */               i49 += 1;
/*  684 */               if (SystemLibrary.strcmp(492288 + i48 * 84, i11) == 0) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  695 */             MainMemory.setI32(paramInt4, 0);
/*  696 */             i51 = i48;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  703 */         i52 = MainMemory.getI32(492288 + i51 * 84 + 44);
/*  704 */         if (i52 != 0) {
/*      */           break label1934;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  714 */         ffxmsg.call(5, 117600);
/*  715 */         ffxmsg.call(5, i45);
/*  716 */         MainMemory.setI32(paramInt4, 104);
/*  717 */         i = 104;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label1934:
/*      */         
/*  724 */         i48 = SystemLibrary.do_indirect(i52, i12, paramInt3, i8);
/*  725 */         MainMemory.setI32(paramInt4, i48);
/*  726 */         if (i48 <= 0) {
/*      */           break label1998;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  736 */         ffxmsg.call(5, 117536);
/*  737 */         ffxmsg.call(5, i45);
/*  738 */         i = MainMemory.getI32(paramInt4);
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label1998:
/*      */         
/*  745 */         i48 = SystemLibrary.do_indirect(MainMemory.getI32(492288 + i51 * 84 + 64), MainMemory.getI32(i8), i3);
/*  746 */         MainMemory.setI32(paramInt4, i48);
/*  747 */         if (i48 <= 0) {
/*      */           break label2099;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  757 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + i51 * 84 + 56), MainMemory.getI32(i8));
/*  758 */         ffxmsg.call(5, 117664);
/*  759 */         ffxmsg.call(5, i45);
/*  760 */         i = MainMemory.getI32(paramInt4);
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label2099:
/*      */         
/*  767 */         i46 = calloc.call(1, 8);
/*  768 */         MainMemory.setI32(paramInt1, i46);
/*  769 */         if (i46 != 0) {
/*      */           break label2186;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  779 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + i51 * 84 + 56), MainMemory.getI32(i8));
/*  780 */         ffxmsg.call(5, 127776);
/*  781 */         ffxmsg.call(5, i45);
/*  782 */         MainMemory.setI32(paramInt4, 113);
/*  783 */         i = 113;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label2186:
/*      */         
/*  790 */         MainMemory.setI32(i46 + 4, calloc.call(1, 1696));
/*  791 */         i53 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/*  792 */         if (i53 != 0) {
/*      */           break label2296;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  802 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + i51 * 84 + 56), MainMemory.getI32(i8));
/*  803 */         ffxmsg.call(5, 127776);
/*  804 */         ffxmsg.call(5, i45);
/*  805 */         free.call(MainMemory.getI32(paramInt1));
/*  806 */         MainMemory.setI32(paramInt1, 0);
/*  807 */         MainMemory.setI32(paramInt4, 113);
/*  808 */         i = 113;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label2296:
/*      */         
/*  815 */         i48 = SystemLibrary.strlen(i45) + 1;
/*  816 */         MainMemory.setI32(i53 + 12, malloc.call(i48 < 32 ? 32 : i48));
/*  817 */         i53 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/*  818 */         if (MainMemory.getI32(i53 + 12) != 0) {
/*      */           break label2444;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  828 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + i51 * 84 + 56), MainMemory.getI32(i8));
/*  829 */         ffxmsg.call(5, 112224);
/*  830 */         ffxmsg.call(5, i45);
/*  831 */         free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/*  832 */         free.call(MainMemory.getI32(paramInt1));
/*  833 */         MainMemory.setI32(paramInt1, 0);
/*  834 */         MainMemory.setI32(paramInt4, 113);
/*  835 */         i = 113;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label2444:
/*      */         
/*  842 */         MainMemory.setI32(i53 + 84, calloc.call(1001, 8));
/*  843 */         i53 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/*  844 */         if (MainMemory.getI32(i53 + 84) != 0) {
/*      */           break label2592;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  854 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + i51 * 84 + 56), MainMemory.getI32(i8));
/*  855 */         ffxmsg.call(5, 125024);
/*  856 */         ffxmsg.call(5, i45);
/*  857 */         free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12));
/*  858 */         free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/*  859 */         free.call(MainMemory.getI32(paramInt1));
/*  860 */         MainMemory.setI32(paramInt1, 0);
/*  861 */         MainMemory.setI32(paramInt4, 113);
/*  862 */         i = 113;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label2592:
/*      */         
/*  869 */         MainMemory.setI32(i53 + 1212, calloc.call(40, 2880));
/*  870 */         i53 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/*  871 */         if (MainMemory.getI32(i53 + 1212) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  876 */           i48 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  883 */           SystemLibrary.do_indirect(MainMemory.getI32(492288 + i51 * 84 + 56), MainMemory.getI32(i8));
/*  884 */           ffxmsg.call(5, 123296);
/*  885 */           ffxmsg.call(5, i45);
/*  886 */           free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 84));
/*  887 */           free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12));
/*  888 */           free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/*  889 */           free.call(MainMemory.getI32(paramInt1));
/*  890 */           MainMemory.setI32(paramInt1, 0);
/*  891 */           MainMemory.setI32(paramInt4, 113);
/*  892 */           i = 113;
/*      */           
/*      */ 
/*      */           break label8335;
/*      */         }
/*      */         
/*      */ 
/*      */         for (;;)
/*      */         {
/*  901 */           MainMemory.setI32(i53 + 1536 + (i48 << 2), i48);
/*  902 */           MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 1216 + (i48 << 2), -1);
/*  903 */           i48 += 1;
/*  904 */           i53 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/*  905 */           if (i48 == 40) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  917 */         MainMemory.setI32(i53 + 80, 1000);
/*  918 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4), MainMemory.getI32(i8));
/*  919 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 4, i51);
/*  920 */         SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12), i45);
/*  921 */         MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 24, MainMemory.getI64(i3));
/*  922 */         MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 32, MainMemory.getI64(i3));
/*  923 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 72, paramInt3);
/*  924 */         MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 112, -1L);
/*  925 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 60, -1);
/*  926 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 8, 1);
/*  927 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 16, 555);
/*  928 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 20, i47);
/*  929 */         ffldrc.call(MainMemory.getI32(paramInt1), 0, 0, paramInt4);
/*  930 */         i54 = MainMemory.getI32(paramInt1);
/*  931 */         i53 = MainMemory.getI32(i54 + 4);
/*  932 */         if (MainMemory.getI32(paramInt4) > 0) {
/*      */           break label3171;
/*      */         } else {
/*  935 */           paramInt3 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  944 */           i55 = 491008 + (paramInt3 << 2);
/*  945 */           if (paramInt3 >= 300) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  955 */           if (MainMemory.getI32(i55) != 0) {
/*      */             break label3157;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  965 */           MainMemory.setI32(i55, i53);
/*  966 */           break;
/*      */           
/*      */           label3157:
/*      */           
/*  970 */           paramInt3 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */         label3171:
/*      */         
/*  976 */         if (ffrhdu.call(i54, i1, paramInt4) <= 0) {
/*      */           break label3271;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  986 */         ffxmsg.call(5, 127904);
/*  987 */         ffxmsg.call(5, i45);
/*  988 */         if (MainMemory.getI32(paramInt4) != 252) {
/*      */           break label3241;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  998 */         ffxmsg.call(5, 86688);
/*      */         
/*      */ 
/*      */         label3241:
/*      */         
/*      */ 
/* 1004 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1005 */         MainMemory.setI32(paramInt1, 0);
/* 1006 */         i = MainMemory.getI32(paramInt4);
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label3271:
/*      */         
/* 1013 */         if (MainMemory.getI8(i13) == 0) {
/* 1014 */           paramInt3 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1024 */           paramInt3 = 1;
/*      */           
/*      */           break label3411;
/*      */           
/*      */           label3303:
/* 1029 */           MainMemory.setI32(paramInt4, 124);
/* 1030 */           ffxmsg.call(5, 109280);
/* 1031 */           ffxmsg.call(5, i45);
/* 1032 */           ffxmsg.call(5, i11);
/* 1033 */           i = MainMemory.getI32(paramInt4);
/*      */           
/*      */ 
/*      */           break label8335;
/*      */           
/*      */           label3343:
/*      */           
/* 1040 */           ffxmsg.call(5, 94048);
/* 1041 */           ffxmsg.call(5, i45);
/* 1042 */           i = MainMemory.getI32(paramInt4);
/*      */           
/*      */ 
/*      */           break label8335;
/*      */           
/*      */           label3371:
/*      */           
/* 1049 */           MainMemory.setI32(paramInt4, 124);
/* 1050 */           ffxmsg.call(5, 104992);
/* 1051 */           ffxmsg.call(5, i11);
/* 1052 */           ffxmsg.call(5, i45);
/* 1053 */           i = MainMemory.getI32(paramInt4);
/*      */           
/*      */           break label8335;
/*      */         }
/*      */       }
/*      */       
/*      */       label3411:
/*      */       
/* 1061 */       if (MainMemory.getI8(i15) != 0) {
/*      */         break label3998;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1071 */       if ((i42 | i41 | i43) != 0) {
/*      */         break label3537;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1081 */       if (MainMemory.getI8(i19) != 0) {
/*      */         break label3537;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1091 */       if (MainMemory.getI8(i22) != 0) {
/*      */         break label3537;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1101 */       if (MainMemory.getI8(i17) != 0) {
/*      */         break label3537;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1111 */       if (MainMemory.getI8(i21) != 0)
/*      */       {
/*      */         label3537:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1121 */         i54 = MainMemory.getI32(paramInt1);
/* 1122 */         if (MainMemory.getI32(i54) != 0) {
/*      */           break label4320;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1132 */         ffgidm.call(i54, i35, paramInt4);
/* 1133 */         if (MathUtils.or((byte)(MainMemory.getI32(i35) == 0 ? 1 : 0), (byte)i42) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1143 */           bool = i42 != 0;
/* 1144 */           i56 = i43 != 0 ? 1 : 0;
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1150 */             i54 = MainMemory.getI32(paramInt1);
/* 1151 */             i43 = MainMemory.getI32(paramInt4);
/* 1152 */             if (i43 <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1163 */               ffmahd.call(i54, MainMemory.getI32(i54) + 2, i1, paramInt4);
/* 1164 */               i43 = MainMemory.getI32(paramInt4);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1172 */             switch (i43)
/*      */             {
/*      */             case 0: 
/*      */               break label3755;
/*      */               
/*      */               break;
/*      */             case 107: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/* 1183 */             MainMemory.setI32(paramInt4, 0);
/*      */             
/*      */             break label3976;
/*      */             
/*      */             label3755:
/* 1188 */             i43 = MainMemory.getI32(i1);
/* 1189 */             i57 = i43 == 0 ? 1 : 0;
/* 1190 */             if (((i57 == 0) || (!bool)) && (
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1200 */               (i43 == 0) || (i56 == 0)))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1210 */               if (i57 == 0) {
/*      */                 break label3869;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1220 */               ffgidm.call(MainMemory.getI32(paramInt1), i35, paramInt4);
/* 1221 */               if (MainMemory.getI32(i35) > 0) {
/*      */                 break;
/*      */               } else {
/*      */                 continue;
/*      */               }
/*      */               
/*      */ 
/*      */               label3869:
/*      */               
/* 1230 */               MainMemory.setI32(i10, 0);
/* 1231 */               MainMemory.setI8(i18, (byte)0);
/* 1232 */               ffgky.call(MainMemory.getI32(paramInt1), 16, 40928, i18, 0, i10);
/* 1233 */               if (SystemLibrary.strstr(i18, 17856) != 0) {}
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1243 */               if (SystemLibrary.strstr(i18, 17888) != 0) {}
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1253 */               if (SystemLibrary.strncasecmp(i18, 45248, 8) != 0) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */           break label3976;
/*      */           break label4320;
/*      */           label3976:
/* 1262 */           ffmahd.call(MainMemory.getI32(paramInt1), 1, i1, paramInt4);
/*      */           
/*      */           break label4320;
/*      */           
/*      */           label3998:
/* 1267 */           i43 = MainMemory.getI32(i6);
/* 1268 */           if (i43 != 0) {
/*      */             break label4044;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1278 */           ffopen_1129.call(paramInt1, paramInt4, i7, i16, i9);
/*      */           
/*      */           break label4064;
/*      */           
/*      */           label4044:
/* 1283 */           ffmahd.call(MainMemory.getI32(paramInt1), i43 + 1, i1, paramInt4);
/*      */           
/*      */ 
/*      */           label4064:
/*      */           
/*      */ 
/* 1289 */           if (MainMemory.getI32(paramInt4) <= 0) {
/*      */             break label4320;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1299 */           ffxmsg.call(5, 114080);
/* 1300 */           if (i43 <= 0) {
/*      */             break label4144;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1310 */           SystemLibrary.sprintf(i39, 127840, new Object[] { Integer.valueOf(i43) });
/* 1311 */           ffxmsg.call(5, i39);
/*      */           
/*      */           break label4290;
/*      */           
/*      */           label4144:
/* 1316 */           SystemLibrary.sprintf(i39, 76032, new Object[] { Integer.valueOf(i16) });
/* 1317 */           ffxmsg.call(5, i39);
/* 1318 */           paramInt3 = MainMemory.getI32(i7);
/* 1319 */           if (paramInt3 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1329 */             SystemLibrary.sprintf(i39, 81056, new Object[] { Integer.valueOf(paramInt3) });
/* 1330 */             ffxmsg.call(5, i39);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1336 */           paramInt3 = MainMemory.getI32(i9);
/* 1337 */           if (paramInt3 != -1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1347 */             SystemLibrary.sprintf(i39, 82976, new Object[] { Integer.valueOf(MainMemory.getI32(i40 + (paramInt3 << 2))) });
/* 1348 */             ffxmsg.call(5, i39);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1354 */           ffxmsg.call(5, 88672);
/*      */           
/*      */ 
/*      */           label4290:
/*      */           
/*      */ 
/* 1360 */           ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1361 */           MainMemory.setI32(paramInt1, 0);
/* 1362 */           i = MainMemory.getI32(paramInt4);
/*      */           
/*      */           break label8335;
/*      */         }
/*      */       }
/*      */       
/*      */       label4320:
/* 1369 */       if (MainMemory.getI8(i19) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1380 */         if ((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (MainMemory.getI8(i20) << 1)) & 0xFFFF & 0x800) != 0) {
/*      */           break label4476;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1390 */         if (ffffrw.call(MainMemory.getI32(paramInt1), i20, i4, paramInt4) <= 0) {
/*      */           break label4460;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1400 */         ffxmsg.call(5, 102752);
/* 1401 */         ffxmsg.call(5, i20);
/* 1402 */         ffxmsg.call(5, 117728);
/* 1403 */         ffxmsg.call(5, i15);
/* 1404 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1405 */         MainMemory.setI32(paramInt1, 0);
/* 1406 */         i = MainMemory.getI32(paramInt4);
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label4460:
/*      */         
/* 1413 */         paramInt3 = MainMemory.getI32(i4);
/*      */         
/*      */         break label4577;
/*      */         
/*      */         label4476:
/*      */         
/* 1419 */         SystemLibrary.sscanf(i20, 17920, new int[] { i4 });
/* 1420 */         paramInt3 = MainMemory.getI32(i4);
/* 1421 */         if (paramInt3 >= 1) {
/*      */           break label4577;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1432 */         ffxmsg.call(5, 77408);
/* 1433 */         ffxmsg.call(5, i20);
/* 1434 */         ffxmsg.call(5, 117728);
/* 1435 */         ffxmsg.call(5, i15);
/* 1436 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1437 */         MainMemory.setI32(paramInt1, 0);
/* 1438 */         MainMemory.setI32(paramInt4, 307);
/* 1439 */         i = 307;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */ 
/*      */         label4577:
/*      */         
/* 1447 */         if (paramInt3 != 0) {
/*      */           break label4654;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1457 */         ffxmsg.call(5, 109344);
/* 1458 */         ffxmsg.call(5, i20);
/* 1459 */         ffxmsg.call(5, 117728);
/* 1460 */         ffxmsg.call(5, i15);
/* 1461 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1462 */         MainMemory.setI32(paramInt1, 0);
/* 1463 */         MainMemory.setI32(paramInt4, 307);
/* 1464 */         i = 307;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label4654:
/*      */         
/* 1471 */         if (MainMemory.getI8(i24) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1481 */           if (MainMemory.getI8(i23) != 0) {
/*      */             break label4711;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1491 */           SystemLibrary.strcpy(i13, i24);
/*      */           
/*      */           break label4726;
/*      */         }
/*      */         label4711:
/* 1496 */         SystemLibrary.memcpy(i13, 45280, 9, 1);
/*      */         
/*      */ 
/*      */         label4726:
/*      */         
/*      */ 
/* 1502 */         if (ffinit.call(n, i13, paramInt4) <= 0) {
/*      */           break label4778;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1512 */         ffxmsg.call(5, 123360);
/* 1513 */         ffxmsg.call(5, i13);
/* 1514 */         i = MainMemory.getI32(paramInt4);
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label4778:
/*      */         
/* 1521 */         if (fits_copy_cell2image.call(MainMemory.getI32(paramInt1), MainMemory.getI32(n), i19, MainMemory.getI32(i4), paramInt4) <= 0) {
/*      */           break label4856;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1531 */         ffxmsg.call(5, 109408);
/* 1532 */         ffxmsg.call(5, i15);
/* 1533 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1534 */         MainMemory.setI32(paramInt1, 0);
/* 1535 */         i = MainMemory.getI32(paramInt4);
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label4856:
/*      */         
/* 1542 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1543 */         MainMemory.setI32(paramInt1, MainMemory.getI32(n));
/* 1544 */         paramInt3 = 1;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/* 1551 */         if (MainMemory.getI8(i22) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1562 */           if (paramInt3 != 0) {
/*      */             break label4927;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1573 */           paramInt3 = fits_is_this_a_copy.call(i11);
/*      */           
/*      */ 
/*      */ 
/*      */           label4927:
/*      */           
/*      */ 
/*      */ 
/* 1581 */           if (paramInt3 != 0) {
/*      */             break label5025;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1591 */           if (MainMemory.getI8(i25) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1601 */             if (MainMemory.getI8(i13) != 0) {
/*      */               break label5003;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1611 */             SystemLibrary.strcpy(i13, i25);
/* 1612 */             paramInt3 = 1;
/*      */             
/*      */             break label5052;
/*      */           }
/*      */           label5003:
/* 1617 */           SystemLibrary.memcpy(i13, 45280, 9, 1);
/* 1618 */           paramInt3 = 1;
/*      */           
/*      */           break label5052;
/*      */           
/*      */           label5025:
/* 1623 */           MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 72, 1);
/* 1624 */           MainMemory.setI8(i13, (byte)0);
/*      */           
/*      */ 
/*      */ 
/*      */           label5052:
/*      */           
/*      */ 
/*      */ 
/* 1632 */           if (ffedit_columns.call(paramInt1, i13, i22, paramInt4) <= 0) {
/*      */             break label5125;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1643 */           ffxmsg.call(5, 107360);
/* 1644 */           ffxmsg.call(5, 114144);
/* 1645 */           ffxmsg.call(5, i22);
/* 1646 */           ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1647 */           MainMemory.setI32(paramInt1, 0);
/* 1648 */           i = MainMemory.getI32(paramInt4);
/*      */           
/*      */ 
/*      */           break label8335;
/*      */         }
/*      */         
/*      */         label5125:
/*      */         
/* 1656 */         if (MainMemory.getI8(i17) == 0) {
/* 1657 */           i45 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1667 */           ffghdt.call(MainMemory.getI32(paramInt1), i1, paramInt4);
/* 1668 */           if (MainMemory.getI32(i1) != 0) {
/*      */             break label5324;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1678 */           bool = MainMemory.getI8(i13) == 0;
/* 1679 */           if ((MainMemory.getI8(i25) == 0) || (!bool)) {
/*      */             break label5236;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1689 */           SystemLibrary.strcpy(i13, i25);
/*      */           
/*      */           break label5248;
/*      */           
/*      */           label5236:
/* 1694 */           ffopen_1128.call(i13, bool);
/*      */           
/*      */ 
/*      */           label5248:
/*      */           
/*      */ 
/* 1700 */           if (fits_select_image_section.call(paramInt1, i13, i17, paramInt4) <= 0)
/*      */           {
/*      */ 
/*      */ 
/* 1704 */             i45 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1711 */             ffxmsg.call(5, 121696);
/* 1712 */             ffxmsg.call(5, 115808);
/* 1713 */             ffxmsg.call(5, i17);
/* 1714 */             ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1715 */             MainMemory.setI32(paramInt1, 0);
/* 1716 */             i = MainMemory.getI32(paramInt4);
/*      */             
/*      */ 
/*      */             break label8335;
/*      */             
/*      */             label5324:
/*      */             
/* 1723 */             if (MainMemory.getI8(i21) != 0) {
/*      */               break label5884;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1733 */             if (paramInt3 != 0) {
/*      */               break label5377;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1744 */             paramInt3 = fits_is_this_a_copy.call(i11);
/*      */             
/*      */ 
/*      */ 
/*      */             label5377:
/*      */             
/*      */ 
/*      */ 
/* 1752 */             if (paramInt3 != 0) {
/*      */               break label5478;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1762 */             bool = MainMemory.getI8(i13) == 0;
/* 1763 */             if ((MainMemory.getI8(i25) == 0) || (!bool)) {
/*      */               break label5459;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1773 */             SystemLibrary.strcpy(i13, i25);
/*      */             
/*      */             break label5506;
/*      */             
/*      */             label5459:
/* 1778 */             ffopen_1131.call(i13, bool);
/*      */             
/*      */             break label5506;
/*      */             
/*      */             label5478:
/* 1783 */             MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 72, 1);
/* 1784 */             MainMemory.setI8(i13, (byte)0);
/*      */             
/*      */ 
/*      */             label5506:
/*      */             
/*      */ 
/* 1790 */             if (ffselect_table.call(paramInt1, i13, i17, paramInt4) <= 0) {
/*      */               break label5584;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1800 */             ffxmsg.call(5, 130272);
/* 1801 */             ffxmsg.call(5, 125088);
/* 1802 */             ffxmsg.call(5, i17);
/* 1803 */             ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 1804 */             MainMemory.setI32(paramInt1, 0);
/* 1805 */             i = MainMemory.getI32(paramInt4);
/*      */             
/*      */ 
/*      */             break label8335;
/*      */             
/*      */             label5584:
/*      */             
/* 1812 */             i54 = MainMemory.getI32(paramInt1);
/* 1813 */             paramInt3 = MainMemory.getI32(paramInt4);
/* 1814 */             if (paramInt3 <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1826 */               i43 = SystemLibrary.strlen(138720);
/* 1827 */               if (i43 <= 0) {
/*      */                 break label5744;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1839 */               paramInt3 = i43 + -72;
/* 1840 */               i43 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1847 */                 i45 = 138720 + i43 * 72;
/* 1848 */                 SystemLibrary.memcpy(j, 44032, 9, 1);
/* 1849 */                 SystemLibrary.strncat(j, i45, 72);
/* 1850 */                 ffprec.call(i54, j, paramInt4);
/* 1851 */                 i42 = i43 + 1;
/* 1852 */                 if (paramInt3 + i43 * -72 <= 0) break;
/* 1853 */                 i43 = i42;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1863 */               paramInt3 = MainMemory.getI32(paramInt4);
/* 1864 */               i54 = MainMemory.getI32(paramInt1);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label5744:
/*      */             
/*      */ 
/*      */ 
/* 1874 */             if (paramInt3 > 0) {
/* 1875 */               i45 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1885 */               paramInt3 = SystemLibrary.strlen(paramInt2);
/* 1886 */               if (paramInt3 <= 0)
/*      */               {
/*      */ 
/*      */ 
/* 1890 */                 i45 = 0;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 1897 */                 paramInt3 += -72;
/* 1898 */                 i43 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 1905 */                   i45 = paramInt2 + i43 * 72;
/* 1906 */                   SystemLibrary.memcpy(j, 44032, 9, 1);
/* 1907 */                   SystemLibrary.strncat(j, i45, 72);
/* 1908 */                   ffprec.call(i54, j, paramInt4);
/* 1909 */                   i42 = i43 + 1;
/* 1910 */                   if (paramInt3 + i43 * -72 <= 0) break;
/* 1911 */                   i43 = i42;
/*      */                 }
/*      */                 break label5884;
/* 1914 */                 i45 = 0;
/*      */                 
/*      */ 
/*      */                 break label6277;
/*      */                 
/*      */                 label5884:
/*      */                 
/* 1921 */                 i54 = MainMemory.getI32(paramInt1);
/* 1922 */                 if (MainMemory.getI32(paramInt4) > 0) {
/* 1923 */                   paramInt3 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1933 */                   paramInt3 = MainMemory.getI32(i54);
/* 1934 */                   i55 = i54 + 4;
/* 1935 */                   i53 = MainMemory.getI32(i55);
/* 1936 */                   if (paramInt3 != MainMemory.getI32(i53 + 64)) {
/*      */                     break label6019;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1946 */                   if (MainMemory.getI64(i53 + 112) != -1L) {
/*      */                     break label6036;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1956 */                   if (ffrdef.call(i54, paramInt4) > 0) {
/* 1957 */                     paramInt3 = 0;
/*      */                     
/*      */                     break label6107;
/*      */                   }
/*      */                   else
/*      */                   {
/*      */                     break label6036;
/*      */                   }
/*      */                   label6019:
/* 1966 */                   ffmahd.call(i54, paramInt3 + 1, 0, paramInt4);
/*      */                   
/*      */ 
/*      */                   label6036:
/*      */                   
/*      */ 
/* 1972 */                   i53 = MainMemory.getI32(i55);
/* 1973 */                   if (MainMemory.getI32(i53 + 68) != 0) {
/*      */                     break label6090;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1983 */                   MainMemory.setI32(paramInt4, 235);
/* 1984 */                   paramInt3 = 0;
/*      */                   
/*      */                   break label6107;
/*      */                   
/*      */                   label6090:
/* 1989 */                   paramInt3 = (int)MainMemory.getI64(i53 + 928);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label6107:
/*      */                 
/*      */ 
/* 1997 */                 i45 = calloc.call(paramInt3, 1);
/* 1998 */                 if (i45 != 0) {
/*      */                   break label6189;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2008 */                 ffxmsg.call(5, 132320);
/* 2009 */                 ffxmsg.call(5, 125088);
/* 2010 */                 ffxmsg.call(5, i17);
/* 2011 */                 ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 2012 */                 MainMemory.setI32(paramInt1, 0);
/* 2013 */                 MainMemory.setI32(paramInt4, 113);
/* 2014 */                 i = 113;
/*      */                 
/*      */ 
/*      */                 break label8335;
/*      */                 
/*      */                 label6189:
/*      */                 
/* 2021 */                 if (fffrow.call(MainMemory.getI32(paramInt1), i17, paramInt3, i5, i45, paramInt4) <= 0) {
/*      */                   break label6277;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2032 */                 ffxmsg.call(5, 112288);
/* 2033 */                 ffxmsg.call(5, 125088);
/* 2034 */                 ffxmsg.call(5, i17);
/* 2035 */                 free.call(i45);
/* 2036 */                 ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 2037 */                 MainMemory.setI32(paramInt1, 0);
/* 2038 */                 i = MainMemory.getI32(paramInt4);
/*      */                 
/*      */                 break label8335;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */         label6277:
/* 2046 */         if (MainMemory.getI8(i21) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2056 */           if (MainMemory.getI8(i24) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2066 */             if (MainMemory.getI8(i23) != 0) {
/*      */               break label6359;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2076 */             SystemLibrary.strcpy(i13, i24);
/*      */             
/*      */             break label6376;
/*      */           }
/*      */           label6359:
/* 2081 */           SystemLibrary.memcpy(i13, 45344, 9, 1);
/*      */           
/*      */ 
/*      */           label6376:
/*      */           
/*      */ 
/* 2087 */           ffbins.call(i21, i34, i36, i38, i30, i31, i32, i27, i28, i29, i33, i26, i37, paramInt4);
/* 2088 */           ffhist2.call(paramInt1, i13, MainMemory.getI32(i34), MainMemory.getI32(i36), i38, i30, i31, i32, i27, i28, i29, MainMemory.getF64(i33), i26, MainMemory.getI32(i37), i45, paramInt4);
/* 2089 */           if (i45 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2099 */             free.call(i45);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 2105 */           paramInt3 = MainMemory.getI32(paramInt4);
/* 2106 */           if (paramInt3 <= 0) {
/*      */             break label6554;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2116 */           ffxmsg.call(5, 125152);
/* 2117 */           ffxmsg.call(5, 134048);
/* 2118 */           ffxmsg.call(5, i21);
/* 2119 */           ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 2120 */           MainMemory.setI32(paramInt1, 0);
/* 2121 */           i = MainMemory.getI32(paramInt4);
/*      */           
/*      */ 
/*      */           break label8335;
/*      */           
/*      */           label6554:
/*      */           
/* 2128 */           i54 = MainMemory.getI32(paramInt1);
/* 2129 */           i43 = SystemLibrary.strlen(134112);
/* 2130 */           if (i43 <= 0) {
/*      */             break label6693;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2142 */           paramInt3 = i43 + -72;
/* 2143 */           i43 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2150 */             i45 = 134112 + i43 * 72;
/* 2151 */             SystemLibrary.memcpy(j, 44032, 9, 1);
/* 2152 */             SystemLibrary.strncat(j, i45, 72);
/* 2153 */             ffprec.call(i54, j, paramInt4);
/* 2154 */             i42 = i43 + 1;
/* 2155 */             if (paramInt3 + i43 * -72 <= 0) break;
/* 2156 */             i43 = i42;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2166 */           paramInt3 = MainMemory.getI32(paramInt4);
/* 2167 */           i54 = MainMemory.getI32(paramInt1);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label6693:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 2177 */           if (paramInt3 <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2187 */             ffopen_1127.call(paramInt4, paramInt2, i54, j);
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/* 2193 */         if (MainMemory.getI8(i23) != 0) {
/*      */           break label6764;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2203 */         i = MainMemory.getI32(paramInt4);
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label6764:
/*      */         
/* 2210 */         if (MainMemory.getI8(i24) != 0) {
/*      */           break label6810;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2220 */         SystemLibrary.memcpy(i13, 45376, 9, 1);
/*      */         
/*      */         break label6824;
/*      */         
/*      */         label6810:
/* 2225 */         SystemLibrary.strcpy(i13, i24);
/*      */         
/*      */ 
/*      */         label6824:
/*      */         
/*      */ 
/* 2231 */         ffghdt.call(MainMemory.getI32(paramInt1), i1, paramInt4);
/* 2232 */         if (MainMemory.getI32(i1) != 0) {
/*      */           break label8290;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2242 */         SystemLibrary.memset(k, (byte)0, 180, 8);
/* 2243 */         MainMemory.setI32(m, 13536);
/* 2244 */         MainMemory.setI32(k, 1);
/* 2245 */         MainMemory.setI32(k + 12, paramInt1);
/* 2246 */         MainMemory.setI32(k + 8, m);
/* 2247 */         n = k + 28;
/* 2248 */         if (ffinit.call(n, i13, paramInt4) <= 0) {
/*      */           break label6959;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2258 */         ffxmsg.call(5, 107296);
/* 2259 */         ffxmsg.call(5, i13);
/*      */         
/*      */         break label7917;
/*      */         
/*      */         label6959:
/* 2264 */         i54 = MainMemory.getI32(paramInt1);
/* 2265 */         i43 = MainMemory.getI32(i54);
/* 2266 */         paramInt3 = i43 + 1;
/* 2267 */         i45 = i23 + 3;
/* 2268 */         switch (MainMemory.getI8(i45)) {
/*      */         case 66: 
/*      */           break label7256;
/*      */           break;
/*      */         case 68: 
/*      */           break label7234;
/*      */           break;
/*      */         case 73: 
/*      */           break label7212;
/*      */           break;
/*      */         case 74: 
/*      */           break label7190;
/*      */           break;
/*      */         case 82: 
/*      */           break;
/*      */         case 98:  break label7256;
/*      */           break; case 100:  break label7234;
/*      */           break; case 105:  break label7212;
/*      */           break; case 106:  break label7190;
/*      */           break; case 114:  break; }
/* 2288 */         MainMemory.setI32(k + 20, -32);
/*      */         
/*      */         break label7301;
/*      */         
/*      */         label7190:
/* 2293 */         MainMemory.setI32(k + 20, 32);
/*      */         
/*      */         break label7301;
/*      */         
/*      */         label7212:
/* 2298 */         MainMemory.setI32(k + 20, 16);
/*      */         
/*      */         break label7301;
/*      */         
/*      */         label7234:
/* 2303 */         MainMemory.setI32(k + 20, -64);
/*      */         
/*      */         break label7301;
/*      */         
/*      */         label7256:
/* 2308 */         MainMemory.setI32(k + 20, 8);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2313 */         if (MainMemory.getI32(k + 20) != 0) {
/*      */           label7301:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2324 */           i45 = i23 + 4;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2332 */         if (MainMemory.getI8(i45) != 49)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2337 */           i42 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2344 */           i45 += 1;
/*      */           
/* 2346 */           i42 = 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2354 */         i41 = MainMemory.getI32(MainMemory.getI32(i54 + 4) + 20);
/* 2355 */         i44 = MainMemory.getI8(i45);
/* 2356 */         if (i44 != 32)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2367 */           ffxmsg.call(5, 109216);
/* 2368 */           ffxmsg.call(5, i45);
/* 2369 */           i44 = MainMemory.getI8(i45);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2377 */         if (i44 == 32) {
/* 2378 */           i47 = 0;
/*      */         } else {
/*      */           break label7490;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2390 */           i47 += 1;
/* 2391 */           i46 = i45 + i47;
/* 2392 */           if (MainMemory.getI8(i46) != 32)
/*      */             break;
/*      */         }
/*      */         break label7490;
/* 2396 */         i45 = i46;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label7490:
/*      */         
/*      */ 
/*      */ 
/* 2405 */         bool = (i41 | i42) == 0;
/* 2406 */         if (bool) {
/* 2407 */           i42 = 1;
/*      */         } else {
/*      */           break label7632;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2418 */           if (i42 >= paramInt3) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2428 */           ffmahd.call(MainMemory.getI32(paramInt1), i42, 0, paramInt4);
/* 2429 */           if (ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(n), paramInt4) <= 0) {
/*      */             break label7614;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2439 */           ffclos.call(MainMemory.getI32(n), paramInt4);
/*      */           
/*      */           break label7917;
/*      */           
/*      */           label7614:
/* 2444 */           i42 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */         label7632:
/*      */         
/* 2450 */         ffmahd.call(MainMemory.getI32(paramInt1), paramInt3, 0, paramInt4);
/* 2451 */         MainMemory.setI32(k + 16, i45);
/* 2452 */         if (fits_pixel_filter.call(k, paramInt4) != 0) {
/*      */           break label7888;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2462 */         i43 += 2;
/* 2463 */         i42 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2470 */           if (!bool) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2480 */           if (ffmahd.call(MainMemory.getI32(paramInt1), i43 + i42, 0, paramInt4) > 0) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2490 */           ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(n), paramInt4);
/* 2491 */           i42 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2497 */         i43 = paramInt3 + i42;
/* 2498 */         i42 = MainMemory.getI32(paramInt4);
/* 2499 */         if (i42 != 107) {
/*      */           break label7824;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2509 */         MainMemory.setI32(paramInt4, 0);
/*      */         
/*      */         break label7866;
/*      */         
/*      */         label7824:
/* 2514 */         if (i42 <= 0) {
/*      */           break label7866;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2524 */         ffclos.call(MainMemory.getI32(n), paramInt4);
/*      */         
/*      */         break label7917;
/*      */         
/*      */         label7866:
/* 2529 */         ffopen_1130.call(paramInt1, paramInt4, i43, n, paramInt3);
/*      */         
/*      */         break label7917;
/*      */         
/*      */         label7888:
/* 2534 */         ffxmsg.call(5, 78688);
/* 2535 */         ffxmsg.call(5, i45);
/* 2536 */         ffclos.call(MainMemory.getI32(n), paramInt4);
/*      */         
/*      */ 
/*      */         label7917:
/*      */         
/*      */ 
/* 2542 */         paramInt3 = MainMemory.getI32(paramInt4);
/* 2543 */         if (paramInt3 <= 0) {
/*      */           break label7992;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2553 */         ffxmsg.call(5, 107424);
/* 2554 */         ffxmsg.call(5, 92256);
/* 2555 */         ffxmsg.call(5, i23);
/* 2556 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 2557 */         MainMemory.setI32(paramInt1, 0);
/* 2558 */         i = MainMemory.getI32(paramInt4);
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label7992:
/*      */         
/* 2565 */         i54 = MainMemory.getI32(paramInt1);
/* 2566 */         i43 = SystemLibrary.strlen(130336);
/* 2567 */         if (i43 <= 0) {
/*      */           break label8131;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2579 */         paramInt3 = i43 + -72;
/* 2580 */         i43 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2587 */           i45 = 130336 + i43 * 72;
/* 2588 */           SystemLibrary.memcpy(j, 44032, 9, 1);
/* 2589 */           SystemLibrary.strncat(j, i45, 72);
/* 2590 */           ffprec.call(i54, j, paramInt4);
/* 2591 */           i42 = i43 + 1;
/* 2592 */           if (paramInt3 + i43 * -72 <= 0) break;
/* 2593 */           i43 = i42;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2603 */         paramInt3 = MainMemory.getI32(paramInt4);
/* 2604 */         i54 = MainMemory.getI32(paramInt1);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label8131:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2614 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2624 */           i43 = SystemLibrary.strlen(paramInt2);
/* 2625 */           if (i43 <= 0) {
/*      */             break label8276;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2635 */           paramInt3 = i43 + -72;
/* 2636 */           i43 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2643 */             i45 = paramInt2 + i43 * 72;
/* 2644 */             SystemLibrary.memcpy(j, 44032, 9, 1);
/* 2645 */             SystemLibrary.strncat(j, i45, 72);
/* 2646 */             ffprec.call(i54, j, paramInt4);
/* 2647 */             i42 = i43 + 1;
/* 2648 */             if (paramInt3 + i43 * -72 <= 0) break;
/* 2649 */             i43 = i42;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2659 */           i = MainMemory.getI32(paramInt4);
/*      */           
/*      */           break label8335;
/*      */         }
/*      */         
/*      */         label8276:
/*      */         
/* 2666 */         i = paramInt3;
/*      */         
/*      */ 
/*      */         break label8335;
/*      */         
/*      */         label8290:
/*      */         
/* 2673 */         ffxmsg.call(5, 94112);
/* 2674 */         ffxmsg.call(5, i23);
/* 2675 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 2676 */         MainMemory.setI32(paramInt1, 0);
/* 2677 */         MainMemory.setI32(paramInt4, 233);
/* 2678 */         i = 233;
/*      */       }
/*      */       
/*      */ 
/*      */       label8335:
/*      */       
/* 2684 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 2689 */       MainMemory.dealloc_generated(i58);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffopen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */