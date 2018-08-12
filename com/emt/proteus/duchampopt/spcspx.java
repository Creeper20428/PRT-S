/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class spcspx extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2879;
/*  13 */   public static final Function _instance = new spcspx();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public spcspx() { super("spcspx", 9, false); }
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
/*     */     
/*     */ 
/*  67 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  71 */       j = MainMemory.alloc(4);
/*  72 */       k = MainMemory.alloc(5);
/*  73 */       m = MainMemory.alloc(8);
/*  74 */       n = MainMemory.alloc(320);
/*  75 */       if (spctyp.call(paramInt1, k, j, 0, paramInt2, paramInt3, paramInt4) != 0) {
/*     */         break label1668;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       if (SystemLibrary.strstr(15744, paramInt3) != 0) {
/*     */         break label1668;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       if ((MainMemory.getI32(paramInt4) % 3 == 0) || (!com.emt.proteus.lib.api.MathUtils.f_oeq(paramDouble2, 0.0D)) || (!com.emt.proteus.lib.api.MathUtils.f_oeq(paramDouble3, 0.0D)))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         SystemLibrary.strcpy(m, k);
/* 106 */         if (specx.call(m, paramDouble1, paramDouble2, paramDouble3, n) != 0) {
/*     */           break label1668;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         switch (MainMemory.getI8(paramInt2)) {
/*     */         case 70: 
/*     */           break label1214;
/*     */           break;
/*     */         case 87:  break label862;
/*     */           break; case 119:  break label862;
/*     */           break; case 65:  break label602;
/*     */           break; case 97:  break label602;
/*     */           break; case 86:  break; default:  paramDouble1 = 0.0D;
/* 125 */           paramDouble2 = 0.0D;
/* 126 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 133 */         if (SystemLibrary.strcmp(k, 18464) == 0) {
/* 134 */           paramDouble1 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 144 */         else if (SystemLibrary.strcmp(k, 18592) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 148 */           paramDouble1 = 0.0D;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 155 */           paramDouble1 = MainMemory.getF64(n + 304);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         switch (MainMemory.getI8(paramInt3)) {
/*     */         case 70: 
/*     */           break label569;
/*     */           break;
/*     */         case 87: 
/*     */           break label536;
/*     */           break; case 119:  break label536;
/*     */           break; case 65:  break label503;
/*     */           break; case 97:  break label503;
/*     */           break; case 86:  break; default:  paramDouble2 = 0.0D;
/* 173 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 180 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 96));
/*     */         
/* 182 */         paramDouble2 = 1.0D;
/*     */         
/*     */         break label1645;
/*     */         
/*     */         label503:
/* 187 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 88));
/* 188 */         paramDouble2 = MainMemory.getF64(n + 288);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label536:
/*     */         
/* 195 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 64));
/* 196 */         paramDouble2 = MainMemory.getF64(n + 272);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label569:
/*     */         
/* 203 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 24));
/* 204 */         paramDouble2 = MainMemory.getF64(n + 208);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label602:
/*     */         
/* 211 */         paramDouble1 = SystemLibrary.strcmp(k, 21376) == 0 ? 1.0D : 0.0D;
/* 212 */         switch (MainMemory.getI8(paramInt3)) {
/*     */         case 70: 
/*     */           break label829;
/*     */           break;
/*     */         case 87: 
/*     */           break label796;
/*     */           break; case 119:  break label796;
/*     */           break; case 65:  break label771;
/*     */           break; case 97:  break label771;
/*     */           break; case 86:  break; default:  paramDouble2 = 0.0D;
/* 222 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 229 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 96));
/* 230 */         paramDouble2 = MainMemory.getF64(n + 296);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label771:
/*     */         
/* 237 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 88));
/*     */         
/* 239 */         paramDouble2 = 1.0D;
/*     */         
/*     */         break label1645;
/*     */         
/*     */         label796:
/* 244 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 64));
/* 245 */         paramDouble2 = MainMemory.getF64(n + 256);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label829:
/*     */         
/* 252 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 24));
/* 253 */         paramDouble2 = MainMemory.getF64(n + 192);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label862:
/*     */         
/* 260 */         if (SystemLibrary.strcmp(k, 21312) == 0) {
/* 261 */           paramDouble1 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 271 */           if (SystemLibrary.strcmp(k, 18496) != 0) {
/*     */             break label929;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */           paramDouble1 = MainMemory.getF64(n + 224);
/*     */           
/*     */           break label970;
/*     */           
/*     */           label929:
/*     */           
/* 287 */           if (SystemLibrary.strcmp(k, 18528) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 291 */             paramDouble1 = 0.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 298 */             paramDouble1 = MainMemory.getF64(n + 240);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label970:
/*     */         
/*     */ 
/* 306 */         switch (MainMemory.getI8(paramInt3)) {
/*     */         case 70: 
/*     */           break label1181;
/*     */           break;
/*     */         case 87: 
/*     */           break label1156;
/*     */           break; case 119:  break label1156;
/*     */           break; case 65:  break label1123;
/*     */           break; case 97:  break label1123;
/*     */           break; case 86:  break; default:  paramDouble2 = 0.0D;
/* 316 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 323 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 96));
/* 324 */         paramDouble2 = MainMemory.getF64(n + 280);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label1123:
/*     */         
/* 331 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 88));
/* 332 */         paramDouble2 = MainMemory.getF64(n + 264);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label1156:
/*     */         
/* 339 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 64));
/*     */         
/* 341 */         paramDouble2 = 1.0D;
/*     */         
/*     */         break label1645;
/*     */         
/*     */         label1181:
/* 346 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 24));
/* 347 */         paramDouble2 = MainMemory.getF64(n + 176);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label1214:
/*     */         
/* 354 */         if (SystemLibrary.strcmp(k, 18432) == 0) {
/* 355 */           paramDouble1 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 365 */           if (SystemLibrary.strcmp(k, 21152) != 0) {
/*     */             break label1280;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */           paramDouble1 = MainMemory.getF64(n + 112);
/*     */           
/*     */           break label1409;
/*     */           
/*     */           label1280:
/*     */           
/* 381 */           if (SystemLibrary.strcmp(k, 21184) != 0) {
/*     */             break label1324;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */           paramDouble1 = MainMemory.getF64(n + 128);
/*     */           
/*     */           break label1409;
/*     */           
/*     */           label1324:
/*     */           
/* 397 */           if (SystemLibrary.strcmp(k, 21216) != 0) {
/*     */             break label1368;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 407 */           paramDouble1 = MainMemory.getF64(n + 144);
/*     */           
/*     */           break label1409;
/*     */           
/*     */           label1368:
/*     */           
/* 413 */           if (SystemLibrary.strcmp(k, 18560) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 417 */             paramDouble1 = 0.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 424 */             paramDouble1 = MainMemory.getF64(n + 160);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label1409:
/*     */         
/*     */ 
/* 432 */         switch (MainMemory.getI8(paramInt3)) {
/*     */         case 70: 
/*     */           break label1625;
/*     */           break;
/*     */         case 87: 
/*     */           break label1592;
/*     */           break; case 119:  break label1592;
/*     */           break; case 65:  break label1559;
/*     */           break; case 97:  break label1559;
/*     */           break; case 86:  break; default:  paramDouble2 = 0.0D;
/* 442 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 449 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 96));
/* 450 */         paramDouble2 = MainMemory.getF64(n + 216);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label1559:
/*     */         
/* 457 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 88));
/* 458 */         paramDouble2 = MainMemory.getF64(n + 200);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label1592:
/*     */         
/* 465 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 64));
/* 466 */         paramDouble2 = MainMemory.getF64(n + 184);
/*     */         
/*     */ 
/*     */         break label1645;
/*     */         
/*     */         label1625:
/*     */         
/* 473 */         MainMemory.setF64(paramInt5, MainMemory.getF64(n + 24));
/*     */         
/* 475 */         paramDouble2 = 1.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label1645:
/*     */         
/*     */ 
/*     */ 
/* 483 */         paramDouble1 = paramDouble2 * paramDouble1;
/* 484 */         MainMemory.setF64(paramInt6, paramDouble1);
/* 485 */         i = 0;
/*     */         
/*     */         break label1676;
/*     */       }
/*     */       
/*     */       label1668:
/*     */       
/* 492 */       i = 2;
/*     */       
/*     */ 
/*     */       label1676:
/*     */       
/*     */ 
/* 498 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 503 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spcspx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */