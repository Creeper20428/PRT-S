/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class ffdelt
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2997;
/*  16 */   public static final Function _instance = new ffdelt();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffdelt() { super("ffdelt", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  23 */     call(paramInt1, paramInt2);
/*  24 */     return 0;
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
/*  35 */     call(i, j);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*     */     
/*     */ 
/*  51 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       i = MainMemory.alloc(4);
/*  56 */       MainMemory.setI32(i, 0);
/*  57 */       if (paramInt1 != 0) {
/*     */         break label67;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */       MainMemory.setI32(paramInt2, 115);
/*     */       
/*     */ 
/*     */       break label690;
/*     */       
/*     */       label67:
/*     */       
/*  74 */       j = paramInt1 + 4;
/*  75 */       if (MainMemory.getI32(MainMemory.getI32(j) + 16) != 555) {
/*     */         break label679;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       ffchdu.call(paramInt1, paramInt2);
/*  86 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  93 */         m = MainMemory.getI32(j);
/*  94 */         if (MainMemory.getI32(m + 1216 + (k << 2)) <= -1) {
/*     */           break label197;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         if (MainMemory.getI32(m + 1376 + (k << 2)) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           ffbfwt.call(m, k, paramInt2);
/* 117 */           m = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label197:
/*     */         
/*     */ 
/* 125 */         MainMemory.setI32(m + 1216 + (k << 2), -1);
/* 126 */         k += 1;
/* 127 */         if (k == 40) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */       if (MainMemory.getI32(paramInt2) != 112)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         ffdelt_597.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 154 */       m = MainMemory.getI32(j);
/* 155 */       k = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(m + 4) * 84 + 56), MainMemory.getI32(m));
/* 156 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         ffdelt_596.call(paramInt2, j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 172 */       m = MainMemory.getI32(j);
/* 173 */       if (MainMemory.getI32(492288 + MainMemory.getI32(m + 4) * 84 + 60) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         n = MainMemory.getI32(m + 12);
/* 185 */         i1 = malloc.call(SystemLibrary.strlen(n) + 1);
/* 186 */         if (i1 != 0) {
/*     */           break label420;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */         MainMemory.setI32(paramInt2, 113);
/*     */         
/*     */ 
/*     */         break label690;
/*     */         
/*     */         label420:
/*     */         
/* 203 */         ffifile.call(n, 0, i1, 0, 0, 0, 0, 0, 0, i);
/* 204 */         k = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(MainMemory.getI32(j) + 4) * 84 + 60), i1);
/* 205 */         if (k != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */           ffdelt_595.call(paramInt2, j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 221 */         free.call(i1);
/* 222 */         m = MainMemory.getI32(j);
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 230 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 237 */           i2 = 491008 + (k << 2);
/* 238 */           if (k >= 300) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */           if (MainMemory.getI32(i2) != m) {
/*     */             break label582;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */           MainMemory.setI32(i2, 0);
/* 259 */           break;
/*     */           
/*     */           label582:
/*     */           
/* 263 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 269 */         free.call(MainMemory.getI32(m + 1212));
/* 270 */         free.call(MainMemory.getI32(MainMemory.getI32(j) + 84));
/* 271 */         free.call(MainMemory.getI32(MainMemory.getI32(j) + 12));
/* 272 */         MainMemory.setI32(MainMemory.getI32(j) + 12, 0);
/* 273 */         MainMemory.setI32(MainMemory.getI32(j) + 16, 0);
/* 274 */         free.call(MainMemory.getI32(j));
/* 275 */         free.call(paramInt1);
/*     */         
/*     */ 
/*     */         break label690;
/*     */         
/*     */         label679:
/*     */         
/* 282 */         MainMemory.setI32(paramInt2, 114);
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label690:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdelt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */