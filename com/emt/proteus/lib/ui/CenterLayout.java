/*     */ package com.emt.proteus.lib.ui;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.LayoutManager2;
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
/*     */ public class CenterLayout
/*     */   implements LayoutManager2
/*     */ {
/*     */   private int horPad;
/*     */   private int vertPad;
/*     */   
/*     */   public CenterLayout(int horPad, int vertPad)
/*     */   {
/*  39 */     this.horPad = horPad;
/*  40 */     this.vertPad = vertPad;
/*     */   }
/*     */   
/*     */   public CenterLayout() {
/*  44 */     this(0, 0);
/*     */   }
/*     */   
/*     */   private Dimension addPadding(Dimension dimension)
/*     */   {
/*  49 */     dimension = new Dimension(dimension);
/*  50 */     dimension.width += this.horPad;
/*  51 */     dimension.height += this.vertPad;
/*  52 */     return dimension;
/*     */   }
/*     */   
/*     */   public Dimension preferredLayoutSize(Container parent) {
/*  56 */     int componentCount = parent.getComponentCount();
/*  57 */     if (componentCount > 0) {
/*  58 */       Dimension dimension = addPadding(parent.getComponent(0).getPreferredSize());
/*  59 */       return dimension;
/*     */     }
/*  61 */     return new Dimension(400, 400);
/*     */   }
/*     */   
/*     */   public Dimension minimumLayoutSize(Container parent)
/*     */   {
/*  66 */     int componentCount = parent.getComponentCount();
/*  67 */     if (componentCount > 0) {
/*  68 */       return addPadding(new Dimension(parent.getComponent(0).getPreferredSize()));
/*     */     }
/*  70 */     return new Dimension(400, 400);
/*     */   }
/*     */   
/*     */ 
/*     */   public void addLayoutComponent(Component comp, Object constraints) {}
/*     */   
/*     */ 
/*     */   public void addLayoutComponent(String name, Component comp) {}
/*     */   
/*     */   public void removeLayoutComponent(Component comp) {}
/*     */   
/*     */   public Dimension maximumLayoutSize(Container parent)
/*     */   {
/*  83 */     int componentCount = parent.getComponentCount();
/*  84 */     if (componentCount > 0) {
/*  85 */       return addPadding(parent.getComponent(0).getPreferredSize());
/*     */     }
/*  87 */     return new Dimension(400, 400);
/*     */   }
/*     */   
/*     */   public float getLayoutAlignmentX(Container target)
/*     */   {
/*  92 */     return 0.5F;
/*     */   }
/*     */   
/*     */   public float getLayoutAlignmentY(Container target) {
/*  96 */     return 0.5F;
/*     */   }
/*     */   
/*     */ 
/*     */   public void invalidateLayout(Container target) {}
/*     */   
/*     */   public void layoutContainer(Container parent)
/*     */   {
/* 104 */     int componentCount = parent.getComponentCount();
/* 105 */     if (componentCount > 0) {
/* 106 */       Dimension dm = parent.getSize();
/* 107 */       Component component = parent.getComponent(0);
/* 108 */       Dimension preferredSize = component.getPreferredSize();
/* 109 */       int compWidth = Math.min(preferredSize.width, dm.width);
/* 110 */       int compHeight = Math.min(preferredSize.height, dm.height);
/* 111 */       int x = (dm.width - compWidth) / 2;
/* 112 */       int y = (dm.height - compHeight) / 2;
/* 113 */       component.setBounds(x, y, compWidth, compHeight);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/ui/CenterLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */