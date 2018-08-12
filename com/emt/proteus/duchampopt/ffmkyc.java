/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffmkyc
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3484;
/*  16 */   public static final Function _instance = new ffmkyc();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffmkyc() { super("ffmkyc", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = call(i, j, k, m, n);
/*  44 */     paramFrame.setI32(paramInt1, i1);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int i = 0;
/*     */     
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*     */     
/*     */ 
/*  60 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       j = MainMemory.alloc(81);
/*  65 */       k = MainMemory.alloc(71);
/*  66 */       m = MainMemory.alloc(71);
/*  67 */       n = MainMemory.alloc(73);
/*  68 */       i1 = MainMemory.alloc(81);
/*  69 */       i2 = MainMemory.getI32(paramInt5);
/*  70 */       if (i2 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         MainMemory.setI8(k, (byte)0);
/*  82 */         MainMemory.setI8(n, (byte)0);
/*  83 */         if (ffgcrd.call(paramInt1, paramInt2, j, paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */           ffpsvc.call(j, k, n, paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  99 */         i2 = MainMemory.getI32(paramInt5);
/* 100 */         if (i2 <= 0) {
/*     */           break label173;
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
/* 112 */       i = i2;
/*     */       
/*     */ 
/*     */       break label347;
/*     */       
/*     */       label173:
/*     */       
/* 119 */       MainMemory.setI16(k, (short)40);
/* 120 */       ffr2e.call(MainMemory.getF32(paramInt3), -7, m, paramInt5);
/* 121 */       SystemLibrary.strcat(k, m);
/* 122 */       SystemLibrary.memcpy(k + SystemLibrary.strlen(k), 14560, 3, 1);
/* 123 */       ffr2e.call(MainMemory.getF32(paramInt3 + 4), -7, m, paramInt5);
/* 124 */       SystemLibrary.strcat(k, m);
/* 125 */       MainMemory.setI16(k + SystemLibrary.strlen(k), (short)41);
/* 126 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         if (MainMemory.getI8(paramInt4) != 38) {
/*     */           break label311;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       ffmkky.call(paramInt2, k, n, i1, paramInt5);
/*     */       
/*     */       break label327;
/*     */       
/*     */       label311:
/* 151 */       ffmkky.call(paramInt2, k, paramInt4, i1, paramInt5);
/*     */       
/*     */ 
/*     */       label327:
/*     */       
/*     */ 
/* 157 */       ffmkey.call(paramInt1, i1, paramInt5);
/* 158 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       label347:
/*     */       
/*     */ 
/* 164 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 169 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmkyc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */