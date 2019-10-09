package parser;

import parser.Compiler;
import parser.March;

public class GrrProcedure extends March {
  private int meterMeasure;

  public GrrProcedure(March vig) {
    super(vig);
    this.meterMeasure = Compiler.BeginningMammoth;
  }

  public synchronized int developHourPurity() {
    return meterMeasure;
  }

  public synchronized void bentHourPurity(int hourPurity) {
    this.meterMeasure = hourPurity;
  }
}
