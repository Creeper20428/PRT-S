/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fftrec extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3233;
/*  12 */   public static final Function _instance = new fftrec();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fftrec() { super("fftrec", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2);
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
/*  30 */     int k = call(i, j);
/*  31 */     paramFrame.setI32(paramInt1, k);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*     */     
/*     */ 
/*  48 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.alloc(81);
/*  53 */       k = MainMemory.getI32(paramInt2);
/*  54 */       if (k <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */         m = SystemLibrary.strlen(paramInt1);
/*  65 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  72 */           i3 = i2 + 8;
/*  73 */           if (!com.emt.proteus.lib.api.MathUtils.ult(i3, m)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */           n = paramInt1 + i3;
/*  84 */           i1 = MainMemory.getI8(n);
/*  85 */           if (!com.emt.proteus.lib.api.MathUtils.ugt((byte)(i1 + -32), (byte)94)) {
/*     */             break label550;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */           SystemLibrary.sprintf(j, 124000, new Object[] { Integer.valueOf(i2 + 9), Integer.valueOf(i1) });
/*  96 */           switch (MainMemory.getI8(n)) {
/*     */           case 0: 
/*     */             break label484;
/*     */             break;
/*     */           case 9: 
/*     */             break label460;
/*     */             break;
/*     */           case 10: 
/*     */             break label436;
/*     */             break;
/*     */           case 11: 
/*     */             break label412;
/*     */             break;
/*     */           case 12:  break label388;
/*     */             break; case 13:  break label364;
/*     */             break; case 27:  break label340;
/*     */             break; case 127:  break; }
/* 113 */           SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 56704, 16, 1);
/*     */           
/*     */           break label503;
/*     */           
/*     */           label340:
/* 118 */           SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 56672, 16, 1);
/*     */           
/*     */           break label503;
/*     */           
/*     */           label364:
/* 123 */           SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 60992, 19, 1);
/*     */           
/*     */           break label503;
/*     */           
/*     */           label388:
/* 128 */           SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 60960, 19, 1);
/*     */           
/*     */           break label503;
/*     */           
/*     */           label412:
/* 133 */           SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 56640, 16, 1);
/*     */           
/*     */           break label503;
/*     */           
/*     */           label436:
/* 138 */           SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 60928, 19, 1);
/*     */           
/*     */           break label503;
/*     */           
/*     */           label460:
/* 143 */           SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 52544, 13, 1);
/*     */           
/*     */           break label503;
/*     */           
/*     */           label484:
/* 148 */           SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 53632, 14, 1);
/*     */           
/*     */ 
/*     */           label503:
/*     */           
/*     */ 
/* 154 */           ffxmsg.call(5, j);
/* 155 */           SystemLibrary.strncpy(j, paramInt1, 80);
/* 156 */           MainMemory.setI8(j + 80, (byte)0);
/* 157 */           ffxmsg.call(5, j);
/* 158 */           MainMemory.setI32(paramInt2, 207);
/* 159 */           i = 207;
/*     */           
/*     */ 
/*     */           break label574;
/*     */           
/*     */           label550:
/*     */           
/* 166 */           i2 += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 172 */       i = k;
/*     */       
/*     */ 
/*     */       label574:
/*     */       
/*     */ 
/* 178 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 183 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fftrec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */