/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class file_read extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3030;
/*  11 */   public static final Function _instance = new file_read();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public file_read() { super("file_read", 3, false); }
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
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       j = 503808 + (paramInt1 << 4) + 12;
/*  52 */       if (MainMemory.getI32(j) != 2) {
/*     */         break label113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  62 */       k = 503808 + (paramInt1 << 4) + 4;
/*  63 */       l = MainMemory.getI64(k);
/*  64 */       if (com.emt.proteus.runtime.api.SystemLibrary.fseek(MainMemory.getI32(503808 + (paramInt1 << 4)), l, 0) != 0)
/*     */       {
/*     */ 
/*     */ 
/*  68 */         paramInt1 = 116;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  75 */         MainMemory.setI64(k, l);
/*     */         
/*     */ 
/*     */         label113:
/*     */         
/*     */ 
/*  81 */         m = com.emt.proteus.runtime.api.SystemLibrary.fread(paramInt2, 1, paramInt3, MainMemory.getI32(503808 + (paramInt1 << 4)));
/*  82 */         if (m != 1) {
/*     */           break label235;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         n = MainMemory.getI8(paramInt2);
/*  93 */         switch (n) {
/*  94 */         case 0:  paramInt1 = 107;
/*     */           break label298;
/*     */           break; case 10:  paramInt1 = 107;
/*     */           
/*     */ 
/*     */           break label298;
/*     */           
/*     */ 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 106 */         i = n == 32 ? 107 : 108;
/*     */         
/*     */ 
/*     */         break label305;
/*     */         
/*     */         label235:
/*     */         
/* 113 */         if (m != paramInt3)
/*     */         {
/*     */ 
/*     */ 
/* 117 */           paramInt1 = 108;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 124 */           k = 503808 + (paramInt1 << 4) + 4;
/* 125 */           MainMemory.setI64(k, MainMemory.getI64(k) + paramInt3);
/* 126 */           MainMemory.setI32(j, 1);
/* 127 */           i = 0;
/*     */           
/*     */           break label305;
/*     */         }
/*     */       }
/*     */       
/*     */       label298:
/*     */       
/* 135 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label305:
/*     */       
/*     */ 
/* 141 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_read.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */