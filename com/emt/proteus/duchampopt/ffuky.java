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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffuky
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3477;
/*  28 */   public static final Function _instance = new ffuky();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public ffuky() { super("ffuky", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  35 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  40 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/*  58 */     int i2 = call(i, j, k, m, n, i1);
/*  59 */     paramFrame.setI32(paramInt1, i2);
/*  60 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  65 */     int i = 0;
/*     */     
/*  67 */     int j = 0;
/*  68 */     int k = 0;
/*  69 */     int m = 0;
/*  70 */     long l = 0L;
/*  71 */     double d = 0.0D;
/*  72 */     float f = 0.0F;
/*  73 */     int n = 0;
/*  74 */     int i1 = 0;
/*     */     
/*     */ 
/*  77 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  81 */       j = MainMemory.alloc(71);
/*  82 */       k = MainMemory.alloc(81);
/*  83 */       m = MainMemory.getI32(paramInt6);
/*  84 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         switch (paramInt2) {
/*     */         case 16: 
/*     */           break label1352;
/*     */           break;
/*     */         case 11: 
/*     */           break label1282;
/*     */           break;
/*     */         case 12: 
/*     */           break label1216;
/*     */           break;
/*     */         case 20: 
/*     */           break label1147;
/*     */           break;
/*     */         case 21:  break label1081;
/*     */           break; case 31:  break label1015;
/*     */           break; case 30:  break label926;
/*     */           break; case 14:  break label838;
/*     */           break; case 40:  break label749;
/*     */           break; case 41:  break label683;
/*     */           break; case 81:  break label618;
/*     */           break; case 42:  break label533;
/*     */           break; case 82:  break label446;
/*     */           break; case 83:  break label385;
/*     */           break; case 163:  break; }
/* 118 */         i1 = paramInt4;
/* 119 */         if (ffmkym.call(paramInt1, paramInt3, i1, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         MainMemory.setI32(paramInt6, m);
/* 130 */         ffpkym.call(paramInt1, paramInt3, i1, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label385:
/* 135 */         n = paramInt4;
/* 136 */         if (ffmkyc.call(paramInt1, paramInt3, n, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         MainMemory.setI32(paramInt6, m);
/* 147 */         ffpkyc.call(paramInt1, paramInt3, n, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label446:
/* 152 */         d = MainMemory.getF64(paramInt4);
/* 153 */         if (ffmkyd.call(paramInt1, paramInt3, d, -15, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         MainMemory.setI32(paramInt6, m);
/* 164 */         ffd2e.call(d, -15, j, paramInt6);
/* 165 */         ffmkky.call(paramInt3, j, paramInt5, k, paramInt6);
/* 166 */         ffprec.call(paramInt1, k, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label533:
/* 171 */         f = MainMemory.getF32(paramInt4);
/* 172 */         if (ffmkye.call(paramInt1, paramInt3, f, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         MainMemory.setI32(paramInt6, m);
/* 183 */         ffr2e.call(f, -7, j, paramInt6);
/* 184 */         ffmkky.call(paramInt3, j, paramInt5, k, paramInt6);
/* 185 */         ffprec.call(paramInt1, k, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label618:
/* 190 */         l = MainMemory.getI64(paramInt4);
/* 191 */         if (ffmkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */         MainMemory.setI32(paramInt6, m);
/* 202 */         ffpkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label683:
/* 207 */         l = MainMemory.getI32(paramInt4);
/* 208 */         if (ffmkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */         MainMemory.setI32(paramInt6, m);
/* 219 */         ffpkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label749:
/* 224 */         d = MainMemory.getI32(paramInt4) & 0xFFFFFFFF;
/* 225 */         if (ffmkyg.call(paramInt1, paramInt3, d, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */         MainMemory.setI32(paramInt6, m);
/* 236 */         ffd2f.call(d, j, paramInt6);
/* 237 */         ffmkky.call(paramInt3, j, paramInt5, k, paramInt6);
/* 238 */         ffprec.call(paramInt1, k, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label838:
/* 243 */         paramInt2 = MainMemory.getI32(paramInt4);
/* 244 */         if (ffmkyl.call(paramInt1, paramInt3, paramInt2, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */         MainMemory.setI32(paramInt6, m);
/* 255 */         MainMemory.setI16(j, (short)(paramInt2 == 0 ? 70 : 84));
/* 256 */         ffmkky.call(paramInt3, j, paramInt5, k, paramInt6);
/* 257 */         ffprec.call(paramInt1, k, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label926:
/* 262 */         d = MainMemory.getI32(paramInt4) & 0xFFFFFFFF;
/* 263 */         if (ffmkyg.call(paramInt1, paramInt3, d, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */         MainMemory.setI32(paramInt6, m);
/* 274 */         ffd2f.call(d, j, paramInt6);
/* 275 */         ffmkky.call(paramInt3, j, paramInt5, k, paramInt6);
/* 276 */         ffprec.call(paramInt1, k, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label1015:
/* 281 */         l = MainMemory.getI32(paramInt4);
/* 282 */         if (ffmkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */         MainMemory.setI32(paramInt6, m);
/* 293 */         ffpkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label1081:
/* 298 */         l = MainMemory.getI16(paramInt4);
/* 299 */         if (ffmkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */         MainMemory.setI32(paramInt6, m);
/* 310 */         ffpkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label1147:
/* 315 */         l = MainMemory.getI16(paramInt4) & 0xFFFF;
/* 316 */         if (ffmkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */         MainMemory.setI32(paramInt6, m);
/* 327 */         ffpkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label1216:
/* 332 */         l = MainMemory.getI8(paramInt4);
/* 333 */         if (ffmkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */         MainMemory.setI32(paramInt6, m);
/* 344 */         ffpkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label1282:
/* 349 */         l = MainMemory.getI8(paramInt4) & 0xFF;
/* 350 */         if (ffmkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */         MainMemory.setI32(paramInt6, m);
/* 361 */         ffpkyj.call(paramInt1, paramInt3, l, paramInt5, paramInt6);
/*     */         
/*     */         break label1440;
/*     */         
/*     */         label1352:
/* 366 */         if (ffmkys.call(paramInt1, paramInt3, paramInt4, paramInt5, paramInt6) != 202) {
/*     */           break label1440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */         MainMemory.setI32(paramInt6, m);
/* 377 */         ffs2c.call(paramInt4, j, m);
/* 378 */         ffmkky.call(paramInt3, j, paramInt5, k, paramInt6);
/* 379 */         ffprec.call(paramInt1, k, paramInt6);
/*     */         
/*     */ 
/*     */         break label1440;
/*     */         
/* 384 */         MainMemory.setI32(paramInt6, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label1440:
/*     */       
/* 390 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 401 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffuky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */