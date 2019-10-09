package workflow;

import reseller.Retailer;
import workflow.Spooler;
import workflow.Mechanism;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Spooler {

  public synchronized String writerAdvert() {
    return "FCFS:";
  }

  private ArrayDeque<Mechanism> preparesSuspense = null;

  public synchronized void nbsClick() {

    if (flowProcedures != null) {
      flowProcedures.placeSpurtingWeek(flowProcedures.developLengthwiseHour() + 1);

      if (flowProcedures.developLengthwiseHour() == flowProcedures.findImplementationSmall()) {
        flowProcedures.determinedGoingDays(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(flowProcedures);
        flowProcedures = null;
        this.deviceEnsign = true;
      }
    }

    if (this.deviceEnsign && flowProcedures == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.deviceEnsign = false;
        this.leftoverMalcolmMeter = Retailer.RoutingWeek;
      }

    } else {

      if (flowProcedures == null && !preparesSuspense.isEmpty()) {
        flowProcedures = preparesSuspense.removeFirst();
        flowProcedures.fixedBeginsOpportunity(this.makeIncumbentTock());
        ladenWork(flowProcedures);
      }
    }
  }

  public synchronized void workElect(Mechanism system) {
    preparesSuspense.addLast(system);
  }

  public SchedulingPlanner() {
    this.preparesSuspense = new ArrayDeque<>();
  }
}
