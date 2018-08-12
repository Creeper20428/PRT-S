/*     */ package com.emt.proteus.lib.utils;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.image.ImageObserver;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.Closeable;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.io.Reader;
/*     */ import java.io.Writer;
/*     */ import java.net.URI;
/*     */ import java.net.URL;
/*     */ import java.net.URLEncoder;
/*     */ import java.nio.channels.FileChannel;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.Collection;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Properties;
/*     */ import java.util.logging.LogManager;
/*     */ import java.util.logging.Logger;
/*     */ import java.util.zip.GZIPInputStream;
/*     */ import java.util.zip.GZIPOutputStream;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipInputStream;
/*     */ import java.util.zip.ZipOutputStream;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
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
/*     */ public class Utils
/*     */ {
/*     */   public static final int BUFFER_SIZE = 81920;
/*     */   private static String frameImage;
/*  58 */   public static final long START = System.currentTimeMillis();
/*  59 */   private static final ImageObserver OBSERVER = new ImageObserver() {
/*     */     public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
/*  61 */       return false;
/*     */     }
/*     */   };
/*  64 */   public static final Charset ASCII = Charset.forName("US-ASCII");
/*     */   
/*     */ 
/*  67 */   public static final Integer ZERO = Integer.valueOf(0);
/*  68 */   public static final Integer ONE = Integer.valueOf(1);
/*  69 */   public static final Integer MINUS_ONE = Integer.valueOf(-1);
/*  70 */   private static final Logger BOOT_LOGGER = Logger.getLogger("BOOT");
/*  71 */   public static final Font MONOSPACED = new Font("Courier", 0, 11);
/*  72 */   public static final Font LUCIDA_1 = new Font("Lucida Console", 0, 8);
/*  73 */   public static final Font LUCIDA_2 = new Font("Lucida Console", 0, 10);
/*  74 */   public static final Font LUCIDA_3 = new Font("Lucida Console", 0, 12);
/*     */   
/*  76 */   private static char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
/*     */   
/*     */ 
/*     */   public static boolean areEqual(Object one, Object two)
/*     */   {
/*  81 */     return (one == two) || ((one != null) && (two != null) && (one.equals(two)));
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
/*     */ 
/*     */ 
/*     */   public static void setOsLookAndFeel() {}
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
/*     */   public static void setLookAndFeel(String name) {}
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
/*     */   public static JScrollPane createTextComponent(String text)
/*     */   {
/* 120 */     JTextArea view = new JTextArea(text);
/* 121 */     view.setFont(MONOSPACED);
/* 122 */     return new JScrollPane(view);
/*     */   }
/*     */   
/*     */   public static void boot() {
/* 126 */     loadLogConfiguration();
/* 127 */     setOsLookAndFeel();
/*     */   }
/*     */   
/*     */   public static void loadLogConfiguration() {
/* 131 */     InputStream in = ClassLoader.getSystemResourceAsStream("logging.properties");
/* 132 */     if (in != null) {
/*     */       try {
/* 134 */         LogManager.getLogManager().readConfiguration(in);
/* 135 */         BOOT_LOGGER.fine("Initialised logging");
/*     */       } catch (IOException ioe) {
/* 137 */         ioe.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static byte[] toAsciiBytes(String str)
/*     */   {
/* 144 */     int len = str.length();
/* 145 */     byte[] array = new byte[len];
/* 146 */     for (int i = 0; i != len; i++) {
/* 147 */       array[i] = ((byte)str.charAt(i));
/*     */     }
/* 149 */     return array;
/*     */   }
/*     */   
/*     */   public static String toNativeString(byte[] bytes) {
/* 153 */     return toNativeString(bytes, 0, bytes.length);
/*     */   }
/*     */   
/*     */   public static String toNativeString(byte[] bytes, int offset, int len)
/*     */   {
/* 158 */     char[] chrs = new char[len];
/* 159 */     for (int i = 0; i < len; i++) {
/* 160 */       int c = bytes[(offset++)] & 0xFF;
/* 161 */       chrs[i] = ((char)c);
/*     */     }
/* 163 */     return new String(chrs);
/*     */   }
/*     */   
/*     */   public static String toHexString(byte[] bytes, int offset, int len) {
/* 167 */     StringBuilder b = new StringBuilder();
/* 168 */     appendHex(bytes, offset, len, b);
/* 169 */     return b.toString();
/*     */   }
/*     */   
/*     */   public static StringBuilder appendHex(byte[] bytes, int offset, int len, StringBuilder b) {
/* 173 */     int i = 0; for (int index = offset; i < len; index++) {
/* 174 */       int val = bytes[index] & 0xFF;
/* 175 */       int digit = val >> 4;
/* 176 */       b.append(HEX_CHARS[(val >> 4)]);
/* 177 */       b.append(HEX_CHARS[(val & 0xF)]);
/* 178 */       if (i % 40 == 39) {
/* 179 */         b.append('\n');
/*     */       } else {
/* 181 */         b.append(' ');
/*     */       }
/* 173 */       i++;
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
/* 184 */     return b;
/*     */   }
/*     */   
/*     */   public static URL resolve(URI base, String folder, String name) throws IOException
/*     */   {
/* 189 */     String path = folder + "/" + URLEncoder.encode(name, "UTF-8");
/* 190 */     return base.resolve(path).toURL();
/*     */   }
/*     */   
/*     */   public static void setImage(JFrame frame) {
/*     */     try {
/* 195 */       URL resource = Utils.class.getResource(frameImage);
/* 196 */       ImageIcon icon = new ImageIcon(resource);
/* 197 */       frame.setIconImage(icon.getImage());
/*     */     } catch (Exception e) {
/* 199 */       Logger.getLogger("GUI").info("Unable to set Image " + frameImage);
/*     */     }
/*     */   }
/*     */   
/*     */   public static String getFrameImage() {
/* 204 */     return frameImage;
/*     */   }
/*     */   
/*     */   public static void setFrameImage(String frameImage) {
/* 208 */     frameImage = frameImage;
/*     */   }
/*     */   
/*     */   public static int digitValue(char c) {
/* 212 */     switch (c) {
/*     */     case '0': 
/*     */     case '1': 
/*     */     case '2': 
/*     */     case '3': 
/*     */     case '4': 
/*     */     case '5': 
/*     */     case '6': 
/*     */     case '7': 
/*     */     case '8': 
/*     */     case '9': 
/* 223 */       return c - '0';
/*     */     }
/* 225 */     return -1;
/*     */   }
/*     */   
/*     */   public static int digitValue(char c, int base)
/*     */   {
/*     */     int v;
/* 231 */     switch (c) {
/*     */     case '0': 
/*     */     case '1': 
/*     */     case '2': 
/*     */     case '3': 
/*     */     case '4': 
/*     */     case '5': 
/*     */     case '6': 
/*     */     case '7': 
/*     */     case '8': 
/*     */     case '9': 
/* 242 */       return c - '0';
/*     */     case 'A': 
/*     */     case 'B': 
/*     */     case 'C': 
/*     */     case 'D': 
/*     */     case 'E': 
/*     */     case 'F': 
/*     */     case 'G': 
/*     */     case 'H': 
/*     */     case 'I': 
/*     */     case 'J': 
/*     */     case 'K': 
/*     */     case 'L': 
/*     */     case 'M': 
/*     */     case 'N': 
/*     */     case 'O': 
/*     */     case 'P': 
/*     */     case 'Q': 
/*     */     case 'R': 
/*     */     case 'S': 
/*     */     case 'T': 
/*     */     case 'U': 
/*     */     case 'V': 
/*     */     case 'W': 
/*     */     case 'X': 
/*     */     case 'Y': 
/*     */     case 'Z': 
/* 269 */       v = c + '\n' - 65;
/* 270 */       return v < base ? v : -1;
/*     */     case 'a': 
/*     */     case 'b': 
/*     */     case 'c': 
/*     */     case 'd': 
/*     */     case 'e': 
/*     */     case 'f': 
/*     */     case 'g': 
/*     */     case 'h': 
/*     */     case 'i': 
/*     */     case 'j': 
/*     */     case 'k': 
/*     */     case 'l': 
/*     */     case 'm': 
/*     */     case 'n': 
/*     */     case 'o': 
/*     */     case 'p': 
/*     */     case 'q': 
/*     */     case 'r': 
/*     */     case 's': 
/*     */     case 't': 
/*     */     case 'u': 
/*     */     case 'v': 
/*     */     case 'w': 
/*     */     case 'x': 
/*     */     case 'y': 
/*     */     case 'z': 
/* 297 */       v = c + '\n' - 97;
/* 298 */       return v < base ? v : -1;
/*     */     }
/* 300 */     return -1;
/*     */   }
/*     */   
/*     */   public static int hexDigitValue(char c)
/*     */   {
/* 305 */     switch (c) {
/*     */     case '0': 
/*     */     case '1': 
/*     */     case '2': 
/*     */     case '3': 
/*     */     case '4': 
/*     */     case '5': 
/*     */     case '6': 
/*     */     case '7': 
/*     */     case '8': 
/*     */     case '9': 
/* 316 */       return c - '0';
/*     */     case 'A': 
/*     */     case 'B': 
/*     */     case 'C': 
/*     */     case 'D': 
/*     */     case 'E': 
/*     */     case 'F': 
/* 323 */       return c + '\n' - 65;
/*     */     case 'a': 
/*     */     case 'b': 
/*     */     case 'c': 
/*     */     case 'd': 
/*     */     case 'e': 
/*     */     case 'f': 
/* 330 */       return c + '\n' - 97;
/*     */     }
/* 332 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public static String truncate(String s, int max_len)
/*     */   {
/* 338 */     if (s.length() >= max_len) {
/* 339 */       return s.substring(0, max_len);
/*     */     }
/* 341 */     return s;
/*     */   }
/*     */   
/*     */   public static Properties load_properties(String resource) {
/* 345 */     Properties tmp = new Properties();
/*     */     try {
/* 347 */       Enumeration e = Thread.currentThread().getContextClassLoader().getResources(resource);
/* 348 */       while (e.hasMoreElements()) {
/* 349 */         URL url = (URL)e.nextElement();
/*     */         try {
/* 351 */           tmp.load(url.openStream());
/*     */         } catch (Exception ex) {
/* 353 */           System.err.println("Failed to load:" + url);
/*     */         }
/*     */       }
/*     */     } catch (IOException e) {
/* 357 */       e.printStackTrace();
/*     */     }
/* 359 */     return tmp;
/*     */   }
/*     */   
/*     */   public static URL getResourceUrl(String resourceName) {
/* 363 */     ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
/* 364 */     URL resource = contextClassLoader.getResource(resourceName);
/* 365 */     if (resource == null) {
/* 366 */       resource = Utils.class.getResource(resourceName);
/* 367 */       if (resource == null) {
/* 368 */         resource = Utils.class.getResource(resourceName);
/*     */       }
/*     */     }
/* 371 */     return resource;
/*     */   }
/*     */   
/*     */   public static InputStream getResource(String resourceName) {
/* 375 */     ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
/* 376 */     InputStream resource = contextClassLoader.getResourceAsStream(resourceName);
/* 377 */     if (resource == null) {
/* 378 */       resource = Utils.class.getResourceAsStream(resourceName);
/* 379 */       if (resource == null) {
/* 380 */         resource = Utils.class.getResourceAsStream(resourceName);
/*     */       }
/*     */     }
/* 383 */     return resource;
/*     */   }
/*     */   
/*     */   public static void showThrowable(Throwable e) {
/* 387 */     StackTraceElement[] stackTrace = e.getStackTrace();
/* 388 */     StringBuilder b = new StringBuilder();
/* 389 */     for (int i = 0; i < stackTrace.length; i++) {
/* 390 */       StackTraceElement stackTraceElement = stackTrace[i];
/* 391 */       b.append(stackTraceElement.toString()).append("\n");
/*     */     }
/* 393 */     JOptionPane.showMessageDialog(null, b.toString());
/*     */   }
/*     */   
/*     */   public static Object instanceOrNull(String clazz) {
/*     */     try {
/* 398 */       Class aClass = Thread.currentThread().getContextClassLoader().loadClass(clazz);
/*     */       
/* 400 */       return aClass.newInstance();
/*     */     } catch (Exception e) {
/* 402 */       e.printStackTrace();
/*     */       try
/*     */       {
/* 405 */         Class aClass = Class.forName(clazz);
/*     */         
/* 407 */         return aClass.newInstance();
/*     */       } catch (Exception e) {
/* 409 */         e.printStackTrace();
/*     */       } }
/* 411 */     return null;
/*     */   }
/*     */   
/*     */   public static int readFully(InputStream input, byte[] dest) throws IOException
/*     */   {
/* 416 */     int read = 0;
/* 417 */     int length = dest.length;
/* 418 */     int offset = 0;
/* 419 */     while (length > 0) {
/* 420 */       int amount = input.read(dest, offset, length);
/* 421 */       if (amount < 0) return read;
/* 422 */       read += amount;
/* 423 */       length -= amount;
/* 424 */       offset += amount;
/*     */     }
/* 426 */     return read;
/*     */   }
/*     */   
/*     */   public static int[] toIntArrayLe(byte[] dest, int offset, int byteLength) {
/* 430 */     int length = byteLength >> 2;
/* 431 */     int[] ints = new int[length];
/* 432 */     assert ((offset & 0x3) == 0);
/* 433 */     int i = 0; for (int pos = offset; i < length; pos += 4) {
/* 434 */       ints[i] = ByteTools.loadI32(dest, pos);i++;
/*     */     }
/* 436 */     return ints;
/*     */   }
/*     */   
/*     */   public static Icon getIcon(String s)
/*     */   {
/* 441 */     URL url = Thread.currentThread().getContextClassLoader().getResource(s);
/* 442 */     ImageIcon imageIcon = new ImageIcon(url);
/* 443 */     return imageIcon;
/*     */   }
/*     */   
/*     */   public static String formatPartial(String file, int count) {
/* 447 */     return String.format("%s.%05d.gz", new Object[] { file, Integer.valueOf(count) });
/*     */   }
/*     */   
/*     */   public static long parseHex(String s) {
/* 451 */     int length = s.length();
/* 452 */     if (length > 16) throw new IllegalArgumentException("String too long " + s);
/* 453 */     long val = 0L;
/* 454 */     for (int i = 0; i < length; i++) {
/* 455 */       char c = s.charAt(i);
/* 456 */       long digit = hexDigitValue(c);
/* 457 */       if (digit < 0L) throw new IllegalArgumentException("Invalid digit " + c);
/* 458 */       val = val << 4 | digit;
/*     */     }
/* 460 */     String h = Long.toHexString(val);
/*     */     
/* 462 */     if (!h.toUpperCase().equals(s.toUpperCase()))
/* 463 */       throw new NumberFormatException(s + " inconsistent parsing :" + h);
/* 464 */     return val;
/*     */   }
/*     */   
/* 467 */   public static boolean any(int flags, int mask) { return (flags & mask) != 0; }
/*     */   
/*     */   public static boolean all(int flags, int mask)
/*     */   {
/* 471 */     return (flags & mask) == mask;
/*     */   }
/*     */   
/*     */   public static boolean none(int flags, int mask) {
/* 475 */     return (flags & mask) == 0;
/*     */   }
/*     */   
/*     */   public static double toDouble(float i)
/*     */   {
/* 480 */     return i;
/*     */   }
/*     */   
/*     */   public static void copy(File from, File to) throws IOException
/*     */   {
/* 485 */     FileChannel channel = new FileInputStream(from).getChannel();
/* 486 */     FileChannel out = new FileOutputStream(to).getChannel();
/*     */     try {
/* 488 */       long length = from.length();
/* 489 */       long dest = 0L;
/* 490 */       long amount = length;
/* 491 */       while (amount > 0L) {
/* 492 */         long tranferred = channel.transferTo(dest, amount, out);
/* 493 */         amount -= tranferred;
/* 494 */         dest += tranferred;
/*     */       }
/*     */     } finally {
/* 497 */       channel.close();
/* 498 */       out.close();
/*     */     }
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static long copy(InputStream from, OutputStream to, boolean closeInput, boolean closeOutput)
/*     */     throws IOException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: ldc 104
/*     */     //   2: newarray <illegal type>
/*     */     //   4: astore 4
/*     */     //   6: lconst_0
/*     */     //   7: lstore 5
/*     */     //   9: aload_0
/*     */     //   10: aload 4
/*     */     //   12: invokevirtual 105	java/io/InputStream:read	([B)I
/*     */     //   15: istore 7
/*     */     //   17: iload 7
/*     */     //   19: ifge +30 -> 49
/*     */     //   22: lload 5
/*     */     //   24: lstore 8
/*     */     //   26: iload_2
/*     */     //   27: ifeq +7 -> 34
/*     */     //   30: aload_0
/*     */     //   31: invokestatic 106	com/emt/proteus/lib/utils/Utils:close	(Ljava/io/Closeable;)V
/*     */     //   34: aload_1
/*     */     //   35: invokevirtual 107	java/io/OutputStream:flush	()V
/*     */     //   38: iload_3
/*     */     //   39: ifeq +7 -> 46
/*     */     //   42: aload_1
/*     */     //   43: invokestatic 106	com/emt/proteus/lib/utils/Utils:close	(Ljava/io/Closeable;)V
/*     */     //   46: lload 8
/*     */     //   48: lreturn
/*     */     //   49: iload 7
/*     */     //   51: ifle +20 -> 71
/*     */     //   54: aload_1
/*     */     //   55: aload 4
/*     */     //   57: iconst_0
/*     */     //   58: iload 7
/*     */     //   60: invokevirtual 108	java/io/OutputStream:write	([BII)V
/*     */     //   63: lload 5
/*     */     //   65: iload 7
/*     */     //   67: i2l
/*     */     //   68: ladd
/*     */     //   69: lstore 5
/*     */     //   71: goto -62 -> 9
/*     */     //   74: astore 10
/*     */     //   76: iload_2
/*     */     //   77: ifeq +7 -> 84
/*     */     //   80: aload_0
/*     */     //   81: invokestatic 106	com/emt/proteus/lib/utils/Utils:close	(Ljava/io/Closeable;)V
/*     */     //   84: aload_1
/*     */     //   85: invokevirtual 107	java/io/OutputStream:flush	()V
/*     */     //   88: iload_3
/*     */     //   89: ifeq +7 -> 96
/*     */     //   92: aload_1
/*     */     //   93: invokestatic 106	com/emt/proteus/lib/utils/Utils:close	(Ljava/io/Closeable;)V
/*     */     //   96: aload 10
/*     */     //   98: athrow
/*     */     // Line number table:
/*     */     //   Java source line #502	-> byte code offset #0
/*     */     //   Java source line #504	-> byte code offset #6
/*     */     //   Java source line #506	-> byte code offset #9
/*     */     //   Java source line #507	-> byte code offset #17
/*     */     //   Java source line #514	-> byte code offset #26
/*     */     //   Java source line #515	-> byte code offset #34
/*     */     //   Java source line #516	-> byte code offset #38
/*     */     //   Java source line #508	-> byte code offset #49
/*     */     //   Java source line #509	-> byte code offset #54
/*     */     //   Java source line #510	-> byte code offset #63
/*     */     //   Java source line #512	-> byte code offset #71
/*     */     //   Java source line #514	-> byte code offset #74
/*     */     //   Java source line #515	-> byte code offset #84
/*     */     //   Java source line #516	-> byte code offset #88
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	99	0	from	InputStream
/*     */     //   0	99	1	to	OutputStream
/*     */     //   0	99	2	closeInput	boolean
/*     */     //   0	99	3	closeOutput	boolean
/*     */     //   4	52	4	buffer	byte[]
/*     */     //   7	63	5	length	long
/*     */     //   15	51	7	read	int
/*     */     //   24	23	8	l1	long
/*     */     //   74	23	10	localObject	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   6	26	74	finally
/*     */     //   49	76	74	finally
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static byte[] load(InputStream input)
/*     */     throws IOException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 109	java/io/ByteArrayOutputStream
/*     */     //   3: dup
/*     */     //   4: invokespecial 110	java/io/ByteArrayOutputStream:<init>	()V
/*     */     //   7: astore_1
/*     */     //   8: ldc 104
/*     */     //   10: newarray <illegal type>
/*     */     //   12: astore_2
/*     */     //   13: aload_0
/*     */     //   14: aload_2
/*     */     //   15: invokevirtual 105	java/io/InputStream:read	([B)I
/*     */     //   18: istore_3
/*     */     //   19: iload_3
/*     */     //   20: ifge +16 -> 36
/*     */     //   23: aload_1
/*     */     //   24: invokevirtual 111	java/io/ByteArrayOutputStream:toByteArray	()[B
/*     */     //   27: astore 4
/*     */     //   29: aload_0
/*     */     //   30: invokevirtual 112	java/io/InputStream:close	()V
/*     */     //   33: aload 4
/*     */     //   35: areturn
/*     */     //   36: aload_1
/*     */     //   37: aload_2
/*     */     //   38: iconst_0
/*     */     //   39: iload_3
/*     */     //   40: invokevirtual 113	java/io/ByteArrayOutputStream:write	([BII)V
/*     */     //   43: goto -30 -> 13
/*     */     //   46: astore 5
/*     */     //   48: aload_0
/*     */     //   49: invokevirtual 112	java/io/InputStream:close	()V
/*     */     //   52: aload 5
/*     */     //   54: athrow
/*     */     // Line number table:
/*     */     //   Java source line #521	-> byte code offset #0
/*     */     //   Java source line #522	-> byte code offset #8
/*     */     //   Java source line #525	-> byte code offset #13
/*     */     //   Java source line #526	-> byte code offset #19
/*     */     //   Java source line #527	-> byte code offset #23
/*     */     //   Java source line #532	-> byte code offset #29
/*     */     //   Java source line #529	-> byte code offset #36
/*     */     //   Java source line #530	-> byte code offset #43
/*     */     //   Java source line #532	-> byte code offset #46
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	55	0	input	InputStream
/*     */     //   7	30	1	baos	ByteArrayOutputStream
/*     */     //   12	26	2	buf	byte[]
/*     */     //   18	22	3	amount	int
/*     */     //   27	7	4	arrayOfByte1	byte[]
/*     */     //   46	7	5	localObject	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   13	29	46	finally
/*     */     //   36	48	46	finally
/*     */   }
/*     */   
/*     */   public static void save(OutputStream out, byte[] data)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/* 538 */       out.write(data);
/* 539 */       out.close();
/*     */     } finally {
/* 541 */       if (out != null) out.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void save(String fileName, String content)
/*     */   {
/*     */     try {
/* 548 */       Writer writer = new FileWriter(fileName);
/* 549 */       writer.write(content);
/* 550 */       writer.close();
/*     */     } catch (IOException e) {
/* 552 */       System.err.println("Unable to save " + fileName);
/*     */     }
/*     */   }
/*     */   
/*     */   public static byte[] read(File file) throws IOException {
/* 557 */     return getBytes(new FileInputStream(file));
/*     */   }
/*     */   
/*     */   public static void save(File file, byte[] bytes) throws IOException
/*     */   {
/* 562 */     FileOutputStream output = null;
/*     */     try {
/* 564 */       output = new FileOutputStream(file, false);
/* 565 */       output.write(bytes);
/*     */     } finally {
/* 567 */       close(output);
/*     */     }
/*     */   }
/*     */   
/*     */   public static byte[] getBytes(InputStream inputStream)
/*     */     throws IOException
/*     */   {
/* 574 */     ByteArrayOutputStream bais = new ByteArrayOutputStream();
/* 575 */     byte[] buf = new byte[81920];
/* 576 */     int amount = 0;
/*     */     try {
/* 578 */       while ((amount = inputStream.read(buf, 0, buf.length)) >= 0) {
/* 579 */         bais.write(buf, 0, amount);
/*     */       }
/* 581 */       return bais.toByteArray();
/*     */     } finally {
/* 583 */       close(inputStream);
/*     */     }
/*     */   }
/*     */   
/*     */   public static String getString(InputStream inputStream)
/*     */     throws IOException
/*     */   {
/* 590 */     InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
/* 591 */     return getString(inputStreamReader);
/*     */   }
/*     */   
/*     */   public static String getString(Reader inputStreamReader) throws IOException
/*     */   {
/* 596 */     StringBuilder b = new StringBuilder();
/* 597 */     char[] buf = new char[81920];
/* 598 */     int amount = 0;
/*     */     try {
/* 600 */       while ((amount = inputStreamReader.read(buf, 0, buf.length)) >= 0) {
/* 601 */         b.append(buf, 0, amount);
/*     */       }
/* 603 */       return b.toString();
/*     */     } finally {
/* 605 */       close(inputStreamReader);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/* 610 */   public static String getExtension(File path) { return getExtension(path.getName()); }
/*     */   
/*     */   public static String getExtension(String path) {
/* 613 */     int idx = path.lastIndexOf('.');
/* 614 */     String ext = idx < 0 ? "" : path.substring(idx + 1).toLowerCase();
/* 615 */     return ext;
/*     */   }
/*     */   
/*     */   public static void close(Closeable closeable) {
/*     */     try {
/* 620 */       if (closeable != null) closeable.close();
/*     */     } catch (IOException e) {
/* 622 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static byte[] getGZBytes(byte[] src) throws IOException
/*     */   {
/* 628 */     ByteArrayInputStream bais = new ByteArrayInputStream(src);
/* 629 */     GZIPInputStream input = new GZIPInputStream(bais);
/* 630 */     return getBytes(input);
/*     */   }
/*     */   
/*     */   public static byte[] toGZBytes(byte[] src) throws IOException {
/* 634 */     ByteArrayOutputStream bais = new ByteArrayOutputStream(Math.max(8192, src.length >> 1));
/* 635 */     GZIPOutputStream outputStream = new GZIPOutputStream(bais);
/* 636 */     outputStream.write(src, 0, src.length);
/* 637 */     outputStream.close();
/* 638 */     return bais.toByteArray();
/*     */   }
/*     */   
/*     */   public static void addFilesWithExtension(Collection<File> files, File root, String extension) {
/* 642 */     extension = extension.toLowerCase();
/* 643 */     appendFileInternal(files, root, extension);
/*     */   }
/*     */   
/*     */   private static void appendFileInternal(Collection<File> files, File file, String extension) {
/* 647 */     if (file.isFile()) {
/* 648 */       String ext = getExtension(file.getName());
/* 649 */       if (ext.equals(extension)) {
/* 650 */         files.add(file.getAbsoluteFile());
/*     */       }
/* 652 */     } else if (file.isDirectory()) {
/* 653 */       File[] kids = file.listFiles();
/* 654 */       for (int i = 0; i < kids.length; i++) {
/* 655 */         File kid = kids[i];
/* 656 */         appendFileInternal(files, kid, extension);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/* 662 */   public static boolean cleanDirectory(File directory) { return cleanDirectory(directory, null); }
/*     */   
/*     */   public static boolean cleanDirectory(File directory, String extension) {
/* 665 */     extension = extension != null ? extension.toLowerCase() : null;
/*     */     
/* 667 */     LinkedList<File> retries = new LinkedList();
/* 668 */     cleanRecursive(directory, retries, extension);
/* 669 */     int attempts = 3;
/* 670 */     long millis = 500L;
/* 671 */     while ((attempts > 0) && (!retries.isEmpty())) {
/* 672 */       pause(millis);
/* 673 */       for (Iterator<File> iterator = retries.iterator(); iterator.hasNext();) {
/* 674 */         File next = (File)iterator.next();
/* 675 */         if ((!next.exists()) || (next.delete())) {
/* 676 */           retries.remove();
/*     */         }
/*     */       }
/* 679 */       attempts--;
/*     */     }
/* 681 */     if (!retries.isEmpty()) {
/* 682 */       return false;
/*     */     }
/* 684 */     return true;
/*     */   }
/*     */   
/*     */   private static void cleanRecursive(File file, Collection<File> retry, String extension)
/*     */   {
/* 689 */     if (file.isFile()) {
/* 690 */       String ext = getExtension(file.getName());
/* 691 */       if ((extension != null) && (!ext.equals(extension))) return;
/* 692 */       if (!file.delete()) retry.add(file);
/* 693 */     } else if (file.isDirectory()) {
/* 694 */       File[] kids = file.listFiles();
/* 695 */       for (int i = 0; i < kids.length; i++) {
/* 696 */         File kid = kids[i];
/* 697 */         cleanRecursive(kid, retry, extension);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void addContentsToZip(ZipOutputStream zip, File file, Filter accept) throws IOException {
/* 703 */     if (file.isFile()) {
/* 704 */       ZipInputStream zIn = new ZipInputStream(new FileInputStream(file));
/* 705 */       addToZip(zip, zIn, accept);
/* 706 */     } else if (file.isDirectory()) {
/* 707 */       File[] files = file.listFiles();
/* 708 */       for (int i = 0; i < files.length; i++) {
/* 709 */         File kid = files[i];
/* 710 */         addToZip(zip, kid, "", accept);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void addToZip(ZipOutputStream zip, File file, String prefix, Filter accept) throws IOException {
/* 716 */     String name = prefix + file.getName();
/* 717 */     if (file.isFile()) {
/* 718 */       if (accept.accept(name)) {
/* 719 */         ZipEntry entry = new ZipEntry(name);
/* 720 */         zip.putNextEntry(entry);
/* 721 */         copy(new FileInputStream(file), zip, true, false);
/* 722 */         zip.closeEntry();
/*     */       }
/* 724 */     } else if (file.isDirectory()) {
/* 725 */       File[] files = file.listFiles();
/* 726 */       for (int i = 0; i < files.length; i++) {
/* 727 */         File kid = files[i];
/* 728 */         addToZip(zip, kid, name + "/", accept);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void addToZip(ZipOutputStream zip, ZipInputStream input, Filter accept) throws IOException {
/*     */     try { ZipEntry nextEntry;
/* 735 */       while ((nextEntry = input.getNextEntry()) != null) {
/* 736 */         String name = nextEntry.getName();
/* 737 */         if (accept.accept(name)) {
/* 738 */           ZipEntry entry = new ZipEntry(nextEntry);
/* 739 */           zip.putNextEntry(entry);
/* 740 */           copy(input, zip, false, false);
/* 741 */           zip.closeEntry();
/*     */         }
/* 743 */         input.closeEntry();
/*     */       }
/*     */     } finally {
/* 746 */       close(input);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void pause(long pause) {
/*     */     try {
/* 752 */       Thread.sleep(pause);
/*     */     }
/*     */     catch (InterruptedException e) {}
/*     */   }
/*     */   
/*     */   public static String replaceExtension(String fileName, String newext)
/*     */   {
/* 759 */     String stem = getStem(fileName);
/* 760 */     return stem + "." + newext;
/*     */   }
/*     */   
/*     */   public static String getStem(String fileName) {
/* 764 */     int index = fileName.lastIndexOf('.');
/* 765 */     String stem = fileName;
/* 766 */     if (index > 0) {
/* 767 */       stem = fileName.substring(0, index);
/*     */     }
/* 769 */     return stem;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */