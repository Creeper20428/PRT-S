/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.LongJmpException;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ public final class http_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3070;
/*  18 */   public static final Function _instance = new http_open();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public http_open() { super("http_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = call(i, j, k);
/*  40 */     paramFrame.setI32(paramInt1, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*     */     
/*     */ 
/*  58 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       j = MainMemory.alloc(4);
/*  63 */       k = MainMemory.alloc(100);
/*  64 */       m = MainMemory.alloc(1200);
/*  65 */       n = MainMemory.alloc(1200);
/*  66 */       i1 = MainMemory.alloc(1200);
/*  67 */       i2 = MainMemory.alloc(4);
/*  68 */       MainMemory.setI32Aligned(459492, 0);
/*  69 */       MainMemory.setI32Aligned(459480, 0);
/*  70 */       if (paramInt2 != 0) {
/*     */         break label998;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       paramInt2 = SystemLibrary._setjmp(471136);
/*     */       
/*  82 */       if (paramInt2 != 0) {
/*     */         break label982;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       SystemLibrary.signal(14, 3101);
/*  93 */       if (SystemLibrary.strstr(paramInt1, 15392) != 0) {
/*     */         break label426;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       if (SystemLibrary.strstr(paramInt1, 17728) != 0) {
/*     */         break label426;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       if (SystemLibrary.strchr(paramInt1, 63) != 0) {
/*     */         break label426;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       if (!MathUtils.ugt(SystemLibrary.strlen(paramInt1), 1195)) {
/*     */         break label255;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */       ffxmsg.call(5, 90400);
/* 134 */       ffxmsg.call(5, paramInt1);
/*     */       
/*     */       break label1015;
/*     */       
/*     */       label255:
/* 139 */       alarm.call(180);
/* 140 */       SystemLibrary.strcpy(m, paramInt1);
/* 141 */       MainMemory.setI32(m + SystemLibrary.strlen(m), 8021806);
/* 142 */       if (F274069.call(m, j, k, i2) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         alarm.call(0);
/* 153 */         SystemLibrary.strcpy(m, paramInt1);
/* 154 */         SystemLibrary.memcpy(m + SystemLibrary.strlen(m), 15392, 3, 1);
/* 155 */         alarm.call(180);
/* 156 */         if (F274069.call(m, j, k, i2) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */           alarm.call(0);
/* 167 */           alarm.call(180);
/* 168 */           if (F274069.call(paramInt1, j, k, i2) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */             alarm.call(0);
/* 179 */             ffxmsg.call(5, 86816);
/* 180 */             ffxmsg.call(5, paramInt1);
/*     */             
/*     */             break label1015;
/*     */             
/*     */             label426:
/* 185 */             alarm.call(180);
/* 186 */             if (F274069.call(paramInt1, j, k, i2) != 0) {
/*     */               break label956;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 196 */       MainMemory.setI32Aligned(459492, MainMemory.getI32Aligned(459492) + 1);
/* 197 */       if (mem_create.call(paramInt1, paramInt3) != 0) {
/*     */         break label940;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */       MainMemory.setI32Aligned(459480, MainMemory.getI32Aligned(459480) + 1);
/* 208 */       i3 = (byte)SystemLibrary.fgetc(MainMemory.getI32(j));
/* 209 */       SystemLibrary.ungetc(i3, MainMemory.getI32(j));
/* 210 */       if (SystemLibrary.strcmp(k, 35872) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         if (SystemLibrary.strcmp(k, 49888) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */           if (SystemLibrary.strstr(paramInt1, 17728) != 0) {
/*     */             break label780;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */           if ((SystemLibrary.strstr(paramInt1, 15392) != 0) || (i3 != 31))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */             paramInt2 = MainMemory.getI32(i2);
/* 251 */             if (paramInt2 % 2880 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */               SystemLibrary.sprintf(n, 120288, new Object[] { Integer.valueOf(paramInt2) });
/* 262 */               ffxmsg.call(5, n);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 268 */             alarm.call(180);
/*     */             
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 274 */               paramInt2 = SystemLibrary.fread(i1, 1, 1200, MainMemory.getI32(j));
/* 275 */               if (paramInt2 == 0) {
/*     */                 break label823;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */               alarm.call(0);
/* 286 */               if (mem_write.call(MainMemory.getI32(paramInt3), i1, paramInt2) != 0) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */               alarm.call(180);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 301 */             ffxmsg.call(5, 110368);
/* 302 */             ffxmsg.call(5, paramInt1);
/*     */             break label1015;
/*     */           }
/*     */         } }
/*     */       label780:
/* 307 */       alarm.call(1800);
/* 308 */       paramInt2 = mem_uncompress2mem.call(paramInt1, MainMemory.getI32(j), MainMemory.getI32(paramInt3));
/* 309 */       alarm.call(0);
/* 310 */       if (paramInt2 != 0) {
/*     */         break label919;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label823:
/*     */       
/*     */ 
/*     */ 
/* 320 */       SystemLibrary.fclose(MainMemory.getI32(j));
/* 321 */       SystemLibrary.signal(14, 0);
/* 322 */       alarm.call(0);
/* 323 */       paramInt2 = MainMemory.getI32(paramInt3);
/* 324 */       if (MainMemory.getI64(512000 + paramInt2 * 44 + 32) >= 0L) {
/*     */         break label893;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */       i = 107;
/*     */       
/*     */ 
/*     */       break label1134;
/*     */       
/*     */       label893:
/*     */       
/* 341 */       MainMemory.setI64(512000 + paramInt2 * 44 + 24, 0L);
/* 342 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1134;
/*     */       
/*     */       label919:
/*     */       
/* 349 */       ffxmsg.call(5, 112608);
/* 350 */       ffxmsg.call(5, paramInt1);
/*     */       
/*     */       break label1015;
/*     */       
/*     */       label940:
/* 355 */       ffxmsg.call(5, 94368);
/*     */       
/*     */       break label1015;
/*     */       
/*     */       label956:
/* 360 */       alarm.call(0);
/* 361 */       ffxmsg.call(5, 88992);
/* 362 */       ffxmsg.call(5, paramInt1);
/*     */       
/*     */       break label1015;
/*     */       
/*     */       label982:
/* 367 */       ffxmsg.call(5, 62784);
/*     */       
/*     */       break label1015;
/*     */       
/*     */       label998:
/* 372 */       ffxmsg.call(5, 116128);
/* 373 */       ffxmsg.call(5, 110304);
/*     */       
/*     */ 
/*     */       label1015:
/*     */       
/*     */ 
/* 379 */       alarm.call(0);
/* 380 */       if (MainMemory.getI32Aligned(459492) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */         SystemLibrary.fclose(MainMemory.getI32(j));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 396 */       if (MainMemory.getI32Aligned(459480) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 406 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 407 */         i4 = 512000 + paramInt2 * 44;
/* 408 */         free.call(MainMemory.getI32(MainMemory.getI32(i4)));
/* 409 */         MainMemory.setI32(i4, 0);
/* 410 */         MainMemory.setI32(512000 + paramInt2 * 44 + 4, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 416 */       SystemLibrary.signal(14, 0);
/* 417 */       i = 104;
/*     */       
/*     */ 
/*     */       label1134:
/*     */       
/*     */ 
/* 423 */       return i;
/*     */     }
/*     */     catch (LongJmpException localLongJmpException)
/*     */     {
/*     */       for (;;) {
/* 428 */         paramInt2 = localLongJmpException.getReturnValue();
/*     */       }
/* 430 */       return i;
/*     */     }
/*     */     finally
/*     */     {
/* 434 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/http_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */