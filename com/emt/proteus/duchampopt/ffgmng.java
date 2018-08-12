/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgmng
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3432;
/*  22 */   public static final Function _instance = new ffgmng();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public ffgmng() { super("ffgmng", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  29 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int m = call(i, j, k);
/*  44 */     paramFrame.setI32(paramInt1, m);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  50 */     int i = 0;
/*     */     
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     int i6 = 0;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*     */     
/*     */ 
/*  68 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       j = MainMemory.alloc(81);
/*  73 */       k = MainMemory.alloc(71);
/*  74 */       m = MainMemory.alloc(4);
/*  75 */       n = MainMemory.alloc(4);
/*  76 */       i1 = MainMemory.alloc(72);
/*  77 */       i2 = MainMemory.alloc(72);
/*  78 */       i3 = MainMemory.alloc(81);
/*  79 */       i4 = MainMemory.alloc(73);
/*  80 */       i5 = MainMemory.alloc(4);
/*  81 */       MainMemory.setI32(n, 31936);
/*  82 */       i9 = MainMemory.getI32(paramInt3);
/*  83 */       if (i9 != 0) {
/*     */         break label730;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       MainMemory.setI32(paramInt2, 0);
/*  95 */       i9 = ffgrec.call(paramInt1, 0, i3, paramInt3);
/*  96 */       MainMemory.setI32(paramInt3, i9);
/*  97 */       if (i9 != 0) {
/*     */         break label251;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 108 */         i9 = ffgnxk.call(paramInt1, n, i3, paramInt3);
/* 109 */         MainMemory.setI32(paramInt3, i9);
/* 110 */         if (i9 != 0) {}
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
/* 121 */         MainMemory.setI32(paramInt2, MainMemory.getI32(paramInt2) + 1);
/* 122 */         i9 = MainMemory.getI32(paramInt3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 130 */       while (i9 == 0);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label251:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */       if (i9 != 202) {
/*     */         break label285;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       MainMemory.setI32(paramInt3, 0);
/* 154 */       i9 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */       label285:
/*     */       
/*     */ 
/* 161 */       i8 = i9;
/* 162 */       i9 = 1;
/* 163 */       i10 = 0;
/* 164 */       i6 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 174 */         if ((MainMemory.getI32(paramInt2) < i6) || (i8 != 0))
/*     */         {
/*     */ 
/*     */ 
/* 178 */           i9 = i8;
/* 179 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 185 */         SystemLibrary.sprintf(i1, 39648, new Object[] { Integer.valueOf(i9) });
/* 186 */         i8 = MainMemory.getI32(paramInt3);
/* 187 */         if (i8 <= 0)
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
/* 198 */           MainMemory.setI8(k, (byte)0);
/* 199 */           MainMemory.setI8(i3, (byte)0);
/* 200 */           if (ffgcrd.call(paramInt1, i1, j, paramInt3) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */             ffpsvc.call(j, k, i3, paramInt3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 216 */           ffc2i.call(k, m, paramInt3);
/* 217 */           i8 = MainMemory.getI32(paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */         MainMemory.setI32(paramInt3, i8);
/* 226 */         if (i8 != 202) {
/*     */           break label495;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         MainMemory.setI32(paramInt3, 0);
/* 237 */         i10 += 1;
/* 238 */         i8 = 0;
/*     */         
/*     */ 
/*     */         break label714;
/*     */         
/*     */         label495:
/*     */         
/* 245 */         i6 += 1;
/* 246 */         if (i10 <= 0) {
/*     */           break label714;
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
/* 259 */         i8 = i9 - i10;
/* 260 */         SystemLibrary.sprintf(i2, 39648, new Object[] { Integer.valueOf(i8) });
/* 261 */         ffmnam.call(paramInt1, i1, i2, paramInt3);
/* 262 */         SystemLibrary.sprintf(i1, 39680, new Object[] { Integer.valueOf(i9) });
/* 263 */         SystemLibrary.sprintf(i2, 39680, new Object[] { Integer.valueOf(i8) });
/* 264 */         i8 = ffgkls.call(paramInt1, i1, i5, i4, paramInt3);
/* 265 */         MainMemory.setI32(paramInt3, i8);
/* 266 */         if (i8 != 0) {
/*     */           break label680;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */         ffdkey.call(paramInt1, i1, paramInt3);
/* 278 */         i7 = MainMemory.getI32(i5);
/* 279 */         ffikls.call(paramInt1, i2, i7, i4, paramInt3);
/* 280 */         ffplsw.call(paramInt1, paramInt3);
/* 281 */         free.call(i7);
/* 282 */         i8 = MainMemory.getI32(paramInt3);
/*     */         
/*     */ 
/*     */ 
/*     */         label680:
/*     */         
/*     */ 
/*     */ 
/* 290 */         if (i8 != 202) {
/*     */           break label714;
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
/* 303 */         MainMemory.setI32(paramInt3, 0);
/* 304 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label714:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 315 */         i9 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label730:
/*     */       
/*     */ 
/*     */ 
/* 325 */       i = i9;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 336 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */