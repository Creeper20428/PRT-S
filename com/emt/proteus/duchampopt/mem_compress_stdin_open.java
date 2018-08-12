/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class mem_compress_stdin_open extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3063;
/*  16 */   public static final Function _instance = new mem_compress_stdin_open();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public mem_compress_stdin_open() { super("mem_compress_stdin_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  37 */     int m = call(i, j, k);
/*  38 */     paramFrame.setI32(paramInt1, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       if (paramInt2 != 0) {
/*     */         break label604;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       MainMemory.setI32(paramInt3, -1);
/*  67 */       paramInt2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  74 */         if (paramInt2 >= 300)
/*     */         {
/*     */ 
/*     */ 
/*  78 */           paramInt2 = 103;
/*  79 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  85 */         j = 512000 + paramInt2 * 44;
/*  86 */         if (MainMemory.getI32(j) != 0) {
/*     */           break label572;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */         MainMemory.setI32(paramInt3, paramInt2);
/*  97 */         if (paramInt2 == -1) {
/*  98 */           paramInt2 = 103;
/*  99 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         k = 512000 + paramInt2 * 44 + 4;
/* 109 */         MainMemory.setI32(j, k);
/* 110 */         m = 512000 + paramInt2 * 44 + 12;
/* 111 */         MainMemory.setI32(512000 + paramInt2 * 44 + 8, m);
/* 112 */         n = malloc.call(28800);
/* 113 */         MainMemory.setI32(k, n);
/* 114 */         if (n != 0) {
/*     */           break label219;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */         ffxmsg.call(5, 109856);
/* 125 */         paramInt2 = 104;
/* 126 */         break;
/*     */         
/*     */         label219:
/*     */         
/* 130 */         MainMemory.setI32(m, 28800);
/* 131 */         MainMemory.setI32(512000 + paramInt2 * 44 + 16, 2880);
/* 132 */         MainMemory.setI64(512000 + paramInt2 * 44 + 32, 0L);
/* 133 */         MainMemory.setI64(512000 + paramInt2 * 44 + 24, 0L);
/* 134 */         MainMemory.setI32(512000 + paramInt2 * 44 + 20, 2786);
/* 135 */         i1 = mem_uncompress2mem.call(paramInt1, MainMemory.getI32Aligned(1792), MainMemory.getI32(paramInt3));
/* 136 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 137 */         if (i1 != 0) {
/*     */           break label514;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         i1 = (int)MainMemory.getI64(512000 + paramInt2 * 44 + 32);
/* 148 */         if (!MathUtils.ugt(MainMemory.getI32(MainMemory.getI32(512000 + paramInt2 * 44 + 8)), i1 + 256)) {
/*     */           break label502;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         paramInt1 = realloc.call(MainMemory.getI32(MainMemory.getI32(512000 + paramInt2 * 44)), i1);
/* 159 */         if (paramInt1 != 0) {
/*     */           break label438;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */         ffxmsg.call(5, 134176);
/* 170 */         i = 113;
/*     */         
/*     */ 
/*     */         break label618;
/*     */         
/*     */         label438:
/*     */         
/* 177 */         MainMemory.setI32(MainMemory.getI32(512000 + MainMemory.getI32(paramInt3) * 44), paramInt1);
/* 178 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 179 */         MainMemory.setI32(MainMemory.getI32(512000 + paramInt2 * 44 + 8), (int)MainMemory.getI64(512000 + paramInt2 * 44 + 32));
/* 180 */         i = 0;
/*     */         
/*     */ 
/*     */         break label618;
/*     */         
/*     */         label502:
/*     */         
/* 187 */         i = 0;
/*     */         
/*     */ 
/*     */         break label618;
/*     */         
/*     */         label514:
/*     */         
/* 194 */         j = 512000 + paramInt2 * 44;
/* 195 */         free.call(MainMemory.getI32(MainMemory.getI32(j)));
/* 196 */         MainMemory.setI32(j, 0);
/* 197 */         MainMemory.setI32(512000 + paramInt2 * 44 + 4, 0);
/* 198 */         ffxmsg.call(5, 131424);
/* 199 */         i = i1;
/*     */         
/*     */ 
/*     */         break label618;
/*     */         
/*     */         label572:
/*     */         
/* 206 */         paramInt2 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */       ffxmsg.call(5, 126496);
/* 214 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label618;
/*     */       
/*     */       label604:
/*     */       
/* 221 */       ffxmsg.call(5, 143712);
/* 222 */       i = 112;
/*     */       
/*     */ 
/*     */       label618:
/*     */       
/*     */ 
/* 228 */       int i2 = i; return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_compress_stdin_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */