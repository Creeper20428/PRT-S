/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class root_read
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3083;
/*  14 */   public static final Function _instance = new root_read();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public root_read() { super("root_read", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  35 */     int m = call(i, j, k);
/*  36 */     paramFrame.setI32(paramInt1, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     int i = 0;
/*     */     
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     int i6 = 0;
/*     */     
/*     */ 
/*  56 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       j = MainMemory.alloc(8);
/*  61 */       k = MainMemory.alloc(100);
/*  62 */       m = MainMemory.alloc(4);
/*  63 */       n = MainMemory.alloc(4);
/*  64 */       i1 = 499456 + paramInt1 * 12 + 4;
/*  65 */       SystemLibrary.sprintf(k, 45440, new Object[] { Integer.valueOf((int)MainMemory.getI64(i1)), Integer.valueOf(paramInt3) });
/*  66 */       i2 = SystemLibrary.strlen(k);
/*  67 */       i3 = 499456 + paramInt1 * 12;
/*  68 */       paramInt1 = MainMemory.getI32(i3);
/*  69 */       MainMemory.setI32(j, SystemLibrary.bswapInt(i2 + 4));
/*  70 */       MainMemory.setI32(j + 4, -704184320);
/*  71 */       i4 = j;
/*  72 */       if (paramInt1 < 0) {
/*  73 */         paramInt1 = -1;
/*     */         break label348;
/*     */       } else {
/*  76 */         i6 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  85 */         if (i6 >= 8) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */         i5 = send.call(paramInt1, i4 + i6, 8 - i6, 0);
/*  97 */         if (i5 < 1) {
/*  98 */           i6 = i5;
/*  99 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         i6 = i5 + i6;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */       if (i6 < 0) {
/* 116 */         paramInt1 = i6;
/*     */         break label348;
/*     */       } else {
/* 119 */         i6 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 128 */         if (i6 >= i2)
/*     */         {
/*     */ 
/*     */ 
/* 132 */           paramInt1 = i6;
/* 133 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 139 */         i5 = send.call(paramInt1, k + i6, i2 - i6, 0);
/* 140 */         if (i5 < 1) {
/* 141 */           paramInt1 = i5;
/* 142 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */         i6 = i5 + i6;
/*     */       }
/*     */       
/*     */ 
/*     */       label348:
/*     */       
/*     */ 
/* 158 */       if (paramInt1 != SystemLibrary.strlen(k)) {
/*     */         break label646;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */       MainMemory.setI32(n, 0);
/* 169 */       F272093.call(MainMemory.getI32(i3), m, n);
/* 170 */       if (MainMemory.getI32(n) != 0) {
/*     */         break label646;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       paramInt1 = MainMemory.getI32(i3);
/* 181 */       if (paramInt1 < 0) {
/* 182 */         paramInt1 = -1;
/*     */         break label603;
/*     */       } else {
/* 185 */         i2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 194 */         if (i2 >= paramInt3)
/*     */         {
/*     */ 
/*     */ 
/* 198 */           paramInt1 = i2;
/* 199 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 205 */         i6 = paramInt3 - i2;
/* 206 */         i4 = paramInt2 + i2;
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 212 */           i5 = recv.call(paramInt1, i4, i6, 0);
/* 213 */           if (i5 != -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */           m = SystemLibrary.__errno_location();
/* 224 */           if (MainMemory.getI32(m) != 4) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */           MainMemory.setI32(m, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 239 */         if (i5 < 0) {
/* 240 */           paramInt1 = i5;
/* 241 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */         if (i5 == 0) {
/* 251 */           paramInt1 = i2;
/* 252 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */         i2 = i5 + i2;
/*     */       }
/*     */       
/*     */ 
/*     */       label603:
/*     */       
/*     */ 
/* 268 */       if (paramInt1 != paramInt3) {
/*     */         break label646;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */       MainMemory.setI64(i1, MainMemory.getI64(i1) + paramInt3);
/* 279 */       i = 0;
/*     */       
/*     */ 
/*     */       break label654;
/*     */       
/*     */       label646:
/*     */       
/* 286 */       i = 108;
/*     */       
/*     */ 
/*     */       label654:
/*     */       
/*     */ 
/* 292 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 297 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/root_read.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */