/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class wcsfix
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2929;
/*  16 */   public static final Function _instance = new wcsfix();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public wcsfix() { super("wcsfix", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = call(i, j, k);
/*  38 */     paramFrame.setI32(paramInt1, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*  53 */     int i4 = 0;
/*  54 */     int i5 = 0;
/*  55 */     int i6 = 0;
/*  56 */     int i7 = 0;
/*  57 */     int i8 = 0;
/*  58 */     int i9 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       j = paramInt2 == 0 ? 1 : 0;
/*  65 */       if (j != 0) {
/*  66 */         k = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  76 */         k = MainMemory.getI32(paramInt2 + 96);
/*  77 */         if ((k & 0x1) != 0)
/*     */         {
/*     */ 
/*     */ 
/*  81 */           k = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*  88 */         else if ((k & 0x2) == 0) {
/*  89 */           k = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  99 */           k = MainMemory.getI32(paramInt2 + 4);
/* 100 */           if (k <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 104 */             k = -1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 111 */             m = paramInt2 + 88;
/* 112 */             n = (k << 3) + 8;
/* 113 */             i1 = -1;
/* 114 */             i2 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 122 */               i3 = k * i2;
/* 123 */               i4 = n * i2;
/* 124 */               i5 = MainMemory.getI32(m);
/* 125 */               i6 = i5;
/* 126 */               i7 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 133 */                 if (i7 >= k)
/*     */                 {
/*     */ 
/*     */ 
/* 137 */                   i3 = 0;
/* 138 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 144 */                 if (MathUtils.f_une(MainMemory.getF64(i5 + (i3 + i7 << 3)), 0.0D)) {
/*     */                   break label365;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */                 i7 += 1;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 162 */                 if (i3 >= k) {
/*     */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */                 if (MathUtils.f_une(MainMemory.getF64(i5 + (i2 + k * i3 << 3)), 0.0D)) {
/*     */                   break label365;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */                 i3 += 1;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 189 */               MainMemory.setF64(i6 + i4, 1.0D);
/* 190 */               i1 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */               label365:
/*     */               
/*     */ 
/* 197 */               i2 += 1;
/* 198 */               if (i2 == k) {
/* 199 */                 k = i1; break;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */       MainMemory.setI32(paramInt3, k);
/* 213 */       k = k > 0 ? 1 : 0;
/* 214 */       n = datfix.call(paramInt2);
/* 215 */       MainMemory.setI32(paramInt3 + 4, n);
/* 216 */       k = n > 0 ? 1 : k;
/* 217 */       if (j != 0) {
/* 218 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 228 */         i8 = paramInt2 + 4;
/* 229 */         if (MainMemory.getI32(i8) <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 233 */           n = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 240 */           i9 = paramInt2 + 24;
/* 241 */           i1 = -1;
/* 242 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 250 */             n = i2 + 1;
/* 251 */             i1 = wcsutrn.call(1, MainMemory.getI32(i9) + i2 * 72) == 0 ? 0 : i1;
/* 252 */             if (MainMemory.getI32(i8) <= n)
/*     */               break;
/* 254 */             i2 = n;
/*     */           }
/*     */           break label567;
/* 257 */           n = i1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label567:
/*     */       
/*     */ 
/* 266 */       MainMemory.setI32(paramInt3 + 8, n);
/* 267 */       k = n > 0 ? 1 : k;
/* 268 */       n = celfix.call(paramInt2);
/* 269 */       MainMemory.setI32(paramInt3 + 12, n);
/* 270 */       k = n > 0 ? 1 : k;
/* 271 */       n = spcfix.call(paramInt2);
/* 272 */       MainMemory.setI32(paramInt3 + 16, n);
/* 273 */       k = n > 0 ? 1 : k;
/* 274 */       if (paramInt1 != 0) {
/*     */         break label684;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */       MainMemory.setI32(paramInt3 + 20, -2);
/* 285 */       i = k;
/*     */       
/*     */ 
/*     */       break label717;
/*     */       
/*     */       label684:
/*     */       
/* 292 */       n = cylfix.call(paramInt1, paramInt2);
/* 293 */       MainMemory.setI32(paramInt3 + 20, n);
/* 294 */       i = n > 0 ? 1 : k;
/*     */       
/*     */ 
/*     */       label717:
/*     */       
/*     */ 
/* 300 */       int i10 = i; return i10;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsfix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */