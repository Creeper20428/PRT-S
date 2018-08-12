/*      */ package com.emt.proteus.runtime.api;
/*      */ 
/*      */ import com.emt.proteus.lib.app.MainCtx;
/*      */ import com.emt.proteus.lib.utils.CharSource;
/*      */ import com.emt.proteus.lib.utils.CharSource.Str;
/*      */ import com.emt.proteus.lib.utils.Settings;
/*      */ import com.emt.proteus.lib.utils.Utils;
/*      */ import com.emt.proteus.runtime.lib.io.IoHandle;
/*      */ import com.emt.proteus.runtime.lib.memory.Memory;
/*      */ import com.emt.proteus.runtime.lib.memory.MemoryManager;
/*      */ import com.emt.proteus.runtime.lib.memory.StaticMemoryInt;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.io.PrintStream;
/*      */ import java.math.BigDecimal;
/*      */ import java.math.BigInteger;
/*      */ import java.util.Arrays;
/*      */ import java.util.Comparator;
/*      */ import java.util.HashMap;
/*      */ import java.util.Map;
/*      */ import java.util.Map.Entry;
/*      */ import java.util.Set;
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
/*      */ public final class MainMemory
/*      */ {
/*      */   public static final int IO_NONE = 0;
/*      */   public static final int IO_READ = 1;
/*      */   public static final int IO_WRITE = 2;
/*      */   private static int io_op;
/*      */   private static final boolean DO_TRACE = false;
/*      */   private static final boolean DO_TRACE_READ = false;
/*      */   private static final boolean CHECK_ALIGNMENT = false;
/*      */   private static final boolean ASSERT = false;
/*      */   private static final boolean _USE_INSTANCE_ = false;
/*      */   public static final String RAM_LIMIT = "ram.malloc.base";
/*   61 */   public static final int MEM_SIZE = MainCtx.getSettings().intValue("memory.size", 256) << 20;
/*   62 */   public static final int OBJ_MEM_SIZE = MainCtx.getSettings().intValue("memory.object.size", 16) << 20;
/*      */   
/*   64 */   private static final Memory memory = (Memory)null;
/*      */   
/*      */ 
/*      */   private static int base;
/*      */   
/*      */ 
/*      */   private static long writes;
/*      */   
/*      */ 
/*      */   private static long reads;
/*      */   
/*   75 */   public static final ObjectMemory OBJECT_MEMORY = new ObjectMemory(MEM_SIZE, MEM_SIZE + OBJ_MEM_SIZE, 9);
/*      */   
/*      */   private static final int TRACE_START = 514384;
/*      */   private static final int TRACE_END = 514388;
/*   79 */   private static long counter = 0L;
/*   80 */   private static long readCounter = 0L;
/*   81 */   private static MemoryManager memoryManger = new MemoryManager();
/*      */   public static final long FREQ = 268435456L;
/*      */   
/*   84 */   public static void install(MemoryManager manager) { memoryManger = manager; }
/*      */   
/*      */   public static MemoryManager getMemoryManger()
/*      */   {
/*   88 */     return memoryManger;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void start(int address, byte[] data, String label)
/*      */   {
/*   99 */     memoryManger.start(address, data, label);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  104 */     store(address, data);
/*  105 */     OBJECT_MEMORY.init();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static void stop()
/*      */   {
/*  112 */     memoryManger.stop();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static int alloc(int size)
/*      */   {
/*  121 */     return memoryManger.allocateStack(size);
/*      */   }
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
/*      */   public static int alloc(int size, int count)
/*      */   {
/*  147 */     return alloc(size * count);
/*      */   }
/*      */   
/*      */ 
/*      */   public static int getAllocBase()
/*      */   {
/*  153 */     return memoryManger.getStack();
/*      */   }
/*      */   
/*      */   public static void dealloc(int toAddress) {
/*  157 */     memoryManger.freeStack(toAddress);
/*      */   }
/*      */   
/*      */   public static int alloc_base_line()
/*      */   {
/*  162 */     return memoryManger.getStack();
/*      */   }
/*      */   
/*      */   public static void dealloc_generated(int toAddress)
/*      */   {
/*  167 */     dealloc(toAddress);
/*      */   }
/*      */   
/*      */   public static int malloc(int numberBytes) {
/*  171 */     return malloc(numberBytes, "ANON", null);
/*      */   }
/*      */   
/*      */   public static int malloc(int numberBytes, String label) {
/*  175 */     return malloc(numberBytes, label, null);
/*      */   }
/*      */   
/*      */   public static void delete(int address)
/*      */   {
/*  180 */     free(address);
/*      */   }
/*      */   
/*      */   public static void delete_array(int address) {
/*  184 */     free(address);
/*      */   }
/*      */   
/*      */   public static int _new_(int size, String label) {
/*  188 */     return malloc(size, label);
/*      */   }
/*      */   
/*      */   public static int new_array(int size, String label) {
/*  192 */     return malloc(size, label);
/*      */   }
/*      */   
/*      */   public static int calloc(int size, int nelems) {
/*  196 */     int numberBytes = size * nelems;
/*  197 */     int calloc = malloc(numberBytes, "calloc");
/*  198 */     memset(calloc, numberBytes, (byte)0, 4);
/*  199 */     return calloc;
/*      */   }
/*      */   
/*      */   public static int new_array_int(int size, String label) {
/*  203 */     return new_array(size, label);
/*      */   }
/*      */   
/*      */ 
/*      */   public static int malloc(int amount, String label, Object value)
/*      */   {
/*  209 */     return memoryManger.allocateHeap(amount, 0, 0);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static void free(int address)
/*      */   {
/*  216 */     memoryManger.free(address);
/*      */   }
/*      */   
/*      */   public static int realloc(int address, int size)
/*      */   {
/*  221 */     int new_address = malloc(size);
/*      */     
/*  223 */     memmove(new_address, address, size, 4);
/*  224 */     free(address);
/*  225 */     return new_address;
/*      */   }
/*      */   
/*      */ 
/*      */   private static int align_up(int address, int align)
/*      */   {
/*  231 */     return (address - 1 & (align - 1 ^ 0xFFFFFFFF)) + align;
/*      */   }
/*      */   
/*      */   public static int getBase()
/*      */   {
/*  236 */     return memoryManger.getHeapTop();
/*      */   }
/*      */   
/*      */   public static int getBottom()
/*      */   {
/*  241 */     return memoryManger.getHeapBottom();
/*      */   }
/*      */   
/*      */   public static int push(String src)
/*      */   {
/*  246 */     int str_ptr = alloc(src.length() + 2);
/*  247 */     setString(str_ptr, src);
/*  248 */     return str_ptr;
/*      */   }
/*      */   
/*      */   public static int[] pushs(String[] args) {
/*  252 */     int[] ptrs = new int[args.length];
/*  253 */     for (int i = 0; i < args.length; i++) {
/*  254 */       ptrs[i] = push(args[i]);
/*      */     }
/*  256 */     return ptrs;
/*      */   }
/*      */   
/*      */   public static int push(String[] args)
/*      */   {
/*  261 */     int length = args.length;
/*  262 */     int numberBytes = length * 4 + 4;
/*  263 */     int ptr_address = alloc(numberBytes);
/*  264 */     int current_ptr = ptr_address;
/*  265 */     for (int i = 0; i < length; i++) {
/*  266 */       String arg = args[i];
/*  267 */       int str_ptr = push(arg);
/*  268 */       setI32(current_ptr, str_ptr);
/*  269 */       current_ptr += 4;
/*      */     }
/*  271 */     setI32(current_ptr, 0);
/*  272 */     return ptr_address;
/*      */   }
/*      */   
/*  275 */   public static int pushp(int[] ptrs) { int length = ptrs.length;
/*  276 */     int numberBytes = length * 4 + 4;
/*  277 */     int ptr_address = alloc(numberBytes);
/*  278 */     int current_ptr = ptr_address;
/*  279 */     for (int i = 0; i < length; i++) {
/*  280 */       setI32(current_ptr, ptrs[i]);
/*  281 */       current_ptr += 4;
/*      */     }
/*  283 */     setI32(current_ptr, 0);
/*  284 */     return ptr_address;
/*      */   }
/*      */   
/*      */   public static String getString(int addr)
/*      */   {
/*  289 */     StringBuilder b = getStringBuilder(addr);
/*  290 */     return b.toString();
/*      */   }
/*      */   
/*      */   public static StringBuilder getStringBuilder(int addr) {
/*  294 */     StringBuilder b = new StringBuilder();
/*  295 */     append(addr, b);
/*  296 */     return b;
/*      */   }
/*      */   
/*      */   public static void append(int addr, StringBuilder b) {
/*      */     char c;
/*  301 */     while ((c = (char)getByte(addr++)) > 0) {
/*  302 */       b.append(c);
/*      */     }
/*      */   }
/*      */   
/*      */   public static void append(int addr, StringBuilder b, int limit) {
/*      */     char c;
/*  308 */     while (((c = (char)getByte(addr++)) > 0) && (limit > 0)) {
/*  309 */       b.append(c);
/*  310 */       limit--;
/*      */     }
/*      */   }
/*      */   
/*      */   public static int searchChar(int addr, int chr) {
/*      */     int c;
/*  316 */     while ((c = getByte(addr)) > 0) {
/*  317 */       if (c == chr) return addr;
/*  318 */       addr++;
/*      */     }
/*  320 */     return -1;
/*      */   }
/*      */   
/*      */   public static byte[] getByteString(int addr) {
/*  324 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*      */     int c;
/*  326 */     while ((c = getByte(addr++)) > 0) {
/*  327 */       baos.write(c);
/*      */     }
/*  329 */     return baos.toByteArray();
/*      */   }
/*      */   
/*      */   public static CharSource getSource(int addr) {
/*  333 */     StringBuilder b = getStringBuilder(addr);
/*  334 */     return new CharSource.Str(b.toString());
/*      */   }
/*      */   
/*      */   public static int setString(int addr, String s) {
/*  338 */     return setString(addr, s, true);
/*      */   }
/*      */   
/*      */   public static int setString(int addr, String s, boolean write_null) {
/*  342 */     int len = s.length();
/*  343 */     int pos = addr;
/*  344 */     for (int i = 0; i < len; i++) {
/*  345 */       byte chr = (byte)s.charAt(i);
/*  346 */       setI8(pos++, chr);
/*      */     }
/*  348 */     if (write_null) setI8(pos++, (byte)0);
/*  349 */     return pos - addr;
/*      */   }
/*      */   
/*      */   public static int getByte(int addr)
/*      */   {
/*  354 */     return getI8(addr) & 0xFF;
/*      */   }
/*      */   
/*      */   public static char getChar(int addr) {
/*  358 */     return (char)(getI8(addr) & 0xFF);
/*      */   }
/*      */   
/*      */   public static boolean getI1(int addr) {
/*  362 */     return getI8(addr) != 0;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static float getF32(int addr)
/*      */   {
/*  369 */     return Float.intBitsToFloat(getI32(addr));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static double getF64(int addr)
/*      */   {
/*  376 */     return Double.longBitsToDouble(getI64(addr));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static double getF64Aligned(int addr)
/*      */   {
/*  383 */     return Double.longBitsToDouble(getI64Aligned(addr));
/*      */   }
/*      */   
/*      */   public static BigDecimal getF80(int addr) {
/*  387 */     return new BigDecimal(getF64(addr));
/*      */   }
/*      */   
/*      */   public static BigDecimal getF128(int addr) {
/*  391 */     return new BigDecimal(getF64(addr));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static void setF32(int addr, float val)
/*      */   {
/*  398 */     setI32(addr, Float.floatToRawIntBits(val));
/*      */   }
/*      */   
/*      */   public static void setI1(int addr, boolean val) {
/*  402 */     setI8(addr, (byte)(val ? 1 : 0));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static void setF64(int addr, double val)
/*      */   {
/*  409 */     setI64(addr, Double.doubleToLongBits(val));
/*      */   }
/*      */   
/*      */   public static void setF80(int addr, BigDecimal val) {
/*  413 */     setF64(addr, val.doubleValue());
/*      */   }
/*      */   
/*      */   public static void setF128(int addr, BigDecimal val) {
/*  417 */     setF64(addr, val.doubleValue());
/*      */   }
/*      */   
/*      */   public static int strlen(int address) {
/*  421 */     int idx = firstNull(address);
/*  422 */     return idx - address;
/*      */   }
/*      */   
/*      */   public static int strcat(int dest, int src) {
/*  426 */     return strncat(dest, src, Integer.MAX_VALUE);
/*      */   }
/*      */   
/*      */   public static int strncat(int dest, int src, int limit) {
/*  430 */     int start = firstNull(dest);
/*  431 */     int len = Math.min(limit, strlen(src));
/*  432 */     memcpy_str(start, src, len);
/*  433 */     setI8(start + len, (byte)0);
/*  434 */     return dest;
/*      */   }
/*      */   
/*      */   public static int strcpy(int dest, int src) {
/*  438 */     int len = strlen(src) + 1;
/*  439 */     memcpy_str(dest, src, len);
/*  440 */     return dest;
/*      */   }
/*      */   
/*      */   public static int strncpy(int p_dest, int p_src, int limit) {
/*  444 */     int amount = strlen(p_src) + 1;
/*  445 */     int len = Math.min(amount, limit);
/*  446 */     memcpy_str(p_dest, p_src, len);
/*  447 */     setI8(len + p_dest, (byte)0);
/*  448 */     return p_dest;
/*      */   }
/*      */   
/*      */   public static int strdup(int src) {
/*  452 */     int len = strlen(src);
/*  453 */     int fresh = malloc(len);
/*  454 */     strcpy(fresh, src);
/*  455 */     return fresh;
/*      */   }
/*      */   
/*      */   public static int strcspn(int addr, byte[] chars)
/*      */   {
/*  460 */     int count = 0;
/*      */     for (;;) {
/*  462 */       byte b = getI8(addr++);
/*  463 */       if ((b == 0) || (indexOf(chars, b) >= 0)) {
/*  464 */         return count;
/*      */       }
/*  466 */       count++;
/*      */     }
/*      */   }
/*      */   
/*      */   public static int strspn(int addr, byte[] chars)
/*      */   {
/*  472 */     int count = 0;
/*  473 */     while (indexOf(chars, getI8(addr++)) >= 0) {
/*  474 */       count++;
/*      */     }
/*  476 */     return count;
/*      */   }
/*      */   
/*      */   private static int indexOf(byte[] set, byte i8) {
/*  480 */     for (int i = 0; i < set.length; i++) {
/*  481 */       if (set[i] == i8) return i;
/*      */     }
/*  483 */     return -1;
/*      */   }
/*      */   
/*      */   private static int firstNull(int address) {
/*  487 */     while (getI8(address) != 0) {
/*  488 */       address++;
/*      */     }
/*  490 */     return address;
/*      */   }
/*      */   
/*      */   public static String getIntegerString(int pbyte_0)
/*      */   {
/*  495 */     String s = getString(pbyte_0);
/*  496 */     int i = 0;
/*  497 */     int len = s.length();
/*  498 */     while ((i < len) && (Utils.digitValue(s.charAt(i)) >= 0)) i++;
/*  499 */     if (i < len) {
/*  500 */       return s.substring(0, i);
/*      */     }
/*  502 */     return s;
/*      */   }
/*      */   
/*      */   public static int appendDecimalString(int addr, StringBuilder b)
/*      */   {
/*  507 */     addr = appendOptionPlusMinus(addr, b);
/*  508 */     addr = appendDecimalDigits(addr, b);
/*  509 */     char c = getChar(addr);
/*  510 */     if (c != '.') {
/*  511 */       return addr;
/*      */     }
/*  513 */     b.append('.');
/*  514 */     addr++;
/*  515 */     addr = appendDecimalDigits(addr, b);
/*  516 */     c = getChar(addr);
/*  517 */     if ((c != 'e') && (c != 'E')) {
/*  518 */       return addr;
/*      */     }
/*  520 */     b.append("e");
/*  521 */     addr++;
/*  522 */     addr = appendOptionPlusMinus(addr, b);
/*  523 */     addr = appendDecimalDigits(addr, b);
/*  524 */     return addr;
/*      */   }
/*      */   
/*      */   public static int getNumericString(int addr, int radix, StringBuilder dest) {
/*  528 */     addr = appendOptionPlusMinus(addr, dest);
/*  529 */     if (radix == 16) {
/*  530 */       int chr0 = getByte(addr);
/*  531 */       int chr1 = getByte(addr + 1);
/*  532 */       boolean hexPrefix = (chr0 == 48) && ((chr1 == 120) || (chr1 == 88));
/*  533 */       if (hexPrefix) {
/*  534 */         addr += 2;
/*      */       }
/*  536 */     } else if (radix == 0) {
/*  537 */       int chr0 = getByte(addr);
/*  538 */       int chr1 = getByte(addr + 1);
/*  539 */       boolean hexPrefix = (chr0 == 48) && ((chr1 == 120) || (chr1 == 88));
/*  540 */       if (hexPrefix) {
/*  541 */         addr += 2;
/*  542 */         radix = 16;
/*  543 */         dest.append('h');
/*      */       } else {
/*  545 */         radix = 10;
/*      */       }
/*      */     }
/*      */     for (;;)
/*      */     {
/*  550 */       char chr = (char)getByte(addr);
/*  551 */       if (Utils.digitValue(chr, radix) >= 0) {
/*  552 */         addr++;
/*  553 */         dest.append(chr);
/*      */       } else {
/*  555 */         return addr;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static int skipwhitespace(int src_addr) {
/*  561 */     while (getByte(src_addr) < 33) src_addr++;
/*  562 */     return src_addr;
/*      */   }
/*      */   
/*      */   public static int first(int addr, int match) {
/*      */     int c;
/*  567 */     while (((c = getByte(addr)) != 0) && (c != match)) addr++;
/*  568 */     return c == match ? addr : 0;
/*      */   }
/*      */   
/*      */   public static int last(int addr, int match) {
/*  572 */     int c = 0;int pos = firstNull(addr);
/*  573 */     while ((pos >= addr) && ((c = getByte(pos)) != match)) pos--;
/*  574 */     return c == match ? addr : 0;
/*      */   }
/*      */   
/*      */   public static void store(int address, byte[] src) {
/*  578 */     store(address, src, src.length);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public static byte getI8(int addr)
/*      */   {
/*      */     try
/*      */     {
/*  588 */       return StaticMemoryInt.getI8(addr);
/*      */     } catch (ArrayIndexOutOfBoundsException aie) {}
/*  590 */     return OBJECT_MEMORY.getI8(addr);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static short getI16(int addr)
/*      */   {
/*  602 */     return StaticMemoryInt.getI16(addr);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static int getI32(int addr)
/*      */   {
/*  613 */     return StaticMemoryInt.getI32(addr);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static int getI32Aligned(int addr)
/*      */   {
/*  624 */     return StaticMemoryInt.getI32(addr);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static long getI64(int addr)
/*      */   {
/*  636 */     return StaticMemoryInt.getI64(addr);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static long getI64Aligned(int addr)
/*      */   {
/*  647 */     return StaticMemoryInt.getI64(addr);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static BigInteger getI96(int addr)
/*      */   {
/*  660 */     return StaticMemoryInt.getI96(addr);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static BigInteger getI128(int addr)
/*      */   {
/*  671 */     return StaticMemoryInt.getI128(addr);
/*      */   }
/*      */   
/*      */ 
/*      */   public static void setI8(int addr, byte val)
/*      */   {
/*      */     try
/*      */     {
/*  679 */       StaticMemoryInt.setI8(addr, val);
/*      */     }
/*      */     catch (ArrayIndexOutOfBoundsException aie) {
/*  682 */       OBJECT_MEMORY.setI8(addr, val);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void setI16(int addr, short val)
/*      */   {
/*  694 */     StaticMemoryInt.setI16(addr, val);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void setI32(int addr, int val)
/*      */   {
/*  706 */     StaticMemoryInt.setI32(addr, val);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void setI32Aligned(int addr, int val)
/*      */   {
/*  719 */     StaticMemoryInt.setI32Aligned(addr, val);
/*      */   }
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
/*      */   public static void setInt(int addr, int subscript, int val)
/*      */   {
/*  733 */     setI32Aligned(addr + subscript * 4, val);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static int getInt(int addr, int subscript)
/*      */   {
/*  744 */     return getI32(addr + subscript * 4);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void setI64(int addr, long val)
/*      */   {
/*  754 */     StaticMemoryInt.setI64(addr, val);
/*      */   }
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
/*      */   public static void setI64Aligned(int addr, long val)
/*      */   {
/*  769 */     StaticMemoryInt.setI64Aligned(addr, val);
/*      */   }
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
/*      */   public static void setI96(int addr, BigInteger val)
/*      */   {
/*  784 */     StaticMemoryInt.setI96(addr, val);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void setI128(int addr, BigInteger val)
/*      */   {
/*  795 */     StaticMemoryInt.setI128(addr, val);
/*      */   }
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
/*      */   public static int memcmp(int pointer1, int pointer2, int limit)
/*      */   {
/*  811 */     return StaticMemoryInt.memcmp(pointer1, pointer2, limit);
/*      */   }
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
/*      */   public static int write(int address, int amountInBytes, IoHandle handle)
/*      */     throws IOException
/*      */   {
/*  828 */     io_op = 2;
/*      */     
/*      */ 
/*      */     try
/*      */     {
/*  833 */       return StaticMemoryInt.write(handle, address, amountInBytes);
/*      */     } finally {
/*  835 */       io_op = 0;
/*      */     }
/*      */   }
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
/*      */   public static int read(int addr, IoHandle handle, int amount)
/*      */     throws IOException
/*      */   {
/*  855 */     io_op = 1;
/*      */     
/*      */     int result;
/*      */     try
/*      */     {
/*  860 */       result = StaticMemoryInt.read(handle, addr, amount);
/*      */     }
/*      */     finally
/*      */     {
/*  864 */       io_op = 0;
/*      */     }
/*      */     
/*  867 */     return result;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private static void memcpy_str(int dst, int src, int amount)
/*      */   {
/*  875 */     StaticMemoryInt.memcpy_str(dst, src, amount);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void memcpy(int dst, int src, int amount, int aligment)
/*      */   {
/*  884 */     StaticMemoryInt.memcpy(dst, src, amount, aligment);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void memmove(int dst$, int src$, int amount, int alignment)
/*      */   {
/*  892 */     int delta = src$ - dst$;
/*  893 */     if ((delta >= amount) || (delta <= -amount)) {
/*  894 */       memcpy(dst$, src$, amount, alignment);
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*  899 */       StaticMemoryInt.memmove(dst$, src$, amount, alignment);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void memset(int dst, int len, byte val, int alignment)
/*      */   {
/*  909 */     StaticMemoryInt.memset(dst, len, val, alignment);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void load(int address, byte[] dest)
/*      */   {
/*  922 */     StaticMemoryInt.load(address, dest);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void load(int address, byte[] dest, int length)
/*      */   {
/*  933 */     StaticMemoryInt.load(address, dest, length);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void load(int address, int[] dest, int numInts)
/*      */   {
/*  944 */     StaticMemoryInt.load(address, dest, numInts);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void store(int address, int[] src, int numInts)
/*      */   {
/*  954 */     StaticMemoryInt.store(address, src, numInts);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void store(int address, byte[] src, int amount)
/*      */   {
/*  964 */     StaticMemoryInt.store(address, src, amount);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static int save(OutputStream out, int address, int byteLength)
/*      */     throws IOException
/*      */   {
/*  974 */     return StaticMemoryInt.save_mem(out, address, byteLength);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static int savePages(OutputStream out)
/*      */     throws IOException
/*      */   {
/*  982 */     return StaticMemoryInt.savePages(out);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void load(InputStream in, int address, int byteLength)
/*      */     throws IOException
/*      */   {
/*  991 */     StaticMemoryInt.load_mem(in, address, byteLength);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static void loadPages(InputStream in)
/*      */     throws IOException
/*      */   {
/*  999 */     StaticMemoryInt.loadPages(in);
/*      */   }
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
/*      */   public static void trace(int position, int length) {}
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
/*      */   public static void traceRead(int position, int length) {}
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
/*      */   private static boolean matches(int position, int end)
/*      */   {
/* 1037 */     boolean b = (position < 514388) && (end > 514384);
/* 1038 */     return b;
/*      */   }
/*      */   
/*      */   public static class FrequencyComparator implements Comparator<Map.Entry<Integer, MainMemory.Counter>>
/*      */   {
/*      */     public int compare(Map.Entry<Integer, MainMemory.Counter> e1, Map.Entry<Integer, MainMemory.Counter> e2)
/*      */     {
/* 1045 */       return ((MainMemory.Counter)e1.getValue()).count == ((MainMemory.Counter)e2.getValue()).count ? 0 : ((MainMemory.Counter)e1.getValue()).count < ((MainMemory.Counter)e2.getValue()).count ? 1 : -1;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class KeyComparator implements Comparator<Map.Entry<Integer, MainMemory.Counter>>
/*      */   {
/*      */     public int compare(Map.Entry<Integer, MainMemory.Counter> e1, Map.Entry<Integer, MainMemory.Counter> e2)
/*      */     {
/* 1053 */       return ((Integer)e1.getKey()).compareTo((Integer)e2.getKey());
/*      */     }
/*      */   }
/*      */   
/*      */   public static class Counter
/*      */   {
/*      */     final int address;
/* 1060 */     int count = 1;
/*      */     
/*      */     public Counter(int address)
/*      */     {
/* 1064 */       this.address = address;
/*      */     }
/*      */   }
/*      */   
/*      */   public static void printReads()
/*      */   {
/*      */     try
/*      */     {
/* 1072 */       Map.Entry<Integer, Counter>[] arr = (Map.Entry[])readCounts.entrySet().toArray(new Map.Entry[0]);
/* 1073 */       Arrays.sort(arr, new KeyComparator());
/* 1074 */       PrintStream ps = new PrintStream(new File("memreads1-freq.txt"));
/* 1075 */       PrintStream ps2 = new PrintStream(new File("memreads0-address.txt"));
/* 1076 */       for (int i = 0; i < arr.length; i++)
/*      */       {
/* 1078 */         ps2.printf("%08X+%08X\n", new Object[] { Integer.valueOf(((Integer)arr[i].getKey()).intValue()), Integer.valueOf(((Counter)arr[i].getValue()).count) });
/*      */       }
/* 1080 */       ps2.flush();
/* 1081 */       ps2.close();
/* 1082 */       Arrays.sort(arr, new FrequencyComparator());
/* 1083 */       for (int i = 0; i < arr.length; i++)
/*      */       {
/* 1085 */         ps.printf("%08X+%08X\n", new Object[] { Integer.valueOf(((Integer)arr[i].getKey()).intValue()), Integer.valueOf(((Counter)arr[i].getValue()).count) });
/*      */       }
/* 1087 */       ps.flush();
/* 1088 */       ps.close();
/*      */     }
/*      */     catch (IOException e) {}
/*      */   }
/*      */   
/*      */   public static void incrementRead(int address) {
/*      */     try {
/* 1095 */       ((Counter)readCounts.get(Integer.valueOf(address))).count += 1;
/* 1096 */     } catch (NullPointerException e) { readCounts.put(Integer.valueOf(address), new Counter(address));
/*      */     } }
/*      */   
/* 1099 */   public static Map<Integer, Counter> readCounts = new HashMap();
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private static void alignment_check(int addr, int mask, String op) {}
/*      */   
/*      */ 
/*      */ 
/*      */   public static long getWrites()
/*      */   {
/* 1110 */     return writes;
/*      */   }
/*      */   
/*      */   public static long getReads() {
/* 1114 */     return reads;
/*      */   }
/*      */   
/*      */   public static void read(long bytes) {
/* 1118 */     reads += bytes;
/*      */   }
/*      */   
/*      */   public static void write(long bytes) {
/* 1122 */     writes += bytes;
/*      */   }
/*      */   
/*      */   public static boolean isReading() {
/* 1126 */     return io_op == 1;
/*      */   }
/*      */   
/*      */   public static boolean isWriting() {
/* 1130 */     return io_op == 2;
/*      */   }
/*      */   
/*      */   public static int allocate(Object o)
/*      */   {
/* 1135 */     int allocate = OBJECT_MEMORY.allocate(o);
/* 1136 */     return allocate;
/*      */   }
/*      */   
/*      */   public static int allocate(int reference, Object o) {
/* 1140 */     int allocate = allocate(o);
/* 1141 */     setI32(reference, allocate);
/* 1142 */     return allocate;
/*      */   }
/*      */   
/*      */   public static Object freeReference(int reference) {
/* 1146 */     int address = getReferenceAddress(reference);
/* 1147 */     Object freed = OBJECT_MEMORY.free(address);
/* 1148 */     setI32(reference, -1);
/* 1149 */     return freed;
/*      */   }
/*      */   
/*      */   public static int getReferenceAddress(int reference) {
/* 1153 */     return getI32(reference);
/*      */   }
/*      */   
/*      */   public static Object getReferent(int reference) {
/* 1157 */     return OBJECT_MEMORY.load(getReferenceAddress(reference));
/*      */   }
/*      */   
/*      */   private static int appendDecimalDigits(int addr, StringBuilder b)
/*      */   {
/*      */     for (;;) {
/* 1163 */       char c = getChar(addr);
/* 1164 */       if (Utils.digitValue(c) < 0) {
/* 1165 */         return addr;
/*      */       }
/* 1167 */       b.append(c);
/* 1168 */       addr++;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private static int appendOptionPlusMinus(int addr, StringBuilder b)
/*      */   {
/* 1175 */     char c = getChar(addr);
/* 1176 */     if (c == '-') {
/* 1177 */       b.append('-');
/* 1178 */       addr++;
/* 1179 */     } else if (c == '+') {
/* 1180 */       addr++;
/*      */     }
/* 1182 */     return addr;
/*      */   }
/*      */   
/*      */   public static long getCounter()
/*      */   {
/* 1187 */     return counter;
/*      */   }
/*      */   
/*      */   public static MemoryManager getMemoryManager() {
/* 1191 */     return memoryManger;
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/MainMemory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */