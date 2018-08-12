/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Arrays;
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
/*     */ public final class ObjectMemory
/*     */ {
/*     */   private int[] free;
/*     */   private Object[] elements;
/*     */   private int freed;
/*     */   private int top;
/*     */   private final int base;
/*     */   private final int shift;
/*     */   private final int mask;
/*     */   
/*     */   public ObjectMemory(int base, int end, int shift)
/*     */   {
/*  62 */     int test_mask = (1 << shift) - 1;
/*  63 */     if ((base & test_mask) != 0) throw new IllegalArgumentException("base must be multiple of 1<<shift");
/*  64 */     if ((end & test_mask) != 0) throw new IllegalArgumentException("end must be multiple of 1<<shift");
/*  65 */     this.base = base;
/*  66 */     this.shift = shift;
/*  67 */     this.mask = test_mask;
/*  68 */     this.free = new int['Ѐ'];
/*  69 */     int max_index = to_index(end);
/*  70 */     this.elements = new Object[max_index];
/*  71 */     this.top = 1;
/*     */   }
/*     */   
/*     */   public void init() {
/*  75 */     Arrays.fill(this.elements, null);
/*  76 */     Arrays.fill(this.free, 0);
/*  77 */     this.freed = 0;
/*  78 */     this.top = 1;
/*     */   }
/*     */   
/*     */   public Object load(int address) {
/*  82 */     int index = to_index(address);
/*     */     try {
/*  84 */       return this.elements[index];
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/*  86 */       System.err.printf("Address : %08X\n", new Object[] { Integer.valueOf(address) });
/*  87 */       throw aie;
/*     */     }
/*     */   }
/*     */   
/*     */   public void store(int address, Object value) {
/*  92 */     int index = to_index(address);
/*     */     try {
/*  94 */       this.elements[index] = value;
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/*  96 */       System.err.printf("Address : %08X\n", new Object[] { Integer.valueOf(address) });
/*  97 */       throw aie;
/*     */     }
/*     */   }
/*     */   
/*     */   public Object free(int address) {
/* 102 */     int index = to_index(address);
/* 103 */     Object element = this.elements[index];
/* 104 */     this.elements[index] = null;
/* 105 */     int free_index = this.freed++;
/*     */     try {
/* 107 */       this.free[free_index] = index;
/*     */     }
/*     */     catch (ArrayIndexOutOfBoundsException aie) {
/* 110 */       int[] tmp = new int[free_index + 256];
/* 111 */       System.arraycopy(this.free, 0, tmp, 0, this.free.length);
/* 112 */       this.free = tmp;
/* 113 */       this.free[free_index] = index;
/*     */     }
/* 115 */     return element;
/*     */   }
/*     */   
/*     */   private int to_index(int address) {
/* 119 */     int i = address - this.base;
/* 120 */     return i >> this.shift;
/*     */   }
/*     */   
/*     */   private int to_offset(int address) {
/* 124 */     return address - this.base & this.mask;
/*     */   }
/*     */   
/*     */   public int allocate(Object value) {
/*     */     int index;
/* 129 */     if (this.freed > 0) {
/* 130 */       int index = this.free[(--this.freed)];
/* 131 */       this.elements[index] = value;
/*     */     } else {
/* 133 */       index = this.top;
/*     */       try {
/* 135 */         this.elements[index] = value;
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 137 */         Object[] tmp = new Object[this.elements.length << 2];
/* 138 */         System.arraycopy(this.elements, 0, tmp, 0, this.elements.length);
/* 139 */         this.elements = tmp;
/* 140 */         this.elements[index] = value;
/*     */       }
/* 142 */       this.top += 1;
/*     */     }
/* 144 */     int address = to_addr(index);
/* 145 */     return address;
/*     */   }
/*     */   
/*     */   private int to_addr(int index) {
/* 149 */     return (index << this.shift) + this.base;
/*     */   }
/*     */   
/*     */   public void setI8(int addr, byte val) {
/* 153 */     int ival = val & 0xFF;
/* 154 */     int offset = to_offset(addr);
/* 155 */     StringBuilder load = (StringBuilder)load(addr);
/* 156 */     load.setCharAt(offset, (char)ival);
/*     */   }
/*     */   
/*     */   public byte getI8(int addr) {
/* 160 */     StringBuilder load = (StringBuilder)load(addr);
/* 161 */     int offset = to_offset(addr);
/*     */     try {
/* 163 */       return (byte)load.charAt(offset);
/*     */     }
/*     */     catch (StringIndexOutOfBoundsException siobe) {}
/* 166 */     return 0;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/ObjectMemory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */