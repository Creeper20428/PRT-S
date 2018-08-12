/*     */ package com.emt.proteus.lib.utils;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.io.FileProxy;
/*     */ import com.emt.proteus.lib.utils.io.MemFile;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URI;
/*     */ import java.net.URL;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ public class MappedIoSystem
/*     */   implements IoSystem
/*     */ {
/*  42 */   private Map<String, MemFile> files = new HashMap();
/*     */   
/*     */   public void setContent(String path, byte[] content)
/*     */   {
/*  46 */     this.files.put(path, new MemFile(path, content));
/*     */   }
/*     */   
/*     */   public InputStream open(URL url) throws IOException {
/*  50 */     return url.openStream();
/*     */   }
/*     */   
/*     */   public InputStream openNoProgress(URL url) throws IOException {
/*  54 */     return url.openStream();
/*     */   }
/*     */   
/*     */   public InputStream open(File file) throws IOException {
/*  58 */     return new FileInputStream(file);
/*     */   }
/*     */   
/*     */   public boolean isProgressEnabled()
/*     */   {
/*  63 */     return false;
/*     */   }
/*     */   
/*     */   public void setProgressEnabled(boolean progressEnabled) {}
/*     */   
/*     */   public InputStream createInputstream(String uri) throws IOException
/*     */   {
/*     */     try {
/*     */       InputStream input;
/*  72 */       if (uri.startsWith("classpath://")) {
/*  73 */         String substring = uri.substring("classpath://".length());
/*  74 */         URL resource = Utils.getResourceUrl(substring);
/*  75 */         input = open(resource);
/*     */       }
/*  77 */       return getFile(uri, true).getInputStream();
/*     */     }
/*     */     catch (FileNotFoundException fne) {}
/*     */     
/*  81 */     return null;
/*     */   }
/*     */   
/*     */   public URL getUrl(String relativeName) throws MalformedURLException
/*     */   {
/*  86 */     if (relativeName.startsWith("classpath://")) {
/*  87 */       String substring = relativeName.substring("classpath://".length());
/*  88 */       return Utils.getResourceUrl(substring);
/*     */     }
/*  90 */     return new File(relativeName).toURI().toURL();
/*     */   }
/*     */   
/*     */   public FileProxy getFile(String relativeName, boolean create) throws IOException
/*     */   {
/*  95 */     if ((create) || (exists(relativeName))) {
/*  96 */       return ensurePath(relativeName);
/*     */     }
/*  98 */     return null;
/*     */   }
/*     */   
/*     */   public boolean isFileAccess() {
/* 102 */     return true;
/*     */   }
/*     */   
/*     */   public boolean exists(String fileName) throws IOException {
/* 106 */     return this.files.containsKey(fileName);
/*     */   }
/*     */   
/*     */   private MemFile ensurePath(String path) {
/* 110 */     MemFile mf = (MemFile)this.files.get(path);
/* 111 */     if (mf == null) {
/* 112 */       mf = new MemFile(path, null);
/* 113 */       this.files.put(path, mf);
/*     */     }
/* 115 */     return mf;
/*     */   }
/*     */   
/*     */   public byte[] getContent(String path) {
/* 119 */     MemFile mf = (MemFile)this.files.get(path);
/* 120 */     if (mf == null) {
/* 121 */       return new byte[0];
/*     */     }
/* 123 */     return mf.getContent();
/*     */   }
/*     */   
/*     */   public void clear()
/*     */   {
/* 128 */     this.files.clear();
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/MappedIoSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */