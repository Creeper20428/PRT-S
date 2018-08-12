/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffdtdmll extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3401;
/*  13 */   public static final Function _instance = new ffdtdmll();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffdtdmll() { super("ffdtdmll", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  21 */     return 0;
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
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i, j, k, m, n, i1);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     double d1 = 0.0D;
/*  57 */     long l1 = 0L;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     long l2 = 0L;
/*  62 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*  65 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       i = MainMemory.alloc(4);
/*  70 */       j = MainMemory.alloc(81);
/*  71 */       if (MainMemory.getI32(paramInt6) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         i1 = MainMemory.getI32(paramInt1);
/*  82 */         k = paramInt1 + 4;
/*  83 */         if (i1 != MainMemory.getI32(MainMemory.getI32(k) + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */           ffmahd.call(paramInt1, i1 + 1, 0, paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  99 */         if (paramInt3 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */           m = MainMemory.getI32(k);
/* 110 */           if (MainMemory.getI32(m + 916) >= paramInt3) {
/*     */             break label192;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */         MainMemory.setI32(paramInt6, 302);
/*     */         
/*     */ 
/*     */         break label745;
/*     */         
/*     */         label192:
/*     */         
/* 127 */         n = MainMemory.getI32(m + 944);
/* 128 */         paramInt3 += -1;
/* 129 */         if (MainMemory.getI8(paramInt2) != 0) {
/*     */           break label261;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         MainMemory.setI32(paramInt4, 1);
/* 140 */         MainMemory.setI64(paramInt5, MainMemory.getI64(n + paramInt3 * 152 + 84));
/*     */         
/*     */ 
/*     */         break label745;
/*     */         
/*     */         label261:
/*     */         
/* 147 */         MainMemory.setI32(paramInt4, 0);
/* 148 */         i3 = SystemLibrary.strchr(paramInt2, 40);
/* 149 */         MainMemory.setI32(i, i3);
/* 150 */         if (i3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 155 */           l2 = 1L;
/* 156 */           i2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 163 */           SystemLibrary.sprintf(j, 77120, new Object[] { Integer.valueOf(paramInt2) });
/* 164 */           MainMemory.setI32(paramInt6, 263);
/*     */           
/*     */ 
/*     */           break label745;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/* 174 */         if (i3 != 0) {
/*     */           break label572;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         i3 = SystemLibrary.strchr(i2, 41);
/* 185 */         MainMemory.setI32(i, i3);
/* 186 */         if (i3 != 0) {
/*     */           break label431;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */         SystemLibrary.sprintf(j, 77120, new Object[] { Integer.valueOf(paramInt2) });
/* 197 */         MainMemory.setI32(paramInt6, 263);
/* 198 */         break;
/*     */         
/*     */ 
/*     */         label431:
/*     */         
/*     */ 
/* 204 */         if (MainMemory.getI32(n + paramInt3 * 152 + 80) <= 0) {
/*     */           break label562;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */         l1 = MainMemory.getI64(n + paramInt3 * 152 + 84);
/* 215 */         if (l1 != l2)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */           d1 = l2;
/* 226 */           d2 = l1;
/* 227 */           SystemLibrary.sprintf(j, 135840, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 228 */           ffxmsg.call(5, j);
/* 229 */           ffxmsg.call(5, paramInt2);
/* 230 */           MainMemory.setI32(paramInt6, 263);
/* 231 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */         label562:
/*     */         
/* 237 */         break;
/*     */         
/*     */ 
/*     */         label572:
/*     */         
/*     */ 
/* 243 */         i3 += 1;
/* 244 */         MainMemory.setI32(i, i3);
/* 245 */         d1 = SystemLibrary.strtod(i3, i) + 0.1D;
/* 246 */         l1 = d1;
/* 247 */         i1 = MainMemory.getI32(paramInt4);
/* 248 */         if (i1 >= 9) {
/*     */           break label646;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */         MainMemory.setI64(paramInt5 + (i1 << 3), l1);
/*     */         
/*     */ 
/*     */         label646:
/*     */         
/*     */ 
/* 264 */         if (l1 >= 0L) {
/*     */           break label695;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */         ffxmsg.call(5, 111264);
/* 275 */         ffxmsg.call(5, paramInt2);
/* 276 */         MainMemory.setI32(paramInt6, 263);
/* 277 */         break;
/*     */         
/*     */ 
/*     */         label695:
/*     */         
/*     */ 
/* 283 */         l2 = l1 * l2;
/* 284 */         MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) + 1);
/* 285 */         i2 = MainMemory.getI32(i);
/* 286 */         i3 = SystemLibrary.strchr(i2, 44);
/* 287 */         MainMemory.setI32(i, i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label745:
/*     */       
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 299 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdtdmll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */