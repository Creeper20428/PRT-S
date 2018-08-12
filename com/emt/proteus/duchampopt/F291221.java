/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F291221 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3171;
/*  11 */   public static final Function _instance = new F291221();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F291221() { super("F291221", 3, false); }
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
/*     */     
/*     */ 
/*  50 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  54 */       i = MainMemory.alloc(256);
/*  55 */       j = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt2);
/*  56 */       k = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt3);
/*  57 */       if (j >= k) {
/*     */         break label237;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */       if (k == j) {
/*  68 */         k = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  78 */         k -= j;
/*  79 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  86 */           MainMemory.setI8(i + m, (byte)48);
/*  87 */           m += 1;
/*  88 */           if (m == k) {
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
/* 101 */       if (j == 0) {
/* 102 */         j = k;
/*     */         break label217;
/*     */       } else {
/* 105 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 114 */         MainMemory.setI8(i + (k + m), MainMemory.getI8(paramInt2 + m));
/* 115 */         m += 1;
/* 116 */         if (m == j) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       j += k;
/*     */       
/*     */ 
/*     */ 
/*     */       label217:
/*     */       
/*     */ 
/*     */ 
/* 135 */       MainMemory.setI8(i + j, (byte)0);
/*     */       
/* 137 */       paramInt2 = i;
/*     */       
/*     */       break label418;
/*     */       
/*     */       label237:
/* 142 */       if (k >= j) {
/*     */         break label418;
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
/* 154 */       if (j == k) {
/* 155 */         j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 165 */         j -= k;
/* 166 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 173 */           MainMemory.setI8(i + m, (byte)48);
/* 174 */           m += 1;
/* 175 */           if (m == j) {
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
/* 188 */       if (k == 0) {
/*     */         break label403;
/*     */       }
/*     */       else {
/* 192 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 201 */         MainMemory.setI8(i + (j + m), MainMemory.getI8(paramInt3 + m));
/* 202 */         m += 1;
/* 203 */         if (m == k) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */       j = k + j;
/*     */       
/*     */ 
/*     */ 
/*     */       label403:
/*     */       
/*     */ 
/*     */ 
/* 222 */       MainMemory.setI8(i + j, (byte)0);
/* 223 */       paramInt3 = i;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label418:
/*     */       
/*     */ 
/*     */ 
/* 232 */       n = MainMemory.getI8(paramInt2);
/* 233 */       if (n == 0) {
/*     */         break label611;
/*     */       }
/*     */       else {
/* 237 */         j = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 248 */         k = j + 1;
/* 249 */         i1 = paramInt2 + k;
/* 250 */         i2 = paramInt1 + j;
/* 251 */         i3 = MainMemory.getI8(paramInt3 + j);
/* 252 */         if ((n != 120) && (i3 != 120)) {
/*     */           break label516;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */         MainMemory.setI8(i2, (byte)120);
/*     */         
/*     */         break label572;
/*     */         
/*     */         label516:
/* 267 */         if ((n != 49) || (i3 != 49)) {
/*     */           break label560;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */         MainMemory.setI8(i2, (byte)49);
/*     */         
/*     */         break label572;
/*     */         
/*     */         label560:
/* 282 */         MainMemory.setI8(i2, (byte)48);
/*     */         
/*     */ 
/*     */         label572:
/*     */         
/*     */ 
/* 288 */         n = MainMemory.getI8(i1);
/* 289 */         if (n == 0) {
/*     */           break;
/*     */         }
/*     */         
/* 293 */         j = k;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */       paramInt1 += k;
/*     */       
/*     */ 
/*     */ 
/*     */       label611:
/*     */       
/*     */ 
/*     */ 
/* 309 */       MainMemory.setI8(paramInt1, (byte)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 320 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F291221.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */