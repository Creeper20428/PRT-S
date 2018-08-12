/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_get_token extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2985;
/*  12 */   public static final Function _instance = new fits_get_token();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_get_token() { super("fits_get_token", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  36 */     int n = call(i, j, k, m);
/*  37 */     paramFrame.setI32(paramInt1, n);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     int i = 0;
/*     */     
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       MainMemory.setI8(paramInt3, (byte)0);
/*  55 */       j = MainMemory.getI32(paramInt1);
/*  56 */       if (MainMemory.getI8(j) != 32) {
/*     */         break label81;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/*  69 */         j += 1;
/*  70 */         MainMemory.setI32(paramInt1, j);
/*  71 */       } while (MainMemory.getI8(j) == 32);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label81:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       k = com.emt.proteus.runtime.api.SystemLibrary.strcspn(j, paramInt2);
/*  85 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         com.emt.proteus.runtime.api.SystemLibrary.strncat(paramInt3, j, k);
/*  96 */         MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt1) + k);
/*  97 */         if (paramInt4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           MainMemory.setI32(paramInt4, 1);
/* 108 */           n = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 115 */             if (n >= k) {
/*     */               break label289;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */             paramInt2 = paramInt3 + n;
/* 126 */             m = MainMemory.getI8(paramInt2);
/* 127 */             if (((MainMemory.getI16(MainMemory.getI32(com.emt.proteus.runtime.library.ctype.__ctype_b_loc.call()) + (m << 1)) & 0xFFFF & 0x800) == 0) && (m != 46) && (m != 45) && (m != 43) && (m != 69) && (m != 101)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */             n += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 143 */           MainMemory.setI32(paramInt4, 0);
/* 144 */           i = k;
/*     */           
/*     */           break label298;
/*     */         }
/*     */       }
/*     */       
/*     */       label289:
/* 151 */       i = k;
/*     */       
/*     */ 
/*     */       label298:
/*     */       
/*     */ 
/* 157 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_get_token.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */