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
/*     */ public final class ffppnjj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3539;
/*  15 */   public static final Function _instance = new ffppnjj();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffppnjj() { super("ffppnjj", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, int paramInt2, long paramLong3, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramInt2, paramLong3, paramInt3);
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
/*  40 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, l1, l2, j, l3, k);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, int paramInt2, long paramLong3, int paramInt3)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */         i = MainMemory.getI32(paramInt1);
/*  72 */         j = paramInt1 + 4;
/*  73 */         k = MainMemory.getI32(j);
/*  74 */         if (i != MainMemory.getI32(k + 64)) {
/*     */           break label138;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         if (MainMemory.getI64(k + 112) != -1L) {
/*     */           break label155;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         if (ffrdef.call(paramInt1, paramInt3) <= 0) {
/*     */           break label155;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         i = MainMemory.getI32(paramInt3);
/*     */         
/*     */         break label182;
/*     */         
/*     */         label138:
/*     */         
/* 110 */         ffmahd.call(paramInt1, i + 1, 0, paramInt3);
/*     */         
/*     */ 
/*     */         label155:
/*     */         
/*     */ 
/* 116 */         i = MainMemory.getI32(MainMemory.getI32(j) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label182:
/*     */         
/*     */ 
/*     */ 
/* 124 */         if (i != 0) {
/*     */           break label224;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       ffpcnjj.call(paramInt1, 2, 1L, paramLong1, paramLong2, paramInt2, paramLong3, paramInt3);
/*     */       
/*     */ 
/*     */       break label243;
/*     */       
/*     */       label224:
/*     */       
/* 141 */       ffxmsg.call(5, 102240);
/* 142 */       MainMemory.setI32(paramInt3, 413);
/*     */       
/*     */ 
/*     */       label243:
/*     */       
/*     */ 
/* 148 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffppnjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */