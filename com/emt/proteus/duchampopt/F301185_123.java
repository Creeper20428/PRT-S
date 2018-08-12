/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F301185_123 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new F301185_123();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F301185_123() { super("F301185_123", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  21 */     return 0;
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
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i, j, k, m, n, i1, i2);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     byte b = 0;
/*  62 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       F301051.call(paramInt5);
/*  69 */       i = MainMemory.getI32(paramInt3 + paramInt7 * 344 + 56 + 32);
/*  70 */       if (MainMemory.getI32Aligned(470852) == 0)
/*     */       {
/*  72 */         i2 = MainMemory.getI32Aligned(470812);
/*  73 */         j = MainMemory.getI32(paramInt5 + 56);
/*  74 */         i1 = j * i2;
/*  75 */         if (paramInt4 == 0)
/*     */         {
/*  77 */           if (i1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  82 */             k = paramInt5 + 88;
/*  83 */             m = paramInt5 + 84;
/*  84 */             paramInt1 = i2 * j;
/*  85 */             paramInt4 = paramInt1 + -1;
/*  86 */             paramInt7 = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/*  90 */               i1 = paramInt4 - paramInt7;
/*  91 */               MainMemory.setI8(MainMemory.getI32(k) + i1, (byte)0);
/*  92 */               MainMemory.setI8(MainMemory.getI32(m) + i1, (byte)0);
/*  93 */               paramInt7 += 1;
/*  94 */               if (paramInt7 == paramInt1)
/*     */               {
/*     */                 break;
/*     */ 
/*     */               }
/*     */               
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 112 */           k = paramInt5 + 84;
/* 113 */           m = paramInt3 + paramInt7 * 344 + 56 + 28;
/* 114 */           n = paramInt5 + 88;
/* 115 */           paramInt7 = i1;
/* 116 */           i1 = -1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 121 */           i2 = paramInt7 + -1;
/* 122 */           j = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/* 126 */             paramInt7 = i2 - j;
/* 127 */             if (paramInt7 == -1) {
/*     */               break label419;
/*     */             }
/*     */             
/*     */ 
/* 132 */             b = MainMemory.getI8(MainMemory.getI32(m) + paramInt7);
/* 133 */             MainMemory.setI8(MainMemory.getI32(k) + paramInt7, b);
/* 134 */             j += 1;
/* 135 */             if (b == 0)
/*     */             {
/* 137 */               d = MainMemory.getF64(i + (paramInt7 << 3));
/* 138 */               if (i1 >= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 143 */                 if (!MathUtils.f_olt(d, MainMemory.getF64(paramInt6 + (i1 << 3))))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 148 */                   if (!MathUtils.f_ogt(d, MainMemory.getF64(paramInt6 + (i1 + paramInt4 << 3)))) {
/*     */                     break label380;
/*     */                   }
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */               i1 = F290671.call(d, paramInt4, paramInt6, paramInt2, paramInt1);
/*     */               
/*     */ 
/*     */ 
/*     */               label380:
/*     */               
/*     */ 
/*     */ 
/* 173 */               MainMemory.setI8(MainMemory.getI32(n) + paramInt7, MathUtils.xor((byte)(i1 >>> 31), (byte)1));
/*     */               
/*     */ 
/* 176 */               break;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               break label419;
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
/*     */ 
/*     */       label419:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F301185_123.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */