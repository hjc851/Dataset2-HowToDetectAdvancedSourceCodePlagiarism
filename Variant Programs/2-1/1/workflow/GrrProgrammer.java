package workflow;

import device.Coordinator;
import workflow.Initialization;
import workflow.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends Initialization {
  private ArrayDeque<GrrProcedure> poisedDipper;
  private int hoursRetaining;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.poisedDipper = new ArrayDeque<>();
    hoursRetaining = Initialization.MonthLarge;
  }

  public String controllerSurname() {
    return "NRR:";
  }

  public void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.prepareGushingNow(grrProcedure.makeFlyingDay() + 1);
      hoursRetaining--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.generateHonchoFootprint()) {
        grrProcedure.dictatedLossMeter(this.canExistingDial());
        this.concludedPractices.addLast(grrProcedure);
        grrProcedure = null;
        this.deviceEnsign = true;
      }

      if (hoursRetaining == 0 && grrProcedure != null) {

        if (poisedDipper.isEmpty()) {
          hoursRetaining = grrProcedure.receiveMomentAmounts();
        } else {

          if (grrProcedure.receiveMomentAmounts() > 2) {
            grrProcedure.situatedMinutesEnormous(grrProcedure.receiveMomentAmounts() - 1);
          }

          poisedDipper.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !poisedDipper.isEmpty()) {
        grrProcedure = poisedDipper.removeFirst();
        offloadProceedings(grrProcedure);
        grrProcedure.rigidOpeningAmount(this.canExistingDial());
        hoursRetaining = grrProcedure.receiveMomentAmounts();
      }
    }
  }

  public void actDesignate(System methodology) {
    poisedDipper.add(new GrrProcedure(methodology));
  }
}
