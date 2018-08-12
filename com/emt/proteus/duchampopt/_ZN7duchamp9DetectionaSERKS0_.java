/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp9DetectionaSERKS0_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 841;
/* 13 */   public static final Function _instance = new _ZN7duchamp9DetectionaSERKS0_();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp9DetectionaSERKS0_() { super("_ZN7duchamp9DetectionaSERKS0_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     call(paramInt1, paramInt2);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, j);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 43 */       _ZN9PixelInfo8Object3DaSERKS0_.call(paramInt1, paramInt2);
/* 44 */       MainMemory.setI32(paramInt1 + 68, MainMemory.getI32(paramInt2 + 68));
/* 45 */       MainMemory.setI32(paramInt1 + 72, MainMemory.getI32(paramInt2 + 72));
/* 46 */       MainMemory.setI32(paramInt1 + 76, MainMemory.getI32(paramInt2 + 76));
/* 47 */       MainMemory.setI8(paramInt1 + 80, MainMemory.getI8(paramInt2 + 80));
/* 48 */       MainMemory.setF32(paramInt1 + 84, MainMemory.getF32(paramInt2 + 84));
/* 49 */       MainMemory.setF64(paramInt1 + 88, MainMemory.getF64(paramInt2 + 88));
/* 50 */       MainMemory.setF32(paramInt1 + 96, MainMemory.getF32(paramInt2 + 96));
/* 51 */       MainMemory.setI32(paramInt1 + 100, MainMemory.getI32(paramInt2 + 100));
/* 52 */       MainMemory.setI32(paramInt1 + 104, MainMemory.getI32(paramInt2 + 104));
/* 53 */       MainMemory.setI32(paramInt1 + 108, MainMemory.getI32(paramInt2 + 108));
/* 54 */       MainMemory.setF32(paramInt1 + 112, MainMemory.getF32(paramInt2 + 112));
/* 55 */       MainMemory.setF32(paramInt1 + 116, MainMemory.getF32(paramInt2 + 116));
/* 56 */       MainMemory.setF32(paramInt1 + 120, MainMemory.getF32(paramInt2 + 120));
/* 57 */       MainMemory.setF32(paramInt1 + 124, MainMemory.getF32(paramInt2 + 124));
/* 58 */       _ZNSsaSERKSs.call(paramInt1 + 128, paramInt2 + 128);
/* 59 */       MainMemory.setI8(paramInt1 + 132, MainMemory.getI8(paramInt2 + 132));
/* 60 */       _ZNSsaSERKSs.call(paramInt1 + 136, paramInt2 + 136);
/* 61 */       MainMemory.setI32(paramInt1 + 140, MainMemory.getI32(paramInt2 + 140));
/* 62 */       _ZNSsaSERKSs.call(paramInt1 + 144, paramInt2 + 144);
/* 63 */       MainMemory.setI8(paramInt1 + 148, MainMemory.getI8(paramInt2 + 148));
/* 64 */       MainMemory.setI8(paramInt1 + 188, MainMemory.getI8(paramInt2 + 188));
/* 65 */       _ZNSsaSERKSs.call(paramInt1 + 152, paramInt2 + 152);
/* 66 */       _ZNSsaSERKSs.call(paramInt1 + 156, paramInt2 + 156);
/* 67 */       MainMemory.setF32(paramInt1 + 160, MainMemory.getF32(paramInt2 + 160));
/* 68 */       MainMemory.setF32(paramInt1 + 164, MainMemory.getF32(paramInt2 + 164));
/* 69 */       MainMemory.setF32(paramInt1 + 168, MainMemory.getF32(paramInt2 + 168));
/* 70 */       MainMemory.setF32(paramInt1 + 172, MainMemory.getF32(paramInt2 + 172));
/* 71 */       MainMemory.setF32(paramInt1 + 176, MainMemory.getF32(paramInt2 + 176));
/* 72 */       MainMemory.setF32(paramInt1 + 180, MainMemory.getF32(paramInt2 + 180));
/* 73 */       MainMemory.setF32(paramInt1 + 184, MainMemory.getF32(paramInt2 + 184));
/* 74 */       _ZNSsaSERKSs.call(paramInt1 + 192, paramInt2 + 192);
/* 75 */       _ZNSsaSERKSs.call(paramInt1 + 196, paramInt2 + 196);
/* 76 */       _ZNSsaSERKSs.call(paramInt1 + 200, paramInt2 + 200);
/* 77 */       _ZNSsaSERKSs.call(paramInt1 + 204, paramInt2 + 204);
/* 78 */       _ZNSsaSERKSs.call(paramInt1 + 208, paramInt2 + 208);
/* 79 */       MainMemory.setF32(paramInt1 + 212, MainMemory.getF32(paramInt2 + 212));
/* 80 */       MainMemory.setF32(paramInt1 + 216, MainMemory.getF32(paramInt2 + 216));
/* 81 */       MainMemory.setF32(paramInt1 + 220, MainMemory.getF32(paramInt2 + 220));
/* 82 */       MainMemory.setF32(paramInt1 + 224, MainMemory.getF32(paramInt2 + 224));
/* 83 */       MainMemory.setF32(paramInt1 + 236, MainMemory.getF32(paramInt2 + 236));
/* 84 */       MainMemory.setF32(paramInt1 + 228, MainMemory.getF32(paramInt2 + 228));
/* 85 */       MainMemory.setF32(paramInt1 + 232, MainMemory.getF32(paramInt2 + 232));
/* 86 */       MainMemory.setF32(paramInt1 + 248, MainMemory.getF32(paramInt2 + 248));
/* 87 */       MainMemory.setF32(paramInt1 + 240, MainMemory.getF32(paramInt2 + 240));
/* 88 */       MainMemory.setF32(paramInt1 + 244, MainMemory.getF32(paramInt2 + 244));
/* 89 */       MainMemory.setI32(paramInt1 + 252, MainMemory.getI32(paramInt2 + 252));
/* 90 */       MainMemory.setI32(paramInt1 + 256, MainMemory.getI32(paramInt2 + 256));
/* 91 */       MainMemory.setI32(paramInt1 + 260, MainMemory.getI32(paramInt2 + 260));
/* 92 */       MainMemory.setI32(paramInt1 + 264, MainMemory.getI32(paramInt2 + 264));
/* 93 */       MainMemory.setI32(paramInt1 + 268, MainMemory.getI32(paramInt2 + 268));
/* 94 */       MainMemory.setI32(paramInt1 + 272, MainMemory.getI32(paramInt2 + 272));
/* 95 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DetectionaSERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */