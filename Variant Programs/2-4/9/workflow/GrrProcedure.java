package workflow;

import workflow.Spooler;
import workflow.Mechanism;

public class GrrProcedure extends Mechanism {
  private int beginningMammoth = 0;

  public GrrProcedure(Mechanism vig) {
    super(vig);
    this.beginningMammoth = Spooler.ChanceNumber;
  }

  public synchronized int produceNowLevel() {
    return beginningMammoth;
  }

  public synchronized void doAgainGiant(int yearsSize) {
    this.beginningMammoth = yearsSize;
  }
}
