/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F435165 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3698;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new F435165();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public F435165() { super("F435165", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = call(i, j);
/*  30 */     paramFrame.setI32(paramInt1, k);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.getI32(paramInt1 + 28);
/*  53 */       k = j + 52;
/*  54 */       m = MainMemory.getI32(k);
/*  55 */       if (m != 0) {
/*     */         break label122;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       m = SystemLibrary.do_indirect(MainMemory.getI32(paramInt1 + 32), MainMemory.getI32(paramInt1 + 40), 1 << MainMemory.getI32(j + 36), 1);
/*  67 */       MainMemory.setI32(j + 52, m);
/*  68 */       if (m == 0) {
/*  69 */         paramInt2 = 1;
/*     */       }
/*     */       else
/*     */       {
/*     */         label122:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         n = j + 40;
/*  82 */         i2 = MainMemory.getI32(n);
/*  83 */         if (i2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*  87 */           i1 = i2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  94 */           i2 = 1 << MainMemory.getI32(j + 36);
/*  95 */           MainMemory.setI32(n, i2);
/*  96 */           MainMemory.setI32(j + 48, 0);
/*  97 */           MainMemory.setI32(j + 44, 0);
/*  98 */           i1 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         i2 = paramInt2 - MainMemory.getI32(paramInt1 + 16);
/* 106 */         if (!MathUtils.ugt(i1, i2)) {
/*     */           break label497;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         i3 = j + 48;
/* 117 */         i4 = MainMemory.getI32(i3);
/* 118 */         paramInt2 = i1 - i4;
/* 119 */         paramInt2 = MathUtils.ugt(paramInt2, i2) ? i2 : paramInt2;
/* 120 */         i5 = paramInt1 + 12;
/* 121 */         SystemLibrary.memcpy(m + i4, MainMemory.getI32(i5) + (0 - i2), paramInt2, 1);
/* 122 */         i4 = i2 - paramInt2;
/* 123 */         if (i2 != paramInt2) {
/*     */           break label445;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         i4 = MainMemory.getI32(i3) + paramInt2;
/* 134 */         MainMemory.setI32(i3, i4);
/* 135 */         i2 = MainMemory.getI32(n);
/* 136 */         if (i4 != i2) {
/*     */           break label374;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         MainMemory.setI32(i3, 0);
/*     */         
/*     */ 
/*     */         label374:
/*     */         
/*     */ 
/* 152 */         n = j + 44;
/* 153 */         i4 = MainMemory.getI32(n);
/* 154 */         if (!MathUtils.ult(i4, i2))
/*     */         {
/*     */ 
/*     */ 
/* 158 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 165 */           MainMemory.setI32(n, i4 + paramInt2);
/* 166 */           i = 0;
/*     */           
/*     */ 
/*     */           break label544;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 174 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label544;
/*     */       
/*     */       label445:
/*     */       
/* 181 */       SystemLibrary.memcpy(MainMemory.getI32(k), MainMemory.getI32(i5) + (0 - i4), i4, 1);
/* 182 */       MainMemory.setI32(i3, i4);
/* 183 */       MainMemory.setI32(j + 44, MainMemory.getI32(n));
/* 184 */       i = 0;
/*     */       
/*     */ 
/*     */       break label544;
/*     */       
/*     */       label497:
/*     */       
/* 191 */       SystemLibrary.memcpy(m, MainMemory.getI32(paramInt1 + 12) + (0 - i1), i1, 1);
/* 192 */       MainMemory.setI32(j + 48, 0);
/* 193 */       MainMemory.setI32(j + 44, MainMemory.getI32(n));
/* 194 */       i = 0;
/*     */       
/*     */ 
/*     */       label544:
/*     */       
/*     */ 
/* 200 */       int i6 = i; return i6;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F435165.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */