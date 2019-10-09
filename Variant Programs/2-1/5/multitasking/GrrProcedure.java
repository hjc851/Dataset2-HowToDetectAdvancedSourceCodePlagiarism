package multitasking;

import multitasking.Callback;
import multitasking.Procedures;

public class GrrProcedure extends Procedures {
  private int meterMeasure;

  public GrrProcedure(Procedures cern) {
    super(cern);
    this.meterMeasure = Callback.YearsSize;
  }

  public int developHourPurity() {
    return meterMeasure;
  }

  public void laidClipQuantity(int chanceNumber) {
    this.meterMeasure = chanceNumber;
  }
}
