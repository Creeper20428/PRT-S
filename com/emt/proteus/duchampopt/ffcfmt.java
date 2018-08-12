/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffcfmt extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3228;
/*  11 */   public static final Function _instance = new ffcfmt();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffcfmt() { super("ffcfmt", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       MainMemory.setI8(paramInt2, (byte)0);
/*  46 */       i = MainMemory.getI8(paramInt1);
/*  47 */       if (i == 32) {
/*  48 */         j = 0;
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*  53 */         j = 0;
/*     */         
/*     */ 
/*     */         break label67;
/*     */       }
/*     */       
/*     */       do
/*     */       {
/*  61 */         j += 1;
/*  62 */         i = MainMemory.getI8(paramInt1 + j);
/*  63 */       } while (i == 32);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label67:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       k = paramInt1 + j;
/*  79 */       if (i != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         MainMemory.setI8(paramInt2, (byte)37);
/*  90 */         SystemLibrary.strcpy(paramInt2 + 1, paramInt1 + (j + 1));
/*  91 */         i = MainMemory.getI8(k);
/*  92 */         switch (i)
/*     */         {
/*     */         case 65: 
/*     */           break label181;
/*     */           
/*     */ 
/*     */           break;
/*     */         case 73: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 104 */         MainMemory.setI32(paramInt2 + SystemLibrary.strlen(paramInt2), 6697006);
/*     */         
/*     */         break label197;
/*     */         
/*     */         label181:
/* 109 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)115);
/*     */         
/*     */ 
/*     */         label197:
/*     */         
/*     */ 
/* 115 */         i = MainMemory.getI8(k);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         if (i != 70) {
/*     */           break label249;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)102);
/* 135 */         i = MainMemory.getI8(k);
/*     */         
/*     */ 
/*     */ 
/*     */         label249:
/*     */         
/*     */ 
/*     */ 
/* 143 */         if (i != 69) {
/*     */           break label290;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)69);
/* 155 */         i = MainMemory.getI8(k);
/*     */         
/*     */ 
/*     */ 
/*     */         label290:
/*     */         
/*     */ 
/*     */ 
/* 163 */         if (i != 68) {
/*     */           break label330;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)69);
/*     */         
/*     */ 
/*     */         break label335;
/*     */       }
/*     */       
/*     */ 
/*     */       label330:
/*     */       
/*     */ 
/*     */       label335:
/*     */       
/* 185 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcfmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */