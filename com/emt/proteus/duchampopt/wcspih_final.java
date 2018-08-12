/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class wcspih_final extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2933;
/*  14 */   public static final Function _instance = new wcspih_final();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public wcspih_final() { super("wcspih_final", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = call(i, j, k, m);
/*  39 */     paramFrame.setI32(paramInt1, n);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     double d1 = 0.0D;
/*  50 */     double d2 = 0.0D;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  67 */         i1 = paramInt2 + (n << 3);
/*  68 */         i2 = paramInt1 + (n << 3);
/*  69 */         if (MainMemory.getI32(paramInt3) <= n) {
/*     */           break label488;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         j = MainMemory.getI32(paramInt4);
/*  80 */         k = j + n * 1616 + 272;
/*  81 */         if (!MathUtils.f_oeq(MainMemory.getF64(k), 9.87654321E107D)) {
/*     */           break label170;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         d2 = MainMemory.getF64(i2);
/*  93 */         if (!MathUtils.f_une(d2, 9.87654321E107D)) {
/*     */           break label170;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         MainMemory.setF64(k, d2);
/* 105 */         j = MainMemory.getI32(paramInt4);
/*     */         
/*     */ 
/*     */ 
/*     */         label170:
/*     */         
/*     */ 
/*     */ 
/* 113 */         k = j + n * 1616 + 544;
/* 114 */         if (!MathUtils.f_oeq(MainMemory.getF64(k), 9.87654321E107D)) {
/*     */           break label306;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         d2 = MainMemory.getF64(i1);
/* 126 */         if (!MathUtils.f_une(d2, 9.87654321E107D)) {
/*     */           break label306;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         d1 = d2 / 2.99792458E8D;
/* 138 */         d2 = d1 + 1.0D;
/* 139 */         d1 *= d1;
/* 140 */         d1 = 1.0D - d1;
/* 141 */         d2 /= com.emt.proteus.runtime.api.SystemLibrary.sqrt(d1);
/* 142 */         d2 += -1.0D;
/* 143 */         MainMemory.setF64(k, d2);
/* 144 */         j = MainMemory.getI32(paramInt4);
/*     */         
/*     */ 
/*     */ 
/*     */         label306:
/*     */         
/*     */ 
/*     */ 
/* 152 */         m = wcstab.call(j + n * 1616);
/* 153 */         if (m != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 169 */       if (paramInt4 != 0) {
/*     */         break label385;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */       i = m;
/*     */       
/*     */ 
/*     */       break label496;
/*     */       
/*     */       label385:
/*     */       
/* 186 */       if (MainMemory.getI32(paramInt3) <= 0) {
/*     */         break label457;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */       j = MainMemory.getI32(paramInt4);
/* 197 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 204 */         wcsfree.call(j + n * 1616);
/* 205 */         n += 1;
/* 206 */       } while (MainMemory.getI32(paramInt3) > n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label457:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 217 */       free.call(MainMemory.getI32(paramInt4));
/* 218 */       MainMemory.setI32(paramInt3, 0);
/* 219 */       MainMemory.setI32(paramInt4, 0);
/* 220 */       i = m;
/*     */       
/*     */ 
/*     */       break label496;
/*     */       
/*     */       label488:
/*     */       
/* 227 */       i = 0;
/*     */       
/*     */ 
/*     */       label496:
/*     */       
/*     */ 
/* 233 */       int i3 = i; return i3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcspih_final.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */