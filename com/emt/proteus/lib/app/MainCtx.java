/*    */ package com.emt.proteus.lib.app;
/*    */ 
/*    */ import com.emt.proteus.lib.ui.UiContainer;
/*    */ import com.emt.proteus.lib.utils.DefaultIoSystem;
/*    */ import com.emt.proteus.lib.utils.IoSystem;
/*    */ import com.emt.proteus.lib.utils.Settings;
/*    */ import com.emt.proteus.lib.utils.io.FileProxy;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MainCtx
/*    */ {
/* 43 */   private static final Settings settings = new Settings();
/*    */   private static UiContainer uiContainer;
/* 45 */   private static IoSystem ioAccess = new DefaultIoSystem();
/*    */   
/*    */ 
/*    */ 
/* 49 */   public static Settings getSettings() { return settings; }
/*    */   
/*    */   public static Settings getSettings(String mainName) throws IOException {
/* 52 */     String property = settings.stringValue(mainName);
/* 53 */     Settings result = new Settings();
/* 54 */     result.load(getInputStream(property));
/* 55 */     return result;
/*    */   }
/*    */   
/*    */   public static void setUiContainer(UiContainer uiContainer) {
/* 59 */     uiContainer = uiContainer;
/*    */   }
/*    */   
/*    */   public static UiContainer getUiContainer() {
/* 63 */     return uiContainer;
/*    */   }
/*    */   
/*    */   public static IoSystem getIoSystem() {
/* 67 */     return ioAccess;
/*    */   }
/*    */   
/*    */   public static void setIoSystem(IoSystem ioAccess) {
/* 71 */     ioAccess = ioAccess;
/*    */   }
/*    */   
/*    */   public static URL getUrl(String relativeName) throws IOException
/*    */   {
/* 76 */     return ioAccess.getUrl(relativeName);
/*    */   }
/*    */   
/*    */   public static InputStream getInputStream(String uri) throws IOException
/*    */   {
/* 81 */     return ioAccess.createInputstream(uri);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static boolean isFileAccess()
/*    */   {
/* 88 */     return ioAccess.isFileAccess();
/*    */   }
/*    */   
/*    */   public static FileProxy getFile(String path) throws IOException {
/* 92 */     return ioAccess.getFile(path, true);
/*    */   }
/*    */   
/*    */   public static boolean fileExists(String fileName) throws IOException {
/* 96 */     return ioAccess.exists(fileName);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/app/MainCtx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */