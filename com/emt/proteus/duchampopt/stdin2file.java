/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class stdin2file extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3057;
/*  12 */   public static final Function _instance = new stdin2file();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public stdin2file() { super("stdin2file", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*  44 */     long l = 0L;
/*     */     
/*     */ 
/*  47 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  51 */       j = MainMemory.alloc(7);
/*  52 */       k = MainMemory.alloc(1000);
/*  53 */       MainMemory.setI8(j, (byte)83);
/*  54 */       MainMemory.setI8(j + 1, (byte)73);
/*  55 */       MainMemory.setI8(j + 2, (byte)77);
/*  56 */       MainMemory.setI8(j + 3, (byte)80);
/*  57 */       MainMemory.setI8(j + 4, (byte)76);
/*  58 */       MainMemory.setI8(j + 5, (byte)69);
/*  59 */       MainMemory.setI8(j + 6, (byte)0);
/*  60 */       m = 0;
/*  61 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  69 */         i1 = SystemLibrary.fgetc(MainMemory.getI32Aligned(1792));
/*  70 */         if ((i1 == -1) || (n >= 2000))
/*     */         {
/*     */ 
/*     */ 
/*  74 */           n = m;
/*  75 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  81 */         if (MainMemory.getI8(j + m) != i1)
/*     */         {
/*     */ 
/*     */ 
/*  85 */           m = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  92 */           m += 1;
/*  93 */           if (m != 6) {
/*     */             break label228;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           SystemLibrary.memcpy(k, j, 6, 1);
/* 105 */           n = m;
/* 106 */           break;
/*     */         }
/*     */         
/*     */         label228:
/*     */         
/* 111 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       if (n != 6) {
/*     */         break label627;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       n = SystemLibrary.fread(k + 6, 1, 994, MainMemory.getI32Aligned(1792)) + 6;
/* 130 */       i2 = 503808 + (paramInt << 4) + 12;
/* 131 */       if (MainMemory.getI32(i2) != 1) {
/*     */         break label382;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       i4 = 503808 + (paramInt << 4) + 4;
/* 142 */       l = MainMemory.getI64(i4);
/* 143 */       if (SystemLibrary.fseek(MainMemory.getI32(503808 + (paramInt << 4)), l, 0) != 0)
/*     */       {
/*     */ 
/*     */ 
/* 147 */         paramInt = 116;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 154 */         MainMemory.setI64(i4, l);
/*     */         
/*     */ 
/*     */         label382:
/*     */         
/*     */ 
/* 160 */         i3 = 503808 + (paramInt << 4);
/* 161 */         if (SystemLibrary.fwrite(k, 1, n, MainMemory.getI32(i3)) != n)
/*     */         {
/*     */ 
/*     */ 
/* 165 */           paramInt = 106;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 172 */           i4 = 503808 + (paramInt << 4) + 4;
/* 173 */           l = MainMemory.getI64(i4) + n;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 181 */             MainMemory.setI64(i4, l);
/* 182 */             MainMemory.setI32(i2, 2);
/* 183 */             paramInt = SystemLibrary.fread(k, 1, 1000, MainMemory.getI32Aligned(1792));
/* 184 */             if (paramInt == 0) {
/* 185 */               paramInt = 0;
/* 186 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */             if (MainMemory.getI32(i2) != 1) {
/*     */               break label564;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */             l = MainMemory.getI64(i4);
/* 206 */             if (SystemLibrary.fseek(MainMemory.getI32(i3), l, 0) != 0)
/*     */             {
/*     */ 
/*     */ 
/* 210 */               paramInt = 116;
/* 211 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 217 */             MainMemory.setI64(i4, l);
/*     */             
/*     */ 
/*     */             label564:
/*     */             
/*     */ 
/* 223 */             if (SystemLibrary.fwrite(k, 1, paramInt, MainMemory.getI32(i3)) != paramInt)
/*     */             {
/*     */ 
/*     */ 
/* 227 */               paramInt = 106;
/* 228 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 234 */             l = MainMemory.getI64(i4) + paramInt;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 241 */       i = paramInt;
/*     */       
/*     */ 
/*     */       break label641;
/*     */       
/*     */       label627:
/*     */       
/* 248 */       ffxmsg.call(5, 121760);
/* 249 */       i = 104;
/*     */       
/*     */ 
/*     */       label641:
/*     */       
/*     */ 
/* 255 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 260 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/stdin2file.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */