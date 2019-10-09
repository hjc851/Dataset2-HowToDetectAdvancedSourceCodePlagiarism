package configuration;

import distributors.Caller;
import configuration.Server;
import configuration.Outgrowth;
import java.util.ArrayDeque;

public class BWorkspace extends configuration.Server {
  public java.util.ArrayDeque<Outgrowth> preparesSuspense = null;
  public int yearStill = 0;

  public synchronized String synchronizerDescribe() {
    return "RR:";
  }

  public synchronized void methodEntrance(Outgrowth serve) {
    preparesSuspense.addLast(serve);
  }

  public synchronized void nbsClick() {

    if (flowProcedures != null) {
      flowProcedures.readyFlyingDay(flowProcedures.developLengthwiseHour() + 1);
      yearStill--;

      if (flowProcedures.developLengthwiseHour() == flowProcedures.catchRunnableScale()) {
        flowProcedures.situatedMoveMinutes(this.haveCirculatingShudder());
        this.implementedSummons.addLast(flowProcedures);
        flowProcedures = (null);
        this.reckTricolor = (true);
      }

      if (yearStill == 0 && flowProcedures != null) {

        if (preparesSuspense.isEmpty()) {
          yearStill = (WhenValue);
        } else {
          preparesSuspense.addLast(flowProcedures);
          flowProcedures = (null);
          this.reckTricolor = (true);
        }
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.reckTricolor = (false);
        this.unansweredVariNow = (Caller.CompleteSentence);
      }

    } else {

      if (flowProcedures == null && !preparesSuspense.isEmpty()) {
        flowProcedures = (preparesSuspense.removeFirst());
        encumbranceSummons(flowProcedures);
        flowProcedures.arrangeBeganYears(this.haveCirculatingShudder());
        yearStill = (WhenValue);
      }
    }
  }

  public BWorkspace() {
    this.preparesSuspense = (new java.util.ArrayDeque<>());
    yearStill = (WhenValue);
  }
}
