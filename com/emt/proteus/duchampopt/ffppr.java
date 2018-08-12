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
/*     */ public final class ffppr
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3499;
/*  22 */   public static final Function _instance = new ffppr();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public ffppr() { super("ffppr", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4)
/*     */   {
/*  29 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int n = call(i, j, l1, l2, k, m);
/*  53 */     paramFrame.setI32(paramInt1, n);
/*  54 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4)
/*     */   {
/*  59 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         switch (paramInt2) {
/*     */         case 11: 
/*     */           break label423;
/*     */           break;
/*     */         case 12: 
/*     */           break label402;
/*     */           break;
/*     */         case 20: 
/*     */           break label381;
/*     */           break;
/*     */         case 21: 
/*     */           break label360;
/*     */           break;
/*     */         case 30:  break label339;
/*     */           break; case 31:  break label318;
/*     */           break; case 40:  break label297;
/*     */           break; case 41:  break label276;
/*     */           break; case 81:  break label255;
/*     */           break; case 42:  break label233;
/*     */           break; case 82:  break; }
/*  96 */         ffpprd.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label233:
/* 101 */         ffppre.call(paramInt1, 1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label255:
/* 106 */         ffpprjj.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label276:
/* 111 */         ffpprj.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label297:
/* 116 */         ffppruj.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label318:
/* 121 */         ffpprk.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label339:
/* 126 */         ffppruk.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label360:
/* 131 */         ffppri.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label381:
/* 136 */         ffpprui.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label402:
/* 141 */         ffpprsb.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */         break label457;
/*     */         
/*     */         label423:
/* 146 */         ffpprb.call(paramInt1, paramLong1, paramLong2, paramInt3, paramInt4);
/*     */         
/*     */ 
/*     */         break label457;
/*     */         
/* 151 */         MainMemory.setI32(paramInt4, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label457:
/*     */       
/* 157 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       int j = i;return j;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffppr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */