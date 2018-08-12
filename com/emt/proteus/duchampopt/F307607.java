/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F307607 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3196;
/*  12 */   public static final Function _instance = new F307607();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F307607() { super("F307607", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = call(i, j, k, m, n);
/*  40 */     paramFrame.setI32(paramInt1, i1);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*     */     
/*     */ 
/*  52 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       j = MainMemory.alloc(80);
/*  57 */       if (paramInt4 != 0) {
/*     */         break label48;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       paramInt4 = SystemLibrary.strlen(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */       label48:
/*     */       
/*     */ 
/*     */ 
/*  76 */       if (paramInt5 >= 0) {
/*     */         break label138;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label100;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       MainMemory.setI32Aligned(470852, 431);
/*     */       
/*     */ 
/*     */       label100:
/*     */       
/*     */ 
/* 102 */       SystemLibrary.strncpy(j, 86048, 80);
/* 103 */       MainMemory.setI8(j + 79, (byte)0);
/* 104 */       ffxmsg.call(5, j);
/* 105 */       i = -1;
/*     */       
/*     */ 
/*     */       break label276;
/*     */       
/*     */       label138:
/*     */       
/* 112 */       if ((paramInt4 >= paramInt5) && (paramInt5 != 0)) {
/*     */         break label179;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */       SystemLibrary.memset(paramInt1, (byte)0, paramInt2, 1);
/*     */       
/*     */       break label261;
/*     */       
/*     */       label179:
/* 127 */       if (paramInt5 + paramInt2 <= paramInt4) {
/*     */         break label244;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       paramInt4 = paramInt4 - paramInt5 + 1;
/* 138 */       k = paramInt2 - paramInt4;
/* 139 */       SystemLibrary.memcpy(paramInt1, paramInt3 + (paramInt5 + -1), paramInt4, 1);
/* 140 */       SystemLibrary.memset(paramInt1 + paramInt4, (byte)0, k, 1);
/*     */       
/*     */       break label261;
/*     */       
/*     */       label244:
/* 145 */       SystemLibrary.memcpy(paramInt1, paramInt3 + (paramInt5 + -1), paramInt2, 1);
/*     */       
/*     */ 
/*     */       label261:
/*     */       
/*     */ 
/* 151 */       MainMemory.setI8(paramInt1 + paramInt2, (byte)0);
/* 152 */       i = 0;
/*     */       
/*     */ 
/*     */       label276:
/*     */       
/*     */ 
/* 158 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 163 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F307607.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */