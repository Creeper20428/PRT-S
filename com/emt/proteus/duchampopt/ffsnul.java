/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffsnul extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3600;
/*  13 */   public static final Function _instance = new ffsnul();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffsnul() { super("ffsnul", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3);
/*  21 */     return 0;
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
/*  35 */     call(i, j, k);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */         i = MainMemory.getI32(paramInt1);
/*  62 */         j = paramInt1 + 4;
/*  63 */         k = MainMemory.getI32(j);
/*  64 */         if (i != 0) {
/*     */           break label87;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         if (MainMemory.getI64(k + 88) == 0L) {
/*  75 */           i = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           label87:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */           if (i != MainMemory.getI32(k + 64)) {
/*     */             break label168;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */           if (MainMemory.getI64(k + 112) != -1L) {
/*     */             break label183;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           if (ffrdef.call(paramInt1, paramInt3) > 0) {
/* 106 */             i = 0;
/*     */             
/*     */             break label231;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label183;
/*     */           }
/*     */           label168:
/* 115 */           ffmahd.call(paramInt1, i + 1, 0, paramInt3);
/*     */           
/*     */ 
/*     */           label183:
/*     */           
/*     */ 
/* 121 */           k = MainMemory.getI32(j);
/* 122 */           if (MainMemory.getI32(k + 1012) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 126 */             i = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 133 */             i = MainMemory.getI32(k + 68);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label231:
/*     */         
/*     */ 
/* 141 */         if (MainMemory.getI32(paramInt3) <= 0) {
/*     */           break label261;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label343;
/*     */       
/*     */ 
/*     */ 
/*     */       label261:
/*     */       
/*     */ 
/*     */ 
/* 157 */       if (i != 1) {
/*     */         break label331;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */       m = MainMemory.getI32(MainMemory.getI32(j) + 944) + (paramInt2 + -1) * 152 + 116;
/* 168 */       MainMemory.setI8(m, (byte)0);
/* 169 */       SystemLibrary.strncat(m, 19264, 19);
/*     */       
/*     */ 
/*     */       break label343;
/*     */       
/*     */       label331:
/*     */       
/* 176 */       MainMemory.setI32(paramInt3, 226);
/*     */       
/*     */ 
/*     */       label343:
/*     */       
/*     */ 
/* 182 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffsnul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */