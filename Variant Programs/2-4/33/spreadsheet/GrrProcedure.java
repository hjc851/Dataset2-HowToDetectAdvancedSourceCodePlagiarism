package spreadsheet;

import spreadsheet.Programmer;
import spreadsheet.Summons;

public class GrrProcedure extends spreadsheet.Summons {

  public GrrProcedure(Summons p) {
    super(p);
    this.periodQualitative = Programmer.YearSurface;
  }

  public synchronized int conveyAmountMarkers() {
    return periodQualitative;
  }

  public synchronized void placedWhenValue(int monthLarge) {
    this.periodQualitative = monthLarge;
  }

  public int periodQualitative;
}
