/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgtkn
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3408;
/*  14 */   public static final Function _instance = new ffgtkn();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgtkn() { super("ffgtkn", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = call(i, j, k, m, n);
/*  42 */     paramFrame.setI32(paramInt1, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*     */     
/*     */ 
/*  57 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       j = MainMemory.alloc(72);
/*  62 */       k = MainMemory.alloc(71);
/*  63 */       m = MainMemory.alloc(73);
/*  64 */       n = MainMemory.alloc(81);
/*  65 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         MainMemory.setI8(j, (byte)0);
/*  76 */         MainMemory.setI8(k, (byte)0);
/*  77 */         if (ffgkyn.call(paramInt1, paramInt2, j, k, m, paramInt5) >= 1) {
/*     */           break label291;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         if (SystemLibrary.strcmp(j, paramInt3) != 0)
/*     */         {
/*     */ 
/*     */ 
/*  91 */           i1 = 208;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  98 */           ffc2ii.call(k, paramInt4, paramInt5);
/*  99 */           if (MainMemory.getI32(paramInt5) > 0) {
/* 100 */             i1 = 209;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 110 */           else if (MainMemory.getI32(paramInt4) < 0) {
/* 111 */             i1 = 209;
/*     */           } else {
/*     */             break label291;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         MainMemory.setI32(paramInt5, i1);
/* 123 */         SystemLibrary.sprintf(n, 130784, new Object[] { Integer.valueOf(paramInt2) });
/* 124 */         ffxmsg.call(5, n);
/* 125 */         SystemLibrary.sprintf(n, 115040, new Object[] { Integer.valueOf(paramInt3) });
/* 126 */         ffxmsg.call(5, n);
/* 127 */         SystemLibrary.sprintf(n, 78368, new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
/* 128 */         ffxmsg.call(5, n);
/*     */       }
/*     */       
/*     */ 
/*     */       label291:
/*     */       
/* 134 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 145 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtkn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */