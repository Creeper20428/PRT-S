/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class ffshft
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3142;
/*  15 */   public static final Function _instance = new ffshft();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffshft() { super("ffshft", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2)
/*     */   {
/*  22 */     return call(paramInt1, paramLong1, paramLong2, paramLong3, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = call(i, l1, l2, l3, j);
/*  43 */     paramFrame.setI32(paramInt1, k);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2)
/*     */   {
/*  49 */     int i = 0;
/*     */     
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     long l1 = 0L;
/*  56 */     long l2 = 0L;
/*  57 */     long l3 = 0L;
/*     */     
/*     */ 
/*  60 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       j = MainMemory.alloc(100000);
/*  65 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         k = paramLong3 > 0L ? 1 : 0;
/*  76 */         l3 = (k != 0 ? paramLong2 : 0L) + paramLong1;
/*  77 */         m = paramLong3 < 0L ? 1 : 0;
/*  78 */         l1 = l3;
/*  79 */         l3 = paramLong2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  87 */         if (l3 != 0L) {
/*     */           break label327;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         if (MainMemory.getI32(MainMemory.getI32(paramInt1 + 4) + 68) != 1) {
/*     */           break label177;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         SystemLibrary.memset(j, (byte)32, 100000, 1);
/*     */         
/*     */         break label191;
/*     */         
/*     */         label177:
/* 112 */         SystemLibrary.memset(j, (byte)0, 100000, 1);
/*     */         
/*     */ 
/*     */         label191:
/*     */         
/*     */ 
/* 118 */         if (m == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 123 */           paramLong2 = paramLong3;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 130 */           l3 = 0L - paramLong3;
/* 131 */           paramLong1 = paramLong2 + paramLong1 + paramLong3;
/*     */           
/* 133 */           paramLong2 = l3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         ffmbyt.call(paramInt1, paramLong1, 0, paramInt2);
/* 142 */         if (paramLong2 == 0L) {
/*     */           break label453;
/*     */         } else {
/* 145 */           paramLong1 = paramLong2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 154 */           paramLong2 = paramLong1 > 100000L ? 100000L : paramLong1 << 32 >> 32;
/* 155 */           ffpbyt.call(paramInt1, paramLong2, j, paramInt2);
/* 156 */           paramLong3 = paramLong1 - paramLong2;
/* 157 */           if (paramLong1 == paramLong2) { break label453;
/* 158 */             break;
/*     */           }
/* 160 */           paramLong1 = paramLong3;
/*     */         }
/*     */         
/*     */ 
/*     */         label327:
/*     */         
/*     */ 
/* 167 */         n = l3 > 100000L ? 100000 : (int)l3;
/* 168 */         if (k == 0) {
/*     */           break label377;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */         l1 -= n;
/*     */         
/*     */ 
/*     */ 
/*     */         label377:
/*     */         
/*     */ 
/*     */ 
/* 187 */         ffmbyt.call(paramInt1, l1, 0, paramInt2);
/* 188 */         l2 = n;
/* 189 */         ffgbyt.call(paramInt1, l2, j, paramInt2);
/* 190 */         ffmbyt.call(paramInt1, l1 + paramLong3, 1, paramInt2);
/* 191 */         if (ffpbyt.call(paramInt1, l2, j, paramInt2) <= 0) {
/*     */           break label470;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */         ffxmsg.call(5, 85472);
/*     */         
/*     */ 
/*     */         label453:
/*     */         
/*     */ 
/* 207 */         i = MainMemory.getI32(paramInt2);
/* 208 */         break;
/*     */         
/*     */ 
/*     */         label470:
/*     */         
/*     */ 
/* 214 */         l3 -= l2;
/* 215 */         l1 += (m != 0 ? l2 : 0L);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 221 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 226 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffshft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */