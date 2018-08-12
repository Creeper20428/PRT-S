/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffxmsg extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3213;
/*  11 */   public static final Function _instance = new ffxmsg();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffxmsg() { super("ffxmsg", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       switch (paramInt1) {
/*     */       case 1: 
/*     */         break label1088;
/*     */         break;
/*     */       case 2: 
/*     */         break label1006;
/*     */         break;
/*     */       case 3: 
/*     */         break label950;
/*     */         break;
/*     */       case 4: 
/*     */         break label760;
/*     */         break;
/*     */       case 5:  break label391;
/*     */         break; case 6:  break; }
/*  62 */       paramInt1 = MainMemory.getI32Aligned(459348);
/*  63 */       if (paramInt1 != 25)
/*     */       {
/*     */ 
/*     */ 
/*  67 */         k = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  74 */         paramInt2 = MainMemory.getI32Aligned(470624);
/*  75 */         MainMemory.setI8(paramInt2, (byte)0);
/*  76 */         paramInt1 += -1;
/*  77 */         MainMemory.setI32Aligned(459348, paramInt1);
/*  78 */         if (paramInt1 <= 0) {
/*     */           break label240;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         k = paramInt1 > 1 ? paramInt1 : 1;
/*  89 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  96 */           n = m + 1;
/*  97 */           MainMemory.setI32(470624 + (m << 2), MainMemory.getI32(470624 + (n << 2)));
/*  98 */           if (n == k) {
/*     */             break;
/*     */           }
/*     */           
/* 102 */           m = n;
/*     */         }
/*     */         
/*     */ 
/*     */         label240:
/*     */         
/*     */ 
/* 109 */         MainMemory.setI32(470624 + (paramInt1 << 2), paramInt2);
/*     */         
/*     */ 
/*     */         break label360;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 117 */         if (k >= 25) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         paramInt2 = 494336 + k * 81;
/* 128 */         if (MainMemory.getI8(paramInt2) != 0) {
/*     */           break label329;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         MainMemory.setI32(470624 + (paramInt1 << 2), paramInt2);
/*     */         
/*     */ 
/*     */         break label360;
/*     */         
/*     */         label329:
/*     */         
/* 145 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 151 */       paramInt2 = MainMemory.getI32(470624 + (paramInt1 << 2));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label360:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 161 */       MainMemory.setI8(paramInt2, (byte)27);
/* 162 */       MainMemory.setI8(paramInt2 + 1, (byte)0);
/* 163 */       MainMemory.setI32Aligned(459348, paramInt1 + 1);
/*     */       
/*     */ 
/*     */       break label1171;
/*     */       
/*     */       label391:
/*     */       
/* 170 */       MainMemory.setI32Aligned(458828, paramInt2);
/* 171 */       if (MainMemory.getI8(paramInt2) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         paramInt1 = MainMemory.getI32Aligned(459348);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 191 */           if (paramInt1 != 25)
/*     */           {
/*     */ 
/*     */ 
/* 195 */             k = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 202 */             j = MainMemory.getI32Aligned(470624);
/* 203 */             MainMemory.setI8(j, (byte)0);
/* 204 */             paramInt1 += -1;
/* 205 */             MainMemory.setI32Aligned(459348, paramInt1);
/* 206 */             if (paramInt1 <= 0) {
/*     */               break label555;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */             k = paramInt1 > 1 ? paramInt1 : 1;
/* 217 */             m = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 224 */               n = m + 1;
/* 225 */               MainMemory.setI32(470624 + (m << 2), MainMemory.getI32(470624 + (n << 2)));
/* 226 */               if (n == k) {
/*     */                 break;
/*     */               }
/*     */               
/* 230 */               m = n;
/*     */             }
/*     */             
/*     */ 
/*     */             label555:
/*     */             
/*     */ 
/* 237 */             MainMemory.setI32(470624 + (paramInt1 << 2), j);
/*     */             
/*     */             break label675;
/*     */           }
/*     */           
/*     */           for (;;)
/*     */           {
/* 244 */             if (k >= 25) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */             j = 494336 + k * 81;
/* 255 */             if (MainMemory.getI8(j) != 0) {
/*     */               break label644;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */             MainMemory.setI32(470624 + (paramInt1 << 2), j);
/*     */             
/*     */             break label675;
/*     */             
/*     */             label644:
/*     */             
/* 271 */             k += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 277 */           j = MainMemory.getI32(470624 + (paramInt1 << 2));
/*     */           
/*     */ 
/*     */ 
/*     */           label675:
/*     */           
/*     */ 
/*     */ 
/* 285 */           SystemLibrary.strncat(j, paramInt2, 80);
/* 286 */           paramInt1 = MainMemory.getI32Aligned(459348) + 1;
/* 287 */           MainMemory.setI32Aligned(459348, paramInt1);
/* 288 */           paramInt2 = MainMemory.getI32Aligned(458828);
/* 289 */           k = SystemLibrary.strlen(paramInt2);
/* 290 */           paramInt2 += (com.emt.proteus.lib.api.MathUtils.ugt(k, 80) ? 80 : k);
/* 291 */           MainMemory.setI32Aligned(458828, paramInt2);
/* 292 */           if (MainMemory.getI8(paramInt2) == 0) { break label1166;
/* 293 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label760:
/*     */         
/*     */ 
/*     */ 
/* 303 */         paramInt1 = MainMemory.getI32Aligned(459348);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 311 */           if (paramInt1 <= 0) {
/*     */             break label935;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */           SystemLibrary.strcpy(paramInt2, MainMemory.getI32Aligned(470624));
/* 322 */           MainMemory.setI8(MainMemory.getI32Aligned(470624), (byte)0);
/* 323 */           paramInt1 = MainMemory.getI32Aligned(459348) + -1;
/* 324 */           MainMemory.setI32Aligned(459348, paramInt1);
/* 325 */           if (paramInt1 <= 0) {
/*     */             break label908;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */           k = paramInt1 > 1 ? paramInt1 : 1;
/* 336 */           m = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 343 */             n = m + 1;
/* 344 */             MainMemory.setI32(470624 + (m << 2), MainMemory.getI32(470624 + (n << 2)));
/* 345 */             if (n == k) {
/*     */               break;
/*     */             }
/*     */             
/* 349 */             m = n;
/*     */           }
/*     */           
/*     */ 
/*     */           label908:
/*     */           
/*     */ 
/* 356 */           if (MainMemory.getI8(paramInt2) != 27) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */         break label935;
/*     */         
/*     */         break label1166;
/*     */         
/*     */         label935:
/* 366 */         MainMemory.setI8(paramInt2, (byte)0);
/*     */         
/*     */ 
/*     */         break label1171;
/*     */         
/*     */         label950:
/*     */         
/* 373 */         paramInt1 = MainMemory.getI32Aligned(459348);
/* 374 */         if (paramInt1 <= 0) {
/*     */           break label1166;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 384 */         paramInt1 += -1;
/* 385 */         MainMemory.setI32Aligned(459348, paramInt1);
/* 386 */         MainMemory.setI8(MainMemory.getI32(470624 + (paramInt1 << 2)), (byte)0);
/*     */         
/*     */ 
/*     */         break label1171;
/*     */         
/*     */         label1006:
/*     */         
/* 393 */         paramInt1 = MainMemory.getI32Aligned(459348);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 401 */           if (paramInt1 <= 0) {
/*     */             break label1166;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */           paramInt1 += -1;
/* 412 */           MainMemory.setI32Aligned(459348, paramInt1);
/* 413 */           paramInt2 = MainMemory.getI32(470624 + (paramInt1 << 2));
/* 414 */           i = MainMemory.getI8(paramInt2);
/* 415 */           MainMemory.setI8(paramInt2, (byte)0);
/* 416 */           if (i == 27) { break label1166;
/* 417 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1088:
/*     */         
/*     */ 
/* 426 */         paramInt1 = MainMemory.getI32Aligned(459348);
/* 427 */         if (paramInt1 > 0) {
/* 428 */           k = 0;
/*     */         } else {
/*     */           break label1150;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 439 */           MainMemory.setI8(MainMemory.getI32(470624 + (k << 2)), (byte)0);
/* 440 */           k += 1;
/* 441 */         } while (k < paramInt1);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1150:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 452 */         MainMemory.setI32Aligned(459348, 0);
/*     */         
/*     */ 
/*     */         break label1171;
/*     */       }
/*     */       
/*     */ 
/*     */       label1166:
/*     */       
/*     */ 
/*     */       label1171:
/*     */       
/* 464 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffxmsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */