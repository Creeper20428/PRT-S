/*    */ package com.emt.proteus.runtime.api;
/*    */ 
/*    */ import java.lang.reflect.Method;
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
/*    */ public class MethodFunction
/*    */   extends Function
/*    */ {
/* 34 */   private static final Object[] EMPTY = new Object[0];
/*    */   private final Method method;
/*    */   private final Class[] paramTypes;
/*    */   private final boolean varArgs;
/*    */   
/*    */   public MethodFunction(String name, Method method)
/*    */   {
/* 41 */     super(name, method.getParameterTypes().length);
/* 42 */     this.method = method;
/* 43 */     this.paramTypes = method.getParameterTypes();
/* 44 */     this.varArgs = method.isVarArgs();
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/*    */     Object[] args;
/*    */     Object[] args;
/* 51 */     if (this.varArgs) {
/* 52 */       args = toVarArgs(caller, code, pc, arg_length);
/*    */     } else {
/* 54 */       args = toVarArgs(caller, code, pc, arg_length);
/*    */     }
/*    */     try
/*    */     {
/* 58 */       result = this.method.invoke(null, args);
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/*    */       Object result;
/* 63 */       throw new ExecException("Exception", e);
/*    */     }
/* 65 */     pc += (arg_length << 1);
/* 66 */     return pc;
/*    */   }
/*    */   
/*    */   public boolean isTrace() {
/* 70 */     return false;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 74 */     return String.format("%s(%d) { compiled code }", new Object[] { this.name, Integer.valueOf(getArgCount()) });
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/MethodFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */