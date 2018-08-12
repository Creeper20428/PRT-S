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
/*     */ 
/*     */ 
/*     */ public final class ffselect_table
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3008;
/*  20 */   public static final Function _instance = new ffselect_table();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffselect_table() { super("ffselect_table", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  27 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int n = call(i, j, k, m);
/*  45 */     paramFrame.setI32(paramInt1, n);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     boolean bool = false;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*     */     
/*     */ 
/*  64 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       j = MainMemory.alloc(4);
/*  69 */       if (MainMemory.getI8(paramInt2) != 0) {
/*     */         break label91;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       m = MainMemory.getI32(paramInt1);
/*  80 */       MainMemory.setI32(j, m);
/*  81 */       n = 0;
/*  82 */       i1 = m;
/*     */       
/*     */       break label509;
/*     */       
/*     */       label91:
/*     */       
/*  88 */       if (ffinit.call(j, paramInt2, paramInt4) <= 0) {
/*     */         break label135;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */       ffxmsg.call(5, 126240);
/*  99 */       ffxmsg.call(5, paramInt2);
/*     */       
/*     */       break label830;
/*     */       
/*     */       label135:
/* 104 */       m = MainMemory.getI32(paramInt1);
/* 105 */       n = MainMemory.getI32(m) + 1;
/* 106 */       if (MainMemory.getI32(MainMemory.getI32(m + 4) + 20) == 0) {
/* 107 */         i2 = 1;
/*     */       } else {
/*     */         break label279;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 118 */         if (i2 >= n) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         ffmahd.call(MainMemory.getI32(paramInt1), i2, 0, paramInt4);
/* 129 */         if (ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), paramInt4) <= 0) {
/*     */           break label263;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         ffclos.call(MainMemory.getI32(j), paramInt4);
/*     */         
/*     */         break label830;
/*     */         
/*     */         label263:
/* 144 */         i2 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label279:
/*     */       
/* 150 */       ffmahd.call(m, 1, 0, paramInt4);
/* 151 */       if (ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), paramInt4) <= 0) {
/*     */         break label337;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */       ffclos.call(MainMemory.getI32(j), paramInt4);
/*     */       
/*     */       break label830;
/*     */       
/*     */       label337:
/* 166 */       ffmahd.call(MainMemory.getI32(paramInt1), n, 0, paramInt4);
/* 167 */       m = MainMemory.getI32(j);
/* 168 */       if (ffcphd.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), paramInt4) <= 0) {
/*     */         break label402;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */       ffclos.call(m, paramInt4);
/*     */       
/*     */       break label830;
/*     */       
/*     */       label402:
/* 183 */       ffmkyj.call(m, 35712, 0L, 0, paramInt4);
/* 184 */       i1 = MainMemory.getI32(j);
/* 185 */       k = i1 + 4;
/* 186 */       MainMemory.setI64(MainMemory.getI32(k) + 928, 0L);
/* 187 */       MainMemory.setI64(MainMemory.getI32(k) + 920, 0L);
/* 188 */       m = MainMemory.getI32(j);
/* 189 */       if (ffrdef.call(i1, paramInt4) <= 0) {
/*     */         break label498;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       ffclos.call(m, paramInt4);
/*     */       
/*     */       break label830;
/*     */       
/*     */       label498:
/* 204 */       i1 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label509:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */       bool = MainMemory.getI8(paramInt2) != 0;
/* 217 */       if (ffsrow.call(i1, m, paramInt3, paramInt4) <= 0) {
/*     */         break label566;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */       ffselect_table_1420.call(paramInt4, bool, j);
/*     */       
/*     */       break label830;
/*     */       
/*     */       label566:
/* 232 */       if (!bool) {
/*     */         break label830;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       m = MainMemory.getI32(paramInt1);
/* 243 */       if (MainMemory.getI32(MainMemory.getI32(m + 4) + 20) != 0)
/*     */       {
/*     */ 
/*     */ 
/* 247 */         n = 2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 254 */         if (ffmahd.call(m, n + 1, 0, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */           i2 = n + 2;
/* 265 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 272 */             ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), paramInt4);
/* 273 */             i4 = i3 + 1;
/* 274 */             if (ffmahd.call(MainMemory.getI32(paramInt1), i2 + i3, 0, paramInt4) > 0) {
/*     */               break;
/*     */             }
/*     */             
/* 278 */             i3 = i4;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 285 */         i2 = MainMemory.getI32(paramInt4);
/* 286 */         if (i2 != 107) {
/*     */           break label755;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */         MainMemory.setI32(paramInt4, 0);
/*     */         
/*     */         break label793;
/*     */         
/*     */         label755:
/*     */         
/* 302 */         if (i2 <= 0) {
/*     */           break label793;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */         ffclos.call(MainMemory.getI32(j), paramInt4);
/*     */         
/*     */         break label830;
/*     */       }
/*     */       
/*     */       label793:
/* 319 */       ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/* 320 */       m = MainMemory.getI32(j);
/* 321 */       MainMemory.setI32(paramInt1, m);
/* 322 */       ffmahd.call(m, n, 0, paramInt4);
/*     */       
/*     */ 
/*     */       label830:
/*     */       
/*     */ 
/* 328 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 339 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffselect_table.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */