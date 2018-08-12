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
/*     */ public final class ffgkyn
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3405;
/*  16 */   public static final Function _instance = new ffgkyn();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgkyn() { super("ffgkyn", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i2 = call(i, j, k, m, n, i1);
/*  47 */     paramFrame.setI32(paramInt1, i2);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  53 */     int i = 0;
/*     */     
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*     */     
/*     */ 
/*  60 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       j = MainMemory.alloc(81);
/*  65 */       k = MainMemory.alloc(81);
/*  66 */       m = MainMemory.alloc(4);
/*  67 */       MainMemory.setI8(paramInt3, (byte)0);
/*  68 */       MainMemory.setI8(paramInt4, (byte)0);
/*  69 */       if (paramInt5 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         MainMemory.setI8(paramInt5, (byte)0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  85 */       if (MainMemory.getI32(paramInt6) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         if (ffgrec.call(paramInt1, paramInt2, j, paramInt6) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           ffgknm.call(j, paramInt3, m);
/* 106 */           if (ffpsvc.call(j, paramInt4, paramInt5, paramInt6) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */             if (fftrec.call(paramInt3, paramInt6) <= 0) {
/*     */               break label229;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */             SystemLibrary.sprintf(k, 125728, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
/* 127 */             ffxmsg.call(5, k);
/* 128 */             if (paramInt2 % 36 != 0) {
/*     */               break label229;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */             ffxmsg.call(5, 101920);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label229:
/* 144 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 155 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgkyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */