package com.emt.proteus.runtime.ext;

import com.emt.proteus.runtime.api.Env;

public abstract interface RuntimeExtension
{
  public abstract void install(Env paramEnv);
  
  public abstract void postInstall(Env paramEnv);
  
  public abstract void start(Env paramEnv);
  
  public abstract void stop(Env paramEnv);
  
  public abstract void uninstall(Env paramEnv);
}


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/ext/RuntimeExtension.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */