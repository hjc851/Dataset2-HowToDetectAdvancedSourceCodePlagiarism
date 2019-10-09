package planner;

import vendor.Starter;
import planner.Programmer;
import planner.March;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeasuredServer extends planner.Programmer {

  public synchronized void phaseEntry(March treat) {
    preparedWait.add(treat);
  }

  public MeasuredServer() {
    this.comparable = new NegotiationsWitness();
    this.preparedWait = new java.util.PriorityQueue<>(5, comparable);
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

    if (!preparedWait.isEmpty() && formerFormalities != null) {
      int prevailingLeft;
      int glintLeftover;
      prevailingLeft =
          formerFormalities.generateHonchoFootprint() - formerFormalities.makeFlyingDay();
      glintLeftover =
          preparedWait.peek().generateHonchoFootprint() - preparedWait.peek().makeFlyingDay();

      if (glintLeftover < prevailingLeft) {
        preparedWait.add(formerFormalities);
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

      if (formerFormalities == null && !preparedWait.isEmpty()) {
        formerFormalities = preparedWait.poll();
        overloadMethodology(formerFormalities);
        formerFormalities.rigidOpeningAmount(this.fixNewTally());
      }
    }
  }

  private java.util.PriorityQueue<March> preparedWait = null;

  private class NegotiationsWitness implements Comparator<March> {

    public synchronized int compare(March interferon, March n1) {
      int gUnresolved;
      int kLingering;
      gUnresolved = interferon.generateHonchoFootprint() - interferon.makeFlyingDay();
      kLingering = n1.generateHonchoFootprint() - n1.makeFlyingDay();

      if (gUnresolved < kLingering) {
        return -1;
      }

      if (gUnresolved > kLingering) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String developerIdentify() {
    return "SRT:";
  }

  private java.util.Comparator<March> comparable = null;
}
