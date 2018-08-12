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
/*    */ public class LongJmpException
/*    */   extends RtException
/*    */ {
/*    */   private final int jmp_buf_ptr;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private final int returnValue;
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
/*    */   public LongJmpException(int jmp_buf_ptr, int returnValue)
/*    */   {
/* 38 */     super("longjmp", null);
/* 39 */     this.jmp_buf_ptr = jmp_buf_ptr;
/* 40 */     this.returnValue = returnValue;
/*    */   }
/*    */   
/* 43 */   public int getJmpBufPtr() { return this.jmp_buf_ptr; }
/*    */   
/*    */   public int getReturnValue()
/*    */   {
/* 47 */     return this.returnValue;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/LongJmpException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */