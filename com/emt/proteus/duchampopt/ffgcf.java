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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgcf
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3277;
/*  25 */   public static final Function _instance = new ffgcf();
/*  26 */   public final Function resolve() { return _instance; }
/*     */   
/*  28 */   public ffgcf() { super("ffgcf", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  32 */     call(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramInt4, paramInt5, paramInt6, paramInt7);
/*  33 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  38 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  60 */     paramInt4 += 2;
/*  61 */     paramInt3--;
/*  62 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  63 */     paramInt4 += 2;
/*  64 */     paramInt3--;
/*  65 */     call(i, j, k, l1, l2, m, n, i1, i2);
/*  66 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  72 */     int i = 0;
/*     */     
/*     */ 
/*  75 */     int j = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  79 */       i = MainMemory.alloc(8);
/*  80 */       MainMemory.setF64(i, 0.0D);
/*  81 */       if (MainMemory.getI32(paramInt7) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         switch (paramInt2) {
/*     */         case 1: 
/*     */           break label801;
/*     */           break;
/*     */         case 11: 
/*     */           break label770;
/*     */           break;
/*     */         case 12: 
/*     */           break label741;
/*     */           break;
/*     */         case 20: 
/*     */           break label712;
/*     */           break;
/*     */         case 21:  break label681;
/*     */           break; case 30:  break label622;
/*     */           break; case 31:  break label575;
/*     */           break; case 40:  break label546;
/*     */           break; case 41:  break label516;
/*     */           break; case 81:  break label485;
/*     */           break; case 42:  break label454;
/*     */           break; case 82:  break label423;
/*     */           break; case 83:  break label397;
/*     */           break; case 163:  break label371;
/*     */           break; case 14:  break label342;
/*     */           break; case 16:  break; }
/* 116 */         ffgcls.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 2, i, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label342:
/*     */         
/* 123 */         ffgcll.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 2, (byte)0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label371:
/*     */         
/* 130 */         ffgcfm.call(paramInt1, paramInt3, paramLong1, paramLong2, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label397:
/*     */         
/* 137 */         ffgcfc.call(paramInt1, paramInt3, paramLong1, paramLong2, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label423:
/*     */         
/* 144 */         ffgcld.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 1, 2, 0.0D, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label454:
/*     */         
/* 151 */         ffgcle.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 1, 2, 0.0F, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label485:
/*     */         
/* 158 */         ffgcljj.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 1, 2, 0L, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label516:
/*     */         
/* 165 */         ffgclj.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 1, 2, 0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label546:
/*     */         
/* 172 */         ffgcluj.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 2, 0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label837;
/*     */         
/*     */         label575:
/*     */         
/* 179 */         if (paramLong2 != 0L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */           ffgclj.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 1, 2, 0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */           
/*     */ 
/*     */           break label837;
/*     */           
/*     */           label622:
/*     */           
/* 196 */           if (paramLong2 != 0L) {
/*     */             break label652;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       break label837;
/*     */       
/*     */ 
/*     */ 
/*     */       label652:
/*     */       
/*     */ 
/*     */ 
/* 212 */       ffgcluj.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 2, 0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */       
/*     */ 
/*     */       break label837;
/*     */       
/*     */       label681:
/*     */       
/* 219 */       ffgcli.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 1, 2, (short)0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */       
/*     */ 
/*     */       break label837;
/*     */       
/*     */       label712:
/*     */       
/* 226 */       ffgclui.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 2, (short)0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */       
/*     */ 
/*     */       break label837;
/*     */       
/*     */       label741:
/*     */       
/* 233 */       ffgclsb.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 2, (byte)0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */       
/*     */ 
/*     */       break label837;
/*     */       
/*     */       label770:
/*     */       
/* 240 */       ffgclb.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, 1, 2, (byte)0, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */       
/*     */ 
/*     */       break label837;
/*     */       
/*     */       label801:
/*     */       
/* 247 */       ffgcx.call(paramInt1, paramInt3, paramLong1, 1L, paramLong2, paramInt4, paramInt7);
/*     */       
/*     */ 
/*     */ 
/*     */       break label837;
/*     */       
/*     */ 
/* 254 */       MainMemory.setI32(paramInt7, 410);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label837:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */       MainMemory.dealloc_generated(j);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */