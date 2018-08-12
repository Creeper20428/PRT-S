/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ngp_keyword_is_write extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3446;
/*  11 */   public static final Function _instance = new ngp_keyword_is_write();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ngp_keyword_is_write() { super("ngp_keyword_is_write", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = call(i);
/*  27 */     paramFrame.setI32(paramInt1, j);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  33 */     int i = 0;
/*     */     
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  44 */       if (paramInt == 0) {
/*  45 */         k = 362;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  55 */         j = paramInt + 4;
/*  56 */         k = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  63 */         if (k == 10) {
/*  64 */           k = 0;
/*     */         } else {
/*     */           break label195;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  75 */           if (k == 3) {
/*  76 */             k = 0;
/*  77 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */           m = MainMemory.getI32(56864 + (k << 2));
/*  87 */           n = SystemLibrary.strlen(m);
/*  88 */           if (!com.emt.proteus.lib.api.MathUtils.ugt(n + -1, 4))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */             if (SystemLibrary.strncmp(m, j, n) != 0) {
/*     */               break label181;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */             i = com.emt.proteus.lib.api.MathUtils.ugt((byte)(MainMemory.getI8(paramInt + 4 + n) + -49), (byte)8) ? 0 : 368;
/*     */             
/*     */             break label254;
/*     */           }
/*     */           
/*     */           label181:
/*     */           
/* 115 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label195:
/*     */         
/* 121 */         if (SystemLibrary.strcmp(MainMemory.getI32(99552 + (k << 2)), j) == 0) {
/* 122 */           k = 368;
/*     */         } else {
/*     */           break label240;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         i = k;
/* 134 */         break;
/*     */         
/*     */ 
/*     */         label240:
/*     */         
/*     */ 
/* 140 */         k += 1;
/*     */       }
/*     */       
/*     */       label254:
/*     */       
/* 145 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_keyword_is_write.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */