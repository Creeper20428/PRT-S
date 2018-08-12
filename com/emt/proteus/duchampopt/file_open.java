/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class file_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3040;
/*  14 */   public static final Function _instance = new file_open();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public file_open() { super("file_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  35 */     int m = call(i, j, k);
/*  36 */     paramFrame.setI32(paramInt1, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     int i = 0;
/*     */     
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     long l = 0L;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*     */     
/*     */ 
/*  55 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(4);
/*  60 */       k = MainMemory.alloc(2880);
/*  61 */       if (MainMemory.getI8(487168) != 0) {
/*     */         break label198;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */       MainMemory.setI32(paramInt3, -1);
/*  72 */       i3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  79 */         if (i3 >= 300) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         if (MainMemory.getI32(503808 + (i3 << 4)) != 0) {
/*     */           break label169;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         MainMemory.setI32(paramInt3, i3);
/* 100 */         if (i3 == -1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         paramInt2 = file_openfile.call(paramInt1, paramInt2, j);
/*     */         
/*     */         break label376;
/*     */         
/*     */         label169:
/*     */         
/* 116 */         i3 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 122 */       i = 103;
/*     */       
/*     */ 
/*     */       break label684;
/*     */       
/*     */       label198:
/*     */       
/* 129 */       i3 = file_openfile.call(paramInt1, 0, j);
/* 130 */       if (i3 != 0) {
/*     */         break label670;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       i3 = file_create.call(487168, paramInt3);
/* 141 */       if (i3 != 0) {
/*     */         break label639;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       m = MainMemory.getI32(j);
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 157 */         i3 = SystemLibrary.fread(k, 1, 2880, m);
/* 158 */         if (i3 != 0) {
/*     */           break label436;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */         SystemLibrary.fclose(m);
/* 169 */         i3 = MainMemory.getI32(paramInt3);
/* 170 */         i4 = 503808 + (i3 << 4);
/* 171 */         if (SystemLibrary.fclose(MainMemory.getI32(i4)) != 0) {
/*     */           break label350;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         MainMemory.setI32(i4, 0);
/*     */         
/*     */ 
/*     */         label350:
/*     */         
/*     */ 
/* 187 */         MainMemory.setI32(paramInt3, i3);
/* 188 */         paramInt2 = file_openfile.call(487168, paramInt2, j);
/* 189 */         MainMemory.setI8(487168, (byte)0);
/*     */         
/*     */ 
/*     */ 
/*     */         label376:
/*     */         
/*     */ 
/*     */ 
/* 197 */         i3 = MainMemory.getI32(paramInt3);
/* 198 */         MainMemory.setI32(503808 + (i3 << 4), MainMemory.getI32(j));
/* 199 */         MainMemory.setI64(503808 + (i3 << 4) + 4, 0L);
/* 200 */         MainMemory.setI32(503808 + (i3 << 4) + 12, 0);
/* 201 */         i = paramInt2;
/*     */         
/*     */ 
/*     */         break label684;
/*     */         
/*     */         label436:
/*     */         
/* 208 */         n = MainMemory.getI32(paramInt3);
/* 209 */         i1 = 503808 + (n << 4) + 12;
/* 210 */         if (MainMemory.getI32(i1) != 1) {
/*     */           break label541;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         i2 = 503808 + (n << 4) + 4;
/* 221 */         l = MainMemory.getI64(i2);
/* 222 */         if (SystemLibrary.fseek(MainMemory.getI32(503808 + (n << 4)), l, 0) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 226 */           paramInt2 = 116;
/* 227 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 233 */         MainMemory.setI64(i2, l);
/*     */         
/*     */ 
/*     */         label541:
/*     */         
/*     */ 
/* 239 */         if (SystemLibrary.fwrite(k, 1, i3, MainMemory.getI32(503808 + (n << 4))) != i3)
/*     */         {
/*     */ 
/*     */ 
/* 243 */           paramInt2 = 106;
/* 244 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 250 */         i2 = 503808 + (n << 4) + 4;
/* 251 */         MainMemory.setI64(i2, MainMemory.getI64(i2) + i3);
/* 252 */         MainMemory.setI32(i1, 2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 258 */       MainMemory.setI8(487168, (byte)0);
/* 259 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label684;
/*     */       
/*     */       label639:
/*     */       
/* 266 */       ffxmsg.call(5, 119968);
/* 267 */       ffxmsg.call(5, 487168);
/* 268 */       MainMemory.setI8(487168, (byte)0);
/* 269 */       i = i3;
/*     */       
/*     */ 
/*     */       break label684;
/*     */       
/*     */       label670:
/*     */       
/* 276 */       MainMemory.setI8(487168, (byte)0);
/* 277 */       i = i3;
/*     */       
/*     */ 
/*     */       label684:
/*     */       
/*     */ 
/* 283 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 288 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */