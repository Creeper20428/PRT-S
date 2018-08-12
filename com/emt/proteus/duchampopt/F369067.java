/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F369067 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3474;
/*  12 */   public static final Function _instance = new F369067();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F369067() { super("F369067", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3);
/*  20 */     return 0;
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
/*  34 */     call(i, j, k);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*     */     
/*     */ 
/*  49 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       i = MainMemory.alloc(100);
/*  54 */       j = SystemLibrary.strlen(paramInt2);
/*  55 */       if (j != 7) {
/*     */         break label217;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       if (SystemLibrary.strncmp(paramInt2, 39552, 7) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         if (SystemLibrary.strncmp(paramInt2, 39584, 7) != 0) {
/*     */           break label217;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       paramInt1 = F368458.call(paramInt1, 17248);
/*  86 */       k = paramInt1 + 80;
/*  87 */       SystemLibrary.strncpy(k, paramInt1, 80);
/*  88 */       m = paramInt1 + 1;
/*  89 */       n = (com.emt.proteus.lib.api.MathUtils.ugt(k, m) ? k : m) + (0 - paramInt1);
/*  90 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  97 */         MainMemory.setI8(paramInt1 + i1, (byte)32);
/*  98 */         i1 += 1;
/*  99 */         if (i1 == n) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       SystemLibrary.strncpy(paramInt1, paramInt2, j);
/* 111 */       paramInt2 = k;
/* 112 */       k = 0;
/*     */       
/*     */       break label380;
/*     */       
/*     */       label217:
/* 117 */       paramInt2 = F368458.call(paramInt1, paramInt2);
/* 118 */       paramInt1 = paramInt2 + 80;
/* 119 */       if (paramInt2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         SystemLibrary.strncpy(i, paramInt2, 80);
/* 130 */         k = SystemLibrary.strchr(i, 39);
/* 131 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */           k = SystemLibrary.strchr(k + 1, 39);
/* 142 */           if (k != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */             j = k;
/* 153 */             n = i;
/* 154 */             if (j - n >= 31) {
/*     */               break label347;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         paramInt2 += 31;
/* 165 */         k = paramInt2;
/*     */         
/*     */         break label365;
/*     */         
/*     */         label347:
/* 170 */         paramInt2 += 2 - n + j;
/* 171 */         k = paramInt2;
/*     */         
/*     */ 
/*     */ 
/*     */         label365:
/*     */         
/*     */ 
/* 178 */         MainMemory.setI16(k, (short)8239);
/* 179 */         paramInt2 = paramInt1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label380:
/*     */         
/*     */ 
/*     */ 
/* 188 */         j = SystemLibrary.strlen(paramInt3);
/* 189 */         if (j <= 0) {
/*     */           break label464;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */         paramInt1 = k + 2;
/* 200 */         if (!com.emt.proteus.lib.api.MathUtils.ugt(k + (j + 2), paramInt2)) {
/*     */           break label446;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */         j = paramInt2 - paramInt1;
/*     */         
/*     */ 
/*     */ 
/*     */         label446:
/*     */         
/*     */ 
/*     */ 
/* 219 */         SystemLibrary.strncpy(paramInt1, paramInt3, j);
/*     */         
/*     */ 
/*     */ 
/*     */         break label469;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label464:
/*     */       
/*     */ 
/*     */ 
/*     */       label469:
/*     */       
/*     */ 
/*     */ 
/* 236 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F369067.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */