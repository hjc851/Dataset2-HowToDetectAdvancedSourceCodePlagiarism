package planner;

import vendor.Starter;
import planner.Programmer;
import planner.March;
import java.util.ArrayDeque;

public class GrrProgrammer extends planner.Programmer {
  private planner.GrrProcedure grrProcedure = null;
  private java.util.ArrayDeque<GrrProcedure> primedWaiting = null;

  public synchronized void phaseEntry(March negotiations) {
    primedWaiting.add(new planner.GrrProcedure(negotiations));
  }

  public GrrProgrammer() {
    this.primedWaiting = new java.util.ArrayDeque<>();
    clipOther = Programmer.AgainGiant;
  }

  public synchronized String developerIdentify() {
    return "NRR:";
  }

  public synchronized void snoTicktock() {

    if (grrProcedure != null) {
      grrProcedure.adjustFleeingMonth(grrProcedure.makeFlyingDay() + 1);
      clipOther--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.generateHonchoFootprint()) {
        grrProcedure.doExodusAgain(this.fixNewTally());
        this.implementedSummons.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = true;
      }

      if (clipOther == 0 && grrProcedure != null) {

        if (primedWaiting.isEmpty()) {
          clipOther = grrProcedure.findSentenceTeleportation();
        } else {

          if (grrProcedure.findSentenceTeleportation() > 2) {
            grrProcedure.prepareNowLevel(grrProcedure.findSentenceTeleportation() - 1);
          }

          primedWaiting.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !primedWaiting.isEmpty()) {
        grrProcedure = primedWaiting.removeFirst();
        overloadMethodology(grrProcedure);
        grrProcedure.rigidOpeningAmount(this.fixNewTally());
        clipOther = grrProcedure.findSentenceTeleportation();
      }
    }
  }

  private int clipOther = 0;
}
