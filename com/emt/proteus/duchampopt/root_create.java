/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class root_create
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3093;
/*  13 */   public static final Function _instance = new root_create();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public root_create() { super("root_create", 2, false); }
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
/*  46 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  50 */       j = MainMemory.alloc(4);
/*  51 */       MainMemory.setI32(paramInt2, -1);
/*  52 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  59 */         if (m >= 300) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */         k = 499456 + m * 12;
/*  70 */         if (MainMemory.getI32(k) != 0) {
/*     */           break label191;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         MainMemory.setI32(paramInt2, m);
/*  81 */         if (m == -1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         n = F272877.call(paramInt1, 35744, j);
/*  92 */         if (n != 0) {
/*     */           break label172;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         MainMemory.setI32(k, MainMemory.getI32(j));
/* 103 */         MainMemory.setI64(499456 + m * 12 + 4, 0L);
/* 104 */         i = 0;
/*     */         
/*     */ 
/*     */         break label215;
/*     */         
/*     */         label172:
/*     */         
/* 111 */         ffxmsg.call(5, 65344);
/* 112 */         i = n;
/*     */         
/*     */ 
/*     */         break label215;
/*     */         
/*     */         label191:
/*     */         
/* 119 */         m += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 125 */       i = 103;
/*     */       
/*     */ 
/*     */       label215:
/*     */       
/*     */ 
/* 131 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 136 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/root_create.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */