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
/*     */ public final class ffc2i
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3224;
/*  15 */   public static final Function _instance = new ffc2i();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffc2i() { super("ffc2i", 3, false); }
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
/*     */           break label317;
/*     */           break;
/*     */         case 39: 
/*     */           break label210;
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
/*     */         break label516;
/*     */         
/*     */         label184:
/*  89 */         MainMemory.setI32(paramInt2, m == 84 ? 1 : 0);
/*     */         
/*     */         break label496;
/*     */         
/*     */         label210:
/*  94 */         ffc2s.call(paramInt1, i, paramInt3);
/*  95 */         if (ffc2dd.call(i, k, paramInt3) >= 1) {
/*     */           break label496;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         d = MainMemory.getF64(k);
/* 106 */         if ((!MathUtils.f_ogt(d, 2.147483647E9D)) && (!MathUtils.f_olt(d, -2.147483648E9D))) {
/*     */           break label300;
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
/*     */         break label516;
/*     */         
/*     */         label300:
/* 121 */         MainMemory.setI32(paramInt2, (int)d);
/*     */         
/*     */         break label496;
/*     */         
/*     */         label317:
/* 126 */         MainMemory.setI32(paramInt3, 204);
/*     */         
/*     */ 
/*     */ 
/*     */         break label561;
/*     */         
/*     */ 
/* 133 */         if (SystemLibrary.strchr(paramInt1, 46) != 0) {
/*     */           break label417;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         if (SystemLibrary.strchr(paramInt1, 69) != 0) {
/*     */           break label417;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         if (SystemLibrary.strchr(paramInt1, 68) != 0) {
/*     */           break label417;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         ffc2ii.call(paramInt1, paramInt2, paramInt3);
/*     */         
/*     */         break label496;
/*     */         
/*     */         label417:
/* 168 */         ffc2dd.call(paramInt1, k, paramInt3);
/* 169 */         d = MainMemory.getF64(k);
/* 170 */         if ((!MathUtils.f_ogt(d, 2.147483647E9D)) && (!MathUtils.f_olt(d, -2.147483648E9D))) {
/*     */           break label484;
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
/*     */         break label516;
/*     */         
/*     */         label484:
/* 185 */         MainMemory.setI32(paramInt2, (int)d);
/*     */         
/*     */ 
/*     */         label496:
/*     */         
/*     */ 
/* 191 */         if (MainMemory.getI32(paramInt3) <= 0) {
/*     */           break label556;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label516:
/*     */         
/*     */ 
/*     */ 
/* 201 */         MainMemory.setI32(paramInt2, 0);
/* 202 */         SystemLibrary.memcpy(j, 111136, 49, 1);
/* 203 */         SystemLibrary.strncat(j, paramInt1, 30);
/* 204 */         ffxmsg.call(5, j);
/*     */         
/*     */ 
/*     */ 
/*     */         break label561;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label556:
/*     */       
/*     */ 
/*     */ 
/*     */       label561:
/*     */       
/*     */ 
/*     */ 
/* 221 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffc2i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */