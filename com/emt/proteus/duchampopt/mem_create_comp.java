/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class mem_create_comp extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3069;
/*  13 */   public static final Function _instance = new mem_create_comp();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public mem_create_comp() { super("mem_create_comp", 2, false); }
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
/*  47 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  51 */       i1 = MainMemory.alloc(4);
/*  52 */       if (SystemLibrary.strcmp(paramInt1, 21344) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  62 */         if (SystemLibrary.strcmp(paramInt1, 47936) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */           if (SystemLibrary.strcmp(paramInt1, 47968) != 0) {
/*     */             break label105;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       j = MainMemory.getI32Aligned(1792);
/*     */       
/*     */       break label174;
/*     */       
/*     */       label105:
/*     */       
/*  88 */       MainMemory.setI32(i1, 6433655);
/*  89 */       j = SystemLibrary.fopen(paramInt1, 14016);
/*  90 */       if (j != 0) {
/*     */         break label503;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       j = SystemLibrary.fopen(paramInt1, i1);
/* 101 */       if (j != 0) {
/*     */         break label174;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */       i = 105;
/*     */       
/*     */ 
/*     */       break label516;
/*     */       
/*     */ 
/*     */       label174:
/*     */       
/* 120 */       MainMemory.setI32(paramInt2, -1);
/* 121 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 128 */         if (m >= 300)
/*     */         {
/*     */ 
/*     */ 
/* 132 */           m = 103;
/* 133 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 139 */         k = 512000 + m * 44;
/* 140 */         if (MainMemory.getI32(k) != 0) {
/*     */           break label468;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */         MainMemory.setI32(paramInt2, m);
/* 151 */         if (m == -1) {
/* 152 */           m = 103;
/* 153 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         n = 512000 + m * 44 + 4;
/* 163 */         MainMemory.setI32(k, n);
/* 164 */         i1 = 512000 + m * 44 + 12;
/* 165 */         MainMemory.setI32(512000 + m * 44 + 8, i1);
/* 166 */         paramInt1 = com.emt.proteus.runtime.library.c.malloc.call(2880);
/* 167 */         MainMemory.setI32(n, paramInt1);
/* 168 */         if (paramInt1 != 0) {
/*     */           break label367;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */         ffxmsg.call(5, 109856);
/* 179 */         m = 104;
/* 180 */         break;
/*     */         
/*     */         label367:
/*     */         
/* 184 */         MainMemory.setI32(i1, 2880);
/* 185 */         MainMemory.setI32(512000 + m * 44 + 16, 2880);
/* 186 */         MainMemory.setI64(512000 + m * 44 + 32, 0L);
/* 187 */         MainMemory.setI64(512000 + m * 44 + 24, 0L);
/* 188 */         MainMemory.setI32(512000 + m * 44 + 20, 2786);
/* 189 */         MainMemory.setI32(512000 + MainMemory.getI32(paramInt2) * 44 + 40, j);
/* 190 */         i = 0;
/*     */         
/*     */ 
/*     */         break label516;
/*     */         
/*     */         label468:
/*     */         
/* 197 */         m += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */       ffxmsg.call(5, 120096);
/* 205 */       i = m;
/*     */       
/*     */ 
/*     */       break label516;
/*     */       
/*     */       label503:
/*     */       
/* 212 */       SystemLibrary.fclose(j);
/* 213 */       i = 105;
/*     */       
/*     */ 
/*     */       label516:
/*     */       
/*     */ 
/* 219 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 224 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_create_comp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */