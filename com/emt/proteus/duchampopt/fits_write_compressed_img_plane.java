/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_write_compressed_img_plane extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3625;
/*  12 */   public static final Function _instance = new fits_write_compressed_img_plane();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_write_compressed_img_plane() { super("fits_write_compressed_img_plane", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7);
/*  62 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  68 */     int i = 0;
/*  69 */     int j = 0;
/*  70 */     int k = 0;
/*  71 */     int m = 0;
/*  72 */     int n = 0;
/*  73 */     int i1 = 0;
/*     */     
/*     */ 
/*  76 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  80 */       i = MainMemory.alloc(24);
/*  81 */       j = MainMemory.alloc(24);
/*  82 */       MainMemory.setI32(paramInt11, 0);
/*  83 */       paramInt4 += 1;
/*  84 */       MainMemory.setI32(i + 8, paramInt4);
/*  85 */       MainMemory.setI32(j + 8, paramInt4);
/*  86 */       paramInt4 = MainMemory.getI32(paramInt5);
/*  87 */       if (paramInt4 != 0) {
/*     */         break label106;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */       paramInt4 = MainMemory.getI32(paramInt5 + 4);
/*     */       
/*     */ 
/*     */       break label328;
/*     */       
/*     */       label106:
/*     */       
/* 104 */       MainMemory.setI32(i, paramInt4 + 1);
/* 105 */       i1 = paramInt5 + 4;
/* 106 */       paramInt4 = MainMemory.getI32(i1);
/* 107 */       m = paramInt4 + 1;
/* 108 */       MainMemory.setI32(i + 4, m);
/* 109 */       MainMemory.setI32(j + 4, m);
/* 110 */       k = paramInt6 + 4;
/* 111 */       if (MainMemory.getI32(k) != paramInt4) {
/*     */         break label199;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       MainMemory.setI32(j, MainMemory.getI32(paramInt6) + 1);
/*     */       
/*     */       break label214;
/*     */       
/*     */       label199:
/* 126 */       MainMemory.setI32(j, MainMemory.getI32(paramInt7));
/*     */       
/*     */ 
/*     */       label214:
/*     */       
/*     */ 
/* 132 */       fits_write_compressed_img.call(paramInt1, paramInt2, i, j, paramInt8, paramInt9, paramInt10, paramInt12);
/* 133 */       paramInt4 = MainMemory.getI32(j);
/* 134 */       m = MainMemory.getI32(i);
/* 135 */       MainMemory.setI32(paramInt11, MainMemory.getI32(paramInt11) + 1 + paramInt4 - m);
/* 136 */       n = MainMemory.getI32(i1);
/* 137 */       if (MainMemory.getI32(k) != n)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         MainMemory.setI32(paramInt5, 0);
/* 148 */         n += 1;
/* 149 */         MainMemory.setI32(i1, n);
/* 150 */         paramInt9 += (paramInt4 + 1 - m) * paramInt3;
/* 151 */         paramInt4 = n;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label328:
/*     */         
/*     */ 
/*     */ 
/* 160 */         MainMemory.setI32(i, 1);
/* 161 */         paramInt4 += 1;
/* 162 */         paramInt5 = i + 4;
/* 163 */         MainMemory.setI32(paramInt5, paramInt4);
/* 164 */         n = MainMemory.getI32(paramInt7);
/* 165 */         MainMemory.setI32(j, n);
/* 166 */         k = paramInt6 + 4;
/* 167 */         m = MainMemory.getI32(k);
/* 168 */         if (MainMemory.getI32(paramInt6) + 1 != n) {
/*     */           break label427;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */         n = m + 1;
/* 179 */         MainMemory.setI32(j + 4, n);
/*     */         
/*     */         break label445;
/*     */         
/*     */         label427:
/*     */         
/* 185 */         MainMemory.setI32(j + 4, m);
/* 186 */         n = m;
/*     */         
/*     */ 
/*     */ 
/*     */         label445:
/*     */         
/*     */ 
/* 193 */         i1 = j + 4;
/* 194 */         if (n < paramInt4) {
/* 195 */           paramInt3 = m;
/* 196 */           paramInt4 = n;
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
/* 207 */           fits_write_compressed_img.call(paramInt1, paramInt2, i, j, paramInt8, paramInt9, paramInt10, paramInt12);
/* 208 */           paramInt4 = MainMemory.getI32(i1);
/* 209 */           m = paramInt4 + 1 - MainMemory.getI32(paramInt5);
/* 210 */           MainMemory.setI32(paramInt11, m * MainMemory.getI32(paramInt7) + MainMemory.getI32(paramInt11));
/* 211 */           n = MainMemory.getI32(k);
/* 212 */           if (n + 1 == paramInt4) {
/*     */             break label596;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */           paramInt9 += MainMemory.getI32(paramInt7) * paramInt3 * m;
/* 223 */           paramInt3 = n;
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
/* 234 */         paramInt3 += 1;
/* 235 */         if (paramInt4 != paramInt3) {
/*     */           break label606;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label596:
/*     */       
/*     */ 
/*     */       break label676;
/*     */       
/*     */ 
/*     */       label606:
/*     */       
/*     */ 
/* 251 */       MainMemory.setI32(j, MainMemory.getI32(paramInt6) + 1);
/* 252 */       MainMemory.setI32(i1, paramInt3);
/* 253 */       MainMemory.setI32(paramInt5, paramInt3);
/* 254 */       fits_write_compressed_img.call(paramInt1, paramInt2, i, j, paramInt8, paramInt9, paramInt10, paramInt12);
/* 255 */       MainMemory.setI32(paramInt11, MainMemory.getI32(paramInt11) + 1 + MainMemory.getI32(j) - MainMemory.getI32(i));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label676:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_write_compressed_img_plane.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */