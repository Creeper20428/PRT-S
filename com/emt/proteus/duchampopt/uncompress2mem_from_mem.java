/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class uncompress2mem_from_mem extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3671;
/*  14 */   public static final Function _instance = new uncompress2mem_from_mem();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public uncompress2mem_from_mem() { super("uncompress2mem_from_mem", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i2 = call(i, j, k, m, n, i1);
/*  45 */     paramFrame.setI32(paramInt1, i2);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*     */     
/*     */ 
/*  64 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       j = MainMemory.alloc(56);
/*  69 */       k = MainMemory.getI32(paramInt6);
/*  70 */       if (k <= 0) {
/*     */         break label81;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       i = k;
/*     */       
/*     */ 
/*     */       break label666;
/*     */       
/*     */       label81:
/*     */       
/*  87 */       MainMemory.setI32(j + 32, 0);
/*  88 */       m = j + 36;
/*  89 */       MainMemory.setI32(m, 0);
/*  90 */       n = j + 40;
/*  91 */       MainMemory.setI32(n, 0);
/*  92 */       if (inflateInit2_.call(j) != 0) {
/*     */         break label648;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */       MainMemory.setI32(j, paramInt1);
/* 103 */       MainMemory.setI32(j + 4, paramInt2);
/* 104 */       i1 = j + 12;
/* 105 */       MainMemory.setI32(i1, MainMemory.getI32(paramInt3));
/* 106 */       i2 = j + 16;
/* 107 */       MainMemory.setI32(i2, MainMemory.getI32(paramInt4));
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 113 */         switch (inflate.call(j))
/*     */         {
/*     */         case 1: 
/*     */           break label386;
/*     */           
/*     */           break;
/*     */         case 0: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 124 */         paramInt1 = realloc.call(MainMemory.getI32(paramInt3), MainMemory.getI32(paramInt4) + 28800);
/* 125 */         MainMemory.setI32(paramInt3, paramInt1);
/* 126 */         if (paramInt1 != 0) {
/*     */           break label346;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         i3 = j + 28;
/* 137 */         i4 = MainMemory.getI32(i3);
/* 138 */         if (i4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */           uncompress2mem_from_mem_1704.call(i4, i3, n, m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 154 */         MainMemory.setI32(paramInt6, 414);
/* 155 */         i = 414;
/*     */         
/*     */ 
/*     */         break label666;
/*     */         
/*     */         label346:
/*     */         
/* 162 */         MainMemory.setI32(i2, 28800);
/* 163 */         paramInt2 = MainMemory.getI32(paramInt4);
/* 164 */         MainMemory.setI32(i1, paramInt1 + paramInt2);
/* 165 */         MainMemory.setI32(paramInt4, paramInt2 + 28800);
/*     */       }
/*     */       
/*     */       label386:
/*     */       
/* 170 */       if (paramInt5 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */         MainMemory.setI32(paramInt5, MainMemory.getI32(j + 20));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 186 */       i3 = j + 28;
/* 187 */       i4 = MainMemory.getI32(i3);
/* 188 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */         i5 = MainMemory.getI32(m);
/* 199 */         if (i5 != 0) {
/*     */           break label496;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */       MainMemory.setI32(paramInt6, 414);
/* 210 */       i = 414;
/*     */       
/*     */ 
/*     */       break label666;
/*     */       
/*     */       label496:
/*     */       
/* 217 */       paramInt1 = MainMemory.getI32(i4 + 52);
/* 218 */       if (paramInt1 != 0)
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
/*     */ 
/* 230 */         SystemLibrary.do_indirect(i5, MainMemory.getI32(n), paramInt1);
/* 231 */         i5 = MainMemory.getI32(m);
/* 232 */         i4 = MainMemory.getI32(i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       SystemLibrary.do_indirect(i5, MainMemory.getI32(n), i4);
/* 243 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */       break label666;
/*     */       
/*     */ 
/* 250 */       i3 = j + 28;
/* 251 */       i4 = MainMemory.getI32(i3);
/* 252 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */         uncompress2mem_from_mem_1703.call(i3, i4, n, m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 268 */       MainMemory.setI32(paramInt6, 414);
/* 269 */       i = 414;
/*     */       
/*     */ 
/*     */       break label666;
/*     */       
/*     */       label648:
/*     */       
/* 276 */       MainMemory.setI32(paramInt6, 414);
/* 277 */       i = 414;
/*     */       
/*     */ 
/*     */       label666:
/*     */       
/*     */ 
/* 283 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 288 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/uncompress2mem_from_mem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */