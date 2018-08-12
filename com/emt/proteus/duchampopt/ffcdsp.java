/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffcdsp extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3227;
/*  11 */   public static final Function _instance = new ffcdsp();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffcdsp() { super("ffcdsp", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       MainMemory.setI8(paramInt2, (byte)0);
/*  46 */       i = MainMemory.getI8(paramInt1);
/*  47 */       if (i == 32) {
/*  48 */         j = 0;
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*  53 */         j = 0;
/*     */         
/*     */ 
/*     */         break label67;
/*     */       }
/*     */       
/*     */       do
/*     */       {
/*  61 */         j += 1;
/*  62 */         i = MainMemory.getI8(paramInt1 + j);
/*  63 */       } while (i == 32);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label67:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       k = paramInt1 + j;
/*  79 */       if (i != 0) {
/*     */         break label104;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       MainMemory.setI8(paramInt2, (byte)0);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label104:
/*     */       
/*  96 */       if (SystemLibrary.strchr(k, 37) != 0) {
/*     */         break label706;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       MainMemory.setI8(paramInt2, (byte)37);
/* 107 */       SystemLibrary.strcpy(paramInt2 + 1, paramInt1 + (j + 1));
/* 108 */       switch (MainMemory.getI8(k)) {
/*     */       case 65: 
/*     */         break label670;
/*     */         break;
/*     */       case 97: 
/*     */         break label670;
/*     */         break;
/*     */       case 73: 
/*     */         break label649;
/*     */         break;
/*     */       case 105: 
/*     */         break label649;
/*     */         break;
/*     */       case 79: 
/*     */         break label628;
/*     */         break;
/*     */       case 111:  break label628;
/*     */         break; case 90:  break label607;
/*     */         break; case 122:  break label607;
/*     */         break; case 70:  break label586;
/*     */         break; case 102:  break label586;
/*     */         break; case 69:  break label565;
/*     */         break; case 101:  break label565;
/*     */         break; case 68:  break label544;
/*     */         break; case 100:  break label544;
/*     */         break; case 71:  break; case 103:  break; }
/* 134 */       MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)71);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label544:
/*     */       
/* 141 */       MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)69);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label565:
/*     */       
/* 148 */       MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)69);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label586:
/*     */       
/* 155 */       MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)102);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label607:
/*     */       
/* 162 */       MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)88);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label628:
/*     */       
/* 169 */       MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)111);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label649:
/*     */       
/* 176 */       MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)100);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label670:
/*     */       
/* 183 */       MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)115);
/*     */       
/*     */ 
/*     */ 
/*     */       break label716;
/*     */       
/*     */ 
/* 190 */       MainMemory.setI8(paramInt2, (byte)0);
/*     */       
/*     */ 
/*     */       break label716;
/*     */       
/*     */       label706:
/*     */       
/* 197 */       MainMemory.setI8(paramInt2, (byte)0);
/*     */       
/*     */ 
/*     */       label716:
/*     */       
/*     */ 
/* 203 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcdsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */