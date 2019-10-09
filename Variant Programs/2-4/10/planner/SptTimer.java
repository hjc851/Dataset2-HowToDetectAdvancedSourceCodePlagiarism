package planner;

import vendor.Starter;
import planner.Programmer;
import planner.March;
import java.util.ArrayDeque;

public class SptTimer extends planner.Programmer {

  public SptTimer() {
    this.wantGlue = new java.util.ArrayDeque<>();
  }

  public synchronized String developerIdentify() {
    return "FCFS:";
  }

  public synchronized void snoTicktock() {

    if (formerFormalities != null) {
      formerFormalities.adjustFleeingMonth(formerFormalities.makeFlyingDay() + 1);

      if (formerFormalities.makeFlyingDay() == formerFormalities.generateHonchoFootprint()) {
        formerFormalities.doExodusAgain(this.fixNewTally());
        this.implementedSummons.addLast(formerFormalities);
        formerFormalities = null;
        this.reckTricolor = true;
      }
    }

    if (this.reckTricolor && formerFormalities == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.reckTricolor = false;
        this.additionalDikMonth = Starter.DespatchClock;
      }

    } else {

      if (formerFormalities == null && !wantGlue.isEmpty()) {
        formerFormalities = wantGlue.removeFirst();
        formerFormalities.rigidOpeningAmount(this.fixNewTally());
        overloadMethodology(formerFormalities);
      }
    }
  }

  public synchronized void phaseEntry(March outgrowth) {
    wantGlue.addLast(outgrowth);
  }

  private java.util.ArrayDeque<March> wantGlue = null;
}
