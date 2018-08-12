/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgidt
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3262;
/*  14 */   public static final Function _instance = new ffgidt();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgidt() { super("ffgidt", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3);
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
/*  36 */     call(i, j, k);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  62 */         m = MainMemory.getI32(paramInt1);
/*  63 */         i = paramInt1 + 4;
/*  64 */         j = MainMemory.getI32(i);
/*  65 */         if (m != MainMemory.getI32(j + 64)) {
/*     */           break label129;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         if (MainMemory.getI64(j + 112) != -1L) {
/*     */           break label145;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         if (ffrdef.call(paramInt1, paramInt3) <= 0) {
/*     */           break label145;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label356;
/*     */       
/*     */ 
/*     */ 
/*     */       label129:
/*     */       
/*     */ 
/*     */ 
/* 101 */       ffmahd.call(paramInt1, m + 1, 0, paramInt3);
/*     */       
/*     */ 
/*     */       label145:
/*     */       
/*     */ 
/* 107 */       m = MainMemory.getI32(paramInt1);
/* 108 */       j = MainMemory.getI32(i);
/* 109 */       k = MainMemory.getI32(j + 64);
/* 110 */       if (m == k) {
/* 111 */         m = k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 122 */         ffmahd.call(paramInt1, m + 1, 0, paramInt3);
/* 123 */         j = MainMemory.getI32(i);
/* 124 */         m = MainMemory.getI32(j + 64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       MainMemory.setI64(j + 104, MainMemory.getI64(MainMemory.getI32(j + 84) + (m << 3)));
/* 135 */       j = MainMemory.getI32(i);
/* 136 */       if (MainMemory.getI32(j + 68) != 0) {
/*     */         break label297;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       ffgky.call(paramInt1, 31, 28224, paramInt2, 0, paramInt3);
/*     */       
/*     */ 
/*     */       break label356;
/*     */       
/*     */       label297:
/*     */       
/* 153 */       if (MainMemory.getI32(j + 1012) != 0) {
/*     */         break label339;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       MainMemory.setI32(paramInt3, 233);
/*     */       
/*     */ 
/*     */       break label356;
/*     */       
/*     */       label339:
/*     */       
/* 170 */       ffgky.call(paramInt1, 31, 39456, paramInt2, 0, paramInt3);
/*     */       
/*     */ 
/*     */       label356:
/*     */       
/*     */ 
/* 176 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgidt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */