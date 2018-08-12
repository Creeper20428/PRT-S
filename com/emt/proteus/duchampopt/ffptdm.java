/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffptdm
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3588;
/*  22 */   public static final Function _instance = new ffptdm();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public ffptdm() { super("ffptdm", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  29 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  30 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     call(i, j, k, m, n);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  57 */     int i = 0;
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*  65 */     int i4 = 0;
/*  66 */     int i5 = 0;
/*  67 */     int i6 = 0;
/*  68 */     int i7 = 0;
/*  69 */     int i8 = 0;
/*  70 */     int i9 = 0;
/*  71 */     int i10 = 0;
/*  72 */     int i11 = 0;
/*  73 */     int i12 = 0;
/*  74 */     int i13 = 0;
/*     */     
/*     */ 
/*  77 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  81 */       i = MainMemory.alloc(81);
/*  82 */       j = MainMemory.alloc(71);
/*  83 */       k = MainMemory.alloc(71);
/*  84 */       m = MainMemory.alloc(81);
/*  85 */       n = MainMemory.alloc(72);
/*  86 */       i1 = MainMemory.alloc(71);
/*  87 */       i2 = MainMemory.alloc(73);
/*  88 */       i3 = MainMemory.alloc(80);
/*  89 */       i4 = MainMemory.alloc(81);
/*  90 */       i5 = MainMemory.alloc(4);
/*  91 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         i6 = paramInt2 + -1;
/* 102 */         if (!MathUtils.ugt(i6, 998)) {
/*     */           break label199;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         ffxmsg.call(5, 106848);
/* 113 */         MainMemory.setI32(paramInt5, 302);
/*     */         
/*     */ 
/*     */         break label945;
/*     */         
/*     */         label199:
/*     */         
/* 120 */         if (paramInt3 >= 1) {
/*     */           break label241;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */         ffxmsg.call(5, 75712);
/* 131 */         MainMemory.setI32(paramInt5, 320);
/*     */         
/*     */ 
/*     */         break label945;
/*     */         
/*     */         label241:
/*     */         
/* 138 */         i10 = MainMemory.getI32(paramInt1);
/* 139 */         i7 = paramInt1 + 4;
/* 140 */         i8 = MainMemory.getI32(i7);
/* 141 */         if (i10 != MainMemory.getI32(i8 + 64)) {
/*     */           break label340;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */         if (MainMemory.getI64(i8 + 112) != -1L) {
/*     */           break label357;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label820;
/*     */         } else {
/*     */           break label357;
/*     */         }
/*     */         
/*     */ 
/*     */         label340:
/*     */         
/* 170 */         ffmahd.call(paramInt1, i10 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label357:
/*     */         
/*     */ 
/* 176 */         if (MainMemory.getI32(MainMemory.getI32(i7) + 68) != 2) {
/*     */           break label926;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */         MainMemory.setI16(i1, (short)40);
/* 187 */         i10 = 0;
/* 188 */         i11 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 196 */           i12 = paramInt4 + (i10 << 2);
/* 197 */           if (i10 >= paramInt3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */           if (i10 <= 0) {
/*     */             break label466;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */           MainMemory.setI16(i1 + SystemLibrary.strlen(i1), (short)44);
/*     */           
/*     */ 
/*     */           label466:
/*     */           
/*     */ 
/* 223 */           i9 = MainMemory.getI32(i12);
/* 224 */           if (i9 >= 0) {
/*     */             break label515;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */           ffxmsg.call(5, 111712);
/* 235 */           MainMemory.setI32(paramInt5, 263);
/*     */           
/*     */ 
/*     */           break label945;
/*     */           
/*     */           label515:
/*     */           
/* 242 */           SystemLibrary.sprintf(i3, 17920, new Object[] { Integer.valueOf(i9) });
/* 243 */           SystemLibrary.strcat(i1, i3);
/* 244 */           i11 = MainMemory.getI32(i12) * i11;
/* 245 */           i10 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */         i13 = MainMemory.getI32(MainMemory.getI32(i7) + 944) + i6 * 152 + 84;
/* 253 */         if ((int)MainMemory.getI64(i13) != i11)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */           ffkeyn.call(27360, paramInt2, n, paramInt5);
/* 264 */           if (MainMemory.getI32(paramInt5) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */             MainMemory.setI8(j, (byte)0);
/* 275 */             if (ffgcrd.call(paramInt1, n, i, paramInt5) <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */               ffpsvc.call(i, j, 0, paramInt5);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 291 */             MainMemory.setI8(i3, (byte)0);
/* 292 */             ffc2s.call(j, i3, paramInt5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 298 */           ffbnfm.call(i3, 0, i5, 0, paramInt5);
/* 299 */           if (MainMemory.getI32(paramInt5) > 0) {
/*     */             break label870;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */           if (MainMemory.getI32(i5) != i11) {
/*     */             break label870;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */         MainMemory.setI16(i1 + SystemLibrary.strlen(i1), (short)41);
/* 320 */         SystemLibrary.memcpy(i2, 82656, 35, 1);
/* 321 */         ffkeyn.call(22336, paramInt2, n, paramInt5);
/* 322 */         paramInt2 = MainMemory.getI32(paramInt5);
/* 323 */         if (paramInt2 <= 0) {
/*     */           break label830;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label820:
/*     */       
/*     */ 
/*     */       break label945;
/*     */       
/*     */ 
/*     */       label830:
/*     */       
/*     */ 
/* 339 */       ffs2c.call(i1, k, paramInt2);
/* 340 */       ffmkky.call(n, k, i2, m, paramInt5);
/* 341 */       ffprec.call(paramInt1, m, paramInt5);
/*     */       
/*     */ 
/*     */       break label945;
/*     */       
/*     */       label870:
/*     */       
/* 348 */       SystemLibrary.sprintf(i4, 133472, new Object[] { Integer.valueOf((int)MainMemory.getI64(i13)), Integer.valueOf(i11) });
/* 349 */       ffxmsg.call(5, i4);
/* 350 */       MainMemory.setI32(paramInt5, 263);
/*     */       
/*     */ 
/*     */       break label945;
/*     */       
/*     */       label926:
/*     */       
/* 357 */       ffxmsg.call(5, 142176);
/* 358 */       MainMemory.setI32(paramInt5, 227);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label945:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffptdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */