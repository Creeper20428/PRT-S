/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpnul
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3601;
/*  13 */   public static final Function _instance = new ffpnul();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffpnul() { super("ffpnul", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramLong, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = call(i, l, j);
/*  35 */     paramFrame.setI32(paramInt1, k);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, long paramLong, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */         j = MainMemory.getI32(paramInt1);
/*  62 */         k = paramInt1 + 4;
/*  63 */         m = MainMemory.getI32(k);
/*  64 */         if (j != 0) {
/*     */           break label91;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         if (MainMemory.getI64(m + 88) == 0L) {
/*  75 */           j = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           label91:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */           if (j != MainMemory.getI32(m + 64)) {
/*     */             break label174;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */           if (MainMemory.getI64(m + 112) != -1L) {
/*     */             break label190;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           if (ffrdef.call(paramInt1, paramInt2) > 0) {
/* 106 */             j = 0;
/*     */             
/*     */             break label240;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label190;
/*     */           }
/*     */           label174:
/* 115 */           ffmahd.call(paramInt1, j + 1, 0, paramInt2);
/*     */           
/*     */ 
/*     */           label190:
/*     */           
/*     */ 
/* 121 */           m = MainMemory.getI32(k);
/* 122 */           if (MainMemory.getI32(m + 1012) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 126 */             j = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 133 */             j = MainMemory.getI32(m + 68);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label240:
/*     */         
/*     */ 
/* 141 */         if (MainMemory.getI32(paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */           if (j != 0) {
/*     */             break label470;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           j = MainMemory.getI32(paramInt1);
/* 162 */           m = MainMemory.getI32(k);
/* 163 */           if (j != MainMemory.getI32(m + 64)) {
/*     */             break label379;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */           if (MainMemory.getI64(m + 112) != -1L) {
/*     */             break label395;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           if (ffrdef.call(paramInt1, paramInt2) <= 0) {
/*     */             break label395;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */           j = MainMemory.getI32(paramInt2);
/*     */           
/*     */           break label422;
/*     */           
/*     */           label379:
/*     */           
/* 199 */           ffmahd.call(paramInt1, j + 1, 0, paramInt2);
/*     */           
/*     */ 
/*     */           label395:
/*     */           
/*     */ 
/* 205 */           j = MainMemory.getI32(MainMemory.getI32(k) + 1012) != 0 ? 1 : 0;
/*     */           
/*     */ 
/*     */ 
/*     */           label422:
/*     */           
/*     */ 
/*     */ 
/* 213 */           if (j != 0) {
/*     */             break label482;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */           MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(k) + 944) + 260, paramLong);
/*     */           
/*     */           break label482;
/*     */           
/*     */           label470:
/* 228 */           MainMemory.setI32(paramInt2, 233);
/*     */         }
/*     */       }
/*     */       
/*     */       label482:
/*     */       
/* 234 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */       int n = i;return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpnul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */