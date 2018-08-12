/*    */ package com.emt.proteus.lib.app;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AppletImpl
/*    */ {
/*    */   protected AppletLauncher applet;
/*    */   
/*    */   public AppletLauncher getApplet()
/*    */   {
/* 45 */     return this.applet;
/*    */   }
/*    */   
/*    */   public void setApplet(AppletLauncher applet) {
/* 49 */     this.applet = applet;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void init()
/*    */     throws IOException
/*    */   {}
/*    */   
/*    */ 
/*    */   public void execute()
/*    */     throws Exception
/*    */   {}
/*    */   
/*    */ 
/*    */   public void stop()
/*    */     throws Exception
/*    */   {}
/*    */   
/*    */ 
/*    */   public void destroy()
/*    */     throws Exception
/*    */   {}
/*    */   
/*    */ 
/*    */   public InputStream getInputStream(String uri)
/*    */     throws IOException
/*    */   {
/* 77 */     return MainCtx.getInputStream(uri);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/app/AppletImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */