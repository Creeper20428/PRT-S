/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class file_compress_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3041;
/*  16 */   public static final Function _instance = new file_compress_open();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public file_compress_open() { super("file_compress_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = call(i, j, k);
/*  38 */     paramFrame.setI32(paramInt1, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*     */     
/*     */ 
/*  54 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       j = MainMemory.alloc(4);
/*  59 */       k = MainMemory.alloc(4);
/*  60 */       m = file_openfile.call(paramInt1, 0, j);
/*  61 */       MainMemory.setI32(k, m);
/*  62 */       if (m != 0) {
/*     */         break label368;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       if (MainMemory.getI8(487168) != 33) {
/*     */         break label114;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       remove.call(487169);
/*  83 */       n = 487169;
/*     */       
/*     */       break label146;
/*     */       
/*     */       label114:
/*  88 */       i1 = SystemLibrary.fopen(487168, 14016);
/*  89 */       if (i1 == 0) {
/*  90 */         n = 487168;
/*     */       } else {
/*     */         break label331;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label146:
/*     */       
/*     */ 
/*     */ 
/* 101 */       i1 = SystemLibrary.fopen(n, 17984);
/* 102 */       if (i1 != 0) {
/*     */         break label205;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */       ffxmsg.call(5, 126432);
/* 113 */       ffxmsg.call(5, 487168);
/* 114 */       MainMemory.setI8(487168, (byte)0);
/* 115 */       i = 105;
/*     */       
/*     */ 
/*     */       break label387;
/*     */       
/*     */       label205:
/*     */       
/* 122 */       i2 = MainMemory.getI32(j);
/* 123 */       uncompress2file.call(i2, i1, k);
/* 124 */       SystemLibrary.fclose(i2);
/* 125 */       SystemLibrary.fclose(i1);
/* 126 */       m = MainMemory.getI32(k);
/* 127 */       if (m != 0) {
/*     */         break label289;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       SystemLibrary.strcpy(paramInt1, n);
/* 138 */       MainMemory.setI8(487168, (byte)0);
/* 139 */       i = file_open.call(paramInt1, paramInt2, paramInt3);
/*     */       
/*     */ 
/*     */       break label387;
/*     */       
/*     */       label289:
/*     */       
/* 146 */       ffxmsg.call(5, 127968);
/* 147 */       ffxmsg.call(5, paramInt1);
/* 148 */       ffxmsg.call(5, 66720);
/* 149 */       ffxmsg.call(5, 487168);
/* 150 */       MainMemory.setI8(487168, (byte)0);
/* 151 */       i = m;
/*     */       
/*     */ 
/*     */       break label387;
/*     */       
/*     */       label331:
/*     */       
/* 158 */       ffxmsg.call(5, 123488);
/* 159 */       ffxmsg.call(5, 487168);
/* 160 */       SystemLibrary.fclose(i1);
/* 161 */       MainMemory.setI8(487168, (byte)0);
/* 162 */       i = 105;
/*     */       
/*     */ 
/*     */       break label387;
/*     */       
/*     */       label368:
/*     */       
/* 169 */       ffxmsg.call(5, 126368);
/* 170 */       ffxmsg.call(5, paramInt1);
/* 171 */       i = m;
/*     */       
/*     */ 
/*     */       label387:
/*     */       
/*     */ 
/* 177 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 182 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_compress_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */