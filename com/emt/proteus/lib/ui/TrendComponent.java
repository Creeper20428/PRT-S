/*     */ package com.emt.proteus.lib.ui;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.border.Border;
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
/*     */ public class TrendComponent
/*     */   extends JComponent
/*     */ {
/*     */   private final Dimension size;
/*     */   private final Insets margin;
/*     */   private final Series[] data;
/*     */   private final Color[] colors;
/*     */   private int backgroundSeries;
/*     */   
/*     */   public TrendComponent(int scale, Color... colors)
/*     */   {
/*  48 */     this(scale, -1, colors);
/*     */   }
/*     */   
/*     */   public TrendComponent(int scale, int backgroundSeries, Color... colors) {
/*  52 */     this.backgroundSeries = backgroundSeries;
/*  53 */     this.data = new Series[colors.length];
/*  54 */     this.colors = colors;
/*  55 */     for (int i = 0; i < this.data.length; i++) {
/*  56 */       this.data[i] = new Series(scale);
/*     */     }
/*  58 */     this.size = new Dimension();
/*  59 */     this.margin = new Insets(0, 0, 0, 0);
/*  60 */     Dimension preferredSize = new Dimension(this.data[0].getLength() + 4, 36);
/*  61 */     setPreferredSize(preferredSize);
/*  62 */     setMaximumSize(preferredSize);
/*  63 */     setMinimumSize(preferredSize);
/*  64 */     setBorder(BorderFactory.createLoweredBevelBorder());
/*     */   }
/*     */   
/*     */   public void add(int[] data_values) {
/*     */     try {
/*  69 */       for (int i = 0; i < this.data.length; i++) {
/*  70 */         Series series = this.data[i];
/*  71 */         int data_value = data_values[i];
/*  72 */         if (data_value < 0)
/*  73 */           series.previousValue(i);
/*  74 */         series.add(data_value);
/*     */       }
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/*  77 */       aie.printStackTrace();
/*     */     }
/*  79 */     repaint();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void paintBorder(Graphics g) {}
/*     */   
/*     */ 
/*     */   protected void paintComponent(Graphics g)
/*     */   {
/*  89 */     int length = this.data[0].getLength();
/*  90 */     Graphics2D g2 = (Graphics2D)g;
/*  91 */     getSize(this.size);
/*  92 */     getInsets(this.margin);
/*  93 */     Border border = getBorder();
/*     */     
/*  95 */     int padding_width = this.margin.left + this.margin.right;
/*  96 */     int padding_height = this.margin.top + this.margin.bottom;
/*     */     
/*  98 */     int width = this.size.width - padding_width;
/*  99 */     int height = this.size.height - padding_height;
/* 100 */     int xscale = width / length;
/* 101 */     int adjustedWidth = xscale * length;
/* 102 */     int diff = (width - adjustedWidth) / 2;
/* 103 */     int left = this.margin.left + diff;
/* 104 */     int top = this.margin.top;
/* 105 */     int bottom = top + height - 1;
/*     */     
/* 107 */     width = adjustedWidth;
/*     */     
/* 109 */     border.paintBorder(this, g, diff, 0, width + padding_width, this.size.height);
/*     */     
/* 111 */     g.setColor(Color.BLACK);
/* 112 */     g.fillRect(left, top, width, height);
/* 113 */     drawBackgroundSeries(g2, left, top, xscale, height);
/* 114 */     for (int i = 0; i < this.data.length; i++)
/* 115 */       if (i != this.backgroundSeries) {
/* 116 */         Series series = this.data[i];
/* 117 */         Color colour = this.colors[i];
/* 118 */         drawSeries(g2, series, colour, left, bottom, xscale, height);
/*     */       }
/*     */   }
/*     */   
/*     */   private void drawSeries(Graphics2D graphics, Series series, Color colour, int left, int bottom, int xscale, int height) {
/* 123 */     graphics.setColor(colour);
/* 124 */     int dataLength = series.getDataLength();
/* 125 */     int lastY = bottom;
/* 126 */     int lastX = left;
/* 127 */     int max = series.getMax();
/* 128 */     double yscale = height / Math.max(1, max);
/* 129 */     int[] pts = new int[4];
/* 130 */     int index = series.getStartIdx();
/* 131 */     int i = 0; for (int xpos = left; i < dataLength; index++) {
/* 132 */       int scaled = Math.max(0, (int)(series.get(index) * yscale));
/* 133 */       int yvalue = bottom - scaled;
/* 134 */       if (yvalue > 0) {
/* 135 */         graphics.drawLine(lastX, lastY, xpos, yvalue);
/*     */       }
/*     */       
/* 138 */       lastY = yvalue;
/*     */       
/* 140 */       lastX = xpos;i++;xpos += xscale;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private void drawBackgroundSeries(Graphics2D graphics, int left, int top, int xscale, int height)
/*     */   {
/* 145 */     if (this.backgroundSeries < 0) return;
/* 146 */     Series series = this.data[this.backgroundSeries];
/* 147 */     graphics.setColor(this.colors[this.backgroundSeries]);
/*     */     
/* 149 */     int dataLength = series.getDataLength();
/* 150 */     int lastX = left;
/* 151 */     int index = series.getStartIdx();
/* 152 */     int i = 0; for (int xpos = left; i < dataLength; index++) {
/* 153 */       int yvalue = series.get(index);
/* 154 */       if (yvalue > 0) {
/* 155 */         graphics.fillRect(lastX, top, xscale, height);
/*     */       }
/* 157 */       lastX = xpos;i++;xpos += xscale;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static final class Series
/*     */   {
/*     */     private final int length;
/*     */     
/*     */     private final int mask;
/*     */     private long count;
/*     */     private int max;
/*     */     private int min;
/*     */     private long total;
/*     */     private long sample_total;
/*     */     private final int[] values;
/*     */     
/*     */     public Series(int scale)
/*     */     {
/* 176 */       this.length = (1 << scale);
/* 177 */       this.mask = (this.length - 1);
/* 178 */       this.values = new int[this.length];
/*     */     }
/*     */     
/*     */     public void add(int value) {
/* 182 */       int index = (int)this.count & this.mask;
/* 183 */       int old = this.values[index];
/* 184 */       this.total += value;
/* 185 */       this.sample_total += value - old;
/* 186 */       this.count += 1L;
/* 187 */       this.max = Math.max(value, this.max);
/* 188 */       this.min = Math.min(value, this.min);
/* 189 */       this.values[index] = value;
/*     */     }
/*     */     
/*     */     public int getRange() {
/* 193 */       return this.max - this.min;
/*     */     }
/*     */     
/*     */     public int getLength() {
/* 197 */       return this.length;
/*     */     }
/*     */     
/*     */     public int getDataLength() {
/* 201 */       return (int)Math.min(this.count, this.length);
/*     */     }
/*     */     
/*     */     public int getValue(int idx) {
/* 205 */       return this.values[index(idx)];
/*     */     }
/*     */     
/*     */     private int index(int idx) {
/* 209 */       return (int)(this.count < this.length ? idx & this.mask : this.count - this.length + idx & this.mask);
/*     */     }
/*     */     
/*     */     private int previousValue(int idx) {
/* 213 */       return this.values[index(idx - 1)];
/*     */     }
/*     */     
/* 216 */     public long getCount() { return this.count; }
/*     */     
/*     */     public int getMin()
/*     */     {
/* 220 */       return this.min;
/*     */     }
/*     */     
/*     */     public long getTotal() {
/* 224 */       return this.total;
/*     */     }
/*     */     
/*     */     public long getSampleTotal() {
/* 228 */       return this.sample_total;
/*     */     }
/*     */     
/*     */     public int getSampleMean() {
/* 232 */       return (int)(this.sample_total / Math.min(this.count, this.length));
/*     */     }
/*     */     
/*     */     public int getMax() {
/* 236 */       return this.max;
/*     */     }
/*     */     
/*     */     public int getStartIdx() {
/* 240 */       return this.count < this.length ? 0 : (int)(this.count & this.mask);
/*     */     }
/*     */     
/*     */     public int get(int position) {
/* 244 */       int l = position & this.mask;
/* 245 */       return this.values[l];
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/ui/TrendComponent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */