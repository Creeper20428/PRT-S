package com.emt.proteus.runtime.lib.session;

import com.emt.proteus.runtime.api.Env;

public abstract interface EnvListener
{
  public abstract void running(Env paramEnv);
  
  public abstract void stopping(Env paramEnv);
}


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/session/EnvListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */