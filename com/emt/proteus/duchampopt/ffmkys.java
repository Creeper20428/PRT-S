/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffmkys
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3490;
/*  19 */   public static final Function _instance = new ffmkys();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public ffmkys() { super("ffmkys", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  26 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i1 = call(i, j, k, m, n);
/*  47 */     paramFrame.setI32(paramInt1, i1);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  53 */     int i = 0;
/*     */     
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*     */     
/*     */ 
/*  65 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       j = MainMemory.alloc(81);
/*  70 */       k = MainMemory.alloc(71);
/*  71 */       m = MainMemory.alloc(71);
/*  72 */       n = MainMemory.alloc(73);
/*  73 */       i1 = MainMemory.alloc(81);
/*  74 */       i2 = MainMemory.getI32(paramInt5);
/*  75 */       if (i2 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         MainMemory.setI8(k, (byte)0);
/*  87 */         MainMemory.setI8(n, (byte)0);
/*  88 */         if (ffgcrd.call(paramInt1, paramInt2, j, paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */           ffpsvc.call(j, k, n, paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 104 */         i2 = MainMemory.getI32(paramInt5);
/* 105 */         if (i2 <= 0) {
/*     */           break label179;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       i = i2;
/*     */       
/*     */ 
/*     */       break label448;
/*     */       
/*     */       label179:
/*     */       
/* 124 */       ffs2c.call(paramInt3, m, i2);
/* 125 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         if (MainMemory.getI8(paramInt4) != 38) {
/*     */           break label245;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       ffmkky.call(paramInt2, m, n, i1, paramInt5);
/*     */       
/*     */       break label261;
/*     */       
/*     */       label245:
/* 150 */       ffmkky.call(paramInt2, m, paramInt4, i1, paramInt5);
/*     */       
/*     */ 
/*     */       label261:
/*     */       
/*     */ 
/* 156 */       ffmkey.call(paramInt1, i1, paramInt5);
/* 157 */       i3 = MainMemory.getI32(paramInt1 + 4);
/* 158 */       i2 = (int)((MainMemory.getI64(i3 + 104) - MainMemory.getI64(MainMemory.getI32(i3 + 84) + (MainMemory.getI32(i3 + 64) << 3))) / 80L) + 1;
/* 159 */       ffc2s.call(k, m, paramInt5);
/* 160 */       i4 = SystemLibrary.strlen(m);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */       while (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */         if (MainMemory.getI8(m + (i4 + -1)) != 38) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */         ffgcnt.call(paramInt1, m, paramInt5);
/* 189 */         if (MainMemory.getI8(m) == 0) {
/* 190 */           i4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 200 */           ffdrec.call(paramInt1, i2, paramInt5);
/* 201 */           i4 = SystemLibrary.strlen(m);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 207 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       label448:
/*     */       
/*     */ 
/* 213 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 218 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmkys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */