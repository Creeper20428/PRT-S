/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F428580 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3679;
/*  11 */   public static final Function _instance = new F428580();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F428580() { super("F428580", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       i5 = MainMemory.getI16(paramInt2 + 2);
/*  59 */       i7 = i5 == 0 ? 1 : 0;
/*  60 */       MainMemory.setI16(paramInt2 + (paramInt3 + 1 << 2) + 2, (short)-1);
/*  61 */       if (paramInt3 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */         i2 = i7 != 0 ? 3 : 4;
/*  72 */         n = i7 != 0 ? 138 : 7;
/*  73 */         i6 = i5 & 0xFFFF;
/*  74 */         i = paramInt1 + 2752;
/*  75 */         j = paramInt1 + 2756;
/*  76 */         k = paramInt1 + 2748;
/*  77 */         m = i2;
/*     */         
/*  79 */         i1 = 0;
/*  80 */         i2 = 1;
/*  81 */         i3 = -1;
/*  82 */         i4 = i6;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  94 */         i5 = MainMemory.getI16(paramInt2 + (i2 << 2) + 2);
/*  95 */         i6 = i5 & 0xFFFF;
/*  96 */         i1 += 1;
/*  97 */         i7 = i4 == i6 ? 1 : 0;
/*  98 */         if ((i1 < n) && (i7 != 0)) {
/*  99 */           i4 = i3;
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
/* 112 */           if (i1 >= m) {
/*     */             break label284;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */           i8 = paramInt1 + 2684 + (i4 << 2);
/* 123 */           MainMemory.setI16(i8, (short)(MainMemory.getI16(i8) + (short)i1));
/*     */           
/*     */           break label431;
/*     */           
/*     */           label284:
/* 128 */           if (i4 != 0) {
/*     */             break label366;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */           if (i1 >= 11) {
/*     */             break label343;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */           MainMemory.setI16(i, (short)(MainMemory.getI16(i) + 1));
/*     */           
/*     */           break label431;
/*     */           
/*     */           label343:
/* 153 */           MainMemory.setI16(j, (short)(MainMemory.getI16(j) + 1));
/*     */           
/*     */           break label431;
/*     */           
/*     */           label366:
/* 158 */           if (i4 != i3)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */             i8 = paramInt1 + 2684 + (i4 << 2);
/* 169 */             MainMemory.setI16(i8, (short)(MainMemory.getI16(i8) + 1));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 175 */           MainMemory.setI16(k, (short)(MainMemory.getI16(k) + 1));
/*     */           
/*     */ 
/*     */           label431:
/*     */           
/*     */ 
/* 181 */           if (i5 == 0)
/*     */           {
/* 183 */             i1 = 0;
/* 184 */             n = 138;
/* 185 */             m = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 195 */           else if (i7 != 0)
/*     */           {
/* 197 */             i1 = 0;
/* 198 */             n = 6;
/* 199 */             m = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 210 */             i1 = 0;
/* 211 */             n = 7;
/* 212 */             m = 4;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */         if (i2 <= paramInt3) {
/*     */           break label526;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */         break;
/*     */         
/*     */ 
/*     */         label526:
/*     */         
/*     */ 
/* 238 */         i2 += 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 243 */         i3 = i4;
/* 244 */         i4 = i6;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F428580.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */