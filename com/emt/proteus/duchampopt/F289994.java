/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F289994 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3161;
/*  12 */   public static final Function _instance = new F289994();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F289994() { super("F289994", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       k = MainMemory.getI32(paramInt + 8);
/*  49 */       if (k != 0) {
/*     */         break label105;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */       i1 = MainMemory.getI32(paramInt);
/*  60 */       if ((i1 > 0) || (i1 != 64536))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         i = MainMemory.getI32(MainMemory.getI32Aligned(470820) + (0 - i1) * 244 + 4);
/*     */       }
/*     */       else
/*     */       {
/*     */         label105:
/*     */         
/*     */ 
/*  77 */         if (k <= 0)
/*     */         {
/*     */ 
/*     */ 
/*  81 */           k = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  88 */           j = MainMemory.getI32Aligned(470792);
/*  89 */           k = k > 1 ? k : 1;
/*  90 */           m = 0;
/*  91 */           n = 0;
/*  92 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 101 */             i3 = MainMemory.getI32(paramInt + 12 + (i1 << 2));
/* 102 */             i2 = MainMemory.getI32(j + i3 * 344);
/* 103 */             if (i2 <= 0) {
/*     */               break label304;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */             i2 = call(j + i3 * 344);
/* 114 */             if (i2 >= 1) {
/*     */               break label249;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */             m -= i2;
/*     */             
/*     */ 
/*     */             break label393;
/*     */             
/*     */             label249:
/*     */             
/* 131 */             i3 = m + 1;
/* 132 */             if (m == 0) {
/* 133 */               n = i2;
/* 134 */               m = i3;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 144 */               m = n == i2 ? m : i3;
/*     */               
/*     */ 
/*     */               break label393;
/*     */               
/*     */               label304:
/*     */               
/* 151 */               if (i2 != 64536)
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
/* 163 */                 i2 = MainMemory.getI32(MainMemory.getI32Aligned(470820) + (0 - i2) * 244 + 4);
/* 164 */                 i3 = m + 1;
/* 165 */                 if (m == 0) {
/* 166 */                   n = i2;
/* 167 */                   m = i3;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 177 */                   m = n == i2 ? m : i3;
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label393:
/*     */             
/*     */ 
/* 187 */             i1 += 1;
/* 188 */             if (i1 == k) {
/*     */               break;
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
/* 201 */           if (m != 1)
/*     */           {
/*     */ 
/*     */ 
/* 205 */             k = m;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 212 */             i = n;
/*     */             
/*     */ 
/*     */             break label462;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/* 220 */         i = 0 - k;
/*     */       }
/*     */       
/*     */ 
/*     */       label462:
/*     */       
/* 226 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F289994.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */