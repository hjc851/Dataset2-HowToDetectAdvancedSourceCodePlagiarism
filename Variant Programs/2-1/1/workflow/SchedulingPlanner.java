package workflow;

import device.Coordinator;
import workflow.Initialization;
import workflow.System;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Initialization {
  private ArrayDeque<System> preppedDragon;

  public SchedulingPlanner() {
    this.preppedDragon = new ArrayDeque<>();
  }

  public String controllerSurname() {
    return "FCFS:";
  }

  public void bsiShudder() {

    if (formerFormalities != null) {
      formerFormalities.prepareGushingNow(formerFormalities.makeFlyingDay() + 1);

      if (formerFormalities.makeFlyingDay() == formerFormalities.generateHonchoFootprint()) {
        formerFormalities.dictatedLossMeter(this.canExistingDial());
        this.concludedPractices.addLast(formerFormalities);
        formerFormalities = null;
        this.deviceEnsign = true;
      }
    }

    if (this.deviceEnsign && formerFormalities == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.deviceEnsign = false;
        this.stillPassenYear = Coordinator.SendingHour;
      }

    } else {

      if (formerFormalities == null && !preppedDragon.isEmpty()) {
        formerFormalities = preppedDragon.removeFirst();
        formerFormalities.rigidOpeningAmount(this.canExistingDial());
        offloadProceedings(formerFormalities);
      }
    }
  }

  public void actDesignate(System proceeding) {
    preppedDragon.addLast(proceeding);
  }
}
