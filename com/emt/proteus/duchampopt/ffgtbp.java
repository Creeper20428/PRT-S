/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgtbp
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3256;
/*  19 */   public static final Function _instance = new ffgtbp();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public ffgtbp() { super("ffgtbp", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  26 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  27 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i, j, k, m);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     int i6 = 0;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*  66 */     int i11 = 0;
/*  67 */     int i12 = 0;
/*  68 */     int i13 = 0;
/*  69 */     int i14 = 0;
/*  70 */     long l = 0L;
/*     */     
/*     */ 
/*  73 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  77 */       i = MainMemory.alloc(4);
/*  78 */       j = MainMemory.alloc(4);
/*  79 */       k = MainMemory.alloc(4);
/*  80 */       m = MainMemory.alloc(4);
/*  81 */       n = MainMemory.alloc(4);
/*  82 */       i1 = MainMemory.alloc(4);
/*  83 */       i2 = MainMemory.alloc(4);
/*  84 */       i3 = MainMemory.alloc(8);
/*  85 */       i4 = MainMemory.alloc(8);
/*  86 */       i5 = MainMemory.alloc(71);
/*  87 */       i6 = MainMemory.alloc(4);
/*  88 */       i7 = MainMemory.alloc(81);
/*  89 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         MainMemory.setI32(i, 0);
/* 100 */         i8 = MainMemory.getI32(paramInt1);
/* 101 */         i9 = paramInt1 + 4;
/* 102 */         if (i8 != MainMemory.getI32(MainMemory.getI32(i9) + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */           ffmahd.call(paramInt1, i8 + 1, 0, paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 118 */         i10 = paramInt2 + 1;
/* 119 */         i11 = MainMemory.getI8(i10);
/* 120 */         switch (i11) {
/*     */         case 84: 
/*     */           break;
/*     */         case 70: 
/*     */           break label756;
/*     */           break;
/*     */         case 66: 
/*     */           break label1356;
/*     */           break;
/*     */         case 83: 
/*     */           break label1692;
/*     */           break;
/*     */         case 90:  break label1984;
/*     */           break; case 78:  break label2260;
/*     */           break; case 68:  break label2620;
/*     */           break; case 72:  break label2978;
/*     */           break; }
/* 137 */         if (SystemLibrary.strncmp(i10, 21792, 4) != 0) {
/*     */           break label577;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         if (ffc2ii.call(paramInt2 + 5, i1, i) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */           i8 = MainMemory.getI32(i1);
/* 158 */           if (i8 >= 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */             i12 = MainMemory.getI32(i9);
/* 169 */             if (MainMemory.getI32(i12 + 916) >= i8)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */               i13 = MainMemory.getI32(i12 + 944);
/* 180 */               if (ffc2s.call(paramInt3, i5, i) <= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */                 SystemLibrary.strcpy(i13 + (i8 + -1) * 152, i5);
/*     */                 
/*     */ 
/*     */                 break label3126;
/*     */                 
/*     */                 label577:
/*     */                 
/* 197 */                 switch (i11) {
/*     */                 case 70: 
/*     */                   break;
/*     */                 case 66: 
/*     */                   break label1356;
/*     */                   break;
/*     */                 case 83: 
/*     */                   break label1692;
/*     */                   break;
/*     */                 case 90: 
/*     */                   break label1984;
/*     */                   break; case 78:  break label2260;
/*     */                   break; case 68:  break label2620;
/*     */                   break; case 72:  break label2978;
/*     */                   break; }
/*     */                 label756:
/* 213 */                 if (SystemLibrary.strncmp(i10, 21760, 4) != 0) {
/*     */                   break label1242;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */                 if (ffc2ii.call(paramInt2 + 5, i1, i) <= 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */                   i8 = MainMemory.getI32(i1);
/* 234 */                   if (i8 >= 1)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */                     i12 = MainMemory.getI32(i9);
/* 245 */                     if (MainMemory.getI32(i12 + 916) >= i8)
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */                       i13 = MainMemory.getI32(i12 + 944);
/* 256 */                       i8 += -1;
/* 257 */                       if (ffc2s.call(paramInt3, i5, i) <= 0)
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */                         SystemLibrary.strncpy(i13 + i8 * 152 + 136, i5, 9);
/* 268 */                         MainMemory.setI8(i13 + i8 * 152 + 136 + 9, (byte)0);
/* 269 */                         if (MainMemory.getI32(MainMemory.getI32(i9) + 68) != 1) {
/*     */                           break label1054;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */                         if (ffasfm.call(i5, j, m, k, paramInt4) <= 0)
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */                           MainMemory.setI32(i13 + i8 * 152 + 80, 16);
/* 290 */                           MainMemory.setI64(i13 + i8 * 152 + 84, 1L);
/* 291 */                           MainMemory.setI32(i13 + i8 * 152 + 148, MainMemory.getI32(m));
/*     */                           
/*     */ 
/*     */                           break label3126;
/*     */                           
/*     */                           label1054:
/*     */                           
/* 298 */                           if (ffbnfm.call(i5, j, n, m, paramInt4) <= 0)
/*     */                           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */                             MainMemory.setI32(i13 + i8 * 152 + 80, MainMemory.getI32(j));
/* 309 */                             i14 = MainMemory.getI32(n);
/* 310 */                             MainMemory.setI64(i13 + i8 * 152 + 84, i14);
/* 311 */                             if (MainMemory.getI32(j) != 16) {
/*     */                               break label1211;
/*     */                             }
/*     */                             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */                             paramInt4 = i13 + i8 * 152 + 148;
/* 322 */                             i8 = MainMemory.getI32(paramInt4);
/* 323 */                             if ((i8 != 0) && (i8 <= i14)) {
/*     */                               break label3121;
/*     */                             }
/*     */                             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */                             MainMemory.setI32(paramInt4, MainMemory.getI32(m));
/*     */                             
/*     */ 
/*     */                             break label3126;
/*     */                             
/*     */                             label1211:
/*     */                             
/* 340 */                             MainMemory.setI32(i13 + i8 * 152 + 148, MainMemory.getI32(m));
/*     */                             
/*     */ 
/*     */                             break label3126;
/*     */                             
/*     */                             label1242:
/*     */                             
/* 347 */                             switch (i11) {
/*     */                             case 66: 
/*     */                               break;
/*     */                             case 83: 
/*     */                               break label1692;
/*     */                               break;
/*     */                             case 90: 
/*     */                               break label1984;
/*     */                               break;
/*     */                             case 78: 
/*     */                               break label2260;
/*     */                               break; case 68:  break label2620;
/*     */                               break; case 72:  break label2978;
/*     */                               break; }
/*     */                             label1356:
/* 362 */                             if (SystemLibrary.strncmp(i10, 21728, 4) != 0) {
/*     */                               break label1595;
/*     */                             }
/*     */                             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */                             if (ffc2ii.call(paramInt2 + 5, i1, i) <= 0)
/*     */                             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */                               i8 = MainMemory.getI32(i1);
/* 383 */                               if (i8 >= 1)
/*     */                               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */                                 i12 = MainMemory.getI32(i9);
/* 394 */                                 if (MainMemory.getI32(i12 + 916) >= i8)
/*     */                                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */                                   i13 = MainMemory.getI32(i12 + 944);
/* 405 */                                   i8 += -1;
/* 406 */                                   if (MainMemory.getI32(i12 + 68) != 2)
/*     */                                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */                                     if (ffc2ii.call(paramInt3, i2, paramInt4) <= 0) {
/*     */                                       break label1562;
/*     */                                     }
/*     */                                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */                                     SystemLibrary.sprintf(i7, 99168, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
/* 427 */                                     ffxmsg.call(5, i7);
/*     */                                     
/*     */ 
/*     */                                     break label3126;
/*     */                                     
/*     */                                     label1562:
/*     */                                     
/* 434 */                                     MainMemory.setI64(i13 + i8 * 152 + 72, MainMemory.getI32(i2) + -1);
/*     */                                     
/*     */ 
/*     */                                     break label3126;
/*     */                                     
/*     */                                     label1595:
/*     */                                     
/* 441 */                                     switch (i11) {
/*     */                                     case 83: 
/*     */                                       break;
/*     */                                     case 90: 
/*     */                                       break label1984;
/*     */                                       break;
/*     */                                     case 78: 
/*     */                                       break label2260;
/*     */                                       break;
/*     */                                     case 68: 
/*     */                                       break label2620;
/*     */                                       break; case 72:  break label2978;
/*     */                                       break; }
/*     */                                     label1692:
/* 455 */                                     if (SystemLibrary.strncmp(i10, 21824, 4) != 0) {
/*     */                                       break label1903;
/*     */                                     }
/*     */                                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */                                     if (ffc2ii.call(paramInt2 + 5, i1, i) <= 0)
/*     */                                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 475 */                                       i8 = MainMemory.getI32(i1);
/* 476 */                                       if (i8 >= 1)
/*     */                                       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */                                         i12 = MainMemory.getI32(i9);
/* 487 */                                         if (MainMemory.getI32(i12 + 916) >= i8)
/*     */                                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 497 */                                           i13 = MainMemory.getI32(i12 + 944);
/* 498 */                                           if (ffc2dd.call(paramInt3, i4, i) <= 0) {
/*     */                                             break label1871;
/*     */                                           }
/*     */                                           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 508 */                                           SystemLibrary.sprintf(i7, 94944, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
/* 509 */                                           ffxmsg.call(5, i7);
/*     */                                           
/*     */ 
/*     */                                           break label3126;
/*     */                                           
/*     */                                           label1871:
/*     */                                           
/* 516 */                                           MainMemory.setF64(i13 + (i8 + -1) * 152 + 92, MainMemory.getF64(i4));
/*     */                                           
/*     */ 
/*     */                                           break label3126;
/*     */                                           
/*     */                                           label1903:
/*     */                                           
/* 523 */                                           switch (i11) {
/*     */                                           case 90: 
/*     */                                             break;
/*     */                                           case 78: 
/*     */                                             break label2260;
/*     */                                             break;
/*     */                                           case 68: 
/*     */                                             break label2620;
/*     */                                             break;
/*     */                                           case 72: 
/*     */                                             break label2978;
/*     */                                             break; }
/*     */                                           label1984:
/* 536 */                                           if (SystemLibrary.strncmp(i10, 21920, 4) != 0) {
/*     */                                             break label2195;
/*     */                                           }
/*     */                                           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 546 */                                           if (ffc2ii.call(paramInt2 + 5, i1, i) <= 0)
/*     */                                           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 556 */                                             i8 = MainMemory.getI32(i1);
/* 557 */                                             if (i8 >= 1)
/*     */                                             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */                                               i12 = MainMemory.getI32(i9);
/* 568 */                                               if (MainMemory.getI32(i12 + 916) >= i8)
/*     */                                               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 578 */                                                 i13 = MainMemory.getI32(i12 + 944);
/* 579 */                                                 if (ffc2dd.call(paramInt3, i4, i) <= 0) {
/*     */                                                   break label2163;
/*     */                                                 }
/*     */                                                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */                                                 SystemLibrary.sprintf(i7, 94944, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
/* 590 */                                                 ffxmsg.call(5, i7);
/*     */                                                 
/*     */ 
/*     */                                                 break label3126;
/*     */                                                 
/*     */                                                 label2163:
/*     */                                                 
/* 597 */                                                 MainMemory.setF64(i13 + (i8 + -1) * 152 + 100, MainMemory.getF64(i4));
/*     */                                                 
/*     */ 
/*     */                                                 break label3126;
/*     */                                                 
/*     */                                                 label2195:
/*     */                                                 
/* 604 */                                                 switch (i11)
/*     */                                                 {
/*     */                                                 case 78: 
/*     */                                                   break;
/*     */                                                 case 68: 
/*     */                                                   break label2620;
/*     */                                                   break;
/*     */                                                 case 72: 
/*     */                                                   break label2978;
/*     */                                                   break;
/*     */                                                 }
/*     */                                                 label2260:
/* 616 */                                                 if (SystemLibrary.strncmp(i10, 19264, 4) != 0) {
/*     */                                                   break label2570;
/*     */                                                 }
/*     */                                                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 626 */                                                 if (ffc2ii.call(paramInt2 + 5, i1, i) <= 0)
/*     */                                                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 636 */                                                   i8 = MainMemory.getI32(i1);
/* 637 */                                                   if (i8 >= 1)
/*     */                                                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 647 */                                                     i12 = MainMemory.getI32(i9);
/* 648 */                                                     if (MainMemory.getI32(i12 + 916) >= i8)
/*     */                                                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 658 */                                                       i13 = MainMemory.getI32(i12 + 944);
/* 659 */                                                       i8 += -1;
/* 660 */                                                       if (MainMemory.getI32(i12 + 68) != 1) {
/*     */                                                         break label2474;
/*     */                                                       }
/*     */                                                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 670 */                                                       if (ffc2s.call(paramInt3, i5, i) <= 0)
/*     */                                                       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 680 */                                                         SystemLibrary.strncpy(i13 + i8 * 152 + 116, i5, 17);
/* 681 */                                                         MainMemory.setI8(i13 + i8 * 152 + 116 + 17, (byte)0);
/*     */                                                         
/*     */ 
/*     */                                                         break label3126;
/*     */                                                         
/*     */                                                         label2474:
/*     */                                                         
/* 688 */                                                         if (ffc2jj.call(paramInt3, i3, i) <= 0) {
/*     */                                                           break label2540;
/*     */                                                         }
/*     */                                                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 698 */                                                         SystemLibrary.sprintf(i7, 99168, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
/* 699 */                                                         ffxmsg.call(5, i7);
/*     */                                                         
/*     */ 
/*     */                                                         break label3126;
/*     */                                                         
/*     */                                                         label2540:
/*     */                                                         
/* 706 */                                                         MainMemory.setI64(i13 + i8 * 152 + 108, MainMemory.getI64(i3));
/*     */                                                         
/*     */ 
/*     */                                                         break label3126;
/*     */                                                         
/*     */                                                         label2570:
/*     */                                                         
/* 713 */                                                         switch (i11)
/*     */                                                         {
/*     */                                                         case 68: 
/*     */                                                           break;
/*     */                                                         case 72: 
/*     */                                                           break label2978;
/*     */                                                           
/*     */                                                           break;
/*     */                                                         }
/*     */                                                         
/*     */                                                         label2620:
/* 724 */                                                         if (SystemLibrary.strncmp(i10, 16768, 3) != 0) {
/*     */                                                           break label2958;
/*     */                                                         }
/*     */                                                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 734 */                                                         if (MainMemory.getI32(MainMemory.getI32(i9) + 68) != 1)
/*     */                                                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 744 */                                                           if (ffc2ii.call(paramInt2 + 4, i1, i) <= 0)
/*     */                                                           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 754 */                                                             i8 = MainMemory.getI32(i1);
/* 755 */                                                             if (i8 >= 1)
/*     */                                                             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 765 */                                                               i12 = MainMemory.getI32(i9);
/* 766 */                                                               if (MainMemory.getI32(i12 + 916) >= i8)
/*     */                                                               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 776 */                                                                 i13 = MainMemory.getI32(i12 + 944);
/* 777 */                                                                 i8 += -1;
/* 778 */                                                                 switch (MainMemory.getI32(i13 + i8 * 152 + 80))
/*     */                                                                 {
/*     */                                                                 case 16: 
/*     */                                                                   break;
/*     */                                                                 case -9999: 
/*     */                                                                   break;
/*     */                                                                 }
/*     */                                                                 
/*     */                                                                 
/*     */ 
/*     */ 
/*     */ 
/* 790 */                                                                 paramInt2 = SystemLibrary.strchr(paramInt3, 40);
/* 791 */                                                                 MainMemory.setI32(i6, paramInt2);
/* 792 */                                                                 if (paramInt2 != 0)
/*     */                                                                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 802 */                                                                   paramInt2 += 1;
/* 803 */                                                                   MainMemory.setI32(i6, paramInt2);
/* 804 */                                                                   i14 = SystemLibrary.strtol(paramInt2, i6, 10);
/* 805 */                                                                   MainMemory.setI32(m, i14);
/* 806 */                                                                   l = MainMemory.getI64(i13 + i8 * 152 + 84);
/* 807 */                                                                   if ((l == 1L) || 
/*     */                                                                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 817 */                                                                     (l >= i14))
/*     */                                                                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 827 */                                                                     MainMemory.setI32(i13 + i8 * 152 + 148, i14);
/*     */                                                                     
/*     */ 
/*     */                                                                     break label3126;
/*     */                                                                     
/*     */                                                                     label2958:
/*     */                                                                     
/* 834 */                                                                     if (i11 != 72) {
/*     */                                                                       break label3121;
/*     */                                                                     }
/*     */                                                                     
/*     */ 
/*     */ 
/*     */                                                                     label2978:
/*     */                                                                     
/*     */ 
/*     */ 
/* 844 */                                                                     if (SystemLibrary.strncmp(i10, 19904, 4) != 0) {
/*     */                                                                       break label3121;
/*     */                                                                     }
/*     */                                                                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 854 */                                                                     if (MainMemory.getI32(MainMemory.getI32(i9) + 68) != 1)
/*     */                                                                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 864 */                                                                       if (ffc2jj.call(paramInt3, i3, i) <= 0) {
/*     */                                                                         break label3094;
/*     */                                                                       }
/*     */                                                                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 874 */                                                                       SystemLibrary.sprintf(i7, 99168, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
/* 875 */                                                                       ffxmsg.call(5, i7);
/*     */                                                                       
/*     */ 
/*     */                                                                       break label3126;
/*     */                                                                       
/*     */                                                                       label3094:
/*     */                                                                       
/* 882 */                                                                       MainMemory.setI64(MainMemory.getI32(i9) + 948, MainMemory.getI64(i3));
/*     */                                                                       break label3126;
/*     */                                                                     }
/*     */                                                                   }
/*     */                                                                 }
/*     */                                                               }
/*     */                                                             }
/*     */                                                           } }
/*     */                                                       }
/*     */                                                     }
/*     */                                                   }
/*     */                                                 }
/*     */                                               }
/*     */                                             }
/*     */                                           }
/*     */                                         } } } } } } } } } } } } } } } } } } } finally { label3121:
/*     */       label3126:
/* 899 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */