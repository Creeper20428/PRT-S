/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffrdef_1408
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  20 */   public static final Function _instance = new ffrdef_1408();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffrdef_1408() { super("ffrdef_1408", 14, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
/*     */   {
/*  27 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14);
/*  28 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  70 */     paramInt4 += 2;
/*  71 */     paramInt3--;
/*  72 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  73 */     paramInt4 += 2;
/*  74 */     paramInt3--;
/*  75 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9);
/*  76 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
/*     */   {
/*  82 */     long l1 = 0L;
/*  83 */     long l2 = 0L;
/*  84 */     double d = 0.0D;
/*  85 */     int i = 0;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  90 */       Jump.label(321849);
/*  91 */       if (MainMemory.getI32(paramInt13 + 72) == 1)
/*     */       {
/*  93 */         if (MainMemory.getI64(paramInt13 + 112) != -1L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  98 */           if (MainMemory.getI32(paramInt13 + 68) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */             MainMemory.setI64(paramInt13 + 104, MainMemory.getI64(MainMemory.getI32(paramInt13 + 84) + (paramInt2 << 3)) + 80L);
/* 105 */             MainMemory.setI8(paramInt5, (byte)0);
/* 106 */             MainMemory.setI8(paramInt4, (byte)0);
/* 107 */             if (ffgcrd.call(paramInt14, 35712, paramInt6, paramInt11) <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 112 */               ffpsvc.call(paramInt6, paramInt5, paramInt4, paramInt11);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */             Jump.label(321888);
/* 120 */             ffc2j.call(paramInt5, paramInt10, paramInt11);
/* 121 */             paramInt13 = MainMemory.getI32(paramInt9);
/* 122 */             if (MainMemory.getI32(paramInt11) > 0)
/*     */             {
/* 124 */               MainMemory.setI64(paramInt10, MainMemory.getI64(paramInt13 + 928));
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 132 */               l1 = MainMemory.getI64(paramInt10);
/* 133 */               l2 = MainMemory.getI64(paramInt13 + 928);
/* 134 */               if (l2 > l1)
/*     */               {
/* 136 */                 if (MainMemory.getI64(paramInt13 + 920) == l1)
/*     */                 {
/* 138 */                   d = l2;
/* 139 */                   SystemLibrary.sprintf(paramInt1, 19936, new Object[] { Double.valueOf(d) });
/* 140 */                   ffmkky.call(35712, paramInt1, paramInt4, paramInt12, paramInt8);
/* 141 */                   ffmkey.call(paramInt14, paramInt12, paramInt8);
/* 142 */                   paramInt13 = MainMemory.getI32(paramInt9);
/*     */                 }
/*     */               }
/*     */             }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */           Jump.label(321924);
/*     */           
/* 174 */           if (MainMemory.getI64(paramInt13 + 956) > 0L)
/*     */           {
/* 176 */             paramInt2 = MainMemory.getI32(paramInt14);
/* 177 */             i = MainMemory.getI32(paramInt13 + 64);
/* 178 */             if (paramInt2 == i) {
/* 179 */               paramInt2 = i;
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 185 */               ffmahd.call(paramInt14, paramInt2 + 1, 0, paramInt8);
/* 186 */               paramInt13 = MainMemory.getI32(paramInt9);
/* 187 */               paramInt2 = MainMemory.getI32(paramInt13 + 64);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */             Jump.label(321946);
/*     */             
/*     */ 
/* 199 */             MainMemory.setI64(paramInt13 + 104, MainMemory.getI64(MainMemory.getI32(paramInt13 + 84) + (paramInt2 << 3)) + 80L);
/* 200 */             if (MainMemory.getI32(paramInt8) <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 205 */               MainMemory.setI8(paramInt5, (byte)0);
/* 206 */               MainMemory.setI8(paramInt4, (byte)0);
/* 207 */               if (ffgcrd.call(paramInt14, 34560, paramInt6, paramInt8) <= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 212 */                 ffpsvc.call(paramInt6, paramInt5, paramInt4, paramInt8);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */               Jump.label(321974);
/* 220 */               ffc2j.call(paramInt5, paramInt3, paramInt8);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */             Jump.label(321978);
/* 230 */             l1 = MainMemory.getI64(MainMemory.getI32(paramInt9) + 956);
/* 231 */             if (l1 != MainMemory.getI64(paramInt3))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 236 */               ffmkyj.call(paramInt14, 34560, l1, paramInt4, paramInt8);
/*     */             }
/*     */           }
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
/* 260 */         Jump.label(321990);
/* 261 */         if (ffwend.call(paramInt14, paramInt8) < 1)
/*     */         {
/* 263 */           ffrhdu.call(paramInt14, paramInt7, paramInt8);
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
/* 282 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffrdef_1408.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */