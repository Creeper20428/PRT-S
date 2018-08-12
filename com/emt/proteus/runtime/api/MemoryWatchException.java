/*    */ package com.emt.proteus.runtime.api;
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
/*    */ public class MemoryWatchException
/*    */   extends RuntimeException
/*    */ {
/*    */   private int address;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private int amount;
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
/*    */   public MemoryWatchException(String message, int address, int amount)
/*    */   {
/* 38 */     super(message);
/* 39 */     this.address = address;
/* 40 */     this.amount = amount;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/MemoryWatchException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */