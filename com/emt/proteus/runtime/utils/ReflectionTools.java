/*    */ package com.emt.proteus.runtime.utils;
/*    */ 
/*    */ import java.lang.reflect.Array;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ReflectionTools
/*    */ {
/*    */   public static Object[] loadInstances(String[] classNames, Class componentClass)
/*    */   {
/* 43 */     Object[] instances = (Object[])Array.newInstance(componentClass, classNames.length);
/* 44 */     for (int i = 0; i < classNames.length; i++) {
/* 45 */       String className = classNames[i];
/*    */       try {
/* 47 */         instances[i] = Class.forName(className).newInstance();
/*    */       } catch (ClassNotFoundException e) {
/* 49 */         instances[i] = null;
/* 50 */         e.printStackTrace();
/*    */       } catch (InstantiationException e) {
/* 52 */         instances[i] = null;
/* 53 */         e.printStackTrace();
/*    */       } catch (IllegalAccessException e) {
/* 55 */         instances[i] = null;
/* 56 */         e.printStackTrace();
/*    */       }
/*    */     }
/* 59 */     return instances;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/utils/ReflectionTools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */