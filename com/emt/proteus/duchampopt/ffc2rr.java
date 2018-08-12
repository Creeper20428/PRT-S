/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffc2rr extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3216;
/*  13 */   public static final Function _instance = new ffc2rr();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffc2rr() { super("ffc2rr", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  34 */     int m = call(i, j, k);
/*  35 */     paramFrame.setI32(paramInt1, m);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     byte b = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     double d = 0.0D;
/*  50 */     float f = 0.0F;
/*     */     
/*     */ 
/*  53 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       j = MainMemory.alloc(4);
/*  58 */       k = MainMemory.alloc(81);
/*  59 */       m = MainMemory.alloc(73);
/*  60 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         b = MainMemory.getI8(459012);
/*  71 */         if (b != 0) {
/*     */           break label116;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         b = MainMemory.getI8(MainMemory.getI32(com.emt.proteus.runtime.library.c.localeconv.call()));
/*  83 */         MainMemory.setI8(459012, b);
/*     */         
/*     */ 
/*     */ 
/*     */         label116:
/*     */         
/*     */ 
/*     */ 
/*  91 */         n = SystemLibrary.__errno_location();
/*  92 */         MainMemory.setI32(n, 0);
/*  93 */         MainMemory.setF32(paramInt2, 0.0F);
/*  94 */         if ((SystemLibrary.strchr(paramInt1, 68) == 0) && (b != 44)) {
/*     */           break label265;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         SystemLibrary.strcpy(m, paramInt1);
/* 105 */         i1 = SystemLibrary.strchr(m, 68);
/* 106 */         MainMemory.setI32(j, i1);
/* 107 */         if (i1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */           MainMemory.setI8(i1, (byte)69);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 123 */         if (MainMemory.getI8(459012) != 44) {
/*     */           break label246;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         ffc2rr_534.call(m, j);
/*     */         
/*     */ 
/*     */         label246:
/*     */         
/*     */ 
/* 139 */         d = SystemLibrary.strtod(m, j);
/*     */         
/*     */         break label278;
/*     */         
/*     */         label265:
/*     */         
/* 145 */         d = SystemLibrary.strtod(paramInt1, j);
/*     */         
/*     */ 
/*     */ 
/*     */         label278:
/*     */         
/*     */ 
/*     */ 
/* 153 */         f = (float)d;
/* 154 */         MainMemory.setF32(paramInt2, f);
/* 155 */         switch (MainMemory.getI8(MainMemory.getI32(j)))
/*     */         {
/*     */         case 0: 
/*     */           break label381;
/*     */           
/*     */           break;
/*     */         case 32: 
/*     */           break label381;
/*     */           break;
/*     */         }
/*     */         
/* 166 */         SystemLibrary.memcpy(k, 100960, 45, 1);
/* 167 */         SystemLibrary.strncat(k, paramInt1, 30);
/* 168 */         ffxmsg.call(5, k);
/* 169 */         MainMemory.setI32(paramInt3, 408);
/*     */         
/*     */ 
/*     */         label381:
/*     */         
/*     */ 
/* 175 */         if (MainMemory.getI32(n) != 34) {
/*     */           break label447;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */         SystemLibrary.memcpy(k, 100960, 45, 1);
/* 186 */         SystemLibrary.strncat(k, paramInt1, 30);
/* 187 */         ffxmsg.call(5, k);
/* 188 */         MainMemory.setI32(paramInt3, 412);
/* 189 */         MainMemory.setI32(n, 0);
/*     */       }
/*     */       
/*     */ 
/*     */       label447:
/*     */       
/* 195 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 206 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffc2rr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */