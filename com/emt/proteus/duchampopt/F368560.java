/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F368560 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3472;
/*  13 */   public static final Function _instance = new F368560();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F368560() { super("F368560", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       j = com.emt.proteus.runtime.library.c.calloc.call(511, 1);
/*  51 */       if (j != 0) {
/*     */         break label59;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */       ffxmsg.call(5, 122656);
/*  62 */       i = 0;
/*     */       
/*     */ 
/*     */       break label472;
/*     */       
/*     */       label59:
/*     */       
/*  69 */       if (SystemLibrary.strncmp(paramInt1, 20064, 4) != 0) {
/*     */         break label210;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       SystemLibrary.strncpy(j, paramInt2, 255);
/*  80 */       k = SystemLibrary.strlen(j);
/*  81 */       m = k + -1;
/*  82 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  89 */         i1 = k - n;
/*  90 */         if (i1 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */           if (MainMemory.getI8(j + (m - n)) != 47) {
/*     */             break label194;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         MainMemory.setI8(j + i1, (byte)0);
/* 111 */         SystemLibrary.strncat(j, paramInt1 + 4, 255);
/* 112 */         i = j;
/* 113 */         break;
/*     */         
/*     */ 
/*     */         label194:
/*     */         
/*     */ 
/* 119 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label210:
/*     */       
/* 125 */       if (SystemLibrary.strchr(paramInt1, 47) != 0) {
/*     */         break label379;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */       if (SystemLibrary.strchr(paramInt1, 36) != 0) {
/*     */         break label379;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       SystemLibrary.strncpy(j, paramInt2, 255);
/* 146 */       k = SystemLibrary.strlen(j);
/* 147 */       m = k + -1;
/* 148 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 155 */         i1 = k - n;
/* 156 */         if (i1 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */           if (MainMemory.getI8(j + (m - n)) != 47) {
/*     */             break label363;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         MainMemory.setI8(j + i1, (byte)0);
/* 177 */         SystemLibrary.strncat(j, paramInt1, 255);
/* 178 */         i = j;
/* 179 */         break;
/*     */         
/*     */ 
/*     */         label363:
/*     */         
/*     */ 
/* 185 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label379:
/*     */       
/* 191 */       if (SystemLibrary.strncmp(paramInt1, 17216, 3) != 0) {
/*     */         break label465;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */       SystemLibrary.strncpy(j, paramInt2, 255);
/* 202 */       k = SystemLibrary.strlen(j);
/* 203 */       MainMemory.setI8(j + (k + -3), (byte)112);
/* 204 */       MainMemory.setI8(j + (k + -2), (byte)105);
/* 205 */       MainMemory.setI8(j + (k + -1), (byte)120);
/* 206 */       i = j;
/*     */       
/*     */ 
/*     */       break label472;
/*     */       
/*     */       label465:
/*     */       
/* 213 */       i = j;
/*     */       
/*     */ 
/*     */       label472:
/*     */       
/*     */ 
/* 219 */       int i2 = i; return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F368560.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */