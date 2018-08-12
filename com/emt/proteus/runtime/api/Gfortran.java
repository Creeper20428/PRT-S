/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import com.emt.proteus.runtime.lib.io.IoHandle;
/*     */ import com.emt.proteus.runtime.lib.io.IoLib;
/*     */ import java.io.PrintStream;
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
/*     */ public class Gfortran
/*     */ {
/*  32 */   static final long startnanoTime = ;
/*     */   
/*     */   public static int _gfortran_compare_string(int len1, int s1, int len2, int s2)
/*     */   {
/*  36 */     int res = MainMemory.memcmp(s1, s2, len1 < len2 ? len1 : len2);
/*     */     
/*  38 */     if (res != 0) {
/*  39 */       return res;
/*     */     }
/*  41 */     if (len1 == len2)
/*  42 */       return 0;
/*     */     int len;
/*     */     char s;
/*     */     int spointer;
/*  46 */     if (len1 < len2)
/*     */     {
/*  48 */       int len = len2 - len1;
/*  49 */       char s = (char)MainMemory.getByte(s2 + len1);
/*  50 */       int spointer = s2 + len1;
/*  51 */       res = -1;
/*     */     }
/*     */     else
/*     */     {
/*  55 */       len = len1 - len2;
/*  56 */       s = (char)MainMemory.getByte(s1 + len2);
/*  57 */       spointer = s1 + len2;
/*  58 */       res = 1;
/*     */     }
/*     */     
/*  61 */     while (len-- > 0)
/*     */     {
/*  63 */       if (s != ' ')
/*     */       {
/*  65 */         if (s > ' ') {
/*  66 */           return res;
/*     */         }
/*  68 */         return -res;
/*     */       }
/*  70 */       spointer++;
/*  71 */       s = (char)MainMemory.getByte(spointer);
/*     */     }
/*     */     
/*  74 */     return 0;
/*     */   }
/*     */   
/*     */   public static void _gfortran_concat_string(int destlen, int dest, int len1, int s1, int len2, int s2)
/*     */   {
/*  79 */     if (len1 >= destlen)
/*     */     {
/*  81 */       MainMemory.memcpy(dest, s1, destlen, 0);
/*  82 */       return;
/*     */     }
/*  84 */     MainMemory.memcpy(dest, s1, len1, 0);
/*  85 */     dest += len1;
/*  86 */     destlen -= len1;
/*     */     
/*  88 */     if (len2 >= destlen)
/*     */     {
/*  90 */       MainMemory.memcpy(dest, s2, destlen, 0);
/*  91 */       return;
/*     */     }
/*     */     
/*  94 */     MainMemory.memcpy(dest, s2, len2, 0);
/*  95 */     MainMemory.memset(dest + len2, destlen - len2, (byte)32, 0);
/*     */   }
/*     */   
/*     */   public static void _gfortran_cpu_time_4(Object... varargs)
/*     */   {
/* 100 */     long cur = System.nanoTime();
/* 101 */     float diff = (float)(cur - startnanoTime) / 1.0E9F;
/* 102 */     MainMemory.setF32(((Integer)varargs[0]).intValue(), diff);
/*     */   }
/*     */   
/*     */   public static void _gfortran_stop_numeric(int code)
/*     */   {
/* 107 */     System.out.println("Exiting with errorcode " + code);
/* 108 */     System.exit(code);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static int _gfortran_string_len_trim(int len, int s)
/*     */   {
/* 115 */     for (int i = len - 1; i >= 0; i--)
/*     */     {
/* 117 */       if ((char)MainMemory.getByte(s + i) != ' ')
/*     */         break;
/*     */     }
/* 120 */     return i + 1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int _gfortran_pow_i4_i4(int a, int b)
/*     */   {
/* 130 */     int n = b;
/* 131 */     int x = a;
/* 132 */     int pow = 1;
/* 133 */     if (n != 0)
/*     */     {
/*     */ 
/* 136 */       if (n < 0)
/*     */       {
/* 138 */         if (x == 1)
/* 139 */           return 1;
/* 140 */         if (x == -1)
/* 141 */           return (n & 0x1) != 0 ? -1 : 1;
/* 142 */         return x == 0 ? 1 / x : 0;
/*     */       }
/*     */       
/*     */ 
/* 146 */       int u = n;
/*     */       
/*     */       for (;;)
/*     */       {
/* 150 */         if ((u & 0x1) != 0)
/* 151 */           pow *= x;
/* 152 */         u >>= 1;
/* 153 */         if (u == 0) break;
/* 154 */         x *= x;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 159 */     return pow;
/*     */   }
/*     */   
/*     */   public static float _gfortran_pow_r4_i4(float a, int b)
/*     */   {
/* 164 */     int n = b;
/* 165 */     float x = a;
/* 166 */     float pow = 1.0F;
/*     */     
/* 168 */     if (n != 0) {
/*     */       long u;
/* 170 */       if (n < 0)
/*     */       {
/*     */ 
/* 173 */         long u = -n;
/* 174 */         x = pow / x;
/*     */       }
/*     */       else
/*     */       {
/* 178 */         u = n;
/*     */       }
/*     */       for (;;)
/*     */       {
/* 182 */         if ((u & 1L) != 0L)
/* 183 */           pow *= x;
/* 184 */         u >>= 1;
/* 185 */         if (u == 0L) break;
/* 186 */         x *= x;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 191 */     return pow;
/*     */   }
/*     */   
/*     */   public static double _gfortran_pow_r8_i4(double a, int b)
/*     */   {
/* 196 */     int n = b;
/* 197 */     double x = a;
/* 198 */     double pow = 1.0D;
/*     */     
/* 200 */     if (n != 0) {
/*     */       long u;
/* 202 */       if (n < 0)
/*     */       {
/*     */ 
/* 205 */         long u = -n;
/* 206 */         x = pow / x;
/*     */       }
/*     */       else
/*     */       {
/* 210 */         u = n;
/*     */       }
/*     */       for (;;)
/*     */       {
/* 214 */         if ((u & 1L) != 0L)
/* 215 */           pow *= x;
/* 216 */         u >>= 1;
/* 217 */         if (u == 0L) break;
/* 218 */         x *= x;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 223 */     return pow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static double cabs(int a)
/*     */   {
/* 233 */     double real = MainMemory.getF64(a);
/* 234 */     double im = MainMemory.getF64(a + 8);
/* 235 */     return real * real + im * im;
/*     */   }
/*     */   
/*     */   public static float cabsf(int a)
/*     */   {
/* 240 */     float real = MainMemory.getF32(a);
/* 241 */     float im = MainMemory.getF32(a + 4);
/* 242 */     return real * real + im * im;
/*     */   }
/*     */   
/*     */   public static void cexp(int a, int b)
/*     */   {
/* 247 */     double real = MainMemory.getF64(b);
/* 248 */     double im = MainMemory.getF64(b + 8);
/* 249 */     double newreal = Math.exp(real) * Math.cos(im);
/* 250 */     double newim = Math.exp(real) * Math.sin(im);
/* 251 */     MainMemory.setF64(a, newreal);
/* 252 */     MainMemory.setF64(a + 8, newim);
/*     */   }
/*     */   
/*     */   public static long cexpf(int b)
/*     */   {
/* 257 */     float real = MainMemory.getF32(b);
/* 258 */     float im = MainMemory.getF32(b + 4);
/* 259 */     float newreal = (float)(Math.exp(real) * Math.cos(im));
/* 260 */     float newim = (float)(Math.exp(real) * Math.sin(im));
/* 261 */     return Float.floatToRawIntBits(newreal) << 32 | Float.floatToRawIntBits(newim);
/*     */   }
/*     */   
/*     */   public static long csinf(int a)
/*     */   {
/* 266 */     float real = MainMemory.getF32(a);
/* 267 */     float im = MainMemory.getF32(a + 4);
/* 268 */     float newreal = (float)Math.sin(real) * (float)Math.cosh(im);
/* 269 */     float newim = (float)Math.cosh(real) * (float)Math.sinh(im);
/* 270 */     return Float.floatToRawIntBits(newreal) << 32 | Float.floatToRawIntBits(newim);
/*     */   }
/*     */   
/*     */   public static float sinf(float a)
/*     */   {
/* 275 */     return (float)Math.sin(a);
/*     */   }
/*     */   
/*     */   public static float cosf(float a)
/*     */   {
/* 280 */     return (float)Math.cos(a);
/*     */   }
/*     */   
/*     */   public static double copysign(double a, double b)
/*     */   {
/* 285 */     long lb = Double.doubleToRawLongBits(b);
/* 286 */     long la = Double.doubleToRawLongBits(a);
/* 287 */     return Double.longBitsToDouble(la & 0x7FFFFFFFFFFFFFFF | lb & 0x8000000000000000);
/*     */   }
/*     */   
/*     */   public static void csqrt(int a, int b)
/*     */   {
/* 292 */     double re = MainMemory.getF64(b);
/* 293 */     double im = MainMemory.getF64(b + 8);
/*     */     double vim;
/* 295 */     double vre; double vim; if (im == 0.0D) {
/*     */       double vim;
/* 297 */       if (re < 0.0D)
/*     */       {
/* 299 */         double vre = 0.0D;
/* 300 */         vim = copysign(Math.sqrt(-re), im);
/*     */       }
/*     */       else
/*     */       {
/* 304 */         double vre = Math.abs(Math.sqrt(re));
/* 305 */         vim = copysign(0.0D, im);
/*     */       }
/*     */     } else { double vim;
/* 308 */       if (re == 0.0D)
/*     */       {
/*     */ 
/*     */ 
/* 312 */         double r = Math.sqrt(0.5D * Math.abs(im));
/*     */         
/* 314 */         double vre = r;
/* 315 */         vim = copysign(r, im);
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 321 */         double d = Math.sqrt(re * re + im * im);
/*     */         double s;
/*     */         double s;
/* 324 */         double r; if (re > 0.0D)
/*     */         {
/* 326 */           double r = Math.sqrt(0.5D * d + 0.5D * re);
/* 327 */           s = 0.5D * im / r;
/*     */         }
/*     */         else
/*     */         {
/* 331 */           s = Math.sqrt(0.5D * d - 0.5D * re);
/* 332 */           r = Math.abs(0.5D * im / s);
/*     */         }
/*     */         
/* 335 */         vre = r;
/* 336 */         vim = copysign(s, im);
/*     */       } }
/* 338 */     MainMemory.setF64(a, vre);
/* 339 */     MainMemory.setF64(a + 8, vim);
/*     */   }
/*     */   
/*     */   public static float copysignf(float a, float b)
/*     */   {
/* 344 */     int lb = Float.floatToRawIntBits(b);
/* 345 */     int la = Float.floatToRawIntBits(a);
/* 346 */     return Float.intBitsToFloat(la & 0x7FFFFFFF | lb & 0x80000000);
/*     */   }
/*     */   
/*     */   public static long csqrtf(int b)
/*     */   {
/* 351 */     float re = MainMemory.getF32(b);
/* 352 */     float im = MainMemory.getF32(b + 4);
/*     */     float vim;
/* 354 */     float vre; float vim; if (im == 0.0F) {
/*     */       float vim;
/* 356 */       if (re < 0.0F)
/*     */       {
/* 358 */         float vre = 0.0F;
/* 359 */         vim = copysignf((float)Math.sqrt(-re), im);
/*     */       }
/*     */       else
/*     */       {
/* 363 */         float vre = Math.abs((float)Math.sqrt(re));
/* 364 */         vim = copysignf(0.0F, im);
/*     */       }
/*     */     } else { float vim;
/* 367 */       if (re == 0.0F)
/*     */       {
/*     */ 
/*     */ 
/* 371 */         float r = (float)Math.sqrt(0.5D * Math.abs(im));
/*     */         
/* 373 */         float vre = r;
/* 374 */         vim = copysignf(r, im);
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 380 */         float d = (float)Math.sqrt(re * re + im * im);
/*     */         float s;
/*     */         float s;
/* 383 */         float r; if (re > 0.0F)
/*     */         {
/* 385 */           float r = (float)Math.sqrt(0.5D * d + 0.5D * re);
/* 386 */           s = (float)(0.5D * im / r);
/*     */         }
/*     */         else
/*     */         {
/* 390 */           s = (float)Math.sqrt(0.5D * d - 0.5D * re);
/* 391 */           r = Math.abs((float)(0.5D * im / s));
/*     */         }
/*     */         
/* 394 */         vre = r;
/* 395 */         vim = copysignf(s, im);
/*     */       } }
/* 397 */     return Float.floatToRawIntBits(vre) << 32 | Float.floatToRawIntBits(vim);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void _gfortran_set_std(int a, int b, int c)
/*     */   {
/* 404 */     System.out.println("WARNING: used _gfortran_set_std()");
/*     */   }
/*     */   
/*     */   public static enum TYPE {
/* 408 */     BT_CHARACTER,  BT_COMPLEX,  BT_INTEGER,  BT_REAL,  BT_LOGICAL;
/*     */     
/*     */     private TYPE() {}
/*     */   }
/*     */   
/* 413 */   private static void unformatted_read(int $dtp, TYPE type, int $dest, int size, int nelems) { IoHandle handle = getHandle($dtp);
/*     */     
/* 415 */     if (type == TYPE.BT_COMPLEX)
/*     */     {
/* 417 */       nelems = 2;
/*     */     }
/*     */     
/* 420 */     int read = handle.read($dest, size * nelems);
/* 421 */     switch (size) {
/*     */     case 1: 
/*     */       break;
/*     */     case 4: 
/* 425 */       int i = 0; for (int p$ = $dest; i < nelems; p$ += 4) {
/* 426 */         MainMemory.setI32(p$, Integer.reverseBytes(MainMemory.getI32(p$)));i++;
/*     */       }
/* 428 */       break;
/*     */     case 8: 
/* 430 */       int i = 0; for (int p$ = $dest; i < nelems; p$ += 8) {
/* 431 */         MainMemory.setI64(p$, Long.reverseBytes(MainMemory.getI64(p$)));i++;
/*     */       }
/* 433 */       break;
/*     */     default: 
/* 435 */       System.out.println("Unknown size in Gfortran.unformatted_read() : " + size);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */   public static void _gfortran_st_read(int $dtp)
/*     */   {
/* 443 */     setMode($dtp, 82);
/*     */   }
/*     */   
/*     */   public static int _gfortran_st_read_done(int $dtp)
/*     */   {
/* 448 */     setMode($dtp, 0);
/* 449 */     return 0;
/*     */   }
/*     */   
/*     */   public static void _gfortran_st_write(int $dtp)
/*     */   {
/* 454 */     setMode($dtp, 87);
/*     */   }
/*     */   
/*     */   public static int _gfortran_st_write_done(int $dtp)
/*     */   {
/* 459 */     setMode($dtp, 0);
/* 460 */     return 0;
/*     */   }
/*     */   
/*     */   public static void _gfortran_transfer_character(int $dtp, int b, int len)
/*     */   {
/* 465 */     if (isRead($dtp)) {
/* 466 */       unformatted_read($dtp, TYPE.BT_CHARACTER, b, len, 1);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static void _gfortran_transfer_integer(int $dtp, int $_1, int len)
/*     */   {
/* 473 */     if (isRead($dtp)) {
/* 474 */       unformatted_read($dtp, TYPE.BT_INTEGER, $_1, len, 1);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static void _gfortran_transfer_real(int $dtp, int $_1, int len)
/*     */   {
/* 481 */     if (isRead($dtp)) {
/* 482 */       unformatted_read($dtp, TYPE.BT_REAL, $_1, len, 1);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void _gfortran_transfer_logical(int $dtp, int $_1, int len)
/*     */   {
/* 490 */     if (isRead($dtp)) {
/* 491 */       unformatted_read($dtp, TYPE.BT_LOGICAL, $_1, len, 1);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void _gfortran_transfer_complex(int $dtp, int $_1, int len)
/*     */   {
/* 499 */     if (isRead($dtp)) {
/* 500 */       unformatted_read($dtp, TYPE.BT_COMPLEX, $_1, len, 1);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void _gfortran_transfer_array(int $dtp, int $_1, int a, int b)
/*     */   {
/* 514 */     System.out.println("Gfortran.transfer_array()");
/*     */   }
/*     */   
/* 517 */   private static boolean isRead(int $dtp) { return MainMemory.getI32($dtp + 80) == 82; }
/*     */   
/*     */   private static void setMode(int $dtp, int mode)
/*     */   {
/* 521 */     MainMemory.setI32($dtp + 80, mode);
/*     */   }
/*     */   
/* 524 */   private static int getMode(int $dtp) { return MainMemory.getI32($dtp + 80); }
/*     */   
/*     */   private static IoHandle getHandle(int $dtp)
/*     */   {
/* 528 */     if (isRead($dtp)) {
/* 529 */       return IoLib.getStdIn();
/*     */     }
/* 531 */     return IoLib.getStdOut();
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/Gfortran.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */