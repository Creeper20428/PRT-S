/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ 
/*     */ public final class ffcrhd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3275;
/*  15 */   public static final Function _instance = new ffcrhd();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffcrhd() { super("ffcrhd", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     long l = 0L;
/*     */     
/*     */ 
/*  51 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       i = MainMemory.alloc(4);
/*  56 */       MainMemory.setI32(i, 0);
/*  57 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */         n = MainMemory.getI32(paramInt1);
/*  68 */         j = paramInt1 + 4;
/*  69 */         k = MainMemory.getI32(j);
/*  70 */         m = MainMemory.getI32(k + 64);
/*  71 */         if (n == m) {
/*  72 */           n = m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  83 */           ffmahd.call(paramInt1, n + 1, 0, paramInt2);
/*  84 */           k = MainMemory.getI32(j);
/*  85 */           n = MainMemory.getI32(k + 64);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         if (MainMemory.getI64(k + 88) != MainMemory.getI64(MainMemory.getI32(k + 84) + (n << 3)))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 105 */             n = MainMemory.getI32(i);
/* 106 */             if (n <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */               ffmahd.call(paramInt1, MainMemory.getI32(paramInt1) + 2, 0, i);
/* 118 */               n = MainMemory.getI32(i);
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */           }
/* 126 */           while (n == 0);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */           k = MainMemory.getI32(j);
/* 137 */           n = MainMemory.getI32(k + 80);
/* 138 */           if (MainMemory.getI32(k + 76) != n) {
/*     */             break label369;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */           i1 = realloc.call(MainMemory.getI32(k + 84), (n << 3) + 8008);
/* 149 */           if (i1 != 0) {
/*     */             break label328;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           MainMemory.setI32(paramInt2, 113);
/*     */           
/*     */ 
/*     */           break label564;
/*     */           
/*     */           label328:
/*     */           
/* 166 */           i2 = i1;
/* 167 */           i = MainMemory.getI32(j) + 80;
/* 168 */           MainMemory.setI32(i, MainMemory.getI32(i) + 1000);
/* 169 */           MainMemory.setI32(MainMemory.getI32(j) + 84, i2);
/*     */           
/*     */ 
/*     */           label369:
/*     */           
/*     */ 
/* 175 */           if (ffchdu.call(paramInt1, paramInt2) >= 1) {
/*     */             break label559;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */           k = MainMemory.getI32(j);
/* 186 */           l = MainMemory.getI64(MainMemory.getI32(k + 84) + (MainMemory.getI32(k + 76) + 1 << 3));
/* 187 */           ffmbyt.call(paramInt1, l, 1, paramInt2);
/* 188 */           paramInt2 = MainMemory.getI32(j) + 76;
/* 189 */           MainMemory.setI32(paramInt2, MainMemory.getI32(paramInt2) + 1);
/* 190 */           k = MainMemory.getI32(j);
/* 191 */           MainMemory.setI32(k + 64, MainMemory.getI32(k + 76));
/* 192 */           k = MainMemory.getI32(j);
/* 193 */           MainMemory.setI32(paramInt1, MainMemory.getI32(k + 76));
/* 194 */           MainMemory.setI64(k + 104, l);
/* 195 */           MainMemory.setI64(MainMemory.getI32(j) + 88, l);
/* 196 */           MainMemory.setI64(MainMemory.getI32(j) + 112, -1L);
/* 197 */           k = MainMemory.getI32(j);
/* 198 */           MainMemory.setI32(k + 1176, MainMemory.getI32(k + 1004));
/*     */           
/*     */ 
/*     */ 
/*     */           break label564;
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label559:
/*     */       
/*     */ 
/*     */ 
/*     */       label564:
/*     */       
/*     */ 
/* 215 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcrhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */