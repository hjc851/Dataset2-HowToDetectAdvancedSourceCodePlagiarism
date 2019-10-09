package programmer;

import salesperson.Distributor;
import programmer.Workspace;
import programmer.Mechanisms;
import java.util.ArrayDeque;

public class IkWorkspace extends programmer.Workspace {

  public synchronized void procedureIngoing(Mechanisms negotiations) {
    quickTrailers[0].addLast(negotiations);
  }

  public synchronized programmer.Mechanisms sustainThenMethods() {

    for (int i = 0; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        presentForemost = i;
        return quickTrailers[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public ArrayDeque<Mechanisms>[] quickTrailers;
  public int presentForemost;

  public synchronized String serverDiagnose() {
    return "FB:";
  }

  public int hourStay;

  public synchronized void snoTicktock() {

    if (flowProcedures != null) {
      flowProcedures.settledSpoutingPeriods(flowProcedures.arriveFleeingMonth() + 1);
      hourStay--;

      if (flowProcedures.arriveFleeingMonth() == flowProcedures.catchRunnableScale()) {
        flowProcedures.fitDieYear(this.obtainLiveTic());
        this.performedTreat.addLast(flowProcedures);
        flowProcedures = null;
        this.ordeBeacon = true;
      }

      if (hourStay == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          hourStay = ClipQuantity;
        } else {
          quickTrailers[presentForemost + 1].addLast(flowProcedures);
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

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = sustainThenMethods();
        ladingSue(flowProcedures);
        flowProcedures.fixEarlyThing(this.obtainLiveTic());
        hourStay = ClipQuantity;
      }
    }
  }

  public IkWorkspace() {
    this.quickTrailers = new java.util.ArrayDeque[6];

    for (int i = 0; i < quickTrailers.length; i++) {
      quickTrailers[i] = new java.util.ArrayDeque<>();
    }
    hourStay = ClipQuantity;
    presentForemost = 0;
  }
}
