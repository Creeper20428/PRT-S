/*     */ package com.emt.proteus.lib.app;
/*     */ 
/*     */ import com.emt.proteus.lib.ui.CenterLayout;
/*     */ import com.emt.proteus.lib.ui.ImageViewer;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Image;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JProgressBar;
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
/*     */ public class SplashScreen
/*     */   extends JPanel
/*     */ {
/*     */   public static final int PRGBAR_PAD = 6;
/*     */   private JProgressBar overall;
/*     */   private int fileSize;
/*     */   private int base;
/*     */   private ImageViewer viewer;
/*     */   private int range;
/*     */   
/*     */   public SplashScreen()
/*     */   {
/*  48 */     setLayout(new CenterLayout());
/*  49 */     JPanel p = new JPanel(new BorderLayout());
/*  50 */     this.viewer = new ImageViewer();
/*     */     
/*  52 */     this.overall = new JProgressBar(0, 100);
/*  53 */     this.overall.setBorderPainted(false);
/*     */     
/*  55 */     p.add(this.viewer);
/*  56 */     p.add(this.overall, "South");
/*  57 */     add(p);
/*     */   }
/*     */   
/*     */   public void setImage(Image image)
/*     */   {
/*  62 */     this.viewer.setImage(image);
/*     */   }
/*     */   
/*     */   public void setImageIcon(ImageIcon icon) {
/*  66 */     this.viewer.setImageIcon(icon);
/*     */   }
/*     */   
/*     */   public Image getImage() {
/*  70 */     return this.viewer.getImage();
/*     */   }
/*     */   
/*  73 */   public void setExplicitSize(int width, int height) { this.viewer.setExplicitSize(width, height); }
/*     */   
/*     */   public void setGrayed(boolean grayed)
/*     */   {
/*  77 */     this.viewer.setGrayed(grayed);
/*     */   }
/*     */   
/*     */   public void setMessage(String message) {
/*  81 */     this.viewer.setMessage(message);
/*     */   }
/*     */   
/*     */ 
/*  85 */   public void setFileSize(int max) { this.fileSize = max; }
/*     */   
/*     */   public void setFileProgress(int filePc) {
/*  88 */     int x = this.base + filePc * this.range / 100;
/*  89 */     setValueImpl(x);
/*     */   }
/*     */   
/*     */ 
/*     */   public void fileCompleted() {}
/*     */   
/*     */   public void setProgressStep(int base, int range)
/*     */   {
/*  97 */     this.base = base;
/*  98 */     this.range = range;
/*  99 */     setValueImpl(base);
/*     */   }
/*     */   
/*     */   private int setValueImpl(int val)
/*     */   {
/* 104 */     int value = this.overall.getValue();
/* 105 */     if (value <= val) {
/* 106 */       this.overall.setValue(val);
/* 107 */       return val;
/*     */     }
/* 109 */     return value;
/*     */   }
/*     */   
/*     */   public void refresh()
/*     */   {
/* 114 */     setImage(this.viewer.getImage());
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/app/SplashScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */