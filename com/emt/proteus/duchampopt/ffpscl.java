/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpscl
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3602;
/*  13 */   public static final Function _instance = new ffpscl();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffpscl() { super("ffpscl", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
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
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */         j = MainMemory.getI32(paramInt1);
/*  60 */         k = paramInt1 + 4;
/*  61 */         m = MainMemory.getI32(k);
/*  62 */         if (j != 0) {
/*     */           break label89;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         if (MainMemory.getI64(m + 88) == 0L) {
/*  73 */           j = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           label89:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */           if (j != MainMemory.getI32(m + 64)) {
/*     */             break label170;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */           if (MainMemory.getI64(m + 112) != -1L) {
/*     */             break label185;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */           if (ffrdef.call(paramInt1, paramInt2) > 0) {
/* 104 */             j = 0;
/*     */             
/*     */             break label233;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label185;
/*     */           }
/*     */           label170:
/* 113 */           ffmahd.call(paramInt1, j + 1, 0, paramInt2);
/*     */           
/*     */ 
/*     */           label185:
/*     */           
/*     */ 
/* 119 */           m = MainMemory.getI32(k);
/* 120 */           if (MainMemory.getI32(m + 1012) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 124 */             j = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 131 */             j = MainMemory.getI32(m + 68);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label233:
/*     */         
/*     */ 
/* 139 */         if (MainMemory.getI32(paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */           if (j != 0) {
/*     */             break label511;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           j = MainMemory.getI32(paramInt1);
/* 160 */           m = MainMemory.getI32(k);
/* 161 */           if (j != MainMemory.getI32(m + 64)) {
/*     */             break label375;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */           if (MainMemory.getI64(m + 112) != -1L) {
/*     */             break label390;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */           if (ffrdef.call(paramInt1, paramInt2) <= 0) {
/*     */             break label390;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 191 */           j = MainMemory.getI32(paramInt2);
/* 192 */           m = MainMemory.getI32(k);
/*     */           
/*     */ 
/*     */           break label420;
/*     */           
/*     */           label375:
/*     */           
/* 199 */           ffmahd.call(paramInt1, j + 1, 0, paramInt2);
/*     */           
/*     */ 
/*     */           label390:
/*     */           
/*     */ 
/* 205 */           m = MainMemory.getI32(k);
/* 206 */           j = MainMemory.getI32(m + 1012) != 0 ? 1 : 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label420:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 216 */           if (j != 0) {
/*     */             break label478;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */           n = MainMemory.getI32(m + 944);
/* 227 */           MainMemory.setF64(n + 244, 1.0D);
/* 228 */           MainMemory.setF64(n + 252, 0.0D);
/*     */           
/*     */           break label523;
/*     */           
/*     */           label478:
/* 233 */           MainMemory.setF64(m + 1136, 1.0D);
/* 234 */           MainMemory.setF64(MainMemory.getI32(k) + 1144, 0.0D);
/*     */           
/*     */           break label523;
/*     */           
/*     */           label511:
/* 239 */           MainMemory.setI32(paramInt2, 233);
/*     */         }
/*     */       }
/*     */       
/*     */       label523:
/*     */       
/* 245 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */       int i1 = i;return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpscl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */