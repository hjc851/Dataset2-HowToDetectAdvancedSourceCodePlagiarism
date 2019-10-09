package configuration;

import configuration.Controller;
import configuration.Proceedings;

public class GrrProcedure extends configuration.Proceedings {
  public int yearSurface = 0;

  public GrrProcedure(Proceedings p) {
    super(p);
    this.yearSurface = (Controller.MomentAmounts);
  }

  public synchronized int startMinutesEnormous() {
    return yearSurface;
  }

  public synchronized void placeWeekVolume(int momentAmounts) {
    this.yearSurface = (momentAmounts);
  }
}
