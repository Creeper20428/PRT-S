/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import com.emt.proteus.runtime.lib.ExecVm;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ImplementedFunction
/*     */   extends Function
/*     */ {
/*  36 */   private static final Object[] EMPTY = new Object[0];
/*     */   private boolean throwException;
/*     */   
/*     */   public ImplementedFunction(String name, int argc) {
/*  40 */     this(name, argc, false, true);
/*     */   }
/*     */   
/*     */   public ImplementedFunction(String name) {
/*  44 */     this(name, 10, false, true);
/*     */   }
/*     */   
/*     */   public ImplementedFunction(String name, int argCount, boolean varargs) {
/*  48 */     this(name, argCount, varargs, true);
/*     */   }
/*     */   
/*     */   protected ImplementedFunction(String name, int argCount, boolean varargs, boolean throwException) {
/*  52 */     super(name, argCount, varargs);
/*  53 */     this.throwException = throwException;
/*     */   }
/*     */   
/*     */   public int exec(Env env, int[] args)
/*     */   {
/*  58 */     return invoke(env);
/*     */   }
/*     */   
/*     */   public void exec(Env env, Frame _calling, int[] argAddresses, int[] widths, int result)
/*     */   {
/*  63 */     invoke(env);
/*     */   }
/*     */   
/*     */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*     */   {
/*  68 */     ExecVm.enter(this, null);
/*     */     try {
/*     */       int return_value;
/*  71 */       switch (arg_length) {
/*     */       case 0: 
/*  73 */         return_value = execute();
/*  74 */         break;
/*     */       case 1: 
/*  76 */         return_value = execute(caller.getI32(code[pc]));
/*  77 */         break;
/*     */       case 2: 
/*  79 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]));
/*  80 */         break;
/*     */       case 3: 
/*  82 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]), caller.getI32(code[(pc + 4)]));
/*  83 */         break;
/*     */       case 4: 
/*  85 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]), caller.getI32(code[(pc + 4)]), caller.getI32(code[(pc + 6)]));
/*  86 */         break;
/*     */       case 5: 
/*  88 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]), caller.getI32(code[(pc + 4)]), caller.getI32(code[(pc + 6)]), caller.getI32(code[(pc + 8)]));
/*  89 */         break;
/*     */       case 6: 
/*  91 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]), caller.getI32(code[(pc + 4)]), caller.getI32(code[(pc + 6)]), caller.getI32(code[(pc + 8)]), caller.getI32(code[(pc + 10)]));
/*  92 */         break;
/*     */       case 7: 
/*  94 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]), caller.getI32(code[(pc + 4)]), caller.getI32(code[(pc + 6)]), caller.getI32(code[(pc + 8)]), caller.getI32(code[(pc + 10)]), caller.getI32(code[(pc + 12)]));
/*  95 */         break;
/*     */       case 8: 
/*  97 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]), caller.getI32(code[(pc + 4)]), caller.getI32(code[(pc + 6)]), caller.getI32(code[(pc + 8)]), caller.getI32(code[(pc + 10)]), caller.getI32(code[(pc + 12)]), caller.getI32(code[(pc + 14)]));
/*  98 */         break;
/*     */       case 9: 
/* 100 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]), caller.getI32(code[(pc + 4)]), caller.getI32(code[(pc + 6)]), caller.getI32(code[(pc + 8)]), caller.getI32(code[(pc + 10)]), caller.getI32(code[(pc + 12)]), caller.getI32(code[(pc + 14)]), caller.getI32(code[(pc + 16)]));
/* 101 */         break;
/*     */       case 10: 
/* 103 */         return_value = execute(caller.getI32(code[pc]), caller.getI32(code[(pc + 2)]), caller.getI32(code[(pc + 4)]), caller.getI32(code[(pc + 6)]), caller.getI32(code[(pc + 8)]), caller.getI32(code[(pc + 10)]), caller.getI32(code[(pc + 12)]), caller.getI32(code[(pc + 14)]), caller.getI32(code[(pc + 16)]), caller.getI32(code[(pc + 18)]));
/* 104 */         break;
/*     */       default: 
/* 106 */         throw new UnsupportedOperationException();
/*     */       }
/* 108 */       if (return_addr >= 0) caller.setI32(return_addr, return_value);
/*     */     } finally {
/* 110 */       ExecVm.exit(this);
/*     */     }
/* 112 */     pc += (arg_length << 1);
/* 113 */     return pc;
/*     */   }
/*     */   
/*     */   public boolean isTrace() {
/* 117 */     return false;
/*     */   }
/*     */   
/*     */   protected int invoke(Env env) {
/* 121 */     if (this.throwException) {
/* 122 */       return invokeException(env);
/*     */     }
/* 124 */     return invokeDummy(env);
/*     */   }
/*     */   
/*     */   protected int invokeException(Env env) {
/* 128 */     throw new UnsupportedOperationException(getName());
/*     */   }
/*     */   
/*     */   protected int invokeDummy(Env env) {
/* 132 */     return 0;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 136 */     return String.format("%s(%d) { compiled code }", new Object[] { this.name, Integer.valueOf(getArgCount()) });
/*     */   }
/*     */   
/*     */   public static final class NoOp extends ImplementedFunction
/*     */   {
/*     */     public NoOp(String name, int argCount) {
/* 142 */       super(argCount, false, false);
/*     */     }
/*     */     
/*     */     protected int invoke(Env env)
/*     */     {
/* 147 */       return 0;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/ImplementedFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */