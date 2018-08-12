/*     */ package com.emt.proteus.duchampopt;
/*     */ 
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
/*     */ public final class F312499
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3209;
/*  18 */   public static final Function _instance = new F312499();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public F312499() { super("F312499", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = call(i, j);
/*  37 */     paramFrame.setI32(paramInt1, k);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  43 */     int i = 0;
/*     */     
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*  53 */     int i5 = 0;
/*  54 */     int i6 = 0;
/*  55 */     byte b = 0;
/*  56 */     double d = 0.0D;
/*  57 */     int i7 = 0;
/*     */     
/*     */ 
/*  60 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       j = MainMemory.alloc(71);
/*  65 */       k = MainMemory.alloc(81);
/*  66 */       m = MainMemory.alloc(4);
/*  67 */       n = MainMemory.alloc(71);
/*  68 */       i1 = MainMemory.alloc(8);
/*  69 */       i2 = MainMemory.alloc(4);
/*  70 */       i3 = MainMemory.alloc(4);
/*  71 */       MainMemory.setI32(m, 0);
/*  72 */       i4 = MainMemory.getI32Aligned(470752);
/*  73 */       MainMemory.setI8(n, (byte)0);
/*  74 */       if (ffgcrd.call(i4, paramInt1, k, m) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         ffpsvc.call(k, n, 0, m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  90 */       i5 = MainMemory.getI32(m);
/*  91 */       switch (i5)
/*     */       {
/*     */       case 0: 
/*     */         break label246;
/*     */         
/*     */ 
/*     */         break;
/*     */       case 202: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 103 */       SystemLibrary.sprintf(n, 80416, new Object[] { Integer.valueOf(paramInt1) });
/* 104 */       ffxmsg.call(5, n);
/* 105 */       i5 = MainMemory.getI32(m);
/*     */       
/*     */       break label922;
/*     */       
/*     */       label246:
/*     */       
/* 111 */       i6 = i5 > 0 ? 1 : 0;
/* 112 */       if (i6 != 0) {
/* 113 */         i5 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 123 */         switch (MainMemory.getI8(n)) {
/*     */         case 0: 
/*     */           break label577;
/*     */           break;
/*     */         case 39: 
/*     */           break label477;
/*     */           break;
/*     */         case 70:  break; case 84:  break; case 40:  i5 = -1;
/*     */           
/*     */ 
/*     */           break label865;
/*     */           
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 139 */         if (i6 != 0) {
/* 140 */           b = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 150 */           MainMemory.setI8(j, (byte)0);
/* 151 */           if (ffgcrd.call(i4, paramInt1, k, m) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */             ffpsvc.call(k, j, 0, m);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 167 */           ffc2l.call(j, i2, m);
/* 168 */           b = (byte)MainMemory.getI32(i2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         MainMemory.setI8(paramInt2, b);
/* 177 */         i5 = 258;
/*     */         
/*     */         break label865;
/*     */         
/*     */         label477:
/* 182 */         if (i6 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */           MainMemory.setI8(j, (byte)0);
/* 193 */           if (ffgcrd.call(i4, paramInt1, k, m) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */             ffpsvc.call(k, j, 0, m);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 209 */           MainMemory.setI8(n, (byte)0);
/* 210 */           ffc2s.call(j, n, m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 216 */         SystemLibrary.strcpy(paramInt2, n);
/* 217 */         i5 = 261;
/*     */         
/*     */         break label865;
/*     */         
/*     */         label577:
/* 222 */         MainMemory.setI32Aligned(470852, 204);
/* 223 */         i = -1;
/*     */         
/*     */ 
/*     */ 
/*     */         break label936;
/*     */         
/*     */ 
/* 230 */         if (SystemLibrary.strchr(n, 46) != 0) {
/*     */           break label768;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */         if (SystemLibrary.strchr(n, 69) != 0) {
/*     */           break label768;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */         if (SystemLibrary.strchr(n, 68) != 0) {
/*     */           break label768;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */         if (i6 != 0) {
/* 261 */           i5 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 271 */           MainMemory.setI8(j, (byte)0);
/* 272 */           if (ffgcrd.call(i4, paramInt1, k, m) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */             ffpsvc.call(k, j, 0, m);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 288 */           ffc2i.call(j, i3, m);
/* 289 */           i5 = MainMemory.getI32(i3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */         MainMemory.setI32(paramInt2, i5);
/* 298 */         i5 = 259;
/*     */         
/*     */         break label865;
/*     */         
/*     */         label768:
/* 303 */         if (i6 != 0) {
/* 304 */           d = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 314 */           MainMemory.setI8(j, (byte)0);
/* 315 */           if (ffgcrd.call(i4, paramInt1, k, m) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */             ffpsvc.call(k, j, 0, m);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 331 */           ffc2d.call(j, i1, m);
/* 332 */           d = MainMemory.getF64(i1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */         MainMemory.setF64(paramInt2, d);
/* 341 */         i5 = 260;
/*     */       }
/*     */       
/*     */ 
/*     */       label865:
/*     */       
/*     */ 
/* 348 */       i7 = MainMemory.getI32(m);
/* 349 */       if (i7 != 0) {
/*     */         break label903;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */       i = i5;
/*     */       
/*     */ 
/*     */       break label936;
/*     */       
/*     */       label903:
/*     */       
/* 366 */       MainMemory.setI32Aligned(470852, i7);
/* 367 */       i = -1;
/*     */       
/*     */ 
/*     */       break label936;
/*     */       
/*     */ 
/*     */       label922:
/*     */       
/* 375 */       MainMemory.setI32Aligned(470852, i5);
/* 376 */       i = -1;
/*     */       
/*     */ 
/*     */       label936:
/*     */       
/*     */ 
/* 382 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 387 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F312499.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */