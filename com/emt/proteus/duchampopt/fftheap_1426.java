/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fftheap_1426 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new fftheap_1426();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fftheap_1426() { super("fftheap_1426", 13, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong, boolean paramBoolean, int paramInt10, int paramInt11)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramLong, paramBoolean, paramInt10, paramInt11);
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
/*  47 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  60 */     paramInt4 += 2;
/*  61 */     paramInt3--;
/*  62 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  63 */     paramInt4 += 2;
/*  64 */     paramInt3--;
/*  65 */     call(i, j, k, m, n, i1, i2, i3, i4, l, bool, i5, i6);
/*  66 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong, boolean paramBoolean, int paramInt10, int paramInt11)
/*     */   {
/*  72 */     long l1 = 0L;
/*  73 */     long l2 = 0L;
/*  74 */     int i = 0;
/*  75 */     int j = 0;
/*  76 */     long l3 = 0L;
/*  77 */     int k = 0;
/*  78 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  84 */       paramInt7 /= -10;
/*  85 */       if (MainMemory.getI64(MainMemory.getI32(paramInt5) + 928) >= 1L)
/*     */       {
/*     */ 
/*     */ 
/*  89 */         l2 = 0L;
/*     */         
/*     */         for (;;)
/*     */         {
/*  93 */           l1 = l2 + 2L;
/*  94 */           l2 += 1L;
/*  95 */           i = (int)l2;
/*  96 */           ffgdesll.call(paramInt1, paramInt8, l2, paramInt9, paramInt6, paramInt4);
/*  97 */           j = (int)MainMemory.getI64(paramInt9);
/*  98 */           if (MainMemory.getI32(paramInt10) == -1)
/*     */           {
/* 100 */             j = (j + 7) / 8;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 108 */             j *= paramInt7;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           l3 = MainMemory.getI64(paramInt6);
/* 119 */           if (l3 >= 0L)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 124 */             if (l3 + j <= paramLong)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 129 */               if (j > 0)
/*     */               {
/* 131 */                 i = (int)l3;
/* 132 */                 k = 0;
/*     */                 
/*     */                 for (;;)
/*     */                 {
/* 136 */                   m = paramInt2 + (i + k);
/* 137 */                   MainMemory.setI8(m, (byte)(MainMemory.getI8(m) + 1));
/* 138 */                   k += 1;
/* 139 */                   if (k == j) { break label299;
/* 140 */                     break;
/*     */                   }
/*     */                 }
/*     */               }
/*     */               else
/*     */               {
/*     */                 break label299;
/*     */               }
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
/* 163 */           if (!paramBoolean)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 168 */             MainMemory.setI32(paramInt3, 0);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           SystemLibrary.sprintf(paramInt11, 127200, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt8) });
/* 177 */           ffxmsg.call(5, paramInt11);
/*     */           
/*     */ 
/*     */ 
/*     */           label299:
/*     */           
/*     */ 
/*     */ 
/* 185 */           if (l1 > MainMemory.getI64(MainMemory.getI32(paramInt5) + 928)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fftheap_1426.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */