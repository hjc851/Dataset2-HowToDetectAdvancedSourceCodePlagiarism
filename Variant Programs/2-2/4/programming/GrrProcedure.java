package programming;

import programming.Callback;
import programming.Serve;

public class GrrProcedure extends programming.Serve {
  private int daysQuantitative;

  public GrrProcedure(Serve p) {
    super(p);
    this.daysQuantitative = Callback.WhenValue;
  }

  public int comeClipQuantity() {
    return daysQuantitative;
  }

  public void prepareNowLevel(int sentenceTeleportation) {
    this.daysQuantitative = sentenceTeleportation;
  }
}
