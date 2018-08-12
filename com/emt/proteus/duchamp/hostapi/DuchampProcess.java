package com.emt.proteus.duchamp.hostapi;

import com.emt.proteus.lib.app.MainCtx;
import com.emt.proteus.lib.utils.MappedIoSystem;
import com.emt.proteus.lib.utils.Settings;
import com.emt.proteus.lib.utils.Utils;
import com.emt.proteus.runtime.api.Env;
import com.emt.proteus.runtime.api.MemoryException;
import com.emt.proteus.runtime.apps.ProteusMain;
import com.emt.proteus.runtime.lib.io.IoLib;
import java.io.IOException;

public class DuchampProcess
  implements HostProcess
{
  public static final String DEFAULT_PACKAGE = "com.emt.proteus.duchampopt";
  public static final String INPUT_FITS = "input.fits";
  public static final String RESULTS_XML = "results.xml";
  public static final String PARAMETERS_PAR = "parameters.par";
  public static final String RESULTS_TXT = "results.txt";
  public static final String DEFAULT_PARAMS = "imageFile\tinput.fits\nflagMW\t\tfalse\nflagTrim\tfalse\nflagFDR\t\tfalse\nflagAtrous\tfalse\nflagSmooth      true\nsmoothType      spatial\nkernMaj         3\nkernMin         3\nkernPA          0\nflagMaps        false\noutFile         results.txt\n";
  public static final String PARAM_APPEND = "imageFile input.fits\nflagVOT true\nvotFile results.xml\noutFile results.txt\n\n";
  public static final int MEMORY_SIZE = 250;
  public static final int MEMORY_HIGH = 400;
  public static final int MEMORY_MAX = 700;
  private static final String[] arguments = { "DuchampDemo", "-p", "parameters.par" };
  private volatile Env env;
  private int proteusMemory = 250;
  private ProteusMain main;
  private MappedIoSystem access;
  private byte[] cube;
  
  public void initialize(HostEnv paramHostEnv)
  {
    IoLib.setStdOut(paramHostEnv.getStdOut());
    Settings localSettings = MainCtx.getSettings();
    localSettings.set("class.package", "com.emt.proteus.duchampopt");
    localSettings.set("memory.size", "" + this.proteusMemory);
    try
    {
      this.access = new IoSystemImpl(null);
      MainCtx.setIoSystem(this.access);
      this.main = new Main(null);
      this.env = this.main.buildEnvironment(MainCtx.getSettings());
      this.cube = paramHostEnv.getDataCube();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private byte[] getContent(String paramString)
    throws IOException
  {
    return Utils.getBytes(getClass().getClassLoader().getResourceAsStream(paramString));
  }
  
  public void exec(HostEnv paramHostEnv, String[] paramArrayOfString)
    throws IOException
  {
    if (this.env == null) {
      initialize(paramHostEnv);
    }
    String str = "imageFile\tinput.fits\nflagMW\t\tfalse\nflagTrim\tfalse\nflagFDR\t\tfalse\nflagAtrous\tfalse\nflagSmooth      true\nsmoothType      spatial\nkernMaj         3\nkernMin         3\nkernPA          0\nflagMaps        false\noutFile         results.txt\n";
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0)) {
      str = paramArrayOfString[0];
    }
    byte[] arrayOfByte = Utils.toAsciiBytes(str);
    this.access.clear();
    this.access.setContent("parameters.par", arrayOfByte);
    this.access.setContent("input.fits", this.cube);
    this.access.setContent("results.xml", null);
    this.access.setContent("results.txt", null);
    try
    {
      this.env.exec(arguments);
    }
    catch (MemoryException localMemoryException)
    {
      localMemoryException.printStackTrace();
    }
    catch (RuntimeException localRuntimeException)
    {
      localRuntimeException.printStackTrace();
    }
  }
  
  public void dispose()
  {
    this.env.dispose();
  }
  
  private static class Main
    extends ProteusMain
  {}
  
  private class IoSystemImpl
    extends MappedIoSystem
  {
    private IoSystemImpl() {}
  }
}


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchamp/hostapi/DuchampProcess.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */