/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffc2dd extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3214;
/*  13 */   public static final Function _instance = new ffc2dd();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffc2dd() { super("ffc2dd", 3, false); }
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
/*     */     
/*     */ 
/*  52 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       j = MainMemory.alloc(4);
/*  57 */       k = MainMemory.alloc(81);
/*  58 */       m = MainMemory.alloc(73);
/*  59 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */         b = MainMemory.getI8(459008);
/*  70 */         if (b != 0) {
/*     */           break label113;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         b = MainMemory.getI8(MainMemory.getI32(com.emt.proteus.runtime.library.c.localeconv.call()));
/*  82 */         MainMemory.setI8(459008, b);
/*     */         
/*     */ 
/*     */ 
/*     */         label113:
/*     */         
/*     */ 
/*     */ 
/*  90 */         n = SystemLibrary.__errno_location();
/*  91 */         MainMemory.setI32(n, 0);
/*  92 */         MainMemory.setF64(paramInt2, 0.0D);
/*  93 */         if ((SystemLibrary.strchr(paramInt1, 68) == 0) && (b != 44)) {
/*     */           break label262;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         SystemLibrary.strcpy(m, paramInt1);
/* 104 */         i1 = SystemLibrary.strchr(m, 68);
/* 105 */         MainMemory.setI32(j, i1);
/* 106 */         if (i1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           MainMemory.setI8(i1, (byte)69);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 122 */         if (MainMemory.getI8(459008) != 44) {
/*     */           break label243;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         ffc2dd_533.call(j, m);
/*     */         
/*     */ 
/*     */         label243:
/*     */         
/*     */ 
/* 138 */         d = SystemLibrary.strtod(m, j);
/*     */         
/*     */         break label275;
/*     */         
/*     */         label262:
/*     */         
/* 144 */         d = SystemLibrary.strtod(paramInt1, j);
/*     */         
/*     */ 
/*     */ 
/*     */         label275:
/*     */         
/*     */ 
/*     */ 
/* 152 */         MainMemory.setF64(paramInt2, d);
/* 153 */         switch (MainMemory.getI8(MainMemory.getI32(j)))
/*     */         {
/*     */         case 0: 
/*     */           break label373;
/*     */           
/*     */           break;
/*     */         case 32: 
/*     */           break label373;
/*     */           break;
/*     */         }
/*     */         
/* 164 */         SystemLibrary.memcpy(k, 103712, 46, 1);
/* 165 */         SystemLibrary.strncat(k, paramInt1, 30);
/* 166 */         ffxmsg.call(5, k);
/* 167 */         MainMemory.setI32(paramInt3, 409);
/*     */         
/*     */ 
/*     */         label373:
/*     */         
/*     */ 
/* 173 */         if (MainMemory.getI32(n) != 34) {
/*     */           break label439;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */         SystemLibrary.memcpy(k, 103712, 46, 1);
/* 184 */         SystemLibrary.strncat(k, paramInt1, 30);
/* 185 */         ffxmsg.call(5, k);
/* 186 */         MainMemory.setI32(paramInt3, 412);
/* 187 */         MainMemory.setI32(n, 0);
/*     */       }
/*     */       
/*     */ 
/*     */       label439:
/*     */       
/* 193 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 204 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffc2dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */