package programming;

import programming.Spooler;
import programming.Formalities;

public class GrrProcedure extends programming.Formalities {
  private int sentenceTeleportation;

  public GrrProcedure(Formalities p) {
    super(p);
    this.sentenceTeleportation = Spooler.PeriodsGigantic;
  }

  public int findSentenceTeleportation() {
    return sentenceTeleportation;
  }

  public void solidifyingJunctureTremendous(int daysQuantitative) {
    this.sentenceTeleportation = daysQuantitative;
  }
}
