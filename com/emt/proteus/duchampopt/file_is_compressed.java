/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class file_is_compressed extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3038;
/*  12 */   public static final Function _instance = new file_is_compressed();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public file_is_compressed() { super("file_is_compressed", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*     */     
/*     */ 
/*  44 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  48 */       j = MainMemory.alloc(4);
/*  49 */       k = MainMemory.alloc(2);
/*  50 */       m = MainMemory.alloc(1025);
/*  51 */       if (file_openfile.call(paramInt, 0, j) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */         if (com.emt.proteus.lib.api.MathUtils.ugt(SystemLibrary.strlen(paramInt), 1024)) {
/*  62 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label498;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*  72 */         SystemLibrary.strcpy(m, paramInt);
/*  73 */         MainMemory.setI32(paramInt + SystemLibrary.strlen(paramInt), 8021806);
/*  74 */         if (file_openfile.call(paramInt, 0, j) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */           SystemLibrary.strcpy(paramInt, m);
/*  85 */           SystemLibrary.memcpy(paramInt + SystemLibrary.strlen(paramInt), 15392, 3, 1);
/*  86 */           if (file_openfile.call(paramInt, 0, j) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */             SystemLibrary.strcpy(paramInt, m);
/*  97 */             SystemLibrary.memcpy(paramInt + SystemLibrary.strlen(paramInt), 15424, 3, 1);
/*  98 */             if (file_openfile.call(paramInt, 0, j) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */               SystemLibrary.strcpy(paramInt, m);
/* 109 */               SystemLibrary.memcpy(paramInt + SystemLibrary.strlen(paramInt), 21280, 5, 1);
/* 110 */               if (file_openfile.call(paramInt, 0, j) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */                 SystemLibrary.strcpy(paramInt, m);
/* 121 */                 SystemLibrary.memcpy(paramInt + SystemLibrary.strlen(paramInt), 15456, 3, 1);
/* 122 */                 if (file_openfile.call(paramInt, 0, j) != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */                   SystemLibrary.strcpy(paramInt, m);
/* 133 */                   MainMemory.setI32(paramInt + SystemLibrary.strlen(paramInt), 8021805);
/* 134 */                   if (file_openfile.call(paramInt, 0, j) != 0) {
/*     */                     break label511;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 144 */       n = MainMemory.getI32(j);
/* 145 */       i1 = SystemLibrary.fread(k, 1, 2, n) == 2 ? 1 : 0;
/* 146 */       SystemLibrary.fclose(n);
/* 147 */       if (i1 == 0)
/*     */       {
/*     */ 
/*     */ 
/* 151 */         i2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 158 */       else if (SystemLibrary.memcmp(k, 15488, 2) == 0) {
/* 159 */         i2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 169 */       else if (SystemLibrary.memcmp(k, 15520, 2) == 0) {
/* 170 */         i2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 180 */       else if (SystemLibrary.memcmp(k, 15552, 2) == 0) {
/* 181 */         i2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 191 */       else if (SystemLibrary.memcmp(k, 15584, 2) == 0) {
/* 192 */         i2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 202 */         i = SystemLibrary.memcmp(k, 15616, 2) == 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */         break label525;
/*     */       }
/*     */       
/*     */       label498:
/*     */       
/* 210 */       i = i2;
/*     */       
/*     */ 
/*     */       break label525;
/*     */       
/*     */       label511:
/*     */       
/* 217 */       SystemLibrary.strcpy(paramInt, m);
/* 218 */       i = 0;
/*     */       
/*     */ 
/*     */       label525:
/*     */       
/*     */ 
/* 224 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 229 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_is_compressed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */