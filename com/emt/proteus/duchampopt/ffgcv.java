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
/*     */ public final class ffgcv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3278;
/*  23 */   public static final Function _instance = new ffgcv();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffgcv() { super("ffgcv", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramLong3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  59 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  60 */     paramInt4 += 2;
/*  61 */     paramInt3--;
/*  62 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  63 */     paramInt4 += 2;
/*  64 */     paramInt3--;
/*  65 */     int i3 = call(i, j, k, l1, l2, l3, m, n, i1, i2);
/*  66 */     paramFrame.setI32(paramInt1, i3);
/*  67 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  72 */     int i = 0;
/*     */     
/*  74 */     int j = 0;
/*  75 */     int k = 0;
/*  76 */     int m = 0;
/*  77 */     boolean bool = false;
/*  78 */     int n = 0;
/*  79 */     int i1 = 0;
/*  80 */     int i2 = 0;
/*     */     
/*     */ 
/*  83 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  87 */       j = MainMemory.alloc(2);
/*  88 */       if (MainMemory.getI32(paramInt7) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         switch (paramInt2) {
/*     */         case 1: 
/*     */           break label1688;
/*     */           break;
/*     */         case 11: 
/*     */           break label1602;
/*     */           break;
/*     */         case 12: 
/*     */           break label1520;
/*     */           break;
/*     */         case 20: 
/*     */           break label1434;
/*     */           break;
/*     */         case 21:  break label1344;
/*     */           break; case 30:  break label1246;
/*     */           break; case 31:  break label1148;
/*     */           break; case 40:  break label1062;
/*     */           break; case 41:  break label974;
/*     */           break; case 81:  break label884;
/*     */           break; case 42:  break label794;
/*     */           break; case 82:  break label704;
/*     */           break; case 83:  break label598;
/*     */           break; case 163:  break label492;
/*     */           break; case 14:  break label410;
/*     */           break; case 16:  break; }
/* 123 */         if (paramInt4 != 0) {
/*     */           break label379;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         MainMemory.setI8(j, (byte)0);
/* 134 */         ffgcls.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, j, paramInt5, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label379:
/* 139 */         ffgcls.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, paramInt4, paramInt5, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label410:
/* 144 */         if (paramInt4 != 0) {
/*     */           break label458;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */         ffgcll.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, (byte)0, paramInt5, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label458:
/* 159 */         ffgcll.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, MainMemory.getI8(paramInt4), paramInt5, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label492:
/* 164 */         i2 = paramInt5;
/* 165 */         if (paramInt4 != 0) {
/*     */           break label554;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */         ffgcld.call(paramInt1, paramInt3, paramLong1, (paramLong2 << 1) + -1L, paramLong3 << 1, 1, 1, 0.0D, i2, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label554:
/* 180 */         ffgcld.call(paramInt1, paramInt3, paramLong1, (paramLong2 << 1) + -1L, paramLong3 << 1, 1, 1, MainMemory.getF64(paramInt4), i2, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label598:
/* 185 */         i1 = paramInt5;
/* 186 */         if (paramInt4 != 0) {
/*     */           break label660;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */         ffgcle.call(paramInt1, paramInt3, paramLong1, (paramLong2 << 1) + -1L, paramLong3 << 1, 1, 1, 0.0F, i1, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label660:
/* 201 */         ffgcle.call(paramInt1, paramInt3, paramLong1, (paramLong2 << 1) + -1L, paramLong3 << 1, 1, 1, MainMemory.getF32(paramInt4), i1, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label704:
/* 206 */         i2 = paramInt5;
/* 207 */         if (paramInt4 != 0) {
/*     */           break label758;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */         ffgcld.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, 0.0D, i2, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label758:
/* 222 */         ffgcld.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, MainMemory.getF64(paramInt4), i2, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label794:
/* 227 */         i1 = paramInt5;
/* 228 */         if (paramInt4 != 0) {
/*     */           break label848;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */         ffgcle.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, 0.0F, i1, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label848:
/* 243 */         ffgcle.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, MainMemory.getF32(paramInt4), i1, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label884:
/* 248 */         n = paramInt5;
/* 249 */         if (paramInt4 != 0) {
/*     */           break label938;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */         ffgcljj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, 0L, n, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label938:
/* 264 */         ffgcljj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, MainMemory.getI64(paramInt4), n, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label974:
/* 269 */         m = paramInt5;
/* 270 */         if (paramInt4 != 0) {
/*     */           break label1027;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */         ffgclj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, 0, m, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1027:
/* 285 */         ffgclj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, MainMemory.getI32(paramInt4), m, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1062:
/* 290 */         m = paramInt5;
/* 291 */         if (paramInt4 != 0) {
/*     */           break label1114;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */         ffgcluj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 0, m, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1114:
/* 306 */         ffgcluj.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, MainMemory.getI32(paramInt4), m, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1148:
/* 311 */         m = paramInt5;
/* 312 */         bool = paramLong3 == 0L;
/* 313 */         if (paramInt4 != 0) {
/*     */           break label1214;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */         ffgcv_1000.call(j, paramInt6, paramLong1, paramInt7, paramInt1, paramLong2, bool, m, paramInt3, paramLong3);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1214:
/* 328 */         ffgcv_1001.call(j, paramInt6, paramLong1, paramInt7, paramInt1, paramLong2, bool, m, paramInt3, paramLong3, paramInt4);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1246:
/* 333 */         m = paramInt5;
/* 334 */         bool = paramLong3 == 0L;
/* 335 */         if (paramInt4 != 0) {
/*     */           break label1312;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */         ffgcv_1002.call(j, paramInt6, paramLong1, paramInt7, paramInt1, paramLong2, m, paramInt3, paramLong3, bool);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1312:
/* 350 */         ffgcv_999.call(j, paramInt6, paramLong1, paramInt7, paramInt1, paramLong2, m, paramInt3, paramLong3, paramInt4, bool);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1344:
/* 355 */         k = paramInt5;
/* 356 */         if (paramInt4 != 0) {
/*     */           break label1398;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */         ffgcli.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, (short)0, k, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1398:
/* 371 */         ffgcli.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, MainMemory.getI16(paramInt4), k, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1434:
/* 376 */         k = paramInt5;
/* 377 */         if (paramInt4 != 0) {
/*     */           break label1486;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 387 */         ffgclui.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, (short)0, k, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1486:
/* 392 */         ffgclui.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, MainMemory.getI16(paramInt4), k, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1520:
/* 397 */         if (paramInt4 != 0) {
/*     */           break label1568;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 407 */         ffgclsb.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, (byte)0, paramInt5, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1568:
/* 412 */         ffgclsb.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, MainMemory.getI8(paramInt4), paramInt5, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1602:
/* 417 */         if (paramInt4 != 0) {
/*     */           break label1652;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */         ffgclb.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, (byte)0, paramInt5, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1652:
/* 432 */         ffgclb.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, 1, 1, MainMemory.getI8(paramInt4), paramInt5, j, paramInt6, paramInt7);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1688:
/* 437 */         ffgcx.call(paramInt1, paramInt3, paramLong1, paramLong2, paramLong3, paramInt5, paramInt7);
/*     */         
/*     */ 
/*     */         break label1725;
/*     */         
/* 442 */         MainMemory.setI32(paramInt7, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label1725:
/*     */       
/* 448 */       i = MainMemory.getI32(paramInt7);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 454 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 459 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */