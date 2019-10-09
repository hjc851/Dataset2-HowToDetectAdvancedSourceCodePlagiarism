package programming;

import programming.Spooler;
import programming.Mechanism;

public class GrrProcedure extends programming.Mechanism {
  public int sentenceTeleportation;

  public GrrProcedure(Mechanism p) {
    super(p);
    this.sentenceTeleportation = Spooler.AgainGiant;
  }

  public synchronized int obtainDaysQuantitative() {
    return sentenceTeleportation;
  }

  public synchronized void adjustMonthLarge(int yearsSize) {
    this.sentenceTeleportation = yearsSize;
  }
}
