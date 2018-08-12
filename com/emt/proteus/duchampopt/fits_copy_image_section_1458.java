/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
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
/*     */ 
/*     */ public final class fits_copy_image_section_1458
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  28 */   public static final Function _instance = new fits_copy_image_section_1458();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public fits_copy_image_section_1458() { super("fits_copy_image_section_1458", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*     */   {
/*  35 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11);
/*  36 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  41 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  60 */     paramInt4 += 2;
/*  61 */     paramInt3--;
/*  62 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  63 */     paramInt4 += 2;
/*  64 */     paramInt3--;
/*  65 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  66 */     paramInt4 += 2;
/*  67 */     paramInt3--;
/*  68 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  69 */     paramInt4 += 2;
/*  70 */     paramInt3--;
/*  71 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  72 */     paramInt4 += 2;
/*  73 */     paramInt3--;
/*  74 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6);
/*  75 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*     */   {
/*  81 */     int i = 0;
/*  82 */     int j = 0;
/*  83 */     int k = 0;
/*  84 */     int m = 0;
/*  85 */     int n = 0;
/*  86 */     int i1 = 0;
/*  87 */     int i2 = 0;
/*  88 */     int i3 = 0;
/*  89 */     int i4 = 0;
/*  90 */     int i5 = 0;
/*  91 */     int i6 = 0;
/*  92 */     int i7 = 0;
/*  93 */     int i8 = 0;
/*  94 */     int i9 = 0;
/*  95 */     int i10 = 0;
/*  96 */     int i11 = 0;
/*  97 */     int i12 = 0;
/*  98 */     int i13 = 0;
/*  99 */     int i14 = 0;
/* 100 */     int i15 = 0;
/* 101 */     int i16 = 0;
/* 102 */     long l1 = 0L;
/* 103 */     int i17 = 0;
/* 104 */     int i18 = 0;
/* 105 */     int i19 = 0;
/* 106 */     int i20 = 0;
/* 107 */     int i21 = 0;
/* 108 */     long l2 = 0L;
/* 109 */     int i22 = 0;
/* 110 */     int i23 = 0;
/* 111 */     int i24 = 0;
/* 112 */     long l3 = 0L;
/* 113 */     long l4 = 0L;
/* 114 */     long l5 = 0L;
/* 115 */     int i25 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 121 */       if (ffrdef.call(paramInt11, paramInt8) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 126 */         ffpscl.call(paramInt10, paramInt8);
/* 127 */         ffpscl.call(paramInt11, paramInt8);
/* 128 */         i21 = MainMemory.getI32(paramInt2);
/* 129 */         m = MainMemory.getI32(paramInt5);
/* 130 */         i = malloc.call((m > -1 ? m : 0 - m) / 8 * i21);
/* 131 */         j = i;
/* 132 */         if (i == 0)
/*     */         {
/* 134 */           ffxmsg.call(5, 119776);
/* 135 */           MainMemory.setI32(paramInt8, 113);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 142 */           k = paramInt4 + 4;
/* 143 */           m = MainMemory.getI32(k);
/* 144 */           n = paramInt1 + 4;
/* 145 */           i4 = MainMemory.getI32(n);
/* 146 */           i1 = m > i4 ? 1 : 0;
/* 147 */           i2 = paramInt6 + 4;
/* 148 */           i8 = MainMemory.getI32(i2);
/* 149 */           i22 = ((i1 != 0 ? m - i4 : i4 - m) + i8) / i8;
/* 150 */           i3 = paramInt4 + 8;
/* 151 */           i4 = MainMemory.getI32(i3);
/* 152 */           i5 = paramInt1 + 8;
/* 153 */           i8 = MainMemory.getI32(i5);
/* 154 */           i6 = i4 > i8 ? 1 : 0;
/* 155 */           i7 = paramInt6 + 8;
/* 156 */           i10 = MainMemory.getI32(i7);
/* 157 */           i8 = ((i6 != 0 ? i4 - i8 : i8 - i4) + i10) / i10;
/* 158 */           i9 = paramInt4 + 12;
/* 159 */           i10 = MainMemory.getI32(i9);
/* 160 */           i11 = paramInt1 + 12;
/* 161 */           i14 = MainMemory.getI32(i11);
/* 162 */           i12 = i10 > i14 ? 1 : 0;
/* 163 */           i13 = paramInt6 + 12;
/* 164 */           i23 = MainMemory.getI32(i13);
/* 165 */           i14 = ((i12 != 0 ? i10 - i14 : i14 - i10) + i23) / i23;
/* 166 */           if (i14 > 0)
/*     */           {
/* 168 */             i15 = i8 > 0 ? 1 : 0;
/* 169 */             i16 = i22 > 0 ? 1 : 0;
/* 170 */             l1 = i21;
/* 171 */             i17 = i;
/* 172 */             i18 = i;
/* 173 */             i19 = i;
/* 174 */             i20 = i;
/* 175 */             i21 = i22 * i21;
/* 176 */             l2 = i22 & 0xFFFFFFFF;
/* 177 */             i22 = 0;
/* 178 */             i24 = 1;
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 183 */               i23 = MainMemory.getI32(i13) * i22;
/* 184 */               i23 = i10 + (i12 != 0 ? 0 - i23 : i23);
/* 185 */               MainMemory.setI32(i9, i23);
/* 186 */               MainMemory.setI32(i11, i23);
/* 187 */               if (i15 != 0) {
/* 188 */                 i23 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 194 */                   i25 = MainMemory.getI32(i7) * i23;
/* 195 */                   i25 = i4 + (i6 != 0 ? 0 - i25 : i25);
/* 196 */                   MainMemory.setI32(i3, i25);
/* 197 */                   MainMemory.setI32(i5, i25);
/* 198 */                   if (i16 != 0)
/*     */                   {
/* 200 */                     l3 = i24;
/* 201 */                     l4 = 0L;
/*     */                     
/*     */                     for (;;)
/*     */                     {
/* 205 */                       l5 = l3 + l1 * l4;
/* 206 */                       i25 = MainMemory.getI32(i2) * (int)l4;
/* 207 */                       i25 = m + (i1 != 0 ? 0 - i25 : i25);
/* 208 */                       MainMemory.setI32(k, i25);
/* 209 */                       MainMemory.setI32(n, i25);
/* 210 */                       switch (MainMemory.getI32(paramInt5))
/*     */                       {
/*     */                       case 8: 
/* 213 */                         ffgsvb.call(paramInt10, paramInt7, paramInt3, paramInt4, paramInt1, paramInt6, i, paramInt9, paramInt8);
/* 214 */                         ffpprb.call(paramInt11, l5, l1, i, paramInt8);
/*     */                         
/*     */ 
/*     */ 
/* 218 */                         break;
/*     */                       
/*     */                       case 16: 
/* 221 */                         ffgsvi.call(paramInt10, paramInt7, paramInt3, paramInt4, paramInt1, paramInt6, i17, paramInt9, paramInt8);
/* 222 */                         ffppri.call(paramInt11, l5, l1, i17, paramInt8);
/*     */                         
/*     */ 
/*     */ 
/* 226 */                         break;
/*     */                       
/*     */                       case 32: 
/* 229 */                         ffgsvk.call(paramInt10, paramInt7, paramInt3, paramInt4, paramInt1, paramInt6, i18, paramInt9, paramInt8);
/* 230 */                         ffpprk.call(paramInt11, l5, l1, i18, paramInt8);
/*     */                         
/*     */ 
/*     */ 
/* 234 */                         break;
/*     */                       
/*     */                       case -32: 
/* 237 */                         ffgsve.call(paramInt10, 1, paramInt7, paramInt3, paramInt4, paramInt1, paramInt6, -9.11912E-36F, i19, paramInt9, paramInt8);
/* 238 */                         ffppne.call(paramInt11, 1, l5, l1, i19, -9.11912E-36F, paramInt8);
/*     */                         
/*     */ 
/*     */ 
/* 242 */                         break;
/*     */                       
/*     */                       case -64: 
/* 245 */                         ffgsvd.call(paramInt10, paramInt7, paramInt3, paramInt4, paramInt1, paramInt6, j, paramInt9, paramInt8);
/* 246 */                         ffppnd.call(paramInt11, l5, l1, j, -9.1191291391491E-36D, paramInt8);
/*     */                         
/*     */ 
/*     */ 
/* 250 */                         break;
/*     */                       
/*     */                       case 64: 
/* 253 */                         ffgsvjj.call(paramInt10, paramInt7, paramInt3, paramInt4, paramInt1, paramInt6, i20, paramInt9, paramInt8);
/* 254 */                         ffpprjj.call(paramInt11, l5, l1, i20, paramInt8);
/*     */                         
/*     */ 
/*     */ 
/* 258 */                         break;
/*     */                       }
/*     */                       
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/* 265 */                       l4 += 1L;
/* 266 */                       if (l4 == l2)
/*     */                       {
/* 268 */                         i24 = i21 + i24; break;
/*     */                       }
/*     */                     }
/*     */                   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */                   i23 += 1;
/* 294 */                   if (i23 == i8) {
/* 295 */                     i23 = i24; break;
/*     */ 
/*     */                   }
/*     */                   
/*     */ 
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 309 */                 i23 = i24;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */               i22 += 1;
/* 317 */               if (i22 == i14) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 322 */               i24 = i23;
/*     */             }
/*     */           }
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
/* 338 */           free.call(i);
/* 339 */           if (MainMemory.getI32(paramInt8) > 0)
/*     */           {
/* 341 */             ffxmsg.call(5, 119840);
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_copy_image_section_1458.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */