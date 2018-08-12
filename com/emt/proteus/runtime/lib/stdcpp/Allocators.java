/*    */ package com.emt.proteus.runtime.lib.stdcpp;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.MainMemory;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Allocators
/*    */ {
/* 37 */   public static final Allocator FOUND_OBJECT = new Allocator(1);
/* 38 */   public static final Allocator STRING_CHAR = new Allocator(2);
/*    */   
/* 40 */   private static final Allocator[] _ALLOCATORS = { FOUND_OBJECT, STRING_CHAR };
/*    */   
/*    */ 
/*    */ 
/*    */   public static Allocator loadAllocator(int address)
/*    */   {
/* 46 */     int id = MainMemory.getByte(address);
/*    */     try {
/* 48 */       return _ALLOCATORS[id];
/*    */     } catch (ArrayIndexOutOfBoundsException aie) {}
/* 50 */     return null;
/*    */   }
/*    */   
/*    */   public static void installFoundObject(int addr)
/*    */   {
/* 55 */     MainMemory.setI8(addr, (byte)0);
/*    */   }
/*    */   
/*    */   public static void uninstallFoundObject(int addr) {
/* 59 */     MainMemory.setI8(addr, (byte)0);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static class Allocator
/*    */   {
/*    */     private final int id;
/*    */     
/*    */ 
/*    */     public Allocator(int id)
/*    */     {
/* 71 */       this.id = id;
/*    */     }
/*    */     
/*    */     public void install(int addr) {
/* 75 */       MainMemory.setI8(addr, (byte)addr);
/*    */     }
/*    */     
/* 78 */     public void uninstall(int addr) { MainMemory.setI8(addr, (byte)0); }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/stdcpp/Allocators.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */