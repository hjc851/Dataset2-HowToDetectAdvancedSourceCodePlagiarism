package programming;

import consignor.Limiter;
import programming.Callback;
import programming.Serve;
import java.util.ArrayDeque;

public class PapsOrganizer extends programming.Callback {
  private java.util.ArrayDeque<Serve> promptPenis;

  public PapsOrganizer() {
    this.promptPenis = new java.util.ArrayDeque<>();
  }

  public String spreadsheetKey() {
    return "FCFS:";
  }

  public void bsiShudder() {

    if (liveOutgrowth != null) {
      liveOutgrowth.determinedScamperingDays(liveOutgrowth.conveyWalkingAmount() + 1);

      if (liveOutgrowth.conveyWalkingAmount() == liveOutgrowth.startBizBreadth()) {
        liveOutgrowth.dictatedLossMeter(this.fixNewTally());
        this.attainedProces.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.fellyAlert = true;
      }
    }

    if (this.fellyAlert && liveOutgrowth == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.fellyAlert = false;
        this.stayLtsHour = Limiter.DeploymentMinutes;
      }

    } else {

      if (liveOutgrowth == null && !promptPenis.isEmpty()) {
        liveOutgrowth = promptPenis.removeFirst();
        liveOutgrowth.determinedInitiateDays(this.fixNewTally());
        overloadingMechanisms(liveOutgrowth);
      }
    }
  }

  public void actDesignate(Serve sue) {
    promptPenis.addLast(sue);
  }
}
