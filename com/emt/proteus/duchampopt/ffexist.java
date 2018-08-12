/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffexist
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2995;
/*  14 */   public static final Function _instance = new ffexist();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffexist() { super("ffexist", 3, false); }
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
/*     */     
/*     */ 
/*  47 */     int k = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  51 */       i = MainMemory.alloc(4);
/*  52 */       j = MainMemory.alloc(1025);
/*  53 */       if (MainMemory.getI32(paramInt3) <= 0) {
/*     */         break label53;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label252;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label53:
/*     */       
/*     */ 
/*     */ 
/*  69 */       ffrtnm.call(paramInt1, j, paramInt3);
/*  70 */       paramInt1 = SystemLibrary.strstr(j, 17696);
/*  71 */       if (paramInt1 != 0) {
/*     */         break label113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */       if (MainMemory.getI8(j) != 45)
/*     */       {
/*     */ 
/*     */ 
/*  85 */         paramInt1 = j;
/*     */       }
/*     */       else
/*     */       {
/*     */         label113:
/*     */         
/*     */ 
/*  92 */         if (SystemLibrary.strncmp(j, 18624, 4) != 0) {
/*     */           break label242;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         paramInt1 += 3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       if (file_openfile.call(paramInt1, 0, i) != 0) {
/*     */         break label192;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */       MainMemory.setI32(paramInt2, 1);
/* 121 */       SystemLibrary.fclose(MainMemory.getI32(i));
/*     */       
/*     */ 
/*     */       break label252;
/*     */       
/*     */       label192:
/*     */       
/* 128 */       if (file_is_compressed.call(paramInt1) != 0) {
/*     */         break label227;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */       MainMemory.setI32(paramInt2, 0);
/*     */       
/*     */ 
/*     */       break label252;
/*     */       
/*     */       label227:
/*     */       
/* 145 */       MainMemory.setI32(paramInt2, 2);
/*     */       
/*     */ 
/*     */       break label252;
/*     */       
/*     */       label242:
/*     */       
/* 152 */       MainMemory.setI32(paramInt2, -1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label252:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       MainMemory.dealloc_generated(k);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffexist.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */