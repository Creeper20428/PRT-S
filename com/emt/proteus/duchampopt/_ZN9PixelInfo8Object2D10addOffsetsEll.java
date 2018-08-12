/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object2D10addOffsetsEll extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 332;
/* 11 */   public static final Function _instance = new _ZN9PixelInfo8Object2D10addOffsetsEll();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN9PixelInfo8Object2D10addOffsetsEll() { super("_ZN9PixelInfo8Object2D10addOffsetsEll", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j, k);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/* 43 */     int m = 0;
/* 44 */     int n = 0;
/* 45 */     int i1 = 0;
/* 46 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 52 */       i = MainMemory.getI32(paramInt1 + 4);
/* 53 */       j = paramInt1 + 8;
/* 54 */       if (i == MainMemory.getI32(j)) {
/*    */         break label136;
/*    */       } else {
/* 57 */         i1 = 0;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 66 */         k = i + (i1 << 4) + 4;
/* 67 */         m = i + (i1 << 4) + 8;
/* 68 */         MainMemory.setI32(k, MainMemory.getI32(k) + paramInt3);
/* 69 */         MainMemory.setI32(m, MainMemory.getI32(m) + paramInt2);
/* 70 */         i1 += 1;
/* 71 */         if (i + (i1 << 4) == MainMemory.getI32(j)) {
/*    */           break;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */       label136:
/*    */       
/*    */ 
/*    */ 
/* 82 */       n = paramInt1 + 20;
/* 83 */       i1 = MainMemory.getI32(paramInt1 + 16);
/* 84 */       f = (float)(i1 * paramInt2 & 0xFFFFFFFF);
/* 85 */       f = MainMemory.getF32(n) + f;
/* 86 */       MainMemory.setF32(n, f);
/* 87 */       k = paramInt1 + 28;
/* 88 */       MainMemory.setI32(k, MainMemory.getI32(k) + paramInt2);
/* 89 */       k = paramInt1 + 32;
/* 90 */       MainMemory.setI32(k, MainMemory.getI32(k) + paramInt2);
/* 91 */       n = paramInt1 + 24;
/* 92 */       f = (float)(i1 * paramInt3 & 0xFFFFFFFF);
/* 93 */       f = MainMemory.getF32(n) + f;
/* 94 */       MainMemory.setF32(n, f);
/* 95 */       k = paramInt1 + 36;
/* 96 */       MainMemory.setI32(k, MainMemory.getI32(k) + paramInt3);
/* 97 */       k = paramInt1 + 40;
/* 98 */       MainMemory.setI32(k, MainMemory.getI32(k) + paramInt3); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2D10addOffsetsEll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */