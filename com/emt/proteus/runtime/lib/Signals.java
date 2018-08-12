/*    */ package com.emt.proteus.runtime.lib;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import java.util.LinkedHashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Signals
/*    */ {
/*    */   public static final String START = "start";
/*    */   public static final String STOP = "stop";
/*    */   private final LinkedHashMap<String, Signal> signals;
/*    */   
/*    */   public Signals()
/*    */   {
/* 39 */     this.signals = new LinkedHashMap();
/*    */   }
/*    */   
/*    */   public Signal addSignal(String signalName, Signal callback)
/*    */   {
/* 44 */     return (Signal)this.signals.put(signalName, callback);
/*    */   }
/*    */   
/* 47 */   public Signal removeSignal(String signalName) { return (Signal)this.signals.remove(signalName); }
/*    */   
/*    */   public int invoke(Env env, String signalName, int argument)
/*    */   {
/*    */     try {
/* 52 */       return ((Signal)this.signals.get(signalName)).invoke(env, argument);
/*    */     } catch (NullPointerException npe) {}
/* 54 */     return -1;
/*    */   }
/*    */   
/*    */   public static abstract interface Signal
/*    */   {
/*    */     public abstract int invoke(Env paramEnv, int paramInt);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/Signals.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */