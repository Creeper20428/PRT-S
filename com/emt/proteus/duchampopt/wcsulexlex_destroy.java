/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class wcsulexlex_destroy extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2944;
/*  13 */   public static final Function _instance = new wcsulexlex_destroy();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public wcsulexlex_destroy() { super("wcsulexlex_destroy", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  20 */     call();
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     call();
/*  27 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call()
/*     */   {
/*  33 */     int i = 0;
/*  34 */     int j = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*     */       for (;;)
/*     */       {
/*  45 */         i = MainMemory.getI32Aligned(458844);
/*  46 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  56 */           j = MainMemory.getI32(i);
/*  57 */           if (j != 0) {
/*     */             break label107;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */         free.call(i);
/*  68 */         MainMemory.setI32Aligned(458844, 0);
/*  69 */         MainMemory.setI32Aligned(459388, 0);
/*  70 */         MainMemory.setI32Aligned(458852, 0);
/*  71 */         MainMemory.setI1(459028, false);
/*  72 */         MainMemory.setI32Aligned(459368, 0);
/*  73 */         MainMemory.setI32Aligned(458804, 0);
/*  74 */         MainMemory.setI32Aligned(458808, 0);
/*  75 */         break;
/*     */         
/*     */ 
/*     */         label107:
/*     */         
/*     */ 
/*  81 */         MainMemory.setI32(i, 0);
/*  82 */         if (MainMemory.getI32(j + 20) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */           free.call(MainMemory.getI32(j + 4));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  98 */         free.call(j);
/*  99 */         MainMemory.setI32(MainMemory.getI32Aligned(458844), 0);
/* 100 */         wcsulexpop_buffer_state.call();
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsulexlex_destroy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */