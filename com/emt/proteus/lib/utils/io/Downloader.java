/*    */ package com.emt.proteus.lib.utils.io;
/*    */ 
/*    */ import com.emt.proteus.lib.utils.Utils;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.net.URL;
/*    */ import java.net.URLConnection;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
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
/*    */ 
/*    */ 
/*    */ public class Downloader
/*    */   implements Runnable
/*    */ {
/*    */   private final Collection<URL> urls;
/*    */   
/*    */   public Downloader()
/*    */   {
/* 47 */     this.urls = new ArrayList();
/*    */   }
/*    */   
/*    */   public void add(URL url) {
/* 51 */     this.urls.add(url);
/*    */   }
/*    */   
/*    */   public void run() {
/* 55 */     for (Iterator<URL> iterator = this.urls.iterator(); iterator.hasNext();) {
/*    */       try {
/* 57 */         URL url = (URL)iterator.next();
/* 58 */         System.out.println("Downloading..." + url);
/* 59 */         URLConnection urlConnection = url.openConnection();
/* 60 */         urlConnection.setUseCaches(true);
/* 61 */         InputStream inputStream = urlConnection.getInputStream();
/* 62 */         Utils.getBytes(inputStream);
/*    */       } catch (IOException e) {
/* 64 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/io/Downloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */