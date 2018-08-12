/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class celini extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2785;
/*  11 */   public static final Function _instance = new celini();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public celini() { super("celini", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     call(paramInt);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     call(i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  40 */       if (paramInt != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  50 */         MainMemory.setI32(paramInt, 0);
/*  51 */         MainMemory.setI32(paramInt + 4, 0);
/*  52 */         MainMemory.setF64(paramInt + 8, 9.87654321E107D);
/*  53 */         MainMemory.setF64(paramInt + 16, 9.87654321E107D);
/*  54 */         MainMemory.setF64(paramInt + 24, 0.0D);
/*  55 */         MainMemory.setF64(paramInt + 32, 0.0D);
/*  56 */         MainMemory.setF64(paramInt + 40, 9.87654321E107D);
/*  57 */         MainMemory.setF64(paramInt + 48, 90.0D);
/*  58 */         MainMemory.setF64(paramInt + 512, 0.0D);
/*  59 */         MainMemory.setF64(paramInt + 520, 0.0D);
/*  60 */         MainMemory.setF64(paramInt + 528, 0.0D);
/*  61 */         MainMemory.setF64(paramInt + 536, 0.0D);
/*  62 */         MainMemory.setF64(paramInt + 544, 0.0D);
/*  63 */         MainMemory.setI32(paramInt + 552, -1);
/*  64 */         if (paramInt + 56 != 0) {
/*     */           break label168;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label418;
/*     */       
/*     */ 
/*     */ 
/*     */       label168:
/*     */       
/*     */ 
/*     */ 
/*  80 */       MainMemory.setI32(paramInt + 56, 0);
/*  81 */       MainMemory.setI32(paramInt + 60, 2105376);
/*  82 */       MainMemory.setF64(paramInt + 72, 0.0D);
/*  83 */       MainMemory.setF64(paramInt + 80, 9.87654321E107D);
/*  84 */       MainMemory.setF64(paramInt + 88, 9.87654321E107D);
/*  85 */       MainMemory.setF64(paramInt + 96, 9.87654321E107D);
/*  86 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  93 */         MainMemory.setF64(paramInt + 56 + 16 + (i + 4 << 3), 0.0D);
/*  94 */         i += 1;
/*  95 */         if (i == 26) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       MainMemory.setF64(paramInt + 64, 0.0D);
/* 107 */       MainMemory.setF64(paramInt + 312, 9.87654321E107D);
/* 108 */       MainMemory.setF64(paramInt + 320, 9.87654321E107D);
/* 109 */       MainMemory.setI32(paramInt + 328, 1);
/* 110 */       SystemLibrary.memcpy(paramInt + 332, 47840, 10, 1);
/* 111 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 118 */         MainMemory.setI8(paramInt + 56 + 276 + (i + 9), (byte)0);
/* 119 */         i += 1;
/* 120 */         if (i == 31) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       SystemLibrary.memset_long_addr(paramInt + 372, (byte)0, 44L, 4);
/* 132 */       SystemLibrary.memset_long_addr(paramInt + 416, (byte)0, 80L, 4);
/* 133 */       MainMemory.setI32(paramInt + 496, 0);
/* 134 */       MainMemory.setI32(paramInt + 500, 0);
/*     */       
/*     */ 
/*     */       label418:
/*     */       
/*     */ 
/* 140 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/celini.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */