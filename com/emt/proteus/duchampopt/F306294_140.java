/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F306294_140 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new F306294_140();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F306294_140() { super("F306294_140", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  45 */     call(i, j, k, m, n, i1, i2);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       if (MainMemory.getI32Aligned(470852) == 0)
/*     */       {
/*  69 */         i = paramInt3 + paramInt1 * 344 + 56 + 32;
/*  70 */         j = MainMemory.getI32(i);
/*  71 */         k = paramInt3 + paramInt1 * 344 + 56 + 28;
/*  72 */         paramInt1 = MainMemory.getI32(k);
/*  73 */         m = paramInt5 > 0 ? 1 : 0;
/*  74 */         if (MainMemory.getI32(paramInt7) == 288)
/*     */         {
/*  76 */           if (m != 0)
/*     */           {
/*  78 */             i1 = paramInt3 + paramInt2 * 344 + 56 + 28;
/*  79 */             n = paramInt3 + paramInt2 * 344 + 56 + 32;
/*  80 */             i2 = paramInt7 + 88;
/*  81 */             i3 = paramInt7 + 84;
/*  82 */             paramInt2 = paramInt4 * paramInt6;
/*  83 */             paramInt5 = j;
/*  84 */             paramInt4 = 0;
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/*  89 */               if (MainMemory.getI8(MainMemory.getI32(i1) + paramInt4) == 0)
/*     */               {
/*  91 */                 paramInt5 = MainMemory.getI32(MainMemory.getI32(n) + (paramInt4 << 2)) + paramInt5;
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
/* 105 */               MainMemory.setI32(MainMemory.getI32(i2) + (paramInt4 << 2), paramInt5);
/* 106 */               MainMemory.setI8(MainMemory.getI32(i3) + paramInt4, (byte)0);
/* 107 */               paramInt4 += 1;
/* 108 */               if (paramInt4 == paramInt2) {
/* 109 */                 paramInt2 = paramInt5; break;
/*     */ 
/*     */ 
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 126 */             paramInt2 = j;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 136 */         else if (m != 0)
/*     */         {
/* 138 */           n = paramInt3 + paramInt2 * 344 + 56 + 32;
/* 139 */           i1 = paramInt3 + paramInt2 * 344 + 56 + 28;
/* 140 */           i2 = paramInt7 + 88;
/* 141 */           i3 = paramInt7 + 84;
/* 142 */           paramInt2 = paramInt4 * paramInt6;
/* 143 */           i4 = MainMemory.getI32(i1);
/*     */           
/* 145 */           paramInt4 = paramInt1;
/* 146 */           paramInt6 = j;
/* 147 */           paramInt5 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 154 */             paramInt1 = MainMemory.getI32(MainMemory.getI32(n) + (paramInt5 << 2));
/* 155 */             i5 = MainMemory.getI32(i2);
/* 156 */             if ((MainMemory.getI8(i4 + paramInt5) != 0) || (paramInt4 != 0))
/*     */             {
/* 158 */               MainMemory.setI32(i5 + (paramInt5 << 2), 0);
/* 159 */               MainMemory.setI8(MainMemory.getI32(i3) + paramInt5, (byte)1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 166 */               MainMemory.setI32(i5 + (paramInt5 << 2), paramInt1 - paramInt6);
/* 167 */               MainMemory.setI8(MainMemory.getI32(i3) + paramInt5, (byte)0);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */             i4 = MainMemory.getI32(i1);
/* 176 */             paramInt4 = MainMemory.getI8(i4 + paramInt5);
/* 177 */             paramInt5 += 1;
/* 178 */             if (paramInt5 == paramInt2) {
/* 179 */               paramInt2 = paramInt1;
/* 180 */               paramInt1 = paramInt4; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 186 */             paramInt6 = paramInt1;
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
/*     */ 
/* 198 */           paramInt2 = j;
/*     */         }
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
/* 211 */         MainMemory.setI32(i, paramInt2);
/* 212 */         MainMemory.setI32(k, paramInt1);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F306294_140.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */