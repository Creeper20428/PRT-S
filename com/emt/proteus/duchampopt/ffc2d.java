/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffc2d
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3218;
/*  14 */   public static final Function _instance = new ffc2d();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffc2d() { super("ffc2d", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j, k);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     double d = 0.0D;
/*     */     
/*     */ 
/*  49 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       i = MainMemory.alloc(81);
/*  54 */       j = MainMemory.alloc(81);
/*  55 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */         k = MainMemory.getI8(paramInt1);
/*  66 */         switch (k) {
/*     */         case 0: 
/*     */           break label220;
/*     */           break;
/*     */         case 39: 
/*     */           break label196;
/*     */           break;
/*     */         case 70: 
/*     */           break label165;
/*     */           break;
/*     */         case 84: 
/*     */           break label165;
/*     */           break;
/*     */         case 40:  break; }
/*  80 */         MainMemory.setI32(paramInt3, 406);
/*     */         
/*     */         break label269;
/*     */         
/*     */         label165:
/*  85 */         d = k == 84 ? 1 : 0;
/*  86 */         MainMemory.setF64(paramInt2, d);
/*     */         
/*     */         break label249;
/*     */         
/*     */         label196:
/*  91 */         ffc2s.call(paramInt1, i, paramInt3);
/*  92 */         ffc2dd.call(i, paramInt2, paramInt3);
/*     */         
/*     */         break label249;
/*     */         
/*     */         label220:
/*  97 */         MainMemory.setI32(paramInt3, 204);
/*     */         
/*     */ 
/*     */ 
/*     */         break label314;
/*     */         
/*     */ 
/* 104 */         ffc2dd.call(paramInt1, paramInt2, paramInt3);
/*     */         
/*     */ 
/*     */         label249:
/*     */         
/*     */ 
/* 110 */         if (MainMemory.getI32(paramInt3) <= 0) {
/*     */           break label309;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label269:
/*     */         
/*     */ 
/*     */ 
/* 120 */         MainMemory.setF64(paramInt2, 0.0D);
/* 121 */         SystemLibrary.memcpy(j, 106144, 47, 1);
/* 122 */         SystemLibrary.strncat(j, paramInt1, 30);
/* 123 */         ffxmsg.call(5, j);
/*     */         
/*     */ 
/*     */ 
/*     */         break label314;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label309:
/*     */       
/*     */ 
/*     */ 
/*     */       label314:
/*     */       
/*     */ 
/*     */ 
/* 140 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffc2d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */