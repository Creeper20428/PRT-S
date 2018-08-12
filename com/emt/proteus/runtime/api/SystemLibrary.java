/*      */ package com.emt.proteus.runtime.api;
/*      */ 
/*      */ import com.emt.proteus.lib.utils.CharSource;
/*      */ import com.emt.proteus.lib.utils.CharSource.Str;
/*      */ import com.emt.proteus.lib.utils.Formatf;
/*      */ import com.emt.proteus.lib.utils.Formatf.Elem;
/*      */ import com.emt.proteus.lib.utils.Utils;
/*      */ import com.emt.proteus.runtime.lib.ExecVm;
/*      */ import com.emt.proteus.runtime.lib.MathLib;
/*      */ import com.emt.proteus.runtime.lib.TimeLib;
/*      */ import com.emt.proteus.runtime.lib.io.IoHandle;
/*      */ import com.emt.proteus.runtime.lib.io.IoLib;
/*      */ import com.emt.proteus.runtime.lib.io.IoSys;
/*      */ import com.emt.proteus.runtime.lib.stdcpp.Strings;
/*      */ import java.io.PrintStream;
/*      */ import java.rmi.server.UID;
/*      */ import java.util.Random;
/*      */ import java.util.logging.Logger;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class SystemLibrary
/*      */ {
/*   49 */   private static final Logger LOGGER = Logger.getLogger("SYSTEM");
/*      */   public static final int _SC_PAGESIZE = 4096;
/*   51 */   public static final int _PID = new UID().hashCode();
/*      */   private static final int FALSE = 0;
/*      */   private static final int TRUE = 1;
/*   54 */   private static int limit = 1024;
/*      */   
/*      */   private static final String ERRORNO = "errorno";
/*      */   
/*      */   private static final String ERRMSG = "_errormsg";
/*   59 */   public static final String[] ERRORS = { "General Error message", "I don't know." };
/*      */   
/*      */ 
/*      */   private static Env the_env;
/*      */   
/*      */   private static Function[] functions;
/*      */   
/*   66 */   private static StringBuilder _FORMAT = new StringBuilder();
/*      */   private static final long MILLION = 1000000L;
/*      */   private static final long THOUSAND = 1000L;
/*   69 */   private static final Random _RANDOM = new Random();
/*      */   private static int tokens;
/*      */   
/*   72 */   public static void install(Env env) { the_env = env;
/*   73 */     start();
/*   74 */     IoLib.install(env);
/*      */   }
/*      */   
/*      */   public static void postInstall(Env env)
/*      */   {
/*   79 */     functions = env.getFunctions();
/*      */   }
/*      */   
/*      */   public static void start() {
/*   83 */     MainMemory.setI32Aligned(36, 9984);
/*   84 */     MainMemory.setI32Aligned(32, 8704);
/*   85 */     for (int i = 0; i < 256; i++) {
/*   86 */       char upper = Character.toUpperCase((char)i);
/*   87 */       short attr = (short)com.emt.proteus.runtime.lib.CtypeLib._CTYPE_B_LOC_16BIT[i];
/*   88 */       MainMemory.setI32(8704 + i * 4, upper);
/*   89 */       MainMemory.setI16(9984 + i * 2, attr);
/*   90 */       if (i >= 128) {
/*   91 */         int negative = i - 256;
/*   92 */         MainMemory.setI32(8704 + negative * 4, upper);
/*   93 */         MainMemory.setI16(9984 + negative * 2, attr);
/*      */       }
/*      */     }
/*      */     
/*   97 */     MainMemory.setString(192, "");
/*   98 */     for (int i = 0; i < 10; i++) {
/*   99 */       MainMemory.setI32(194, 192);
/*      */     }
/*  101 */     MainMemory.setString(194, ".");
/*  102 */     MainMemory.setI32(128, 194);
/*  103 */     MainMemory.setString(256, "General Error Message", true);
/*  104 */     MainMemory.setI32Aligned(12, 0);
/*  105 */     MainMemory.setI32Aligned(20, 1);
/*  106 */     MainMemory.setI32Aligned(16, 1);
/*  107 */     MainMemory.setI32Aligned(28, 0);
/*  108 */     MainMemory.setI32Aligned(24, 0);
/*  109 */     IoLib.start();
/*  110 */     Strings.start();
/*      */   }
/*      */   
/*      */   public static void abort()
/*      */   {
/*  115 */     System.exit(0);
/*      */   }
/*      */   
/*      */   public static void exit(int i_0) {
/*  119 */     System.exit(i_0);
/*      */   }
/*      */   
/*      */   public static void exit() {
/*  123 */     System.exit(0);
/*      */   }
/*      */   
/*      */   public static int getcwd(int pbyte_0, int i_1) {
/*  127 */     String path = IoSys.getCwdPath();
/*  128 */     if (path.length() < i_1) {
/*  129 */       MainMemory.setString(pbyte_0, path);
/*  130 */       return pbyte_0;
/*      */     }
/*  132 */     MainMemory.setI32(-2147483602, -1);
/*  133 */     return 0;
/*      */   }
/*      */   
/*      */   public static int getenv(int pbyte_0)
/*      */   {
/*  138 */     String name = MainMemory.getString(pbyte_0);
/*  139 */     return the_env.getAddress(name);
/*      */   }
/*      */   
/*      */   public static int scanf(int pFormat, int... addresses)
/*      */   {
/*  144 */     String fmt = MainMemory.getString(pFormat);
/*  145 */     Formatf printf = Formatf.parse(fmt);
/*  146 */     return scan(printf, IoLib.getStdIn().getCharSource(), addresses);
/*      */   }
/*      */   
/*      */   public static int sscanf(int pString, int pFormat, int... addresses) {
/*  150 */     String src = MainMemory.getString(pString);
/*  151 */     String fmt = MainMemory.getString(pFormat);
/*  152 */     Formatf printf = Formatf.parse(fmt);
/*  153 */     return scan(printf, new CharSource.Str(src), addresses);
/*      */   }
/*      */   
/*      */   public static int fscanf(int pstruct$FILE_0, int pbyte_1, int... var_args) {
/*  157 */     return IoLib.fscanf(pstruct$FILE_0, pbyte_1, var_args);
/*      */   }
/*      */   
/*      */   public static int sprint(int addr, String str)
/*      */   {
/*  162 */     return MainMemory.setString(addr, str);
/*      */   }
/*      */   
/*      */   public static int snprint(int addr, String str, int limit) {
/*  166 */     return MainMemory.setString(addr, Utils.truncate(str, limit));
/*      */   }
/*      */   
/*      */   public static int getpagesize() {
/*  170 */     return 4096;
/*      */   }
/*      */   
/*      */   public static int getpid() {
/*  174 */     return _PID;
/*      */   }
/*      */   
/*      */   public static int isalpha(int i_0) {
/*  178 */     return Character.isLetter((char)i_0) ? 1 : 0;
/*      */   }
/*      */   
/*      */   public static int isprint(int i_0) {
/*  182 */     return (i_0 >= 32) && (i_0 <= 127) ? 1 : 0;
/*      */   }
/*      */   
/*      */   public static int isspace(int i_0) {
/*  186 */     switch (i_0) {
/*      */     case 9: 
/*      */     case 10: 
/*      */     case 12: 
/*      */     case 13: 
/*      */     case 32: 
/*  192 */       return 1;
/*      */     }
/*  194 */     return 0;
/*      */   }
/*      */   
/*      */   public static short bswapShort(short s_0)
/*      */   {
/*  199 */     return (short)((s_0 & 0xFF) << 8 | s_0 >>> 8);
/*      */   }
/*      */   
/*      */   public static int bswapInt(int i_0) {
/*  203 */     int b1 = i_0 >> 24 & 0xFF;
/*  204 */     int b2 = i_0 >> 8 & 0xFF00;
/*  205 */     int b3 = i_0 << 8 & 0xFF0000;
/*  206 */     int b4 = i_0 << 24 & 0xFF000000;
/*  207 */     return b1 | b2 | b3 | b4;
/*      */   }
/*      */   
/*      */   public static int doThrowable() {
/*  211 */     throw new UnsupportedOperationException("eh.exception");
/*      */   }
/*      */   
/*      */   public static int checkThrowable(int pbyte_0, int pbyte_1, int... var_args) {
/*  215 */     throw new UnsupportedOperationException("eh.selector");
/*      */   }
/*      */   
/*      */   public static int notImplemented() {
/*  219 */     throw new UnsupportedOperationException();
/*      */   }
/*      */   
/*      */   public static int vargs_start(int args) {
/*  223 */     throw new UnsupportedOperationException();
/*      */   }
/*      */   
/*      */   public static int vargs_end(int args) {
/*  227 */     throw new UnsupportedOperationException();
/*      */   }
/*      */   
/*  230 */   public static int wait(int args) { throw new UnsupportedOperationException(); }
/*      */   
/*      */ 
/*      */   public static int setlocale(int category, int p_locale_string)
/*      */   {
/*  235 */     return 0;
/*      */   }
/*      */   
/*      */   public static int signal(int st, int p_function) {
/*  239 */     int address = p_function;
/*  240 */     LOGGER.info(String.format("Registering Signal Handler for %d : %06X", new Object[] { Integer.valueOf(st), Integer.valueOf(address) }));
/*  241 */     return 0;
/*      */   }
/*      */   
/*      */   public static int atoi(int pbyte_0) {
/*  245 */     return (int)atoll(pbyte_0);
/*      */   }
/*      */   
/*      */   public static int atol(int pbyte_0) {
/*  249 */     return (int)atoll(pbyte_0);
/*      */   }
/*      */   
/*      */   public static long atoll(int pbyte_0) {
/*  253 */     String s = MainMemory.getIntegerString(pbyte_0);
/*  254 */     return Long.parseLong(s);
/*      */   }
/*      */   
/*      */   public static double atof(int pbyte_0) {
/*  258 */     return strtod(pbyte_0, 0);
/*      */   }
/*      */   
/*      */   public static float atoff(int pbyte_0) {
/*  262 */     return (float)atof(pbyte_0);
/*      */   }
/*      */   
/*      */   public static int strcmp(int pbyte_0, int pbyte_1) {
/*  266 */     String one = MainMemory.getString(pbyte_0);
/*  267 */     String two = MainMemory.getString(pbyte_1);
/*  268 */     return one.compareTo(two);
/*      */   }
/*      */   
/*      */   public static int strerror(int i_0) {
/*  272 */     int unsigned = Math.abs(i_0);
/*  273 */     if (unsigned > ERRORS.length) unsigned = 0;
/*  274 */     MainMemory.setString(256, ERRORS[unsigned]);
/*  275 */     return 256;
/*      */   }
/*      */   
/*      */   public static int strncmp(int pbyte_0, int pbyte_1, int i_2) {
/*  279 */     String one = MainMemory.getString(pbyte_0);
/*  280 */     String two = MainMemory.getString(pbyte_1);
/*  281 */     int onelen = one.length();
/*  282 */     int twolen = two.length();
/*  283 */     for (int i = 0; i < i_2; i++) {
/*  284 */       char chone = onelen > i ? one.charAt(i) : '\000';
/*  285 */       char chtwo = twolen > i ? two.charAt(i) : '\000';
/*  286 */       int dif = chone - chtwo;
/*  287 */       if (dif != 0) {
/*  288 */         return dif;
/*      */       }
/*      */     }
/*  291 */     return 0;
/*      */   }
/*      */   
/*      */   public static int strcasecmp(int pbyte_0, int pbyte_1) {
/*  295 */     String one = MainMemory.getString(pbyte_0);
/*  296 */     String two = MainMemory.getString(pbyte_1);
/*  297 */     one = one.toLowerCase();
/*  298 */     two = two.toLowerCase();
/*  299 */     return one.compareTo(two);
/*      */   }
/*      */   
/*      */   public static int strncasecmp(int charStar1, int charStar2, int limit) {
/*  303 */     String one = MainMemory.getString(charStar1).toLowerCase();
/*  304 */     String two = MainMemory.getString(charStar2).toLowerCase();
/*  305 */     int onelen = one.length();
/*  306 */     int twolen = two.length();
/*  307 */     for (int i = 0; i < limit; i++) {
/*  308 */       char chone = onelen > i ? one.charAt(i) : '\000';
/*  309 */       char chtwo = twolen > i ? two.charAt(i) : '\000';
/*  310 */       if (chone > chtwo)
/*  311 */         return 1;
/*  312 */       if (chone < chtwo) {
/*  313 */         return -1;
/*      */       }
/*      */     }
/*  316 */     return 0;
/*      */   }
/*      */   
/*      */   public static int strchr(int p_str, int _char) {
/*  320 */     return MainMemory.first(p_str, _char);
/*      */   }
/*      */   
/*      */   public static int strrchr(int p_str, int _char) {
/*  324 */     return MainMemory.last(p_str, _char);
/*      */   }
/*      */   
/*      */   public static int strstr(int pbyte_0, int pbyte_1) {
/*  328 */     String haystack = MainMemory.getString(pbyte_0);
/*  329 */     String needle = MainMemory.getString(pbyte_1);
/*  330 */     int idx = haystack.indexOf(needle);
/*  331 */     if (idx < 0) {
/*  332 */       return 0;
/*      */     }
/*  334 */     return idx + pbyte_0;
/*      */   }
/*      */   
/*      */ 
/*      */   private static int result;
/*      */   
/*      */   public static int strtok(int p_token_str, int p_delim_str)
/*      */   {
/*  342 */     String delims = MainMemory.getString(p_delim_str);
/*  343 */     if (p_token_str != 0) {
/*  344 */       tokens = p_token_str;
/*      */     }
/*      */     
/*  347 */     result = 0;
/*  348 */     int chr; while (((chr = MainMemory.getByte(tokens)) != 0) && (delims.indexOf(chr) >= 0)) tokens += 1;
/*  349 */     result = tokens;
/*  350 */     while (((chr = MainMemory.getByte(tokens)) != 0) && (delims.indexOf(chr) < 0)) tokens += 1;
/*  351 */     if (MainMemory.getByte(tokens) != 0) {
/*  352 */       MainMemory.setI8(tokens, (byte)0);
/*  353 */       tokens += 1;
/*      */     }
/*  355 */     if (MainMemory.getByte(result) == 0) {
/*  356 */       result = 0;
/*      */     }
/*  358 */     return result;
/*      */   }
/*      */   
/*      */   public static float strtof(int src_addr, int next)
/*      */   {
/*  363 */     return (float)strtod(src_addr, next);
/*      */   }
/*      */   
/*      */   public static double strtod(int src_addr, int next) {
/*  367 */     int initial_addr = src_addr;
/*  368 */     src_addr = MainMemory.skipwhitespace(src_addr);
/*  369 */     int chr = MainMemory.getByte(src_addr);
/*  370 */     boolean positive = true;
/*  371 */     if (chr == 43) {
/*  372 */       src_addr++;
/*  373 */       chr = MainMemory.getByte(src_addr);
/*  374 */     } else if (chr == 45) {
/*  375 */       src_addr++;
/*  376 */       chr = MainMemory.getByte(src_addr);
/*  377 */       positive = false;
/*      */     }
/*      */     
/*  380 */     int next_addr = initial_addr;
/*      */     try { int matched;
/*      */       double d1;
/*  383 */       switch (chr) {
/*      */       case 78: 
/*      */       case 110: 
/*  386 */         matched = match(src_addr, "NAN");
/*  387 */         if (matched != 3) {
/*  388 */           next_addr = initial_addr;
/*  389 */           return 0.0D;
/*      */         }
/*  391 */         next_addr = src_addr + matched;
/*  392 */         src_addr = next_addr;
/*  393 */         if (MainMemory.getByte(src_addr) == 60) {
/*  394 */           System.out.println("Need to read hex digits!!");
/*  395 */           while (MainMemory.getByte(src_addr) != 62) {
/*  396 */             src_addr++;
/*      */           }
/*  398 */           next_addr = src_addr;
/*      */         }
/*      */         
/*  401 */         return NaN.0D;
/*      */       case 73: 
/*      */       case 105: 
/*  404 */         matched = match(src_addr, "INFINITY");
/*  405 */         if ((matched == 3) || (matched == 8))
/*      */         {
/*  407 */           next_addr = src_addr + matched;
/*  408 */           return positive ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
/*      */         }
/*  410 */         next_addr = initial_addr;
/*  411 */         return 0.0D;
/*      */       
/*      */       case 48: 
/*  414 */         if (MainMemory.getChar(src_addr + 1) == 'x') {
/*  415 */           next_addr = 0;
/*  416 */           throw new UnsupportedOperationException("Not written hex parsing yet");
/*      */         }
/*      */         break; }
/*  419 */       StringBuilder b = new StringBuilder();
/*  420 */       next_addr = MainMemory.appendDecimalString(initial_addr, b);
/*  421 */       String str = b.toString();
/*  422 */       return Double.parseDouble(str);
/*      */     }
/*      */     finally {
/*  425 */       if (next != 0)
/*  426 */         MainMemory.setI32(next, next_addr);
/*      */     }
/*      */   }
/*      */   
/*      */   public static int strtol(int src_addr, int next, int radix) {
/*  431 */     return (int)strtoll(src_addr, next, radix);
/*      */   }
/*      */   
/*      */   public static int strtoul(int src_addr, int next, int radix) {
/*  435 */     return (int)strtoll(src_addr, next, radix);
/*      */   }
/*      */   
/*      */   public static long strtoull(int src_addr, int next, int radix) {
/*  439 */     return strtoll(src_addr, next, radix);
/*      */   }
/*      */   
/*      */   public static long strtoll(int src_addr, int next, int radix) {
/*  443 */     src_addr = MainMemory.skipwhitespace(src_addr);
/*  444 */     StringBuilder b = new StringBuilder();
/*  445 */     src_addr = MainMemory.getNumericString(src_addr, radix, b);
/*      */     
/*  447 */     if (next != 0) {
/*  448 */       MainMemory.setI32(next, src_addr);
/*      */     }
/*      */     String to_parse;
/*      */     String to_parse;
/*  452 */     if (radix == 0) { String to_parse;
/*  453 */       if (b.charAt(0) == 'h') {
/*  454 */         radix = 16;
/*  455 */         to_parse = b.substring(1);
/*      */       } else {
/*  457 */         radix = 10;
/*  458 */         to_parse = b.toString();
/*      */       }
/*      */     } else {
/*  461 */       to_parse = b.toString();
/*      */     }
/*      */     try {
/*  464 */       return Long.parseLong(to_parse, radix);
/*      */     } catch (NumberFormatException nfe) {
/*  466 */       int length = to_parse.length();
/*  467 */       if ((radix == 16) && (length == 16))
/*      */       {
/*      */ 
/*  470 */         return Utils.parseHex(to_parse);
/*      */       }
/*  472 */       nfe.printStackTrace();
/*  473 */       throw nfe;
/*      */     }
/*      */   }
/*      */   
/*      */   public static int usleep(int usec) {
/*  478 */     long nanos = usec * 1000L;
/*  479 */     long millis = nanos / 1000000L;
/*  480 */     nanos %= 1000000L;
/*      */     try {
/*  482 */       Thread.sleep(millis, (int)nanos);
/*      */     }
/*      */     catch (InterruptedException e) {}
/*  485 */     return 0;
/*      */   }
/*      */   
/*      */   public static int _setjmp(int pstruct$__jmp_buf_tag_0)
/*      */   {
/*  490 */     return ExecVm._setjmp(pstruct$__jmp_buf_tag_0);
/*      */   }
/*      */   
/*      */   public static void longjmp(int jmp_buf_ptr, int returnValue) {
/*  494 */     ExecVm.longjmp(jmp_buf_ptr, returnValue);
/*      */   }
/*      */   
/*      */   public static int __errno_location() {
/*  498 */     return 4;
/*      */   }
/*      */   
/*      */   public static int __cxa_atexit(int p_func_0, int pbyte_1, int pbyte_2) {
/*  502 */     return 0;
/*      */   }
/*      */   
/*      */   public static int __cxa_atexit(int p_func_0) {
/*  506 */     return 0;
/*      */   }
/*      */   
/*      */   public static int __cxa_guard_acquire(int plong_0) {
/*  510 */     return MainMemory.getI32Aligned(plong_0) ^ 0xFFFFFFFF;
/*      */   }
/*      */   
/*      */   public static void __cxa_guard_release(int plong_0) {
/*  514 */     MainMemory.setI32Aligned(plong_0, -1);
/*      */   }
/*      */   
/*      */   public static void _Unwind_Resume_or_Rethrow(int pbyte_0) {
/*  518 */     throw new UnsupportedOperationException("_Unwind_Resume_or_Rethrow");
/*      */   }
/*      */   
/*      */   public static void __assert_fail(int pbyte_0, int pbyte_1, int i_2, int pbyte_3) {
/*  522 */     throw new IllegalStateException("Assertion failed " + MainMemory.getString(pbyte_0));
/*      */   }
/*      */   
/*      */   public static void __cxa_pure_virtual() {
/*  526 */     throw new UnsupportedOperationException("__cxa_pure_virtual");
/*      */   }
/*      */   
/*      */   public static int __gxx_personality_v0(int[] var_args) {
/*  530 */     throw new UnsupportedOperationException("__gxx_personality_v0");
/*      */   }
/*      */   
/*      */   public static void memset(int a, byte b, int c, int d) {
/*  534 */     MainMemory.memset(a, c, b, d);
/*      */   }
/*      */   
/*      */   public static void memset_long_addr(int a, byte b, long c, int d) {
/*  538 */     MainMemory.memset(a, (int)c, b, d);
/*      */   }
/*      */   
/*      */   public static void memcpy(int dst$, int src$, int amount, int align) {
/*  542 */     MainMemory.memcpy(dst$, src$, amount, align);
/*      */   }
/*      */   
/*      */   public static void memcpy_long_addr(int a, int b, long c, int d) {
/*  546 */     MainMemory.memcpy(a, b, (int)c, d);
/*      */   }
/*      */   
/*      */   public static void memmove(int dst$, int src$, int amount, int alignment) {
/*  550 */     MainMemory.memmove(dst$, src$, amount, alignment);
/*      */   }
/*      */   
/*      */   public static void memmove_long_addr(int a, int b, long c, int d) {
/*  554 */     MainMemory.memmove(a, b, (int)c, d);
/*      */   }
/*      */   
/*      */   public static int memcmp(int ptr1, int ptr2, int len) {
/*  558 */     return MainMemory.memcmp(ptr1, ptr2, len);
/*      */   }
/*      */   
/*      */   public static int newarray(int a) {
/*  562 */     return MainMemory.new_array(a, null);
/*      */   }
/*      */   
/*      */   public static void free(int a)
/*      */   {
/*  567 */     MainMemory.free(a);
/*      */   }
/*      */   
/*      */   public static int malloc(int amount) {
/*  571 */     return MainMemory.malloc(amount, null);
/*      */   }
/*      */   
/*      */   public static int realloc(int ptr, int amount) {
/*  575 */     return MainMemory.realloc(ptr, amount);
/*      */   }
/*      */   
/*      */   public static int calloc(int size, int count) {
/*  579 */     return MainMemory.calloc(size, count);
/*      */   }
/*      */   
/*      */   public static int newobject(int a) {
/*  583 */     return MainMemory._new_(a, null);
/*      */   }
/*      */   
/*  586 */   public static int newobject(int a, int nothrow) { return MainMemory._new_(a, null); }
/*      */   
/*      */ 
/*      */   public static void deletearray(int a)
/*      */   {
/*  591 */     MainMemory.delete_array(a);
/*      */   }
/*      */   
/*      */   public static void delete(int a) {
/*  595 */     MainMemory.delete(a);
/*      */   }
/*      */   
/*      */   public static void delete(int ptr$, int nothrow) {
/*  599 */     delete(ptr$);
/*      */   }
/*      */   
/*      */   public static int fclose(int struct) {
/*  603 */     return IoLib.fclose(struct);
/*      */   }
/*      */   
/*      */   public static int close(int struct) {
/*  607 */     return IoLib.close(struct);
/*      */   }
/*      */   
/*      */   public static int fstat(int fd, int struct) {
/*  611 */     return IoLib.fstat(fd, struct);
/*      */   }
/*      */   
/*      */   public static int stat(int path, int struct) {
/*  615 */     return IoLib.stat(path, struct);
/*      */   }
/*      */   
/*  618 */   public static int fstat64(int fd, int struct) { return IoLib.fstat64(fd, struct); }
/*      */   
/*      */   public static int stat64(int path, int struct)
/*      */   {
/*  622 */     return IoLib.stat64(path, struct);
/*      */   }
/*      */   
/*      */   public static int fopen(int path, int mode) {
/*  626 */     return IoLib.fopen(path, mode);
/*      */   }
/*      */   
/*  629 */   public static int dup2(int fildes, int fildes2) { throw new UnsupportedOperationException("dup2"); }
/*      */   
/*      */   public static int open(int path, int mode, int... args)
/*      */   {
/*  633 */     return IoLib.open(path, mode, args);
/*      */   }
/*      */   
/*      */   public static int feof(int struct) {
/*  637 */     return IoLib.feof(struct);
/*      */   }
/*      */   
/*      */   public static int ferror(int struct) {
/*  641 */     return IoLib.ferror(struct);
/*      */   }
/*      */   
/*      */   public static int fgets(int ptr, int i, int struct) {
/*  645 */     return IoLib.fgets(ptr, i, struct);
/*      */   }
/*      */   
/*      */   public static long ftello(int struct) {
/*  649 */     return IoLib.ftello(struct);
/*      */   }
/*      */   
/*      */   public static long ftello64(int struct) {
/*  653 */     return IoLib.ftello(struct);
/*      */   }
/*      */   
/*      */   public static void clearerr(int struct) {
/*  657 */     IoLib.clearerr(struct);
/*      */   }
/*      */   
/*      */   public static int fgetc(int struct) {
/*  661 */     return IoLib.fgetc(struct);
/*      */   }
/*      */   
/*      */   public static int fputs(int ptr, int struct) {
/*  665 */     return IoLib.fputs(ptr, struct);
/*      */   }
/*      */   
/*      */   public static int fputc(int chr, int struct) {
/*  669 */     return IoLib.fputc(chr, struct);
/*      */   }
/*      */   
/*      */   public static int fflush(int struct) {
/*  673 */     return IoLib.fflush(struct);
/*      */   }
/*      */   
/*      */   public static int putchar(int chr) {
/*  677 */     return IoLib.print((char)chr);
/*      */   }
/*      */   
/*      */   public static int fwrite(int ptr, int size, int count, int struct) {
/*  681 */     return IoLib.fwrite(ptr, size, count, struct);
/*      */   }
/*      */   
/*      */   public static int write(int fd, int ptr, int len) {
/*  685 */     return IoLib.write(fd, ptr, len);
/*      */   }
/*      */   
/*      */   public static int fread(int ptr, int size, int count, int pstruct) {
/*  689 */     return IoLib.fread(ptr, size, count, pstruct);
/*      */   }
/*      */   
/*      */   public static int unlink(int ptr) {
/*  693 */     return IoLib.unlink(ptr);
/*      */   }
/*      */   
/*      */   public static int mkstemp(int ptr) {
/*  697 */     return IoLib.mkstemp(ptr);
/*      */   }
/*      */   
/*      */   public static int mmap(int p_start, int length, int prot, int flags, int fd, long offset) {
/*  701 */     return IoLib.mmap(p_start, length, prot, flags, fd, offset);
/*      */   }
/*      */   
/*      */   public static int msync(int p_start, int length, int flags)
/*      */   {
/*  706 */     return IoLib.msync(p_start, length, flags);
/*      */   }
/*      */   
/*      */   public static int munmap(int p_start, int length) {
/*  710 */     return munmap(p_start, length);
/*      */   }
/*      */   
/*      */   public static int select(int i_0, int pstruct$__sigset_t_1, int pstruct$__sigset_t_2, int pstruct$__sigset_t_3, int pstruct$$0$_155_4)
/*      */   {
/*  715 */     return IoLib.select(i_0, pstruct$__sigset_t_1, pstruct$__sigset_t_2, pstruct$__sigset_t_3, pstruct$$0$_155_4);
/*      */   }
/*      */   
/*      */   public static int read(int a, int b, int c)
/*      */   {
/*  720 */     return IoLib.read(a, b, c);
/*      */   }
/*      */   
/*      */   public static int lseek(int fd, long position, int whence) {
/*  724 */     return (int)IoLib.lseek(fd, position, whence);
/*      */   }
/*      */   
/*  727 */   public static long lseek64(int fd, long position, int whence) { return IoLib.lseek(fd, position, whence); }
/*      */   
/*      */   public static int fseek(int p_file, long position, int whence) {
/*  730 */     IoLib.fseek(p_file, position, whence);
/*  731 */     return 0;
/*      */   }
/*      */   
/*      */   public static int puts(int a) {
/*  735 */     return IoLib.puts(a);
/*      */   }
/*      */   
/*      */   public static int ioctl(int i1, int i2, int... i) {
/*  739 */     return IoLib.ioctl(i1, i2, i);
/*      */   }
/*      */   
/*      */   public static int fcntl(int i1, int i2, int... i) {
/*  743 */     return IoLib.fcntl(i1, i2, i);
/*      */   }
/*      */   
/*      */   public static short htons(short s) {
/*  747 */     return bswapShort(s);
/*      */   }
/*      */   
/*  750 */   public static short ntohs(short s) { return bswapShort(s); }
/*      */   
/*      */ 
/*      */ 
/*      */   public static int perror(int ptr)
/*      */   {
/*  756 */     return IoLib.perror(MainMemory.getString(ptr));
/*      */   }
/*      */   
/*      */   public static int printf(int pointer, Object... arg)
/*      */   {
/*  761 */     String formatted = format(MainMemory.getString(pointer), arg);
/*  762 */     return IoLib.getStdOut().print(formatted);
/*      */   }
/*      */   
/*      */   public static int sprintf(int dst, int pointer, Object... arg) {
/*  766 */     String formatted = format(MainMemory.getString(pointer), arg);
/*  767 */     return sprint(dst, formatted);
/*      */   }
/*      */   
/*      */   public static int snprintf(int dst, int pointer, int limit, Object... arg) {
/*  771 */     String formatted = nformat(MainMemory.getString(pointer), limit, arg);
/*  772 */     return sprint(dst, formatted);
/*      */   }
/*      */   
/*      */   public static int fprintf(int file_p, int str_p, Object... arg) {
/*  776 */     String formatted = format(MainMemory.getString(str_p), arg);
/*  777 */     return IoLib.fprint(file_p, formatted);
/*      */   }
/*      */   
/*      */   public static int vsprintf(int dst, int pointer, int va) {
/*  781 */     throw new UnsupportedOperationException();
/*      */   }
/*      */   
/*      */   public static int vsnprintf(int dst, int pointer, int va, int limit) {
/*  785 */     throw new UnsupportedOperationException();
/*      */   }
/*      */   
/*      */   public static int strcpy(int dst, int src) {
/*  789 */     return MainMemory.strcpy(dst, src);
/*      */   }
/*      */   
/*      */   public static int strncpy(int dst, int src, int max) {
/*  793 */     return MainMemory.strncpy(dst, src, max);
/*      */   }
/*      */   
/*      */   public static int strcat(int dst, int src) {
/*  797 */     return MainMemory.strcat(dst, src);
/*      */   }
/*      */   
/*      */   public static int strncat(int dst, int src, int max) {
/*  801 */     return MainMemory.strncat(dst, src, max);
/*      */   }
/*      */   
/*      */   public static int strlen(int str) {
/*  805 */     return MainMemory.strlen(str);
/*      */   }
/*      */   
/*      */   public static int strdup(int str) {
/*  809 */     return MainMemory.strdup(str);
/*      */   }
/*      */   
/*      */   public static int gettimeofday(int timeval, int timezone)
/*      */   {
/*  814 */     return TimeLib.gettimeofday(timeval, timezone);
/*      */   }
/*      */   
/*      */   public static int ctime(int p_int) {
/*  818 */     return TimeLib.ctime(p_int);
/*      */   }
/*      */   
/*  821 */   public static int asctime(int p_int) { return TimeLib.asctime(p_int); }
/*      */   
/*      */   public static int localtime(int p_time)
/*      */   {
/*  825 */     return TimeLib.localtime(p_time);
/*      */   }
/*      */   
/*  828 */   public static int localtime_r(int p_time, int struct$) { return TimeLib.localtime_r(p_time, struct$); }
/*      */   
/*      */   public static int time(int p_time)
/*      */   {
/*  832 */     return TimeLib.time(p_time);
/*      */   }
/*      */   
/*      */   public static int mktime(int struct) {
/*  836 */     return TimeLib.mktime(struct);
/*      */   }
/*      */   
/*      */   public static int gmtime(int p_int) {
/*  840 */     return TimeLib.gmtime(p_int);
/*      */   }
/*      */   
/*      */   public static Function getFunction(int fnid)
/*      */   {
/*  845 */     return functions[fnid];
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int... args) {
/*  849 */     return getFunction(fnid).execute(args);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0) {
/*  853 */     Function function = getFunction(fnid);
/*  854 */     return function.execute(arg0);
/*      */   }
/*      */   
/*  857 */   public static int do_indirect(int fnid, int this$, int addr, byte val) { Function function = getFunction(fnid);
/*  858 */     return function.execute(this$, addr, val);
/*      */   }
/*      */   
/*  861 */   public static int do_indirect(int fnid, int this$, long addr, byte val) { Function function = getFunction(fnid);
/*  862 */     return function.execute(this$, addr, val);
/*      */   }
/*      */   
/*  865 */   public static int do_indirect(int fnid, int this$, byte b1, byte b2) { Function function = getFunction(fnid);
/*  866 */     return function.execute(this$, b1, b2);
/*      */   }
/*      */   
/*  869 */   public static int do_indirect(int fnid, int this$, byte b1) { Function function = getFunction(fnid);
/*  870 */     return function.execute(this$, b1);
/*      */   }
/*      */   
/*  873 */   public static int do_indirect(int fnid, int in1, byte b2, long lon3, int in4) { Function function = getFunction(fnid);
/*  874 */     return function.execute(in1, b2, lon3, in4);
/*      */   }
/*      */   
/*  877 */   public static int do_indirect(int fnid, int in1, byte b2, int in3, int in4) { Function function = getFunction(fnid);
/*  878 */     return function.execute(in1, b2, in3, in4);
/*      */   }
/*      */   
/*  881 */   public static int do_indirect(int fnid, long lon, int in2, int in3, int in4) { Function function = getFunction(fnid);
/*  882 */     return function.execute(lon, in2, in3, in4);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1) {
/*      */     try {
/*  887 */       Function function = getFunction(fnid);
/*  888 */       return function.execute(arg0, arg1);
/*      */     } catch (ArrayIndexOutOfBoundsException aie) {
/*  890 */       switch (fnid) {
/*      */       case -2147483610: 
/*  892 */         return realloc(arg0, arg1); } }
/*  893 */     throw aie;
/*      */   }
/*      */   
/*      */ 
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2)
/*      */   {
/*  899 */     Function function = getFunction(fnid);
/*  900 */     return function.execute(arg0, arg1, arg2);
/*      */   }
/*      */   
/*  903 */   public static int do_indirect(int fnid, int arg0, byte arg1, int arg2) { Function function = getFunction(fnid);
/*  904 */     return function.execute(arg0, arg1, arg2);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2, int arg3) {
/*  908 */     Function function = getFunction(fnid);
/*  909 */     return function.execute(arg0, arg1, arg2, arg3);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2, int arg3, int arg4) {
/*  913 */     Function function = getFunction(fnid);
/*  914 */     return function.execute(arg0, arg1, arg2, arg3, arg4);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
/*  918 */     Function function = getFunction(fnid);
/*  919 */     return function.execute(arg0, arg1, arg2, arg3, arg4, arg5);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
/*  923 */     Function function = getFunction(fnid);
/*  924 */     return function.execute(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, double doub, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
/*  928 */     Function function = getFunction(fnid);
/*  929 */     return function.execute(doub, arg1, arg2, arg3, arg4, arg5, arg6);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
/*  933 */     Function function = getFunction(fnid);
/*  934 */     return function.execute(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
/*  938 */     Function function = getFunction(fnid);
/*  939 */     return function.execute(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
/*  943 */     Function function = getFunction(fnid);
/*  944 */     return function.execute(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
/*  948 */     Function function = getFunction(fnid);
/*  949 */     return function.execute(new int[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, long l1, long l2, int i3) {
/*  953 */     Function function = getFunction(fnid);
/*  954 */     return function.execute(l1, l2, i3);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int intArg, float floatArg) {
/*  958 */     Function function = getFunction(fnid);
/*  959 */     return function.execute(intArg, floatArg);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int i1, long lon) {
/*  963 */     Function function = getFunction(fnid);
/*  964 */     return function.execute(i1, lon);
/*      */   }
/*      */   
/*      */   public static int do_indirect(int fnid, int in1, int in2, long lon) {
/*  968 */     Function function = getFunction(fnid);
/*  969 */     return function.execute(in1, in2, lon);
/*      */   }
/*      */   
/*      */   public static long do_indirect_long(int fnid) {
/*  973 */     Function function = getFunction(fnid);
/*  974 */     return function.executeLong();
/*      */   }
/*      */   
/*      */   public static long do_indirect_long(int fnid, int _this) {
/*  978 */     Function function = getFunction(fnid);
/*  979 */     return function.executeLong(_this);
/*      */   }
/*      */   
/*      */   public static long do_indirect_long(int fnid, int arg1, long arg2, int arg3) {
/*  983 */     Function function = getFunction(fnid);
/*  984 */     return function.executeLong(arg1, arg2, arg3);
/*      */   }
/*      */   
/*      */   public static long do_indirect_long(int fnid, int... args) {
/*  988 */     Function function = getFunction(fnid);
/*  989 */     return function.executeLong(args);
/*      */   }
/*      */   
/*      */   public static long do_indirect_long(int fnid, int _this, int arg, long val) {
/*  993 */     Function function = getFunction(fnid);
/*  994 */     return function.executeLong(_this, arg, val);
/*      */   }
/*      */   
/*      */   public static void unwind() {
/*  998 */     throw new UnwindException();
/*      */   }
/*      */   
/*      */   public static int toupper(int a)
/*      */   {
/* 1003 */     return Character.toUpperCase((char)a);
/*      */   }
/*      */   
/*      */   public static int tolower(int a) {
/* 1007 */     return Character.toLowerCase((char)a);
/*      */   }
/*      */   
/*      */   public static String nformat(String fmt, int limit, Object... args) {
/* 1011 */     String r = format(fmt, args);
/* 1012 */     if (r.length() > limit) {
/* 1013 */       return r.substring(0, limit);
/*      */     }
/* 1015 */     return r;
/*      */   }
/*      */   
/*      */ 
/* 1019 */   public static String format(int fmtAddr, Object... args) { return format(MainMemory.getString(fmtAddr), new Object[0]); }
/*      */   
/*      */   public static String format(String fmt, Object... args) {
/* 1022 */     Formatf printf = Formatf.parse(fmt);
/* 1023 */     StringBuilder b = new StringBuilder();
/* 1024 */     int len = printf.getSize();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1030 */     int index = 0;
/* 1031 */     for (int i = 0; i < len; i++) {
/* 1032 */       Formatf.Elem elem = printf.get(i);
/* 1033 */       int width = elem.getWidth();
/* 1034 */       int dp = elem.getDp();
/* 1035 */       int val; switch (elem.getDataType()) {
/*      */       case LITERAL: 
/* 1037 */         elem.append(b);
/* 1038 */         break;
/*      */       case STRING: 
/* 1040 */         int address = ((Number)args[(index++)]).intValue();
/* 1041 */         String sval = MainMemory.getString(address);
/* 1042 */         elem.append(b, sval);
/* 1043 */         break;
/*      */       case CHAR: 
/* 1045 */         val = ((Number)args[(index++)]).intValue();
/* 1046 */         elem.append(b, (char)val);
/* 1047 */         break;
/*      */       case INT: 
/*      */       default: 
/* 1050 */         val = ((Number)args[(index++)]).intValue();
/* 1051 */         elem.append(b, val);
/* 1052 */         break;
/*      */       case LONG: 
/* 1054 */         long lval = ((Number)args[(index++)]).longValue();
/* 1055 */         elem.append(b, lval);
/* 1056 */         break;
/*      */       
/*      */       case FLOAT: 
/* 1059 */         float fval = ((Number)args[(index++)]).floatValue();
/* 1060 */         elem.append(b, fval);
/* 1061 */         break;
/*      */       case DOUBLE: 
/* 1063 */         if (width < 0) {
/* 1064 */           width = ((Number)args[(index++)]).intValue();
/*      */         }
/* 1066 */         if (dp < 0) {
/* 1067 */           dp = ((Number)args[(index++)]).intValue();
/*      */         }
/* 1069 */         double dval = ((Number)args[(index++)]).doubleValue();
/* 1070 */         elem.append(b, width, dp, dval);
/*      */       }
/*      */       
/*      */     }
/* 1074 */     return b.toString();
/*      */   }
/*      */   
/*      */   public static int scan(Formatf printf, CharSource src, int... addresses)
/*      */   {
/* 1079 */     int matched = 0;
/*      */     
/*      */ 
/*      */ 
/* 1083 */     String value = null;
/*      */     try {
/* 1085 */       int len = printf.getSize();
/* 1086 */       for (int i = 0; i < len; i++) {
/* 1087 */         Formatf.Elem elem = printf.get(i);
/* 1088 */         value = elem.read(src);
/* 1089 */         if (value.isEmpty()) return matched;
/* 1090 */         int address = addresses[matched];
/* 1091 */         double dvalue; switch (elem.getDataType()) {
/*      */         case LITERAL: 
/*      */           break;
/*      */         case CHAR: 
/* 1095 */           MainMemory.setString(address, value, false);
/* 1096 */           matched++;
/* 1097 */           break;
/*      */         case STRING: 
/* 1099 */           MainMemory.setString(address, value, true);
/* 1100 */           matched++;
/* 1101 */           break;
/*      */         case INT: 
/*      */         default: 
/* 1104 */           int ivalue = Integer.parseInt(value, elem.getRadix());
/* 1105 */           MainMemory.setI32(address, ivalue);
/* 1106 */           matched++;
/* 1107 */           break;
/*      */         case LONG: 
/* 1109 */           long lvalue = Long.parseLong(value, elem.getRadix());
/* 1110 */           MainMemory.setI64(address, lvalue);
/* 1111 */           matched++;
/* 1112 */           break;
/*      */         case FLOAT: 
/* 1114 */           dvalue = Double.parseDouble(value);
/* 1115 */           MainMemory.setF32(address, (float)dvalue);
/* 1116 */           matched++;
/* 1117 */           break;
/*      */         case DOUBLE: 
/* 1119 */           dvalue = Double.parseDouble(value);
/* 1120 */           MainMemory.setF64(address, dvalue);
/* 1121 */           matched++;
/*      */         }
/*      */         
/*      */       }
/*      */     }
/*      */     catch (NumberFormatException nfe) {}
/*      */     
/*      */ 
/* 1129 */     return matched;
/*      */   }
/*      */   
/*      */   public static int scan2(Formatf printf, CharSource src, int... addresses)
/*      */   {
/* 1134 */     int matched = 0;
/* 1135 */     _FORMAT.setLength(0);
/* 1136 */     int idx = 0;
/* 1137 */     int len = printf.getSize();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/* 1145 */       for (int i = 0; i < len; i++) {
/* 1146 */         Formatf.Elem elem = printf.get(i);
/* 1147 */         String sub; switch (elem.getDataType()) {
/*      */         case LITERAL: 
/* 1149 */           int txt = elem.getTxt().length();
/* 1150 */           src.skip(txt);
/* 1151 */           break;
/*      */         case STRING: 
/*      */         case CHAR: 
/* 1154 */           throw new IllegalArgumentException("Not yet done");
/*      */         case INT: 
/*      */         default: 
/* 1157 */           scan_digits(src, idx, false, _FORMAT);
/* 1158 */           sub = _FORMAT.toString();
/* 1159 */           int val = Integer.parseInt(sub);
/* 1160 */           MainMemory.setI32(addresses[(matched++)], val);
/* 1161 */           break;
/*      */         case LONG: 
/* 1163 */           scan_digits(src, idx, false, _FORMAT);
/* 1164 */           sub = _FORMAT.toString();
/* 1165 */           long lval = Long.parseLong(sub);
/* 1166 */           MainMemory.setI64(addresses[(matched++)], lval);
/* 1167 */           break;
/*      */         case FLOAT: 
/* 1169 */           scan_digits(src, idx, true, _FORMAT);
/* 1170 */           sub = _FORMAT.toString();
/* 1171 */           float fval = Float.parseFloat(sub);
/* 1172 */           MainMemory.setF32(addresses[(matched++)], fval);
/* 1173 */           break;
/*      */         case DOUBLE: 
/* 1175 */           scan_digits(src, idx, true, _FORMAT);
/* 1176 */           sub = _FORMAT.toString();
/* 1177 */           double dval = Double.parseDouble(sub);
/* 1178 */           MainMemory.setF64(addresses[(matched++)], dval);
/*      */         }
/*      */         
/*      */       }
/*      */     }
/*      */     catch (NumberFormatException nfe) {}
/*      */     
/* 1185 */     return matched;
/*      */   }
/*      */   
/*      */   private static int scan_digits(CharSequence source, int idx, boolean fp, StringBuilder dest)
/*      */   {
/* 1190 */     dest.setLength(0);
/* 1191 */     int length = source.length();
/* 1192 */     while (idx < length) {
/* 1193 */       char chr = source.charAt(idx++);
/* 1194 */       switch (chr) {
/*      */       case '0': 
/*      */       case '1': 
/*      */       case '2': 
/*      */       case '3': 
/*      */       case '4': 
/*      */       case '5': 
/*      */       case '6': 
/*      */       case '7': 
/*      */       case '8': 
/*      */       case '9': 
/* 1205 */         dest.append(chr);
/* 1206 */         break;
/*      */       case '.': 
/* 1208 */         if (fp)
/* 1209 */           dest.append(chr);
/* 1210 */         break;
/*      */       }
/*      */       
/* 1213 */       return idx - 1;
/*      */     }
/*      */     
/* 1216 */     return idx;
/*      */   }
/*      */   
/*      */   public static int scan(Formatf printf, CharSequence src, int... addresses) {
/* 1220 */     int matched = 0;
/* 1221 */     _FORMAT.setLength(0);
/* 1222 */     int idx = 0;
/* 1223 */     int len = printf.getSize();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/* 1231 */       for (int i = 0; i < len; i++) {
/* 1232 */         Formatf.Elem elem = printf.get(i);
/* 1233 */         String sub; switch (elem.getDataType()) {
/*      */         case LITERAL: 
/* 1235 */           int txt = elem.getTxt().length();
/* 1236 */           idx += txt;
/* 1237 */           break;
/*      */         case STRING: 
/*      */         case CHAR: 
/* 1240 */           throw new IllegalArgumentException("Not yet done");
/*      */         case INT: 
/*      */         default: 
/* 1243 */           idx = scan_digits(src, idx, false, _FORMAT);
/* 1244 */           sub = _FORMAT.toString();
/* 1245 */           int val = Integer.parseInt(sub);
/* 1246 */           MainMemory.setI32(addresses[(matched++)], val);
/* 1247 */           break;
/*      */         case LONG: 
/* 1249 */           idx = scan_digits(src, idx, false, _FORMAT);
/* 1250 */           sub = _FORMAT.toString();
/* 1251 */           long lval = Long.parseLong(sub);
/* 1252 */           MainMemory.setI64(addresses[(matched++)], lval);
/* 1253 */           break;
/*      */         case FLOAT: 
/* 1255 */           idx = scan_digits(src, idx, true, _FORMAT);
/* 1256 */           sub = _FORMAT.toString();
/* 1257 */           float fval = Float.parseFloat(sub);
/* 1258 */           MainMemory.setF32(addresses[(matched++)], fval);
/* 1259 */           break;
/*      */         case DOUBLE: 
/* 1261 */           idx = scan_digits(src, idx, true, _FORMAT);
/* 1262 */           sub = _FORMAT.toString();
/* 1263 */           double dval = Double.parseDouble(sub);
/* 1264 */           MainMemory.setF64(addresses[(matched++)], dval);
/*      */         }
/*      */         
/*      */       }
/*      */     }
/*      */     catch (NumberFormatException nfe) {}
/*      */     
/* 1271 */     return matched;
/*      */   }
/*      */   
/*      */   private static StringBuilder scan_digits(CharSource source, int idx, boolean fp, StringBuilder dest)
/*      */   {
/* 1276 */     dest.setLength(0);
/*      */     for (;;)
/*      */     {
/* 1279 */       int chr = source.next();
/* 1280 */       switch (chr) {
/*      */       case -1: 
/* 1282 */         return dest;
/*      */       case 48: 
/*      */       case 49: 
/*      */       case 50: 
/*      */       case 51: 
/*      */       case 52: 
/*      */       case 53: 
/*      */       case 54: 
/*      */       case 55: 
/*      */       case 56: 
/*      */       case 57: 
/* 1293 */         dest.append(chr);
/* 1294 */         break;
/*      */       case 46: 
/* 1296 */         if (fp)
/* 1297 */           dest.append(chr);
/* 1298 */         break;
/*      */       }
/*      */       
/* 1301 */       source.pushback();
/* 1302 */       return dest;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public static int getopt(int argc, int argv, int p_string)
/*      */   {
/* 1309 */     int optDone = MainMemory.getI32Aligned(12);
/* 1310 */     if (optDone != 0) { return -1;
/*      */     }
/* 1312 */     int optind = MainMemory.getI32Aligned(16);
/* 1313 */     if (optind >= argc) {
/* 1314 */       optFinish();
/* 1315 */       return -1;
/*      */     }
/* 1317 */     int array_address = argv + optind * 4;
/* 1318 */     optind++;
/* 1319 */     MainMemory.setI32Aligned(16, optind);
/* 1320 */     int charAddress = MainMemory.getI32Aligned(array_address);
/* 1321 */     int next_address = optind < argc ? array_address + 4 : -1;
/*      */     
/*      */ 
/* 1324 */     int chr = MainMemory.getByte(charAddress++);
/* 1325 */     if (chr != 45) {
/* 1326 */       return -1;
/*      */     }
/* 1328 */     chr = MainMemory.getByte(charAddress++);
/*      */     
/* 1330 */     int addr = MainMemory.searchChar(p_string, chr);
/* 1331 */     if (addr < 0) {
/* 1332 */       return getopt_error("invalid option", chr);
/*      */     }
/* 1334 */     if (MainMemory.getByte(addr + 1) == 58) {
/* 1335 */       if (MainMemory.getByte(charAddress) != 0) {
/* 1336 */         MainMemory.setI32Aligned(24, charAddress);
/* 1337 */       } else { if (next_address < 0) {
/* 1338 */           return getopt_error("option requires an argument", chr);
/*      */         }
/* 1340 */         MainMemory.setI32Aligned(24, MainMemory.getI32(next_address));
/*      */       }
/*      */     }
/* 1343 */     return chr;
/*      */   }
/*      */   
/*      */   private static int getopt_error(String msg, int opt)
/*      */   {
/* 1348 */     if (MainMemory.getI32Aligned(20) != 0)
/* 1349 */       System.err.println(msg + " -- " + (char)opt);
/* 1350 */     optFinish();
/* 1351 */     return 63;
/*      */   }
/*      */   
/*      */   private static void optFinish() {
/* 1355 */     MainMemory.setI32Aligned(12, 1);
/*      */   }
/*      */   
/*      */   public static int strspn(int charStarSearch, int testString)
/*      */   {
/* 1360 */     byte[] set = MainMemory.getByteString(testString);
/* 1361 */     return MainMemory.strspn(charStarSearch, set);
/*      */   }
/*      */   
/*      */   public static int strspn_chars(int charStarSearch, int... testn) {
/* 1365 */     byte[] set = toByteArray(testn);
/* 1366 */     return MainMemory.strspn(charStarSearch, set);
/*      */   }
/*      */   
/*      */   public static int strcspn(int charStarSearch, int testString) {
/* 1370 */     byte[] set = MainMemory.getByteString(testString);
/* 1371 */     return MainMemory.strcspn(charStarSearch, set);
/*      */   }
/*      */   
/*      */   public static int strcspn_chars(int charStarSearch, int... testn) {
/* 1375 */     byte[] set = toByteArray(testn);
/* 1376 */     return MainMemory.strcspn(charStarSearch, set);
/*      */   }
/*      */   
/*      */   private static byte[] toByteArray(int[] testn) {
/* 1380 */     byte[] set = new byte[testn.length];
/* 1381 */     for (int i = 0; i < set.length; i++) {
/* 1382 */       set[i] = ((byte)testn[i]);
/*      */     }
/* 1384 */     return set;
/*      */   }
/*      */   
/*      */   private static int ascii_upper(int byteval)
/*      */   {
/* 1389 */     if ((byteval >= 97) && (byteval <= 122)) {
/* 1390 */       return byteval & 0xDF;
/*      */     }
/* 1392 */     return byteval;
/*      */   }
/*      */   
/*      */   private static int match(int pointer, String uppercase)
/*      */   {
/* 1397 */     int match = 0;
/* 1398 */     int len = uppercase.length();
/* 1399 */     for (int i = 0; i < len; i++) {
/* 1400 */       int value = MainMemory.getByte(pointer++);
/* 1401 */       value = ascii_upper(value);
/* 1402 */       if (value != uppercase.charAt(i))
/* 1403 */         return i;
/*      */     }
/* 1405 */     return len;
/*      */   }
/*      */   
/*      */   public static int localeconv() {
/* 1409 */     return 128;
/*      */   }
/*      */   
/*      */   public static int memchr(int charStar, int aChar, int limit) {
/* 1413 */     for (int i = 0; i < limit; i++) {
/* 1414 */       if (MainMemory.getByte(charStar) == aChar) {
/* 1415 */         return charStar;
/*      */       }
/* 1417 */       charStar++;
/*      */     }
/* 1419 */     return 0;
/*      */   }
/*      */   
/*      */   public static double fmod(double lhs, double rhs)
/*      */   {
/* 1424 */     return lhs % rhs;
/*      */   }
/*      */   
/*      */   public static void sincos(double angle, int p_sin, int p_cos) {
/* 1428 */     double sin = sin(angle);
/* 1429 */     double cos = cos(angle);
/* 1430 */     MainMemory.setF64(p_sin, sin);
/* 1431 */     MainMemory.setF64(p_cos, cos);
/*      */   }
/*      */   
/*      */   public static double exp(double d_0) {
/* 1435 */     return Math.exp(d_0);
/*      */   }
/*      */   
/* 1438 */   public static float exp(float d_0) { return (float)Math.exp(d_0); }
/*      */   
/*      */   public static double ldexp(double d_0, int n) {
/* 1441 */     return Math.scalb(d_0, n);
/*      */   }
/*      */   
/*      */   public static double log(double d_0) {
/* 1445 */     return Math.log(d_0);
/*      */   }
/*      */   
/*      */   public static double pow(double d_0, double d1) {
/* 1449 */     return Math.pow(d_0, d1);
/*      */   }
/*      */   
/*      */   public static double log10(double d_0) {
/* 1453 */     return Math.log10(d_0);
/*      */   }
/*      */   
/* 1456 */   public static float log(float d_0) { return (float)Math.log(d_0); }
/*      */   
/*      */   public static float pow(float d_0, float d1)
/*      */   {
/* 1460 */     return (float)Math.pow(d_0, d1);
/*      */   }
/*      */   
/*      */   public static float log10(float d_0) {
/* 1464 */     return (float)Math.log10(d_0);
/*      */   }
/*      */   
/* 1467 */   public static double asin(double a) { return Math.asin(a); }
/*      */   
/*      */   public static double atan(double a) {
/* 1470 */     return Math.atan(a);
/*      */   }
/*      */   
/* 1473 */   public static double acos(double a) { return Math.acos(a); }
/*      */   
/*      */   public static double atan2(double a, double b) {
/* 1476 */     return Math.atan2(a, b);
/*      */   }
/*      */   
/* 1479 */   public static float atan2f(float a, float b) { return (float)Math.atan2(a, b); }
/*      */   
/*      */   public static double hypot(double a, double b) {
/* 1482 */     return Math.hypot(a, b);
/*      */   }
/*      */   
/* 1485 */   public static double tan(double a) { return Math.tan(a); }
/*      */   
/*      */   public static double tanh(double a) {
/* 1488 */     return Math.tanh(a);
/*      */   }
/*      */   
/* 1491 */   public static double sin(double a) { return Math.sin(a); }
/*      */   
/*      */   public static float sinf(float a) {
/* 1494 */     return (float)Math.sin(a);
/*      */   }
/*      */   
/* 1497 */   public static double sinh(double a) { return Math.sinh(a); }
/*      */   
/*      */   public static double cos(double a) {
/* 1500 */     return Math.cos(a);
/*      */   }
/*      */   
/* 1503 */   public static float cosf(float a) { return (float)Math.cos(a); }
/*      */   
/*      */   public static double cosh(double a) {
/* 1506 */     return Math.cosh(a);
/*      */   }
/*      */   
/* 1509 */   public static double fabs(double a) { return Math.abs(a); }
/*      */   
/*      */   public static int abs(int a) {
/* 1512 */     return Math.abs(a);
/*      */   }
/*      */   
/* 1515 */   public static float fabsf(float a) { return Math.abs(a); }
/*      */   
/*      */   public static double sqrt(double a) {
/* 1518 */     return Math.sqrt(a);
/*      */   }
/*      */   
/* 1521 */   public static float sqrtf(float a) { return (float)Math.sqrt(a); }
/*      */   
/*      */   public static float ceilf(float a) {
/* 1524 */     return (float)Math.ceil(a);
/*      */   }
/*      */   
/* 1527 */   public static double ceil(double a) { return Math.ceil(a); }
/*      */   
/*      */   public static double floor(double a) {
/* 1530 */     return Math.floor(a);
/*      */   }
/*      */   
/* 1533 */   public static float floorf(float a) { return (float)Math.floor(a); }
/*      */   
/*      */   public static double erfc(double x)
/*      */   {
/* 1537 */     double erfc = MathLib.erfc(x);
/* 1538 */     return erfc;
/*      */   }
/*      */   
/*      */   public static void __throw_bad_alloc() {
/* 1542 */     throw new UnwindException("Bad Alloc");
/*      */   }
/*      */   
/*      */   public static void __throw_length_error(int len) {
/* 1546 */     throw new ArrayIndexOutOfBoundsException(len);
/*      */   }
/*      */   
/*      */   public static void srand(int seed) {
/* 1550 */     _RANDOM.setSeed(seed);
/*      */   }
/*      */   
/*      */   public static int rand() {
/* 1554 */     return _RANDOM.nextInt(32767);
/*      */   }
/*      */   
/*      */   public static int ungetc(int chr, int file$) {
/* 1558 */     return IoLib.ungetc(chr, file$);
/*      */   }
/*      */   
/*      */   public static int ctypeBLoc() {
/* 1562 */     return 36;
/*      */   }
/*      */   
/*      */   public static int ctypeToUpperLoc() {
/* 1566 */     return 32;
/*      */   }
/*      */   
/*      */   public static int insert$value$value(int base, int size, int offset, float value) {
/* 1570 */     if (base == 0) {
/* 1571 */       base = MainMemory.alloc(size);
/*      */     }
/* 1573 */     int ptr = base + offset;
/* 1574 */     MainMemory.setF32(ptr, value);
/* 1575 */     return base;
/*      */   }
/*      */   
/* 1578 */   public static int insert$value(int base, int size, int offset, int value) { if (base == 0) {
/* 1579 */       base = MainMemory.alloc(size);
/*      */     }
/* 1581 */     int ptr = base + offset;
/* 1582 */     MainMemory.setI32(ptr, value);
/* 1583 */     return base;
/*      */   }
/*      */   
/* 1586 */   public static int insert$value(int base, int size, int offset, short value) { if (base == 0) {
/* 1587 */       base = MainMemory.alloc(size);
/*      */     }
/* 1589 */     int ptr = base + offset;
/* 1590 */     MainMemory.setI16(ptr, value);
/* 1591 */     return base;
/*      */   }
/*      */   
/* 1594 */   public static int insert$value(int base, int size, int offset, byte value) { if (base == 0) {
/* 1595 */       base = MainMemory.alloc(size);
/*      */     }
/* 1597 */     int ptr = base + offset;
/* 1598 */     MainMemory.setI8(ptr, value);
/* 1599 */     return base;
/*      */   }
/*      */   
/* 1602 */   public static int insert$value(int base, int size, int offset, long value) { if (base == 0) {
/* 1603 */       base = MainMemory.alloc(size);
/*      */     }
/* 1605 */     int ptr = base + offset;
/* 1606 */     MainMemory.setI64(ptr, value);
/* 1607 */     return base;
/*      */   }
/*      */   
/* 1610 */   public static int insert$value(int base, int size, int offset, double value) { if (base == 0) {
/* 1611 */       base = MainMemory.alloc(size);
/*      */     }
/* 1613 */     int ptr = base + offset;
/* 1614 */     MainMemory.setF64(ptr, value);
/* 1615 */     return base;
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/SystemLibrary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */