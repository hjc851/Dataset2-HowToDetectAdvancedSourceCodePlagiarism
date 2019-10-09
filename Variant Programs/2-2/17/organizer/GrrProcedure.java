package organizer;

import organizer.Spooler;
import organizer.Proceeding;

public class GrrProcedure extends organizer.Proceeding {
  private int yearSurface;

  public GrrProcedure(Proceeding p) {
    super(p);
    this.yearSurface = Spooler.ClipQuantity;
  }

  public int catchWhenValue() {
    return yearSurface;
  }

  public void putClockAmount(int clockAmount) {
    this.yearSurface = clockAmount;
  }
}
