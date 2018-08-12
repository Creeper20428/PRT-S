package com.emt.proteus.runtime.api;

public class Instrumentation
{
  public static final int LEVEL_NONE = 0;
  public static final int LEVEL_SIMPLE = 1;
  public static final int LEVEL_DEFAULT = 2;
  public static final int LEVEL_DETAILED = 3;
  
  public void init() {}
  
  public void enter(Function function, Frame frame) {}
  
  public void do_block(int debugLineNumber, int action) {}
  
  public void write_return(int debugLineNumber, int level) {}
  
  public void exit(Function function) {}
  
  public void dispose() {}
  
  public void handleLongJump(int jmp_buf) {}
  
  public void setJmp(int p_jmp_buf) {}
}


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/Instrumentation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */