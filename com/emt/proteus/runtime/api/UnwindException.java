/*    */ package com.emt.proteus.runtime.api;
/*    */ 
/*    */ import java.io.PrintStream;
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
/*    */ public class UnwindException
/*    */   extends RuntimeException
/*    */ {
/*    */   public UnwindException() {}
/*    */   
/*    */   public UnwindException(String message)
/*    */   {
/* 37 */     super(message);
/* 38 */     System.err.println("Created UnwindException");
/* 39 */     printStackTrace();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/UnwindException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */