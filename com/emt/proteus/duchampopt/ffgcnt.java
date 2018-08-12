/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class ffgcnt
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3403;
/*  15 */   public static final Function _instance = new ffgcnt();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgcnt() { super("ffgcnt", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     call(i, j, k);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     int i3 = 0;
/*     */     
/*     */ 
/*  54 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       i = MainMemory.alloc(4);
/*  59 */       j = MainMemory.alloc(81);
/*  60 */       k = MainMemory.alloc(71);
/*  61 */       m = MainMemory.alloc(73);
/*  62 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         MainMemory.setI32(i, 0);
/*  73 */         MainMemory.setI8(paramInt2, (byte)0);
/*  74 */         if (ffgnky.call(paramInt1, j, i) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */           if (SystemLibrary.strncmp(j, 49280, 10) != 0) {
/*     */             break label200;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */           SystemLibrary.memcpy(j, 51136, 10, 1);
/*  95 */           ffpsvc.call(j, k, m, i);
/*  96 */           ffc2s.call(k, paramInt2, i);
/*  97 */           if (MainMemory.getI32(i) != 0) {
/*     */             break label185;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       break label290;
/*     */       
/*     */ 
/*     */ 
/*     */       label185:
/*     */       
/*     */ 
/*     */ 
/* 113 */       MainMemory.setI8(paramInt2, (byte)0);
/*     */       
/*     */ 
/*     */       break label290;
/*     */       
/*     */       label200:
/*     */       
/* 120 */       n = MainMemory.getI32(paramInt1);
/* 121 */       i1 = paramInt1 + 4;
/* 122 */       i2 = MainMemory.getI32(i1);
/* 123 */       if (n != MainMemory.getI32(i2 + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         ffmahd.call(paramInt1, n + 1, 0, paramInt3);
/* 135 */         i2 = MainMemory.getI32(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       i3 = i2 + 104;
/* 144 */       MainMemory.setI64(i3, MainMemory.getI64(i3) + -80L);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label290:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */