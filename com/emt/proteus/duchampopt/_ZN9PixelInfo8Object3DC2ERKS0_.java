/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object3DC2ERKS0_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 428;
/* 12 */   public static final Function _instance = new _ZN9PixelInfo8Object3DC2ERKS0_();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN9PixelInfo8Object3DC2ERKS0_() { super("_ZN9PixelInfo8Object3DC2ERKS0_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 19 */     call(paramInt1, paramInt2);
/* 20 */     return 0;
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
/* 31 */     call(i, j);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 38 */     int i = 0;
/* 39 */     int j = 0;
/* 40 */     int k = 0;
/* 41 */     int m = 0;
/* 42 */     int n = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       MainMemory.setI32(paramInt1, 12424);
/* 49 */       MainMemory.setI8(paramInt1 + 4, (byte)0);
/* 50 */       i = paramInt1 + 8;
/* 51 */       j = paramInt1 + 12;
/* 52 */       k = paramInt1 + 16;
/* 53 */       m = paramInt1 + 20;
/* 54 */       MainMemory.setI32(paramInt1 + 24, 0);
/* 55 */       MainMemory.setI32(i, 0);
/* 56 */       MainMemory.setI32(j, 0);
/* 57 */       n = paramInt1 + 8;
/* 58 */       MainMemory.setI32(k, n);
/* 59 */       MainMemory.setI32(m, n);
/* 60 */       if (paramInt1 != paramInt2) {
/*    */         break label115;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label269;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label115:
/*    */       
/*    */ 
/*    */ 
/* 76 */       _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EEaSERKSA_.call(paramInt1 + 4, paramInt2 + 4);
/* 77 */       MainMemory.setI32(paramInt1 + 28, MainMemory.getI32(paramInt2 + 28));
/* 78 */       MainMemory.setF32(paramInt1 + 32, MainMemory.getF32(paramInt2 + 32));
/* 79 */       MainMemory.setF32(paramInt1 + 36, MainMemory.getF32(paramInt2 + 36));
/* 80 */       MainMemory.setF32(paramInt1 + 40, MainMemory.getF32(paramInt2 + 40));
/* 81 */       MainMemory.setI32(paramInt1 + 44, MainMemory.getI32(paramInt2 + 44));
/* 82 */       MainMemory.setI32(paramInt1 + 52, MainMemory.getI32(paramInt2 + 52));
/* 83 */       MainMemory.setI32(paramInt1 + 60, MainMemory.getI32(paramInt2 + 60));
/* 84 */       MainMemory.setI32(paramInt1 + 48, MainMemory.getI32(paramInt2 + 48));
/* 85 */       MainMemory.setI32(paramInt1 + 56, MainMemory.getI32(paramInt2 + 56));
/* 86 */       MainMemory.setI32(paramInt1 + 64, MainMemory.getI32(paramInt2 + 64));
/*    */       
/*    */ 
/*    */       label269:
/*    */       
/*    */ 
/* 92 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3DC2ERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */