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
/*     */ 
/*     */ public final class ffpcl
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3497;
/*  23 */   public static final Function _instance = new ffpcl();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffpcl() { super("ffpcl", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, int paramInt4, int paramInt5)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
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
/*  41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     int i1 = call(i, j, k, l1, l2, l3, m, n);
/*  60 */     paramFrame.setI32(paramInt1, i1);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, int paramInt4, int paramInt5)
/*     */   {
/*  66 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         switch (paramInt2) {
/*     */         case 1: 
/*     */           break label683;
/*     */           break;
/*     */         case 11: 
/*     */           break label658;
/*     */           break;
/*     */         case 12: 
/*     */           break label633;
/*     */           break;
/*     */         case 20: 
/*     */           break label608;
/*     */           break;
/*     */         case 21:  break label583;
/*     */           break; case 30:  break label558;
/*     */           break; case 31:  break label533;
/*     */           break; case 40:  break label508;
/*     */           break; case 41:  break label483;
/*     */           break; case 81:  break label458;
/*     */           break; case 42:  break label433;
/*     */           break; case 82:  break label408;
/*     */           break; case 83:  break label375;
/*     */           break; case 163:  break label342;
/*     */           break; case 14:  break label317;
/*     */           break; case 16:  break; }
/* 108 */         ffpcls.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label317:
/* 113 */         ffpcll.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label342:
/* 118 */         ffpcld.call(paramInt1, paramInt3, paramLong1, (paramLong2 << 1) + -1L, paramLong3 << 1, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label375:
/* 123 */         ffpcle.call(paramInt1, paramInt3, paramLong1, (paramLong2 << 1) + -1L, paramLong3 << 1, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label408:
/* 128 */         ffpcld.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label433:
/* 133 */         ffpcle.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label458:
/* 138 */         ffpcljj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label483:
/* 143 */         ffpclj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label508:
/* 148 */         ffpcluj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label533:
/* 153 */         ffpclj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label558:
/* 158 */         ffpcluj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label583:
/* 163 */         ffpcli.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label608:
/* 168 */         ffpclui.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label633:
/* 173 */         ffpclsb.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label658:
/* 178 */         ffpclb.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5);
/*     */         
/*     */         break label722;
/*     */         
/*     */         label683:
/* 183 */         ffpclx.call(paramInt1, paramInt3, paramLong1, (int)paramLong2, (int)paramLong3, paramInt4, paramInt5);
/*     */         
/*     */ 
/*     */         break label722;
/*     */         
/* 188 */         MainMemory.setI32(paramInt5, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label722:
/*     */       
/* 194 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */       int j = i;return j;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */