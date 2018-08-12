/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import com.emt.proteus.lib.program.FunctionData;
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
/*     */ public final class CompiledFunction
/*     */   extends Function
/*     */ {
/*     */   private final int[] compilation;
/*     */   private Frame[] frames;
/*     */   private int frameDepth;
/*     */   
/*     */   public CompiledFunction(FunctionData data)
/*     */   {
/*  39 */     super(data.getName(), data.getArgCount());
/*  40 */     this.compilation = data.getCode();
/*  41 */     this.frames = new Frame[1];
/*  42 */     Frame prototype = new Frame(data);
/*  43 */     this.frames[0] = prototype;
/*     */   }
/*     */   
/*     */   public int[] getCompilation() {
/*  47 */     return this.compilation;
/*     */   }
/*     */   
/*     */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*     */   {
/*  52 */     return ExecVm.exec_impl(env, this, caller, return_addr, return_width, arg_length, code, pc);
/*     */   }
/*     */   
/*     */   public int execute(int... arg) {
/*  56 */     return ExecVm.exec_impl(this, arg);
/*     */   }
/*     */   
/*     */   public long executeLong(int... arg) {
/*  60 */     return ExecVm.exec_impl_long(this, arg);
/*     */   }
/*     */   
/*     */   public int execute_vargs(int... args)
/*     */   {
/*  65 */     return ExecVm.exec_impl(this, args);
/*     */   }
/*     */   
/*     */   public long executeLong_vargs(int... args)
/*     */   {
/*  70 */     return ExecVm.exec_impl_long(this, args);
/*     */   }
/*     */   
/*     */   public double executeDouble_vargs(int... args) {
/*  74 */     return Double.longBitsToDouble(ExecVm.exec_impl_long(this, args));
/*     */   }
/*     */   
/*     */   private Frame createFrame() {
/*  78 */     return this.frames[0].copy();
/*     */   }
/*     */   
/*     */   public Frame acquire()
/*     */   {
/*  83 */     int depth = this.frameDepth++;
/*     */     Frame frame;
/*  85 */     try { frame = this.frames[depth];
/*     */     } catch (ArrayIndexOutOfBoundsException ae) {
/*  87 */       int i = this.frames.length + 1;
/*  88 */       Frame[] tmp = new Frame[i];
/*  89 */       System.arraycopy(this.frames, 0, tmp, 0, this.frames.length);
/*  90 */       this.frames = tmp;
/*  91 */       this.frames[depth] = createFrame();
/*  92 */       frame = this.frames[depth];
/*     */     }
/*     */     
/*  95 */     return frame;
/*     */   }
/*     */   
/*     */   public void release(Frame frame) {
/*  99 */     this.frameDepth -= 1;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 103 */     return String.format("%s (%d,%d) compiled", new Object[] { this.name, Integer.valueOf(this.compilation.length), Integer.valueOf(this.frames[0].getLength()) });
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/CompiledFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */