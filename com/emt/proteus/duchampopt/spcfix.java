/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class spcfix extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2926;
/*  13 */   public static final Function _instance = new spcfix();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public spcfix() { super("spcfix", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*  43 */     int i3 = 0;
/*  44 */     int i4 = 0;
/*  45 */     int i5 = 0;
/*  46 */     int i6 = 0;
/*  47 */     int i7 = 0;
/*     */     
/*     */ 
/*  50 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  54 */       j = MainMemory.alloc(9);
/*  55 */       k = MainMemory.alloc(9);
/*  56 */       if (paramInt == 0) {
/*  57 */         i1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  67 */         if (MainMemory.getI32(paramInt) != 137)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */           i1 = wcsset.call(paramInt);
/*  78 */           if (i1 != 0) {
/*     */             break label785;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         i1 = MainMemory.getI32(paramInt + 752);
/*  90 */         if (i1 >= 0) {
/*     */           break label281;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         m = paramInt + 724;
/* 102 */         i1 = MainMemory.getI32(paramInt + 4);
/* 103 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 110 */           n = i1 > i4 ? 1 : 0;
/* 111 */           if (n == 0)
/*     */           {
/*     */ 
/*     */ 
/* 115 */             i1 = -1;
/*     */             
/*     */ 
/*     */             break label785;
/*     */           }
/*     */           
/*     */ 
/* 122 */           if (!com.emt.proteus.lib.api.MathUtils.ult(MainMemory.getI32(MainMemory.getI32(m) + (i4 << 2)) + 62536, 100)) {
/*     */             break label265;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */           if (n != 0) {
/* 133 */             i1 = i4;
/* 134 */             break;
/*     */           } else {
/* 136 */             i1 = -1;
/*     */             
/*     */             break label785;
/*     */           }
/*     */           
/*     */           label265:
/*     */           
/* 143 */           i4 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label281:
/*     */         
/*     */ 
/* 150 */         i2 = paramInt + 28;
/* 151 */         i4 = spcaips.call(MainMemory.getI32(i2) + i1 * 72, MainMemory.getI32(paramInt + 100), j, k);
/* 152 */         if (i4 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 156 */           i1 = i4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 163 */           SystemLibrary.strcpy(MainMemory.getI32(i2) + i1 * 72, j);
/* 164 */           if (MainMemory.getI8(paramInt + 393) != 0) {
/*     */             break label389;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           SystemLibrary.strcpy(paramInt + 392, k);
/*     */           
/*     */ 
/*     */           label389:
/*     */           
/*     */ 
/* 180 */           i3 = MainMemory.getI32(i2);
/* 181 */           MainMemory.setI8(i3 + i1 * 72 + 71, (byte)0);
/* 182 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 189 */             if (i4 >= 72) {
/*     */               break label495;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */             i5 = i4 + 1;
/* 200 */             if (MainMemory.getI8(i3 + i1 * 72 + i4) == 0) {
/*     */               break;
/*     */             }
/*     */             
/* 204 */             i4 = i5;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */           spcfix_1651.call(i4, i1, i5, i3);
/*     */           
/*     */ 
/*     */           label495:
/*     */           
/*     */ 
/* 217 */           i4 += -1;
/* 218 */           i5 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 225 */             i6 = i4 - i5;
/* 226 */             i7 = i3 + i1 * 72 + i6;
/* 227 */             if (i6 <= 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */             if (MainMemory.getI8(i7) != 32) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */             MainMemory.setI8(i7, (byte)0);
/* 248 */             i5 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 254 */           MainMemory.setI8(paramInt + 463, (byte)0);
/* 255 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 262 */             if (i1 >= 72) {
/*     */               break label679;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */             i4 = i1 + 1;
/* 273 */             if (MainMemory.getI8(paramInt + 392 + i1) == 0) {
/*     */               break;
/*     */             }
/*     */             
/* 277 */             i1 = i4;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */           spcfix_1650.call(i1, i4, paramInt);
/*     */           
/*     */ 
/*     */           label679:
/*     */           
/*     */ 
/* 290 */           i1 += -1;
/* 291 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 298 */             i5 = i1 - i4;
/* 299 */             i7 = paramInt + 392 + i5;
/* 300 */             if (i5 <= 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */             if (MainMemory.getI8(i7) != 32) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */             MainMemory.setI8(i7, (byte)0);
/* 321 */             i4 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 327 */           i = 0;
/*     */           
/*     */           break label793;
/*     */         }
/*     */       }
/*     */       
/*     */       label785:
/*     */       
/* 335 */       i = i1;
/*     */       
/*     */ 
/*     */       label793:
/*     */       
/*     */ 
/* 341 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 346 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spcfix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */