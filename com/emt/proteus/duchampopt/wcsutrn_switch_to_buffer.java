/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class wcsutrn_switch_to_buffer extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2957;
/*  13 */   public static final Function _instance = new wcsutrn_switch_to_buffer();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public wcsutrn_switch_to_buffer() { super("wcsutrn_switch_to_buffer", 1, false); }
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
/*  40 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  46 */       k = MainMemory.getI32Aligned(458880);
/*  47 */       if (k != 0) {
/*     */         break label69;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */       i = malloc.call(4);
/*  58 */       k = i;
/*  59 */       MainMemory.setI32Aligned(458880, k);
/*  60 */       MainMemory.setI32(i, 0);
/*  61 */       MainMemory.setI32Aligned(459420, 1);
/*     */       
/*     */       break label139;
/*     */       
/*     */       label69:
/*     */       
/*  67 */       j = MainMemory.getI32Aligned(459420);
/*  68 */       if (j != 1) {
/*     */         break label139;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       j += 8;
/*  80 */       k = com.emt.proteus.runtime.library.c.realloc.call(k, j << 2);
/*  81 */       MainMemory.setI32Aligned(458880, k);
/*  82 */       com.emt.proteus.runtime.api.SystemLibrary.memset(k + (MainMemory.getI32Aligned(459420) << 2), (byte)0, 32, 4);
/*  83 */       MainMemory.setI32Aligned(459420, j);
/*     */       
/*     */ 
/*     */ 
/*     */       label139:
/*     */       
/*     */ 
/*     */ 
/*  91 */       m = k == 0 ? 1 : 0;
/*  92 */       if (m != 0) {
/*  93 */         n = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 103 */         n = MainMemory.getI32(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */       if (n != paramInt) {
/*     */         break label208;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label292;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label208:
/*     */       
/*     */ 
/*     */ 
/* 127 */       if (m == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         wcsutrn_switch_to_buffer_1760.call(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 143 */       MainMemory.setI32(k, paramInt);
/* 144 */       MainMemory.setI32Aligned(459416, MainMemory.getI32(paramInt + 16));
/* 145 */       i = MainMemory.getI32(paramInt + 8);
/* 146 */       MainMemory.setI32Aligned(458884, i);
/* 147 */       MainMemory.setI32Aligned(458944, i);
/* 148 */       MainMemory.setI32Aligned(458812, MainMemory.getI32(paramInt));
/* 149 */       MainMemory.setI8(459036, MainMemory.getI8(i));
/*     */       
/*     */ 
/*     */       label292:
/*     */       
/*     */ 
/* 155 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsutrn_switch_to_buffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */