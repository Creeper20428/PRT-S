/*     */ package com.emt.proteus.lib.utils;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.text.DecimalFormat;
/*     */ import java.util.ArrayList;
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
/*     */ public class Formatf
/*     */ {
/*     */   private final ArrayList<Elem> parts;
/*     */   private String src;
/*     */   
/*     */   private static int scan_hex_digits(CharSource source, StringBuilder dest)
/*     */   {
/*  37 */     int count = 0;
/*  38 */     count = skipWhiteSpace(source, dest);
/*  39 */     count += acceptHexDigits(source, dest);
/*  40 */     return count;
/*     */   }
/*     */   
/*     */   private static int scan_digits(CharSource source, boolean fp, StringBuilder dest) {
/*  44 */     int count = 0;
/*  45 */     count = skipWhiteSpace(source, dest);
/*  46 */     count += acceptOptionalMinus(source, dest);
/*  47 */     count += acceptDigits(source, dest);
/*  48 */     if (fp) {
/*  49 */       if (source.next() != 46) {
/*  50 */         source.pushback();
/*     */       } else {
/*  52 */         dest.append('.');
/*  53 */         count++;
/*     */       }
/*  55 */       count += acceptDigits(source, dest);
/*  56 */       int exp = source.next();
/*  57 */       if ((exp == 101) || (exp == 69)) {
/*  58 */         dest.append("e");
/*  59 */         count += acceptOptionalMinus(source, dest);
/*  60 */         count += acceptOptionalPlus(source, dest);
/*  61 */         count += acceptDigits(source, dest);
/*     */       } else {
/*  63 */         source.pushback();
/*     */       }
/*     */     }
/*  66 */     return count;
/*     */   }
/*     */   
/*     */   private static int acceptOptionalMinus(CharSource source, StringBuilder dest) {
/*  70 */     if (source.next() == 45) {
/*  71 */       dest.append('-');
/*  72 */       return 1;
/*     */     }
/*  74 */     source.pushback();
/*  75 */     return 0;
/*     */   }
/*     */   
/*     */   private static int acceptOptionalPlus(CharSource source, StringBuilder dest) {
/*  79 */     if (source.next() == 43) {
/*  80 */       dest.append('+');
/*  81 */       return 1;
/*     */     }
/*  83 */     source.pushback();
/*  84 */     return 0;
/*     */   }
/*     */   
/*     */   private static int skipWhiteSpace(CharSource source, StringBuilder dest)
/*     */   {
/*  89 */     int count = 0;
/*     */     for (;;) {
/*  91 */       int next = source.next();
/*  92 */       if ((next < 0) || (next > 32)) {
/*  93 */         source.pushback();
/*  94 */         return count;
/*     */       }
/*  96 */       count++;
/*     */     }
/*     */   }
/*     */   
/*     */   private static int acceptDigits(CharSource source, StringBuilder dest) {
/* 101 */     int count = 0;
/*     */     for (;;) {
/* 103 */       int next = source.next();
/* 104 */       switch (next)
/*     */       {
/*     */       case 48: 
/*     */       case 49: 
/*     */       case 50: 
/*     */       case 51: 
/*     */       case 52: 
/*     */       case 53: 
/*     */       case 54: 
/*     */       case 55: 
/*     */       case 56: 
/*     */       case 57: 
/* 116 */         dest.append((char)next);
/* 117 */         count++;
/*     */         
/* 119 */         break;
/*     */       default: 
/* 121 */         source.pushback();
/* 122 */         return count;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static int acceptHexDigits(CharSource source, StringBuilder dest) {
/* 128 */     int count = 0;
/*     */     for (;;) {
/* 130 */       int next = source.next();
/* 131 */       switch (next) {
/*     */       case 48: 
/*     */       case 49: 
/*     */       case 50: 
/*     */       case 51: 
/*     */       case 52: 
/*     */       case 53: 
/*     */       case 54: 
/*     */       case 55: 
/*     */       case 56: 
/*     */       case 65: 
/*     */       case 66: 
/*     */       case 67: 
/*     */       case 68: 
/*     */       case 69: 
/*     */       case 70: 
/*     */       case 97: 
/*     */       case 98: 
/*     */       case 99: 
/*     */       case 100: 
/*     */       case 101: 
/*     */       case 102: 
/* 153 */         dest.append((char)next);
/* 154 */         count++;
/* 155 */         break;
/*     */       case 57: case 58: case 59: case 60: case 61: case 62: case 63: case 64: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79: case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91: case 92: case 93: case 94: case 95: case 96: default: 
/* 157 */         source.pushback();
/* 158 */         return count;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static enum Data {
/* 164 */     LITERAL, 
/* 165 */     STRING, 
/* 166 */     INT, 
/* 167 */     LONG, 
/* 168 */     FLOAT, 
/* 169 */     DOUBLE, 
/* 170 */     CHAR;
/*     */     
/*     */     private Data() {} }
/*     */   
/* 174 */   public static String format(String fmt, Object[] args) { return parse(fmt).format(args); }
/*     */   
/*     */   public static String nformat(String fmt, int limit, Object[] args)
/*     */   {
/* 178 */     return Utils.truncate(parse(fmt).format(args), limit);
/*     */   }
/*     */   
/*     */   public static Formatf parse(String src) {
/*     */     try {
/* 183 */       int len = src.length();
/* 184 */       int idx = 0;
/* 185 */       Formatf printf = new Formatf(src);
/* 186 */       StringBuilder scratch = new StringBuilder();
/*     */       
/* 188 */       while (idx < len) {
/* 189 */         char chr = src.charAt(idx++);
/* 190 */         switch (chr) {
/*     */         default: 
/* 192 */           scratch.append(chr);
/* 193 */           break;
/*     */         case '\\': 
/* 195 */           scratch.append(escape(src.charAt(idx++)));
/* 196 */           break;
/*     */         case '%': 
/* 198 */           char c = src.charAt(idx);
/* 199 */           if (c == '%') {
/* 200 */             scratch.append("%");
/* 201 */             idx++;
/*     */           }
/*     */           else
/*     */           {
/* 205 */             if (scratch.length() > 0) {
/* 206 */               printf.addLiteral(scratch.toString());
/* 207 */               scratch.setLength(0);
/*     */             }
/* 209 */             Elem elem = new Elem(null);
/* 210 */             idx = readFlags(elem, src, idx);
/* 211 */             idx = readWidth(elem, src, idx);
/* 212 */             idx = readLength(elem, src, idx);
/* 213 */             idx = readConversion(elem, src, idx);
/* 214 */             printf.add(elem);
/*     */           }
/*     */           break; }
/*     */       }
/* 218 */       if (scratch.length() > 0) {
/* 219 */         printf.addLiteral(scratch.toString());
/* 220 */         scratch.setLength(0);
/*     */       }
/* 222 */       return printf;
/*     */     } catch (RuntimeException re) {
/* 224 */       System.out.println("Exception " + src);
/* 225 */       throw re;
/*     */     }
/*     */   }
/*     */   
/*     */   private static int readConversion(Elem elem, String src, int idx) {
/* 230 */     char c = src.charAt(idx);
/* 231 */     elem.conversion = c;
/*     */     
/* 233 */     switch (c) {
/*     */     case 's': 
/* 235 */       elem.dataType = Data.STRING;
/* 236 */       break;
/*     */     case 'c': 
/* 238 */       elem.dataType = Data.CHAR;
/* 239 */       break;
/*     */     case 'p': 
/* 241 */       elem.hash = true;
/*     */     case 'X': 
/*     */     case 'd': 
/*     */     case 'u': 
/*     */     case 'x': 
/* 246 */       if (elem.size > 4) {
/* 247 */         elem.dataType = Data.LONG;
/*     */       } else
/* 249 */         elem.dataType = Data.INT;
/* 250 */       break;
/*     */     case 'E': 
/*     */     case 'e': 
/*     */     case 'f': 
/*     */     case 'g': 
/* 255 */       elem.dataType = Data.DOUBLE;
/* 256 */       break;
/*     */     default: 
/* 258 */       return idx;
/*     */     }
/* 260 */     elem.fmt = c;
/* 261 */     return idx + 1;
/*     */   }
/*     */   
/*     */   private static int readFlags(Elem elem, String src, int idx) {
/* 265 */     int non_digit = idx;
/* 266 */     int len = src.length();
/* 267 */     elem.pad = ' ';
/* 268 */     while (len > non_digit) {
/* 269 */       switch (src.charAt(non_digit)) {
/*     */       case '0': 
/* 271 */         elem.pad = '0';
/* 272 */         non_digit++;
/* 273 */         break;
/*     */       case '-': 
/* 275 */         elem.left_aligned = true;
/*     */       case '#': 
/* 277 */         non_digit++;
/* 278 */         elem.hash = true;
/* 279 */         break;
/*     */       
/*     */       default: 
/* 282 */         return non_digit;
/*     */       }
/*     */     }
/* 285 */     return non_digit;
/*     */   }
/*     */   
/*     */   private static int readWidth(Elem elem, String src, int idx) {
/* 289 */     int len = src.length();
/* 290 */     int non_digit = idx;
/* 291 */     while ((len > non_digit) && (isDigit(src, non_digit))) non_digit++;
/* 292 */     if (idx < non_digit) {
/* 293 */       elem.min_width = Integer.parseInt(src.substring(idx, non_digit));
/* 294 */     } else if (src.charAt(non_digit) == '*') {
/* 295 */       elem.min_width = -1;
/* 296 */       non_digit++;
/*     */     } else {
/* 298 */       elem.min_width = 1;
/*     */     }
/* 300 */     if (src.charAt(non_digit) == '.') {
/* 301 */       non_digit++;idx = non_digit;
/* 302 */       while ((len > non_digit) && (isDigit(src, non_digit))) non_digit++;
/* 303 */       if (idx < non_digit) {
/* 304 */         elem.dp = Integer.parseInt(src.substring(idx, non_digit));
/* 305 */       } else if (src.charAt(non_digit) == '*') {
/* 306 */         elem.dp = -1;
/* 307 */         non_digit++;
/*     */       } else {
/* 309 */         elem.dp = 0;
/*     */       }
/*     */     }
/* 312 */     return non_digit;
/*     */   }
/*     */   
/*     */   private static int readLength(Elem elem, String src, int idx) {
/* 316 */     int non_digit = idx;
/* 317 */     int len = src.length();
/*     */     
/* 319 */     if (len > non_digit) {
/* 320 */       switch (src.charAt(non_digit)) {
/*     */       case 'h': 
/* 322 */         non_digit++;
/* 323 */         if ((len > non_digit) && (src.charAt(non_digit) == 'h')) {
/* 324 */           elem.size = 1;
/* 325 */           non_digit++;
/*     */         } else {
/* 327 */           elem.size = 2;
/*     */         }
/* 329 */         return non_digit;
/*     */       case 'l': 
/* 331 */         non_digit++;
/*     */         
/* 333 */         if ((len > non_digit) && (src.charAt(non_digit) == 'l')) {
/* 334 */           elem.size = 8;
/* 335 */           non_digit++;
/*     */         } else {
/* 337 */           elem.size = 4;
/*     */         }
/* 339 */         return non_digit;
/*     */       case 'j': 
/*     */       case 't': 
/*     */       case 'z': 
/* 343 */         non_digit++;
/* 344 */         elem.size = 4;
/* 345 */         return non_digit;
/*     */       case 'L': 
/* 347 */         non_digit++;
/* 348 */         elem.size = 8;
/* 349 */         return non_digit;
/*     */       }
/* 351 */       return non_digit;
/*     */     }
/*     */     
/* 354 */     return non_digit;
/*     */   }
/*     */   
/*     */   private static boolean isDigit(String src, int indx) {
/* 358 */     switch (src.charAt(indx)) {
/*     */     default: 
/* 360 */       return false;
/*     */     }
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
/* 372 */     return true;
/*     */   }
/*     */   
/*     */   private static char escape(char esc_char)
/*     */   {
/* 377 */     switch (esc_char) {
/*     */     case '\t': 
/* 379 */       return '\t';
/*     */     case '\r': 
/* 381 */       return '\r';
/*     */     case '\n': 
/* 383 */       return '\n';
/*     */     case '\f': 
/* 385 */       return '\f';
/*     */     }
/* 387 */     return esc_char;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Formatf(String str)
/*     */   {
/* 395 */     this.parts = new ArrayList();
/* 396 */     this.src = str;
/*     */   }
/*     */   
/*     */   private void addLiteral(String s)
/*     */   {
/* 401 */     this.parts.add(new Elem(s, null));
/*     */   }
/*     */   
/*     */   private void add(Elem elem) {
/* 405 */     this.parts.add(elem);
/*     */   }
/*     */   
/*     */   public int getSize() {
/* 409 */     return this.parts.size();
/*     */   }
/*     */   
/*     */   public Elem get(int idx) {
/* 413 */     return (Elem)this.parts.get(idx);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 417 */     return "Formatf {" + this.src + "}";
/*     */   }
/*     */   
/*     */   public String format(Object[] args)
/*     */   {
/* 422 */     int idx = 0;
/* 423 */     StringBuilder b = new StringBuilder();
/* 424 */     int len = getSize();
/* 425 */     for (int i = 0; i < len; i++) {
/* 426 */       Elem e = get(i);
/* 427 */       if (e.hasArgument()) {
/*     */         try {
/* 429 */           e.append(b, args[(idx++)]);
/*     */         } catch (ArrayIndexOutOfBoundsException aie) {
/* 431 */           b.append("###");
/*     */         }
/*     */       } else {
/* 434 */         e.append(b);
/*     */       }
/*     */     }
/* 437 */     return b.toString();
/*     */   }
/*     */   
/*     */   public static class Elem
/*     */   {
/*     */     private int fmt;
/*     */     private Formatf.Data dataType;
/*     */     private String txt;
/*     */     private int size;
/*     */     private int min_width;
/*     */     private int dp;
/*     */     private boolean left_aligned;
/* 449 */     private char pad = ' ';
/*     */     private boolean hash;
/* 451 */     private DecimalFormat format = new DecimalFormat();
/*     */     private char conversion;
/*     */     
/*     */     private Elem()
/*     */     {
/* 456 */       this.size = 4;
/* 457 */       this.min_width = 0;
/* 458 */       this.left_aligned = false;
/* 459 */       this.fmt = 100;
/* 460 */       this.dataType = Formatf.Data.INT;
/*     */     }
/*     */     
/*     */     private Elem(String txt)
/*     */     {
/* 465 */       this.fmt = 115;
/* 466 */       this.dataType = Formatf.Data.LITERAL;
/* 467 */       this.txt = txt;
/*     */     }
/*     */     
/*     */     public int getFmt()
/*     */     {
/* 472 */       return this.fmt;
/*     */     }
/*     */     
/*     */     public boolean hasArgument() {
/* 476 */       return this.dataType != Formatf.Data.LITERAL;
/*     */     }
/*     */     
/*     */     public Formatf.Data getDataType() {
/* 480 */       return this.dataType;
/*     */     }
/*     */     
/*     */     public String getTxt() {
/* 484 */       return this.txt;
/*     */     }
/*     */     
/*     */     public StringBuilder append(StringBuilder dest, Object arg) {
/* 488 */       switch (Formatf.1.$SwitchMap$com$emt$proteus$lib$utils$Formatf$Data[this.dataType.ordinal()]) {
/*     */       case 1: 
/* 490 */         return append(dest, String.valueOf(arg));
/*     */       case 2: 
/* 492 */         return append(dest, String.valueOf((char)((Number)arg).intValue()));
/*     */       case 3: 
/* 494 */         return append(dest, ((Number)arg).intValue());
/*     */       case 4: 
/* 496 */         return append(dest, ((Number)arg).longValue());
/*     */       case 5: 
/* 498 */         return append(dest, ((Number)arg).floatValue());
/*     */       case 6: 
/* 500 */         return append(dest, ((Number)arg).doubleValue());
/*     */       case 7: 
/* 502 */         return append(dest);
/*     */       }
/* 504 */       return dest;
/*     */     }
/*     */     
/*     */     public StringBuilder append(StringBuilder dest, String arg) {
/* 508 */       if (arg == null) {
/* 509 */         arg = "(null)";
/*     */       }
/* 511 */       int len = arg.length();
/* 512 */       int padding = this.min_width - len;
/* 513 */       if (!this.left_aligned) {
/* 514 */         for (int i = 0; i < padding; i++) dest.append(this.pad);
/*     */       }
/* 516 */       dest.append(arg);
/* 517 */       if (this.left_aligned) {
/* 518 */         for (int i = 0; i < padding; i++) dest.append(this.pad);
/*     */       }
/* 520 */       return dest;
/*     */     }
/*     */     
/*     */     public StringBuilder append(StringBuilder dest) {
/* 524 */       return append(dest, this.txt);
/*     */     }
/*     */     
/*     */     public StringBuilder append(StringBuilder dest, float arg) {
/* 528 */       return append(dest, this.min_width, this.dp, arg);
/*     */     }
/*     */     
/* 531 */     public StringBuilder append(StringBuilder dest, int width, int dp, float arg) { return append(dest, width, dp, Utils.toDouble(arg)); }
/*     */     
/*     */ 
/*     */ 
/* 535 */     public StringBuilder append(StringBuilder dest, double arg) { return append(dest, this.min_width, this.dp, arg); }
/*     */     
/*     */     public StringBuilder append(StringBuilder dest, int width, int dp, double arg) { String sval;
/*     */       String sval;
/* 539 */       if (dp > 0) {
/* 540 */         sval = String.format("%" + width + "." + dp + this.conversion, new Object[] { Double.valueOf(arg) });
/*     */       } else {
/* 542 */         sval = String.format("%" + width + this.conversion, new Object[] { Double.valueOf(arg) });
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 553 */       int pad = width - sval.length();
/* 554 */       for (int i = 0; i < pad; i++) {
/* 555 */         dest.append(pad);
/*     */       }
/* 557 */       return append(dest, sval);
/*     */     }
/*     */     
/*     */     public StringBuilder append(StringBuilder dest, int arg)
/*     */     {
/* 562 */       char chr = (char)this.fmt;
/* 563 */       String sval; switch (this.fmt) {
/*     */       default: 
/* 565 */         sval = Integer.toString(arg);
/* 566 */         break;
/*     */       case 99: 
/* 568 */         dest.append((char)arg);
/* 569 */         sval = "";
/* 570 */         break;
/*     */       case 117: 
/* 572 */         sval = Long.toString(arg & 0xFFFFFFFF);
/* 573 */         break;
/*     */       case 88: 
/*     */       case 112: 
/*     */       case 120: 
/* 577 */         if (this.hash) {
/* 578 */           dest.append("0").append('x');
/*     */         }
/* 580 */         sval = Integer.toHexString(arg);
/*     */       }
/*     */       
/* 583 */       return append(dest, sval);
/*     */     }
/*     */     
/*     */     public String toString() {
/* 587 */       return this.dataType + " " + this.size;
/*     */     }
/*     */     
/*     */     public int getRadix() {
/* 591 */       switch (this.fmt) {
/*     */       default: 
/* 593 */         return 10;
/*     */       }
/*     */       
/*     */       
/* 597 */       return 16;
/*     */     }
/*     */     
/*     */     public boolean isHexFormat() {
/* 601 */       switch (this.fmt) {
/*     */       default: 
/* 603 */         return false;
/*     */       }
/*     */       
/*     */       
/* 607 */       return true;
/*     */     }
/*     */     
/*     */     public StringBuilder append(StringBuilder dest, long arg)
/*     */     {
/*     */       String sval;
/* 613 */       switch (this.fmt) {
/*     */       case 117: 
/*     */       default: 
/* 616 */         sval = Long.toString(arg);
/* 617 */         break;
/*     */       case 99: 
/* 619 */         sval = String.valueOf((char)(int)arg);
/* 620 */         break;
/*     */       case 88: 
/*     */       case 112: 
/*     */       case 120: 
/* 624 */         if (this.hash) {
/* 625 */           dest.append("0").append((char)this.fmt);
/*     */         }
/* 627 */         sval = Long.toHexString(arg);
/*     */       }
/*     */       
/* 630 */       return append(dest, sval);
/*     */     }
/*     */     
/*     */     public int getMinWidth() {
/* 634 */       return this.min_width;
/*     */     }
/*     */     
/*     */     public String read(CharSource source) {
/* 638 */       StringBuilder b = new StringBuilder();
/* 639 */       scanAppend(source, b);
/* 640 */       return b.toString();
/*     */     }
/*     */     
/*     */     public int scanAppend(CharSource source, StringBuilder dest) {
/* 644 */       int count = 0;
/* 645 */       switch (Formatf.1.$SwitchMap$com$emt$proteus$lib$utils$Formatf$Data[this.dataType.ordinal()]) {
/*     */       case 7: 
/* 647 */         int length = this.txt.length();
/* 648 */         for (int j = 0; j < length; j++) {
/* 649 */           if (source.next() != this.txt.charAt(j)) {
/* 650 */             return 0;
/*     */           }
/*     */         }
/* 653 */         dest.append(this.txt);
/* 654 */         return length;
/*     */       case 2: 
/* 656 */         int amount = this.min_width;
/* 657 */         while (amount > 0) {
/* 658 */           int next = source.next();
/* 659 */           amount--;
/* 660 */           dest.append((char)next);
/*     */         }
/* 662 */         return this.min_width;
/*     */       case 1: 
/*     */         for (;;) {
/* 665 */           int next = source.next();
/* 666 */           if (next < 33) {
/* 667 */             source.pushback();
/* 668 */             return count;
/*     */           }
/* 670 */           count++;
/* 671 */           dest.append((char)next);
/*     */         }
/*     */       case 3: 
/*     */       case 4: 
/* 675 */         switch (this.fmt) {
/*     */         case 88: 
/*     */         case 112: 
/*     */         case 120: 
/* 679 */           return Formatf.scan_hex_digits(source, dest);
/*     */         }
/* 681 */         return Formatf.scan_digits(source, false, dest);
/*     */       
/*     */       case 5: 
/*     */       case 6: 
/* 685 */         return Formatf.scan_digits(source, true, dest);
/*     */       }
/* 687 */       throw new UnsupportedOperationException();
/*     */     }
/*     */     
/*     */     public int getWidth()
/*     */     {
/* 692 */       return this.min_width;
/*     */     }
/*     */     
/* 695 */     public int getDp() { return this.dp; }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 702 */     StringBuilder b = new StringBuilder();
/* 703 */     String string = "1.600000000000000E+01";
/* 704 */     CharSource.Str source = new CharSource.Str(string);
/* 705 */     int len = scan_digits(source, true, b);
/* 706 */     System.out.println(len + " " + string.length());
/* 707 */     System.out.println(string);
/* 708 */     System.out.println(b);
/*     */     
/*     */ 
/* 711 */     Formatf printf = parse("%06X,%4.3e,%lld,%c,%s###\n");
/* 712 */     String s = printf.format(new Object[] { Integer.valueOf(1), Double.valueOf(1.2D), Integer.valueOf(3), Integer.valueOf(67), "hhel" });
/* 713 */     System.out.println(s);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/Formatf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */