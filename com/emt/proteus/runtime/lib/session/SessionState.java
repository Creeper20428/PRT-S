/*     */ package com.emt.proteus.runtime.lib.session;
/*     */ 
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.zip.GZIPInputStream;
/*     */ import java.util.zip.GZIPOutputStream;
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
/*     */ public class SessionState
/*     */   extends Settings
/*     */ {
/*     */   private String baseName;
/*     */   
/*     */   public SessionState(String baseName)
/*     */   {
/*  47 */     this.baseName = baseName;
/*     */   }
/*     */   
/*  50 */   public String getRamUri() { return stringValue("ram.uri", this.baseName + ".ram"); }
/*     */   
/*     */   public InputStream getRamInputStream() throws IOException
/*     */   {
/*  54 */     String ramUri = getRamUri();
/*  55 */     InputStream inputStream = MainCtx.getInputStream(ramUri);
/*  56 */     if (ramUri.endsWith(".gz")) {
/*  57 */       inputStream = new GZIPInputStream(inputStream);
/*     */     }
/*  59 */     return inputStream;
/*     */   }
/*     */   
/*  62 */   public OutputStream getRamOutputStream() throws IOException { return new FileOutputStream(getRamUri()); }
/*     */   
/*     */   public void save() throws IOException
/*     */   {
/*  66 */     save(getOutputStream(this.baseName + ".properties"));
/*     */   }
/*     */   
/*  69 */   public void save(OutputStream out) throws IOException { save(out, "Session State"); }
/*     */   
/*     */   public void load() throws IOException {
/*  72 */     load(getInputStream(this.baseName + ".properties"));
/*     */   }
/*     */   
/*     */   public OutputStream getOutputStream(String name) throws IOException
/*     */   {
/*  77 */     OutputStream outputStream = getOutputStreamImpl(name);
/*     */     
/*  79 */     if ((outputStream != null) && (name.endsWith(".gz"))) {
/*  80 */       outputStream = new GZIPOutputStream(outputStream);
/*     */     }
/*  82 */     return outputStream;
/*     */   }
/*     */   
/*     */   public OutputStream getRelativeOutputStream(String name) throws IOException {
/*  86 */     return getOutputStream(this.baseName + name);
/*     */   }
/*     */   
/*     */   protected OutputStream getOutputStreamImpl(String name) throws IOException {
/*  90 */     return new FileOutputStream(name);
/*     */   }
/*     */   
/*     */   public InputStream getInputStream(String name) throws IOException
/*     */   {
/*  95 */     InputStream inputStream = MainCtx.getInputStream(name);
/*  96 */     if ((inputStream != null) && (name.endsWith(".gz"))) {
/*  97 */       inputStream = new GZIPInputStream(inputStream);
/*     */     }
/*  99 */     return inputStream;
/*     */   }
/*     */   
/*     */   public InputStream getRelativeInputStream(String name) throws IOException {
/* 103 */     return getInputStream(this.baseName + name);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/session/SessionState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */