/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class ffimport_file extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2988;
/*  15 */   public static final Function _instance = new ffimport_file();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffimport_file() { super("ffimport_file", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  36 */     int m = call(i, j, k);
/*  37 */     paramFrame.setI32(paramInt1, m);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*     */     
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*     */     
/*     */ 
/*  55 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(256);
/*  60 */       i3 = MainMemory.getI32(paramInt3);
/*  61 */       if (i3 <= 0) {
/*     */         break label76;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */       i = i3;
/*     */       
/*     */ 
/*     */       break label686;
/*     */       
/*     */       label76:
/*     */       
/*  78 */       i4 = com.emt.proteus.runtime.library.c.malloc.call(1024);
/*  79 */       if (i4 != 0) {
/*     */         break label127;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       ffxmsg.call(5, 121376);
/*  90 */       MainMemory.setI32(paramInt3, 113);
/*  91 */       i = 113;
/*     */       
/*     */ 
/*     */       break label686;
/*     */       
/*     */       label127:
/*     */       
/*  98 */       MainMemory.setI8(i4, (byte)0);
/*  99 */       k = SystemLibrary.fopen(paramInt1, 14016);
/* 100 */       if (k != 0) {
/*     */         break label209;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       SystemLibrary.sprintf(j, 75968, new Object[] { Integer.valueOf(paramInt1) });
/* 111 */       ffxmsg.call(5, j);
/* 112 */       free.call(i4);
/* 113 */       MainMemory.setI32(paramInt3, 104);
/* 114 */       i = 104;
/*     */       
/*     */ 
/*     */       break label686;
/*     */       
/*     */       label209:
/*     */       
/* 121 */       paramInt1 = j + 1;
/* 122 */       i2 = 1024;
/* 123 */       i3 = 0;
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
/*     */       for (;;)
/*     */       {
/* 138 */         if (SystemLibrary.fgets(j, 256, k) == 0) {
/* 139 */           paramInt1 = i4;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 149 */           n = SystemLibrary.strlen(j);
/* 150 */           if (n <= 1) {
/*     */             break label326;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */           if (MainMemory.getI8(j) != 47) {
/*     */             break label326;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */           if (MainMemory.getI8(paramInt1) == 47) {
/*     */             continue;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label326:
/*     */           
/*     */ 
/*     */ 
/* 180 */           if (n <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 185 */             i1 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 192 */             i1 = n + -1;
/* 193 */             m = j + i1;
/* 194 */             switch (MainMemory.getI8(m)) {
/*     */             case 10: 
/*     */               break;
/*     */             case 13: 
/*     */               break;
/*     */             default: 
/* 200 */               i1 = 0;
/* 201 */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 208 */             MainMemory.setI8(m, (byte)0);
/* 209 */             if (i1 <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 213 */               n = i1;
/* 214 */               i1 = 1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 221 */               n += -2;
/* 222 */               m = j + n;
/* 223 */               switch (MainMemory.getI8(m)) {
/*     */               case 10: 
/*     */                 break;
/*     */               case 13: 
/*     */                 break;
/* 228 */               default:  n = i1;
/* 229 */                 i1 = 1;
/* 230 */                 break;
/*     */               }
/*     */               
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 237 */               MainMemory.setI8(m, (byte)0);
/*     */               
/* 239 */               i1 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */           if (i3 + 3 + n < i2) {
/*     */             break label627;
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
/* 259 */           i2 += 256;
/* 260 */           i4 = realloc.call(i4, i2);
/* 261 */           if (i4 != 0) {
/*     */             break label627;
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
/* 273 */           ffxmsg.call(5, 121376);
/* 274 */           MainMemory.setI32(paramInt3, 113);
/* 275 */           paramInt1 = i4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */         SystemLibrary.fclose(k);
/* 283 */         MainMemory.setI32(paramInt2, paramInt1);
/* 284 */         i = MainMemory.getI32(paramInt3);
/* 285 */         break;
/*     */         
/*     */ 
/*     */ 
/*     */         label627:
/*     */         
/*     */ 
/*     */ 
/* 293 */         SystemLibrary.strcpy(i4 + i3, j);
/* 294 */         i3 = n + i3;
/* 295 */         if (i1 != 0)
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
/* 308 */           MainMemory.setI16(i4 + i3, (short)32);
/* 309 */           i3 += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label686:
/*     */       
/* 316 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 321 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffimport_file.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */