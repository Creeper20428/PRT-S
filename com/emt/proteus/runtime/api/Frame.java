/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.program.FunctionData;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import java.io.PrintStream;
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import java.util.Arrays;
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
/*     */ public final class Frame
/*     */ {
/*  61 */   private static final boolean VERBOSE = MainCtx.getSettings().booleanValue("verbose");
/*     */   
/*     */   public static final long INT_MASK = 4294967295L;
/*     */   
/*     */   public static final int SHORT_MASK = 65535;
/*     */   
/*     */   public static final int BYTE_MASK = 255;
/*     */   
/*     */   private final int[] stack;
/*     */   
/*     */   private final int frame_base;
/*     */   
/*     */   private final int frame_length;
/*     */   
/*     */   private final int constant_size;
/*     */   private final int arg_start;
/*     */   private final int v_arg_start;
/*     */   private int allocBase;
/*     */   private int return_idx;
/*     */   
/*     */   public Frame(FunctionData data)
/*     */   {
/*  83 */     this.frame_base = 0;
/*  84 */     this.frame_length = data.getFrameLength();
/*  85 */     this.arg_start = data.getArgStart();
/*  86 */     this.v_arg_start = data.getVargStart();
/*  87 */     int[] constants = data.getConstants();
/*  88 */     this.constant_size = constants.length;
/*  89 */     this.stack = new int[this.frame_length];
/*  90 */     System.arraycopy(constants, 0, this.stack, 0, this.constant_size);
/*     */   }
/*     */   
/*     */   public Frame(int[] stack, int frame_base, int frame_length, int constant_size, int arg_start, int v_arg_start) {
/*  94 */     this.stack = stack;
/*  95 */     this.frame_base = frame_base;
/*  96 */     this.frame_length = frame_length;
/*  97 */     this.constant_size = constant_size;
/*  98 */     this.arg_start = arg_start;
/*  99 */     this.v_arg_start = v_arg_start;
/*     */   }
/*     */   
/*     */   public Frame copy() {
/* 103 */     int[] s = new int[this.frame_length];
/* 104 */     System.arraycopy(this.stack, this.frame_base, s, 0, this.frame_length);
/* 105 */     return new Frame(s, 0, this.frame_length, this.constant_size, this.arg_start, this.v_arg_start);
/*     */   }
/*     */   
/*     */   public int getArgStart()
/*     */   {
/* 110 */     return this.arg_start;
/*     */   }
/*     */   
/*     */   public void setReturn(int idx) {
/* 114 */     this.return_idx = idx;
/*     */   }
/*     */   
/*     */   public int getReturn() {
/* 118 */     return this.return_idx;
/*     */   }
/*     */   
/*     */   public void copy(int srcAddr, int dstAddr)
/*     */   {
/* 123 */     int sidx = srcAddr + this.frame_base;
/* 124 */     int didx = dstAddr + this.frame_base;
/* 125 */     this.stack[didx] = this.stack[sidx];
/*     */   }
/*     */   
/*     */   public void copy(int srcAddr, int dstAddr, int intWidth) {
/* 129 */     int sidx = srcAddr + this.frame_base;
/* 130 */     int didx = dstAddr + this.frame_base;
/* 131 */     while (intWidth > 0) {
/* 132 */       this.stack[(didx++)] = this.stack[(sidx++)];
/* 133 */       intWidth--;
/*     */     }
/*     */   }
/*     */   
/*     */   public void copy(Frame src, int srcAddr, int dstAddr, int intWidth) {
/* 138 */     int sidx = src.frame_base + srcAddr;
/* 139 */     int didx = this.frame_base + dstAddr;
/* 140 */     while (intWidth > 0) {
/* 141 */       this.stack[(didx++)] = src.stack[(sidx++)];
/* 142 */       intWidth--;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean getI1(int addr) {
/* 147 */     int idx = addr + this.frame_base;
/* 148 */     return this.stack[idx] != 0;
/*     */   }
/*     */   
/*     */   public byte getI8(int addr) {
/* 152 */     int idx = addr + this.frame_base;
/* 153 */     return (byte)this.stack[idx];
/*     */   }
/*     */   
/*     */   public short getI16(int addr) {
/* 157 */     int idx = addr + this.frame_base;
/* 158 */     return (short)this.stack[idx];
/*     */   }
/*     */   
/*     */   public int getI32(int addr)
/*     */   {
/* 163 */     int idx = addr + this.frame_base;
/* 164 */     return this.stack[idx];
/*     */   }
/*     */   
/*     */   public long getI64(int addr) {
/* 168 */     int idx = addr + this.frame_base;
/* 169 */     return this.stack[idx] & 0xFFFFFFFF | this.stack[(idx + 1)] << 32;
/*     */   }
/*     */   
/*     */   public BigInteger getI96(int addr) {
/* 173 */     int idx = addr + this.frame_base;
/* 174 */     return toBigInteger(this.stack, idx, 3);
/*     */   }
/*     */   
/*     */   public BigInteger getI128(int addr) {
/* 178 */     int idx = addr + this.frame_base;
/* 179 */     return toBigInteger(this.stack, idx, 4);
/*     */   }
/*     */   
/*     */   public float getF32(int addr) {
/* 183 */     return Float.intBitsToFloat(getI32(addr));
/*     */   }
/*     */   
/*     */   public double getF64(int addr) {
/* 187 */     return Double.longBitsToDouble(getI64(addr));
/*     */   }
/*     */   
/*     */   public BigDecimal getF80(int addr) {
/* 191 */     int idx = addr + this.frame_base;
/* 192 */     return toBigDecimal(this.stack, idx, 5);
/*     */   }
/*     */   
/*     */   public BigDecimal getF128(int addr) {
/* 196 */     int idx = addr + this.frame_base;
/* 197 */     return toBigDecimal(this.stack, idx, 8);
/*     */   }
/*     */   
/*     */   public String getString(int addr) {
/* 201 */     int idx = addr + this.frame_base;
/* 202 */     return MainMemory.getString(this.stack[idx]);
/*     */   }
/*     */   
/*     */   public void setI1(int addr, boolean val)
/*     */   {
/* 207 */     int idx = addr + this.frame_base;
/* 208 */     this.stack[idx] = (val ? 1 : 0);
/*     */   }
/*     */   
/*     */   public void setI8(int addr, byte val) {
/* 212 */     int idx = addr + this.frame_base;
/* 213 */     this.stack[idx] = (val & 0xFF);
/*     */   }
/*     */   
/*     */   public void setI16(int addr, short val) {
/* 217 */     int idx = addr + this.frame_base;
/* 218 */     this.stack[idx] = (val & 0xFFFF);
/*     */   }
/*     */   
/*     */   public void setI32(int addr, int val) {
/* 222 */     int idx = addr + this.frame_base;
/* 223 */     this.stack[idx] = val;
/*     */   }
/*     */   
/*     */   public void setPointerAddress(int addr, int val) {
/* 227 */     int idx = addr + this.frame_base;
/* 228 */     this.stack[idx] = val;
/*     */   }
/*     */   
/*     */   public void setI64(int addr, long val) {
/* 232 */     int idx = addr + this.frame_base;
/* 233 */     this.stack[idx] = ((int)val);
/* 234 */     this.stack[(idx + 1)] = ((int)(val >>> 32));
/*     */   }
/*     */   
/*     */   public void setF32(int addr, float value) {
/* 238 */     setI32(addr, Float.floatToRawIntBits(value));
/*     */   }
/*     */   
/*     */   public void setF64(int addr, double value) {
/* 242 */     setI64(addr, Double.doubleToRawLongBits(value));
/*     */   }
/*     */   
/*     */   public void setI96(int addr, BigInteger val) {
/* 246 */     int idx = addr + this.frame_base;
/* 247 */     fromBigInteger(this.stack, idx, 3, val);
/*     */   }
/*     */   
/*     */   public void setI128(int addr, BigInteger val) {
/* 251 */     int idx = addr + this.frame_base;
/* 252 */     fromBigInteger(this.stack, idx, 4, val);
/*     */   }
/*     */   
/*     */   public void setF80(int addr, BigDecimal dec) {
/* 256 */     int idx = addr + this.frame_base;
/* 257 */     fromBigDecimal(this.stack, idx, 3, dec);
/*     */   }
/*     */   
/*     */   public void setF128(int addr, BigDecimal dec) {
/* 261 */     int idx = addr + this.frame_base;
/* 262 */     fromBigDecimal(this.stack, idx, 4, dec);
/*     */   }
/*     */   
/*     */   public int getPointerAddress(int addr) {
/* 266 */     int idx = addr + this.frame_base;
/* 267 */     return this.stack[idx];
/*     */   }
/*     */   
/*     */   public Object getObject(int index)
/*     */   {
/* 272 */     return null;
/*     */   }
/*     */   
/*     */   public int getVarArgStart() {
/* 276 */     return this.v_arg_start;
/*     */   }
/*     */   
/*     */   public boolean cmpZero(int dst, int addr) {
/* 280 */     int didx = dst + this.frame_base;
/* 281 */     int idx = addr + this.frame_base;
/* 282 */     int[] array = this.stack;
/* 283 */     boolean zero = array[idx] == 0;
/* 284 */     array[didx] = (zero ? 1 : 0);
/* 285 */     return zero;
/*     */   }
/*     */   
/*     */   public boolean cmp_eq(int dest, int lhs, int rhs) {
/* 289 */     int dIdx = dest + this.frame_base;
/* 290 */     int lIdx = lhs + this.frame_base;
/* 291 */     int rIdx = rhs + this.frame_base;
/* 292 */     int[] array = this.stack;
/* 293 */     boolean equal = array[lIdx] == array[rIdx];
/* 294 */     array[dIdx] = (equal ? 1 : 0);
/* 295 */     return equal;
/*     */   }
/*     */   
/* 298 */   public boolean cmp_eq(int dest, int lhs, int rhs, int len) { int dIdx = dest + this.frame_base;
/* 299 */     boolean equal = ucmp(lhs, rhs, len) == 0;
/* 300 */     this.stack[dIdx] = (equal ? 1 : 0);
/* 301 */     return equal;
/*     */   }
/*     */   
/* 304 */   public boolean cmp_ult(int dest, int lhs, int rhs, int len) { int dIdx = dest + this.frame_base;
/* 305 */     boolean lt = ucmp(lhs, rhs, len) < 0;
/* 306 */     this.stack[dIdx] = (lt ? 1 : 0);
/* 307 */     return lt;
/*     */   }
/*     */   
/* 310 */   public int ucmp(int lhs, int rhs, int len) { int[] array = this.stack;
/* 311 */     int cmp = 0;
/* 312 */     int lIdx = lhs + this.frame_base + len - 1;
/* 313 */     int rIdx = rhs + this.frame_base + len - 1;
/* 314 */     for (int i = 0; ((i < len ? 1 : 0) & (cmp == 0 ? 1 : 0)) != 0; rIdx--) {
/* 315 */       int ilhs = array[lIdx];
/* 316 */       int irhs = array[rIdx];
/* 317 */       cmp = MathUtils.ucmp(ilhs, irhs);i++;lIdx--;
/*     */     }
/*     */     
/*     */ 
/* 319 */     return cmp;
/*     */   }
/*     */   
/*     */   public boolean cmp_ugt(int dest, int lhs, int rhs) {
/* 323 */     int dIdx = dest + this.frame_base;
/* 324 */     int lIdx = lhs + this.frame_base;
/* 325 */     int rIdx = rhs + this.frame_base;
/* 326 */     int[] array = this.stack;
/* 327 */     long _lhs = array[lIdx] & 0xFFFFFFFF;
/* 328 */     long _rhs = array[rIdx] & 0xFFFFFFFF;
/* 329 */     boolean greater = _lhs > _rhs;
/* 330 */     array[dIdx] = (greater ? 1 : 0);
/* 331 */     return greater;
/*     */   }
/*     */   
/*     */   public boolean isZero(int addr)
/*     */   {
/* 336 */     int idx = addr + this.frame_base;
/* 337 */     return this.stack[idx] == 0;
/*     */   }
/*     */   
/*     */   public void or(int dest, int lhs, int rhs) {
/* 341 */     int dIdx = dest + this.frame_base;
/* 342 */     int lIdx = lhs + this.frame_base;
/* 343 */     int rIdx = rhs + this.frame_base;
/* 344 */     int[] array = this.stack;
/* 345 */     array[lIdx] |= array[rIdx];
/*     */   }
/*     */   
/*     */   public void and(int dest, int lhs, int rhs) {
/* 349 */     int dIdx = dest + this.frame_base;
/* 350 */     int lIdx = lhs + this.frame_base;
/* 351 */     int rIdx = rhs + this.frame_base;
/* 352 */     int[] array = this.stack;
/* 353 */     array[lIdx] &= array[rIdx];
/*     */   }
/*     */   
/*     */   public void add(int dest, int lhs, int rhs) {
/* 357 */     int dIdx = dest + this.frame_base;
/* 358 */     int lIdx = lhs + this.frame_base;
/* 359 */     int rIdx = rhs + this.frame_base;
/* 360 */     int[] array = this.stack;
/* 361 */     array[lIdx] += array[rIdx];
/*     */   }
/*     */   
/*     */   public void xor(int dest, int lhs, int rhs) {
/* 365 */     int dIdx = dest + this.frame_base;
/* 366 */     int lIdx = lhs + this.frame_base;
/* 367 */     int rIdx = rhs + this.frame_base;
/* 368 */     int[] array = this.stack;
/* 369 */     array[lIdx] ^= array[rIdx];
/*     */   }
/*     */   
/*     */   public void or64(int dest, int lhs, int rhs) {
/* 373 */     int dIdx = dest + this.frame_base;
/* 374 */     int lIdx = lhs + this.frame_base;
/* 375 */     int rIdx = rhs + this.frame_base;
/* 376 */     int[] array = this.stack;
/* 377 */     array[lIdx] |= array[rIdx];
/* 378 */     array[(lIdx + 1)] |= array[(rIdx + 1)];
/*     */   }
/*     */   
/*     */   public void and64(int dest, int lhs, int rhs) {
/* 382 */     int dIdx = dest + this.frame_base;
/* 383 */     int lIdx = lhs + this.frame_base;
/* 384 */     int rIdx = rhs + this.frame_base;
/* 385 */     int[] array = this.stack;
/* 386 */     array[lIdx] &= array[rIdx];
/* 387 */     array[(lIdx + 1)] &= array[(rIdx + 1)];
/*     */   }
/*     */   
/*     */   public void xor64(int dest, int lhs, int rhs) {
/* 391 */     int dIdx = dest + this.frame_base;
/* 392 */     int lIdx = lhs + this.frame_base;
/* 393 */     int rIdx = rhs + this.frame_base;
/* 394 */     int[] array = this.stack;
/* 395 */     array[lIdx] ^= array[rIdx];
/* 396 */     array[(lIdx + 1)] ^= array[(rIdx + 1)];
/*     */   }
/*     */   
/*     */   public void zext(int dest, int src) {
/* 400 */     int dIdx = dest + this.frame_base;
/* 401 */     int sIdx = src + this.frame_base;
/* 402 */     this.stack[dIdx] = this.stack[sIdx];
/*     */   }
/*     */   
/*     */   public void zext64(int dest, int src) {
/* 406 */     int dIdx = dest + this.frame_base;
/* 407 */     int sIdx = src + this.frame_base;
/* 408 */     int[] array = this.stack;
/* 409 */     array[dIdx] = array[sIdx];
/* 410 */     array[(dIdx + 1)] = 0;
/*     */   }
/*     */   
/*     */   public void zext128(int dest, int src) {
/* 414 */     int dIdx = dest + this.frame_base;
/* 415 */     int sIdx = src + this.frame_base;
/* 416 */     int[] array = this.stack;
/* 417 */     array[dIdx] = array[sIdx];
/* 418 */     array[(dIdx + 1)] = 0;
/* 419 */     array[(dIdx + 2)] = 0;
/* 420 */     array[(dIdx + 3)] = 0;
/*     */   }
/*     */   
/*     */   public void zexti64to128(int dest, int src) {
/* 424 */     int dIdx = dest + this.frame_base;
/* 425 */     int sIdx = src + this.frame_base;
/* 426 */     int[] array = this.stack;
/* 427 */     array[dIdx] = array[sIdx];
/* 428 */     array[(dIdx + 1)] = array[(sIdx + 1)];
/* 429 */     array[(dIdx + 2)] = 0;
/* 430 */     array[(dIdx + 3)] = 0;
/*     */   }
/*     */   
/*     */   public void trunc8(int dest, int src) {
/* 434 */     int dIdx = dest + this.frame_base;
/* 435 */     int sIdx = src + this.frame_base;
/* 436 */     int[] array = this.stack;
/* 437 */     array[sIdx] &= 0xFF;
/*     */   }
/*     */   
/*     */   public void trunc16(int dest, int src) {
/* 441 */     int dIdx = dest + this.frame_base;
/* 442 */     int sIdx = src + this.frame_base;
/* 443 */     int[] array = this.stack;
/* 444 */     array[sIdx] &= 0xFFFF;
/*     */   }
/*     */   
/*     */   public void trunc32(int dest, int src) {
/* 448 */     int dIdx = dest + this.frame_base;
/* 449 */     int sIdx = src + this.frame_base;
/* 450 */     int[] array = this.stack;
/* 451 */     array[dIdx] = array[sIdx];
/*     */   }
/*     */   
/*     */   public void trunc64(int dest, int src) {
/* 455 */     int dIdx = dest + this.frame_base;
/* 456 */     int sIdx = src + this.frame_base;
/* 457 */     int[] array = this.stack;
/* 458 */     array[dIdx] = array[sIdx];
/* 459 */     array[dIdx] = array[sIdx];
/* 460 */     array[(dIdx + 1)] = array[(sIdx + 1)];
/*     */   }
/*     */   
/*     */   public int getAllocBase()
/*     */   {
/* 465 */     return this.allocBase;
/*     */   }
/*     */   
/*     */   public void setAllocBase(int allocBase) {
/* 469 */     this.allocBase = allocBase;
/*     */   }
/*     */   
/*     */   public int getLength() {
/* 473 */     return this.frame_length;
/*     */   }
/*     */   
/*     */   public int getConstantsSize() {
/* 477 */     return this.constant_size;
/*     */   }
/*     */   
/*     */   private static BigDecimal toBigDecimal(int[] data, int index, int length) {
/* 481 */     if (VERBOSE) System.out.println("WARNING EXTENDED PRECISION NOT SUPPORTED");
/* 482 */     int lo = data[index];
/* 483 */     int hi = data[(index + 1)];
/* 484 */     long l = lo & 0xFFFFFFFF | hi << 32;
/* 485 */     return BigDecimal.valueOf(Double.longBitsToDouble(l));
/*     */   }
/*     */   
/*     */   private static void fromBigDecimal(int[] data, int index, int length, BigDecimal val) {
/* 489 */     if (VERBOSE) System.out.println("WARNING EXTENDED PRECISION NOT SUPPORTED");
/* 490 */     long l = Double.doubleToLongBits(val.doubleValue());
/* 491 */     int lo = (int)l;
/* 492 */     int hi = (int)(l >> 32);
/* 493 */     data[index] = lo;
/* 494 */     data[(index + 1)] = hi;
/*     */   }
/*     */   
/*     */   private static BigInteger toBigInteger(int[] data, int index, int length) {
/* 498 */     byte[] bytes = new byte[length << 2];
/* 499 */     int byteIdx = bytes.length;
/* 500 */     int mask = 0;
/* 501 */     for (int i = 0; i < length; i++) {
/* 502 */       int intvalue = data[(index + i)];
/* 503 */       mask |= intvalue;
/* 504 */       bytes[(--byteIdx)] = ((byte)intvalue);
/* 505 */       bytes[(--byteIdx)] = ((byte)(intvalue >> 8));
/* 506 */       bytes[(--byteIdx)] = ((byte)(intvalue >> 16));
/* 507 */       bytes[(--byteIdx)] = ((byte)(intvalue >> 24));
/*     */     }
/* 509 */     return mask == 0 ? BigInteger.ZERO : new BigInteger(1, bytes);
/*     */   }
/*     */   
/*     */   private static void fromBigInteger(int[] data, int index, int length, BigInteger val) {
/* 513 */     int end = index + length;
/* 514 */     Arrays.fill(data, index, end, 0);
/* 515 */     byte[] bytes = val.toByteArray();
/* 516 */     int byteIdx = bytes.length;
/*     */     
/* 518 */     while (byteIdx > 3) {
/* 519 */       int i = bytes[(--byteIdx)] & 0xFF | (bytes[(--byteIdx)] & 0xFF) << 8 | (bytes[(--byteIdx)] & 0xFF) << 16 | (bytes[(--byteIdx)] & 0xFF) << 24;
/*     */       
/*     */ 
/*     */ 
/* 523 */       data[(index++)] = i;
/*     */     }
/* 525 */     if (index < end) {
/* 526 */       switch (byteIdx) {
/*     */       case 3: 
/* 528 */         data[index] = ((bytes[0] & 0xFF) << 16 | (bytes[1] & 0xFF) << 8 | bytes[2] & 0xFF);
/* 529 */         break;
/*     */       case 2: 
/* 531 */         data[index] = ((bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF);
/* 532 */         break;
/*     */       case 1: 
/* 534 */         data[index] = (bytes[0] & 0xFF);
/* 535 */         break;
/*     */       }
/*     */       
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static Frame createDummy()
/*     */   {
/* 544 */     int length = 256;
/* 545 */     int[] _stack = new int[length];
/* 546 */     for (int i = 0; i < length; i++) {
/* 547 */       _stack[i] = i;
/*     */     }
/* 549 */     int constant_size = 64;
/* 550 */     int arg_start = 128;
/* 551 */     int v_arg_start = 192;
/* 552 */     Frame frame = new Frame(_stack, 0, length, constant_size, arg_start, v_arg_start);
/* 553 */     return frame;
/*     */   }
/*     */   
/*     */   public static Frame allocate(int[] constants, int frame_size, int arg_start, int v_arg_start) {
/* 557 */     int[] stack = new int[frame_size];
/* 558 */     int frame_base = 0;
/* 559 */     System.arraycopy(constants, 0, stack, frame_base, constants.length);
/* 560 */     return new Frame(stack, frame_base, frame_size, constants.length, arg_start, v_arg_start);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/Frame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */