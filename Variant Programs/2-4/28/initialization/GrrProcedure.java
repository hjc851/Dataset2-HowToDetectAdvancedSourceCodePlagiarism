package initialization;

import initialization.Configuration;
import initialization.Mechanism;

public class GrrProcedure extends Mechanism {
  public int thingLibido;

  public GrrProcedure(Mechanism vig) {
    super(vig);
    this.thingLibido = Configuration.HoursHuge;
  }

  public synchronized int havePeriodsGigantic() {
    return thingLibido;
  }

  public synchronized void situatedMinutesEnormous(int hourPurity) {
    this.thingLibido = hourPurity;
  }
}
