/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class wcssptr extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2920;
/*  14 */   public static final Function _instance = new wcssptr();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public wcssptr() { super("wcssptr", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = call(i, j, k);
/*  36 */     paramFrame.setI32(paramInt1, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     int i = 0;
/*     */     
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*     */     
/*     */ 
/*  55 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(8);
/*  60 */       k = MainMemory.alloc(8);
/*  61 */       if (paramInt1 == 0) {
/*  62 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  72 */         if (MainMemory.getI32(paramInt1) != 137)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */           n = wcsset.call(paramInt1);
/*  83 */           if (n != 0) {
/*     */             break label775;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         n = MainMemory.getI32(paramInt2);
/*  95 */         if (n >= 0) {
/*     */           break label316;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         n = MainMemory.getI32(paramInt1 + 752);
/* 107 */         if (n >= 0) {
/*     */           break label305;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         m = paramInt1 + 724;
/* 119 */         n = MainMemory.getI32(paramInt1 + 4);
/* 120 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 127 */           i2 = n > i1 ? 1 : 0;
/* 128 */           if (i2 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 132 */             n = 12;
/*     */             
/*     */ 
/*     */             break label775;
/*     */           }
/*     */           
/*     */ 
/* 139 */           if (!MathUtils.ult(MainMemory.getI32(MainMemory.getI32(m) + (i1 << 2)) + 62536, 100)) {
/*     */             break label289;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */           if (i2 != 0) {
/* 150 */             n = i1;
/* 151 */             break;
/*     */           } else {
/* 153 */             n = 12;
/*     */             
/*     */             break label775;
/*     */           }
/*     */           
/*     */           label289:
/*     */           
/* 160 */           i1 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label305:
/*     */         
/*     */ 
/* 167 */         MainMemory.setI32(paramInt2, n);
/*     */         
/*     */ 
/*     */ 
/*     */         label316:
/*     */         
/*     */ 
/*     */ 
/* 175 */         i3 = paramInt1 + 16;
/* 176 */         i4 = paramInt1 + 20;
/* 177 */         i5 = paramInt1 + 28;
/* 178 */         if (spctrn.call(MainMemory.getI32(i5) + n * 72, MainMemory.getF64(MainMemory.getI32(i4) + (n << 3)), MainMemory.getF64(MainMemory.getI32(i3) + (n << 3)), MainMemory.getF64(paramInt1 + 48), MainMemory.getF64(paramInt1 + 56), paramInt3, k, j) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 182 */           n = 6;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 189 */           MainMemory.setI32(paramInt1, 0);
/* 190 */           MainMemory.setF64(MainMemory.getI32(i3) + (n << 3), MainMemory.getF64(j));
/* 191 */           MainMemory.setF64(MainMemory.getI32(i4) + (n << 3), MainMemory.getF64(k));
/* 192 */           spctyp.call(paramInt3, 0, 0, MainMemory.getI32(paramInt1 + 24) + n * 72, 0, 0, 0);
/* 193 */           SystemLibrary.strcpy(MainMemory.getI32(i5) + n * 72, paramInt3);
/* 194 */           if (paramInt1 + 1376 != 0) {
/*     */             break label526;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */           i = 0;
/*     */           
/*     */ 
/*     */           break label783;
/*     */           
/*     */           label526:
/*     */           
/* 211 */           MainMemory.setI32(paramInt1 + 1376, 0);
/* 212 */           SystemLibrary.memcpy(paramInt1 + 1380, 20928, 5, 1);
/* 213 */           MainMemory.setI32(paramInt1 + 1388, 2105376);
/* 214 */           MainMemory.setF64(paramInt1 + 1392, 9.87654321E107D);
/* 215 */           MainMemory.setF64(paramInt1 + 1400, 0.0D);
/* 216 */           MainMemory.setF64(paramInt1 + 1408, 0.0D);
/* 217 */           MainMemory.setF64(paramInt1 + 1416, 9.87654321E107D);
/* 218 */           MainMemory.setF64(paramInt1 + 1424, 9.87654321E107D);
/* 219 */           MainMemory.setF64(paramInt1 + 1432, 9.87654321E107D);
/* 220 */           MainMemory.setF64(paramInt1 + 1440, 9.87654321E107D);
/* 221 */           MainMemory.setF64(paramInt1 + 1448, 9.87654321E107D);
/* 222 */           MainMemory.setF64(paramInt1 + 1456, 9.87654321E107D);
/* 223 */           MainMemory.setF64(paramInt1 + 1464, 9.87654321E107D);
/* 224 */           MainMemory.setF64(paramInt1 + 1472, 0.0D);
/* 225 */           MainMemory.setF64(paramInt1 + 1480, 0.0D);
/* 226 */           MainMemory.setF64(paramInt1 + 1488, 0.0D);
/* 227 */           MainMemory.setF64(paramInt1 + 1496, 0.0D);
/* 228 */           MainMemory.setF64(paramInt1 + 1504, 0.0D);
/* 229 */           MainMemory.setF64(paramInt1 + 1512, 0.0D);
/* 230 */           MainMemory.setI32(paramInt1 + 1520, 0);
/* 231 */           MainMemory.setI32(paramInt1 + 1528, 0);
/* 232 */           MainMemory.setI32(paramInt1 + 1532, 0);
/* 233 */           MainMemory.setI32(paramInt1 + 1536, 0);
/* 234 */           MainMemory.setI32(paramInt1 + 1540, 0);
/* 235 */           i = 0;
/*     */           
/*     */           break label783;
/*     */         }
/*     */       }
/*     */       
/*     */       label775:
/*     */       
/* 243 */       i = n;
/*     */       
/*     */ 
/*     */       label783:
/*     */       
/*     */ 
/* 249 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 254 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcssptr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */