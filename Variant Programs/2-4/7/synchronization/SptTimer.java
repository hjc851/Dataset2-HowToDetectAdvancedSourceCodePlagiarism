package synchronization;

import retailer.Shipper;
import synchronization.Outliner;
import synchronization.Procedure;
import java.util.ArrayDeque;

public class SptTimer extends synchronization.Outliner {

  public synchronized String initializationPseudonym() {
    return "FCFS:";
  }

  public synchronized void methodsElected(Procedure method) {
    happyStopper.addLast(method);
  }

  public synchronized void weapMark() {

    if (formerFormalities != null) synx77();

    if (this.drieRag && formerFormalities == null) synx78();
    else synx79();
  }

  public SptTimer() {
    this.happyStopper = new java.util.ArrayDeque<>();
  }

  public java.util.ArrayDeque<Procedure> happyStopper = null;

  private synchronized void synx77() {
    formerFormalities.adjustFleeingMonth(formerFormalities.comeWorkingClip() + 1);

    if (formerFormalities.comeWorkingClip() == formerFormalities.generateHonchoFootprint()) {
      formerFormalities.arrangedGoSentence(this.sustainThisValidation());
      this.undergoneMethodologies.addLast(formerFormalities);
      formerFormalities = null;
      this.drieRag = true;
    }
  }

  private synchronized void synx78() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.drieRag = false;
      this.unsoldDrieBeginning = Shipper.OfficeJuncture;
    }
  }

  private synchronized void synx79() {

    if (formerFormalities == null && !happyStopper.isEmpty()) {
      formerFormalities = happyStopper.removeFirst();
      formerFormalities.situatedCommencesMinutes(this.sustainThisValidation());
      warheadMethod(formerFormalities);
    }
  }
}
