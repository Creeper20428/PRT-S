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
/*     */ 
/*     */ 
/*     */ public final class F272784
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3088;
/*  17 */   public static final Function _instance = new F272784();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public F272784() { super("F272784", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = call(i, j);
/*  36 */     paramFrame.setI32(paramInt1, k);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  42 */     int i = 0;
/*     */     
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*     */     
/*     */ 
/*  51 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       j = MainMemory.alloc(4);
/*  56 */       k = MainMemory.alloc(1200);
/*  57 */       m = MainMemory.alloc(16);
/*  58 */       n = MainMemory.alloc(4);
/*  59 */       MainMemory.setI32(n, 1);
/*  60 */       SystemLibrary.strcpy(k, paramInt1);
/*  61 */       SystemLibrary.memset(m, (byte)0, 16, 8);
/*  62 */       MainMemory.setI16(m, (short)2);
/*  63 */       MainMemory.setI16(m + 2, SystemLibrary.bswapShort((short)paramInt2));
/*  64 */       if (paramInt1 != 0) {
/*     */         break label122;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       MainMemory.setI32(j, 0);
/*  75 */       paramInt2 = 0;
/*     */       
/*     */       break label228;
/*     */       
/*     */       label122:
/*  80 */       paramInt2 = inet_addr.call(k);
/*  81 */       MainMemory.setI32(j, paramInt2);
/*  82 */       if (paramInt2 != -1) {
/*     */         break label228;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       i1 = gethostbyname.call(k);
/*  94 */       if (i1 != 0) {
/*     */         break label194;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       MainMemory.setI32(SystemLibrary.__errno_location(), 113);
/*     */       
/*     */       break label241;
/*     */       
/*     */       label194:
/* 109 */       SystemLibrary.memcpy(j, MainMemory.getI32(MainMemory.getI32(i1 + 16)), MainMemory.getI32(i1 + 12), 1);
/* 110 */       paramInt2 = MainMemory.getI32(j);
/*     */       
/*     */ 
/*     */ 
/*     */       label228:
/*     */       
/*     */ 
/*     */ 
/* 118 */       MainMemory.setI32(m + 4, paramInt2);
/*     */       
/*     */ 
/*     */       label241:
/*     */       
/*     */ 
/* 124 */       paramInt2 = socket.call(2, 1, 0);
/* 125 */       if (paramInt2 >= 0) {
/*     */         break label285;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */       ffxmsg.call(5, 62656);
/* 136 */       i = 64534;
/*     */       
/*     */ 
/*     */       break label385;
/*     */       
/*     */       label285:
/*     */       
/* 143 */       if (connect.call(paramInt2, m, 16) >= 0) {
/*     */         break label328;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       SystemLibrary.close(paramInt2);
/* 154 */       i = 64534;
/*     */       
/*     */ 
/*     */       break label385;
/*     */       
/*     */       label328:
/*     */       
/* 161 */       paramInt1 = n;
/* 162 */       setsockopt.call(paramInt2, 6, 1, paramInt1, 4);
/* 163 */       setsockopt.call(paramInt2, 1, 9, paramInt1, 4);
/* 164 */       MainMemory.setI32(n, 65536);
/* 165 */       setsockopt.call(paramInt2, 1, 7, paramInt1, 4);
/* 166 */       setsockopt.call(paramInt2, 1, 8, paramInt1, 4);
/* 167 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label385:
/*     */       
/*     */ 
/* 173 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 178 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F272784.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */