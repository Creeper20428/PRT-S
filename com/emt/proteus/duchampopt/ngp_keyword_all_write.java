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
/*     */ public final class ngp_keyword_all_write
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3447;
/*  17 */   public static final Function _instance = new ngp_keyword_all_write();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ngp_keyword_all_write() { super("ngp_keyword_all_write", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2);
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
/*  35 */     int k = call(i, j);
/*  36 */     paramFrame.setI32(paramInt1, k);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  42 */     int i = 0;
/*     */     
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     int i6 = 0;
/*  54 */     int i7 = 0;
/*  55 */     int i8 = 0;
/*  56 */     int i9 = 0;
/*  57 */     int i10 = 0;
/*  58 */     int i11 = 0;
/*  59 */     int i12 = 0;
/*     */     
/*     */ 
/*  62 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       j = MainMemory.alloc(71);
/*  67 */       k = MainMemory.alloc(81);
/*  68 */       m = MainMemory.alloc(4);
/*  69 */       n = MainMemory.alloc(4);
/*  70 */       i1 = MainMemory.alloc(200);
/*  71 */       i2 = MainMemory.alloc(4);
/*  72 */       if ((paramInt1 != 0) && (paramInt2 != 0)) {
/*     */         break label128;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       i = 362;
/*     */       
/*     */ 
/*     */       break label1031;
/*     */       
/*     */       label128:
/*     */       
/*  89 */       MainMemory.setI32(m, 0);
/*  90 */       i3 = paramInt1 + 4;
/*  91 */       i4 = n;
/*  92 */       i5 = i2;
/*  93 */       i6 = j;
/*  94 */       i12 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 101 */         if (MainMemory.getI32(paramInt1) <= i12) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         i7 = MainMemory.getI32(i3);
/* 112 */         i8 = ngp_keyword_is_write.call(i7 + i12 * 172);
/* 113 */         MainMemory.setI32(m, i8);
/* 114 */         if (i8 != 0) {
/*     */           break label903;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */         switch (MainMemory.getI32(i7 + i12 * 172)) {
/*     */         case 1: 
/*     */           break label840;
/*     */           break;
/*     */         case 2: 
/*     */           break label786;
/*     */           break;
/*     */         case 3: 
/*     */           break label723;
/*     */           break;
/*     */         case 4: 
/*     */           break label670;
/*     */           break;
/*     */         case 5:  break label616;
/*     */           break; case 6:  break label536;
/*     */           break; case 7:  break; }
/* 140 */         i9 = i7 + i12 * 172 + 4;
/* 141 */         if (SystemLibrary.strcmp(39584, i9) != 0) {
/*     */           break label413;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */         if (i8 <= 0)
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
/* 162 */           ngp_keyword_all_write_1583.call(i12, paramInt2, m, i7, k);
/*     */           
/*     */           break label957;
/*     */           
/*     */           label413:
/* 167 */           i10 = i7 + i12 * 172 + 92;
/* 168 */           if (SystemLibrary.strcmp(39552, i9) != 0) {
/*     */             break label489;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */           if (i8 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */             ngp_keyword_all_write_1584.call(i12, paramInt2, m, i7, k, i10);
/*     */             
/*     */             break label957;
/*     */             
/*     */             label489:
/* 194 */             SystemLibrary.sprintf(i1, 44256, new Object[] { Integer.valueOf(i9), Integer.valueOf(i10) });
/* 195 */             ffprec.call(paramInt2, i1, m);
/*     */             
/*     */ 
/*     */             label536:
/*     */             
/* 200 */             if (i8 <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */               i9 = i7 + i12 * 172 + 92;
/* 212 */               i10 = i7 + i12 * 172 + 4;
/* 213 */               MainMemory.setI16(i6, (short)32);
/* 214 */               ffmkky.call(i10, j, i9, k, m);
/* 215 */               ffprec.call(paramInt2, k, m);
/*     */               
/*     */               break label957;
/*     */               
/*     */               label616:
/* 220 */               ffpky.call(paramInt2, 163, i7 + i12 * 172 + 4, i7 + i12 * 172 + 76, i7 + i12 * 172 + 92, m);
/*     */               
/*     */               break label957;
/*     */               
/*     */               label670:
/* 225 */               ffpky.call(paramInt2, 82, i7 + i12 * 172 + 4, i7 + i12 * 172 + 76, i7 + i12 * 172 + 92, m);
/*     */               
/*     */               break label957;
/*     */               
/*     */               label723:
/* 230 */               MainMemory.setI32(i2, MainMemory.getI32(i7 + i12 * 172 + 76));
/* 231 */               ffpky.call(paramInt2, 41, i7 + i12 * 172 + 4, i5, i7 + i12 * 172 + 92, m);
/*     */               
/*     */               break label957;
/*     */               
/*     */               label786:
/* 236 */               ffpkls.call(paramInt2, i7 + i12 * 172 + 4, MainMemory.getI32(i7 + i12 * 172 + 76), i7 + i12 * 172 + 92, m);
/*     */               
/*     */               break label957;
/*     */               
/*     */               label840:
/* 241 */               MainMemory.setI32(n, MainMemory.getI8(i7 + i12 * 172 + 76));
/* 242 */               ffpky.call(paramInt2, 14, i7 + i12 * 172 + 4, i4, i7 + i12 * 172 + 92, m);
/*     */               
/*     */               break label957;
/*     */               
/*     */               label903:
/* 247 */               i11 = i8 == 368 ? 1 : 0;
/* 248 */               MainMemory.setI32(m, 0);
/* 249 */               if (i11 == 0) {
/*     */                 break label997;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */               ngp_keyword_all_write_1585.call(i12, paramInt2, m, i7);
/*     */               
/*     */ 
/*     */               label957:
/*     */               
/*     */ 
/* 265 */               i8 = MainMemory.getI32(m);
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 273 */         if (i8 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */           i = i8;
/*     */           
/*     */           break label1031;
/*     */         }
/*     */         
/*     */         label997:
/*     */         
/* 290 */         i12 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 296 */       ffrdef.call(paramInt2, m);
/* 297 */       i = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       label1031:
/*     */       
/*     */ 
/* 303 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 308 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_keyword_all_write.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */