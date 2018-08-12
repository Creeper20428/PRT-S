/*    */ package com.emt.proteus.lib.utils;
/*    */ 
/*    */ import com.emt.proteus.lib.utils.io.FileProxy;
/*    */ import com.emt.proteus.lib.utils.io.LocalFile;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.RandomAccessFile;
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URI;
/*    */ import java.net.URL;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DefaultIoSystem
/*    */   implements IoSystem
/*    */ {
/*    */   public InputStream open(URL url)
/*    */     throws IOException
/*    */   {
/* 42 */     return url.openStream();
/*    */   }
/*    */   
/* 45 */   public InputStream openNoProgress(URL url) throws IOException { return url.openStream(); }
/*    */   
/*    */ 
/* 48 */   public InputStream open(File file) throws IOException { return new FileInputStream(file); }
/*    */   
/*    */   public InputStream createInputstream(String uri) throws IOException {
/*    */     try {
/*    */       InputStream input;
/* 53 */       if (uri.startsWith("classpath://")) {
/* 54 */         String substring = uri.substring("classpath://".length());
/* 55 */         URL resource = Utils.getResourceUrl(substring);
/* 56 */         input = open(resource);
/*    */       }
/* 58 */       return open(new File(uri));
/*    */     }
/*    */     catch (FileNotFoundException fne) {}
/*    */     
/* 62 */     return null;
/*    */   }
/*    */   
/*    */   public URL getUrl(String relativeName) throws MalformedURLException
/*    */   {
/* 67 */     if (relativeName == null) return null;
/* 68 */     if (relativeName.startsWith("classpath://")) {
/* 69 */       String substring = relativeName.substring("classpath://".length());
/* 70 */       return Utils.getResourceUrl(substring);
/*    */     }
/* 72 */     return new File(relativeName).toURI().toURL();
/*    */   }
/*    */   
/*    */   public boolean isProgressEnabled()
/*    */   {
/* 77 */     return false;
/*    */   }
/*    */   
/*    */   public void setProgressEnabled(boolean progressEnabled) {}
/*    */   
/*    */   public FileProxy getFile(String relativeName, boolean create) throws IOException
/*    */   {
/* 84 */     File f = new File(relativeName);
/* 85 */     if ((f.exists()) || (create)) {
/* 86 */       return new LocalFile(relativeName, new RandomAccessFile(relativeName, "rw"));
/*    */     }
/* 88 */     return null;
/*    */   }
/*    */   
/*    */   public boolean isFileAccess()
/*    */   {
/* 93 */     return true;
/*    */   }
/*    */   
/*    */   public boolean exists(String fileName) throws IOException {
/* 97 */     return new File(fileName).exists();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/DefaultIoSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */