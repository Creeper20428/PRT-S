/*    */ package com.emt.proteus.lib.utils;
/*    */ 
/*    */ import java.util.Comparator;
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
/*    */ public abstract interface Numbered
/*    */ {
/* 36 */   public static final Comparator COMPARATOR = new Comparator()
/*    */   {
/* 38 */     public int compare(Numbered o1, Numbered o2) { return o1.getLineNumber() - o2.getLineNumber(); }
/*    */   };
/*    */   
/*    */   public abstract int getLineNumber();
/*    */   
/*    */   public static final class LineNumber implements Numbered {
/*    */     private int lineNumber;
/*    */     
/* 46 */     public LineNumber(int lineNumber) { this.lineNumber = lineNumber; }
/*    */     
/*    */     public int getLineNumber()
/*    */     {
/* 50 */       return this.lineNumber;
/*    */     }
/*    */     
/*    */     public void setLineNumber(int lineNumber) {
/* 54 */       this.lineNumber = lineNumber;
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/Numbered.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */