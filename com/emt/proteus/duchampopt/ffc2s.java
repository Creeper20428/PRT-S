/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffc2s extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3217;
/*  12 */   public static final Function _instance = new ffc2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffc2s() { super("ffc2s", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     byte b = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */         if (MainMemory.getI8(paramInt1) != 39) {
/*     */           break label344;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         j = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt1);
/*  74 */         m = 0;
/*  75 */         n = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  83 */           i1 = paramInt2 + m;
/*  84 */           if (!com.emt.proteus.lib.api.MathUtils.ult(n, j)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */           b = MainMemory.getI8(paramInt1 + n);
/*  95 */           if (b != 39) {
/*     */             break label173;
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
/* 107 */           k = n + 1;
/* 108 */           b = MainMemory.getI8(paramInt1 + k);
/* 109 */           if (b == 39)
/*     */           {
/* 111 */             n = k;
/*     */           } else {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label173:
/*     */           
/*     */ 
/*     */ 
/* 123 */           MainMemory.setI8(i1, b);
/* 124 */           n += 1;
/* 125 */           m += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         MainMemory.setI8(i1, (byte)0);
/* 133 */         if (n != j) {
/*     */           break label256;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         ffxmsg.call(5, 108000);
/* 144 */         ffxmsg.call(5, paramInt1);
/* 145 */         MainMemory.setI32(paramInt3, 205);
/*     */         
/*     */         break label355;
/*     */         
/*     */         label256:
/* 150 */         j = m + -1;
/* 151 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 158 */           n = j - m;
/* 159 */           paramInt1 = paramInt2 + n;
/* 160 */           if (n <= -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */           if (MainMemory.getI8(paramInt1) != 32) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */           MainMemory.setI8(paramInt1, (byte)0);
/* 181 */           m += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label344:
/*     */         
/* 187 */         com.emt.proteus.runtime.api.SystemLibrary.strcpy(paramInt2, paramInt1);
/*     */       }
/*     */       
/*     */ 
/*     */       label355:
/*     */       
/* 193 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       int i2 = i;return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffc2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */