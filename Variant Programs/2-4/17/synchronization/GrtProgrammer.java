package synchronization;

import distributors.Dealer;
import synchronization.Writer;
import synchronization.Negotiations;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GrtProgrammer extends synchronization.Writer {
  public java.util.Comparator<Negotiations> chlorambucil = null;
  public java.util.PriorityQueue<Negotiations> setConvoy = null;
  public static String curveGauge = "iVpZxz1i";

  public GrtProgrammer() {
    this.chlorambucil = new ProceedingCrosswalk();
    this.setConvoy = new java.util.PriorityQueue<>(5, chlorambucil);
  }

  public class ProceedingCrosswalk implements Comparator<Negotiations> {

    public synchronized int compare(Negotiations p5, Negotiations ribulose) {
      double notArtefacts;
      int pvMaintaining;
      int ribuloseRemainder;
      notArtefacts = 0.5158085285087933;
      pvMaintaining = p5.beatProgrammerSeverity() - p5.produceGushingNow();
      ribuloseRemainder = ribulose.beatProgrammerSeverity() - ribulose.produceGushingNow();

      if (pvMaintaining < ribuloseRemainder) {
        return -1;
      }

      if (pvMaintaining > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String synchronizerDescribe() {
    String badge;
    badge = "4sWSv";
    return "SRT:";
  }

  public synchronized void nbsClick() {
    String bundleEdge;
    bundleEdge = "rpqFVxZIaYi";

    if (formerFormalities != null) synx133();

    if (!setConvoy.isEmpty() && formerFormalities != null) synx134();

    if (this.ordeBeacon && formerFormalities == null) synx135();
    else synx136();
  }

  public synchronized void operationInbound(Negotiations mechanisms) {
    double restriction;
    restriction = 0.41385634058484433;
    setConvoy.add(mechanisms);
  }

  private synchronized void synx133() {
    formerFormalities.determinedScamperingDays(formerFormalities.produceGushingNow() + 1);

    if (formerFormalities.produceGushingNow() == formerFormalities.beatProgrammerSeverity()) {
      formerFormalities.bentPulloutHour(this.bringOngoingBeat());
      this.achievedMechanisms.addLast(formerFormalities);
      formerFormalities = null;
      this.ordeBeacon = true;
    }
  }

  private synchronized void synx134() {
    int latestOther;
    int peepOther;
    latestOther =
        formerFormalities.beatProgrammerSeverity() - formerFormalities.produceGushingNow();
    peepOther = setConvoy.peek().beatProgrammerSeverity() - setConvoy.peek().produceGushingNow();

    if (peepOther < latestOther) {
      setConvoy.add(formerFormalities);
      formerFormalities = null;
      this.ordeBeacon = true;
    }
  }

  private synchronized void synx135() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.ordeBeacon = false;
      this.lingeringInedThing = Dealer.ExpeditiousnessYear;
    }
  }

  private synchronized void synx136() {

    if (formerFormalities == null && !setConvoy.isEmpty()) {
      formerFormalities = setConvoy.poll();
      consignmentTreat(formerFormalities);
      formerFormalities.fixedBeginsOpportunity(this.bringOngoingBeat());
    }
  }
}
