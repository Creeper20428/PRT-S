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
/*     */ public final class shared_free
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3134;
/*  18 */   public static final Function _instance = new shared_free();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public shared_free() { super("shared_free", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  25 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = call(i);
/*  34 */     paramFrame.setI32(paramInt1, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*     */     
/*     */ 
/*  51 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       j = MainMemory.alloc(6);
/*  56 */       n = F277734.call(paramInt, 1);
/*  57 */       if (n != 0) {
/*     */         break label227;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       k = MainMemory.getI32(MainMemory.getI32Aligned(458776) + (paramInt << 4));
/*  69 */       if (k != 0) {
/*     */         break label150;
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
/*  81 */       n = F276539.call(paramInt);
/*  82 */       if (n != 0) {
/*     */         break label134;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       k = MainMemory.getI32(MainMemory.getI32Aligned(458776) + (paramInt << 4));
/*     */       
/*     */ 
/*     */       break label150;
/*     */       
/*     */       label134:
/*     */       
/*  99 */       F276460.call(paramInt, 1);
/*     */       
/*     */ 
/*     */       break label227;
/*     */       
/*     */ 
/*     */       label150:
/*     */       
/* 107 */       if (MainMemory.getI8(k) != 74) {
/*     */         break label216;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       if (MainMemory.getI8(k + 1) != 66) {
/*     */         break label216;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       if (MainMemory.getI8(k + 2) != 1)
/*     */       {
/*     */         label216:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         F276460.call(paramInt, 1);
/*     */         
/*     */ 
/*     */ 
/*     */         label227:
/*     */         
/*     */ 
/*     */ 
/* 145 */         if (n != 0) {
/*     */           break label729;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */       n = MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt * 28);
/* 156 */       if (!MainMemory.getI1(459004))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         SystemLibrary.printf(59872, new Object[0]);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 172 */       if (n == -1) {
/* 173 */         n = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 183 */         MainMemory.setI16(j, (short)0);
/* 184 */         MainMemory.setI16(j + 2, (short)-1);
/* 185 */         MainMemory.setI16(j + 4, (short)4096);
/* 186 */         m = semop.call(n, j, 1) == -1 ? 1 : 0;
/* 187 */         n = m != 0 ? 155 : 0;
/* 188 */         if (m == 0) {
/*     */           break label404;
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
/* 200 */       F276460.call(paramInt, 1);
/* 201 */       i = n;
/*     */       
/*     */ 
/*     */       break label737;
/*     */       
/*     */       label404:
/*     */       
/* 208 */       i1 = MainMemory.getI32Aligned(458776);
/* 209 */       i2 = i1 + (paramInt << 4) + 4;
/* 210 */       i3 = MainMemory.getI32(i2) + -1;
/* 211 */       MainMemory.setI32(i2, i3);
/* 212 */       if (i3 <= 0) {
/*     */         break label471;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */       i = F276460.call(paramInt, 1);
/*     */       
/*     */ 
/*     */       break label737;
/*     */       
/*     */       label471:
/*     */       
/* 229 */       if (shmdt.call(MainMemory.getI32(i1 + (paramInt << 4))) != 0) {
/*     */         break label709;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */       i1 = MainMemory.getI32Aligned(458776);
/* 240 */       MainMemory.setI32(i1 + (paramInt << 4), 0);
/* 241 */       MainMemory.setI32(i1 + (paramInt << 4) + 12, 0);
/* 242 */       switch (semctl.call(MainMemory.getI32(MainMemory.getI32Aligned(458772) + paramInt * 28), 0, 12, new Object[] { Integer.valueOf(0) }))
/*     */       {
/*     */       case -1: 
/*     */         break label663;
/*     */         
/*     */ 
/*     */         break;
/*     */       case 0: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 254 */       if ((MainMemory.getI8(MainMemory.getI32Aligned(458772) + paramInt * 28 + 24) & 0xFF & 0x8) != 0) {
/*     */         break label683;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */       n = F276629.call(paramInt);
/*     */       
/*     */       break label683;
/*     */       
/*     */       label663:
/*     */       
/* 271 */       F276460.call(paramInt, 1);
/* 272 */       i = 155;
/*     */       
/*     */ 
/*     */       break label737;
/*     */       
/*     */ 
/*     */       label683:
/*     */       
/* 280 */       i = n == 0 ? F276460.call(paramInt, 1) : n;
/*     */       
/*     */ 
/*     */       break label737;
/*     */       
/*     */       label709:
/*     */       
/* 287 */       F276460.call(paramInt, 1);
/* 288 */       i = 155;
/*     */       
/*     */ 
/*     */       break label737;
/*     */       
/*     */       label729:
/*     */       
/* 295 */       i = n;
/*     */       
/*     */ 
/*     */       label737:
/*     */       
/*     */ 
/* 301 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 306 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_free.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */