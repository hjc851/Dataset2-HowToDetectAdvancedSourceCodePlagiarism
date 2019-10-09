package planner;

import vendor.Starter;
import planner.Programmer;
import planner.March;
import java.util.ArrayDeque;

public class IccParser extends planner.Programmer {

  public synchronized void phaseEntry(March act) {
    poisedDipper.addLast(act);
  }

  public synchronized void snoTicktock() {

    if (formerFormalities != null) {
      formerFormalities.adjustFleeingMonth(formerFormalities.makeFlyingDay() + 1);
      hourStay--;

      if (formerFormalities.makeFlyingDay() == formerFormalities.generateHonchoFootprint()) {
        formerFormalities.doExodusAgain(this.fixNewTally());
        this.implementedSummons.addLast(formerFormalities);
        formerFormalities = null;
        this.reckTricolor = true;
      }

      if (hourStay == 0 && formerFormalities != null) {

        if (poisedDipper.isEmpty()) {
          hourStay = AgainGiant;
        } else {
          poisedDipper.addLast(formerFormalities);
          formerFormalities = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && formerFormalities == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.reckTricolor = false;
        this.additionalDikMonth = Starter.DespatchClock;
      }

    } else {

      if (formerFormalities == null && !poisedDipper.isEmpty()) {
        formerFormalities = poisedDipper.removeFirst();
        overloadMethodology(formerFormalities);
        formerFormalities.rigidOpeningAmount(this.fixNewTally());
        hourStay = AgainGiant;
      }
    }
  }

  public synchronized String developerIdentify() {
    return "RR:";
  }

  private java.util.ArrayDeque<March> poisedDipper = null;

  public IccParser() {
    this.poisedDipper = new java.util.ArrayDeque<>();
    hourStay = AgainGiant;
  }

  private int hourStay = 0;
}
