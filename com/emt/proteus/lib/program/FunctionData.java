/*     */ package com.emt.proteus.lib.program;
/*     */ 
/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
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
/*     */ public class FunctionData
/*     */ {
/*     */   public static final int INTERPRETED = 1;
/*     */   public static final int CLASS = 2;
/*     */   public static final int METHOD = 4;
/*     */   private String name;
/*     */   private int[] constants;
/*     */   private int[] code;
/*     */   private int functionType;
/*     */   private int frameLength;
/*     */   private int argStart;
/*     */   private int vargStart;
/*     */   private int argCount;
/*     */   private String className;
/*     */   
/*     */   public FunctionData() {}
/*     */   
/*     */   public FunctionData(String name, int[] code, int[] constants, int frameLength, int argStart, int vargStart, int argCount)
/*     */   {
/*  55 */     this.name = name;
/*  56 */     this.constants = constants;
/*  57 */     this.code = code;
/*  58 */     this.frameLength = frameLength;
/*  59 */     this.argStart = argStart;
/*  60 */     this.vargStart = vargStart;
/*  61 */     this.argCount = argCount;
/*     */   }
/*     */   
/*     */   public String getName() {
/*  65 */     return this.name;
/*     */   }
/*     */   
/*     */   public int[] getConstants() {
/*  69 */     return this.constants;
/*     */   }
/*     */   
/*     */   public int[] getCode() {
/*  73 */     return this.code;
/*     */   }
/*     */   
/*     */   public int getFrameLength() {
/*  77 */     return this.frameLength;
/*     */   }
/*     */   
/*     */   public int getArgStart() {
/*  81 */     return this.argStart;
/*     */   }
/*     */   
/*     */   public int getVargStart() {
/*  85 */     return this.vargStart;
/*     */   }
/*     */   
/*     */   public int getArgCount() {
/*  89 */     return this.argCount;
/*     */   }
/*     */   
/*     */   public void read(DataInput input) throws IOException
/*     */   {
/*  94 */     this.name = input.readUTF();
/*  95 */     this.className = input.readUTF();
/*  96 */     this.functionType = input.readInt();
/*  97 */     int codeLength = input.readInt();
/*  98 */     this.frameLength = input.readInt();
/*  99 */     int constantLength = input.readInt();
/* 100 */     this.argStart = input.readInt();
/* 101 */     this.vargStart = input.readInt();
/* 102 */     this.argCount = input.readInt();
/*     */     
/* 104 */     this.code = new int[codeLength];
/* 105 */     this.constants = new int[constantLength];
/* 106 */     for (int i = 0; i < codeLength; i++) {
/* 107 */       this.code[i] = input.readInt();
/*     */     }
/* 109 */     for (int i = 0; i < constantLength; i++)
/* 110 */       this.constants[i] = input.readInt();
/*     */   }
/*     */   
/*     */   public void write(DataOutput output) throws IOException {
/* 114 */     output.writeUTF(this.name);
/* 115 */     output.writeUTF(this.className);
/* 116 */     output.writeInt(this.functionType);
/* 117 */     output.writeInt(this.code.length);
/* 118 */     output.writeInt(this.frameLength);
/* 119 */     output.writeInt(this.constants.length);
/* 120 */     output.writeInt(this.argStart);
/* 121 */     output.writeInt(this.vargStart);
/* 122 */     output.writeInt(this.argCount);
/* 123 */     for (int i = 0; i < this.code.length; i++) {
/* 124 */       output.writeInt(this.code[i]);
/*     */     }
/* 126 */     for (int i = 0; i < this.constants.length; i++) {
/* 127 */       output.writeInt(this.constants[i]);
/*     */     }
/* 129 */     if (this.code.length > 32676) {
/* 130 */       System.out.println(this.name + " has length " + this.code.length);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/* 135 */     this.name = name;
/*     */   }
/*     */   
/*     */   public void setConstants(int[] constants) {
/* 139 */     this.constants = constants;
/*     */   }
/*     */   
/*     */   public void setCode(int[] code) {
/* 143 */     this.code = code;
/*     */   }
/*     */   
/*     */   public void setFunctionType(int functionType) {
/* 147 */     this.functionType = functionType;
/*     */   }
/*     */   
/*     */   public void setFrameLength(int frameLength) {
/* 151 */     this.frameLength = frameLength;
/*     */   }
/*     */   
/*     */   public void setArgStart(int argStart) {
/* 155 */     this.argStart = argStart;
/*     */   }
/*     */   
/*     */   public void setVargStart(int vargStart) {
/* 159 */     this.vargStart = vargStart;
/*     */   }
/*     */   
/*     */   public void setArgCount(int argCount) {
/* 163 */     this.argCount = argCount;
/*     */   }
/*     */   
/* 166 */   public boolean isInterpreted() { return 1 == this.functionType; }
/*     */   
/*     */   public boolean isClassType() {
/* 169 */     return 2 == this.functionType;
/*     */   }
/*     */   
/* 172 */   public boolean isMethodType() { return 4 == this.functionType; }
/*     */   
/*     */   public String toString() {
/* 175 */     return String.format("%s {%d} ", new Object[] { this.name, Integer.valueOf(this.code.length) });
/*     */   }
/*     */   
/*     */   public String getClassName() {
/* 179 */     return this.className;
/*     */   }
/*     */   
/*     */   public void setClassName(String className) {
/* 183 */     this.className = className;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/program/FunctionData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */