/*    */ package com.emt.proteus.runtime.utils;
/*    */ 
/*    */ import java.util.Arrays;
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
/*    */ public final class Items
/*    */ {
/*    */   private Object[] items;
/*    */   private int length;
/*    */   private final int increment;
/*    */   
/*    */   public Items(int capacity, int increment)
/*    */   {
/* 40 */     this.items = new Object[capacity];
/* 41 */     this.length = 0;
/* 42 */     this.increment = increment;
/*    */   }
/*    */   
/*    */   public int add(Object item) {
/* 46 */     try { this.items[this.length] = item;
/*    */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 48 */       Object[] tmp = new Object[this.items.length + this.increment];
/* 49 */       System.arraycopy(this.items, 0, tmp, 0, this.items.length);
/* 50 */       this.items = tmp;
/* 51 */       this.items[this.length] = item;
/*    */     }
/* 53 */     return this.length++;
/*    */   }
/*    */   
/*    */   public Object get(int index) {
/* 57 */     return this.items[index];
/*    */   }
/*    */   
/* 60 */   public int getLength() { return this.length; }
/*    */   
/*    */   public Object remove(int index)
/*    */   {
/* 64 */     Object val = this.items[index];
/* 65 */     int last = --this.length;
/* 66 */     this.items[index] = this.items[last];
/* 67 */     this.items[last] = null;
/* 68 */     return val;
/*    */   }
/*    */   
/* 71 */   public void clear() { this.length = 0;
/* 72 */     Arrays.fill(this.items, null);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/utils/Items.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */