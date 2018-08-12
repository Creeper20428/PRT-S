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
/*     */ public final class ffppn
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3500;
/*  23 */   public static final Function _instance = new ffppn();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffppn() { super("ffppn", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5);
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
/*  56 */     int i1 = call(i, j, l1, l2, k, m, n);
/*  57 */     paramFrame.setI32(paramInt1, i1);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  63 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         if (paramInt4 != 0) {
/*     */           break label62;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         ffppr.call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label62:
/*  95 */         switch (paramInt2) {
/*     */         case 11: 
/*     */           break label517;
/*     */           break;
/*     */         case 12: 
/*     */           break label491;
/*     */           break;
/*     */         case 20: 
/*     */           break label465;
/*     */           break;
/*     */         case 21: 
/*     */           break label439;
/*     */           break;
/*     */         case 30:  break label413;
/*     */           break; case 31:  break label387;
/*     */           break; case 40:  break label361;
/*     */           break; case 41:  break label335;
/*     */           break; case 81:  break label309;
/*     */           break; case 42:  break label282;
/*     */           break; case 82:  break; }
/* 115 */         ffppnd.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getF64(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label282:
/* 120 */         ffppne.call(paramInt1, 1, paramLong1, paramLong2, paramInt3, MainMemory.getF32(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label309:
/* 125 */         ffppnjj.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI64(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label335:
/* 130 */         ffppnj.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI32(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label361:
/* 135 */         ffppnuj.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI32(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label387:
/* 140 */         ffppnk.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI32(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label413:
/* 145 */         ffppnuk.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI32(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label439:
/* 150 */         ffppni.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI16(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label465:
/* 155 */         ffppnui.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI16(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label491:
/* 160 */         ffppnsb.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI8(paramInt4), paramInt5);
/*     */         
/*     */         break label556;
/*     */         
/*     */         label517:
/* 165 */         ffppnb.call(paramInt1, paramLong1, paramLong2, paramInt3, MainMemory.getI8(paramInt4), paramInt5);
/*     */         
/*     */ 
/*     */         break label556;
/*     */         
/* 170 */         MainMemory.setI32(paramInt5, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label556:
/*     */       
/* 176 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       int j = i;return j;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffppn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */