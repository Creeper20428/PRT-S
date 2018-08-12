/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
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
/*     */ 
/*     */ public class Structure
/*     */ {
/*     */   private final int byteSize;
/*     */   private int address;
/*     */   
/*     */   public Structure(int byteLength)
/*     */   {
/*  40 */     this.byteSize = byteLength;
/*     */   }
/*     */   
/*     */   public int getByteSize() {
/*  44 */     return this.byteSize;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void init(int address)
/*     */   {
/*  50 */     this.address = address;
/*     */   }
/*     */   
/*     */   public final boolean getBoolean(int off)
/*     */   {
/*  55 */     return MainMemory.getI1(this.address + off);
/*     */   }
/*     */   
/*     */   public final byte getByte(int off) {
/*  59 */     return MainMemory.getI8(this.address + off);
/*     */   }
/*     */   
/*     */   public final byte[] getBytes(int off, byte[] dest) {
/*  63 */     MainMemory.load(this.address + off, dest);
/*  64 */     return dest;
/*     */   }
/*     */   
/*     */   public final short getShort(int off) {
/*  68 */     return MainMemory.getI16(this.address + off);
/*     */   }
/*     */   
/*     */   public final int getInt(int off) {
/*  72 */     return MainMemory.getI32Aligned(this.address + off);
/*     */   }
/*     */   
/*     */   public final long getLong(int off) {
/*  76 */     return MainMemory.getI64Aligned(this.address + off);
/*     */   }
/*     */   
/*     */   public final String getString(int _offset) {
/*  80 */     return MainMemory.getString(this.address + _offset);
/*     */   }
/*     */   
/*     */   public final void setBoolean(int off, boolean val)
/*     */   {
/*  85 */     MainMemory.setI1(this.address + off, val);
/*     */   }
/*     */   
/*     */   public final void setByte(int off, byte val) {
/*  89 */     MainMemory.setI8(this.address + off, val);
/*     */   }
/*     */   
/*     */   public final void setShort(int off, short val) {
/*  93 */     MainMemory.setI16(this.address + off, val);
/*     */   }
/*     */   
/*     */   public final void setInt(int off, int val) {
/*  97 */     MainMemory.setI32(this.address + off, val);
/*     */   }
/*     */   
/* 100 */   public final void setLong(int off, long val) { MainMemory.setI64Aligned(this.address + off, val); }
/*     */   
/*     */   public int getAddress()
/*     */   {
/* 104 */     return this.address;
/*     */   }
/*     */   
/*     */   public int malloc() {
/* 108 */     int p = MainMemory.malloc(getByteSize(), "structure");
/* 109 */     init(p);
/* 110 */     return p;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/Structure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */