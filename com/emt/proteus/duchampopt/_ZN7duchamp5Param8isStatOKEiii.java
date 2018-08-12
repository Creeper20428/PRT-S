/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp5Param8isStatOKEiii extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 142;
/*  11 */   public static final Function _instance = new _ZN7duchamp5Param8isStatOKEiii();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp5Param8isStatOKEiii() { super("_ZN7duchamp5Param8isStatOKEiii", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     byte b = call(i, j, k, m);
/*  36 */     paramFrame.setI8(paramInt1, b);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  42 */     byte b1 = 0;
/*     */     
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       if (MainMemory.getI8(paramInt1 + 8) != 0)
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
/*     */ 
/*     */ 
/*  67 */         i = MainMemory.getI32(paramInt1 + 32);
/*  68 */         if (i == 0) {
/*  69 */           j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  79 */           j = MainMemory.getI32(MainMemory.getI32(paramInt1 + 36));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         paramInt2 = j + paramInt2;
/*  88 */         if (!MathUtils.ugt(i, 1))
/*     */         {
/*     */ 
/*     */ 
/*  92 */           j = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  99 */           j = MainMemory.getI32(MainMemory.getI32(paramInt1 + 36) + 4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         paramInt3 = j + paramInt3;
/* 108 */         if (!MathUtils.ugt(i, 2))
/*     */         {
/*     */ 
/*     */ 
/* 112 */           i = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 119 */           i = MainMemory.getI32(MainMemory.getI32(paramInt1 + 36) + 8);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         paramInt4 = i + paramInt4;
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
/* 139 */       if (MainMemory.getI8(paramInt1 + 356) != 0) {
/*     */         break label243;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */       b1 = 1;
/*     */       
/*     */ 
/*     */       break label459;
/*     */       
/*     */       label243:
/*     */       
/* 156 */       k = MainMemory.getI32(paramInt1 + 384);
/* 157 */       i = MainMemory.getI32(k);
/* 158 */       if (i > paramInt2) {
/* 159 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 169 */         m = MainMemory.getI32(paramInt1 + 396);
/* 170 */         if (MainMemory.getI32(m) + i <= paramInt2)
/*     */         {
/*     */ 
/*     */ 
/* 174 */           n = 1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 181 */           paramInt2 = MainMemory.getI32(k + 4);
/* 182 */           if (paramInt2 > paramInt3) {
/* 183 */             n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 193 */           else if (MainMemory.getI32(m + 4) + paramInt2 <= paramInt3)
/*     */           {
/*     */ 
/*     */ 
/* 197 */             n = 1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 204 */             paramInt2 = MainMemory.getI32(k + 8);
/* 205 */             if (paramInt2 > paramInt4) {
/* 206 */               n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 216 */               n = MainMemory.getI32(m + 8) + paramInt2 <= paramInt4 ? 1 : 0;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 224 */       b1 = MathUtils.xor((byte)(n != 0 ? 1 : 0), (byte)1);
/*     */       
/*     */ 
/*     */       label459:
/*     */       
/*     */ 
/* 230 */       byte b2 = b1; return b2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param8isStatOKEiii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */