/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.IntTools;
/*     */ import java.util.Comparator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Function
/*     */ {
/*  39 */   public static final Comparator<Function> HOT_CMPR = new Comparator() {
/*     */     public int compare(Function o1, Function o2) {
/*     */       try {
/*  42 */         return (int)(o2.count - o1.count);
/*     */       } catch (NullPointerException npe) {
/*  44 */         if (o2 == o1)
/*  45 */           return 0;
/*  46 */         if (o2 == null)
/*  47 */           return -1;
/*     */       }
/*  49 */       return 1;
/*     */     }
/*     */   };
/*     */   
/*     */ 
/*     */   protected long count;
/*     */   
/*     */   protected String name;
/*     */   protected int argCount;
/*     */   protected boolean varArgs;
/*     */   private boolean silent;
/*     */   
/*  61 */   public Function(String name, int argCount) { this(name, argCount, false); }
/*     */   
/*     */   public Function(String name, int argCount, boolean varArgs) {
/*  64 */     this.name = name;
/*  65 */     this.argCount = argCount;
/*  66 */     this.varArgs = varArgs;
/*     */   }
/*     */   
/*     */   public static Object[] toVarArgs(Frame f, int[] code, int offset, int len) {
/*  70 */     Object[] result = new Object[len];
/*  71 */     for (int i = 0; i < len; i++) {
/*     */       try {
/*  73 */         int addr = code[(offset++)];
/*  74 */         int typeId = code[(offset++)];
/*  75 */         result[i] = getObject(f, typeId, addr);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/*  77 */         throw aie;
/*     */       }
/*     */     }
/*  80 */     return result;
/*     */   }
/*     */   
/*  83 */   public static int[] toVarInt(Frame f, int[] code, int offset, int len) { int[] result = new int[len];
/*  84 */     for (int i = 0; i < len; i++) {
/*     */       try {
/*  86 */         int addr = code[(offset++)];
/*  87 */         result[i] = f.getI32(addr);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/*  89 */         throw aie;
/*     */       }
/*     */     }
/*  92 */     return result;
/*     */   }
/*     */   
/*     */   public static Object getObject(Frame f, int typeId, int addr) {
/*  96 */     switch (typeId) {
/*     */     case 1: 
/*  98 */       return Boolean.valueOf(f.getI1(addr));
/*     */     case 2: 
/* 100 */       return Byte.valueOf(f.getI8(addr));
/*     */     case 3: 
/* 102 */       return Short.valueOf(f.getI16(addr));
/*     */     case 4: case 8: case 9: 
/*     */     case 10: case 11: default: 
/* 105 */       return Integer.valueOf(f.getI32(addr));
/*     */     case 5: 
/* 107 */       return Long.valueOf(f.getI64(addr));
/*     */     case 6: 
/* 109 */       return f.getI96(addr);
/*     */     case 7: 
/* 111 */       return f.getI128(addr);
/*     */     case 12: 
/* 113 */       return Float.valueOf(f.getF32(addr));
/*     */     case 13: 
/* 115 */       return Double.valueOf(f.getF64(addr));
/*     */     case 14: 
/* 117 */       return f.getF80(addr);
/*     */     }
/* 119 */     return f.getF128(addr);
/*     */   }
/*     */   
/*     */   public String getName()
/*     */   {
/* 124 */     return this.name;
/*     */   }
/*     */   
/*     */   public int getArgCount() {
/* 128 */     return this.argCount;
/*     */   }
/*     */   
/*     */   public CompiledFunction getCompiled() {
/* 132 */     throw new UnsupportedOperationException("This is not an interpreted function");
/*     */   }
/*     */   
/*     */   public void setCompiled(CompiledFunction compiled) {
/* 136 */     throw new UnsupportedOperationException("This is not an interpreted function");
/*     */   }
/*     */   
/*     */   public boolean isSilent() {
/* 140 */     return this.silent;
/*     */   }
/*     */   
/*     */   public void setSilent(boolean silent) {
/* 144 */     this.silent = silent;
/*     */   }
/*     */   
/*     */   public int main(String[] args) {
/* 148 */     int allocBase = MainMemory.getAllocBase();
/*     */     try {
/* 150 */       int[] ptrs = MainMemory.pushs(args);
/* 151 */       if (this.varArgs)
/* 152 */         return execute(ptrs);
/* 153 */       int argv; if (getArgCount() == 2) {
/* 154 */         argv = MainMemory.pushp(ptrs);
/* 155 */         return execute(ptrs.length, argv);
/*     */       }
/* 157 */       return execute();
/*     */     }
/*     */     finally {
/* 160 */       MainMemory.dealloc(allocBase);
/*     */     }
/*     */   }
/*     */   
/*     */   public abstract int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4);
/*     */   
/*     */   public int execute(int... arg)
/*     */   {
/* 168 */     switch (arg.length) {
/*     */     case 0: 
/* 170 */       return execute();
/*     */     case 1: 
/* 172 */       return execute(arg[0]);
/*     */     case 2: 
/* 174 */       return execute(arg[0], arg[1]);
/*     */     case 3: 
/* 176 */       return execute(arg[0], arg[1], arg[2]);
/*     */     case 4: 
/* 178 */       return execute(arg[0], arg[1], arg[2], arg[3]);
/*     */     case 5: 
/* 180 */       return execute(arg[0], arg[1], arg[2], arg[3], arg[4]);
/*     */     case 6: 
/* 182 */       return execute(arg[0], arg[1], arg[2], arg[3], arg[4], arg[5]);
/*     */     case 7: 
/* 184 */       return execute(arg[0], arg[1], arg[2], arg[3], arg[4], arg[5], arg[6]);
/*     */     case 8: 
/* 186 */       return execute(arg[0], arg[1], arg[2], arg[3], arg[4], arg[5], arg[6], arg[7]);
/*     */     case 9: 
/* 188 */       return execute(arg[0], arg[1], arg[2], arg[3], arg[4], arg[5], arg[6], arg[7], arg[8]);
/*     */     case 10: 
/* 190 */       return execute(arg[0], arg[1], arg[2], arg[3], arg[4], arg[5], arg[6], arg[7], arg[8], arg[9]);
/*     */     }
/* 192 */     return execute_vargs(arg);
/*     */   }
/*     */   
/* 195 */   public int execute() { return execute_vargs(new int[0]); }
/* 196 */   public int execute(int arg) { return execute_vargs(new int[] { arg }); }
/* 197 */   public int execute(int arg, int arg1) { return execute_vargs(new int[] { arg, arg1 }); }
/* 198 */   public int execute(int arg, int arg1, int arg2) { return execute_vargs(new int[] { arg, arg1, arg2 }); }
/* 199 */   public int execute(int arg, byte arg1, int arg2) { return execute_vargs(new int[] { arg, upcast(arg1), arg2 }); }
/* 200 */   public int execute(int arg, byte arg1) { return execute_vargs(new int[] { arg, upcast(arg1) }); }
/* 201 */   public int execute(int arg, byte arg1, byte arg2) { return execute_vargs(new int[] { arg, upcast(arg1), upcast(arg2) }); }
/* 202 */   public int execute(int arg, int arg1, int arg3, int arg4) { return execute_vargs(new int[] { arg, arg1, arg3, arg4 }); }
/* 203 */   public int execute(int arg, int arg1, int arg3, int arg4, int arg5) { return execute_vargs(new int[] { arg, arg1, arg3, arg4, arg5 }); }
/* 204 */   public int execute(int arg, int arg1, int arg3, int arg4, int arg5, int arg6) { return execute_vargs(new int[] { arg, arg1, arg3, arg4, arg5, arg6 }); }
/* 205 */   public int execute(int arg, int arg1, int arg3, int arg4, int arg5, int arg6, int arg7) { return execute_vargs(new int[] { arg, arg1, arg3, arg4, arg5, arg6, arg7 }); }
/* 206 */   public int execute(int arg, int arg1, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) { return execute_vargs(new int[] { arg, arg1, arg3, arg4, arg5, arg6, arg7, arg8 }); }
/* 207 */   public int execute(int arg, int arg1, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) { return execute_vargs(new int[] { arg, arg1, arg3, arg4, arg5, arg6, arg7, arg8, arg9 }); }
/* 208 */   public int execute(int arg, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) { return execute_vargs(new int[] { arg, arg1, arg3, arg4, arg5, arg6, arg7, arg8, arg9 }); }
/*     */   
/* 210 */   public int execute_vargs(int... args) { throw new UnsupportedOperationException(getName()); }
/*     */   
/*     */ 
/*     */   public int execute(int this$, long addr, byte val)
/*     */   {
/* 215 */     return execute_vargs(new int[] { this$, IntTools.part1(addr), IntTools.part2(addr), upcast(val) });
/*     */   }
/*     */   
/*     */   private int upcast(byte val) {
/* 219 */     return val & 0xFF;
/*     */   }
/*     */   
/*     */   public int execute(long l1, long l2, int i3) {
/* 223 */     return execute_vargs(new int[] { IntTools.part1(l1), IntTools.part2(l1), IntTools.part1(l2), IntTools.part2(l2), i3 });
/*     */   }
/*     */   
/* 226 */   public int execute(int i1, long lon) { return execute_vargs(new int[] { i1, IntTools.part1(lon), IntTools.part2(lon) }); }
/*     */   
/*     */   public int execute(int in1, int in2, long lon) {
/* 229 */     return execute_vargs(new int[] { in1, in2, IntTools.part1(lon), IntTools.part2(lon) });
/*     */   }
/*     */   
/* 232 */   public int execute(long lon, int in3, int in4, int in5) { return execute_vargs(new int[] { IntTools.part1(lon), IntTools.part2(lon), in3, in4, in5 }); }
/*     */   
/*     */   public int execute(int in1, float f) {
/* 235 */     return execute_vargs(new int[] { in1, Float.floatToRawIntBits(f) });
/*     */   }
/*     */   
/* 238 */   public int execute(int in1, byte b3, long lon4, int in5) { return execute_vargs(new int[] { in1, upcast(b3), IntTools.part1(lon4), IntTools.part2(lon4), in5 }); }
/*     */   
/*     */   public int execute(int in1, int i2, byte b3) {
/* 241 */     return execute_vargs(new int[] { in1, i2, upcast(b3) });
/*     */   }
/*     */   
/* 244 */   public int execute(int in1, byte b3, int in4, int in5) { return execute_vargs(new int[] { in1, upcast(b3), in4, in5 }); }
/*     */   
/*     */ 
/*     */   public long executeLong(int... arg)
/*     */   {
/* 249 */     switch (arg.length) {
/*     */     case 0: 
/* 251 */       return executeLong();
/*     */     case 1: 
/* 253 */       return executeLong(arg[0]);
/*     */     case 2: 
/* 255 */       return executeLong(arg[0], arg[1]);
/*     */     }
/* 257 */     return execute_vargs(arg);
/*     */   }
/*     */   
/*     */ 
/* 261 */   public long executeLong() { return executeLong_vargs(new int[0]); }
/* 262 */   public long executeLong(int arg) { return executeLong_vargs(new int[] { arg }); }
/* 263 */   public long executeLong(int arg, int arg1) { return executeLong_vargs(new int[] { arg, arg1 }); }
/* 264 */   public long executeLong(int arg, int arg1, int arg2) { return executeLong_vargs(new int[] { arg, arg1, arg2 }); }
/* 265 */   public long executeLong(int arg, int arg2, long l) { return executeLong_vargs(new int[] { arg, arg2, IntTools.part1(l), IntTools.part2(l) }); }
/* 266 */   public long executeLong(int arg1, long arg2, int arg3) { return executeLong_vargs(new int[] { arg1, IntTools.part1(arg2), IntTools.part2(arg2), arg3 }); }
/* 267 */   public long executeLong(long arg1, int arg3) { return executeLong_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), arg3 }); }
/* 268 */   public long executeLong(long arg1, long arg2, int arg3) { return executeLong_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), IntTools.part1(arg2), IntTools.part2(arg2), arg3 }); }
/* 269 */   public long executeLong(long arg1, long arg2, int arg3, int arg4) { return executeLong_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), IntTools.part1(arg2), IntTools.part2(arg2), arg3, arg4 }); }
/* 270 */   public long executeLong(long arg1, long arg2, int arg3, int arg4, int arg5) { return executeLong_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), IntTools.part1(arg2), IntTools.part2(arg2), arg3, arg4, arg5 }); }
/* 271 */   public long executeLong(long arg1, long arg2, long arg3) { return executeLong_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), IntTools.part1(arg2), IntTools.part2(arg2), IntTools.part1(arg3), IntTools.part2(arg3) }); }
/* 272 */   public double executeDouble() { return executeDouble_vargs(new int[0]); }
/* 273 */   public double executeDouble(int arg) { return executeDouble_vargs(new int[] { arg }); }
/* 274 */   public double executeDouble(int arg, int arg1) { return executeDouble_vargs(new int[] { arg, arg1 }); }
/* 275 */   public double executeDouble(int arg, int arg1, int arg2) { return executeDouble_vargs(new int[] { arg, arg1, arg2 }); }
/* 276 */   public double executeDouble(int arg, int arg2, long l) { return executeDouble_vargs(new int[] { arg, arg2, IntTools.part1(l), IntTools.part2(l) }); }
/* 277 */   public double executeDouble(int arg1, long arg2, int arg3) { return executeDouble_vargs(new int[] { arg1, IntTools.part1(arg2), IntTools.part2(arg2), arg3 }); }
/* 278 */   public double executeDouble(long arg1, int arg3) { return executeDouble_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), arg3 }); }
/* 279 */   public double executeDouble(long arg1, long arg2, int arg3) { return executeDouble_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), IntTools.part1(arg2), IntTools.part2(arg2), arg3 }); }
/* 280 */   public double executeDouble(long arg1, long arg2, int arg3, int arg4) { return executeDouble_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), IntTools.part1(arg2), IntTools.part2(arg2), arg3, arg4 }); }
/* 281 */   public double executeDouble(long arg1, long arg2, int arg3, int arg4, int arg5) { return executeDouble_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), IntTools.part1(arg2), IntTools.part2(arg2), arg3, arg4, arg5 }); }
/* 282 */   public double executeDouble(long arg1, long arg2, long arg3) { return executeDouble_vargs(new int[] { IntTools.part1(arg1), IntTools.part2(arg1), IntTools.part1(arg2), IntTools.part2(arg2), IntTools.part1(arg3), IntTools.part2(arg3) }); }
/* 283 */   public long executeLong_vargs(int... args) { throw new UnsupportedOperationException(getName()); }
/* 284 */   public double executeDouble_vargs(int... args) { throw new UnsupportedOperationException(getName()); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void replaces(Function previous) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int execute(double doub, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
/*     */   {
/* 296 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public Function resolve() {
/* 300 */     return this;
/*     */   }
/*     */   
/*     */   public final void called() {
/* 304 */     this.count += 1L;
/*     */   }
/*     */   
/*     */   public final long getCount() {
/* 308 */     return this.count;
/*     */   }
/*     */   
/*     */   public final void clear() {
/* 312 */     this.count = 0L;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/Function.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */