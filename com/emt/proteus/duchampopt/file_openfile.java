/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class file_openfile extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3036;
/*  12 */   public static final Function _instance = new file_openfile();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public file_openfile() { super("file_openfile", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     byte b = 0;
/*  49 */     int i3 = 0;
/*     */     
/*     */ 
/*  52 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       j = MainMemory.alloc(4);
/*  57 */       k = MainMemory.alloc(1024);
/*  58 */       m = MainMemory.alloc(80);
/*  59 */       if (paramInt2 != 1) {
/*     */         break label87;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       MainMemory.setI32(j, 6433650);
/*     */       
/*     */       break label102;
/*     */       
/*     */       label87:
/*  74 */       SystemLibrary.memcpy(j, 15360, 3, 1);
/*     */       
/*     */ 
/*     */       label102:
/*     */       
/*     */ 
/*  80 */       if (MainMemory.getI8(paramInt1) != 126) {
/*     */         break label467;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       i2 = paramInt1 + 1;
/*  91 */       if (MainMemory.getI8(i2) != 47)
/*     */       {
/*     */ 
/*     */ 
/*  95 */         paramInt2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 102 */         n = SystemLibrary.getenv(21248);
/* 103 */         if (n != 0) {
/*     */           break label220;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         if (MathUtils.ugt(SystemLibrary.strlen(paramInt1), 1023)) {
/*     */           break label393;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         SystemLibrary.strcpy(k, paramInt1);
/*     */         
/*     */         break label426;
/*     */         
/*     */         label220:
/* 128 */         paramInt2 = SystemLibrary.strlen(n);
/* 129 */         if (MathUtils.ugt(SystemLibrary.strlen(i2) + paramInt2, 1023)) {
/*     */           break label393;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         SystemLibrary.strcpy(k, n);
/* 140 */         SystemLibrary.strcat(k, i2);
/*     */         
/*     */         break label426;
/*     */       }
/*     */       for (;;)
/*     */       {
/* 146 */         i1 = paramInt2 + 1;
/* 147 */         i2 = paramInt1 + i1;
/* 148 */         b = MainMemory.getI8(i2);
/* 149 */         switch (b)
/*     */         {
/*     */         case 0: 
/*     */           break;
/*     */         case 47: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 161 */         MainMemory.setI8(m + paramInt2, (byte)0);
/* 162 */         paramInt1 = MainMemory.getI32(getpwnam.call(m) + 20);
/* 163 */         paramInt2 = SystemLibrary.strlen(paramInt1);
/* 164 */         if (!MathUtils.ugt(SystemLibrary.strlen(i2) + paramInt2, 1023)) {
/*     */           break label406;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label393:
/*     */         
/*     */ 
/*     */ 
/* 174 */         i = 104;
/*     */         
/*     */ 
/*     */         break label503;
/*     */         
/*     */         label406:
/*     */         
/* 181 */         SystemLibrary.strcpy(k, paramInt1);
/* 182 */         SystemLibrary.strcat(k, i2);
/*     */         
/*     */ 
/*     */         label426:
/*     */         
/*     */ 
/* 188 */         i3 = SystemLibrary.fopen(k, j);
/*     */         
/* 190 */         break;
/*     */         
/*     */ 
/*     */ 
/* 194 */         MainMemory.setI8(m + paramInt2, b);
/* 195 */         paramInt2 = i1;
/*     */       }
/*     */       
/*     */       label467:
/*     */       
/* 200 */       i3 = SystemLibrary.fopen(paramInt1, j);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */       MainMemory.setI32(paramInt3, i3);
/* 209 */       i = i3 == 0 ? 104 : 0;
/*     */       
/*     */ 
/*     */       label503:
/*     */       
/*     */ 
/* 215 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 220 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_openfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */