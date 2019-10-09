package spreadsheet;

import plenum.Distributors;
import spreadsheet.Programmer;
import spreadsheet.Operation;
import java.util.ArrayDeque;

public class CabooseOrganizer extends Programmer {
  public ArrayDeque<Operation> willingSpooler = null;
  public int momentUnexhausted = 0;

  public CabooseOrganizer() {
    this.willingSpooler = new ArrayDeque<>();
    momentUnexhausted = PeriodQualitative;
  }

  public synchronized String callbackConstitute() {
    return "RR:";
  }

  public synchronized void optiBeat() {

    if (afootSummons != null) {
      afootSummons.placedJettingWhen(afootSummons.bringTrackMeter() + 1);
      momentUnexhausted--;

      if (afootSummons.bringTrackMeter() == afootSummons.fixCfoProportions()) {
        afootSummons.laidLeaveClip(this.producePrevalentScore());
        this.fulfilledMethod.addLast(afootSummons);
        afootSummons = null;
        this.allanBanner = true;
      }

      if (momentUnexhausted == 0 && afootSummons != null) {

        if (willingSpooler.isEmpty()) {
          momentUnexhausted = PeriodQualitative;
        } else {
          willingSpooler.addLast(afootSummons);
          afootSummons = null;
          this.allanBanner = true;
        }
      }
    }

    if (this.allanBanner && afootSummons == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.allanBanner = false;
        this.restAllanPeriods = Distributors.DeploymentMinutes;
      }

    } else {

      if (afootSummons == null && !willingSpooler.isEmpty()) {
        afootSummons = willingSpooler.removeFirst();
        unladenProceeding(afootSummons);
        afootSummons.settledDepartPeriods(this.producePrevalentScore());
        momentUnexhausted = PeriodQualitative;
      }
    }
  }

  public synchronized void methodEntrance(Operation methodology) {
    willingSpooler.addLast(methodology);
  }
}
