package workflow;

import regulator.Retailer;
import workflow.Writer;
import workflow.Proceedings;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Writer {
  private ArrayDeque<Proceedings> setConvoy;

  public SchedulingPlanner() {
    this.setConvoy = new ArrayDeque<>();
  }

  public String organizerList() {
    return "FCFS:";
  }

  public void bsiShudder() {

    if (flowProcedures != null) {
      flowProcedures.markStreamingHours(flowProcedures.makeFlyingDay() + 1);

      if (flowProcedures.makeFlyingDay() == flowProcedures.canChairmanAmount()) {
        flowProcedures.situatedMoveMinutes(this.comeLatestTicktock());
        this.doneAppendage.addLast(flowProcedures);
        flowProcedures = null;
        this.dikTorch = true;
      }
    }

    if (this.dikTorch && flowProcedures == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.dikTorch = false;
        this.finalReckPeriod = Retailer.DischargeDays;
      }

    } else {

      if (flowProcedures == null && !setConvoy.isEmpty()) {
        flowProcedures = setConvoy.removeFirst();
        flowProcedures.fixedBeginsOpportunity(this.comeLatestTicktock());
        ladenWork(flowProcedures);
      }
    }
  }

  public void negotiationsNew(Proceedings phase) {
    setConvoy.addLast(phase);
  }
}
