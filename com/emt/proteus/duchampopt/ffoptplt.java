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
/*     */ 
/*     */ public final class ffoptplt
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3009;
/*  20 */   public static final Function _instance = new ffoptplt();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffoptplt() { super("ffoptplt", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  27 */     call(paramInt1, paramInt2, paramInt3);
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
/*  42 */     call(i, j, k);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*     */     
/*     */ 
/*  59 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(4);
/*  64 */       j = MainMemory.alloc(4);
/*  65 */       k = MainMemory.alloc(4);
/*  66 */       m = MainMemory.alloc(4);
/*  67 */       n = MainMemory.alloc(81);
/*  68 */       MainMemory.setI32(j, 0);
/*  69 */       if ((MainMemory.getI32(paramInt3) > 0) || (paramInt2 != 0))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         if (MainMemory.getI8(paramInt2) != 0) {
/*     */           break label115;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label482;
/*     */       
/*     */ 
/*     */ 
/*     */       label115:
/*     */       
/*     */ 
/*     */ 
/*  95 */       ffopen.call(i, paramInt2, 0, j);
/*  96 */       if (MainMemory.getI32(j) != 0) {
/*     */         break label457;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       ffmahd.call(MainMemory.getI32(i), 1, 0, paramInt3);
/* 107 */       i1 = MainMemory.getI32(paramInt3);
/* 108 */       if (i1 >= 1) {
/*     */         break label400;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       paramInt2 = n + 25;
/*     */       
/*     */       label295:
/*     */       label336:
/*     */       do
/*     */       {
/* 125 */         ffghsp.call(MainMemory.getI32(i), k, m, paramInt3);
/* 126 */         i2 = MainMemory.getI32(i);
/* 127 */         if (MainMemory.getI32(k) < 1) {
/*     */           break label336;
/*     */         }
/*     */         else {
/* 131 */           i1 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 142 */           i3 = i1 + 1;
/* 143 */           i1 += 2;
/* 144 */           ffgrec.call(i2, i3, n, paramInt3);
/* 145 */           if (SystemLibrary.strncmp(n, 45408, 8) != 0) {
/*     */             break label295;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */           ffoptplt_1132.call(paramInt2, n);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           ffprec.call(paramInt1, n, paramInt3);
/* 162 */           i2 = MainMemory.getI32(i);
/* 163 */           if (i1 > MainMemory.getI32(k)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 168 */           i1 = i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */         if (MainMemory.getI32(paramInt3) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */           ffmahd.call(i2, MainMemory.getI32(i2) + 2, 0, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 193 */         ffcrhd.call(paramInt1, paramInt3);
/* 194 */         i1 = MainMemory.getI32(paramInt3);
/* 195 */       } while (i1 < 1);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label400:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */       if (i1 != 107) {
/*     */         break label430;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */       MainMemory.setI32(paramInt3, 0);
/*     */       
/*     */ 
/*     */       label430:
/*     */       
/*     */ 
/* 223 */       ffclos.call(MainMemory.getI32(i), paramInt3);
/* 224 */       ffmahd.call(paramInt1, 1, 0, paramInt3);
/*     */       
/*     */ 
/*     */       break label482;
/*     */       
/*     */       label457:
/*     */       
/* 231 */       ffxmsg.call(2, n);
/* 232 */       fits_execute_template.call(paramInt1, paramInt2, paramInt3);
/* 233 */       ffmahd.call(paramInt1, 1, 0, paramInt3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label482:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffoptplt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */