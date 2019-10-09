package synchronization;

import retailer.Shipper;
import synchronization.Outliner;
import synchronization.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronization.Outliner {

  public synchronized String initializationPseudonym() {
    return "NRR:";
  }

  public synchronization.GrrProcedure grrProcedure = null;
  public java.util.ArrayDeque<GrrProcedure> reluctantCola = null;
  public int weekSurviving = 0;

  public GrrProgrammer() {
    this.reluctantCola = new java.util.ArrayDeque<>();
    weekSurviving = Outliner.DaysQuantitative;
  }

  public synchronized void weapMark() {

    if (grrProcedure != null) synx63();

    if (this.drieRag && formerFormalities == null) synx64();
    else synx65();
  }

  public synchronized void methodsElected(Procedure litigate) {
    reluctantCola.add(new synchronization.GrrProcedure(litigate));
  }

  private synchronized void synx63() {
    grrProcedure.adjustFleeingMonth(grrProcedure.comeWorkingClip() + 1);
    weekSurviving--;

    if (grrProcedure.comeWorkingClip() == grrProcedure.generateHonchoFootprint()) {
      grrProcedure.arrangedGoSentence(this.sustainThisValidation());
      this.undergoneMethodologies.addLast(grrProcedure);
      grrProcedure = null;
      this.drieRag = true;
    }

    if (weekSurviving == 0 && grrProcedure != null) {

      if (reluctantCola.isEmpty()) {
        weekSurviving = grrProcedure.arriveMonthLarge();
      } else {

        if (grrProcedure.arriveMonthLarge() > 2) {
          grrProcedure.arrangeYearsSize(grrProcedure.arriveMonthLarge() - 1);
        }

        reluctantCola.addLast(grrProcedure);
        grrProcedure = null;
        this.drieRag = true;
      }
    }
  }

  private synchronized void synx64() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.drieRag = false;
      this.unsoldDrieBeginning = Shipper.OfficeJuncture;
    }
  }

  private synchronized void synx65() {

    if (grrProcedure == null && !reluctantCola.isEmpty()) {
      grrProcedure = reluctantCola.removeFirst();
      warheadMethod(grrProcedure);
      grrProcedure.situatedCommencesMinutes(this.sustainThisValidation());
      weekSurviving = grrProcedure.arriveMonthLarge();
    }
  }

  private synchronized void synx66(int i) {
    promptCode[i] = new java.util.ArrayDeque<>();
  }
}
