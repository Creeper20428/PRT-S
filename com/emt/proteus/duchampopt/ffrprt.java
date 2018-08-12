/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ffrprt extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2981;
/* 13 */   public static final Function _instance = new ffrprt();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffrprt() { super("ffrprt", 2, false); }
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
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 39 */     int i = 0;
/* 40 */     int j = 0;
/*    */     
/*    */ 
/* 43 */     int k = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 47 */       i = MainMemory.alloc(31);
/* 48 */       j = MainMemory.alloc(81);
/* 49 */       if (paramInt2 != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 59 */         ffgerr.call(paramInt2, i);
/* 60 */         SystemLibrary.fprintf(paramInt1, 69248, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i) });
/* 61 */         ffxmsg.call(4, j);
/* 62 */         if (MainMemory.getI8(j) != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */           for (;;)
/*    */           {
/*    */ 
/*    */ 
/*    */ 
/* 72 */             SystemLibrary.fprintf(paramInt1, 17824, new Object[] { Integer.valueOf(j) });
/* 73 */             ffxmsg.call(4, j);
/* 74 */             if (MainMemory.getI8(j) == 0)
/*    */             {
/*    */               break;
/*    */ 
/*    */             }
/*    */             
/*    */ 
/*    */           }
/*    */           
/*    */ 
/*    */         }
/*    */         
/*    */ 
/*    */       }
/*    */       
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/* 94 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffrprt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */