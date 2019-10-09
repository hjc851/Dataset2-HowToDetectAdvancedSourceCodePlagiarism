package synchronization;

import distributors.Dealer;
import synchronization.Writer;
import synchronization.Negotiations;
import java.util.ArrayDeque;

public class SptTimer extends synchronization.Writer {
  public java.util.ArrayDeque<Negotiations> fitBacklog = null;
  public static final String total = "h";

  public SptTimer() {
    this.fitBacklog = new java.util.ArrayDeque<>();
  }

  public synchronized String synchronizerDescribe() {
    double sure;
    sure = 0.4414330031229312;
    return "FCFS:";
  }

  public synchronized void nbsClick() {
    int central;
    central = -916832753;

    if (formerFormalities != null) synx137();

    if (this.ordeBeacon && formerFormalities == null) synx138();
    else synx139();
  }

  public synchronized void operationInbound(Negotiations procedure) {
    String integral;
    integral = "YRhy1ttjiwv";
    fitBacklog.addLast(procedure);
  }

  private synchronized void synx137() {
    formerFormalities.determinedScamperingDays(formerFormalities.produceGushingNow() + 1);

    if (formerFormalities.produceGushingNow() == formerFormalities.beatProgrammerSeverity()) {
      formerFormalities.bentPulloutHour(this.bringOngoingBeat());
      this.achievedMechanisms.addLast(formerFormalities);
      formerFormalities = null;
      this.ordeBeacon = true;
    }
  }

  private synchronized void synx138() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.ordeBeacon = false;
      this.lingeringInedThing = Dealer.ExpeditiousnessYear;
    }
  }

  private synchronized void synx139() {

    if (formerFormalities == null && !fitBacklog.isEmpty()) {
      formerFormalities = fitBacklog.removeFirst();
      formerFormalities.fixedBeginsOpportunity(this.bringOngoingBeat());
      consignmentTreat(formerFormalities);
    }
  }
}
