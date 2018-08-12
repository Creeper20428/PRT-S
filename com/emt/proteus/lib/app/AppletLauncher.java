/*     */ package com.emt.proteus.lib.app;
/*     */ 
/*     */ import com.emt.proteus.lib.ui.UiContainer;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import com.emt.proteus.lib.utils.io.Downloader;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.HeadlessException;
/*     */ import java.awt.Image;
/*     */ import java.awt.Toolkit;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.lang.management.ManagementFactory;
/*     */ import java.lang.management.MemoryMXBean;
/*     */ import java.lang.management.MemoryUsage;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.net.URLClassLoader;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JApplet;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.SwingUtilities;
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
/*     */ public class AppletLauncher
/*     */   extends JApplet
/*     */   implements UiContainer
/*     */ {
/*     */   private JComponent ui;
/*     */   private AppletLauncherIoSystem ioAccess;
/*     */   private AppletRunner runner;
/*     */   private Thread appletThread;
/*     */   private SplashScreen splash;
/*     */   private final WebStart webStart;
/*     */   
/*     */   public AppletLauncher(WebStart webStart)
/*     */     throws HeadlessException
/*     */   {
/*  59 */     this.runner = new AppletRunner(null);
/*  60 */     this.webStart = webStart;
/*     */   }
/*     */   
/*     */   public AppletLauncher() throws HeadlessException {
/*  64 */     this.runner = new AppletRunner(null);
/*  65 */     this.webStart = null;
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/*  70 */       int index = 0;
/*  71 */       LinkedHashMap<String, String> params = new LinkedHashMap();
/*  72 */       while (index < args.length) {
/*  73 */         String arg = args[(index++)];
/*  74 */         String value = args[(index++)];
/*  75 */         params.put(arg, value);
/*     */       }
/*     */       
/*  78 */       URL codeBase = new URL((String)params.get("codeBase"));
/*  79 */       WebStart ws = new WebStart(params, codeBase, codeBase, null);
/*  80 */       AppletLauncher launcher = new AppletLauncher(ws);
/*  81 */       launcher.init();
/*  82 */       ws.show();
/*  83 */       launcher.start();
/*     */     } catch (Exception e) {
/*  85 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public URL getCodeBase()
/*     */   {
/*  91 */     return this.webStart != null ? this.webStart.getCodeBase() : super.getCodeBase();
/*     */   }
/*     */   
/*     */   public URL getDocumentBase() {
/*  95 */     return this.webStart != null ? this.webStart.getDocumentBase() : super.getDocumentBase();
/*     */   }
/*     */   
/*     */   public String getParameter(String key)
/*     */   {
/* 100 */     if (this.webStart != null) {
/* 101 */       return this.webStart.getParameter(key);
/*     */     }
/* 103 */     return super.getParameter(key);
/*     */   }
/*     */   
/*     */   public void init()
/*     */   {
/*     */     try {
/* 109 */       MemoryUsage heapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
/* 110 */       long max = heapMemoryUsage.getMax();
/* 111 */       System.out.println("MAX HEAP " + (max >> 20));
/*     */     } catch (Exception e) {
/* 113 */       e.printStackTrace();
/*     */     }
/* 115 */     baseInit();
/* 116 */     setProgressStep(0, 10, "Loading Applet");
/* 117 */     Settings settings = MainCtx.getSettings();
/* 118 */     String remoteSettings = getParameter("settings");
/*     */     try {
/* 120 */       URL url = this.ioAccess.getUrl(remoteSettings);
/* 121 */       settings.load(url);
/*     */     } catch (IOException e) {
/* 123 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public SplashScreen getSplash() {
/* 128 */     return this.splash;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void download(URL url)
/*     */     throws IOException
/*     */   {
/* 138 */     InputStream inputStream = this.ioAccess.openNoProgress(url);
/*     */     
/* 140 */     byte[] buf = new byte[81920];
/* 141 */     int amount = 0;
/*     */     try {
/* 143 */       while ((amount = inputStream.read(buf, 0, buf.length)) >= 0) {}
/*     */     }
/*     */     finally {
/* 146 */       inputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public void start()
/*     */   {
/* 152 */     this.appletThread = new Thread(this.runner);
/* 153 */     this.appletThread.start();
/*     */   }
/*     */   
/*     */   public void stop()
/*     */   {
/*     */     try {
/* 159 */       this.runner.stop();
/*     */     } catch (Exception e) {
/* 161 */       e.printStackTrace();
/*     */     }
/* 163 */     this.appletThread = null;
/*     */   }
/*     */   
/*     */   public void destroy()
/*     */   {
/*     */     try {
/* 169 */       this.runner.destroy();
/*     */     } catch (Exception e) {
/* 171 */       e.printStackTrace();
/*     */     }
/* 173 */     this.appletThread = null;
/*     */   }
/*     */   
/*     */   public void setProgressStep(int value, int range, String note)
/*     */   {
/* 178 */     this.splash.setProgressStep(value, range);
/*     */   }
/*     */   
/*     */   private void baseInit()
/*     */   {
/* 183 */     this.ioAccess = new AppletLauncherIoSystem(this, getCodeBase());
/* 184 */     MainCtx.setIoSystem(this.ioAccess);
/* 185 */     final AppletLauncher applet = this;
/*     */     
/* 187 */     Runnable runnable = new Runnable() {
/*     */       public void run() {
/*     */         try {
/* 190 */           Utils.setLookAndFeel("nimbus");
/* 191 */           Color backgroundColor = AppletLauncher.this.getColor("background");
/* 192 */           Color foregroundColor = AppletLauncher.this.getColor("foreground");
/* 193 */           applet.setForeground(foregroundColor);
/* 194 */           applet.setBackground(backgroundColor);
/* 195 */           AppletLauncher.this.splash = new SplashScreen();
/* 196 */           AppletLauncher.this.splash.setBackground(backgroundColor);
/* 197 */           AppletLauncher.this.splash.setForeground(foregroundColor);
/* 198 */           AppletLauncher.this.splash.setExplicitSize(400, 300);
/* 199 */           AppletLauncher.this.setSplash("splash");
/* 200 */           Container contentPane = AppletLauncher.this.getContentPane();
/* 201 */           contentPane.add(AppletLauncher.this.splash);
/* 202 */           MainCtx.setUiContainer(applet);
/* 203 */         } catch (Exception e) { e = 
/*     */           
/*     */ 
/* 206 */             e;e.printStackTrace();
/*     */         }
/*     */         finally {}
/*     */       }
/*     */     };
/*     */     try {
/* 210 */       SwingUtilities.invokeAndWait(runnable);
/*     */     } catch (InterruptedException e) {
/* 212 */       e.printStackTrace();
/*     */     } catch (InvocationTargetException e) {
/* 214 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void setForeground(Color foregroundColor) {
/* 219 */     if (this.webStart != null) {
/* 220 */       this.webStart.setForeground(foregroundColor);
/*     */     } else {
/* 222 */       super.setForeground(foregroundColor);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setBackground(Color foregroundColor) {
/* 227 */     if (this.webStart != null) {
/* 228 */       this.webStart.setBackground(foregroundColor);
/*     */     } else {
/* 230 */       super.setBackground(foregroundColor);
/*     */     }
/*     */   }
/*     */   
/*     */   public Color getBackground() {
/* 235 */     if (this.webStart != null) {
/* 236 */       return this.webStart.getBackground();
/*     */     }
/* 238 */     return super.getBackground();
/*     */   }
/*     */   
/*     */   public Container getContentPane()
/*     */   {
/* 243 */     return this.webStart != null ? this.webStart.getContentPane() : super.getContentPane();
/*     */   }
/*     */   
/*     */   public Color getForeground() {
/* 247 */     if (this.webStart != null) {
/* 248 */       return this.webStart.getForeground();
/*     */     }
/* 250 */     return super.getForeground();
/*     */   }
/*     */   
/*     */   private Color getColor(String colorKey)
/*     */   {
/*     */     Color color;
/*     */     try {
/* 257 */       String background = getParameter(colorKey);
/* 258 */       color = Color.decode(background);
/*     */     } catch (Exception e) {
/* 260 */       color = MainCtx.getSettings().colorValue(colorKey);
/*     */     }
/* 262 */     return color;
/*     */   }
/*     */   
/*     */   public void setUi(final JComponent ui) {
/* 266 */     this.ui = ui;
/* 267 */     final Container container = getContentPane();
/*     */     try {
/* 269 */       Runnable run = new Runnable() {
/*     */         public void run() {
/* 271 */           container.removeAll();
/* 272 */           ui.setBackground(AppletLauncher.this.getBackground());
/* 273 */           ui.setForeground(AppletLauncher.this.getForeground());
/* 274 */           container.add(ui, "Center");
/*     */           
/* 276 */           container.validate();
/*     */         }
/*     */       };
/* 279 */       if (SwingUtilities.isEventDispatchThread()) {
/* 280 */         run.run();
/*     */       } else {
/* 282 */         SwingUtilities.invokeAndWait(run);
/*     */       }
/*     */     } catch (Exception e) {
/* 285 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void showDisplay() {}
/*     */   
/*     */   public void resizeUi()
/*     */   {
/*     */     try
/*     */     {
/* 295 */       if (!SwingUtilities.isEventDispatchThread()) {
/* 296 */         Runnable run = new Runnable() {
/*     */           public void run() {
/* 298 */             AppletLauncher.this.safe_resize();
/*     */           }
/* 300 */         };
/* 301 */         SwingUtilities.invokeAndWait(run);
/*     */       } else {
/* 303 */         safe_resize();
/*     */       }
/*     */     } catch (Exception e) {
/* 306 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   private void safe_resize() {
/* 311 */     if (this.webStart == null) {
/* 312 */       Dimension dm = this.ui.getPreferredSize();
/*     */       
/* 314 */       validate();
/* 315 */       repaint();
/*     */     } else {
/* 317 */       this.webStart.resize(this.ui);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setFileSize(int size) {
/* 322 */     this.splash.setFileSize(size);
/*     */   }
/*     */   
/*     */   public void setFileProgress(int read) {
/* 326 */     this.splash.setFileProgress(read);
/*     */   }
/*     */   
/*     */   public void setFileLoaded() {
/* 330 */     this.splash.fileCompleted();
/*     */   }
/*     */   
/*     */   public ImageIcon getImageIcon(String paramName) {
/* 334 */     ImageIcon image = null;
/* 335 */     byte[] img = getContent(paramName);
/*     */     
/* 337 */     if (img == null) {
/* 338 */       System.err.println("Unable to find image " + paramName);
/* 339 */       return null;
/*     */     }
/* 341 */     return new ImageIcon(img);
/*     */   }
/*     */   
/*     */   public void setSplash(String paramName)
/*     */   {
/* 346 */     ImageIcon image = null;
/* 347 */     ImageIcon ico = getImageIcon(paramName);
/* 348 */     if (ico == null) {
/* 349 */       System.err.println("Unable to find image " + paramName);
/*     */     } else {
/* 351 */       this.splash.setImageIcon(ico);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setSplash(Image image) {
/* 356 */     this.splash.setImage(image);
/*     */   }
/*     */   
/*     */   public void setSplash(ImageIcon image) {
/* 360 */     this.splash.setImageIcon(image);
/*     */   }
/*     */   
/*     */   public InputStream open(URL url) throws IOException
/*     */   {
/* 365 */     return this.ioAccess.open(url);
/*     */   }
/*     */   
/*     */   public URL getURL(String paramName) {
/* 369 */     String value = getParameter(paramName);
/* 370 */     if (value != null) {
/*     */       try {
/* 372 */         return new URL(getDocumentBase(), value);
/*     */       } catch (MalformedURLException e) {
/* 374 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 377 */     return null;
/*     */   }
/*     */   
/*     */   public byte[] getContent(String paramName) {
/* 381 */     return getContent(getURL(paramName));
/*     */   }
/*     */   
/*     */   public byte[] getContent(final URL url) {
/* 385 */     byte[] bytes = null;
/* 386 */     if (url != null) {
/* 387 */       bytes = (byte[])AccessController.doPrivileged(new PrivilegedAction() {
/*     */         public byte[] run() {
/*     */           try {
/* 390 */             return Utils.getBytes(url.openStream());
/*     */           } catch (Exception e) {
/* 392 */             e.printStackTrace(); }
/* 393 */           return null;
/*     */         }
/*     */       });
/*     */     }
/*     */     
/* 398 */     return bytes;
/*     */   }
/*     */   
/*     */   public String getText(String paramName) {
/* 402 */     byte[] data = getContent(paramName);
/* 403 */     return data != null ? new String(data) : null;
/*     */   }
/*     */   
/*     */   private class AppletRunner implements Runnable {
/*     */     private AppletImpl appletImpl;
/*     */     
/*     */     private AppletRunner() {
/* 410 */       this.appletImpl = null;
/*     */     }
/*     */     
/*     */     private void downloadApplet() {
/*     */       try {
/* 415 */         URL base = AppletLauncher.this.getCodeBase();
/* 416 */         ClassLoader current = AppletRunner.class.getClassLoader();
/* 417 */         ClassLoader loader = current;
/* 418 */         String appletPath = AppletLauncher.this.getParameter("appletPath");
/* 419 */         if (!appletPath.trim().equals("none")) {
/* 420 */           String[] path = appletPath.split("\\s+");
/*     */           
/* 422 */           URL[] urls = new URL[path.length];
/* 423 */           for (int i = 0; i < path.length; i++) {
/* 424 */             String pe = path[i];
/* 425 */             URL url = new URL(base, pe);
/* 426 */             urls[i] = url;
/* 427 */             if (pe.endsWith(".jar")) AppletLauncher.this.download(url);
/*     */           }
/* 429 */           loader = URLClassLoader.newInstance(urls, current);
/*     */         }
/* 431 */         AppletLauncher.this.ioAccess.setResourceLoader(loader);
/* 432 */         String[] dwload = AppletLauncher.this.getParameter("download").split("\\s+");
/* 433 */         for (int i = 0; i < dwload.length; i++) {
/* 434 */           String s = dwload[i];
/* 435 */           if (!s.trim().isEmpty()) {
/* 436 */             Downloader downloader = new Downloader();
/* 437 */             String[] uris = s.split("\\s*,\\s*");
/* 438 */             for (int j = 0; j < uris.length; j++) {
/* 439 */               String relative = uris[j];
/* 440 */               if (!relative.isEmpty()) {
/* 441 */                 URL url = new URL(base, relative);
/* 442 */                 downloader.add(url);
/*     */               } }
/* 444 */             Thread thread = new Thread(downloader);
/* 445 */             thread.setPriority(3);
/* 446 */             thread.start();
/*     */           }
/*     */         }
/* 449 */         String implementation = AppletLauncher.this.getParameter("implementation");
/* 450 */         this.appletImpl = ((AppletImpl)loader.loadClass(implementation).newInstance());
/* 451 */         this.appletImpl.setApplet(AppletLauncher.this);
/* 452 */         this.appletImpl.init();
/*     */       } catch (Exception e) {
/* 454 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */     
/*     */     public void run() {
/*     */       try {
/* 460 */         Thread.sleep(500L);
/*     */       } catch (InterruptedException e) {
/* 462 */         e.printStackTrace();
/*     */       }
/* 464 */       if (this.appletImpl == null) {
/* 465 */         downloadApplet();
/*     */       }
/*     */       try {
/* 468 */         this.appletImpl.execute();
/*     */       } catch (Exception e) {
/* 470 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */     
/*     */     public void stop() throws Exception {
/* 475 */       this.appletImpl.stop();
/*     */     }
/*     */     
/*     */     public void destroy() throws Exception {
/* 479 */       this.appletImpl.destroy();
/*     */     }
/*     */   }
/*     */   
/*     */   private static class WebStart
/*     */   {
/*     */     private Map<String, String> parameters;
/*     */     private URL codeBase;
/*     */     private URL documentBase;
/*     */     private JFrame jFrame;
/*     */     
/*     */     private WebStart(Map<String, String> parameters, URL codeBase, URL documentBase) {
/* 491 */       this.parameters = parameters;
/* 492 */       this.codeBase = codeBase;
/* 493 */       this.documentBase = documentBase;
/* 494 */       this.jFrame = new JFrame();
/*     */     }
/*     */     
/*     */     public String getParameter(String key) {
/* 498 */       return (String)this.parameters.get(key);
/*     */     }
/*     */     
/*     */     public URL getDocumentBase() {
/* 502 */       return this.documentBase;
/*     */     }
/*     */     
/*     */     public URL getCodeBase() {
/* 506 */       return this.codeBase;
/*     */     }
/*     */     
/*     */     public void setForeground(Color foreground) {
/* 510 */       this.jFrame.setForeground(foreground);
/*     */     }
/*     */     
/*     */     public Color getForeground() {
/* 514 */       return this.jFrame.getForeground();
/*     */     }
/*     */     
/*     */     public Color getBackground() {
/* 518 */       return this.jFrame.getBackground();
/*     */     }
/*     */     
/*     */     public void setBackground(Color background) {
/* 522 */       this.jFrame.setBackground(background);
/*     */     }
/*     */     
/*     */     public Container getContentPane() {
/* 526 */       return this.jFrame.getContentPane();
/*     */     }
/*     */     
/*     */     public void resize(JComponent ui) {
/* 530 */       this.jFrame.pack();
/*     */     }
/*     */     
/*     */     public void show() {
/* 534 */       AppletLauncher.assignIcon(this.jFrame);
/* 535 */       this.jFrame.pack();
/* 536 */       this.jFrame.setDefaultCloseOperation(3);
/* 537 */       this.jFrame.setVisible(true);
/* 538 */       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/* 539 */       int cx = (screenSize.width - this.jFrame.getWidth()) / 2;
/* 540 */       int cy = (screenSize.height - this.jFrame.getHeight()) / 2;
/* 541 */       this.jFrame.setLocation(cx, cy);
/* 542 */       this.jFrame.setResizable(false);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void assignIcon(JFrame frame)
/*     */   {
/*     */     try {
/* 549 */       String relativeName = MainCtx.getSettings().stringValue("frame.icon");
/* 550 */       if (relativeName != null) {
/* 551 */         InputStream input = MainCtx.getInputStream(relativeName);
/* 552 */         if (input != null) {
/* 553 */           ImageIcon imageIcon = new ImageIcon(Utils.getBytes(input));
/* 554 */           frame.setIconImage(imageIcon.getImage());
/*     */         }
/*     */       }
/*     */     } catch (IOException e) {
/* 558 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/app/AppletLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */