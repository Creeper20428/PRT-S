/*     */ package com.emt.proteus.runtime.lib.stdcpp;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.MainMemory;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RbTreeUtils
/*     */ {
/*     */   public static final long LI_MASK = 4294967295L;
/*     */   public static final long LI_GUARD = 1080863910568919040L;
/*     */   public static final int RED = 0;
/*     */   public static final int BLACK = 1;
/*     */   private static final int PARENT_OFF = 4;
/*     */   private static final int LEFT_OFF = 8;
/*     */   private static final int RIGHT_OFF = 12;
/*     */   private static final int KEY_OFF = 16;
/*     */   
/*     */   public static int next(int current$)
/*     */   {
/*  50 */     if (right(current$) != 0) {
/*  51 */       current$ = right(current$);
/*  52 */       while (left(current$) != 0)
/*  53 */         current$ = left(current$);
/*     */     }
/*  55 */     int tmp$ = parent(current$);
/*  56 */     while (current$ == right(tmp$)) {
/*  57 */       current$ = tmp$;
/*  58 */       tmp$ = parent(tmp$);
/*     */     }
/*  60 */     if (right(current$) != tmp$) {
/*  61 */       current$ = tmp$;
/*     */     }
/*  63 */     return current$;
/*     */   }
/*     */   
/*     */   public static int previous(int current$) {
/*  67 */     if ((color(current$) == 0) && (parent(parent(current$)) == current$))
/*     */     {
/*  69 */       current$ = right(current$);
/*  70 */     } else if (left(current$) != 0)
/*     */     {
/*  72 */       int tmp$ = left(current$);
/*  73 */       while (right(tmp$) != 0)
/*  74 */         tmp$ = right(tmp$);
/*  75 */       current$ = tmp$;
/*     */     } else {
/*  77 */       int tmp$ = parent(current$);
/*  78 */       while (current$ == left(tmp$)) {
/*  79 */         current$ = tmp$;
/*  80 */         tmp$ = parent(tmp$);
/*     */       }
/*  82 */       current$ = tmp$;
/*     */     }
/*  84 */     return current$;
/*     */   }
/*     */   
/*     */   public static void rotateLeft(int pivot$, long root_ref)
/*     */   {
/*  89 */     int tmp$ = right(pivot$);
/*     */     
/*  91 */     right(pivot$, left(tmp$));
/*     */     
/*  93 */     if (left(tmp$) != 0)
/*  94 */       parent(left(tmp$), pivot$);
/*  95 */     parent(tmp$, parent(pivot$));
/*     */     
/*  97 */     if (pivot$ == ref(root_ref)) {
/*  98 */       ref(root_ref, tmp$);
/*  99 */     } else if (pivot$ == left(parent(pivot$))) {
/* 100 */       left(parent(pivot$), tmp$);
/*     */     } else
/* 102 */       right(parent(pivot$), tmp$);
/* 103 */     left(tmp$, pivot$);
/* 104 */     parent(pivot$, tmp$);
/*     */   }
/*     */   
/*     */   public static void rotateRight(int pivot$, long root_ref) {
/* 108 */     int __y = left(pivot$);
/*     */     
/* 110 */     left(pivot$, right(__y));
/* 111 */     if (right(__y) != 0)
/* 112 */       parent(right(__y), pivot$);
/* 113 */     parent(__y, parent(pivot$));
/*     */     
/* 115 */     if (pivot$ == ref(root_ref)) {
/* 116 */       ref(root_ref, __y);
/* 117 */     } else if (pivot$ == right(parent(pivot$))) {
/* 118 */       right(parent(pivot$), __y);
/*     */     } else
/* 120 */       left(parent(pivot$), __y);
/* 121 */     right(__y, pivot$);
/* 122 */     parent(pivot$, __y);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void insertAndRebalance(byte left, int x$, int p$, int header$)
/*     */   {
/* 129 */     insertAndRebalance(left != 0, x$, p$, header$);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void insertAndRebalance(boolean left, int node$, int parent$, int header$)
/*     */   {
/* 136 */     long _root_ref = parent_ref(header$);
/*     */     
/*     */ 
/* 139 */     parent(node$, parent$);
/* 140 */     left(node$, 0);
/* 141 */     right(node$, 0);
/* 142 */     color(node$, 0);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */     if (left) {
/* 149 */       left(parent$, node$);
/*     */       
/* 151 */       if (parent$ == header$) {
/* 152 */         parent(header$, node$);
/* 153 */         right(header$, node$);
/* 154 */       } else if (parent$ == left(header$)) {
/* 155 */         left(header$, node$);
/*     */       }
/* 157 */     } else { right(parent$, node$);
/*     */       
/* 159 */       if (parent$ == right(header$)) {
/* 160 */         right(header$, node$);
/*     */       }
/*     */     }
/* 163 */     while ((node$ != ref(_root_ref)) && (color(parent(node$)) == 0)) {
/* 164 */       int __xpp = parent(parent(node$));
/*     */       
/* 166 */       if (parent(node$) == left(__xpp)) {
/* 167 */         int __y = right(__xpp);
/* 168 */         if ((__y != 0) && (color(__y) == 0)) {
/* 169 */           color(parent(node$), 1);
/* 170 */           color(__y, 1);
/* 171 */           color(__xpp, 0);
/* 172 */           node$ = __xpp;
/*     */         } else {
/* 174 */           if (node$ == right(parent(node$))) {
/* 175 */             node$ = parent(node$);
/* 176 */             rotateLeft(node$, _root_ref);
/*     */           }
/* 178 */           color(parent(node$), 1);
/* 179 */           color(__xpp, 0);
/* 180 */           rotateRight(__xpp, _root_ref);
/*     */         }
/*     */       } else {
/* 183 */         int __y = left(__xpp);
/* 184 */         if ((__y != 0) && (color(__y) == 0)) {
/* 185 */           color(parent(node$), 1);
/* 186 */           color(__y, 1);
/* 187 */           color(__xpp, 0);
/* 188 */           node$ = __xpp;
/*     */         } else {
/* 190 */           if (node$ == left(parent(node$))) {
/* 191 */             node$ = parent(node$);
/* 192 */             rotateRight(node$, _root_ref);
/*     */           }
/* 194 */           color(parent(node$), 1);
/* 195 */           color(__xpp, 0);
/* 196 */           rotateLeft(__xpp, _root_ref);
/*     */         }
/*     */       }
/*     */     }
/* 200 */     int root$ = ref(_root_ref);
/* 201 */     color(root$, 1);
/*     */   }
/*     */   
/*     */   private static void print(int root, String prefix)
/*     */   {
/* 206 */     if (root == 0) return;
/* 207 */     System.out.printf("%s+ %08X [%8X] [%6s]\n", new Object[] { prefix, Integer.valueOf(root), Integer.valueOf(key(root)), color(root) == 0 ? "RED" : "BLACK" });
/* 208 */     int left = left(root);
/* 209 */     if ((left != root) && (left != 0)) {
/* 210 */       print(left, prefix + " |");
/*     */     }
/* 212 */     int right = right(root);
/* 213 */     if ((right != root) && (right != 0)) {
/* 214 */       print(right, prefix + "  ");
/*     */     }
/*     */   }
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
/*     */   public static int _Rb_tree_black_count(int __node, int __root)
/*     */   {
/* 379 */     if (__node == 0)
/* 380 */       return 0;
/* 381 */     int __sum = 0;
/*     */     for (;;) {
/* 383 */       if (color(__node) == 1)
/* 384 */         __sum++;
/* 385 */       if (__node == __root)
/*     */         break;
/* 387 */       __node = parent(__node);
/*     */     }
/*     */     
/* 390 */     return __sum;
/*     */   }
/*     */   
/*     */   private static int color(int this$) {
/* 394 */     return MainMemory.getI32(this$);
/*     */   }
/*     */   
/*     */   private static int parent(int this$) {
/* 398 */     return MainMemory.getI32(this$ + 4);
/*     */   }
/*     */   
/* 401 */   private static long parent_ref(int this$) { return this$ + 4 | 0xF000000000000; }
/*     */   
/*     */   private static int left(int this$)
/*     */   {
/* 405 */     return MainMemory.getI32(this$ + 8);
/*     */   }
/*     */   
/*     */   private static int right(int this$) {
/* 409 */     return MainMemory.getI32(this$ + 12);
/*     */   }
/*     */   
/* 412 */   private static int key(int this$) { return MainMemory.getI32(this$ + 16); }
/*     */   
/*     */   private static void color(int this$, int color)
/*     */   {
/* 416 */     MainMemory.setI32(this$, color);
/*     */   }
/*     */   
/*     */   private static void parent(int this$, int parent$) {
/* 420 */     MainMemory.setI32(this$ + 4, parent$);
/*     */   }
/*     */   
/*     */   private static void left(int this$, int left$) {
/* 424 */     MainMemory.setI32(this$ + 8, left$);
/*     */   }
/*     */   
/*     */   private static void right(int this$, int right$) {
/* 428 */     MainMemory.setI32(this$ + 12, right$);
/*     */   }
/*     */   
/*     */   private static int ref(long reference) {
/* 432 */     long ival = guardref(reference);
/* 433 */     return MainMemory.getI32((int)ival);
/*     */   }
/*     */   
/*     */   private static long guardref(long reference) {
/* 437 */     long ival = reference & 0xFFFFFFFF;
/* 438 */     if (reference == ival) throw new IllegalArgumentException("This is not a reference");
/* 439 */     return ival;
/*     */   }
/*     */   
/*     */   private static void ref(long reference, int value) {
/* 443 */     long ival = guardref(reference);
/* 444 */     MainMemory.setI32((int)ival, value);
/*     */   }
/*     */   
/*     */   public static void main(String[] args)
/*     */   {
/* 449 */     int header$ = 0;
/* 450 */     int child1$ = 32;
/* 451 */     int child2$ = 64;
/* 452 */     int child3$ = 96;
/* 453 */     int child4$ = 128;
/* 454 */     insertAndRebalance(true, child1$, header$, header$);
/* 455 */     System.out.println("-------------------------------------------------------");
/* 456 */     insertAndRebalance(true, child2$, child1$, header$);
/* 457 */     System.out.println("-------------------------------------------------------");
/*     */     
/* 459 */     insertAndRebalance(false, child3$, child1$, header$);
/* 460 */     System.out.println("-------------------------------------------------------");
/*     */     
/* 462 */     insertAndRebalance(true, child4$, child2$, header$);
/* 463 */     System.out.println("-------------------------------------------------------");
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/stdcpp/RbTreeUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */