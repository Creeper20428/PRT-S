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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffppx
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3496;
/*  25 */   public static final Function _instance = new ffppx();
/*  26 */   public final Function resolve() { return _instance; }
/*     */   
/*  28 */   public ffppx() { super("ffppx", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5)
/*     */   {
/*  32 */     return call(paramInt1, paramInt2, paramInt3, paramLong, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i1 = call(i, j, k, l, m, n);
/*  56 */     paramFrame.setI32(paramInt1, i1);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5)
/*     */   {
/*  62 */     int i = 0;
/*     */     
/*  64 */     int j = 0;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*  69 */     long l1 = 0L;
/*  70 */     int i2 = 0;
/*  71 */     long l2 = 0L;
/*  72 */     int i3 = 0;
/*     */     
/*     */ 
/*  75 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  79 */       j = MainMemory.alloc(72);
/*  80 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         i1 = MainMemory.getI32(paramInt1);
/*  91 */         k = paramInt1 + 4;
/*  92 */         m = MainMemory.getI32(k);
/*  93 */         if (i1 != MainMemory.getI32(m + 64)) {
/*     */           break label159;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label176;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label262;
/*     */         } else {
/*     */           break label176;
/*     */         }
/*     */         
/*     */ 
/*     */         label159:
/*     */         
/* 122 */         ffmahd.call(paramInt1, i1 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label176:
/*     */         
/*     */ 
/* 128 */         m = MainMemory.getI32(k);
/* 129 */         if (MainMemory.getI32(m + 68) != 0) {
/*     */           break label224;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         n = m + 120;
/*     */         
/*     */         break label298;
/*     */         
/*     */         label224:
/*     */         
/* 145 */         if (MainMemory.getI32(m + 1012) != 0) {
/*     */           break label285;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         MainMemory.setI32(paramInt5, 233);
/*     */         
/*     */ 
/*     */         label262:
/*     */         
/*     */ 
/* 161 */         ffgiszll.call(paramInt1, 9, j, paramInt5);
/* 162 */         l1 = 1L;
/*     */         
/*     */         break label440;
/*     */         
/*     */         label285:
/* 167 */         n = m + 1040;
/*     */         
/*     */ 
/*     */ 
/*     */         label298:
/*     */         
/*     */ 
/*     */ 
/* 175 */         i1 = MainMemory.getI32(n);
/* 176 */         ffgiszll.call(paramInt1, 9, j, paramInt5);
/* 177 */         if (i1 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 181 */           l1 = 1L;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 188 */           i1 = i1 > 1 ? i1 : 1;
/* 189 */           l1 = 1L;
/* 190 */           l2 = 0L;
/* 191 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 200 */             l2 = (MainMemory.getI32(paramInt3 + (i2 << 2)) + -1) * l1 + l2;
/* 201 */             i3 = i2 + 1;
/* 202 */             l1 = MainMemory.getI64(j + (i2 << 3)) * l1;
/* 203 */             if (i3 == i1) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 209 */             i2 = i3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */           l1 = l2 + 1L;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label440:
/*     */         
/*     */ 
/* 224 */         switch (paramInt2) {
/*     */         case 11: 
/*     */           break label843;
/*     */           break;
/*     */         case 12: 
/*     */           break label822;
/*     */           break;
/*     */         case 20: 
/*     */           break label801;
/*     */           break;
/*     */         case 21: 
/*     */           break label780;
/*     */           break;
/*     */         case 30:  break label759;
/*     */           break; case 31:  break label738;
/*     */           break; case 40:  break label717;
/*     */           break; case 41:  break label696;
/*     */           break; case 81:  break label675;
/*     */           break; case 42:  break label653;
/*     */           break; case 82:  break; }
/* 244 */         ffpprd.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label653:
/* 249 */         ffppre.call(paramInt1, 1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label675:
/* 254 */         ffpprjj.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label696:
/* 259 */         ffpprj.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label717:
/* 264 */         ffppruj.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label738:
/* 269 */         ffpprk.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label759:
/* 274 */         ffppruk.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label780:
/* 279 */         ffppri.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label801:
/* 284 */         ffpprui.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label822:
/* 289 */         ffpprsb.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */         break label877;
/*     */         
/*     */         label843:
/* 294 */         ffpprb.call(paramInt1, l1, paramLong, paramInt4, paramInt5);
/*     */         
/*     */ 
/*     */         break label877;
/*     */         
/* 299 */         MainMemory.setI32(paramInt5, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label877:
/*     */       
/* 305 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 316 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffppx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */