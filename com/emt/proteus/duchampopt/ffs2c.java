/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffs2c extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3577;
/*  11 */   public static final Function _instance = new ffs2c();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffs2c() { super("ffs2c", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (paramInt3 <= 0) {
/*     */         break label35;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label356;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label35:
/*     */       
/*     */ 
/*     */ 
/*  64 */       if (paramInt1 != 0) {
/*     */         break label71;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt2, 15136, 3, 1);
/*     */       
/*     */ 
/*     */       break label356;
/*     */       
/*     */       label71:
/*     */       
/*  81 */       MainMemory.setI8(paramInt2, (byte)39);
/*  82 */       paramInt3 = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt1);
/*  83 */       paramInt3 = MathUtils.ugt(paramInt3, 68) ? 68 : paramInt3;
/*  84 */       if (paramInt3 == 0) {
/*  85 */         paramInt3 = 1;
/*     */         break label241;
/*     */       } else {
/*  88 */         i = 1;
/*  89 */         k = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label185:
/*     */       
/*     */ 
/*     */       do
/*     */       {
/*  99 */         j = paramInt1 + k;
/* 100 */         k += 1;
/* 101 */         MainMemory.setI8(paramInt2 + i, MainMemory.getI8(j));
/* 102 */         if (MainMemory.getI8(j) != 39) {
/*     */           break label185;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         i += 1;
/* 114 */         MainMemory.setI8(paramInt2 + i, (byte)39);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         i += 1;
/* 123 */       } while ((MathUtils.ult(k, paramInt3)) && (MathUtils.ult(i, 69)));
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
/* 135 */       if (MathUtils.ult(i, 9)) {
/* 136 */         paramInt3 = i;
/*     */       } else {
/*     */         break label295;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label241:
/*     */       
/*     */ 
/*     */ 
/* 147 */       k = 9 - paramInt3;
/* 148 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 155 */         MainMemory.setI8(paramInt2 + (paramInt3 + i), (byte)32);
/* 156 */         i += 1;
/* 157 */         if (i == k) {
/* 158 */           paramInt3 = 9;
/*     */           
/*     */           break label334;
/*     */           
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */       label295:
/*     */       
/* 168 */       if (i != 70)
/*     */       {
/*     */ 
/*     */ 
/* 172 */         paramInt3 = i;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 179 */         MainMemory.setI8(paramInt2 + 69, (byte)0);
/*     */         
/*     */ 
/*     */         break label356;
/*     */       }
/*     */       
/*     */       label334:
/*     */       
/* 187 */       MainMemory.setI8(paramInt2 + paramInt3, (byte)39);
/* 188 */       MainMemory.setI8(paramInt2 + (paramInt3 + 1), (byte)0);
/*     */       
/*     */ 
/*     */       label356:
/*     */       
/*     */ 
/* 194 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffs2c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */