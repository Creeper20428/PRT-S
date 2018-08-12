/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgbyt extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2968;
/*  13 */   public static final Function _instance = new ffgbyt();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffgbyt() { super("ffgbyt", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramLong, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = call(i, l, j, k);
/*  38 */     paramFrame.setI32(paramInt1, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, long paramLong, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     long l = 0L;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         i2 = MainMemory.getI32(paramInt1);
/*  71 */         j = paramInt1 + 4;
/*  72 */         k = MainMemory.getI32(j);
/*  73 */         if (i2 != MainMemory.getI32(k + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */           ffmahd.call(paramInt1, i2 + 1, 0, paramInt3);
/*  85 */           k = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         if (paramLong <= 8639L) {
/*     */           break label428;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         l = MainMemory.getI64(k + 44);
/* 104 */         i2 = (int)(l / 2880L);
/* 105 */         i3 = (int)((paramLong + -1L + l) / 2880L);
/*     */         
/* 107 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 115 */           if (MainMemory.getI32(k + 1376 + (i4 << 2)) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */             ffgbyt_973.call(paramInt3, i2, k, i3, i4);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 131 */           i4 += 1;
/* 132 */           k = MainMemory.getI32(j);
/* 133 */           if (i4 == 40) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         if (MainMemory.getI64(k + 52) != l)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */           SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(k + 4) * 84 + 72), MainMemory.getI32(k), l);
/* 157 */           k = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         i2 = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(k + 4) * 84 + 76), MainMemory.getI32(k), paramInt2, (int)paramLong);
/* 166 */         if (i2 != 107) {
/*     */           break label389;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         MainMemory.setI32(paramInt3, 107);
/*     */         
/*     */         break label403;
/*     */         
/*     */         label389:
/* 181 */         ffgbyt_972.call(paramInt3, k, i2);
/*     */         
/*     */ 
/*     */         label403:
/*     */         
/*     */ 
/* 187 */         MainMemory.setI64(MainMemory.getI32(j) + 52, l + paramLong);
/*     */         
/*     */         break label568;
/*     */         
/*     */         label428:
/* 192 */         i2 = MainMemory.getI32(k + 60);
/* 193 */         if (i2 >= 0) {
/*     */           break label498;
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
/* 205 */         ffldrc.call(paramInt1, (int)(MainMemory.getI64(k + 44) / 2880L), 0, paramInt3);
/* 206 */         k = MainMemory.getI32(j);
/* 207 */         i2 = MainMemory.getI32(k + 60);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label498:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 217 */         i2 = (int)MainMemory.getI64(k + 44) - MainMemory.getI32(k + 1216 + (i2 << 2)) * 2880;
/* 218 */         i3 = 2880 - i2;
/* 219 */         i4 = (int)paramLong;
/*     */       }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 242 */         if (i4 != 0) {
/*     */           break label585;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label568:
/*     */         
/*     */ 
/*     */ 
/* 252 */         i = MainMemory.getI32(paramInt3);
/* 253 */         break;
/*     */         
/*     */ 
/*     */         label585:
/*     */         
/*     */ 
/* 259 */         m = i3 <= i4 ? i3 : i4;
/* 260 */         k = MainMemory.getI32(j);
/* 261 */         SystemLibrary.memcpy(paramInt2, MainMemory.getI32(k + 1212) + (MainMemory.getI32(k + 60) * 2880 + i2), m, 1);
/* 262 */         n = i4 - m;
/* 263 */         paramInt2 += m;
/* 264 */         i1 = MainMemory.getI32(j) + 44;
/* 265 */         MainMemory.setI64(i1, MainMemory.getI64(i1) + m);
/* 266 */         if (i4 == m) {
/* 267 */           i4 = n;
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
/* 278 */           ffldrc.call(paramInt1, (int)(MainMemory.getI64(MainMemory.getI32(j) + 44) / 2880L), 0, paramInt3);
/* 279 */           i4 = n;
/* 280 */           i2 = 0;
/* 281 */           i3 = 2880;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 286 */       int i5 = i;return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgbyt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */