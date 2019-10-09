package workspace;

import responsible.Responsible;
import workspace.Database;
import workspace.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Database {
  private ArrayDeque<GrrProcedure> preparesSuspense;
  private int meterLeftover;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.preparesSuspense = new ArrayDeque<>();
    meterLeftover = Database.MeterMeasure;
  }

  public String programmingRefer() {
    return "NRR:";
  }

  public void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.markStreamingHours(grrProcedure.generateSquirtingYear() + 1);
      meterLeftover--;

      if (grrProcedure.generateSquirtingYear() == grrProcedure.canChairmanAmount()) {
        grrProcedure.readyOutletDay(this.producePrevalentScore());
        this.undertakenMarch.addLast(grrProcedure);
        grrProcedure = null;
        this.dblPin = true;
      }

      if (meterLeftover == 0 && grrProcedure != null) {

        if (preparesSuspense.isEmpty()) {
          meterLeftover = grrProcedure.conveyAmountMarkers();
        } else {

          if (grrProcedure.conveyAmountMarkers() > 2) {
            grrProcedure.solidifyingJunctureTremendous(grrProcedure.conveyAmountMarkers() - 1);
          }

          preparesSuspense.addLast(grrProcedure);
          grrProcedure = null;
          this.dblPin = true;
        }
      }
    }

    if (this.dblPin && prevalentMethod == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == 0) {
        this.dblPin = false;
        this.pendingWhinAgain = Responsible.DeployingOpportunity;
      }

    } else {

      if (grrProcedure == null && !preparesSuspense.isEmpty()) {
        grrProcedure = preparesSuspense.removeFirst();
        burdensMethods(grrProcedure);
        grrProcedure.fixEarlyThing(this.producePrevalentScore());
        meterLeftover = grrProcedure.conveyAmountMarkers();
      }
    }
  }

  public void outgrowthSucceeding(Proceedings outgrowth) {
    preparesSuspense.add(new GrrProcedure(outgrowth));
  }
}
