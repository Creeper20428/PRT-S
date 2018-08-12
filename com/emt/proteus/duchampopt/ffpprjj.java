/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffpprjj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3540;
/*  15 */   public static final Function _instance = new ffpprjj();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpprjj() { super("ffpprjj", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramInt2, paramInt3);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, l1, l2, j, k);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */         i = MainMemory.getI32(paramInt1);
/*  69 */         j = paramInt1 + 4;
/*  70 */         k = MainMemory.getI32(j);
/*  71 */         if (i != MainMemory.getI32(k + 64)) {
/*     */           break label138;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         if (MainMemory.getI64(k + 112) != -1L) {
/*     */           break label155;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         if (ffrdef.call(paramInt1, paramInt3) <= 0) {
/*     */           break label155;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         i = MainMemory.getI32(paramInt3);
/*     */         
/*     */         break label182;
/*     */         
/*     */         label138:
/*     */         
/* 107 */         ffmahd.call(paramInt1, i + 1, 0, paramInt3);
/*     */         
/*     */ 
/*     */         label155:
/*     */         
/*     */ 
/* 113 */         i = MainMemory.getI32(MainMemory.getI32(j) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label182:
/*     */         
/*     */ 
/*     */ 
/* 121 */         if (i != 0) {
/*     */           break label223;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       ffpcljj.call(paramInt1, 2, 1L, paramLong1, paramLong2, paramInt2, paramInt3);
/*     */       
/*     */ 
/*     */       break label242;
/*     */       
/*     */       label223:
/*     */       
/* 138 */       ffxmsg.call(5, 102240);
/* 139 */       MainMemory.setI32(paramInt3, 413);
/*     */       
/*     */ 
/*     */       label242:
/*     */       
/*     */ 
/* 145 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpprjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */