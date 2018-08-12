/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class spcx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2882;
/*  12 */   public static final Function _instance = new spcx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public spcx2s() { super("spcx2s", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = call(i, j, k, m, n, i1, i2);
/*  46 */     paramFrame.setI32(paramInt1, i3);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     double d1 = 0.0D;
/*  61 */     double d2 = 0.0D;
/*  62 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       if (paramInt1 == 0) {
/*  69 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  79 */         if (MainMemory.getI32(paramInt1) != 0) {
/*     */           break label88;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         if (spcset.call(paramInt1) != 0)
/*     */         {
/*     */ 
/*     */ 
/*  93 */           paramInt2 = 2;
/*     */         }
/*     */         else
/*     */         {
/*     */           label88:
/*     */           
/*     */ 
/* 100 */           j = paramInt2 > 0 ? 1 : 0;
/* 101 */           if (j == 0) {
/*     */             break label221;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */           n = paramInt1 + 104;
/* 112 */           i1 = paramInt1 + 112;
/* 113 */           k = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 120 */             m = paramInt7 + (k << 2);
/* 121 */             d1 = MainMemory.getF64(paramInt5 + (k * paramInt3 << 3)) * MainMemory.getF64(i1);
/* 122 */             d1 = MainMemory.getF64(n) + d1;
/* 123 */             MainMemory.setF64(paramInt6 + (k * paramInt4 << 3), d1);
/* 124 */             MainMemory.setI32(m, 0);
/* 125 */             k += 1;
/* 126 */             if (k == paramInt2) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label221:
/*     */           
/*     */ 
/*     */ 
/* 137 */           if ((MainMemory.getI32(paramInt1 + 144) == 0) || (j != 0))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */             paramInt5 = paramInt1 + 120;
/* 148 */             n = paramInt1 + 128;
/* 149 */             i1 = paramInt1 + 136;
/* 150 */             paramInt3 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 157 */               i2 = paramInt6 + (paramInt3 * paramInt4 << 3);
/* 158 */               d1 = MainMemory.getF64(i2);
/* 159 */               if (MathUtils.f_oeq(d1, -1.0D)) {
/* 160 */                 d1 = -45.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 170 */               else if (MathUtils.f_oeq(d1, 0.0D)) {
/* 171 */                 d1 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 181 */               else if (MathUtils.f_oeq(d1, 1.0D)) {
/* 182 */                 d1 = 45.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 192 */                 d1 = SystemLibrary.atan(d1) * 180.0D;
/* 193 */                 d1 /= 3.141592653589793D;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */               d1 += MainMemory.getF64(paramInt5);
/* 202 */               if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */                 break label566;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */               d2 = d1 / 90.0D;
/* 213 */               d2 += -0.5D;
/* 214 */               k = (int)SystemLibrary.floor(d2);
/* 215 */               switch ((k > -1 ? k : 0 - k) & 0x3) {
/*     */               case 0:  break label553;
/*     */                 break; case 1:  d1 = 0.0D;
/*     */                 break label594;
/*     */                 break;
/*     */               case 2: 
/*     */                 break; case 3:  d1 = 0.0D;
/*     */                 
/*     */ 
/*     */                 break label594;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 230 */               d1 = -1.0D;
/*     */               
/*     */               break label594;
/*     */               
/*     */               label553:
/* 235 */               d1 = 1.0D;
/*     */               
/*     */               break label594;
/*     */               
/*     */               label566:
/* 240 */               d1 *= 3.141592653589793D;
/* 241 */               d1 /= 180.0D;
/* 242 */               d1 = SystemLibrary.sin(d1);
/*     */               
/*     */ 
/*     */ 
/*     */               label594:
/*     */               
/*     */ 
/*     */ 
/* 250 */               d1 += MainMemory.getF64(n);
/* 251 */               d1 *= MainMemory.getF64(i1);
/* 252 */               MainMemory.setF64(i2, d1);
/* 253 */               paramInt3 += 1;
/* 254 */               if (paramInt3 == paramInt2) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */           i3 = MainMemory.getI32(paramInt1 + 152);
/* 266 */           if (i3 == 0) {
/* 267 */             paramInt3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 277 */             paramInt3 = SystemLibrary.do_indirect(i3, MainMemory.getF64(paramInt1 + 96), paramInt2, paramInt4, paramInt4, paramInt6, paramInt6, paramInt7);
/* 278 */             switch (paramInt3) {
/* 279 */             case 0:  paramInt3 = 0;
/*     */               break label751;
/*     */               break;
/*     */             case 4: 
/*     */               break; default:  paramInt2 = paramInt3;
/* 284 */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 291 */             paramInt3 = 3;
/*     */           }
/*     */           
/*     */ 
/*     */           label751:
/*     */           
/*     */ 
/* 298 */           i3 = MainMemory.getI32(paramInt1 + 156);
/* 299 */           if (i3 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */             paramInt2 = SystemLibrary.do_indirect(i3, MainMemory.getF64(paramInt1 + 96), paramInt2, paramInt4, paramInt4, paramInt6, paramInt6, paramInt7);
/* 310 */             switch (paramInt2)
/*     */             {
/*     */             case 0: 
/*     */               break label861;
/*     */               
/*     */ 
/*     */               break;
/*     */             case 4: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 322 */             i = 3;
/*     */             
/*     */             break label882;
/*     */           }
/*     */           
/*     */           label861:
/*     */           
/* 329 */           i = paramInt3;
/*     */           
/*     */ 
/*     */           break label882;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 337 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label882:
/*     */       
/*     */ 
/* 343 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spcx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */