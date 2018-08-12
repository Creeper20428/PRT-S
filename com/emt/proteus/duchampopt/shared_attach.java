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
/*     */ public final class shared_attach
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3136;
/*  16 */   public static final Function _instance = new shared_attach();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public shared_attach() { super("shared_attach", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  23 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = call(i);
/*  32 */     paramFrame.setI32(paramInt1, j);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*     */     
/*     */ 
/*  47 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  51 */       j = MainMemory.alloc(6);
/*  52 */       k = F277734.call(paramInt, 1);
/*  53 */       if (k != 0) {
/*     */         break label410;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */       k = F276539.call(paramInt);
/*  64 */       if (k != 0) {
/*     */         break label392;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       m = MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt * 28);
/*  75 */       if (!MainMemory.getI1(459004))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         SystemLibrary.printf(59904, new Object[0]);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  91 */       if (m != -1) {
/*     */         break label155;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       n = MainMemory.getI32Aligned(458776);
/*     */       
/*     */       break label207;
/*     */       
/*     */       label155:
/*     */       
/* 107 */       MainMemory.setI16(j, (short)0);
/* 108 */       MainMemory.setI16(j + 2, (short)1);
/* 109 */       MainMemory.setI16(j + 4, (short)4096);
/* 110 */       n = MainMemory.getI32Aligned(458776);
/* 111 */       if (semop.call(m, j, 1) != -1) {
/*     */         break label253;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label207:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 123 */       shmdt.call(MainMemory.getI32(n + (paramInt << 4)));
/* 124 */       MainMemory.setI32(MainMemory.getI32Aligned(458776) + (paramInt << 4), 0);
/* 125 */       F276460.call(paramInt, 1);
/* 126 */       i = 151;
/*     */       
/*     */ 
/*     */       break label417;
/*     */       
/*     */       label253:
/*     */       
/* 133 */       i1 = n + (paramInt << 4) + 4;
/* 134 */       MainMemory.setI32(i1, MainMemory.getI32(i1) + 1);
/* 135 */       if ((MainMemory.getI8(MainMemory.getI32Aligned(458772) + paramInt * 28 + 24) & 0xFF & 0x4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         k = shmdt.call(MainMemory.getI32(n + (paramInt << 4))) == 0 ? k : 155;
/* 148 */         n = MainMemory.getI32Aligned(458776);
/* 149 */         MainMemory.setI32(n + (paramInt << 4), 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */       MainMemory.setI32(n + (paramInt << 4) + 12, 0);
/* 160 */       i = k == 0 ? F276460.call(paramInt, 1) : k;
/*     */       
/*     */ 
/*     */       break label417;
/*     */       
/*     */       label392:
/*     */       
/* 167 */       F276460.call(paramInt, 1);
/* 168 */       i = k;
/*     */       
/*     */ 
/*     */       break label417;
/*     */       
/*     */       label410:
/*     */       
/* 175 */       i = k;
/*     */       
/*     */ 
/*     */       label417:
/*     */       
/*     */ 
/* 181 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 186 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_attach.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */