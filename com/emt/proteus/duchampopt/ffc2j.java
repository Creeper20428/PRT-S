/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffc2j
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3221;
/*  15 */   public static final Function _instance = new ffc2j();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffc2j() { super("ffc2j", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     call(i, j, k);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     double d = 0.0D;
/*     */     
/*     */ 
/*  51 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       i = MainMemory.alloc(81);
/*  56 */       j = MainMemory.alloc(81);
/*  57 */       k = MainMemory.alloc(8);
/*  58 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */         m = MainMemory.getI8(paramInt1);
/*  69 */         switch (m) {
/*     */         case 0: 
/*     */           break label318;
/*     */           break;
/*     */         case 39: 
/*     */           break label211;
/*     */           break;
/*     */         case 70: 
/*     */           break label184;
/*     */           break;
/*     */         case 84: 
/*     */           break label184;
/*     */           break;
/*     */         case 40:  break; }
/*  83 */         ffc2s.call(paramInt1, i, paramInt3);
/*  84 */         MainMemory.setI32(paramInt3, 403);
/*     */         
/*     */         break label517;
/*     */         
/*     */         label184:
/*  89 */         MainMemory.setI64(paramInt2, m == 84 ? 1 : 0);
/*     */         
/*     */         break label497;
/*     */         
/*     */         label211:
/*  94 */         ffc2s.call(paramInt1, i, paramInt3);
/*  95 */         if (ffc2dd.call(i, k, paramInt3) >= 1) {
/*     */           break label497;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         d = MainMemory.getF64(k);
/* 106 */         if ((!MathUtils.f_ogt(d, 9.223372036854776E18D)) && (!MathUtils.f_olt(d, -9.223372036854776E18D))) {
/*     */           break label301;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         MainMemory.setI32(paramInt3, 412);
/*     */         
/*     */         break label517;
/*     */         
/*     */         label301:
/* 121 */         MainMemory.setI64(paramInt2, d);
/*     */         
/*     */         break label497;
/*     */         
/*     */         label318:
/* 126 */         MainMemory.setI32(paramInt3, 204);
/*     */         
/*     */ 
/*     */ 
/*     */         break label562;
/*     */         
/*     */ 
/* 133 */         if (SystemLibrary.strchr(paramInt1, 46) != 0) {
/*     */           break label418;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         if (SystemLibrary.strchr(paramInt1, 69) != 0) {
/*     */           break label418;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         if (SystemLibrary.strchr(paramInt1, 68) != 0) {
/*     */           break label418;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         ffc2jj.call(paramInt1, paramInt2, paramInt3);
/*     */         
/*     */         break label497;
/*     */         
/*     */         label418:
/* 168 */         ffc2dd.call(paramInt1, k, paramInt3);
/* 169 */         d = MainMemory.getF64(k);
/* 170 */         if ((!MathUtils.f_ogt(d, 9.223372036854776E18D)) && (!MathUtils.f_olt(d, -9.223372036854776E18D))) {
/*     */           break label485;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */         MainMemory.setI32(paramInt3, 412);
/*     */         
/*     */         break label517;
/*     */         
/*     */         label485:
/* 185 */         MainMemory.setI64(paramInt2, d);
/*     */         
/*     */ 
/*     */         label497:
/*     */         
/*     */ 
/* 191 */         if (MainMemory.getI32(paramInt3) <= 0) {
/*     */           break label557;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label517:
/*     */         
/*     */ 
/*     */ 
/* 201 */         MainMemory.setI64(paramInt2, 0L);
/* 202 */         SystemLibrary.memcpy(j, 118560, 53, 1);
/* 203 */         SystemLibrary.strncat(j, paramInt1, 30);
/* 204 */         ffxmsg.call(5, j);
/*     */         
/*     */ 
/*     */ 
/*     */         break label562;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label557:
/*     */       
/*     */ 
/*     */ 
/*     */       label562:
/*     */       
/*     */ 
/*     */ 
/* 221 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffc2j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */