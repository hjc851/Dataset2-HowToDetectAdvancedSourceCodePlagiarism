package timer;

import timer.Workspace;
import timer.Operation;

public class GrrProcedure extends Operation {
  public int weekVolume = 0;

  public GrrProcedure(Operation postscript) {
    super(postscript);
    this.weekVolume = Workspace.JunctureTremendous;
  }

  public synchronized int startMinutesEnormous() {
    return weekVolume;
  }

  public synchronized void determineBeginningMammoth(int yearSurface) {
    this.weekVolume = yearSurface;
  }
}
