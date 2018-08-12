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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffpky
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3590;
/*  20 */   public static final Function _instance = new ffpky();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffpky() { super("ffpky", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  27 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  28 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, m, n, i1);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     long l = 0L;
/*  63 */     double d = 0.0D;
/*     */     
/*     */ 
/*  66 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(71);
/*  71 */       j = MainMemory.alloc(81);
/*  72 */       k = MainMemory.alloc(81);
/*  73 */       m = MainMemory.getI32(paramInt6);
/*  74 */       if (m <= 0) {
/*     */         break label79;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1394;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label79:
/*     */       
/*     */ 
/*     */ 
/*  90 */       switch (paramInt2) {
/*     */       case 16: 
/*     */         break label1317;
/*     */         break;
/*     */       case 11: 
/*     */         break label1214;
/*     */         break;
/*     */       case 12: 
/*     */         break label1115;
/*     */         break;
/*     */       case 20: 
/*     */         break label1013;
/*     */         break;
/*     */       case 21:  break label914;
/*     */         break; case 30:  break label862;
/*     */         break; case 31:  break label763;
/*     */         break; case 14:  break label713;
/*     */         break; case 40:  break label661;
/*     */         break; case 41:  break label562;
/*     */         break; case 81:  break label464;
/*     */         break; case 42:  break label420;
/*     */         break; case 82:  break label376;
/*     */         break; case 83:  break label356;
/*     */         break; case 163:  break; }
/* 114 */       ffpkym.call(paramInt1, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label356:
/*     */       
/* 121 */       ffpkyc.call(paramInt1, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label376:
/*     */       
/* 128 */       ffd2e.call(MainMemory.getF64(paramInt4), -15, i, paramInt6);
/* 129 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 130 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label420:
/*     */       
/* 137 */       ffr2e.call(MainMemory.getF32(paramInt4), -7, i, paramInt6);
/* 138 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 139 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label464:
/*     */       
/* 146 */       l = MainMemory.getI64(paramInt4);
/* 147 */       MainMemory.setI8(i, (byte)0);
/* 148 */       if (SystemLibrary.sprintf(i, 20096, new Object[] { Long.valueOf(l) }) >= 0) {
/*     */         break label531;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       ffxmsg.call(5, 99808);
/* 159 */       MainMemory.setI32(paramInt6, 401);
/*     */       
/*     */ 
/*     */       label531:
/*     */       
/*     */ 
/* 165 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 166 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label562:
/*     */       
/* 173 */       l = MainMemory.getI32(paramInt4);
/* 174 */       MainMemory.setI8(i, (byte)0);
/* 175 */       if (SystemLibrary.sprintf(i, 20096, new Object[] { Long.valueOf(l) }) >= 0) {
/*     */         break label630;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */       ffxmsg.call(5, 99808);
/* 186 */       MainMemory.setI32(paramInt6, 401);
/*     */       
/*     */ 
/*     */       label630:
/*     */       
/*     */ 
/* 192 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 193 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label661:
/*     */       
/* 200 */       d = MainMemory.getI32(paramInt4) & 0xFFFFFFFF;
/* 201 */       ffd2f.call(d, i, paramInt6);
/* 202 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 203 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label713:
/*     */       
/* 210 */       MainMemory.setI16(i, (short)(MainMemory.getI32(paramInt4) == 0 ? 70 : 84));
/* 211 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 212 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label763:
/*     */       
/* 219 */       l = MainMemory.getI32(paramInt4);
/* 220 */       MainMemory.setI8(i, (byte)0);
/* 221 */       if (SystemLibrary.sprintf(i, 20096, new Object[] { Long.valueOf(l) }) >= 0) {
/*     */         break label831;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */       ffxmsg.call(5, 99808);
/* 232 */       MainMemory.setI32(paramInt6, 401);
/*     */       
/*     */ 
/*     */       label831:
/*     */       
/*     */ 
/* 238 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 239 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label862:
/*     */       
/* 246 */       d = MainMemory.getI32(paramInt4) & 0xFFFFFFFF;
/* 247 */       ffd2f.call(d, i, paramInt6);
/* 248 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 249 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label914:
/*     */       
/* 256 */       l = MainMemory.getI16(paramInt4);
/* 257 */       MainMemory.setI8(i, (byte)0);
/* 258 */       if (SystemLibrary.sprintf(i, 20096, new Object[] { Long.valueOf(l) }) >= 0) {
/*     */         break label982;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */       ffxmsg.call(5, 99808);
/* 269 */       MainMemory.setI32(paramInt6, 401);
/*     */       
/*     */ 
/*     */       label982:
/*     */       
/*     */ 
/* 275 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 276 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label1013:
/*     */       
/* 283 */       l = MainMemory.getI16(paramInt4) & 0xFFFF;
/* 284 */       MainMemory.setI8(i, (byte)0);
/* 285 */       if (SystemLibrary.sprintf(i, 20096, new Object[] { Long.valueOf(l) }) >= 0) {
/*     */         break label1084;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */       ffxmsg.call(5, 99808);
/* 296 */       MainMemory.setI32(paramInt6, 401);
/*     */       
/*     */ 
/*     */       label1084:
/*     */       
/*     */ 
/* 302 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 303 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label1115:
/*     */       
/* 310 */       l = MainMemory.getI8(paramInt4);
/* 311 */       MainMemory.setI8(i, (byte)0);
/* 312 */       if (SystemLibrary.sprintf(i, 20096, new Object[] { Long.valueOf(l) }) >= 0) {
/*     */         break label1183;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */       ffxmsg.call(5, 99808);
/* 323 */       MainMemory.setI32(paramInt6, 401);
/*     */       
/*     */ 
/*     */       label1183:
/*     */       
/*     */ 
/* 329 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 330 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label1214:
/*     */       
/* 337 */       l = MainMemory.getI8(paramInt4) & 0xFF;
/* 338 */       MainMemory.setI8(i, (byte)0);
/* 339 */       if (SystemLibrary.sprintf(i, 20096, new Object[] { Long.valueOf(l) }) >= 0) {
/*     */         break label1286;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */       ffxmsg.call(5, 99808);
/* 350 */       MainMemory.setI32(paramInt6, 401);
/*     */       
/*     */ 
/*     */       label1286:
/*     */       
/*     */ 
/* 356 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 357 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label1317:
/*     */       
/* 364 */       ffs2c.call(paramInt4, i, m);
/* 365 */       ffmkky.call(paramInt3, i, paramInt5, j, paramInt6);
/* 366 */       ffprec.call(paramInt1, j, paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */       break label1394;
/*     */       
/*     */ 
/* 373 */       SystemLibrary.sprintf(k, 88352, new Object[] { Integer.valueOf(paramInt2) });
/* 374 */       ffxmsg.call(5, k);
/* 375 */       MainMemory.setI32(paramInt6, 410);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1394:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */