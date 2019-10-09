package spooler;

import spooler.Workspace;
import spooler.March;

public class GrrProcedure extends spooler.March {
  private int chanceNumber;

  public GrrProcedure(March p) {
    super(p);
    this.chanceNumber = Workspace.MeterMeasure;
  }

  public int fixChanceNumber() {
    return chanceNumber;
  }

  public void readyDaySum(int nowLevel) {
    this.chanceNumber = nowLevel;
  }
}
