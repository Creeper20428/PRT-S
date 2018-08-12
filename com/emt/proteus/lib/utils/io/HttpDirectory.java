/*     */ package com.emt.proteus.lib.utils.io;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.IoSystem;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.zip.GZIPInputStream;
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
/*     */ public final class HttpDirectory
/*     */   extends FileProxy
/*     */ {
/*     */   public final int shift;
/*     */   public final int size;
/*     */   public final int mask;
/*     */   private long length;
/*     */   private final IoSystem ioSystem;
/*     */   private final URL url;
/*     */   private String file;
/*     */   private Settings settings;
/*     */   private Cache cache;
/*     */   private byte[] buffer;
/*     */   
/*     */   public HttpDirectory(IoSystem ioSystem, String relativeName, URL url)
/*     */     throws IOException
/*     */   {
/*  62 */     super(relativeName);
/*  63 */     this.ioSystem = ioSystem;
/*  64 */     this.url = url;
/*  65 */     this.file = createFileName(url);
/*  66 */     this.length = getContentLength(url);
/*  67 */     this.settings = readSettings(ioSystem, this.file, url);
/*     */     
/*  69 */     this.shift = this.settings.intValue("block.shift", 18);
/*  70 */     this.size = (1 << this.shift);
/*  71 */     this.mask = (this.size - 1);
/*  72 */     this.buffer = new byte[this.size];
/*     */     
/*  74 */     this.length = this.settings.longValue("file.length", this.length);
/*  75 */     this.cache = new Cache(this.settings.intValue("cache-size", 256), null);
/*  76 */     String[] preload = this.settings.stringArray("pre-load");
/*  77 */     new Downloader(preload).exec();
/*     */   }
/*     */   
/*     */   protected int loadImpl(long offset, byte[] dest, int dest_off, int length) throws IOException
/*     */   {
/*  82 */     long index = offset >> this.shift;
/*  83 */     int iOffset = (int)(offset & this.mask);
/*  84 */     if (iOffset != 0) throw new IllegalArgumentException("Can only read Aligned Sections ");
/*  85 */     int total = 0;
/*  86 */     int retries = 0;
/*  87 */     while ((length > 0) && (retries < 3)) {
/*  88 */       String spec = Utils.formatPartial(this.file, (int)index);
/*  89 */       URL derived = new URL(this.url, spec);
/*     */       
/*  91 */       byte[] data = this.cache.getData(spec);
/*     */       
/*  93 */       if (data == null) {
/*     */         try {
/*  95 */           InputStream inputStream = this.ioSystem.openNoProgress(derived);
/*  96 */           if (inputStream != null) {
/*  97 */             data = Utils.getBytes(inputStream);
/*  98 */             this.cache.setData(spec, data);
/*     */           }
/*     */         } catch (IOException e) {
/* 101 */           e.printStackTrace();
/*     */         }
/* 103 */         retries++;
/*     */       }
/*     */       
/* 106 */       if (data != null) {
/* 107 */         ByteArrayInputStream bais = new ByteArrayInputStream(data);
/* 108 */         GZIPInputStream gz = new GZIPInputStream(bais);
/* 109 */         if (iOffset > 0) {
/* 110 */           gz.skip(iOffset);
/*     */         }
/* 112 */         int read = 0;
/* 113 */         read = readFullyAndClose(gz, dest, dest_off, length);
/* 114 */         if (read > 0) {
/* 115 */           length -= read;
/* 116 */           index += 1L;
/* 117 */           iOffset = 0;
/* 118 */           total += read;
/* 119 */           retries = 0;
/*     */         }
/*     */       }
/*     */     }
/* 123 */     return total;
/*     */   }
/*     */   
/*     */   public long getLength() {
/* 127 */     return this.length;
/*     */   }
/*     */   
/*     */   public InputStream getInputStream() throws IOException
/*     */   {
/* 132 */     return this.url.openStream();
/*     */   }
/*     */   
/*     */   public static long getContentLength(URL _url)
/*     */     throws IOException
/*     */   {
/* 138 */     HttpURLConnection connection = (HttpURLConnection)_url.openConnection();
/* 139 */     connection.setRequestMethod("HEAD");
/*     */     try {
/* 141 */       connection.connect();
/* 142 */       if (connection.getResponseCode() == 200) {
/* 143 */         int contentLength = connection.getContentLength();
/* 144 */         long l; if (contentLength > 0) {
/* 145 */           return contentLength;
/*     */         }
/* 147 */         return 0L;
/*     */       }
/*     */     } finally {
/* 150 */       connection.disconnect();
/*     */     }
/* 152 */     return 0L;
/*     */   }
/*     */   
/*     */   public void write(long position, byte[] data, int start, int length)
/*     */   {
/* 157 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public long truncate(long newsize)
/*     */   {
/* 162 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public class Download
/*     */   {
/*     */     private int index;
/*     */     private String spec;
/*     */     private byte[] data;
/*     */     
/*     */     public Download(int index) {
/* 172 */       this.index = index;
/* 173 */       this.spec = Utils.formatPartial(HttpDirectory.this.file, index);
/*     */     }
/*     */     
/*     */     public String getSpec() {
/* 177 */       return this.spec;
/*     */     }
/*     */     
/*     */     public byte[] download() {
/* 181 */       String spec = this.spec;
/*     */       
/*     */       try
/*     */       {
/* 185 */         URL derived = new URL(HttpDirectory.this.url, spec);
/* 186 */         InputStream inputStream = HttpDirectory.this.ioSystem.openNoProgress(derived);
/* 187 */         if (inputStream != null) {
/* 188 */           System.out.println(">>" + spec);
/* 189 */           this.data = Utils.getBytes(inputStream);
/* 190 */           HttpDirectory.this.cache.setData(spec, this.data);
/*     */         }
/*     */       } catch (IOException e) {
/* 193 */         e.printStackTrace();
/*     */       }
/* 195 */       return this.data;
/*     */     }
/*     */   }
/*     */   
/*     */   public class Downloader implements Runnable {
/*     */     private String[] downloads;
/*     */     
/*     */     public Downloader(String[] downloads) {
/* 203 */       this.downloads = downloads;
/*     */     }
/*     */     
/*     */     public void exec() {
/* 207 */       Thread t = new Thread(this);
/* 208 */       t.setPriority(3);
/* 209 */       t.start();
/*     */     }
/*     */     
/*     */     public void run() {
/* 213 */       for (int i = 0; i < this.downloads.length; i++) {
/* 214 */         String download = this.downloads[i].trim();
/* 215 */         if (!download.isEmpty()) {
/*     */           try {
/* 217 */             int index = Integer.parseInt(download.trim());
/* 218 */             String spec = Utils.formatPartial(HttpDirectory.this.file, index);
/* 219 */             URL derived = new URL(HttpDirectory.this.url, spec);
/* 220 */             InputStream inputStream = HttpDirectory.this.ioSystem.openNoProgress(derived);
/* 221 */             if (inputStream != null) {
/* 222 */               System.out.println("PreLoad:" + spec);
/* 223 */               byte[] data = Utils.getBytes(inputStream);
/* 224 */               HttpDirectory.this.cache.setData(spec, data);
/*     */             }
/*     */           } catch (IOException e) {
/* 227 */             e.printStackTrace();
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private class Cache {
/* 235 */     private int limit = 128;
/* 236 */     private LinkedHashMap<String, byte[]> cache = new LinkedHashMap(256, 0.75F, true)
/*     */     {
/*     */       protected boolean removeEldestEntry(Map.Entry<String, byte[]> eldest) {
/* 239 */         return size() > HttpDirectory.Cache.this.limit;
/*     */       }
/*     */     };
/*     */     
/*     */     private Cache(int limit) {
/* 244 */       this.limit = limit;
/*     */     }
/*     */     
/*     */     public synchronized byte[] getData(String url) {
/* 248 */       return (byte[])this.cache.get(url);
/*     */     }
/*     */     
/*     */     public synchronized boolean contains(String name) {
/* 252 */       return this.cache.containsKey(name);
/*     */     }
/*     */     
/*     */     public synchronized void setData(String name, byte[] data) {
/* 256 */       this.cache.put(name, data);
/*     */     }
/*     */   }
/*     */   
/*     */   private static String createFileName(URL url) {
/* 261 */     String path = url.getPath();
/* 262 */     int last = path.lastIndexOf('/');
/* 263 */     String filename = last >= 0 ? path.substring(last) : path;
/* 264 */     return path.replace('.', '-') + filename;
/*     */   }
/*     */   
/*     */   private static Settings readSettings(IoSystem ioSystem, String file, URL url) {
/* 268 */     Settings settings = new Settings();
/*     */     try {
/* 270 */       URL set = new URL(url, file + ".settings");
/* 271 */       InputStream in = ioSystem.openNoProgress(set);
/* 272 */       if (in != null) {
/* 273 */         settings.load(in);
/*     */       }
/*     */     }
/*     */     catch (IOException e) {}
/*     */     
/* 278 */     return settings;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/io/HttpDirectory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */