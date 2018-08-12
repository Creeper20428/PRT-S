/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*     */ 
/*     */ public final class ffmkey
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3247;
/*  16 */   public static final Function _instance = new ffmkey();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffmkey() { super("ffmkey", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*     */     
/*     */ 
/*  53 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       i = MainMemory.alloc(81);
/*  58 */       k = MainMemory.getI32(paramInt1);
/*  59 */       j = paramInt1 + 4;
/*  60 */       if (k != MainMemory.getI32(MainMemory.getI32(j) + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         ffmahd.call(paramInt1, k + 1, 0, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  76 */       SystemLibrary.strncpy(i, paramInt2, 80);
/*  77 */       MainMemory.setI8(i + 80, (byte)0);
/*  78 */       k = SystemLibrary.strlen(i);
/*  79 */       if (k == 0) {
/*     */         break label195;
/*     */       } else {
/*  82 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  91 */         paramInt2 = i + m;
/*  92 */         if (!MathUtils.ugt((byte)(MainMemory.getI8(paramInt2) + -32), (byte)94)) {
/*     */           break label169;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         MainMemory.setI8(paramInt2, (byte)32);
/*     */         
/*     */ 
/*     */         label169:
/*     */         
/*     */ 
/* 108 */         m += 1;
/* 109 */         if (m == k) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label195:
/*     */       
/*     */ 
/*     */ 
/* 120 */       if (!MathUtils.ult(k, 80)) {
/*     */         break label271;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       m = 80 - k;
/* 131 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 138 */         MainMemory.setI8(i + (k + n), (byte)32);
/* 139 */         n += 1;
/* 140 */         if (n == m) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label271:
/*     */       
/*     */ 
/*     */ 
/* 151 */       i1 = __ctype_toupper_loc.call();
/* 152 */       MainMemory.setI8(i, (byte)MainMemory.getI32(MainMemory.getI32(i1) + (MainMemory.getI8(i) << 2)));
/* 153 */       paramInt2 = i + 1;
/* 154 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i1) + (MainMemory.getI8(paramInt2) << 2)));
/* 155 */       paramInt2 = i + 2;
/* 156 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i1) + (MainMemory.getI8(paramInt2) << 2)));
/* 157 */       paramInt2 = i + 3;
/* 158 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i1) + (MainMemory.getI8(paramInt2) << 2)));
/* 159 */       paramInt2 = i + 4;
/* 160 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i1) + (MainMemory.getI8(paramInt2) << 2)));
/* 161 */       paramInt2 = i + 5;
/* 162 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i1) + (MainMemory.getI8(paramInt2) << 2)));
/* 163 */       paramInt2 = i + 6;
/* 164 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i1) + (MainMemory.getI8(paramInt2) << 2)));
/* 165 */       paramInt2 = i + 7;
/* 166 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i1) + (MainMemory.getI8(paramInt2) << 2)));
/* 167 */       fftkey.call(i, paramInt3);
/* 168 */       ffmbyt.call(paramInt1, MainMemory.getI64(MainMemory.getI32(j) + 104) + -80L, 0, paramInt3);
/* 169 */       ffpbyt.call(paramInt1, 80L, i, paramInt3);
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
/* 180 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmkey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */