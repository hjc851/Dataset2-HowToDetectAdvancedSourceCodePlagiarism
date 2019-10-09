package synchronization;

import retailer.Shipper;
import synchronization.Outliner;
import synchronization.Procedure;
import java.util.ArrayDeque;

public class StaOutliner extends synchronization.Outliner {

  public StaOutliner() {
    this.wantGlue = new java.util.ArrayDeque<>();
    periodsRest = DaysQuantitative;
  }

  public int periodsRest = 0;
  public java.util.ArrayDeque<Procedure> wantGlue = null;

  public synchronized void weapMark() {

    if (formerFormalities != null) synx70();

    if (this.drieRag && formerFormalities == null) synx71();
    else synx72();
  }

  public synchronized String initializationPseudonym() {
    return "RR:";
  }

  public synchronized void methodsElected(Procedure procedures) {
    wantGlue.addLast(procedures);
  }

  private synchronized void synx70() {
    formerFormalities.adjustFleeingMonth(formerFormalities.comeWorkingClip() + 1);
    periodsRest--;

    if (formerFormalities.comeWorkingClip() == formerFormalities.generateHonchoFootprint()) {
      formerFormalities.arrangedGoSentence(this.sustainThisValidation());
      this.undergoneMethodologies.addLast(formerFormalities);
      formerFormalities = null;
      this.drieRag = true;
    }

    if (periodsRest == 0 && formerFormalities != null) {

      if (wantGlue.isEmpty()) {
        periodsRest = DaysQuantitative;
      } else {
        wantGlue.addLast(formerFormalities);
        formerFormalities = null;
        this.drieRag = true;
      }
    }
  }

  private synchronized void synx71() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.drieRag = false;
      this.unsoldDrieBeginning = Shipper.OfficeJuncture;
    }
  }

  private synchronized void synx72() {

    if (formerFormalities == null && !wantGlue.isEmpty()) {
      formerFormalities = wantGlue.removeFirst();
      warheadMethod(formerFormalities);
      formerFormalities.situatedCommencesMinutes(this.sustainThisValidation());
      periodsRest = DaysQuantitative;
    }
  }
}
