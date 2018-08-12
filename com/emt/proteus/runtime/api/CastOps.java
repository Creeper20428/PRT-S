/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
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
/*     */ 
/*     */ 
/*     */ public class CastOps
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*     */   private static final long LONG_SHORT_MASK = 65535L;
/*     */   private static final long LONG_BYTE_MASK = 255L;
/*     */   private static final int INT_SHORT_MASK = 65535;
/*     */   private static final int INT_BYTE_MASK = 255;
/*     */   
/*     */   public static void trunc1(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     int val;
/*  51 */     switch (srcTypeId) {
/*     */     case 1: 
/*     */     case 2: 
/*     */     case 3: 
/*     */     case 4: 
/*  56 */       val = frame.getI32(value);
/*  57 */       break;
/*     */     case 5: 
/*  59 */       val = (int)frame.getI64(value);
/*  60 */       break;
/*     */     case 6: 
/*     */     case 7: 
/*  63 */       BigInteger bi = frame.getI128(value);
/*  64 */       val = bi.intValue();
/*  65 */       break;
/*     */     default: 
/*  67 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/*  69 */     frame.setI1(result, (val & 0x1) == 1);
/*     */   }
/*     */   
/*     */   public static void trunc8(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     int val;
/*  75 */     switch (srcTypeId) {
/*     */     case 1: 
/*     */     case 2: 
/*     */     case 3: 
/*     */     case 4: 
/*  80 */       val = frame.getI32(value);
/*  81 */       break;
/*     */     case 5: 
/*  83 */       val = (int)frame.getI64(value);
/*  84 */       break;
/*     */     case 6: 
/*     */     case 7: 
/*  87 */       BigInteger bi = frame.getI128(value);
/*  88 */       val = bi.intValue();
/*  89 */       break;
/*     */     default: 
/*  91 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/*  93 */     frame.setI8(result, (byte)val);
/*     */   }
/*     */   
/*     */   public static void trunc16(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     int val;
/*  99 */     switch (srcTypeId) {
/*     */     case 1: 
/*     */     case 2: 
/*     */     case 3: 
/*     */     case 4: 
/* 104 */       val = frame.getI32(value);
/* 105 */       break;
/*     */     case 5: 
/* 107 */       val = (int)frame.getI64(value);
/* 108 */       break;
/*     */     case 6: 
/*     */     case 7: 
/* 111 */       BigInteger bi = frame.getI128(value);
/* 112 */       val = bi.intValue();
/* 113 */       break;
/*     */     default: 
/* 115 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 117 */     frame.setI16(result, (short)val);
/*     */   }
/*     */   
/*     */   public static void trunc32(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     int val;
/* 123 */     switch (srcTypeId) {
/*     */     case 1: 
/*     */     case 2: 
/*     */     case 3: 
/*     */     case 4: 
/* 128 */       val = frame.getI32(value);
/* 129 */       break;
/*     */     case 5: 
/* 131 */       val = (int)frame.getI64(value);
/* 132 */       break;
/*     */     case 6: 
/*     */     case 7: 
/* 135 */       BigInteger bi = frame.getI128(value);
/* 136 */       val = bi.intValue();
/* 137 */       break;
/*     */     default: 
/* 139 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 141 */     frame.setI32(result, val);
/*     */   }
/*     */   
/*     */   public static void trunc64(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     long val;
/* 147 */     switch (srcTypeId) {
/*     */     case 1: 
/*     */     case 2: 
/*     */     case 3: 
/*     */     case 4: 
/* 152 */       val = frame.getI32(value);
/* 153 */       break;
/*     */     case 5: 
/* 155 */       val = frame.getI64(value);
/* 156 */       break;
/*     */     case 6: 
/*     */     case 7: 
/* 159 */       BigInteger bi = frame.getI128(value);
/* 160 */       val = bi.longValue();
/* 161 */       break;
/*     */     default: 
/* 163 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 165 */     frame.setI64(result, val);
/*     */   }
/*     */   
/*     */   public static void sext8(Frame frame, int result, int srcTypeId, int value) {
/* 169 */     throw new UnsupportedOperationException("To Be Done" + srcTypeId);
/*     */   }
/*     */   
/*     */   public static void sext16(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     short val;
/* 175 */     switch (srcTypeId) {
/*     */     case 1: 
/* 177 */       val = (short)(frame.getI1(value) ? -1 : 0);
/* 178 */       break;
/*     */     case 2: 
/* 180 */       val = (short)frame.getI8(value);
/* 181 */       break;
/*     */     case 3: 
/* 183 */       val = frame.getI16(value);
/* 184 */       break;
/*     */     default: 
/* 186 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 188 */     frame.setI16(result, val);
/*     */   }
/*     */   
/*     */   public static void sext32(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     int val;
/* 194 */     switch (srcTypeId) {
/*     */     case 1: 
/* 196 */       val = frame.getI1(value) ? -1 : 0;
/* 197 */       break;
/*     */     case 2: 
/* 199 */       val = frame.getI8(value);
/* 200 */       break;
/*     */     case 3: 
/* 202 */       val = frame.getI16(value);
/* 203 */       break;
/*     */     case 4: 
/* 205 */       val = frame.getI32(value);
/* 206 */       break;
/*     */     default: 
/* 208 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 210 */     frame.setI32(result, val);
/*     */   }
/*     */   
/*     */   public static void sext64(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     long val;
/* 216 */     switch (srcTypeId) {
/*     */     case 1: 
/* 218 */       val = frame.getI1(value) ? -1L : 0L;
/* 219 */       break;
/*     */     case 2: 
/* 221 */       val = frame.getI8(value);
/* 222 */       break;
/*     */     case 3: 
/* 224 */       val = frame.getI16(value);
/* 225 */       break;
/*     */     case 4: 
/* 227 */       val = frame.getI32(value);
/* 228 */       break;
/*     */     case 5: 
/* 230 */       val = frame.getI64(value);
/* 231 */       break;
/*     */     default: 
/* 233 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 235 */     frame.setI64(result, val);
/*     */   }
/*     */   
/*     */   public static void sext128(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     long val;
/* 241 */     switch (srcTypeId) {
/*     */     case 1: 
/* 243 */       val = frame.getI1(value) ? -1L : 0L;
/* 244 */       break;
/*     */     case 2: 
/* 246 */       val = frame.getI8(value);
/* 247 */       break;
/*     */     case 3: 
/* 249 */       val = frame.getI16(value);
/* 250 */       break;
/*     */     case 4: 
/* 252 */       val = frame.getI32(value);
/* 253 */       break;
/*     */     case 5: 
/* 255 */       val = frame.getI64(value);
/* 256 */       break;
/*     */     default: 
/* 258 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 260 */     frame.setI128(result, new BigInteger(Long.toString(val)));
/*     */   }
/*     */   
/*     */   public static void zext8(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     byte val;
/* 266 */     switch (srcTypeId) {
/*     */     case 1: 
/* 268 */       val = (byte)(frame.getI1(value) ? 1 : 0);
/* 269 */       break;
/*     */     case 2: 
/* 271 */       val = (byte)(frame.getI8(value) & 0xFF);
/* 272 */       break;
/*     */     default: 
/* 274 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 276 */     frame.setI8(result, val);
/*     */   }
/*     */   
/*     */   public static void zext16(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     short val;
/* 282 */     switch (srcTypeId) {
/*     */     case 1: 
/* 284 */       val = (short)(frame.getI1(value) ? 1 : 0);
/* 285 */       break;
/*     */     case 2: 
/* 287 */       val = (short)(frame.getI8(value) & 0xFF);
/* 288 */       break;
/*     */     case 3: 
/* 290 */       val = (short)(frame.getI16(value) & 0xFFFF);
/* 291 */       break;
/*     */     default: 
/* 293 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 295 */     frame.setI16(result, val);
/*     */   }
/*     */   
/*     */   public static void zext32(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     int val;
/* 301 */     switch (srcTypeId) {
/*     */     case 1: 
/* 303 */       val = frame.getI1(value) ? 1 : 0;
/* 304 */       break;
/*     */     case 2: 
/* 306 */       val = frame.getI8(value) & 0xFF;
/* 307 */       break;
/*     */     case 3: 
/* 309 */       val = frame.getI16(value) & 0xFFFF;
/* 310 */       break;
/*     */     default: 
/* 312 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 314 */     frame.setI32(result, val);
/*     */   }
/*     */   
/*     */   public static void zext64(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     long val;
/* 320 */     switch (srcTypeId) {
/*     */     case 1: 
/* 322 */       val = frame.getI1(value) ? 1L : 0L;
/* 323 */       break;
/*     */     case 2: 
/* 325 */       val = frame.getI8(value) & 0xFF;
/* 326 */       break;
/*     */     case 3: 
/* 328 */       val = frame.getI16(value) & 0xFFFF;
/* 329 */       break;
/*     */     case 4: 
/* 331 */       val = frame.getI32(value) & 0xFFFFFFFF;
/* 332 */       break;
/*     */     case 5: 
/* 334 */       val = frame.getI64(value);
/* 335 */       break;
/*     */     default: 
/* 337 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 339 */     frame.setI64(result, val);
/*     */   }
/*     */   
/*     */   public static void zext128(Frame frame, int result, int srcTypeId, int value)
/*     */   {
/*     */     long val;
/* 345 */     switch (srcTypeId) {
/*     */     case 1: 
/* 347 */       val = frame.getI1(value) ? 1L : 0L;
/* 348 */       break;
/*     */     case 2: 
/* 350 */       val = frame.getI8(value) & 0xFF;
/* 351 */       break;
/*     */     case 3: 
/* 353 */       val = frame.getI16(value) & 0xFFFF;
/* 354 */       break;
/*     */     case 4: 
/* 356 */       val = frame.getI32(value) & 0xFFFFFFFF;
/* 357 */       break;
/*     */     case 5: 
/* 359 */       val = frame.getI64(value);
/* 360 */       break;
/*     */     default: 
/* 362 */       throw new UnsupportedOperationException("Incorrect src type " + srcTypeId);
/*     */     }
/* 364 */     frame.setI128(result, MathUtils.unsigned(val, 16));
/*     */   }
/*     */   
/*     */ 
/*     */   public static void uitofp(Frame frame, int resultTypeId, int result, int argTypeId, int arg)
/*     */   {
/*     */     double val;
/* 371 */     switch (argTypeId) {
/*     */     case 2: 
/* 373 */       val = frame.getI8(arg) & 0xFF;
/* 374 */       break;
/*     */     case 3: 
/* 376 */       val = frame.getI16(arg) & 0xFFFF;
/* 377 */       break;
/*     */     case 4: 
/* 379 */       val = frame.getI32(arg) & 0xFFFFFFFF;
/* 380 */       break;
/*     */     case 5: 
/* 382 */       val = frame.getI64(arg);
/* 383 */       break;
/*     */     default: 
/* 385 */       throw new UnsupportedOperationException();
/*     */     }
/* 387 */     if (val < 0.0D) { throw new UnsupportedOperationException("TODO DEAL WITH THIS");
/*     */     }
/* 389 */     switch (resultTypeId) {
/*     */     case 12: 
/* 391 */       frame.setF32(result, (float)val);
/* 392 */       break;
/*     */     case 13: 
/* 394 */       frame.setF64(result, val);
/* 395 */       break;
/*     */     case 14: 
/* 397 */       frame.setF80(result, new BigDecimal(val));
/* 398 */       break;
/*     */     case 15: 
/* 400 */       frame.setF128(result, new BigDecimal(val));
/* 401 */       break;
/*     */     default: 
/* 403 */       throw new UnsupportedOperationException();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void sitofp(Frame frame, int resultTypeId, int result, int argTypeId, int arg)
/*     */   {
/*     */     double val;
/* 410 */     switch (argTypeId) {
/*     */     case 2: 
/* 412 */       val = frame.getI8(arg);
/* 413 */       break;
/*     */     case 3: 
/* 415 */       val = frame.getI16(arg);
/* 416 */       break;
/*     */     case 4: 
/* 418 */       val = frame.getI32(arg);
/* 419 */       break;
/*     */     case 5: 
/* 421 */       val = frame.getI64(arg);
/* 422 */       break;
/*     */     default: 
/* 424 */       throw new UnsupportedOperationException();
/*     */     }
/*     */     
/* 427 */     switch (resultTypeId) {
/*     */     case 12: 
/* 429 */       frame.setF32(result, (float)val);
/* 430 */       break;
/*     */     case 13: 
/* 432 */       frame.setF64(result, val);
/* 433 */       break;
/*     */     case 14: 
/* 435 */       frame.setF80(result, new BigDecimal(val));
/* 436 */       break;
/*     */     case 15: 
/* 438 */       frame.setF128(result, new BigDecimal(val));
/* 439 */       break;
/*     */     default: 
/* 441 */       throw new UnsupportedOperationException();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void fptoui(Frame frame, int resultTypeId, int result, int argTypeId, int arg)
/*     */   {
/*     */     long val;
/* 448 */     switch (argTypeId) {
/*     */     case 13: 
/* 450 */       val = frame.getF64(arg);
/* 451 */       break;
/*     */     case 12: 
/* 453 */       val = frame.getF32(arg);
/* 454 */       break;
/*     */     case 14: 
/* 456 */       val = frame.getF80(arg).longValue();
/* 457 */       break;
/*     */     case 15: 
/* 459 */       val = frame.getF128(arg).longValue();
/* 460 */       break;
/*     */     default: 
/* 462 */       throw new UnsupportedOperationException();
/*     */     }
/* 464 */     if (val < 0L) { throw new UnsupportedOperationException("TODO DEAL WITH THIS");
/*     */     }
/* 466 */     switch (resultTypeId) {
/*     */     case 2: 
/* 468 */       frame.setI8(result, (byte)(int)val);
/* 469 */       break;
/*     */     case 3: 
/* 471 */       frame.setI16(result, (short)(int)val);
/* 472 */       break;
/*     */     case 4: 
/* 474 */       frame.setI32(result, (int)val);
/* 475 */       break;
/*     */     case 5: 
/* 477 */       frame.setI64(result, val);
/* 478 */       break;
/*     */     default: 
/* 480 */       throw new UnsupportedOperationException();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void fptosi(Frame frame, int resultTypeId, int result, int argTypeId, int arg)
/*     */   {
/*     */     long val;
/* 487 */     switch (argTypeId) {
/*     */     case 13: 
/* 489 */       val = frame.getF64(arg);
/* 490 */       break;
/*     */     case 12: 
/* 492 */       val = frame.getF32(arg);
/* 493 */       break;
/*     */     case 14: 
/* 495 */       val = frame.getF80(arg).longValue();
/* 496 */       break;
/*     */     case 15: 
/* 498 */       val = frame.getF128(arg).longValue();
/* 499 */       break;
/*     */     default: 
/* 501 */       throw new UnsupportedOperationException();
/*     */     }
/* 503 */     switch (resultTypeId) {
/*     */     case 2: 
/* 505 */       frame.setI8(result, (byte)(int)val);
/* 506 */       break;
/*     */     case 3: 
/* 508 */       frame.setI16(result, (short)(int)val);
/* 509 */       break;
/*     */     case 4: 
/* 511 */       frame.setI32(result, (int)val);
/* 512 */       break;
/*     */     case 5: 
/* 514 */       frame.setI64(result, val);
/* 515 */       break;
/*     */     default: 
/* 517 */       throw new UnsupportedOperationException();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void castfp(Frame frame, int resultTypeId, int result, int argTypeId, int arg)
/*     */   {
/*     */     BigDecimal val;
/* 524 */     switch (argTypeId) {
/*     */     case 13: 
/* 526 */       val = BigDecimal.valueOf(frame.getF64(arg));
/* 527 */       break;
/*     */     case 12: 
/* 529 */       val = BigDecimal.valueOf(frame.getF32(arg));
/* 530 */       break;
/*     */     case 14: 
/* 532 */       val = frame.getF80(arg);
/* 533 */       break;
/*     */     case 15: 
/* 535 */       val = frame.getF128(arg);
/* 536 */       break;
/*     */     default: 
/* 538 */       throw new UnsupportedOperationException();
/*     */     }
/* 540 */     switch (resultTypeId) {
/*     */     case 13: 
/* 542 */       frame.setF64(result, val.doubleValue());
/* 543 */       break;
/*     */     case 12: 
/* 545 */       frame.setF32(result, val.floatValue());
/* 546 */       break;
/*     */     case 14: 
/* 548 */       frame.setF80(result, val);
/* 549 */       break;
/*     */     case 15: 
/* 551 */       frame.setF128(result, val);
/* 552 */       break;
/*     */     default: 
/* 554 */       throw new UnsupportedOperationException();
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/CastOps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */