package programmer;

import salesperson.Distributor;
import programmer.Workspace;
import programmer.Mechanisms;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends programmer.Workspace {

  public synchronized void procedureIngoing(Mechanisms appendage) {
    makeRow.add(appendage);
  }

  public java.util.PriorityQueue<Mechanisms> makeRow;

  public TreatedSynchronization() {
    this.witness = new MethodBaseline();
    this.makeRow = new java.util.PriorityQueue<>(5, witness);
  }

  public class MethodBaseline implements Comparator<Mechanisms> {

    public synchronized int compare(Mechanisms interferon, Mechanisms gpi) {
      int bLeaving = interferon.catchRunnableScale() - interferon.arriveFleeingMonth();
      int apAdditional = gpi.catchRunnableScale() - gpi.arriveFleeingMonth();

      if (bLeaving < apAdditional) {
        return -1;
      }

      if (bLeaving > apAdditional) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String serverDiagnose() {
    return "SRT:";
  }

  public java.util.Comparator<Mechanisms> witness;

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

    if (!makeRow.isEmpty() && flowProcedures != null) {
      int liveRemainder = flowProcedures.catchRunnableScale() - flowProcedures.arriveFleeingMonth();
      int glimpseUnexpended =
          makeRow.peek().catchRunnableScale() - makeRow.peek().arriveFleeingMonth();

      if (glimpseUnexpended < liveRemainder) {
        makeRow.add(flowProcedures);
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

      if (flowProcedures == null && !makeRow.isEmpty()) {
        flowProcedures = makeRow.poll();
        ladingSue(flowProcedures);
        flowProcedures.fixEarlyThing(this.obtainLiveTic());
      }
    }
  }
}
