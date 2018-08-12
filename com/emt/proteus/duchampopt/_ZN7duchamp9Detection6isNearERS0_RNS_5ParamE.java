/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp9Detection6isNearERS0_RNS_5ParamE extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 828;
/*  11 */   public static final Function _instance = new _ZN7duchamp9Detection6isNearERS0_RNS_5ParamE();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp9Detection6isNearERS0_RNS_5ParamE() { super("_ZN7duchamp9Detection6isNearERS0_RNS_5ParamE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     byte b = call(i, j, k);
/*  33 */     paramFrame.setI8(paramInt1, b);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     byte b1 = 0;
/*     */     
/*  41 */     float f = 0.0F;
/*  42 */     int i = 0;
/*  43 */     byte b2 = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       f = MainMemory.getF32(paramInt3 + 524);
/*  53 */       if (MainMemory.getI8(paramInt3 + 516) != 0)
/*     */       {
/*     */ 
/*     */ 
/*  57 */         i = 1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  64 */         i = (int)com.emt.proteus.runtime.api.SystemLibrary.ceilf(MainMemory.getF32(paramInt3 + 520));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       j = MainMemory.getI32(paramInt1 + 44) - i;
/*  73 */       k = MainMemory.getI32(paramInt2 + 44);
/*  74 */       if (j >= k) {
/*     */         break label150;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       b2 = (byte)(MainMemory.getI32(paramInt1 + 48) + i >= k ? 1 : 0);
/*     */       
/*     */       break label175;
/*     */       
/*     */       label150:
/*     */       
/*  90 */       b2 = (byte)(MainMemory.getI32(paramInt2 + 48) >= j ? 1 : 0);
/*     */       
/*     */ 
/*     */ 
/*     */       label175:
/*     */       
/*     */ 
/*     */ 
/*  98 */       if (b2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         j = MainMemory.getI32(paramInt1 + 52) - i;
/* 110 */         k = MainMemory.getI32(paramInt2 + 52);
/* 111 */         m = b2 != 1 ? 1 : 0;
/* 112 */         if (j >= k) {
/*     */           break label298;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         if (m != 0) {
/* 123 */           b2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 133 */           if (MainMemory.getI32(paramInt1 + 56) + i < k) {
/* 134 */             b2 = 0;
/*     */             
/*     */             break label344;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label357;
/*     */           }
/*     */           label298:
/* 143 */           if (m != 0) {
/* 144 */             b2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 154 */           else if (MainMemory.getI32(paramInt2 + 56) < j) {
/* 155 */             b2 = 0;
/*     */           } else {
/*     */             break label357;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label344:
/*     */       
/*     */ 
/* 166 */       b1 = b2;
/*     */       
/*     */ 
/*     */       break label462;
/*     */       
/*     */       label357:
/*     */       
/* 173 */       i = (int)com.emt.proteus.runtime.api.SystemLibrary.ceilf(f);
/* 174 */       j = MainMemory.getI32(paramInt1 + 60) - i;
/* 175 */       k = MainMemory.getI32(paramInt2 + 60);
/* 176 */       if (j >= k) {
/*     */         break label438;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */       b1 = (byte)(MainMemory.getI32(paramInt1 + 64) + i >= k ? 1 : 0);
/*     */       
/*     */ 
/*     */       break label462;
/*     */       
/*     */       label438:
/*     */       
/* 193 */       b1 = (byte)(MainMemory.getI32(paramInt2 + 64) >= j ? 1 : 0);
/*     */       
/*     */ 
/*     */       label462:
/*     */       
/*     */ 
/* 199 */       byte b3 = b1; return b3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection6isNearERS0_RNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */