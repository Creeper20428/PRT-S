/*    */ package com.emt.proteus.lib.utils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class TypeInfo
/*    */ {
/*    */   public static final int DEFAULT = 0;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int I1_ID = 1;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int I8_ID = 2;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int I16_ID = 3;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int I32_ID = 4;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int I64_ID = 5;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int I96_ID = 6;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int I128_ID = 7;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int F32_ID = 12;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int F64_ID = 13;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int F80_ID = 14;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int F128_ID = 15;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 70 */   private static final int[] WIDTHS = { 4, 1, 1, 2, 4, 8, 12, 16, 0, 0, 0, 0, 4, 8, 10, 16 };
/*    */   
/*    */ 
/*    */ 
/* 74 */   private static final int[] MASKS = { -1, 1, 255, 65535, -1, -1 };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static int getWidth(int storeTypeId)
/*    */   {
/*    */     try
/*    */     {
/* 83 */       return WIDTHS[storeTypeId];
/*    */     } catch (ArrayIndexOutOfBoundsException aie) {}
/* 85 */     return 0;
/*    */   }
/*    */   
/*    */   public static int getMask(int typeId) {
/*    */     try {
/* 90 */       return MASKS[typeId];
/*    */     } catch (ArrayIndexOutOfBoundsException aie) {}
/* 92 */     return -1;
/*    */   }
/*    */   
/*    */   public static int intWidth(int typeId)
/*    */   {
/* 97 */     return (typeId & 0x4) == 0 ? 1 : (typeId & 0x3) + 1;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/TypeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */