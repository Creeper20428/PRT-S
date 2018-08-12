/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object3DC2Ev extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 363;
/* 11 */   public static final Function _instance = new _ZN9PixelInfo8Object3DC2Ev();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN9PixelInfo8Object3DC2Ev() { super("_ZN9PixelInfo8Object3DC2Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 18 */     call(paramInt);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     call(i);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 34 */     int i = 0;
/* 35 */     int j = 0;
/* 36 */     int k = 0;
/* 37 */     int m = 0;
/* 38 */     int n = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 43 */       MainMemory.setI32(paramInt, 12424);
/* 44 */       MainMemory.setI8(paramInt + 4, (byte)0);
/* 45 */       i = paramInt + 8;
/* 46 */       j = paramInt + 12;
/* 47 */       k = paramInt + 16;
/* 48 */       m = paramInt + 20;
/* 49 */       MainMemory.setI32(paramInt + 24, 0);
/* 50 */       MainMemory.setI32(i, 0);
/* 51 */       MainMemory.setI32(j, 0);
/* 52 */       n = paramInt + 8;
/* 53 */       MainMemory.setI32(k, n);
/* 54 */       MainMemory.setI32(m, n);
/* 55 */       MainMemory.setI32(paramInt + 28, 0);
/* 56 */       MainMemory.setF32(paramInt + 32, 0.0F);
/* 57 */       MainMemory.setF32(paramInt + 36, 0.0F);
/* 58 */       MainMemory.setF32(paramInt + 40, 0.0F);
/* 59 */       MainMemory.setI32(paramInt + 64, -1);
/* 60 */       MainMemory.setI32(paramInt + 60, -1);
/* 61 */       MainMemory.setI32(paramInt + 56, -1);
/* 62 */       MainMemory.setI32(paramInt + 52, -1);
/* 63 */       MainMemory.setI32(paramInt + 48, -1);
/* 64 */       MainMemory.setI32(paramInt + 44, -1); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3DC2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */