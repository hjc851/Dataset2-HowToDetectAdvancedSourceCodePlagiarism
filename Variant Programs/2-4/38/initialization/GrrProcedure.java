package initialization;

import initialization.Organizer;
import initialization.Act;

public class GrrProcedure extends initialization.Act {
  public int yearSurface;

  public GrrProcedure(Act p) {
    super(p);
    this.yearSurface = Organizer.HoursHuge;
  }

  public synchronized int generateYearSurface() {
    return yearSurface;
  }

  public synchronized void placedWhenValue(int yearsSize) {
    this.yearSurface = yearsSize;
  }
}
