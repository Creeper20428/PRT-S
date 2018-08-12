/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffffrw
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3208;
/*  14 */   public static final Function _instance = new ffffrw();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffffrw() { super("ffffrw", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = call(i, j, k, m);
/*  39 */     paramFrame.setI32(paramInt1, n);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*     */     
/*     */ 
/*  55 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(4);
/*  60 */       k = MainMemory.alloc(4);
/*  61 */       m = MainMemory.alloc(4);
/*  62 */       n = MainMemory.alloc(20);
/*  63 */       if (MainMemory.getI32(paramInt4) != 0) {
/*     */         break label279;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       if (ffiprs.call(paramInt1, paramInt2, k, m, j, n, paramInt4) != 0) {
/*     */         break label271;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       i1 = MainMemory.getI32(m);
/*  84 */       if (i1 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  89 */         i2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  96 */         i1 = 0 - i1;
/*  97 */         MainMemory.setI32(m, i1);
/*     */         
/*  99 */         i2 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */       if ((MainMemory.getI32(k) != 14) || (i1 != 1)) {
/*     */         break label245;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       MainMemory.setI32(paramInt3, 0);
/* 118 */       if (i2 != 0) {
/*     */         break label217;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       ffffrw_615.call(paramInt3, paramInt4);
/*     */       
/*     */       break label232;
/*     */       
/*     */       label217:
/* 133 */       ffffrw_614.call(paramInt1, i1, m, paramInt3, paramInt4);
/*     */       
/*     */ 
/*     */       label232:
/*     */       
/*     */ 
/* 139 */       ffcprs.call();
/*     */       
/*     */       break label279;
/*     */       
/*     */       label245:
/* 144 */       ffcprs.call();
/* 145 */       ffxmsg.call(5, 113120);
/* 146 */       MainMemory.setI32(paramInt4, 432);
/*     */       
/*     */       break label279;
/*     */       
/*     */       label271:
/* 151 */       ffcprs.call();
/*     */       
/*     */ 
/*     */       label279:
/*     */       
/*     */ 
/* 157 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 168 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffffrw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */