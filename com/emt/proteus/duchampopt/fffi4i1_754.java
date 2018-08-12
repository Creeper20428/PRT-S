/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi4i1_754 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi4i1_754();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4i1_754() { super("fffi4i1_754", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, byte paramByte, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramByte, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
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
/*  33 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, j, k, b, m, n, i1, i2, i3, bool);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, byte paramByte, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       if (paramBoolean)
/*     */       {
/*  71 */         paramBoolean = paramInt4 == 1;
/*  72 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  76 */           i = paramInt3 + paramInt4;
/*  77 */           j = paramInt1 + paramInt4;
/*  78 */           k = MainMemory.getI32(paramInt8 + (paramInt4 << 2));
/*  79 */           if (k == paramInt6)
/*     */           {
/*  81 */             MainMemory.setI32(paramInt7, 1);
/*  82 */             if (paramBoolean)
/*     */             {
/*  84 */               MainMemory.setI8(i, paramByte);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  91 */               MainMemory.setI8(j, (byte)1);
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 102 */           else if (k < 0)
/*     */           {
/* 104 */             MainMemory.setI32(paramInt5, -11);
/* 105 */             MainMemory.setI8(i, (byte)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 112 */           else if (k > 255)
/*     */           {
/* 114 */             MainMemory.setI32(paramInt5, -11);
/* 115 */             MainMemory.setI8(i, (byte)-1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 122 */             MainMemory.setI8(i, (byte)k);
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
/* 138 */           paramInt4 += 1;
/* 139 */           if (paramInt4 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4i1_754.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */