/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube6invertEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1706;
/*  12 */   public static final Function _instance = new _ZN7duchamp4Cube6invertEv();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN7duchamp4Cube6invertEv() { super("_ZN7duchamp4Cube6invertEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       if (MainMemory.getI8(paramInt + 24) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */         i = paramInt + 16;
/*  60 */         if (MainMemory.getI32(i) <= 0) {
/*     */           break label232;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         j = paramInt + 20;
/*  71 */         k = paramInt + 32;
/*  72 */         m = paramInt + 632;
/*  73 */         n = paramInt + 628;
/*  74 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  81 */           i2 = i1 + 1;
/*  82 */           i3 = MainMemory.getI32(j) + (i1 << 2);
/*  83 */           if (_ZN7duchamp5Param7isBlankERf.call(k, i3) != 0) {
/*     */             break label209;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */           f = -0.0F - MainMemory.getF32(i3);
/*  94 */           MainMemory.setF32(i3, f);
/*  95 */           if (MainMemory.getI8(m) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */             i3 = MainMemory.getI32(n) + (i1 << 2);
/* 106 */             f = -0.0F - MainMemory.getF32(i3);
/* 107 */             MainMemory.setF32(i3, f);
/*     */           }
/*     */           
/*     */ 
/*     */           label209:
/*     */           
/* 113 */           if (MainMemory.getI32(i) <= i2) break;
/* 114 */           i1 = i2;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label232:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube6invertEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */