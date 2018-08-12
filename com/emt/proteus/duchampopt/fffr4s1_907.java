/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4s1_907 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4s1_907();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4s1_907() { super("fffr4s1_907", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, byte paramByte, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, double paramDouble1, double paramDouble2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramByte, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean, paramDouble1, paramDouble2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/*  48 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, b, k, m, n, i1, i2, bool, d1, d2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, byte paramByte, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, double paramDouble1, double paramDouble2)
/*     */   {
/*  64 */     boolean bool1 = false;
/*  65 */     boolean bool2 = false;
/*  66 */     byte b = 0;
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     int m = 0;
/*  71 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if (paramBoolean)
/*     */       {
/*  79 */         paramBoolean = paramInt4 == 1;
/*  80 */         bool1 = MathUtils.f_olt(paramDouble1, -128.49D);
/*  81 */         bool2 = MathUtils.f_ogt(paramDouble1, 127.49D);
/*  82 */         b = (byte)(int)paramDouble1;
/*  83 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           i = paramInt7 + (paramInt4 << 2);
/*  88 */           j = paramInt6 + paramInt4;
/*  89 */           k = paramInt1 + paramInt4;
/*  90 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  91 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  96 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  99 */               d = MainMemory.getF32(i);
/* 100 */               d *= paramDouble2;
/* 101 */               d += paramDouble1;
/* 102 */               if (MathUtils.f_olt(d, -128.49D))
/*     */               {
/* 104 */                 MainMemory.setI32(paramInt5, -11);
/* 105 */                 MainMemory.setI8(j, (byte)Byte.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label382;
/*     */               }
/* 111 */               else if (MathUtils.f_ogt(d, 127.49D))
/*     */               {
/* 113 */                 MainMemory.setI32(paramInt5, -11);
/* 114 */                 MainMemory.setI8(j, (byte)Byte.MAX_VALUE);
/*     */                 
/*     */                 break label382;
/*     */               }
/*     */               else
/*     */               {
/* 120 */                 MainMemory.setI8(j, (byte)(int)d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label382;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 131 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 136 */               if (bool1)
/*     */               {
/* 138 */                 MainMemory.setI32(paramInt5, -11);
/* 139 */                 MainMemory.setI8(j, (byte)Byte.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label382;
/*     */               }
/* 145 */               else if (bool2)
/*     */               {
/* 147 */                 MainMemory.setI32(paramInt5, -11);
/* 148 */                 MainMemory.setI8(j, (byte)Byte.MAX_VALUE);
/*     */                 
/*     */                 break label382;
/*     */               }
/*     */               else
/*     */               {
/* 154 */                 MainMemory.setI8(j, b); }
/* 155 */               break;
/*     */             }
/*     */             
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
/*     */ 
/* 174 */           MainMemory.setI32(paramInt2, 1);
/* 175 */           if (paramBoolean)
/*     */           {
/* 177 */             MainMemory.setI8(j, paramByte);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 184 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label382:
/*     */           
/*     */ 
/*     */ 
/* 194 */           paramInt4 += 1;
/* 195 */           if (paramInt4 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4s1_907.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */