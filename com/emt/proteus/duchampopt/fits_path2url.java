/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_path2url extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3421;
/*  11 */   public static final Function _instance = new fits_path2url();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_path2url() { super("fits_path2url", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = call(i, j, k);
/*  33 */     paramFrame.setI32(paramInt1, m);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     byte b1 = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*     */     
/*     */ 
/*  49 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(1025);
/*  54 */       k = MainMemory.getI32(paramInt3);
/*  55 */       if (k <= 0) {
/*     */         break label70;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       i = k;
/*     */       
/*     */ 
/*     */       break label479;
/*     */       
/*     */       label70:
/*     */       
/*  72 */       i1 = MainMemory.getI8(paramInt1);
/*  73 */       if (i1 == 0) {
/*  74 */         n = 0;
/*     */         break label183;
/*     */       } else {
/*  77 */         b1 = i1;
/*  78 */         m = 0;
/*  79 */         n = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  90 */         i1 = MainMemory.getI8(paramInt1 + n);
/*  91 */         if ((b1 != 47) || (i1 != 47))
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
/* 102 */           MainMemory.setI8(j + m, b1);
/* 103 */           m += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         if (i1 == 0) {
/* 112 */           n = m;
/*     */         } else {
/*     */           break label459;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label183:
/*     */         
/*     */ 
/*     */ 
/* 123 */         MainMemory.setI8(j + n, (byte)0);
/* 124 */         if (k != 0) {
/*     */           break label440;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         i1 = MainMemory.getI8(j);
/* 136 */         if (i1 == 0) {
/* 137 */           paramInt1 = paramInt2;
/*     */           break label403;
/*     */         } else {
/* 140 */           k = 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label362:
/*     */         
/*     */ 
/*     */         label373:
/*     */         
/*     */         byte b2;
/*     */         
/*     */         for (;;)
/*     */         {
/* 153 */           paramInt1 = j + k;
/* 154 */           if (!com.emt.proteus.lib.api.MathUtils.ugt((byte)(i1 + -32), (byte)95))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */             if (MainMemory.getI8(144960 + ((i1 & 0xFF) + -32)) != 0) {
/*     */               break label362;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           MainMemory.setI8(paramInt2, (byte)37);
/* 175 */           MainMemory.setI8(paramInt2 + 1, MainMemory.getI8(58336 + (com.emt.proteus.lib.api.MathUtils.lshr(i1, 4) & 0xFF)));
/* 176 */           paramInt2 += 2;
/* 177 */           MainMemory.setI8(paramInt2, MainMemory.getI8(58336 + (i1 & 0xFF & 0xF)));
/*     */           
/*     */ 
/*     */           break label373;
/*     */           
/*     */ 
/* 183 */           MainMemory.setI8(paramInt2, i1);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 191 */           paramInt2 += 1;
/* 192 */           b2 = MainMemory.getI8(paramInt1);
/* 193 */           if (b2 == 0) {
/* 194 */             paramInt1 = paramInt2;
/*     */           } else {
/*     */             break label424;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label403:
/*     */           
/*     */ 
/*     */ 
/* 205 */           MainMemory.setI8(paramInt1, (byte)0);
/* 206 */           k = MainMemory.getI32(paramInt3);
/*     */           
/* 208 */           break;
/*     */           
/*     */           label424:
/*     */           
/* 212 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label440:
/*     */         
/*     */ 
/*     */ 
/* 221 */         MainMemory.setI32(paramInt3, k);
/* 222 */         i = k;
/* 223 */         break;
/*     */         
/*     */ 
/*     */         label459:
/*     */         
/*     */ 
/* 229 */         n += 1;
/* 230 */         b1 = b2;
/*     */       }
/*     */       
/*     */ 
/*     */       label479:
/*     */       
/* 236 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 241 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_path2url.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */