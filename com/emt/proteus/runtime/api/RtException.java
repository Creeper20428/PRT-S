/*    */ package com.emt.proteus.runtime.api;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
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
/*    */ public class RtException
/*    */   extends RuntimeException
/*    */ {
/* 36 */   private final ArrayList<Entry> elements = new ArrayList();
/*    */   
/*    */   public RtException(String message, Throwable cause) {
/* 39 */     super(message, cause);
/*    */   }
/*    */   
/*    */   public void add(int lineNumber, String function) {
/* 43 */     this.elements.add(new Entry(lineNumber, function));
/*    */   }
/*    */   
/*    */   public void dump() {
/* 47 */     Entry[] entries = getEntries();
/* 48 */     System.out.println(getMessage());
/* 49 */     for (int i = 0; i < entries.length; i++) {
/* 50 */       Entry entry = entries[i];
/* 51 */       System.out.println("   " + entry);
/*    */     }
/*    */   }
/*    */   
/*    */   public Entry[] getEntries() {
/* 56 */     return (Entry[])this.elements.toArray(new Entry[this.elements.size()]);
/*    */   }
/*    */   
/*    */   public static class Entry
/*    */   {
/*    */     private final int lineNumber;
/*    */     private final String function;
/*    */     
/*    */     public Entry(int lineNumber, String function) {
/* 65 */       this.lineNumber = lineNumber;
/* 66 */       this.function = function;
/*    */     }
/*    */     
/*    */     public String toString() {
/* 70 */       return this.function + ":" + this.lineNumber;
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/RtException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */