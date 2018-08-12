/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F277734 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3132;
/*  12 */   public static final Function _instance = new F277734();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F277734() { super("F277734", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = call(i, j);
/*  31 */     paramFrame.setI32(paramInt1, k);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*     */     
/*     */ 
/*  43 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  47 */       j = MainMemory.alloc(24);
/*  48 */       if (!MainMemory.getI1(459056))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  58 */         k = shared_init.call();
/*  59 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*  63 */           paramInt1 = k;
/*     */           
/*     */ 
/*     */           break label439;
/*     */         }
/*     */       }
/*     */       
/*  70 */       k = MainMemory.getI32Aligned(459516);
/*  71 */       if (k == -1) {
/*  72 */         paramInt1 = 154;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  82 */       else if (paramInt1 < 0) {
/*  83 */         paramInt1 = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  93 */       else if (MainMemory.getI32Aligned(459504) <= paramInt1)
/*     */       {
/*     */ 
/*     */ 
/*  97 */         paramInt1 = 151;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 104 */         MainMemory.setI16(j, com.emt.proteus.lib.api.MathUtils.and((short)paramInt2, (short)1));
/* 105 */         MainMemory.setI16(j + 2, (short)0);
/* 106 */         MainMemory.setI64(j + 4, paramInt1);
/* 107 */         MainMemory.setI64(j + 12, 1L);
/* 108 */         if (MainMemory.getI1(459004)) {
/* 109 */           paramInt1 = k;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 119 */           SystemLibrary.printf(52800, new Object[] { Integer.valueOf(paramInt1) });
/* 120 */           paramInt1 = MainMemory.getI32Aligned(459516);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         if (SystemLibrary.fcntl(paramInt1, (paramInt2 & 0x2) == 0 ? 14 : 13, new int[] { j }) != -1) {
/*     */           break label396;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         switch (MainMemory.getI32(SystemLibrary.__errno_location()))
/*     */         {
/*     */         case 11: 
/*     */           break;
/*     */         case 13: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 150 */         if (MainMemory.getI1(459004)) {
/* 151 */           paramInt1 = 157;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 161 */           SystemLibrary.printf(35936, new Object[0]);
/* 162 */           i = 157;
/*     */           
/*     */ 
/*     */ 
/*     */           break label446;
/*     */           
/*     */ 
/* 169 */           if (MainMemory.getI1(459004)) {
/* 170 */             paramInt1 = 155;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 180 */             SystemLibrary.printf(21696, new Object[0]);
/* 181 */             i = 155;
/*     */             
/*     */ 
/*     */             break label446;
/*     */             
/*     */             label396:
/*     */             
/* 188 */             if (MainMemory.getI1(459004)) {
/* 189 */               paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 199 */               SystemLibrary.printf(18144, new Object[0]);
/* 200 */               i = 0;
/*     */               
/*     */               break label446;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       label439:
/* 208 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label446:
/*     */       
/*     */ 
/* 214 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 219 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F277734.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */