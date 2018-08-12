/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class ffclos extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2984;
/*  14 */   public static final Function _instance = new ffclos();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffclos() { super("ffclos", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2);
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
/*  32 */     int k = call(i, j);
/*  33 */     paramFrame.setI32(paramInt1, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*     */     
/*     */ 
/*  49 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       k = MainMemory.alloc(4);
/*  55 */       MainMemory.setI32(j, 999);
/*  56 */       MainMemory.setI32(k, 0);
/*  57 */       if (paramInt1 != 0) {
/*     */         break label81;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */       MainMemory.setI32(paramInt2, 115);
/*     */       
/*     */       break label863;
/*     */       
/*     */       label81:
/*  72 */       m = paramInt1 + 4;
/*  73 */       if (MainMemory.getI32(MainMemory.getI32(m) + 16) != 555) {
/*     */         break label852;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       if (MainMemory.getI32(paramInt2) <= 0) {
/*     */         break label152;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       ffchdu.call(paramInt1, j);
/*     */       
/*     */       break label163;
/*     */       
/*     */       label152:
/*  98 */       ffchdu.call(paramInt1, paramInt2);
/*     */       
/*     */ 
/*     */       label163:
/*     */       
/*     */ 
/* 104 */       j = MainMemory.getI32(m) + 8;
/* 105 */       MainMemory.setI32(j, MainMemory.getI32(j) + -1);
/* 106 */       i1 = MainMemory.getI32(m);
/* 107 */       if (MainMemory.getI32(i1 + 8) == 0)
/*     */       {
/* 109 */         n = 0;
/*     */       } else {
/*     */         break label629;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 121 */         if (MainMemory.getI32(i1 + 1216 + (n << 2)) <= -1) {
/*     */           break label294;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         if (MainMemory.getI32(i1 + 1376 + (n << 2)) != 0)
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
/* 143 */           ffbfwt.call(i1, n, paramInt2);
/* 144 */           i1 = MainMemory.getI32(m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label294:
/*     */         
/*     */ 
/* 152 */         MainMemory.setI32(i1 + 1216 + (n << 2), -1);
/* 153 */         n += 1;
/* 154 */         if (n != 40) {
/*     */           break label612;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         if (MainMemory.getI32(paramInt2) != 112)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           ffclos_561.call(m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 180 */         i1 = MainMemory.getI32(m);
/* 181 */         n = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(i1 + 4) * 84 + 56), MainMemory.getI32(i1));
/* 182 */         if (n != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */           ffclos_562.call(m, paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 198 */         i1 = MainMemory.getI32(m);
/* 199 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 206 */           i2 = 491008 + (n << 2);
/* 207 */           if (n >= 300) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */           if (MainMemory.getI32(i2) != i1) {
/*     */             break label510;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */           MainMemory.setI32(i2, 0);
/* 228 */           break;
/*     */           
/*     */           label510:
/*     */           
/* 232 */           n += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 238 */         free.call(MainMemory.getI32(i1 + 1212));
/* 239 */         free.call(MainMemory.getI32(MainMemory.getI32(m) + 84));
/* 240 */         free.call(MainMemory.getI32(MainMemory.getI32(m) + 12));
/* 241 */         MainMemory.setI32(MainMemory.getI32(m) + 12, 0);
/* 242 */         MainMemory.setI32(MainMemory.getI32(m) + 16, 0);
/* 243 */         free.call(MainMemory.getI32(m));
/* 244 */         free.call(paramInt1);
/* 245 */         break;
/*     */         
/*     */         label612:
/*     */         
/* 249 */         i1 = MainMemory.getI32(m);
/*     */       }
/*     */       
/*     */ 
/*     */       label629:
/*     */       
/*     */ 
/* 256 */       if (MainMemory.getI32(paramInt2) > 0) {
/* 257 */         n = 0;
/*     */       }
/*     */       else
/*     */       {
/* 261 */         n = 0;
/*     */         
/*     */ 
/*     */         break label750;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 269 */         i1 = MainMemory.getI32(m);
/* 270 */         if (MainMemory.getI32(i1 + 1216 + (n << 2)) <= -1) {
/*     */           break label707;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */         ffclos_560.call(k, n, i1);
/*     */         
/*     */ 
/*     */         label707:
/*     */         
/*     */ 
/* 286 */         n += 1;
/* 287 */         if (n == 40) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */       ffclos_559.call(m, k);
/*     */       
/*     */       break label838;
/*     */       for (;;)
/*     */       {
/*     */         label750:
/* 304 */         i1 = MainMemory.getI32(m);
/* 305 */         if (MainMemory.getI32(i1 + 1216 + (n << 2)) <= -1) {
/*     */           break label801;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */         ffclos_563.call(i1, paramInt2, n);
/*     */         
/*     */ 
/*     */         label801:
/*     */         
/*     */ 
/* 321 */         n += 1;
/* 322 */         if (n == 40) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */       ffclos_558.call(m, paramInt2);
/*     */       
/*     */ 
/*     */       label838:
/*     */       
/*     */ 
/* 339 */       free.call(paramInt1);
/*     */       
/*     */       break label863;
/*     */       
/*     */       label852:
/* 344 */       MainMemory.setI32(paramInt2, 114);
/*     */       
/*     */ 
/*     */       label863:
/*     */       
/*     */ 
/* 350 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 361 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffclos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */