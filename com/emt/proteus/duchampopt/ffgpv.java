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
/*     */ public final class ffgpv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3280;
/*  22 */   public static final Function _instance = new ffgpv();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public ffgpv() { super("ffgpv", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  29 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  52 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i2 = call(i, j, l1, l2, k, m, n, i1);
/*  59 */     paramFrame.setI32(paramInt1, i2);
/*  60 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  65 */     int i = 0;
/*     */     
/*  67 */     int j = 0;
/*  68 */     int k = 0;
/*  69 */     int m = 0;
/*  70 */     int n = 0;
/*  71 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if ((MainMemory.getI32(paramInt6) > 0) || (paramLong2 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         switch (paramInt2) {
/*     */         case 11: 
/*     */           break label972;
/*     */           break;
/*     */         case 12: 
/*     */           break label902;
/*     */           break;
/*     */         case 20: 
/*     */           break label828;
/*     */           break;
/*     */         case 21: 
/*     */           break label754;
/*     */           break;
/*     */         case 30:  break label680;
/*     */           break; case 31:  break label606;
/*     */           break; case 40:  break label532;
/*     */           break; case 41:  break label458;
/*     */           break; case 81:  break label384;
/*     */           break; case 42:  break label310;
/*     */           break; case 82:  break; }
/* 107 */         i1 = paramInt4;
/* 108 */         if (paramInt3 != 0) {
/*     */           break label282;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         ffgpvd.call(paramInt1, paramLong1, paramLong2, 0.0D, i1, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label282:
/* 123 */         ffgpvd.call(paramInt1, paramLong1, paramLong2, MainMemory.getF64(paramInt3), i1, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label310:
/* 128 */         n = paramInt4;
/* 129 */         if (paramInt3 != 0) {
/*     */           break label356;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         ffgpve.call(paramInt1, paramLong1, paramLong2, 0.0F, n, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label356:
/* 144 */         ffgpve.call(paramInt1, paramLong1, paramLong2, MainMemory.getF32(paramInt3), n, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label384:
/* 149 */         m = paramInt4;
/* 150 */         if (paramInt3 != 0) {
/*     */           break label430;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */         ffgpvjj.call(paramInt1, paramLong1, paramLong2, 0L, m, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label430:
/* 165 */         ffgpvjj.call(paramInt1, paramLong1, paramLong2, MainMemory.getI64(paramInt3), m, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label458:
/* 170 */         k = paramInt4;
/* 171 */         if (paramInt3 != 0) {
/*     */           break label504;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         ffgpvj.call(paramInt1, paramLong1, paramLong2, 0, k, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label504:
/* 186 */         ffgpvj.call(paramInt1, paramLong1, paramLong2, MainMemory.getI32(paramInt3), k, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label532:
/* 191 */         k = paramInt4;
/* 192 */         if (paramInt3 != 0) {
/*     */           break label578;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 202 */         ffgpvuj.call(paramInt1, paramLong1, paramLong2, 0, k, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label578:
/* 207 */         ffgpvuj.call(paramInt1, paramLong1, paramLong2, MainMemory.getI32(paramInt3), k, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label606:
/* 212 */         k = paramInt4;
/* 213 */         if (paramInt3 != 0) {
/*     */           break label652;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */         ffgpvk.call(paramInt1, paramLong1, paramLong2, 0, k, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label652:
/* 228 */         ffgpvk.call(paramInt1, paramLong1, paramLong2, MainMemory.getI32(paramInt3), k, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label680:
/* 233 */         k = paramInt4;
/* 234 */         if (paramInt3 != 0) {
/*     */           break label726;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */         ffgpvuk.call(paramInt1, paramLong1, paramLong2, 0, k, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label726:
/* 249 */         ffgpvuk.call(paramInt1, paramLong1, paramLong2, MainMemory.getI32(paramInt3), k, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label754:
/* 254 */         j = paramInt4;
/* 255 */         if (paramInt3 != 0) {
/*     */           break label800;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */         ffgpvi.call(paramInt1, paramLong1, paramLong2, (short)0, j, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label800:
/* 270 */         ffgpvi.call(paramInt1, paramLong1, paramLong2, MainMemory.getI16(paramInt3), j, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label828:
/* 275 */         j = paramInt4;
/* 276 */         if (paramInt3 != 0) {
/*     */           break label874;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */         ffgpvui.call(paramInt1, paramLong1, paramLong2, (short)0, j, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label874:
/* 291 */         ffgpvui.call(paramInt1, paramLong1, paramLong2, MainMemory.getI16(paramInt3), j, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label902:
/* 296 */         if (paramInt3 != 0) {
/*     */           break label944;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */         ffgpvsb.call(paramInt1, paramLong1, paramLong2, (byte)0, paramInt4, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label944:
/* 311 */         ffgpvsb.call(paramInt1, paramLong1, paramLong2, MainMemory.getI8(paramInt3), paramInt4, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label972:
/* 316 */         if (paramInt3 != 0) {
/*     */           break label1014;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */         ffgpvb.call(paramInt1, paramLong1, paramLong2, (byte)0, paramInt4, paramInt5, paramInt6);
/*     */         
/*     */         break label1055;
/*     */         
/*     */         label1014:
/* 331 */         ffgpvb.call(paramInt1, paramLong1, paramLong2, MainMemory.getI8(paramInt3), paramInt4, paramInt5, paramInt6);
/*     */         
/*     */ 
/*     */         break label1055;
/*     */         
/* 336 */         MainMemory.setI32(paramInt6, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label1055:
/*     */       
/* 342 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */       int i2 = i;return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */