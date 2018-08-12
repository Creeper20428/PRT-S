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
/*     */ public final class ffgtbb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2975;
/*  15 */   public static final Function _instance = new ffgtbb();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgtbb() { super("ffgtbb", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramLong3, paramInt2, paramInt3);
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
/*  37 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, l1, l2, l3, j, k);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     long l = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  62 */       if ((MainMemory.getI32(paramInt3) <= 0) && (paramLong3 >= 1L)) {
/*     */         break label50;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label310;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label50:
/*     */       
/*     */ 
/*     */ 
/*  78 */       if (paramLong1 >= 1L) {
/*     */         break label87;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       MainMemory.setI32(paramInt3, 307);
/*     */       
/*     */ 
/*     */       break label310;
/*     */       
/*     */       label87:
/*     */       
/*  95 */       if (paramLong2 >= 1L) {
/*     */         break label124;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */       MainMemory.setI32(paramInt3, 308);
/*     */       
/*     */ 
/*     */       break label310;
/*     */       
/*     */       label124:
/*     */       
/* 112 */       i = MainMemory.getI32(paramInt1);
/* 113 */       j = paramInt1 + 4;
/* 114 */       k = MainMemory.getI32(j);
/* 115 */       if (i != MainMemory.getI32(k + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         ffmahd.call(paramInt1, i + 1, 0, paramInt3);
/* 127 */         k = MainMemory.getI32(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */       l = MainMemory.getI64(k + 936);
/* 136 */       if (MainMemory.getI64(k + 928) >= (paramLong2 + -2L + paramLong3) / l + paramLong1) {
/*     */         break label263;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       ffxmsg.call(5, 97824);
/* 147 */       MainMemory.setI32(paramInt3, 307);
/*     */       
/*     */ 
/*     */       break label310;
/*     */       
/*     */       label263:
/*     */       
/* 154 */       ffmbyt.call(paramInt1, paramLong2 + -1L + MainMemory.getI64(k + 112) + l * (paramLong1 + -1L), 0, paramInt3);
/* 155 */       ffgbyt.call(paramInt1, paramLong3, paramInt2, paramInt3);
/*     */       
/*     */ 
/*     */       label310:
/*     */       
/*     */ 
/* 161 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */