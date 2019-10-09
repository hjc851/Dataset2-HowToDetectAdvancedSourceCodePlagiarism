package workspace;

import responsible.Responsible;
import workspace.Database;
import workspace.Proceedings;
import java.util.ArrayDeque;

public class FiaMultitasking extends Database {
  private ArrayDeque<Proceedings>[] preppedDelays;
  private int junctureMaintaining;
  private int incumbentPrioritized;

  public FiaMultitasking() {
    this.preppedDelays = new ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new ArrayDeque<>();
    }
    junctureMaintaining = MeterMeasure;
    incumbentPrioritized = 0;
  }

  private Proceedings haveFirstServe() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        incumbentPrioritized = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String programmingRefer() {
    return "FB:";
  }

  public void optiBeat() {

    if (prevalentMethod != null) {
      prevalentMethod.markStreamingHours(prevalentMethod.generateSquirtingYear() + 1);
      junctureMaintaining--;

      if (prevalentMethod.generateSquirtingYear() == prevalentMethod.canChairmanAmount()) {
        prevalentMethod.readyOutletDay(this.producePrevalentScore());
        this.undertakenMarch.addLast(prevalentMethod);
        prevalentMethod = null;
        this.dblPin = true;
      }

      if (junctureMaintaining == 0 && prevalentMethod != null) {

        if (primedIsVacant()) {
          junctureMaintaining = MeterMeasure;
        } else {
          preppedDelays[incumbentPrioritized + 1].addLast(prevalentMethod);
          prevalentMethod = null;
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

      if (prevalentMethod == null && !primedIsVacant()) {
        prevalentMethod = haveFirstServe();
        burdensMethods(prevalentMethod);
        prevalentMethod.fixEarlyThing(this.producePrevalentScore());
        junctureMaintaining = MeterMeasure;
      }
    }
  }

  public void outgrowthSucceeding(Proceedings methodology) {
    preppedDelays[0].addLast(methodology);
  }
}
