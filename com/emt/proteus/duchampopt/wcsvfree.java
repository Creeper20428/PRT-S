/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class wcsvfree extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2931;
/*  13 */   public static final Function _instance = new wcsvfree();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public wcsvfree() { super("wcsvfree", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     call(paramInt1, paramInt2);
/*  21 */     return 0;
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
/*  32 */     call(i, j);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*  40 */     int j = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  46 */       if (paramInt2 != 0) {
/*     */         break label31;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label118;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label31:
/*     */       
/*     */ 
/*     */ 
/*  62 */       if (MainMemory.getI32(paramInt1) <= 0) {
/*     */         break label96;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       i = MainMemory.getI32(paramInt2);
/*  73 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/*  80 */         wcsfree.call(i + j * 1616);
/*  81 */         j += 1;
/*  82 */       } while (MainMemory.getI32(paramInt1) > j);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label96:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  93 */       free.call(MainMemory.getI32(paramInt2));
/*  94 */       MainMemory.setI32(paramInt1, 0);
/*  95 */       MainMemory.setI32(paramInt2, 0);
/*     */       
/*     */ 
/*     */       label118:
/*     */       
/*     */ 
/* 101 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsvfree.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */