/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffd2e extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3575;
/*  12 */   public static final Function _instance = new ffd2e();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffd2e() { super("ffd2e", 4, false); }
/*     */   
/*     */   public int execute(double paramDouble, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramDouble, paramInt1, paramInt2, paramInt3);
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
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     call(d, i, j, k);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(double paramDouble, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */         MainMemory.setI8(paramInt2, (byte)0);
/*  61 */         if (paramInt1 >= 0) {
/*     */           break label209;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */         if (SystemLibrary.sprintf(paramInt2, 20160, new Object[] { Integer.valueOf(0 - paramInt1), Double.valueOf(paramDouble) }) >= 0) {
/*     */           break label110;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         ffxmsg.call(5, 95648);
/*  82 */         MainMemory.setI32(paramInt3, 402);
/*     */         
/*     */ 
/*     */         break label447;
/*     */         
/*     */         label110:
/*     */         
/*  89 */         if (SystemLibrary.strchr(paramInt2, 46) != 0) {
/*     */           break label274;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         if (SystemLibrary.strchr(paramInt2, 69) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */           if (SystemLibrary.sprintf(paramInt2, 20192, new Object[] { Double.valueOf(paramDouble) }) >= 0) {
/*     */             break label442;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */           ffxmsg.call(5, 95648);
/* 120 */           MainMemory.setI32(paramInt3, 402);
/*     */           
/*     */ 
/*     */           break label447;
/*     */           
/*     */           label209:
/*     */           
/* 127 */           if (SystemLibrary.sprintf(paramInt2, 20224, new Object[] { Integer.valueOf(paramInt1), Double.valueOf(paramDouble) }) >= 0) {
/*     */             break label274;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */           ffxmsg.call(5, 95648);
/* 138 */           MainMemory.setI32(paramInt3, 402);
/*     */           
/*     */           break label447;
/*     */         }
/*     */         
/*     */         label274:
/*     */         
/* 145 */         if (MainMemory.getI32(paramInt3) >= 1) {
/*     */           break label442;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         i = SystemLibrary.strchr(paramInt2, 44);
/* 156 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */           MainMemory.setI8(i, (byte)46);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 172 */         if (SystemLibrary.strchr(paramInt2, 78) != 0) {
/*     */           break label418;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         if (SystemLibrary.strchr(paramInt2, 46) != 0) {
/*     */           break label442;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         if (SystemLibrary.strchr(paramInt2, 69) != 0) {
/*     */           break label442;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 202 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)46);
/*     */         
/*     */ 
/*     */         break label447;
/*     */         
/*     */         label418:
/*     */         
/* 209 */         ffxmsg.call(5, 106720);
/* 210 */         MainMemory.setI32(paramInt3, 402);
/*     */         
/*     */ 
/*     */         break label447;
/*     */       }
/*     */       
/*     */ 
/*     */       label442:
/*     */       
/*     */ 
/*     */       label447:
/*     */       
/* 222 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffd2e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */