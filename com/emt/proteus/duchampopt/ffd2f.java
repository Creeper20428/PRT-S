/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffd2f extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3574;
/*  12 */   public static final Function _instance = new ffd2f();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffd2f() { super("ffd2f", 3, false); }
/*     */   
/*     */   public int execute(double paramDouble, int paramInt1, int paramInt2)
/*     */   {
/*  19 */     call(paramDouble, paramInt1, paramInt2);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(d, i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(double paramDouble, int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */         MainMemory.setI8(paramInt1, (byte)0);
/*  58 */         if (SystemLibrary.sprintf(paramInt1, 20128, new Object[] { Integer.valueOf(0), Double.valueOf(paramDouble) }) >= 0) {
/*     */           break label84;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */         ffxmsg.call(5, 97440);
/*  69 */         MainMemory.setI32(paramInt2, 402);
/*     */         
/*     */ 
/*     */         label84:
/*     */         
/*     */ 
/*  75 */         i = SystemLibrary.strchr(paramInt1, 44);
/*  76 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */           MainMemory.setI8(i, (byte)46);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  92 */         if (SystemLibrary.strchr(paramInt1, 78) != 0) {
/*     */           break label151;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label169;
/*     */       
/*     */ 
/*     */ 
/*     */       label151:
/*     */       
/*     */ 
/*     */ 
/* 108 */       ffxmsg.call(5, 106656);
/* 109 */       MainMemory.setI32(paramInt2, 402);
/*     */       
/*     */ 
/*     */       label169:
/*     */       
/*     */ 
/* 115 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffd2f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */