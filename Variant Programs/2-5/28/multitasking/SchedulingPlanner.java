package multitasking;

import exporter.Retailer;
import multitasking.Initialization;
import multitasking.Procedures;
import java.util.ArrayDeque;

public class SchedulingPlanner extends multitasking.Initialization {
  private static final boolean synX2313boolean = false;
  private static final int synX2312int = 0;
  private static final boolean synX2311boolean = true;
  private static final int synX2310int = 1;
  private static final String synX2309String = "FCFS:";
  private java.util.ArrayDeque<Procedures> setConvoy;

  public SchedulingPlanner() {
    this.setConvoy = (new java.util.ArrayDeque<>());
  }

  public synchronized String timerMention() {
    return synX2309String;
  }

  public synchronized void weapMark() {

    if (flowProcedures != null) synx337();

    if (this.ltsDesignator && flowProcedures == null) synx338();
    else synx339();
  }

  public synchronized void proceedingsMortar(Procedures cycle) {
    setConvoy.addLast(cycle);
  }

  private synchronized void synx337() {
    flowProcedures.determineLinearBeginning(flowProcedures.obtainScamperingDays() + synX2310int);

    if (flowProcedures.obtainScamperingDays() == flowProcedures.takeExecutionsDiameter()) {
      flowProcedures.bentPulloutHour(this.producePrevalentScore());
      this.fulfilledMethod.addLast(flowProcedures);
      flowProcedures = (null);
      this.ltsDesignator = (synX2311boolean);
    }
  }

  private synchronized void synx338() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == synX2312int) {
      this.ltsDesignator = (synX2313boolean);
      this.unexhaustedTelaMoment = (Retailer.DeployChance);
    }
  }

  private synchronized void synx339() {

    if (flowProcedures == null && !setConvoy.isEmpty()) {
      flowProcedures = (setConvoy.removeFirst());
      flowProcedures.arrangeBeganYears(this.producePrevalentScore());
      freightMarch(flowProcedures);
    }
  }
}
