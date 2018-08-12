/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN9PixelInfo4Scan7addScanERKS0_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 326;
/*  11 */   public static final Function _instance = new _ZN9PixelInfo4Scan7addScanERKS0_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN9PixelInfo4Scan7addScanERKS0_() { super("_ZN9PixelInfo4Scan7addScanERKS0_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     byte b = call(i, j);
/*  30 */     paramFrame.setI8(paramInt1, b);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     byte b1 = 0;
/*     */     
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     byte b2 = 0;
/*  45 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       i = MainMemory.getI32(paramInt1 + 4) == MainMemory.getI32(paramInt2 + 4) ? 1 : 0;
/*  52 */       if (i == 0)
/*     */       {
/*     */ 
/*     */ 
/*  56 */         n = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  63 */         m = paramInt1 + 8;
/*  64 */         n = MainMemory.getI32(m);
/*  65 */         j = MainMemory.getI32(paramInt2 + 8);
/*  66 */         k = n > j ? 1 : 0;
/*  67 */         if (k == 0) {
/*     */           break label152;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         i1 = n < MainMemory.getI32(paramInt2 + 12) + j ? 1 : 0;
/*     */         
/*     */         break label179;
/*     */         
/*     */         label152:
/*     */         
/*  83 */         i1 = j < MainMemory.getI32(paramInt1 + 12) + n ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label179:
/*     */         
/*     */ 
/*     */ 
/*  91 */         if (i1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */           i1 = j;
/*  98 */           b2 = 1;
/*     */           
/*     */ 
/*     */           break label368;
/*     */         }
/*     */         
/*     */ 
/* 105 */         if (i == 0)
/*     */         {
/*     */ 
/*     */ 
/* 109 */           n = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 116 */           if (k == 0) {
/*     */             break label274;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */           n = n == MainMemory.getI32(paramInt2 + 12) + j ? 1 : 0;
/*     */           
/*     */           break label301;
/*     */           
/*     */           label274:
/*     */           
/* 132 */           n = j == MainMemory.getI32(paramInt1 + 12) + n ? 1 : 0;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label301:
/*     */       
/*     */ 
/* 140 */       b2 = (byte)n;
/* 141 */       if (b2 != 0) {
/*     */         break label337;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       b1 = b2;
/*     */       
/*     */ 
/*     */       break label459;
/*     */       
/*     */       label337:
/*     */       
/* 158 */       j = MainMemory.getI32(paramInt2 + 8);
/* 159 */       m = paramInt1 + 8;
/* 160 */       n = MainMemory.getI32(m);
/*     */       
/*     */ 
/* 163 */       i1 = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label368:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 174 */       j = i1 < n ? i1 : n;
/* 175 */       i1 = i1 + -1 + MainMemory.getI32(paramInt2 + 12);
/* 176 */       i2 = paramInt1 + 12;
/* 177 */       n = n + -1 + MainMemory.getI32(i2);
/* 178 */       n = n < i1 ? i1 : n;
/* 179 */       MainMemory.setI32(m, j);
/* 180 */       MainMemory.setI32(i2, 1 - j + n);
/* 181 */       b1 = b2;
/*     */       
/*     */ 
/*     */       label459:
/*     */       
/*     */ 
/* 187 */       byte b3 = b1; return b3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo4Scan7addScanERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */