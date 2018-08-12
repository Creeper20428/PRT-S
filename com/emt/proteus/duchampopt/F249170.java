/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F249170 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2942;
/*  11 */   public static final Function _instance = new F249170();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F249170() { super("F249170", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  18 */     return call();
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = call();
/*  24 */     paramFrame.setI32(paramInt1, i);
/*  25 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call()
/*     */   {
/*  30 */     int i = 0;
/*     */     
/*  32 */     int j = 0;
/*  33 */     int k = 0;
/*  34 */     int m = 0;
/*  35 */     int n = 0;
/*  36 */     int i1 = 0;
/*  37 */     int i2 = 0;
/*  38 */     int i3 = 0;
/*  39 */     int i4 = 0;
/*  40 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  46 */       i2 = MainMemory.getI32(MainMemory.getI32(MainMemory.getI32Aligned(458844)) + 28) + MainMemory.getI32Aligned(459368);
/*  47 */       j = MainMemory.getI32Aligned(458940);
/*  48 */       k = MainMemory.getI32Aligned(459376);
/*  49 */       m = MainMemory.getI32Aligned(458852);
/*  50 */       if (!com.emt.proteus.lib.api.MathUtils.ult(j + k, m))
/*     */       {
/*     */ 
/*     */ 
/*  54 */         k = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  61 */         n = k + 1;
/*  62 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  71 */           i3 = j + (k + i1);
/*  72 */           i4 = j + (n + i1);
/*  73 */           i5 = MainMemory.getI8(i3);
/*  74 */           if (i5 != 0) {
/*     */             break label169;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */           i2 = MainMemory.getI32(160864 + (i2 << 2));
/*     */           
/*     */           break label196;
/*     */           
/*     */           label169:
/*     */           
/*  90 */           i2 = MainMemory.getI16(232608 + (i2 << 8) + ((i5 & 0xFF) << 1));
/*     */           
/*     */ 
/*     */ 
/*     */           label196:
/*     */           
/*     */ 
/*     */ 
/*  98 */           if (MainMemory.getI16(153696 + (i2 << 1)) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */             MainMemory.setI32Aligned(459380, i2);
/* 109 */             MainMemory.setI32Aligned(458848, i3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 115 */           i1 += 1;
/* 116 */           if (!com.emt.proteus.lib.api.MathUtils.ult(i4, m)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         break label269;
/* 121 */         k = i2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label269:
/*     */       
/*     */ 
/*     */ 
/* 130 */       i = k;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       int i6 = i;return i6;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F249170.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */