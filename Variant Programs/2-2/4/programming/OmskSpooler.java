package programming;

import consignor.Limiter;
import programming.Callback;
import programming.Serve;
import java.util.ArrayDeque;

public class OmskSpooler extends programming.Callback {
  private java.util.ArrayDeque<Serve> preppedDragon;
  private int weekSurviving;

  public OmskSpooler() {
    this.preppedDragon = new java.util.ArrayDeque<>();
    weekSurviving = WhenValue;
  }

  public String spreadsheetKey() {
    return "RR:";
  }

  public void bsiShudder() {

    if (liveOutgrowth != null) {
      liveOutgrowth.determinedScamperingDays(liveOutgrowth.conveyWalkingAmount() + 1);
      weekSurviving--;

      if (liveOutgrowth.conveyWalkingAmount() == liveOutgrowth.startBizBreadth()) {
        liveOutgrowth.dictatedLossMeter(this.fixNewTally());
        this.attainedProces.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.fellyAlert = true;
      }

      if (weekSurviving == 0 && liveOutgrowth != null) {

        if (preppedDragon.isEmpty()) {
          weekSurviving = WhenValue;
        } else {
          preppedDragon.addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.fellyAlert = true;
        }
      }
    }

    if (this.fellyAlert && liveOutgrowth == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.fellyAlert = false;
        this.stayLtsHour = Limiter.DeploymentMinutes;
      }

    } else {

      if (liveOutgrowth == null && !preppedDragon.isEmpty()) {
        liveOutgrowth = preppedDragon.removeFirst();
        overloadingMechanisms(liveOutgrowth);
        liveOutgrowth.determinedInitiateDays(this.fixNewTally());
        weekSurviving = WhenValue;
      }
    }
  }

  public void actDesignate(Serve summons) {
    preppedDragon.addLast(summons);
  }
}
