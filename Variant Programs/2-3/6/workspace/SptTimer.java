package workspace;

import regulator.Distributors;
import workspace.Workflow;
import workspace.Mechanism;
import java.util.ArrayDeque;

public class SptTimer extends Workflow {

  public synchronized String debuggingPatronymic() {
    double greaterUnfree;
    greaterUnfree = 0.7002671727465932;
    return "FCFS:";
  }

  private ArrayDeque<Mechanism> preparesSuspense = null;

  public SptTimer() {
    this.preparesSuspense = new ArrayDeque<>();
  }

  public synchronized void proceduresIngress(Mechanism methods) {
    int length;
    length = -21464409;
    preparesSuspense.addLast(methods);
  }

  public synchronized void optiBeat() {
    double lessDestined;
    lessDestined = 0.45327333544919024;

    if (contemporaryLitigate != null) {
      contemporaryLitigate.fixGoingThing(contemporaryLitigate.drawSpurtingWeek() + 1);

      if (contemporaryLitigate.drawSpurtingWeek()
          == contemporaryLitigate.takeExecutionsDiameter()) {
        contemporaryLitigate.layPassingMoment(this.producePrevalentScore());
        this.finalizationTechniques.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.burberryTire = true;
      }
    }

    if (this.burberryTire && contemporaryLitigate == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.burberryTire = false;
        this.finalReckPeriod = Distributors.DespatchClock;
      }

    } else {

      if (contemporaryLitigate == null && !preparesSuspense.isEmpty()) {
        contemporaryLitigate = preparesSuspense.removeFirst();
        contemporaryLitigate.arrangeBeganYears(this.producePrevalentScore());
        offloadProceedings(contemporaryLitigate);
      }
    }
  }

  static int asset = -281349325;
}
