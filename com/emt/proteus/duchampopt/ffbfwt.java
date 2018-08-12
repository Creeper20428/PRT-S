/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffbfwt extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2965;
/*  12 */   public static final Function _instance = new ffbfwt();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffbfwt() { super("ffbfwt", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j, k);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     long l1 = 0L;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     long l2 = 0L;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     int i6 = 0;
/*  54 */     int i7 = 0;
/*  55 */     long l3 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       if (MainMemory.getI32(paramInt1 + 72) != 0) {
/*     */         break label137;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */       ffxmsg.call(5, 93984);
/*  72 */       if (MainMemory.getI32(paramInt1 + 4) != 8) {
/*     */         break label108;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       ffxmsg.call(5, 117344);
/*     */       
/*     */ 
/*     */       label108:
/*     */       
/*     */ 
/*  88 */       MainMemory.setI32(paramInt1 + 1376 + (paramInt2 << 2), 0);
/*  89 */       MainMemory.setI32(paramInt3, 112);
/*     */       
/*     */ 
/*     */       break label977;
/*     */       
/*     */       label137:
/*     */       
/*  96 */       i = paramInt1 + 1216 + (paramInt2 << 2);
/*  97 */       l2 = MainMemory.getI32(i) * 2880L;
/*  98 */       j = paramInt1 + 24;
/*  99 */       l3 = MainMemory.getI64(j);
/* 100 */       k = paramInt1 + 52;
/* 101 */       l1 = MainMemory.getI64(k);
/* 102 */       if (l3 >= l2) {
/*     */         break label766;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */       if (l1 == l3) {
/* 113 */         l2 = l3;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 123 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(paramInt1 + 4) * 84 + 72), MainMemory.getI32(paramInt1), l3);
/* 124 */         l2 = MainMemory.getI64(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       if (paramInt2 != 40)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         m = paramInt1 + 1212;
/* 144 */         n = paramInt1 + 4;
/* 145 */         i1 = paramInt1 + 12;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 153 */           i2 = (int)(l2 / 2880L);
/* 154 */           i7 = MainMemory.getI32(i);
/* 155 */           i3 = i7;
/* 156 */           i7 = paramInt2;
/* 157 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 166 */             i5 = MainMemory.getI32(paramInt1 + 1216 + (i4 << 2));
/* 167 */             i6 = (i5 >= i2) && (i5 < i3) ? 1 : 0;
/* 168 */             i7 = i6 != 0 ? i4 : i7;
/* 169 */             i3 = i6 != 0 ? i5 : i3;
/* 170 */             i4 += 1;
/* 171 */             if (i4 == 40) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */           l3 = i3 * 2880L;
/* 185 */           if (l2 >= l3) {
/*     */             break label616;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */           i2 = (int)((l3 - l2) / 2880L);
/* 196 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 203 */             if (i3 >= i2) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */             if (MainMemory.getI32(paramInt3) != 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */             i4 = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(n) * 84 + 80), MainMemory.getI32(paramInt1), 496384, 2880);
/* 224 */             if (i4 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */               ffxmsg.call(5, 82848);
/* 235 */               ffxmsg.call(5, MainMemory.getI32(i1));
/* 236 */               MainMemory.setI32(paramInt3, 106);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 242 */             i3 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 248 */           MainMemory.setI64(j, l3);
/*     */           
/*     */ 
/*     */           label616:
/*     */           
/*     */ 
/* 254 */           i2 = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(n) * 84 + 80), MainMemory.getI32(paramInt1), MainMemory.getI32(m) + i7 * 2880, 2880);
/* 255 */           if (i2 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */             ffxmsg.call(5, 82848);
/* 266 */             ffxmsg.call(5, MainMemory.getI32(i1));
/* 267 */             MainMemory.setI32(paramInt3, 106);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 273 */           MainMemory.setI32(paramInt1 + 1376 + (i7 << 2), 0);
/* 274 */           l2 = MainMemory.getI64(j) + 2880L;
/* 275 */           MainMemory.setI64(j, l2);
/* 276 */           if (i7 == paramInt2) {
/*     */             break;
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
/* 289 */       MainMemory.setI64(k, l2);
/*     */       
/*     */ 
/*     */       break label977;
/*     */       
/*     */       label766:
/*     */       
/* 296 */       if (l1 != l2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(paramInt1 + 4) * 84 + 72), MainMemory.getI32(paramInt1), l2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 312 */       i7 = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(paramInt1 + 4) * 84 + 80), MainMemory.getI32(paramInt1), MainMemory.getI32(paramInt1 + 1212) + paramInt2 * 2880, 2880);
/* 313 */       if (i7 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */         ffxmsg.call(5, 82848);
/* 324 */         ffxmsg.call(5, MainMemory.getI32(paramInt1 + 12));
/* 325 */         MainMemory.setI32(paramInt3, 106);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 331 */       MainMemory.setI64(k, l2 + 2880L);
/* 332 */       l3 = MainMemory.getI64(j);
/* 333 */       if (l3 != l2) {
/*     */         break label959;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */       MainMemory.setI64(j, l3 + 2880L);
/*     */       
/*     */ 
/*     */       label959:
/*     */       
/*     */ 
/* 349 */       MainMemory.setI32(paramInt1 + 1376 + (paramInt2 << 2), 0);
/*     */       
/*     */ 
/*     */       label977:
/*     */       
/*     */ 
/* 355 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffbfwt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */