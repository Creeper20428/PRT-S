/*    */ package com.emt.proteus.lib.utils;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.util.Iterator;
/*    */ import java.util.LinkedList;
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
/*    */ public final class FileIterator
/*    */   implements Iterator<File>
/*    */ {
/*    */   private File root;
/*    */   private File last;
/*    */   private LinkedList<File> stack;
/*    */   
/*    */   public FileIterator(File root)
/*    */   {
/* 40 */     this.root = root;
/* 41 */     this.stack = new LinkedList();
/* 42 */     this.stack.push(root);
/*    */   }
/*    */   
/*    */   public File getRoot() {
/* 46 */     return this.root;
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/* 50 */     return !this.stack.isEmpty();
/*    */   }
/*    */   
/*    */   public File next() {
/* 54 */     File file = (File)this.stack.removeFirst();
/* 55 */     if (file.isDirectory()) {
/* 56 */       File[] files = file.listFiles();
/* 57 */       for (int i = files.length - 1; i >= 0; i--) {
/* 58 */         File kid = files[i];
/* 59 */         this.stack.push(kid);
/*    */       }
/*    */     }
/* 62 */     this.last = file;
/* 63 */     return file;
/*    */   }
/*    */   
/*    */   public void remove() {
/* 67 */     this.last.delete();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/FileIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */