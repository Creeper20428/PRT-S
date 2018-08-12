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
/*     */ public final class ffdblk
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3232;
/*  15 */   public static final Function _instance = new ffdblk();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffdblk() { super("ffdblk", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = call(i, j, k);
/*  37 */     paramFrame.setI32(paramInt1, m);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*     */     
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     long l1 = 0L;
/*  50 */     long l2 = 0L;
/*  51 */     long l3 = 0L;
/*  52 */     long l4 = 0L;
/*  53 */     long l5 = 0L;
/*  54 */     long l6 = 0L;
/*  55 */     int i1 = 0;
/*     */     
/*     */ 
/*  58 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       j = MainMemory.alloc(2880);
/*  63 */       k = MainMemory.alloc(4);
/*  64 */       if ((MainMemory.getI32(paramInt3) > 0) || (paramInt2 >= 1))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         MainMemory.setI32(k, 0);
/*  75 */         m = paramInt1 + 4;
/*  76 */         n = MainMemory.getI32(m);
/*  77 */         l2 = MainMemory.getI64(n + 112);
/*  78 */         l6 = MainMemory.getI64(n + 948);
/*  79 */         l1 = MainMemory.getI64(n + 956);
/*  80 */         l1 = l2 + l6 + l1 + 2879L - (l2 + 2879L + l6 + l1) % 2880L;
/*  81 */         l2 = paramInt2 * 2880L;
/*  82 */         l3 = l1 - l2;
/*  83 */         l4 = 0L;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  90 */           l5 = l4 * 2880L;
/*  91 */           l6 = l3 + l5;
/*  92 */           if (ffmbyt.call(paramInt1, l1 + l5, 0, k) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */           if (ffgbyt.call(paramInt1, 2880L, j, k) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */           ffmbyt.call(paramInt1, l6, 0, paramInt3);
/* 113 */           ffpbyt.call(paramInt1, 2880L, j, paramInt3);
/* 114 */           if (MainMemory.getI32(paramInt3) <= 0) {
/*     */             break label306;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */           ffxmsg.call(5, 84256);
/*     */           
/*     */           break label417;
/*     */           
/*     */           label306:
/* 129 */           l6 = l4 + 1L;
/* 130 */           l4 = l6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 135 */         SystemLibrary.memset(j, (byte)0, 2880, 1);
/* 136 */         ffmbyt.call(paramInt1, l6, 0, paramInt3);
/* 137 */         if (paramInt2 > 0) {
/* 138 */           i1 = 0;
/*     */         } else {
/*     */           break label401;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 149 */           ffpbyt.call(paramInt1, 2880L, j, paramInt3);
/* 150 */           i1 += 1;
/* 151 */           if (i1 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label401:
/*     */         
/*     */ 
/*     */ 
/* 162 */         ffdblk_594.call(m, paramInt3, l2, l6, paramInt1);
/*     */       }
/*     */       
/*     */ 
/*     */       label417:
/*     */       
/* 168 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 179 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdblk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */