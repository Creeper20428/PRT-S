/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class mem_close_comp extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3053;
/*  14 */   public static final Function _instance = new mem_close_comp();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public mem_close_comp() { super("mem_close_comp", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = call(i);
/*  30 */     paramFrame.setI32(paramInt1, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*     */     
/*     */ 
/*  45 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  49 */       j = MainMemory.alloc(4);
/*  50 */       k = MainMemory.alloc(4);
/*  51 */       MainMemory.setI32(j, 0);
/*  52 */       m = 512000 + paramInt * 44 + 40;
/*  53 */       n = 512000 + paramInt * 44 + 4;
/*  54 */       if (compress2file_from_mem.call(MainMemory.getI32(n), (int)MainMemory.getI64(512000 + paramInt * 44 + 32), MainMemory.getI32(m), k, j) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */         ffxmsg.call(5, 117792);
/*  65 */         MainMemory.setI32(j, 106);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  71 */       free.call(MainMemory.getI32(n));
/*  72 */       MainMemory.setI32(512000 + paramInt * 44, 0);
/*  73 */       MainMemory.setI32(n, 0);
/*  74 */       i1 = MainMemory.getI32(m);
/*  75 */       if (i1 != MainMemory.getI32Aligned(1792))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         SystemLibrary.fclose(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  91 */       i = MainMemory.getI32(j);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 102 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_close_comp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */