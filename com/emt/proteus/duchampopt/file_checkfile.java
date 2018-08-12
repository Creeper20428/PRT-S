/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class file_checkfile extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3039;
/*  12 */   public static final Function _instance = new file_checkfile();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public file_checkfile() { super("file_checkfile", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       j = MainMemory.getI8(paramInt3) != 0 ? 1 : 0;
/*  49 */       if (file_is_compressed.call(paramInt2) != 0) {
/*     */         break label97;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */       if (j == 0) {
/*     */         break label85;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       MainMemory.setI8(487168, (byte)0);
/*  70 */       SystemLibrary.strncat(487168, paramInt3, 1024);
/*  71 */       i = 0;
/*     */       
/*     */ 
/*     */       break label262;
/*     */       
/*     */       label85:
/*     */       
/*  78 */       i = 0;
/*     */       
/*     */ 
/*     */       break label262;
/*     */       
/*     */       label97:
/*     */       
/*  85 */       if (j == 0) {
/*     */         break label240;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       if (SystemLibrary.strncmp(paramInt3, 20608, 4) != 0) {
/*     */         break label166;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */       SystemLibrary.memcpy(paramInt1, 55136, 15, 1);
/* 106 */       MainMemory.setI8(487168, (byte)0);
/* 107 */       i = 0;
/*     */       
/*     */ 
/*     */       break label262;
/*     */       
/*     */       label166:
/*     */       
/* 114 */       SystemLibrary.memcpy(paramInt1, 57152, 16, 1);
/* 115 */       if (SystemLibrary.strncmp(paramInt3, 40448, 7) != 0) {
/*     */         break label221;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       SystemLibrary.strcpy(487168, paramInt3 + 7);
/* 126 */       i = 0;
/*     */       
/*     */ 
/*     */       break label262;
/*     */       
/*     */       label221:
/*     */       
/* 133 */       SystemLibrary.strcpy(487168, paramInt3);
/* 134 */       i = 0;
/*     */       
/*     */ 
/*     */       break label262;
/*     */       
/*     */       label240:
/*     */       
/* 141 */       SystemLibrary.memcpy(paramInt1, 51392, 12, 1);
/* 142 */       MainMemory.setI8(487168, (byte)0);
/* 143 */       i = 0;
/*     */       
/*     */ 
/*     */       label262:
/*     */       
/*     */ 
/* 149 */       int k = i; return k;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_checkfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */