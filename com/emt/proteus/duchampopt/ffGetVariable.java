/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffGetVariable extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3156;
/*  12 */   public static final Function _instance = new ffGetVariable();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffGetVariable() { super("ffGetVariable", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2);
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
/*  30 */     int k = call(i, j);
/*  31 */     paramFrame.setI32(paramInt1, k);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*     */     
/*     */ 
/*  46 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  50 */       j = MainMemory.alloc(105);
/*  51 */       k = MainMemory.getI32Aligned(470816);
/*  52 */       if (k == 0) {
/*     */         break label348;
/*     */       } else {
/*  55 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  64 */         if (k <= n) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         m = MainMemory.getI32Aligned(470824);
/*  75 */         if (SystemLibrary.strncasecmp(m + n * 124, paramInt1, 80) != 0) {
/*     */           break label332;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         if (n < 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         switch (MainMemory.getI32(m + n * 124 + 84)) {
/*     */         case 258:  break label260;
/*     */           break; case 259:  k = 268;
/*     */           break label313;
/*     */           break; case 260:  k = 268;
/*     */           
/*     */           break label313;
/*     */           
/*     */           break;
/*     */         case 261: 
/*     */           break label245;
/*     */           break;
/*     */         case 262: 
/*     */           break;
/*     */         }
/*     */         
/* 111 */         k = 271;
/*     */         
/*     */         break label313;
/*     */         
/*     */         label245:
/* 116 */         k = 270;
/*     */         
/*     */         break label313;
/*     */         
/*     */         label260:
/* 121 */         k = 269;
/*     */         
/*     */ 
/*     */         break label313;
/*     */         
/* 126 */         MainMemory.setI32Aligned(470852, 431);
/* 127 */         SystemLibrary.memcpy(j, 67936, 24, 1);
/* 128 */         SystemLibrary.strncat(j, paramInt1, 80);
/* 129 */         ffxmsg.call(5, j);
/* 130 */         k = -1;
/*     */         
/*     */ 
/*     */ 
/*     */         label313:
/*     */         
/*     */ 
/* 137 */         MainMemory.setI32(paramInt2, n);
/* 138 */         i = k;
/*     */         
/*     */ 
/*     */         break label432;
/*     */         
/*     */         label332:
/*     */         
/* 145 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label348:
/*     */       
/* 151 */       i1 = MainMemory.getI32Aligned(470756);
/* 152 */       if (i1 != 0) {
/*     */         break label415;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */       MainMemory.setI32Aligned(470852, 431);
/* 163 */       SystemLibrary.memcpy(j, 65440, 22, 1);
/* 164 */       SystemLibrary.strncat(j, paramInt1, 80);
/* 165 */       ffxmsg.call(5, j);
/* 166 */       i = -1;
/*     */       
/*     */ 
/*     */       break label432;
/*     */       
/*     */       label415:
/*     */       
/* 173 */       k = SystemLibrary.do_indirect(i1, paramInt1, paramInt2);
/* 174 */       i = k;
/*     */       
/*     */ 
/*     */       label432:
/*     */       
/*     */ 
/* 180 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 185 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffGetVariable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */