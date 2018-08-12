/*    */ package com.emt.proteus.runtime.utils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pool
/*    */ {
/*    */   private int length;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private Item[] pool;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private int[] available;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private int released;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private final int increment;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public Pool(int capacity, int increment)
/*    */   {
/* 40 */     this.increment = increment;
/* 41 */     this.pool = new Item[capacity];
/* 42 */     this.length = 0;
/* 43 */     this.available = new int[''];
/*    */   }
/*    */   
/*    */   public Item acquire() { Item item;
/*    */     Item item;
/* 48 */     if (this.released > 0) {
/* 49 */       int index = this.available[(--this.released)];
/* 50 */       item = this.pool[index];
/*    */     } else {
/* 52 */       int index = this.length;
/* 53 */       item = create(index);
/*    */       try {
/* 55 */         this.pool[index] = item;
/*    */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 57 */         Item[] tmp = new Item[index + this.increment];
/* 58 */         System.arraycopy(this.pool, 0, tmp, 0, this.pool.length);
/* 59 */         this.pool[index] = item;
/* 60 */         this.pool = tmp;
/*    */       }
/* 62 */       this.length += 1;
/*    */     }
/* 64 */     item.acquired();
/* 65 */     return item;
/*    */   }
/*    */   
/*    */   protected Item create(int index) {
/* 69 */     return new Item(index);
/*    */   }
/*    */   
/*    */   public void release(Item pooled) {
/* 73 */     pooled.released();
/* 74 */     int index = pooled.index;
/*    */     try {
/* 76 */       this.available[this.released] = index;
/*    */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 78 */       int[] tmp = new int[this.released + 256];
/* 79 */       System.arraycopy(this.available, 0, tmp, 0, this.available.length);
/* 80 */       this.available = tmp;
/* 81 */       this.available[this.released] = index;
/*    */     }
/* 83 */     this.released += 1;
/*    */   }
/*    */   
/*    */   public Item getItem(int entryId) {
/* 87 */     return this.pool[entryId];
/*    */   }
/*    */   
/*    */   public static class Item {
/*    */     private final int index;
/*    */     
/* 93 */     protected Item(int index) { this.index = index; }
/*    */     
/*    */     protected void acquired() {}
/*    */     
/*    */     protected void released() {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/utils/Pool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */