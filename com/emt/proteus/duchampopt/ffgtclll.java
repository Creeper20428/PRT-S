/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgtclll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3271;
/*  14 */   public static final Function _instance = new ffgtclll();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgtclll() { super("ffgtclll", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, k, m, n, i1);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*     */     
/*     */ 
/*  61 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(4);
/*  66 */       j = MainMemory.alloc(4);
/*  67 */       if (MainMemory.getI32(paramInt6) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         i1 = MainMemory.getI32(paramInt1);
/*  78 */         k = paramInt1 + 4;
/*  79 */         m = MainMemory.getI32(k);
/*  80 */         if (i1 != MainMemory.getI32(m + 64)) {
/*     */           break label155;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label172;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (ffrdef.call(paramInt1, paramInt6) > 0) {
/*     */           break label687;
/*     */         } else {
/*     */           break label172;
/*     */         }
/*     */         
/*     */ 
/*     */         label155:
/*     */         
/* 109 */         ffmahd.call(paramInt1, i1 + 1, 0, paramInt6);
/*     */         
/*     */ 
/*     */         label172:
/*     */         
/*     */ 
/* 115 */         if (paramInt2 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */           m = MainMemory.getI32(k);
/* 126 */           if (MainMemory.getI32(m + 916) >= paramInt2) {
/*     */             break label238;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         MainMemory.setI32(paramInt6, 302);
/*     */         
/*     */ 
/*     */         break label720;
/*     */         
/*     */         label238:
/*     */         
/* 143 */         n = MainMemory.getI32(m + 944);
/* 144 */         paramInt2 += -1;
/* 145 */         i1 = MainMemory.getI32(paramInt6);
/* 146 */         if (i1 > 0) {
/* 147 */           i2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 158 */           i1 = MainMemory.getI32(paramInt1);
/* 159 */           if (i1 != 0) {
/*     */             break label328;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */           if (MainMemory.getI64(m + 88) == 0L) {
/* 170 */             i2 = 0;
/*     */           }
/*     */           else
/*     */           {
/*     */             label328:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */             if (i1 != MainMemory.getI32(m + 64)) {
/*     */               break label412;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */             if (MainMemory.getI64(m + 112) != -1L) {
/*     */               break label429;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */             if (ffrdef.call(paramInt1, paramInt6) > 0) {
/* 201 */               i2 = 0;
/*     */               
/*     */               break label483;
/*     */             }
/*     */             else
/*     */             {
/*     */               break label429;
/*     */             }
/*     */             label412:
/* 210 */             ffmahd.call(paramInt1, i1 + 1, 0, paramInt6);
/*     */             
/*     */ 
/*     */             label429:
/*     */             
/*     */ 
/* 216 */             m = MainMemory.getI32(k);
/* 217 */             if (MainMemory.getI32(m + 1012) != 0)
/*     */             {
/*     */ 
/*     */ 
/* 221 */               i2 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 228 */               i1 = MainMemory.getI32(m + 68);
/* 229 */               i2 = i1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label483:
/*     */           
/* 236 */           i1 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */         if (i1 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */           if (i2 != 1) {
/*     */             break label592;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */           ffasfm.call(n + paramInt2 * 152 + 136, paramInt3, j, i, paramInt6);
/* 267 */           MainMemory.setI64(paramInt5, MainMemory.getI32(j));
/* 268 */           if (paramInt4 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */             MainMemory.setI64(paramInt4, 1L);
/*     */             
/*     */ 
/*     */             break label720;
/*     */             
/*     */             label592:
/*     */             
/* 285 */             if (paramInt3 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */               MainMemory.setI32(paramInt3, MainMemory.getI32(n + paramInt2 * 152 + 80));
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 301 */             if (paramInt5 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */               MainMemory.setI64(paramInt5, MainMemory.getI32(n + paramInt2 * 152 + 148));
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 317 */             if (paramInt4 != 0) {
/*     */               break label697;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label687:
/*     */       
/*     */ 
/*     */       break label720;
/*     */       
/*     */ 
/*     */       label697:
/*     */       
/* 333 */       MainMemory.setI64(paramInt4, MainMemory.getI64(n + paramInt2 * 152 + 84));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label720:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtclll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */