/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class stdin2mem extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3056;
/*  13 */   public static final Function _instance = new stdin2mem();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public stdin2mem() { super("stdin2mem", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*  43 */     int i3 = 0;
/*  44 */     long l = 0L;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*     */     
/*     */ 
/*  49 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(7);
/*  54 */       MainMemory.setI8(j, (byte)83);
/*  55 */       MainMemory.setI8(j + 1, (byte)73);
/*  56 */       MainMemory.setI8(j + 2, (byte)77);
/*  57 */       MainMemory.setI8(j + 3, (byte)80);
/*  58 */       MainMemory.setI8(j + 4, (byte)76);
/*  59 */       MainMemory.setI8(j + 5, (byte)69);
/*  60 */       MainMemory.setI8(j + 6, (byte)0);
/*  61 */       k = 512000 + paramInt * 44;
/*  62 */       m = MainMemory.getI32(MainMemory.getI32(k));
/*  63 */       n = 512000 + paramInt * 44 + 8;
/*  64 */       i1 = MainMemory.getI32(MainMemory.getI32(n));
/*  65 */       i2 = MainMemory.getI32(512000 + paramInt * 44 + 16);
/*  66 */       i4 = 0;
/*  67 */       i3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  75 */         i5 = SystemLibrary.fgetc(MainMemory.getI32Aligned(1792));
/*  76 */         if ((i5 == -1) || (i3 >= 2000)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         if (MainMemory.getI8(j + i4) != i5)
/*     */         {
/*     */ 
/*     */ 
/*  90 */           i4 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  97 */           i4 += 1;
/*  98 */           if (i4 != 6) {
/*     */             break label523;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */           SystemLibrary.memcpy(m, j, 6, 1);
/* 110 */           i3 = SystemLibrary.fread(m + 6, 1, i1 + -6, MainMemory.getI32Aligned(1792)) + 6;
/* 111 */           l = i3 & 0xFFFFFFFF;
/* 112 */           if (!com.emt.proteus.lib.api.MathUtils.ult(i3, i1)) {
/*     */             break label345;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */           MainMemory.setI64(512000 + paramInt * 44 + 32, l);
/* 123 */           i = 0;
/*     */           
/*     */ 
/*     */           break label559;
/*     */           
/*     */           label345:
/*     */           
/* 130 */           i1 += i2;
/* 131 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 142 */             i4 = i1 + i2 * i3;
/* 143 */             m = com.emt.proteus.runtime.library.c.realloc.call(m, i4);
/* 144 */             if (m != 0) {
/*     */               break label416;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */             ffxmsg.call(5, 107616);
/* 155 */             i = 113;
/*     */             
/*     */ 
/*     */             break label559;
/*     */             
/*     */             label416:
/*     */             
/* 162 */             i5 = SystemLibrary.fread(m + (int)l, 1, i2, MainMemory.getI32Aligned(1792));
/* 163 */             l = (i5 & 0xFFFFFFFF) + l;
/* 164 */             i3 += 1;
/* 165 */             if (com.emt.proteus.lib.api.MathUtils.ult(i5, i2)) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */           MainMemory.setI64(512000 + paramInt * 44 + 32, l);
/* 179 */           MainMemory.setI32(MainMemory.getI32(k), m);
/* 180 */           MainMemory.setI32(MainMemory.getI32(n), i4);
/* 181 */           i = 0;
/*     */           
/*     */ 
/*     */           break label559;
/*     */         }
/*     */         
/*     */         label523:
/*     */         
/* 189 */         i3 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */       ffxmsg.call(5, 123552);
/* 197 */       ffxmsg.call(5, 86688);
/* 198 */       i = 104;
/*     */       
/*     */ 
/*     */       label559:
/*     */       
/*     */ 
/* 204 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 209 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/stdin2mem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */