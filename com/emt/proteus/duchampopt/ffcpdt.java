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
/*     */ 
/*     */ 
/*     */ public final class ffcpdt
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3153;
/*  17 */   public static final Function _instance = new ffcpdt();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffcpdt() { super("ffcpdt", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     long l1 = 0L;
/*  53 */     int i2 = 0;
/*  54 */     long l2 = 0L;
/*     */     
/*     */ 
/*  57 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       i = MainMemory.alloc(8);
/*  62 */       j = MainMemory.alloc(8);
/*  63 */       k = MainMemory.alloc(2880);
/*  64 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         if (paramInt1 != paramInt2) {
/*     */           break label103;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         MainMemory.setI32(paramInt3, 101);
/*     */         
/*     */ 
/*     */         break label525;
/*     */         
/*     */         label103:
/*     */         
/*  91 */         ffghadll.call(paramInt1, i, j, paramInt3);
/*  92 */         if (MainMemory.getI32(paramInt3) > 0) {
/*  93 */           l1 = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 103 */           i1 = MainMemory.getI32(paramInt2);
/* 104 */           m = paramInt2 + 4;
/* 105 */           n = MainMemory.getI32(m);
/* 106 */           if (i1 != MainMemory.getI32(n + 64)) {
/*     */             break label232;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           if (MainMemory.getI64(n + 112) != -1L) {
/*     */             break label258;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */           if (ffrdef.call(paramInt2, paramInt3) > 0) {
/* 127 */             l1 = 0L;
/*     */             
/*     */             break label276;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label258;
/*     */           }
/*     */           label232:
/* 136 */           if (ffmahd.call(paramInt2, i1 + 1, 0, paramInt3) > 0) {
/* 137 */             l1 = 0L;
/*     */           } else {
/*     */             label258:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */             l1 = MainMemory.getI64(MainMemory.getI32(m) + 112);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label276:
/*     */         
/*     */ 
/* 155 */         l2 = MainMemory.getI64(i);
/* 156 */         i1 = (int)((MainMemory.getI64(j) - l2) / 2880L);
/* 157 */         if (i1 <= 0) {
/*     */           break label520;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */         if (MainMemory.getI32(paramInt1 + 4) != MainMemory.getI32(paramInt2 + 4)) {
/*     */           break label446;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 188 */           ffmbyt.call(paramInt1, l2, 0, paramInt3);
/* 189 */           ffgbyt.call(paramInt1, 2880L, k, paramInt3);
/* 190 */           ffmbyt.call(paramInt2, l1, 1, paramInt3);
/* 191 */           ffpbyt.call(paramInt2, 2880L, k, paramInt3);
/* 192 */           l2 = MainMemory.getI64(i) + 2880L;
/* 193 */           MainMemory.setI64(i, l2);
/* 194 */           l1 += 2880L;
/* 195 */           i2 += 1;
/* 196 */           if (i2 == i1) { break label520;
/* 197 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label446:
/*     */         
/*     */ 
/*     */ 
/* 208 */         ffmbyt.call(paramInt1, l2, 0, paramInt3);
/* 209 */         ffmbyt.call(paramInt2, l1, 1, paramInt3);
/* 210 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 217 */           ffgbyt.call(paramInt1, 2880L, k, paramInt3);
/* 218 */           ffpbyt.call(paramInt2, 2880L, k, paramInt3);
/* 219 */           i2 += 1;
/* 220 */           if (i2 == i1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label520:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label525:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcpdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */