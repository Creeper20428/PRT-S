/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fits_url2relurl extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3426;
/*  13 */   public static final Function _instance = new fits_url2relurl();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fits_url2relurl() { super("fits_url2relurl", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*  53 */     int i4 = 0;
/*  54 */     int i5 = 0;
/*  55 */     int i6 = 0;
/*  56 */     int i7 = 0;
/*  57 */     int i8 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  63 */       if (MainMemory.getI32(paramInt4) != 0) {
/*     */         break label811;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       MainMemory.setI8(paramInt3, (byte)0);
/*  74 */       if (fits_is_url_absolute.call(paramInt1) != 0) {
/*     */         break label106;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       if (MainMemory.getI8(paramInt1) != 47) {
/*     */         break label145;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label106:
/*     */       
/*     */ 
/*     */ 
/*  94 */       if (fits_is_url_absolute.call(paramInt2) != 0) {
/*     */         break label167;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       if (MainMemory.getI8(paramInt2) != 47)
/*     */       {
/*     */         label145:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         MainMemory.setI32(paramInt4, 125);
/* 115 */         ffxmsg.call(5, 127328);
/*     */       }
/*     */       else
/*     */       {
/*     */         label167:
/*     */         
/*     */ 
/* 122 */         i = SystemLibrary.strlen(paramInt1);
/* 123 */         j = SystemLibrary.strlen(paramInt2);
/* 124 */         if ((i > 0) && (j > 0)) {
/* 125 */           i8 = 0;
/* 126 */           n = 0;
/* 127 */           i6 = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label811;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 140 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 147 */             k = n + i3;
/* 148 */             m = k < j ? 1 : 0;
/* 149 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/* 153 */               i3 = 0;
/* 154 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 160 */             if (MainMemory.getI8(paramInt2 + k) != 47)
/*     */             {
/*     */ 
/*     */ 
/* 164 */               i3 = 0;
/* 165 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 171 */             k = i3 + 1;
/* 172 */             i3 = k;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/* 178 */             n = i6 + i3;
/* 179 */             i1 = n < i ? 1 : 0;
/* 180 */             if (i1 == 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */             if (MainMemory.getI8(paramInt1 + n) != 47) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */             n = i3 + 1;
/* 201 */             i3 = n;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 206 */           i2 = paramInt2 + k;
/* 207 */           if ((MainMemory.getI8(i2) == 47) || (m == 0))
/*     */           {
/*     */ 
/*     */ 
/* 211 */             i6 = k;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 218 */             i6 = k + 1;
/* 219 */             i5 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 226 */               i3 = i6 + i5;
/* 227 */               i5 += 1;
/* 228 */               if ((MainMemory.getI8(paramInt2 + i3) == 47) || (i3 >= j))
/*     */                 break;
/*     */             }
/*     */             break label494;
/* 232 */             i6 = i3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label494:
/*     */           
/*     */ 
/*     */ 
/* 241 */           i7 = paramInt1 + n;
/* 242 */           if ((MainMemory.getI8(i7) == 47) || (i1 == 0))
/*     */           {
/*     */ 
/*     */ 
/* 246 */             i3 = n;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 253 */             i3 = n + 1;
/* 254 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 261 */               i5 = i3 + i4;
/* 262 */               i4 += 1;
/* 263 */               if ((MainMemory.getI8(paramInt1 + i5) == 47) || (i5 >= i))
/*     */                 break;
/*     */             }
/*     */             break label595;
/* 267 */             i3 = i5;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label595:
/*     */           
/*     */ 
/*     */ 
/* 276 */           if (i6 != i3) {
/*     */             break label644;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */           if (SystemLibrary.strncmp(i2, i7, i6 - n) == 0) {
/* 287 */             n = i3;
/*     */           }
/*     */           else
/*     */           {
/*     */             label644:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */             if (i1 == 0) {
/*     */               break label747;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */             i8 = i - n;
/* 310 */             i6 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 317 */               if (MainMemory.getI8(paramInt1 + (n + i6)) != 47) {
/*     */                 break label721;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */               MainMemory.setI32(paramInt3 + SystemLibrary.strlen(paramInt3), 3092014);
/*     */               
/*     */ 
/*     */               label721:
/*     */               
/*     */ 
/* 333 */               i6 += 1;
/* 334 */               if (i6 == i8) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label747:
/*     */             
/*     */ 
/*     */ 
/* 345 */             SystemLibrary.strcat(paramInt3, i2);
/*     */             
/* 347 */             i6 = k;
/* 348 */             i8 = 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */           k = n + 1;
/* 358 */           n = i6 + 1;
/* 359 */           if ((i8 != 0) || (k >= i) || (n >= j)) {
/*     */             break;
/*     */           }
/* 362 */           i6 = k;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label811:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 377 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_url2relurl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */