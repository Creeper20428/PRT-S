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
/*     */ public final class smem_remove
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3138;
/*  17 */   public static final Function _instance = new smem_remove();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public smem_remove() { super("smem_remove", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  24 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = call(i);
/*  33 */     paramFrame.setI32(paramInt1, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*     */     
/*     */ 
/*  48 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.alloc(4);
/*  53 */       if (paramInt == 0) {
/*  54 */         k = 152;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  64 */       else if (SystemLibrary.sscanf(paramInt, 18176, new int[] { j }) != 1)
/*     */       {
/*     */ 
/*     */ 
/*  68 */         k = 151;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  75 */         k = MainMemory.getI32(j);
/*  76 */         if (!MainMemory.getI1(459056))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */           m = shared_init.call();
/*  87 */           if (m != 0)
/*     */           {
/*     */ 
/*     */ 
/*  91 */             k = m;
/*     */             
/*     */ 
/*     */             break label293;
/*     */           }
/*     */         }
/*     */         
/*  98 */         if (k >= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */           if (MainMemory.getI32Aligned(459504) <= k) {
/*     */             break label399;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           n = MainMemory.getI32Aligned(458776);
/* 119 */           i1 = MainMemory.getI32(n + (k << 4));
/* 120 */           if (i1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */             if (MainMemory.getI32(n + (k << 4) + 8) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */               if (MainMemory.getI8(i1) != 74) {
/*     */                 break label399;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */               if (MainMemory.getI8(i1 + 1) != 66) {
/*     */                 break label399;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */               k = MainMemory.getI8(i1 + 2) == 1 ? 0 : 151;
/*     */               
/*     */ 
/*     */ 
/*     */               label293:
/*     */               
/*     */ 
/*     */ 
/* 168 */               if (k != 0) {
/*     */                 break label399;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */               k = MainMemory.getI32(j);
/* 179 */               if (MainMemory.getI32(MainMemory.getI32Aligned(458776) + (k << 4) + 8) == -1) {
/*     */                 break label423;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */               k = shared_unlock.call(k);
/* 190 */               if (k != 0) {
/*     */                 break label487;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */               if (shared_lock.call(MainMemory.getI32(j), 1) == 0) {
/* 202 */                 k = 151;
/*     */                 break label487;
/*     */               } else {
/*     */                 break label423;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */         label399:
/* 211 */         k = smem_open.call(paramInt, 1, j);
/* 212 */         if (k != 0) {
/*     */           break label487;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label423:
/*     */         
/*     */ 
/*     */ 
/* 223 */         shared_set_attr.call(MainMemory.getI32(j));
/* 224 */         k = MainMemory.getI32(j);
/* 225 */         m = shared_unlock.call(k);
/* 226 */         if (m != 0) {
/*     */           break label474;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         i = shared_free.call(k);
/*     */         
/*     */ 
/*     */         break label494;
/*     */         
/*     */         label474:
/*     */         
/* 243 */         i = m;
/*     */         
/*     */ 
/*     */         break label494;
/*     */       }
/*     */       
/*     */       label487:
/*     */       
/* 251 */       i = k;
/*     */       
/*     */ 
/*     */       label494:
/*     */       
/*     */ 
/* 257 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 262 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_remove.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */