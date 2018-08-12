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
/*     */ public final class fits_read_rgnfile
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3593;
/*  15 */   public static final Function _instance = new fits_read_rgnfile();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public fits_read_rgnfile() { super("fits_read_rgnfile", 3, false); }
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
/*     */     
/*     */ 
/*  48 */     int k = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       i = MainMemory.alloc(4);
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       MainMemory.setI32(j, 0);
/*  55 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label118;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       ffxmsg.call(6, 0);
/*  66 */       if (ffopen.call(i, paramInt1, 0, j) != 0) {
/*     */         break label97;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       fits_read_fits_region.call(MainMemory.getI32(i), paramInt2, paramInt3);
/*     */       
/*     */ 
/*     */       break label123;
/*     */       
/*     */       label97:
/*     */       
/*  83 */       ffxmsg.call(2, 0);
/*  84 */       fits_read_ascii_region.call(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label118:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label123:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       MainMemory.dealloc_generated(k);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_read_rgnfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */