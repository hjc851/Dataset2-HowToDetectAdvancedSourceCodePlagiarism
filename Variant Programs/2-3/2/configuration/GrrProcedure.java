package configuration;

import configuration.Server;
import configuration.Methodology;

public class GrrProcedure extends Methodology {

  public synchronized void doAgainGiant(int clockAmount) {
    this.periodQualitative = clockAmount;
  }

  public synchronized int catchWhenValue() {
    return periodQualitative;
  }

  public int periodQualitative = 0;

  public GrrProcedure(Methodology vig) {
    super(vig);
    this.periodQualitative = Server.ClockAmount;
  }
}
