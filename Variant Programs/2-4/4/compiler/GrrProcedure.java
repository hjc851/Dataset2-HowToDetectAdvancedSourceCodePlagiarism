package compiler;

import compiler.Spooler;
import compiler.Serve;

public class GrrProcedure extends Serve {

  public GrrProcedure(Serve postscript) {
    super(postscript);
    this.weekVolume = Spooler.YearsSize;
  }

  public synchronized void placeWeekVolume(int againGiant) {
    this.weekVolume = againGiant;
  }

  private int weekVolume;

  public synchronized int makeDaySum() {
    return weekVolume;
  }
}
