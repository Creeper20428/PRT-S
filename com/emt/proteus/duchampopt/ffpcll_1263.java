/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class ffpcll_1263
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  15 */   public static final Function _instance = new ffpcll_1263();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpcll_1263() { super("ffpcll_1263", 24, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, long paramLong2, int paramInt14, int paramInt15, int paramInt16, int paramInt17, long paramLong3, int paramInt18, int paramInt19, int paramInt20, int paramInt21)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramLong1, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramLong2, paramInt14, paramInt15, paramInt16, paramInt17, paramLong3, paramInt18, paramInt19, paramInt20, paramInt21);
/*  23 */     return 0;
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
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  65 */     paramInt4 += 2;
/*  66 */     paramInt3--;
/*  67 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  68 */     paramInt4 += 2;
/*  69 */     paramInt3--;
/*  70 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  71 */     paramInt4 += 2;
/*  72 */     paramInt3--;
/*  73 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  74 */     paramInt4 += 2;
/*  75 */     paramInt3--;
/*  76 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  77 */     paramInt4 += 2;
/*  78 */     paramInt3--;
/*  79 */     int i11 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  80 */     paramInt4 += 2;
/*  81 */     paramInt3--;
/*  82 */     int i12 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  83 */     paramInt4 += 2;
/*  84 */     paramInt3--;
/*  85 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  86 */     paramInt4 += 2;
/*  87 */     paramInt3--;
/*  88 */     int i13 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  89 */     paramInt4 += 2;
/*  90 */     paramInt3--;
/*  91 */     int i14 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  92 */     paramInt4 += 2;
/*  93 */     paramInt3--;
/*  94 */     int i15 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  95 */     paramInt4 += 2;
/*  96 */     paramInt3--;
/*  97 */     int i16 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  98 */     paramInt4 += 2;
/*  99 */     paramInt3--;
/* 100 */     call(i, j, k, m, n, i1, i2, l1, i3, i4, i5, i6, i7, i8, l2, i9, i10, i11, i12, l3, i13, i14, i15, i16);
/* 101 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, long paramLong2, int paramInt14, int paramInt15, int paramInt16, int paramInt17, long paramLong3, int paramInt18, int paramInt19, int paramInt20, int paramInt21)
/*     */   {
/* 107 */     long l1 = 0L;
/* 108 */     long l2 = 0L;
/* 109 */     long l3 = 0L;
/* 110 */     int i = 0;
/* 111 */     long l4 = 0L;
/* 112 */     long l5 = 0L;
/* 113 */     long l6 = 0L;
/* 114 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 120 */       if (ffgcprll.call(paramInt16, paramInt11, paramLong2, paramLong3, paramLong1, 1, paramInt2, paramInt4, paramInt18, paramInt15, paramInt1, paramInt12, paramInt8, paramInt13, paramInt14, paramInt17, paramInt7, paramInt3, paramInt19, paramInt10, paramInt20) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 125 */         if (MainMemory.getI32(paramInt1) == 14) {
/* 126 */           paramLong2 = 0L;
/* 127 */           l3 = paramLong1;
/* 128 */           paramLong1 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */           paramLong3 = paramInt21 + (int)paramLong1 & 0xFFFFFFFF;
/* 135 */           l1 = paramLong1 + 1L;
/* 136 */           l2 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 142 */             i = (int)(paramLong3 + l2);
/* 143 */             l4 = l3 + -1L;
/* 144 */             l5 = 0L;
/*     */             
/*     */             for (;;)
/*     */             {
/* 148 */               if (l3 == l5) {
/*     */                 break label396;
/*     */               }
/*     */               
/*     */ 
/* 153 */               l6 = MainMemory.getI64(paramInt13);
/* 154 */               ffmbyt.call(paramInt16, MainMemory.getI64(paramInt8) + MainMemory.getI64(paramInt7) * paramLong2 + MainMemory.getI32(paramInt14) * l6, 1, paramInt20);
/* 155 */               if (MainMemory.getI8(i) == 0)
/*     */               {
/* 157 */                 ffpbyt.call(paramInt16, 1L, paramInt9, paramInt20);
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 164 */                 ffpbyt.call(paramInt16, 1L, paramInt6, paramInt20);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */               if (MainMemory.getI32(paramInt20) > 0)
/*     */               {
/* 174 */                 d = paramLong1 + l2 + 1L;
/* 175 */                 SystemLibrary.sprintf(paramInt5, 133536, new Object[] { Double.valueOf(d) });
/* 176 */                 ffxmsg.call(5, paramInt5);
/*     */                 
/*     */ 
/*     */                 break label396;
/*     */               }
/*     */               
/*     */ 
/* 183 */               if (l4 != l5)
/*     */                 break;
/* 185 */               l6 = l5 + 1L;
/* 186 */               l5 = l6;
/*     */             }
/*     */             
/*     */ 
/*     */             break label396;
/*     */             
/* 192 */             l3 = l4 - l5;
/* 193 */             l4 = l6 + 1L;
/* 194 */             MainMemory.setI64(paramInt13, l4);
/* 195 */             l6 = l2 + 1L;
/* 196 */             if (l4 == MainMemory.getI64(paramInt17))
/*     */             {
/* 198 */               paramLong1 = l1 + l2;
/* 199 */               MainMemory.setI64(paramInt13, 0L);
/* 200 */               paramLong2 += 1L;
/*     */               
/*     */ 
/*     */ 
/* 204 */               break;
/*     */               
/*     */               break label396;
/*     */             }
/* 208 */             l2 = l6;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */           MainMemory.setI32(paramInt20, 310);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label396:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 247 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcll_1263.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */