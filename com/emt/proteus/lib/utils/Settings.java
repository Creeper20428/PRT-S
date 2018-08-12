/*     */ package com.emt.proteus.lib.utils;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.OutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintStream;
/*     */ import java.lang.reflect.Array;
/*     */ import java.net.URL;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
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
/*     */ public class Settings
/*     */ {
/*     */   private int unique;
/*     */   private final Map<String, String> properties;
/*     */   
/*     */   public Settings()
/*     */   {
/*  42 */     this.properties = new LinkedHashMap();
/*     */   }
/*     */   
/*     */   public Settings(Settings settings) {
/*  46 */     this(settings.properties);
/*     */   }
/*     */   
/*     */   public Settings(Map<String, String> properties) {
/*  50 */     this.properties = new LinkedHashMap(properties);
/*     */   }
/*     */   
/*     */   public final void set(String property, boolean val) {
/*  54 */     validateKey(property);
/*  55 */     this.properties.put(property, val ? "true" : "false");
/*     */   }
/*     */   
/*     */   private void validateKey(String property) {
/*  59 */     if (property.charAt(0) == '#') throw new IllegalArgumentException("# is not allowed as key start");
/*     */   }
/*     */   
/*     */   public final void set(String property, int val) {
/*  63 */     validateKey(property);
/*  64 */     this.properties.put(property, Integer.toString(val));
/*     */   }
/*     */   
/*     */   public final void set(String property, long val) {
/*  68 */     validateKey(property);
/*  69 */     this.properties.put(property, Long.toString(val));
/*     */   }
/*     */   
/*     */   public final void set(String property, String val) {
/*  73 */     validateKey(property);
/*  74 */     this.properties.put(property, val);
/*     */   }
/*     */   
/*     */   public final void append(String property, String val) {
/*  78 */     validateKey(property);
/*  79 */     String existing = (String)this.properties.get(property);
/*  80 */     val = concat(existing, val);
/*  81 */     this.properties.put(property, val);
/*     */   }
/*     */   
/*     */   private static String concat(String existing, String val) {
/*  85 */     if (existing != null) {
/*  86 */       val = existing + ';' + val;
/*     */     }
/*  88 */     return val;
/*     */   }
/*     */   
/*     */   public final void set(String property, String[] val) {
/*  92 */     validateKey(property);
/*     */     
/*  94 */     StringBuilder b = new StringBuilder();
/*  95 */     for (int i = 0; i < val.length; i++) {
/*  96 */       if (i != 0) b.append(";");
/*  97 */       String s = val[i];
/*  98 */       b.append(s);
/*     */     }
/* 100 */     this.properties.put(property, b.toString());
/*     */   }
/*     */   
/*     */   public final String[] getStringArray(String property) {
/* 104 */     String s = stringValue(property);
/* 105 */     if (s == null) return null;
/* 106 */     String[] parts = s.split("\\s*;\\s*");
/* 107 */     return parts;
/*     */   }
/*     */   
/*     */   public final String[] stringArray(String property) {
/* 111 */     String s = stringValue(property);
/* 112 */     if (s == null) return new String[0];
/* 113 */     String[] parts = s.split("\\s*;\\s*");
/* 114 */     return parts;
/*     */   }
/*     */   
/*     */   public final Set stringArraySet(String property) {
/* 118 */     String s = stringValue(property);
/* 119 */     LinkedHashSet set = new LinkedHashSet();
/* 120 */     if (s != null)
/*     */     {
/* 122 */       String[] parts = s.split("\\s*;\\s*");
/* 123 */       for (int i = 0; i < parts.length; i++) {
/* 124 */         String part = parts[i];
/* 125 */         set.add(part);
/*     */       }
/*     */     }
/* 128 */     return set;
/*     */   }
/*     */   
/* 131 */   public final Map stringArrayMap(String property) { String s = stringValue(property);
/* 132 */     LinkedHashMap<String, String> set = new LinkedHashMap();
/* 133 */     if (s != null) {
/* 134 */       String[] parts = s.split("\\s*;\\s*");
/* 135 */       for (int i = 0; i < parts.length; i++) {
/* 136 */         String part = parts[i];
/*     */         try {
/* 138 */           parseLine(set, part);
/*     */         } catch (IOException e) {
/* 140 */           e.printStackTrace();
/*     */         }
/*     */       }
/*     */     }
/* 144 */     return set;
/*     */   }
/*     */   
/*     */   public final Object[] instanceArray(String property, Class componentClass) {
/* 148 */     String[] strings = stringArray(property);
/* 149 */     Object[] instances = (Object[])Array.newInstance(componentClass, strings.length);
/* 150 */     for (int i = 0; i < strings.length; i++) {
/* 151 */       String string = strings[i];
/* 152 */       instances[i] = Utils.instanceOrNull(string);
/*     */     }
/* 154 */     return instances;
/*     */   }
/*     */   
/*     */   public final String autokey(String prefix) {
/* 158 */     StringBuilder b = new StringBuilder();
/* 159 */     b.append(prefix);
/* 160 */     b.append("_");
/* 161 */     String s = Integer.toString(++this.unique);
/* 162 */     for (int i = s.length(); i < 3; i++) b.append('0');
/* 163 */     b.append(s);
/* 164 */     b.append("_");
/* 165 */     return b.toString();
/*     */   }
/*     */   
/*     */   public final void comment(String message) {
/* 169 */     String autokey = autokey("#");
/* 170 */     this.properties.put(autokey, message);
/*     */   }
/*     */   
/*     */   public final int intValue(String property) {
/* 174 */     String val = (String)this.properties.get(property);
/* 175 */     return Integer.parseInt(val);
/*     */   }
/*     */   
/*     */   public final int intValue(String property, int def) {
/* 179 */     String val = (String)this.properties.get(property);
/* 180 */     if (val == null) return def;
/* 181 */     return Integer.parseInt(val);
/*     */   }
/*     */   
/*     */   public final long longValue(String property, long def) {
/* 185 */     String val = (String)this.properties.get(property);
/* 186 */     if (val == null) return def;
/* 187 */     return Long.parseLong(val);
/*     */   }
/*     */   
/*     */   public final String stringValue(String property) {
/* 191 */     String val = (String)this.properties.get(property);
/* 192 */     return val;
/*     */   }
/*     */   
/*     */   public final String stringValue(String property, String defaultV) {
/* 196 */     String val = (String)this.properties.get(property);
/* 197 */     return val == null ? defaultV : val;
/*     */   }
/*     */   
/*     */   public final boolean booleanValue(String property) {
/* 201 */     String val = (String)this.properties.get(property);
/* 202 */     return (val != null) && (val.equalsIgnoreCase("true"));
/*     */   }
/*     */   
/*     */   public final void save(OutputStream out, String comment) throws IOException
/*     */   {
/* 207 */     BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, Charset.forName("UTF-8")));
/*     */     try {
/* 209 */       Set<Map.Entry<String, String>> entries = this.properties.entrySet();
/* 210 */       comment(writer, comment);
/* 211 */       for (iterator = entries.iterator(); iterator.hasNext();) {
/* 212 */         Map.Entry<String, String> entry = (Map.Entry)iterator.next();
/* 213 */         String key = (String)entry.getKey();
/* 214 */         String val = (String)entry.getValue();
/* 215 */         writeEntry(writer, key, val);
/*     */       }
/*     */     } finally { Iterator<Map.Entry<String, String>> iterator;
/* 218 */       writer.close();
/*     */     }
/*     */   }
/*     */   
/*     */   private static void writeEntry(BufferedWriter writer, String key, String val) throws IOException
/*     */   {
/* 224 */     if (key.startsWith("#")) {
/* 225 */       comment(writer, val);
/*     */     } else {
/* 227 */       writer.write(key);
/* 228 */       writer.write("=");
/* 229 */       writer.write(val);
/* 230 */       writer.newLine();
/*     */     }
/*     */   }
/*     */   
/*     */   private static void comment(BufferedWriter writer, String str) throws IOException
/*     */   {
/* 236 */     writer.write("# ");
/* 237 */     writer.write(str);
/* 238 */     writer.newLine();
/*     */   }
/*     */   
/*     */   private static void parseLine(Map<String, String> properties, String line) throws IOException
/*     */   {
/* 243 */     int idx1 = line.indexOf('=');
/* 244 */     int idx2 = line.indexOf(':');
/* 245 */     int idx = idx2 < 0 ? idx1 : idx1 < 0 ? idx2 : Math.min(idx1, idx2);
/* 246 */     String key = line.substring(0, idx).trim();
/* 247 */     String val = line.substring(idx + 1).trim();
/* 248 */     if (key.startsWith("+")) {
/* 249 */       key = key.substring(1);
/* 250 */       String existing = (String)properties.get(key);
/* 251 */       val = concat(existing, val);
/*     */     }
/* 253 */     properties.put(key, val);
/*     */   }
/*     */   
/*     */   public final boolean loadResource(String resourceName)
/*     */   {
/* 258 */     InputStream resource = Utils.getResource(resourceName);
/*     */     try {
/* 260 */       if (resource == null) {
/* 261 */         System.out.println("Could not find " + resourceName);
/* 262 */         return false;
/*     */       }
/* 264 */       load(resource);
/* 265 */       return true;
/*     */     } catch (IOException e) {
/* 267 */       e.printStackTrace(); }
/* 268 */     return false;
/*     */   }
/*     */   
/*     */   public final boolean loadResource(Class clazz, String resourceName) {
/* 272 */     InputStream resource = clazz.getClassLoader().getResourceAsStream(resourceName);
/*     */     try {
/* 274 */       if (resource == null) {
/* 275 */         return false;
/*     */       }
/* 277 */       load(resource);
/* 278 */       return true;
/*     */     } catch (IOException e) {
/* 280 */       e.printStackTrace(); }
/* 281 */     return false;
/*     */   }
/*     */   
/*     */   public final void load(URL input)
/*     */     throws IOException
/*     */   {
/* 287 */     load(input.openStream());
/*     */   }
/*     */   
/*     */   public final void load0(InputStream input)
/*     */     throws IOException
/*     */   {
/* 293 */     BufferedReader reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
/*     */     try
/*     */     {
/* 296 */       int lineNumber = 0;
/* 297 */       String line; while ((line = reader.readLine()) != null) {
/* 298 */         line = line.trim();
/* 299 */         lineNumber++;
/* 300 */         if ((line.length() != 0) && 
/* 301 */           (!line.startsWith("#")))
/*     */           try {
/* 303 */             parseLine(this.properties, line);
/*     */           } catch (RuntimeException rte) {
/* 305 */             throw new RuntimeException("Unabled to read line " + lineNumber, rte);
/*     */           }
/*     */       }
/*     */     } finally {
/* 309 */       reader.close();
/*     */     }
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public final void load(InputStream input)
/*     */     throws IOException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 83	java/io/BufferedReader
/*     */     //   3: dup
/*     */     //   4: new 84	java/io/InputStreamReader
/*     */     //   7: dup
/*     */     //   8: aload_1
/*     */     //   9: ldc 50
/*     */     //   11: invokestatic 51	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
/*     */     //   14: invokespecial 85	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
/*     */     //   17: invokespecial 86	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
/*     */     //   20: astore_2
/*     */     //   21: iconst_0
/*     */     //   22: istore_3
/*     */     //   23: new 20	java/lang/StringBuilder
/*     */     //   26: dup
/*     */     //   27: invokespecial 25	java/lang/StringBuilder:<init>	()V
/*     */     //   30: astore 4
/*     */     //   32: aload_2
/*     */     //   33: invokevirtual 87	java/io/BufferedReader:readLine	()Ljava/lang/String;
/*     */     //   36: astore 5
/*     */     //   38: iinc 3 1
/*     */     //   41: aload 5
/*     */     //   43: ifnonnull +8 -> 51
/*     */     //   46: aload_2
/*     */     //   47: invokevirtual 92	java/io/BufferedReader:close	()V
/*     */     //   50: return
/*     */     //   51: aload 5
/*     */     //   53: invokevirtual 72	java/lang/String:trim	()Ljava/lang/String;
/*     */     //   56: astore 5
/*     */     //   58: aload 5
/*     */     //   60: invokevirtual 42	java/lang/String:length	()I
/*     */     //   63: ifeq +18 -> 81
/*     */     //   66: aload 5
/*     */     //   68: iconst_0
/*     */     //   69: invokevirtual 11	java/lang/String:charAt	(I)C
/*     */     //   72: bipush 35
/*     */     //   74: if_icmpeq +7 -> 81
/*     */     //   77: iconst_1
/*     */     //   78: goto +4 -> 82
/*     */     //   81: iconst_0
/*     */     //   82: istore 6
/*     */     //   84: iload 6
/*     */     //   86: ifeq +40 -> 126
/*     */     //   89: aload 4
/*     */     //   91: aload 5
/*     */     //   93: invokevirtual 23	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   96: pop
/*     */     //   97: aload 5
/*     */     //   99: ldc 93
/*     */     //   101: invokevirtual 94	java/lang/String:endsWith	(Ljava/lang/String;)Z
/*     */     //   104: istore 7
/*     */     //   106: iload 7
/*     */     //   108: ifeq +18 -> 126
/*     */     //   111: aload 4
/*     */     //   113: aload 4
/*     */     //   115: invokevirtual 95	java/lang/StringBuilder:length	()I
/*     */     //   118: iconst_1
/*     */     //   119: isub
/*     */     //   120: invokevirtual 96	java/lang/StringBuilder:setLength	(I)V
/*     */     //   123: goto -91 -> 32
/*     */     //   126: aload_0
/*     */     //   127: getfield 4	com/emt/proteus/lib/utils/Settings:properties	Ljava/util/Map;
/*     */     //   130: aload 4
/*     */     //   132: invokestatic 97	com/emt/proteus/lib/utils/Settings:parse	(Ljava/util/Map;Ljava/lang/StringBuilder;)V
/*     */     //   135: goto -103 -> 32
/*     */     //   138: astore 8
/*     */     //   140: aload_2
/*     */     //   141: invokevirtual 92	java/io/BufferedReader:close	()V
/*     */     //   144: aload 8
/*     */     //   146: athrow
/*     */     // Line number table:
/*     */     //   Java source line #315	-> byte code offset #0
/*     */     //   Java source line #318	-> byte code offset #21
/*     */     //   Java source line #319	-> byte code offset #23
/*     */     //   Java source line #321	-> byte code offset #32
/*     */     //   Java source line #322	-> byte code offset #38
/*     */     //   Java source line #323	-> byte code offset #41
/*     */     //   Java source line #340	-> byte code offset #46
/*     */     //   Java source line #327	-> byte code offset #51
/*     */     //   Java source line #328	-> byte code offset #58
/*     */     //   Java source line #329	-> byte code offset #84
/*     */     //   Java source line #330	-> byte code offset #89
/*     */     //   Java source line #331	-> byte code offset #97
/*     */     //   Java source line #332	-> byte code offset #106
/*     */     //   Java source line #333	-> byte code offset #111
/*     */     //   Java source line #334	-> byte code offset #123
/*     */     //   Java source line #337	-> byte code offset #126
/*     */     //   Java source line #338	-> byte code offset #135
/*     */     //   Java source line #340	-> byte code offset #138
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	147	0	this	Settings
/*     */     //   0	147	1	input	InputStream
/*     */     //   20	121	2	reader	BufferedReader
/*     */     //   22	17	3	lineNumber	int
/*     */     //   30	101	4	to_parse	StringBuilder
/*     */     //   36	62	5	line	String
/*     */     //   82	3	6	has_content	boolean
/*     */     //   104	3	7	continuation	boolean
/*     */     //   138	7	8	localObject	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   21	46	138	finally
/*     */     //   51	140	138	finally
/*     */   }
/*     */   
/*     */   private static void parse(Map<String, String> properties, StringBuilder to_parse)
/*     */   {
/* 345 */     if (to_parse.length() == 0) return;
/* 346 */     int assign = to_parse.indexOf("=");
/* 347 */     int colon = to_parse.indexOf(":");
/* 348 */     int split = assign < 0 ? colon : colon < 0 ? assign : Math.min(colon, assign);
/* 349 */     String key = to_parse.substring(0, split);
/* 350 */     String val = to_parse.substring(split + 1).trim();
/* 351 */     if (key.startsWith("+")) {
/* 352 */       key = key.substring(1);
/* 353 */       String existing = (String)properties.get(key);
/* 354 */       val = concat(existing, val);
/*     */     }
/* 356 */     properties.put(key, val);
/* 357 */     to_parse.setLength(0);
/*     */   }
/*     */   
/*     */   public Object getInstance(String key) {
/* 361 */     String clazz = stringValue(key);
/* 362 */     return Utils.instanceOrNull(clazz);
/*     */   }
/*     */   
/*     */   public Object getInstance(String key, String defaultClassName) {
/* 366 */     String clazz = stringValue(key, defaultClassName);
/* 367 */     return Utils.instanceOrNull(clazz);
/*     */   }
/*     */   
/*     */   public Object getInstance(String key, Class defaultValue) {
/*     */     try {
/* 372 */       String clazz = stringValue(key);
/* 373 */       Class aClass = clazz == null ? defaultValue : Thread.currentThread().getContextClassLoader().loadClass(clazz);
/*     */       
/*     */ 
/* 376 */       return aClass.newInstance();
/*     */     } catch (Exception e) {
/* 378 */       e.printStackTrace();
/*     */     }
/* 380 */     return null;
/*     */   }
/*     */   
/*     */   public Color colorValue(String colorName) {
/* 384 */     String s = stringValue(colorName);
/*     */     try {
/* 386 */       return s != null ? Color.decode(s) : null;
/*     */     } catch (NumberFormatException nfe) {}
/* 388 */     return null;
/*     */   }
/*     */   
/*     */   public void addToMap(Map map)
/*     */   {
/* 393 */     map.putAll(this.properties);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/Settings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */