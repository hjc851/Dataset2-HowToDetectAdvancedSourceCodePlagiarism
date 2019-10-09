package organizer;

import organizer.Programming;
import organizer.Proceedings;

public class GrrProcedure extends Proceedings {
  private int monthLarge;

  public GrrProcedure(Proceedings vig) {
    super(vig);
    this.monthLarge = Programming.MonthLarge;
  }

  public int beatJunctureTremendous() {
    return monthLarge;
  }

  public void fitYearSurface(int amountMarkers) {
    this.monthLarge = amountMarkers;
  }
}
