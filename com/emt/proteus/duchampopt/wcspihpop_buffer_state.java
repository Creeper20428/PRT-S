/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.c.free;
/*    */ 
/*    */ public final class wcspihpop_buffer_state extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2935;
/* 12 */   public static final Function _instance = new wcspihpop_buffer_state();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public wcspihpop_buffer_state() { super("wcspihpop_buffer_state", 0, false); }
/*    */   
/*    */   public int execute()
/*    */   {
/* 19 */     call();
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, com.emt.proteus.runtime.api.Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     call();
/* 26 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call()
/*    */   {
/* 32 */     int i = 0;
/* 33 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 39 */       i = MainMemory.getI32Aligned(458832);
/* 40 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 50 */         j = MainMemory.getI32(i);
/* 51 */         if (j != 0) {
/*    */           break label56;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label113;
/*    */       
/*    */ 
/*    */ 
/*    */       label56:
/*    */       
/*    */ 
/*    */ 
/* 67 */       MainMemory.setI32(i, 0);
/* 68 */       if (MainMemory.getI32(j + 20) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 78 */         free.call(MainMemory.getI32(j + 4));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 84 */       free.call(j);
/* 85 */       MainMemory.setI32(MainMemory.getI32Aligned(458832), 0);
/*    */       
/*    */ 
/*    */       label113:
/*    */       
/*    */ 
/* 91 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcspihpop_buffer_state.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */