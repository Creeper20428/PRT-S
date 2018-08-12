/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEl;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube7getCubeESs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1705;
/*  19 */   public static final Function _instance = new _ZN7duchamp4Cube7getCubeESs();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public _ZN7duchamp4Cube7getCubeESs() { super("_ZN7duchamp4Cube7getCubeESs", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  26 */     return call(paramInt1, paramInt2);
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
/*  37 */     int k = call(i, j);
/*  38 */     paramFrame.setI32(paramInt1, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*     */     
/*     */ 
/*  55 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(4);
/*  60 */       k = MainMemory.alloc(4);
/*  61 */       _ZNSsC1ERKSs.call(k, paramInt2);
/*  62 */       m = _ZN7duchamp4Cube11getMetadataESs.call(paramInt1, k) == 1 ? 1 : 0;
/*  63 */       _ZNSsD1Ev.call(k);
/*  64 */       if (m == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         n = paramInt1 + 590;
/*  75 */         if (MainMemory.getI8(n) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 58976), 80);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  91 */         _ZNSsC1ERKSs.call(j, paramInt2);
/*  92 */         m = _ZN7duchamp4Cube11getFITSdataESs.call(paramInt1, j) == 1 ? 1 : 0;
/*  93 */         _ZNSsD1Ev.call(j);
/*  94 */         if (m == 0) {
/*     */           break label180;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       i = 1;
/*     */       
/*     */ 
/*     */       break label407;
/*     */       
/*     */       label180:
/*     */       
/* 111 */       i1 = paramInt1 + 8;
/* 112 */       if (MainMemory.getI32(MainMemory.getI32(i1) + 8) != 1) {
/*     */         break label228;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */       MainMemory.setI32(paramInt1 + 560, 0);
/*     */       
/*     */ 
/*     */       label228:
/*     */       
/*     */ 
/* 128 */       if (MainMemory.getI8(n) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 80032);
/* 139 */         _ZNSolsEl.call(1808, MainMemory.getI32(MainMemory.getI32(i1)));
/* 140 */         i2 = MainMemory.getI32(i1);
/* 141 */         i3 = MainMemory.getI32(i2 + 4);
/* 142 */         if (i3 <= 1) {
/*     */           break label332;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13120), i3);
/* 154 */         i2 = MainMemory.getI32(i1);
/*     */         
/*     */ 
/*     */ 
/*     */         label332:
/*     */         
/*     */ 
/*     */ 
/* 162 */         i3 = MainMemory.getI32(i2 + 8);
/* 163 */         if (i3 <= 1) {
/*     */           break label381;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */         _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13120), i3);
/*     */         
/*     */ 
/*     */         label381:
/*     */         
/*     */ 
/* 179 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13408);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 185 */       _ZN7duchamp4Cube16convertFluxUnitsEv.call(paramInt1);
/* 186 */       i = 0;
/*     */       
/*     */ 
/*     */       label407:
/*     */       
/*     */ 
/* 192 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 197 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube7getCubeESs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */