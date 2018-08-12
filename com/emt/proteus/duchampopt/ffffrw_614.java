/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffffrw_614
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new ffffrw_614();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffffrw_614() { super("ffffrw_614", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m, n);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       if (MainMemory.getI8(MainMemory.getI32Aligned(470792) + MainMemory.getI32Aligned(470804) * 344 + 56 + 32) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  61 */         if (MainMemory.getI32(paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */           i = MainMemory.getI32(paramInt1);
/*  68 */           j = paramInt1 + 4;
/*  69 */           k = MainMemory.getI32(j);
/*  70 */           if (i == MainMemory.getI32(k + 64))
/*     */           {
/*  72 */             if (MainMemory.getI64(k + 112) == -1L)
/*     */             {
/*  74 */               if (ffrdef.call(paramInt1, paramInt5) > 0)
/*     */               {
/*     */ 
/*     */                 break label180;
/*     */ 
/*     */ 
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  93 */             ffmahd.call(paramInt1, i + 1, 0, paramInt5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           k = MainMemory.getI32(j);
/* 102 */           if (MainMemory.getI32(k + 68) == 0)
/*     */           {
/* 104 */             MainMemory.setI32(paramInt5, 235);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 112 */             paramInt2 = (int)MainMemory.getI64(k + 928);
/* 113 */             MainMemory.setI32(paramInt3, paramInt2);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label180:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         if (paramInt2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 134 */           MainMemory.setI32(paramInt4, 1);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffffrw_614.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */