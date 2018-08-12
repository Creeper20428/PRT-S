/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object3D14getSpatialSizeEv
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 443;
/* 13 */   public static final Function _instance = new _ZN9PixelInfo8Object3D14getSpatialSizeEv();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN9PixelInfo8Object3D14getSpatialSizeEv() { super("_ZN9PixelInfo8Object3D14getSpatialSizeEv", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 20 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = call(i);
/* 29 */     paramFrame.setI32(paramInt1, j);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/*    */     
/* 37 */     int j = 0;
/* 38 */     int k = 0;
/*    */     
/*    */ 
/* 41 */     int m = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 44 */       j = MainMemory.alloc(44);
/* 45 */       _ZN9PixelInfo8Object3D13getSpatialMapEv.call(j, paramInt);
/* 46 */       k = MainMemory.getI32(j + 16);
/* 47 */       MainMemory.setI32(j, 12936);
/* 48 */       _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(j + 4);
/* 49 */       return k;
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/* 56 */       MainMemory.dealloc_generated(m);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D14getSpatialSizeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */