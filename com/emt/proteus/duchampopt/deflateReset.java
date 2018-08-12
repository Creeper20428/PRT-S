/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class deflateReset extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3694;
/*  13 */   public static final Function _instance = new deflateReset();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public deflateReset() { super("deflateReset", 1, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       if (paramInt != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */         j = MainMemory.getI32(paramInt + 28);
/*  58 */         if (j != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */           if (MainMemory.getI32(paramInt + 32) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */             if (MainMemory.getI32(paramInt + 36) != 0) {
/*     */               break label107;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  88 */       i = -2;
/*     */       
/*     */ 
/*     */       break label933;
/*     */       
/*     */       label107:
/*     */       
/*  95 */       MainMemory.setI32(paramInt + 20, 0);
/*  96 */       MainMemory.setI32(paramInt + 8, 0);
/*  97 */       MainMemory.setI32(paramInt + 24, 0);
/*  98 */       MainMemory.setI32(paramInt + 44, 2);
/*  99 */       MainMemory.setI32(j + 20, 0);
/* 100 */       MainMemory.setI32(j + 16, MainMemory.getI32(j + 8));
/* 101 */       k = j + 24;
/* 102 */       m = MainMemory.getI32(k);
/* 103 */       if (m >= 0) {
/*     */         break label207;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */       m = 0 - m;
/* 115 */       MainMemory.setI32(k, m);
/*     */       
/*     */ 
/*     */ 
/*     */       label207:
/*     */       
/*     */ 
/*     */ 
/* 123 */       MainMemory.setI32(j + 4, m == 0 ? 113 : 42);
/* 124 */       if (m != 2) {
/*     */         break label262;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       m = crc32.call(0, 0, 0);
/*     */       
/*     */       break label275;
/*     */       
/*     */       label262:
/*     */       
/* 140 */       m = adler32.call(0, 0, 0);
/*     */       
/*     */ 
/*     */ 
/*     */       label275:
/*     */       
/*     */ 
/*     */ 
/* 148 */       MainMemory.setI32(paramInt + 48, m);
/* 149 */       MainMemory.setI32(j + 40, 0);
/* 150 */       n = j;
/* 151 */       MainMemory.setI32(j + 2840, j + 148);
/* 152 */       MainMemory.setI32(j + 2848, 467904);
/* 153 */       MainMemory.setI32(j + 2852, j + 2440);
/* 154 */       MainMemory.setI32(j + 2860, 467936);
/* 155 */       MainMemory.setI32(j + 2864, j + 2684);
/* 156 */       MainMemory.setI32(j + 2872, 467968);
/* 157 */       MainMemory.setI16(j + 5816, (short)0);
/* 158 */       MainMemory.setI32(j + 5820, 0);
/* 159 */       MainMemory.setI32(j + 5812, 8);
/* 160 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 167 */         MainMemory.setI16(n + 148 + (m << 2), (short)0);
/* 168 */         m += 1;
/* 169 */         if (m == 286) {
/* 170 */           m = 0; break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 182 */         MainMemory.setI16(n + 2440 + (m << 2), (short)0);
/* 183 */         m += 1;
/* 184 */         if (m == 30) {
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
/* 195 */       MainMemory.setI16(j + 2684, (short)0);
/* 196 */       MainMemory.setI16(j + 2688, (short)0);
/* 197 */       MainMemory.setI16(j + 2692, (short)0);
/* 198 */       MainMemory.setI16(j + 2696, (short)0);
/* 199 */       MainMemory.setI16(j + 2700, (short)0);
/* 200 */       MainMemory.setI16(j + 2704, (short)0);
/* 201 */       MainMemory.setI16(j + 2708, (short)0);
/* 202 */       MainMemory.setI16(j + 2712, (short)0);
/* 203 */       MainMemory.setI16(j + 2716, (short)0);
/* 204 */       MainMemory.setI16(j + 2720, (short)0);
/* 205 */       MainMemory.setI16(j + 2724, (short)0);
/* 206 */       MainMemory.setI16(j + 2728, (short)0);
/* 207 */       MainMemory.setI16(j + 2732, (short)0);
/* 208 */       MainMemory.setI16(j + 2736, (short)0);
/* 209 */       MainMemory.setI16(j + 2740, (short)0);
/* 210 */       MainMemory.setI16(j + 2744, (short)0);
/* 211 */       MainMemory.setI16(j + 2748, (short)0);
/* 212 */       MainMemory.setI16(j + 2752, (short)0);
/* 213 */       MainMemory.setI16(j + 2756, (short)0);
/* 214 */       MainMemory.setI16(j + 1172, (short)1);
/* 215 */       MainMemory.setI32(j + 5804, 0);
/* 216 */       MainMemory.setI32(j + 5800, 0);
/* 217 */       MainMemory.setI32(j + 5808, 0);
/* 218 */       MainMemory.setI32(j + 5792, 0);
/* 219 */       MainMemory.setI32(j + 60, MainMemory.getI32(j + 44) << 1);
/* 220 */       i1 = j + 68;
/* 221 */       k = j + 76;
/* 222 */       MainMemory.setI16(MainMemory.getI32(i1) + (MainMemory.getI32(k) + -1 << 1), (short)0);
/* 223 */       SystemLibrary.memset(MainMemory.getI32(i1), (byte)0, (MainMemory.getI32(k) << 1) + -2, 2);
/* 224 */       m = MainMemory.getI32(j + 132);
/* 225 */       MainMemory.setI32(j + 128, MainMemory.getI16(146304 + m * 12 + 2) & 0xFFFF);
/* 226 */       MainMemory.setI32(j + 140, MainMemory.getI16(146304 + m * 12) & 0xFFFF);
/* 227 */       MainMemory.setI32(j + 144, MainMemory.getI16(146304 + m * 12 + 4) & 0xFFFF);
/* 228 */       MainMemory.setI32(j + 124, MainMemory.getI16(146304 + m * 12 + 6) & 0xFFFF);
/* 229 */       MainMemory.setI32(j + 108, 0);
/* 230 */       MainMemory.setI32(j + 92, 0);
/* 231 */       MainMemory.setI32(j + 116, 0);
/* 232 */       MainMemory.setI32(j + 120, 2);
/* 233 */       MainMemory.setI32(j + 96, 2);
/* 234 */       MainMemory.setI32(j + 104, 0);
/* 235 */       MainMemory.setI32(j + 72, 0);
/* 236 */       i = 0;
/*     */       
/*     */ 
/*     */       label933:
/*     */       
/*     */ 
/* 242 */       int i2 = i; return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/deflateReset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */