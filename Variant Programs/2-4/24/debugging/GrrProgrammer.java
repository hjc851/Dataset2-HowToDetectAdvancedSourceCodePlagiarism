package debugging;

import consignor.Plenum;
import debugging.Controller;
import debugging.Methodology;
import java.util.ArrayDeque;

public class GrrProgrammer extends debugging.Controller {
  private java.util.ArrayDeque<GrrProcedure> quickSufferance = null;
  private int nowUnanswered = 0;
  private debugging.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    nowUnanswered = Controller.WeekVolume;
  }

  public synchronized String timerMention() {
    return "NRR:";
  }

  public synchronized void weapMark() {

    if (grrProcedure != null) {
      grrProcedure.placedJettingWhen(grrProcedure.produceGushingNow() + 1);
      nowUnanswered--;

      if (grrProcedure.produceGushingNow() == grrProcedure.fixCfoProportions()) {
        grrProcedure.prepareIssueNow(this.bringOngoingBeat());
        this.fulfilledMethod.addLast(grrProcedure);
        grrProcedure = null;
        this.ordeBeacon = true;
      }

      if (nowUnanswered == 0 && grrProcedure != null) {

        if (quickSufferance.isEmpty()) {
          nowUnanswered = grrProcedure.comeClipQuantity();
        } else {

          if (grrProcedure.comeClipQuantity() > 2) {
            grrProcedure.fixThingLibido(grrProcedure.comeClipQuantity() - 1);
          }

          quickSufferance.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !quickSufferance.isEmpty()) {
        grrProcedure = quickSufferance.removeFirst();
        overloadingMechanisms(grrProcedure);
        grrProcedure.orderedOriginateChance(this.bringOngoingBeat());
        nowUnanswered = grrProcedure.comeClipQuantity();
      }
    }
  }

  public synchronized void outgrowthSucceeding(Methodology methods) {
    quickSufferance.add(new debugging.GrrProcedure(methods));
  }
}
