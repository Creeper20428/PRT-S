/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube8reInvertEv_292 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new _ZN7duchamp4Cube8reInvertEv_292();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp4Cube8reInvertEv_292() { super("_ZN7duchamp4Cube8reInvertEv_292", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 19 */     call(paramInt);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     call(i);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/* 36 */     int j = 0;
/* 37 */     int k = 0;
/* 38 */     int m = 0;
/* 39 */     int n = 0;
/* 40 */     int i1 = 0;
/* 41 */     int i2 = 0;
/* 42 */     int i3 = 0;
/* 43 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       i = paramInt + 16;
/* 50 */       if (MainMemory.getI32(i) > 0)
/*    */       {
/* 52 */         j = paramInt + 20;
/* 53 */         k = paramInt + 32;
/* 54 */         m = paramInt + 632;
/* 55 */         n = paramInt + 628;
/* 56 */         i1 = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 60 */           i2 = i1 + 1;
/* 61 */           i3 = MainMemory.getI32(j) + (i1 << 2);
/* 62 */           if (_ZN7duchamp5Param7isBlankERf.call(k, i3) == 0)
/*    */           {
/* 64 */             f = -0.0F - MainMemory.getF32(i3);
/* 65 */             MainMemory.setF32(i3, f);
/* 66 */             if (MainMemory.getI8(m) != 0)
/*    */             {
/*    */ 
/*    */ 
/*    */ 
/* 71 */               i3 = MainMemory.getI32(n) + (i1 << 2);
/* 72 */               f = -0.0F - MainMemory.getF32(i3);
/* 73 */               MainMemory.setF32(i3, f);
/*    */             }
/*    */           }
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
/* 88 */           if (MainMemory.getI32(i) <= i2) break;
/* 89 */           i1 = i2;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube8reInvertEv_292.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */