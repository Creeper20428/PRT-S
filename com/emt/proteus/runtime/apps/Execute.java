/*     */ package com.emt.proteus.runtime.apps;
/*     */ 
/*     */ import com.emt.proteus.lib.app.Main;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ 
/*     */ public class Execute
/*     */   extends Main
/*     */ {
/*     */   /* Error */
/*     */   public void exec(String[] args)
/*     */     throws java.lang.Exception
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 2	com/emt/proteus/lib/app/MainCtx:getSettings	()Lcom/emt/proteus/lib/utils/Settings;
/*     */     //   3: astore_2
/*     */     //   4: aload_2
/*     */     //   5: ldc 3
/*     */     //   7: ldc 4
/*     */     //   9: invokevirtual 5	com/emt/proteus/lib/utils/Settings:stringValue	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   12: astore_3
/*     */     //   13: aload_2
/*     */     //   14: ldc 6
/*     */     //   16: invokevirtual 7	com/emt/proteus/lib/utils/Settings:booleanValue	(Ljava/lang/String;)Z
/*     */     //   19: ifeq +16 -> 35
/*     */     //   22: invokestatic 8	java/lang/System:console	()Ljava/io/Console;
/*     */     //   25: ldc 9
/*     */     //   27: iconst_0
/*     */     //   28: anewarray 10	java/lang/Object
/*     */     //   31: invokevirtual 11	java/io/Console:readLine	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   34: pop
/*     */     //   35: aload_2
/*     */     //   36: ldc 12
/*     */     //   38: iconst_0
/*     */     //   39: invokevirtual 13	com/emt/proteus/lib/utils/Settings:intValue	(Ljava/lang/String;I)I
/*     */     //   42: istore 4
/*     */     //   44: aload_2
/*     */     //   45: ldc 14
/*     */     //   47: iconst_1
/*     */     //   48: invokevirtual 13	com/emt/proteus/lib/utils/Settings:intValue	(Ljava/lang/String;I)I
/*     */     //   51: istore 5
/*     */     //   53: aload_3
/*     */     //   54: invokestatic 15	com/emt/proteus/lib/app/MainCtx:getInputStream	(Ljava/lang/String;)Ljava/io/InputStream;
/*     */     //   57: astore 6
/*     */     //   59: aload 6
/*     */     //   61: ifnonnull +32 -> 93
/*     */     //   64: getstatic 16	java/lang/System:err	Ljava/io/PrintStream;
/*     */     //   67: new 17	java/lang/StringBuilder
/*     */     //   70: dup
/*     */     //   71: invokespecial 18	java/lang/StringBuilder:<init>	()V
/*     */     //   74: ldc 19
/*     */     //   76: invokevirtual 20	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   79: aload_3
/*     */     //   80: invokevirtual 20	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   83: invokevirtual 21	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   86: invokevirtual 22	java/io/PrintStream:println	(Ljava/lang/String;)V
/*     */     //   89: iconst_m1
/*     */     //   90: invokestatic 23	java/lang/System:exit	(I)V
/*     */     //   93: new 24	com/emt/proteus/runtime/api/Env
/*     */     //   96: dup
/*     */     //   97: invokespecial 25	com/emt/proteus/runtime/api/Env:<init>	()V
/*     */     //   100: astore 7
/*     */     //   102: aload 6
/*     */     //   104: invokestatic 26	com/emt/proteus/runtime/lib/Program:load	(Ljava/io/InputStream;)Lcom/emt/proteus/runtime/lib/Program;
/*     */     //   107: astore 8
/*     */     //   109: aload 7
/*     */     //   111: aload 8
/*     */     //   113: invokevirtual 27	com/emt/proteus/runtime/api/Env:install	(Lcom/emt/proteus/runtime/lib/Program;)V
/*     */     //   116: aload_2
/*     */     //   117: ldc 28
/*     */     //   119: invokevirtual 29	com/emt/proteus/lib/utils/Settings:stringValue	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   122: astore 9
/*     */     //   124: invokestatic 30	java/lang/System:currentTimeMillis	()J
/*     */     //   127: lstore 10
/*     */     //   129: iconst_0
/*     */     //   130: istore 12
/*     */     //   132: iconst_0
/*     */     //   133: istore 13
/*     */     //   135: iload 4
/*     */     //   137: iload 13
/*     */     //   139: if_icmple +17 -> 156
/*     */     //   142: aload 7
/*     */     //   144: aload_1
/*     */     //   145: aload 9
/*     */     //   147: invokestatic 31	com/emt/proteus/runtime/apps/Execute:doExecute	(Lcom/emt/proteus/runtime/api/Env;[Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   150: iinc 13 1
/*     */     //   153: goto -18 -> 135
/*     */     //   156: invokestatic 30	java/lang/System:currentTimeMillis	()J
/*     */     //   159: lstore 10
/*     */     //   161: iload 5
/*     */     //   163: iload 12
/*     */     //   165: if_icmple +17 -> 182
/*     */     //   168: aload 7
/*     */     //   170: aload_1
/*     */     //   171: aload 9
/*     */     //   173: invokestatic 31	com/emt/proteus/runtime/apps/Execute:doExecute	(Lcom/emt/proteus/runtime/api/Env;[Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   176: iinc 12 1
/*     */     //   179: goto -18 -> 161
/*     */     //   182: invokestatic 30	java/lang/System:currentTimeMillis	()J
/*     */     //   185: lstore 13
/*     */     //   187: lload 13
/*     */     //   189: lload 10
/*     */     //   191: lsub
/*     */     //   192: l2d
/*     */     //   193: ldc2_w 32
/*     */     //   196: ddiv
/*     */     //   197: dstore 15
/*     */     //   199: iload 12
/*     */     //   201: ifle +12 -> 213
/*     */     //   204: dload 15
/*     */     //   206: iload 12
/*     */     //   208: i2d
/*     */     //   209: ddiv
/*     */     //   210: goto +6 -> 216
/*     */     //   213: ldc2_w 34
/*     */     //   216: dstore 17
/*     */     //   218: getstatic 16	java/lang/System:err	Ljava/io/PrintStream;
/*     */     //   221: ldc 36
/*     */     //   223: iconst_3
/*     */     //   224: anewarray 10	java/lang/Object
/*     */     //   227: dup
/*     */     //   228: iconst_0
/*     */     //   229: dload 15
/*     */     //   231: invokestatic 37	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   234: aastore
/*     */     //   235: dup
/*     */     //   236: iconst_1
/*     */     //   237: iload 12
/*     */     //   239: invokestatic 38	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   242: aastore
/*     */     //   243: dup
/*     */     //   244: iconst_2
/*     */     //   245: dload 17
/*     */     //   247: invokestatic 37	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   250: aastore
/*     */     //   251: invokevirtual 39	java/io/PrintStream:printf	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
/*     */     //   254: pop
/*     */     //   255: goto +278 -> 533
/*     */     //   258: astore 13
/*     */     //   260: aload 13
/*     */     //   262: invokevirtual 41	com/emt/proteus/runtime/api/ExecException:dump	()V
/*     */     //   265: aload 13
/*     */     //   267: invokevirtual 42	com/emt/proteus/runtime/api/ExecException:getCause	()Ljava/lang/Throwable;
/*     */     //   270: astore 14
/*     */     //   272: aload 14
/*     */     //   274: ifnull +8 -> 282
/*     */     //   277: aload 14
/*     */     //   279: invokevirtual 43	java/lang/Throwable:printStackTrace	()V
/*     */     //   282: invokestatic 30	java/lang/System:currentTimeMillis	()J
/*     */     //   285: lstore 13
/*     */     //   287: lload 13
/*     */     //   289: lload 10
/*     */     //   291: lsub
/*     */     //   292: l2d
/*     */     //   293: ldc2_w 32
/*     */     //   296: ddiv
/*     */     //   297: dstore 15
/*     */     //   299: iload 12
/*     */     //   301: ifle +12 -> 313
/*     */     //   304: dload 15
/*     */     //   306: iload 12
/*     */     //   308: i2d
/*     */     //   309: ddiv
/*     */     //   310: goto +6 -> 316
/*     */     //   313: ldc2_w 34
/*     */     //   316: dstore 17
/*     */     //   318: getstatic 16	java/lang/System:err	Ljava/io/PrintStream;
/*     */     //   321: ldc 36
/*     */     //   323: iconst_3
/*     */     //   324: anewarray 10	java/lang/Object
/*     */     //   327: dup
/*     */     //   328: iconst_0
/*     */     //   329: dload 15
/*     */     //   331: invokestatic 37	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   334: aastore
/*     */     //   335: dup
/*     */     //   336: iconst_1
/*     */     //   337: iload 12
/*     */     //   339: invokestatic 38	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   342: aastore
/*     */     //   343: dup
/*     */     //   344: iconst_2
/*     */     //   345: dload 17
/*     */     //   347: invokestatic 37	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   350: aastore
/*     */     //   351: invokevirtual 39	java/io/PrintStream:printf	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
/*     */     //   354: pop
/*     */     //   355: goto +178 -> 533
/*     */     //   358: astore 13
/*     */     //   360: getstatic 45	java/lang/System:out	Ljava/io/PrintStream;
/*     */     //   363: invokevirtual 46	java/io/PrintStream:flush	()V
/*     */     //   366: getstatic 16	java/lang/System:err	Ljava/io/PrintStream;
/*     */     //   369: ldc 47
/*     */     //   371: invokevirtual 22	java/io/PrintStream:println	(Ljava/lang/String;)V
/*     */     //   374: aload 13
/*     */     //   376: invokevirtual 43	java/lang/Throwable:printStackTrace	()V
/*     */     //   379: invokestatic 30	java/lang/System:currentTimeMillis	()J
/*     */     //   382: lstore 13
/*     */     //   384: lload 13
/*     */     //   386: lload 10
/*     */     //   388: lsub
/*     */     //   389: l2d
/*     */     //   390: ldc2_w 32
/*     */     //   393: ddiv
/*     */     //   394: dstore 15
/*     */     //   396: iload 12
/*     */     //   398: ifle +12 -> 410
/*     */     //   401: dload 15
/*     */     //   403: iload 12
/*     */     //   405: i2d
/*     */     //   406: ddiv
/*     */     //   407: goto +6 -> 413
/*     */     //   410: ldc2_w 34
/*     */     //   413: dstore 17
/*     */     //   415: getstatic 16	java/lang/System:err	Ljava/io/PrintStream;
/*     */     //   418: ldc 36
/*     */     //   420: iconst_3
/*     */     //   421: anewarray 10	java/lang/Object
/*     */     //   424: dup
/*     */     //   425: iconst_0
/*     */     //   426: dload 15
/*     */     //   428: invokestatic 37	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   431: aastore
/*     */     //   432: dup
/*     */     //   433: iconst_1
/*     */     //   434: iload 12
/*     */     //   436: invokestatic 38	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   439: aastore
/*     */     //   440: dup
/*     */     //   441: iconst_2
/*     */     //   442: dload 17
/*     */     //   444: invokestatic 37	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   447: aastore
/*     */     //   448: invokevirtual 39	java/io/PrintStream:printf	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
/*     */     //   451: pop
/*     */     //   452: goto +81 -> 533
/*     */     //   455: astore 19
/*     */     //   457: invokestatic 30	java/lang/System:currentTimeMillis	()J
/*     */     //   460: lstore 20
/*     */     //   462: lload 20
/*     */     //   464: lload 10
/*     */     //   466: lsub
/*     */     //   467: l2d
/*     */     //   468: ldc2_w 32
/*     */     //   471: ddiv
/*     */     //   472: dstore 22
/*     */     //   474: iload 12
/*     */     //   476: ifle +12 -> 488
/*     */     //   479: dload 22
/*     */     //   481: iload 12
/*     */     //   483: i2d
/*     */     //   484: ddiv
/*     */     //   485: goto +6 -> 491
/*     */     //   488: ldc2_w 34
/*     */     //   491: dstore 24
/*     */     //   493: getstatic 16	java/lang/System:err	Ljava/io/PrintStream;
/*     */     //   496: ldc 36
/*     */     //   498: iconst_3
/*     */     //   499: anewarray 10	java/lang/Object
/*     */     //   502: dup
/*     */     //   503: iconst_0
/*     */     //   504: dload 22
/*     */     //   506: invokestatic 37	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   509: aastore
/*     */     //   510: dup
/*     */     //   511: iconst_1
/*     */     //   512: iload 12
/*     */     //   514: invokestatic 38	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   517: aastore
/*     */     //   518: dup
/*     */     //   519: iconst_2
/*     */     //   520: dload 24
/*     */     //   522: invokestatic 37	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   525: aastore
/*     */     //   526: invokevirtual 39	java/io/PrintStream:printf	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
/*     */     //   529: pop
/*     */     //   530: aload 19
/*     */     //   532: athrow
/*     */     //   533: iconst_0
/*     */     //   534: invokestatic 23	java/lang/System:exit	(I)V
/*     */     //   537: return
/*     */     // Line number table:
/*     */     //   Java source line #46	-> byte code offset #0
/*     */     //   Java source line #47	-> byte code offset #4
/*     */     //   Java source line #48	-> byte code offset #13
/*     */     //   Java source line #49	-> byte code offset #22
/*     */     //   Java source line #51	-> byte code offset #35
/*     */     //   Java source line #52	-> byte code offset #44
/*     */     //   Java source line #53	-> byte code offset #53
/*     */     //   Java source line #54	-> byte code offset #59
/*     */     //   Java source line #55	-> byte code offset #64
/*     */     //   Java source line #56	-> byte code offset #89
/*     */     //   Java source line #58	-> byte code offset #93
/*     */     //   Java source line #59	-> byte code offset #102
/*     */     //   Java source line #60	-> byte code offset #109
/*     */     //   Java source line #61	-> byte code offset #116
/*     */     //   Java source line #62	-> byte code offset #124
/*     */     //   Java source line #63	-> byte code offset #129
/*     */     //   Java source line #65	-> byte code offset #132
/*     */     //   Java source line #67	-> byte code offset #135
/*     */     //   Java source line #68	-> byte code offset #142
/*     */     //   Java source line #69	-> byte code offset #150
/*     */     //   Java source line #71	-> byte code offset #156
/*     */     //   Java source line #72	-> byte code offset #161
/*     */     //   Java source line #74	-> byte code offset #168
/*     */     //   Java source line #75	-> byte code offset #176
/*     */     //   Java source line #90	-> byte code offset #182
/*     */     //   Java source line #91	-> byte code offset #187
/*     */     //   Java source line #92	-> byte code offset #199
/*     */     //   Java source line #93	-> byte code offset #218
/*     */     //   Java source line #94	-> byte code offset #255
/*     */     //   Java source line #78	-> byte code offset #258
/*     */     //   Java source line #79	-> byte code offset #260
/*     */     //   Java source line #80	-> byte code offset #265
/*     */     //   Java source line #81	-> byte code offset #272
/*     */     //   Java source line #82	-> byte code offset #277
/*     */     //   Java source line #90	-> byte code offset #282
/*     */     //   Java source line #91	-> byte code offset #287
/*     */     //   Java source line #92	-> byte code offset #299
/*     */     //   Java source line #93	-> byte code offset #318
/*     */     //   Java source line #94	-> byte code offset #355
/*     */     //   Java source line #84	-> byte code offset #358
/*     */     //   Java source line #85	-> byte code offset #360
/*     */     //   Java source line #86	-> byte code offset #366
/*     */     //   Java source line #87	-> byte code offset #374
/*     */     //   Java source line #90	-> byte code offset #379
/*     */     //   Java source line #91	-> byte code offset #384
/*     */     //   Java source line #92	-> byte code offset #396
/*     */     //   Java source line #93	-> byte code offset #415
/*     */     //   Java source line #94	-> byte code offset #452
/*     */     //   Java source line #90	-> byte code offset #455
/*     */     //   Java source line #91	-> byte code offset #462
/*     */     //   Java source line #92	-> byte code offset #474
/*     */     //   Java source line #93	-> byte code offset #493
/*     */     //   Java source line #94	-> byte code offset #530
/*     */     //   Java source line #95	-> byte code offset #533
/*     */     //   Java source line #96	-> byte code offset #537
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	538	0	this	Execute
/*     */     //   0	538	1	args	String[]
/*     */     //   3	114	2	settings	com.emt.proteus.lib.utils.Settings
/*     */     //   12	68	3	programUri	String
/*     */     //   42	94	4	warmloopCount	int
/*     */     //   51	111	5	timeLoopCount	int
/*     */     //   57	46	6	inputStream	java.io.InputStream
/*     */     //   100	69	7	env	Env
/*     */     //   107	5	8	program	com.emt.proteus.runtime.lib.Program
/*     */     //   122	50	9	session	String
/*     */     //   127	338	10	start	long
/*     */     //   130	383	12	loop	int
/*     */     //   133	18	13	counter	int
/*     */     //   185	3	13	end	long
/*     */     //   258	8	13	e	com.emt.proteus.runtime.api.ExecException
/*     */     //   285	3	13	end	long
/*     */     //   358	17	13	t	Throwable
/*     */     //   382	3	13	end	long
/*     */     //   270	8	14	throwable	Throwable
/*     */     //   197	33	15	secs	double
/*     */     //   297	33	15	secs	double
/*     */     //   394	33	15	secs	double
/*     */     //   216	30	17	mean_secs	double
/*     */     //   316	30	17	mean_secs	double
/*     */     //   413	30	17	mean_secs	double
/*     */     //   455	76	19	localObject	Object
/*     */     //   460	3	20	end	long
/*     */     //   472	33	22	secs	double
/*     */     //   491	30	24	mean_secs	double
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   132	182	258	com/emt/proteus/runtime/api/ExecException
/*     */     //   132	182	358	java/lang/Throwable
/*     */     //   132	182	455	finally
/*     */     //   258	282	455	finally
/*     */     //   358	379	455	finally
/*     */     //   455	457	455	finally
/*     */   }
/*     */   
/*     */   public static void doExecute(Env env, String[] args, String session)
/*     */   {
/* 100 */     if (session != null) {
/* 101 */       env.start();
/* 102 */       env.restoreState(session);
/* 103 */       env.resume();
/*     */     } else {
/* 105 */       String[] realArgs = Env.toRealArguments("proteus", args);
/* 106 */       env.exec(realArgs);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 113 */     Main.execute("execute", args, 0, "com.emt.proteus.runtime.apps");
/*     */   }
/*     */   
/*     */   private static PrintWriter create(String name) throws IOException {
/* 117 */     return new PrintWriter(new BufferedWriter(new FileWriter(name)), true);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/apps/Execute.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */