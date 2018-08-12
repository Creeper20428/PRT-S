/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_b_loc;
/*     */ 
/*     */ public final class ffgtbc
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3268;
/*  15 */   public static final Function _instance = new ffgtbc();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgtbc() { super("ffgtbc", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     call(i, j, k);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*  53 */     long l = 0L;
/*  54 */     int i5 = 0;
/*  55 */     int i6 = 0;
/*  56 */     int i7 = 0;
/*     */     
/*     */ 
/*  59 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(81);
/*  64 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         m = MainMemory.getI32(paramInt1);
/*  75 */         j = paramInt1 + 4;
/*  76 */         k = MainMemory.getI32(j);
/*  77 */         if (m != MainMemory.getI32(k + 64)) {
/*     */           break label164;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         if (MainMemory.getI64(k + 112) != -1L) {
/*     */           break label180;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         if (ffrdef.call(paramInt1, paramInt3) > 0) {
/*     */           break label709;
/*     */         } else {
/*     */           break label180;
/*     */         }
/*     */         
/*     */ 
/*     */         label164:
/*     */         
/* 106 */         ffmahd.call(paramInt1, m + 1, 0, paramInt3);
/*     */         
/*     */ 
/*     */         label180:
/*     */         
/*     */ 
/* 112 */         k = MainMemory.getI32(j);
/* 113 */         m = MainMemory.getI32(k + 916);
/* 114 */         n = MainMemory.getI32(k + 944);
/* 115 */         MainMemory.setI64(paramInt2, 0L);
/* 116 */         l = 0L;
/* 117 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 125 */           i6 = n + i5 * 152 + 136;
/* 126 */           i7 = n + i5 * 152 + 84;
/* 127 */           if (i5 >= m) {
/*     */             break label709;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */           i1 = n + i5 * 152 + 80;
/* 138 */           MainMemory.setI64(n + i5 * 152 + 72, l);
/* 139 */           i3 = MainMemory.getI32(i1);
/* 140 */           switch (i3)
/*     */           {
/*     */           case 16: 
/*     */             break label385;
/*     */             
/*     */             break;
/*     */           case 1: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 151 */           l = (MainMemory.getI64(i7) + 7L) / 8L;
/*     */           
/*     */           break label637;
/*     */           
/*     */           label385:
/*     */           
/* 157 */           l = MainMemory.getI64(i7);
/*     */           
/*     */ 
/*     */           break label637;
/*     */           
/*     */ 
/* 163 */           if (i3 <= 0) {
/*     */             break label444;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */           l = i3 / 10 * MainMemory.getI64(i7);
/*     */           
/*     */           break label637;
/*     */           
/*     */           label444:
/*     */           
/* 179 */           i2 = MainMemory.getI32(__ctype_b_loc.call());
/* 180 */           i4 = MainMemory.getI8(i6);
/* 181 */           if ((MainMemory.getI16(i2 + (i4 << 1)) & 0xFFFF & 0x800) == 0) {
/*     */             break label555;
/*     */           }
/*     */           else {
/* 185 */             i3 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 194 */             i3 += 1;
/* 195 */             i4 = MainMemory.getI8(n + i5 * 152 + 136 + i3);
/* 196 */             if ((MainMemory.getI16(i2 + (i4 << 1)) & 0xFFFF & 0x800) == 0) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label555:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 209 */           switch (i4)
/*     */           {
/*     */           case 80: 
/*     */             break label623;
/*     */             
/*     */             break;
/*     */           case 81: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 220 */           l = MainMemory.getI64(i7) << 4;
/*     */           
/*     */           break label637;
/*     */           
/*     */           label623:
/*     */           
/* 226 */           l = MainMemory.getI64(i7) << 3;
/*     */           
/*     */ 
/*     */ 
/*     */           label637:
/*     */           
/*     */ 
/*     */ 
/* 234 */           l = MainMemory.getI64(paramInt2) + l;
/* 235 */           MainMemory.setI64(paramInt2, l);
/* 236 */           i5 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */         SystemLibrary.sprintf(i, 86240, new Object[] { Integer.valueOf(i6) });
/* 244 */         ffxmsg.call(5, i);
/* 245 */         MainMemory.setI32(paramInt3, 261);
/*     */         
/*     */ 
/*     */ 
/*     */         break label714;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label709:
/*     */       
/*     */ 
/*     */ 
/*     */       label714:
/*     */       
/*     */ 
/*     */ 
/* 262 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */