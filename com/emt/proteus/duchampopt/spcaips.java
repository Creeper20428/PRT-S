/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class spcaips extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2876;
/*  11 */   public static final Function _instance = new spcaips();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public spcaips() { super("spcaips", 4, false); }
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
/*  35 */     int n = call(i, j, k, m);
/*  36 */     paramFrame.setI32(paramInt1, n);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  42 */     int i = 0;
/*     */     
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*     */     
/*     */ 
/*  50 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  54 */       j = MainMemory.alloc(28);
/*  55 */       MainMemory.setI32(j, 20960);
/*  56 */       MainMemory.setI32(j + 4, 44864);
/*  57 */       MainMemory.setI32(j + 8, 44992);
/*  58 */       MainMemory.setI32(j + 12, 20992);
/*  59 */       MainMemory.setI32(j + 16, 45152);
/*  60 */       MainMemory.setI32(j + 20, 34976);
/*  61 */       MainMemory.setI32(j + 24, 45184);
/*  62 */       if (paramInt3 != paramInt1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         SystemLibrary.strncpy(paramInt3, paramInt1, 8);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  78 */       MainMemory.setI8(paramInt3 + 8, (byte)0);
/*  79 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  86 */         if (k >= 9) {
/*     */           break label205;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */         m = k + 1;
/*  97 */         if (MainMemory.getI8(paramInt3 + k) == 0) {
/*     */           break;
/*     */         }
/*     */         
/* 101 */         k = m;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       spcaips_1649.call(m, k, paramInt3);
/*     */       
/*     */ 
/*     */       label205:
/*     */       
/*     */ 
/* 114 */       k += -1;
/* 115 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 122 */         n = k - m;
/* 123 */         paramInt1 = paramInt3 + n;
/* 124 */         if (n <= 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         if (MainMemory.getI8(paramInt1) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */         MainMemory.setI8(paramInt1, (byte)0);
/* 145 */         m += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 151 */       MainMemory.setI8(paramInt4, (byte)0);
/* 152 */       if (SystemLibrary.strncmp(paramInt3, 18432, 4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         if (SystemLibrary.strncmp(paramInt3, 18464, 4) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */           if (SystemLibrary.strncmp(paramInt3, 21024, 4) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 176 */             paramInt2 = -1;
/*     */             
/*     */             break label722;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 183 */       paramInt1 = paramInt3 + 4;
/* 184 */       if (paramInt1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         if (SystemLibrary.strcmp(paramInt1, 21056) != 0) {
/*     */           break label425;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */         SystemLibrary.memcpy(paramInt4, 20960, 5, 1);
/*     */         
/*     */         break label506;
/*     */         
/*     */         label425:
/* 209 */         if (SystemLibrary.strcmp(paramInt1, 21088) != 0) {
/*     */           break label467;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */         SystemLibrary.memcpy(paramInt4, 44864, 9, 1);
/*     */         
/*     */ 
/*     */         label467:
/*     */         
/* 224 */         if (SystemLibrary.strcmp(paramInt1, 21120) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 228 */           paramInt2 = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 235 */           SystemLibrary.memcpy(paramInt4, 44992, 9, 1);
/*     */           
/*     */ 
/*     */           label506:
/*     */           
/*     */ 
/* 241 */           MainMemory.setI8(paramInt1, (byte)0);
/*     */         }
/*     */         
/*     */       }
/*     */       else
/*     */       {
/* 247 */         k = paramInt2 % 256 + -1;
/* 248 */         if (!com.emt.proteus.lib.api.MathUtils.ult(k, 7)) {
/*     */           break label568;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */         SystemLibrary.strcpy(paramInt4, MainMemory.getI32(j + (k << 2)));
/*     */         
/*     */ 
/*     */         label568:
/*     */         
/*     */ 
/* 264 */         if (SystemLibrary.strcmp(paramInt3, 18464) != 0) {
/*     */           break label675;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */         if (MainMemory.getI8(paramInt4) == 0) {
/* 275 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 285 */           if ((paramInt2 & 0x100) != 0) {
/*     */             break label653;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */           SystemLibrary.memcpy(paramInt3, 18496, 5, 1);
/* 296 */           i = 0;
/*     */           
/*     */ 
/*     */           break label730;
/*     */           
/*     */           label653:
/*     */           
/* 303 */           SystemLibrary.memcpy(paramInt3, 18560, 5, 1);
/* 304 */           i = 0;
/*     */           
/*     */ 
/*     */           break label730;
/*     */           
/*     */           label675:
/*     */           
/* 311 */           if (SystemLibrary.strcmp(paramInt3, 21024) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 315 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 322 */             SystemLibrary.memcpy(paramInt3, 46080, 9, 1);
/* 323 */             i = 0;
/*     */             
/*     */             break label730;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label722:
/* 331 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label730:
/*     */       
/*     */ 
/* 337 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 342 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spcaips.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */