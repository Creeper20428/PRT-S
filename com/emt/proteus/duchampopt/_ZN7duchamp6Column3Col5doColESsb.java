/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ 
/*     */ public final class _ZN7duchamp6Column3Col5doColESsb extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 857;
/*  12 */   public static final Function _instance = new _ZN7duchamp6Column3Col5doColESsb();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN7duchamp6Column3Col5doColESsb() { super("_ZN7duchamp6Column3Col5doColESsb", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramByte);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     byte b1 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     byte b2 = call(i, j, b1);
/*  34 */     paramFrame.setI8(paramInt1, b2);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/*  40 */     byte b1 = 0;
/*     */     
/*  42 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (_ZNKSs7compareEPKc.call(paramInt2, 18624) != 0) {
/*     */         break label52;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  58 */       b1 = MainMemory.getI8(90656 + MainMemory.getI32(paramInt1 + 20));
/*     */       
/*     */ 
/*     */       break label325;
/*     */       
/*     */       label52:
/*     */       
/*  65 */       if (_ZNKSs7compareEPKc.call(paramInt2, 28480) != 0) {
/*     */         break label162;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       i = MainMemory.getI32(paramInt1 + 20);
/*  76 */       if (paramByte != 0) {
/*     */         break label126;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       if (i == 15) {
/*     */         break label318;
/*     */       } else {
/*     */         break label143;
/*     */       }
/*     */       
/*     */ 
/*     */       label126:
/*     */       
/*  95 */       if (i != 16)
/*     */       {
/*     */         label143:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         b1 = MainMemory.getI8(90720 + i);
/*     */         
/*     */ 
/*     */         break label325;
/*     */         
/*     */         label162:
/*     */         
/* 112 */         if (_ZNKSs7compareEPKc.call(paramInt2, 16192) != 0) {
/*     */           break label209;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         b1 = MainMemory.getI8(90592 + MainMemory.getI32(paramInt1 + 20));
/*     */         
/*     */ 
/*     */         break label325;
/*     */         
/*     */         label209:
/*     */         
/* 129 */         if (_ZNKSs7compareEPKc.call(paramInt2, 37568) != 0) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         i = MainMemory.getI32(paramInt1 + 20);
/* 140 */         if (paramByte != 0) {
/*     */           break label282;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */         if (i == 15) {
/*     */           break label318;
/*     */         } else {
/*     */           break label299;
/*     */         }
/*     */         
/*     */ 
/*     */         label282:
/*     */         
/* 159 */         if (i != 16)
/*     */         {
/*     */           label299:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */           b1 = MainMemory.getI8(90784 + i);
/*     */           
/*     */           break label325;
/*     */         }
/*     */       }
/*     */       
/*     */       label318:
/* 176 */       b1 = 0;
/*     */       
/*     */ 
/*     */       label325:
/*     */       
/*     */ 
/* 182 */       byte b2 = b1; return b2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column3Col5doColESsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */