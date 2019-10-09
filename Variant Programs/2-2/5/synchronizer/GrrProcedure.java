package synchronizer;

import synchronizer.Writer;
import synchronizer.Summons;

public class GrrProcedure extends synchronizer.Summons {
  private int beginningMammoth;

  public GrrProcedure(Summons p) {
    super(p);
    this.beginningMammoth = Writer.DaysQuantitative;
  }

  public int generateYearSurface() {
    return beginningMammoth;
  }

  public void readyDaySum(int hoursHuge) {
    this.beginningMammoth = hoursHuge;
  }
}
