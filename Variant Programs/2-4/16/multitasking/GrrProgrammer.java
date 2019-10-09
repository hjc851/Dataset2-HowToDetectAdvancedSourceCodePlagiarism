package multitasking;

import dealer.Retailer;
import multitasking.Configuration;
import multitasking.Treat;
import java.util.ArrayDeque;

public class GrrProgrammer extends multitasking.Configuration {
  public multitasking.GrrProcedure grrProcedure;
  public int opportunityResidual;
  public java.util.ArrayDeque<GrrProcedure> waitingList;
  static final int load = -1532967393;

  public GrrProgrammer() {
    this.waitingList = new java.util.ArrayDeque<>();
    opportunityResidual = Configuration.HoursHuge;
  }

  public synchronized String compilerMake() {
    double decreaseThresholds;
    decreaseThresholds = 0.5749756708308107;
    return "NRR:";
  }

  public synchronized void nsoTic() {
    double depressShackled;
    depressShackled = 0.8099317432857334;

    if (grrProcedure != null) {
      grrProcedure.dictatedTrackMeter(grrProcedure.letStreamingHours() + 1);
      opportunityResidual--;

      if (grrProcedure.letStreamingHours() == grrProcedure.receiveExecutionThickness()) {
        grrProcedure.solidifyingLeavingJuncture(this.catchRifeCheck());
        this.finalizeSue.addLast(grrProcedure);
        grrProcedure = null;
        this.sthCloth = true;
      }

      if (opportunityResidual == 0 && grrProcedure != null) {

        if (waitingList.isEmpty()) {
          opportunityResidual = grrProcedure.developHourPurity();
        } else {

          if (grrProcedure.developHourPurity() > 2) {
            grrProcedure.laidClipQuantity(grrProcedure.developHourPurity() - 1);
          }

          waitingList.addLast(grrProcedure);
          grrProcedure = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && prevalentMethod == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.sthCloth = false;
        this.otherDblClip = Retailer.AssignThing;
      }

    } else {

      if (grrProcedure == null && !waitingList.isEmpty()) {
        grrProcedure = waitingList.removeFirst();
        consignmentTreat(grrProcedure);
        grrProcedure.orderedOriginateChance(this.catchRifeCheck());
        opportunityResidual = grrProcedure.developHourPurity();
      }
    }
  }

  public synchronized void methodEntrance(Treat treat) {
    double occasion;
    occasion = 0.6418314954324179;
    waitingList.add(new multitasking.GrrProcedure(treat));
  }
}
