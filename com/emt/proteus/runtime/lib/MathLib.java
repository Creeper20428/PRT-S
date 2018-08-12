/*     */ package com.emt.proteus.runtime.lib;
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
/*     */ public class MathLib
/*     */ {
/*     */   private static final double MIN_ERFC_VAL = 2.56D;
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
/*     */   private static final double STEP = 0.005D;
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
/*  40 */   private static final double K_2pm56 = Double.longBitsToDouble(4354980839667269632L);
/*     */   private static final double TINY = 1.0E-300D;
/*     */   private static final double K_0_25 = 0.25D;
/*     */   private static final double K_0_5 = 0.5D;
/*  44 */   private static final double K_0_84375 = Double.longBitsToDouble(4605775043916464128L);
/*     */   private static final double K_1 = 1.0D;
/*     */   private static final double K_1_25 = 1.25D;
/*     */   private static final double K_2 = 2.0D;
/*  48 */   private static final double K_1d0_25 = Double.longBitsToDouble(4613616129485570048L);
/*     */   
/*     */   private static final double K_28 = 28.0D;
/*     */   
/*     */   private static final double erx = 0.8450629115104675D;
/*     */   
/*     */   private static final double efx = 0.1283791670955126D;
/*     */   
/*     */   private static final double efx8 = 1.0270333367641007D;
/*     */   
/*     */   private static final double pp0 = 0.12837916709551256D;
/*     */   
/*     */   private static final double pp1 = -0.3250421072470015D;
/*     */   
/*     */   private static final double pp2 = -0.02848174957559851D;
/*     */   
/*     */   private static final double pp3 = -0.005770270296489442D;
/*     */   
/*     */   private static final double pp4 = -2.3763016656650163E-5D;
/*     */   
/*     */   private static final double qq1 = 0.39791722395915535D;
/*     */   
/*     */   private static final double qq2 = 0.0650222499887673D;
/*     */   
/*     */   private static final double qq3 = 0.005081306281875766D;
/*     */   
/*     */   private static final double qq4 = 1.3249473800432164E-4D;
/*     */   
/*     */   private static final double qq5 = -3.960228278775368E-6D;
/*     */   
/*     */   private static final double pa0 = -0.0023621185607526594D;
/*     */   
/*     */   private static final double pa1 = 0.41485611868374833D;
/*     */   
/*     */   private static final double pa2 = -0.3722078760357013D;
/*     */   private static final double pa3 = 0.31834661990116175D;
/*     */   private static final double pa4 = -0.11089469428239668D;
/*     */   private static final double pa5 = 0.035478304325618236D;
/*     */   private static final double pa6 = -0.002166375594868791D;
/*     */   private static final double qa1 = 0.10642088040084423D;
/*     */   private static final double qa2 = 0.540397917702171D;
/*     */   private static final double qa3 = 0.07182865441419627D;
/*     */   private static final double qa4 = 0.12617121980876164D;
/*     */   private static final double qa5 = 0.01363708391202905D;
/*     */   private static final double qa6 = 0.011984499846799107D;
/*     */   private static final double ra0 = -0.009864944034847148D;
/*     */   private static final double ra1 = -0.6938585727071818D;
/*     */   private static final double ra2 = -10.558626225323291D;
/*     */   private static final double ra3 = -62.375332450326006D;
/*     */   private static final double ra4 = -162.39666946257347D;
/*     */   private static final double ra5 = -184.60509290671104D;
/*     */   private static final double ra6 = -81.2874355063066D;
/*     */   private static final double ra7 = -9.814329344169145D;
/*     */   private static final double sa1 = 19.651271667439257D;
/*     */   private static final double sa2 = 137.65775414351904D;
/*     */   private static final double sa3 = 434.56587747522923D;
/*     */   private static final double sa4 = 645.3872717332679D;
/*     */   private static final double sa5 = 429.00814002756783D;
/*     */   private static final double sa6 = 108.63500554177944D;
/*     */   private static final double sa7 = 6.570249770319282D;
/*     */   private static final double sa8 = -0.0604244152148581D;
/*     */   private static final double rb0 = -0.0098649429247001D;
/*     */   private static final double rb1 = -0.799283237680523D;
/*     */   private static final double rb2 = -17.757954917754752D;
/*     */   private static final double rb3 = -160.63638485582192D;
/*     */   private static final double rb4 = -637.5664433683896D;
/*     */   private static final double rb5 = -1025.0951316110772D;
/*     */   private static final double rb6 = -483.5191916086514D;
/*     */   private static final double sb1 = 30.33806074348246D;
/*     */   private static final double sb2 = 325.7925129965739D;
/*     */   private static final double sb3 = 1536.729586084437D;
/*     */   private static final double sb4 = 3199.8582195085955D;
/*     */   private static final double sb5 = 2553.0504064331644D;
/*     */   private static final double sb6 = 474.52854120695537D;
/*     */   private static final double sb7 = -22.44095244658582D;
/*     */   
/*     */   public static double erfc(double val)
/*     */   {
/* 126 */     if (Double.isNaN(val)) return NaN.0D;
/* 127 */     if (val < 0.0D) {
/* 128 */       return 2.0D - erfc_impl_x(-val);
/*     */     }
/* 130 */     return erfc_impl_x(val);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private static double erfc_impl_x(double posval)
/*     */   {
/* 137 */     if (posval < K_0_84375) {
/* 138 */       if (posval < K_2pm56) {
/* 139 */         return 1.0D - posval;
/*     */       }
/* 141 */       double z = posval * posval;
/* 142 */       double r = 0.12837916709551256D + z * (-0.3250421072470015D + z * (-0.02848174957559851D + z * (-0.005770270296489442D + z * -2.3763016656650163E-5D)));
/* 143 */       double s = 1.0D + z * (0.39791722395915535D + z * (0.0650222499887673D + z * (0.005081306281875766D + z * (1.3249473800432164E-4D + z * -3.960228278775368E-6D))));
/* 144 */       double y = r / s;
/* 145 */       if (posval < 1.070596096E9D) {
/* 146 */         return 1.0D - (posval + posval * y);
/*     */       }
/* 148 */       r = posval * y;
/* 149 */       r += posval - 0.5D;
/* 150 */       return 0.5D - r;
/*     */     }
/*     */     
/* 153 */     if (posval < 1.25D) {
/* 154 */       double s = posval - 1.0D;
/* 155 */       double P = -0.0023621185607526594D + s * (0.41485611868374833D + s * (-0.3722078760357013D + s * (0.31834661990116175D + s * (-0.11089469428239668D + s * (0.035478304325618236D + s * -0.002166375594868791D)))));
/* 156 */       double Q = 1.0D + s * (0.10642088040084423D + s * (0.540397917702171D + s * (0.07182865441419627D + s * (0.12617121980876164D + s * (0.01363708391202905D + s * 0.011984499846799107D)))));
/*     */       
/* 158 */       double z = 0.15493708848953247D;return z - P / Q;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 163 */     if (posval < 28.0D)
/*     */     {
/* 165 */       double s = 1.0D / (posval * posval);
/* 166 */       double S; double R; double S; if (posval < 1.074191213E9D) {
/* 167 */         double R = -0.009864944034847148D + s * (-0.6938585727071818D + s * (-10.558626225323291D + s * (-62.375332450326006D + s * (-162.39666946257347D + s * (-184.60509290671104D + s * (-81.2874355063066D + s * -9.814329344169145D))))));
/*     */         
/* 169 */         S = 1.0D + s * (19.651271667439257D + s * (137.65775414351904D + s * (434.56587747522923D + s * (645.3872717332679D + s * (429.00814002756783D + s * (108.63500554177944D + s * (6.570249770319282D + s * -0.0604244152148581D)))))));
/*     */       }
/*     */       else
/*     */       {
/* 173 */         R = -0.0098649429247001D + s * (-0.799283237680523D + s * (-17.757954917754752D + s * (-160.63638485582192D + s * (-637.5664433683896D + s * (-1025.0951316110772D + s * -483.5191916086514D)))));
/*     */         
/* 175 */         S = 1.0D + s * (30.33806074348246D + s * (325.7925129965739D + s * (1536.729586084437D + s * (3199.8582195085955D + s * (2553.0504064331644D + s * (474.52854120695537D + s * -22.44095244658582D))))));
/*     */       }
/*     */       
/* 178 */       double z = Double.longBitsToDouble(Double.doubleToLongBits(posval) & 0xFFFFFFFF00000000);
/* 179 */       double r = Math.exp(-z * z - 0.5625D) * Math.exp((z - posval) * (z + posval) + R / S);
/*     */       
/* 181 */       return r / posval;
/*     */     }
/* 183 */     return 0.0D;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/MathLib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */