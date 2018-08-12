/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fftkey extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3243;
/*  13 */   public static final Function _instance = new fftkey();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fftkey() { super("fftkey", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     int i2 = 0;
/*  46 */     int i3 = 0;
/*  47 */     int i4 = 0;
/*  48 */     int i5 = 0;
/*     */     
/*     */ 
/*  51 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       j = MainMemory.alloc(81);
/*  56 */       k = MainMemory.getI32(paramInt2);
/*  57 */       if (k <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */         m = SystemLibrary.strlen(paramInt1);
/*  68 */         m = MathUtils.ugt(m, 8) ? 8 : m;
/*  69 */         n = k == 0 ? 1 : 0;
/*  70 */         i3 = 0;
/*  71 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  79 */           i5 = paramInt1 + i3;
/*  80 */           if (!MathUtils.ult(i3, m)) {
/*     */             break label560;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */           if (n == 0) {
/*     */             break label176;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */           i1 = MainMemory.getI8(i5);
/* 101 */           i2 = i1;
/*     */           
/*     */           break label205;
/*     */           
/*     */           label176:
/*     */           
/* 107 */           i2 = MainMemory.getI8(i5);
/* 108 */           i1 = (byte)MainMemory.getI32(MainMemory.getI32(com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc.call()) + (i2 << 2));
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label205:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 118 */           if ((MathUtils.ult((byte)(i1 + -65), (byte)26)) || (!MathUtils.ult((byte)(i1 + -48), (byte)10)))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */             switch (i1)
/*     */             {
/*     */             case 45: 
/*     */               break;
/*     */             case 95: 
/*     */               break;
/*     */             }
/*     */             
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 140 */           if (i4 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */             if (n == 0) {
/*     */               break label348;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */             SystemLibrary.sprintf(j, 103840, new Object[] { Integer.valueOf(paramInt1) });
/* 162 */             ffxmsg.call(5, j);
/*     */             
/*     */ 
/*     */             label348:
/*     */             
/*     */ 
/* 168 */             MainMemory.setI32(paramInt2, 207);
/* 169 */             i = 207;
/*     */             
/*     */ 
/*     */ 
/*     */             break label568;
/*     */             
/*     */ 
/* 176 */             if (i2 == 32) {
/* 177 */               i4 = 1;
/*     */             } else {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */           i3 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */         if (n == 0) {
/*     */           break label539;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */         SystemLibrary.sprintf(j, 103904, new Object[] { Integer.valueOf(i3 + 1), Integer.valueOf(paramInt1) });
/* 206 */         ffxmsg.call(5, j);
/* 207 */         switch (MainMemory.getI8(i5))
/*     */         {
/*     */         case 0: 
/*     */           break label528;
/*     */           
/*     */           break;
/*     */         case 9: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 218 */         ffxmsg.call(5, 84320);
/*     */         
/*     */         break label539;
/*     */         
/*     */         label528:
/* 223 */         ffxmsg.call(5, 75616);
/*     */         
/*     */ 
/*     */         label539:
/*     */         
/*     */ 
/* 229 */         MainMemory.setI32(paramInt2, 207);
/* 230 */         i = 207;
/*     */       }
/*     */       else
/*     */       {
/*     */         label560:
/*     */         
/*     */ 
/* 237 */         i = k;
/*     */       }
/*     */       
/*     */ 
/*     */       label568:
/*     */       
/* 243 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 248 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fftkey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */