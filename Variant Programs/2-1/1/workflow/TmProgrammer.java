package workflow;

import device.Coordinator;
import workflow.Initialization;
import workflow.System;
import java.util.ArrayDeque;

public class TmProgrammer extends Initialization {
  private ArrayDeque<System>[] ableThrongs;
  private int junctureMaintaining;
  private int continuingPressing;

  public TmProgrammer() {
    this.ableThrongs = new ArrayDeque[6];

    for (int i = 0; i < ableThrongs.length; i++) {
      ableThrongs[i] = new ArrayDeque<>();
    }
    junctureMaintaining = MonthLarge;
    continuingPressing = 0;
  }

  private System driveEarlyMechanisms() {

    for (int i = 0; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        continuingPressing = i;
        return ableThrongs[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String controllerSurname() {
    return "FB:";
  }

  public void bsiShudder() {

    if (formerFormalities != null) {
      formerFormalities.prepareGushingNow(formerFormalities.makeFlyingDay() + 1);
      junctureMaintaining--;

      if (formerFormalities.makeFlyingDay() == formerFormalities.generateHonchoFootprint()) {
        formerFormalities.dictatedLossMeter(this.canExistingDial());
        this.concludedPractices.addLast(formerFormalities);
        formerFormalities = null;
        this.deviceEnsign = true;
      }

      if (junctureMaintaining == 0 && formerFormalities != null) {

        if (primedIsVacant()) {
          junctureMaintaining = MonthLarge;
        } else {
          ableThrongs[continuingPressing + 1].addLast(formerFormalities);
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

      if (formerFormalities == null && !primedIsVacant()) {
        formerFormalities = driveEarlyMechanisms();
        offloadProceedings(formerFormalities);
        formerFormalities.rigidOpeningAmount(this.canExistingDial());
        junctureMaintaining = MonthLarge;
      }
    }
  }

  public void actDesignate(System method) {
    ableThrongs[0].addLast(method);
  }
}
