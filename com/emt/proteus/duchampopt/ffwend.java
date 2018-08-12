/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffwend
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3230;
/*  14 */   public static final Function _instance = new ffwend();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffwend() { super("ffwend", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2);
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
/*  32 */     int k = call(i, j);
/*  33 */     paramFrame.setI32(paramInt1, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     long l1 = 0L;
/*  48 */     int i3 = 0;
/*  49 */     long l2 = 0L;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*     */     
/*     */ 
/*  54 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       j = MainMemory.alloc(4);
/*  59 */       k = MainMemory.alloc(81);
/*  60 */       m = MainMemory.alloc(81);
/*  61 */       n = MainMemory.alloc(81);
/*  62 */       SystemLibrary.memcpy(n, 144096, 81, 1);
/*  63 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         i1 = paramInt1 + 4;
/*  74 */         i2 = MainMemory.getI32(i1);
/*  75 */         l1 = MainMemory.getI64(i2 + 88);
/*  76 */         i3 = i2 + 112;
/*  77 */         l2 = MainMemory.getI64(i3);
/*  78 */         if (l2 != -1L) {
/*     */           break label186;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         MainMemory.setI64(i3, l1 + 2880L - l1 % 2880L);
/*  90 */         l2 = MainMemory.getI64(MainMemory.getI32(i1) + 112);
/*     */         
/*     */ 
/*     */ 
/*     */         label186:
/*     */         
/*     */ 
/*     */ 
/*  98 */         i4 = (int)((l2 - l1) / 80L);
/*  99 */         SystemLibrary.memcpy(k, 93216, 41, 1);
/* 100 */         SystemLibrary.memcpy(k + SystemLibrary.strlen(k), 93216, 41, 1);
/* 101 */         SystemLibrary.memcpy(m, 93280, 41, 1);
/* 102 */         SystemLibrary.memcpy(m + SystemLibrary.strlen(m), 93216, 41, 1);
/* 103 */         MainMemory.setI32(j, 0);
/* 104 */         ffmbyt.call(paramInt1, l1, 0, j);
/* 105 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 112 */           if (i5 >= i4) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */           ffgbyt.call(paramInt1, 80L, n, j);
/* 123 */           if (MainMemory.getI32(j) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */           if (SystemLibrary.strncmp(n, k, 80) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */             if (SystemLibrary.strncmp(n, m, 80) != 0) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */           i5 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 159 */         if (i5 != i4) {
/*     */           break label548;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */         if (MainMemory.getI32(j) != 0) {
/*     */           break label548;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */         l2 = MainMemory.getI64(MainMemory.getI32(i1) + 112) + -2880L;
/* 180 */         l1 = l2 >= l1 ? l2 : l1;
/* 181 */         ffmbyt.call(paramInt1, l1, 0, j);
/* 182 */         ffgbyt.call(paramInt1, 80L, n, j);
/* 183 */         if (SystemLibrary.strncmp(n, m, 80) != 0) {
/*     */           break label548;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */         if (MainMemory.getI32(j) != 0) {
/*     */           break label548;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */         MainMemory.setI64(MainMemory.getI32(i1) + 96, l1);
/*     */         
/*     */         break label644;
/*     */         
/*     */         label548:
/* 208 */         l1 = MainMemory.getI64(MainMemory.getI32(i1) + 88);
/* 209 */         ffmbyt.call(paramInt1, l1, 1, paramInt2);
/* 210 */         if (i4 > 0) {
/* 211 */           i5 = 0;
/*     */         } else {
/*     */           break label628;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 222 */           ffpbyt.call(paramInt1, 80L, k, paramInt2);
/* 223 */           i5 += 1;
/* 224 */           if (i5 == i4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label628:
/*     */         
/*     */ 
/*     */ 
/* 235 */         ffwend_1441.call(paramInt1, l1, paramInt2, m, i1);
/*     */       }
/*     */       
/*     */ 
/*     */       label644:
/*     */       
/* 241 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 252 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffwend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */