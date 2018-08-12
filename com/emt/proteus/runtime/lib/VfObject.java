/*    */ package com.emt.proteus.runtime.lib;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.lib.memory.EObject;
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
/*    */ public class VfObject
/*    */   extends EObject
/*    */ {
/*    */   private final String name;
/*    */   private final boolean pointer;
/*    */   
/*    */   public VfObject(String name, int byteLength, boolean isPointer, int v_table_length)
/*    */   {
/* 41 */     super(byteLength, v_table_length);
/* 42 */     this.name = name;
/* 43 */     this.pointer = isPointer;
/*    */   }
/*    */   
/*    */   public void init(Env env) {
/* 47 */     int address = env.getAddress(this.name);
/* 48 */     if (this.pointer) address = MainMemory.getI32Aligned(address);
/* 49 */     init(env, address);
/*    */   }
/*    */   
/*    */   public final void init(Env env, int address)
/*    */   {
/* 54 */     super.init(env, address);
/*    */   }
/*    */   
/*    */   public String toString() {
/* 58 */     return String.format("%s @ &%06X", new Object[] { this.name, Integer.valueOf(getAddress()) });
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/VfObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */