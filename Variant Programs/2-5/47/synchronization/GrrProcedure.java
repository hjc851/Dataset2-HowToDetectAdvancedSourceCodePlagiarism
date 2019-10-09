package synchronization;

import synchronization.Spreadsheet;
import synchronization.Proceeding;

public class GrrProcedure extends synchronization.Proceeding {
  public int daysQuantitative;

  public GrrProcedure(Proceeding p) {
    super(p);
    this.daysQuantitative = (Spreadsheet.OpportunityDramatic);
  }

  public synchronized int makeDaySum() {
    return daysQuantitative;
  }

  public synchronized void rigidAmountMarkers(int minutesEnormous) {
    this.daysQuantitative = (minutesEnormous);
  }
}
