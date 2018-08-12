/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgpvui
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3377;
/*  15 */   public static final Function _instance = new ffgpvui();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgpvui() { super("ffgpvui", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, short paramShort, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramShort, paramInt2, paramInt3, paramInt4);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, l1, l2, s, j, k, m);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, short paramShort, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  56 */     int i = 0;
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*     */     
/*     */ 
/*  63 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  67 */       i = MainMemory.alloc(1);
/*  68 */       j = MainMemory.alloc(2);
/*  69 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         k = MainMemory.getI32(paramInt1);
/*  80 */         m = paramInt1 + 4;
/*  81 */         n = MainMemory.getI32(m);
/*  82 */         if (k != MainMemory.getI32(n + 64)) {
/*     */           break label161;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         if (MainMemory.getI64(n + 112) != -1L) {
/*     */           break label178;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         if (ffrdef.call(paramInt1, paramInt4) <= 0) {
/*     */           break label178;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         k = MainMemory.getI32(paramInt4);
/*     */         
/*     */         break label205;
/*     */         
/*     */         label161:
/*     */         
/* 118 */         ffmahd.call(paramInt1, k + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label178:
/*     */         
/*     */ 
/* 124 */         k = MainMemory.getI32(MainMemory.getI32(m) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label205:
/*     */         
/*     */ 
/*     */ 
/* 132 */         if (k != 0) {
/*     */           break label252;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */       ffgclui.call(paramInt1, 2, 1L, paramLong1, paramLong2, 1, paramShort, paramInt2, i, paramInt3, paramInt4);
/*     */       
/*     */ 
/*     */       break label282;
/*     */       
/*     */       label252:
/*     */       
/* 149 */       MainMemory.setI16(j, paramShort);
/* 150 */       fits_read_compressed_pixels.call(paramInt1, 20, paramLong1, paramLong2, 1, j, paramInt2, 0, paramInt3, paramInt4);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label282:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgpvui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */