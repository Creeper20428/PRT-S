/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fits_relurl2url extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3428;
/*  13 */   public static final Function _instance = new fits_relurl2url();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fits_relurl2url() { super("fits_relurl2url", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = call(i, j, k, m);
/*  38 */     paramFrame.setI32(paramInt1, n);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*     */     
/*     */ 
/*  51 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       j = MainMemory.alloc(1025);
/*  56 */       k = MainMemory.getI32(paramInt4);
/*  57 */       if (k != 0) {
/*     */         break label508;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */       SystemLibrary.strcpy(j, paramInt1);
/*  68 */       if (SystemLibrary.strncasecmp(j, 19968, 4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */         if (SystemLibrary.strncasecmp(j, 31904, 6) != 0) {
/*     */           break label136;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       ffxmsg.call(5, 124256);
/*  89 */       ffxmsg.call(5, 118816);
/*  90 */       ffxmsg.call(5, 65056);
/*  91 */       k = 125;
/*     */       
/*     */       break label488;
/*     */       
/*     */       label136:
/*  96 */       if (MainMemory.getI8(paramInt2) != 47) {
/*     */         break label409;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       MainMemory.setI16(paramInt3, (short)47);
/* 107 */       if (MainMemory.getI8(paramInt2) == 47) {
/* 108 */         k = 0;
/*     */       } else {
/*     */         break label228;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 119 */         MainMemory.setI16(paramInt3 + SystemLibrary.strlen(paramInt3), (short)47);
/* 120 */         k += 1;
/* 121 */       } while (MainMemory.getI8(paramInt2 + k) == 47);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label228:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 132 */       k = SystemLibrary.strlen(paramInt3);
/* 133 */       paramInt1 = SystemLibrary.strstr(j, paramInt3);
/* 134 */       if (paramInt1 == 0) {
/* 135 */         paramInt1 = j;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */ 
/*     */ 
/* 147 */           paramInt1 += k;
/* 148 */           m = SystemLibrary.strstr(paramInt1, paramInt3);
/* 149 */           if (m == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 154 */           paramInt1 = m;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */       MainMemory.setI8(paramInt3 + (k + -1), (byte)0);
/* 163 */       m = SystemLibrary.strstr(paramInt1, paramInt3);
/* 164 */       if (m != 0) {
/*     */         break label381;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */       paramInt1 = SystemLibrary.strrchr(paramInt1, 47);
/* 175 */       if (paramInt1 != 0) {
/*     */         break label366;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */       MainMemory.setI8(j, (byte)0);
/*     */       
/*     */       break label392;
/*     */       
/*     */       label366:
/* 190 */       MainMemory.setI8(paramInt1, (byte)0);
/*     */       
/*     */       break label392;
/*     */       
/*     */       label381:
/* 195 */       MainMemory.setI8(m, (byte)0);
/*     */       
/*     */ 
/*     */       label392:
/*     */       
/*     */ 
/* 201 */       SystemLibrary.strcat(j, paramInt2);
/*     */       
/*     */       break label474;
/*     */       
/*     */       label409:
/* 206 */       paramInt1 = SystemLibrary.strrchr(j, 47);
/* 207 */       if (paramInt1 != 0) {
/*     */         break label450;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */       MainMemory.setI8(j, (byte)0);
/*     */       
/*     */       break label462;
/*     */       
/*     */       label450:
/* 222 */       MainMemory.setI8(paramInt1 + 1, (byte)0);
/*     */       
/*     */ 
/*     */       label462:
/*     */       
/*     */ 
/* 228 */       SystemLibrary.strcat(j, paramInt2);
/*     */       
/*     */ 
/*     */       label474:
/*     */       
/*     */ 
/* 234 */       k = fits_clean_url.call(j, paramInt3, paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */       label488:
/*     */       
/*     */ 
/*     */ 
/* 242 */       MainMemory.setI32(paramInt4, k);
/* 243 */       i = k;
/*     */       
/*     */ 
/*     */       break label517;
/*     */       
/*     */       label508:
/*     */       
/* 250 */       i = k;
/*     */       
/*     */ 
/*     */       label517:
/*     */       
/*     */ 
/* 256 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 261 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_relurl2url.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */