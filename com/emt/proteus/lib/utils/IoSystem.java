package com.emt.proteus.lib.utils;

import com.emt.proteus.lib.utils.io.FileProxy;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public abstract interface IoSystem
{
  public static final String CLASSPATH = "classpath://";
  
  public abstract void setProgressEnabled(boolean paramBoolean);
  
  public abstract boolean isProgressEnabled();
  
  public abstract InputStream openNoProgress(URL paramURL)
    throws IOException;
  
  public abstract InputStream open(URL paramURL)
    throws IOException;
  
  public abstract InputStream createInputstream(String paramString)
    throws IOException;
  
  public abstract URL getUrl(String paramString)
    throws MalformedURLException;
  
  public abstract FileProxy getFile(String paramString, boolean paramBoolean)
    throws IOException;
  
  public abstract boolean isFileAccess();
  
  public abstract boolean exists(String paramString)
    throws IOException;
}


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/IoSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */