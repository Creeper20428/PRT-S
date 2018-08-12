/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class mem_iraf_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3062;
/*  14 */   public static final Function _instance = new mem_iraf_open();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public mem_iraf_open() { super("mem_iraf_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = call(i, j, k);
/*  36 */     paramFrame.setI32(paramInt1, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
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
/*  56 */       k = MainMemory.alloc(4);
/*  57 */       MainMemory.setI32(k, 0);
/*  58 */       MainMemory.setI32(paramInt3, -1);
/*  59 */       paramInt2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  66 */         if (paramInt2 >= 300) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         m = 512000 + paramInt2 * 44;
/*  77 */         if (MainMemory.getI32(m) != 0) {
/*     */           break label413;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         MainMemory.setI32(paramInt3, paramInt2);
/*  88 */         if (paramInt2 == -1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         MainMemory.setI32(m, 512000 + paramInt2 * 44 + 4);
/*  99 */         n = 512000 + paramInt2 * 44 + 12;
/* 100 */         MainMemory.setI32(512000 + paramInt2 * 44 + 8, n);
/* 101 */         MainMemory.setI32(n, 0);
/* 102 */         MainMemory.setI32(512000 + paramInt2 * 44 + 16, 2880);
/* 103 */         MainMemory.setI64(512000 + paramInt2 * 44 + 32, 0L);
/* 104 */         MainMemory.setI64(512000 + paramInt2 * 44 + 24, 0L);
/* 105 */         MainMemory.setI32(512000 + paramInt2 * 44 + 20, 2786);
/* 106 */         MainMemory.setI32(j, 0);
/* 107 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 108 */         paramInt2 = iraf2mem.call(paramInt1, MainMemory.getI32(512000 + paramInt2 * 44), MainMemory.getI32(512000 + paramInt2 * 44 + 8), k, j);
/* 109 */         MainMemory.setI32(j, paramInt2);
/* 110 */         i1 = MainMemory.getI32(paramInt3);
/* 111 */         if (paramInt2 != 0) {
/*     */           break label354;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         MainMemory.setI64(512000 + i1 * 44 + 24, 0L);
/* 122 */         MainMemory.setI64(512000 + MainMemory.getI32(paramInt3) * 44 + 32, MainMemory.getI32(k) & 0xFFFFFFFF);
/* 123 */         i = 0;
/*     */         
/*     */ 
/*     */         break label441;
/*     */         
/*     */         label354:
/*     */         
/* 130 */         m = 512000 + i1 * 44;
/* 131 */         free.call(MainMemory.getI32(MainMemory.getI32(m)));
/* 132 */         MainMemory.setI32(m, 0);
/* 133 */         MainMemory.setI32(512000 + i1 * 44 + 4, 0);
/* 134 */         ffxmsg.call(5, 125280);
/* 135 */         i = paramInt2;
/*     */         
/*     */ 
/*     */         break label441;
/*     */         
/*     */         label413:
/*     */         
/* 142 */         paramInt2 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 148 */       ffxmsg.call(5, 115936);
/* 149 */       i = 103;
/*     */       
/*     */ 
/*     */       label441:
/*     */       
/*     */ 
/* 155 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 160 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_iraf_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */