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
/*     */ 
/*     */ public final class ffptbb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2980;
/*  16 */   public static final Function _instance = new ffptbb();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffptbb() { super("ffptbb", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramLong1, paramLong2, paramLong3, paramInt2, paramInt3);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i, l1, l2, l3, j, k);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     long l1 = 0L;
/*  59 */     long l2 = 0L;
/*  60 */     long l3 = 0L;
/*  61 */     double d = 0.0D;
/*  62 */     int n = 0;
/*     */     
/*     */ 
/*  65 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       i = MainMemory.alloc(81);
/*  70 */       if ((MainMemory.getI32(paramInt3) <= 0) && (paramLong3 >= 1L)) {
/*     */         break label77;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label524;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label77:
/*     */       
/*     */ 
/*     */ 
/*  86 */       if (paramLong1 >= 1L) {
/*     */         break label114;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       MainMemory.setI32(paramInt3, 307);
/*     */       
/*     */ 
/*     */       break label524;
/*     */       
/*     */       label114:
/*     */       
/* 103 */       if (paramLong2 >= 1L) {
/*     */         break label151;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       MainMemory.setI32(paramInt3, 308);
/*     */       
/*     */ 
/*     */       break label524;
/*     */       
/*     */       label151:
/*     */       
/* 120 */       j = MainMemory.getI32(paramInt1);
/* 121 */       k = paramInt1 + 4;
/* 122 */       m = MainMemory.getI32(k);
/* 123 */       if (j != MainMemory.getI32(m + 64)) {
/*     */         break label213;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */       ffptbb_1388.call(m, paramInt3, paramInt1);
/*     */       
/*     */       break label230;
/*     */       
/*     */       label213:
/* 138 */       ffmahd.call(paramInt1, j + 1, 0, paramInt3);
/*     */       
/*     */ 
/*     */       label230:
/*     */       
/*     */ 
/* 144 */       m = MainMemory.getI32(k);
/* 145 */       l1 = MainMemory.getI64(m + 936);
/* 146 */       l2 = (paramLong2 + -2L + paramLong3) / l1 + paramLong1;
/* 147 */       l3 = MainMemory.getI64(m + 928);
/* 148 */       if (l3 >= l2) {
/*     */         break label463;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       if (MainMemory.getI32(m + 40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */         if (MainMemory.getI64(m + 956) <= 0L) {
/*     */           break label417;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */       l1 = l2 - l3;
/* 179 */       if (ffirow.call(paramInt1, l3, l1, paramInt3) <= 0) {
/*     */         break label463;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */       d = l1;
/* 190 */       SystemLibrary.sprintf(i, 122912, new Object[] { Double.valueOf(d) });
/* 191 */       ffxmsg.call(5, i);
/*     */       
/*     */ 
/*     */       break label524;
/*     */       
/*     */       label417:
/*     */       
/* 198 */       n = m + 948;
/* 199 */       MainMemory.setI64(n, l1 * (l2 - l3) + MainMemory.getI64(n));
/* 200 */       MainMemory.setI64(MainMemory.getI32(k) + 928, l2);
/*     */       
/*     */ 
/*     */       label463:
/*     */       
/*     */ 
/* 206 */       m = MainMemory.getI32(k);
/* 207 */       ffmbyt.call(paramInt1, paramLong2 + -1L + MainMemory.getI64(m + 112) + MainMemory.getI64(m + 936) * (paramLong1 + -1L), 1, paramInt3);
/* 208 */       ffpbyt.call(paramInt1, paramLong3, paramInt2, paramInt3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label524:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffptbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */