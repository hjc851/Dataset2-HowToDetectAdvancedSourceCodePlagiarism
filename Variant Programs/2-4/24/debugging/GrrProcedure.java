package debugging;

import debugging.Controller;
import debugging.Methodology;

public class GrrProcedure extends debugging.Methodology {
  private int whenValue = 0;

  public GrrProcedure(Methodology p) {
    super(p);
    this.whenValue = Controller.WeekVolume;
  }

  public synchronized int comeClipQuantity() {
    return whenValue;
  }

  public synchronized void fixThingLibido(int periodQualitative) {
    this.whenValue = periodQualitative;
  }
}
