package callback;

import callback.Callback;
import callback.Proceeding;

public class GrrProcedure extends Proceeding {
  private int yearsSize;

  public GrrProcedure(Proceeding writes) {
    super(writes);
    this.yearsSize = Callback.BeginningMammoth;
  }

  public int comeClipQuantity() {
    return yearsSize;
  }

  public void layMomentAmounts(int beginningMammoth) {
    this.yearsSize = beginningMammoth;
  }
}
