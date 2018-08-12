/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class spcxps extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2878;
/*  13 */   public static final Function _instance = new spcxps();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public spcxps() { super("spcxps", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  20 */     return call(paramInt1, paramDouble1, paramDouble2, paramDouble3, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i2 = call(i, d1, d2, d3, j, k, m, n, i1);
/*  53 */     paramFrame.setI32(paramInt1, i2);
/*  54 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  59 */     int i = 0;
/*     */     
/*  61 */     int j = 0;
/*  62 */     int k = 0;
/*  63 */     int m = 0;
/*  64 */     int n = 0;
/*  65 */     int i1 = 0;
/*     */     
/*     */ 
/*  68 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       j = MainMemory.alloc(4);
/*  73 */       k = MainMemory.alloc(5);
/*  74 */       m = MainMemory.alloc(8);
/*  75 */       n = MainMemory.alloc(320);
/*  76 */       if (spctyp.call(paramInt1, k, j, 0, paramInt2, paramInt3, paramInt4) != 0) {
/*     */         break label1794;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       if (SystemLibrary.strstr(15744, paramInt3) != 0) {
/*     */         break label1794;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       if ((MainMemory.getI32(paramInt4) % 3 == 0) || (!com.emt.proteus.lib.api.MathUtils.f_oeq(paramDouble2, 0.0D)) || (!com.emt.proteus.lib.api.MathUtils.f_oeq(paramDouble3, 0.0D)))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         switch (MainMemory.getI8(paramInt3)) {
/*     */         case 70: 
/*     */           break label320;
/*     */           break;
/*     */         case 87: 
/*     */           break label300;
/*     */           break;
/*     */         case 119: 
/*     */           break label300;
/*     */           break;
/*     */         case 65: 
/*     */           break label280;
/*     */           break;
/*     */         case 97:  break label280;
/*     */           break; case 86:  break; }
/* 121 */         SystemLibrary.memcpy(m, 18464, 5, 1);
/*     */         
/*     */         break label335;
/*     */         
/*     */         label280:
/* 126 */         SystemLibrary.memcpy(m, 21376, 5, 1);
/*     */         
/*     */         break label335;
/*     */         
/*     */         label300:
/* 131 */         SystemLibrary.memcpy(m, 21312, 5, 1);
/*     */         
/*     */         break label335;
/*     */         
/*     */         label320:
/* 136 */         SystemLibrary.memcpy(m, 18432, 5, 1);
/*     */         
/*     */ 
/*     */         label335:
/*     */         
/*     */ 
/* 142 */         if (specx.call(m, paramDouble1, paramDouble2, paramDouble3, n) != 0) {
/*     */           break label1794;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         switch (MainMemory.getI8(paramInt2)) {
/*     */         case 70: 
/*     */           break label1321;
/*     */           break;
/*     */         case 87:  break label975;
/*     */           break; case 65:  break label745;
/*     */           break; case 86:  break; default:  paramDouble1 = 0.0D;
/* 159 */           paramDouble2 = 0.0D;
/* 160 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 167 */         switch (MainMemory.getI8(paramInt3)) {
/*     */         case 70: 
/*     */           break label622;
/*     */           break;
/*     */         case 87:  break label602;
/*     */           break; case 119:  break label602;
/*     */           break; case 65:  break label582;
/*     */           break; case 97:  break label582;
/*     */           break; case 86:  break; default:  paramDouble1 = 0.0D;
/* 176 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 183 */         paramDouble1 = 1.0D;
/*     */         
/*     */         break label637;
/*     */         
/*     */         label582:
/* 188 */         paramDouble1 = MainMemory.getF64(n + 296);
/*     */         
/*     */         break label637;
/*     */         
/*     */         label602:
/*     */         
/* 194 */         paramDouble1 = MainMemory.getF64(n + 280);
/*     */         
/*     */         break label637;
/*     */         
/*     */         label622:
/*     */         
/* 200 */         paramDouble1 = MainMemory.getF64(n + 216);
/*     */         
/*     */ 
/*     */ 
/*     */         label637:
/*     */         
/*     */ 
/*     */ 
/* 208 */         if (SystemLibrary.strcmp(k, 18464) != 0) {
/*     */           break label686;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 96));
/*     */         
/* 220 */         paramDouble2 = 1.0D;
/*     */         
/*     */         break label1771;
/*     */         
/*     */         label686:
/* 225 */         if (SystemLibrary.strcmp(k, 18592) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 230 */           paramDouble2 = 0.0D;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 237 */           MainMemory.setF64(paramInt5, MainMemory.getF64(n + 104));
/* 238 */           paramDouble2 = MainMemory.getF64(n + 312);
/*     */           
/*     */ 
/*     */           break label1771;
/*     */           
/*     */           label745:
/*     */           
/* 245 */           i1 = MainMemory.getI8(paramInt3);
/* 246 */           switch (i1) {
/*     */           case 70: 
/*     */             break label867;
/*     */             break;
/*     */           case 87: 
/*     */             break;
/*     */           case 119:  break; case 65:  paramDouble1 = 1.0D;
/*     */             break label924;
/*     */             break; case 97:  paramDouble1 = 1.0D;
/*     */             
/*     */ 
/*     */             break label924;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 263 */           paramDouble1 = MainMemory.getF64(n + 264);
/*     */           
/*     */           break label924;
/*     */           
/*     */           label867:
/*     */           
/* 269 */           paramDouble1 = MainMemory.getF64(n + 200);
/*     */           
/*     */ 
/*     */           break label924;
/*     */           
/*     */ 
/* 275 */           if (i1 != 86)
/*     */           {
/*     */ 
/*     */ 
/* 279 */             paramDouble1 = 0.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 286 */             paramDouble1 = MainMemory.getF64(n + 288);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label924:
/*     */           
/*     */ 
/* 294 */           if (SystemLibrary.strcmp(k, 21376) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 299 */             paramDouble2 = 0.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 306 */             MainMemory.setF64(paramInt5, MainMemory.getF64(n + 88));
/*     */             
/* 308 */             paramDouble2 = 1.0D;
/*     */             
/*     */             break label1771;
/*     */             
/*     */             label975:
/* 313 */             i1 = MainMemory.getI8(paramInt3);
/* 314 */             switch (i1) {
/*     */             case 70:  break label1099;
/*     */               break; case 87:  paramDouble1 = 1.0D;
/*     */               break label1156;
/*     */               break; case 119:  paramDouble1 = 1.0D;
/*     */               
/*     */ 
/*     */               break label1156;
/*     */               
/*     */               break;
/*     */             case 65: 
/*     */               break;
/*     */             case 97: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 331 */             paramDouble1 = MainMemory.getF64(n + 256);
/*     */             
/*     */             break label1156;
/*     */             
/*     */             label1099:
/*     */             
/* 337 */             paramDouble1 = MainMemory.getF64(n + 184);
/*     */             
/*     */ 
/*     */             break label1156;
/*     */             
/*     */ 
/* 343 */             if (i1 != 86)
/*     */             {
/*     */ 
/*     */ 
/* 347 */               paramDouble1 = 0.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 354 */               paramDouble1 = MainMemory.getF64(n + 272);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1156:
/*     */             
/*     */ 
/* 362 */             if (SystemLibrary.strcmp(k, 21312) != 0) {
/*     */               break label1205;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */             MainMemory.setF64(paramInt5, MainMemory.getF64(n + 64));
/*     */             
/* 374 */             paramDouble2 = 1.0D;
/*     */             
/*     */             break label1771;
/*     */             
/*     */             label1205:
/* 379 */             if (SystemLibrary.strcmp(k, 18496) != 0) {
/*     */               break label1262;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 389 */             MainMemory.setF64(paramInt5, MainMemory.getF64(n + 72));
/* 390 */             paramDouble2 = MainMemory.getF64(n + 232);
/*     */             
/*     */ 
/*     */             break label1771;
/*     */             
/*     */             label1262:
/*     */             
/* 397 */             if (SystemLibrary.strcmp(k, 18528) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 402 */               paramDouble2 = 0.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 409 */               MainMemory.setF64(paramInt5, MainMemory.getF64(n + 80));
/* 410 */               paramDouble2 = MainMemory.getF64(n + 248);
/*     */               
/*     */ 
/*     */               break label1771;
/*     */               
/*     */               label1321:
/*     */               
/* 417 */               i1 = MainMemory.getI8(paramInt3);
/* 418 */               switch (i1) {
/* 419 */               case 70:  paramDouble1 = 1.0D;
/*     */                 break label1498;
/*     */                 break;
/*     */               case 87: 
/*     */                 break label1441;
/*     */                 break;
/*     */               case 119: 
/*     */                 break label1441;
/*     */                 break;
/*     */               case 65: 
/*     */                 break;
/*     */               case 97: 
/*     */                 break;
/*     */               }
/*     */               
/* 434 */               paramDouble1 = MainMemory.getF64(n + 192);
/*     */               
/*     */               break label1498;
/*     */               
/*     */               label1441:
/*     */               
/* 440 */               paramDouble1 = MainMemory.getF64(n + 176);
/*     */               
/*     */ 
/*     */               break label1498;
/*     */               
/*     */ 
/* 446 */               if (i1 != 86)
/*     */               {
/*     */ 
/*     */ 
/* 450 */                 paramDouble1 = 0.0D;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 457 */                 paramDouble1 = MainMemory.getF64(n + 208);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label1498:
/*     */               
/*     */ 
/* 465 */               if (SystemLibrary.strcmp(k, 18432) != 0) {
/*     */                 break label1547;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 475 */               MainMemory.setF64(paramInt5, MainMemory.getF64(n + 24));
/*     */               
/* 477 */               paramDouble2 = 1.0D;
/*     */               
/*     */               break label1771;
/*     */               
/*     */               label1547:
/* 482 */               if (SystemLibrary.strcmp(k, 21152) != 0) {
/*     */                 break label1603;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */               MainMemory.setF64(paramInt5, MainMemory.getF64(n + 32));
/* 493 */               paramDouble2 = MainMemory.getF64(n + 120);
/*     */               
/*     */ 
/*     */               break label1771;
/*     */               
/*     */               label1603:
/*     */               
/* 500 */               if (SystemLibrary.strcmp(k, 21184) != 0) {
/*     */                 break label1660;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 510 */               MainMemory.setF64(paramInt5, MainMemory.getF64(n + 40));
/* 511 */               paramDouble2 = MainMemory.getF64(n + 136);
/*     */               
/*     */ 
/*     */               break label1771;
/*     */               
/*     */               label1660:
/*     */               
/* 518 */               if (SystemLibrary.strcmp(k, 21216) != 0) {
/*     */                 break label1717;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 528 */               MainMemory.setF64(paramInt5, MainMemory.getF64(n + 48));
/* 529 */               paramDouble2 = MainMemory.getF64(n + 152);
/*     */               
/*     */ 
/*     */               break label1771;
/*     */               
/*     */               label1717:
/*     */               
/* 536 */               if (SystemLibrary.strcmp(k, 18560) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 541 */                 paramDouble2 = 0.0D;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 548 */                 MainMemory.setF64(paramInt5, MainMemory.getF64(n + 56));
/* 549 */                 paramDouble2 = MainMemory.getF64(n + 168);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label1771:
/*     */         
/*     */ 
/* 559 */         paramDouble1 = paramDouble2 * paramDouble1;
/* 560 */         MainMemory.setF64(paramInt6, paramDouble1);
/* 561 */         i = 0;
/*     */         
/*     */         break label1802;
/*     */       }
/*     */       
/*     */       label1794:
/*     */       
/* 568 */       i = 2;
/*     */       
/*     */ 
/*     */       label1802:
/*     */       
/*     */ 
/* 574 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 579 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spcxps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */