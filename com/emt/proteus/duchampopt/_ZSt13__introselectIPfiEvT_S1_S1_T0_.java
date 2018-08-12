/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt13__introselectIPfiEvT_S1_S1_T0_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2696;
/*  12 */   public static final Function _instance = new _ZSt13__introselectIPfiEvT_S1_S1_T0_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZSt13__introselectIPfiEvT_S1_S1_T0_() { super("_ZSt13__introselectIPfiEvT_S1_S1_T0_", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     call(i, j, k, m);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  44 */     float f1 = 0.0F;
/*  45 */     int i = 0;
/*  46 */     float f2 = 0.0F;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     float f3 = 0.0F;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*     */       for (;;)
/*     */       {
/*  71 */         n = paramInt3;
/*  72 */         i1 = paramInt3 + -4;
/*  73 */         i2 = paramInt4 + -1;
/*  74 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  83 */           k = n - paramInt1;
/*  84 */           if (k <= 15) {
/*     */             break label573;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */           if (paramInt4 != i3) {
/*     */             break label143;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           _ZSt13__heap_selectIPfEvT_S1_S1_.call(paramInt1, paramInt2 + 4, paramInt3);
/* 105 */           f1 = MainMemory.getF32(paramInt1);
/* 106 */           MainMemory.setF32(paramInt1, MainMemory.getF32(paramInt2));
/* 107 */           MainMemory.setF32(paramInt2, f1);
/*     */           
/*     */ 
/*     */           break label603;
/*     */           
/*     */           label143:
/*     */           
/* 114 */           i = paramInt1 + ((k >> 2) / 2 << 2);
/* 115 */           f2 = MainMemory.getF32(paramInt1);
/* 116 */           f1 = MainMemory.getF32(i);
/* 117 */           f3 = MainMemory.getF32(i1);
/* 118 */           if (!MathUtils.f_olt(f2, f1)) {
/*     */             break label252;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */           if (!MathUtils.f_olt(f1, f3))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */             i = MathUtils.f_olt(f2, f3) ? i1 : paramInt1;
/*     */             
/*     */             break label303;
/*     */             
/*     */             label252:
/*     */             
/* 145 */             if (MathUtils.f_olt(f2, f3)) {
/* 146 */               i = paramInt1;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 156 */               i = MathUtils.f_olt(f1, f3) ? i1 : i;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label303:
/*     */           
/*     */ 
/* 164 */           f1 = MainMemory.getF32(i);
/*     */           
/* 166 */           i = paramInt3;
/* 167 */           m = paramInt1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 176 */             if (MathUtils.f_olt(f2, f1)) {
/* 177 */               k = 0;
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/* 182 */               j = m;
/*     */               
/*     */ 
/*     */               break label397;
/*     */             }
/*     */             
/*     */             do
/*     */             {
/* 190 */               k += 1;
/* 191 */               j = m + (k << 2);
/* 192 */               f2 = MainMemory.getF32(j);
/* 193 */             } while (MathUtils.f_olt(f2, f1));
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label397:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */             k = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             do
/*     */             {
/* 215 */               m = i + ((k ^ 0xFFFFFFFF) << 2);
/* 216 */               f3 = MainMemory.getF32(m);
/* 217 */               k += 1;
/* 218 */             } while (MathUtils.f_ogt(f3, f1));
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */             if (!MathUtils.ult(j, m)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */             MainMemory.setF32(j, f3);
/* 240 */             MainMemory.setF32(m, f2);
/* 241 */             j += 4;
/* 242 */             f2 = MainMemory.getF32(j);
/*     */             
/* 244 */             i = m;
/* 245 */             m = j;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 250 */           k = i3 + 1;
/* 251 */           if (MathUtils.ugt(j, paramInt2)) {
/*     */             break;
/*     */           }
/*     */           
/* 255 */           i3 = k;
/* 256 */           paramInt1 = j;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */         paramInt4 = i2 - i3;
/* 264 */         paramInt3 = j;
/*     */       }
/*     */       
/*     */ 
/*     */       label573:
/*     */       
/*     */ 
/* 271 */       if (paramInt1 != paramInt3)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */         _ZSt13__introselectIPfiEvT_S1_S1_T0__450.call(paramInt3, paramInt1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label603:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 292 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt13__introselectIPfiEvT_S1_S1_T0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */