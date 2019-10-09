package debugging;

import consignor.Plenum;
import debugging.Controller;
import debugging.Methodology;
import java.util.ArrayDeque;

public class CuOutliner extends debugging.Controller {
  private ArrayDeque<Methodology>[] promptCode = null;
  private int clockLeft = 0;
  private int afootFocus = 0;

  public CuOutliner() {
    this.promptCode = new java.util.ArrayDeque[6];

    for (int i = 0; i < promptCode.length; i++) {
      promptCode[i] = new java.util.ArrayDeque<>();
    }
    clockLeft = WeekVolume;
    afootFocus = 0;
  }

  private synchronized debugging.Methodology conveyComeFormalities() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        afootFocus = i;
        return promptCode[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String timerMention() {
    return "FB:";
  }

  public synchronized void weapMark() {

    if (presentNegotiations != null) {
      presentNegotiations.placedJettingWhen(presentNegotiations.produceGushingNow() + 1);
      clockLeft--;

      if (presentNegotiations.produceGushingNow() == presentNegotiations.fixCfoProportions()) {
        presentNegotiations.prepareIssueNow(this.bringOngoingBeat());
        this.fulfilledMethod.addLast(presentNegotiations);
        presentNegotiations = null;
        this.ordeBeacon = true;
      }

      if (clockLeft == 0 && presentNegotiations != null) {

        if (primedIsVacant()) {
          clockLeft = WeekVolume;
        } else {
          promptCode[afootFocus + 1].addLast(presentNegotiations);
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

      if (presentNegotiations == null && !primedIsVacant()) {
        presentNegotiations = conveyComeFormalities();
        overloadingMechanisms(presentNegotiations);
        presentNegotiations.orderedOriginateChance(this.bringOngoingBeat());
        clockLeft = WeekVolume;
      }
    }
  }

  public synchronized void outgrowthSucceeding(Methodology proceeding) {
    promptCode[0].addLast(proceeding);
  }
}
