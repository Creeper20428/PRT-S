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
/*     */ public final class smem_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3137;
/*  15 */   public static final Function _instance = new smem_open();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public smem_open() { super("smem_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  36 */     int m = call(i, j, k);
/*  37 */     paramFrame.setI32(paramInt1, m);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*     */     
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*     */     
/*     */ 
/*  49 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       if ((paramInt1 == 0) || (paramInt3 == 0)) {
/*  55 */         paramInt2 = 152;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  65 */       else if (SystemLibrary.sscanf(paramInt1, 18176, new int[] { j }) != 1)
/*     */       {
/*     */ 
/*     */ 
/*  69 */         paramInt2 = 151;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  76 */         k = shared_attach.call(MainMemory.getI32(j));
/*  77 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*  81 */           paramInt2 = k;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  88 */           paramInt1 = shared_lock.call(MainMemory.getI32(j), paramInt2 == 1 ? 1 : 0);
/*  89 */           if (paramInt1 != 0) {
/*     */             break label167;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */           shared_free.call(MainMemory.getI32(j));
/* 100 */           i = 151;
/*     */           
/*     */ 
/*     */           break label270;
/*     */           
/*     */           label167:
/*     */           
/* 107 */           paramInt2 = MainMemory.getI32(j);
/* 108 */           if (MainMemory.getI32(paramInt1 + 4) != paramInt2) {
/*     */             break label235;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           if (MainMemory.getI32(paramInt1) != 425918740) {
/*     */             break label235;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */           MainMemory.setI32(paramInt3, paramInt2);
/* 129 */           i = 0;
/*     */           
/*     */ 
/*     */           break label270;
/*     */           
/*     */           label235:
/*     */           
/* 136 */           shared_unlock.call(paramInt2);
/* 137 */           shared_free.call(MainMemory.getI32(j));
/* 138 */           i = 151;
/*     */           
/*     */ 
/*     */           break label270;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 146 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label270:
/*     */       
/*     */ 
/* 152 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 157 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */