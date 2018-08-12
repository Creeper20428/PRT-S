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
/*     */ public final class fits_copy_pixlist2image
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3234;
/*  15 */   public static final Function _instance = new fits_copy_pixlist2image();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public fits_copy_pixlist2image() { super("fits_copy_pixlist2image", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  39 */     int n = call(i, j, k, m);
/*  40 */     paramFrame.setI32(paramInt1, n);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*  59 */     int i8 = 0;
/*  60 */     int i9 = 0;
/*  61 */     int i10 = 0;
/*  62 */     int i11 = 0;
/*  63 */     int i12 = 0;
/*     */     
/*     */ 
/*  66 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       j = MainMemory.alloc(4);
/*  71 */       k = MainMemory.alloc(4);
/*  72 */       m = MainMemory.alloc(81);
/*  73 */       n = MainMemory.alloc(81);
/*  74 */       i1 = MainMemory.alloc(4);
/*  75 */       i2 = MainMemory.alloc(4);
/*  76 */       i3 = MainMemory.alloc(4);
/*  77 */       i4 = MainMemory.alloc(4);
/*  78 */       i5 = MainMemory.alloc(4);
/*  79 */       i6 = MainMemory.alloc(4);
/*  80 */       i7 = MainMemory.alloc(792);
/*  81 */       MainMemory.setI32(i1, 0);
/*  82 */       SystemLibrary.memcpy(i7, 154432, 792, 4);
/*  83 */       i12 = MainMemory.getI32(paramInt4);
/*  84 */       if (i12 <= 0) {
/*     */         break label181;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       i = i12;
/*     */       
/*     */ 
/*     */       break label369;
/*     */       
/*     */       label181:
/*     */       
/* 101 */       ffghsp.call(paramInt1, j, k, paramInt4);
/* 102 */       if (MainMemory.getI32(j) >= 9)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         i8 = m + 8;
/* 113 */         i9 = n + 8;
/* 114 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 121 */           i11 = i10 + 9;
/* 122 */           i12 = i10 + 10;
/* 123 */           MainMemory.setI8(n, (byte)0);
/* 124 */           ffgrec.call(paramInt1, i11, m, paramInt4);
/* 125 */           fits_translate_pixkeyword.call(m, n, i7, paramInt3, i1, i2, i3, i4, i5, i6, paramInt4);
/* 126 */           if (MainMemory.getI8(n) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */             ffprec.call(paramInt2, n, paramInt4);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 142 */           MainMemory.setI8(i8, (byte)0);
/* 143 */           MainMemory.setI8(i9, (byte)0);
/* 144 */           i10 += 1;
/* 145 */           if (i12 > MainMemory.getI32(j)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       label369:
/*     */       
/*     */ 
/* 162 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 167 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_copy_pixlist2image.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */