/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class F425062
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3666;
/*  18 */   public static final Function _instance = new F425062();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public F425062() { super("F425062", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = call(i, j, k, m, n, i1);
/*  49 */     paramFrame.setI32(paramInt1, i2);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  55 */     int i = 0;
/*     */     
/*  57 */     float f = 0.0F;
/*  58 */     double d = 0.0D;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     int n = 0;
/*  63 */     int i1 = 0;
/*  64 */     int i2 = 0;
/*  65 */     int i3 = 0;
/*  66 */     int i4 = 0;
/*  67 */     int i5 = 0;
/*  68 */     int i6 = 0;
/*  69 */     int i7 = 0;
/*  70 */     int i8 = 0;
/*  71 */     int i9 = 0;
/*  72 */     int i10 = 0;
/*  73 */     int i11 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  79 */       j = paramInt5 >= paramInt4 ? paramInt5 : paramInt4;
/*  80 */       f = j;
/*  81 */       d = f;
/*  82 */       d = SystemLibrary.log(d);
/*  83 */       d /= SystemLibrary.log(2.0D);
/*  84 */       d += 0.5D;
/*  85 */       i1 = (int)d;
/*  86 */       i10 = 1 << i1 < j ? 1 : 0;
/*  87 */       i11 = i10 + i1;
/*  88 */       j = (paramInt5 + 1) / 2 * ((paramInt4 + 1) / 2);
/*  89 */       k = malloc.call(j);
/*  90 */       if (k != 0) {
/*     */         break label192;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       ffxmsg.call(5, 80928);
/* 101 */       i = 414;
/*     */       
/*     */ 
/*     */       break label725;
/*     */       
/*     */       label192:
/*     */       
/* 108 */       m = 1 << i11;
/* 109 */       n = i11 > 1 ? 1 : 0;
/* 110 */       i1 = i1 + i10 + -1;
/* 111 */       paramInt6 += -1;
/* 112 */       i10 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 119 */         i11 = paramInt6 - i10;
/* 120 */         if (i11 <= -1) {
/*     */           break label712;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */         i2 = MainMemory.getI32Aligned(459440);
/* 131 */         i3 = MainMemory.getI32Aligned(459448);
/* 132 */         if (i2 >= 4)
/*     */         {
/*     */ 
/*     */ 
/* 136 */           i5 = i3;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 144 */           i5 = MainMemory.getI32Aligned(459444);
/* 145 */           i3 = MainMemory.getI8(paramInt1 + i5) & 0xFF | i3 << 8;
/* 146 */           MainMemory.setI32Aligned(459448, i3);
/* 147 */           MainMemory.setI32Aligned(459444, i5 + 1);
/* 148 */           i2 += 8;
/* 149 */           MainMemory.setI32Aligned(459440, i2);
/* 150 */           i5 = i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */         i2 += -4;
/* 160 */         MainMemory.setI32Aligned(459440, i2);
/* 161 */         switch (i5 >> i2 & 0xF)
/*     */         {
/*     */         case 0: 
/*     */           break label650;
/*     */           
/*     */           break;
/*     */         case 15: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 172 */         MainMemory.setI8(k, (byte)F423138.call(paramInt1));
/* 173 */         if (n != 0) {
/* 174 */           i2 = 0;
/* 175 */           i5 = m;
/* 176 */           i3 = paramInt5;
/* 177 */           i4 = paramInt4;
/* 178 */           i9 = 1;
/* 179 */           i7 = 1;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label628;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 195 */           i5 >>= 1;
/* 196 */           i7 <<= 1;
/* 197 */           i9 <<= 1;
/* 198 */           i6 = i4 > i5 ? 1 : 0;
/* 199 */           i7 = i6 != 0 ? i7 : i7 + -1;
/* 200 */           i8 = i3 > i5 ? 1 : 0;
/* 201 */           i9 = i8 != 0 ? i9 : i9 + -1;
/* 202 */           F423307.call(paramInt1, k, i7, i9, k);
/* 203 */           i3 -= (i8 != 0 ? i5 : 0);
/* 204 */           i4 -= (i6 != 0 ? i5 : 0);
/* 205 */           i2 += 1;
/* 206 */           if (i2 == i1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label628:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */         F421968.call(k, paramInt4, paramInt5, paramInt2, paramInt3, i11);
/*     */         
/*     */         break label675;
/*     */         
/*     */         label650:
/* 227 */         F423645.call(paramInt1, j, k);
/* 228 */         F421968.call(k, paramInt4, paramInt5, paramInt2, paramInt3, i11);
/*     */         
/*     */ 
/*     */         label675:
/*     */         
/*     */ 
/* 234 */         i10 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 240 */       ffxmsg.call(5, 75872);
/* 241 */       i = 414;
/*     */       
/*     */ 
/*     */       break label725;
/*     */       
/*     */       label712:
/*     */       
/* 248 */       free.call(k);
/* 249 */       i = 0;
/*     */       
/*     */ 
/*     */       label725:
/*     */       
/*     */ 
/* 255 */       int i12 = i; return i12;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F425062.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */