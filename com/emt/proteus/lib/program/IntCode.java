/*     */ package com.emt.proteus.lib.program;
/*     */ 
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.util.Hashtable;
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
/*     */ public final class IntCode
/*     */ {
/*     */   public static final int INSTRUMENT = 1;
/*     */   public static final int LOAD_i32 = 2;
/*     */   public static final int BR_MEM_Z = 3;
/*     */   public static final int MEM_ADD = 4;
/*     */   public static final int MOV_XXX = 5;
/*     */   public static final int GETELEMENTPTR = 6;
/*     */   public static final int GETFIELD = 7;
/*     */   public static final int BRIT = 8;
/*     */   public static final int ICMP_IS_ZERO = 9;
/*     */   public static final int AND_i32 = 10;
/*     */   public static final int STORE_i32 = 11;
/*     */   public static final int ADD_i32 = 12;
/*     */   public static final int LOAD_i8 = 13;
/*     */   public static final int BR = 14;
/*     */   public static final int ICMP_EQ_i32 = 15;
/*     */   public static final int LOAD_i16 = 16;
/*     */   public static final int RET_VOID = 17;
/*     */   public static final int CALL_DIRECT = 18;
/*     */   public static final int ALLOCA = 19;
/*     */   public static final int OR_i32 = 20;
/*     */   public static final int XOR_i32 = 21;
/*     */   public static final int ICMP_UGT_i32 = 22;
/*     */   public static final int STORE_i16 = 23;
/*     */   public static final int RET = 24;
/*     */   public static final int CALL_INDIRECT = 25;
/*     */   public static final int LSHR_i32 = 26;
/*     */   public static final int STORE_i8 = 27;
/*     */   public static final int ICMP_SLT_i32 = 28;
/*     */   public static final int ICMP_ULT_i32 = 29;
/*     */   public static final int TRUNC_i8 = 30;
/*     */   public static final int ICMP_SGT_i32 = 31;
/*     */   public static final int SUB_i32 = 32;
/*     */   public static final int SWITCH = 33;
/*     */   public static final int MUL_i32 = 34;
/*     */   public static final int SELECT = 35;
/*     */   public static final int ADD_i8 = 36;
/*     */   public static final int ADD_i16 = 37;
/*     */   public static final int ADD_i64 = 38;
/*     */   public static final int SUB_i8 = 39;
/*     */   public static final int SUB_i16 = 40;
/*     */   public static final int SUB_i64 = 41;
/*     */   public static final int MUL_i8 = 42;
/*     */   public static final int MUL_i16 = 43;
/*     */   public static final int MUL_i64 = 44;
/*     */   public static final int SDIV_i16 = 45;
/*     */   public static final int SDIV_i32 = 46;
/*     */   public static final int SDIV_i64 = 47;
/*     */   public static final int SREM_i32 = 48;
/*     */   public static final int SREM_i64 = 49;
/*     */   public static final int UREM_i8 = 50;
/*     */   public static final int UREM_i32 = 51;
/*     */   public static final int UREM_i64 = 52;
/*     */   public static final int UDIV_i8 = 53;
/*     */   public static final int UDIV_i32 = 54;
/*     */   public static final int UDIV_i64 = 55;
/*     */   public static final int SHL_i8 = 56;
/*     */   public static final int SHL_i16 = 57;
/*     */   public static final int SHL_i32 = 58;
/*     */   public static final int SHL_i64 = 59;
/*     */   public static final int SHL_i96 = 60;
/*     */   public static final int SHL_i128 = 61;
/*     */   public static final int LSHR_i8 = 62;
/*     */   public static final int LSHR_i16 = 63;
/*     */   public static final int LSHR_i64 = 64;
/*     */   public static final int LSHR_i96 = 65;
/*     */   public static final int LSHR_i128 = 66;
/*     */   public static final int ASHR_i8 = 67;
/*     */   public static final int ASHR_i16 = 68;
/*     */   public static final int ASHR_i32 = 69;
/*     */   public static final int ASHR_i64 = 70;
/*     */   public static final int TRUNC_i16 = 71;
/*     */   public static final int TRUNC_i32 = 72;
/*     */   public static final int TRUNC_i64 = 73;
/*     */   public static final int FDIV_f32 = 74;
/*     */   public static final int FDIV_f64 = 75;
/*     */   public static final int FADD_f32 = 76;
/*     */   public static final int FADD_f64 = 77;
/*     */   public static final int FDIV_f80 = 78;
/*     */   public static final int FMUL_f32 = 79;
/*     */   public static final int FMUL_f64 = 80;
/*     */   public static final int LOAD_i1 = 81;
/*     */   public static final int LOAD_i64 = 82;
/*     */   public static final int LOAD_i96 = 83;
/*     */   public static final int LOAD_f32 = 84;
/*     */   public static final int LOAD_f64 = 85;
/*     */   public static final int STORE_i1 = 86;
/*     */   public static final int STORE_i64 = 87;
/*     */   public static final int STORE_f64 = 88;
/*     */   public static final int STORE_f32 = 89;
/*     */   public static final int ZEXT_i64 = 90;
/*     */   public static final int ZEXT_i128 = 91;
/*     */   public static final int SEXT_i8 = 92;
/*     */   public static final int SEXT_i16 = 93;
/*     */   public static final int SEXT_i32 = 94;
/*     */   public static final int SEXT_i64 = 95;
/*     */   public static final int OR_i64 = 96;
/*     */   public static final int OR_i128 = 97;
/*     */   public static final int XOR_i64 = 98;
/*     */   public static final int XOR_i96 = 99;
/*     */   public static final int XOR_i128 = 100;
/*     */   public static final int AND_i64 = 101;
/*     */   public static final int AND_i96 = 102;
/*     */   public static final int AND_i128 = 103;
/*     */   public static final int ICMP_NOT_ZERO = 104;
/*     */   public static final int ICMP_EQ_i96 = 105;
/*     */   public static final int ICMP_EQ_i8 = 106;
/*     */   public static final int ICMP_NE_i8 = 107;
/*     */   public static final int ICMP_SLT_i8 = 108;
/*     */   public static final int ICMP_SGT_i8 = 109;
/*     */   public static final int ICMP_SLE_i8 = 110;
/*     */   public static final int ICMP_SGE_i8 = 111;
/*     */   public static final int ICMP_ULT_i8 = 112;
/*     */   public static final int ICMP_ULE_i8 = 113;
/*     */   public static final int ICMP_UGE_i8 = 114;
/*     */   public static final int ICMP_UGT_i8 = 115;
/*     */   public static final int ICMP_EQ_i16 = 116;
/*     */   public static final int ICMP_NE_i16 = 117;
/*     */   public static final int ICMP_SLT_i16 = 118;
/*     */   public static final int ICMP_SGT_i16 = 119;
/*     */   public static final int ICMP_SLE_i16 = 120;
/*     */   public static final int ICMP_SGE_i16 = 121;
/*     */   public static final int ICMP_ULT_i16 = 122;
/*     */   public static final int ICMP_UGT_i16 = 123;
/*     */   public static final int ICMP_ULE_i16 = 124;
/*     */   public static final int ICMP_UGE_i16 = 125;
/*     */   public static final int ICMP_NE_i32 = 126;
/*     */   public static final int ICMP_ULE_i32 = 127;
/*     */   public static final int ICMP_UGE_i32 = 128;
/*     */   public static final int ICMP_EQ_i64 = 129;
/*     */   public static final int ICMP_NE_i64 = 130;
/*     */   public static final int ICMP_SLT_i64 = 131;
/*     */   public static final int ICMP_SGT_i64 = 132;
/*     */   public static final int ICMP_SLE_i64 = 133;
/*     */   public static final int ICMP_SGE_i64 = 134;
/*     */   public static final int ICMP_ULT_i64 = 135;
/*     */   public static final int ICMP_UGT_i64 = 136;
/*     */   public static final int ICMP_ULE_i64 = 137;
/*     */   public static final int ICMP_UGE_i64 = 138;
/*     */   public static final int FCMP_UNE = 139;
/*     */   public static final int FPTRUNC = 140;
/*     */   public static final int FPEXT = 141;
/*     */   public static final int UITOFP = 142;
/*     */   public static final int SITOFP = 143;
/*     */   public static final int FPTOUI = 144;
/*     */   public static final int FPTOSI = 145;
/*     */   public static final int ZEXT_i8 = 146;
/*     */   public static final int ZEXT_i16 = 147;
/*     */   public static final int ZEXT_i32 = 148;
/*     */   public static final int AND_i1 = 149;
/*     */   public static final int AND_i8 = 150;
/*     */   public static final int AND_i16 = 151;
/*     */   public static final int OR_i1 = 152;
/*     */   public static final int OR_i8 = 153;
/*     */   public static final int OR_i16 = 154;
/*     */   public static final int OR_i96 = 155;
/*     */   public static final int INTTOPTR = 156;
/*     */   public static final int PTRTOINT = 157;
/*     */   public static final int ICMP_SLE_i32 = 158;
/*     */   public static final int ICMP_SGE_i32 = 159;
/*     */   public static final int ZEXT_i96 = 160;
/*     */   public static final int SEXT_i96 = 161;
/*     */   public static final int SEXT_i128 = 162;
/*     */   public static final int TAIL = 163;
/*     */   public static final int XOR_i1 = 164;
/*     */   public static final int XOR_i8 = 165;
/*     */   public static final int XOR_i16 = 166;
/*     */   public static final int LOAD_PTR = 167;
/*     */   public static final int STORE_PTR = 168;
/*     */   public static final int LOAD_f80 = 169;
/*     */   public static final int LOAD_i128 = 170;
/*     */   public static final int LOAD_f128 = 171;
/*     */   public static final int ASHR_i96 = 172;
/*     */   public static final int ASHR_i128 = 173;
/*     */   public static final int ADD_f64 = 174;
/*     */   public static final int ADD_f32 = 175;
/*     */   public static final int SUB_f32 = 176;
/*     */   public static final int SUB_f64 = 177;
/*     */   public static final int MUL_f32 = 178;
/*     */   public static final int MUL_f64 = 179;
/*     */   public static final int ADD_i96 = 180;
/*     */   public static final int ADD_i128 = 181;
/*     */   public static final int ADD_f80 = 182;
/*     */   public static final int ADD_f128 = 183;
/*     */   public static final int SUB_i96 = 184;
/*     */   public static final int SUB_i128 = 185;
/*     */   public static final int SUB_f80 = 186;
/*     */   public static final int SUB_f128 = 187;
/*     */   public static final int MUL_i96 = 188;
/*     */   public static final int MUL_i128 = 189;
/*     */   public static final int MUL_f80 = 190;
/*     */   public static final int MUL_f128 = 191;
/*     */   public static final int SREM_i8 = 192;
/*     */   public static final int SREM_i16 = 193;
/*     */   public static final int UDIV_i16 = 194;
/*     */   public static final int SDIV_i96 = 195;
/*     */   public static final int SDIV_i128 = 196;
/*     */   public static final int SREM_i96 = 197;
/*     */   public static final int SREM_i128 = 198;
/*     */   public static final int UDIV_i96 = 199;
/*     */   public static final int UDIV_i128 = 200;
/*     */   public static final int UREM_i16 = 201;
/*     */   public static final int SDIV_i8 = 202;
/*     */   public static final int UREM_i96 = 203;
/*     */   public static final int UREM_i128 = 204;
/*     */   public static final int FDIV_f128 = 205;
/*     */   public static final int FREM_f32 = 206;
/*     */   public static final int FREM_f64 = 207;
/*     */   public static final int FREM_f80 = 208;
/*     */   public static final int FREM_f128 = 209;
/*     */   public static final int FADD_f80 = 210;
/*     */   public static final int FADD_f128 = 211;
/*     */   public static final int FSUB_f32 = 212;
/*     */   public static final int FSUB_f64 = 213;
/*     */   public static final int FSUB_f80 = 214;
/*     */   public static final int FSUB_f128 = 215;
/*     */   public static final int FMUL_f80 = 216;
/*     */   public static final int FMUL_f128 = 217;
/*     */   public static final int TRUNC_i1 = 218;
/*     */   public static final int TRUNC_i96 = 219;
/*     */   public static final int TRUNC_i128 = 220;
/*     */   public static final int ICMP = 221;
/*     */   public static final int FCMP_ULT = 222;
/*     */   public static final int FCMP_UGT = 223;
/*     */   public static final int FCMP_ULE = 224;
/*     */   public static final int FCMP_UGE = 225;
/*     */   public static final int FCMP_TRUE = 226;
/*     */   public static final int FCMP_FALSE = 227;
/*     */   public static final int FCMP = 228;
/*     */   public static final int FCMP_OEQ = 229;
/*     */   public static final int FCMP_ONE = 230;
/*     */   public static final int FCMP_OLT = 231;
/*     */   public static final int FCMP_OGT = 232;
/*     */   public static final int FCMP_OLE = 233;
/*     */   public static final int FCMP_OGE = 234;
/*     */   public static final int FCMP_ORD = 235;
/*     */   public static final int FCMP_UNO = 236;
/*     */   public static final int FCMP_UEQ = 237;
/*     */   public static final int STORE_i96 = 238;
/*     */   public static final int STORE_i128 = 239;
/*     */   public static final int STORE_f80 = 240;
/*     */   public static final int STORE_f128 = 241;
/*     */   public static final int ICMP_NE_i96 = 242;
/*     */   public static final int ICMP_SLT_i96 = 243;
/*     */   public static final int ICMP_SGT_i96 = 244;
/*     */   public static final int ICMP_SLE_i96 = 245;
/*     */   public static final int ICMP_SGE_i96 = 246;
/*     */   public static final int ICMP_ULT_i96 = 247;
/*     */   public static final int ICMP_UGT_i96 = 248;
/*     */   public static final int ICMP_ULE_i96 = 249;
/*     */   public static final int ICMP_UGE_i96 = 250;
/*     */   public static final int ICMP_EQ_i128 = 251;
/*     */   public static final int ICMP_NE_i128 = 252;
/*     */   public static final int ICMP_SLT_i128 = 253;
/*     */   public static final int ICMP_SGT_i128 = 254;
/*     */   public static final int ICMP_SLE_i128 = 255;
/*     */   public static final int ICMP_SGE_i128 = 256;
/*     */   public static final int ICMP_ULT_i128 = 257;
/*     */   public static final int ICMP_UGT_i128 = 258;
/*     */   public static final int ICMP_ULE_i128 = 259;
/*     */   public static final int ICMP_UGE_i128 = 260;
/*     */   public static final int UNWIND = 261;
/*     */   public static final int UNREACHABLE = 262;
/*     */   public static final int INDIRECTBR = 263;
/*     */   public static final int MALLOC = 264;
/*     */   public static final int FREE = 265;
/*     */   public static final int NEW = 266;
/*     */   public static final int NEW_ARRAY = 267;
/*     */   public static final int DELETE = 268;
/*     */   public static final int DELETE_ARRAY = 269;
/*     */   public static final int INVOKE_NEW = 270;
/*     */   public static final int INVOKE_NEW_ARRAY = 271;
/*     */   public static final int INVOKE_DELETE = 272;
/*     */   public static final int INVOKE_DELETE_ARRAY = 273;
/*     */   public static final int BITCAST_PTR = 274;
/*     */   public static final int BITCAST_i1 = 275;
/*     */   public static final int BITCAST_i8 = 276;
/*     */   public static final int BITCAST_i16 = 277;
/*     */   public static final int BITCAST_i32 = 278;
/*     */   public static final int BITCAST_i64 = 279;
/*     */   public static final int BITCAST_i96 = 280;
/*     */   public static final int BITCAST_i128 = 281;
/*     */   public static final int INSTR_OPEN = 282;
/*     */   public static final int INSTR_CLOSE = 283;
/*     */   public static final int INSTR_MESSAGE = 284;
/*     */   public static final int CASTFP = 285;
/*     */   public static final int TBD = 286;
/*     */   public static final int FUNCTION_ENTER = 1;
/*     */   public static final int FUNCTION_EXIT = 2;
/*     */   public static final int DEBUG = 3;
/*     */   public static final int INSTR_BLOCK = 4;
/*     */   public static final int INSTR_RETURN = 5;
/*     */   public static final int INSTR_BREAK = 6;
/*     */   public static final int I_FUNCTION_ENTER = 16777217;
/*     */   public static final int I_FUNCTION_EXIT = 33554433;
/*     */   public static final int I_DEBUG = 50331649;
/*     */   public static final int I_INSTR_BLOCK = 67108865;
/*     */   public static final int I_INSTR_RETURN = 83886081;
/*     */   public static final int I_INSTR_BREAK = 100663297;
/*     */   public static final int PHI = 291;
/*     */   public static final int BITCAST = 292;
/*     */   public static final int INVOKE_INDIRECT = 293;
/*     */   public static final int INVOKE_DIRECT = 294;
/*     */   public static final int NOT_VALID = -666;
/* 353 */   private static Hashtable<Integer, String> reflectedNameCache = new Hashtable();
/*     */   
/*     */   static {
/* 356 */     try { Class cls = IntCode.class;
/* 357 */       Field[] flds = cls.getDeclaredFields();
/* 358 */       int count = 0;
/* 359 */       for (int i = 0; i < flds.length; i++) {
/* 360 */         Field f = flds[i];
/* 361 */         int mods = f.getModifiers();
/* 362 */         if ((Modifier.isPublic(mods)) && (Modifier.isStatic(mods)) && (Modifier.isFinal(mods)))
/*     */         {
/*     */ 
/* 365 */           if (f.getType() == Integer.TYPE)
/*     */           {
/*     */ 
/*     */ 
/* 369 */             int value = f.getInt(null);
/* 370 */             count++;
/* 371 */             reflectedNameCache.put(Integer.valueOf(value), f.getName());
/*     */           } }
/*     */       }
/*     */     } catch (Throwable t) {}
/*     */   }
/*     */   
/*     */   public static String getName(int op) {
/* 378 */     String res = (String)reflectedNameCache.get(Integer.valueOf(op));
/* 379 */     if (res != null)
/* 380 */       return res;
/* 381 */     return "<" + op + ">";
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/program/IntCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */