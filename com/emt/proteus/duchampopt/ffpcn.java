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
/*     */ 
/*     */ 
/*     */ public final class ffpcn
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3498;
/*  25 */   public static final Function _instance = new ffpcn();
/*  26 */   public final Function resolve() { return _instance; }
/*     */   
/*  28 */   public ffpcn() { super("ffpcn", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  32 */     return call(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     int i2 = call(i, j, k, l1, l2, l3, m, n, i1);
/*  65 */     paramFrame.setI32(paramInt1, i2);
/*  66 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  71 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  78 */       if (MainMemory.getI32(paramInt6) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         if (paramInt5 != 0) {
/*     */           break label65;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         ffpcl.call(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label65:
/* 103 */         switch (paramInt2) {
/*     */         case 11: 
/*     */           break label739;
/*     */           break;
/*     */         case 12: 
/*     */           break label710;
/*     */           break;
/*     */         case 20: 
/*     */           break label681;
/*     */           break;
/*     */         case 21: 
/*     */           break label652;
/*     */           break;
/*     */         case 30:  break label623;
/*     */           break; case 31:  break label594;
/*     */           break; case 40:  break label565;
/*     */           break; case 41:  break label536;
/*     */           break; case 81:  break label507;
/*     */           break; case 42:  break label478;
/*     */           break; case 82:  break label449;
/*     */           break; case 83:  break label412;
/*     */           break; case 163:  break label375;
/*     */           break; case 14:  break label346;
/*     */           break; case 16:  break; }
/* 127 */         ffpcns.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5, paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label346:
/* 132 */         ffpcnl.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI8(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label375:
/* 137 */         ffpcnd.call(paramInt1, paramInt3, paramLong1, (paramLong2 << 1) + -1L, paramLong3 << 1, paramInt4, MainMemory.getF64(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label412:
/* 142 */         ffpcne.call(paramInt1, paramInt3, paramLong1, (paramLong2 << 1) + -1L, paramLong3 << 1, paramInt4, MainMemory.getF32(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label449:
/* 147 */         ffpcnd.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getF64(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label478:
/* 152 */         ffpcne.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getF32(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label507:
/* 157 */         ffpcnjj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI64(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label536:
/* 162 */         ffpcnj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI32(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label565:
/* 167 */         ffpcnuj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI32(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label594:
/* 172 */         ffpcnk.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI32(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label623:
/* 177 */         ffpcnuk.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI32(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label652:
/* 182 */         ffpcni.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI16(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label681:
/* 187 */         ffpcnui.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI16(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label710:
/* 192 */         ffpcnsb.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI8(paramInt5), paramInt6);
/*     */         
/*     */         break label781;
/*     */         
/*     */         label739:
/* 197 */         ffpcnb.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, MainMemory.getI8(paramInt5), paramInt6);
/*     */         
/*     */ 
/*     */         break label781;
/*     */         
/* 202 */         MainMemory.setI32(paramInt6, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label781:
/*     */       
/* 208 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */       int j = i;return j;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */