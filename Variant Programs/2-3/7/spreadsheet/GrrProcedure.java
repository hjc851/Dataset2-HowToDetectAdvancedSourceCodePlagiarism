package spreadsheet;

import spreadsheet.Programmer;
import spreadsheet.Operation;

public class GrrProcedure extends Operation {
  public int minutesEnormous = 0;

  public GrrProcedure(Operation cern) {
    super(cern);
    this.minutesEnormous = Programmer.PeriodQualitative;
  }

  public synchronized int makeDaySum() {
    return minutesEnormous;
  }

  public synchronized void adjustMonthLarge(int sentenceTeleportation) {
    this.minutesEnormous = sentenceTeleportation;
  }
}
