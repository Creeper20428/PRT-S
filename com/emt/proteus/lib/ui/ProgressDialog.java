/*    */ package com.emt.proteus.lib.ui;
/*    */ 
/*    */ import javax.swing.JDialog;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.JProgressBar;
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
/*    */ public class ProgressDialog
/*    */ {
/*    */   private final JDialog dialog;
/*    */   private final JProgressBar progressBar;
/*    */   private final JLabel note;
/*    */   
/*    */   public ProgressDialog(String title, String message, int min, int max)
/*    */   {
/* 40 */     this.progressBar = new JProgressBar(min, max);
/* 41 */     this.note = new JLabel("...");
/* 42 */     JOptionPane pane = new JOptionPane(new Object[] { message, this.note, this.progressBar });
/* 43 */     pane.setOptions(new Object[0]);
/* 44 */     this.dialog = pane.createDialog(title);
/*    */     
/*    */ 
/*    */ 
/* 48 */     this.dialog.setModal(false);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void update(int value, String text)
/*    */   {
/* 57 */     if (text != null) {
/* 58 */       this.note.setText(text);
/*    */     }
/* 60 */     if (value != 0) {
/* 61 */       this.progressBar.setValue(value);
/*    */     } else {
/* 63 */       int v = this.progressBar.getValue();
/* 64 */       this.progressBar.setValue(v + 1);
/*    */     }
/* 66 */     this.dialog.repaint(100L);
/*    */   }
/*    */   
/*    */   public void show() {
/* 70 */     this.dialog.setVisible(true);
/*    */   }
/*    */   
/* 73 */   public void dispose() { this.dialog.dispose(); }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/ui/ProgressDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */