/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffpdes
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3266;
/*  16 */   public static final Function _instance = new ffpdes();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffpdes() { super("ffpdes", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i, j, l1, l2, l3, k);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*  63 */     int i5 = 0;
/*  64 */     int i6 = 0;
/*  65 */     int i7 = 0;
/*  66 */     int i8 = 0;
/*  67 */     int i9 = 0;
/*  68 */     byte b = 0;
/*     */     
/*     */ 
/*  71 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       i = MainMemory.alloc(8);
/*  76 */       j = MainMemory.alloc(16);
/*  77 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         k = MainMemory.getI32(paramInt1);
/*  88 */         m = paramInt1 + 4;
/*  89 */         n = MainMemory.getI32(m);
/*  90 */         if (k != MainMemory.getI32(n + 64)) {
/*     */           break label186;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (MainMemory.getI64(n + 112) != -1L) {
/*     */           break label203;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         if (ffrdef.call(paramInt1, paramInt3) <= 0) {
/*     */           break label203;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label823;
/*     */       
/*     */ 
/*     */ 
/*     */       label186:
/*     */       
/*     */ 
/*     */ 
/* 126 */       ffmahd.call(paramInt1, k + 1, 0, paramInt3);
/*     */       
/*     */ 
/*     */       label203:
/*     */       
/*     */ 
/* 132 */       n = MainMemory.getI32(m);
/* 133 */       i1 = MainMemory.getI32(n + 944);
/* 134 */       paramInt2 += -1;
/* 135 */       if (MainMemory.getI32(i1 + paramInt2 * 152 + 80) <= -1) {
/*     */         break label276;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       MainMemory.setI32(paramInt3, 317);
/* 147 */       n = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */ 
/*     */       label276:
/*     */       
/*     */ 
/*     */ 
/* 155 */       ffmbyt.call(paramInt1, MainMemory.getI64(i1 + paramInt2 * 152 + 72) + MainMemory.getI64(n + 112) + MainMemory.getI64(n + 936) * (paramLong1 + -1L), 1, paramInt3);
/* 156 */       if (MainMemory.getI8(i1 + paramInt2 * 152 + 136) != 80)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         if (MainMemory.getI8(i1 + paramInt2 * 152 + 136 + 1) != 80) {
/*     */           break label612;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */       if ((!MathUtils.ugt(paramLong2, 4294967295L)) && (paramLong3 <= 4294967295L) && (paramLong3 >= 0L)) {
/*     */         break label452;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */       ffxmsg.call(5, 116832);
/* 187 */       MainMemory.setI32(paramInt3, 412);
/*     */       
/*     */ 
/*     */       break label823;
/*     */       
/*     */       label452:
/*     */       
/* 194 */       paramInt2 = (int)paramLong2;
/* 195 */       MainMemory.setI32(i, paramInt2);
/* 196 */       MainMemory.setI32(i + 4, (int)paramLong3);
/*     */       
/* 198 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 206 */         i8 = i + (k << 2);
/* 207 */         i9 = i8 + 1;
/* 208 */         i6 = i8 + 2;
/* 209 */         i7 = i8 + 3;
/* 210 */         k += 1;
/* 211 */         MainMemory.setI8(i8, (byte)(paramInt2 >>> 24));
/* 212 */         MainMemory.setI8(i9, (byte)(paramInt2 >>> 16));
/* 213 */         MainMemory.setI8(i6, (byte)(paramInt2 >>> 8));
/* 214 */         MainMemory.setI8(i7, (byte)paramInt2);
/* 215 */         if (k != 2) {
/*     */           break label591;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */         ffpbyt.call(paramInt1, 8L, i, paramInt3);
/* 226 */         break;
/*     */         
/*     */ 
/*     */         label591:
/*     */         
/*     */ 
/* 232 */         paramInt2 = MainMemory.getI32(i + (k << 2));
/*     */       }
/*     */       
/*     */ 
/*     */       label612:
/*     */       
/*     */ 
/* 239 */       MainMemory.setI64(j, paramLong2);
/* 240 */       MainMemory.setI64(j + 8, paramLong3);
/* 241 */       paramInt2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 248 */         i2 = j + (paramInt2 << 3);
/* 249 */         i3 = i2 + 7;
/* 250 */         i4 = i2 + 1;
/* 251 */         i5 = i2 + 6;
/* 252 */         i6 = i2 + 2;
/* 253 */         i7 = i2 + 5;
/* 254 */         i8 = i2 + 3;
/* 255 */         i9 = i2 + 4;
/* 256 */         b = MainMemory.getI8(i2);
/* 257 */         MainMemory.setI8(i2, MainMemory.getI8(i3));
/* 258 */         MainMemory.setI8(i3, b);
/* 259 */         b = MainMemory.getI8(i4);
/* 260 */         MainMemory.setI8(i4, MainMemory.getI8(i5));
/* 261 */         MainMemory.setI8(i5, b);
/* 262 */         b = MainMemory.getI8(i6);
/* 263 */         MainMemory.setI8(i6, MainMemory.getI8(i7));
/* 264 */         MainMemory.setI8(i7, b);
/* 265 */         b = MainMemory.getI8(i8);
/* 266 */         MainMemory.setI8(i8, MainMemory.getI8(i9));
/* 267 */         MainMemory.setI8(i9, b);
/* 268 */         paramInt2 += 1;
/* 269 */         if (paramInt2 == 2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */       ffpbyt.call(paramInt1, 16L, j, paramInt3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label823:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpdes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */