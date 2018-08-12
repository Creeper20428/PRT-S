/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fits_get_section_range extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2987;
/*  12 */   public static final Function _instance = new fits_get_section_range();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_get_section_range() { super("fits_get_section_range", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  39 */     int i1 = call(i, j, k, m, n);
/*  40 */     paramFrame.setI32(paramInt1, i1);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*     */     
/*     */ 
/*  56 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       j = MainMemory.alloc(4);
/*  61 */       k = MainMemory.alloc(71);
/*  62 */       m = MainMemory.getI32(paramInt5);
/*  63 */       if (m <= 0) {
/*     */         break label78;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       i = m;
/*     */       
/*     */ 
/*     */       break label752;
/*     */       
/*     */       label78:
/*     */       
/*  80 */       n = fits_get_token.call(paramInt1, 17664, k, j) == 0 ? 1 : 0;
/*  81 */       if (n == 0) {
/*     */         break label134;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       MainMemory.setI16(k, (short)42);
/*     */       
/*     */       break label233;
/*     */       
/*     */       label134:
/*  96 */       switch (MainMemory.getI8(k))
/*     */       {
/*     */       case 42: 
/*     */         break label233;
/*     */         
/*     */         break;
/*     */       case 45: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 107 */       if (MainMemory.getI8(k + 1) != 42) {
/*     */         break label253;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       MainMemory.setI32(paramInt2, 0);
/* 118 */       MainMemory.setI32(paramInt3, 1);
/*     */       
/*     */       break label410;
/*     */       
/*     */       label233:
/* 123 */       MainMemory.setI32(paramInt2, 1);
/* 124 */       MainMemory.setI32(paramInt3, 0);
/*     */       
/*     */ 
/*     */       label253:
/*     */       
/* 129 */       if (n == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         if (MainMemory.getI32(j) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */           if (MainMemory.getI8(MainMemory.getI32(paramInt1)) != 58) {
/*     */             break label736;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           MainMemory.setI32(paramInt2, SystemLibrary.atol(k));
/* 160 */           MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt1) + 1);
/* 161 */           if (fits_get_token.call(paramInt1, 17664, k, j) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */             if (MainMemory.getI32(j) != 0) {
/*     */               break label396;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */           MainMemory.setI32(paramInt5, 125);
/* 182 */           i = 125;
/*     */           
/*     */ 
/*     */           break label752;
/*     */           
/*     */           label396:
/*     */           
/* 189 */           MainMemory.setI32(paramInt3, SystemLibrary.atol(k));
/*     */           
/*     */ 
/*     */           label410:
/*     */           
/*     */ 
/* 195 */           i1 = MainMemory.getI32(paramInt1);
/* 196 */           if (MainMemory.getI8(i1) != 58)
/*     */           {
/*     */ 
/*     */ 
/* 200 */             m = 1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 207 */             MainMemory.setI32(paramInt1, i1 + 1);
/* 208 */             if (fits_get_token.call(paramInt1, 15296, k, j) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */               if (MainMemory.getI32(j) != 0) {
/*     */                 break label516;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */             MainMemory.setI32(paramInt5, 125);
/* 229 */             i = 125;
/*     */             
/*     */ 
/*     */             break label752;
/*     */             
/*     */             label516:
/*     */             
/* 236 */             m = SystemLibrary.atol(k);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */           MainMemory.setI32(paramInt4, m);
/* 245 */           i1 = MainMemory.getI32(paramInt1);
/* 246 */           i2 = MainMemory.getI8(i1);
/* 247 */           if (i2 != 44) {
/*     */             break label591;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */           i1 += 1;
/* 260 */           MainMemory.setI32(paramInt1, i1);
/* 261 */           i2 = MainMemory.getI8(i1);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label591:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 271 */           if (i2 != 32) {
/*     */             break label643;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 283 */             i1 += 1;
/* 284 */             MainMemory.setI32(paramInt1, i1);
/* 285 */           } while (MainMemory.getI8(i1) == 32);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label643:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 296 */           if (MainMemory.getI32(paramInt2) >= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */             if (MainMemory.getI32(paramInt3) >= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */               if (MainMemory.getI32(paramInt4) >= 1) {
/*     */                 break label719;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */           MainMemory.setI32(paramInt5, 125);
/* 327 */           i = 125;
/*     */           
/*     */ 
/*     */           break label752;
/*     */           
/*     */           label719:
/*     */           
/* 334 */           i = MainMemory.getI32(paramInt5);
/*     */           
/*     */           break label752;
/*     */         }
/*     */       }
/*     */       
/*     */       label736:
/* 341 */       MainMemory.setI32(paramInt5, 125);
/* 342 */       i = 125;
/*     */       
/*     */ 
/*     */       label752:
/*     */       
/*     */ 
/* 348 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 353 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_get_section_range.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */