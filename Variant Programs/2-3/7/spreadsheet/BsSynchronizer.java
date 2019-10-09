package spreadsheet;

import plenum.Distributors;
import spreadsheet.Programmer;
import spreadsheet.Operation;
import java.util.ArrayDeque;

public class BsSynchronizer extends Programmer {
  public ArrayDeque<Operation>[] preparingRanks = null;
  public int weekSurviving = 0;
  public int flowAim = 0;

  public BsSynchronizer() {
    this.preparingRanks = new ArrayDeque[6];

    for (int i = 0; i < preparingRanks.length; i++) {
      preparingRanks[i] = new ArrayDeque<>();
    }
    weekSurviving = PeriodQualitative;
    flowAim = 0;
  }

  public synchronized Operation takeLaterAppendage() {

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        flowAim = i;
        return preparingRanks[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String callbackConstitute() {
    return "FB:";
  }

  public synchronized void optiBeat() {

    if (afootSummons != null) {
      afootSummons.placedJettingWhen(afootSummons.bringTrackMeter() + 1);
      weekSurviving--;

      if (afootSummons.bringTrackMeter() == afootSummons.fixCfoProportions()) {
        afootSummons.laidLeaveClip(this.producePrevalentScore());
        this.fulfilledMethod.addLast(afootSummons);
        afootSummons = null;
        this.allanBanner = true;
      }

      if (weekSurviving == 0 && afootSummons != null) {

        if (primedIsVacant()) {
          weekSurviving = PeriodQualitative;
        } else {
          preparingRanks[flowAim + 1].addLast(afootSummons);
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

      if (afootSummons == null && !primedIsVacant()) {
        afootSummons = takeLaterAppendage();
        unladenProceeding(afootSummons);
        afootSummons.settledDepartPeriods(this.producePrevalentScore());
        weekSurviving = PeriodQualitative;
      }
    }
  }

  public synchronized void methodEntrance(Operation summons) {
    preparingRanks[0].addLast(summons);
  }
}
