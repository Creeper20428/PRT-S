/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube14initialiseCubeEPlb_257 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp4Cube14initialiseCubeEPlb_257();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp4Cube14initialiseCubeEPlb_257() { super("_ZN7duchamp4Cube14initialiseCubeEPlb_257", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, j, k, m);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 50 */       if (MainMemory.getI8(paramInt1 + 316) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 55 */         i = com.emt.proteus.runtime.api.SystemLibrary.newarray(paramInt4);
/* 56 */         j = paramInt1 + 640;
/* 57 */         MainMemory.setI32(j, i);
/* 58 */         MainMemory.setI8(paramInt3, (byte)1);
/* 59 */         if (paramInt2 > 0)
/*    */         {
/* 61 */           paramInt4 = 0;
/*    */           
/*    */ 
/*    */           for (;;)
/*    */           {
/* 66 */             MainMemory.setF32(i + (paramInt4 << 2), 0.0F);
/* 67 */             paramInt4 += 1;
/* 68 */             if (paramInt4 == paramInt2) {
/*    */               break;
/*    */             }
/*    */             
/*    */ 
/* 73 */             i = MainMemory.getI32(j);
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14initialiseCubeEPlb_257.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */