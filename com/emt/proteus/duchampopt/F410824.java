/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F410824 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3633;
/*  11 */   public static final Function _instance = new F410824();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F410824() { super("F410824", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  19 */     return 0;
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
/*  36 */     call(i, j, k, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     double d1 = 0.0D;
/*  44 */     int i = 0;
/*  45 */     double d2 = 0.0D;
/*  46 */     double d3 = 0.0D;
/*  47 */     int j = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (paramInt2 > 0) {
/*  54 */         d1 = 0.0D;
/*  55 */         d3 = 0.0D;
/*  56 */         i = 0;
/*     */       }
/*     */       else
/*     */       {
/*  60 */         d3 = 0.0D;
/*  61 */         d1 = 0.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         break label105;
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*  71 */         d2 = MainMemory.getF32(paramInt1 + (i << 2));
/*  72 */         d3 += d2;
/*  73 */         d2 *= d2;
/*  74 */         d1 = d2 + d1;
/*  75 */         i += 1;
/*  76 */         if (i == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label105:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       if (paramInt2 <= 1) {
/*     */         break label213;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       d2 = paramInt2;
/* 104 */       d3 /= d2;
/* 105 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         MainMemory.setF64(paramInt3, d3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 121 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         d1 /= d2;
/* 132 */         d3 *= d3;
/* 133 */         d1 -= d3;
/* 134 */         MainMemory.setF64(paramInt4, com.emt.proteus.runtime.api.SystemLibrary.sqrt(d1));
/*     */         
/*     */ 
/*     */         break label359;
/*     */         
/*     */         label213:
/*     */         
/* 141 */         j = paramInt3 == 0 ? 1 : 0;
/* 142 */         if (paramInt2 != 1) {
/*     */           break label297;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         if (j == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */           MainMemory.setF64(paramInt3, d3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 168 */         if (paramInt4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */           MainMemory.setF64(paramInt4, 0.0D);
/*     */           
/*     */ 
/*     */           break label359;
/*     */           
/*     */           label297:
/*     */           
/* 185 */           if (j == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */             MainMemory.setF64(paramInt3, 0.0D);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 201 */           if (paramInt4 != 0) {
/*     */             break label349;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       break label359;
/*     */       
/*     */ 
/*     */ 
/*     */       label349:
/*     */       
/*     */ 
/*     */ 
/* 217 */       MainMemory.setF64(paramInt4, 0.0D);
/*     */       
/*     */ 
/*     */       label359:
/*     */       
/*     */ 
/* 223 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F410824.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */