/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F368254 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3468;
/*  14 */   public static final Function _instance = new F368254();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F368254() { super("F368254", 2, false); }
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
/*  43 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       j = calloc.call(161, 1);
/*  50 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*  54 */         k = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  61 */         ffxmsg.call(5, 117216);
/*  62 */         paramInt1 = 0;
/*     */         
/*     */         break label123;
/*     */       }
/*     */       for (;;)
/*     */       {
/*  68 */         b = MainMemory.getI8(paramInt1 + (k + paramInt2));
/*  69 */         MainMemory.setI8(j + k, com.emt.proteus.lib.api.MathUtils.ult((byte)(b + -1), (byte)31) ? 32 : b);
/*  70 */         k += 1;
/*  71 */         if (k == 160) {
/*  72 */           paramInt1 = j; break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label123:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  84 */       j = calloc.call(80, 1);
/*  85 */       if (j != 0) {
/*     */         break label165;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       ffxmsg.call(5, 117152);
/*  96 */       j = 0;
/*     */       
/*     */       break label230;
/*     */       
/*     */       label165:
/* 101 */       paramInt2 = MainMemory.getI8(paramInt1) == 0 ? 1 : 0;
/* 102 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 109 */         MainMemory.setI8(j + k, MainMemory.getI8(paramInt1 + (k << 1 | paramInt2)));
/* 110 */         k += 1;
/* 111 */         if (k == 79) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label230:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 124 */       free.call(paramInt1);
/* 125 */       i = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       int m = i;return m;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F368254.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */