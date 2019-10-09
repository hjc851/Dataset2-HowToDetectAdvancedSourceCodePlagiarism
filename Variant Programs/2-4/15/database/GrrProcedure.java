package database;

import database.Outliner;
import database.Phase;

public class GrrProcedure extends Phase {
  public int yearsSize = 0;

  public GrrProcedure(Phase postscript) {
    super(postscript);
    this.yearsSize = Outliner.AmountMarkers;
  }

  public synchronized int produceNowLevel() {
    return yearsSize;
  }

  public synchronized void prepareNowLevel(int clockAmount) {
    this.yearsSize = clockAmount;
  }
}
