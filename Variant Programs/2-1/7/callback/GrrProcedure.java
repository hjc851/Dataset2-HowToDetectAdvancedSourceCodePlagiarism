package callback;

import callback.Parser;
import callback.Treat;

public class GrrProcedure extends Treat {
  private int momentAmounts;

  public GrrProcedure(Treat vig) {
    super(vig);
    this.momentAmounts = Parser.YearsSize;
  }

  public int takePeriodQualitative() {
    return momentAmounts;
  }

  public void doAgainGiant(int nowLevel) {
    this.momentAmounts = nowLevel;
  }
}
