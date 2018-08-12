/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_url2path extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3423;
/*  11 */   public static final Function _instance = new fits_url2path();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_url2path() { super("fits_url2path", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  32 */     int m = call(i, j, k);
/*  33 */     paramFrame.setI32(paramInt1, m);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     byte b1 = 0;
/*  44 */     int m = 0;
/*  45 */     byte b2 = 0;
/*  46 */     byte b3 = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*     */     
/*     */ 
/*  51 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       j = MainMemory.alloc(1025);
/*  56 */       k = MainMemory.getI32(paramInt3);
/*  57 */       if (k != 0) {
/*     */         break label444;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */       com.emt.proteus.runtime.api.SystemLibrary.strcpy(j, paramInt1);
/*  68 */       k = MainMemory.getI32(paramInt3);
/*  69 */       if (k == 0) {
/*  70 */         n = 0;
/*  71 */         i1 = paramInt1;
/*     */       }
/*     */       else
/*     */       {
/*     */         break label416;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  83 */         paramInt1 = j + n;
/*  84 */         b1 = MainMemory.getI8(i1);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  94 */           switch (b1)
/*     */           {
/*     */           case 0: 
/*     */             break label366;
/*     */             
/*     */             break;
/*     */           case 37: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 105 */           m = i1 + 1;
/* 106 */           b1 = MainMemory.getI8(m);
/* 107 */           if (b1 == 0)
/*     */           {
/* 109 */             i1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 119 */             b2 = MathUtils.shl(b1, 4);
/* 120 */             b1 = MathUtils.ult((byte)(b1 + -48), (byte)10) ? b2 : (byte)(b2 + -112);
/* 121 */             MainMemory.setI8(paramInt1, b1);
/* 122 */             m = i1 + 2;
/* 123 */             b2 = MainMemory.getI8(m);
/* 124 */             if (b2 != 0) break;
/* 125 */             b1 = b2;
/* 126 */             i1 = m;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         b3 = (byte)(b2 + -48);
/* 137 */         if (MathUtils.ult(b3, (byte)10)) {
/* 138 */           b2 = b3;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 148 */           b2 = (byte)((MathUtils.ult((byte)(b2 + -65), (byte)6) ? -55 : -87) + b2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */         MainMemory.setI8(paramInt1, (byte)(b2 + b1));
/* 157 */         paramInt1 = i1 + 3;
/*     */         
/*     */         break label397;
/*     */         
/*     */         label366:
/*     */         
/* 163 */         MainMemory.setI8(paramInt1, (byte)0);
/* 164 */         break;
/*     */         
/*     */ 
/*     */ 
/* 168 */         MainMemory.setI8(paramInt1, b1);
/* 169 */         paramInt1 = i1 + 1;
/*     */         
/*     */ 
/*     */ 
/*     */         label397:
/*     */         
/*     */ 
/*     */ 
/* 177 */         n += 1;
/*     */         
/* 179 */         i1 = paramInt1;
/*     */       }
/*     */       
/*     */       label416:
/*     */       
/* 184 */       MainMemory.setI32(paramInt3, k);
/* 185 */       com.emt.proteus.runtime.api.SystemLibrary.strcpy(paramInt2, j);
/* 186 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */       break label452;
/*     */       
/*     */       label444:
/*     */       
/* 193 */       i = k;
/*     */       
/*     */ 
/*     */       label452:
/*     */       
/*     */ 
/* 199 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 204 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_url2path.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */