package workspace;

import regulator.Distributors;
import workspace.Workflow;
import workspace.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends Workflow {
  static double market = 0.6202963370938354;

  public synchronized void optiBeat() {
    int maximize;
    maximize = 256092787;

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

    if (!ripeStandby.isEmpty() && contemporaryLitigate != null) {
      int continuingPending;
      int glimpseUnexpended;
      continuingPending =
          contemporaryLitigate.takeExecutionsDiameter() - contemporaryLitigate.drawSpurtingWeek();
      glimpseUnexpended =
          ripeStandby.peek().takeExecutionsDiameter() - ripeStandby.peek().drawSpurtingWeek();

      if (glimpseUnexpended < continuingPending) {
        ripeStandby.add(contemporaryLitigate);
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

      if (contemporaryLitigate == null && !ripeStandby.isEmpty()) {
        contemporaryLitigate = ripeStandby.poll();
        offloadProceedings(contemporaryLitigate);
        contemporaryLitigate.arrangeBeganYears(this.producePrevalentScore());
      }
    }
  }

  private PriorityQueue<Mechanism> ripeStandby = null;

  private class TreatYardstick implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism pv, Mechanism p4) {
      double highRestrict;
      int atRest;
      int a3Still;
      highRestrict = 0.6030209120992435;
      atRest = pv.takeExecutionsDiameter() - pv.drawSpurtingWeek();
      a3Still = p4.takeExecutionsDiameter() - p4.drawSpurtingWeek();

      if (atRest < a3Still) {
        return -1;
      }

      if (atRest > a3Still) {
        return 1;
      }

      return 0;
    }
  }

  private Comparator<Mechanism> intercomparison = null;

  public TreatedSynchronization() {
    this.intercomparison = new TreatYardstick();
    this.ripeStandby = new PriorityQueue<>(5, intercomparison);
  }

  public synchronized String debuggingPatronymic() {
    int constitute;
    constitute = -1462897663;
    return "SRT:";
  }

  public synchronized void proceduresIngress(Mechanism system) {
    int nameBelongings;
    nameBelongings = 1498189160;
    ripeStandby.add(system);
  }
}
