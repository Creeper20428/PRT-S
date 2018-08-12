/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class ffmahd extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3249;
/*  13 */   public static final Function _instance = new ffmahd();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffmahd() { super("ffmahd", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = call(i, j, k, m);
/*  38 */     paramFrame.setI32(paramInt1, n);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*  53 */     int i4 = 0;
/*     */     
/*     */ 
/*  56 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       j = MainMemory.alloc(4);
/*  61 */       k = MainMemory.alloc(81);
/*  62 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         if (paramInt2 >= 1) {
/*     */           break label97;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         MainMemory.setI32(paramInt4, 301);
/*     */         
/*     */         break label471;
/*     */         
/*     */         label97:
/*  87 */         m = paramInt1 + 4;
/*  88 */         i4 = MainMemory.getI32(m);
/*  89 */         if (MainMemory.getI32(i4 + 80) <= paramInt2)
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
/* 100 */           n = realloc.call(MainMemory.getI32(i4 + 84), (paramInt2 << 3) + 8008);
/* 101 */           if (n != 0) {
/*     */             break label185;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */           MainMemory.setI32(paramInt4, 113);
/*     */           
/*     */           break label471;
/*     */           
/*     */           label185:
/* 116 */           i1 = n;
/* 117 */           MainMemory.setI32(MainMemory.getI32(m) + 80, paramInt2 + 1000);
/* 118 */           MainMemory.setI32(MainMemory.getI32(m) + 84, i1);
/* 119 */           i4 = MainMemory.getI32(m);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 127 */           MainMemory.setI32(paramInt1, MainMemory.getI32(i4 + 64));
/* 128 */           i2 = paramInt2 + -1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 136 */             if (MainMemory.getI32(i4 + 64) + 1 != paramInt2) {
/*     */               break label295;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */             ffmahd_1122.call(paramInt1, paramInt4, paramInt3);
/*     */             
/*     */             break label471;
/*     */             
/*     */             label295:
/* 151 */             i3 = MainMemory.getI32(i4 + 76) + 1;
/* 152 */             i3 = i3 <= i2 ? i3 : i2;
/* 153 */             if (MainMemory.getI64(MainMemory.getI32(i4 + 84) + (i3 << 3)) >= MainMemory.getI64(i4 + 32)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */             if (ffchdu.call(paramInt1, paramInt4) >= 1) {
/*     */               break label401;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */             ffmahd_1120.call(paramInt1, paramInt4, i3, paramInt3, j);
/*     */             
/*     */ 
/*     */             label401:
/*     */             
/*     */ 
/* 179 */             i3 = MainMemory.getI32(paramInt4);
/* 180 */             if (i3 <= 0) {
/*     */               break label443;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */             ffmahd_1121.call(i3, paramInt2, k);
/*     */             
/*     */             break label471;
/*     */             
/*     */             label443:
/* 195 */             i4 = MainMemory.getI32(m);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 201 */           MainMemory.setI32(paramInt4, 107);
/*     */         }
/*     */       }
/*     */       
/*     */       label471:
/*     */       
/* 207 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 218 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmahd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */