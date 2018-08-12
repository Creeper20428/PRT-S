/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffikey
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3480;
/*  18 */   public static final Function _instance = new ffikey();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffikey() { super("ffikey", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramInt3);
/*  26 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, j, k);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     long l1 = 0L;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     long l2 = 0L;
/*  58 */     long l3 = 0L;
/*  59 */     int i5 = 0;
/*  60 */     long l4 = 0L;
/*  61 */     int i6 = 0;
/*     */     
/*     */ 
/*  64 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       i = MainMemory.alloc(81);
/*  69 */       j = MainMemory.alloc(81);
/*  70 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         n = MainMemory.getI32(paramInt1);
/*  81 */         k = paramInt1 + 4;
/*  82 */         m = MainMemory.getI32(k);
/*  83 */         if (n != MainMemory.getI32(m + 64))
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
/*  94 */           ffmahd.call(paramInt1, n + 1, 0, paramInt3);
/*  95 */           m = MainMemory.getI32(k);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         l1 = MainMemory.getI64(m + 88);
/* 104 */         if (MainMemory.getI64(m + 112) - l1 != 80L) {
/*     */           break label239;
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
/* 116 */         if (ffiblk.call(paramInt1, 1, 0, paramInt3) <= 0) {
/*     */           break label217;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label869;
/*     */       
/*     */ 
/*     */ 
/*     */       label217:
/*     */       
/*     */ 
/*     */ 
/* 132 */       m = MainMemory.getI32(k);
/* 133 */       l1 = MainMemory.getI64(m + 88);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label239:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 143 */       l1 = (l1 - MainMemory.getI64(m + 104)) / 80L;
/* 144 */       n = (int)l1;
/* 145 */       SystemLibrary.strncpy(j, paramInt2, 80);
/* 146 */       MainMemory.setI8(j + 80, (byte)0);
/* 147 */       i1 = SystemLibrary.strlen(j);
/* 148 */       if (i1 > 0) {
/* 149 */         i2 = 0;
/*     */       } else {
/*     */         break label379;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 160 */         paramInt2 = j + i2;
/* 161 */         if (!MathUtils.ugt((byte)(MainMemory.getI8(paramInt2) + -32), (byte)94)) {
/*     */           break label353;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         MainMemory.setI8(paramInt2, (byte)32);
/*     */         
/*     */ 
/*     */         label353:
/*     */         
/*     */ 
/* 177 */         i2 += 1;
/* 178 */         if (i2 == i1) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label379:
/*     */       
/*     */ 
/*     */ 
/* 189 */       if (i1 >= 80) {
/*     */         break label453;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       i2 = 80 - i1;
/* 200 */       i3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 207 */         MainMemory.setI8(j + (i1 + i3), (byte)32);
/* 208 */         i3 += 1;
/* 209 */         if (i3 == i2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label453:
/*     */       
/*     */ 
/*     */ 
/* 220 */       i4 = __ctype_toupper_loc.call();
/* 221 */       MainMemory.setI8(j, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(j) << 2)));
/* 222 */       paramInt2 = j + 1;
/* 223 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(paramInt2) << 2)));
/* 224 */       paramInt2 = j + 2;
/* 225 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(paramInt2) << 2)));
/* 226 */       paramInt2 = j + 3;
/* 227 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(paramInt2) << 2)));
/* 228 */       paramInt2 = j + 4;
/* 229 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(paramInt2) << 2)));
/* 230 */       paramInt2 = j + 5;
/* 231 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(paramInt2) << 2)));
/* 232 */       paramInt2 = j + 6;
/* 233 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(paramInt2) << 2)));
/* 234 */       paramInt2 = j + 7;
/* 235 */       MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(paramInt2) << 2)));
/* 236 */       fftkey.call(j, paramInt3);
/* 237 */       l2 = MainMemory.getI64(MainMemory.getI32(k) + 104);
/* 238 */       ffmbyt.call(paramInt1, l2, 0, paramInt3);
/* 239 */       if (n <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 243 */         paramInt2 = j;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 250 */         l1 &= 0xFFFFFFFF;
/* 251 */         l3 = 0L;
/* 252 */         paramInt2 = j;
/* 253 */         i5 = i;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 262 */           l4 = l2 + l3 * 80L;
/* 263 */           ffgbyt.call(paramInt1, 80L, i5, paramInt3);
/* 264 */           ffmbyt.call(paramInt1, l4, 0, paramInt3);
/* 265 */           ffpbyt.call(paramInt1, 80L, paramInt2, paramInt3);
/* 266 */           l3 += 1L;
/* 267 */           if (l3 == l1) {
/* 268 */             paramInt2 = i5; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 273 */           paramInt2 = i5;
/* 274 */           i5 = paramInt2;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */       ffpbyt.call(paramInt1, 80L, paramInt2, paramInt3);
/* 283 */       i6 = MainMemory.getI32(k) + 88;
/* 284 */       MainMemory.setI64(i6, MainMemory.getI64(i6) + 80L);
/* 285 */       i6 = MainMemory.getI32(k) + 104;
/* 286 */       MainMemory.setI64(i6, MainMemory.getI64(i6) + 80L);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label869:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffikey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */