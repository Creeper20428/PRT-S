/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
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
/*     */ public class EObject
/*     */   extends Structure
/*     */ {
/*     */   private Env env;
/*  38 */   private int v_table_address = 0;
/*     */   private final int v_table_length;
/*     */   private int[] func_addrs;
/*     */   
/*     */   public EObject(int byteLength, int v_table_length) {
/*  43 */     super(byteLength);
/*  44 */     this.v_table_length = v_table_length;
/*     */   }
/*     */   
/*     */   public void init(Env env, int address) {
/*  48 */     super.init(address);
/*  49 */     this.env = env;
/*  50 */     if (this.v_table_length > 0) {
/*  51 */       this.v_table_address = MainMemory.getI32Aligned(address);
/*  52 */       this.func_addrs = new int[this.v_table_length];
/*  53 */       MainMemory.load(this.v_table_address, this.func_addrs, this.v_table_length);
/*     */     }
/*     */   }
/*     */   
/*     */   public Env getEnv() {
/*  58 */     return this.env;
/*     */   }
/*     */   
/*     */   protected Func findFunction(String name) {
/*  62 */     int address = this.env.getAddress(name);
/*  63 */     Function function = this.env.getFunction(address);
/*     */     
/*     */ 
/*  66 */     int argCount = function.getArgCount();
/*  67 */     int[] arguments = new int[argCount];
/*  68 */     arguments[0] = getAddress();
/*  69 */     return new Func(address, name, function, arguments, getAddress());
/*     */   }
/*     */   
/*     */   public class Func {
/*     */     private int addr;
/*     */     private int $this;
/*     */     private String name;
/*     */     private Function function;
/*     */     private int[] args;
/*     */     
/*     */     public Func(int address, String name, Function function, int[] args, int $this) {
/*  80 */       this.addr = address;
/*  81 */       this.name = name;
/*  82 */       this.function = function;
/*  83 */       this.args = args;
/*  84 */       this.$this = $this;
/*     */     }
/*     */     
/*     */     public void invoke(int arg)
/*     */     {
/*  89 */       this.function.execute(this.$this, arg);
/*     */     }
/*     */     
/*     */     public void invoke(int arg, int arg2) {
/*  93 */       this.function.execute(this.$this, arg, arg2);
/*     */     }
/*     */     
/*     */     public void invoke(int arg, int arg2, int arg3) {
/*  97 */       this.function.execute(this.$this, arg, arg2, arg3);
/*     */     }
/*     */     
/*     */     public void invoke(int arg, int arg2, int arg3, int arg4) {
/* 101 */       this.function.execute(this.$this, arg, arg2, arg3, arg4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/EObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */