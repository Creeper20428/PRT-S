/*      */ package com.emt.proteus.runtime.lib;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.lib.utils.CharSource.Str;
/*      */ import com.emt.proteus.lib.utils.Formatf;
/*      */ import com.emt.proteus.lib.utils.Formatf.Elem;
/*      */ import com.emt.proteus.lib.utils.TypeInfo;
/*      */ import com.emt.proteus.runtime.api.CastOps;
/*      */ import com.emt.proteus.runtime.api.CompiledFunction;
/*      */ import com.emt.proteus.runtime.api.ControlException;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.ExecException;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.LongJmpException;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.MemoryWatchException;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.api.UnwindException;
/*      */ import com.emt.proteus.runtime.lib.io.IoLib;
/*      */ import java.io.PrintStream;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class ExecVm
/*      */ {
/*      */   public static final int PC_INC = 2;
/*      */   private static int line;
/*      */   private static long interpreted;
/*      */   
/*      */   public static void start()
/*      */   {
/*   58 */     line = 0;
/*   59 */     interpreted = 0L;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static void stop() {}
/*      */   
/*      */ 
/*      */ 
/*      */   public static long getFunctionCount()
/*      */   {
/*   70 */     return interpreted;
/*      */   }
/*      */   
/*      */   public static int getLineNumber()
/*      */   {
/*   75 */     return line;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static int exec(Env env, int function_id, int[] args)
/*      */   {
/*   89 */     return exec_impl(env, function_id, args);
/*      */   }
/*      */   
/*      */   /* Error */
/*      */   private static int exec_impl(Env env, int function_id, int[] args)
/*      */   {
/*      */     // Byte code:
/*      */     //   0: iload_1
/*      */     //   1: invokestatic 5	com/emt/proteus/runtime/api/SystemLibrary:getFunction	(I)Lcom/emt/proteus/runtime/api/Function;
/*      */     //   4: astore_3
/*      */     //   5: aload_3
/*      */     //   6: checkcast 6	com/emt/proteus/runtime/api/CompiledFunction
/*      */     //   9: astore 4
/*      */     //   11: aload 4
/*      */     //   13: invokestatic 7	com/emt/proteus/runtime/lib/ExecVm:acquire	(Lcom/emt/proteus/runtime/api/CompiledFunction;)Lcom/emt/proteus/runtime/api/Frame;
/*      */     //   16: astore 5
/*      */     //   18: aload 5
/*      */     //   20: invokevirtual 8	com/emt/proteus/runtime/api/Frame:getArgStart	()I
/*      */     //   23: istore 6
/*      */     //   25: aload_2
/*      */     //   26: arraylength
/*      */     //   27: istore 7
/*      */     //   29: iconst_0
/*      */     //   30: istore 8
/*      */     //   32: iload 8
/*      */     //   34: iload 7
/*      */     //   36: if_icmpge +23 -> 59
/*      */     //   39: aload 5
/*      */     //   41: iload 6
/*      */     //   43: aload_2
/*      */     //   44: iload 8
/*      */     //   46: iaload
/*      */     //   47: invokevirtual 9	com/emt/proteus/runtime/api/Frame:setI32	(II)V
/*      */     //   50: iinc 6 1
/*      */     //   53: iinc 8 1
/*      */     //   56: goto -24 -> 32
/*      */     //   59: aload_0
/*      */     //   60: aload 5
/*      */     //   62: aload 4
/*      */     //   64: invokestatic 10	com/emt/proteus/runtime/lib/ExecVm:exec_blocks_ex	(Lcom/emt/proteus/runtime/api/Env;Lcom/emt/proteus/runtime/api/Frame;Lcom/emt/proteus/runtime/api/CompiledFunction;)V
/*      */     //   67: aload 5
/*      */     //   69: invokevirtual 11	com/emt/proteus/runtime/api/Frame:getReturn	()I
/*      */     //   72: istore 8
/*      */     //   74: aload 5
/*      */     //   76: iload 8
/*      */     //   78: invokevirtual 12	com/emt/proteus/runtime/api/Frame:getI32	(I)I
/*      */     //   81: istore 9
/*      */     //   83: aload 4
/*      */     //   85: aload 5
/*      */     //   87: invokestatic 13	com/emt/proteus/runtime/lib/ExecVm:close	(Lcom/emt/proteus/runtime/api/CompiledFunction;Lcom/emt/proteus/runtime/api/Frame;)V
/*      */     //   90: iload 9
/*      */     //   92: ireturn
/*      */     //   93: astore 8
/*      */     //   95: iconst_0
/*      */     //   96: istore 9
/*      */     //   98: aload 4
/*      */     //   100: aload 5
/*      */     //   102: invokestatic 13	com/emt/proteus/runtime/lib/ExecVm:close	(Lcom/emt/proteus/runtime/api/CompiledFunction;Lcom/emt/proteus/runtime/api/Frame;)V
/*      */     //   105: iload 9
/*      */     //   107: ireturn
/*      */     //   108: astore 10
/*      */     //   110: aload 4
/*      */     //   112: aload 5
/*      */     //   114: invokestatic 13	com/emt/proteus/runtime/lib/ExecVm:close	(Lcom/emt/proteus/runtime/api/CompiledFunction;Lcom/emt/proteus/runtime/api/Frame;)V
/*      */     //   117: aload 10
/*      */     //   119: athrow
/*      */     //   120: astore 4
/*      */     //   122: aload_3
/*      */     //   123: checkcast 16	com/emt/proteus/runtime/api/ImplementedFunction
/*      */     //   126: astore 5
/*      */     //   128: aload 5
/*      */     //   130: aload_2
/*      */     //   131: invokevirtual 17	com/emt/proteus/runtime/api/ImplementedFunction:execute	([I)I
/*      */     //   134: ireturn
/*      */     // Line number table:
/*      */     //   Java source line #94	-> byte code offset #0
/*      */     //   Java source line #96	-> byte code offset #5
/*      */     //   Java source line #97	-> byte code offset #11
/*      */     //   Java source line #98	-> byte code offset #18
/*      */     //   Java source line #99	-> byte code offset #25
/*      */     //   Java source line #100	-> byte code offset #29
/*      */     //   Java source line #101	-> byte code offset #39
/*      */     //   Java source line #102	-> byte code offset #50
/*      */     //   Java source line #100	-> byte code offset #53
/*      */     //   Java source line #105	-> byte code offset #59
/*      */     //   Java source line #107	-> byte code offset #67
/*      */     //   Java source line #108	-> byte code offset #74
/*      */     //   Java source line #113	-> byte code offset #83
/*      */     //   Java source line #109	-> byte code offset #93
/*      */     //   Java source line #110	-> byte code offset #95
/*      */     //   Java source line #113	-> byte code offset #98
/*      */     //   Java source line #115	-> byte code offset #120
/*      */     //   Java source line #116	-> byte code offset #122
/*      */     //   Java source line #117	-> byte code offset #128
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	signature
/*      */     //   0	135	0	env	Env
/*      */     //   0	135	1	function_id	int
/*      */     //   0	135	2	args	int[]
/*      */     //   4	119	3	function	Function
/*      */     //   9	102	4	compiled	CompiledFunction
/*      */     //   120	3	4	cce	ClassCastException
/*      */     //   16	97	5	frame	Frame
/*      */     //   126	3	5	implemented	com.emt.proteus.runtime.api.ImplementedFunction
/*      */     //   23	28	6	arg_p	int
/*      */     //   27	8	7	arg_length	int
/*      */     //   30	24	8	i	int
/*      */     //   72	5	8	addr	int
/*      */     //   93	3	8	e	Exception
/*      */     //   81	25	9	i	int
/*      */     //   108	10	10	localObject	Object
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   67	83	93	java/lang/Exception
/*      */     //   59	83	108	finally
/*      */     //   93	98	108	finally
/*      */     //   108	110	108	finally
/*      */     //   5	90	120	java/lang/ClassCastException
/*      */     //   93	105	120	java/lang/ClassCastException
/*      */     //   108	120	120	java/lang/ClassCastException
/*      */   }
/*      */   
/*      */   public static int exec_impl(Env env, CompiledFunction function, Frame calling, int return_idx, int return_width, int arg_count, int[] code, int pc)
/*      */   {
/*  122 */     Frame frame = acquire(function);
/*  123 */     int arg_p = frame.getArgStart();
/*  124 */     for (int i = 0; i < arg_count; i++) {
/*  125 */       int param_address = code[(pc++)];
/*  126 */       int width = TypeInfo.intWidth(code[(pc++)]);
/*  127 */       frame.copy(calling, param_address, arg_p, width);
/*  128 */       arg_p += width;
/*      */     }
/*      */     try
/*      */     {
/*  132 */       exec_blocks_ex(env, frame, function);
/*  133 */       int addr = frame.getReturn();
/*  134 */       if ((calling != null) && (addr >= 0)) {
/*  135 */         calling.copy(frame, addr, return_idx, return_width);
/*      */       }
/*      */     } finally {
/*  138 */       close(function, frame);
/*      */     }
/*  140 */     return pc;
/*      */   }
/*      */   
/*      */   public static int exec_impl(CompiledFunction function, int... arg) {
/*  144 */     Frame frame = acquire(function);
/*  145 */     int arg_p = frame.getArgStart();
/*  146 */     int i1; for (int i = 0; i < arg.length; i++) {
/*  147 */       i1 = arg[i];
/*  148 */       frame.setI32(arg_p++, i1);
/*      */     }
/*      */     try {
/*  151 */       exec_blocks_ex(null, frame, function);
/*  152 */       int addr = frame.getReturn();
/*      */       
/*  154 */       if (addr >= 0) {
/*  155 */         return frame.getI32(addr);
/*      */       }
/*      */     } finally {
/*  158 */       close(function, frame);
/*      */     }
/*  160 */     return 0;
/*      */   }
/*      */   
/*      */   public static long exec_impl_long(CompiledFunction function, int... arg) {
/*  164 */     Frame frame = acquire(function);
/*  165 */     int arg_p = frame.getArgStart();
/*  166 */     int i1; for (int i = 0; i < arg.length; i++) {
/*  167 */       i1 = arg[i];
/*  168 */       frame.setI32(arg_p++, i1);
/*      */     }
/*      */     try {
/*  171 */       exec_blocks_ex(null, frame, function);
/*  172 */       int addr = frame.getReturn();
/*      */       
/*  174 */       if (addr >= 0) {
/*  175 */         return frame.getI64(addr);
/*      */       }
/*      */     } finally {
/*  178 */       close(function, frame);
/*      */     }
/*  180 */     return 0L;
/*      */   }
/*      */   
/*      */   private static Frame acquire(CompiledFunction function)
/*      */   {
/*  185 */     Frame frame = function.acquire();
/*  186 */     frame.setReturn(-1);
/*  187 */     frame.setAllocBase(MainMemory.getAllocBase());
/*  188 */     return frame;
/*      */   }
/*      */   
/*      */   private static void close(CompiledFunction function, Frame frame) {
/*  192 */     MainMemory.dealloc(frame.getAllocBase());
/*  193 */     function.release(frame);
/*      */   }
/*      */   
/*      */   public static void exec_blocks_ex(Env env, Frame frame, CompiledFunction function)
/*      */   {
/*  198 */     interpreted += 1L;
/*      */     
/*      */ 
/*  201 */     int pc = 0;
/*      */     
/*  203 */     int op_start = 0;
/*  204 */     int unwind = 0;
/*  205 */     int[] code = function.getCompilation();
/*      */     try
/*      */     {
/*      */       for (;;)
/*      */       {
/*  210 */         op_start = pc++;
/*      */         
/*  212 */         line = code[op_start];
/*      */         
/*  214 */         int op = code[(pc++)];
/*  215 */         int opCode = op & 0xFFFF;
/*  216 */         int a; int ptr; int b; int c; int rA; int width; int src; int fid; switch (opCode) {
/*      */         case 1: 
/*  218 */           pc = do_instrument(env, function, frame, code, op_start, pc, op);
/*  219 */           break;
/*      */         case 2: 
/*  221 */           dest = code[(pc++)];
/*  222 */           a = code[(pc++)];
/*  223 */           ptr = frame.getPointerAddress(a);
/*  224 */           int i32 = MainMemory.getI32(ptr);
/*      */           
/*  226 */           frame.setI32(dest, i32);
/*  227 */           break;
/*      */         case 3: 
/*  229 */           ptr = frame.getPointerAddress(code[(pc++)]);
/*  230 */           b = code[(pc++)];
/*  231 */           c = code[pc];
/*  232 */           rA = MainMemory.getI32(ptr);
/*  233 */           if (rA == 0) {
/*  234 */             pc = b;
/*      */           } else
/*  236 */             pc = c;
/*  237 */           break;
/*      */         case 4: 
/*  239 */           dest = code[(pc++)];
/*  240 */           ptr = frame.getPointerAddress(code[(pc++)]);
/*  241 */           rA = MainMemory.getI32(ptr) + frame.getI32(code[(pc++)]);
/*  242 */           MainMemory.setI32(ptr, rA);
/*  243 */           frame.setI32(dest, rA);
/*  244 */           break;
/*      */         case 5: 
/*  246 */           dest = code[(pc++)];
/*  247 */           width = code[(pc++)];
/*  248 */           src = code[(pc++)];
/*  249 */           frame.copy(src, dest, width);
/*  250 */           break;
/*      */         case 6: 
/*  252 */           dest = code[(pc++)];
/*  253 */           a = code[(pc++)];
/*  254 */           int offset = code[(pc++)];
/*  255 */           int length = code[(pc++)];
/*  256 */           ptr = frame.getPointerAddress(a);
/*  257 */           for (int idx = 0; idx != length; idx++) {
/*  258 */             int field = frame.getI32(code[(pc++)]);
/*  259 */             int size = code[(pc++)];
/*  260 */             offset += field * size;
/*      */           }
/*  262 */           int new_address = ptr + offset;
/*  263 */           frame.setPointerAddress(dest, new_address);
/*  264 */           break;
/*      */         case 7: 
/*  266 */           dest = code[pc];
/*  267 */           a = code[(pc + 1)];
/*  268 */           int off = code[(pc + 2)];
/*  269 */           frame.setPointerAddress(dest, frame.getPointerAddress(a) + off);
/*  270 */           pc += 3;
/*  271 */           break;
/*      */         
/*      */         case 8: 
/*  274 */           a = code[(pc++)];
/*  275 */           b = code[(pc++)];
/*  276 */           c = code[pc];
/*  277 */           if (frame.getI1(a)) {
/*  278 */             pc = b;
/*      */           } else
/*  280 */             pc = c;
/*  281 */           break;
/*      */         case 9: 
/*  283 */           dest = code[(pc++)];
/*  284 */           a = code[(pc++)];
/*  285 */           frame.cmpZero(dest, a);
/*  286 */           break;
/*      */         case 10: 
/*  288 */           dest = code[(pc++)];
/*  289 */           a = code[(pc++)];
/*  290 */           b = code[(pc++)];
/*  291 */           frame.setI32(dest, MathUtils.and(frame.getI32(a), frame.getI32(b)));
/*  292 */           break;
/*      */         case 11: 
/*  294 */           a = code[(pc++)];
/*  295 */           b = code[(pc++)];
/*  296 */           ptr = frame.getPointerAddress(a);
/*  297 */           MainMemory.setI32(ptr, frame.getI32(b));
/*  298 */           break;
/*      */         case 12: 
/*  300 */           dest = code[(pc++)];
/*  301 */           a = code[(pc++)];
/*  302 */           b = code[(pc++)];
/*  303 */           frame.setI32(dest, MathUtils.add(frame.getI32(a), frame.getI32(b)));
/*  304 */           break;
/*      */         case 13: 
/*  306 */           dest = code[(pc++)];
/*  307 */           a = code[(pc++)];
/*  308 */           ptr = frame.getPointerAddress(a);
/*  309 */           frame.setI8(dest, MainMemory.getI8(ptr));
/*  310 */           break;
/*      */         case 14: 
/*  312 */           pc = code[pc];
/*  313 */           break;
/*      */         case 15: 
/*  315 */           dest = code[(pc++)];
/*  316 */           a = code[(pc++)];
/*  317 */           b = code[(pc++)];
/*  318 */           frame.cmp_eq(dest, a, b);
/*  319 */           break;
/*      */         case 16: 
/*  321 */           dest = code[(pc++)];
/*  322 */           a = code[(pc++)];
/*  323 */           ptr = frame.getPointerAddress(a);
/*  324 */           frame.setI16(dest, MainMemory.getI16(ptr));
/*  325 */           break;
/*      */         case 17: 
/*  327 */           return;
/*      */         case 18: 
/*  329 */           int next = code[(pc++)];
/*  330 */           pc++;
/*  331 */           fid = code[(pc++)];
/*  332 */           invoke(env, frame, fid, code, op_start, pc);
/*  333 */           pc = next;
/*  334 */           break;
/*      */         case 19: 
/*  336 */           frame.setPointerAddress(code[pc], MainMemory.alloc(frame.getI32(code[(pc + 1)])));
/*  337 */           pc += 2;
/*  338 */           break;
/*      */         case 20: 
/*  340 */           dest = code[(pc++)];
/*  341 */           a = code[(pc++)];
/*  342 */           b = code[(pc++)];
/*  343 */           frame.setI32(dest, MathUtils.or(frame.getI32(a), frame.getI32(b)));
/*  344 */           break;
/*      */         case 21: 
/*  346 */           dest = code[(pc++)];
/*  347 */           a = code[(pc++)];
/*  348 */           b = code[(pc++)];
/*  349 */           frame.setI32(dest, MathUtils.xor(frame.getI32(a), frame.getI32(b)));
/*  350 */           break;
/*      */         case 22: 
/*  352 */           frame.setI1(code[pc], MathUtils.ugt(frame.getI32(code[(pc + 1)]), frame.getI32(code[(pc + 2)])));
/*  353 */           pc += 3;
/*  354 */           break;
/*      */         case 23: 
/*  356 */           ptr = frame.getPointerAddress(code[pc]);
/*  357 */           MainMemory.setI16(ptr, frame.getI16(code[(pc + 1)]));
/*  358 */           pc += 2;
/*  359 */           break;
/*      */         case 24: 
/*  361 */           a = code[pc];
/*  362 */           frame.setReturn(a);
/*  363 */           return;
/*      */         case 25: 
/*  365 */           int nowind = code[(pc++)];
/*  366 */           pc++;
/*  367 */           fid = code[(pc++)];
/*  368 */           invoke(env, frame, frame.getI32(fid), code, op_start, pc);
/*  369 */           pc = nowind;
/*  370 */           break;
/*      */         case 26: 
/*  372 */           dest = code[(pc++)];
/*  373 */           a = code[(pc++)];
/*  374 */           b = code[(pc++)];
/*  375 */           frame.setI32(dest, MathUtils.lshr(frame.getI32(a), frame.getI32(b)));
/*  376 */           break;
/*      */         case 27: 
/*  378 */           src = code[(pc++)];
/*  379 */           a = code[(pc++)];
/*  380 */           ptr = frame.getPointerAddress(src);
/*  381 */           MainMemory.setI8(ptr, frame.getI8(a));
/*  382 */           break;
/*      */         case 28: 
/*  384 */           dest = code[(pc++)];
/*  385 */           a = code[(pc++)];
/*  386 */           b = code[(pc++)];
/*  387 */           frame.setI1(dest, MathUtils.slt(frame.getI32(a), frame.getI32(b)));
/*  388 */           break;
/*      */         case 29: 
/*  390 */           dest = code[(pc++)];
/*  391 */           a = code[(pc++)];
/*  392 */           b = code[(pc++)];
/*  393 */           frame.setI1(dest, MathUtils.ult(frame.getI32(a), frame.getI32(b)));
/*  394 */           break;
/*      */         case 30: 
/*  396 */           dest = code[(pc++)];
/*  397 */           width = code[(pc++)];
/*  398 */           a = code[(pc++)];
/*  399 */           CastOps.trunc8(frame, dest, width, a);
/*  400 */           break;
/*      */         case 31: 
/*  402 */           dest = code[(pc++)];
/*  403 */           a = code[(pc++)];
/*  404 */           b = code[(pc++)];
/*  405 */           frame.setI1(dest, MathUtils.sgt(frame.getI32(a), frame.getI32(b)));
/*  406 */           break;
/*      */         case 32: 
/*  408 */           dest = code[(pc++)];
/*  409 */           a = code[(pc++)];
/*  410 */           b = code[(pc++)];
/*  411 */           frame.setI32(dest, MathUtils.sub(frame.getI32(a), frame.getI32(b)));
/*  412 */           break;
/*      */         default: 
/*  414 */           pc = intp_instruction_middle(env, frame, code, op_start, pc, op); }
/*      */       }
/*      */     } catch (UnwindException uwe) {
/*      */       for (;;) {
/*  418 */         if (unwind < 0) {
/*  419 */           throw uwe;
/*      */         }
/*  421 */         pc = unwind;
/*      */       }
/*  423 */     } catch (LongJmpException longjmp) { for (;;) { longjmp.add(code[op_start], function.getName());
/*  424 */         int ___jmp_buf = longjmp.getJmpBufPtr();
/*  425 */         op_start = MainMemory.getInt(___jmp_buf, 0);
/*  426 */         int lineNumber = MainMemory.getInt(___jmp_buf, 1);
/*  427 */         if ((op_start >= code.length) || (code[op_start] != lineNumber)) throw longjmp;
/*  428 */         pc = MainMemory.getInt(___jmp_buf, 2);
/*  429 */         int dest = MainMemory.getInt(___jmp_buf, 3);
/*  430 */         frame.setI32(dest, longjmp.getReturnValue());
/*      */       }
/*  432 */     } catch (ExecException ee) { ee.add(code[op_start], function.getName());
/*  433 */       throw ee;
/*      */     } catch (MemoryWatchException mwe) {
/*  435 */       for (;;) { System.out.println(mwe.getMessage() + " " + code[op_start]);
/*      */       }
/*  437 */     } catch (ControlException re) { throw re;
/*      */     } catch (RuntimeException re) {
/*  439 */       ExecException execException = new ExecException(re.getMessage(), re);
/*  440 */       int ln = -1;
/*  441 */       if (code.length > op_start) ln = code[op_start];
/*  442 */       execException.add(ln, function.getName());
/*  443 */       throw execException;
/*      */     }
/*      */   }
/*      */   
/*      */   private static int do_instrument(Env env, CompiledFunction function, Frame frame, int[] code, int op_start, int pc, int op)
/*      */   {
/*  449 */     op >>>= 24;
/*  450 */     switch (op) {
/*      */     case 1: 
/*  452 */       enter(function, frame);
/*  453 */       return pc;
/*      */     case 2: 
/*  455 */       exit(function);
/*  456 */       return pc;
/*      */     case 4: 
/*  458 */       int debugLineNumber = code[(pc + 1)];
/*  459 */       pc += 3;
/*  460 */       return pc;
/*      */     case 5: 
/*  462 */       pc += 3;
/*  463 */       return pc;
/*      */     
/*      */     case 3: 
/*  466 */       return pc;
/*      */     case 6: 
/*  468 */       int line = code[op_start];
/*  469 */       return pc;
/*      */     }
/*  471 */     return pc; }
/*      */   
/*      */   private static int intp_instruction_middle(Env env, Frame frame, int[] code, int op_start, int pc, int op) { int a;
/*      */     int b;
/*      */     int fid;
/*      */     int dest;
/*  477 */     int width; int ptr; int src; switch (op)
/*      */     {
/*      */     case 33: 
/*  480 */       a = code[pc];
/*  481 */       int _default = code[(pc + 1)];
/*  482 */       int count = code[(pc + 2)];
/*  483 */       pc += 3;
/*  484 */       int val = frame.getI32(a);
/*  485 */       for (int i = 0; i < count; i++) {
/*  486 */         if (code[pc] == val) return code[(pc + 1)];
/*  487 */         pc += 2;
/*      */       }
/*  489 */       return _default;
/*      */     case 294: 
/*  491 */       a = code[(pc++)];
/*  492 */       b = code[(pc++)];
/*  493 */       fid = code[(pc++)];
/*      */       try {
/*  495 */         invoke(env, frame, fid, code, op_start, pc);
/*  496 */         return a;
/*      */       } catch (UnwindException uwe) {
/*  498 */         return b;
/*      */       }
/*      */     case 293: 
/*  501 */       a = code[(pc++)];
/*  502 */       b = code[(pc++)];
/*  503 */       fid = code[(pc++)];
/*      */       try
/*      */       {
/*  506 */         invoke(env, frame, frame.getI32(fid), code, op_start, pc);
/*  507 */         return a;
/*      */       } catch (UnwindException uwe) {
/*  509 */         return b;
/*      */       }
/*      */     
/*      */     case 53: 
/*  513 */       dest = code[(pc++)];
/*  514 */       a = code[(pc++)];
/*  515 */       b = code[(pc++)];
/*  516 */       frame.setI8(dest, MathUtils.udiv(frame.getI8(a), frame.getI8(b)));
/*  517 */       return pc;
/*      */     case 54: 
/*  519 */       dest = code[(pc++)];
/*  520 */       a = code[(pc++)];
/*  521 */       b = code[(pc++)];
/*  522 */       frame.setI32(dest, MathUtils.udiv(frame.getI32(a), frame.getI32(b)));
/*  523 */       return pc;
/*      */     case 55: 
/*  525 */       dest = code[(pc++)];
/*  526 */       a = code[(pc++)];
/*  527 */       b = code[(pc++)];
/*  528 */       frame.setI64(dest, MathUtils.udiv(frame.getI64(a), frame.getI64(b)));
/*  529 */       return pc;
/*      */     
/*      */     case 50: 
/*  532 */       dest = code[(pc++)];
/*  533 */       a = code[(pc++)];
/*  534 */       b = code[(pc++)];
/*  535 */       frame.setI8(dest, MathUtils.urem(frame.getI8(a), frame.getI8(b)));
/*  536 */       return pc;
/*      */     case 51: 
/*  538 */       dest = code[(pc++)];
/*  539 */       a = code[(pc++)];
/*  540 */       b = code[(pc++)];
/*  541 */       frame.setI32(dest, MathUtils.urem(frame.getI32(a), frame.getI32(b)));
/*  542 */       return pc;
/*      */     case 52: 
/*  544 */       dest = code[(pc++)];
/*  545 */       a = code[(pc++)];
/*  546 */       b = code[(pc++)];
/*  547 */       frame.setI64(dest, MathUtils.urem(frame.getI64(a), frame.getI64(b)));
/*  548 */       return pc;
/*      */     case 45: 
/*  550 */       dest = code[(pc++)];
/*  551 */       a = code[(pc++)];
/*  552 */       b = code[(pc++)];
/*  553 */       frame.setI16(dest, MathUtils.sdiv(frame.getI16(a), frame.getI16(b)));
/*  554 */       return pc;
/*      */     case 46: 
/*  556 */       dest = code[(pc++)];
/*  557 */       a = code[(pc++)];
/*  558 */       b = code[(pc++)];
/*  559 */       frame.setI32(dest, MathUtils.sdiv(frame.getI32(a), frame.getI32(b)));
/*  560 */       return pc;
/*      */     case 47: 
/*  562 */       dest = code[(pc++)];
/*  563 */       a = code[(pc++)];
/*  564 */       b = code[(pc++)];
/*  565 */       frame.setI64(dest, MathUtils.sdiv(frame.getI64(a), frame.getI64(b)));
/*  566 */       return pc;
/*      */     case 48: 
/*  568 */       dest = code[(pc++)];
/*  569 */       a = code[(pc++)];
/*  570 */       b = code[(pc++)];
/*  571 */       frame.setI32(dest, MathUtils.srem(frame.getI32(a), frame.getI32(b)));
/*  572 */       return pc;
/*      */     case 49: 
/*  574 */       dest = code[(pc++)];
/*  575 */       a = code[(pc++)];
/*  576 */       b = code[(pc++)];
/*  577 */       frame.setI64(dest, MathUtils.srem(frame.getI64(a), frame.getI64(b)));
/*  578 */       return pc;
/*      */     
/*      */     case 56: 
/*  581 */       dest = code[(pc++)];
/*  582 */       a = code[(pc++)];
/*  583 */       b = code[(pc++)];
/*  584 */       frame.setI8(dest, MathUtils.shl(frame.getI8(a), frame.getI32(b)));
/*  585 */       return pc;
/*      */     case 57: 
/*  587 */       dest = code[(pc++)];
/*  588 */       a = code[(pc++)];
/*  589 */       b = code[(pc++)];
/*  590 */       frame.setI16(dest, MathUtils.shl(frame.getI16(a), frame.getI32(b)));
/*  591 */       return pc;
/*      */     case 58: 
/*  593 */       dest = code[(pc++)];
/*  594 */       a = code[(pc++)];
/*  595 */       b = code[(pc++)];
/*  596 */       frame.setI32(dest, MathUtils.shl(frame.getI32(a), frame.getI32(b)));
/*  597 */       return pc;
/*      */     case 59: 
/*  599 */       dest = code[(pc++)];
/*  600 */       a = code[(pc++)];
/*  601 */       b = code[(pc++)];
/*  602 */       frame.setI64(dest, MathUtils.shl(frame.getI64(a), frame.getI32(b)));
/*  603 */       return pc;
/*      */     case 60: 
/*  605 */       dest = code[(pc++)];
/*  606 */       a = code[(pc++)];
/*  607 */       b = code[(pc++)];
/*  608 */       frame.setI96(dest, MathUtils.shl(frame.getI96(a), frame.getI32(b)));
/*  609 */       return pc;
/*      */     case 61: 
/*  611 */       dest = code[(pc++)];
/*  612 */       a = code[(pc++)];
/*  613 */       b = code[(pc++)];
/*  614 */       frame.setI128(dest, MathUtils.shl(frame.getI128(a), frame.getI32(b)));
/*  615 */       return pc;
/*      */     
/*      */     case 62: 
/*  618 */       dest = code[(pc++)];
/*  619 */       a = code[(pc++)];
/*  620 */       b = code[(pc++)];
/*  621 */       frame.setI8(dest, MathUtils.lshr(frame.getI8(a), frame.getI32(b)));
/*  622 */       return pc;
/*      */     case 63: 
/*  624 */       dest = code[(pc++)];
/*  625 */       a = code[(pc++)];
/*  626 */       b = code[(pc++)];
/*  627 */       frame.setI16(dest, MathUtils.lshr(frame.getI16(a), frame.getI32(b)));
/*  628 */       return pc;
/*      */     case 64: 
/*  630 */       dest = code[(pc++)];
/*  631 */       a = code[(pc++)];
/*  632 */       b = code[(pc++)];
/*  633 */       frame.setI64(dest, MathUtils.lshr(frame.getI64(a), frame.getI32(b)));
/*  634 */       return pc;
/*      */     case 65: 
/*  636 */       dest = code[(pc++)];
/*  637 */       a = code[(pc++)];
/*  638 */       b = code[(pc++)];
/*  639 */       frame.setI96(dest, MathUtils.lshr(frame.getI96(a), frame.getI32(b)));
/*  640 */       return pc;
/*      */     case 66: 
/*  642 */       dest = code[(pc++)];
/*  643 */       a = code[(pc++)];
/*  644 */       b = code[(pc++)];
/*  645 */       frame.setI128(dest, MathUtils.lshr(frame.getI128(a), frame.getI32(b)));
/*  646 */       return pc;
/*      */     
/*      */     case 67: 
/*  649 */       dest = code[(pc++)];
/*  650 */       a = code[(pc++)];
/*  651 */       b = code[(pc++)];
/*  652 */       frame.setI8(dest, MathUtils.ashr(frame.getI8(a), frame.getI32(b)));
/*  653 */       return pc;
/*      */     case 68: 
/*  655 */       dest = code[(pc++)];
/*  656 */       a = code[(pc++)];
/*  657 */       b = code[(pc++)];
/*  658 */       frame.setI16(dest, MathUtils.ashr(frame.getI16(a), frame.getI32(b)));
/*  659 */       return pc;
/*      */     case 69: 
/*  661 */       dest = code[(pc++)];
/*  662 */       a = code[(pc++)];
/*  663 */       b = code[(pc++)];
/*  664 */       frame.setI32(dest, MathUtils.ashr(frame.getI32(a), frame.getI32(b)));
/*  665 */       return pc;
/*      */     case 70: 
/*  667 */       dest = code[(pc++)];
/*  668 */       a = code[(pc++)];
/*  669 */       b = code[(pc++)];
/*  670 */       frame.setI64(dest, MathUtils.ashr(frame.getI64(a), frame.getI32(b)));
/*  671 */       return pc;
/*      */     case 149: 
/*  673 */       dest = code[(pc++)];
/*  674 */       a = code[(pc++)];
/*  675 */       b = code[(pc++)];
/*  676 */       frame.setI1(dest, (frame.getI1(a)) && (frame.getI1(b)));
/*  677 */       return pc;
/*      */     case 150: 
/*  679 */       dest = code[(pc++)];
/*  680 */       a = code[(pc++)];
/*  681 */       b = code[(pc++)];
/*  682 */       frame.setI8(dest, MathUtils.and(frame.getI8(a), frame.getI8(b)));
/*  683 */       return pc;
/*      */     case 151: 
/*  685 */       dest = code[(pc++)];
/*  686 */       a = code[(pc++)];
/*  687 */       b = code[(pc++)];
/*  688 */       frame.setI16(dest, MathUtils.and(frame.getI16(a), frame.getI16(b)));
/*  689 */       return pc;
/*      */     case 101: 
/*  691 */       dest = code[(pc++)];
/*  692 */       a = code[(pc++)];
/*  693 */       b = code[(pc++)];
/*  694 */       frame.setI64(dest, MathUtils.and(frame.getI64(a), frame.getI64(b)));
/*  695 */       return pc;
/*      */     case 102: 
/*  697 */       dest = code[(pc++)];
/*  698 */       a = code[(pc++)];
/*  699 */       b = code[(pc++)];
/*  700 */       frame.setI96(dest, MathUtils.and(frame.getI96(a), frame.getI96(b)));
/*  701 */       return pc;
/*      */     case 103: 
/*  703 */       dest = code[(pc++)];
/*  704 */       a = code[(pc++)];
/*  705 */       b = code[(pc++)];
/*  706 */       frame.setI128(dest, MathUtils.and(frame.getI128(a), frame.getI128(b)));
/*  707 */       return pc;
/*      */     case 152: 
/*  709 */       dest = code[(pc++)];
/*  710 */       a = code[(pc++)];
/*  711 */       b = code[(pc++)];
/*  712 */       frame.setI1(dest, (frame.getI1(a)) || (frame.getI1(b)));
/*  713 */       return pc;
/*      */     case 153: 
/*  715 */       dest = code[(pc++)];
/*  716 */       a = code[(pc++)];
/*  717 */       b = code[(pc++)];
/*  718 */       frame.setI8(dest, MathUtils.or(frame.getI8(a), frame.getI8(b)));
/*  719 */       return pc;
/*      */     case 154: 
/*  721 */       dest = code[(pc++)];
/*  722 */       a = code[(pc++)];
/*  723 */       b = code[(pc++)];
/*  724 */       frame.setI16(dest, MathUtils.or(frame.getI16(a), frame.getI16(b)));
/*  725 */       return pc;
/*      */     case 96: 
/*  727 */       dest = code[(pc++)];
/*  728 */       a = code[(pc++)];
/*  729 */       b = code[(pc++)];
/*  730 */       frame.setI64(dest, MathUtils.or(frame.getI64(a), frame.getI64(b)));
/*  731 */       return pc;
/*      */     case 155: 
/*  733 */       dest = code[(pc++)];
/*  734 */       a = code[(pc++)];
/*  735 */       b = code[(pc++)];
/*  736 */       frame.setI96(dest, MathUtils.or(frame.getI96(a), frame.getI96(b)));
/*  737 */       return pc;
/*      */     case 97: 
/*  739 */       dest = code[(pc++)];
/*  740 */       a = code[(pc++)];
/*  741 */       b = code[(pc++)];
/*  742 */       frame.setI128(dest, MathUtils.or(frame.getI128(a), frame.getI128(b)));
/*  743 */       return pc;
/*      */     case 98: 
/*  745 */       dest = code[(pc++)];
/*  746 */       a = code[(pc++)];
/*  747 */       b = code[(pc++)];
/*  748 */       frame.setI64(dest, MathUtils.xor(frame.getI64(a), frame.getI64(b)));
/*  749 */       return pc;
/*      */     case 99: 
/*  751 */       dest = code[(pc++)];
/*  752 */       a = code[(pc++)];
/*  753 */       b = code[(pc++)];
/*  754 */       frame.setI96(dest, MathUtils.xor(frame.getI96(a), frame.getI96(b)));
/*  755 */       return pc;
/*      */     case 100: 
/*  757 */       dest = code[(pc++)];
/*  758 */       a = code[(pc++)];
/*  759 */       b = code[(pc++)];
/*  760 */       frame.setI128(dest, MathUtils.xor(frame.getI128(a), frame.getI128(b)));
/*  761 */       return pc;
/*      */     case 35: 
/*  763 */       dest = code[(pc++)];
/*  764 */       width = code[(pc++)];
/*  765 */       a = code[(pc++)];
/*  766 */       b = code[(pc++)];
/*  767 */       int c = code[(pc++)];
/*  768 */       if (frame.getI1(a)) {
/*  769 */         frame.copy(b, dest, width);
/*      */       } else
/*  771 */         frame.copy(c, dest, width);
/*  772 */       return pc;
/*      */     case 81: 
/*  774 */       dest = code[(pc++)];
/*  775 */       a = code[(pc++)];
/*  776 */       ptr = frame.getPointerAddress(a);
/*  777 */       frame.setI1(dest, MainMemory.getI1(ptr));
/*  778 */       return pc;
/*      */     case 82: 
/*  780 */       dest = code[(pc++)];
/*  781 */       a = code[(pc++)];
/*  782 */       ptr = frame.getPointerAddress(a);
/*  783 */       frame.setI64(dest, MainMemory.getI64(ptr));
/*  784 */       return pc;
/*      */     case 83: 
/*  786 */       dest = code[(pc++)];
/*  787 */       a = code[(pc++)];
/*  788 */       ptr = frame.getPointerAddress(a);
/*  789 */       frame.setI96(dest, MainMemory.getI96(ptr));
/*  790 */       return pc;
/*      */     case 84: 
/*  792 */       dest = code[(pc++)];
/*  793 */       a = code[(pc++)];
/*  794 */       ptr = frame.getPointerAddress(a);
/*  795 */       frame.setF32(dest, MainMemory.getF32(ptr));
/*  796 */       return pc;
/*      */     case 85: 
/*  798 */       dest = code[(pc++)];
/*  799 */       a = code[(pc++)];
/*  800 */       ptr = frame.getPointerAddress(a);
/*  801 */       frame.setF64(dest, MainMemory.getF64(ptr));
/*  802 */       return pc;
/*      */     case 86: 
/*  804 */       src = code[(pc++)];
/*  805 */       a = code[(pc++)];
/*  806 */       ptr = frame.getPointerAddress(src);
/*  807 */       MainMemory.setI1(ptr, frame.getI1(a));
/*      */       
/*  809 */       return pc;
/*      */     case 87: 
/*  811 */       src = code[(pc++)];
/*  812 */       a = code[(pc++)];
/*  813 */       ptr = frame.getPointerAddress(src);
/*  814 */       MainMemory.setI64(ptr, frame.getI64(a));
/*      */       
/*  816 */       return pc;
/*      */     
/*      */     case 89: 
/*  819 */       src = code[(pc++)];
/*  820 */       a = code[(pc++)];
/*  821 */       ptr = frame.getPointerAddress(src);
/*  822 */       MainMemory.setF32(ptr, frame.getF32(a));
/*  823 */       return pc;
/*      */     
/*      */     case 88: 
/*  826 */       src = code[(pc++)];
/*  827 */       a = code[(pc++)];
/*  828 */       ptr = frame.getPointerAddress(src);
/*  829 */       MainMemory.setF64(ptr, frame.getF64(a));
/*  830 */       return pc;
/*      */     
/*      */     case 106: 
/*  833 */       dest = code[(pc++)];
/*  834 */       a = code[(pc++)];
/*  835 */       b = code[(pc++)];
/*  836 */       frame.setI1(dest, MathUtils.eq(frame.getI8(a), frame.getI8(b)));
/*  837 */       return pc;
/*      */     case 116: 
/*  839 */       dest = code[(pc++)];
/*  840 */       a = code[(pc++)];
/*  841 */       b = code[(pc++)];
/*  842 */       frame.setI1(dest, MathUtils.eq(frame.getI16(a), frame.getI16(b)));
/*  843 */       return pc;
/*      */     case 129: 
/*  845 */       dest = code[(pc++)];
/*  846 */       a = code[(pc++)];
/*  847 */       b = code[(pc++)];
/*  848 */       frame.setI1(dest, MathUtils.eq(frame.getI64(a), frame.getI64(b)));
/*  849 */       return pc;
/*      */     
/*      */     case 107: 
/*  852 */       dest = code[(pc++)];
/*  853 */       a = code[(pc++)];
/*  854 */       b = code[(pc++)];
/*  855 */       frame.setI1(dest, MathUtils.ne(frame.getI8(a), frame.getI8(b)));
/*  856 */       return pc;
/*      */     case 117: 
/*  858 */       dest = code[(pc++)];
/*  859 */       a = code[(pc++)];
/*  860 */       b = code[(pc++)];
/*  861 */       frame.setI1(dest, MathUtils.ne(frame.getI16(a), frame.getI16(b)));
/*  862 */       return pc;
/*      */     case 126: 
/*  864 */       dest = code[(pc++)];
/*  865 */       a = code[(pc++)];
/*  866 */       b = code[(pc++)];
/*  867 */       frame.setI1(dest, MathUtils.ne(frame.getI32(a), frame.getI32(b)));
/*  868 */       return pc;
/*      */     case 130: 
/*  870 */       dest = code[(pc++)];
/*  871 */       a = code[(pc++)];
/*  872 */       b = code[(pc++)];
/*  873 */       frame.setI1(dest, MathUtils.ne(frame.getI64(a), frame.getI64(b)));
/*  874 */       return pc;
/*      */     
/*      */     case 111: 
/*  877 */       dest = code[(pc++)];
/*  878 */       a = code[(pc++)];
/*  879 */       b = code[(pc++)];
/*  880 */       frame.setI1(dest, MathUtils.sge(frame.getI8(a), frame.getI8(b)));
/*  881 */       return pc;
/*      */     case 121: 
/*  883 */       dest = code[(pc++)];
/*  884 */       a = code[(pc++)];
/*  885 */       b = code[(pc++)];
/*  886 */       frame.setI1(dest, MathUtils.sge(frame.getI16(a), frame.getI16(b)));
/*  887 */       return pc;
/*      */     case 134: 
/*  889 */       dest = code[(pc++)];
/*  890 */       a = code[(pc++)];
/*  891 */       b = code[(pc++)];
/*  892 */       frame.setI1(dest, MathUtils.sge(frame.getI64(a), frame.getI64(b)));
/*  893 */       return pc;
/*      */     
/*      */     case 109: 
/*  896 */       dest = code[(pc++)];
/*  897 */       a = code[(pc++)];
/*  898 */       b = code[(pc++)];
/*  899 */       frame.setI1(dest, MathUtils.sgt(frame.getI8(a), frame.getI8(b)));
/*  900 */       return pc;
/*      */     case 119: 
/*  902 */       dest = code[(pc++)];
/*  903 */       a = code[(pc++)];
/*  904 */       b = code[(pc++)];
/*  905 */       frame.setI1(dest, MathUtils.sgt(frame.getI16(a), frame.getI16(b)));
/*  906 */       return pc;
/*      */     case 132: 
/*  908 */       dest = code[(pc++)];
/*  909 */       a = code[(pc++)];
/*  910 */       b = code[(pc++)];
/*  911 */       frame.setI1(dest, MathUtils.sgt(frame.getI64(a), frame.getI64(b)));
/*  912 */       return pc;
/*      */     
/*      */     case 108: 
/*  915 */       dest = code[(pc++)];
/*  916 */       a = code[(pc++)];
/*  917 */       b = code[(pc++)];
/*  918 */       frame.setI1(dest, MathUtils.slt(frame.getI8(a), frame.getI8(b)));
/*  919 */       return pc;
/*      */     case 118: 
/*  921 */       dest = code[(pc++)];
/*  922 */       a = code[(pc++)];
/*  923 */       b = code[(pc++)];
/*  924 */       frame.setI1(dest, MathUtils.slt(frame.getI16(a), frame.getI16(b)));
/*  925 */       return pc;
/*      */     case 131: 
/*  927 */       dest = code[(pc++)];
/*  928 */       a = code[(pc++)];
/*  929 */       b = code[(pc++)];
/*  930 */       frame.setI1(dest, MathUtils.slt(frame.getI64(a), frame.getI64(b)));
/*  931 */       return pc;
/*      */     
/*      */     case 110: 
/*  934 */       dest = code[(pc++)];
/*  935 */       a = code[(pc++)];
/*  936 */       b = code[(pc++)];
/*  937 */       frame.setI1(dest, MathUtils.sle(frame.getI8(a), frame.getI8(b)));
/*  938 */       return pc;
/*      */     case 120: 
/*  940 */       dest = code[(pc++)];
/*  941 */       a = code[(pc++)];
/*  942 */       b = code[(pc++)];
/*  943 */       frame.setI1(dest, MathUtils.sle(frame.getI16(a), frame.getI16(b)));
/*  944 */       return pc;
/*      */     case 133: 
/*  946 */       dest = code[(pc++)];
/*  947 */       a = code[(pc++)];
/*  948 */       b = code[(pc++)];
/*  949 */       frame.setI1(dest, MathUtils.sle(frame.getI64(a), frame.getI64(b)));
/*  950 */       return pc;
/*      */     
/*      */     case 114: 
/*  953 */       dest = code[(pc++)];
/*  954 */       a = code[(pc++)];
/*  955 */       b = code[(pc++)];
/*  956 */       frame.setI1(dest, MathUtils.uge(frame.getI8(a), frame.getI8(b)));
/*  957 */       return pc;
/*      */     case 125: 
/*  959 */       dest = code[(pc++)];
/*  960 */       a = code[(pc++)];
/*  961 */       b = code[(pc++)];
/*  962 */       frame.setI1(dest, MathUtils.uge(frame.getI16(a), frame.getI16(b)));
/*  963 */       return pc;
/*      */     case 128: 
/*  965 */       dest = code[(pc++)];
/*  966 */       a = code[(pc++)];
/*  967 */       b = code[(pc++)];
/*  968 */       frame.setI1(dest, MathUtils.uge(frame.getI32(a), frame.getI32(b)));
/*  969 */       return pc;
/*      */     case 138: 
/*  971 */       dest = code[(pc++)];
/*  972 */       a = code[(pc++)];
/*  973 */       b = code[(pc++)];
/*  974 */       frame.setI1(dest, MathUtils.uge(frame.getI64(a), frame.getI64(b)));
/*  975 */       return pc;
/*      */     
/*      */     case 115: 
/*  978 */       dest = code[(pc++)];
/*  979 */       a = code[(pc++)];
/*  980 */       b = code[(pc++)];
/*  981 */       frame.setI1(dest, MathUtils.ugt(frame.getI8(a), frame.getI8(b)));
/*  982 */       return pc;
/*      */     case 123: 
/*  984 */       dest = code[(pc++)];
/*  985 */       a = code[(pc++)];
/*  986 */       b = code[(pc++)];
/*  987 */       frame.setI1(dest, MathUtils.ugt(frame.getI16(a), frame.getI16(b)));
/*  988 */       return pc;
/*      */     case 136: 
/*  990 */       dest = code[(pc++)];
/*  991 */       a = code[(pc++)];
/*  992 */       b = code[(pc++)];
/*  993 */       frame.setI1(dest, MathUtils.ugt(frame.getI64(a), frame.getI64(b)));
/*  994 */       return pc;
/*      */     
/*      */     case 112: 
/*  997 */       dest = code[(pc++)];
/*  998 */       a = code[(pc++)];
/*  999 */       b = code[(pc++)];
/* 1000 */       frame.setI1(dest, MathUtils.ult(frame.getI8(a), frame.getI8(b)));
/* 1001 */       return pc;
/*      */     case 122: 
/* 1003 */       dest = code[(pc++)];
/* 1004 */       a = code[(pc++)];
/* 1005 */       b = code[(pc++)];
/* 1006 */       frame.setI1(dest, MathUtils.ult(frame.getI16(a), frame.getI16(b)));
/* 1007 */       return pc;
/*      */     case 135: 
/* 1009 */       dest = code[(pc++)];
/* 1010 */       a = code[(pc++)];
/* 1011 */       b = code[(pc++)];
/* 1012 */       frame.setI1(dest, MathUtils.ult(frame.getI64(a), frame.getI64(b)));
/* 1013 */       return pc;
/*      */     
/*      */ 
/*      */     case 113: 
/* 1017 */       dest = code[(pc++)];
/* 1018 */       a = code[(pc++)];
/* 1019 */       b = code[(pc++)];
/* 1020 */       frame.setI1(dest, MathUtils.ule(frame.getI8(a), frame.getI8(b)));
/* 1021 */       return pc;
/*      */     
/*      */     case 124: 
/* 1024 */       dest = code[(pc++)];
/* 1025 */       a = code[(pc++)];
/* 1026 */       b = code[(pc++)];
/* 1027 */       frame.setI1(dest, MathUtils.ule(frame.getI16(a), frame.getI16(b)));
/* 1028 */       return pc;
/*      */     
/*      */     case 127: 
/* 1031 */       dest = code[(pc++)];
/* 1032 */       a = code[(pc++)];
/* 1033 */       b = code[(pc++)];
/* 1034 */       frame.setI1(dest, MathUtils.ule(frame.getI32(a), frame.getI32(b)));
/* 1035 */       return pc;
/*      */     
/*      */     case 137: 
/* 1038 */       dest = code[(pc++)];
/* 1039 */       a = code[(pc++)];
/* 1040 */       b = code[(pc++)];
/* 1041 */       frame.setI1(dest, MathUtils.ule(frame.getI64(a), frame.getI64(b)));
/* 1042 */       return pc;
/*      */     
/*      */     case 104: 
/* 1045 */       dest = code[(pc++)];
/* 1046 */       a = code[(pc++)];
/* 1047 */       frame.setI1(dest, frame.getI32(a) != 0);
/* 1048 */       return pc;
/*      */     
/*      */     case 139: 
/* 1051 */       dest = code[(pc++)];
/* 1052 */       width = code[(pc++)];
/* 1053 */       a = code[(pc++)];
/* 1054 */       b = code[(pc++)];
/* 1055 */       if (width == 1) {
/* 1056 */         frame.setI1(dest, MathUtils.f_une(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 1058 */         frame.setI1(dest, MathUtils.f_une(frame.getF64(a), frame.getF64(b)));
/* 1059 */       return pc;
/*      */     
/*      */     case 36: 
/* 1062 */       dest = code[(pc++)];
/* 1063 */       a = code[(pc++)];
/* 1064 */       b = code[(pc++)];
/* 1065 */       frame.setI8(dest, MathUtils.add(frame.getI8(a), frame.getI8(b)));
/* 1066 */       return pc;
/*      */     
/*      */     case 37: 
/* 1069 */       dest = code[(pc++)];
/* 1070 */       a = code[(pc++)];
/* 1071 */       b = code[(pc++)];
/* 1072 */       frame.setI16(dest, MathUtils.add(frame.getI16(a), frame.getI16(b)));
/* 1073 */       return pc;
/*      */     
/*      */     case 38: 
/* 1076 */       dest = code[(pc++)];
/* 1077 */       a = code[(pc++)];
/* 1078 */       b = code[(pc++)];
/* 1079 */       frame.setI64(dest, MathUtils.add(frame.getI64(a), frame.getI64(b)));
/* 1080 */       return pc;
/*      */     
/*      */ 
/*      */     case 39: 
/* 1084 */       dest = code[(pc++)];
/* 1085 */       a = code[(pc++)];
/* 1086 */       b = code[(pc++)];
/* 1087 */       frame.setI8(dest, MathUtils.sub(frame.getI8(a), frame.getI8(b)));
/* 1088 */       return pc;
/*      */     
/*      */     case 40: 
/* 1091 */       dest = code[(pc++)];
/* 1092 */       a = code[(pc++)];
/* 1093 */       b = code[(pc++)];
/* 1094 */       frame.setI16(dest, MathUtils.sub(frame.getI16(a), frame.getI16(b)));
/* 1095 */       return pc;
/*      */     
/*      */     case 41: 
/* 1098 */       dest = code[(pc++)];
/* 1099 */       a = code[(pc++)];
/* 1100 */       b = code[(pc++)];
/* 1101 */       frame.setI64(dest, MathUtils.sub(frame.getI64(a), frame.getI64(b)));
/* 1102 */       return pc;
/*      */     
/*      */ 
/*      */     case 42: 
/* 1106 */       dest = code[(pc++)];
/* 1107 */       a = code[(pc++)];
/* 1108 */       b = code[(pc++)];
/* 1109 */       frame.setI8(dest, MathUtils.mul(frame.getI8(a), frame.getI8(b)));
/* 1110 */       return pc;
/*      */     
/*      */     case 43: 
/* 1113 */       dest = code[(pc++)];
/* 1114 */       a = code[(pc++)];
/* 1115 */       b = code[(pc++)];
/* 1116 */       frame.setI16(dest, MathUtils.mul(frame.getI16(a), frame.getI16(b)));
/* 1117 */       return pc;
/*      */     
/*      */     case 34: 
/* 1120 */       dest = code[(pc++)];
/* 1121 */       a = code[(pc++)];
/* 1122 */       b = code[(pc++)];
/* 1123 */       frame.setI32(dest, MathUtils.mul(frame.getI32(a), frame.getI32(b)));
/* 1124 */       return pc;
/*      */     
/*      */     case 44: 
/* 1127 */       dest = code[(pc++)];
/* 1128 */       a = code[(pc++)];
/* 1129 */       b = code[(pc++)];
/* 1130 */       frame.setI64(dest, MathUtils.mul(frame.getI64(a), frame.getI64(b)));
/* 1131 */       return pc;
/*      */     case 79: 
/* 1133 */       dest = code[(pc++)];
/* 1134 */       a = code[(pc++)];
/* 1135 */       b = code[(pc++)];
/* 1136 */       frame.setF32(dest, MathUtils.fmul32(frame.getF32(a), frame.getF32(b)));
/* 1137 */       return pc;
/*      */     case 80: 
/* 1139 */       dest = code[(pc++)];
/* 1140 */       a = code[(pc++)];
/* 1141 */       b = code[(pc++)];
/* 1142 */       frame.setF64(dest, MathUtils.fmul64(frame.getF64(a), frame.getF64(b)));
/* 1143 */       return pc;
/*      */     
/*      */ 
/*      */     case 74: 
/* 1147 */       dest = code[(pc++)];
/* 1148 */       a = code[(pc++)];
/* 1149 */       b = code[(pc++)];
/* 1150 */       frame.setF32(dest, MathUtils.fdiv32(frame.getF32(a), frame.getF32(b)));
/* 1151 */       return pc;
/*      */     
/*      */     case 75: 
/* 1154 */       dest = code[(pc++)];
/* 1155 */       a = code[(pc++)];
/* 1156 */       b = code[(pc++)];
/* 1157 */       frame.setF64(dest, MathUtils.fdiv64(frame.getF64(a), frame.getF64(b)));
/* 1158 */       return pc;
/*      */     
/*      */ 
/*      */     case 76: 
/* 1162 */       dest = code[(pc++)];
/* 1163 */       a = code[(pc++)];
/* 1164 */       b = code[(pc++)];
/* 1165 */       frame.setF32(dest, MathUtils.fadd32(frame.getF32(a), frame.getF32(b)));
/* 1166 */       return pc;
/*      */     
/*      */     case 77: 
/* 1169 */       dest = code[(pc++)];
/* 1170 */       a = code[(pc++)];
/* 1171 */       b = code[(pc++)];
/* 1172 */       frame.setF64(dest, MathUtils.fadd64(frame.getF64(a), frame.getF64(b)));
/* 1173 */       return pc;
/*      */     
/*      */     case 78: 
/* 1176 */       dest = code[(pc++)];
/* 1177 */       a = code[(pc++)];
/* 1178 */       b = code[(pc++)];
/* 1179 */       frame.setF80(dest, MathUtils.fdiv80(frame.getF80(a), frame.getF80(b)));
/* 1180 */       return pc;
/*      */     
/*      */     case 156: 
/* 1183 */       dest = code[(pc++)];
/* 1184 */       a = code[(pc++)];
/*      */       
/* 1186 */       frame.setPointerAddress(dest, frame.getI32(a));
/* 1187 */       return pc;
/*      */     case 157: 
/* 1189 */       dest = code[(pc++)];
/* 1190 */       a = code[(pc++)];
/* 1191 */       ptr = frame.getPointerAddress(a);
/* 1192 */       frame.setI32(dest, ptr);
/* 1193 */       return pc;
/*      */     case 140: 
/* 1195 */       dest = code[(pc++)];
/* 1196 */       a = code[(pc++)];
/* 1197 */       frame.setF32(dest, (float)frame.getF64(a));
/* 1198 */       return pc;
/*      */     case 141: 
/* 1200 */       dest = code[(pc++)];
/* 1201 */       a = code[(pc++)];
/* 1202 */       frame.setF64(dest, frame.getF32(a));
/* 1203 */       return pc;
/*      */     
/*      */     case 92: 
/* 1206 */       dest = code[(pc++)];
/* 1207 */       width = code[(pc++)];
/* 1208 */       a = code[(pc++)];
/* 1209 */       CastOps.sext8(frame, dest, width, a);
/* 1210 */       return pc;
/*      */     case 93: 
/* 1212 */       dest = code[(pc++)];
/* 1213 */       width = code[(pc++)];
/* 1214 */       a = code[(pc++)];
/* 1215 */       CastOps.sext16(frame, dest, width, a);
/* 1216 */       return pc;
/*      */     case 94: 
/* 1218 */       dest = code[(pc++)];
/* 1219 */       width = code[(pc++)];
/* 1220 */       a = code[(pc++)];
/* 1221 */       CastOps.sext32(frame, dest, width, a);
/* 1222 */       return pc;
/*      */     case 95: 
/* 1224 */       dest = code[(pc++)];
/* 1225 */       width = code[(pc++)];
/* 1226 */       a = code[(pc++)];
/* 1227 */       CastOps.sext64(frame, dest, width, a);
/* 1228 */       return pc;
/*      */     
/*      */     case 146: 
/* 1231 */       dest = code[(pc++)];
/* 1232 */       width = code[(pc++)];
/* 1233 */       a = code[(pc++)];
/* 1234 */       CastOps.zext8(frame, dest, width, a);
/* 1235 */       return pc;
/*      */     case 147: 
/* 1237 */       dest = code[(pc++)];
/* 1238 */       width = code[(pc++)];
/* 1239 */       a = code[(pc++)];
/* 1240 */       CastOps.zext16(frame, dest, width, a);
/* 1241 */       return pc;
/*      */     case 148: 
/* 1243 */       dest = code[(pc++)];
/* 1244 */       width = code[(pc++)];
/* 1245 */       a = code[(pc++)];
/* 1246 */       CastOps.zext32(frame, dest, width, a);
/* 1247 */       return pc;
/*      */     case 90: 
/* 1249 */       dest = code[(pc++)];
/* 1250 */       width = code[(pc++)];
/* 1251 */       a = code[(pc++)];
/* 1252 */       CastOps.zext64(frame, dest, width, a);
/* 1253 */       return pc;
/*      */     case 91: 
/* 1255 */       dest = code[(pc++)];
/* 1256 */       width = code[(pc++)];
/* 1257 */       a = code[(pc++)];
/* 1258 */       CastOps.zext128(frame, dest, width, a);
/* 1259 */       return pc;
/*      */     case 71: 
/* 1261 */       dest = code[(pc++)];
/* 1262 */       width = code[(pc++)];
/* 1263 */       a = code[(pc++)];
/* 1264 */       CastOps.trunc16(frame, dest, width, a);
/* 1265 */       return pc;
/*      */     case 72: 
/* 1267 */       dest = code[(pc++)];
/* 1268 */       width = code[(pc++)];
/* 1269 */       a = code[(pc++)];
/* 1270 */       CastOps.trunc32(frame, dest, width, a);
/* 1271 */       return pc;
/*      */     case 73: 
/* 1273 */       dest = code[(pc++)];
/* 1274 */       width = code[(pc++)];
/* 1275 */       a = code[(pc++)];
/* 1276 */       CastOps.trunc64(frame, dest, width, a);
/* 1277 */       return pc;
/*      */     case 142: 
/* 1279 */       dest = code[(pc++)];
/* 1280 */       width = code[(pc++)];
/* 1281 */       a = code[(pc++)];
/* 1282 */       b = code[(pc++)];
/* 1283 */       CastOps.uitofp(frame, width, dest, a, b);
/* 1284 */       return pc;
/*      */     case 144: 
/* 1286 */       dest = code[(pc++)];
/* 1287 */       width = code[(pc++)];
/* 1288 */       a = code[(pc++)];
/* 1289 */       b = code[(pc++)];
/* 1290 */       CastOps.fptoui(frame, width, dest, a, b);
/* 1291 */       return pc;
/*      */     case 143: 
/* 1293 */       dest = code[(pc++)];
/* 1294 */       width = code[(pc++)];
/* 1295 */       a = code[(pc++)];
/* 1296 */       b = code[(pc++)];
/* 1297 */       CastOps.sitofp(frame, width, dest, a, b);
/* 1298 */       return pc;
/*      */     case 145: 
/* 1300 */       dest = code[(pc++)];
/* 1301 */       width = code[(pc++)];
/* 1302 */       a = code[(pc++)];
/* 1303 */       b = code[(pc++)];
/* 1304 */       CastOps.fptosi(frame, width, dest, a, b);
/* 1305 */       return pc;
/*      */     }
/*      */     
/* 1308 */     return intp_instruction_all(env, frame, code, op_start, pc, op); }
/*      */   
/*      */   private static int intp_instruction_all(Env env, Frame frame, int[] code, int op_start, int pc, int op) { int a;
/*      */     int b;
/*      */     int fid;
/*      */     int dest;
/*      */     int width;
/* 1315 */     int ptr; int src; switch (op)
/*      */     {
/*      */     case 33: 
/* 1318 */       a = code[pc];
/* 1319 */       int _default = code[(pc + 1)];
/* 1320 */       int count = code[(pc + 2)];
/* 1321 */       pc += 3;
/* 1322 */       int val = frame.getI32(a);
/* 1323 */       for (int i = 0; i < count; i++) {
/* 1324 */         if (code[pc] == val) return code[(pc + 1)];
/* 1325 */         pc += 2;
/*      */       }
/* 1327 */       return _default;
/*      */     case 294: 
/* 1329 */       a = code[(pc++)];
/* 1330 */       b = code[(pc++)];
/* 1331 */       fid = code[(pc++)];
/*      */       try {
/* 1333 */         invoke(env, frame, fid, code, op_start, pc);
/* 1334 */         return a;
/*      */       } catch (UnwindException uwe) {
/* 1336 */         return b;
/*      */       }
/*      */     case 293: 
/* 1339 */       a = code[(pc++)];
/* 1340 */       b = code[(pc++)];
/* 1341 */       fid = code[(pc++)];
/*      */       try
/*      */       {
/* 1344 */         invoke(env, frame, frame.getI32(fid), code, op_start, pc);
/* 1345 */         return a;
/*      */       } catch (UnwindException uwe) {
/* 1347 */         return b;
/*      */       }
/*      */     case 25: 
/* 1350 */       a = code[(pc++)];
/* 1351 */       pc++;
/* 1352 */       fid = code[(pc++)];
/* 1353 */       invoke(env, frame, frame.getI32(fid), code, op_start, pc);
/* 1354 */       return a;
/*      */     
/*      */     case 53: 
/* 1357 */       dest = code[(pc++)];
/* 1358 */       a = code[(pc++)];
/* 1359 */       b = code[(pc++)];
/* 1360 */       frame.setI8(dest, MathUtils.udiv(frame.getI8(a), frame.getI8(b)));
/* 1361 */       return pc;
/*      */     case 54: 
/* 1363 */       dest = code[(pc++)];
/* 1364 */       a = code[(pc++)];
/* 1365 */       b = code[(pc++)];
/* 1366 */       frame.setI32(dest, MathUtils.udiv(frame.getI32(a), frame.getI32(b)));
/* 1367 */       return pc;
/*      */     case 55: 
/* 1369 */       dest = code[(pc++)];
/* 1370 */       a = code[(pc++)];
/* 1371 */       b = code[(pc++)];
/* 1372 */       frame.setI64(dest, MathUtils.udiv(frame.getI64(a), frame.getI64(b)));
/* 1373 */       return pc;
/*      */     
/*      */     case 50: 
/* 1376 */       dest = code[(pc++)];
/* 1377 */       a = code[(pc++)];
/* 1378 */       b = code[(pc++)];
/* 1379 */       frame.setI8(dest, MathUtils.urem(frame.getI8(a), frame.getI8(b)));
/* 1380 */       return pc;
/*      */     case 51: 
/* 1382 */       dest = code[(pc++)];
/* 1383 */       a = code[(pc++)];
/* 1384 */       b = code[(pc++)];
/* 1385 */       frame.setI32(dest, MathUtils.urem(frame.getI32(a), frame.getI32(b)));
/* 1386 */       return pc;
/*      */     case 52: 
/* 1388 */       dest = code[(pc++)];
/* 1389 */       a = code[(pc++)];
/* 1390 */       b = code[(pc++)];
/* 1391 */       frame.setI64(dest, MathUtils.urem(frame.getI64(a), frame.getI64(b)));
/* 1392 */       return pc;
/*      */     case 45: 
/* 1394 */       dest = code[(pc++)];
/* 1395 */       a = code[(pc++)];
/* 1396 */       b = code[(pc++)];
/* 1397 */       frame.setI16(dest, MathUtils.sdiv(frame.getI16(a), frame.getI16(b)));
/* 1398 */       return pc;
/*      */     case 46: 
/* 1400 */       dest = code[(pc++)];
/* 1401 */       a = code[(pc++)];
/* 1402 */       b = code[(pc++)];
/* 1403 */       frame.setI32(dest, MathUtils.sdiv(frame.getI32(a), frame.getI32(b)));
/* 1404 */       return pc;
/*      */     case 47: 
/* 1406 */       dest = code[(pc++)];
/* 1407 */       a = code[(pc++)];
/* 1408 */       b = code[(pc++)];
/* 1409 */       frame.setI64(dest, MathUtils.sdiv(frame.getI64(a), frame.getI64(b)));
/* 1410 */       return pc;
/*      */     case 48: 
/* 1412 */       dest = code[(pc++)];
/* 1413 */       a = code[(pc++)];
/* 1414 */       b = code[(pc++)];
/* 1415 */       frame.setI32(dest, MathUtils.srem(frame.getI32(a), frame.getI32(b)));
/* 1416 */       return pc;
/*      */     case 49: 
/* 1418 */       dest = code[(pc++)];
/* 1419 */       a = code[(pc++)];
/* 1420 */       b = code[(pc++)];
/* 1421 */       frame.setI64(dest, MathUtils.srem(frame.getI64(a), frame.getI64(b)));
/* 1422 */       return pc;
/*      */     
/*      */     case 56: 
/* 1425 */       dest = code[(pc++)];
/* 1426 */       a = code[(pc++)];
/* 1427 */       b = code[(pc++)];
/* 1428 */       frame.setI8(dest, MathUtils.shl(frame.getI8(a), frame.getI32(b)));
/* 1429 */       return pc;
/*      */     case 57: 
/* 1431 */       dest = code[(pc++)];
/* 1432 */       a = code[(pc++)];
/* 1433 */       b = code[(pc++)];
/* 1434 */       frame.setI16(dest, MathUtils.shl(frame.getI16(a), frame.getI32(b)));
/* 1435 */       return pc;
/*      */     case 58: 
/* 1437 */       dest = code[(pc++)];
/* 1438 */       a = code[(pc++)];
/* 1439 */       b = code[(pc++)];
/* 1440 */       frame.setI32(dest, MathUtils.shl(frame.getI32(a), frame.getI32(b)));
/* 1441 */       return pc;
/*      */     case 59: 
/* 1443 */       dest = code[(pc++)];
/* 1444 */       a = code[(pc++)];
/* 1445 */       b = code[(pc++)];
/* 1446 */       frame.setI64(dest, MathUtils.shl(frame.getI64(a), frame.getI32(b)));
/* 1447 */       return pc;
/*      */     case 60: 
/* 1449 */       dest = code[(pc++)];
/* 1450 */       a = code[(pc++)];
/* 1451 */       b = code[(pc++)];
/* 1452 */       frame.setI96(dest, MathUtils.shl(frame.getI96(a), frame.getI32(b)));
/* 1453 */       return pc;
/*      */     case 61: 
/* 1455 */       dest = code[(pc++)];
/* 1456 */       a = code[(pc++)];
/* 1457 */       b = code[(pc++)];
/* 1458 */       frame.setI128(dest, MathUtils.shl(frame.getI128(a), frame.getI32(b)));
/* 1459 */       return pc;
/*      */     
/*      */     case 62: 
/* 1462 */       dest = code[(pc++)];
/* 1463 */       a = code[(pc++)];
/* 1464 */       b = code[(pc++)];
/* 1465 */       frame.setI8(dest, MathUtils.lshr(frame.getI8(a), frame.getI32(b)));
/* 1466 */       return pc;
/*      */     case 63: 
/* 1468 */       dest = code[(pc++)];
/* 1469 */       a = code[(pc++)];
/* 1470 */       b = code[(pc++)];
/* 1471 */       frame.setI16(dest, MathUtils.lshr(frame.getI16(a), frame.getI32(b)));
/* 1472 */       return pc;
/*      */     case 26: 
/* 1474 */       dest = code[(pc++)];
/* 1475 */       a = code[(pc++)];
/* 1476 */       b = code[(pc++)];
/* 1477 */       frame.setI32(dest, MathUtils.lshr(frame.getI32(a), frame.getI32(b)));
/* 1478 */       return pc;
/*      */     case 64: 
/* 1480 */       dest = code[(pc++)];
/* 1481 */       a = code[(pc++)];
/* 1482 */       b = code[(pc++)];
/* 1483 */       frame.setI64(dest, MathUtils.lshr(frame.getI64(a), frame.getI32(b)));
/* 1484 */       return pc;
/*      */     case 65: 
/* 1486 */       dest = code[(pc++)];
/* 1487 */       a = code[(pc++)];
/* 1488 */       b = code[(pc++)];
/* 1489 */       frame.setI96(dest, MathUtils.lshr(frame.getI96(a), frame.getI32(b)));
/* 1490 */       return pc;
/*      */     case 66: 
/* 1492 */       dest = code[(pc++)];
/* 1493 */       a = code[(pc++)];
/* 1494 */       b = code[(pc++)];
/* 1495 */       frame.setI128(dest, MathUtils.lshr(frame.getI128(a), frame.getI32(b)));
/* 1496 */       return pc;
/*      */     
/*      */     case 67: 
/* 1499 */       dest = code[(pc++)];
/* 1500 */       a = code[(pc++)];
/* 1501 */       b = code[(pc++)];
/* 1502 */       frame.setI8(dest, MathUtils.ashr(frame.getI8(a), frame.getI32(b)));
/* 1503 */       return pc;
/*      */     case 68: 
/* 1505 */       dest = code[(pc++)];
/* 1506 */       a = code[(pc++)];
/* 1507 */       b = code[(pc++)];
/* 1508 */       frame.setI16(dest, MathUtils.ashr(frame.getI16(a), frame.getI32(b)));
/* 1509 */       return pc;
/*      */     case 69: 
/* 1511 */       dest = code[(pc++)];
/* 1512 */       a = code[(pc++)];
/* 1513 */       b = code[(pc++)];
/* 1514 */       frame.setI32(dest, MathUtils.ashr(frame.getI32(a), frame.getI32(b)));
/* 1515 */       return pc;
/*      */     case 70: 
/* 1517 */       dest = code[(pc++)];
/* 1518 */       a = code[(pc++)];
/* 1519 */       b = code[(pc++)];
/* 1520 */       frame.setI64(dest, MathUtils.ashr(frame.getI64(a), frame.getI32(b)));
/* 1521 */       return pc;
/*      */     case 149: 
/* 1523 */       dest = code[(pc++)];
/* 1524 */       a = code[(pc++)];
/* 1525 */       b = code[(pc++)];
/* 1526 */       frame.setI1(dest, (frame.getI1(a)) && (frame.getI1(b)));
/* 1527 */       return pc;
/*      */     case 150: 
/* 1529 */       dest = code[(pc++)];
/* 1530 */       a = code[(pc++)];
/* 1531 */       b = code[(pc++)];
/* 1532 */       frame.setI8(dest, MathUtils.and(frame.getI8(a), frame.getI8(b)));
/* 1533 */       return pc;
/*      */     case 151: 
/* 1535 */       dest = code[(pc++)];
/* 1536 */       a = code[(pc++)];
/* 1537 */       b = code[(pc++)];
/* 1538 */       frame.setI16(dest, MathUtils.and(frame.getI16(a), frame.getI16(b)));
/* 1539 */       return pc;
/*      */     case 101: 
/* 1541 */       dest = code[(pc++)];
/* 1542 */       a = code[(pc++)];
/* 1543 */       b = code[(pc++)];
/* 1544 */       frame.setI64(dest, MathUtils.and(frame.getI64(a), frame.getI64(b)));
/* 1545 */       return pc;
/*      */     case 102: 
/* 1547 */       dest = code[(pc++)];
/* 1548 */       a = code[(pc++)];
/* 1549 */       b = code[(pc++)];
/* 1550 */       frame.setI96(dest, MathUtils.and(frame.getI96(a), frame.getI96(b)));
/* 1551 */       return pc;
/*      */     case 103: 
/* 1553 */       dest = code[(pc++)];
/* 1554 */       a = code[(pc++)];
/* 1555 */       b = code[(pc++)];
/* 1556 */       frame.setI128(dest, MathUtils.and(frame.getI128(a), frame.getI128(b)));
/* 1557 */       return pc;
/*      */     case 152: 
/* 1559 */       dest = code[(pc++)];
/* 1560 */       a = code[(pc++)];
/* 1561 */       b = code[(pc++)];
/* 1562 */       frame.setI1(dest, (frame.getI1(a)) || (frame.getI1(b)));
/* 1563 */       return pc;
/*      */     case 153: 
/* 1565 */       dest = code[(pc++)];
/* 1566 */       a = code[(pc++)];
/* 1567 */       b = code[(pc++)];
/* 1568 */       frame.setI8(dest, MathUtils.or(frame.getI8(a), frame.getI8(b)));
/* 1569 */       return pc;
/*      */     case 154: 
/* 1571 */       dest = code[(pc++)];
/* 1572 */       a = code[(pc++)];
/* 1573 */       b = code[(pc++)];
/* 1574 */       frame.setI16(dest, MathUtils.or(frame.getI16(a), frame.getI16(b)));
/* 1575 */       return pc;
/*      */     case 96: 
/* 1577 */       dest = code[(pc++)];
/* 1578 */       a = code[(pc++)];
/* 1579 */       b = code[(pc++)];
/* 1580 */       frame.setI64(dest, MathUtils.or(frame.getI64(a), frame.getI64(b)));
/* 1581 */       return pc;
/*      */     case 155: 
/* 1583 */       dest = code[(pc++)];
/* 1584 */       a = code[(pc++)];
/* 1585 */       b = code[(pc++)];
/* 1586 */       frame.setI96(dest, MathUtils.or(frame.getI96(a), frame.getI96(b)));
/* 1587 */       return pc;
/*      */     case 97: 
/* 1589 */       dest = code[(pc++)];
/* 1590 */       a = code[(pc++)];
/* 1591 */       b = code[(pc++)];
/* 1592 */       frame.setI128(dest, MathUtils.or(frame.getI128(a), frame.getI128(b)));
/* 1593 */       return pc;
/*      */     case 21: 
/* 1595 */       dest = code[(pc++)];
/* 1596 */       a = code[(pc++)];
/* 1597 */       b = code[(pc++)];
/* 1598 */       frame.setI32(dest, MathUtils.xor(frame.getI32(a), frame.getI32(b)));
/* 1599 */       return pc;
/*      */     case 98: 
/* 1601 */       dest = code[(pc++)];
/* 1602 */       a = code[(pc++)];
/* 1603 */       b = code[(pc++)];
/* 1604 */       frame.setI64(dest, MathUtils.xor(frame.getI64(a), frame.getI64(b)));
/* 1605 */       return pc;
/*      */     case 99: 
/* 1607 */       dest = code[(pc++)];
/* 1608 */       a = code[(pc++)];
/* 1609 */       b = code[(pc++)];
/* 1610 */       frame.setI96(dest, MathUtils.xor(frame.getI96(a), frame.getI96(b)));
/* 1611 */       return pc;
/*      */     case 100: 
/* 1613 */       dest = code[(pc++)];
/* 1614 */       a = code[(pc++)];
/* 1615 */       b = code[(pc++)];
/* 1616 */       frame.setI128(dest, MathUtils.xor(frame.getI128(a), frame.getI128(b)));
/* 1617 */       return pc;
/*      */     case 35: 
/* 1619 */       dest = code[(pc++)];
/* 1620 */       width = code[(pc++)];
/* 1621 */       a = code[(pc++)];
/* 1622 */       b = code[(pc++)];
/* 1623 */       int c = code[(pc++)];
/* 1624 */       if (frame.getI1(a)) {
/* 1625 */         frame.copy(b, dest, width);
/*      */       } else
/* 1627 */         frame.copy(c, dest, width);
/* 1628 */       return pc;
/*      */     case 81: 
/* 1630 */       dest = code[(pc++)];
/* 1631 */       a = code[(pc++)];
/* 1632 */       ptr = frame.getPointerAddress(a);
/* 1633 */       frame.setI1(dest, MainMemory.getI1(ptr));
/* 1634 */       return pc;
/*      */     case 82: 
/* 1636 */       dest = code[(pc++)];
/* 1637 */       a = code[(pc++)];
/* 1638 */       ptr = frame.getPointerAddress(a);
/* 1639 */       frame.setI64(dest, MainMemory.getI64(ptr));
/* 1640 */       return pc;
/*      */     case 83: 
/* 1642 */       dest = code[(pc++)];
/* 1643 */       a = code[(pc++)];
/* 1644 */       ptr = frame.getPointerAddress(a);
/* 1645 */       frame.setI96(dest, MainMemory.getI96(ptr));
/* 1646 */       return pc;
/*      */     case 84: 
/* 1648 */       dest = code[(pc++)];
/* 1649 */       a = code[(pc++)];
/* 1650 */       ptr = frame.getPointerAddress(a);
/* 1651 */       frame.setF32(dest, MainMemory.getF32(ptr));
/* 1652 */       return pc;
/*      */     case 85: 
/* 1654 */       dest = code[(pc++)];
/* 1655 */       a = code[(pc++)];
/* 1656 */       ptr = frame.getPointerAddress(a);
/* 1657 */       frame.setF64(dest, MainMemory.getF64(ptr));
/* 1658 */       return pc;
/*      */     case 86: 
/* 1660 */       src = code[(pc++)];
/* 1661 */       a = code[(pc++)];
/* 1662 */       ptr = frame.getPointerAddress(src);
/* 1663 */       MainMemory.setI1(ptr, frame.getI1(a));
/*      */       
/* 1665 */       return pc;
/*      */     case 27: 
/* 1667 */       src = code[(pc++)];
/* 1668 */       a = code[(pc++)];
/* 1669 */       ptr = frame.getPointerAddress(src);
/* 1670 */       MainMemory.setI8(ptr, frame.getI8(a));
/*      */       
/* 1672 */       return pc;
/*      */     case 87: 
/* 1674 */       src = code[(pc++)];
/* 1675 */       a = code[(pc++)];
/* 1676 */       ptr = frame.getPointerAddress(src);
/* 1677 */       MainMemory.setI64(ptr, frame.getI64(a));
/*      */       
/* 1679 */       return pc;
/*      */     
/*      */     case 89: 
/* 1682 */       src = code[(pc++)];
/* 1683 */       a = code[(pc++)];
/* 1684 */       ptr = frame.getPointerAddress(src);
/* 1685 */       MainMemory.setF32(ptr, frame.getF32(a));
/* 1686 */       return pc;
/*      */     
/*      */     case 88: 
/* 1689 */       src = code[(pc++)];
/* 1690 */       a = code[(pc++)];
/* 1691 */       ptr = frame.getPointerAddress(src);
/* 1692 */       MainMemory.setF64(ptr, frame.getF64(a));
/* 1693 */       return pc;
/*      */     
/*      */     case 106: 
/* 1696 */       dest = code[(pc++)];
/* 1697 */       a = code[(pc++)];
/* 1698 */       b = code[(pc++)];
/* 1699 */       frame.setI1(dest, MathUtils.eq(frame.getI8(a), frame.getI8(b)));
/* 1700 */       return pc;
/*      */     case 116: 
/* 1702 */       dest = code[(pc++)];
/* 1703 */       a = code[(pc++)];
/* 1704 */       b = code[(pc++)];
/* 1705 */       frame.setI1(dest, MathUtils.eq(frame.getI16(a), frame.getI16(b)));
/* 1706 */       return pc;
/*      */     case 129: 
/* 1708 */       dest = code[(pc++)];
/* 1709 */       a = code[(pc++)];
/* 1710 */       b = code[(pc++)];
/* 1711 */       frame.setI1(dest, MathUtils.eq(frame.getI64(a), frame.getI64(b)));
/* 1712 */       return pc;
/*      */     
/*      */     case 107: 
/* 1715 */       dest = code[(pc++)];
/* 1716 */       a = code[(pc++)];
/* 1717 */       b = code[(pc++)];
/* 1718 */       frame.setI1(dest, MathUtils.ne(frame.getI8(a), frame.getI8(b)));
/* 1719 */       return pc;
/*      */     case 117: 
/* 1721 */       dest = code[(pc++)];
/* 1722 */       a = code[(pc++)];
/* 1723 */       b = code[(pc++)];
/* 1724 */       frame.setI1(dest, MathUtils.ne(frame.getI16(a), frame.getI16(b)));
/* 1725 */       return pc;
/*      */     case 126: 
/* 1727 */       dest = code[(pc++)];
/* 1728 */       a = code[(pc++)];
/* 1729 */       b = code[(pc++)];
/* 1730 */       frame.setI1(dest, MathUtils.ne(frame.getI32(a), frame.getI32(b)));
/* 1731 */       return pc;
/*      */     case 130: 
/* 1733 */       dest = code[(pc++)];
/* 1734 */       a = code[(pc++)];
/* 1735 */       b = code[(pc++)];
/* 1736 */       frame.setI1(dest, MathUtils.ne(frame.getI64(a), frame.getI64(b)));
/* 1737 */       return pc;
/*      */     
/*      */     case 111: 
/* 1740 */       dest = code[(pc++)];
/* 1741 */       a = code[(pc++)];
/* 1742 */       b = code[(pc++)];
/* 1743 */       frame.setI1(dest, MathUtils.sge(frame.getI8(a), frame.getI8(b)));
/* 1744 */       return pc;
/*      */     case 121: 
/* 1746 */       dest = code[(pc++)];
/* 1747 */       a = code[(pc++)];
/* 1748 */       b = code[(pc++)];
/* 1749 */       frame.setI1(dest, MathUtils.sge(frame.getI16(a), frame.getI16(b)));
/* 1750 */       return pc;
/*      */     case 134: 
/* 1752 */       dest = code[(pc++)];
/* 1753 */       a = code[(pc++)];
/* 1754 */       b = code[(pc++)];
/* 1755 */       frame.setI1(dest, MathUtils.sge(frame.getI64(a), frame.getI64(b)));
/* 1756 */       return pc;
/*      */     
/*      */     case 109: 
/* 1759 */       dest = code[(pc++)];
/* 1760 */       a = code[(pc++)];
/* 1761 */       b = code[(pc++)];
/* 1762 */       frame.setI1(dest, MathUtils.sgt(frame.getI8(a), frame.getI8(b)));
/* 1763 */       return pc;
/*      */     case 119: 
/* 1765 */       dest = code[(pc++)];
/* 1766 */       a = code[(pc++)];
/* 1767 */       b = code[(pc++)];
/* 1768 */       frame.setI1(dest, MathUtils.sgt(frame.getI16(a), frame.getI16(b)));
/* 1769 */       return pc;
/*      */     case 31: 
/* 1771 */       dest = code[(pc++)];
/* 1772 */       a = code[(pc++)];
/* 1773 */       b = code[(pc++)];
/* 1774 */       frame.setI1(dest, MathUtils.sgt(frame.getI32(a), frame.getI32(b)));
/* 1775 */       return pc;
/*      */     case 132: 
/* 1777 */       dest = code[(pc++)];
/* 1778 */       a = code[(pc++)];
/* 1779 */       b = code[(pc++)];
/* 1780 */       frame.setI1(dest, MathUtils.sgt(frame.getI64(a), frame.getI64(b)));
/* 1781 */       return pc;
/*      */     
/*      */     case 108: 
/* 1784 */       dest = code[(pc++)];
/* 1785 */       a = code[(pc++)];
/* 1786 */       b = code[(pc++)];
/* 1787 */       frame.setI1(dest, MathUtils.slt(frame.getI8(a), frame.getI8(b)));
/* 1788 */       return pc;
/*      */     case 118: 
/* 1790 */       dest = code[(pc++)];
/* 1791 */       a = code[(pc++)];
/* 1792 */       b = code[(pc++)];
/* 1793 */       frame.setI1(dest, MathUtils.slt(frame.getI16(a), frame.getI16(b)));
/* 1794 */       return pc;
/*      */     case 28: 
/* 1796 */       dest = code[(pc++)];
/* 1797 */       a = code[(pc++)];
/* 1798 */       b = code[(pc++)];
/* 1799 */       frame.setI1(dest, MathUtils.slt(frame.getI32(a), frame.getI32(b)));
/* 1800 */       return pc;
/*      */     case 131: 
/* 1802 */       dest = code[(pc++)];
/* 1803 */       a = code[(pc++)];
/* 1804 */       b = code[(pc++)];
/* 1805 */       frame.setI1(dest, MathUtils.slt(frame.getI64(a), frame.getI64(b)));
/* 1806 */       return pc;
/*      */     
/*      */     case 110: 
/* 1809 */       dest = code[(pc++)];
/* 1810 */       a = code[(pc++)];
/* 1811 */       b = code[(pc++)];
/* 1812 */       frame.setI1(dest, MathUtils.sle(frame.getI8(a), frame.getI8(b)));
/* 1813 */       return pc;
/*      */     case 120: 
/* 1815 */       dest = code[(pc++)];
/* 1816 */       a = code[(pc++)];
/* 1817 */       b = code[(pc++)];
/* 1818 */       frame.setI1(dest, MathUtils.sle(frame.getI16(a), frame.getI16(b)));
/* 1819 */       return pc;
/*      */     case 133: 
/* 1821 */       dest = code[(pc++)];
/* 1822 */       a = code[(pc++)];
/* 1823 */       b = code[(pc++)];
/* 1824 */       frame.setI1(dest, MathUtils.sle(frame.getI64(a), frame.getI64(b)));
/* 1825 */       return pc;
/*      */     
/*      */     case 114: 
/* 1828 */       dest = code[(pc++)];
/* 1829 */       a = code[(pc++)];
/* 1830 */       b = code[(pc++)];
/* 1831 */       frame.setI1(dest, MathUtils.uge(frame.getI8(a), frame.getI8(b)));
/* 1832 */       return pc;
/*      */     case 125: 
/* 1834 */       dest = code[(pc++)];
/* 1835 */       a = code[(pc++)];
/* 1836 */       b = code[(pc++)];
/* 1837 */       frame.setI1(dest, MathUtils.uge(frame.getI16(a), frame.getI16(b)));
/* 1838 */       return pc;
/*      */     case 128: 
/* 1840 */       dest = code[(pc++)];
/* 1841 */       a = code[(pc++)];
/* 1842 */       b = code[(pc++)];
/* 1843 */       frame.setI1(dest, MathUtils.uge(frame.getI32(a), frame.getI32(b)));
/* 1844 */       return pc;
/*      */     case 138: 
/* 1846 */       dest = code[(pc++)];
/* 1847 */       a = code[(pc++)];
/* 1848 */       b = code[(pc++)];
/* 1849 */       frame.setI1(dest, MathUtils.uge(frame.getI64(a), frame.getI64(b)));
/* 1850 */       return pc;
/*      */     
/*      */     case 115: 
/* 1853 */       dest = code[(pc++)];
/* 1854 */       a = code[(pc++)];
/* 1855 */       b = code[(pc++)];
/* 1856 */       frame.setI1(dest, MathUtils.ugt(frame.getI8(a), frame.getI8(b)));
/* 1857 */       return pc;
/*      */     case 123: 
/* 1859 */       dest = code[(pc++)];
/* 1860 */       a = code[(pc++)];
/* 1861 */       b = code[(pc++)];
/* 1862 */       frame.setI1(dest, MathUtils.ugt(frame.getI16(a), frame.getI16(b)));
/* 1863 */       return pc;
/*      */     case 136: 
/* 1865 */       dest = code[(pc++)];
/* 1866 */       a = code[(pc++)];
/* 1867 */       b = code[(pc++)];
/* 1868 */       frame.setI1(dest, MathUtils.ugt(frame.getI64(a), frame.getI64(b)));
/* 1869 */       return pc;
/*      */     
/*      */     case 112: 
/* 1872 */       dest = code[(pc++)];
/* 1873 */       a = code[(pc++)];
/* 1874 */       b = code[(pc++)];
/* 1875 */       frame.setI1(dest, MathUtils.ult(frame.getI8(a), frame.getI8(b)));
/* 1876 */       return pc;
/*      */     case 122: 
/* 1878 */       dest = code[(pc++)];
/* 1879 */       a = code[(pc++)];
/* 1880 */       b = code[(pc++)];
/* 1881 */       frame.setI1(dest, MathUtils.ult(frame.getI16(a), frame.getI16(b)));
/* 1882 */       return pc;
/*      */     case 29: 
/* 1884 */       dest = code[(pc++)];
/* 1885 */       a = code[(pc++)];
/* 1886 */       b = code[(pc++)];
/* 1887 */       frame.setI1(dest, MathUtils.ult(frame.getI32(a), frame.getI32(b)));
/* 1888 */       return pc;
/*      */     case 135: 
/* 1890 */       dest = code[(pc++)];
/* 1891 */       a = code[(pc++)];
/* 1892 */       b = code[(pc++)];
/* 1893 */       frame.setI1(dest, MathUtils.ult(frame.getI64(a), frame.getI64(b)));
/* 1894 */       return pc;
/*      */     
/*      */ 
/*      */     case 113: 
/* 1898 */       dest = code[(pc++)];
/* 1899 */       a = code[(pc++)];
/* 1900 */       b = code[(pc++)];
/* 1901 */       frame.setI1(dest, MathUtils.ule(frame.getI8(a), frame.getI8(b)));
/* 1902 */       return pc;
/*      */     
/*      */     case 124: 
/* 1905 */       dest = code[(pc++)];
/* 1906 */       a = code[(pc++)];
/* 1907 */       b = code[(pc++)];
/* 1908 */       frame.setI1(dest, MathUtils.ule(frame.getI16(a), frame.getI16(b)));
/* 1909 */       return pc;
/*      */     
/*      */     case 127: 
/* 1912 */       dest = code[(pc++)];
/* 1913 */       a = code[(pc++)];
/* 1914 */       b = code[(pc++)];
/* 1915 */       frame.setI1(dest, MathUtils.ule(frame.getI32(a), frame.getI32(b)));
/* 1916 */       return pc;
/*      */     
/*      */     case 137: 
/* 1919 */       dest = code[(pc++)];
/* 1920 */       a = code[(pc++)];
/* 1921 */       b = code[(pc++)];
/* 1922 */       frame.setI1(dest, MathUtils.ule(frame.getI64(a), frame.getI64(b)));
/* 1923 */       return pc;
/*      */     
/*      */     case 104: 
/* 1926 */       dest = code[(pc++)];
/* 1927 */       a = code[(pc++)];
/* 1928 */       frame.setI1(dest, frame.getI32(a) != 0);
/* 1929 */       return pc;
/*      */     
/*      */     case 139: 
/* 1932 */       dest = code[(pc++)];
/* 1933 */       width = code[(pc++)];
/* 1934 */       a = code[(pc++)];
/* 1935 */       b = code[(pc++)];
/* 1936 */       if (width == 1) {
/* 1937 */         frame.setI1(dest, MathUtils.f_une(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 1939 */         frame.setI1(dest, MathUtils.f_une(frame.getF64(a), frame.getF64(b)));
/* 1940 */       return pc;
/*      */     
/*      */     case 36: 
/* 1943 */       dest = code[(pc++)];
/* 1944 */       a = code[(pc++)];
/* 1945 */       b = code[(pc++)];
/* 1946 */       frame.setI8(dest, MathUtils.add(frame.getI8(a), frame.getI8(b)));
/* 1947 */       return pc;
/*      */     
/*      */     case 37: 
/* 1950 */       dest = code[(pc++)];
/* 1951 */       a = code[(pc++)];
/* 1952 */       b = code[(pc++)];
/* 1953 */       frame.setI16(dest, MathUtils.add(frame.getI16(a), frame.getI16(b)));
/* 1954 */       return pc;
/*      */     
/*      */     case 38: 
/* 1957 */       dest = code[(pc++)];
/* 1958 */       a = code[(pc++)];
/* 1959 */       b = code[(pc++)];
/* 1960 */       frame.setI64(dest, MathUtils.add(frame.getI64(a), frame.getI64(b)));
/* 1961 */       return pc;
/*      */     
/*      */ 
/*      */     case 39: 
/* 1965 */       dest = code[(pc++)];
/* 1966 */       a = code[(pc++)];
/* 1967 */       b = code[(pc++)];
/* 1968 */       frame.setI8(dest, MathUtils.sub(frame.getI8(a), frame.getI8(b)));
/* 1969 */       return pc;
/*      */     
/*      */     case 40: 
/* 1972 */       dest = code[(pc++)];
/* 1973 */       a = code[(pc++)];
/* 1974 */       b = code[(pc++)];
/* 1975 */       frame.setI16(dest, MathUtils.sub(frame.getI16(a), frame.getI16(b)));
/* 1976 */       return pc;
/*      */     
/*      */     case 32: 
/* 1979 */       dest = code[(pc++)];
/* 1980 */       a = code[(pc++)];
/* 1981 */       b = code[(pc++)];
/* 1982 */       frame.setI32(dest, MathUtils.sub(frame.getI32(a), frame.getI32(b)));
/* 1983 */       return pc;
/*      */     
/*      */     case 41: 
/* 1986 */       dest = code[(pc++)];
/* 1987 */       a = code[(pc++)];
/* 1988 */       b = code[(pc++)];
/* 1989 */       frame.setI64(dest, MathUtils.sub(frame.getI64(a), frame.getI64(b)));
/* 1990 */       return pc;
/*      */     
/*      */ 
/*      */     case 42: 
/* 1994 */       dest = code[(pc++)];
/* 1995 */       a = code[(pc++)];
/* 1996 */       b = code[(pc++)];
/* 1997 */       frame.setI8(dest, MathUtils.mul(frame.getI8(a), frame.getI8(b)));
/* 1998 */       return pc;
/*      */     
/*      */     case 43: 
/* 2001 */       dest = code[(pc++)];
/* 2002 */       a = code[(pc++)];
/* 2003 */       b = code[(pc++)];
/* 2004 */       frame.setI16(dest, MathUtils.mul(frame.getI16(a), frame.getI16(b)));
/* 2005 */       return pc;
/*      */     
/*      */     case 34: 
/* 2008 */       dest = code[(pc++)];
/* 2009 */       a = code[(pc++)];
/* 2010 */       b = code[(pc++)];
/* 2011 */       frame.setI32(dest, MathUtils.mul(frame.getI32(a), frame.getI32(b)));
/* 2012 */       return pc;
/*      */     
/*      */     case 44: 
/* 2015 */       dest = code[(pc++)];
/* 2016 */       a = code[(pc++)];
/* 2017 */       b = code[(pc++)];
/* 2018 */       frame.setI64(dest, MathUtils.mul(frame.getI64(a), frame.getI64(b)));
/* 2019 */       return pc;
/*      */     
/*      */ 
/*      */     case 74: 
/* 2023 */       dest = code[(pc++)];
/* 2024 */       a = code[(pc++)];
/* 2025 */       b = code[(pc++)];
/* 2026 */       frame.setF32(dest, MathUtils.fdiv32(frame.getF32(a), frame.getF32(b)));
/* 2027 */       return pc;
/*      */     
/*      */     case 75: 
/* 2030 */       dest = code[(pc++)];
/* 2031 */       a = code[(pc++)];
/* 2032 */       b = code[(pc++)];
/* 2033 */       frame.setF64(dest, MathUtils.fdiv64(frame.getF64(a), frame.getF64(b)));
/* 2034 */       return pc;
/*      */     
/*      */     case 78: 
/* 2037 */       dest = code[(pc++)];
/* 2038 */       a = code[(pc++)];
/* 2039 */       b = code[(pc++)];
/* 2040 */       frame.setF80(dest, MathUtils.fdiv80(frame.getF80(a), frame.getF80(b)));
/* 2041 */       return pc;
/*      */     
/*      */ 
/*      */     case 76: 
/* 2045 */       dest = code[(pc++)];
/* 2046 */       a = code[(pc++)];
/* 2047 */       b = code[(pc++)];
/* 2048 */       frame.setF32(dest, MathUtils.fadd32(frame.getF32(a), frame.getF32(b)));
/* 2049 */       return pc;
/*      */     
/*      */     case 77: 
/* 2052 */       dest = code[(pc++)];
/* 2053 */       a = code[(pc++)];
/* 2054 */       b = code[(pc++)];
/* 2055 */       frame.setF64(dest, MathUtils.fadd64(frame.getF64(a), frame.getF64(b)));
/* 2056 */       return pc;
/*      */     
/*      */     case 156: 
/* 2059 */       dest = code[(pc++)];
/* 2060 */       a = code[(pc++)];
/*      */       
/* 2062 */       frame.setPointerAddress(dest, frame.getI32(a));
/* 2063 */       return pc;
/*      */     case 157: 
/* 2065 */       dest = code[(pc++)];
/* 2066 */       a = code[(pc++)];
/* 2067 */       ptr = frame.getPointerAddress(a);
/* 2068 */       frame.setI32(dest, ptr);
/* 2069 */       return pc;
/*      */     case 140: 
/* 2071 */       dest = code[(pc++)];
/* 2072 */       a = code[(pc++)];
/* 2073 */       frame.setF32(dest, (float)frame.getF64(a));
/* 2074 */       return pc;
/*      */     case 141: 
/* 2076 */       dest = code[(pc++)];
/* 2077 */       a = code[(pc++)];
/* 2078 */       frame.setF64(dest, frame.getF32(a));
/* 2079 */       return pc;
/*      */     case 285: 
/* 2081 */       dest = code[(pc++)];
/* 2082 */       width = code[(pc++)];
/* 2083 */       a = code[(pc++)];
/* 2084 */       b = code[(pc++)];
/* 2085 */       CastOps.castfp(frame, width, dest, a, b);
/* 2086 */       return pc;
/*      */     
/*      */     case 92: 
/* 2089 */       dest = code[(pc++)];
/* 2090 */       width = code[(pc++)];
/* 2091 */       a = code[(pc++)];
/* 2092 */       CastOps.sext8(frame, dest, width, a);
/* 2093 */       return pc;
/*      */     case 93: 
/* 2095 */       dest = code[(pc++)];
/* 2096 */       width = code[(pc++)];
/* 2097 */       a = code[(pc++)];
/* 2098 */       CastOps.sext16(frame, dest, width, a);
/* 2099 */       return pc;
/*      */     case 94: 
/* 2101 */       dest = code[(pc++)];
/* 2102 */       width = code[(pc++)];
/* 2103 */       a = code[(pc++)];
/* 2104 */       CastOps.sext32(frame, dest, width, a);
/* 2105 */       return pc;
/*      */     case 95: 
/* 2107 */       dest = code[(pc++)];
/* 2108 */       width = code[(pc++)];
/* 2109 */       a = code[(pc++)];
/* 2110 */       CastOps.sext64(frame, dest, width, a);
/* 2111 */       return pc;
/*      */     case 146: 
/* 2113 */       dest = code[(pc++)];
/* 2114 */       width = code[(pc++)];
/* 2115 */       a = code[(pc++)];
/* 2116 */       CastOps.zext8(frame, dest, width, a);
/* 2117 */       return pc;
/*      */     case 147: 
/* 2119 */       dest = code[(pc++)];
/* 2120 */       width = code[(pc++)];
/* 2121 */       a = code[(pc++)];
/* 2122 */       CastOps.zext16(frame, dest, width, a);
/* 2123 */       return pc;
/*      */     case 148: 
/* 2125 */       dest = code[(pc++)];
/* 2126 */       width = code[(pc++)];
/* 2127 */       a = code[(pc++)];
/* 2128 */       CastOps.zext32(frame, dest, width, a);
/* 2129 */       return pc;
/*      */     case 90: 
/* 2131 */       dest = code[(pc++)];
/* 2132 */       width = code[(pc++)];
/* 2133 */       a = code[(pc++)];
/* 2134 */       CastOps.zext64(frame, dest, width, a);
/* 2135 */       return pc;
/*      */     case 91: 
/* 2137 */       dest = code[(pc++)];
/* 2138 */       width = code[(pc++)];
/* 2139 */       a = code[(pc++)];
/* 2140 */       CastOps.zext128(frame, dest, width, a);
/* 2141 */       return pc;
/*      */     case 30: 
/* 2143 */       dest = code[(pc++)];
/* 2144 */       width = code[(pc++)];
/* 2145 */       a = code[(pc++)];
/* 2146 */       CastOps.trunc8(frame, dest, width, a);
/* 2147 */       return pc;
/*      */     case 71: 
/* 2149 */       dest = code[(pc++)];
/* 2150 */       width = code[(pc++)];
/* 2151 */       a = code[(pc++)];
/* 2152 */       CastOps.trunc16(frame, dest, width, a);
/* 2153 */       return pc;
/*      */     case 72: 
/* 2155 */       dest = code[(pc++)];
/* 2156 */       width = code[(pc++)];
/* 2157 */       a = code[(pc++)];
/* 2158 */       CastOps.trunc32(frame, dest, width, a);
/* 2159 */       return pc;
/*      */     case 73: 
/* 2161 */       dest = code[(pc++)];
/* 2162 */       width = code[(pc++)];
/* 2163 */       a = code[(pc++)];
/* 2164 */       CastOps.trunc64(frame, dest, width, a);
/* 2165 */       return pc;
/*      */     case 142: 
/* 2167 */       dest = code[(pc++)];
/* 2168 */       width = code[(pc++)];
/* 2169 */       a = code[(pc++)];
/* 2170 */       b = code[(pc++)];
/* 2171 */       CastOps.uitofp(frame, width, dest, a, b);
/* 2172 */       return pc;
/*      */     case 144: 
/* 2174 */       dest = code[(pc++)];
/* 2175 */       width = code[(pc++)];
/* 2176 */       a = code[(pc++)];
/* 2177 */       b = code[(pc++)];
/* 2178 */       CastOps.fptoui(frame, width, dest, a, b);
/* 2179 */       return pc;
/*      */     case 143: 
/* 2181 */       dest = code[(pc++)];
/* 2182 */       width = code[(pc++)];
/* 2183 */       a = code[(pc++)];
/* 2184 */       b = code[(pc++)];
/* 2185 */       CastOps.sitofp(frame, width, dest, a, b);
/* 2186 */       return pc;
/*      */     case 145: 
/* 2188 */       dest = code[(pc++)];
/* 2189 */       width = code[(pc++)];
/* 2190 */       a = code[(pc++)];
/* 2191 */       b = code[(pc++)];
/* 2192 */       CastOps.fptosi(frame, width, dest, a, b);
/* 2193 */       return pc;
/*      */     
/*      */     case 261: 
/*      */     case 262: 
/* 2197 */       throw new UnwindException();
/*      */     
/*      */     case 194: 
/* 2200 */       dest = code[(pc++)];
/* 2201 */       a = code[(pc++)];
/* 2202 */       b = code[(pc++)];
/* 2203 */       frame.setI16(dest, MathUtils.udiv(frame.getI16(a), frame.getI16(b)));
/* 2204 */       return pc;
/*      */     case 199: 
/* 2206 */       dest = code[(pc++)];
/* 2207 */       a = code[(pc++)];
/* 2208 */       b = code[(pc++)];
/* 2209 */       frame.setI96(dest, MathUtils.udiv(frame.getI96(a), frame.getI96(b)));
/* 2210 */       return pc;
/*      */     case 200: 
/* 2212 */       dest = code[(pc++)];
/* 2213 */       a = code[(pc++)];
/* 2214 */       b = code[(pc++)];
/*      */       
/* 2216 */       frame.setI128(dest, MathUtils.udiv(frame.getI128(a), frame.getI128(b)));
/* 2217 */       return pc;
/*      */     case 158: 
/* 2219 */       dest = code[(pc++)];
/* 2220 */       a = code[(pc++)];
/* 2221 */       b = code[(pc++)];
/* 2222 */       frame.setI1(dest, MathUtils.sle(frame.getI32(a), frame.getI32(b)));
/* 2223 */       return pc;
/*      */     
/*      */     case 201: 
/* 2226 */       dest = code[(pc++)];
/* 2227 */       a = code[(pc++)];
/* 2228 */       b = code[(pc++)];
/* 2229 */       frame.setI16(dest, MathUtils.urem(frame.getI16(a), frame.getI16(b)));
/* 2230 */       return pc;
/*      */     case 203: 
/* 2232 */       dest = code[(pc++)];
/* 2233 */       a = code[(pc++)];
/* 2234 */       b = code[(pc++)];
/* 2235 */       frame.setI96(dest, MathUtils.urem(frame.getI96(a), frame.getI96(b)));
/* 2236 */       return pc;
/*      */     case 204: 
/* 2238 */       dest = code[(pc++)];
/* 2239 */       a = code[(pc++)];
/* 2240 */       b = code[(pc++)];
/* 2241 */       frame.setI128(dest, MathUtils.urem(frame.getI128(a), frame.getI128(b)));
/* 2242 */       return pc;
/*      */     
/*      */     case 202: 
/* 2245 */       dest = code[(pc++)];
/* 2246 */       a = code[(pc++)];
/* 2247 */       b = code[(pc++)];
/* 2248 */       frame.setI8(dest, MathUtils.sdiv(frame.getI8(a), frame.getI8(b)));
/* 2249 */       return pc;
/*      */     case 195: 
/* 2251 */       dest = code[(pc++)];
/* 2252 */       a = code[(pc++)];
/* 2253 */       b = code[(pc++)];
/* 2254 */       frame.setI96(dest, MathUtils.sdiv(frame.getI96(a), frame.getI96(b)));
/* 2255 */       return pc;
/*      */     case 196: 
/* 2257 */       dest = code[(pc++)];
/* 2258 */       a = code[(pc++)];
/* 2259 */       b = code[(pc++)];
/* 2260 */       frame.setI128(dest, MathUtils.sdiv(frame.getI128(a), frame.getI128(b)));
/* 2261 */       return pc;
/*      */     
/*      */     case 192: 
/* 2264 */       dest = code[(pc++)];
/* 2265 */       a = code[(pc++)];
/* 2266 */       b = code[(pc++)];
/* 2267 */       frame.setI8(dest, MathUtils.srem(frame.getI8(a), frame.getI8(b)));
/* 2268 */       return pc;
/*      */     case 193: 
/* 2270 */       dest = code[(pc++)];
/* 2271 */       a = code[(pc++)];
/* 2272 */       b = code[(pc++)];
/* 2273 */       frame.setI16(dest, MathUtils.srem(frame.getI16(a), frame.getI16(b)));
/* 2274 */       return pc;
/*      */     case 197: 
/* 2276 */       dest = code[(pc++)];
/* 2277 */       a = code[(pc++)];
/* 2278 */       b = code[(pc++)];
/* 2279 */       frame.setI96(dest, MathUtils.srem(frame.getI96(a), frame.getI96(b)));
/* 2280 */       return pc;
/*      */     case 198: 
/* 2282 */       dest = code[(pc++)];
/* 2283 */       a = code[(pc++)];
/* 2284 */       b = code[(pc++)];
/* 2285 */       frame.setI128(dest, MathUtils.srem(frame.getI128(a), frame.getI128(b)));
/* 2286 */       return pc;
/*      */     case 172: 
/* 2288 */       dest = code[(pc++)];
/* 2289 */       a = code[(pc++)];
/* 2290 */       b = code[(pc++)];
/* 2291 */       frame.setI96(dest, MathUtils.ashr(frame.getI96(a), frame.getI32(b)));
/* 2292 */       return pc;
/*      */     case 173: 
/* 2294 */       dest = code[(pc++)];
/* 2295 */       a = code[(pc++)];
/* 2296 */       b = code[(pc++)];
/* 2297 */       frame.setI128(dest, MathUtils.ashr(frame.getI128(a), frame.getI32(b)));
/* 2298 */       return pc;
/*      */     
/*      */     case 164: 
/* 2301 */       dest = code[(pc++)];
/* 2302 */       a = code[(pc++)];
/* 2303 */       b = code[(pc++)];
/* 2304 */       frame.setI1(dest, frame.getI1(a) ^ frame.getI1(b));
/* 2305 */       return pc;
/*      */     case 165: 
/* 2307 */       dest = code[(pc++)];
/* 2308 */       a = code[(pc++)];
/* 2309 */       b = code[(pc++)];
/* 2310 */       frame.setI8(dest, MathUtils.xor(frame.getI8(a), frame.getI8(b)));
/* 2311 */       return pc;
/*      */     case 166: 
/* 2313 */       dest = code[(pc++)];
/* 2314 */       a = code[(pc++)];
/* 2315 */       b = code[(pc++)];
/* 2316 */       frame.setI16(dest, MathUtils.xor(frame.getI16(a), frame.getI16(b)));
/* 2317 */       return pc;
/*      */     case 167: 
/* 2319 */       dest = code[(pc++)];
/* 2320 */       a = code[(pc++)];
/* 2321 */       ptr = frame.getPointerAddress(a);
/* 2322 */       frame.setPointerAddress(dest, MainMemory.getI32(ptr));
/* 2323 */       return pc;
/*      */     case 170: 
/* 2325 */       dest = code[(pc++)];
/* 2326 */       a = code[(pc++)];
/*      */       
/* 2328 */       ptr = frame.getPointerAddress(a);
/* 2329 */       frame.setI128(dest, MainMemory.getI128(ptr));
/* 2330 */       return pc;
/*      */     case 169: 
/* 2332 */       dest = code[(pc++)];
/* 2333 */       a = code[(pc++)];
/*      */       
/* 2335 */       ptr = frame.getPointerAddress(a);
/* 2336 */       frame.setF80(dest, MainMemory.getF80(ptr));
/* 2337 */       return pc;
/*      */     case 171: 
/* 2339 */       dest = code[(pc++)];
/* 2340 */       a = code[(pc++)];
/* 2341 */       ptr = frame.getPointerAddress(a);
/* 2342 */       frame.setF128(dest, MainMemory.getF128(ptr));
/* 2343 */       return pc;
/*      */     case 168: 
/* 2345 */       a = code[(pc++)];
/* 2346 */       b = code[(pc++)];
/* 2347 */       ptr = frame.getPointerAddress(a);
/* 2348 */       MainMemory.setI32(ptr, frame.getI32(b));
/* 2349 */       return pc;
/*      */     case 238: 
/* 2351 */       a = code[(pc++)];
/* 2352 */       b = code[(pc++)];
/* 2353 */       ptr = frame.getPointerAddress(a);
/* 2354 */       MainMemory.setI96(ptr, frame.getI96(b));
/* 2355 */       return pc;
/*      */     
/*      */     case 239: 
/* 2358 */       a = code[(pc++)];
/* 2359 */       b = code[(pc++)];
/* 2360 */       ptr = frame.getPointerAddress(a);
/* 2361 */       MainMemory.setI128(ptr, frame.getI128(b));
/* 2362 */       return pc;
/*      */     case 240: 
/* 2364 */       a = code[(pc++)];
/* 2365 */       b = code[(pc++)];
/* 2366 */       ptr = frame.getPointerAddress(a);
/* 2367 */       MainMemory.setF80(ptr, frame.getF80(b));
/* 2368 */       return pc;
/*      */     case 241: 
/* 2370 */       a = code[(pc++)];
/* 2371 */       b = code[(pc++)];
/*      */       
/* 2373 */       ptr = frame.getPointerAddress(a);
/* 2374 */       MainMemory.setF128(ptr, frame.getF128(b));
/* 2375 */       return pc;
/*      */     case 159: 
/* 2377 */       dest = code[(pc++)];
/* 2378 */       a = code[(pc++)];
/* 2379 */       b = code[(pc++)];
/*      */       
/* 2381 */       frame.setI1(dest, MathUtils.sge(frame.getI32(a), frame.getI32(b)));
/* 2382 */       return pc;
/*      */     case 229: 
/* 2384 */       dest = code[(pc++)];
/* 2385 */       width = code[(pc++)];
/* 2386 */       a = code[(pc++)];
/* 2387 */       b = code[(pc++)];
/* 2388 */       if (width == 1) {
/* 2389 */         frame.setI1(dest, MathUtils.f_oeq(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2391 */         frame.setI1(dest, MathUtils.f_oeq(frame.getF64(a), frame.getF64(b)));
/* 2392 */       return pc;
/*      */     case 230: 
/* 2394 */       dest = code[(pc++)];
/* 2395 */       width = code[(pc++)];
/* 2396 */       a = code[(pc++)];
/* 2397 */       b = code[(pc++)];
/* 2398 */       if (width == 1) {
/* 2399 */         frame.setI1(dest, MathUtils.f_one(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2401 */         frame.setI1(dest, MathUtils.f_one(frame.getF64(a), frame.getF64(b)));
/* 2402 */       return pc;
/*      */     case 231: 
/* 2404 */       dest = code[(pc++)];
/* 2405 */       width = code[(pc++)];
/* 2406 */       a = code[(pc++)];
/* 2407 */       b = code[(pc++)];
/* 2408 */       if (width == 1) {
/* 2409 */         frame.setI1(dest, MathUtils.f_olt(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2411 */         frame.setI1(dest, MathUtils.f_olt(frame.getF64(a), frame.getF64(b)));
/* 2412 */       return pc;
/*      */     case 232: 
/* 2414 */       dest = code[(pc++)];
/* 2415 */       width = code[(pc++)];
/* 2416 */       a = code[(pc++)];
/* 2417 */       b = code[(pc++)];
/* 2418 */       if (width == 1) {
/* 2419 */         frame.setI1(dest, MathUtils.f_ogt(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2421 */         frame.setI1(dest, MathUtils.f_ogt(frame.getF64(a), frame.getF64(b)));
/* 2422 */       return pc;
/*      */     case 233: 
/* 2424 */       dest = code[(pc++)];
/* 2425 */       width = code[(pc++)];
/* 2426 */       a = code[(pc++)];
/* 2427 */       b = code[(pc++)];
/* 2428 */       if (width == 1) {
/* 2429 */         frame.setI1(dest, MathUtils.f_ole(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2431 */         frame.setI1(dest, MathUtils.f_ole(frame.getF64(a), frame.getF64(b)));
/* 2432 */       return pc;
/*      */     case 234: 
/* 2434 */       dest = code[(pc++)];
/* 2435 */       width = code[(pc++)];
/* 2436 */       a = code[(pc++)];
/* 2437 */       b = code[(pc++)];
/* 2438 */       if (width == 1) {
/* 2439 */         frame.setI1(dest, MathUtils.f_oge(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2441 */         frame.setI1(dest, MathUtils.f_oge(frame.getF64(a), frame.getF64(b)));
/* 2442 */       return pc;
/*      */     case 235: 
/* 2444 */       dest = code[(pc++)];
/* 2445 */       width = code[(pc++)];
/* 2446 */       a = code[(pc++)];
/* 2447 */       b = code[(pc++)];
/* 2448 */       if (width == 1) {
/* 2449 */         frame.setI1(dest, MathUtils.f_ord(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2451 */         frame.setI1(dest, MathUtils.f_ord(frame.getF64(a), frame.getF64(b)));
/* 2452 */       return pc;
/*      */     case 236: 
/* 2454 */       dest = code[(pc++)];
/* 2455 */       width = code[(pc++)];
/* 2456 */       a = code[(pc++)];
/* 2457 */       b = code[(pc++)];
/* 2458 */       if (width == 1) {
/* 2459 */         frame.setI1(dest, MathUtils.f_uno(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2461 */         frame.setI1(dest, MathUtils.f_uno(frame.getF64(a), frame.getF64(b)));
/* 2462 */       return pc;
/*      */     case 237: 
/* 2464 */       dest = code[(pc++)];
/* 2465 */       width = code[(pc++)];
/* 2466 */       a = code[(pc++)];
/* 2467 */       b = code[(pc++)];
/* 2468 */       if (width == 1) {
/* 2469 */         frame.setI1(dest, MathUtils.f_ueq(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2471 */         frame.setI1(dest, MathUtils.f_ueq(frame.getF64(a), frame.getF64(b)));
/* 2472 */       return pc;
/*      */     case 222: 
/* 2474 */       dest = code[(pc++)];
/* 2475 */       width = code[(pc++)];
/* 2476 */       a = code[(pc++)];
/* 2477 */       b = code[(pc++)];
/* 2478 */       if (width == 1) {
/* 2479 */         frame.setI1(dest, MathUtils.f_ult(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2481 */         frame.setI1(dest, MathUtils.f_ult(frame.getF64(a), frame.getF64(b)));
/* 2482 */       return pc;
/*      */     case 223: 
/* 2484 */       dest = code[(pc++)];
/* 2485 */       width = code[(pc++)];
/* 2486 */       a = code[(pc++)];
/* 2487 */       b = code[(pc++)];
/* 2488 */       if (width == 1) {
/* 2489 */         frame.setI1(dest, MathUtils.f_ugt(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2491 */         frame.setI1(dest, MathUtils.f_ugt(frame.getF64(a), frame.getF64(b)));
/* 2492 */       return pc;
/*      */     case 224: 
/* 2494 */       dest = code[(pc++)];
/* 2495 */       width = code[(pc++)];
/* 2496 */       a = code[(pc++)];
/* 2497 */       b = code[(pc++)];
/* 2498 */       if (width == 1) {
/* 2499 */         frame.setI1(dest, MathUtils.f_ule(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2501 */         frame.setI1(dest, MathUtils.f_ule(frame.getF64(a), frame.getF64(b)));
/* 2502 */       return pc;
/*      */     case 225: 
/* 2504 */       dest = code[(pc++)];
/* 2505 */       width = code[(pc++)];
/* 2506 */       a = code[(pc++)];
/* 2507 */       b = code[(pc++)];
/* 2508 */       if (width == 1) {
/* 2509 */         frame.setI1(dest, MathUtils.f_uge(frame.getF32(a), frame.getF32(b)));
/*      */       } else
/* 2511 */         frame.setI1(dest, MathUtils.f_uge(frame.getF64(a), frame.getF64(b)));
/* 2512 */       return pc;
/*      */     case 226: 
/* 2514 */       dest = code[(pc++)];
/* 2515 */       frame.setI1(dest, true);
/* 2516 */       return pc;
/*      */     case 227: 
/* 2518 */       dest = code[(pc++)];
/* 2519 */       frame.setI1(dest, false);
/* 2520 */       return pc;
/*      */     
/*      */     case 180: 
/* 2523 */       dest = code[(pc++)];
/* 2524 */       a = code[(pc++)];
/* 2525 */       b = code[(pc++)];
/* 2526 */       frame.setI96(dest, MathUtils.add(frame.getI96(a), frame.getI96(b)));
/* 2527 */       return pc;
/*      */     case 181: 
/* 2529 */       dest = code[(pc++)];
/* 2530 */       a = code[(pc++)];
/* 2531 */       b = code[(pc++)];
/* 2532 */       frame.setI128(dest, MathUtils.add(frame.getI128(a), frame.getI128(b)));
/* 2533 */       return pc;
/*      */     case 184: 
/* 2535 */       dest = code[(pc++)];
/* 2536 */       a = code[(pc++)];
/* 2537 */       b = code[(pc++)];
/* 2538 */       frame.setI96(dest, MathUtils.sub(frame.getI96(a), frame.getI96(b)));
/* 2539 */       return pc;
/*      */     case 185: 
/* 2541 */       dest = code[(pc++)];
/* 2542 */       a = code[(pc++)];
/* 2543 */       b = code[(pc++)];
/* 2544 */       frame.setI128(dest, MathUtils.sub(frame.getI128(a), frame.getI128(b)));
/* 2545 */       return pc;
/*      */     case 188: 
/* 2547 */       dest = code[(pc++)];
/* 2548 */       a = code[(pc++)];
/* 2549 */       b = code[(pc++)];
/* 2550 */       frame.setI96(dest, MathUtils.mul(frame.getI96(a), frame.getI96(b)));
/* 2551 */       return pc;
/*      */     case 189: 
/* 2553 */       dest = code[(pc++)];
/* 2554 */       a = code[(pc++)];
/* 2555 */       b = code[(pc++)];
/* 2556 */       frame.setI128(dest, MathUtils.mul(frame.getI128(a), frame.getI128(b)));
/* 2557 */       return pc;
/*      */     case 205: 
/* 2559 */       dest = code[(pc++)];
/* 2560 */       a = code[(pc++)];
/* 2561 */       b = code[(pc++)];
/* 2562 */       frame.setF128(dest, MathUtils.fdiv128(frame.getF128(a), frame.getF128(b)));
/* 2563 */       return pc;
/*      */     
/*      */     case 206: 
/* 2566 */       dest = code[(pc++)];
/* 2567 */       a = code[(pc++)];
/* 2568 */       b = code[(pc++)];
/* 2569 */       frame.setF32(dest, MathUtils.frem32(frame.getF32(a), frame.getF32(b)));
/* 2570 */       return pc;
/*      */     case 207: 
/* 2572 */       dest = code[(pc++)];
/* 2573 */       a = code[(pc++)];
/* 2574 */       b = code[(pc++)];
/* 2575 */       frame.setF64(dest, MathUtils.frem64(frame.getF64(a), frame.getF64(b)));
/* 2576 */       return pc;
/*      */     case 208: 
/* 2578 */       dest = code[(pc++)];
/* 2579 */       a = code[(pc++)];
/* 2580 */       b = code[(pc++)];
/* 2581 */       frame.setF80(dest, MathUtils.frem80(frame.getF80(a), frame.getF80(b)));
/* 2582 */       return pc;
/*      */     case 209: 
/* 2584 */       dest = code[(pc++)];
/* 2585 */       a = code[(pc++)];
/* 2586 */       b = code[(pc++)];
/* 2587 */       frame.setF128(dest, MathUtils.frem128(frame.getF128(a), frame.getF128(b)));
/* 2588 */       return pc;
/*      */     case 210: 
/* 2590 */       dest = code[(pc++)];
/* 2591 */       a = code[(pc++)];
/* 2592 */       b = code[(pc++)];
/* 2593 */       frame.setF80(dest, MathUtils.fadd80(frame.getF80(a), frame.getF80(b)));
/* 2594 */       return pc;
/*      */     case 211: 
/* 2596 */       dest = code[(pc++)];
/* 2597 */       a = code[(pc++)];
/* 2598 */       b = code[(pc++)];
/* 2599 */       frame.setF128(dest, MathUtils.fadd128(frame.getF128(a), frame.getF128(b)));
/* 2600 */       return pc;
/*      */     
/*      */     case 212: 
/* 2603 */       dest = code[(pc++)];
/* 2604 */       a = code[(pc++)];
/* 2605 */       b = code[(pc++)];
/* 2606 */       frame.setF32(dest, MathUtils.fsub32(frame.getF32(a), frame.getF32(b)));
/* 2607 */       return pc;
/*      */     case 213: 
/* 2609 */       dest = code[(pc++)];
/* 2610 */       a = code[(pc++)];
/* 2611 */       b = code[(pc++)];
/* 2612 */       frame.setF64(dest, MathUtils.fsub64(frame.getF64(a), frame.getF64(b)));
/* 2613 */       return pc;
/*      */     case 214: 
/* 2615 */       dest = code[(pc++)];
/* 2616 */       a = code[(pc++)];
/* 2617 */       b = code[(pc++)];
/* 2618 */       frame.setF80(dest, MathUtils.fsub80(frame.getF80(a), frame.getF80(b)));
/* 2619 */       return pc;
/*      */     case 215: 
/* 2621 */       dest = code[(pc++)];
/* 2622 */       a = code[(pc++)];
/* 2623 */       b = code[(pc++)];
/* 2624 */       frame.setF128(dest, MathUtils.fsub128(frame.getF128(a), frame.getF128(b)));
/* 2625 */       return pc;
/*      */     
/*      */     case 79: 
/* 2628 */       dest = code[(pc++)];
/* 2629 */       a = code[(pc++)];
/* 2630 */       b = code[(pc++)];
/* 2631 */       frame.setF32(dest, MathUtils.fmul32(frame.getF32(a), frame.getF32(b)));
/* 2632 */       return pc;
/*      */     case 80: 
/* 2634 */       dest = code[(pc++)];
/* 2635 */       a = code[(pc++)];
/* 2636 */       b = code[(pc++)];
/* 2637 */       frame.setF64(dest, MathUtils.fmul64(frame.getF64(a), frame.getF64(b)));
/* 2638 */       return pc;
/*      */     case 216: 
/* 2640 */       dest = code[(pc++)];
/* 2641 */       a = code[(pc++)];
/* 2642 */       b = code[(pc++)];
/* 2643 */       frame.setF80(dest, MathUtils.fmul80(frame.getF80(a), frame.getF80(b)));
/* 2644 */       return pc;
/*      */     case 217: 
/* 2646 */       dest = code[(pc++)];
/* 2647 */       a = code[(pc++)];
/* 2648 */       b = code[(pc++)];
/* 2649 */       frame.setF128(dest, MathUtils.fmul128(frame.getF128(a), frame.getF128(b)));
/* 2650 */       return pc;
/*      */     case 218: 
/* 2652 */       dest = code[(pc++)];
/* 2653 */       width = code[(pc++)];
/* 2654 */       a = code[(pc++)];
/* 2655 */       CastOps.trunc1(frame, dest, width, a);
/* 2656 */       return pc;
/*      */     
/*      */     case 251: 
/* 2659 */       dest = code[(pc++)];
/* 2660 */       a = code[(pc++)];
/* 2661 */       b = code[(pc++)];
/* 2662 */       frame.cmp_eq(dest, a, b, 4);
/* 2663 */       return pc;
/*      */     case 257: 
/* 2665 */       dest = code[(pc++)];
/* 2666 */       a = code[(pc++)];
/* 2667 */       b = code[(pc++)];
/* 2668 */       frame.cmp_ult(dest, a, b, 4);
/* 2669 */       return pc;
/*      */     
/*      */     case 274: 
/*      */     case 278: 
/*      */     case 292: 
/* 2674 */       dest = code[(pc++)];
/* 2675 */       a = code[(pc++)];
/* 2676 */       frame.setI32(dest, frame.getI32(a));
/* 2677 */       return pc;
/*      */     
/*      */     case 275: 
/* 2680 */       dest = code[(pc++)];
/* 2681 */       a = code[(pc++)];
/* 2682 */       frame.setI1(dest, frame.getI32(a) != 0);
/* 2683 */       return pc;
/*      */     case 276: 
/* 2685 */       dest = code[(pc++)];
/* 2686 */       a = code[(pc++)];
/* 2687 */       frame.setI8(dest, (byte)frame.getI32(a));
/* 2688 */       return pc;
/*      */     case 277: 
/* 2690 */       dest = code[(pc++)];
/* 2691 */       a = code[(pc++)];
/* 2692 */       frame.setI16(dest, (short)frame.getI32(a));
/* 2693 */       return pc;
/*      */     case 279: 
/* 2695 */       dest = code[(pc++)];
/* 2696 */       a = code[(pc++)];
/* 2697 */       frame.setI64(dest, frame.getI32(a));
/* 2698 */       return pc;
/*      */     }
/*      */     
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2706 */     throw new UnsupportedOperationException("No implementation of  op " + op);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/* 2711 */   private static final int[] TODO_ARRAY = new int[0];
/*      */   
/*      */ 
/* 2714 */   private static final StringBuilder _FORMAT = new StringBuilder();
/*      */   
/*      */ 
/*      */   private static int invoke(Env env, Frame frame, int fid, int[] code, int op_start, int pc)
/*      */   {
/* 2719 */     int dest = code[(pc++)];
/* 2720 */     int width = code[(pc++)];
/* 2721 */     int arg_count = code[(pc++)];
/* 2722 */     Function function = null;
/*      */     
/*      */ 
/*      */     try
/*      */     {
/* 2727 */       function = SystemLibrary.getFunction(fid);
/* 2728 */       function.execute(env, frame, dest, width, arg_count, code, pc);
/* 2729 */       return 0;
/*      */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 2731 */       if (function != null) { throw aie;
/*      */       }
/* 2733 */       switch (fid & 0xFF000000) {
/*      */       case -2130706432: 
/* 2735 */         return invoke_maths(env, frame, fid, code, op_start, pc); }
/*      */     }
/* 2737 */     return invoke_string(env, frame, fid, code, op_start, pc);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 2742 */     int result_pc = pc + arg_count;
/*      */     int a;
/*      */     int b;
/*      */     int c;
/*      */     int d;
/*      */     int i32;
/* 2748 */     String formatted; switch (fid) {
/*      */     case -2147483647: 
/* 2750 */       a = frame.getI32(code[pc]);
/* 2751 */       pc += 2;
/* 2752 */       b = frame.getI32(code[pc]);
/* 2753 */       pc += 2;
/* 2754 */       c = frame.getI32(code[pc]);
/* 2755 */       pc += 2;
/* 2756 */       d = frame.getI32(code[pc]);
/* 2757 */       pc += 2;
/* 2758 */       SystemLibrary.memset(a, (byte)b, c, d);
/* 2759 */       break;
/*      */     case -2147483596: 
/* 2761 */       a = frame.getI32(code[pc]);
/* 2762 */       pc += 2;
/* 2763 */       b = frame.getI32(code[pc]);
/* 2764 */       pc += 2;
/* 2765 */       c = frame.getI32(code[pc]);
/* 2766 */       pc += 2;
/* 2767 */       d = frame.getI32(code[pc]);
/* 2768 */       pc += 2;
/* 2769 */       SystemLibrary.memcpy(a, b, c, d);
/* 2770 */       break;
/*      */     case -2147483530: 
/* 2772 */       a = frame.getI32(code[pc]);
/* 2773 */       pc += 2;
/*      */       
/* 2775 */       b = frame.getI32(code[pc]);
/* 2776 */       pc += 2;
/* 2777 */       c = frame.getI32(code[pc]);
/* 2778 */       pc += 2;
/* 2779 */       d = frame.getI32(code[pc]);
/* 2780 */       pc += 2;
/* 2781 */       SystemLibrary.memmove(a, b, c, d);
/* 2782 */       break;
/*      */     case -2147483528: 
/* 2784 */       a = frame.getI32(code[pc]);
/* 2785 */       pc += 2;
/* 2786 */       b = frame.getI32(code[pc]);
/* 2787 */       pc += 2;
/* 2788 */       i32 = MainMemory.calloc(a, b);
/* 2789 */       frame.setI32(dest, i32);
/* 2790 */       break;
/*      */     case -2147483643: 
/* 2792 */       a = frame.getI32(code[pc]);
/* 2793 */       pc += 2;
/* 2794 */       SystemLibrary.free(a);
/* 2795 */       break;
/*      */     case -2147483630: 
/* 2797 */       a = frame.getI32(code[pc]);
/* 2798 */       pc += 2;
/* 2799 */       MainMemory.delete(a);
/* 2800 */       break;
/*      */     
/*      */ 
/*      */     case -2147483629: 
/* 2804 */       a = frame.getI32(code[pc]);
/* 2805 */       pc += 2;
/* 2806 */       MainMemory.delete_array(a);
/* 2807 */       break;
/*      */     
/*      */ 
/*      */     case -2147483646: 
/* 2811 */       a = frame.getI32(code[pc]);
/* 2812 */       pc += 2;
/* 2813 */       i32 = MainMemory._new_(a, "NEW");
/* 2814 */       frame.setI32(dest, i32);
/* 2815 */       break;
/*      */     
/*      */ 
/*      */     case -2147483645: 
/* 2819 */       a = frame.getI32(code[pc]);
/* 2820 */       pc += 2;
/* 2821 */       i32 = MainMemory.new_array(a, "new array");
/* 2822 */       frame.setI32(dest, i32);
/* 2823 */       break;
/*      */     
/*      */ 
/*      */     case -2147483633: 
/* 2827 */       formatted = format(frame, code, pc, arg_count - 1);
/*      */       
/*      */ 
/* 2830 */       IoLib.print(formatted);
/* 2831 */       frame.setI32(dest, formatted.length());
/* 2832 */       break;
/*      */     
/*      */     case -2147483617: 
/* 2835 */       a = frame.getI32(code[pc]);
/* 2836 */       pc += 2;
/* 2837 */       i32 = IoLib.print((char)a);
/* 2838 */       frame.setI32(dest, i32);
/* 2839 */       break;
/*      */     
/*      */     case -2147483616: 
/* 2842 */       a = frame.getI32(code[pc]);
/* 2843 */       pc += 2;
/*      */       
/* 2845 */       i32 = IoLib.puts(a);
/* 2846 */       frame.setI32(dest, i32);
/* 2847 */       break;
/*      */     
/*      */     case -2147483614: 
/* 2850 */       a = frame.getI32(code[pc]);
/* 2851 */       pc += 2;
/*      */       
/* 2853 */       b = frame.getI32(code[pc]);
/* 2854 */       pc += 2;
/*      */       
/* 2856 */       c = frame.getI32(code[pc]);
/* 2857 */       pc += 2;
/*      */       
/* 2859 */       i32 = SystemLibrary.read(a, b, c);
/* 2860 */       frame.setI32(dest, i32);
/* 2861 */       break;
/*      */     
/*      */     case -2147483615: 
/* 2864 */       a = frame.getI32(code[pc]);
/* 2865 */       pc += 2;
/*      */       
/* 2867 */       b = frame.getI32(code[pc]);
/* 2868 */       pc += 2;
/*      */       
/* 2870 */       c = frame.getI32(code[pc]);
/* 2871 */       pc += 2;
/*      */       
/* 2873 */       i32 = SystemLibrary.lseek(a, b, c);
/* 2874 */       frame.setI32(dest, i32);
/* 2875 */       break;
/*      */     case -2147483499: 
/* 2877 */       a = frame.getI32(code[pc]);
/* 2878 */       pc += 2;
/*      */       
/* 2880 */       b = frame.getI32(code[pc]);
/* 2881 */       pc += 2;
/*      */       
/* 2883 */       c = frame.getI32(code[pc]);
/* 2884 */       pc += 2;
/*      */       
/* 2886 */       long i64 = SystemLibrary.lseek64(a, b, c);
/* 2887 */       frame.setI64(dest, i64);
/* 2888 */       break;
/*      */     
/*      */     case -2147483627: 
/* 2891 */       a = frame.getI32(code[pc]);
/* 2892 */       pc += 2;
/* 2893 */       i32 = SystemLibrary.fclose(a);
/* 2894 */       frame.setI32(dest, i32);
/* 2895 */       break;
/*      */     
/*      */     case -2147483624: 
/* 2898 */       a = frame.getI32(code[pc]);
/* 2899 */       pc += 2;
/* 2900 */       i32 = IoLib.fflush(a);
/* 2901 */       frame.setI32(dest, i32);
/* 2902 */       break;
/*      */     
/*      */     case -2147483623: 
/* 2905 */       a = frame.getI32(code[pc]);
/* 2906 */       pc += 2;
/* 2907 */       b = frame.getI32(code[pc]);
/* 2908 */       pc += 2;
/* 2909 */       c = frame.getI32(code[pc]);
/* 2910 */       pc += 2;
/* 2911 */       i32 = IoLib.fgets(a, b, c);
/* 2912 */       frame.setI32(dest, i32);
/* 2913 */       break;
/*      */     
/*      */     case -2147483622: 
/* 2916 */       a = frame.getI32(code[pc]);
/* 2917 */       pc += 2;
/* 2918 */       b = frame.getI32(code[pc]);
/* 2919 */       pc += 2;
/* 2920 */       i32 = IoLib.fopen(a, b);
/* 2921 */       frame.setI32(dest, i32);
/* 2922 */       break;
/*      */     
/*      */     case -2147483634: 
/* 2925 */       a = frame.getI32(code[pc]);
/* 2926 */       pc += 2;
/* 2927 */       formatted = format(frame, code, pc, arg_count - 2);
/*      */       
/*      */ 
/* 2930 */       i32 = IoLib.fprint(a, formatted);
/* 2931 */       frame.setI32(dest, i32);
/* 2932 */       break;
/*      */     
/*      */ 
/*      */     case -2147483621: 
/* 2936 */       a = frame.getI32(code[pc]);
/* 2937 */       pc += 2;
/* 2938 */       b = frame.getI32(code[pc]);
/* 2939 */       pc += 2;
/* 2940 */       i32 = IoLib.fputc(a, b);
/* 2941 */       frame.setI32(dest, i32);
/* 2942 */       break;
/*      */     
/*      */ 
/*      */     case -2147483620: 
/* 2946 */       a = frame.getI32(code[pc]);
/* 2947 */       pc += 2;
/* 2948 */       b = frame.getI32(code[pc]);
/* 2949 */       pc += 2;
/* 2950 */       i32 = IoLib.fputs(a, b);
/* 2951 */       frame.setI32(dest, i32);
/* 2952 */       break;
/*      */     
/*      */ 
/*      */     case -2147483619: 
/* 2956 */       a = frame.getI32(code[pc]);
/* 2957 */       pc += 2;
/* 2958 */       b = frame.getI32(code[pc]);
/* 2959 */       pc += 2;
/* 2960 */       c = frame.getI32(code[pc]);
/* 2961 */       pc += 2;
/* 2962 */       d = frame.getI32(code[pc]);
/* 2963 */       pc += 2;
/* 2964 */       i32 = IoLib.fread(a, b, c, d);
/* 2965 */       frame.setI32(dest, i32);
/* 2966 */       break;
/*      */     
/*      */     case -2147483635: 
/* 2969 */       a = frame.getI32(code[pc]);
/* 2970 */       pc += 2;
/* 2971 */       formatted = format(frame, code, pc, arg_count - 2);
/* 2972 */       i32 = SystemLibrary.sprint(a, formatted);
/* 2973 */       frame.setI32(dest, i32);
/* 2974 */       break;
/*      */     
/*      */     case -2147483618: 
/* 2977 */       a = frame.getI32(code[pc]);
/* 2978 */       pc += 2;
/* 2979 */       b = frame.getI32(code[pc]);
/* 2980 */       pc += 2;
/* 2981 */       i32 = IoLib.open(a, b, TODO_ARRAY);
/* 2982 */       frame.setI32(dest, i32);
/* 2983 */       break;
/*      */     
/*      */     case -2147483625: 
/* 2986 */       a = frame.getI32(code[pc]);
/* 2987 */       pc += 2;
/* 2988 */       i32 = IoLib.feof(a);
/* 2989 */       frame.setI32(dest, i32);
/* 2990 */       break;
/*      */     
/*      */ 
/*      */     case -2147483612: 
/* 2994 */       a = frame.getI32(code[pc]);
/* 2995 */       pc += 2;
/* 2996 */       b = frame.getI32(code[pc]);
/* 2997 */       pc += 2;
/* 2998 */       i32 = IoLib.fstat(a, b);
/* 2999 */       frame.setI32(dest, i32);
/* 3000 */       break;
/*      */     
/*      */     case -2147483498: 
/* 3003 */       a = frame.getI32(code[pc]);
/* 3004 */       pc += 2;
/* 3005 */       b = frame.getI32(code[pc]);
/* 3006 */       pc += 2;
/* 3007 */       i32 = IoLib.fstat64(a, b);
/* 3008 */       frame.setI32(dest, i32);
/* 3009 */       break;
/*      */     
/*      */ 
/*      */     case -2147483613: 
/* 3013 */       a = frame.getI32(code[pc]);
/* 3014 */       pc += 2;
/* 3015 */       b = frame.getI32(code[pc]);
/* 3016 */       pc += 2;
/* 3017 */       c = frame.getI32(code[pc]);
/* 3018 */       pc += 2;
/* 3019 */       i32 = IoLib.fseek(a, b, c);
/* 3020 */       frame.setI32(dest, i32);
/* 3021 */       break;
/*      */     
/*      */     case -2147483566: 
/* 3024 */       a = frame.getI32(code[pc]);
/* 3025 */       pc += 2;
/* 3026 */       b = frame.getI32(code[pc]);
/* 3027 */       pc += 2;
/* 3028 */       c = frame.getI32(code[pc]);
/* 3029 */       pc += 2;
/* 3030 */       d = frame.getI32(code[pc]);
/* 3031 */       pc += 2;
/* 3032 */       i32 = IoLib.fwrite(a, b, c, d);
/* 3033 */       frame.setI32(dest, i32);
/* 3034 */       break;
/*      */     default: 
/* 3036 */       pc = invoke_cool(env, frame, fid, code, op_start, pc - 3);
/*      */     }
/*      */     
/*      */     
/* 3040 */     int idx = -fid;
/* 3041 */     return pc;
/*      */   }
/*      */   
/*      */ 
/*      */   private static int invoke_cool(Env env, Frame frame, int fid, int[] code, int op_start, int pc)
/*      */   {
/* 3047 */     int dest = code[(pc++)];
/* 3048 */     int width = code[(pc++)];
/* 3049 */     int arg_count = code[(pc++)];
/* 3050 */     int result_pc = code[(op_start + 2)];
/*      */     
/*      */     int i32;
/*      */     
/*      */     int a;
/*      */     int b;
/*      */     String formatted;
/*      */     int c;
/*      */     int d;
/*      */     short i16;
/*      */     String fmt;
/*      */     Object[] fmt_args;
/* 3062 */     switch (fid) {
/*      */     case -2147483644: 
/* 3064 */       int sizeof = frame.getI32(code[pc]);
/* 3065 */       i32 = MainMemory.malloc(sizeof, "malloc");
/* 3066 */       frame.setI32(dest, i32);
/* 3067 */       break;
/*      */     
/*      */     case -2147483618: 
/* 3070 */       a = frame.getI32(code[pc]);
/* 3071 */       pc += 2;
/* 3072 */       b = frame.getI32(code[pc]);
/* 3073 */       i32 = IoLib.open(a, b, TODO_ARRAY);
/* 3074 */       frame.setI32(dest, i32);
/* 3075 */       break;
/*      */     
/*      */ 
/*      */     case -2147483633: 
/* 3079 */       formatted = format(frame, code, pc, arg_count - 1);
/*      */       
/*      */ 
/* 3082 */       IoLib.print(formatted);
/* 3083 */       frame.setI32(dest, formatted.length());
/* 3084 */       return pc;
/*      */     
/*      */     case -2147483617: 
/* 3087 */       a = frame.getI32(code[pc]);
/*      */       
/* 3089 */       i32 = IoLib.print((char)a);
/* 3090 */       frame.setI32(dest, i32);
/* 3091 */       break;
/*      */     
/*      */     case -2147483616: 
/* 3094 */       a = frame.getI32(code[pc]);
/* 3095 */       pc += 2;
/*      */       
/* 3097 */       i32 = SystemLibrary.puts(a);
/* 3098 */       frame.setI32(dest, i32);
/* 3099 */       break;
/*      */     
/*      */     case -2147483614: 
/* 3102 */       a = frame.getI32(code[pc]);
/* 3103 */       pc += 2;
/* 3104 */       b = frame.getI32(code[pc]);
/* 3105 */       pc += 2;
/* 3106 */       c = frame.getI32(code[pc]);
/* 3107 */       i32 = IoLib.read(a, b, c);
/* 3108 */       frame.setI32(dest, i32);
/* 3109 */       break;
/*      */     
/*      */     case -2147483568: 
/* 3112 */       a = frame.getI32(code[pc]);
/* 3113 */       pc += 2;
/*      */       
/* 3115 */       i32 = IoLib.close(a);
/* 3116 */       frame.setI32(dest, i32);
/* 3117 */       break;
/*      */     
/*      */     case -2147483615: 
/* 3120 */       a = frame.getI32(code[pc]);
/* 3121 */       pc += 2;
/* 3122 */       b = frame.getI32(code[pc]);
/* 3123 */       pc += 2;
/* 3124 */       c = frame.getI32(code[pc]);
/* 3125 */       pc += 2;
/*      */       
/* 3127 */       i32 = (int)IoLib.lseek(a, b, c);
/* 3128 */       frame.setI32(dest, i32);
/* 3129 */       break;
/*      */     
/*      */     case -2147483627: 
/* 3132 */       a = frame.getI32(code[pc]);
/* 3133 */       pc += 2;
/*      */       
/* 3135 */       i32 = IoLib.fclose(a);
/* 3136 */       frame.setI32(dest, i32);
/* 3137 */       break;
/*      */     
/*      */     case -2147483570: 
/* 3140 */       a = frame.getI32(code[pc]);
/* 3141 */       pc += 2;
/* 3142 */       b = frame.getI32(code[pc]);
/*      */       
/* 3144 */       i32 = IoLib.fcntl(a, b, null);
/* 3145 */       frame.setI32(dest, i32);
/* 3146 */       break;
/*      */     
/*      */     case -2147483625: 
/* 3149 */       a = frame.getI32(code[pc]);
/*      */       
/* 3151 */       i32 = IoLib.feof(a);
/* 3152 */       frame.setI32(dest, i32);
/* 3153 */       break;
/*      */     
/*      */     case -2147483624: 
/* 3156 */       a = frame.getI32(code[pc]);
/*      */       
/* 3158 */       i32 = IoLib.fflush(a);
/* 3159 */       frame.setI32(dest, i32);
/* 3160 */       break;
/*      */     
/*      */     case -2147483623: 
/* 3163 */       a = frame.getI32(code[pc]);
/* 3164 */       pc += 2;
/* 3165 */       b = frame.getI32(code[pc]);
/* 3166 */       pc += 2;
/* 3167 */       c = frame.getI32(code[pc]);
/* 3168 */       i32 = IoLib.fgets(a, b, c);
/* 3169 */       frame.setI32(dest, i32);
/* 3170 */       break;
/*      */     case -2147483533: 
/* 3172 */       a = frame.getI32(code[pc]);
/* 3173 */       pc += 2;
/* 3174 */       i32 = IoLib.fgetc(a);
/* 3175 */       frame.setI32(dest, i32);
/* 3176 */       break;
/*      */     case -2147483532: 
/* 3178 */       a = frame.getI32(code[pc]);
/* 3179 */       pc += 2;
/* 3180 */       b = frame.getI32(code[pc]);
/* 3181 */       pc += 2;
/* 3182 */       i32 = SystemLibrary.ungetc(a, b);
/* 3183 */       frame.setI32(dest, i32);
/* 3184 */       break;
/*      */     
/*      */     case -2147483622: 
/* 3187 */       a = frame.getI32(code[pc]);
/* 3188 */       pc += 2;
/* 3189 */       b = frame.getI32(code[pc]);
/*      */       
/* 3191 */       i32 = IoLib.fopen(a, b);
/* 3192 */       frame.setI32(dest, i32);
/* 3193 */       break;
/*      */     
/*      */     case -2147483634: 
/* 3196 */       a = frame.getI32(code[pc]);
/* 3197 */       pc += 2;
/* 3198 */       formatted = format(frame, code, pc, arg_count - 2);
/*      */       
/*      */ 
/* 3201 */       i32 = IoLib.fprint(a, formatted);
/* 3202 */       frame.setI32(dest, i32);
/* 3203 */       return pc;
/*      */     case -2147483621: 
/* 3205 */       a = frame.getI32(code[pc]);
/* 3206 */       pc += 2;
/* 3207 */       b = frame.getI32(code[pc]);
/*      */       
/* 3209 */       i32 = IoLib.fputc(a, b);
/* 3210 */       frame.setI32(dest, i32);
/* 3211 */       break;
/*      */     
/*      */     case -2147483620: 
/* 3214 */       a = frame.getI32(code[pc]);
/* 3215 */       pc += 2;
/* 3216 */       b = frame.getI32(code[pc]);
/*      */       
/* 3218 */       i32 = IoLib.fputs(a, b);
/* 3219 */       frame.setI32(dest, i32);
/* 3220 */       break;
/*      */     
/*      */     case -2147483619: 
/* 3223 */       a = frame.getI32(code[pc]);
/* 3224 */       pc += 2;
/* 3225 */       b = frame.getI32(code[pc]);
/* 3226 */       pc += 2;
/* 3227 */       c = frame.getI32(code[pc]);
/* 3228 */       pc += 2;
/* 3229 */       d = frame.getI32(code[pc]);
/*      */       
/* 3231 */       i32 = IoLib.fread(a, b, c, d);
/* 3232 */       frame.setI32(dest, i32);
/* 3233 */       break;
/*      */     
/*      */     case -2147483632: 
/* 3236 */       a = frame.getI32(code[pc]);
/* 3237 */       pc += 2;
/* 3238 */       b = frame.getI32(code[pc]);
/* 3239 */       pc += 2;
/*      */       
/* 3241 */       i32 = IoLib.fscanf(a, b, TODO_ARRAY);
/* 3242 */       frame.setI32(dest, i32);
/* 3243 */       break;
/*      */     
/*      */     case -2147483613: 
/* 3246 */       a = frame.getI32(code[pc]);
/* 3247 */       pc += 2;
/* 3248 */       b = frame.getI32(code[pc]);
/* 3249 */       pc += 2;
/* 3250 */       c = frame.getI32(code[pc]);
/*      */       
/* 3252 */       i32 = IoLib.fseek(a, b, c);
/* 3253 */       frame.setI32(dest, i32);
/* 3254 */       break;
/*      */     
/*      */     case -2147483612: 
/* 3257 */       a = frame.getI32(code[pc]);
/* 3258 */       pc += 2;
/* 3259 */       b = frame.getI32(code[pc]);
/*      */       
/* 3261 */       i32 = IoLib.fstat(a, b);
/* 3262 */       frame.setI32(dest, i32);
/* 3263 */       break;
/*      */     
/*      */     case -2147483566: 
/* 3266 */       a = frame.getI32(code[pc]);
/* 3267 */       pc += 2;
/* 3268 */       b = frame.getI32(code[pc]);
/* 3269 */       pc += 2;
/* 3270 */       c = frame.getI32(code[pc]);
/* 3271 */       pc += 2;
/* 3272 */       d = frame.getI32(code[pc]);
/*      */       
/* 3274 */       i32 = IoLib.fwrite(a, b, c, d);
/* 3275 */       frame.setI32(dest, i32);
/* 3276 */       break;
/*      */     
/*      */     case -2147483565: 
/* 3279 */       a = frame.getI32(code[pc]);
/* 3280 */       pc += 2;
/* 3281 */       b = frame.getI32(code[pc]);
/*      */       
/* 3283 */       i32 = SystemLibrary.getcwd(a, b);
/* 3284 */       frame.setI32(dest, i32);
/* 3285 */       break;
/*      */     
/*      */     case -2147483564: 
/* 3288 */       a = frame.getI32(code[pc]);
/*      */       
/* 3290 */       i32 = SystemLibrary.getenv(a);
/* 3291 */       frame.setI32(dest, i32);
/* 3292 */       break;
/*      */     
/*      */     case -2147483490: 
/* 3295 */       SystemLibrary.abort();
/* 3296 */       break;
/*      */     
/*      */ 
/*      */     case -2147483569: 
/* 3300 */       a = frame.getI32(code[pc]);
/* 3301 */       SystemLibrary.exit(a);
/* 3302 */       break;
/*      */     
/*      */     case -2147483562: 
/* 3305 */       i32 = SystemLibrary.getpagesize();
/* 3306 */       frame.setI32(dest, i32);
/* 3307 */       break;
/*      */     
/*      */     case -2147483561: 
/* 3310 */       i32 = SystemLibrary.getpid();
/* 3311 */       frame.setI32(dest, i32);
/* 3312 */       break;
/*      */     
/*      */ 
/*      */     case -2147483557: 
/* 3316 */       i16 = SystemLibrary.htons(frame.getI16(code[pc]));
/* 3317 */       frame.setI16(dest, i16);
/* 3318 */       break;
/*      */     
/*      */     case -2147483559: 
/* 3321 */       a = frame.getI32(code[pc]);
/*      */       
/* 3323 */       i32 = TimeLib.ctime(a);
/* 3324 */       frame.setI32(dest, i32);
/* 3325 */       break;
/*      */     
/*      */     case -2147483560: 
/* 3328 */       a = frame.getI32(code[pc]);
/* 3329 */       pc += 2;
/* 3330 */       b = frame.getI32(code[pc]);
/*      */       
/* 3332 */       i32 = TimeLib.gettimeofday(a, b);
/* 3333 */       frame.setI32(dest, i32);
/* 3334 */       break;
/*      */     
/*      */     case -2147483558: 
/* 3337 */       a = frame.getI32(code[pc]);
/*      */       
/* 3339 */       i32 = TimeLib.gmtime(a);
/* 3340 */       frame.setI32(dest, i32);
/* 3341 */       break;
/*      */     
/*      */     case -2147483552: 
/* 3344 */       a = frame.getI32(code[pc]);
/*      */       
/* 3346 */       i32 = TimeLib.localtime(a);
/* 3347 */       frame.setI32(dest, i32);
/* 3348 */       break;
/*      */     case -2147483550: 
/* 3350 */       a = frame.getI32(code[pc]);
/*      */       
/* 3352 */       i32 = TimeLib.asctime(a);
/* 3353 */       frame.setI32(dest, i32);
/* 3354 */       break;
/*      */     
/*      */     case -2147483548: 
/* 3357 */       a = frame.getI32(code[pc]);
/*      */       
/* 3359 */       i32 = TimeLib.mktime(a);
/* 3360 */       frame.setI32(dest, i32);
/* 3361 */       break;
/*      */     
/*      */     case -2147483555: 
/* 3364 */       a = frame.getI32(code[pc]);
/* 3365 */       pc += 2;
/* 3366 */       b = frame.getI32(code[pc]);
/* 3367 */       i32 = IoLib.ioctl(a, b, null);
/* 3368 */       frame.setI32(dest, i32);
/* 3369 */       break;
/*      */     
/*      */     case -2147483638: 
/* 3372 */       a = frame.getI32(code[pc]);
/* 3373 */       pc += 2;
/* 3374 */       b = frame.getI32(code[pc]);
/* 3375 */       longjmp(a, b);
/* 3376 */       break;
/*      */     
/*      */     case -2147483578: 
/* 3379 */       a = frame.getI32(code[pc]);
/* 3380 */       pc += 2;
/* 3381 */       b = frame.getI32(code[pc]);
/* 3382 */       pc += 2;
/* 3383 */       c = frame.getI32(code[pc]);
/*      */       
/* 3385 */       i32 = MainMemory.memcmp(a, b, c);
/* 3386 */       frame.setI32(dest, i32);
/* 3387 */       break;
/*      */     case -2147483577: 
/* 3389 */       a = frame.getI32(code[pc]);
/* 3390 */       pc += 2;
/* 3391 */       b = frame.getI32(code[pc]);
/* 3392 */       pc += 2;
/* 3393 */       c = frame.getI32(code[pc]);
/* 3394 */       i32 = SystemLibrary.memchr(a, b, c);
/* 3395 */       frame.setI32(dest, i32);
/* 3396 */       break;
/*      */     
/*      */     case -2147483549: 
/* 3399 */       a = frame.getI32(code[pc]);
/* 3400 */       i32 = IoLib.mkstemp(a);
/* 3401 */       frame.setI32(dest, i32);
/* 3402 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case -2147483547: 
/* 3407 */       a = frame.getI32(code[pc]);
/*      */       
/* 3409 */       fmt = MainMemory.getString(a);
/* 3410 */       IoLib.perror(fmt);
/* 3411 */       break;
/*      */     
/*      */     case -2147483544: 
/* 3414 */       a = frame.getI32(code[pc]);
/* 3415 */       pc += 2;
/* 3416 */       b = frame.getI32(code[pc]);
/*      */       
/* 3418 */       i32 = SystemLibrary.setlocale(a, b);
/* 3419 */       frame.setI32(dest, i32);
/* 3420 */       break;
/*      */     
/*      */     case -2147483543: 
/* 3423 */       a = frame.getI32(code[pc]);
/* 3424 */       pc += 2;
/* 3425 */       b = frame.getI32(code[pc]);
/*      */       
/* 3427 */       i32 = SystemLibrary.signal(a, b);
/* 3428 */       frame.setI32(dest, i32);
/* 3429 */       break;
/*      */     
/*      */     case -2147483611: 
/* 3432 */       a = frame.getI32(code[pc]);
/* 3433 */       pc += 2;
/* 3434 */       b = frame.getI32(code[pc]);
/* 3435 */       pc += 2;
/* 3436 */       formatted = format(frame, code, pc, arg_count - 3);
/* 3437 */       i32 = SystemLibrary.snprint(a, formatted, b);
/* 3438 */       frame.setI32(dest, i32);
/* 3439 */       return pc;
/*      */     
/*      */     case -2147483635: 
/* 3442 */       a = frame.getI32(code[pc]);
/* 3443 */       pc += 2;
/* 3444 */       formatted = format(frame, code, pc, arg_count - 2);
/* 3445 */       i32 = SystemLibrary.sprint(a, formatted);
/*      */       
/*      */ 
/* 3448 */       frame.setI32(dest, i32);
/* 3449 */       return pc;
/*      */     
/*      */     case -2147483593: 
/* 3452 */       String src = frame.getString(code[pc]);
/* 3453 */       pc += 2;
/* 3454 */       i32 = scanf(frame, src, code, pc, arg_count - 2);
/* 3455 */       frame.setI32(dest, i32);
/* 3456 */       break;
/*      */     case -2147483495: 
/* 3458 */       int pstr = frame.getI32(code[pc]);
/* 3459 */       pc += 2;
/* 3460 */       int[] addresses = toAddressArray(frame, code, arg_count - 1, 2, pc);
/* 3461 */       i32 = SystemLibrary.scanf(pstr, addresses);
/* 3462 */       frame.setI32(dest, i32);
/* 3463 */       break;
/*      */     
/*      */     case -2147483567: 
/* 3466 */       a = frame.getI32(code[pc]);
/* 3467 */       pc += 2;
/* 3468 */       b = frame.getI32(code[pc]);
/*      */       
/* 3470 */       i32 = IoLib.stat(a, b);
/* 3471 */       frame.setI32(dest, i32);
/* 3472 */       break;
/*      */     case -2147483497: 
/* 3474 */       a = frame.getI32(code[pc]);
/* 3475 */       pc += 2;
/* 3476 */       b = frame.getI32(code[pc]);
/*      */       
/* 3478 */       i32 = IoLib.stat64(a, b);
/* 3479 */       frame.setI32(dest, i32);
/* 3480 */       break;
/*      */     
/*      */ 
/*      */     case -2147483600: 
/* 3484 */       a = frame.getI32(code[pc]);
/* 3485 */       pc += 2;
/* 3486 */       b = frame.getI32(code[pc]);
/* 3487 */       pc += 2;
/* 3488 */       c = frame.getI32(code[pc]);
/*      */       
/* 3490 */       fmt = MainMemory.getString(b);
/* 3491 */       fmt_args = getObjectArray(c);
/* 3492 */       formatted = Formatf.format(fmt, fmt_args);
/* 3493 */       i32 = IoLib.fprint(a, formatted);
/* 3494 */       frame.setI32(dest, i32);
/* 3495 */       break;
/*      */     
/*      */     case -2147483599: 
/* 3498 */       a = frame.getI32(code[pc]);
/* 3499 */       pc += 2;
/* 3500 */       b = frame.getI32(code[pc]);
/* 3501 */       pc += 2;
/* 3502 */       c = frame.getI32(code[pc]);
/* 3503 */       pc += 2;
/* 3504 */       d = frame.getI32(code[pc]);
/* 3505 */       fmt = MainMemory.getString(c);
/* 3506 */       fmt_args = getObjectArray(d);
/* 3507 */       formatted = Formatf.nformat(fmt, b - 1, fmt_args);
/* 3508 */       i32 = MainMemory.setString(a, formatted);
/* 3509 */       frame.setI32(dest, i32);
/* 3510 */       break;
/*      */     
/*      */     case -2147483598: 
/* 3513 */       a = frame.getI32(code[pc]);
/* 3514 */       pc += 2;
/* 3515 */       b = frame.getI32(code[pc]);
/* 3516 */       pc += 2;
/* 3517 */       c = frame.getI32(code[pc]);
/* 3518 */       fmt = MainMemory.getString(b);
/* 3519 */       fmt_args = getObjectArray(c);
/* 3520 */       formatted = Formatf.format(fmt, fmt_args);
/* 3521 */       i32 = MainMemory.setString(a, formatted);
/* 3522 */       frame.setI32(dest, i32);
/* 3523 */       break;
/*      */     
/*      */     case -2147483542: 
/* 3526 */       a = frame.getI32(code[pc]);
/*      */       
/* 3528 */       i32 = TimeLib.time(a);
/* 3529 */       frame.setI32(dest, i32);
/* 3530 */       break;
/*      */     
/*      */     case -2147483539: 
/* 3533 */       a = frame.getI32(code[pc]);
/*      */       
/* 3535 */       i32 = IoLib.unlink(a);
/* 3536 */       frame.setI32(dest, i32);
/* 3537 */       break;
/*      */     
/*      */     case -2147483536: 
/* 3540 */       a = frame.getI32(code[pc]);
/*      */       
/* 3542 */       i32 = SystemLibrary.usleep(a);
/* 3543 */       frame.setI32(dest, i32);
/* 3544 */       break;
/*      */     
/*      */ 
/*      */     case -2147483538: 
/* 3548 */       a = frame.getI32(code[pc]);
/* 3549 */       pc += 2;
/* 3550 */       b = frame.getI32(code[pc]);
/* 3551 */       pc += 2;
/* 3552 */       c = frame.getI32(code[pc]);
/*      */       
/* 3554 */       i32 = IoLib.write(a, b, c);
/* 3555 */       frame.setI32(dest, i32);
/* 3556 */       break;
/*      */     
/*      */     case -2147483601: 
/* 3559 */       a = frame.getI32(code[pc]);
/* 3560 */       MainMemory.setInt(a, 0, op_start);
/* 3561 */       MainMemory.setInt(a, 1, code[op_start]);
/* 3562 */       MainMemory.setInt(a, 2, code[(op_start + 2)]);
/* 3563 */       MainMemory.setInt(a, 3, dest);
/* 3564 */       i32 = _setjmp(a);
/* 3565 */       frame.setI32(dest, i32);
/* 3566 */       break;
/*      */     
/*      */     case -2147483605: 
/* 3569 */       a = frame.getI32(code[pc]);
/* 3570 */       pc += 2;
/* 3571 */       b = frame.getI32(code[pc]);
/* 3572 */       pc += 2;
/* 3573 */       c = frame.getI32(code[pc]);
/*      */       
/* 3575 */       i32 = SystemLibrary.__cxa_atexit(a, b, c);
/* 3576 */       frame.setI32(dest, i32);
/* 3577 */       break;
/*      */     
/*      */     case -2147483604: 
/* 3580 */       a = frame.getI32(code[pc]);
/* 3581 */       i32 = SystemLibrary.__cxa_guard_acquire(a);
/* 3582 */       frame.setI32(dest, i32);
/* 3583 */       break;
/*      */     
/*      */     case -2147483603: 
/* 3586 */       a = frame.getI32(code[pc]);
/* 3587 */       SystemLibrary.__cxa_guard_release(a);
/* 3588 */       break;
/*      */     
/*      */     case -2147483602: 
/* 3591 */       i32 = SystemLibrary.__errno_location();
/* 3592 */       frame.setI32(dest, i32);
/* 3593 */       break;
/*      */     
/*      */     case -2147483594: 
/* 3596 */       i16 = SystemLibrary.bswapShort(frame.getI16(code[pc]));
/* 3597 */       frame.setI16(dest, i16);
/* 3598 */       break;
/*      */     
/*      */     case -2147483595: 
/* 3601 */       a = frame.getI32(code[pc]);
/*      */       
/* 3603 */       i32 = SystemLibrary.bswapInt(a);
/* 3604 */       frame.setI32(dest, i32);
/* 3605 */       break;
/*      */     
/*      */ 
/*      */     case -2147483609: 
/* 3609 */       i32 = SystemLibrary.doThrowable();
/* 3610 */       frame.setI32(dest, i32);
/* 3611 */       break;
/*      */     
/*      */     case -2147483608: 
/* 3614 */       a = frame.getI32(code[pc]);
/* 3615 */       pc += 2;
/* 3616 */       b = frame.getI32(code[pc]);
/*      */       
/* 3618 */       i32 = SystemLibrary.checkThrowable(a, b, TODO_ARRAY);
/* 3619 */       frame.setI32(dest, i32);
/* 3620 */       break;
/*      */     
/*      */ 
/*      */     case -2147483607: 
/* 3624 */       a = frame.getI32(code[pc]);
/* 3625 */       pc += 2;
/* 3626 */       b = frame.getI32(code[pc]);
/* 3627 */       pc += 2;
/* 3628 */       c = frame.getI32(code[pc]);
/* 3629 */       pc += 2;
/* 3630 */       d = frame.getI32(code[pc]);
/*      */       
/* 3632 */       MainMemory.memcpy(a, b, c, d);
/* 3633 */       break;
/*      */     
/*      */     case -2147483610: 
/* 3636 */       a = frame.getI32(code[pc]);
/* 3637 */       pc += 2;
/* 3638 */       b = frame.getI32(code[pc]);
/*      */       
/* 3640 */       i32 = MainMemory.realloc(a, b);
/* 3641 */       frame.setI32(dest, i32);
/* 3642 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case -2147483491: 
/* 3647 */       a = frame.getI32(code[pc]);
/*      */       
/* 3649 */       SystemLibrary._Unwind_Resume_or_Rethrow(a);
/* 3650 */       break;
/*      */     
/*      */     case -2147483488: 
/* 3653 */       a = frame.getI32(code[pc]);
/* 3654 */       pc += 2;
/* 3655 */       b = frame.getI32(code[pc]);
/* 3656 */       pc += 2;
/* 3657 */       c = frame.getI32(code[pc]);
/* 3658 */       pc += 2;
/* 3659 */       d = frame.getI32(code[pc]);
/*      */       
/* 3661 */       SystemLibrary.__assert_fail(a, b, c, d);
/* 3662 */       break;
/*      */     
/*      */     case -2147483489: 
/* 3665 */       SystemLibrary.__cxa_pure_virtual();
/* 3666 */       break;
/*      */     
/*      */     case -2147483487: 
/* 3669 */       i32 = SystemLibrary.__gxx_personality_v0(TODO_ARRAY);
/* 3670 */       frame.setI32(dest, i32);
/* 3671 */       break;
/*      */     
/*      */     case -2147483606: 
/* 3674 */       a = frame.getI32(code[pc]);
/* 3675 */       pc += 2;
/* 3676 */       b = frame.getI32(code[pc]);
/* 3677 */       pc += 2;
/* 3678 */       c = frame.getI32(code[pc]);
/* 3679 */       pc += 2;
/* 3680 */       d = frame.getI32(code[pc]);
/* 3681 */       MainMemory.memset(a, c, (byte)b, d);
/* 3682 */       break;
/*      */     
/*      */     case -2147483639: 
/* 3685 */       frame.setI32(code[pc], frame.getVarArgStart());
/* 3686 */       break;
/*      */     case -2147483640: 
/*      */       break;
/*      */     case -2147483643: case -2147483642: case -2147483641: case -2147483637: case -2147483636: case -2147483631: case -2147483630: case -2147483629: case -2147483628: case -2147483626: case -2147483597: case -2147483596: case -2147483592: case -2147483591: 
/*      */     case -2147483590: case -2147483589: case -2147483588: case -2147483587: case -2147483586: case -2147483585: case -2147483584: case -2147483583: case -2147483582: case -2147483581: case -2147483580: case -2147483579: case -2147483576: case -2147483575: 
/*      */     case -2147483574: case -2147483573: case -2147483572: case -2147483571: case -2147483563: case -2147483556: case -2147483554: case -2147483553: case -2147483551: case -2147483546: case -2147483545: case -2147483541: case -2147483540: case -2147483537: 
/*      */     case -2147483535: case -2147483534: case -2147483531: case -2147483530: case -2147483529: case -2147483528: case -2147483527: case -2147483526: case -2147483525: case -2147483524: case -2147483523: case -2147483522: case -2147483521: case -2147483520: 
/*      */     case -2147483519: case -2147483518: case -2147483517: case -2147483516: case -2147483515: case -2147483514: case -2147483513: case -2147483512: case -2147483511: case -2147483510: case -2147483509: case -2147483508: case -2147483507: case -2147483506: 
/*      */     case -2147483505: case -2147483504: case -2147483503: case -2147483502: case -2147483501: case -2147483500: case -2147483499: case -2147483498: case -2147483496: case -2147483494: case -2147483493: case -2147483492: default: 
/* 3695 */       throw new UnsupportedOperationException(" <" + fid + ">");
/*      */     }
/* 3697 */     return result_pc;
/*      */   }
/*      */   
/*      */ 
/*      */   private static int invoke_string(Env env, Frame frame, int fid, int[] code, int op_start, int pc)
/*      */   {
/* 3703 */     int dest = code[(pc++)];
/* 3704 */     int width = code[(pc++)];
/* 3705 */     int arg_count = code[(pc++)];
/* 3706 */     int result_pc = code[(op_start + 2)];
/*      */     
/* 3708 */     int arg0 = pc;
/* 3709 */     int arg1 = pc + 2;
/* 3710 */     int arg2 = pc + 2;
/*      */     
/*      */     int a;
/*      */     
/*      */     int i32;
/*      */     
/*      */     double f64;
/*      */     long i64;
/*      */     int b;
/*      */     int c;
/* 3720 */     switch (fid) {
/*      */     case -2113929214: 
/* 3722 */       a = frame.getI32(code[pc]);
/* 3723 */       i32 = SystemLibrary.atoi(a);
/* 3724 */       frame.setI32(dest, i32);
/* 3725 */       break;
/*      */     case -2113929215: 
/* 3727 */       a = frame.getI32(code[pc]);
/* 3728 */       f64 = SystemLibrary.atof(a);
/* 3729 */       frame.setF64(dest, f64);
/* 3730 */       break;
/*      */     
/*      */     case -2113929213: 
/* 3733 */       a = frame.getI32(code[pc]);
/* 3734 */       i32 = SystemLibrary.atol(a);
/* 3735 */       frame.setI32(dest, i32);
/* 3736 */       break;
/*      */     
/*      */     case -2113929212: 
/* 3739 */       a = frame.getI32(code[pc]);
/* 3740 */       i64 = SystemLibrary.atoll(a);
/* 3741 */       frame.setI64(dest, i64);
/* 3742 */       break;
/*      */     
/*      */     case -2113929211: 
/* 3745 */       a = frame.getI32(code[pc]);
/* 3746 */       i32 = SystemLibrary.isalpha(a);
/* 3747 */       frame.setI32(dest, i32);
/* 3748 */       break;
/*      */     
/*      */     case -2113929210: 
/* 3751 */       a = frame.getI32(code[pc]);
/* 3752 */       i32 = SystemLibrary.isprint(a);
/* 3753 */       frame.setI32(dest, i32);
/* 3754 */       break;
/*      */     
/*      */     case -2113929209: 
/* 3757 */       a = frame.getI32(code[pc]);
/* 3758 */       i32 = SystemLibrary.isspace(a);
/* 3759 */       frame.setI32(dest, i32);
/* 3760 */       break;
/*      */     
/*      */     case -2113929208: 
/* 3763 */       a = frame.getI32(code[pc]);
/* 3764 */       pc += 2;
/* 3765 */       b = frame.getI32(code[pc]);
/*      */       
/* 3767 */       i32 = SystemLibrary.strcasecmp(a, b);
/* 3768 */       frame.setI32(dest, i32);
/* 3769 */       break;
/*      */     
/*      */     case -2113929207: 
/* 3772 */       a = frame.getI32(code[pc]);
/* 3773 */       pc += 2;
/* 3774 */       b = frame.getI32(code[pc]);
/*      */       
/* 3776 */       i32 = MainMemory.strcat(a, b);
/* 3777 */       frame.setI32(dest, i32);
/* 3778 */       break;
/*      */     
/*      */     case -2113929206: 
/* 3781 */       a = frame.getI32(code[pc]);
/* 3782 */       pc += 2;
/* 3783 */       b = frame.getI32(code[pc]);
/*      */       
/* 3785 */       i32 = SystemLibrary.strchr(a, b);
/* 3786 */       frame.setI32(dest, i32);
/* 3787 */       break;
/*      */     
/*      */     case -2113929205: 
/* 3790 */       a = frame.getI32(code[pc]);
/* 3791 */       pc += 2;
/* 3792 */       b = frame.getI32(code[pc]);
/*      */       
/* 3794 */       i32 = SystemLibrary.strcmp(a, b);
/* 3795 */       frame.setI32(dest, i32);
/* 3796 */       break;
/*      */     
/*      */     case -2113929202: 
/* 3799 */       a = frame.getI32(code[pc]);
/*      */       
/* 3801 */       i32 = MainMemory.strdup(a);
/* 3802 */       frame.setI32(dest, i32);
/* 3803 */       break;
/*      */     
/*      */     case -2113929201: 
/* 3806 */       a = frame.getI32(code[pc]);
/*      */       
/* 3808 */       i32 = SystemLibrary.strerror(a);
/* 3809 */       frame.setI32(dest, i32);
/* 3810 */       break;
/*      */     
/*      */     case -2113929200: 
/* 3813 */       a = frame.getI32(code[pc]);
/*      */       
/* 3815 */       i32 = MainMemory.strlen(a);
/* 3816 */       frame.setI32(dest, i32);
/* 3817 */       break;
/*      */     
/*      */     case -2113929198: 
/* 3820 */       a = frame.getI32(code[pc]);
/* 3821 */       pc += 2;
/* 3822 */       b = frame.getI32(code[pc]);
/* 3823 */       pc += 2;
/* 3824 */       c = frame.getI32(code[pc]);
/*      */       
/* 3826 */       i32 = MainMemory.strncat(a, b, c);
/* 3827 */       frame.setI32(dest, i32);
/* 3828 */       break;
/*      */     
/*      */     case -2113929197: 
/* 3831 */       a = frame.getI32(code[pc]);
/* 3832 */       pc += 2;
/* 3833 */       b = frame.getI32(code[pc]);
/* 3834 */       pc += 2;
/* 3835 */       c = frame.getI32(code[pc]);
/*      */       
/* 3837 */       i32 = SystemLibrary.strncmp(a, b, c);
/* 3838 */       frame.setI32(dest, i32);
/* 3839 */       break;
/*      */     
/*      */     case -2113929196: 
/* 3842 */       a = frame.getI32(code[pc]);
/* 3843 */       pc += 2;
/* 3844 */       b = frame.getI32(code[pc]);
/* 3845 */       pc += 2;
/* 3846 */       c = frame.getI32(code[pc]);
/*      */       
/* 3848 */       i32 = MainMemory.strncpy(a, b, c);
/* 3849 */       frame.setI32(dest, i32);
/* 3850 */       break;
/*      */     
/*      */     case -2113929195: 
/* 3853 */       a = frame.getI32(code[pc]);
/* 3854 */       pc += 2;
/* 3855 */       b = frame.getI32(code[pc]);
/*      */       
/* 3857 */       i32 = SystemLibrary.strrchr(a, b);
/* 3858 */       frame.setI32(dest, i32);
/* 3859 */       break;
/*      */     
/*      */     case -2113929194: 
/* 3862 */       a = frame.getI32(code[pc]);
/* 3863 */       pc += 2;
/* 3864 */       b = frame.getI32(code[pc]);
/*      */       
/* 3866 */       i32 = SystemLibrary.strstr(a, b);
/* 3867 */       frame.setI32(dest, i32);
/* 3868 */       break;
/*      */     
/*      */     case -2113929192: 
/* 3871 */       a = frame.getI32(code[pc]);
/* 3872 */       pc += 2;
/* 3873 */       b = frame.getI32(code[pc]);
/*      */       
/* 3875 */       i32 = SystemLibrary.strtok(a, b);
/* 3876 */       frame.setI32(dest, i32);
/* 3877 */       break;
/*      */     
/*      */     case -2113929189: 
/* 3880 */       a = frame.getI32(code[pc]);
/* 3881 */       pc += 2;
/* 3882 */       b = frame.getI32(code[pc]);
/* 3883 */       pc += 2;
/* 3884 */       c = frame.getI32(code[pc]);
/*      */       
/* 3886 */       i32 = SystemLibrary.strtoul(a, b, c);
/* 3887 */       frame.setI32(dest, i32);
/* 3888 */       break;
/*      */     
/*      */     case -2113929188: 
/* 3891 */       a = frame.getI32(code[pc]);
/* 3892 */       pc += 2;
/* 3893 */       b = frame.getI32(code[pc]);
/* 3894 */       pc += 2;
/* 3895 */       c = frame.getI32(code[pc]);
/*      */       
/* 3897 */       i64 = SystemLibrary.strtoull(a, b, c);
/* 3898 */       frame.setI64(dest, i64);
/* 3899 */       break;
/*      */     case -2113929190: 
/* 3901 */       a = frame.getI32(code[pc]);
/* 3902 */       pc += 2;
/* 3903 */       b = frame.getI32(code[pc]);
/* 3904 */       pc += 2;
/* 3905 */       c = frame.getI32(code[pc]);
/*      */       
/* 3907 */       i64 = SystemLibrary.strtoll(a, b, c);
/* 3908 */       frame.setI64(dest, i64);
/* 3909 */       break;
/*      */     case -2113929191: 
/* 3911 */       a = frame.getI32(code[pc]);
/* 3912 */       pc += 2;
/* 3913 */       b = frame.getI32(code[pc]);
/* 3914 */       pc += 2;
/* 3915 */       c = frame.getI32(code[pc]);
/*      */       
/* 3917 */       i32 = SystemLibrary.strtol(a, b, c);
/* 3918 */       frame.setI32(dest, i32);
/* 3919 */       break;
/*      */     case -2113929193: 
/* 3921 */       a = frame.getI32(code[pc]);
/* 3922 */       pc += 2;
/* 3923 */       b = frame.getI32(code[pc]);
/* 3924 */       f64 = SystemLibrary.strtod(a, b);
/* 3925 */       frame.setF64(dest, f64);
/* 3926 */       break;
/*      */     
/*      */     case -2113929187: 
/* 3929 */       a = frame.getI32(code[pc]);
/* 3930 */       i32 = Character.toLowerCase((char)a);
/* 3931 */       frame.setI32(dest, i32);
/* 3932 */       break;
/*      */     
/*      */     case -2113929186: 
/* 3935 */       a = frame.getI32(code[pc]);
/* 3936 */       i32 = SystemLibrary.toupper(a);
/* 3937 */       frame.setI32(dest, i32);
/* 3938 */       break;
/*      */     
/*      */     case -2113929204: 
/* 3941 */       a = frame.getI32(code[pc]);
/* 3942 */       pc += 2;
/* 3943 */       b = frame.getI32(code[pc]);
/* 3944 */       pc += 2;
/* 3945 */       i32 = MainMemory.strcpy(a, b);
/* 3946 */       frame.setI32(dest, i32);
/* 3947 */       break;
/*      */     
/*      */     case -2113929199: 
/* 3950 */       a = frame.getI32(code[pc]);
/* 3951 */       pc += 2;
/* 3952 */       b = frame.getI32(code[pc]);
/* 3953 */       pc += 2;
/* 3954 */       c = frame.getI32(code[pc]);
/* 3955 */       pc += 2;
/* 3956 */       i32 = SystemLibrary.strncasecmp(a, b, c);
/* 3957 */       frame.setI32(dest, i32);
/* 3958 */       break;
/*      */     case -2113929203: 
/* 3960 */       a = frame.getI32(code[pc]);
/* 3961 */       pc += 2;
/* 3962 */       b = frame.getI32(code[pc]);
/* 3963 */       pc += 2;
/* 3964 */       i32 = SystemLibrary.strcspn(a, b);
/* 3965 */       frame.setI32(dest, i32);
/* 3966 */       break;
/*      */     default: 
/* 3968 */       throw new UnsupportedOperationException(" <" + fid + ">");
/*      */     }
/* 3970 */     return result_pc;
/*      */   }
/*      */   
/* 3973 */   private static int invoke_maths(Env env, Frame frame, int fid, int[] code, int op_start, int pc) { int dest = code[(pc++)];
/* 3974 */     int width = code[(pc++)];
/* 3975 */     int arg_count = code[(pc++)];
/* 3976 */     int result_pc = code[(op_start + 2)];
/*      */     
/* 3978 */     int arg0 = pc;
/* 3979 */     int arg1 = pc + 2;
/* 3980 */     int arg2 = pc + 2;
/*      */     
/*      */ 
/*      */     double f64;
/*      */     
/*      */ 
/*      */     float f32;
/*      */     
/*      */     int i32;
/*      */     
/* 3990 */     switch (fid)
/*      */     {
/*      */     case -2130706409: 
/* 3993 */       f64 = SystemLibrary.pow(frame.getF64(code[pc]), frame.getF64(code[(pc + 2)]));
/* 3994 */       frame.setF64(dest, f64);
/* 3995 */       break;
/*      */     case -2130706426: 
/* 3997 */       f64 = SystemLibrary.atan2(frame.getF64(code[pc]), frame.getF64(code[(pc + 2)]));
/* 3998 */       frame.setF64(dest, f64);
/* 3999 */       break;
/*      */     case -2130706414: 
/* 4001 */       f64 = SystemLibrary.hypot(frame.getF64(code[pc]), frame.getF64(code[(pc + 2)]));
/* 4002 */       frame.setF64(dest, f64);
/* 4003 */       break;
/*      */     
/*      */     case -2130706420: 
/* 4006 */       f64 = SystemLibrary.exp(frame.getF64(code[pc]));
/* 4007 */       frame.setF64(dest, f64);
/* 4008 */       break;
/*      */     
/*      */     case -2130706429: 
/* 4011 */       f64 = SystemLibrary.asin(frame.getF64(code[pc]));
/* 4012 */       frame.setF64(dest, f64);
/* 4013 */       break;
/*      */     
/*      */     case -2130706407: 
/* 4016 */       f64 = SystemLibrary.sin(frame.getF64(code[pc]));
/* 4017 */       frame.setF64(dest, f64);
/* 4018 */       break;
/*      */     
/*      */     case -2130706405: 
/* 4021 */       f64 = SystemLibrary.sinh(frame.getF64(code[pc]));
/* 4022 */       frame.setF64(dest, f64);
/* 4023 */       break;
/*      */     
/*      */     case -2130706430: 
/* 4026 */       f64 = SystemLibrary.acos(frame.getF64(code[pc]));
/* 4027 */       frame.setF64(dest, f64);
/* 4028 */       break;
/*      */     
/*      */     case -2130706423: 
/* 4031 */       f64 = SystemLibrary.cos(frame.getF64(code[pc]));
/* 4032 */       frame.setF64(dest, f64);
/* 4033 */       break;
/*      */     
/*      */     case -2130706422: 
/* 4036 */       f64 = SystemLibrary.cosh(frame.getF64(code[pc]));
/* 4037 */       frame.setF64(dest, f64);
/* 4038 */       break;
/*      */     
/*      */     case -2130706428: 
/* 4041 */       f64 = SystemLibrary.atan(frame.getF64(code[pc]));
/* 4042 */       frame.setF64(dest, f64);
/* 4043 */       break;
/*      */     case -2130706401: 
/* 4045 */       f64 = SystemLibrary.tan(frame.getF64(code[pc]));
/* 4046 */       frame.setF64(dest, f64);
/* 4047 */       break;
/*      */     case -2130706400: 
/* 4049 */       f64 = SystemLibrary.tanh(frame.getF64(code[pc]));
/* 4050 */       frame.setF64(dest, f64);
/* 4051 */       break;
/*      */     case -2130706424: 
/* 4053 */       f32 = SystemLibrary.ceilf(frame.getF32(code[pc]));
/* 4054 */       frame.setF32(dest, f32);
/* 4055 */       break;
/*      */     
/*      */     case -2130706416: 
/* 4058 */       f32 = SystemLibrary.floorf(frame.getF32(code[pc]));
/* 4059 */       frame.setF32(dest, f32);
/* 4060 */       break;
/*      */     case -2130706418: 
/* 4062 */       f32 = SystemLibrary.fabsf(frame.getF32(code[pc]));
/* 4063 */       frame.setF32(dest, f32);
/* 4064 */       break;
/*      */     case -2130706431: 
/* 4066 */       i32 = SystemLibrary.abs(frame.getI32(code[pc]));
/* 4067 */       frame.setI32(dest, i32);
/* 4068 */       break;
/*      */     case -2130706425: 
/* 4070 */       f64 = SystemLibrary.ceil(frame.getF64(code[pc]));
/* 4071 */       frame.setF64(dest, f64);
/* 4072 */       break;
/*      */     
/*      */     case -2130706417: 
/* 4075 */       f64 = SystemLibrary.floor(frame.getF64(code[pc]));
/* 4076 */       frame.setF64(dest, f64);
/* 4077 */       break;
/*      */     case -2130706419: 
/* 4079 */       f64 = SystemLibrary.fabs(frame.getF64(code[pc]));
/* 4080 */       frame.setF64(dest, f64);
/* 4081 */       break;
/*      */     
/*      */     case -2130706404: 
/* 4084 */       f64 = SystemLibrary.sqrt(frame.getF64(code[pc]));
/* 4085 */       frame.setF64(dest, f64);
/* 4086 */       break;
/*      */     
/*      */     case -2130706412: 
/* 4089 */       f64 = SystemLibrary.log(frame.getF64(code[pc]));
/* 4090 */       frame.setF64(dest, f64);
/* 4091 */       break;
/*      */     case -2130706410: 
/* 4093 */       f64 = SystemLibrary.log10(frame.getF64(code[pc]));
/* 4094 */       frame.setF64(dest, f64);
/* 4095 */       break;
/*      */     case -2130706408: 
/* 4097 */       i32 = SystemLibrary.rand();
/* 4098 */       frame.setI32(dest, i32);
/* 4099 */       break;
/*      */     case -2130706402: 
/* 4101 */       SystemLibrary.srand(frame.getI32(code[pc]));
/* 4102 */       break;
/*      */     
/*      */     case -2130706415: 
/* 4105 */       f64 = SystemLibrary.fmod(frame.getF64(code[pc]), frame.getF64(code[(pc + 2)]));
/* 4106 */       frame.setF64(dest, f64);
/* 4107 */       break;
/*      */     case -2130706421: 
/* 4109 */       f64 = SystemLibrary.erfc(frame.getF64(code[pc]));
/* 4110 */       frame.setF64(dest, f64);
/* 4111 */       break;
/*      */     case -2130706406: 
/* 4113 */       SystemLibrary.sincos(frame.getF64(code[arg0]), frame.getI32(code[arg1]), frame.getI32(code[arg2]));
/* 4114 */       break;
/*      */     case -2130706427: case -2130706413: case -2130706411: case -2130706403: default: 
/* 4116 */       throw new UnsupportedOperationException(" <" + fid + ">");
/*      */     }
/* 4118 */     return result_pc;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static int _setjmp(int jmp_buf)
/*      */   {
/* 4125 */     return 0;
/*      */   }
/*      */   
/*      */   public static void longjmp(int jmp_buf_ptr, int returnValue) {
/* 4129 */     throw new LongJmpException(jmp_buf_ptr, returnValue);
/*      */   }
/*      */   
/*      */   private static Object[] getObjectArray(int address)
/*      */   {
/* 4134 */     return new Object[0];
/*      */   }
/*      */   
/*      */ 
/*      */   private static int[] toAddressArray(Frame f, int[] code, int addresscount, int addr_width, int addr_start)
/*      */   {
/* 4140 */     int[] addresses = new int[addresscount];
/* 4141 */     for (int i = 0; i < addresscount; i++) {
/*      */       try {
/* 4143 */         int address = f.getPointerAddress(code[addr_start]);
/* 4144 */         addresses[i] = address;
/* 4145 */         addr_start += addr_width;
/*      */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 4147 */         throw aie;
/*      */       }
/*      */     }
/* 4150 */     return addresses;
/*      */   }
/*      */   
/*      */   public static String format(Frame f, int[] code, int pc, int len)
/*      */   {
/* 4155 */     String fmt = f.getString(code[pc]);
/* 4156 */     pc += 2;
/* 4157 */     Object[] varArgs = Function.toVarArgs(f, code, pc, len);
/* 4158 */     return SystemLibrary.format(fmt, varArgs);
/*      */   }
/*      */   
/*      */   public static int format(Frame f, int[] code, int pc, StringBuilder b) {
/* 4162 */     b.setLength(0);
/* 4163 */     String fmt = f.getString(code[pc]);
/* 4164 */     pc += 2;
/* 4165 */     Formatf printf = Formatf.parse(fmt);
/* 4166 */     int len = printf.getSize();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4173 */     for (int i = 0; i < len; i++) {
/* 4174 */       Formatf.Elem elem = printf.get(i);
/* 4175 */       int width = elem.getWidth();
/* 4176 */       int dp = elem.getDp();
/*      */       int val;
/* 4178 */       switch (elem.getDataType()) {
/*      */       case LITERAL: 
/* 4180 */         elem.append(b);
/* 4181 */         break;
/*      */       case STRING: 
/* 4183 */         int address = f.getI32(code[pc]);
/* 4184 */         pc += 2;
/* 4185 */         String sval = address == 0 ? null : MainMemory.getString(address);
/* 4186 */         elem.append(b, sval);
/*      */         
/* 4188 */         break;
/*      */       case CHAR: 
/* 4190 */         val = f.getI8(code[pc]) & 0xFF;
/* 4191 */         pc += 2;
/* 4192 */         elem.append(b, (char)val);
/* 4193 */         break;
/*      */       case INT: 
/*      */       default: 
/* 4196 */         val = f.getI32(code[pc]);
/* 4197 */         pc += 2;
/* 4198 */         elem.append(b, val);
/* 4199 */         break;
/*      */       case LONG: 
/* 4201 */         long lval = f.getI64(code[pc]);
/* 4202 */         pc += 2;
/* 4203 */         elem.append(b, lval);
/* 4204 */         break;
/*      */       case FLOAT: 
/* 4206 */         float fval = f.getF32(code[pc]);
/* 4207 */         pc += 2;
/* 4208 */         elem.append(b, fval);
/* 4209 */         break;
/*      */       case DOUBLE: 
/* 4211 */         if (width < 0) {
/* 4212 */           width = f.getI32(code[pc]);
/* 4213 */           pc += 2;
/*      */         }
/* 4215 */         if (dp < 0) {
/* 4216 */           dp = f.getI32(code[pc]);
/* 4217 */           pc += 2;
/*      */         }
/* 4219 */         double dval = f.getF64(code[pc]);
/* 4220 */         pc += 2;
/* 4221 */         elem.append(b, width, dp, dval);
/*      */       }
/*      */       
/*      */     }
/* 4225 */     return pc;
/*      */   }
/*      */   
/*      */   public static int scanf(Frame f, String src, int[] code, int pc, int addresscount) {
/* 4229 */     String fmt = f.getString(code[pc]);
/* 4230 */     pc += 2;
/* 4231 */     Formatf printf = Formatf.parse(fmt);
/* 4232 */     int addr_width = 2;
/* 4233 */     int addr_start = pc;
/* 4234 */     int[] addresses = toAddressArray(f, code, addresscount, addr_width, addr_start);
/* 4235 */     return SystemLibrary.scan(printf, new CharSource.Str(src), addresses);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public static void enter(Function function, Frame frame) {}
/*      */   
/*      */ 
/*      */ 
/*      */   public static void exit(Function function) {}
/*      */   
/*      */ 
/*      */ 
/*      */   public static void dispose() {}
/*      */   
/*      */ 
/*      */   public static long getInterpreted()
/*      */   {
/* 4253 */     return interpreted;
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/ExecVm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */