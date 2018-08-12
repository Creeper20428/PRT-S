/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class zuncompress2mem extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3669;
/*  13 */   public static final Function _instance = new zuncompress2mem();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public zuncompress2mem() { super("zuncompress2mem", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  21 */     return 0;
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
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i, j, k, m, n, i1);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     byte b = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*     */     
/*     */ 
/*  57 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       i = MainMemory.alloc(2);
/*  62 */       if (MainMemory.getI32(paramInt6) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         MainMemory.setI8(471008, (byte)0);
/*  73 */         SystemLibrary.strncat(471008, paramInt1, 127);
/*  74 */         MainMemory.setI32Aligned(458756, paramInt2);
/*  75 */         MainMemory.setI32Aligned(458892, paramInt3);
/*  76 */         MainMemory.setI32Aligned(458888, paramInt4);
/*  77 */         MainMemory.setI32Aligned(458928, 2786);
/*  78 */         MainMemory.setI32Aligned(459460, 0);
/*  79 */         MainMemory.setI32Aligned(459464, 0);
/*  80 */         MainMemory.setI32Aligned(459456, 0);
/*  81 */         MainMemory.setI32Aligned(459452, 0);
/*     */         
/*  83 */         j = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  91 */           j = SystemLibrary.fread(548864 + j, 1, 32768 - j, paramInt2);
/*  92 */           k = MainMemory.getI32Aligned(459452);
/*  93 */           if (MathUtils.ult(j + 1, 2)) {
/*  94 */             j = k;
/*  95 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           j = k + j;
/* 105 */           MainMemory.setI32Aligned(459452, j);
/* 106 */           if (!MathUtils.ult(j, 32768)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */           paramInt2 = MainMemory.getI32Aligned(458756);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         if (j != 0) {
/*     */           break label273;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         ffxmsg.call(5, 471008);
/* 136 */         ffxmsg.call(5, 66592);
/* 137 */         k = MainMemory.getI32Aligned(459460);
/* 138 */         j = MainMemory.getI32Aligned(459452);
/*     */         
/*     */ 
/* 141 */         b = 1;
/*     */         
/*     */         break label307;
/*     */         
/*     */         label273:
/* 146 */         MainMemory.setI32Aligned(459456, MainMemory.getI32Aligned(459456) + j);
/* 147 */         MainMemory.setI32Aligned(459460, 1);
/* 148 */         b = MainMemory.getI8(548864);
/*     */         
/* 150 */         k = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label307:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 160 */         MainMemory.setI8(i, b);
/* 161 */         if (!MathUtils.ult(k, j)) {
/*     */           break label366;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         b = MainMemory.getI8(548864 + k);
/* 172 */         MainMemory.setI32Aligned(459460, k + 1);
/*     */         
/*     */         break label541;
/*     */         
/*     */         label366:
/*     */         
/* 178 */         MainMemory.setI32Aligned(459452, 0);
/* 179 */         j = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 186 */           j = SystemLibrary.fread(548864 + j, 1, 32768 - j, MainMemory.getI32Aligned(458756));
/* 187 */           k = MainMemory.getI32Aligned(459452);
/* 188 */           if (MathUtils.ult(j + 1, 2)) {
/* 189 */             j = k;
/* 190 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */           j = k + j;
/* 200 */           MainMemory.setI32Aligned(459452, j);
/* 201 */         } while (MathUtils.ult(j, 32768));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */         if (j != 0) {
/*     */           break label510;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */         ffxmsg.call(5, 471008);
/* 225 */         ffxmsg.call(5, 66592);
/* 226 */         b = 1;
/*     */         
/*     */         break label541;
/*     */         
/*     */         label510:
/* 231 */         MainMemory.setI32Aligned(459456, MainMemory.getI32Aligned(459456) + j);
/* 232 */         MainMemory.setI32Aligned(459460, 1);
/* 233 */         b = MainMemory.getI8(548864);
/*     */         
/*     */ 
/*     */ 
/*     */         label541:
/*     */         
/*     */ 
/*     */ 
/* 241 */         MainMemory.setI8(i + 1, b);
/* 242 */         if (SystemLibrary.memcmp(i, 15584, 2) != 0) {
/*     */           break label662;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */         if (F425242.call(MainMemory.getI32Aligned(458756), MainMemory.getI32Aligned(458760)) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */           MainMemory.setI32(paramInt6, 414);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 268 */         if (paramInt5 != 0) {
/*     */           break label642;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label679;
/*     */       
/*     */ 
/*     */ 
/*     */       label642:
/*     */       
/*     */ 
/*     */ 
/* 284 */       MainMemory.setI32(paramInt5, MainMemory.getI32Aligned(459464));
/*     */       
/*     */ 
/*     */       break label679;
/*     */       
/*     */       label662:
/*     */       
/* 291 */       ffxmsg.call(5, 471008);
/* 292 */       ffxmsg.call(5, 131040);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label679:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/zuncompress2mem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */