/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgknm extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3404;
/*  11 */   public static final Function _instance = new ffgknm();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffgknm() { super("ffgknm", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  46 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       MainMemory.setI8(paramInt2, (byte)0);
/*  53 */       MainMemory.setI32(paramInt3, 0);
/*  54 */       if (MainMemory.getI8(paramInt1) != 72)
/*     */       {
/*     */ 
/*     */ 
/*  58 */         m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  65 */       else if (SystemLibrary.strncmp(paramInt1, 47360, 9) != 0)
/*     */       {
/*     */ 
/*     */ 
/*  69 */         m = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  76 */         i = SystemLibrary.strchr(paramInt1, 61);
/*  77 */         if (i != 0) {
/*     */           break label136;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         SystemLibrary.memcpy(paramInt2 + SystemLibrary.strlen(paramInt2), 44128, 9, 1);
/*  88 */         MainMemory.setI32(paramInt3, 8);
/*     */         
/*     */ 
/*     */         break label490;
/*     */         
/*     */         label136:
/*     */         
/*  95 */         j = paramInt1 + 9;
/*  96 */         if (MainMemory.getI8(j) == 32) {
/*  97 */           m = 0;
/*     */         }
/*     */         else
/*     */         {
/* 101 */           paramInt1 = j;
/*     */           
/*     */ 
/*     */           break label212;
/*     */         }
/*     */         
/*     */         for (;;)
/*     */         {
/* 109 */           j = paramInt1 + (m + 10);
/* 110 */           m += 1;
/* 111 */           if (MainMemory.getI8(j) != 32)
/*     */             break;
/*     */         }
/*     */         break label212;
/* 115 */         paramInt1 = j;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label212:
/*     */         
/*     */ 
/*     */ 
/* 124 */         n = i;
/* 125 */         k = paramInt1;
/* 126 */         m = n - k;
/* 127 */         SystemLibrary.strncat(paramInt2, paramInt1, m);
/* 128 */         n = n + -1 - k;
/* 129 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 136 */           i1 = m - k;
/* 137 */           if (i1 < 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */           if (MainMemory.getI8(paramInt2 + (n - k)) != 32) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 163 */         MainMemory.setI8(paramInt2 + i1, (byte)0);
/* 164 */         m = i1;
/*     */         
/*     */         break label479;
/*     */       }
/*     */       for (;;)
/*     */       {
/* 170 */         i = paramInt2 + m;
/* 171 */         if (m >= 8) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         b = MainMemory.getI8(paramInt1 + m);
/* 182 */         switch (b)
/*     */         {
/*     */         case 0: 
/*     */           break;
/*     */         case 32: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 194 */         MainMemory.setI8(i, (byte)0);
/* 195 */         MainMemory.setI32(paramInt3, m);
/*     */         
/*     */ 
/*     */ 
/*     */         break label490;
/*     */         
/*     */ 
/* 202 */         MainMemory.setI8(i, b);
/* 203 */         m += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 209 */       MainMemory.setI8(paramInt2 + 8, (byte)0);
/* 210 */       m = 8;
/*     */       
/*     */ 
/*     */ 
/*     */       label479:
/*     */       
/*     */ 
/* 217 */       MainMemory.setI32(paramInt3, m);
/*     */       
/*     */ 
/*     */       label490:
/*     */       
/*     */ 
/* 223 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgknm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */