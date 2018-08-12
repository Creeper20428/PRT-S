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
/*     */ public final class ffplsw
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3589;
/*  17 */   public static final Function _instance = new ffplsw();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffplsw() { super("ffplsw", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  24 */     call(paramInt1, paramInt2);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*     */     
/*     */ 
/*  53 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       i = MainMemory.alloc(81);
/*  58 */       j = MainMemory.alloc(71);
/*  59 */       k = MainMemory.alloc(71);
/*  60 */       m = MainMemory.alloc(81);
/*  61 */       n = MainMemory.alloc(71);
/*  62 */       i1 = MainMemory.alloc(73);
/*  63 */       i2 = MainMemory.alloc(4);
/*  64 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         MainMemory.setI32(i2, 0);
/*  75 */         MainMemory.setI8(j, (byte)0);
/*  76 */         MainMemory.setI8(i1, (byte)0);
/*  77 */         if (ffgcrd.call(paramInt1, 44384, i, i2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */           ffpsvc.call(i, j, i1, i2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  93 */         MainMemory.setI8(n, (byte)0);
/*  94 */         ffc2s.call(j, n, i2);
/*  95 */         if (MainMemory.getI32(i2) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           i3 = MainMemory.getI32(paramInt2);
/* 106 */           if (i3 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */             ffs2c.call(44416, k, i3);
/* 118 */             ffmkky.call(44384, k, 109088, m, paramInt2);
/* 119 */             ffprec.call(paramInt1, m, paramInt2);
/* 120 */             i3 = MainMemory.getI32(paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */           if (i3 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */             SystemLibrary.memcpy(m, 44000, 9, 1);
/* 140 */             SystemLibrary.strncat(m, 134880, 72);
/* 141 */             ffprec.call(paramInt1, m, paramInt2);
/* 142 */             i3 = MainMemory.getI32(paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */           if (i3 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */             SystemLibrary.memcpy(m, 44000, 9, 1);
/* 162 */             SystemLibrary.strncat(m, 139200, 72);
/* 163 */             ffprec.call(paramInt1, m, paramInt2);
/* 164 */             i3 = MainMemory.getI32(paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */           if (i3 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */             SystemLibrary.memcpy(m, 44000, 9, 1);
/* 184 */             SystemLibrary.strncat(m, 134976, 72);
/* 185 */             ffprec.call(paramInt1, m, paramInt2);
/* 186 */             i3 = MainMemory.getI32(paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */           if (i3 <= 0) {
/*     */             break label428;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       break label461;
/*     */       
/*     */ 
/*     */ 
/*     */       label428:
/*     */       
/*     */ 
/*     */ 
/* 210 */       SystemLibrary.memcpy(m, 44000, 9, 1);
/* 211 */       SystemLibrary.strncat(m, 115616, 72);
/* 212 */       ffprec.call(paramInt1, m, paramInt2);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label461:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffplsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */