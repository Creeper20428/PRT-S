/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgdesll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3246;
/*  14 */   public static final Function _instance = new ffgdesll();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgdesll() { super("ffgdesll", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramInt5);
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
/*  32 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = call(i, j, l, k, m, n);
/*  45 */     paramFrame.setI32(paramInt1, i1);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*     */     
/*     */ 
/*  63 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  67 */       j = MainMemory.alloc(8);
/*  68 */       k = MainMemory.alloc(16);
/*  69 */       MainMemory.setI32(j, 0);
/*  70 */       m = j + 4;
/*  71 */       MainMemory.setI32(m, 0);
/*  72 */       MainMemory.setI64(k, 0L);
/*  73 */       n = k + 8;
/*  74 */       MainMemory.setI64(n, 0L);
/*  75 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         i1 = MainMemory.getI32(paramInt1);
/*  86 */         i2 = paramInt1 + 4;
/*  87 */         i3 = MainMemory.getI32(i2);
/*  88 */         if (i1 != MainMemory.getI32(i3 + 64)) {
/*     */           break label200;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (MainMemory.getI64(i3 + 112) != -1L) {
/*     */           break label217;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label507;
/*     */         } else {
/*     */           break label217;
/*     */         }
/*     */         
/*     */ 
/*     */         label200:
/*     */         
/* 117 */         ffmahd.call(paramInt1, i1 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label217:
/*     */         
/*     */ 
/* 123 */         i3 = MainMemory.getI32(i2);
/* 124 */         i4 = MainMemory.getI32(i3 + 944);
/* 125 */         paramInt2 += -1;
/* 126 */         if (MainMemory.getI32(i4 + paramInt2 * 152 + 80) <= -1) {
/*     */           break label288;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         MainMemory.setI32(paramInt5, 317);
/*     */         
/*     */         break label507;
/*     */         
/*     */         label288:
/* 141 */         paramLong = MainMemory.getI64(i4 + paramInt2 * 152 + 72) + MainMemory.getI64(i3 + 112) + MainMemory.getI64(i3 + 936) * (paramLong + -1L);
/* 142 */         if (MainMemory.getI8(i4 + paramInt2 * 152 + 136) != 80)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */           if (MainMemory.getI8(i4 + paramInt2 * 152 + 136 + 1) != 80) {
/*     */             break label418;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         ffgdesll_1004.call(paramInt5, m, paramInt3, paramInt1, paramInt4, j, paramLong);
/*     */         
/*     */         break label507;
/*     */         
/*     */         label418:
/* 167 */         if (ffgi8b.call(paramInt1, paramLong, 2, 8, k, paramInt5) >= 1) {
/*     */           break label507;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */         if (paramInt3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */           MainMemory.setI64(paramInt3, MainMemory.getI64(k));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 193 */         if (paramInt4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */           MainMemory.setI64(paramInt4, MainMemory.getI64(n));
/*     */         }
/*     */       }
/*     */       
/*     */       label507:
/*     */       
/* 209 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 220 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgdesll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */