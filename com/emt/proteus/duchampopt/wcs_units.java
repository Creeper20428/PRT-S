/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class wcs_units extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2917;
/*  13 */   public static final Function _instance = new wcs_units();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public wcs_units() { super("wcs_units", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*  43 */     int i3 = 0;
/*  44 */     int i4 = 0;
/*  45 */     int i5 = 0;
/*  46 */     int i6 = 0;
/*  47 */     int i7 = 0;
/*  48 */     boolean bool = false;
/*  49 */     int i8 = 0;
/*  50 */     int i9 = 0;
/*  51 */     int i10 = 0;
/*  52 */     int i11 = 0;
/*  53 */     int i12 = 0;
/*  54 */     int i13 = 0;
/*  55 */     int i14 = 0;
/*  56 */     int i15 = 0;
/*  57 */     int i16 = 0;
/*  58 */     int i17 = 0;
/*  59 */     int i18 = 0;
/*     */     
/*     */ 
/*  62 */     int i19 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       j = MainMemory.alloc(9);
/*  67 */       k = MainMemory.alloc(16);
/*  68 */       m = MainMemory.alloc(8);
/*  69 */       n = MainMemory.alloc(8);
/*  70 */       i1 = MainMemory.alloc(8);
/*  71 */       if (paramInt == 0) {
/*  72 */         i2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  82 */         i2 = MainMemory.getI32(paramInt + 4);
/*  83 */         i3 = paramInt + 724;
/*  84 */         i4 = paramInt + 24;
/*  85 */         i5 = k;
/*  86 */         i6 = paramInt + 16;
/*  87 */         i7 = paramInt + 20;
/*  88 */         bool = i2 > 0;
/*  89 */         i8 = paramInt + 88;
/*  90 */         i9 = paramInt + 28;
/*  91 */         i10 = j + 8;
/*  92 */         i17 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  99 */           i18 = i2 * i17;
/* 100 */           if (i17 >= i2)
/*     */           {
/*     */ 
/*     */ 
/* 104 */             i2 = 0;
/* 105 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 111 */           i11 = MainMemory.getI32(i3);
/* 112 */           switch (MainMemory.getI32(i11 + (i17 << 2)) / 1000)
/*     */           {
/*     */           case 2: 
/*     */             break label349;
/*     */             
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 123 */           SystemLibrary.strncpy(j, MainMemory.getI32(i9) + i17 * 72, 8);
/* 124 */           MainMemory.setI8(i10, (byte)0);
/* 125 */           spctyp.call(j, 0, 0, i5, 0, 0, 0);
/* 126 */           i11 = MainMemory.getI32(i3);
/*     */           
/*     */           break label360;
/*     */           
/*     */           label349:
/*     */           
/* 132 */           MainMemory.setI32(k, 6776164);
/*     */           
/*     */ 
/*     */ 
/*     */           label360:
/*     */           
/*     */ 
/*     */ 
/* 140 */           if (MainMemory.getI32(i11 + (i17 << 2)) / 100 % 10 != 5)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */             i12 = MainMemory.getI32(i4);
/* 151 */             MainMemory.setI8(i12 + i17 * 72 + 71, (byte)0);
/* 152 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 159 */               if (i13 >= 72) {
/*     */                 break label496;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */               i14 = i13 + 1;
/* 170 */               if (MainMemory.getI8(i12 + i17 * 72 + i13) == 0) {
/*     */                 break;
/*     */               }
/*     */               
/* 174 */               i13 = i14;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */             wcs_units_1711.call(i13, i17, i12, i14);
/*     */             
/*     */ 
/*     */             label496:
/*     */             
/*     */ 
/* 187 */             i13 += -1;
/* 188 */             i14 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 195 */               i15 = i13 - i14;
/* 196 */               i16 = i12 + i17 * 72 + i15;
/* 197 */               if (i15 <= 0) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */               if (MainMemory.getI8(i16) != 32) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */               MainMemory.setI8(i16, (byte)0);
/* 218 */               i14 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 224 */             i16 = MainMemory.getI32(i4) + i17 * 72;
/* 225 */             if (MainMemory.getI8(i16) != 0) {
/*     */               break label645;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */             SystemLibrary.strcpy(i16, i5);
/*     */             
/*     */             break label706;
/*     */             
/*     */             label645:
/* 240 */             if (wcsunits.call(i16, i5, m, n, i1) != 0)
/*     */             {
/*     */ 
/*     */ 
/* 244 */               i2 = 6;
/* 245 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 251 */             wcs_units_1710.call(i17, i18, bool, i6, m, i8, i4, i2, i5, i7);
/*     */           }
/*     */           
/*     */ 
/*     */           label706:
/*     */           
/* 257 */           i17 += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 264 */       i = i2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 275 */       MainMemory.dealloc_generated(i19);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcs_units.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */