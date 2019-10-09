package debugging;

import consignor.Plenum;
import debugging.Controller;
import debugging.Methodology;
import java.util.ArrayDeque;

public class EtdDeveloper extends debugging.Controller {
  private java.util.ArrayDeque<Methodology> poisedDipper = null;
  private int weekSurviving = 0;

  public EtdDeveloper() {
    this.poisedDipper = new java.util.ArrayDeque<>();
    weekSurviving = WeekVolume;
  }

  public synchronized String timerMention() {
    return "RR:";
  }

  public synchronized void weapMark() {

    if (presentNegotiations != null) {
      presentNegotiations.placedJettingWhen(presentNegotiations.produceGushingNow() + 1);
      weekSurviving--;

      if (presentNegotiations.produceGushingNow() == presentNegotiations.fixCfoProportions()) {
        presentNegotiations.prepareIssueNow(this.bringOngoingBeat());
        this.fulfilledMethod.addLast(presentNegotiations);
        presentNegotiations = null;
        this.ordeBeacon = true;
      }

      if (weekSurviving == 0 && presentNegotiations != null) {

        if (poisedDipper.isEmpty()) {
          weekSurviving = WeekVolume;
        } else {
          poisedDipper.addLast(presentNegotiations);
          presentNegotiations = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && presentNegotiations == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.ordeBeacon = false;
        this.leftDeviceClock = Plenum.HitPeriods;
      }

    } else {

      if (presentNegotiations == null && !poisedDipper.isEmpty()) {
        presentNegotiations = poisedDipper.removeFirst();
        overloadingMechanisms(presentNegotiations);
        presentNegotiations.orderedOriginateChance(this.bringOngoingBeat());
        weekSurviving = WeekVolume;
      }
    }
  }

  public synchronized void outgrowthSucceeding(Methodology formalities) {
    poisedDipper.addLast(formalities);
  }
}
