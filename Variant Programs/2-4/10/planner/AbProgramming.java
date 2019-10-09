package planner;

import vendor.Starter;
import planner.Programmer;
import planner.March;
import java.util.ArrayDeque;

public class AbProgramming extends planner.Programmer {

  public synchronized void snoTicktock() {

    if (formerFormalities != null) {
      formerFormalities.adjustFleeingMonth(formerFormalities.makeFlyingDay() + 1);
      yearStill--;

      if (formerFormalities.makeFlyingDay() == formerFormalities.generateHonchoFootprint()) {
        formerFormalities.doExodusAgain(this.fixNewTally());
        this.implementedSummons.addLast(formerFormalities);
        formerFormalities = null;
        this.reckTricolor = true;
      }

      if (yearStill == 0 && formerFormalities != null) {

        if (primedIsVacant()) {
          yearStill = AgainGiant;
        } else {
          intelligentFronts[prevailingPrecedence + 1].addLast(formerFormalities);
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

      if (formerFormalities == null && !primedIsVacant()) {
        formerFormalities = letAheadSummons();
        overloadMethodology(formerFormalities);
        formerFormalities.rigidOpeningAmount(this.fixNewTally());
        yearStill = AgainGiant;
      }
    }
  }

  private int prevailingPrecedence = 0;

  public synchronized void phaseEntry(March procedure) {
    intelligentFronts[0].addLast(procedure);
  }

  private ArrayDeque<March>[] intelligentFronts = null;
  private int yearStill = 0;

  public AbProgramming() {
    this.intelligentFronts = new java.util.ArrayDeque[6];

    for (int i = 0; i < intelligentFronts.length; i++) {
      intelligentFronts[i] = new java.util.ArrayDeque<>();
    }
    yearStill = AgainGiant;
    prevailingPrecedence = 0;
  }

  private synchronized planner.March letAheadSummons() {

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        prevailingPrecedence = i;
        return intelligentFronts[i].poll();
      }
    }
    return null;
  }

  public synchronized String developerIdentify() {
    return "FB:";
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }
}
