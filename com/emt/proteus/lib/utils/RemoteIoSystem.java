/*    */ package com.emt.proteus.lib.utils;
/*    */ 
/*    */ import com.emt.proteus.lib.utils.io.FileProxy;
/*    */ import com.emt.proteus.lib.utils.io.HttpFile;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.net.MalformedURLException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RemoteIoSystem
/*    */   implements IoSystem
/*    */ {
/*    */   private URL codeBase;
/*    */   
/*    */   public RemoteIoSystem(String urlBase)
/*    */     throws MalformedURLException
/*    */   {
/* 44 */     this.codeBase = new URL(urlBase);
/*    */   }
/*    */   
/*    */   public InputStream open(URL url) throws IOException {
/* 48 */     return url.openStream();
/*    */   }
/*    */   
/* 51 */   public InputStream openNoProgress(URL url) throws IOException { return url.openStream(); }
/*    */   
/*    */   public URL getUrl(String relativeName) throws MalformedURLException {
/* 54 */     if (relativeName.startsWith("classpath://")) {
/* 55 */       String substring = relativeName.substring("classpath://".length());
/* 56 */       return Utils.getResourceUrl(substring);
/*    */     }
/* 58 */     return new URL(this.codeBase, relativeName);
/*    */   }
/*    */   
/*    */   public FileProxy getFile(String relativeName, boolean create)
/*    */     throws IOException
/*    */   {
/* 64 */     HttpFile httpFile = new HttpFile(relativeName, getUrl(relativeName));
/* 65 */     if ((create) || (httpFile.getLength() > 0L)) {
/* 66 */       return httpFile;
/*    */     }
/* 68 */     return null;
/*    */   }
/*    */   
/*    */   public boolean isProgressEnabled()
/*    */   {
/* 73 */     return false;
/*    */   }
/*    */   
/*    */   public void setProgressEnabled(boolean progressEnabled) {}
/*    */   
/*    */   public boolean exists(String fileName) throws IOException
/*    */   {
/* 80 */     return HttpFile.getContentLength(getUrl(fileName)) != 0L;
/*    */   }
/*    */   
/*    */   public InputStream createInputstream(String uri) throws IOException {
/*    */     try {
/* 85 */       return open(getUrl(uri));
/*    */     } catch (FileNotFoundException fne) {}
/* 87 */     return null;
/*    */   }
/*    */   
/*    */   public boolean isFileAccess()
/*    */   {
/* 92 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/RemoteIoSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */