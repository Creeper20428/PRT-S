/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class wcspihrestart extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2939;
/*  14 */   public static final Function _instance = new wcspihrestart();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public wcspihrestart() { super("wcspihrestart", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     call(paramInt);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       i = MainMemory.getI32Aligned(458832);
/*  51 */       j = i == 0 ? 1 : 0;
/*  52 */       if (j == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  62 */         if (MainMemory.getI32(i) != 0) {
/*     */           break label224;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         if (j == 0) {
/*     */           break label125;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       i2 = malloc.call(4);
/*  84 */       i = i2;
/*  85 */       MainMemory.setI32Aligned(458832, i);
/*  86 */       MainMemory.setI32(i2, 0);
/*  87 */       MainMemory.setI32Aligned(459364, 1);
/*     */       
/*     */       break label201;
/*     */       
/*     */       label125:
/*     */       
/*  93 */       i3 = MainMemory.getI32Aligned(459364);
/*  94 */       if (i3 != 1) {
/*     */         break label201;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */       i3 += 8;
/* 106 */       i = com.emt.proteus.runtime.library.c.realloc.call(i, i3 << 2);
/* 107 */       MainMemory.setI32Aligned(458832, i);
/* 108 */       SystemLibrary.memset(i + (MainMemory.getI32Aligned(459364) << 2), (byte)0, 32, 4);
/* 109 */       MainMemory.setI32Aligned(459364, i3);
/*     */       
/*     */ 
/*     */ 
/*     */       label201:
/*     */       
/*     */ 
/*     */ 
/* 117 */       MainMemory.setI32(i, wcspih_create_buffer.call(MainMemory.getI32Aligned(458796)));
/* 118 */       i = MainMemory.getI32Aligned(458832);
/*     */       
/*     */ 
/*     */ 
/*     */       label224:
/*     */       
/*     */ 
/*     */ 
/* 126 */       j = i == 0 ? 1 : 0;
/* 127 */       if (j == 0) {
/*     */         break label275;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       m = SystemLibrary.__errno_location();
/* 138 */       i3 = MainMemory.getI32(m);
/*     */       
/*     */ 
/* 141 */       k = 0;
/*     */       
/*     */       break label454;
/*     */       
/*     */       label275:
/* 146 */       k = MainMemory.getI32(i);
/* 147 */       m = SystemLibrary.__errno_location();
/* 148 */       i3 = MainMemory.getI32(m);
/* 149 */       if (k != 0)
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
/*     */ 
/* 162 */         MainMemory.setI32(k + 16, 0);
/* 163 */         n = k + 4;
/* 164 */         MainMemory.setI8(MainMemory.getI32(n), (byte)0);
/* 165 */         MainMemory.setI8(MainMemory.getI32(n) + 1, (byte)0);
/* 166 */         MainMemory.setI32(k + 8, MainMemory.getI32(n));
/* 167 */         MainMemory.setI32(k + 28, 1);
/* 168 */         MainMemory.setI32(k + 44, 0);
/* 169 */         i1 = MainMemory.getI32(i);
/* 170 */         if (i1 != k) {
/*     */           break label454;
/*     */         }
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
/* 183 */         MainMemory.setI32Aligned(459360, MainMemory.getI32(i1 + 16));
/* 184 */         i2 = MainMemory.getI32(i1 + 8);
/* 185 */         MainMemory.setI32Aligned(458840, i2);
/* 186 */         MainMemory.setI32Aligned(458936, i2);
/* 187 */         MainMemory.setI32Aligned(458796, MainMemory.getI32(i1));
/* 188 */         MainMemory.setI8(459016, MainMemory.getI8(i2));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label454:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 200 */       MainMemory.setI32(k, paramInt);
/* 201 */       MainMemory.setI32(k + 40, 1);
/* 202 */       if (j != 0) {
/* 203 */         i1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 213 */         i1 = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */       if (i1 != k)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */         MainMemory.setI32(k + 32, 1);
/* 232 */         MainMemory.setI32(k + 36, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 238 */       MainMemory.setI32(k + 24, 0);
/* 239 */       MainMemory.setI32(m, i3);
/* 240 */       k = MainMemory.getI32(i);
/* 241 */       MainMemory.setI32Aligned(459360, MainMemory.getI32(k + 16));
/* 242 */       i2 = MainMemory.getI32(k + 8);
/* 243 */       MainMemory.setI32Aligned(458840, i2);
/* 244 */       MainMemory.setI32Aligned(458936, i2);
/* 245 */       MainMemory.setI32Aligned(458796, MainMemory.getI32(k));
/* 246 */       MainMemory.setI8(459016, MainMemory.getI8(i2)); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcspihrestart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */