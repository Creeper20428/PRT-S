/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class ngp_delete_extver_tab extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3443;
/*  12 */   public static final Function _instance = new ngp_delete_extver_tab();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ngp_delete_extver_tab() { super("ngp_delete_extver_tab", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  19 */     return call();
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = call();
/*  25 */     paramFrame.setI32(paramInt1, i);
/*  26 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call()
/*     */   {
/*  31 */     int i = 0;
/*     */     
/*  33 */     int j = 0;
/*  34 */     int k = 0;
/*  35 */     int m = 0;
/*  36 */     int n = 0;
/*  37 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  43 */       k = MainMemory.getI32Aligned(458792);
/*  44 */       j = k == 0 ? 1 : 0;
/*  45 */       m = MainMemory.getI32Aligned(467184);
/*  46 */       if (j == 0) {
/*     */         break label112;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  56 */       if (m > 0) {
/*  57 */         m = 368;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  67 */         if (j == 0) {
/*     */           break label112;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         if (m == 0) {
/*  78 */           m = 0;
/*     */           
/*     */           break label154;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label166;
/*     */         }
/*     */         label112:
/*  87 */         if (m < 1) {
/*  88 */           m = 368;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*  98 */         else if ((j != 0) && (m == 0)) {
/*  99 */           m = 0;
/*     */         } else {
/*     */           break label166;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label154:
/*     */       
/*     */ 
/* 110 */       i = m;
/*     */       
/*     */ 
/*     */       break label297;
/*     */       
/*     */       label166:
/*     */       
/* 117 */       if (m > 0)
/*     */       {
/* 119 */         m = 0;
/*     */       } else {
/*     */         break label274;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 132 */         n = m + 1;
/* 133 */         i1 = MainMemory.getI32(k + (m << 3));
/* 134 */         if (i1 != 0)
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
/* 145 */           free.call(i1);
/* 146 */           k = MainMemory.getI32Aligned(458792);
/* 147 */           MainMemory.setI32(k + (m << 3), 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         MainMemory.setI32(k + (m << 3) + 4, 0);
/* 156 */         if (n >= MainMemory.getI32Aligned(467184))
/*     */           break;
/* 158 */         m = n;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label274:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 170 */       free.call(k);
/* 171 */       MainMemory.setI32Aligned(458792, 0);
/* 172 */       MainMemory.setI32Aligned(467184, 0);
/* 173 */       i = 0;
/*     */       
/*     */ 
/*     */       label297:
/*     */       
/*     */ 
/* 179 */       int i2 = i; return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_delete_extver_tab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */