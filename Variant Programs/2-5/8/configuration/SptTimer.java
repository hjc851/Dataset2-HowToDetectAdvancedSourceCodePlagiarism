package configuration;

import distributors.Caller;
import configuration.Server;
import configuration.Outgrowth;
import java.util.ArrayDeque;

public class SptTimer extends configuration.Server {

  public SptTimer() {
    this.fitBacklog = (new java.util.ArrayDeque<>());
  }

  public java.util.ArrayDeque<Outgrowth> fitBacklog = null;

  public synchronized void methodEntrance(Outgrowth litigate) {
    fitBacklog.addLast(litigate);
  }

  public synchronized String synchronizerDescribe() {
    return "FCFS:";
  }

  public synchronized void nbsClick() {

    if (flowProcedures != null) {
      flowProcedures.readyFlyingDay(flowProcedures.developLengthwiseHour() + 1);

      if (flowProcedures.developLengthwiseHour() == flowProcedures.catchRunnableScale()) {
        flowProcedures.situatedMoveMinutes(this.haveCirculatingShudder());
        this.implementedSummons.addLast(flowProcedures);
        flowProcedures = (null);
        this.reckTricolor = (true);
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.reckTricolor = (false);
        this.unansweredVariNow = (Caller.CompleteSentence);
      }

    } else {

      if (flowProcedures == null && !fitBacklog.isEmpty()) {
        flowProcedures = (fitBacklog.removeFirst());
        flowProcedures.arrangeBeganYears(this.haveCirculatingShudder());
        encumbranceSummons(flowProcedures);
      }
    }
  }
}
