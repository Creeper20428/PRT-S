/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class shared_unlock
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3129;
/*  14 */   public static final Function _instance = new shared_unlock();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public shared_unlock() { super("shared_unlock", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = call(i);
/*  30 */     paramFrame.setI32(paramInt1, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       if (!MainMemory.getI1(459056))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */         k = shared_init.call();
/*  61 */         if (k != 0) {
/*     */           break label245;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       if (paramInt < 0) {
/*  73 */         paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  83 */       else if (MainMemory.getI32Aligned(459504) <= paramInt)
/*     */       {
/*     */ 
/*     */ 
/*  87 */         paramInt = 151;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  94 */         m = MainMemory.getI32Aligned(458776);
/*  95 */         j = MainMemory.getI32(m + (paramInt << 4));
/*  96 */         if (j == 0) {
/*  97 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 107 */         else if (MainMemory.getI32(m + (paramInt << 4) + 8) == 0) {
/* 108 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 118 */         else if (MainMemory.getI8(j) != 74)
/*     */         {
/*     */ 
/*     */ 
/* 122 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 129 */         else if (MainMemory.getI8(j + 1) != 66)
/*     */         {
/*     */ 
/*     */ 
/* 133 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 140 */           k = MainMemory.getI8(j + 2) == 1 ? 0 : 151;
/*     */           
/*     */ 
/*     */ 
/*     */           label245:
/*     */           
/*     */ 
/*     */ 
/* 148 */           if (k != 0)
/*     */           {
/*     */ 
/*     */ 
/* 152 */             paramInt = k;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 159 */             m = MainMemory.getI32Aligned(458776);
/* 160 */             n = m + (paramInt << 4) + 8;
/* 161 */             i3 = MainMemory.getI32(n);
/* 162 */             if (i3 <= 0) {
/*     */               break label337;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */             i3 += -1;
/* 173 */             MainMemory.setI32(n, i3);
/* 174 */             i2 = i3;
/* 175 */             i3 = 0;
/*     */             
/*     */             break label389;
/*     */             
/*     */             label337:
/* 180 */             MainMemory.setI32(n, 0);
/* 181 */             i1 = MainMemory.getI32Aligned(458772) + paramInt * 28 + 20;
/* 182 */             MainMemory.setI32(i1, MainMemory.getI32(i1) + -1);
/* 183 */             i3 = MainMemory.getI32(n);
/* 184 */             i2 = i3;
/* 185 */             i3 = 1;
/*     */             
/*     */ 
/*     */ 
/*     */             label389:
/*     */             
/*     */ 
/*     */ 
/* 193 */             if (i2 != 0) {
/*     */               break label483;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */             if ((MainMemory.getI8(MainMemory.getI32Aligned(458772) + paramInt * 28 + 24) & 0xFF & 0x4) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */               k = shmdt.call(MainMemory.getI32(m + (paramInt << 4))) == 0 ? k : 155;
/* 216 */               MainMemory.setI32(MainMemory.getI32Aligned(458776) + (paramInt << 4), 0);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label483:
/*     */             
/*     */ 
/* 224 */             i = k == 0 ? F276460.call(paramInt, i3) : k;
/*     */             
/*     */ 
/*     */             break label515;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 232 */       i = paramInt;
/*     */       
/*     */ 
/*     */       label515:
/*     */       
/*     */ 
/* 238 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_unlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */