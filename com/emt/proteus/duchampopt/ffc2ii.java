/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffc2ii extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3222;
/*  12 */   public static final Function _instance = new ffc2ii();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffc2ii() { super("ffc2ii", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*     */     
/*     */ 
/*  47 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  51 */       j = MainMemory.alloc(4);
/*  52 */       k = MainMemory.alloc(81);
/*  53 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */         m = SystemLibrary.__errno_location();
/*  64 */         MainMemory.setI32(m, 0);
/*  65 */         MainMemory.setI32(paramInt2, 0);
/*  66 */         MainMemory.setI32(paramInt2, SystemLibrary.strtol(paramInt1, j, 10));
/*  67 */         switch (MainMemory.getI8(MainMemory.getI32(j)))
/*     */         {
/*     */         case 0: 
/*     */           break label140;
/*     */           
/*     */           break;
/*     */         case 32: 
/*     */           break label140;
/*     */           break;
/*     */         }
/*     */         
/*  78 */         MainMemory.setI32(paramInt3, 407);
/*     */         
/*     */ 
/*     */         label140:
/*     */         
/*     */ 
/*  84 */         if (MainMemory.getI32(m) != 34) {
/*     */           break label206;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         SystemLibrary.memcpy(k, 120672, 54, 1);
/*  95 */         SystemLibrary.strncat(k, paramInt1, 25);
/*  96 */         ffxmsg.call(5, k);
/*  97 */         MainMemory.setI32(paramInt3, 412);
/*  98 */         MainMemory.setI32(m, 0);
/*     */       }
/*     */       
/*     */ 
/*     */       label206:
/*     */       
/* 104 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 115 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffc2ii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */