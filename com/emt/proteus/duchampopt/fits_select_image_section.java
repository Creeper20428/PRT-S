/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class fits_select_image_section
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3007;
/*  17 */   public static final Function _instance = new fits_select_image_section();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public fits_select_image_section() { super("fits_select_image_section", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = call(i, j, k, m);
/*  42 */     paramFrame.setI32(paramInt1, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*     */     
/*     */ 
/*  58 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       j = MainMemory.alloc(4);
/*  63 */       if (ffinit.call(j, paramInt2, paramInt4) <= 0) {
/*     */         break label76;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       ffxmsg.call(5, 109536);
/*  74 */       ffxmsg.call(5, paramInt2);
/*     */       
/*     */       break label595;
/*     */       
/*     */       label76:
/*  79 */       i1 = MainMemory.getI32(paramInt1);
/*  80 */       k = MainMemory.getI32(i1);
/*  81 */       m = k + 1;
/*  82 */       if (MainMemory.getI32(MainMemory.getI32(i1 + 4) + 20) == 0)
/*     */       {
/*  84 */         n = 1;
/*     */       } else {
/*     */         break label249;
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
/*  97 */         if (n >= m) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         ffmahd.call(i1, n, 0, paramInt4);
/* 108 */         if (ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), paramInt4) <= 0) {
/*     */           break label206;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         ffclos.call(MainMemory.getI32(j), paramInt4);
/*     */         
/*     */         break label595;
/*     */         
/*     */         label206:
/* 123 */         n += 1;
/* 124 */         i1 = MainMemory.getI32(paramInt1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       ffmahd.call(i1, m, 0, paramInt4);
/* 132 */       i1 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label249:
/*     */       
/*     */ 
/*     */ 
/* 140 */       if (fits_copy_image_section.call(i1, MainMemory.getI32(j), paramInt3, paramInt4) <= 0) {
/*     */         break label297;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       ffclos.call(MainMemory.getI32(j), paramInt4);
/*     */       
/*     */       break label595;
/*     */       
/*     */       label297:
/* 155 */       i1 = MainMemory.getI32(paramInt1);
/* 156 */       n = k + 2;
/* 157 */       if (MainMemory.getI32(MainMemory.getI32(i1 + 4) + 20) != 0)
/*     */       {
/*     */ 
/*     */ 
/* 161 */         k = n;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 168 */         if (ffmahd.call(i1, n, 0, paramInt4) > 0) {
/* 169 */           k = n;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 179 */           k += 3;
/* 180 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 187 */             n = k + i2;
/* 188 */             ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), paramInt4);
/* 189 */             i2 += 1;
/* 190 */             if (ffmahd.call(MainMemory.getI32(paramInt1), n, 0, paramInt4) > 0) {
/* 191 */               k = n; break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */         n = MainMemory.getI32(paramInt4);
/* 204 */         if (n != 107) {
/*     */           break label481;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */         MainMemory.setI32(paramInt4, 0);
/*     */         
/*     */         break label519;
/*     */         
/*     */         label481:
/*     */         
/* 220 */         if (n <= 0) {
/*     */           break label519;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */         ffclos.call(MainMemory.getI32(j), paramInt4);
/*     */         
/*     */         break label595;
/*     */       }
/*     */       
/*     */       label519:
/* 237 */       ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 238 */       i1 = MainMemory.getI32(j);
/* 239 */       MainMemory.setI32(paramInt1, i1);
/* 240 */       if (k + -1 != m) {
/*     */         break label580;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */       fits_select_image_section_1504.call(paramInt4, i1, paramInt1);
/*     */       
/*     */       break label595;
/*     */       
/*     */       label580:
/* 255 */       ffmahd.call(i1, m, 0, paramInt4);
/*     */       
/*     */ 
/*     */       label595:
/*     */       
/*     */ 
/* 261 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 272 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_select_image_section.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */