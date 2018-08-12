/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffdrow_603
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  19 */   public static final Function _instance = new ffdrow_603();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public ffdrow_603() { super("ffdrow_603", 11, false); }
/*     */   
/*     */   public int execute(long paramLong1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong2, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  26 */     call(paramLong1, paramInt1, paramInt2, paramInt3, paramInt4, paramLong2, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*  27 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  60 */     paramInt4 += 2;
/*  61 */     paramInt3--;
/*  62 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  63 */     paramInt4 += 2;
/*  64 */     paramInt3--;
/*  65 */     call(l1, i, j, k, m, l2, n, i1, i2, i3, i4);
/*  66 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong2, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  72 */     long l1 = 0L;
/*  73 */     long l2 = 0L;
/*  74 */     long l3 = 0L;
/*  75 */     long l4 = 0L;
/*  76 */     int i = 0;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  81 */       Jump.label(280389);
/*  82 */       if (paramLong1 != 0L)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  87 */         if (MainMemory.getI32(paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */           MainMemory.setI8(paramInt9, (byte)0);
/*  94 */           MainMemory.setI8(paramInt5, (byte)0);
/*  95 */           if (ffgcrd.call(paramInt7, 36000, paramInt8, paramInt4) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 100 */             ffpsvc.call(paramInt8, paramInt9, paramInt5, paramInt4);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           Jump.label(280411);
/* 108 */           ffc2j.call(paramInt9, paramInt6, paramInt4);
/* 109 */           paramInt2 = MainMemory.getI32(paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */         Jump.label(280416);
/*     */         
/* 121 */         l1 = MainMemory.getI64(paramInt2 + 928);
/* 122 */         if (l1 < paramLong2)
/*     */         {
/* 124 */           ffxmsg.call(5, 139008);
/* 125 */           MainMemory.setI32(paramInt4, 307);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 132 */         else if (paramLong2 < 1L)
/*     */         {
/* 134 */           ffxmsg.call(5, 92576);
/* 135 */           MainMemory.setI32(paramInt4, 307);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 142 */           l2 = paramLong2 + -1L + paramLong1;
/* 143 */           if (l2 > l1)
/*     */           {
/* 145 */             ffxmsg.call(5, 120352);
/* 146 */             MainMemory.setI32(paramInt4, 307);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 153 */             l3 = MainMemory.getI64(paramInt6);
/* 154 */             paramLong2 = l3 * paramLong1;
/* 155 */             l4 = MainMemory.getI64(paramInt2 + 956) + MainMemory.getI64(paramInt2 + 948);
/* 156 */             l2 = l3 * l2;
/* 157 */             ffshft.call(paramInt7, MainMemory.getI64(paramInt2 + 112) + l2, l4 - l2, 0L - paramLong2, paramInt4);
/* 158 */             l2 = l4 + 2879L;
/* 159 */             i = (int)((paramLong2 - l4 + l2 - l2 % 2880L) / 2880L);
/* 160 */             if (i > 0)
/*     */             {
/* 162 */               ffdblk.call(paramInt7, i, paramInt4);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */             Jump.label(280477);
/* 173 */             paramInt6 = MainMemory.getI32(paramInt3) + 948;
/* 174 */             MainMemory.setI64(paramInt6, MainMemory.getI64(paramInt6) - paramLong2);
/* 175 */             MainMemory.setI32(paramInt1, 0);
/* 176 */             ffmkyj.call(paramInt7, 27296, MainMemory.getI64(MainMemory.getI32(paramInt3) + 948) << 32 >> 32, 14112, paramInt1);
/* 177 */             ffmkyj.call(paramInt7, 35712, l1 - paramLong1, 14112, paramInt4);
/* 178 */             paramInt6 = MainMemory.getI32(paramInt3) + 928;
/* 179 */             MainMemory.setI64(paramInt6, MainMemory.getI64(paramInt6) - paramLong1);
/* 180 */             paramInt6 = MainMemory.getI32(paramInt3) + 920;
/* 181 */             MainMemory.setI64(paramInt6, MainMemory.getI64(paramInt6) - paramLong1);
/* 182 */             ffcmph.call(paramInt7, paramInt4);
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
/* 205 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdrow_603.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */