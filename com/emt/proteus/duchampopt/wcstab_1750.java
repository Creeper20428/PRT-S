/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class wcstab_1750 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new wcstab_1750();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public wcstab_1750() { super("wcstab_1750", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (MainMemory.getI32(paramInt + 1544) == 137)
/*     */       {
/*  50 */         i = paramInt + 716;
/*  51 */         j = MainMemory.getI32(paramInt + 1612);
/*  52 */         if (MainMemory.getI32(i) == j)
/*     */         {
/*  54 */           MainMemory.setI32(i, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */         k = paramInt + 712;
/*  66 */         m = paramInt + 1608;
/*  67 */         n = MainMemory.getI32(m);
/*  68 */         if (MainMemory.getI32(k) == n)
/*     */         {
/*  70 */           MainMemory.setI32(k, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         if (j != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */           free.call(j);
/*  88 */           n = MainMemory.getI32(m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (n != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 103 */           i1 = paramInt + 704;
/* 104 */           if (MainMemory.getI32(i1) > 0)
/*     */           {
/* 106 */             i2 = 0;
/*     */             
/*     */ 
/*     */             do
/*     */             {
/* 111 */               tabfree.call(n + i2 * 92);
/* 112 */               i2 += 1;
/* 113 */               n = MainMemory.getI32(m);
/* 114 */             } while (MainMemory.getI32(i1) > i2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */           free.call(n);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcstab_1750.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */