package spreadsheet;

import spreadsheet.Database;
import spreadsheet.Procedure;

public class GrrProcedure extends spreadsheet.Procedure {
  private int meterMeasure = 0;

  public GrrProcedure(Procedure p) {
    super(p);
    this.meterMeasure = (Database.MinutesEnormous);
  }

  public synchronized int fixChanceNumber() {
    return meterMeasure;
  }

  public synchronized void situatedMinutesEnormous(int beginningMammoth) {
    this.meterMeasure = (beginningMammoth);
  }
}
