/*    */ package com.emt.proteus.lib.utils;
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
/*    */ public class HelpException
/*    */   extends Exception
/*    */ {
/*    */   private String help;
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
/*    */   public HelpException(String help)
/*    */   {
/* 36 */     this.help = help;
/*    */   }
/*    */   
/*    */   public HelpException(String message, String help) {
/* 40 */     super(message);
/* 41 */     this.help = help;
/*    */   }
/*    */   
/*    */   public HelpException(String message, Throwable cause, String help) {
/* 45 */     super(message, cause);
/* 46 */     this.help = help;
/*    */   }
/*    */   
/*    */   public HelpException(Throwable cause, String help) {
/* 50 */     super(cause);
/* 51 */     this.help = help;
/*    */   }
/*    */   
/*    */   public String getHelp() {
/* 55 */     return this.help;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/HelpException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */