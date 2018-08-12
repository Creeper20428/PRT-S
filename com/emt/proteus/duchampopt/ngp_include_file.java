/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class ngp_include_file extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3448;
/*  13 */   public static final Function _instance = new ngp_include_file();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ngp_include_file() { super("ngp_include_file", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*     */     
/*     */ 
/*  44 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  48 */       j = MainMemory.alloc(10000);
/*  49 */       if (paramInt == 0) {
/*  50 */         k = 362;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  60 */         k = MainMemory.getI32Aligned(467192);
/*  61 */         if (k > 9) {
/*  62 */           k = 365;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  72 */           m = SystemLibrary.fopen(paramInt, 14016);
/*  73 */           MainMemory.setI32(470464 + (k << 2), m);
/*  74 */           if (m != 0) {
/*     */             break label525;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */           i1 = SystemLibrary.getenv(65088);
/*  85 */           if (i1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */             SystemLibrary.strncpy(j, i1, 9999);
/*  96 */             MainMemory.setI8(j + 9999, (byte)0);
/*  97 */             i1 = SystemLibrary.strtok(j, 13632);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */             while (i1 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */               k = SystemLibrary.strlen(paramInt);
/* 116 */               n = com.emt.proteus.runtime.library.c.malloc.call(k + 2 + SystemLibrary.strlen(i1));
/* 117 */               if (n == 0) {
/* 118 */                 k = 360;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label513;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/* 128 */               SystemLibrary.strcpy(n, i1);
/* 129 */               MainMemory.setI16(n + SystemLibrary.strlen(n), (short)47);
/* 130 */               SystemLibrary.strcat(n, paramInt);
/* 131 */               k = MainMemory.getI32Aligned(467192);
/* 132 */               MainMemory.setI32(470464 + (k << 2), SystemLibrary.fopen(n, 14016));
/* 133 */               free.call(n);
/* 134 */               if (MainMemory.getI32(470464 + (MainMemory.getI32Aligned(467192) << 2)) != 0) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */               i1 = SystemLibrary.strtok(0, 13632);
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 150 */           k = MainMemory.getI32Aligned(467192);
/* 151 */           if (MainMemory.getI32(470464 + (k << 2)) != 0) {
/*     */             break label536;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */           if (MainMemory.getI8(paramInt) == 47) {
/* 163 */             k = 366;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 173 */           else if (MainMemory.getI8(483072) == 0) {
/* 174 */             k = 366;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 184 */             k = SystemLibrary.strlen(paramInt);
/* 185 */             i1 = com.emt.proteus.runtime.library.c.malloc.call(k + 1 + SystemLibrary.strlen(483072));
/* 186 */             if (i1 == 0) {
/* 187 */               k = 360;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 197 */               SystemLibrary.strcpy(i1, 483072);
/* 198 */               SystemLibrary.strcat(i1, paramInt);
/* 199 */               k = MainMemory.getI32Aligned(467192);
/* 200 */               MainMemory.setI32(470464 + (k << 2), SystemLibrary.fopen(i1, 14016));
/* 201 */               free.call(i1);
/* 202 */               k = MainMemory.getI32Aligned(467192);
/* 203 */               if (MainMemory.getI32(470464 + (k << 2)) == 0) {
/* 204 */                 k = 366;
/*     */               } else {
/*     */                 break label536;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label513:
/*     */       
/* 216 */       i = k;
/*     */       
/*     */ 
/*     */       break label551;
/*     */       
/*     */       label525:
/*     */       
/* 223 */       k = MainMemory.getI32Aligned(467192);
/*     */       
/*     */ 
/*     */ 
/*     */       label536:
/*     */       
/*     */ 
/*     */ 
/* 231 */       MainMemory.setI32Aligned(467192, k + 1);
/* 232 */       i = 0;
/*     */       
/*     */ 
/*     */       label551:
/*     */       
/*     */ 
/* 238 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 243 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_include_file.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */