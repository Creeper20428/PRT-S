/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffcdel
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3144;
/*  13 */   public static final Function _instance = new ffcdel();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffcdel() { super("ffcdel", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt2)
/*     */   {
/*  20 */     call(paramInt1, paramLong1, paramLong2, paramLong3, paramLong4, paramInt2);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i, l1, l2, l3, l4, j);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt2)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     long l1 = 0L;
/*  53 */     long l2 = 0L;
/*  54 */     int j = 0;
/*  55 */     long l3 = 0L;
/*  56 */     long l4 = 0L;
/*     */     
/*     */ 
/*  59 */     int k = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(10000);
/*  64 */       if ((MainMemory.getI32(paramInt2) > 0) || (paramLong2 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         l1 = paramLong1 - paramLong3;
/*  75 */         if (l1 >= 10001L) {
/*     */           break label312;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         l2 = paramLong4 + 1L;
/*  86 */         paramLong3 = l2 + paramLong3;
/*  87 */         if (paramLong2 <= 1L) {
/*     */           break label217;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         j = paramInt1 + 4;
/*  98 */         l3 = paramLong2 + -1L;
/*  99 */         l4 = 0L;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 106 */           l4 += 1L;
/* 107 */           ffgtbb.call(paramInt1, l4, paramLong3, l1, i, paramInt2);
/* 108 */           MainMemory.setI64(MainMemory.getI32(j) + 936, l1);
/* 109 */           ffptbb.call(paramInt1, l4, l2, l1, i, paramInt2);
/* 110 */           MainMemory.setI64(MainMemory.getI32(j) + 936, paramLong1);
/* 111 */           if (l4 == l3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label217:
/*     */         
/*     */ 
/*     */ 
/* 122 */         paramLong4 = l1 - paramLong4;
/* 123 */         if (paramLong4 <= 0L) {
/*     */           break label393;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         ffgtbb.call(paramInt1, paramLong2, paramLong3, paramLong4, i, paramInt2);
/* 134 */         j = paramInt1 + 4;
/* 135 */         MainMemory.setI64(MainMemory.getI32(j) + 936, l1);
/* 136 */         ffptbb.call(paramInt1, paramLong2, l2, paramLong4, i, paramInt2);
/* 137 */         MainMemory.setI64(MainMemory.getI32(j) + 936, paramLong1);
/*     */         
/*     */ 
/*     */         break label398;
/*     */         
/*     */         label312:
/*     */         
/* 144 */         l2 = l1 + 9999L;
/* 145 */         l3 = l2 / 10000L;
/* 146 */         if (paramLong2 <= 1L) {
/*     */           break label372;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */         ffcdel_546.call(paramLong3, l1, l2, paramInt1, i, paramLong4, paramInt2, l3, paramLong1, paramLong2);
/*     */         
/*     */ 
/*     */         label372:
/*     */         
/*     */ 
/* 162 */         ffcdel_547.call(paramLong3, paramInt1, i, paramLong4, l1, paramInt2, paramLong1, paramLong2);
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label393:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label398:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 178 */       MainMemory.dealloc_generated(k);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcdel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */