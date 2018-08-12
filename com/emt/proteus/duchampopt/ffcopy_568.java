/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffcopy_568
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  16 */   public static final Function _instance = new ffcopy_568();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffcopy_568() { super("ffcopy_568", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     long l = 0L;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  54 */       Jump.label(280523);
/*  55 */       if (ffcphd.call(paramInt1, paramInt2, paramInt3) == 0)
/*     */       {
/*  57 */         k = MainMemory.getI32(paramInt3);
/*  58 */         if (k > 0) {
/*  59 */           m = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  65 */           m = MainMemory.getI32(paramInt1);
/*  66 */           i = paramInt1 + 4;
/*  67 */           j = MainMemory.getI32(i);
/*  68 */           if (m != MainMemory.getI32(j + 64))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */             ffmahd.call(paramInt1, m + 1, 0, paramInt3);
/*  75 */             j = MainMemory.getI32(i);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */           Jump.label(280549);
/*     */           
/*  85 */           l = MainMemory.getI64(j + 112);
/*  86 */           if (l == -1L) {
/*  87 */             m = -1;
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*  92 */             m = (int)((l - MainMemory.getI64(j + 88)) / 80L) + -1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */           Jump.label(280564);
/*     */           
/* 102 */           k = MainMemory.getI32(paramInt3);
/*     */         }
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
/* 115 */         Jump.label(280570);
/*     */         
/*     */ 
/* 118 */         if (k <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 123 */           if (m > 0)
/*     */           {
/* 125 */             ffhdef.call(paramInt2, m, paramInt3);
/* 126 */             if (m > 34)
/*     */             {
/* 128 */               ffwend.call(paramInt2, paramInt3);
/*     */             }
/*     */           }
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
/* 145 */           Jump.label(280589);
/* 146 */           ffcpdt.call(paramInt1, paramInt2, paramInt3);
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
/* 164 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcopy_568.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */