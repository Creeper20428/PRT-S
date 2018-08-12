/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffdhdu
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3151;
/*  18 */   public static final Function _instance = new ffdhdu();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffdhdu() { super("ffdhdu", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = call(i, j, k);
/*  40 */     paramFrame.setI32(paramInt1, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*     */     
/*     */ 
/*  61 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       j = MainMemory.alloc(160);
/*  66 */       k = MainMemory.alloc(4);
/*  67 */       MainMemory.setI32(k, 0);
/*  68 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */         n = MainMemory.getI32(paramInt1);
/*  79 */         m = paramInt1 + 4;
/*  80 */         i4 = MainMemory.getI32(m);
/*  81 */         i1 = MainMemory.getI32(i4 + 64);
/*  82 */         if (n == i1) {
/*  83 */           n = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  94 */           ffmahd.call(paramInt1, n + 1, 0, paramInt3);
/*  95 */           i4 = MainMemory.getI32(m);
/*  96 */           n = MainMemory.getI32(i4 + 64);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         if (n != 0) {
/*     */           break label327;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         MainMemory.setI64(i4 + 88, 0L);
/* 117 */         MainMemory.setI64(MainMemory.getI32(m) + 104, 0L);
/* 118 */         ffphprll.call(paramInt1, 8, 0, j, paramInt3);
/* 119 */         i4 = MainMemory.getI32(m);
/* 120 */         n = (int)((MainMemory.getI64(MainMemory.getI32(i4 + 84) + (MainMemory.getI32(i4 + 64) + 1 << 3)) + -2880L) / 2880L);
/* 121 */         if (n <= 0) {
/*     */           break label300;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         if (ffdblk.call(paramInt1, n, paramInt3) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */           i4 = MainMemory.getI32(m);
/*     */           
/*     */ 
/*     */ 
/*     */           label300:
/*     */           
/*     */ 
/*     */ 
/* 150 */           MainMemory.setI64(i4 + 112, -1L);
/* 151 */           ffrdef.call(paramInt1, paramInt3);
/*     */           
/*     */           break label642;
/*     */           
/*     */           label327:
/* 156 */           i6 = MainMemory.getI32(i4 + 84);
/* 157 */           if (ffdblk.call(paramInt1, (int)((MainMemory.getI64(i6 + (n + 1 << 3)) - MainMemory.getI64(i6 + (n << 3))) / 2880L), paramInt3) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */             i4 = MainMemory.getI32(m);
/* 168 */             i1 = MainMemory.getI32(i4 + 64);
/* 169 */             n = i1 + 1;
/* 170 */             i2 = MainMemory.getI32(i4 + 76);
/* 171 */             i6 = MainMemory.getI32(i4 + 84);
/* 172 */             if (i2 < n) {
/* 173 */               n = i2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 184 */               i1 += 2;
/* 185 */               i2 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 194 */                 i3 = i1 + i2;
/* 195 */                 MainMemory.setI64(i6 + (n + i2 << 3), MainMemory.getI64(i6 + (i3 << 3)));
/* 196 */                 i4 = MainMemory.getI32(m);
/* 197 */                 i5 = MainMemory.getI32(i4 + 76);
/* 198 */                 i6 = MainMemory.getI32(i4 + 84);
/* 199 */                 i2 += 1;
/* 200 */                 if (i5 < i3) {
/* 201 */                   n = i5; break;
/*     */                 }
/*     */               }
/*     */             }
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
/* 216 */             MainMemory.setI64(i6 + (n + 1 << 3), 0L);
/* 217 */             i7 = MainMemory.getI32(m) + 76;
/* 218 */             MainMemory.setI32(i7, MainMemory.getI32(i7) + -1);
/* 219 */             if (ffrhdu.call(paramInt1, k, paramInt3) <= 0) {
/*     */               break label642;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */             MainMemory.setI32(paramInt3, 0);
/* 230 */             ffxmsg.call(1, 0);
/* 231 */             ffgext.call(paramInt1, MainMemory.getI32(MainMemory.getI32(m) + 64) + -1, k, paramInt3);
/*     */             
/*     */ 
/*     */             label642:
/*     */             
/*     */ 
/* 237 */             ffdhdu_598.call(k, paramInt2);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 243 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 254 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdhdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */