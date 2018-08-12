/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNKSt9basic_iosIcSt11char_traitsIcEE3eofEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSirsERi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_ES4_;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsixEj;
/*     */ 
/*     */ public final class _ZN7duchamp5Param16getObjectRequestEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 234;
/*  22 */   public static final Function _instance = new _ZN7duchamp5Param16getObjectRequestEv();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public _ZN7duchamp5Param16getObjectRequestEv() { super("_ZN7duchamp5Param16getObjectRequestEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  29 */     call(paramInt1, paramInt2);
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
/*  41 */     call(i, j);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*  59 */     int i7 = 0;
/*  60 */     int i8 = 0;
/*  61 */     int i9 = 0;
/*     */     
/*     */ 
/*  64 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       i = MainMemory.alloc(188);
/*  69 */       j = MainMemory.alloc(4);
/*  70 */       k = MainMemory.alloc(4);
/*  71 */       m = MainMemory.alloc(4);
/*  72 */       n = MainMemory.alloc(188);
/*  73 */       i1 = MainMemory.alloc(4);
/*  74 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i, 24);
/*  75 */       _ZNSsC1Ev.call(j);
/*  76 */       MainMemory.setI32(paramInt1, 0);
/*  77 */       i2 = paramInt1 + 4;
/*  78 */       MainMemory.setI32(i2, 0);
/*  79 */       i3 = paramInt1 + 8;
/*  80 */       MainMemory.setI32(i3, 0);
/*  81 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i, paramInt2 + 80);
/*  82 */       i4 = i + 52;
/*  83 */       i5 = i;
/*  84 */       i6 = n;
/*  85 */       i7 = n + 52;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       if (_ZNKSt9basic_iosIcSt11char_traitsIcEE3eofEv.call(i4) != 0) {
/*     */         break label549;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_ES4_.call(i5, j, (byte)44);
/* 102 */       i9 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 109 */         if (!com.emt.proteus.lib.api.MathUtils.ugt(_ZNKSs4sizeEv.call(j), i9)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */         if (MainMemory.getI8(_ZNSsixEj.call(j, i9)) != 45) {
/*     */           break label269;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         MainMemory.setI8(_ZNSsixEj.call(j, i9), (byte)32);
/*     */         
/*     */ 
/*     */         label269:
/*     */         
/*     */ 
/* 135 */         i9 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 141 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(n, 24);
/* 142 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(n, j);
/* 143 */       _ZNSirsERi.call(i6, k);
/* 144 */       if (_ZNKSt9basic_iosIcSt11char_traitsIcEE3eofEv.call(i7) != 0) {
/*     */         break label358;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */       _ZNSirsERi.call(i6, m);
/* 155 */       i9 = MainMemory.getI32(k);
/*     */       
/*     */       break label378;
/*     */       
/*     */       label358:
/*     */       
/* 161 */       i9 = MainMemory.getI32(k);
/* 162 */       MainMemory.setI32(m, i9);
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label378:
/*     */         
/*     */ 
/* 170 */         MainMemory.setI32(i1, i9);
/* 171 */         if (i9 <= MainMemory.getI32(m)) {
/*     */           break label427;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(n);
/* 182 */         break;
/*     */         
/*     */         label427:
/*     */         
/* 186 */         i8 = MainMemory.getI32(i2);
/* 187 */         if (i8 != MainMemory.getI32(i3)) {
/*     */           break label486;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 197 */         _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, i8, i1);
/* 198 */         i9 = MainMemory.getI32(i1);
/*     */         
/*     */         break label531;
/*     */         
/*     */         label486:
/*     */         
/* 204 */         if (i8 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */           MainMemory.setI32(i8, i9);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 220 */         MainMemory.setI32(i2, i8 + 4);
/*     */         
/*     */ 
/*     */ 
/*     */         label531:
/*     */         
/*     */ 
/*     */ 
/* 228 */         i9 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label549:
/*     */       
/* 234 */       _ZNSsD1Ev.call(j);
/* 235 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 246 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param16getObjectRequestEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */