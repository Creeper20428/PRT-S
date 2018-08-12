/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.program.FunctionData;
/*     */ import com.emt.proteus.lib.utils.Settings;
/*     */ import com.emt.proteus.runtime.ext.RuntimeExtension;
/*     */ import com.emt.proteus.runtime.lib.ExecVm;
/*     */ import com.emt.proteus.runtime.lib.Program;
/*     */ import com.emt.proteus.runtime.lib.Signals;
/*     */ import com.emt.proteus.runtime.lib.Signals.Signal;
/*     */ import com.emt.proteus.runtime.lib.memory.MemoryManager;
/*     */ import com.emt.proteus.runtime.lib.session.EnvListener;
/*     */ import com.emt.proteus.runtime.lib.session.SaveRestoreHandler;
/*     */ import com.emt.proteus.runtime.lib.session.SessionState;
/*     */ import com.emt.proteus.runtime.utils.ReflectionTools;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Env
/*     */ {
/*  52 */   private static final Logger _LOG = Logger.getLogger("VM");
/*     */   
/*     */   private static final String FUNCTION_PACKAGE = "com.emt.proteus.runtime.api.functions.";
/*     */   
/*     */   private final LinkedHashMap<String, Object> environment;
/*     */   private Signals signals;
/*     */   private Program program;
/*  59 */   private ArrayList<SaveRestoreHandler> save_restore_handlers = new ArrayList();
/*  60 */   private ArrayList<EnvListener> listeners = new ArrayList();
/*     */   
/*     */   private MemoryManager memoryManager;
/*     */   private String class_package;
/*     */   private RuntimeExtension[] extensions;
/*     */   private String[] searchPackages;
/*     */   private Function[] functions;
/*     */   
/*     */   public Env()
/*     */   {
/*  70 */     this.environment = new LinkedHashMap();
/*  71 */     this.memoryManager = new MemoryManager();
/*  72 */     this.signals = new Signals();
/*     */   }
/*     */   
/*     */ 
/*     */   public void install(Function function)
/*     */   {
/*  78 */     setEnv(function.getName(), function);
/*     */   }
/*     */   
/*     */   public Object getEnv(String name) {
/*  82 */     return this.environment.get(name);
/*     */   }
/*     */   
/*     */   public Function getFunction(String name) {
/*  86 */     return (Function)this.environment.get(name);
/*     */   }
/*     */   
/*     */   public Function getFunction(int addr) {
/*  90 */     return this.functions[addr];
/*     */   }
/*     */   
/*     */   public int getAddress(String name) {
/*  94 */     return this.program.getAddress(name);
/*     */   }
/*     */   
/*     */   public void setEnv(String name, Object value)
/*     */   {
/*  99 */     this.environment.put(name, value);
/*     */   }
/*     */   
/*     */   public void exec(String[] args) {
/* 103 */     start();
/* 104 */     notifyRunning();
/* 105 */     int[] constructors = this.program.getStaticConstructorIds();
/* 106 */     int main_id = this.program.getMainId();
/* 107 */     int argv = MainMemory.push(args);
/*     */     try {
/* 109 */       for (int i = 0; i < constructors.length; i++) {
/* 110 */         Function ctr = SystemLibrary.getFunction(constructors[i]);
/* 111 */         ctr.execute();
/*     */       }
/* 113 */       Function main = SystemLibrary.getFunction(main_id);
/* 114 */       main.main(args);
/*     */     } catch (ControlException sse) {
/* 116 */       if (sse.isSnapshot()) {
/* 117 */         String fileName = sse.getArgument();
/* 118 */         save_snapshot(fileName);
/*     */       }
/*     */     } finally {
/* 121 */       stop();
/* 122 */       notifyStopping();
/*     */     }
/*     */   }
/*     */   
/*     */   private void save_snapshot(String fileName) {
/* 127 */     SessionState state = new SessionState(fileName);
/* 128 */     ArrayList<Runnable> deferred = new ArrayList();
/*     */     try
/*     */     {
/* 131 */       for (Iterator<SaveRestoreHandler> iterator = this.save_restore_handlers.iterator(); iterator.hasNext();) {
/* 132 */         SaveRestoreHandler next = (SaveRestoreHandler)iterator.next();
/* 133 */         next.save(this, state, deferred);
/*     */       }
/* 135 */       MainMemory.getMemoryManager().save(this, state, deferred);
/* 136 */       state.save();
/* 137 */       for (iterator = deferred.iterator(); iterator.hasNext();) {
/* 138 */         Runnable next = (Runnable)iterator.next();
/* 139 */         next.run();
/*     */       }
/*     */     } catch (IOException e) { Iterator<Runnable> iterator;
/* 142 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void install(Program program)
/*     */   {
/* 148 */     Settings settings = MainCtx.getSettings();
/* 149 */     String[] extClasses = settings.stringArray("runtime.extensions");
/* 150 */     this.extensions = ((RuntimeExtension[])ReflectionTools.loadInstances(extClasses, RuntimeExtension.class));
/* 151 */     SystemLibrary.install(this);
/* 152 */     this.program = program;
/* 153 */     for (int i = 0; i < this.extensions.length; i++) {
/* 154 */       RuntimeExtension extension = this.extensions[i];
/* 155 */       extension.install(this);
/*     */     }
/* 157 */     FunctionData[] fns = program.getFunctions();
/* 158 */     this.functions = new Function[fns.length];
/*     */     
/* 160 */     for (int i = 0; i < fns.length; i++) {
/* 161 */       FunctionData fn = fns[i];
/* 162 */       String name = fn.getName();
/* 163 */       Function rtf = findFunction(fn);
/* 164 */       this.functions[i] = rtf;
/* 165 */       setEnv(name, rtf);
/*     */     }
/* 167 */     MainMemory.install(this.memoryManager);
/* 168 */     SystemLibrary.postInstall(this);
/* 169 */     for (int i = 0; i < this.extensions.length; i++) {
/* 170 */       RuntimeExtension extension = this.extensions[i];
/* 171 */       extension.postInstall(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void resume()
/*     */   {
/* 177 */     notifyRunning();
/* 178 */     int resume_id = this.program.getResumeId();
/*     */     try {
/* 180 */       SystemLibrary.getFunction(resume_id).execute();
/*     */     } catch (ControlException sse) {
/* 182 */       if (sse.isSnapshot()) {
/* 183 */         String fileName = sse.getArgument();
/* 184 */         save_snapshot(fileName);
/*     */       }
/*     */     } finally {
/* 187 */       notifyStopping();
/*     */       
/* 189 */       stop();
/*     */     }
/*     */   }
/*     */   
/*     */   private void notifyRunning() {
/* 194 */     for (Iterator<EnvListener> iterator = this.listeners.iterator(); iterator.hasNext();) {
/* 195 */       EnvListener next = (EnvListener)iterator.next();
/* 196 */       next.running(this);
/*     */     }
/*     */   }
/*     */   
/* 200 */   private void notifyStopping() { for (Iterator<EnvListener> iterator = this.listeners.iterator(); iterator.hasNext();) {
/* 201 */       EnvListener next = (EnvListener)iterator.next();
/* 202 */       next.stopping(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void restoreState(String uri) {
/* 207 */     SessionState state = new SessionState(uri);
/* 208 */     ArrayList<Runnable> deferred = new ArrayList();
/*     */     try {
/* 210 */       state.load();
/* 211 */       MainMemory.getMemoryManager().restore(this, state, deferred);
/* 212 */       for (Iterator<SaveRestoreHandler> iterator = this.save_restore_handlers.iterator(); iterator.hasNext();) {
/* 213 */         SaveRestoreHandler next = (SaveRestoreHandler)iterator.next();
/* 214 */         next.restore(this, state, deferred);
/*     */       }
/* 216 */       for (iterator = deferred.iterator(); iterator.hasNext();) {
/* 217 */         Runnable next = (Runnable)iterator.next();
/* 218 */         next.run();
/*     */       }
/*     */     } catch (IOException e) { Iterator<Runnable> iterator;
/* 221 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public Signals.Signal addSignal(String signalName, Signals.Signal callback) {
/* 226 */     return this.signals.addSignal(signalName, callback);
/*     */   }
/*     */   
/*     */   public int invokeSignal(String command, int arg) {
/* 230 */     return this.signals.invoke(this, command, arg);
/*     */   }
/*     */   
/*     */   public Function findFunction(FunctionData fd)
/*     */   {
/* 235 */     Function fun = (Function)getEnv(fd.getName());
/* 236 */     if (fun != null) return fun;
/* 237 */     String className = fd.getClassName();
/*     */     try
/*     */     {
/* 240 */       Class<Function> aClass = Class.forName(className);
/* 241 */       Function function = (Function)aClass.newInstance();
/* 242 */       if (fd.isInterpreted()) {
/* 243 */         CompiledFunction compiled = new CompiledFunction(fd);
/* 244 */         function.setCompiled(compiled);
/*     */       }
/* 246 */       return function;
/*     */     } catch (Exception e) {
/* 248 */       e.printStackTrace();
/* 249 */       throw new IllegalStateException("Missing function definition " + fd.getName() + " " + fd.getClassName());
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
/*     */   public void addSaveRestoreHandler(SaveRestoreHandler handler)
/*     */   {
/* 274 */     this.save_restore_handlers.add(handler);
/*     */   }
/*     */   
/*     */   public static String[] toRealArguments(String programName, String[] args) {
/* 278 */     int argc = args.length + 1;
/* 279 */     String[] real_args = new String[argc];
/* 280 */     real_args[0] = programName;
/* 281 */     System.arraycopy(args, 0, real_args, 1, args.length);
/* 282 */     return real_args;
/*     */   }
/*     */   
/*     */   public void start()
/*     */   {
/* 287 */     MainMemory.start(this.program.getImageStart(), this.program.getImage(), "initial_image");
/* 288 */     ExecVm.start();
/* 289 */     SystemLibrary.start();
/* 290 */     for (int i = 0; i < this.extensions.length; i++) {
/* 291 */       RuntimeExtension extension = this.extensions[i];
/* 292 */       extension.start(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void stop() {
/* 297 */     MainMemory.stop();
/* 298 */     ExecVm.stop();
/* 299 */     for (int i = 0; i < this.extensions.length; i++) {
/* 300 */       RuntimeExtension extension = this.extensions[i];
/* 301 */       extension.stop(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void dispose() {
/* 306 */     for (int i = 0; i < this.extensions.length; i++) {
/* 307 */       RuntimeExtension extension = this.extensions[i];
/* 308 */       extension.uninstall(this);
/*     */     }
/* 310 */     ExecVm.dispose();
/* 311 */     LogFunction.flush();
/*     */   }
/*     */   
/*     */   public MemoryManager getMemoryManager() {
/* 315 */     return this.memoryManager;
/*     */   }
/*     */   
/*     */   public void setMemoryManager(MemoryManager memoryManager) {
/* 319 */     this.memoryManager = memoryManager;
/*     */   }
/*     */   
/*     */   public void addListener(EnvListener listener) {
/* 323 */     this.listeners.add(listener);
/*     */   }
/*     */   
/*     */   public Function[] getFunctions() {
/* 327 */     return this.functions;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/Env.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */