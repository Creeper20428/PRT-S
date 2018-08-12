/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4u2_914 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4u2_914();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4u2_914() { super("fffr4u2_914", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6, int paramInt7, short paramShort)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramInt5, paramInt6, paramInt7, paramShort);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
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
/*  48 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, bool, m, n, i1, i2, s);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6, int paramInt7, short paramShort)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     float f = 0.0F;
/*  63 */     double d = 0.0D;
/*  64 */     short s = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       if (paramBoolean)
/*     */       {
/*  72 */         paramBoolean = paramInt4 == 1;
/*  73 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  77 */           i = paramInt6 + (paramInt4 << 2);
/*  78 */           j = paramInt2 + (paramInt4 << 1);
/*  79 */           k = paramInt1 + paramInt4;
/*  80 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  81 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  86 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  89 */               f = MainMemory.getF32(i);
/*  90 */               d = f;
/*  91 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */               {
/*  93 */                 MainMemory.setI32(paramInt7, -11);
/*  94 */                 MainMemory.setI16(j, (short)0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label291;
/*     */               }
/* 100 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 65535.49D))
/*     */               {
/* 102 */                 MainMemory.setI32(paramInt7, -11);
/* 103 */                 MainMemory.setI16(j, (short)-1);
/*     */                 
/*     */                 break label291;
/*     */               }
/*     */               else
/*     */               {
/* 109 */                 s = (short)(int)Math.abs(f);
/* 110 */                 MainMemory.setI16(j, s);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label291;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 121 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 126 */               MainMemory.setI16(j, (short)0);
/* 127 */               break;
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
/* 138 */           MainMemory.setI32(paramInt5, 1);
/* 139 */           if (paramBoolean)
/*     */           {
/* 141 */             MainMemory.setI16(j, paramShort);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 148 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label291:
/*     */           
/*     */ 
/*     */ 
/* 158 */           paramInt4 += 1;
/* 159 */           if (paramInt4 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4u2_914.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */