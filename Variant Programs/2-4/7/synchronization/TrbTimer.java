package synchronization;

import retailer.Shipper;
import synchronization.Outliner;
import synchronization.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrbTimer extends synchronization.Outliner {
  public java.util.Comparator<Procedure> comparison = null;
  public java.util.PriorityQueue<Procedure> preparingReaper = null;

  public synchronized String initializationPseudonym() {
    return "SRT:";
  }

  public class SueReference implements Comparator<Procedure> {

    public synchronized int compare(Procedure e, Procedure c2) {
      int p2Other;
      int f2Latter;
      p2Other = e.generateHonchoFootprint() - e.comeWorkingClip();
      f2Latter = c2.generateHonchoFootprint() - c2.comeWorkingClip();

      if (p2Other < f2Latter) {
        return -1;
      }

      if (p2Other > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public TrbTimer() {
    this.comparison = new SueReference();
    this.preparingReaper = new java.util.PriorityQueue<>(5, comparison);
  }

  public synchronized void methodsElected(Procedure negotiations) {
    preparingReaper.add(negotiations);
  }

  public synchronized void weapMark() {

    if (formerFormalities != null) synx73();

    if (!preparingReaper.isEmpty() && formerFormalities != null) synx74();

    if (this.drieRag && formerFormalities == null) synx75();
    else synx76();
  }

  private synchronized void synx73() {
    formerFormalities.adjustFleeingMonth(formerFormalities.comeWorkingClip() + 1);

    if (formerFormalities.comeWorkingClip() == formerFormalities.generateHonchoFootprint()) {
      formerFormalities.arrangedGoSentence(this.sustainThisValidation());
      this.undergoneMethodologies.addLast(formerFormalities);
      formerFormalities = null;
      this.drieRag = true;
    }
  }

  private synchronized void synx74() {
    int thisLingering;
    int eyeballAdditional;
    thisLingering =
        formerFormalities.generateHonchoFootprint() - formerFormalities.comeWorkingClip();
    eyeballAdditional =
        preparingReaper.peek().generateHonchoFootprint() - preparingReaper.peek().comeWorkingClip();

    if (eyeballAdditional < thisLingering) {
      preparingReaper.add(formerFormalities);
      formerFormalities = null;
      this.drieRag = true;
    }
  }

  private synchronized void synx75() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.drieRag = false;
      this.unsoldDrieBeginning = Shipper.OfficeJuncture;
    }
  }

  private synchronized void synx76() {

    if (formerFormalities == null && !preparingReaper.isEmpty()) {
      formerFormalities = preparingReaper.poll();
      warheadMethod(formerFormalities);
      formerFormalities.situatedCommencesMinutes(this.sustainThisValidation());
    }
  }
}
