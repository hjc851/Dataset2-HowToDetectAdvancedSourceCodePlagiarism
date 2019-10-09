package programmer;

import salesperson.Distributor;
import programmer.Workspace;
import programmer.Mechanisms;
import java.util.ArrayDeque;

public class LampsProgrammer extends programmer.Workspace {

  public synchronized void procedureIngoing(Mechanisms phase) {
    preparingReaper.addLast(phase);
  }

  public synchronized String serverDiagnose() {
    return "FCFS:";
  }

  public java.util.ArrayDeque<Mechanisms> preparingReaper;

  public LampsProgrammer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
  }

  public synchronized void snoTicktock() {

    if (flowProcedures != null) {
      flowProcedures.settledSpoutingPeriods(flowProcedures.arriveFleeingMonth() + 1);

      if (flowProcedures.arriveFleeingMonth() == flowProcedures.catchRunnableScale()) {
        flowProcedures.fitDieYear(this.obtainLiveTic());
        this.performedTreat.addLast(flowProcedures);
        flowProcedures = null;
        this.ordeBeacon = true;
      }
    }

    if (this.ordeBeacon && flowProcedures == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.ordeBeacon = false;
        this.anotherBurberryYears = Distributor.DispatchesHours;
      }

    } else {

      if (flowProcedures == null && !preparingReaper.isEmpty()) {
        flowProcedures = preparingReaper.removeFirst();
        flowProcedures.fixEarlyThing(this.obtainLiveTic());
        ladingSue(flowProcedures);
      }
    }
  }
}
