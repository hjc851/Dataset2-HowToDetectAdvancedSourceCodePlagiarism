package programming;

import programming.Initialization;
import programming.Serve;

public class GrrProcedure extends Serve {
  private int weekVolume;

  public GrrProcedure(Serve writes) {
    super(writes);
    this.weekVolume = Initialization.HoursHuge;
  }

  public int fetchBeginningMammoth() {
    return weekVolume;
  }

  public void fixThingLibido(int hoursHuge) {
    this.weekVolume = hoursHuge;
  }
}
