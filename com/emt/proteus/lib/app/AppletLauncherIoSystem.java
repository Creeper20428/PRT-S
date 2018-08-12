/*     */ package com.emt.proteus.lib.app;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.IoSystem;
/*     */ import com.emt.proteus.lib.utils.ProgressInputStream;
/*     */ import com.emt.proteus.lib.utils.io.FileProxy;
/*     */ import com.emt.proteus.lib.utils.io.HttpDirectory;
/*     */ import com.emt.proteus.lib.utils.io.HttpFile;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
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
/*     */ public class AppletLauncherIoSystem
/*     */   implements IoSystem
/*     */ {
/*     */   private final AppletLauncher launcher;
/*     */   private URL codeBase;
/*     */   private ClassLoader classLoader;
/*     */   private boolean progressEnabled;
/*     */   
/*     */   public AppletLauncherIoSystem(AppletLauncher launcher, URL codeBase)
/*     */   {
/*  54 */     this.launcher = launcher;
/*  55 */     this.codeBase = codeBase;
/*  56 */     this.progressEnabled = true;
/*     */   }
/*     */   
/*     */   public boolean isProgressEnabled() {
/*  60 */     return this.progressEnabled;
/*     */   }
/*     */   
/*     */   public void setProgressEnabled(boolean progressEnabled) {
/*  64 */     this.progressEnabled = progressEnabled;
/*     */   }
/*     */   
/*     */   public InputStream open(final URL url) throws IOException
/*     */   {
/*  69 */     final boolean progress = this.progressEnabled;
/*  70 */     InputStream inputStream = (InputStream)AccessController.doPrivileged(new PrivilegedAction() {
/*     */       public InputStream run() {
/*     */         try {
/*  73 */           URLConnection con = url.openConnection();
/*  74 */           con.setUseCaches(true);
/*  75 */           if (progress) {
/*  76 */             return new AppletLauncherIoSystem.AppletLauncherProgressInputStream(AppletLauncherIoSystem.this, con, null);
/*     */           }
/*  78 */           return con.getInputStream();
/*     */         } catch (FileNotFoundException e) {
/*  80 */           return null;
/*     */         } catch (IOException e) {
/*  82 */           e.printStackTrace();
/*     */         }
/*  84 */         return null;
/*     */       }
/*  86 */     });
/*  87 */     return inputStream;
/*     */   }
/*     */   
/*     */   public InputStream openNoProgress(final URL url) throws IOException
/*     */   {
/*  92 */     System.out.println(url);
/*  93 */     InputStream inputStream = (InputStream)AccessController.doPrivileged(new PrivilegedAction() {
/*     */       public InputStream run() {
/*     */         try {
/*  96 */           URLConnection con = url.openConnection();
/*  97 */           con.setUseCaches(true);
/*  98 */           return con.getInputStream();
/*     */         } catch (FileNotFoundException e) {
/* 100 */           return null;
/*     */         } catch (IOException e) {
/* 102 */           e.printStackTrace();
/*     */         }
/* 104 */         return null;
/*     */       }
/* 106 */     });
/* 107 */     return inputStream;
/*     */   }
/*     */   
/*     */   public URL getUrl(String relativeName) throws MalformedURLException {
/*     */     URL result;
/*     */     URL result;
/* 113 */     if (relativeName.startsWith("classpath://")) {
/* 114 */       String substring = relativeName.substring("classpath://".length());
/* 115 */       result = getResource(substring);
/*     */     } else {
/* 117 */       result = new URL(this.codeBase, relativeName);
/*     */     }
/* 119 */     return result;
/*     */   }
/*     */   
/*     */   public FileProxy getFile(String relativeName, boolean create) throws IOException
/*     */   {
/* 124 */     FileProxy httpFile = new HttpDirectory(this, relativeName, getUrl(relativeName));
/*     */     
/* 126 */     if (httpFile.getLength() == 0L) return null;
/* 127 */     return httpFile;
/*     */   }
/*     */   
/*     */   private ClassLoader getResourceLoader() {
/* 131 */     return this.classLoader == null ? AppletLauncherIoSystem.class.getClassLoader() : this.classLoader;
/*     */   }
/*     */   
/*     */   public InputStream createInputstream(String uri) throws IOException {
/*     */     try {
/*     */       InputStream input;
/*     */       URL url;
/* 138 */       if (uri.startsWith("classpath://")) {
/* 139 */         String substring = uri.substring("classpath://".length());
/* 140 */         input = open(this.classLoader.getResource(substring));
/*     */       } else {
/* 142 */         url = getUrl(uri); }
/* 143 */       return open(url);
/*     */     }
/*     */     catch (FileNotFoundException fne) {}
/*     */     
/* 147 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   private URL getResource(String substring)
/*     */   {
/* 153 */     return getResourceLoader().getResource(substring);
/*     */   }
/*     */   
/*     */   public boolean exists(String fileName) throws IOException
/*     */   {
/* 158 */     return HttpFile.getContentLength(getUrl(fileName)) != 0L;
/*     */   }
/*     */   
/*     */   public boolean isFileAccess() {
/* 162 */     return false;
/*     */   }
/*     */   
/*     */   public void setResourceLoader(ClassLoader classLoader) {
/* 166 */     this.classLoader = classLoader;
/*     */   }
/*     */   
/*     */   private class AppletLauncherProgressInputStream
/*     */     extends ProgressInputStream
/*     */   {
/*     */     private AppletLauncherProgressInputStream(URLConnection con)
/*     */       throws IOException
/*     */     {
/* 175 */       super();
/* 176 */       AppletLauncherIoSystem.this.launcher.setFileSize((int)getSize());
/*     */     }
/*     */     
/*     */     protected void setProgress(long amount)
/*     */     {
/* 181 */       long progress = amount * 100L / getSize();
/* 182 */       AppletLauncherIoSystem.this.launcher.setFileProgress((int)progress);
/*     */     }
/*     */     
/*     */     public void close()
/*     */       throws IOException
/*     */     {
/* 188 */       super.close();
/* 189 */       AppletLauncherIoSystem.this.launcher.setFileLoaded();
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/app/AppletLauncherIoSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */