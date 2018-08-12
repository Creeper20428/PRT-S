/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
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
/*     */ public final class ffiprs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3204;
/*  24 */   public static final Function _instance = new ffiprs();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public ffiprs() { super("ffiprs", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  31 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i3 = call(i, j, k, m, n, i1, i2);
/*  58 */     paramFrame.setI32(paramInt1, i3);
/*  59 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  64 */     int i = 0;
/*     */     
/*  66 */     int j = 0;
/*  67 */     int k = 0;
/*  68 */     int m = 0;
/*  69 */     int n = 0;
/*  70 */     int i1 = 0;
/*  71 */     int i2 = 0;
/*  72 */     int i3 = 0;
/*  73 */     int i4 = 0;
/*  74 */     int i5 = 0;
/*  75 */     int i6 = 0;
/*  76 */     int i7 = 0;
/*  77 */     int i8 = 0;
/*     */     
/*     */ 
/*  80 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  84 */       j = MainMemory.alloc(81);
/*  85 */       k = MainMemory.alloc(71);
/*  86 */       m = MainMemory.alloc(4);
/*  87 */       n = MainMemory.alloc(4);
/*  88 */       i1 = MainMemory.alloc(4);
/*  89 */       i2 = MainMemory.alloc(36);
/*  90 */       MainMemory.setI32(m, 0);
/*  91 */       if (MainMemory.getI32(paramInt7) != 0) {
/*     */         break label837;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       if (ffrdef.call(paramInt1, paramInt7) != 0) {
/*     */         break label837;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */       MainMemory.setI32Aligned(470752, paramInt1);
/* 112 */       MainMemory.setI32Aligned(470764, 0);
/* 113 */       MainMemory.setI32Aligned(470816, 0);
/* 114 */       MainMemory.setI32Aligned(470820, 0);
/* 115 */       MainMemory.setI32Aligned(470824, 0);
/* 116 */       MainMemory.setI32Aligned(470756, 3205);
/* 117 */       MainMemory.setI32Aligned(470760, 3206);
/* 118 */       MainMemory.setI32Aligned(470792, 0);
/* 119 */       MainMemory.setI32Aligned(470800, 0);
/* 120 */       MainMemory.setI32Aligned(470796, 0);
/* 121 */       MainMemory.setI32Aligned(470848, 0);
/* 122 */       MainMemory.setI32Aligned(470852, 0);
/* 123 */       ffghdt.call(paramInt1, 470848, paramInt7);
/* 124 */       if (MainMemory.getI32Aligned(470848) != 0) {
/*     */         break label526;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       i3 = MainMemory.getI32(paramInt7);
/* 135 */       if (i3 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         ffgidt.call(paramInt1, i1, paramInt7);
/* 147 */         ffgidm.call(paramInt1, n, paramInt7);
/* 148 */         ffgisz.call(paramInt1, 9, i2, paramInt7);
/* 149 */         i3 = MainMemory.getI32(paramInt7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */       if (i3 != 0) {
/*     */         break label510;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */       i3 = MainMemory.getI32(n);
/* 168 */       i4 = i3 > 0 ? 1 : 0;
/* 169 */       i6 = i4 != 0 ? 1 : 0;
/* 170 */       MainMemory.setI32Aligned(470840, i6);
/* 171 */       if (i4 == 0)
/*     */       {
/*     */ 
/*     */ 
/* 175 */         i5 = i6;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 182 */         i5 = i3 > 1 ? i3 : 1;
/*     */         
/* 184 */         i7 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 192 */           i6 = MainMemory.getI32(i2 + (i7 << 2)) * i6;
/* 193 */           i7 += 1;
/* 194 */           if (i7 == i5) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */         MainMemory.setI32Aligned(470840, i6);
/* 207 */         i5 = i6;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */       if (MainMemory.getI32Aligned(459328) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */         SystemLibrary.printf(78336, new Object[] { Integer.valueOf(i3), Integer.valueOf(i5) });
/*     */         
/*     */         break label640;
/*     */         
/*     */         label510:
/* 229 */         ffxmsg.call(5, 89696);
/*     */         
/*     */         break label837;
/*     */         
/*     */         label526:
/* 234 */         i3 = MainMemory.getI32(m);
/* 235 */         if (i3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */           MainMemory.setI8(k, (byte)0);
/* 247 */           if (ffgcrd.call(paramInt1, 35712, j, m) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */             ffpsvc.call(j, k, 0, m);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 263 */           ffc2i.call(k, 470840, m);
/* 264 */           i3 = MainMemory.getI32(m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */         if (i3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */           MainMemory.setI32Aligned(470840, 0);
/*     */         }
/*     */       }
/*     */       
/*     */       label640:
/*     */       
/* 288 */       if (MainMemory.getI8(paramInt2) != 64) {
/*     */         break label710;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */       if (ffimport_file.call(paramInt2 + 1, 470780, paramInt7) != 0) {
/*     */         break label837;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */       paramInt2 = MainMemory.getI32Aligned(470780);
/* 309 */       i3 = SystemLibrary.strlen(paramInt2);
/*     */       
/*     */ 
/*     */       break label750;
/*     */       
/*     */       label710:
/*     */       
/* 316 */       i3 = SystemLibrary.strlen(paramInt2);
/* 317 */       i8 = malloc.call(i3 + 2);
/* 318 */       MainMemory.setI32Aligned(470780, i8);
/* 319 */       SystemLibrary.strcpy(i8, paramInt2);
/* 320 */       paramInt2 = MainMemory.getI32Aligned(470780);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label750:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 330 */       MainMemory.setI16(paramInt2 + (SystemLibrary.strlen(paramInt2 + i3) + i3), (short)10);
/* 331 */       MainMemory.setI32Aligned(470784, 0);
/* 332 */       MainMemory.setI32Aligned(470788, 0);
/* 333 */       ffrestart.call(0);
/* 334 */       if (ffparse.call() != 0) {
/*     */         break label824;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */       ffiprs_1106.call(paramInt4, paramInt5, paramInt6, paramInt7, paramInt3, paramInt1);
/*     */       
/*     */       break label837;
/*     */       
/*     */       label824:
/* 349 */       MainMemory.setI32(paramInt7, 431);
/*     */       
/*     */ 
/*     */       label837:
/*     */       
/*     */ 
/* 355 */       i = MainMemory.getI32(paramInt7);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 366 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffiprs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */