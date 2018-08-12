/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class http_checkfile extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3099;
/*  12 */   public static final Function _instance = new http_checkfile();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public http_checkfile() { super("http_checkfile", 3, false); }
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
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*     */     
/*     */ 
/*  48 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.alloc(1200);
/*  53 */       k = MainMemory.alloc(4);
/*  54 */       m = MainMemory.alloc(1200);
/*  55 */       n = MainMemory.alloc(4);
/*  56 */       MainMemory.setI64(paramInt1, 13281251946689640L);
/*  57 */       if (MainMemory.getI8(paramInt3) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */         if (SystemLibrary.strncmp(paramInt3, 40448, 7) != 0) {
/*     */           break label115;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         SystemLibrary.strcpy(489728, paramInt3 + 7);
/*     */         
/*     */         break label127;
/*     */         
/*     */         label115:
/*  82 */         SystemLibrary.strcpy(489728, paramInt3);
/*     */         
/*     */ 
/*     */         label127:
/*     */         
/*     */ 
/*  88 */         if (SystemLibrary.strncmp(paramInt3, 20608, 4) != 0) {
/*     */           break label172;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         SystemLibrary.memcpy(paramInt1, 49632, 11, 1);
/*  99 */         i = 0;
/*     */         
/*     */ 
/*     */         break label717;
/*     */         
/*     */         label172:
/*     */         
/* 106 */         if (SystemLibrary.strchr(paramInt2, 63) != 0) {
/*     */           break label701;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         if (F274069.call(paramInt2, k, m, n) != 0) {
/*     */           break label384;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         SystemLibrary.fclose(MainMemory.getI32(k));
/* 127 */         if (SystemLibrary.strstr(paramInt2, 17728) != 0) {
/*     */           break label296;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         if (SystemLibrary.strstr(paramInt2, 15392) != 0) {
/*     */           break label296;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         SystemLibrary.memcpy(paramInt1, 51424, 12, 1);
/* 148 */         i = 0;
/*     */         
/*     */ 
/*     */         break label717;
/*     */         
/*     */         label296:
/*     */         
/* 155 */         if (SystemLibrary.strstr(paramInt3, 17728) != 0) {
/*     */           break label363;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         if (SystemLibrary.strstr(paramInt3, 15392) != 0) {
/*     */           break label363;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */         SystemLibrary.memcpy(paramInt1, 51424, 12, 1);
/* 176 */         i = 0;
/*     */         
/*     */ 
/*     */         break label717;
/*     */         
/*     */         label363:
/*     */         
/* 183 */         SystemLibrary.memcpy(paramInt1, 57184, 16, 1);
/* 184 */         i = 0;
/*     */         
/*     */ 
/*     */         break label717;
/*     */         
/*     */         label384:
/*     */         
/* 191 */         SystemLibrary.strcpy(j, paramInt2);
/* 192 */         MainMemory.setI32(j + SystemLibrary.strlen(j), 8021806);
/* 193 */         if (F274069.call(j, k, m, n) != 0) {
/*     */           break label535;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */         SystemLibrary.fclose(MainMemory.getI32(k));
/* 204 */         SystemLibrary.strcpy(paramInt2, j);
/* 205 */         if (SystemLibrary.strstr(paramInt3, 17728) != 0) {
/*     */           break label514;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */         if (SystemLibrary.strstr(paramInt3, 15392) != 0) {
/*     */           break label514;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */         SystemLibrary.memcpy(paramInt1, 51424, 12, 1);
/* 226 */         i = 0;
/*     */         
/*     */ 
/*     */         break label717;
/*     */         
/*     */         label514:
/*     */         
/* 233 */         SystemLibrary.memcpy(paramInt1, 57184, 16, 1);
/* 234 */         i = 0;
/*     */         
/*     */ 
/*     */         break label717;
/*     */         
/*     */         label535:
/*     */         
/* 241 */         SystemLibrary.strcpy(j, paramInt2);
/* 242 */         SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 15392, 3, 1);
/* 243 */         if (F274069.call(j, k, m, n) != 0) {
/*     */           break label689;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */         SystemLibrary.fclose(MainMemory.getI32(k));
/* 254 */         SystemLibrary.strcpy(paramInt2, j);
/* 255 */         if (SystemLibrary.strstr(paramInt3, 17728) != 0) {
/*     */           break label668;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */         if (SystemLibrary.strstr(paramInt3, 15392) != 0) {
/*     */           break label668;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */         SystemLibrary.memcpy(paramInt1, 51424, 12, 1);
/* 276 */         i = 0;
/*     */         
/*     */ 
/*     */         break label717;
/*     */         
/*     */         label668:
/*     */         
/* 283 */         SystemLibrary.memcpy(paramInt1, 57184, 16, 1);
/* 284 */         i = 0;
/*     */         
/*     */         break label717;
/*     */       }
/*     */       
/*     */       label689:
/*     */       
/* 291 */       i = 0;
/*     */       
/*     */ 
/*     */       break label717;
/*     */       
/*     */       label701:
/*     */       
/* 298 */       SystemLibrary.memcpy(paramInt1, 51424, 12, 1);
/* 299 */       i = 0;
/*     */       
/*     */ 
/*     */       label717:
/*     */       
/*     */ 
/* 305 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 310 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/http_checkfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */