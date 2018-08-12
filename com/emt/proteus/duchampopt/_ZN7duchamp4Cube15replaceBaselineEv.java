/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube15replaceBaselineEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1483;
/*  12 */   public static final Function _instance = new _ZN7duchamp4Cube15replaceBaselineEv();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN7duchamp4Cube15replaceBaselineEv() { super("_ZN7duchamp4Cube15replaceBaselineEv", 1, false); }
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
/*  49 */       if (MainMemory.getI8(paramInt + 316) != 0)
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
/*  60 */         i2 = MainMemory.getI32(i);
/*  61 */         if (i2 <= 0) {
/*     */           break label205;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         j = paramInt + 20;
/*  73 */         k = paramInt + 32;
/*  74 */         m = paramInt + 640;
/*  75 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  82 */           i2 = i1 + 1;
/*  83 */           i3 = MainMemory.getI32(j) + (i1 << 2);
/*  84 */           if (_ZN7duchamp5Param7isBlankERf.call(k, i3) != 0) {
/*     */             break label171;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */           f = MainMemory.getF32(i3) + MainMemory.getF32(MainMemory.getI32(m) + (i1 << 2));
/*  95 */           MainMemory.setF32(i3, f);
/*     */           
/*     */ 
/*     */           label171:
/*     */           
/*     */ 
/* 101 */           i1 = MainMemory.getI32(i);
/* 102 */           if (i1 <= i2) break;
/* 103 */           i1 = i2;
/*     */         }
/*     */         break label205;
/* 106 */         i2 = i1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label205:
/*     */         
/*     */ 
/*     */ 
/* 115 */         if ((MainMemory.getI8(paramInt + 632) == 0) || (i2 <= 0)) {
/*     */           break label369;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         j = paramInt + 20;
/* 126 */         k = paramInt + 32;
/* 127 */         m = paramInt + 628;
/* 128 */         n = paramInt + 640;
/* 129 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 136 */           i2 = i1 + 1;
/* 137 */           if (_ZN7duchamp5Param7isBlankERf.call(k, MainMemory.getI32(j) + (i1 << 2)) != 0) {
/*     */             break label346;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */           i3 = MainMemory.getI32(m) + (i1 << 2);
/* 148 */           f = MainMemory.getF32(i3) + MainMemory.getF32(MainMemory.getI32(n) + (i1 << 2));
/* 149 */           MainMemory.setF32(i3, f);
/*     */           
/*     */ 
/*     */           label346:
/*     */           
/*     */ 
/* 155 */           if (MainMemory.getI32(i) <= i2) break;
/* 156 */           i1 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label369:
/*     */         
/*     */ 
/*     */ 
/* 166 */         _ZN7duchamp4Cube15replaceBaselineEv_264.call(paramInt);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube15replaceBaselineEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */