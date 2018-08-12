/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class airset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2872;
/*  12 */   public static final Function _instance = new airset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public airset() { super("airset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     double d1 = 0.0D;
/*  40 */     double d2 = 0.0D;
/*  41 */     int n = 0;
/*  42 */     double d3 = 0.0D;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*     */     
/*     */ 
/*  49 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       k = MainMemory.alloc(8);
/*  55 */       m = MainMemory.alloc(8);
/*  56 */       if (paramInt == 0) {
/*  57 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  67 */         MainMemory.setI32(paramInt, 109);
/*  68 */         MainMemory.setI32(paramInt + 4, 5392705);
/*  69 */         i1 = paramInt + 24;
/*  70 */         d2 = MainMemory.getF64(i1);
/*  71 */         if (!MathUtils.f_oeq(d2, 9.87654321E107D))
/*     */         {
/*     */ 
/*     */ 
/*  75 */           d1 = d2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  82 */           MainMemory.setF64(i1, 90.0D);
/*  83 */           d1 = 90.0D;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         i1 = paramInt + 8;
/*  91 */         d2 = MainMemory.getF64(i1);
/*  92 */         if (!MathUtils.f_oeq(d2, 0.0D)) {
/*     */           break label199;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         MainMemory.setF64(i1, 57.29577951308232D);
/* 104 */         d2 = 57.29577951308232D;
/*     */         
/*     */ 
/*     */ 
/*     */         label199:
/*     */         
/*     */ 
/* 111 */         SystemLibrary.memcpy(paramInt + 276, 57216, 16, 1);
/* 112 */         MainMemory.setI32(paramInt + 316, 1);
/* 113 */         MainMemory.setI32(paramInt + 320, 101);
/* 114 */         MainMemory.setI32(paramInt + 324, 1);
/* 115 */         MainMemory.setI32(paramInt + 328, 0);
/* 116 */         MainMemory.setI32(paramInt + 332, 0);
/* 117 */         MainMemory.setI32(paramInt + 336, 0);
/* 118 */         MainMemory.setI32(paramInt + 340, 1);
/* 119 */         d2 *= 2.0D;
/* 120 */         MainMemory.setF64(paramInt + 360, d2);
/* 121 */         if (!MathUtils.f_oeq(d1, 90.0D)) {
/*     */           break label351;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         MainMemory.setF64(paramInt + 368, -0.5D);
/* 132 */         MainMemory.setF64(paramInt + 376, 1.0D);
/* 133 */         d1 = 1.0D;
/*     */         
/*     */ 
/*     */         label351:
/*     */         
/* 138 */         if (!MathUtils.f_ogt(d1, -90.0D))
/*     */         {
/*     */ 
/*     */ 
/* 142 */           n = 2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 149 */           d1 = 90.0D - d1;
/* 150 */           d1 *= 0.5D;
/* 151 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label566;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           d3 = d1 / 90.0D;
/* 162 */           d3 += 0.5D;
/* 163 */           n = (int)SystemLibrary.floor(d3);
/* 164 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0:  break label553;
/*     */             break; case 1:  d3 = 0.0D;
/*     */             break label598;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d3 = 0.0D;
/*     */             
/*     */ 
/*     */             break label598;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 179 */           d3 = -1.0D;
/*     */           
/*     */           break label598;
/*     */           
/*     */           label553:
/* 184 */           d3 = 1.0D;
/*     */           
/*     */           break label598;
/*     */           
/*     */           label566:
/* 189 */           d1 *= 3.141592653589793D;
/* 190 */           d1 /= 180.0D;
/* 191 */           d1 = SystemLibrary.cos(d1);
/* 192 */           d3 = d1;
/*     */           
/*     */ 
/*     */ 
/*     */           label598:
/*     */           
/*     */ 
/* 199 */           d1 = d3 * d3;
/* 200 */           d3 = SystemLibrary.log(d3) * d1;
/* 201 */           d1 = 1.0D - d1;
/* 202 */           d1 = d3 / d1;
/* 203 */           MainMemory.setF64(paramInt + 368, d1);
/* 204 */           d1 = 0.5D - d1;
/* 205 */           MainMemory.setF64(paramInt + 376, d1);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */           d2 *= d1;
/* 214 */           MainMemory.setF64(paramInt + 384, d2);
/* 215 */           MainMemory.setF64(paramInt + 392, 1.0E-4D);
/* 216 */           d2 = d1 * 1.0E-4D;
/* 217 */           MainMemory.setF64(paramInt + 400, d2);
/* 218 */           d2 = 57.29577951308232D / d1;
/* 219 */           MainMemory.setF64(paramInt + 408, d2);
/* 220 */           MainMemory.setI32(paramInt + 448, 2873);
/* 221 */           MainMemory.setI32(paramInt + 452, 2874);
/* 222 */           i1 = paramInt + 344;
/* 223 */           MainMemory.setF64(i1, 0.0D);
/* 224 */           i2 = paramInt + 352;
/* 225 */           MainMemory.setF64(i2, 0.0D);
/* 226 */           i3 = paramInt + 256;
/* 227 */           if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */             i4 = paramInt + 264;
/* 238 */             if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */               break label867;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */           MainMemory.setF64(i3, 0.0D);
/* 249 */           MainMemory.setF64(paramInt + 264, 90.0D);
/* 250 */           i = 0;
/*     */           
/*     */ 
/*     */           break label950;
/*     */           
/*     */           label867:
/*     */           
/* 257 */           if (airs2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */             break label930;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */           MainMemory.setF64(i1, MainMemory.getF64(k));
/* 268 */           MainMemory.setF64(i2, MainMemory.getF64(m));
/* 269 */           i = 0;
/*     */           
/*     */ 
/*     */           break label950;
/*     */           
/*     */           label930:
/*     */           
/* 276 */           i = 2;
/*     */           
/*     */ 
/*     */           break label950;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 284 */       i = n;
/*     */       
/*     */ 
/*     */       label950:
/*     */       
/*     */ 
/* 290 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 295 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/airset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */