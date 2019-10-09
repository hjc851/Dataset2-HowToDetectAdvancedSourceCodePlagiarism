package programming;

import consignor.Limiter;
import programming.Callback;
import programming.Serve;
import java.util.ArrayDeque;

public class GrrProgrammer extends programming.Callback {
  private java.util.ArrayDeque<GrrProcedure> setConvoy;
  private int whenLeaving;
  private programming.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.setConvoy = new java.util.ArrayDeque<>();
    whenLeaving = Callback.WhenValue;
  }

  public String spreadsheetKey() {
    return "NRR:";
  }

  public void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.determinedScamperingDays(grrProcedure.conveyWalkingAmount() + 1);
      whenLeaving--;

      if (grrProcedure.conveyWalkingAmount() == grrProcedure.startBizBreadth()) {
        grrProcedure.dictatedLossMeter(this.fixNewTally());
        this.attainedProces.addLast(grrProcedure);
        grrProcedure = null;
        this.fellyAlert = true;
      }

      if (whenLeaving == 0 && grrProcedure != null) {

        if (setConvoy.isEmpty()) {
          whenLeaving = grrProcedure.comeClipQuantity();
        } else {

          if (grrProcedure.comeClipQuantity() > 2) {
            grrProcedure.prepareNowLevel(grrProcedure.comeClipQuantity() - 1);
          }

          setConvoy.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !setConvoy.isEmpty()) {
        grrProcedure = setConvoy.removeFirst();
        overloadingMechanisms(grrProcedure);
        grrProcedure.determinedInitiateDays(this.fixNewTally());
        whenLeaving = grrProcedure.comeClipQuantity();
      }
    }
  }

  public void actDesignate(Serve proceeding) {
    setConvoy.add(new programming.GrrProcedure(proceeding));
  }
}
