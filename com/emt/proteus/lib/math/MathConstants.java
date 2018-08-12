/*    */ package com.emt.proteus.lib.math;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.math.MathContext;
/*    */ import java.math.RoundingMode;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MathConstants
/*    */ {
/* 37 */   public static BigInteger LONG_SIGNED_BIT = new BigInteger("10000000000000000", 16);
/* 38 */   public static BigInteger INT_SIGNED_BIT = new BigInteger("100000000", 16);
/* 39 */   public static final MathContext F80 = new MathContext(25, RoundingMode.HALF_UP);
/* 40 */   public static final MathContext F128 = MathContext.DECIMAL128;
/*    */   public static final long LONG_SIGN_BIT = Long.MIN_VALUE;
/*    */   public static final long LONG_UNSIGNED_BITS = Long.MAX_VALUE;
/*    */   public static final int INT_UNSIGNED_BITS = Integer.MAX_VALUE;
/*    */   public static final int INT_SIGN_MASK = Integer.MIN_VALUE;
/*    */   public static final long LONG_INT_MASK = 4294967295L;
/*    */   public static final int INT_SHORT_MASK = 65535;
/*    */   public static final int INT_BYTE_MASK = 255;
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/math/MathConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */