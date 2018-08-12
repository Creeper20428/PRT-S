/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class ffhdr2str
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3400;
/*  16 */   public static final Function _instance = new ffhdr2str();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffhdr2str() { super("ffhdr2str", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*     */     
/*     */ 
/*  59 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(162);
/*  64 */       j = MainMemory.alloc(72);
/*  65 */       MainMemory.setI32(paramInt3, 0);
/*  66 */       n = MainMemory.getI32(paramInt4);
/*  67 */       if (n <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         i3 = MainMemory.getI32(paramInt1);
/*  78 */         k = paramInt1 + 4;
/*  79 */         m = MainMemory.getI32(k);
/*  80 */         i1 = MainMemory.getI32(m + 64);
/*  81 */         if (i3 != i1)
/*     */         {
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
/*  94 */           ffmahd.call(paramInt1, i3 + 1, 0, paramInt4);
/*  95 */           m = MainMemory.getI32(k);
/*  96 */           i1 = MainMemory.getI32(m + 64);
/*  97 */           n = MainMemory.getI32(paramInt4);
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
/*     */ 
/* 109 */         i1 = (int)((MainMemory.getI64(m + 88) - MainMemory.getI64(MainMemory.getI32(m + 84) + (i1 << 3))) / 80L);
/* 110 */         if (n <= 0) {
/*     */           break label217;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label664;
/*     */       
/*     */ 
/*     */ 
/*     */       label217:
/*     */       
/*     */ 
/*     */ 
/* 126 */       i2 = calloc.call(i1 * 80 + 81, 1);
/* 127 */       MainMemory.setI32(paramInt2, i2);
/* 128 */       if (i2 != 0) {
/*     */         break label277;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */       MainMemory.setI32(paramInt4, 113);
/* 139 */       ffxmsg.call(5, 127264);
/*     */       
/*     */ 
/*     */       break label664;
/*     */       
/*     */       label277:
/*     */       
/* 146 */       if (i1 >= 1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 166 */           n = i3 + 2;
/* 167 */           i3 += 1;
/* 168 */           ffgrec.call(paramInt1, i3, i, paramInt4);
/* 169 */           SystemLibrary.memcpy(i + SystemLibrary.strlen(i), 143904, 81, 1);
/* 170 */           MainMemory.setI8(j, (byte)0);
/* 171 */           SystemLibrary.strncat(j, i, 8);
/* 172 */           i4 = MainMemory.getI8(j);
/* 173 */           switch (i4)
/*     */           {
/*     */           case 67: 
/*     */             break;
/*     */           case 72: 
/*     */             break label496;
/*     */             break;
/*     */           case 32: 
/*     */             break label536;
/*     */             break;
/*     */           }
/*     */           
/* 185 */           if (SystemLibrary.strcmp(44000, j) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */             switch (i4)
/*     */             {
/*     */             case 72: 
/*     */               break;
/*     */             case 32: 
/*     */               break label536;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             label496:
/* 207 */             if (SystemLibrary.strcmp(44032, j) != 0)
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
/* 218 */               if (i4 != 32) {
/*     */                 break label556;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label536:
/*     */               
/*     */ 
/*     */ 
/* 228 */               if (SystemLibrary.strcmp(43584, j) != 0)
/*     */               {
/*     */                 label556:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */                 SystemLibrary.strcpy(i2, i);
/* 240 */                 i2 += 80;
/* 241 */                 MainMemory.setI32(paramInt3, MainMemory.getI32(paramInt3) + 1);
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 249 */           if (n > i1) {
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
/*     */ 
/*     */ 
/*     */ 
/* 263 */       SystemLibrary.memcpy(i2, 144000, 81, 1);
/* 264 */       i2 += 80;
/* 265 */       MainMemory.setI32(paramInt3, MainMemory.getI32(paramInt3) + 1);
/* 266 */       MainMemory.setI8(i2, (byte)0);
/* 267 */       MainMemory.setI32(paramInt2, realloc.call(MainMemory.getI32(paramInt2), MainMemory.getI32(paramInt3) * 80 | 0x1));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label664:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffhdr2str.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */