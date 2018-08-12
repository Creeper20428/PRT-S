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
/*     */ public final class ffgtcs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3604;
/*  18 */   public static final Function _instance = new ffgtcs();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffgtcs() { super("ffgtcs", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12);
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
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i8 = call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7);
/*  67 */     paramFrame.setI32(paramInt1, i8);
/*  68 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  73 */     int i = 0;
/*     */     
/*  75 */     int j = 0;
/*  76 */     int k = 0;
/*  77 */     int m = 0;
/*  78 */     int n = 0;
/*     */     
/*     */ 
/*  81 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  85 */       j = MainMemory.alloc(8);
/*  86 */       k = MainMemory.alloc(8);
/*  87 */       m = MainMemory.alloc(4);
/*  88 */       n = MainMemory.getI32(paramInt12);
/*  89 */       if (n > 0) {
/*  90 */         paramInt2 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 100 */         MainMemory.setI32(j, paramInt2);
/* 101 */         MainMemory.setI32(j + 4, paramInt3);
/* 102 */         MainMemory.setI32(k, 10);
/* 103 */         MainMemory.setI32(k + 4, 10);
/* 104 */         ffinit.call(m, 33248, paramInt12);
/* 105 */         ffcrim.call(MainMemory.getI32(m), 32, 2, k, paramInt12);
/* 106 */         fits_copy_pixlist2image.call(paramInt1, MainMemory.getI32(m), j, paramInt12);
/* 107 */         fits_write_keys_histo.call(paramInt1, MainMemory.getI32(m), 2, j, MainMemory.getI32(paramInt12));
/* 108 */         paramInt2 = MainMemory.getI32(paramInt12);
/* 109 */         if (paramInt2 <= 0) {
/*     */           break label188;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label285;
/*     */       
/*     */       label188:
/*     */       
/* 128 */       ffgics.call(MainMemory.getI32(m), paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12);
/* 129 */       if (MainMemory.getI32(paramInt12) <= 0) {
/*     */         break label263;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */       ffxmsg.call(5, 129952);
/* 140 */       MainMemory.setI32(paramInt12, 505);
/* 141 */       i = 505;
/*     */       
/*     */ 
/*     */       break label285;
/*     */       
/*     */       label263:
/*     */       
/* 148 */       ffdelt.call(MainMemory.getI32(m), paramInt12);
/* 149 */       i = MainMemory.getI32(paramInt12);
/*     */       
/*     */ 
/*     */       label285:
/*     */       
/*     */ 
/* 155 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 160 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */