/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F276460 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3112;
/*  11 */   public static final Function _instance = new F276460();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F276460() { super("F276460", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = call(i, j);
/*  30 */     paramFrame.setI32(paramInt1, k);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*     */     
/*     */ 
/*  42 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  46 */       j = MainMemory.alloc(24);
/*  47 */       k = MainMemory.getI32Aligned(459516);
/*  48 */       if (k == -1) {
/*  49 */         paramInt1 = 154;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  59 */       else if (paramInt1 < 0) {
/*  60 */         paramInt1 = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  70 */       else if (MainMemory.getI32Aligned(459504) <= paramInt1)
/*     */       {
/*     */ 
/*     */ 
/*  74 */         paramInt1 = 151;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  81 */         MainMemory.setI16(j, (short)2);
/*  82 */         MainMemory.setI16(j + 2, (short)0);
/*  83 */         MainMemory.setI64(j + 4, paramInt1);
/*  84 */         MainMemory.setI64(j + 12, 1L);
/*  85 */         if (MainMemory.getI1(459004)) {
/*  86 */           paramInt1 = k;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  96 */           SystemLibrary.printf(55264, new Object[] { Integer.valueOf(paramInt1) });
/*  97 */           paramInt1 = MainMemory.getI32Aligned(459516);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         if (SystemLibrary.fcntl(paramInt1, 14, new int[] { j }) != -1) {
/*     */           break label336;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         switch (MainMemory.getI32(SystemLibrary.__errno_location()))
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
/* 127 */         if (MainMemory.getI1(459004)) {
/* 128 */           paramInt1 = 157;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 138 */           SystemLibrary.printf(35936, new Object[0]);
/* 139 */           i = 157;
/*     */           
/*     */ 
/*     */ 
/*     */           break label392;
/*     */           
/*     */ 
/* 146 */           if (MainMemory.getI1(459004)) {
/* 147 */             paramInt1 = 155;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 157 */             SystemLibrary.printf(21696, new Object[0]);
/* 158 */             i = 155;
/*     */             
/*     */ 
/*     */             break label392;
/*     */             
/*     */             label336:
/*     */             
/* 165 */             if (MainMemory.getI1(459004)) {
/* 166 */               paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 176 */               SystemLibrary.printf(51456, new Object[] { Integer.valueOf(paramInt2) });
/* 177 */               i = 0;
/*     */               
/*     */               break label392;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 185 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label392:
/*     */       
/*     */ 
/* 191 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 196 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F276460.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */