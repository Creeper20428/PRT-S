/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class mem_uncompress2mem extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3054;
/* 13 */   public static final Function _instance = new mem_uncompress2mem();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public mem_uncompress2mem() { super("mem_uncompress2mem", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 20 */     return call(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int m = call(i, j, k);
/* 35 */     paramFrame.setI32(paramInt1, m);
/* 36 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 41 */     int i = 0;
/*    */     
/* 43 */     int j = 0;
/* 44 */     int k = 0;
/* 45 */     int m = 0;
/* 46 */     int n = 0;
/*    */     
/*    */ 
/* 49 */     int i1 = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 53 */       j = MainMemory.alloc(4);
/* 54 */       k = MainMemory.alloc(4);
/* 55 */       MainMemory.setI32(k, 0);
/* 56 */       m = MainMemory.getI32(512000 + paramInt3 * 44 + 8);
/* 57 */       n = MainMemory.getI32(512000 + paramInt3 * 44);
/* 58 */       if (SystemLibrary.strstr(paramInt1, 15392) != 0) {
/*    */         break label109;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 68 */       uncompress2mem.call(paramInt2, n, m, j, k);
/*    */       
/*    */       break label127;
/*    */       
/*    */       label109:
/* 73 */       zuncompress2mem.call(paramInt1, paramInt2, n, m, j, k);
/*    */       
/*    */ 
/*    */       label127:
/*    */       
/*    */ 
/* 79 */       MainMemory.setI64(512000 + paramInt3 * 44 + 24, 0L);
/* 80 */       MainMemory.setI64(512000 + paramInt3 * 44 + 32, MainMemory.getI32(j) & 0xFFFFFFFF);
/* 81 */       i = MainMemory.getI32(k);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 87 */       return i;
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/* 92 */       MainMemory.dealloc_generated(i1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_uncompress2mem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */