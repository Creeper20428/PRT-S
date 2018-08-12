/*     */ package com.emt.proteus.lib.api;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import java.math.MathContext;
/*     */ import java.math.RoundingMode;
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
/*     */ public class MathUtils
/*     */ {
/*  41 */   public static final MathContext F80 = new MathContext(25, RoundingMode.HALF_UP);
/*  42 */   public static final MathContext F128 = MathContext.DECIMAL128;
/*  43 */   public static final BigInteger EXTRA_BIT = BigInteger.ONE.shiftLeft(64);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean ugt(long lhs, long rhs)
/*     */   {
/*  50 */     long bitmask = Long.MAX_VALUE;
/*     */     boolean val;
/*  52 */     boolean val; if (lhs < 0L) { boolean val;
/*  53 */       if (rhs < 0L) {
/*  54 */         val = (lhs & 0x7FFFFFFFFFFFFFFF) > (rhs & 0x7FFFFFFFFFFFFFFF);
/*     */       } else
/*  56 */         val = true;
/*     */     } else { boolean val;
/*  58 */       if (rhs < 0L) {
/*  59 */         val = false;
/*     */       } else
/*  61 */         val = lhs > rhs;
/*     */     }
/*  63 */     return val;
/*     */   }
/*     */   
/*     */   public static boolean uge(long left, long right) {
/*  67 */     return (left == right) || (ugt(left, right));
/*     */   }
/*     */   
/*     */   public static boolean ult(long left, long right) {
/*  71 */     return ugt(right, left);
/*     */   }
/*     */   
/*     */   public static boolean ule(long left, long right) {
/*  75 */     return (left == right) || (ugt(right, left));
/*     */   }
/*     */   
/*     */   public static boolean ugt(int left, int right) {
/*  79 */     long lhs = left & 0xFFFFFFFF;
/*  80 */     long rhs = right & 0xFFFFFFFF;
/*  81 */     return lhs > rhs;
/*     */   }
/*     */   
/*  84 */   public static int ucmp(int left, int right) { long lhs = left & 0xFFFFFFFF;
/*  85 */     long rhs = right & 0xFFFFFFFF;
/*  86 */     return (int)(lhs - rhs);
/*     */   }
/*     */   
/*     */   public static boolean uge(int left, int right) {
/*  90 */     return (left == right) || (ugt(left, right));
/*     */   }
/*     */   
/*     */   public static boolean ult(int left, int right) {
/*  94 */     return ugt(right, left);
/*     */   }
/*     */   
/*     */   public static boolean ule(int left, int right) {
/*  98 */     return (left == right) || (ugt(right, left));
/*     */   }
/*     */   
/*     */   public static boolean ugt(short left, short right) {
/* 102 */     int lhs = left & 0xFFFF;
/* 103 */     int rhs = right & 0xFFFF;
/* 104 */     return lhs > rhs;
/*     */   }
/*     */   
/*     */   public static boolean uge(short left, short right) {
/* 108 */     return (left == right) || (ugt(left, right));
/*     */   }
/*     */   
/*     */   public static boolean ult(short left, short right) {
/* 112 */     return ugt(right, left);
/*     */   }
/*     */   
/*     */   public static boolean ule(short left, short right) {
/* 116 */     return (left == right) || (ugt(right, left));
/*     */   }
/*     */   
/*     */   public static boolean ugt(byte left, byte right) {
/* 120 */     int lhs = left & 0xFF;
/* 121 */     int rhs = right & 0xFF;
/* 122 */     return lhs > rhs;
/*     */   }
/*     */   
/*     */   public static boolean uge(byte left, byte right) {
/* 126 */     return (left == right) || (ugt(left, right));
/*     */   }
/*     */   
/*     */   public static boolean ult(byte left, byte right) {
/* 130 */     return ugt(right, left);
/*     */   }
/*     */   
/*     */   public static boolean ule(byte left, byte right) {
/* 134 */     return (left == right) || (ugt(right, left));
/*     */   }
/*     */   
/*     */   public static boolean sgt(long lhs, long rhs) {
/* 138 */     return lhs > rhs;
/*     */   }
/*     */   
/*     */   public static boolean sge(long left, long right) {
/* 142 */     return left >= right;
/*     */   }
/*     */   
/*     */   public static boolean slt(long left, long right) {
/* 146 */     return left < right;
/*     */   }
/*     */   
/*     */   public static boolean sle(long left, long right) {
/* 150 */     return left <= right;
/*     */   }
/*     */   
/*     */   public static boolean sgt(int left, int right) {
/* 154 */     return left > right;
/*     */   }
/*     */   
/*     */   public static boolean sge(int left, int right) {
/* 158 */     return left >= right;
/*     */   }
/*     */   
/*     */   public static boolean slt(int left, int right) {
/* 162 */     return left < right;
/*     */   }
/*     */   
/*     */   public static boolean sle(int left, int right) {
/* 166 */     return left <= right;
/*     */   }
/*     */   
/*     */   public static boolean sgt(short left, short right) {
/* 170 */     return left > right;
/*     */   }
/*     */   
/*     */   public static boolean sge(short left, short right) {
/* 174 */     return left >= right;
/*     */   }
/*     */   
/*     */   public static boolean slt(short left, short right) {
/* 178 */     return left < right;
/*     */   }
/*     */   
/*     */   public static boolean sle(short left, short right) {
/* 182 */     return left <= right;
/*     */   }
/*     */   
/*     */   public static boolean sgt(byte left, byte right) {
/* 186 */     return left > right;
/*     */   }
/*     */   
/*     */   public static boolean sge(byte left, byte right) {
/* 190 */     return left >= right;
/*     */   }
/*     */   
/*     */   public static boolean slt(byte left, byte right) {
/* 194 */     return left < right;
/*     */   }
/*     */   
/*     */   public static boolean sle(byte left, byte right) {
/* 198 */     return left <= right;
/*     */   }
/*     */   
/*     */   public static boolean ugt(BigInteger lhs, BigInteger rhs) {
/* 202 */     if ((lhs.signum() < 0) || (rhs.signum() < 0)) {
/* 203 */       return lhs.compareTo(rhs) > 0;
/*     */     }
/* 205 */     return lhs.compareTo(rhs) > 0;
/*     */   }
/*     */   
/*     */   public static boolean uge(BigInteger left, BigInteger right)
/*     */   {
/* 210 */     return (left.compareTo(right) == 0) || (ugt(left, right));
/*     */   }
/*     */   
/*     */   public static boolean ult(BigInteger left, BigInteger right) {
/* 214 */     return ugt(right, left);
/*     */   }
/*     */   
/*     */   public static boolean ule(BigInteger left, BigInteger right) {
/* 218 */     return (left.compareTo(right) == 0) || (ugt(right, left));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static byte add(byte left, byte right)
/*     */   {
/* 228 */     return (byte)(left + right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static short add(short left, short right)
/*     */   {
/* 238 */     return (short)(left + right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int add(int left, int right)
/*     */   {
/* 248 */     return left + right;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static long add(long left, long right)
/*     */   {
/* 258 */     return left + right;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static BigInteger add(BigInteger left, BigInteger right)
/*     */   {
/* 268 */     return left.add(right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static byte sub(byte left, byte right)
/*     */   {
/* 279 */     return (byte)(left - right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static short sub(short left, short right)
/*     */   {
/* 289 */     return (short)(left - right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int sub(int left, int right)
/*     */   {
/* 299 */     return left - right;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static long sub(long left, long right)
/*     */   {
/* 309 */     return left - right;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static BigInteger sub(BigInteger left, BigInteger right)
/*     */   {
/* 319 */     return left.subtract(right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static byte mul(byte left, byte right)
/*     */   {
/* 329 */     return (byte)(left * right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static short mul(short left, short right)
/*     */   {
/* 339 */     return (short)(left * right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int mul(int left, int right)
/*     */   {
/* 349 */     return left * right;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static long mul(long left, long right)
/*     */   {
/* 359 */     return left * right;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static BigInteger mul(BigInteger left, BigInteger right)
/*     */   {
/* 369 */     return left.multiply(right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static byte udiv(byte left, byte right)
/*     */   {
/* 376 */     int lhs = left & 0xFF;
/* 377 */     int rhs = right & 0xFF;
/* 378 */     return (byte)(lhs / rhs);
/*     */   }
/*     */   
/*     */   public static short udiv(short left, short right) {
/* 382 */     int lhs = left & 0xFFFF;
/* 383 */     int rhs = right & 0xFFFF;
/* 384 */     return (short)(lhs / rhs);
/*     */   }
/*     */   
/*     */   public static int udiv(int left, int right) {
/* 388 */     long lhs = left & 0xFFFFFFFF;
/* 389 */     long rhs = right & 0xFFFFFFFF;
/* 390 */     return (int)(lhs / rhs);
/*     */   }
/*     */   
/*     */   public static long udiv(long left, long right) {
/* 394 */     if ((left < 0L) || (right < 0L)) {
/* 395 */       BigInteger lhs = unsigned(left, 16);
/* 396 */       BigInteger rhs = unsigned(right, 16);
/* 397 */       return lhs.divide(rhs).longValue();
/*     */     }
/* 399 */     return left / right;
/*     */   }
/*     */   
/*     */   public static BigInteger udiv(BigInteger left, BigInteger right)
/*     */   {
/* 404 */     return left.divide(right);
/*     */   }
/*     */   
/*     */   public static boolean eq(byte left, byte right)
/*     */   {
/* 409 */     return left == right;
/*     */   }
/*     */   
/*     */   public static boolean eq(short left, short right) {
/* 413 */     return left == right;
/*     */   }
/*     */   
/*     */   public static boolean eq(int left, int right) {
/* 417 */     return left == right;
/*     */   }
/*     */   
/*     */   public static boolean eq(long left, long right) {
/* 421 */     return left == right;
/*     */   }
/*     */   
/*     */   public static boolean eq(BigInteger left, BigInteger right) {
/* 425 */     return left.equals(right);
/*     */   }
/*     */   
/* 428 */   public static boolean ne(byte left, byte right) { return left != right; }
/*     */   
/*     */   public static boolean ne(short left, short right)
/*     */   {
/* 432 */     return left != right;
/*     */   }
/*     */   
/*     */   public static boolean ne(int left, int right) {
/* 436 */     return left != right;
/*     */   }
/*     */   
/*     */   public static boolean ne(long left, long right) {
/* 440 */     return left != right;
/*     */   }
/*     */   
/*     */   public static boolean ne(BigInteger left, BigInteger right) {
/* 444 */     return !left.equals(right);
/*     */   }
/*     */   
/*     */ 
/*     */   public static byte urem(byte left, byte right)
/*     */   {
/* 450 */     int lhs = left & 0xFF;
/* 451 */     int rhs = right & 0xFF;
/* 452 */     return (byte)(lhs % rhs);
/*     */   }
/*     */   
/*     */   public static short urem(short left, short right) {
/* 456 */     int lhs = left & 0xFFFF;
/* 457 */     int rhs = right & 0xFFFF;
/* 458 */     return (short)(lhs % rhs);
/*     */   }
/*     */   
/*     */   public static int urem(int left, int right) {
/* 462 */     long lhs = left & 0xFFFFFFFF;
/* 463 */     long rhs = right & 0xFFFFFFFF;
/* 464 */     return (int)(lhs % rhs);
/*     */   }
/*     */   
/*     */   public static long urem(long left, long right) {
/* 468 */     if ((left < 0L) || (right < 0L)) {
/* 469 */       BigInteger lhs = unsigned(left, 16);
/* 470 */       BigInteger rhs = unsigned(right, 16);
/* 471 */       return lhs.remainder(rhs).longValue();
/*     */     }
/* 473 */     return left % right;
/*     */   }
/*     */   
/*     */   public static BigInteger urem(BigInteger left, BigInteger right)
/*     */   {
/* 478 */     return left.remainder(right);
/*     */   }
/*     */   
/*     */   public static byte sdiv(byte left, byte right) {
/* 482 */     return (byte)(left / right);
/*     */   }
/*     */   
/*     */   public static short sdiv(short left, short right) {
/* 486 */     return (short)(left / right);
/*     */   }
/*     */   
/*     */   public static int sdiv(int left, int right) {
/* 490 */     return left / right;
/*     */   }
/*     */   
/*     */   public static long sdiv(long left, long right) {
/* 494 */     return left / right;
/*     */   }
/*     */   
/*     */   public static BigInteger sdiv(BigInteger left, BigInteger right) {
/* 498 */     return left.divide(right);
/*     */   }
/*     */   
/*     */   public static byte srem(byte left, byte right)
/*     */   {
/* 503 */     return (byte)(left % right);
/*     */   }
/*     */   
/*     */   public static short srem(short left, short right) {
/* 507 */     return (short)(left % right);
/*     */   }
/*     */   
/*     */   public static int srem(int left, int right) {
/* 511 */     return left % right;
/*     */   }
/*     */   
/*     */   public static long srem(long left, long right) {
/* 515 */     return left % right;
/*     */   }
/*     */   
/*     */   public static BigInteger srem(BigInteger left, BigInteger right) {
/* 519 */     return left.remainder(right);
/*     */   }
/*     */   
/*     */   public static byte shl(byte left, int right)
/*     */   {
/* 524 */     int lhs = left & 0xFF;
/* 525 */     return (byte)(lhs << right);
/*     */   }
/*     */   
/*     */   public static short shl(short left, int right) {
/* 529 */     int lhs = left & 0xFFFF;
/* 530 */     return (short)(lhs << right);
/*     */   }
/*     */   
/*     */   public static int shl(int left, int right) {
/* 534 */     return left << right;
/*     */   }
/*     */   
/*     */   public static long shl(long left, int right) {
/* 538 */     return left << right;
/*     */   }
/*     */   
/* 541 */   public static long shl(long left, long right) { return left << (int)right; }
/*     */   
/*     */   public static BigInteger shl(BigInteger left, int shift)
/*     */   {
/* 545 */     return left.shiftLeft(shift);
/*     */   }
/*     */   
/*     */   public static byte lshr(byte left, int right) {
/* 549 */     int lhs = left & 0xFF;
/* 550 */     return (byte)(lhs >>> right);
/*     */   }
/*     */   
/*     */   public static short lshr(short left, int right) {
/* 554 */     int lhs = left & 0xFFFF;
/* 555 */     return (short)(lhs >>> right);
/*     */   }
/*     */   
/*     */   public static int lshr(int left, int right) {
/* 559 */     return left >>> right;
/*     */   }
/*     */   
/*     */   public static long lshr(long left, int right) {
/* 563 */     return left >>> right;
/*     */   }
/*     */   
/* 566 */   public static long lshr(long left, long right) { return left >>> (int)right; }
/*     */   
/*     */   public static BigInteger lshr(BigInteger left, int right)
/*     */   {
/* 570 */     if (left.signum() < 0) {
/* 571 */       left = new BigInteger(1, left.toByteArray());
/*     */     }
/* 573 */     return left.shiftRight(right);
/*     */   }
/*     */   
/*     */   public static byte ashr(byte left, int right) {
/* 577 */     int lhs = left & 0xFF;
/* 578 */     return (byte)(lhs >> right);
/*     */   }
/*     */   
/*     */   public static short ashr(short left, int right) {
/* 582 */     int lhs = left & 0xFFFF;
/* 583 */     return (short)(lhs >> right);
/*     */   }
/*     */   
/*     */   public static int ashr(int left, int right) {
/* 587 */     return left >> right;
/*     */   }
/*     */   
/*     */   public static long ashr(long left, int right) {
/* 591 */     return left >> right;
/*     */   }
/*     */   
/* 594 */   public static long ashr(long left, long right) { return left >> (int)right; }
/*     */   
/*     */   public static BigInteger ashr(BigInteger left, int right)
/*     */   {
/* 598 */     throw new UnsupportedOperationException("Require complete rework to support ashr");
/*     */   }
/*     */   
/*     */ 
/*     */   public static byte and(byte left, byte right)
/*     */   {
/* 604 */     return (byte)(left & right & 0xFF);
/*     */   }
/*     */   
/*     */   public static short and(short left, short right) {
/* 608 */     return (short)(left & right & 0xFFFF);
/*     */   }
/*     */   
/*     */   public static int and(int left, int right) {
/* 612 */     return left & right;
/*     */   }
/*     */   
/*     */   public static long and(long left, long right) {
/* 616 */     return left & right;
/*     */   }
/*     */   
/*     */   public static BigInteger and(BigInteger left, BigInteger right) {
/* 620 */     return left.and(right);
/*     */   }
/*     */   
/*     */   public static byte or(byte left, byte right) {
/* 624 */     return (byte)(left & 0xFF | right & 0xFF);
/*     */   }
/*     */   
/*     */   public static short or(short left, short right) {
/* 628 */     return (short)(left & 0xFFFF | right & 0xFFFF);
/*     */   }
/*     */   
/*     */   public static int or(int left, int right) {
/* 632 */     return left | right;
/*     */   }
/*     */   
/*     */   public static long or(long left, long right) {
/* 636 */     return left | right;
/*     */   }
/*     */   
/*     */   public static BigInteger or(BigInteger left, BigInteger right) {
/* 640 */     return left.or(right);
/*     */   }
/*     */   
/*     */   public static byte xor(byte left, byte right)
/*     */   {
/* 645 */     return (byte)(left & 0xFF ^ right & 0xFF);
/*     */   }
/*     */   
/*     */   public static short xor(short left, short right) {
/* 649 */     return (short)(left & 0xFFFF ^ right & 0xFFFF);
/*     */   }
/*     */   
/*     */   public static int xor(int left, int right) {
/* 653 */     return left ^ right;
/*     */   }
/*     */   
/*     */   public static long xor(long left, long right) {
/* 657 */     return left ^ right;
/*     */   }
/*     */   
/*     */   public static BigInteger xor(BigInteger left, BigInteger right) {
/* 661 */     return left.xor(right);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static BigInteger unsigned(long value, int byte_len)
/*     */   {
/* 668 */     if (value == 0L) return BigInteger.ZERO;
/* 669 */     byte[] tmp = new byte[byte_len];
/* 670 */     int idx = tmp.length;
/* 671 */     while ((idx != 0) && (value != 0L)) {
/* 672 */       tmp[(--idx)] = ((byte)(int)value);
/* 673 */       value >>>= 8;
/*     */     }
/* 675 */     return new BigInteger(1, tmp);
/*     */   }
/*     */   
/* 678 */   public static BigInteger signed(long value, int byte_len) { byte[] tmp = new byte[byte_len];
/* 679 */     int idx = tmp.length;
/* 680 */     while (idx != 0) {
/* 681 */       tmp[(--idx)] = ((byte)(int)value);
/* 682 */       value >>= 8;
/*     */     }
/* 684 */     return new BigInteger(tmp);
/*     */   }
/*     */   
/*     */   public static boolean f_oeq(double left, double right) {
/* 688 */     return (left == right) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_one(double left, double right) {
/* 692 */     return (left != right) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_olt(double left, double right) {
/* 696 */     return (left < right) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ogt(double left, double right) {
/* 700 */     return (left > right) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ole(double left, double right) {
/* 704 */     return (left <= right) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_oge(double left, double right) {
/* 708 */     return (left >= right) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ord(double left, double right) {
/* 712 */     return (!Double.isNaN(left)) && (!Double.isNaN(right));
/*     */   }
/*     */   
/*     */   public static boolean f_uno(double left, double right) {
/* 716 */     return (Double.isNaN(left)) || (Double.isNaN(right));
/*     */   }
/*     */   
/*     */   public static boolean f_ueq(double left, double right) {
/* 720 */     return (left == right) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_une(double left, double right) {
/* 724 */     return (left != right) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ult(double left, double right) {
/* 728 */     return (left < right) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ugt(double left, double right) {
/* 732 */     return (left > right) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ule(double left, double right) {
/* 736 */     return (left <= right) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_uge(double left, double right) {
/* 740 */     return (left >= right) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_oeq(BigDecimal left, BigDecimal right) {
/* 744 */     return (left.compareTo(right) == 0) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_one(BigDecimal left, BigDecimal right) {
/* 748 */     return (left.compareTo(right) != 0) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_olt(BigDecimal left, BigDecimal right) {
/* 752 */     return (left.compareTo(right) < 0) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ogt(BigDecimal left, BigDecimal right) {
/* 756 */     return (left.compareTo(right) > 0) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ole(BigDecimal left, BigDecimal right) {
/* 760 */     return (left.compareTo(right) <= 0) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_oge(BigDecimal left, BigDecimal right) {
/* 764 */     return (left.compareTo(right) >= 0) && (f_ord(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ord(BigDecimal left, BigDecimal right) {
/* 768 */     return (!isNaN(left)) && (!isNaN(right));
/*     */   }
/*     */   
/*     */   public static boolean f_uno(BigDecimal left, BigDecimal right) {
/* 772 */     return (isNaN(left)) || (isNaN(right));
/*     */   }
/*     */   
/*     */   public static boolean f_ueq(BigDecimal left, BigDecimal right)
/*     */   {
/* 777 */     return (left.compareTo(right) == 0) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_une(BigDecimal left, BigDecimal right) {
/* 781 */     return (left.compareTo(right) != 0) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ult(BigDecimal left, BigDecimal right) {
/* 785 */     return (left.compareTo(right) < 0) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ugt(BigDecimal left, BigDecimal right) {
/* 789 */     return (left.compareTo(right) > 0) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_ule(BigDecimal left, BigDecimal right) {
/* 793 */     return (left.compareTo(right) <= 0) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean f_uge(BigDecimal left, BigDecimal right) {
/* 797 */     return (left.compareTo(right) >= 0) || (f_uno(left, right));
/*     */   }
/*     */   
/*     */   public static boolean isNaN(BigDecimal bd) {
/* 801 */     return false;
/*     */   }
/*     */   
/*     */   public static double fadd64(double left, double right)
/*     */   {
/* 806 */     return left + right;
/*     */   }
/*     */   
/* 809 */   public static double fsub64(double left, double right) { return left - right; }
/*     */   
/*     */   public static double fmul64(double left, double right) {
/* 812 */     return left * right;
/*     */   }
/*     */   
/* 815 */   public static double fdiv64(double left, double right) { return left / right; }
/*     */   
/*     */   public static double frem64(double left, double right) {
/* 818 */     return left % right;
/*     */   }
/*     */   
/* 821 */   public static float fadd32(float left, float right) { return left + right; }
/*     */   
/*     */   public static float fsub32(float left, float right) {
/* 824 */     return left - right;
/*     */   }
/*     */   
/* 827 */   public static float fmul32(float left, float right) { return left * right; }
/*     */   
/*     */   public static float fdiv32(float left, float right) {
/* 830 */     return left / right;
/*     */   }
/*     */   
/* 833 */   public static float frem32(float left, float right) { return left % right; }
/*     */   
/*     */   public static BigDecimal fadd80(BigDecimal left, BigDecimal right) {
/* 836 */     return left.add(right, F80);
/*     */   }
/*     */   
/* 839 */   public static BigDecimal fsub80(BigDecimal left, BigDecimal right) { return left.subtract(right, F80); }
/*     */   
/*     */   public static BigDecimal fmul80(BigDecimal left, BigDecimal right) {
/* 842 */     return left.multiply(right, F80);
/*     */   }
/*     */   
/* 845 */   public static BigDecimal fdiv80(BigDecimal left, BigDecimal right) { return left.divide(right, F80); }
/*     */   
/*     */   public static BigDecimal frem80(BigDecimal left, BigDecimal right) {
/* 848 */     return left.remainder(right, F80);
/*     */   }
/*     */   
/*     */   public static BigDecimal fadd128(BigDecimal left, BigDecimal right) {
/* 852 */     return left.add(right, F128);
/*     */   }
/*     */   
/* 855 */   public static BigDecimal fsub128(BigDecimal left, BigDecimal right) { return left.subtract(right, F128); }
/*     */   
/*     */   public static BigDecimal fmul128(BigDecimal left, BigDecimal right) {
/* 858 */     return left.multiply(right, F128);
/*     */   }
/*     */   
/* 861 */   public static BigDecimal fdiv128(BigDecimal left, BigDecimal right) { return left.divide(right, F128); }
/*     */   
/*     */   public static BigDecimal frem128(BigDecimal left, BigDecimal right) {
/* 864 */     return left.remainder(right, F128);
/*     */   }
/*     */   
/*     */   public static BigDecimal convertFp80(int top, BigInteger bottomBits) {
/* 868 */     int sign = (top >> 15 & 0x1) != 0 ? -1 : 1;
/* 869 */     int exponent = top & 0x7FFF;
/* 870 */     BigInteger significand = bottomBits;
/* 871 */     exponent -= 16446;
/* 872 */     BigDecimal bd = convert(sign, exponent, significand);
/* 873 */     return bd;
/*     */   }
/*     */   
/*     */   public static BigDecimal convertFp80(String hexCode) {
/* 877 */     String bottoms = hexCode.substring(4);
/* 878 */     String tops = hexCode.substring(0, 4);
/* 879 */     BigInteger bi = new BigInteger(bottoms, 16);
/* 880 */     int top = Integer.parseInt(tops, 16);
/* 881 */     return convertFp80(top, bi);
/*     */   }
/*     */   
/*     */   public static BigDecimal convert(int sign, int exponent, long significand) {
/* 885 */     BigInteger bi = BigInteger.valueOf(significand);
/* 886 */     return convert(sign, exponent, bi);
/*     */   }
/*     */   
/*     */   public static BigDecimal convert(int sign, int exponent, BigInteger bi)
/*     */   {
/* 891 */     bi = bi.multiply(BigInteger.valueOf(sign));
/* 892 */     BigDecimal bd = new BigDecimal(bi);
/* 893 */     if (exponent < 0) {
/* 894 */       bd = bd.divide(BigDecimal.valueOf(2L).pow(-exponent));
/*     */     } else {
/* 896 */       bd = bd.multiply(BigDecimal.valueOf(2L).pow(exponent));
/*     */     }
/* 898 */     return bd;
/*     */   }
/*     */   
/*     */   public static float ceilf(float f) {
/* 902 */     return (float)Math.ceil(f);
/*     */   }
/*     */   
/* 905 */   public static float floorf(float f) { return (float)Math.floor(f); }
/*     */   
/*     */   public static double floor(double f) {
/* 908 */     return Math.floor(f);
/*     */   }
/*     */   
/* 911 */   public static double ceil(double f) { return Math.ceil(f); }
/*     */   
/*     */ 
/*     */   public static int bound(int value, int min, int max)
/*     */   {
/* 916 */     return value > max ? max : value < min ? min : value;
/*     */   }
/*     */   
/* 919 */   public static float bound(float value, float min, float max) { return value > max ? max : value < min ? min : value; }
/*     */   
/*     */   public static double bound(double value, double min, double max) {
/* 922 */     return value > max ? max : value < min ? min : value;
/*     */   }
/*     */   
/* 925 */   public static long bound(long value, long min, long max) { return value > max ? max : value < min ? min : value; }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/api/MathUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */