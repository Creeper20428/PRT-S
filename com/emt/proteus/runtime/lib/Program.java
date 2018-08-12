/*     */ package com.emt.proteus.runtime.lib;
/*     */ 
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.program.FunctionData;
/*     */ import com.emt.proteus.lib.program.LinkTable;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.zip.GZIPInputStream;
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
/*     */ public final class Program
/*     */ {
/*     */   public static final boolean GZIMAGE = true;
/*     */   public static final String MAIN = "Main";
/*     */   public static final String RESUME = "Run";
/*     */   private final LinkTable linkTable;
/*     */   private final int imageStart;
/*     */   private final int[] constructorsIdx;
/*     */   private byte[] image;
/*     */   private final FunctionData[] functions;
/*     */   
/*     */   public Program(LinkTable linkTable, FunctionData[] functions, int[] constructorsIdx, int imageStart, byte[] image)
/*     */   {
/*  57 */     this.functions = functions;
/*  58 */     this.image = image;
/*  59 */     this.constructorsIdx = constructorsIdx;
/*  60 */     this.linkTable = linkTable;
/*  61 */     this.imageStart = imageStart;
/*     */   }
/*     */   
/*     */   public byte[] getImage() {
/*  65 */     return this.image;
/*     */   }
/*     */   
/*     */   public int getImageStart() {
/*  69 */     return this.imageStart;
/*     */   }
/*     */   
/*     */   public FunctionData[] getFunctions() {
/*  73 */     return this.functions;
/*     */   }
/*     */   
/*     */   public int[] getStaticConstructorIds() {
/*  77 */     return this.constructorsIdx;
/*     */   }
/*     */   
/*  80 */   public int getMainId() { return getAddress("Main"); }
/*     */   
/*     */   public int getResumeId() {
/*  83 */     return getAddress("Run");
/*     */   }
/*     */   
/*     */   public int getAddress(String name) {
/*  87 */     return this.linkTable.getAddress(name);
/*     */   }
/*     */   
/*     */   public static Program load()
/*     */     throws IOException
/*     */   {
/*  93 */     Settings settings = MainCtx.getSettings();
/*  94 */     String programUri = settings.stringValue("program", "classpath://program.icp");
/*  95 */     return load(MainCtx.getInputStream(programUri));
/*     */   }
/*     */   
/*     */   public static Program load(InputStream input) throws IOException {
/*  99 */     DataInputStream dais = new DataInputStream(new BufferedInputStream(new GZIPInputStream(input)));
/*     */     try {
/* 101 */       return load(dais);
/*     */     } finally {
/* 103 */       dais.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Program load(DataInput input) throws IOException
/*     */   {
/* 109 */     LinkTable linkTable = new LinkTable();
/* 110 */     linkTable.read(input);
/* 111 */     int[] constructorIdx = readConstructors(input);
/* 112 */     FunctionData[] functions = readFunctions(input);
/* 113 */     int imageStart = input.readInt();
/* 114 */     byte[] image = readImage(input);
/* 115 */     return new Program(linkTable, functions, constructorIdx, imageStart, image);
/*     */   }
/*     */   
/*     */   private static FunctionData[] readFunctions(DataInput input) throws IOException
/*     */   {
/* 120 */     int functionCount = input.readInt();
/* 121 */     FunctionData[] functions = new FunctionData[functionCount];
/* 122 */     for (int i = 0; i < functions.length; i++) {
/* 123 */       FunctionData functionData = new FunctionData();
/* 124 */       functionData.read(input);
/* 125 */       functions[i] = functionData;
/*     */     }
/* 127 */     return functions;
/*     */   }
/*     */   
/*     */   private static byte[] readImage(DataInput input) throws IOException {
/* 131 */     int imageLength = input.readInt();
/* 132 */     byte[] image = new byte[imageLength];
/* 133 */     input.readFully(image);
/*     */     
/* 135 */     return Utils.getGZBytes(image);
/*     */   }
/*     */   
/*     */ 
/*     */   private static int[] readConstructors(DataInput input)
/*     */     throws IOException
/*     */   {
/* 142 */     int constructorLength = input.readInt();
/* 143 */     int[] constructorIdx = new int[constructorLength];
/* 144 */     for (int i = 0; i < constructorLength; i++) {
/* 145 */       constructorIdx[i] = input.readInt();
/*     */     }
/* 147 */     return constructorIdx;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/Program.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */