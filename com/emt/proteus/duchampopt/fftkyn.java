/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fftkyn extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3406;
/*  13 */   public static final Function _instance = new fftkyn();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fftkyn() { super("fftkyn", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = call(i, j, k, m, n);
/*  41 */     paramFrame.setI32(paramInt1, i1);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*     */     
/*     */ 
/*  56 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       j = MainMemory.alloc(72);
/*  61 */       k = MainMemory.alloc(71);
/*  62 */       m = MainMemory.alloc(73);
/*  63 */       n = MainMemory.alloc(81);
/*  64 */       i1 = MainMemory.getI32(paramInt5);
/*  65 */       if (i1 > 0) {
/*  66 */         paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  76 */         MainMemory.setI8(j, (byte)0);
/*  77 */         MainMemory.setI8(k, (byte)0);
/*  78 */         if (ffgkyn.call(paramInt1, paramInt2, j, k, m, paramInt5) >= 1) {
/*     */           break label187;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         if (SystemLibrary.strcmp(j, paramInt3) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */           MainMemory.setI32(paramInt5, 208);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 104 */         if (SystemLibrary.strcmp(paramInt4, k) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */           MainMemory.setI32(paramInt5, 209);
/*     */         }
/*     */         else
/*     */         {
/*     */           label187:
/* 119 */           i1 = MainMemory.getI32(paramInt5);
/* 120 */           if (i1 <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 124 */             paramInt2 = i1;
/*     */             
/*     */ 
/*     */             break label323;
/*     */           }
/*     */         }
/*     */         
/* 131 */         SystemLibrary.sprintf(n, 130720, new Object[] { Integer.valueOf(paramInt2) });
/* 132 */         ffxmsg.call(5, n);
/* 133 */         SystemLibrary.sprintf(n, 91680, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
/* 134 */         ffxmsg.call(5, n);
/* 135 */         SystemLibrary.sprintf(n, 78368, new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
/* 136 */         ffxmsg.call(5, n);
/* 137 */         i = MainMemory.getI32(paramInt5);
/*     */         
/*     */ 
/*     */         break label331;
/*     */       }
/*     */       
/*     */       label323:
/*     */       
/* 145 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label331:
/*     */       
/*     */ 
/* 151 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 156 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fftkyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */