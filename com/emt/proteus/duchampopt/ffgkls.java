/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ 
/*     */ public final class ffgkls
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3420;
/*  17 */   public static final Function _instance = new ffgkls();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffgkls() { super("ffgkls", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = call(i, j, k, m, n);
/*  45 */     paramFrame.setI32(paramInt1, i1);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*     */     
/*     */ 
/*  60 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       j = MainMemory.alloc(81);
/*  65 */       k = MainMemory.alloc(71);
/*  66 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         MainMemory.setI32(paramInt3, 0);
/*  77 */         MainMemory.setI8(k, (byte)0);
/*  78 */         if (paramInt4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */           MainMemory.setI8(paramInt4, (byte)0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  94 */         m = MainMemory.getI32(paramInt5);
/*  95 */         if (m <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */           if (ffgcrd.call(paramInt1, paramInt2, j, paramInt5) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */             ffpsvc.call(j, k, paramInt4, paramInt5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 122 */           m = MainMemory.getI32(paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */         if (m <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */           if (MainMemory.getI8(k) != 0) {
/*     */             break label223;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */           paramInt2 = malloc.call(1);
/* 151 */           MainMemory.setI32(paramInt3, paramInt2);
/* 152 */           MainMemory.setI8(paramInt2, (byte)0);
/*     */           
/*     */           break label288;
/*     */           
/*     */           label223:
/* 157 */           paramInt2 = malloc.call(SystemLibrary.strlen(k) + 1);
/* 158 */           MainMemory.setI32(paramInt3, paramInt2);
/* 159 */           ffc2s.call(k, paramInt2, paramInt5);
/* 160 */           m = SystemLibrary.strlen(MainMemory.getI32(paramInt3));
/* 161 */           n = 0;
/*     */         }
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
/*     */ 
/*     */       for (;;)
/*     */       {
/* 177 */         if (n == 0) {
/*     */           break label305;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label288:
/*     */         
/*     */ 
/*     */ 
/* 187 */         i = MainMemory.getI32(paramInt5);
/* 188 */         break;
/*     */         
/*     */ 
/*     */         label305:
/*     */         
/*     */ 
/* 194 */         if (m == 0) {
/* 195 */           n = 1;
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
/* 206 */           i1 = m + -1;
/* 207 */           if (MainMemory.getI8(MainMemory.getI32(paramInt3) + i1) != 38)
/*     */           {
/*     */ 
/*     */ 
/* 211 */             n = 1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 219 */             ffgcnt.call(paramInt1, k, paramInt5);
/* 220 */             if (MainMemory.getI8(k) == 0) {
/* 221 */               n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 232 */               MainMemory.setI8(MainMemory.getI32(paramInt3) + i1, (byte)0);
/* 233 */               i1 = SystemLibrary.strlen(k) + m;
/* 234 */               m = i1 + -1;
/* 235 */               paramInt2 = realloc.call(MainMemory.getI32(paramInt3), i1);
/* 236 */               MainMemory.setI32(paramInt3, paramInt2);
/* 237 */               SystemLibrary.strcat(paramInt2, k);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 242 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 247 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgkls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */