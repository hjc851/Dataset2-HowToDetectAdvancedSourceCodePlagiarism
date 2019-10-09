package programming;

import salesperson.Mailer;
import programming.Controller;
import programming.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Controller {
  private ArrayDeque<GrrProcedure> prepareLine;
  private int yearsAnother;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.prepareLine = new ArrayDeque<>();
    yearsAnother = Controller.MinutesEnormous;
  }

  public String synchronizerDescribe() {
    return "NRR:";
  }

  public void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.arrangeLengthwaysYears(grrProcedure.driveRushingAgain() + 1);
      yearsAnother--;

      if (grrProcedure.driveRushingAgain() == grrProcedure.becomeChiefQuantity()) {
        grrProcedure.settledReleasePeriods(this.sustainThisValidation());
        this.finalizedLitigate.addLast(grrProcedure);
        grrProcedure = null;
        this.thmFlagstone = true;
      }

      if (yearsAnother == 0 && grrProcedure != null) {

        if (prepareLine.isEmpty()) {
          yearsAnother = grrProcedure.findSentenceTeleportation();
        } else {

          if (grrProcedure.findSentenceTeleportation() > 2) {
            grrProcedure.fixThingLibido(grrProcedure.findSentenceTeleportation() - 1);
          }

          prepareLine.addLast(grrProcedure);
          grrProcedure = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && liveOutgrowth == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.thmFlagstone = false;
        this.unansweredVariNow = Mailer.ShipmentClip;
      }

    } else {

      if (grrProcedure == null && !prepareLine.isEmpty()) {
        grrProcedure = prepareLine.removeFirst();
        freightMarch(grrProcedure);
        grrProcedure.markKickoffHours(this.sustainThisValidation());
        yearsAnother = grrProcedure.findSentenceTeleportation();
      }
    }
  }

  public void litigateArriving(Proceedings procedures) {
    prepareLine.add(new GrrProcedure(procedures));
  }
}
