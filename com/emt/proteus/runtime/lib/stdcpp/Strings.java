/*     */ package com.emt.proteus.runtime.lib.stdcpp;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.UnwindException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Strings
/*     */ {
/*     */   public static final int FALSE = 0;
/*     */   public static final int TRUE = 1;
/*  40 */   private static int memory_counter = 0;
/*     */   private static final int MEMORY_SIZE = 1536;
/*     */   
/*     */   public static void start()
/*     */   {
/*  45 */     memory_counter = 0;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void stop() {}
/*     */   
/*     */   public static int newInstance(int ref_addr, int charStart, int allocatorAddr)
/*     */   {
/*  53 */     return newInstance(ref_addr, MainMemory.getStringBuilder(charStart), Allocators.loadAllocator(allocatorAddr));
/*     */   }
/*     */   
/*     */   public static int newInstance(int ref_addr, int allocatorAddr) {
/*  57 */     return newInstance(ref_addr, new StringBuilder(), Allocators.loadAllocator(allocatorAddr));
/*     */   }
/*     */   
/*     */   public static int copyInstance(int string, int string_to_copy) {
/*  61 */     StringBuilder stringBuilder = new StringBuilder();
/*  62 */     StringBuilder src = getStringBuilder(string_to_copy);
/*  63 */     stringBuilder.append(src);
/*  64 */     return newInstance(string, stringBuilder, Allocators.STRING_CHAR);
/*     */   }
/*     */   
/*     */   public static int newInstance(int refAddress) {
/*  68 */     return newInstance(refAddress, new StringBuilder(), Allocators.STRING_CHAR);
/*     */   }
/*     */   
/*     */   public static int newInstance(int refAddress, StringBuilder builder, Allocators.Allocator allocator) {
/*  72 */     int allocate = MainMemory.allocate(refAddress, builder);
/*  73 */     assertLength(refAddress);
/*  74 */     return refAddress;
/*     */   }
/*     */   
/*     */   public static void delete(int refAddress) {
/*  78 */     int allocated = MainMemory.getReferenceAddress(refAddress);
/*  79 */     MainMemory.freeReference(refAddress);
/*     */   }
/*     */   
/*     */   public static int assign(int reference, String content) {
/*  83 */     StringBuilder stringBuilder = getStringBuilder(reference);
/*  84 */     stringBuilder.setLength(0);
/*  85 */     stringBuilder.append(content);
/*  86 */     assertLength(reference);
/*     */     
/*  88 */     return reference;
/*     */   }
/*     */   
/*     */   public static int assign(int reference1, int reference2) {
/*  92 */     StringBuilder dest = getStringBuilder(reference1);
/*  93 */     StringBuilder src = getStringBuilder(reference2);
/*  94 */     dest.setLength(0);
/*  95 */     dest.append(src);
/*  96 */     assertLength(reference1);
/*     */     
/*  98 */     return reference1;
/*     */   }
/*     */   
/*     */   public static StringBuilder getStringBuilder(int reference) {
/* 102 */     StringBuilder referent = (StringBuilder)MainMemory.getReferent(reference);
/*     */     try {
/* 104 */       assertLen(referent.length());
/* 105 */       return referent;
/*     */     } catch (NullPointerException npe) {
/* 107 */       System.err.printf("String %08X is null\n", new Object[] { Integer.valueOf(reference) });
/* 108 */       throw npe;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void append(int refAddress, String content) {
/* 113 */     getStringBuilder(refAddress).append(content);
/* 114 */     assertLength(refAddress);
/*     */   }
/*     */   
/*     */   public static int append(int refAddress, int string)
/*     */   {
/* 119 */     getStringBuilder(refAddress).append(getStringBuilder(string));
/* 120 */     assertLength(refAddress);
/*     */     
/* 122 */     return refAddress;
/*     */   }
/*     */   
/*     */   public static int equals(int reference1, int reference2) {
/* 126 */     StringBuilder one = getStringBuilder(reference1);
/* 127 */     StringBuilder two = getStringBuilder(reference2);
/*     */     
/* 129 */     int lenOne = one.length();
/* 130 */     int lenTwo = two.length();
/* 131 */     if (lenOne != lenTwo) return 0;
/* 132 */     for (int i = 0; i < lenOne; i++) {
/* 133 */       if (one.charAt(i) != two.charAt(i))
/* 134 */         return 0;
/*     */     }
/* 136 */     return 1;
/*     */   }
/*     */   
/*     */   public static int compareStrings(int string, int reference2) {
/* 140 */     StringBuilder one = getStringBuilder(string);
/* 141 */     StringBuilder two = getStringBuilder(reference2);
/* 142 */     int oneLength = one.length();
/* 143 */     int twoLength = two.length();
/* 144 */     int len = Math.min(oneLength, twoLength);
/*     */     
/* 146 */     for (int i = 0; i < len; i++) {
/* 147 */       char c1 = one.charAt(i);
/* 148 */       char c2 = two.charAt(i);
/* 149 */       if (c1 != c2) return c1 - c2;
/*     */     }
/* 151 */     return oneLength - twoLength;
/*     */   }
/*     */   
/*     */   public static int compareChar(int string, int charStar) {
/* 155 */     StringBuilder one = getStringBuilder(string);
/*     */     
/* 157 */     int oneLength = one.length();
/*     */     
/* 159 */     for (int i = 0; i < oneLength; i++) {
/* 160 */       char c1 = one.charAt(i);
/* 161 */       char c2 = (char)MainMemory.getByte(charStar++);
/* 162 */       if (c1 != c2) return c1 - c2;
/*     */     }
/* 164 */     return MainMemory.getByte(charStar) == 0 ? 0 : -1;
/*     */   }
/*     */   
/*     */   public static int size(int reference) {
/* 168 */     return getStringBuilder(reference).length();
/*     */   }
/*     */   
/*     */   public static void reserve(int string, int amount) {
/* 172 */     getStringBuilder(string).ensureCapacity(amount);
/* 173 */     assertLength(string);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int addressOfCharAt(int reference, int index)
/*     */   {
/* 185 */     int addr = MainMemory.getReferenceAddress(reference);
/* 186 */     int charAddress = addr + index;
/* 187 */     return charAddress;
/*     */   }
/*     */   
/*     */   public static int append(int string, int count, byte chr)
/*     */   {
/* 192 */     char c = (char)chr;
/* 193 */     assertLength(string);
/*     */     
/* 195 */     return append(string, count, c);
/*     */   }
/*     */   
/*     */   public static int appendCharStar(int string, int charStar, int maxLen) {
/* 199 */     StringBuilder stringBuilder = getStringBuilder(string);
/* 200 */     MainMemory.append(charStar, stringBuilder, maxLen);
/* 201 */     assertLength(string);
/*     */     
/* 203 */     return string;
/*     */   }
/*     */   
/*     */   public static int appendCharStar(int string, int charStar) {
/* 207 */     StringBuilder stringBuilder = getStringBuilder(string);
/* 208 */     MainMemory.append(charStar, stringBuilder);
/* 209 */     assertLength(string);
/* 210 */     return string;
/*     */   }
/*     */   
/*     */   private static int append(int string, int count, char c) {
/* 214 */     StringBuilder stringBuilder = getStringBuilder(string);
/* 215 */     for (int i = 0; i < count; i++) stringBuilder.append(c);
/* 216 */     assertLength(string);
/*     */     
/* 218 */     return string;
/*     */   }
/*     */   
/*     */   public static int c_str(int string) {
/* 222 */     StringBuilder stringBuilder = getStringBuilder(string);
/* 223 */     int length = stringBuilder.length() + 1;
/* 224 */     assertLength(string);
/* 225 */     int address = memory_counter + length;
/* 226 */     if (memory_counter + length >= 1536) {
/* 227 */       address = 0;
/* 228 */       memory_counter = 0;
/*     */     }
/* 230 */     address += 10752;
/* 231 */     MainMemory.setString(address, stringBuilder.toString());
/* 232 */     memory_counter += length;
/* 233 */     return address;
/*     */   }
/*     */   
/*     */   public static byte[] getBytes(int string) {
/* 237 */     String str = getStringBuilder(string).toString();
/* 238 */     assertLength(string);
/*     */     
/* 240 */     return Utils.toAsciiBytes(str);
/*     */   }
/*     */   
/*     */   public static int addChar(int string, int chr) {
/* 244 */     chr &= 0xFFFF;
/* 245 */     getStringBuilder(string).append((char)chr);
/* 246 */     assertLength(string);
/* 247 */     return string;
/*     */   }
/*     */   
/*     */   public static byte isEmpty(int string) {
/* 251 */     return (byte)(getStringBuilder(string).length() == 0 ? -1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private static void assertLength(int string) {}
/*     */   
/*     */ 
/*     */   private static void assertLen(int length)
/*     */   {
/* 261 */     if (length > 65536) {
/* 262 */       throw new IllegalStateException("String is too long " + length);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void substring(int result, int string, int start, int length) {
/* 267 */     StringBuilder stringObject = getStringBuilder(string);
/* 268 */     int len = stringObject.length();
/* 269 */     if (start >= len) throw new UnwindException(" out_of_range " + start + ">= " + len);
/* 270 */     newInstance(result);
/* 271 */     length = Math.min(length, len - start);
/* 272 */     StringBuilder stringBuilder = getStringBuilder(result);
/* 273 */     stringBuilder.append(stringObject, start, length + start);
/*     */   }
/*     */   
/*     */   public static int plusEqualsOp(int lhs, int rhs) {
/* 277 */     StringBuilder left = getStringBuilder(lhs);
/* 278 */     StringBuilder right = getStringBuilder(rhs);
/* 279 */     left.append(right);
/* 280 */     return lhs;
/*     */   }
/*     */   
/*     */   public static int plusEqualsOpChar(int lhs, int char$) {
/* 284 */     StringBuilder left = getStringBuilder(lhs);
/* 285 */     String string = MainMemory.getString(char$);
/* 286 */     left.append(string);
/* 287 */     return lhs;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/stdcpp/Strings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */