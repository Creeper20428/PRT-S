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
/*     */ public final class ffc2l
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3223;
/*  15 */   public static final Function _instance = new ffc2l();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffc2l() { super("ffc2l", 3, false); }
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
/*  48 */     int n = 0;
/*     */     
/*     */ 
/*  51 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       i = MainMemory.alloc(81);
/*  56 */       j = MainMemory.alloc(81);
/*  57 */       k = MainMemory.alloc(4);
/*  58 */       m = MainMemory.alloc(8);
/*  59 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */         n = MainMemory.getI8(paramInt1);
/*  70 */         switch (n) {
/*     */         case 0: 
/*     */           break label213;
/*     */           break;
/*     */         case 39: 
/*     */           break label189;
/*     */           break;
/*     */         case 70: 
/*     */           break;
/*     */         case 84: 
/*     */           break;
/*     */         case 40: 
/*     */           break label189;
/*     */           break;
/*     */         }
/*  85 */         MainMemory.setI32(paramInt2, n == 84 ? 1 : 0);
/*  86 */         n = 76;
/*     */         
/*     */         break label335;
/*     */         
/*     */         label189:
/*  91 */         ffc2s.call(paramInt1, i, paramInt3);
/*  92 */         MainMemory.setI32(paramInt3, 404);
/*     */         
/*     */         break label355;
/*     */         
/*     */         label213:
/*  97 */         MainMemory.setI32(paramInt3, 204);
/*     */         
/*     */ 
/*     */ 
/*     */         break label555;
/*     */         
/*     */ 
/* 104 */         if (SystemLibrary.strchr(paramInt1, 46) != 0) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         if (SystemLibrary.strchr(paramInt1, 69) != 0) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */         if (SystemLibrary.strchr(paramInt1, 68) != 0) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         ffc2ii.call(paramInt1, k, paramInt3);
/* 135 */         n = 73;
/*     */         
/*     */         break label335;
/*     */         
/*     */         label318:
/* 140 */         ffc2dd.call(paramInt1, m, paramInt3);
/* 141 */         n = 70;
/*     */         
/*     */ 
/*     */ 
/*     */         label335:
/*     */         
/*     */ 
/* 148 */         if (MainMemory.getI32(paramInt3) <= 0) {
/*     */           break label395;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label355:
/*     */         
/*     */ 
/*     */ 
/* 158 */         MainMemory.setI32(paramInt2, 0);
/* 159 */         SystemLibrary.memcpy(j, 108064, 48, 1);
/* 160 */         SystemLibrary.strncat(j, paramInt1, 30);
/* 161 */         ffxmsg.call(5, j);
/*     */         
/*     */ 
/*     */         break label555;
/*     */         
/*     */         label395:
/*     */         
/* 168 */         switch (n)
/*     */         {
/*     */         case 73: 
/*     */           break label499;
/*     */           
/*     */           break;
/*     */         case 70: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 179 */         if (!MathUtils.f_une(MainMemory.getF64(m), 0.0D)) {
/*     */           break label484;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */         MainMemory.setI32(paramInt2, 1);
/*     */         
/*     */ 
/*     */         break label555;
/*     */         
/*     */         label484:
/*     */         
/* 196 */         MainMemory.setI32(paramInt2, 0);
/*     */         
/*     */ 
/*     */         break label555;
/*     */         
/*     */         label499:
/*     */         
/* 203 */         if (MainMemory.getI32(k) != 0) {
/*     */           break label535;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */         MainMemory.setI32(paramInt2, 0);
/*     */         
/*     */ 
/*     */         break label555;
/*     */         
/*     */         label535:
/*     */         
/* 220 */         MainMemory.setI32(paramInt2, 1);
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label555:
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
/* 237 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffc2l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */