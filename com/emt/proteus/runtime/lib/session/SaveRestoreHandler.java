package com.emt.proteus.runtime.lib.session;

import com.emt.proteus.runtime.api.Env;
import java.io.IOException;
import java.util.Collection;

public abstract interface SaveRestoreHandler
{
  public abstract void restore(Env paramEnv, SessionState paramSessionState, Collection<Runnable> paramCollection)
    throws IOException;
  
  public abstract void save(Env paramEnv, SessionState paramSessionState, Collection<Runnable> paramCollection)
    throws IOException;
}


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/session/SaveRestoreHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */