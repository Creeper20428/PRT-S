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
/*     */ public final class ffgtnm
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3434;
/*  16 */   public static final Function _instance = new ffgtnm();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgtnm() { super("ffgtnm", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = call(i, j, k);
/*  38 */     paramFrame.setI32(paramInt1, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*     */     
/*     */ 
/*  53 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       j = MainMemory.alloc(71);
/*  58 */       k = MainMemory.alloc(81);
/*  59 */       m = MainMemory.alloc(71);
/*  60 */       n = MainMemory.alloc(73);
/*  61 */       i1 = MainMemory.getI32(paramInt3);
/*  62 */       if (i1 != 0) {
/*     */         break label324;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       MainMemory.setI8(m, (byte)0);
/*  73 */       MainMemory.setI8(n, (byte)0);
/*  74 */       if (i1 <= 0)
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
/*  85 */         if (ffgcrd.call(paramInt1, 40928, k, paramInt3) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */           ffpsvc.call(k, m, n, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 101 */         i1 = MainMemory.getI32(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */       if (i1 == 202) {
/* 110 */         i1 = 340;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 120 */         prepare_keyvalue.call(m);
/* 121 */         if (SystemLibrary.strcasecmp(m, 44224) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */           MainMemory.setI32(paramInt3, 340);
/* 132 */           ffxmsg.call(5, 106528);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 138 */         i1 = MainMemory.getI32(paramInt3);
/* 139 */         if (i1 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */           MainMemory.setI8(j, (byte)0);
/* 151 */           MainMemory.setI8(n, (byte)0);
/* 152 */           if (ffgcrd.call(paramInt1, 35712, k, paramInt3) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */             ffpsvc.call(k, j, n, paramInt3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 168 */           ffc2i.call(j, paramInt2, paramInt3);
/* 169 */           i1 = MainMemory.getI32(paramInt3);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */       MainMemory.setI32(paramInt3, i1);
/* 178 */       i = i1;
/*     */       
/*     */ 
/*     */       break label332;
/*     */       
/*     */       label324:
/*     */       
/* 185 */       i = i1;
/*     */       
/*     */ 
/*     */       label332:
/*     */       
/*     */ 
/* 191 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 196 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtnm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */