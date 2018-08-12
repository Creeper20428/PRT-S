/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class wcsp2s_1721 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new wcsp2s_1721();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public wcsp2s_1721() { super("wcsp2s_1721", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k, bool, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*     */   {
/*  46 */     double d = 0.0D;
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       d = MainMemory.getF64(paramInt2);
/*  56 */       if (paramBoolean) {
/*  57 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  61 */           j = i + 1;
/*  62 */           MainMemory.setF64(paramInt2 + (j << 3), d);
/*  63 */           if (i + 2 >= paramInt3) break;
/*  64 */           i = j;
/*     */         }
/*     */         
/*     */         break label181;
/*  68 */         d = MainMemory.getF64(paramInt1);
/*  69 */         if (paramBoolean) {
/*  70 */           i = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/*  74 */             j = i + 1;
/*  75 */             MainMemory.setF64(paramInt1 + (j << 3), d);
/*  76 */             if (i + 2 >= paramInt3) break;
/*  77 */             i = j;
/*     */           }
/*     */           
/*     */           break label181;
/*  81 */           i = MainMemory.getI32(paramInt4);
/*  82 */           if (paramBoolean) {
/*  83 */             j = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/*  87 */               k = j + 1;
/*  88 */               MainMemory.setI32(paramInt4 + (k << 2), i);
/*  89 */               if (j + 2 >= paramInt3) break;
/*  90 */               j = k;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label181:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsp2s_1721.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */