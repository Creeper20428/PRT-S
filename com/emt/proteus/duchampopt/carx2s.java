/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class carx2s extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2828;
/*  12 */   public static final Function _instance = new carx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public carx2s() { super("carx2s", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
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
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     paramFrame.setI32(paramInt1, i6);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     double d = 0.0D;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if (paramInt1 == 0) {
/*  78 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  88 */         if (MainMemory.getI32(paramInt1) != 203)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */           if (carset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 102 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label387;
/*     */           }
/*     */         }
/*     */         
/* 109 */         j = paramInt3 > 0 ? 1 : 0;
/* 110 */         k = j != 0 ? paramInt2 : 1;
/* 111 */         m = j != 0 ? paramInt3 : 1;
/* 112 */         paramInt3 = j != 0 ? paramInt3 : paramInt2;
/* 113 */         if (paramInt2 <= 0) {
/*     */           break label170;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         carx2s_492.call(paramInt1, paramInt6, paramInt5, paramInt2, paramInt8, paramInt4, m);
/*     */         
/*     */ 
/*     */         label170:
/*     */         
/*     */ 
/* 129 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 133 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 140 */           paramInt6 = paramInt1 + 368;
/* 141 */           paramInt8 = paramInt1 + 352;
/* 142 */           if (k <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 146 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 153 */             paramInt2 = k * paramInt5 << 3;
/* 154 */             m = k << 2;
/*     */             
/*     */ 
/* 157 */             n = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 166 */               d = MainMemory.getF64(paramInt7 + (n * paramInt4 << 3)) + MainMemory.getF64(paramInt8);
/* 167 */               d = MainMemory.getF64(paramInt6) * d;
/* 168 */               i1 = paramInt9 + paramInt2;
/* 169 */               i2 = paramInt10 + m;
/* 170 */               i3 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 177 */                 i4 = paramInt10 + (i3 << 2);
/* 178 */                 MainMemory.setF64(paramInt9 + (i3 * paramInt5 << 3), d);
/* 179 */                 MainMemory.setI32(i4, 0);
/* 180 */                 i3 += 1;
/* 181 */                 if (i3 == k) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */               paramInt9 = i1;
/* 193 */               paramInt10 = i2;
/* 194 */               n += 1;
/* 195 */               if (n == paramInt3) {
/* 196 */                 paramInt2 = 0; break;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label387:
/*     */       
/*     */ 
/*     */ 
/* 210 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */       int i5 = i;return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/carx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */