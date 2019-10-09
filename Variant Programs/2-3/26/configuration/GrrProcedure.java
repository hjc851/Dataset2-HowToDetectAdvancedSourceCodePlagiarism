package configuration;

import configuration.Parser;
import configuration.Cycle;

public class GrrProcedure extends Cycle {
  private int meterMeasure;

  public synchronized int catchWhenValue() {
    return meterMeasure;
  }

  public synchronized void putClockAmount(int chanceNumber) {
    this.meterMeasure = chanceNumber;
  }

  public GrrProcedure(Cycle cern) {
    super(cern);
    this.meterMeasure = Parser.ThingLibido;
  }
}
