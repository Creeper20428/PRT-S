/*    */ package com.emt.proteus.lib.program;
/*    */ 
/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ import java.io.IOException;
/*    */ import java.util.Iterator;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
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
/*    */ public final class LinkTable
/*    */ {
/* 41 */   private LinkedHashMap<String, Integer> entries = new LinkedHashMap();
/*    */   
/*    */   public void read(DataInput input)
/*    */     throws IOException
/*    */   {
/* 46 */     int size = input.readInt();
/* 47 */     for (int i = 0; i < size; i++) {
/* 48 */       String key = input.readUTF();
/* 49 */       int val = input.readInt();
/* 50 */       registerAddress(key, val);
/*    */     }
/*    */   }
/*    */   
/*    */   public void registerAddress(String symbol, int address) {
/* 55 */     this.entries.put(symbol, Integer.valueOf(address));
/*    */   }
/*    */   
/*    */   public int getAddress(String symbol) {
/*    */     try {
/* 60 */       return ((Integer)this.entries.get(symbol)).intValue();
/*    */     } catch (NullPointerException npe) {}
/* 62 */     return 0;
/*    */   }
/*    */   
/*    */   public void write(DataOutput output) throws IOException
/*    */   {
/* 67 */     int size = this.entries.size();
/* 68 */     output.writeInt(size);
/* 69 */     Set<Map.Entry<String, Integer>> entries = this.entries.entrySet();
/* 70 */     for (Iterator<Map.Entry<String, Integer>> iterator = entries.iterator(); iterator.hasNext();)
/*    */     {
/* 72 */       Map.Entry<String, Integer> entry = (Map.Entry)iterator.next();
/* 73 */       output.writeUTF((String)entry.getKey());
/* 74 */       Integer value = (Integer)entry.getValue();
/* 75 */       output.writeInt(value.intValue());
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/program/LinkTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */