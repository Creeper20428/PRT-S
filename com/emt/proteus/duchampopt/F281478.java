/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F281478 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3155;
/*  11 */   public static final Function _instance = new F281478();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F281478() { super("F281478", 0, false); }
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
/*  41 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       n = MainMemory.getI1(459060) ? 1 : 0;
/*  48 */       j = MainMemory.getI32Aligned(458904);
/*  49 */       k = MainMemory.getI32Aligned(458900);
/*  50 */       if (com.emt.proteus.lib.api.MathUtils.ult(j, k)) {
/*  51 */         i6 = 0;
/*  52 */         m = n;
/*     */       }
/*     */       else
/*     */       {
/*     */         break label358;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       n = i6 + 1;
/*  66 */       i1 = j + n;
/*  67 */       i2 = j + i6;
/*  68 */       i3 = MainMemory.getI8(i2);
/*  69 */       if (i3 == 0) {
/*  70 */         i4 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  80 */         i6 = MainMemory.getI32(158688 + ((i3 & 0xFF) << 2));
/*  81 */         i4 = i6;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       if (MainMemory.getI16(148992 + (m << 1)) == 0) {
/*  89 */         i6 = m;
/*  90 */         m = i4;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 100 */         MainMemory.setI32Aligned(459528, m);
/* 101 */         MainMemory.setI32Aligned(458896, i2);
/* 102 */         i6 = m;
/* 103 */         m = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 111 */         m &= 0xFF;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 119 */           i4 = MainMemory.getI16(149664 + (i6 << 1)) + m;
/* 120 */           if (MainMemory.getI16(156064 + (i4 << 1)) != i6) {
/*     */             break label301;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */           m = MainMemory.getI16(156928 + (i4 << 1));
/* 131 */           if (com.emt.proteus.lib.api.MathUtils.ult(i1, k)) {
/* 132 */             i6 = n;
/*     */             
/* 134 */             break;
/*     */             break label301; }
/* 136 */           n = m;
/*     */           
/*     */ 
/*     */           break label358;
/*     */           
/*     */           label301:
/*     */           
/* 143 */           i5 = MainMemory.getI16(149312 + (i6 << 1));
/* 144 */           i6 = i5;
/* 145 */           if (i5 > 159) {
/*     */             break label338;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label338:
/*     */         
/*     */ 
/*     */ 
/* 156 */         m = MainMemory.getI32(147680 + (m << 2));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label358:
/*     */       
/*     */ 
/* 164 */       i = n;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */       int i7 = i;return i7;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F281478.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */