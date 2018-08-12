/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffprec extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3578;
/*  13 */   public static final Function _instance = new ffprec();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffprec() { super("ffprec", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = call(i, j, k);
/*  35 */     paramFrame.setI32(paramInt1, m);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*     */     
/*     */ 
/*  51 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       j = MainMemory.alloc(81);
/*  56 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */         n = MainMemory.getI32(paramInt1);
/*  67 */         k = paramInt1 + 4;
/*  68 */         m = MainMemory.getI32(k);
/*  69 */         if (n != MainMemory.getI32(m + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */           ffmahd.call(paramInt1, n + 1, 0, paramInt3);
/*  81 */           m = MainMemory.getI32(k);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         if (MainMemory.getI64(m + 112) - MainMemory.getI64(m + 88) != 80L) {
/*     */           break label170;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         if (ffiblk.call(paramInt1, 1, 0, paramInt3) <= 0)
/*     */         {
/*     */           label170:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */           com.emt.proteus.runtime.api.SystemLibrary.strncpy(j, paramInt2, 80);
/* 110 */           MainMemory.setI8(j + 80, (byte)0);
/* 111 */           n = com.emt.proteus.runtime.api.SystemLibrary.strlen(j);
/* 112 */           if (n == 0) {
/*     */             break label288;
/*     */           } else {
/* 115 */             i1 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 124 */             paramInt2 = j + i1;
/* 125 */             if (!MathUtils.ugt((byte)(MainMemory.getI8(paramInt2) + -32), (byte)94)) {
/*     */               break label262;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */             MainMemory.setI8(paramInt2, (byte)32);
/*     */             
/*     */ 
/*     */             label262:
/*     */             
/*     */ 
/* 141 */             i1 += 1;
/* 142 */             if (i1 == n) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label288:
/*     */           
/*     */ 
/*     */ 
/* 153 */           if (!MathUtils.ult(n, 80)) {
/*     */             break label365;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */           i1 = 80 - n;
/* 164 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 171 */             MainMemory.setI8(j + (n + i2), (byte)32);
/* 172 */             i2 += 1;
/* 173 */             if (i2 == i1) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label365:
/*     */           
/*     */ 
/*     */ 
/* 184 */           ffprec_1383.call(paramInt3, k, paramInt1, j);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 190 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 201 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffprec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */