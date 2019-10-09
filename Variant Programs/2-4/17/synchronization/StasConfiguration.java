package synchronization;

import distributors.Dealer;
import synchronization.Writer;
import synchronization.Negotiations;
import java.util.ArrayDeque;

public class StasConfiguration extends synchronization.Writer {
  public int weekSurviving = 0;
  public java.util.ArrayDeque<Negotiations> waitingList = null;
  static double minhBandwidth = 0.7368488379755476;

  public StasConfiguration() {
    this.waitingList = new java.util.ArrayDeque<>();
    weekSurviving = WhenValue;
  }

  public synchronized String synchronizerDescribe() {
    int topmostCertain;
    topmostCertain = 1244121762;
    return "RR:";
  }

  public synchronized void nbsClick() {
    double number;
    number = 0.9268957002372246;

    if (formerFormalities != null) synx130();

    if (this.ordeBeacon && formerFormalities == null) synx131();
    else synx132();
  }

  public synchronized void operationInbound(Negotiations methods) {
    String lot;
    lot = "sxN7";
    waitingList.addLast(methods);
  }

  private synchronized void synx130() {
    formerFormalities.determinedScamperingDays(formerFormalities.produceGushingNow() + 1);
    weekSurviving--;

    if (formerFormalities.produceGushingNow() == formerFormalities.beatProgrammerSeverity()) {
      formerFormalities.bentPulloutHour(this.bringOngoingBeat());
      this.achievedMechanisms.addLast(formerFormalities);
      formerFormalities = null;
      this.ordeBeacon = true;
    }

    if (weekSurviving == 0 && formerFormalities != null) {

      if (waitingList.isEmpty()) {
        weekSurviving = WhenValue;
      } else {
        waitingList.addLast(formerFormalities);
        formerFormalities = null;
        this.ordeBeacon = true;
      }
    }
  }

  private synchronized void synx131() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.ordeBeacon = false;
      this.lingeringInedThing = Dealer.ExpeditiousnessYear;
    }
  }

  private synchronized void synx132() {

    if (formerFormalities == null && !waitingList.isEmpty()) {
      formerFormalities = waitingList.removeFirst();
      consignmentTreat(formerFormalities);
      formerFormalities.fixedBeginsOpportunity(this.bringOngoingBeat());
      weekSurviving = WhenValue;
    }
  }
}
