/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F425188 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3667;
/*  13 */   public static final Function _instance = new F425188();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F425188() { super("F425188", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       if (MainMemory.getI32Aligned(458928) != 0) {
/*     */         break label91;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  55 */       if (SystemLibrary.fwrite(528384, 1, paramInt, MainMemory.getI32Aligned(458760)) != paramInt) {
/*     */         break label69;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label234;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label69:
/*     */       
/*     */ 
/*     */ 
/*  71 */       ffxmsg.call(5, 471008);
/*  72 */       ffxmsg.call(5, 133088);
/*     */       
/*     */ 
/*     */       break label234;
/*     */       
/*     */       label91:
/*     */       
/*  79 */       i = MainMemory.getI32Aligned(459464);
/*  80 */       j = i + paramInt;
/*  81 */       k = MainMemory.getI32Aligned(458892);
/*  82 */       m = MainMemory.getI32(k);
/*  83 */       if (!com.emt.proteus.lib.api.MathUtils.ugt(j, MainMemory.getI32(MainMemory.getI32Aligned(458888)))) {
/*     */         break label218;
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
/*  95 */       MainMemory.setI32(k, com.emt.proteus.runtime.library.c.realloc.call(m, j));
/*  96 */       i = MainMemory.getI32Aligned(459464);
/*  97 */       MainMemory.setI32(MainMemory.getI32Aligned(458888), i + paramInt);
/*  98 */       m = MainMemory.getI32(MainMemory.getI32Aligned(458892));
/*  99 */       if (m != 0) {
/*     */         break label218;
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
/* 111 */       ffxmsg.call(5, 471008);
/* 112 */       ffxmsg.call(5, 104736);
/*     */       
/*     */ 
/*     */       break label234;
/*     */       
/*     */ 
/*     */       label218:
/*     */       
/*     */ 
/* 121 */       SystemLibrary.memcpy(m + i, 528384, paramInt, 1);
/*     */       
/*     */ 
/*     */       label234:
/*     */       
/*     */ 
/* 127 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F425188.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */