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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgtis
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3440;
/*  23 */   public static final Function _instance = new ffgtis();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffgtis() { super("ffgtis", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int m = call(i, j, k);
/*  45 */     paramFrame.setI32(paramInt1, m);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
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
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*  66 */     int i10 = 0;
/*  67 */     int i11 = 0;
/*  68 */     int i12 = 0;
/*  69 */     int i13 = 0;
/*  70 */     long l = 0L;
/*     */     
/*     */ 
/*  73 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  77 */       j = MainMemory.alloc(71);
/*  78 */       k = MainMemory.alloc(81);
/*  79 */       m = MainMemory.alloc(4);
/*  80 */       n = MainMemory.alloc(4);
/*  81 */       i1 = MainMemory.alloc(24);
/*  82 */       i2 = MainMemory.alloc(24);
/*  83 */       i3 = MainMemory.alloc(102);
/*  84 */       i4 = MainMemory.alloc(54);
/*  85 */       i5 = MainMemory.alloc(9);
/*  86 */       i6 = MainMemory.alloc(72);
/*  87 */       i7 = MainMemory.alloc(71);
/*  88 */       i8 = MainMemory.alloc(73);
/*  89 */       MainMemory.setI32(m, 0);
/*  90 */       MainMemory.setI32(n, 0);
/*  91 */       SystemLibrary.memcpy(i5, 44224, 9, 1);
/*  92 */       MainMemory.setI32(i1, i3);
/*  93 */       MainMemory.setI32(i2, i4);
/*  94 */       MainMemory.setI32(i1 + 4, i3 + 17);
/*  95 */       MainMemory.setI32(i2 + 4, i4 + 9);
/*  96 */       MainMemory.setI32(i1 + 8, i3 + 34);
/*  97 */       MainMemory.setI32(i2 + 8, i4 + 18);
/*  98 */       MainMemory.setI32(i1 + 12, i3 + 51);
/*  99 */       MainMemory.setI32(i2 + 12, i4 + 27);
/* 100 */       MainMemory.setI32(i1 + 16, i3 + 68);
/* 101 */       MainMemory.setI32(i2 + 16, i4 + 36);
/* 102 */       MainMemory.setI32(i1 + 20, i3 + 85);
/* 103 */       MainMemory.setI32(i2 + 20, i4 + 45);
/* 104 */       MainMemory.setI32(paramInt3, ffgtdc.call(i1, i2, m, paramInt3));
/* 105 */       i9 = MainMemory.getI32(m);
/* 106 */       i12 = ffibin.call(paramInt1, i9, i1, i2, paramInt3);
/* 107 */       MainMemory.setI32(paramInt3, i12);
/* 108 */       if (i12 != 0) {
/*     */         break label969;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       i10 = MainMemory.getI32(paramInt1) + 1;
/* 119 */       MainMemory.setI8(i7, (byte)0);
/* 120 */       MainMemory.setI8(i8, (byte)0);
/* 121 */       if (i12 <= 0)
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
/* 132 */         if (ffgcrd.call(paramInt1, 41248, k, paramInt3) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */           ffpsvc.call(k, i7, i8, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 148 */         i12 = MainMemory.getI32(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       if (i12 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         ffs2c.call(i5, j, i12);
/* 167 */         ffmkky.call(40928, j, 75648, k, paramInt3);
/* 168 */         ffikey.call(paramInt1, k, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 174 */       ffikyj.call(paramInt1, 34656, 0L, 79328, paramInt3);
/* 175 */       if (paramInt2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */         ffgtis_1069.call(paramInt3, paramInt2, k, paramInt1, j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 191 */       i11 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 198 */         i12 = i11 + 1;
/* 199 */         i13 = i1 + (i11 << 2);
/* 200 */         if (i11 >= i9) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */         if (MainMemory.getI32(paramInt3) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         paramInt2 = MainMemory.getI32(i13);
/* 221 */         if (SystemLibrary.strcasecmp(paramInt2, 56768) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */           if (SystemLibrary.strcasecmp(paramInt2, 55072) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 235 */             i11 = i12;
/* 236 */             continue;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 242 */         SystemLibrary.sprintf(i6, 39744, new Object[] { Integer.valueOf(i12) });
/* 243 */         i11 = MainMemory.getI32(paramInt3);
/* 244 */         if (i11 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */           MainMemory.setI8(j, (byte)0);
/* 256 */           MainMemory.setI8(i8, (byte)0);
/* 257 */           if (ffgcrd.call(paramInt1, i6, k, paramInt3) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */             ffpsvc.call(k, j, i8, paramInt3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 273 */           MainMemory.setI8(i7, (byte)0);
/* 274 */           ffc2s.call(j, i7, paramInt3);
/* 275 */           i11 = MainMemory.getI32(paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */         MainMemory.setI32(paramInt3, i11);
/* 284 */         SystemLibrary.sprintf(i6, 39776, new Object[] { Integer.valueOf(i12) });
/* 285 */         MainMemory.setI32(paramInt3, ffikyj.call(paramInt1, i6, 0L, 59552, paramInt3));
/* 286 */         i11 = i12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 291 */       if (ffmnhd.call(paramInt1, -1, 44224, 1, paramInt3) == 0) {
/* 292 */         i12 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 296 */         l = 1L;
/*     */         
/*     */ 
/*     */         break label898;
/*     */       }
/*     */       
/*     */       do
/*     */       {
/* 304 */         i9 = i12 + 2;
/* 305 */         i12 += 1;
/* 306 */       } while (ffmnhd.call(paramInt1, -1, 44224, i9, paramInt3) == 0);
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
/* 317 */       l = i9;
/*     */       
/*     */ 
/*     */ 
/*     */       label898:
/*     */       
/*     */ 
/*     */ 
/* 325 */       if (MainMemory.getI32(paramInt3) != 301) {
/*     */         break label931;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */       MainMemory.setI32(paramInt3, 0);
/*     */       
/*     */ 
/*     */       label931:
/*     */       
/*     */ 
/* 341 */       ffmahd.call(paramInt1, i10, n, paramInt3);
/* 342 */       ffmkyj.call(paramInt1, 34656, l, 14112, paramInt3);
/* 343 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */       break label977;
/*     */       
/*     */       label969:
/*     */       
/* 350 */       i = i12;
/*     */       
/*     */ 
/*     */       label977:
/*     */       
/*     */ 
/* 356 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 361 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */