/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ftp_checkfile extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3097;
/*  12 */   public static final Function _instance = new ftp_checkfile();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ftp_checkfile() { super("ftp_checkfile", 3, false); }
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
/*  54 */       m = MainMemory.alloc(4);
/*  55 */       n = MainMemory.alloc(4);
/*  56 */       SystemLibrary.memcpy(paramInt1, 33216, 7, 1);
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
/*  98 */         SystemLibrary.memcpy(paramInt1, 47872, 10, 1);
/*  99 */         i = 0;
/*     */         
/*     */ 
/*     */         break label701;
/*     */         
/*     */         label172:
/*     */         
/* 106 */         if (F273321.call(paramInt2, k, m, n) != 0) {
/*     */           break label371;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         SystemLibrary.fclose(MainMemory.getI32(k));
/* 117 */         SystemLibrary.fclose(MainMemory.getI32(m));
/* 118 */         if (SystemLibrary.strstr(paramInt2, 17728) != 0) {
/*     */           break label283;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         if (SystemLibrary.strstr(paramInt2, 15392) != 0) {
/*     */           break label283;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         SystemLibrary.memcpy(paramInt1, 49664, 11, 1);
/* 139 */         i = 0;
/*     */         
/*     */ 
/*     */         break label701;
/*     */         
/*     */         label283:
/*     */         
/* 146 */         if (SystemLibrary.strstr(paramInt3, 17728) != 0) {
/*     */           break label350;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */         if (SystemLibrary.strstr(paramInt3, 15392) != 0) {
/*     */           break label350;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         SystemLibrary.memcpy(paramInt1, 49664, 11, 1);
/* 167 */         i = 0;
/*     */         
/*     */ 
/*     */         break label701;
/*     */         
/*     */         label350:
/*     */         
/* 174 */         SystemLibrary.memcpy(paramInt1, 55168, 15, 1);
/* 175 */         i = 0;
/*     */         
/*     */ 
/*     */         break label701;
/*     */         
/*     */         label371:
/*     */         
/* 182 */         SystemLibrary.strcpy(j, paramInt2);
/* 183 */         MainMemory.setI32(j + SystemLibrary.strlen(j), 8021806);
/* 184 */         if (F273321.call(j, k, m, n) != 0) {
/*     */           break label531;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         SystemLibrary.fclose(MainMemory.getI32(k));
/* 195 */         SystemLibrary.fclose(MainMemory.getI32(m));
/* 196 */         SystemLibrary.strcpy(paramInt2, j);
/* 197 */         if (SystemLibrary.strstr(paramInt3, 17728) != 0) {
/*     */           break label510;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */         if (SystemLibrary.strstr(paramInt3, 15392) != 0) {
/*     */           break label510;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */         SystemLibrary.memcpy(paramInt1, 49664, 11, 1);
/* 218 */         i = 0;
/*     */         
/*     */ 
/*     */         break label701;
/*     */         
/*     */         label510:
/*     */         
/* 225 */         SystemLibrary.memcpy(paramInt1, 55168, 15, 1);
/* 226 */         i = 0;
/*     */         
/*     */ 
/*     */         break label701;
/*     */         
/*     */         label531:
/*     */         
/* 233 */         SystemLibrary.strcpy(j, paramInt2);
/* 234 */         SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 15392, 3, 1);
/* 235 */         if (F273321.call(j, k, m, n) != 0) {
/*     */           break label694;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */         SystemLibrary.fclose(MainMemory.getI32(k));
/* 246 */         SystemLibrary.fclose(MainMemory.getI32(m));
/* 247 */         SystemLibrary.strcpy(paramInt2, j);
/* 248 */         if (SystemLibrary.strstr(paramInt3, 17728) != 0) {
/*     */           break label673;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */         if (SystemLibrary.strstr(paramInt3, 15392) != 0) {
/*     */           break label673;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */         SystemLibrary.memcpy(paramInt1, 49664, 11, 1);
/* 269 */         i = 0;
/*     */         
/*     */ 
/*     */         break label701;
/*     */         
/*     */         label673:
/*     */         
/* 276 */         SystemLibrary.memcpy(paramInt1, 55168, 15, 1);
/* 277 */         i = 0;
/*     */         
/*     */         break label701;
/*     */       }
/*     */       
/*     */       label694:
/*     */       
/* 284 */       i = 0;
/*     */       
/*     */ 
/*     */       label701:
/*     */       
/*     */ 
/* 290 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 295 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ftp_checkfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */