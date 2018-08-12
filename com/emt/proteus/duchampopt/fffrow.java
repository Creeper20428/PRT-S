/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class fffrow
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3197;
/*  15 */   public static final Function _instance = new fffrow();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public fffrow() { super("fffrow", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = call(i, j, k, m, n, i1);
/*  46 */     paramFrame.setI32(paramInt1, i2);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*     */     
/*     */ 
/*  62 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       j = MainMemory.alloc(20);
/*  67 */       k = MainMemory.alloc(4);
/*  68 */       m = MainMemory.alloc(4);
/*  69 */       n = MainMemory.alloc(20);
/*  70 */       if (MainMemory.getI32(paramInt6) != 0) {
/*     */         break label385;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       if (ffiprs.call(paramInt1, paramInt2, j, m, k, n, paramInt6) != 0) {
/*     */         break label377;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       i1 = MainMemory.getI32(m);
/*  91 */       if (i1 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  96 */         i2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 103 */         i1 = 0 - i1;
/* 104 */         MainMemory.setI32(m, i1);
/*     */         
/* 106 */         i2 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */       if ((MainMemory.getI32(j) != 14) || (i1 != 1)) {
/*     */         break label350;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       if (i2 != 0) {
/*     */         break label325;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       MainMemory.setI32(j + 4, paramInt5);
/* 135 */       MainMemory.setI32(j + 8, 0);
/* 136 */       m = j + 12;
/* 137 */       MainMemory.setI32(m, paramInt3);
/* 138 */       if (ffiter.call(MainMemory.getI32Aligned(470816), MainMemory.getI32Aligned(470820), 0, 0, 3202, j, paramInt6) != -1) {
/*     */         break label286;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       MainMemory.setI32(paramInt6, 0);
/*     */       
/*     */       break label307;
/*     */       
/*     */       label286:
/* 153 */       if (MainMemory.getI32(paramInt6) != 0) {
/*     */         break label337;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label307:
/*     */       
/*     */ 
/*     */ 
/* 163 */       fffrow_969.call(paramInt5, paramInt4, m);
/*     */       
/*     */       break label337;
/*     */       
/*     */       label325:
/* 168 */       fffrow_970.call(paramInt3, paramInt5, paramInt4);
/*     */       
/*     */ 
/*     */       label337:
/*     */       
/*     */ 
/* 174 */       ffcprs.call();
/*     */       
/*     */       break label385;
/*     */       
/*     */       label350:
/* 179 */       ffcprs.call();
/* 180 */       ffxmsg.call(5, 113120);
/* 181 */       MainMemory.setI32(paramInt6, 432);
/*     */       
/*     */       break label385;
/*     */       
/*     */       label377:
/* 186 */       ffcprs.call();
/*     */       
/*     */ 
/*     */       label385:
/*     */       
/*     */ 
/* 192 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 203 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffrow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */