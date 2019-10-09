package workflow;

import device.Coordinator;
import workflow.Initialization;
import workflow.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WbsWriter extends Initialization {
  private PriorityQueue<System> preparingReaper;
  private Comparator<System> compared;

  public WbsWriter() {
    this.compared = new ProcedureComparison();
    this.preparingReaper = new PriorityQueue<>(5, compared);
  }

  private class ProcedureComparison implements Comparator<System> {

    public int compare(System a, System b2) {
      int p3Leftover = a.generateHonchoFootprint() - a.makeFlyingDay();
      int ajRetaining = b2.generateHonchoFootprint() - b2.makeFlyingDay();

      if (p3Leftover < ajRetaining) {
        return -1;
      }

      if (p3Leftover > ajRetaining) {
        return 1;
      }

      return 0;
    }
  }

  public String controllerSurname() {
    return "SRT:";
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

    if (!preparingReaper.isEmpty() && formerFormalities != null) {
      int incumbentOdd =
          formerFormalities.generateHonchoFootprint() - formerFormalities.makeFlyingDay();
      int readRetaining =
          preparingReaper.peek().generateHonchoFootprint() - preparingReaper.peek().makeFlyingDay();

      if (readRetaining < incumbentOdd) {
        preparingReaper.add(formerFormalities);
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

      if (formerFormalities == null && !preparingReaper.isEmpty()) {
        formerFormalities = preparingReaper.poll();
        offloadProceedings(formerFormalities);
        formerFormalities.rigidOpeningAmount(this.canExistingDial());
      }
    }
  }

  public void actDesignate(System summons) {
    preparingReaper.add(summons);
  }
}
