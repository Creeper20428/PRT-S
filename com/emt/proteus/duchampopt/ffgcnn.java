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
/*     */ public final class ffgcnn
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3274;
/*  15 */   public static final Function _instance = new ffgcnn();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgcnn() { super("ffgcnn", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, j, k, m, n, i1);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     int i8 = 0;
/*  66 */     int i9 = 0;
/*  67 */     int i10 = 0;
/*  68 */     int i11 = 0;
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     int i14 = 0;
/*     */     
/*     */ 
/*  74 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  78 */       i = MainMemory.alloc(4);
/*  79 */       j = MainMemory.alloc(81);
/*  80 */       k = MainMemory.alloc(81);
/*  81 */       m = MainMemory.alloc(4);
/*  82 */       n = MainMemory.alloc(4);
/*  83 */       i1 = MainMemory.getI32(paramInt6);
/*  84 */       if (i1 >= 1) {
/*     */         break label139;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       MainMemory.setI32Aligned(459372, 0);
/*  95 */       i1 = 0;
/*     */       
/*     */       break label176;
/*     */       
/*     */       label139:
/* 100 */       if (i1 != 237) {
/*     */         break label1052;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       MainMemory.setI32(paramInt6, 0);
/* 111 */       i1 = 237;
/*     */       
/*     */ 
/*     */ 
/*     */       label176:
/*     */       
/*     */ 
/* 118 */       MainMemory.setI8(paramInt4, (byte)0);
/* 119 */       MainMemory.setI32(paramInt5, 0);
/* 120 */       i4 = MainMemory.getI32(paramInt1);
/* 121 */       i2 = paramInt1 + 4;
/* 122 */       i7 = MainMemory.getI32(i2);
/* 123 */       if (i4 != MainMemory.getI32(i7 + 64)) {
/*     */         break label286;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */       if (MainMemory.getI64(i7 + 112) != -1L) {
/*     */         break label303;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       if (ffrdef.call(paramInt1, paramInt6) > 0) {
/*     */         break label1052;
/*     */       } else {
/*     */         break label303;
/*     */       }
/*     */       
/*     */ 
/*     */       label286:
/*     */       
/* 152 */       ffmahd.call(paramInt1, i4 + 1, 0, paramInt6);
/*     */       
/*     */ 
/*     */       label303:
/*     */       
/*     */ 
/* 158 */       i7 = MainMemory.getI32(i2);
/* 159 */       i3 = MainMemory.getI32(i7 + 944);
/* 160 */       i4 = MainMemory.getI32Aligned(459372);
/* 161 */       i5 = i4 + 1;
/*     */       
/* 163 */       i8 = 0;
/* 164 */       i9 = 0;
/* 165 */       i10 = 0;
/* 166 */       i11 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 177 */         i12 = i5 + i8;
/* 178 */         i13 = i4 + i8;
/* 179 */         i14 = i3 + i13 * 152;
/* 180 */         if (MainMemory.getI32(i7 + 916) <= i13) {
/*     */           break label637;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         ffcmps.call(paramInt3, i14, paramInt2, m, n);
/* 191 */         if (MainMemory.getI32(m) != 0)
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
/*     */ 
/*     */ 
/* 204 */           i6 = MainMemory.getI32(n) == 0 ? 1 : 0;
/* 205 */           if (i9 != 0) {
/*     */             break label568;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */           if (i6 == 0) {
/*     */             break label541;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */           if (i10 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */             i11 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 238 */             SystemLibrary.strcpy(paramInt4, i14);
/* 239 */             MainMemory.setI32(paramInt5, i12);
/* 240 */             MainMemory.setI32Aligned(459372, i12);
/*     */             
/* 242 */             i10 = 1;
/* 243 */             i11 = 1;
/*     */             
/*     */             break label586;
/*     */             
/*     */             label541:
/* 248 */             SystemLibrary.strcpy(paramInt4, i14);
/* 249 */             MainMemory.setI32(paramInt5, i12);
/* 250 */             i9 = 1;
/*     */             
/*     */ 
/*     */             break label586;
/*     */             
/*     */             label568:
/*     */             
/* 257 */             if (i6 == 0) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label586:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */         i8 += 1;
/* 274 */         i7 = MainMemory.getI32(i2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */       MainMemory.setI32Aligned(459372, MainMemory.getI32(paramInt5));
/* 285 */       MainMemory.setI32(paramInt6, 237);
/*     */       
/*     */ 
/*     */       break label1057;
/*     */       
/*     */       label637:
/*     */       
/* 292 */       if (i9 != 0) {
/*     */         break label1020;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */       if (i10 != 0) {
/*     */         break label1001;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */       if (i1 != 0)
/*     */       {
/*     */ 
/*     */ 
/* 316 */         paramInt2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 324 */         m = SystemLibrary.__errno_location();
/* 325 */         MainMemory.setI32(m, 0);
/* 326 */         paramInt2 = SystemLibrary.strtol(paramInt3, i, 10);
/* 327 */         switch (MainMemory.getI8(MainMemory.getI32(i)))
/*     */         {
/*     */         case 0: 
/*     */           break label778;
/*     */           
/*     */           break;
/*     */         case 32: 
/*     */           break label778;
/*     */           
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 340 */         i1 = 407;
/*     */         
/*     */ 
/*     */ 
/*     */         label778:
/*     */         
/*     */ 
/* 347 */         if (MainMemory.getI32(m) != 34) {
/*     */           break label850;
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
/* 359 */         SystemLibrary.memcpy(j, 120672, 54, 1);
/* 360 */         SystemLibrary.strncat(j, paramInt3, 25);
/* 361 */         ffxmsg.call(5, j);
/* 362 */         MainMemory.setI32(m, 0);
/* 363 */         MainMemory.setI32(paramInt6, 219);
/*     */         
/*     */         break label966;
/*     */       }
/*     */       
/*     */       label850:
/*     */       
/* 370 */       if (i1 != 0) {
/*     */         break label940;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 380 */       if ((MainMemory.getI32(MainMemory.getI32(i2) + 916) < paramInt2) || (paramInt2 >= 1))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */         MainMemory.setI32(paramInt5, paramInt2);
/* 391 */         SystemLibrary.strcpy(paramInt4, MainMemory.getI32(MainMemory.getI32(i2) + 944) + (paramInt2 + -1) * 152);
/*     */       }
/*     */       else
/*     */       {
/*     */         label940:
/* 396 */         MainMemory.setI32(paramInt6, 219);
/* 397 */         if (i1 != 237)
/*     */         {
/*     */           label966:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 407 */           SystemLibrary.sprintf(k, 84448, new Object[] { Integer.valueOf(paramInt3) });
/* 408 */           ffxmsg.call(5, k);
/*     */           
/*     */           break label1032;
/*     */           
/*     */           label1001:
/* 413 */           ffgcnn_989.call(i1, i11, paramInt6);
/*     */           
/*     */           break label1032;
/*     */           
/*     */           label1020:
/* 418 */           ffgcnn_990.call(i1, paramInt6);
/*     */         }
/*     */       }
/*     */       
/*     */       label1032:
/*     */       
/* 424 */       MainMemory.setI32Aligned(459372, MainMemory.getI32(paramInt5));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1052:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1057:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */