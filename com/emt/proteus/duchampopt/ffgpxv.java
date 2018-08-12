/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgpxv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3276;
/*  14 */   public static final Function _instance = new ffgpxv();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgpxv() { super("ffgpxv", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramInt5);
/*  22 */     return 0;
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
/*  33 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, l, k, m, n);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*     */     
/*     */ 
/*  61 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(792);
/*  66 */       j = MainMemory.getI32(paramInt5) > 0 ? 1 : 0;
/*  67 */       if ((j == 0) && (paramLong != 0L)) {
/*     */         break label83;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label429;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label83:
/*     */       
/*     */ 
/*     */ 
/*  83 */       if (j == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         k = MainMemory.getI32(paramInt1);
/*  94 */         m = paramInt1 + 4;
/*  95 */         n = MainMemory.getI32(m);
/*  96 */         if (k != MainMemory.getI32(n + 64)) {
/*     */           break label197;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         if (MainMemory.getI64(n + 112) != -1L) {
/*     */           break label214;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label411;
/*     */         } else {
/*     */           break label214;
/*     */         }
/*     */         
/*     */ 
/*     */         label197:
/*     */         
/* 125 */         ffmahd.call(paramInt1, k + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label214:
/*     */         
/*     */ 
/* 131 */         n = MainMemory.getI32(m);
/* 132 */         if (MainMemory.getI32(n + 68) != 0) {
/*     */           break label262;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         i1 = n + 120;
/*     */         
/*     */         break label318;
/*     */         
/*     */         label262:
/*     */         
/* 148 */         if (MainMemory.getI32(n + 1012) != 0) {
/*     */           break label305;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         MainMemory.setI32(paramInt5, 233);
/*     */         
/*     */         break label411;
/*     */         
/*     */         label305:
/* 163 */         i1 = n + 1040;
/*     */         
/*     */ 
/*     */ 
/*     */         label318:
/*     */         
/*     */ 
/*     */ 
/* 171 */         k = MainMemory.getI32(i1);
/* 172 */         if (k <= 0) {
/*     */           break label411;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         k = k > 1 ? k : 1;
/* 183 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 190 */           MainMemory.setI64(i + (i2 << 3), MainMemory.getI32(paramInt2 + (i2 << 2)));
/* 191 */           i2 += 1;
/* 192 */           if (i2 == k) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label411:
/*     */       
/*     */ 
/* 203 */       ffgpxvll.call(paramInt1, i, paramLong, paramInt3, paramInt4, paramInt5);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label429:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgpxv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */