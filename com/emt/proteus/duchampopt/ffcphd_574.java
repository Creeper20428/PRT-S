/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffcphd_574 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new ffcphd_574();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffcphd_574() { super("ffcphd_574", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i, j, k, m, n, i1, i2);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  63 */       SystemLibrary.memcpy(paramInt1, 81248, 34, 1);
/*  64 */       ffpkyj.call(paramInt7, 34560, 0L, paramInt1, paramInt5);
/*  65 */       SystemLibrary.memcpy(paramInt1, 67904, 24, 1);
/*  66 */       ffpkyj.call(paramInt7, 34592, 1L, paramInt1, paramInt5);
/*  67 */       if (paramInt3 < paramInt6)
/*     */       {
/*  69 */         paramInt3 = paramInt2 * 81 + 243;
/*  70 */         paramInt2 += 4;
/*  71 */         i = 0;
/*     */         
/*     */         do
/*     */         {
/*  75 */           j = paramInt4 + (paramInt3 + i * 81);
/*  76 */           k = paramInt2 + i;
/*  77 */           m = MainMemory.getI8(j);
/*  78 */           if ((m != 69) || 
/*     */           
/*  80 */             (SystemLibrary.strncmp(j, 45696, 8) != 0))
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */             if (m >= 67)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 100 */               if ((m > 67) || 
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 105 */                 (SystemLibrary.strncmp(j, 129376, 58) != 0))
/*     */               {
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
/* 117 */                 if ((m == 67) && 
/*     */                 
/* 119 */                   (SystemLibrary.strncmp(j, 110432, 47) == 0)) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */               ffprec.call(paramInt7, j, paramInt5);
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */           i += 1;
/* 149 */         } while (k < paramInt6);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcphd_574.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */