/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _tr_stored_block extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3683;
/*  11 */   public static final Function _instance = new _tr_stored_block();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _tr_stored_block() { super("_tr_stored_block", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j, k, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     short s = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     byte b = 0;
/*  52 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       i = paramInt1 + 5820;
/*  59 */       m = MainMemory.getI32(i);
/*  60 */       j = m > 13 ? 1 : 0;
/*  61 */       k = paramInt1 + 5816;
/*  62 */       paramInt4 &= 0xFFFF;
/*  63 */       s = MathUtils.or((short)(paramInt4 << m), MainMemory.getI16(k));
/*  64 */       MainMemory.setI16(k, s);
/*  65 */       if (j == 0) {
/*     */         break label227;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       i2 = paramInt1 + 8;
/*  76 */       i1 = paramInt1 + 20;
/*  77 */       m = MainMemory.getI32(i1);
/*  78 */       MainMemory.setI8(MainMemory.getI32(i2) + m, (byte)s);
/*  79 */       n = m + 1;
/*  80 */       MainMemory.setI32(i1, n);
/*  81 */       MainMemory.setI8(MainMemory.getI32(i2) + n, (byte)MathUtils.lshr(MainMemory.getI16(k), 8));
/*  82 */       MainMemory.setI32(i1, m + 2);
/*  83 */       m = MainMemory.getI32(i);
/*  84 */       s = (short)(paramInt4 >>> 16 - m);
/*  85 */       MainMemory.setI16(k, s);
/*  86 */       paramInt4 = m + -13;
/*     */       
/*     */ 
/*     */       break label237;
/*     */       
/*     */       label227:
/*     */       
/*  93 */       paramInt4 = m + 3;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label237:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 103 */       MainMemory.setI32(i, paramInt4);
/* 104 */       if (paramInt4 <= 8) {
/*     */         break label347;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */       i2 = paramInt1 + 8;
/* 115 */       i1 = paramInt1 + 20;
/* 116 */       paramInt4 = MainMemory.getI32(i1);
/* 117 */       MainMemory.setI8(MainMemory.getI32(i2) + paramInt4, (byte)s);
/* 118 */       m = paramInt4 + 1;
/* 119 */       MainMemory.setI32(i1, m);
/* 120 */       MainMemory.setI8(MainMemory.getI32(i2) + m, (byte)MathUtils.lshr(MainMemory.getI16(k), 8));
/* 121 */       paramInt4 += 2;
/* 122 */       MainMemory.setI32(i1, paramInt4);
/*     */       
/*     */ 
/*     */       break label434;
/*     */       
/*     */       label347:
/*     */       
/* 129 */       if (paramInt4 <= 0) {
/*     */         break label415;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */       i2 = paramInt1 + 8;
/* 140 */       i1 = paramInt1 + 20;
/* 141 */       paramInt4 = MainMemory.getI32(i1);
/* 142 */       MainMemory.setI8(MainMemory.getI32(i2) + paramInt4, (byte)s);
/* 143 */       paramInt4 += 1;
/* 144 */       MainMemory.setI32(i1, paramInt4);
/*     */       
/*     */ 
/*     */       break label434;
/*     */       
/*     */       label415:
/*     */       
/* 151 */       paramInt4 = MainMemory.getI32(paramInt1 + 20);
/* 152 */       i2 = paramInt1 + 8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label434:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 162 */       MainMemory.setI16(k, (short)0);
/* 163 */       MainMemory.setI32(i, 0);
/* 164 */       MainMemory.setI32(paramInt1 + 5812, 8);
/* 165 */       i = paramInt1 + 20;
/* 166 */       b = (byte)paramInt3;
/* 167 */       MainMemory.setI8(MainMemory.getI32(i2) + paramInt4, b);
/* 168 */       m = paramInt4 + 1;
/* 169 */       MainMemory.setI32(i, m);
/* 170 */       s = MathUtils.lshr((short)paramInt3, 8);
/* 171 */       MainMemory.setI8(MainMemory.getI32(i2) + m, (byte)s);
/* 172 */       m = paramInt4 + 2;
/* 173 */       MainMemory.setI32(i, m);
/* 174 */       MainMemory.setI8(MainMemory.getI32(i2) + m, MathUtils.xor(b, (byte)-1));
/* 175 */       m = paramInt4 + 3;
/* 176 */       MainMemory.setI32(i, m);
/* 177 */       MainMemory.setI8(MainMemory.getI32(i2) + m, (byte)MathUtils.xor(s, (short)255));
/* 178 */       m = paramInt4 + 4;
/* 179 */       MainMemory.setI32(i, m);
/* 180 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         paramInt4 += 5;
/* 191 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 198 */           i3 = paramInt4 + n;
/* 199 */           MainMemory.setI8(MainMemory.getI32(i2) + (m + n), MainMemory.getI8(paramInt2 + n));
/* 200 */           MainMemory.setI32(i, i3);
/* 201 */           n += 1;
/* 202 */           if (n == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_tr_stored_block.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */