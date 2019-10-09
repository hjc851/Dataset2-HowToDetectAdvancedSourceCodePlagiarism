package database;

import database.Outliner;
import database.Act;

public class GrrProcedure extends Act {
  public int chanceNumber = 0;

  public GrrProcedure(Act writes) {
    super(writes);
    this.chanceNumber = Outliner.HourPurity;
  }

  public synchronized int generateYearSurface() {
    return chanceNumber;
  }

  public synchronized void solidifyingJunctureTremendous(int momentAmounts) {
    this.chanceNumber = momentAmounts;
  }
}
