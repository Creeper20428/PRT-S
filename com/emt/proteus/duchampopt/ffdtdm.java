/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffdtdm extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3402;
/*  13 */   public static final Function _instance = new ffdtdm();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffdtdm() { super("ffdtdm", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  44 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i, j, k, m, n, i1, i2);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*  63 */     int i5 = 0;
/*     */     
/*     */ 
/*  66 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(4);
/*  71 */       j = MainMemory.alloc(81);
/*  72 */       if (MainMemory.getI32(paramInt7) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         i5 = MainMemory.getI32(paramInt1);
/*  83 */         k = paramInt1 + 4;
/*  84 */         if (i5 != MainMemory.getI32(MainMemory.getI32(k) + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */           ffmahd.call(paramInt1, i5 + 1, 0, paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (paramInt3 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */           m = MainMemory.getI32(k);
/* 111 */           if (MainMemory.getI32(m + 916) >= paramInt3) {
/*     */             break label186;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         MainMemory.setI32(paramInt7, 302);
/*     */         
/*     */ 
/*     */         break label739;
/*     */         
/*     */         label186:
/*     */         
/* 128 */         n = MainMemory.getI32(m + 944);
/* 129 */         paramInt3 += -1;
/* 130 */         if (MainMemory.getI8(paramInt2) != 0) {
/*     */           break label274;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         MainMemory.setI32(paramInt5, 1);
/* 141 */         if (paramInt4 <= 0) {
/*     */           break label563;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */         MainMemory.setI32(paramInt6, (int)MainMemory.getI64(n + paramInt3 * 152 + 84));
/*     */         
/*     */ 
/*     */         break label739;
/*     */         
/*     */         label274:
/*     */         
/* 158 */         MainMemory.setI32(paramInt5, 0);
/* 159 */         i4 = SystemLibrary.strchr(paramInt2, 40);
/* 160 */         MainMemory.setI32(i, i4);
/* 161 */         if (i4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 166 */           i5 = 1;
/* 167 */           i3 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 174 */           SystemLibrary.sprintf(j, 77120, new Object[] { Integer.valueOf(paramInt2) });
/* 175 */           MainMemory.setI32(paramInt7, 263);
/*     */           
/*     */ 
/*     */           break label739;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/* 185 */         if (i4 != 0) {
/*     */           break label573;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */         i4 = SystemLibrary.strchr(i3, 41);
/* 196 */         MainMemory.setI32(i, i4);
/* 197 */         if (i4 != 0) {
/*     */           break label445;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */         SystemLibrary.sprintf(j, 77120, new Object[] { Integer.valueOf(paramInt2) });
/* 208 */         MainMemory.setI32(paramInt7, 263);
/* 209 */         break;
/*     */         
/*     */ 
/*     */         label445:
/*     */         
/*     */ 
/* 215 */         if (MainMemory.getI32(n + paramInt3 * 152 + 80) <= 0) {
/*     */           break label563;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */         paramInt3 = (int)MainMemory.getI64(n + paramInt3 * 152 + 84);
/* 226 */         if (paramInt3 != i5)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */           SystemLibrary.sprintf(j, 133472, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(i5) });
/* 237 */           ffxmsg.call(5, j);
/* 238 */           ffxmsg.call(5, paramInt2);
/* 239 */           MainMemory.setI32(paramInt7, 263);
/* 240 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */         label563:
/*     */         
/* 246 */         break;
/*     */         
/*     */ 
/*     */         label573:
/*     */         
/*     */ 
/* 252 */         i4 += 1;
/* 253 */         MainMemory.setI32(i, i4);
/* 254 */         i1 = SystemLibrary.strtol(i4, i, 10);
/* 255 */         i2 = MainMemory.getI32(paramInt5);
/* 256 */         if (i2 >= paramInt4) {
/*     */           break label640;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */         MainMemory.setI32(paramInt6 + (i2 << 2), i1);
/*     */         
/*     */ 
/*     */         label640:
/*     */         
/*     */ 
/* 272 */         if (i1 >= 0) {
/*     */           break label687;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */         ffxmsg.call(5, 111264);
/* 283 */         ffxmsg.call(5, paramInt2);
/* 284 */         MainMemory.setI32(paramInt7, 263);
/* 285 */         break;
/*     */         
/*     */ 
/*     */         label687:
/*     */         
/*     */ 
/* 291 */         i5 = i1 * i5;
/* 292 */         MainMemory.setI32(paramInt5, MainMemory.getI32(paramInt5) + 1);
/* 293 */         i3 = MainMemory.getI32(i);
/* 294 */         i4 = SystemLibrary.strchr(i3, 44);
/* 295 */         MainMemory.setI32(i, i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label739:
/*     */       
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 307 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdtdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */