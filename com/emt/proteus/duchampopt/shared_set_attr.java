/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class shared_set_attr extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3128;
/*  12 */   public static final Function _instance = new shared_set_attr();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public shared_set_attr() { super("shared_set_attr", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  43 */       if (!MainMemory.getI1(459056))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  53 */         i = shared_init.call();
/*  54 */         if (i != 0) {
/*     */           break label203;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       if (paramInt >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         if (MainMemory.getI32Aligned(459504) <= paramInt) {
/*     */           break label279;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         j = MainMemory.getI32Aligned(458776);
/*  86 */         k = MainMemory.getI32(j + (paramInt << 4));
/*  87 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */           if (MainMemory.getI32(j + (paramInt << 4) + 8) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */             if (MainMemory.getI8(k) != 74) {
/*     */               break label279;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */             if (MainMemory.getI8(k + 1) != 66) {
/*     */               break label279;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */             i = MainMemory.getI8(k + 2) == 1 ? 0 : 151;
/*     */             
/*     */ 
/*     */ 
/*     */             label203:
/*     */             
/*     */ 
/*     */ 
/* 135 */             if (i != 0) {
/*     */               break label279;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */             if (MainMemory.getI32(MainMemory.getI32Aligned(458776) + (paramInt << 4) + 8) != -1) {
/*     */               break label279;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */             MainMemory.setI8(MainMemory.getI32Aligned(458772) + paramInt * 28 + 24, (byte)4);
/*     */             
/*     */ 
/*     */             break label284;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label279:
/*     */       
/*     */       label284:
/*     */       
/* 167 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_set_attr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */