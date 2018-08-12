/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class wcsunits extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2953;
/*  12 */   public static final Function _instance = new wcsunits();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public wcsunits() { super("wcsunits", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = call(i, j, k, m, n);
/*  40 */     paramFrame.setI32(paramInt1, i1);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     double d = 0.0D;
/*     */     
/*     */ 
/*  58 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       j = MainMemory.alloc(4);
/*  63 */       k = MainMemory.alloc(4);
/*  64 */       m = MainMemory.alloc(8);
/*  65 */       n = MainMemory.alloc(8);
/*  66 */       i1 = MainMemory.alloc(136);
/*  67 */       i2 = MainMemory.alloc(136);
/*  68 */       i3 = wcsulex.call(paramInt1, j, m, i1);
/*  69 */       if (i3 != 0) {
/*     */         break label714;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       i3 = wcsulex.call(paramInt2, k, n, i2);
/*  81 */       if (i3 == 0) {
/*  82 */         i3 = 0;
/*     */       } else {
/*     */         break label714;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  94 */         if (i3 >= 17) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         if (com.emt.proteus.lib.api.MathUtils.f_une(MainMemory.getF64(i1 + (i3 << 3)), MainMemory.getF64(i2 + (i3 << 3)))) {
/* 105 */           i3 = 10;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label714;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 115 */         i3 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 121 */       MainMemory.setF64(paramInt3, 0.0D);
/* 122 */       MainMemory.setF64(paramInt4, 0.0D);
/* 123 */       MainMemory.setF64(paramInt5, 1.0D);
/* 124 */       switch (MainMemory.getI32(j)) {
/*     */       case 0: 
/*     */         break label657;
/*     */         break;
/*     */       case 1:  break label515;
/*     */         break; case 2:  break label368;
/*     */         break; case 3:  break; default:  i3 = 9;
/* 131 */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 138 */       if (MainMemory.getI32(k) != 3)
/*     */       {
/*     */ 
/*     */ 
/* 142 */         i3 = 11;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 149 */         MainMemory.setF64(paramInt3, 1.0D);
/* 150 */         d = MainMemory.getF64(m) / MainMemory.getF64(n);
/* 151 */         MainMemory.setF64(paramInt5, d);
/* 152 */         i = 0;
/*     */         
/*     */ 
/*     */         break label723;
/*     */         
/*     */         label368:
/*     */         
/* 159 */         switch (MainMemory.getI32(k)) {
/*     */         case 1: 
/*     */           break label464;
/*     */           break;
/*     */         case 2:  break; default:  i3 = 11;
/* 164 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 171 */         MainMemory.setF64(paramInt3, 1.0D);
/* 172 */         d = MainMemory.getF64(m) / MainMemory.getF64(n);
/* 173 */         MainMemory.setF64(paramInt4, SystemLibrary.log(d));
/* 174 */         i = 0;
/*     */         
/*     */ 
/*     */         break label723;
/*     */         
/*     */         label464:
/*     */         
/* 181 */         d = 1.0D / SystemLibrary.log(10.0D);
/* 182 */         MainMemory.setF64(paramInt3, d);
/* 183 */         d = MainMemory.getF64(m) / MainMemory.getF64(n);
/* 184 */         MainMemory.setF64(paramInt4, SystemLibrary.log(d));
/* 185 */         i = 0;
/*     */         
/*     */ 
/*     */         break label723;
/*     */         
/*     */         label515:
/*     */         
/* 192 */         switch (MainMemory.getI32(k)) {
/*     */         case 1: 
/*     */           break label617;
/*     */           break;
/*     */         case 2:  break; default:  i3 = 11;
/* 197 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 204 */         MainMemory.setF64(paramInt3, SystemLibrary.log(10.0D));
/* 205 */         d = MainMemory.getF64(m) / MainMemory.getF64(n);
/* 206 */         MainMemory.setF64(paramInt4, SystemLibrary.log(d));
/* 207 */         i = 0;
/*     */         
/*     */ 
/*     */         break label723;
/*     */         
/*     */         label617:
/*     */         
/* 214 */         MainMemory.setF64(paramInt3, 1.0D);
/* 215 */         d = MainMemory.getF64(m) / MainMemory.getF64(n);
/* 216 */         MainMemory.setF64(paramInt4, SystemLibrary.log10(d));
/* 217 */         i = 0;
/*     */         
/*     */ 
/*     */         break label723;
/*     */         
/*     */         label657:
/*     */         
/* 224 */         if (MainMemory.getI32(k) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 228 */           i3 = 11;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 235 */           d = MainMemory.getF64(m) / MainMemory.getF64(n);
/* 236 */           MainMemory.setF64(paramInt3, d);
/* 237 */           i = 0;
/*     */           
/*     */           break label723;
/*     */         }
/*     */       }
/*     */       
/*     */       label714:
/*     */       
/* 245 */       i = i3;
/*     */       
/*     */ 
/*     */       label723:
/*     */       
/*     */ 
/* 251 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 256 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsunits.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */