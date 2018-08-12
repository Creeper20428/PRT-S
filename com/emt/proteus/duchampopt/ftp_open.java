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
/*     */ 
/*     */ public final class ftp_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3104;
/*  19 */   public static final Function _instance = new ftp_open();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public ftp_open() { super("ftp_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  26 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = call(i, j, k);
/*  41 */     paramFrame.setI32(paramInt1, m);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*     */     
/*     */ 
/*  61 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       j = MainMemory.alloc(4);
/*  66 */       k = MainMemory.alloc(4);
/*  67 */       m = MainMemory.alloc(4);
/*  68 */       n = MainMemory.alloc(1200);
/*  69 */       i1 = MainMemory.alloc(1200);
/*  70 */       MainMemory.setI32Aligned(459480, 0);
/*  71 */       MainMemory.setI32Aligned(459476, 0);
/*  72 */       MainMemory.setI32Aligned(459472, 0);
/*  73 */       if (paramInt2 != 0) {
/*     */         break label1200;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       paramInt2 = SystemLibrary._setjmp(471136);
/*     */       
/*  85 */       if (paramInt2 != 0) {
/*     */         break label1033;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       SystemLibrary.signal(14, 3101);
/*  96 */       if (!MathUtils.ugt(SystemLibrary.strlen(paramInt1), 1196)) {
/*     */         break label190;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       ffxmsg.call(5, 74592);
/* 107 */       ffxmsg.call(5, paramInt1);
/*     */       
/*     */       break label1044;
/*     */       
/*     */       label190:
/* 112 */       alarm.call(180);
/* 113 */       SystemLibrary.strcpy(n, paramInt1);
/* 114 */       if (SystemLibrary.strstr(n, 15392) != 0) {
/*     */         break label432;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       if (SystemLibrary.strstr(n, 17728) != 0) {
/*     */         break label432;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       SystemLibrary.strcpy(n, paramInt1);
/* 135 */       MainMemory.setI32(n + SystemLibrary.strlen(n), 8021806);
/* 136 */       alarm.call(180);
/* 137 */       if (F273321.call(n, j, k, m) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         alarm.call(0);
/* 148 */         SystemLibrary.strcpy(n, paramInt1);
/* 149 */         SystemLibrary.memcpy(n + SystemLibrary.strlen(n), 15392, 3, 1);
/* 150 */         alarm.call(180);
/* 151 */         if (F273321.call(n, j, k, m) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           alarm.call(0);
/* 162 */           SystemLibrary.strcpy(n, paramInt1);
/* 163 */           alarm.call(180);
/* 164 */           if (F273321.call(n, j, k, m) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */             alarm.call(0);
/* 175 */             ffxmsg.call(5, 83104);
/* 176 */             ffxmsg.call(5, n);
/*     */             
/*     */             break label1044;
/*     */             
/*     */             label432:
/* 181 */             alarm.call(180);
/* 182 */             if (F273321.call(paramInt1, j, k, m) != 0) {
/*     */               break label1007;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 192 */       MainMemory.setI32Aligned(459472, MainMemory.getI32Aligned(459472) + 1);
/* 193 */       MainMemory.setI32Aligned(459476, MainMemory.getI32Aligned(459476) + 1);
/* 194 */       if (mem_create.call(paramInt1, paramInt3) != 0) {
/*     */         break label986;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */       MainMemory.setI32Aligned(459480, MainMemory.getI32Aligned(459480) + 1);
/* 205 */       i2 = MainMemory.getI32(j);
/* 206 */       i3 = (byte)SystemLibrary.fgetc(i2);
/* 207 */       SystemLibrary.ungetc(i3, i2);
/* 208 */       if (SystemLibrary.strstr(n, 17728) != 0) {
/*     */         break label704;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */       if ((SystemLibrary.strstr(n, 15392) != 0) || (i3 != 31))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         alarm.call(180);
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 234 */           paramInt2 = SystemLibrary.fread(i1, 1, 1200, i2);
/* 235 */           if (paramInt2 == 0) {
/*     */             break label744;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */           alarm.call(0);
/* 246 */           if (mem_write.call(MainMemory.getI32(paramInt3), i1, paramInt2) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */           alarm.call(180);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 261 */         ffxmsg.call(5, 88928);
/* 262 */         ffxmsg.call(5, paramInt1);
/*     */       }
/*     */       else
/*     */       {
/*     */         label704:
/* 267 */         alarm.call(1800);
/* 268 */         paramInt2 = mem_uncompress2mem.call(paramInt1, i2, MainMemory.getI32(paramInt3));
/* 269 */         alarm.call(0);
/* 270 */         if (paramInt2 != 0) {
/*     */           break label965;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label744:
/*     */         
/*     */ 
/*     */ 
/* 280 */         SystemLibrary.fclose(i2);
/* 281 */         MainMemory.setI32Aligned(459472, MainMemory.getI32Aligned(459472) + -1);
/* 282 */         paramInt2 = MainMemory.getI32(m);
/* 283 */         if (paramInt2 < 0) {
/*     */           break label857;
/*     */         } else {
/* 286 */           i5 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 295 */           if (i5 >= 5) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */           i4 = send.call(paramInt2, 27072 + i5, 5 - i5, 0);
/* 306 */           if (i4 < 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */           i5 = i4 + i5;
/*     */         }
/*     */         
/*     */ 
/*     */         label857:
/*     */         
/* 322 */         SystemLibrary.fclose(MainMemory.getI32(k));
/* 323 */         MainMemory.setI32Aligned(459476, MainMemory.getI32Aligned(459476) + -1);
/* 324 */         SystemLibrary.signal(14, 0);
/* 325 */         alarm.call(0);
/* 326 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 327 */         if (MainMemory.getI64(512000 + paramInt2 * 44 + 32) >= 0L) {
/*     */           break label939;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */         i = 107;
/*     */         
/*     */ 
/*     */         break label1220;
/*     */         
/*     */         label939:
/*     */         
/* 344 */         MainMemory.setI64(512000 + paramInt2 * 44 + 24, 0L);
/* 345 */         i = 0;
/*     */         
/*     */ 
/*     */         break label1220;
/*     */         
/*     */         label965:
/*     */         
/* 352 */         ffxmsg.call(5, 110240);
/* 353 */         ffxmsg.call(5, paramInt1);
/*     */         
/*     */         break label1044;
/*     */         
/*     */         label986:
/* 358 */         ffxmsg.call(5, 125472);
/* 359 */         ffxmsg.call(5, paramInt1);
/*     */         
/*     */         break label1044;
/*     */         
/*     */         label1007:
/* 364 */         alarm.call(0);
/* 365 */         ffxmsg.call(5, 83104);
/* 366 */         ffxmsg.call(5, paramInt1);
/*     */         
/*     */         break label1044;
/*     */         
/*     */         label1033:
/* 371 */         ffxmsg.call(5, 62784);
/*     */       }
/*     */       
/*     */ 
/*     */       label1044:
/*     */       
/* 377 */       alarm.call(0);
/* 378 */       if (MainMemory.getI32Aligned(459476) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */         SystemLibrary.fclose(MainMemory.getI32(k));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 394 */       if (MainMemory.getI32Aligned(459472) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */         SystemLibrary.fclose(MainMemory.getI32(j));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 410 */       if (MainMemory.getI32Aligned(459480) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 420 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 421 */         i6 = 512000 + paramInt2 * 44;
/* 422 */         free.call(MainMemory.getI32(MainMemory.getI32(i6)));
/* 423 */         MainMemory.setI32(i6, 0);
/* 424 */         MainMemory.setI32(512000 + paramInt2 * 44 + 4, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 430 */       SystemLibrary.signal(14, 0);
/* 431 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1220;
/*     */       
/*     */       label1200:
/*     */       
/* 438 */       ffxmsg.call(5, 114336);
/* 439 */       ffxmsg.call(5, 103008);
/* 440 */       i = 104;
/*     */       
/*     */ 
/*     */       label1220:
/*     */       
/*     */ 
/* 446 */       return i;
/*     */     }
/*     */     catch (LongJmpException localLongJmpException)
/*     */     {
/*     */       for (;;) {
/* 451 */         paramInt2 = localLongJmpException.getReturnValue();
/*     */       }
/* 453 */       return i;
/*     */     }
/*     */     finally
/*     */     {
/* 457 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ftp_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */