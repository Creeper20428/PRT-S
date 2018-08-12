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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgpf
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3279;
/*  22 */   public static final Function _instance = new ffgpf();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public ffgpf() { super("ffgpf", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  29 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  30 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     call(i, j, l1, l2, k, m, n, i1);
/*  60 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*     */     try
/*     */     {
/*  71 */       if ((MainMemory.getI32(paramInt6) <= 0) && (paramLong2 != 0L)) {
/*     */         break label38;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label520;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label38:
/*     */       
/*     */ 
/*     */ 
/*  87 */       switch (paramInt2) {
/*     */       case 11: 
/*     */         break label482;
/*     */         break;
/*     */       case 12: 
/*     */         break label457;
/*     */         break;
/*     */       case 20: 
/*     */         break label432;
/*     */         break;
/*     */       case 21: 
/*     */         break label407;
/*     */         break;
/*     */       case 30:  break label382;
/*     */         break; case 31:  break label357;
/*     */         break; case 40:  break label332;
/*     */         break; case 41:  break label307;
/*     */         break; case 81:  break label282;
/*     */         break; case 42:  break label257;
/*     */         break; case 82:  break; }
/* 107 */       ffgpfd.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label257:
/*     */       
/* 114 */       ffgpfe.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label282:
/*     */       
/* 121 */       ffgpfjj.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label307:
/*     */       
/* 128 */       ffgpfj.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label332:
/*     */       
/* 135 */       ffgpfuj.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label357:
/*     */       
/* 142 */       ffgpfk.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label382:
/*     */       
/* 149 */       ffgpfuk.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label407:
/*     */       
/* 156 */       ffgpfi.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label432:
/*     */       
/* 163 */       ffgpfui.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label457:
/*     */       
/* 170 */       ffgpfsb.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label482:
/*     */       
/* 177 */       ffgpfb.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */       break label520;
/*     */       
/*     */ 
/* 184 */       MainMemory.setI32(paramInt6, 410);
/*     */       
/*     */ 
/*     */       label520:
/*     */       
/*     */ 
/* 190 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgpf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */