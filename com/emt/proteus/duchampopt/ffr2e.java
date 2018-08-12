/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffr2e extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3576;
/*  12 */   public static final Function _instance = new ffr2e();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffr2e() { super("ffr2e", 4, false); }
/*     */   
/*     */   public int execute(float paramFloat, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramFloat, paramInt1, paramInt2, paramInt3);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
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
/*  37 */     call(f, i, j, k);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(float paramFloat, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     double d = 0.0D;
/*  45 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */         MainMemory.setI8(paramInt2, (byte)0);
/*  62 */         d = paramFloat;
/*  63 */         if (paramInt1 >= 0) {
/*     */           break label215;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         if (SystemLibrary.sprintf(paramInt2, 20160, new Object[] { Integer.valueOf(0 - paramInt1), Double.valueOf(d) }) >= 0) {
/*     */           break label116;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         ffxmsg.call(5, 95712);
/*  84 */         MainMemory.setI32(paramInt3, 402);
/*     */         
/*     */ 
/*     */         break label451;
/*     */         
/*     */         label116:
/*     */         
/*  91 */         if (SystemLibrary.strchr(paramInt2, 46) != 0) {
/*     */           break label280;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         if (SystemLibrary.strchr(paramInt2, 69) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */           if (SystemLibrary.sprintf(paramInt2, 20192, new Object[] { Double.valueOf(d) }) >= 0) {
/*     */             break label446;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */           ffxmsg.call(5, 95712);
/* 122 */           MainMemory.setI32(paramInt3, 402);
/*     */           
/*     */ 
/*     */           break label451;
/*     */           
/*     */           label215:
/*     */           
/* 129 */           if (SystemLibrary.sprintf(paramInt2, 20224, new Object[] { Integer.valueOf(paramInt1), Double.valueOf(d) }) >= 0) {
/*     */             break label280;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */           ffxmsg.call(5, 95712);
/* 140 */           MainMemory.setI32(paramInt3, 402);
/*     */           
/*     */           break label451;
/*     */         }
/*     */         
/*     */         label280:
/*     */         
/* 147 */         if (MainMemory.getI32(paramInt3) >= 1) {
/*     */           break label446;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */         i = SystemLibrary.strchr(paramInt2, 44);
/* 158 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */           MainMemory.setI8(i, (byte)46);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 174 */         if (SystemLibrary.strchr(paramInt2, 78) != 0) {
/*     */           break label423;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         if (SystemLibrary.strchr(paramInt2, 46) != 0) {
/*     */           break label446;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         if (SystemLibrary.strchr(paramInt2, 69) != 0) {
/*     */           break label446;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)46);
/*     */         
/*     */ 
/*     */         break label451;
/*     */         
/*     */         label423:
/*     */         
/* 211 */         ffxmsg.call(5, 104416);
/* 212 */         MainMemory.setI32(paramInt3, 402);
/*     */         
/*     */ 
/*     */         break label451;
/*     */       }
/*     */       
/*     */ 
/*     */       label446:
/*     */       
/*     */ 
/*     */       label451:
/*     */       
/* 224 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffr2e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */