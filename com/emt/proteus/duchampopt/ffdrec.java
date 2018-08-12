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
/*     */ public final class ffdrec
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3478;
/*  16 */   public static final Function _instance = new ffdrec();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffdrec() { super("ffdrec", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     long l1 = 0L;
/*  51 */     int i1 = 0;
/*  52 */     long l2 = 0L;
/*  53 */     long l3 = 0L;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     long l4 = 0L;
/*  57 */     int i4 = 0;
/*     */     
/*     */ 
/*  60 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.alloc(81);
/*  65 */       j = MainMemory.alloc(81);
/*  66 */       k = MainMemory.alloc(81);
/*  67 */       if (MainMemory.getI32(paramInt3) <= 0) {
/*     */         break label93;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label561;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label93:
/*     */       
/*     */ 
/*     */ 
/*  83 */       i1 = MainMemory.getI32(paramInt1);
/*  84 */       m = paramInt1 + 4;
/*  85 */       if (i1 != MainMemory.getI32(MainMemory.getI32(m) + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         ffmahd.call(paramInt1, i1 + 1, 0, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 101 */       if (paramInt2 >= 1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         n = MainMemory.getI32(m);
/* 112 */         l2 = MainMemory.getI64(MainMemory.getI32(n + 84) + (MainMemory.getI32(n + 64) << 3));
/* 113 */         if (paramInt2 <= MainMemory.getI64(n + 88) - l2 / 80L) {
/*     */           break label243;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       MainMemory.setI32(paramInt3, 203);
/*     */       
/*     */ 
/*     */       break label561;
/*     */       
/*     */       label243:
/*     */       
/* 130 */       MainMemory.setI64(n + 104, l2 + (paramInt2 * 80 + -80));
/* 131 */       n = MainMemory.getI32(m);
/* 132 */       l1 = MainMemory.getI64(n + 88);
/* 133 */       l2 = (l1 - MainMemory.getI64(n + 104)) / 80L;
/* 134 */       i1 = (int)l2;
/* 135 */       if (i1 >= 1) {
/*     */         break label362;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       SystemLibrary.sprintf(k, 119136, new Object[] { Integer.valueOf(paramInt2) });
/* 146 */       ffxmsg.call(5, k);
/* 147 */       MainMemory.setI32(paramInt3, 203);
/*     */       
/*     */ 
/*     */       break label561;
/*     */       
/*     */       label362:
/*     */       
/* 154 */       SystemLibrary.memcpy(j, 93216, 41, 1);
/* 155 */       SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 93216, 41, 1);
/* 156 */       if (i1 <= 0) {
/*     */         break label535;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */       l2 &= 0xFFFFFFFF;
/* 168 */       l1 += -80L;
/* 169 */       l3 = 0L;
/* 170 */       i2 = j;
/* 171 */       i3 = i;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 180 */         l4 = l1 + l3 * -80L;
/* 181 */         ffmbyt.call(paramInt1, l4, 0, paramInt3);
/* 182 */         ffgbyt.call(paramInt1, 80L, i3, paramInt3);
/* 183 */         ffmbyt.call(paramInt1, l4, 0, paramInt3);
/* 184 */         ffpbyt.call(paramInt1, 80L, i2, paramInt3);
/* 185 */         l3 += 1L;
/* 186 */         if (l3 == l2) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/* 191 */         i2 = i3;
/* 192 */         i3 = i2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       n = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */ 
/*     */       label535:
/*     */       
/*     */ 
/*     */ 
/* 207 */       i4 = n + 88;
/* 208 */       MainMemory.setI64(i4, MainMemory.getI64(i4) + -80L);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label561:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdrec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */