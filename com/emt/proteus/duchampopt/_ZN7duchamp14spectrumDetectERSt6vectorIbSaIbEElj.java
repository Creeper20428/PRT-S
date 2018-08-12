/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp14spectrumDetectERSt6vectorIbSaIbEElj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1262;
/*  14 */   public static final Function _instance = new _ZN7duchamp14spectrumDetectERSt6vectorIbSaIbEElj();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp14spectrumDetectERSt6vectorIbSaIbEElj() { super("_ZN7duchamp14spectrumDetectERSt6vectorIbSaIbEElj", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*     */     
/*     */ 
/*  58 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       i = MainMemory.alloc(16);
/*  63 */       _ZN9PixelInfo4ScanC1Ev.call(i);
/*  64 */       MainMemory.setI32(paramInt1, 0);
/*  65 */       j = paramInt1 + 4;
/*  66 */       MainMemory.setI32(j, 0);
/*  67 */       k = paramInt1 + 8;
/*  68 */       MainMemory.setI32(k, 0);
/*  69 */       m = paramInt3 + 1;
/*  70 */       n = i + 12;
/*  71 */       i1 = i + 4;
/*  72 */       i2 = i + 8;
/*  73 */       i4 = 0;
/*  74 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  82 */         if (m <= i5) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         if (i5 >= paramInt3) {
/*     */           break label258;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         if ((MainMemory.getI32(MainMemory.getI32(paramInt2) + (i5 >>> 5 << 2)) & 1 << (i5 & 0x1F)) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */           if (i4 != 1) {
/*     */             break label226;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */           MainMemory.setI32(n, MainMemory.getI32(n) + 1);
/*     */           
/*     */           break label415;
/*     */           
/*     */           label226:
/*     */           
/* 128 */           MainMemory.setI32(i1, 0);
/* 129 */           MainMemory.setI32(i2, i5);
/* 130 */           MainMemory.setI32(n, 1);
/* 131 */           i4 = 1;
/*     */         }
/*     */         else
/*     */         {
/*     */           label258:
/* 136 */           if (i4 != 1)
/*     */           {
/*     */ 
/*     */ 
/* 140 */             i4 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 147 */             if (MainMemory.getI32(n) >= paramInt4)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */               i3 = MainMemory.getI32(j);
/* 158 */               if (i3 != MainMemory.getI32(k)) {
/*     */                 break label347;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */               _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt1, i3, i);
/*     */               
/*     */               break label389;
/*     */               
/*     */               label347:
/* 173 */               if (i3 != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */                 _ZN9PixelInfo4ScanC1ERKS0_.call(i3, i);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 189 */               MainMemory.setI32(j, i3 + 16);
/*     */             }
/*     */             
/*     */ 
/*     */             label389:
/*     */             
/* 195 */             MainMemory.setI32(i1, -1);
/* 196 */             MainMemory.setI32(i2, -1);
/* 197 */             MainMemory.setI32(n, 0);
/* 198 */             i4 = 0;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label415:
/*     */         
/* 205 */         i5 += 1;
/*     */       }
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
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 222 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp14spectrumDetectERSt6vectorIbSaIbEElj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */