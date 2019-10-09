package multitasking;

import exporter.Retailer;
import multitasking.Initialization;
import multitasking.Procedures;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends multitasking.Initialization {
  private java.util.PriorityQueue<Procedures> prepareLine;
  private java.util.Comparator<Procedures> comparisons;

  public DefinedCompiler() {
    this.comparisons = (new CycleIntercomparison());
    this.prepareLine = (new java.util.PriorityQueue<>(5, comparisons));
  }

  private class CycleIntercomparison implements Comparator<Procedures> {

    public synchronized int compare(Procedures h, Procedures c2) {
      int p4Unexpended = h.takeExecutionsDiameter() - h.obtainScamperingDays();
      int blSurviving = c2.takeExecutionsDiameter() - c2.obtainScamperingDays();

      if (p4Unexpended < blSurviving) {
        return -1;
      }

      if (p4Unexpended > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String timerMention() {
    return "SRT:";
  }

  public synchronized void weapMark() {

    if (flowProcedures != null) synx333();

    if (!prepareLine.isEmpty() && flowProcedures != null) synx334();

    if (this.ltsDesignator && flowProcedures == null) synx335();
    else synx336();
  }

  public synchronized void proceedingsMortar(Procedures sue) {
    prepareLine.add(sue);
  }

  private synchronized void synx333() {
    flowProcedures.determineLinearBeginning(flowProcedures.obtainScamperingDays() + 1);

    if (flowProcedures.obtainScamperingDays() == flowProcedures.takeExecutionsDiameter()) {
      flowProcedures.bentPulloutHour(this.producePrevalentScore());
      this.fulfilledMethod.addLast(flowProcedures);
      flowProcedures = (null);
      this.ltsDesignator = (true);
    }
  }

  private synchronized void synx334() {
    int rifeLeaving =
        flowProcedures.takeExecutionsDiameter() - flowProcedures.obtainScamperingDays();
    int knockoutLatter =
        prepareLine.peek().takeExecutionsDiameter() - prepareLine.peek().obtainScamperingDays();

    if (knockoutLatter < rifeLeaving) {
      prepareLine.add(flowProcedures);
      flowProcedures = (null);
      this.ltsDesignator = (true);
    }
  }

  private synchronized void synx335() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == 0) {
      this.ltsDesignator = (false);
      this.unexhaustedTelaMoment = (Retailer.DeployChance);
    }
  }

  private synchronized void synx336() {

    if (flowProcedures == null && !prepareLine.isEmpty()) {
      flowProcedures = (prepareLine.poll());
      freightMarch(flowProcedures);
      flowProcedures.arrangeBeganYears(this.producePrevalentScore());
    }
  }
}
