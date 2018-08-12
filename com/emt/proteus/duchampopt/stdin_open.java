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
/*     */ 
/*     */ public final class stdin_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3067;
/*  19 */   public static final Function _instance = new stdin_open();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public stdin_open() { super("stdin_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  26 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = call(i, j, k);
/*  41 */     paramFrame.setI32(paramInt1, m);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (MainMemory.getI8(488448) != 0) {
/*     */         break label519;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */       m = (byte)SystemLibrary.fgetc(MainMemory.getI32Aligned(1792));
/*  71 */       SystemLibrary.ungetc(m, MainMemory.getI32Aligned(1792));
/*  72 */       switch (m)
/*     */       {
/*     */       case 31: 
/*     */         break;
/*     */       case 75: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  84 */       i = mem_compress_stdin_open.call(paramInt1, paramInt2, paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */       break label681;
/*     */       
/*     */ 
/*  91 */       if (paramInt2 != 0) {
/*     */         break label500;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       MainMemory.setI32(paramInt3, -1);
/* 102 */       paramInt2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 109 */         if (paramInt2 >= 300)
/*     */         {
/*     */ 
/*     */ 
/* 113 */           paramInt2 = 103;
/* 114 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 120 */         n = 512000 + paramInt2 * 44;
/* 121 */         if (MainMemory.getI32(n) != 0) {
/*     */           break label468;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         MainMemory.setI32(paramInt3, paramInt2);
/* 132 */         if (paramInt2 == -1) {
/* 133 */           paramInt2 = 103;
/* 134 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         i1 = 512000 + paramInt2 * 44 + 4;
/* 144 */         MainMemory.setI32(n, i1);
/* 145 */         i2 = 512000 + paramInt2 * 44 + 12;
/* 146 */         MainMemory.setI32(512000 + paramInt2 * 44 + 8, i2);
/* 147 */         paramInt1 = malloc.call(2880);
/* 148 */         MainMemory.setI32(i1, paramInt1);
/* 149 */         if (paramInt1 != 0) {
/*     */           break label327;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */         ffxmsg.call(5, 109856);
/* 160 */         paramInt2 = 104;
/* 161 */         break;
/*     */         
/*     */         label327:
/*     */         
/* 165 */         MainMemory.setI32(i2, 2880);
/* 166 */         MainMemory.setI32(512000 + paramInt2 * 44 + 16, 2880);
/* 167 */         MainMemory.setI64(512000 + paramInt2 * 44 + 32, 0L);
/* 168 */         MainMemory.setI64(512000 + paramInt2 * 44 + 24, 0L);
/* 169 */         MainMemory.setI32(512000 + paramInt2 * 44 + 20, 2786);
/* 170 */         paramInt2 = stdin2mem.call(MainMemory.getI32(paramInt3));
/* 171 */         if (paramInt2 != 0) {
/*     */           break label432;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         i = paramInt2;
/*     */         
/*     */ 
/*     */         break label681;
/*     */         
/*     */         label432:
/*     */         
/* 188 */         ffxmsg.call(5, 105184);
/* 189 */         free.call(MainMemory.getI32(512000 + MainMemory.getI32(paramInt3) * 44 + 4));
/* 190 */         i = paramInt2;
/*     */         
/*     */ 
/*     */         break label681;
/*     */         
/*     */         label468:
/*     */         
/* 197 */         paramInt2 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */       ffxmsg.call(5, 109984);
/* 205 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label681;
/*     */       
/*     */       label500:
/*     */       
/* 212 */       ffxmsg.call(5, 85344);
/* 213 */       i = 112;
/*     */       
/*     */ 
/*     */       break label681;
/*     */       
/*     */       label519:
/*     */       
/* 220 */       j = file_create.call(488448, paramInt3);
/* 221 */       if (j != 0) {
/*     */         break label661;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */       j = stdin2file.call(MainMemory.getI32(paramInt3));
/* 232 */       k = 503808 + (MainMemory.getI32(paramInt3) << 4);
/* 233 */       if (SystemLibrary.fclose(MainMemory.getI32(k)) != 0) {
/*     */         break label600;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */       MainMemory.setI32(k, 0);
/*     */       
/*     */ 
/*     */       label600:
/*     */       
/*     */ 
/* 249 */       if (j != 0) {
/*     */         break label636;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */       i = file_open.call(488448, paramInt2, paramInt3);
/*     */       
/*     */ 
/*     */       break label681;
/*     */       
/*     */       label636:
/*     */       
/* 266 */       ffxmsg.call(5, 96288);
/* 267 */       ffxmsg.call(5, 488448);
/* 268 */       i = j;
/*     */       
/*     */ 
/*     */       break label681;
/*     */       
/*     */       label661:
/*     */       
/* 275 */       ffxmsg.call(5, 126560);
/* 276 */       ffxmsg.call(5, 488448);
/* 277 */       i = j;
/*     */       
/*     */ 
/*     */       label681:
/*     */       
/*     */ 
/* 283 */       int i3 = i; return i3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/stdin_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */