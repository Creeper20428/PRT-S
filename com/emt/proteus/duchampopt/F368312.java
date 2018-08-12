/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F368312 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3469;
/*  15 */   public static final Function _instance = new F368312();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public F368312() { super("F368312", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = call(i, j);
/*  34 */     paramFrame.setI32(paramInt1, k);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*     */     
/*     */ 
/*  49 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(81);
/*  54 */       MainMemory.setI32(paramInt2, 0);
/*  55 */       k = SystemLibrary.fopen(paramInt1, 15360);
/*  56 */       if (k != 0) {
/*     */         break label82;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       ffxmsg.call(5, 79456);
/*  67 */       ffxmsg.call(5, paramInt1);
/*  68 */       i = 0;
/*     */       
/*     */ 
/*     */       break label405;
/*     */       
/*     */       label82:
/*     */       
/*  75 */       if (SystemLibrary.fseek(k, 0L, 2) != 0) {
/*     */         break label387;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       m = ftell.call(k);
/*  86 */       if (m >= 0) {
/*     */         break label153;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       ffxmsg.call(5, 84768);
/*  97 */       ffxmsg.call(5, paramInt1);
/*  98 */       i = 0;
/*     */       
/*     */ 
/*     */       break label405;
/*     */       
/*     */       label153:
/*     */       
/* 105 */       if (SystemLibrary.fseek(k, 0L, 0) != 0) {
/*     */         break label364;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */       n = m + 5000;
/* 116 */       i1 = calloc.call(1, n);
/* 117 */       if (i1 != 0) {
/*     */         break label251;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       SystemLibrary.sprintf(j, 93728, new Object[] { Integer.valueOf(n) });
/* 128 */       ffxmsg.call(5, j);
/* 129 */       ffxmsg.call(5, paramInt1);
/* 130 */       i = 0;
/*     */       
/*     */ 
/*     */       break label405;
/*     */       
/*     */       label251:
/*     */       
/* 137 */       MainMemory.setI32(paramInt2, n);
/* 138 */       m = SystemLibrary.fread(i1, 1, m, k);
/* 139 */       SystemLibrary.fclose(k);
/* 140 */       if (m >= 1024) {
/*     */         break label351;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       SystemLibrary.sprintf(j, 97376, new Object[] { Integer.valueOf(m), Integer.valueOf(1024) });
/* 151 */       ffxmsg.call(5, j);
/* 152 */       ffxmsg.call(5, paramInt1);
/* 153 */       free.call(i1);
/* 154 */       i = 0;
/*     */       
/*     */ 
/*     */       break label405;
/*     */       
/*     */       label351:
/*     */       
/* 161 */       i = i1;
/*     */       
/*     */ 
/*     */       break label405;
/*     */       
/*     */       label364:
/*     */       
/* 168 */       ffxmsg.call(5, 102176);
/* 169 */       ffxmsg.call(5, paramInt1);
/* 170 */       i = 0;
/*     */       
/*     */ 
/*     */       break label405;
/*     */       
/*     */       label387:
/*     */       
/* 177 */       ffxmsg.call(5, 78400);
/* 178 */       ffxmsg.call(5, paramInt1);
/* 179 */       i = 0;
/*     */       
/*     */ 
/*     */       label405:
/*     */       
/*     */ 
/* 185 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 190 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F368312.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */