/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class deflateEnd extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3687;
/*  11 */   public static final Function _instance = new deflateEnd();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public deflateEnd() { super("deflateEnd", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = call(i);
/*  27 */     paramFrame.setI32(paramInt1, j);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  33 */     int i = 0;
/*     */     
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*  39 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       if (paramInt != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  55 */         j = paramInt + 28;
/*  56 */         k = MainMemory.getI32(j);
/*  57 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */           m = MainMemory.getI32(k + 4);
/*  68 */           switch (m)
/*     */           {
/*     */           case 42: 
/*     */             break;
/*     */           case 69: 
/*     */             break;
/*     */           case 73: 
/*     */             break;
/*     */           case 91: 
/*     */             break;
/*     */           case 103: 
/*     */             break;
/*     */           case 113: 
/*     */             break;
/*     */           case 666: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*  90 */           n = MainMemory.getI32(k + 8);
/*  91 */           if (n != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */             SystemLibrary.do_indirect(MainMemory.getI32(paramInt + 36), MainMemory.getI32(paramInt + 40), n);
/* 103 */             k = MainMemory.getI32(j);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */           i1 = MainMemory.getI32(k + 68);
/* 112 */           if (i1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */             SystemLibrary.do_indirect(MainMemory.getI32(paramInt + 36), MainMemory.getI32(paramInt + 40), i1);
/* 124 */             k = MainMemory.getI32(j);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */           i1 = MainMemory.getI32(k + 64);
/* 133 */           if (i1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */             SystemLibrary.do_indirect(MainMemory.getI32(paramInt + 36), MainMemory.getI32(paramInt + 40), i1);
/* 145 */             k = MainMemory.getI32(j);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */           n = MainMemory.getI32(k + 56);
/* 154 */           if (n != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */             SystemLibrary.do_indirect(MainMemory.getI32(paramInt + 36), MainMemory.getI32(paramInt + 40), n);
/* 166 */             k = MainMemory.getI32(j);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           SystemLibrary.do_indirect(MainMemory.getI32(paramInt + 36), MainMemory.getI32(paramInt + 40), k);
/* 175 */           MainMemory.setI32(j, 0);
/* 176 */           i = m == 113 ? -3 : 0;
/*     */           
/*     */ 
/*     */           break label434;
/*     */         }
/*     */       }
/*     */       
/* 183 */       i = -2;
/*     */       
/*     */ 
/*     */       label434:
/*     */       
/*     */ 
/* 189 */       int i2 = i; return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/deflateEnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */