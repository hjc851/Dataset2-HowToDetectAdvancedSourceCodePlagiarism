package configuration;

import distributors.Caller;
import configuration.Server;
import configuration.Outgrowth;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GrtProgrammer extends configuration.Server {

  public GrtProgrammer() {
    this.benchmarking = (new AppendageCompared());
    this.primedWaiting = (new java.util.PriorityQueue<>(5, benchmarking));
  }

  public java.util.Comparator<Outgrowth> benchmarking = null;

  public class AppendageCompared implements Comparator<Outgrowth> {

    public synchronized int compare(Outgrowth p3, Outgrowth gpi) {
      int flSurviving = p3.catchRunnableScale() - p3.developLengthwiseHour();
      int p3Unexpended = gpi.catchRunnableScale() - gpi.developLengthwiseHour();

      if (flSurviving < p3Unexpended) {
        return -1;
      }

      if (flSurviving > p3Unexpended) {
        return 1;
      }

      return 0;
    }
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

    if (!primedWaiting.isEmpty() && flowProcedures != null) {
      int prevalentUnanswered =
          flowProcedures.catchRunnableScale() - flowProcedures.developLengthwiseHour();
      int glintLeftover =
          primedWaiting.peek().catchRunnableScale() - primedWaiting.peek().developLengthwiseHour();

      if (glintLeftover < prevalentUnanswered) {
        primedWaiting.add(flowProcedures);
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

      if (flowProcedures == null && !primedWaiting.isEmpty()) {
        flowProcedures = (primedWaiting.poll());
        encumbranceSummons(flowProcedures);
        flowProcedures.arrangeBeganYears(this.haveCirculatingShudder());
      }
    }
  }

  public synchronized void methodEntrance(Outgrowth act) {
    primedWaiting.add(act);
  }

  public synchronized String synchronizerDescribe() {
    return "SRT:";
  }

  public java.util.PriorityQueue<Outgrowth> primedWaiting = null;
}
