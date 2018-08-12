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
/*    */ public final class Address
/*    */   extends Number
/*    */   implements Comparable<Address>
/*    */ {
/*    */   private final int address;
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
/*    */   public Address(int address)
/*    */   {
/* 37 */     this.address = address;
/*    */   }
/*    */   
/*    */   public int intValue()
/*    */   {
/* 42 */     return this.address;
/*    */   }
/*    */   
/*    */   public long longValue()
/*    */   {
/* 47 */     return this.address & 0xFFFFFFFF;
/*    */   }
/*    */   
/*    */   public float floatValue()
/*    */   {
/* 52 */     return this.address;
/*    */   }
/*    */   
/*    */   public double doubleValue()
/*    */   {
/* 57 */     return this.address;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 61 */     return this.address;
/*    */   }
/*    */   
/*    */   public boolean equals(Object obj) {
/* 65 */     return ((obj instanceof Address)) && (((Address)obj).address == this.address);
/*    */   }
/*    */   
/*    */   public int compareTo(Address other) {
/* 69 */     return this.address - other.address;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 73 */     return String.format("0x%X", new Object[] { Integer.valueOf(this.address) });
/*    */   }
/*    */   
/*    */   public static Address valueOf(int address) {
/* 77 */     Address the_address = new Address(address);
/* 78 */     return the_address;
/*    */   }
/*    */   
/* 81 */   public static Address valueOf(String address) { Address the_address = new Address(Integer.parseInt(address, 16));
/* 82 */     return the_address;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/Address.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */