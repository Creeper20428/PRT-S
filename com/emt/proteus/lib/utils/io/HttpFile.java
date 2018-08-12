/*     */ package com.emt.proteus.lib.utils.io;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
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
/*     */ public final class HttpFile
/*     */   extends FileProxy
/*     */ {
/*     */   private long length;
/*     */   private final URL url;
/*     */   private String path;
/*     */   
/*     */   public HttpFile(String relativeName, URL url)
/*     */     throws IOException
/*     */   {
/*  45 */     super(relativeName);
/*  46 */     this.url = url;
/*  47 */     this.length = getContentLength(url);
/*  48 */     this.path = relativeName;
/*     */   }
/*     */   
/*     */   protected int loadImpl(long offset, byte[] dest, int dest_off, int length) throws IOException
/*     */   {
/*  53 */     return loadFragment(this.url, offset, length, dest, dest_off);
/*     */   }
/*     */   
/*     */   public long getLength() {
/*  57 */     return this.length;
/*     */   }
/*     */   
/*     */   public InputStream getInputStream() throws IOException
/*     */   {
/*  62 */     return this.url.openStream();
/*     */   }
/*     */   
/*     */ 
/*     */   public static long getContentLength(URL _url)
/*     */     throws IOException
/*     */   {
/*  69 */     HttpURLConnection connection = (HttpURLConnection)_url.openConnection();
/*  70 */     connection.setRequestMethod("HEAD");
/*     */     try {
/*  72 */       connection.connect();
/*  73 */       if (connection.getResponseCode() == 200) {
/*  74 */         return connection.getContentLength();
/*     */       }
/*     */     } finally {
/*  77 */       connection.disconnect();
/*     */     }
/*  79 */     return 0L;
/*     */   }
/*     */   
/*     */   public static int loadFragment(URL _url, long offset, int length, byte[] dest, int dest_offset)
/*     */     throws IOException
/*     */   {
/*  85 */     URL theUrl = new URL(_url, _url.getFile() + "?" + offset);
/*     */     
/*  87 */     int retries = 3;
/*  88 */     int status = -1;
/*  89 */     if (retries >= 0) {
/*  90 */       retries--;
/*     */       
/*  92 */       int read = 0;
/*  93 */       HttpURLConnection connection = (HttpURLConnection)theUrl.openConnection();
/*  94 */       connection.setUseCaches(false);
/*  95 */       String requested = " bytes=" + offset + "-" + (offset + length);
/*  96 */       connection.setRequestProperty("Range", requested);
/*     */       try {
/*  98 */         connection.connect();
/*  99 */         status = connection.getResponseCode();
/* 100 */         if ((status == 206) || (status == 200))
/*     */         {
/* 102 */           InputStream inputStream = connection.getInputStream();
/* 103 */           read = readFully(inputStream, dest, dest_offset, length);
/*     */         } else {
/* 105 */           System.out.println("Status:" + status);
/*     */         }
/*     */       } finally {
/* 108 */         connection.disconnect();
/*     */       }
/* 110 */       return read;
/*     */     }
/* 112 */     throw new IOException("Unable to get a valid response " + status);
/*     */   }
/*     */   
/*     */   public void write(long position, byte[] data, int start, int length)
/*     */   {
/* 117 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public long truncate(long newsize)
/*     */   {
/* 122 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/io/HttpFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */