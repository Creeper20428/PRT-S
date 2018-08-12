/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class compress2file_from_mem extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3670;
/*  16 */   public static final Function _instance = new compress2file_from_mem();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public compress2file_from_mem() { super("compress2file_from_mem", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = call(i, j, k, m, n);
/*  44 */     paramFrame.setI32(paramInt1, i1);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int i = 0;
/*     */     
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*     */     
/*     */ 
/*  60 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       j = MainMemory.alloc(56);
/*  65 */       i2 = MainMemory.getI32(paramInt5);
/*  66 */       if (i2 <= 0) {
/*     */         break label72;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       i = i2;
/*     */       
/*     */ 
/*     */       break label602;
/*     */       
/*     */       label72:
/*     */       
/*  83 */       k = malloc.call(115200);
/*  84 */       if (k != 0) {
/*     */         break label118;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       MainMemory.setI32(paramInt5, 113);
/*  95 */       i = 113;
/*     */       
/*     */ 
/*     */       break label602;
/*     */       
/*     */       label118:
/*     */       
/* 102 */       MainMemory.setI32(j + 32, 0);
/* 103 */       MainMemory.setI32(j + 36, 0);
/* 104 */       MainMemory.setI32(j + 40, 0);
/* 105 */       m = j;
/* 106 */       if (deflateInit2_.call(m) != 0) {
/*     */         break label584;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       MainMemory.setI32(j, paramInt1);
/* 117 */       MainMemory.setI32(j + 4, paramInt2);
/* 118 */       n = j + 12;
/* 119 */       MainMemory.setI32(n, k);
/* 120 */       i1 = j + 16;
/* 121 */       paramInt2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 128 */         MainMemory.setI32(i1, 115200);
/* 129 */         switch (deflate.call(m))
/*     */         {
/*     */         case 1: 
/*     */           break label355;
/*     */           
/*     */           break;
/*     */         case 0: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 140 */         if (SystemLibrary.fwrite(k, 1, 115200, paramInt3) != 115200) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */         paramInt2 += 115200;
/* 151 */         MainMemory.setI32(n, k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 157 */       deflateEnd.call(m);
/* 158 */       free.call(k);
/* 159 */       MainMemory.setI32(paramInt5, 413);
/* 160 */       i = 413;
/*     */       
/*     */ 
/*     */       break label602;
/*     */       
/*     */       label355:
/*     */       
/* 167 */       i1 = j + 20;
/* 168 */       i2 = MainMemory.getI32(i1);
/* 169 */       if (!MathUtils.ugt(i2, paramInt2)) {
/*     */         break label456;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */       if (SystemLibrary.fwrite(k, 1, i2 - paramInt2, paramInt3) != MainMemory.getI32(i1) - paramInt2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */         deflateEnd.call(m);
/* 190 */         free.call(k);
/* 191 */         MainMemory.setI32(paramInt5, 413);
/* 192 */         i = 413;
/*     */       }
/*     */       else
/*     */       {
/*     */         label456:
/*     */         
/*     */ 
/* 199 */         free.call(k);
/* 200 */         if (paramInt4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */           MainMemory.setI32(paramInt4, MainMemory.getI32(i1));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 216 */         if (deflateEnd.call(m) != 0) {
/*     */           break label527;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */         i = MainMemory.getI32(paramInt5);
/*     */         
/*     */ 
/*     */         break label602;
/*     */         
/*     */         label527:
/*     */         
/* 233 */         MainMemory.setI32(paramInt5, 413);
/* 234 */         i = 413;
/*     */         
/*     */ 
/*     */ 
/*     */         break label602;
/*     */         
/*     */ 
/* 241 */         deflateEnd.call(m);
/* 242 */         free.call(k);
/* 243 */         MainMemory.setI32(paramInt5, 413);
/* 244 */         i = 413;
/*     */         
/*     */ 
/*     */         break label602;
/*     */         
/*     */         label584:
/*     */         
/* 251 */         MainMemory.setI32(paramInt5, 413);
/* 252 */         i = 413;
/*     */       }
/*     */       
/*     */ 
/*     */       label602:
/*     */       
/* 258 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 263 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/compress2file_from_mem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */