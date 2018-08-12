/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class deflateInit2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3695;
/*  13 */   public static final Function _instance = new deflateInit2_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public deflateInit2_() { super("deflateInit2_", 1, false); }
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
/*  48 */     int i8 = 0;
/*  49 */     int i9 = 0;
/*  50 */     int i10 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       if (paramInt == 0) {
/*  57 */         i10 = -2;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  67 */         j = paramInt + 24;
/*  68 */         MainMemory.setI32(j, 0);
/*  69 */         k = paramInt + 32;
/*  70 */         m = MainMemory.getI32(k);
/*  71 */         if (m != 0) {
/*     */           break label124;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         MainMemory.setI32(k, 3686);
/*  83 */         MainMemory.setI32(paramInt + 40, 0);
/*  84 */         m = 3686;
/*     */         
/*     */ 
/*     */ 
/*     */         label124:
/*     */         
/*     */ 
/*  91 */         n = paramInt + 36;
/*  92 */         if (MainMemory.getI32(n) != 0) {
/*     */           break label164;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         MainMemory.setI32(n, 3685);
/*     */         
/*     */ 
/*     */         label164:
/*     */         
/*     */ 
/* 108 */         i1 = paramInt + 40;
/* 109 */         i2 = SystemLibrary.do_indirect(m, MainMemory.getI32(i1), 1, 5828);
/* 110 */         if (i2 == 0) {
/* 111 */           i10 = -4;
/*     */         } else {
/*     */           break label221;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */       i = i10;
/*     */       
/*     */ 
/*     */       break label679;
/*     */       
/*     */       label221:
/*     */       
/* 129 */       MainMemory.setI32(paramInt + 28, i2);
/* 130 */       MainMemory.setI32(i2, paramInt);
/* 131 */       MainMemory.setI32(i2 + 24, 2);
/* 132 */       MainMemory.setI32(i2 + 28, 0);
/* 133 */       MainMemory.setI32(i2 + 48, 15);
/* 134 */       i3 = i2 + 44;
/* 135 */       MainMemory.setI32(i3, 32768);
/* 136 */       MainMemory.setI32(i2 + 52, 32767);
/* 137 */       MainMemory.setI32(i2 + 80, 15);
/* 138 */       i4 = i2 + 76;
/* 139 */       MainMemory.setI32(i4, 32768);
/* 140 */       MainMemory.setI32(i2 + 84, 32767);
/* 141 */       MainMemory.setI32(i2 + 88, 5);
/* 142 */       i8 = SystemLibrary.do_indirect(MainMemory.getI32(k), MainMemory.getI32(i1), 32768, 2);
/* 143 */       i5 = i2 + 56;
/* 144 */       MainMemory.setI32(i5, i8);
/* 145 */       i8 = SystemLibrary.do_indirect(MainMemory.getI32(k), MainMemory.getI32(i1), MainMemory.getI32(i3), 2);
/* 146 */       i6 = i2 + 64;
/* 147 */       MainMemory.setI32(i6, i8);
/* 148 */       i8 = SystemLibrary.do_indirect(MainMemory.getI32(k), MainMemory.getI32(i1), MainMemory.getI32(i4), 2);
/* 149 */       i7 = i2 + 68;
/* 150 */       MainMemory.setI32(i7, i8);
/* 151 */       MainMemory.setI32(i2 + 5824, 0);
/* 152 */       i4 = i2 + 5788;
/* 153 */       MainMemory.setI32(i4, 16384);
/* 154 */       i8 = SystemLibrary.do_indirect(MainMemory.getI32(k), MainMemory.getI32(i1), 16384, 4);
/* 155 */       i9 = i8;
/* 156 */       MainMemory.setI32(i2 + 8, i8);
/* 157 */       i10 = MainMemory.getI32(i4);
/* 158 */       MainMemory.setI32(i2 + 12, i10 << 2);
/* 159 */       if (MainMemory.getI32(i5) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */         if (MainMemory.getI32(i6) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */           if ((MainMemory.getI32(i7) != 0) && (i8 != 0)) {
/*     */             break label605;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */       MainMemory.setI32(i2 + 4, 666);
/* 190 */       MainMemory.setI32(j, 62560);
/* 191 */       deflateEnd.call(paramInt);
/* 192 */       i = -4;
/*     */       
/*     */ 
/*     */       break label679;
/*     */       
/*     */       label605:
/*     */       
/* 199 */       MainMemory.setI32(i2 + 5796, i9 + (i10 >>> 1 << 1));
/* 200 */       MainMemory.setI32(i2 + 5784, i8 + i10 * 3);
/* 201 */       MainMemory.setI32(i2 + 132, 1);
/* 202 */       MainMemory.setI32(i2 + 136, 0);
/* 203 */       MainMemory.setI8(i2 + 36, (byte)8);
/* 204 */       i = deflateReset.call(paramInt);
/*     */       
/*     */ 
/*     */       label679:
/*     */       
/*     */ 
/* 210 */       int i11 = i; return i11;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/deflateInit2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */