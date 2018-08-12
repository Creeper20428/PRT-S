/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class root_write extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3081;
/*  13 */   public static final Function _instance = new root_write();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public root_write() { super("root_write", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = call(i, j, k);
/*  35 */     paramFrame.setI32(paramInt1, m);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*     */     
/*     */ 
/*  56 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       j = MainMemory.alloc(8);
/*  61 */       k = MainMemory.alloc(100);
/*  62 */       m = MainMemory.alloc(4);
/*  63 */       n = MainMemory.alloc(4);
/*  64 */       i1 = 499456 + paramInt1 * 12;
/*  65 */       i2 = MainMemory.getI32(i1);
/*  66 */       i3 = 499456 + paramInt1 * 12 + 4;
/*  67 */       SystemLibrary.sprintf(k, 45440, new Object[] { Integer.valueOf((int)MainMemory.getI64(i3)), Integer.valueOf(paramInt3) });
/*  68 */       i7 = SystemLibrary.strlen(k);
/*  69 */       paramInt1 = i7 + 1;
/*  70 */       MainMemory.setI32(j, SystemLibrary.bswapInt(i7 + 5));
/*  71 */       MainMemory.setI32(j + 4, -720961536);
/*  72 */       i4 = j;
/*  73 */       i5 = i2 < 0 ? 1 : 0;
/*  74 */       if (i5 != 0) {
/*  75 */         i7 = -1;
/*     */         break label366;
/*     */       } else {
/*  78 */         i7 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  87 */         if (i7 >= 8) {
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
/*  98 */         i6 = send.call(i2, i4 + i7, 8 - i7, 0);
/*  99 */         if (i6 < 1) {
/* 100 */           i7 = i6;
/* 101 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         i7 = i6 + i7;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       if (i7 < 0) {
/*     */         break label366;
/*     */       }
/*     */       else {
/* 121 */         i7 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 130 */         if (i7 >= paramInt1) {
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
/* 141 */         i6 = send.call(i2, k + i7, paramInt1 - i7, 0);
/* 142 */         if (i6 < 1) {
/* 143 */           i7 = i6;
/* 144 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         i7 = i6 + i7;
/*     */       }
/*     */       
/*     */ 
/*     */       label366:
/*     */       
/*     */ 
/* 160 */       if (paramInt1 != i7) {
/*     */         break label556;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */       if (i5 != 0) {
/* 171 */         paramInt1 = -1;
/*     */         break label473;
/*     */       } else {
/* 174 */         paramInt1 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 183 */         if (paramInt1 >= paramInt3) {
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
/* 194 */         i7 = send.call(i2, paramInt2 + paramInt1, paramInt3 - paramInt1, 0);
/* 195 */         if (i7 < 1) {
/* 196 */           paramInt1 = i7;
/* 197 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */         paramInt1 = i7 + paramInt1;
/*     */       }
/*     */       
/*     */ 
/*     */       label473:
/*     */       
/*     */ 
/* 213 */       if (paramInt1 != paramInt3) {
/*     */         break label556;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */       MainMemory.setI32(m, 0);
/* 224 */       F272093.call(MainMemory.getI32(i1), n, m);
/* 225 */       if (MainMemory.getI32(m) != 0) {
/*     */         break label556;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */       MainMemory.setI64(i3, MainMemory.getI64(i3) + paramInt3);
/* 236 */       i = 0;
/*     */       
/*     */ 
/*     */       break label564;
/*     */       
/*     */       label556:
/*     */       
/* 243 */       i = 106;
/*     */       
/*     */ 
/*     */       label564:
/*     */       
/*     */ 
/* 249 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 254 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/root_write.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */