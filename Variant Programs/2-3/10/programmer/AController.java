package programmer;

import salesperson.Distributor;
import programmer.Workspace;
import programmer.Mechanisms;
import java.util.ArrayDeque;

public class AController extends programmer.Workspace {

  public synchronized void snoTicktock() {

    if (flowProcedures != null) {
      flowProcedures.settledSpoutingPeriods(flowProcedures.arriveFleeingMonth() + 1);
      momentUnexhausted--;

      if (flowProcedures.arriveFleeingMonth() == flowProcedures.catchRunnableScale()) {
        flowProcedures.fitDieYear(this.obtainLiveTic());
        this.performedTreat.addLast(flowProcedures);
        flowProcedures = null;
        this.ordeBeacon = true;
      }

      if (momentUnexhausted == 0 && flowProcedures != null) {

        if (gonnaDong.isEmpty()) {
          momentUnexhausted = ClipQuantity;
        } else {
          gonnaDong.addLast(flowProcedures);
          flowProcedures = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && flowProcedures == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.ordeBeacon = false;
        this.anotherBurberryYears = Distributor.DispatchesHours;
      }

    } else {

      if (flowProcedures == null && !gonnaDong.isEmpty()) {
        flowProcedures = gonnaDong.removeFirst();
        ladingSue(flowProcedures);
        flowProcedures.fixEarlyThing(this.obtainLiveTic());
        momentUnexhausted = ClipQuantity;
      }
    }
  }

  public synchronized String serverDiagnose() {
    return "RR:";
  }

  public int momentUnexhausted;

  public synchronized void procedureIngoing(Mechanisms sue) {
    gonnaDong.addLast(sue);
  }

  public AController() {
    this.gonnaDong = new java.util.ArrayDeque<>();
    momentUnexhausted = ClipQuantity;
  }

  public java.util.ArrayDeque<Mechanisms> gonnaDong;
}
