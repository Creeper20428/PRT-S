/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffwritehisto extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3459;
/*  12 */   public static final Function _instance = new ffwritehisto();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffwritehisto() { super("ffwritehisto", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*     */     
/*     */ 
/*  59 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       j = MainMemory.alloc(1220);
/*  64 */       k = MainMemory.alloc(4);
/*  65 */       MainMemory.setI32(k, 0);
/*  66 */       switch (MainMemory.getI32(paramInt7 + 28)) {
/*     */       case 11: 
/*     */         break label232;
/*     */         break;
/*     */       case 21: 
/*     */         break label209;
/*     */         break;
/*     */       case 31: 
/*     */         break label186;
/*     */         break;
/*     */       case 42: 
/*     */         break label163;
/*     */         break;
/*     */       case 82:  break; }
/*  80 */       MainMemory.setI32(paramInt7, MainMemory.getI32(paramInt6 + 88));
/*     */       
/*     */       break label250;
/*     */       
/*     */       label163:
/*  85 */       MainMemory.setI32(paramInt7, MainMemory.getI32(paramInt6 + 88));
/*     */       
/*     */       break label250;
/*     */       
/*     */       label186:
/*  90 */       MainMemory.setI32(paramInt7, MainMemory.getI32(paramInt6 + 88));
/*     */       
/*     */       break label250;
/*     */       
/*     */       label209:
/*  95 */       MainMemory.setI32(paramInt7, MainMemory.getI32(paramInt6 + 88));
/*     */       
/*     */       break label250;
/*     */       
/*     */       label232:
/* 100 */       MainMemory.setI32(paramInt7, MainMemory.getI32(paramInt6 + 88));
/*     */       
/*     */ 
/*     */       label250:
/*     */       
/*     */ 
/* 106 */       paramInt1 = MainMemory.getI32(paramInt7 + 8);
/* 107 */       if (paramInt1 <= 0) {
/*     */         break label380;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       m = MainMemory.getI32(paramInt7 + 4);
/* 118 */       paramInt2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 125 */         MainMemory.setI32(j + paramInt2 * 244, m);
/* 126 */         MainMemory.setI32(j + paramInt2 * 244 + 4, MainMemory.getI32(paramInt7 + ((paramInt2 << 2) + 12)));
/* 127 */         MainMemory.setI32(j + paramInt2 * 244 + 80, 42);
/* 128 */         MainMemory.setI32(j + paramInt2 * 244 + 84, 0);
/* 129 */         paramInt2 += 1;
/* 130 */       } while (paramInt1 > paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label380:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 141 */       if (!com.emt.proteus.lib.api.MathUtils.f_oeq(MainMemory.getF32(paramInt7 + 104), -9.119119840596153E-36D)) {
/*     */         break label490;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */       MainMemory.setI32(j + paramInt1 * 244, MainMemory.getI32(paramInt7 + 4));
/* 153 */       MainMemory.setI32(j + paramInt1 * 244 + 4, MainMemory.getI32(paramInt7 + 100));
/* 154 */       MainMemory.setI32(j + paramInt1 * 244 + 80, 42);
/* 155 */       MainMemory.setI32(j + paramInt1 * 244 + 84, 0);
/* 156 */       paramInt1 += 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label490:
/*     */       
/*     */ 
/*     */ 
/* 164 */       ffiter.call(paramInt1, j, 0, 0, 3458, paramInt7, k);
/* 165 */       i = MainMemory.getI32(k);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 176 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffwritehisto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */