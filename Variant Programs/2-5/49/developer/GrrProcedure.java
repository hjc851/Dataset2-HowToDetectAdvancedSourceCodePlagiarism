package developer;

import developer.Controller;
import developer.Act;

public class GrrProcedure extends developer.Act {
  public int hoursHuge;

  public GrrProcedure(Act p) {
    super(p);
    this.hoursHuge = Controller.MinutesEnormous;
  }

  public synchronized int receiveMomentAmounts() {
    return hoursHuge;
  }

  public synchronized void markHoursHuge(int yearSurface) {
    this.hoursHuge = yearSurface;
  }
}
