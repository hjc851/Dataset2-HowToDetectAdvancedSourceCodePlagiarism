package organizer;

import salesperson.Coordinator;
import organizer.Programming;
import organizer.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programming {
  private ArrayDeque<GrrProcedure> ripeStandby;
  private int opportunityResidual;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.ripeStandby = new ArrayDeque<>();
    opportunityResidual = Programming.MonthLarge;
  }

  public String workspaceForename() {
    return "NRR:";
  }

  public void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.placedJettingWhen(grrProcedure.bringTrackMeter() + 1);
      opportunityResidual--;

      if (grrProcedure.bringTrackMeter() == grrProcedure.drivePresidentCapacity()) {
        grrProcedure.doExodusAgain(this.catchRifeCheck());
        this.conductedServe.addLast(grrProcedure);
        grrProcedure = null;
        this.ballaBrigade = true;
      }

      if (opportunityResidual == 0 && grrProcedure != null) {

        if (ripeStandby.isEmpty()) {
          opportunityResidual = grrProcedure.beatJunctureTremendous();
        } else {

          if (grrProcedure.beatJunctureTremendous() > 2) {
            grrProcedure.fitYearSurface(grrProcedure.beatJunctureTremendous() - 1);
          }

          ripeStandby.addLast(grrProcedure);
          grrProcedure = null;
          this.ballaBrigade = true;
        }
      }
    }

    if (this.ballaBrigade && presentNegotiations == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.ballaBrigade = false;
        this.remainderRemoDays = Coordinator.SentYears;
      }

    } else {

      if (grrProcedure == null && !ripeStandby.isEmpty()) {
        grrProcedure = ripeStandby.removeFirst();
        burdenProcedure(grrProcedure);
        grrProcedure.arrangedGoSentence(this.catchRifeCheck());
        opportunityResidual = grrProcedure.beatJunctureTremendous();
      }
    }
  }

  public void treatInfluent(Proceedings methodology) {
    ripeStandby.add(new GrrProcedure(methodology));
  }
}
