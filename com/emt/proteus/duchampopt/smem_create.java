/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class smem_create
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3140;
/*  14 */   public static final Function _instance = new smem_create();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public smem_create() { super("smem_create", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2);
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
/*  32 */     int k = call(i, j);
/*  33 */     paramFrame.setI32(paramInt1, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*     */     
/*     */ 
/*  45 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  49 */       j = MainMemory.alloc(4);
/*  50 */       if ((paramInt1 == 0) || (paramInt2 == 0)) {
/*  51 */         k = 152;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  61 */       else if (SystemLibrary.sscanf(paramInt1, 18176, new int[] { j }) != 1)
/*     */       {
/*     */ 
/*     */ 
/*  65 */         k = 151;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  72 */         k = shared_malloc.call(MainMemory.getI32(j));
/*  73 */         MainMemory.setI32(j, k);
/*  74 */         if (k == -1) {
/*  75 */           k = 156;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  85 */           paramInt1 = shared_lock.call(k, 1);
/*  86 */           if (paramInt1 != 0) {
/*     */             break label158;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */           shared_free.call(MainMemory.getI32(j));
/*  97 */           i = 151;
/*     */           
/*     */ 
/*     */           break label220;
/*     */           
/*     */           label158:
/*     */           
/* 104 */           MainMemory.setI32(paramInt1, 425918740);
/* 105 */           MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(j));
/* 106 */           MainMemory.setI32(paramInt1 + 8, 2896);
/* 107 */           MainMemory.setI32(paramInt1 + 12, -1);
/* 108 */           MainMemory.setI32(paramInt2, MainMemory.getI32(j));
/* 109 */           i = 0;
/*     */           
/*     */ 
/*     */           break label220;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 117 */       i = k;
/*     */       
/*     */ 
/*     */       label220:
/*     */       
/*     */ 
/* 123 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 128 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_create.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */