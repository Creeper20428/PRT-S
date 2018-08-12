/*    */ package com.emt.proteus.runtime.api;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ControlException
/*    */   extends RuntimeException
/*    */ {
/*    */   private final boolean snapshot;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private final int intArg;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private final String argument;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public ControlException(boolean snapshot, int intArg, String argument)
/*    */   {
/* 38 */     this.snapshot = snapshot;
/* 39 */     this.intArg = intArg;
/* 40 */     this.argument = argument;
/*    */   }
/*    */   
/* 43 */   public String getArgument() { return this.argument; }
/*    */   
/*    */   public boolean isSnapshot()
/*    */   {
/* 47 */     return this.snapshot;
/*    */   }
/*    */   
/*    */   public int getIntArg() {
/* 51 */     return this.intArg;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/ControlException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */