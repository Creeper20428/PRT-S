/*    */ package com.emt.proteus.lib.ui;
/*    */ 
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPanel;
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
/*    */ public class CenterViewer
/*    */   extends JPanel
/*    */ {
/* 36 */   public static CenterLayout LAYOUT = new CenterLayout();
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 41 */   public CenterViewer(JComponent component) { this(component, 0, 0); }
/*    */   
/*    */   public CenterViewer(JComponent component, int horPad, int vertPad) {
/* 44 */     super(new CenterLayout(horPad, vertPad));
/* 45 */     add(component);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/ui/CenterViewer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */