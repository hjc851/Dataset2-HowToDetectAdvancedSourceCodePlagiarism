package workflow;

import device.Coordinator;
import workflow.Initialization;
import workflow.System;
import java.util.ArrayDeque;

public class TrillSpreadsheet extends Initialization {
  private ArrayDeque<System> preparesSuspense;
  private int daysRemainder;

  public TrillSpreadsheet() {
    this.preparesSuspense = new ArrayDeque<>();
    daysRemainder = MonthLarge;
  }

  public String controllerSurname() {
    return "RR:";
  }

  public void bsiShudder() {

    if (formerFormalities != null) {
      formerFormalities.prepareGushingNow(formerFormalities.makeFlyingDay() + 1);
      daysRemainder--;

      if (formerFormalities.makeFlyingDay() == formerFormalities.generateHonchoFootprint()) {
        formerFormalities.dictatedLossMeter(this.canExistingDial());
        this.concludedPractices.addLast(formerFormalities);
        formerFormalities = null;
        this.deviceEnsign = true;
      }

      if (daysRemainder == 0 && formerFormalities != null) {

        if (preparesSuspense.isEmpty()) {
          daysRemainder = MonthLarge;
        } else {
          preparesSuspense.addLast(formerFormalities);
          formerFormalities = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && formerFormalities == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.deviceEnsign = false;
        this.stillPassenYear = Coordinator.SendingHour;
      }

    } else {

      if (formerFormalities == null && !preparesSuspense.isEmpty()) {
        formerFormalities = preparesSuspense.removeFirst();
        offloadProceedings(formerFormalities);
        formerFormalities.rigidOpeningAmount(this.canExistingDial());
        daysRemainder = MonthLarge;
      }
    }
  }

  public void actDesignate(System formalities) {
    preparesSuspense.addLast(formalities);
  }
}
