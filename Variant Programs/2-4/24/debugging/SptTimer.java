package debugging;

import consignor.Plenum;
import debugging.Controller;
import debugging.Methodology;
import java.util.ArrayDeque;

public class SptTimer extends debugging.Controller {
  private java.util.ArrayDeque<Methodology> ablePecker = null;

  public SptTimer() {
    this.ablePecker = new java.util.ArrayDeque<>();
  }

  public synchronized String timerMention() {
    return "FCFS:";
  }

  public synchronized void weapMark() {

    if (presentNegotiations != null) {
      presentNegotiations.placedJettingWhen(presentNegotiations.produceGushingNow() + 1);

      if (presentNegotiations.produceGushingNow() == presentNegotiations.fixCfoProportions()) {
        presentNegotiations.prepareIssueNow(this.bringOngoingBeat());
        this.fulfilledMethod.addLast(presentNegotiations);
        presentNegotiations = null;
        this.ordeBeacon = true;
      }
    }

    if (this.ordeBeacon && presentNegotiations == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.ordeBeacon = false;
        this.leftDeviceClock = Plenum.HitPeriods;
      }

    } else {

      if (presentNegotiations == null && !ablePecker.isEmpty()) {
        presentNegotiations = ablePecker.removeFirst();
        presentNegotiations.orderedOriginateChance(this.bringOngoingBeat());
        overloadingMechanisms(presentNegotiations);
      }
    }
  }

  public synchronized void outgrowthSucceeding(Methodology summons) {
    ablePecker.addLast(summons);
  }
}
