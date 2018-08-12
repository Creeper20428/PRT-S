/*    */ package com.emt.proteus.lib.utils;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
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
/*    */ public final class NumberedList
/*    */ {
/*    */   private final Numbered[] entries;
/* 35 */   private final Numbered.LineNumber searchKey = new Numbered.LineNumber(0);
/*    */   
/* 37 */   public NumberedList(Collection collection) { this.entries = new Numbered[collection.size()];
/* 38 */     int index = 0;
/* 39 */     for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
/* 40 */       Numbered next = (Numbered)iterator.next();
/* 41 */       this.entries[(index++)] = next;
/*    */     }
/* 43 */     Arrays.sort(this.entries, Numbered.COMPARATOR);
/*    */   }
/*    */   
/*    */   public NumberedList(Object[] collection) {
/* 47 */     this.entries = new Numbered[collection.length];
/* 48 */     int index = 0;
/* 49 */     for (int i = 0; i < collection.length; i++) {
/* 50 */       Numbered o = (Numbered)collection[i];
/* 51 */       this.entries[i] = o;
/*    */     }
/* 53 */     Arrays.sort(this.entries, Numbered.COMPARATOR);
/*    */   }
/*    */   
/*    */   public int indexOf(int lineNumber) {
/* 57 */     this.searchKey.setLineNumber(lineNumber);
/* 58 */     int index = toIndex(Arrays.binarySearch(this.entries, this.searchKey, Numbered.COMPARATOR));
/* 59 */     return index;
/*    */   }
/*    */   
/*    */   public int getLength() {
/* 63 */     return this.entries.length;
/*    */   }
/*    */   
/* 66 */   public Numbered get(int index) { return this.entries[index]; }
/*    */   
/*    */   public Numbered getByLineNumber(int lineNumber) {
/*    */     try {
/* 70 */       return this.entries[indexOf(lineNumber)];
/*    */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 72 */       System.out.println(lineNumber);
/* 73 */       throw aie;
/*    */     }
/*    */   }
/*    */   
/*    */   private static int toIndex(int insertionOrIndex) {
/* 78 */     return insertionOrIndex < 0 ? -insertionOrIndex - 2 : insertionOrIndex;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/NumberedList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */