/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class file_write extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3029;
/*  11 */   public static final Function _instance = new file_write();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public file_write() { super("file_write", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = call(i, j, k);
/*  33 */     paramFrame.setI32(paramInt1, m);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     long l = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       j = 503808 + (paramInt1 << 4) + 12;
/*  50 */       if (MainMemory.getI32(j) != 1) {
/*     */         break label107;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */       k = 503808 + (paramInt1 << 4) + 4;
/*  61 */       l = MainMemory.getI64(k);
/*  62 */       if (com.emt.proteus.runtime.api.SystemLibrary.fseek(MainMemory.getI32(503808 + (paramInt1 << 4)), l, 0) != 0)
/*     */       {
/*     */ 
/*     */ 
/*  66 */         paramInt1 = 116;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  73 */         MainMemory.setI64(k, l);
/*     */         
/*     */ 
/*     */         label107:
/*     */         
/*     */ 
/*  79 */         if (com.emt.proteus.runtime.api.SystemLibrary.fwrite(paramInt2, 1, paramInt3, MainMemory.getI32(503808 + (paramInt1 << 4))) != paramInt3)
/*     */         {
/*     */ 
/*     */ 
/*  83 */           paramInt1 = 106;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  90 */           k = 503808 + (paramInt1 << 4) + 4;
/*  91 */           MainMemory.setI64(k, MainMemory.getI64(k) + paramInt3);
/*  92 */           MainMemory.setI32(j, 2);
/*  93 */           i = 0;
/*     */           
/*     */ 
/*     */           break label190;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 101 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label190:
/*     */       
/*     */ 
/* 107 */       int m = i; return m;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_write.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */