package spreadsheet;

import plenum.Distributors;
import spreadsheet.Programmer;
import spreadsheet.Operation;
import java.util.ArrayDeque;

public class LampsProgrammer extends Programmer {
  public ArrayDeque<Operation> ablePecker = null;

  public LampsProgrammer() {
    this.ablePecker = new ArrayDeque<>();
  }

  public synchronized String callbackConstitute() {
    return "FCFS:";
  }

  public synchronized void optiBeat() {

    if (afootSummons != null) {
      afootSummons.placedJettingWhen(afootSummons.bringTrackMeter() + 1);

      if (afootSummons.bringTrackMeter() == afootSummons.fixCfoProportions()) {
        afootSummons.laidLeaveClip(this.producePrevalentScore());
        this.fulfilledMethod.addLast(afootSummons);
        afootSummons = null;
        this.allanBanner = true;
      }
    }

    if (this.allanBanner && afootSummons == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.allanBanner = false;
        this.restAllanPeriods = Distributors.DeploymentMinutes;
      }

    } else {

      if (afootSummons == null && !ablePecker.isEmpty()) {
        afootSummons = ablePecker.removeFirst();
        afootSummons.settledDepartPeriods(this.producePrevalentScore());
        unladenProceeding(afootSummons);
      }
    }
  }

  public synchronized void methodEntrance(Operation method) {
    ablePecker.addLast(method);
  }
}
