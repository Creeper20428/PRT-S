/*     */ package com.emt.proteus.lib.ui;
/*     */ 
/*     */ import java.awt.AlphaComposite;
/*     */ import java.awt.Color;
/*     */ import java.awt.Composite;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JComponent;
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
/*     */ public class ImageViewer
/*     */   extends JComponent
/*     */ {
/*  36 */   public static final Font OVERLAY_FONT = new Font("Dialog", 1, 20);
/*  37 */   private final Object lock = new Object();
/*     */   private Image image;
/*  39 */   private Dimension explicitSize = new Dimension();
/*     */   private String message;
/*     */   private boolean grayed;
/*  42 */   private Rectangle rectangle = new Rectangle();
/*     */   private Font font;
/*     */   private FontMetrics metrics;
/*     */   
/*     */   public ImageViewer() {
/*  47 */     setOpaque(true);
/*  48 */     setDoubleBuffered(true);
/*     */   }
/*     */   
/*     */   public Image getImage() {
/*  52 */     return this.image;
/*     */   }
/*     */   
/*     */   public String getMessage() {
/*  56 */     return this.message;
/*     */   }
/*     */   
/*     */   public void setMessage(String message) {
/*  60 */     synchronized (this.lock) {
/*  61 */       this.message = message;
/*     */     }
/*  63 */     repaint();
/*     */   }
/*     */   
/*     */   public boolean isGrayed() {
/*  67 */     return this.grayed;
/*     */   }
/*     */   
/*     */   public void setGrayed(boolean grayed) {
/*  71 */     synchronized (this.lock) {
/*  72 */       this.grayed = grayed;
/*     */     }
/*  74 */     repaint();
/*     */   }
/*     */   
/*     */   public void setExplicitSize(int width, int height) {
/*  78 */     this.explicitSize.width = width;
/*  79 */     this.explicitSize.height = height;
/*  80 */     updateSizes(this.explicitSize);
/*     */   }
/*     */   
/*     */   public void setExplicitSize(Dimension explicitSize) {
/*  84 */     this.explicitSize = explicitSize;
/*  85 */     updateSizes(explicitSize);
/*     */   }
/*     */   
/*     */   private void updateSizes(Dimension dm) {
/*  89 */     setPreferredSize(dm);
/*  90 */     setMaximumSize(dm);
/*  91 */     setMinimumSize(dm);
/*  92 */     invalidate();
/*     */   }
/*     */   
/*     */   public void setImage(Image image) {
/*  96 */     this.image = image;
/*  97 */     if ((image != null) && (this.explicitSize.width <= 0)) {
/*  98 */       int width = image.getWidth(this);
/*  99 */       int height = image.getHeight(this);
/* 100 */       Dimension dm = new Dimension(width, height);
/* 101 */       updateSizes(dm);
/*     */     }
/* 103 */     repaint();
/*     */   }
/*     */   
/* 106 */   public void setImageIcon(ImageIcon image) { if (image == null) {
/* 107 */       setImage(null);
/*     */     } else {
/* 109 */       setImage(image.getImage());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/* 117 */     getBounds(this.rectangle);
/* 118 */     Image image = null;
/* 119 */     boolean grayed = false;
/* 120 */     String message = null;
/* 121 */     synchronized (this.lock) {
/* 122 */       image = this.image;
/* 123 */       grayed = this.grayed;
/* 124 */       message = this.message;
/*     */     }
/*     */     
/* 127 */     int height = this.rectangle.height;
/* 128 */     int width = this.rectangle.width;
/*     */     
/* 130 */     Graphics2D graphics2D = (Graphics2D)g;
/*     */     
/* 132 */     if (image != null) {
/* 133 */       graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
/* 134 */       g.drawImage(image, this.rectangle.x, this.rectangle.y, this.rectangle.width, this.rectangle.height, this);
/*     */     } else {
/* 136 */       g.setColor(getBackground());
/* 137 */       graphics2D.fill(this.rectangle);
/*     */     }
/* 139 */     if (grayed) {
/* 140 */       Composite comp = graphics2D.getComposite();
/* 141 */       graphics2D.setComposite(AlphaComposite.getInstance(3, 0.4F));
/* 142 */       graphics2D.setColor(Color.BLACK);
/* 143 */       graphics2D.fill(this.rectangle);
/* 144 */       graphics2D.setComposite(comp);
/*     */     }
/* 146 */     if (message != null) {
/* 147 */       if (this.metrics == null) {
/* 148 */         this.font = OVERLAY_FONT;
/* 149 */         this.metrics = getFontMetrics(this.font);
/*     */       }
/* 151 */       Font old = g.getFont();
/* 152 */       g.setFont(this.font);
/* 153 */       int swide = this.metrics.stringWidth(message);
/* 154 */       int centerx = (width - swide) / 2;
/* 155 */       int centery = height / 2;
/* 156 */       g.setColor(Color.WHITE);
/* 157 */       graphics2D.drawString(message, centerx, centery);
/* 158 */       g.setFont(old);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/ui/ImageViewer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */