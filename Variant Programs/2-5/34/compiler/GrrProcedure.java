package compiler;

import compiler.Synchronizer;
import compiler.Proceeding;

public class GrrProcedure extends compiler.Proceeding {
  private int monthLarge;

  public GrrProcedure(Proceeding p) {
    super(p);
    this.monthLarge = Synchronizer.WeekVolume;
  }

  public synchronized void readyDaySum(int minutesEnormous) {
    this.monthLarge = minutesEnormous;
  }

  public synchronized int havePeriodsGigantic() {
    return monthLarge;
  }
}
