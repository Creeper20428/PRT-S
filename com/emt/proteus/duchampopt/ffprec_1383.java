/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*    */ 
/*    */ public final class ffprec_1383
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 15 */   public static final Function _instance = new ffprec_1383();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public ffprec_1383() { super("ffprec_1383", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 22 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 23 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, j, k, m);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 47 */     int i = 0;
/* 48 */     int j = 0;
/* 49 */     int k = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 54 */       Jump.label(390271);
/* 55 */       i = __ctype_toupper_loc.call();
/* 56 */       MainMemory.setI8(paramInt4, (byte)MainMemory.getI32(MainMemory.getI32(i) + (MainMemory.getI8(paramInt4) << 2)));
/* 57 */       j = paramInt4 + 1;
/* 58 */       MainMemory.setI8(j, (byte)MainMemory.getI32(MainMemory.getI32(i) + (MainMemory.getI8(j) << 2)));
/* 59 */       j = paramInt4 + 2;
/* 60 */       MainMemory.setI8(j, (byte)MainMemory.getI32(MainMemory.getI32(i) + (MainMemory.getI8(j) << 2)));
/* 61 */       j = paramInt4 + 3;
/* 62 */       MainMemory.setI8(j, (byte)MainMemory.getI32(MainMemory.getI32(i) + (MainMemory.getI8(j) << 2)));
/* 63 */       j = paramInt4 + 4;
/* 64 */       MainMemory.setI8(j, (byte)MainMemory.getI32(MainMemory.getI32(i) + (MainMemory.getI8(j) << 2)));
/* 65 */       j = paramInt4 + 5;
/* 66 */       MainMemory.setI8(j, (byte)MainMemory.getI32(MainMemory.getI32(i) + (MainMemory.getI8(j) << 2)));
/* 67 */       j = paramInt4 + 6;
/* 68 */       MainMemory.setI8(j, (byte)MainMemory.getI32(MainMemory.getI32(i) + (MainMemory.getI8(j) << 2)));
/* 69 */       j = paramInt4 + 7;
/* 70 */       MainMemory.setI8(j, (byte)MainMemory.getI32(MainMemory.getI32(i) + (MainMemory.getI8(j) << 2)));
/* 71 */       fftkey.call(paramInt4, paramInt1);
/* 72 */       ffmbyt.call(paramInt3, MainMemory.getI64(MainMemory.getI32(paramInt2) + 88), 1, paramInt1);
/* 73 */       ffpbyt.call(paramInt3, 80L, paramInt4, paramInt1);
/* 74 */       if (MainMemory.getI32(paramInt1) < 1)
/*    */       {
/* 76 */         k = MainMemory.getI32(paramInt2) + 88;
/* 77 */         MainMemory.setI64(k, MainMemory.getI64(k) + 80L);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 87 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffprec_1383.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */