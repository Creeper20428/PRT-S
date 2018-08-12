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
/*     */ public final class ffdkey
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3479;
/*  17 */   public static final Function _instance = new ffdkey();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffdkey() { super("ffdkey", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  38 */     int m = call(i, j, k);
/*  39 */     paramFrame.setI32(paramInt1, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*     */     
/*     */ 
/*  57 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       j = MainMemory.alloc(81);
/*  62 */       k = MainMemory.alloc(71);
/*  63 */       m = MainMemory.alloc(73);
/*  64 */       n = MainMemory.alloc(71);
/*  65 */       i1 = MainMemory.alloc(81);
/*  66 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         MainMemory.setI8(k, (byte)0);
/*  77 */         MainMemory.setI8(m, (byte)0);
/*  78 */         if (ffgcrd.call(paramInt1, paramInt2, j, paramInt3) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */           ffpsvc.call(j, k, m, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  94 */         if (MainMemory.getI32(paramInt3) <= 0) {
/*     */           break label187;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         SystemLibrary.sprintf(i1, 111584, new Object[] { Integer.valueOf(paramInt2) });
/* 105 */         ffxmsg.call(5, i1);
/*     */         
/*     */         break label356;
/*     */         
/*     */         label187:
/* 110 */         i2 = MainMemory.getI32(paramInt1 + 4);
/* 111 */         i3 = (int)((MainMemory.getI64(i2 + 104) - MainMemory.getI64(MainMemory.getI32(i2 + 84) + (MainMemory.getI32(i2 + 64) << 3))) / 80L);
/* 112 */         ffdrec.call(paramInt1, i3, paramInt3);
/* 113 */         ffc2s.call(k, n, paramInt3);
/* 114 */         i4 = SystemLibrary.strlen(n);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         while (i4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */           if (MainMemory.getI8(n + (i4 + -1)) != 38) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */           ffgcnt.call(paramInt1, n, paramInt3);
/* 143 */           if (MainMemory.getI8(n) == 0) {
/* 144 */             i4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 154 */             ffdrec.call(paramInt1, i3, paramInt3);
/* 155 */             i4 = SystemLibrary.strlen(n);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label356:
/* 161 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 172 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdkey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */