/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class linx2p extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2790;
/*  12 */   public static final Function _instance = new linx2p();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public linx2p() { super("linx2p", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     double d1 = 0.0D;
/*  52 */     int i6 = 0;
/*  53 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       if (paramInt1 == 0) {
/*  60 */         j = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  70 */         if (MainMemory.getI32(paramInt1) != 137)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */           j = linset.call(paramInt1);
/*  81 */           if (j != 0) {
/*     */             break label498;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         j = MainMemory.getI32(paramInt1 + 4);
/*  93 */         k = j > 0 ? 1 : 0;
/*  94 */         if (MainMemory.getI32(paramInt1 + 28) != 0) {
/*     */           break label379;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         n = paramInt1 + 8;
/* 105 */         if (k == 0)
/*     */         {
/*     */ 
/*     */ 
/* 109 */           j = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 116 */           i1 = j << 3;
/* 117 */           i4 = MainMemory.getI32(paramInt1 + 24);
/* 118 */           i2 = i4;
/* 119 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 127 */             i4 = paramInt3 + (i3 << 3);
/* 128 */             MainMemory.setF64(i4, 0.0D);
/* 129 */             if (k == 0)
/*     */             {
/*     */ 
/*     */ 
/* 133 */               d1 = 0.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 141 */               i5 = i2 + i1;
/* 142 */               d1 = 0.0D;
/* 143 */               i6 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 151 */                 d2 = MainMemory.getF64(i2 + (i6 << 3)) * MainMemory.getF64(paramInt2 + (i6 << 3));
/* 152 */                 d1 += d2;
/* 153 */                 MainMemory.setF64(i4, d1);
/* 154 */                 i6 += 1;
/* 155 */                 if (i6 == j) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */               i2 = i5;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */             d1 += MainMemory.getF64(MainMemory.getI32(n) + (i3 << 3));
/* 178 */             MainMemory.setF64(i4, d1);
/* 179 */             i3 += 1;
/* 180 */             if (i3 == j) {
/* 181 */               j = 0;
/*     */               
/*     */ 
/*     */               break label498;
/*     */               
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */           label379:
/*     */           
/* 192 */           n = paramInt1 + 16;
/* 193 */           m = paramInt1 + 8;
/* 194 */           if (k != 0) {
/* 195 */             i1 = 0;
/*     */           }
/*     */           else
/*     */           {
/* 199 */             j = 0;
/*     */             
/*     */ 
/*     */             break label498;
/*     */           }
/*     */           
/*     */           for (;;)
/*     */           {
/* 207 */             d1 = MainMemory.getF64(paramInt2 + (i1 << 3)) / MainMemory.getF64(MainMemory.getI32(n) + (i1 << 3));
/* 208 */             d1 += MainMemory.getF64(MainMemory.getI32(m) + (i1 << 3));
/* 209 */             MainMemory.setF64(paramInt3 + (i1 << 3), d1);
/* 210 */             i1 += 1;
/* 211 */             if (i1 == j) {
/* 212 */               j = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label498:
/*     */       
/*     */ 
/*     */ 
/* 224 */       i = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */       int i7 = i;return i7;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/linx2p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */