/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4s1_909 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4s1_909();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4s1_909() { super("fffr4s1_909", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, byte paramByte, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramByte, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean);
/*  19 */     return 0;
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
/*  30 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, b, k, m, n, i1, i2, bool);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, byte paramByte, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     float f = 0.0F;
/*  63 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       if (paramBoolean)
/*     */       {
/*  71 */         paramBoolean = paramInt4 == 1;
/*  72 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  76 */           i = paramInt7 + (paramInt4 << 2);
/*  77 */           j = paramInt6 + paramInt4;
/*  78 */           k = paramInt1 + paramInt4;
/*  79 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  80 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  85 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  88 */               f = MainMemory.getF32(i);
/*  89 */               d = f;
/*  90 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -128.49D))
/*     */               {
/*  92 */                 MainMemory.setI32(paramInt5, -11);
/*  93 */                 MainMemory.setI8(j, (byte)Byte.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label285;
/*     */               }
/*  99 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 127.49D))
/*     */               {
/* 101 */                 MainMemory.setI32(paramInt5, -11);
/* 102 */                 MainMemory.setI8(j, (byte)Byte.MAX_VALUE);
/*     */                 
/*     */                 break label285;
/*     */               }
/*     */               else
/*     */               {
/* 108 */                 MainMemory.setI8(j, (byte)(int)f);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label285;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 119 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 124 */               MainMemory.setI8(j, (byte)0);
/* 125 */               break;
/*     */             }
/*     */             
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */           MainMemory.setI32(paramInt2, 1);
/* 137 */           if (paramBoolean)
/*     */           {
/* 139 */             MainMemory.setI8(j, paramByte);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 146 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label285:
/*     */           
/*     */ 
/*     */ 
/* 156 */           paramInt4 += 1;
/* 157 */           if (paramInt4 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4s1_909.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */