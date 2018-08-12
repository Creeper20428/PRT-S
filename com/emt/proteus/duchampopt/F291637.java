/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class F291637 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3174;
/*  13 */   public static final Function _instance = new F291637();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F291637() { super("F291637", 3, false); }
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
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       if (paramInt3 < 0) {
/*  57 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  67 */         m = MainMemory.getI32Aligned(470792);
/*  68 */         paramInt2 = paramInt2 == 0 ? paramInt1 : paramInt2;
/*  69 */         switch (paramInt2) {
/*     */         case 260: 
/*     */           break label182;
/*     */           break;
/*     */         case 286: 
/*     */           break label182;
/*     */           break;
/*     */         case 259: 
/*     */           break label279;
/*     */           break;
/*     */         case 285: 
/*     */           break label279;
/*     */           break;
/*     */         case 258:  break; }
/*  83 */         n = MainMemory.getI32(m + paramInt3 * 344 + 52);
/*     */         
/*     */         break label335;
/*     */         
/*     */         label182:
/*     */         
/*  89 */         n = MainMemory.getI32(m + paramInt3 * 344 + 52);
/*  90 */         if (n == 260) {
/*  91 */           paramInt1 = paramInt3;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 101 */           switch (paramInt2)
/*     */           {
/*     */           case 259: 
/*     */             break;
/*     */           case 285: 
/*     */             break;
/*     */           case 258: 
/*     */             break label335;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */           label279:
/* 115 */           n = MainMemory.getI32(m + paramInt3 * 344 + 52);
/* 116 */           if (n == 259) {
/* 117 */             paramInt1 = paramInt3;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 127 */             if (paramInt2 != 258) {
/*     */               break label355;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label335:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 139 */             if (n == 258) {
/* 140 */               paramInt1 = paramInt3;
/*     */             }
/*     */             else
/*     */             {
/*     */               label355:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */               n = MainMemory.getI32Aligned(470796);
/* 151 */               j = MainMemory.getI32Aligned(470800);
/* 152 */               if (n != j) {
/*     */                 break label518;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */               if (m != 0) {
/*     */                 break label431;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */               MainMemory.setI32Aligned(470800, 100);
/* 175 */               k = malloc.call(34400);
/*     */               
/*     */               break label458;
/*     */               
/*     */               label431:
/*     */               
/* 181 */               MainMemory.setI32Aligned(470800, j << 1);
/* 182 */               k = com.emt.proteus.runtime.library.c.realloc.call(m, j * 688);
/*     */               
/*     */ 
/*     */ 
/*     */               label458:
/*     */               
/*     */ 
/*     */ 
/* 190 */               if (k != 0) {
/*     */                 break label495;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */               MainMemory.setI32Aligned(470852, 113);
/* 201 */               i = -1;
/*     */               
/*     */ 
/*     */               break label868;
/*     */               
/*     */               label495:
/*     */               
/* 208 */               m = k;
/* 209 */               MainMemory.setI32Aligned(470792, m);
/* 210 */               n = MainMemory.getI32Aligned(470796);
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label518:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 220 */               MainMemory.setI32Aligned(470796, n + 1);
/* 221 */               if (n <= -1)
/*     */               {
/*     */ 
/*     */ 
/* 225 */                 paramInt1 = n;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 232 */                 i1 = m + n * 344;
/* 233 */                 MainMemory.setI32(m + n * 344, paramInt2);
/* 234 */                 i2 = m + n * 344 + 4;
/* 235 */                 MainMemory.setI32(i2, 3175);
/* 236 */                 MainMemory.setI32(m + n * 344 + 8, 1);
/* 237 */                 MainMemory.setI32(m + n * 344 + 12, paramInt3);
/* 238 */                 MainMemory.setI32(m + n * 344 + 52, paramInt1);
/* 239 */                 i3 = MainMemory.getI32Aligned(470792);
/* 240 */                 MainMemory.setI32(m + n * 344 + 56, MainMemory.getI32(i3 + paramInt3 * 344 + 56));
/* 241 */                 i4 = i3 + paramInt3 * 344 + 56 + 4;
/* 242 */                 MainMemory.setI32(m + n * 344 + 56 + 4, MainMemory.getI32(i4));
/* 243 */                 if (MainMemory.getI32(i4) > 0) {
/* 244 */                   paramInt1 = 0;
/*     */                 } else {
/*     */                   break label804;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 do
/*     */                 {
/* 255 */                   MainMemory.setI32(m + n * 344 + 56 + 8 + (paramInt1 << 2), MainMemory.getI32(i3 + paramInt3 * 344 + 56 + 8 + (paramInt1 << 2)));
/* 256 */                   paramInt1 += 1;
/* 257 */                 } while (MainMemory.getI32(i4) > paramInt1);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label804:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 268 */                 if (MainMemory.getI32(i3 + paramInt3 * 344) != 64536)
/*     */                 {
/*     */ 
/*     */ 
/* 272 */                   paramInt1 = n;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 279 */                   com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(i2), i1);
/* 280 */                   i = n;
/*     */                   break label868;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 288 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label868:
/*     */       
/*     */ 
/* 294 */       int i5 = i; return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F291637.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */