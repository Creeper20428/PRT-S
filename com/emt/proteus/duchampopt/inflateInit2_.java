/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class inflateInit2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3697;
/*  12 */   public static final Function _instance = new inflateInit2_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public inflateInit2_() { super("inflateInit2_", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (paramInt == 0) {
/*  49 */         i3 = -2;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  59 */         MainMemory.setI32(paramInt + 24, 0);
/*  60 */         j = paramInt + 32;
/*  61 */         k = MainMemory.getI32(j);
/*  62 */         if (k != 0) {
/*     */           break label98;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         MainMemory.setI32(j, 3686);
/*  74 */         MainMemory.setI32(paramInt + 40, 0);
/*  75 */         k = 3686;
/*     */         
/*     */ 
/*     */ 
/*     */         label98:
/*     */         
/*     */ 
/*  82 */         m = paramInt + 36;
/*  83 */         if (MainMemory.getI32(m) != 0) {
/*     */           break label138;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         MainMemory.setI32(m, 3685);
/*     */         
/*     */ 
/*     */         label138:
/*     */         
/*     */ 
/*  99 */         n = paramInt + 40;
/* 100 */         i1 = com.emt.proteus.runtime.api.SystemLibrary.do_indirect(k, MainMemory.getI32(n), 1, 7116);
/* 101 */         if (i1 == 0) {
/* 102 */           i3 = -4;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 112 */           i2 = paramInt + 28;
/* 113 */           MainMemory.setI32(i2, i1);
/* 114 */           MainMemory.setI32(i1 + 52, 0);
/* 115 */           i3 = inflateReset2.call(paramInt);
/* 116 */           if (i3 != 0) {
/*     */             break label237;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       i = i3;
/*     */       
/*     */ 
/*     */       break label267;
/*     */       
/*     */       label237:
/*     */       
/* 135 */       com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(m), MainMemory.getI32(n), i1);
/* 136 */       MainMemory.setI32(i2, 0);
/* 137 */       i = i3;
/*     */       
/*     */ 
/*     */       label267:
/*     */       
/*     */ 
/* 143 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/inflateInit2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */