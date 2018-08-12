/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class ffpdfl
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3229;
/*  15 */   public static final Function _instance = new ffpdfl();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpdfl() { super("ffpdfl", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     long l1 = 0L;
/*  45 */     long l2 = 0L;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     byte b = 0;
/*     */     
/*     */ 
/*  52 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       i = MainMemory.alloc(2880);
/*  57 */       j = MainMemory.alloc(4);
/*  58 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */         k = MainMemory.getI32(paramInt1 + 4);
/*  69 */         if (MainMemory.getI32(paramInt1) != MainMemory.getI32(k + 64)) {
/*     */           break label460;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         l1 = MainMemory.getI64(k + 948);
/*  80 */         if (l1 != 0L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */           l1 = l1 + MainMemory.getI64(k + 112) + MainMemory.getI64(k + 956);
/*  91 */           l2 = l1 + 2879L;
/*  92 */           m = (int)(l2 - l2 % 2880L);
/*  93 */           n = (int)l1;
/*  94 */           i1 = m - n;
/*  95 */           b = MainMemory.getI32(k + 68) == 1 ? 32 : 0;
/*  96 */           MainMemory.setI32(j, 0);
/*  97 */           if (m != n) {
/*     */             break label276;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           l1 += -1L;
/* 108 */           ffmbyt.call(paramInt1, l1, 0, j);
/* 109 */           ffgbyt.call(paramInt1, 1L, i, j);
/* 110 */           if (MainMemory.getI32(j) == 0) {
/*     */             break label460;
/*     */           }
/*     */           else {
/* 114 */             i1 = 1;
/*     */             
/*     */             break label396;
/*     */           }
/*     */           
/*     */           label276:
/*     */           
/* 121 */           ffmbyt.call(paramInt1, l1, 0, j);
/* 122 */           ffgbyt.call(paramInt1, i1, i, j);
/* 123 */           if (MainMemory.getI32(j) == 0) {
/* 124 */             m = 0;
/*     */           } else {
/*     */             break label396;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 137 */             if (m >= i1) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */             if (MainMemory.getI8(i + m) != b) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */             m += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 163 */           if (m != i1)
/*     */           {
/*     */             label396:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */             SystemLibrary.memset(i, b, i1, 1);
/* 178 */             ffmbyt.call(paramInt1, l1, 1, paramInt2);
/* 179 */             ffpbyt.call(paramInt1, i1, i, paramInt2);
/* 180 */             if (MainMemory.getI32(paramInt2) <= 0) {
/*     */               break label460;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */             ffxmsg.call(5, 101024);
/*     */             
/*     */ 
/*     */ 
/*     */             break label465;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label460:
/*     */       
/*     */ 
/*     */       label465:
/*     */       
/*     */ 
/* 207 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpdfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */